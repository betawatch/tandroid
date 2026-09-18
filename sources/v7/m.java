package v7;

import android.os.Build;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public abstract class m {
    public static boolean a(int i10) {
        return (i10 & 32768) != 0;
    }

    public static boolean b(int i10) {
        if (i10 == 15 || i10 == 255) {
            return true;
        }
        if (i10 == 32768) {
            return Build.VERSION.SDK_INT >= 30;
        }
        if (i10 != 32783) {
            return i10 == 33023 || i10 == 0;
        }
        int i11 = Build.VERSION.SDK_INT;
        return i11 < 28 || i11 > 29;
    }
}
