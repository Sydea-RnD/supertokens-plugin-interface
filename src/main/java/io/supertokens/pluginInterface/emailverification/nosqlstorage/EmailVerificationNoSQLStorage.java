package io.supertokens.pluginInterface.emailverification.nosqlstorage;

import io.supertokens.pluginInterface.emailverification.EmailVerificationTokenInfo;
import io.supertokens.pluginInterface.exceptions.StorageQueryException;

public interface EmailVerificationNoSQLStorage {

    EmailVerificationTokenInfo[] getAllEmailVerificationTokenInfoForUser_Transaction(String userId, String email) throws StorageQueryException;

    void deleteAllEmailVerificationTokensForUser_Transaction(String userId, String email) throws StorageQueryException;

    void updateIsEmailVerified_Transaction(String userId, String email, boolean isEmailVerified) throws StorageQueryException;

}
