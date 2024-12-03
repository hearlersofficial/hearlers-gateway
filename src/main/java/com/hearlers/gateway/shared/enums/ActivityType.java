package com.hearlers.gateway.shared.enums;

public enum ActivityType {
    ACTIVITY_TYPE_UNSPECIFIED,
    ACTIVITY_TYPE_LOGIN,
    ACTIVITY_TYPE_LOGOUT,
    ACTIVITY_TYPE_UNLOGINNED_USER_COME_IN,
    ACTIVITY_TYPE_UNLOGINNED_USER_STARTED_COUNSELING,
    ACTIVITY_TYPE_UNLOGINNED_USER_FINISHED_COUNSELING,
    ACTIVITY_TYPE_ONBOARDING_START,
    ACTIVITY_TYPE_ONBOARDING_END,
    ACTIVITY_TYPE_SET_CONVERSATION_PREFERENCE,
    ACTIVITY_TYPE_COUNSELING_START,
    ACTIVITY_TYPE_COUNSELING_END,
    ACTIVITY_TYPE_PROFILE_UPDATE,
    ACTIVITY_TYPE_FEEDBACK_SUBMIT,
    ACTIVITY_TYPE_SUBSCRIPTION_START,
    ACTIVITY_TYPE_SUBSCRIPTION_CANCEL,
    ACTIVITY_TYPE_PAYMENT_COMPLETE,
}