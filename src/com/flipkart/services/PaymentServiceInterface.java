package com.flipkart.services;

import com.flipkart.bean.*;
import java.sql.SQLException;

public interface PaymentServiceInterface {
	void payFees(Student student) throws SQLException;
}

