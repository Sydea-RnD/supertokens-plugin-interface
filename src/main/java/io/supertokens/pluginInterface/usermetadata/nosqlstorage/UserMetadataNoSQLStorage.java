package io.supertokens.pluginInterface.usermetadata.nosqlstorage;

import com.google.gson.JsonObject;
import io.supertokens.pluginInterface.exceptions.StorageQueryException;

public interface UserMetadataNoSQLStorage {

    JsonObject getUserMetadata_Transaction(String userId) throws StorageQueryException;

    int setUserMetadata_Transaction(String userId, JsonObject metadata)
            throws StorageQueryException;

}
