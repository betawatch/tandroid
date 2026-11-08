package q2;

import android.os.Build;
import java.util.UUID;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class r implements k2.b {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    static {
        boolean z9;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z9 = true;
                c = z9;
            }
        }
        z9 = false;
        c = z9;
    }

    public r(UUID uuid, byte[] bArr) {
        this.a = uuid;
        this.b = bArr;
    }
}
