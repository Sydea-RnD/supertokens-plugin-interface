package io.supertokens.pluginInterface.thirdparty.nosqlstorage;

import io.supertokens.pluginInterface.exceptions.StorageQueryException;
import io.supertokens.pluginInterface.thirdparty.UserInfo;

public interface ThirdPartyNoSQLStorage {

    UserInfo getUserInfoUsingId_Transaction(String thirdPartyId, String thirdPartyUserId)
            throws StorageQueryException;

    void updateUserEmail_Transaction(String thirdPartyId, String thirdPartyUserId, String newEmail)
            throws StorageQueryException;

}
