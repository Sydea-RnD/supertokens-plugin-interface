package io.supertokens.pluginInterface.totp.nosqlstorage;

import io.supertokens.pluginInterface.exceptions.StorageQueryException;
import io.supertokens.pluginInterface.totp.TOTPDevice;
import io.supertokens.pluginInterface.totp.TOTPUsedCode;
import io.supertokens.pluginInterface.totp.exception.TotpNotEnabledException;
import io.supertokens.pluginInterface.totp.exception.UsedCodeAlreadyExistsException;

public interface TOTPNoSQLStorage {

    int deleteDevice_Transaction(String userId, String deviceName)
            throws StorageQueryException;

    TOTPDevice[] getDevices_Transaction(String userId)
            throws StorageQueryException;

    void removeUser_Transaction(String userId)
            throws StorageQueryException;

    /**
     * Get totp used codes for user (expired/non-expired) yet (sorted by descending
     * order of created time):
     */
    TOTPUsedCode[] getAllUsedCodesDescOrder_Transaction(String userId)
            throws StorageQueryException;

    /** Insert a used TOTP code for an existing user: */
    void insertUsedCode_Transaction(TOTPUsedCode code)
            throws StorageQueryException, TotpNotEnabledException, UsedCodeAlreadyExistsException;

}
