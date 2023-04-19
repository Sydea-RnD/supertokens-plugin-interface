package io.supertokens.pluginInterface.passwordless.nosqlstorage;

import io.supertokens.pluginInterface.emailpassword.exceptions.DuplicateEmailException;
import io.supertokens.pluginInterface.emailpassword.exceptions.UnknownUserIdException;
import io.supertokens.pluginInterface.exceptions.StorageQueryException;
import io.supertokens.pluginInterface.passwordless.PasswordlessCode;
import io.supertokens.pluginInterface.passwordless.PasswordlessDevice;
import io.supertokens.pluginInterface.passwordless.exception.DuplicatePhoneNumberException;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public interface PasswordlessNoSQLStorage {

    PasswordlessDevice getDevice_Transaction(String deviceIdHash)
            throws StorageQueryException;

    void incrementDeviceFailedAttemptCount_Transaction(String deviceIdHash)
            throws StorageQueryException;

    PasswordlessCode[] getCodesOfDevice_Transaction(String deviceIdHash)
            throws StorageQueryException;

    void deleteDevice_Transaction(String deviceIdHash) throws StorageQueryException;

    void deleteDevicesByPhoneNumber_Transaction(String phoneNumber)
            throws StorageQueryException;

    void deleteDevicesByEmail_Transaction(String email) throws StorageQueryException;

    PasswordlessCode getCodeByLinkCodeHash_Transaction(String linkCodeHash)
            throws StorageQueryException;

    void deleteCode_Transaction(String codeId) throws StorageQueryException;

    void updateUserEmail_Transaction(@Nonnull String userId, @Nullable String email)
            throws StorageQueryException, UnknownUserIdException, DuplicateEmailException;

    void updateUserPhoneNumber_Transaction(@Nonnull String userId,
                                           @Nullable String phoneNumber)
            throws StorageQueryException, UnknownUserIdException, DuplicatePhoneNumberException;

}
