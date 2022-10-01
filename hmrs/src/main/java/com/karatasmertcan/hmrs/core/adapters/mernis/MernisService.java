package com.karatasmertcan.hmrs.core.adapters.mernis;

import java.time.LocalDate;

public interface MernisService {

	boolean checkIfRealPerson(String identityNumber, String firstName, String lastName, LocalDate dateOfBirth);
}
