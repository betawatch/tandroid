package s7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class k {
    public static final w5.c[] a = {new w5.c("name_ulr_private", 1), new w5.c("name_sleep_segment_request", 1), new w5.c("get_last_activity_feature_id", 1), new w5.c("support_context_feature_id", 1), new w5.c("get_current_location", 2), new w5.c("get_last_location_with_request", 1), new w5.c("set_mock_mode_with_callback", 1), new w5.c("set_mock_location_with_callback", 1), new w5.c("inject_location_with_callback", 1), new w5.c("location_updates_with_callback", 1), new w5.c("use_safe_parcelable_in_intents", 1)};

    public static String a(int i10) {
        if (i10 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i10 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i10 == 104) {
            return "LOW_POWER";
        }
        if (i10 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
