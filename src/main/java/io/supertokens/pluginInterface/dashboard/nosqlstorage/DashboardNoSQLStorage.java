package io.supertokens.pluginInterface.dashboard.nosqlstorage;

import io.supertokens.pluginInterface.dashboard.exceptions.DuplicateEmailException;
import io.supertokens.pluginInterface.dashboard.exceptions.UserIdNotFoundException;
import io.supertokens.pluginInterface.exceptions.StorageQueryException;

public interface DashboardNoSQLStorage {

    void updateDashboardUsersEmailWithUserId_Transaction(String userId, String newEmail)
            throws StorageQueryException, DuplicateEmailException, UserIdNotFoundException;

    void updateDashboardUsersPasswordWithUserId_Transaction(String userId, String newPassword)
            throws StorageQueryException, UserIdNotFoundException;

}
