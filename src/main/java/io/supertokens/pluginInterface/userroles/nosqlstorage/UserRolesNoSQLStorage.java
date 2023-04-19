package io.supertokens.pluginInterface.userroles.nosqlstorage;

import io.supertokens.pluginInterface.exceptions.StorageQueryException;
import io.supertokens.pluginInterface.userroles.exception.UnknownRoleException;

public interface UserRolesNoSQLStorage {

    // delete role associated with the input userId from the input roles
    boolean deleteRoleForUser_Transaction(String userId, String role)
            throws StorageQueryException;

    // create a new role if it doesn't exist
    boolean createNewRoleOrDoNothingIfExists_Transaction(String role)
            throws StorageQueryException;

    // associate a permission with a role
    void addPermissionToRoleOrDoNothingIfExists_Transaction(String role, String permission)
            throws StorageQueryException, UnknownRoleException;

    // delete a permission associated with the input role
    boolean deletePermissionForRole_Transaction(String role, String permission)
            throws StorageQueryException;

    // delete all permissions associated with the input role
    int deleteAllPermissionsForRole_Transaction(String role) throws StorageQueryException;

    // check if a role exists
    boolean doesRoleExist_Transaction(String role) throws StorageQueryException;

}
