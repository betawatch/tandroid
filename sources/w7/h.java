package w7;

import android.os.Build;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public abstract class h {
    public static boolean a(int i10) {
        if (i10 == 8 || i10 == 7) {
            return true;
        }
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31 || !(i10 == 26 || i10 == 27)) {
            return i11 >= 33 && i10 == 30;
        }
        return true;
    }
}
