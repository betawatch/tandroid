package q7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class l {
    public static final u5.c[] a = {new u5.c("name_ulr_private", 1), new u5.c("name_sleep_segment_request", 1), new u5.c("get_last_activity_feature_id", 1), new u5.c("support_context_feature_id", 1), new u5.c("get_current_location", 2), new u5.c("get_last_location_with_request", 1), new u5.c("set_mock_mode_with_callback", 1), new u5.c("set_mock_location_with_callback", 1), new u5.c("inject_location_with_callback", 1), new u5.c("location_updates_with_callback", 1), new u5.c("use_safe_parcelable_in_intents", 1)};

    public static String a(int i9) {
        if (i9 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i9 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i9 == 104) {
            return "LOW_POWER";
        }
        if (i9 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
