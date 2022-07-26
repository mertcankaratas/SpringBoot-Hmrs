package com.karatasmertcan.hmrs.core.adapters;

import java.time.LocalDate;

public interface MernisServiceAdapter {

	boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, LocalDate dateOfBirth);
}
