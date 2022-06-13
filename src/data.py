import random
from re import X
def generateAplhaNumeric():
    x = random.random()
    
    if (x<0.7):
        return chr(ord('a')+random.randint(0,25))
    else:
        return str(random.randint(0,9))

def generateAlpha():
    return chr(ord('a')+random.randint(0,25))

def generateAlphaNumericString(n):
    ran = ""
    for i in range(n):
        ran += generateAplhaNumeric()
    return ran

def generateAlphaString(n):
    ran = ""
    for i in range(n):
        ran += generateAlpha()
    return ran


admin = []
for i in range(5):
    userId = generateAlphaNumericString(random.randint(5,10))
    admin.append([userId, userId+'@org.com',generateAlphaNumericString(10),random.randint(1000000000,9999999999),generateAlphaString(10)])

prof = []
for i in range(10):
    userId = generateAlphaNumericString(random.randint(5,10))
    prof.append([userId, userId+'@org.com',generateAlphaNumericString(10),random.randint(1000000000,9999999999),userId,generateAlphaString,random.randint(4,10)])

student = []
for i in range(30):
    sem = random.randint(1,8)
    userId = generateAlphaNumericString(random.randint(5,10))
    student.append([userId, userId+'@org.com',generateAlphaNumericString(10),random.randint(1000000000,9999999999),random.randint(1,8),sem,(0 if sem == 1 else random.randint(0,100)/10),'not paid',True])

course = []
for i in range(20):
    course.append([random.randint(100,999),generateAlphaString(9),random.randint(100000,999999)/100])

adminFile = open('admin.txt','w')
adminFile.close()

adminFile = open('admin.txt','a')
for i in range(len(admin)):
    for j in range(len(admin[i])):
        adminFile.write(str(admin[i][j]))
        adminFile.write(',')
    adminFile.write('\n')
adminFile.close()

studentFile = open('student.txt','w')
studentFile.close()

studentFile = open('student.txt','a')
for i in range(len(student)):
    for j in range(len(student[i])):
        studentFile.write(str(student[i][j]))
        studentFile.write(',')
    studentFile.write('\n')
studentFile.close()

profFile = open('prof.txt','w')
profFile.close()

profFile = open('prof.txt','a')
for i in range(len(prof)):
    for j in range(len(prof[i])):
        profFile.write(str(prof[i][j]))
        profFile.write(',')
    profFile.write('\n')
profFile.close()

courseFile = open('course.txt','w')
courseFile.close()

courseFile = open('course.txt','a')
for i in range(len(course)):
    for j in range(len(course[i])):
        courseFile.write(str(course[i][j]))
        courseFile.write(',')
    courseFile.write('\n')
courseFile.close()
