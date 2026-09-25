package v7;

import android.content.Context;
import android.util.Log;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public abstract class r {
    public static String a(Context context, int i10) {
        if (context == null) {
            return "";
        }
        if (i10 == 1) {
            return context.getString(R.string.fingerprint_error_hw_not_available);
        }
        if (i10 != 7) {
            switch (i10) {
                case 9:
                    break;
                case 10:
                    return context.getString(R.string.fingerprint_error_user_canceled);
                case 11:
                    return context.getString(R.string.fingerprint_error_no_fingerprints);
                case 12:
                    return context.getString(R.string.fingerprint_error_hw_not_present);
                default:
                    Log.e("BiometricUtils", "Unknown error code: " + i10);
                    return context.getString(R.string.default_error_msg);
            }
        }
        return context.getString(R.string.fingerprint_error_lockout);
    }
}
