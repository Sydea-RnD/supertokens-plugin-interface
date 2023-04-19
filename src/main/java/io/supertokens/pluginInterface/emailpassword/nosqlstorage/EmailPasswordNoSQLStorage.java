package io.supertokens.pluginInterface.emailpassword.nosqlstorage;

import io.supertokens.pluginInterface.emailpassword.PasswordResetTokenInfo;
import io.supertokens.pluginInterface.emailpassword.UserInfo;
import io.supertokens.pluginInterface.emailpassword.exceptions.DuplicateEmailException;
import io.supertokens.pluginInterface.exceptions.StorageQueryException;

public interface EmailPasswordNoSQLStorage {

    PasswordResetTokenInfo[] getAllPasswordResetTokenInfoForUser_Transaction(String userId)
            throws StorageQueryException;

    void deleteAllPasswordResetTokensForUser_Transaction(String userId)
            throws StorageQueryException;

    void updateUsersPassword_Transaction(String userId, String newPassword)
            throws StorageQueryException;

    void updateUsersEmail_Transaction(String userId, String email)
            throws StorageQueryException, DuplicateEmailException;

    UserInfo getUserInfoUsingId_Transaction(String userId) throws StorageQueryException;

}
