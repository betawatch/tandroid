package q2;

import android.os.Build;
import java.util.UUID;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
