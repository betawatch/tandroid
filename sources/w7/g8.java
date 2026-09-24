package w7;

import android.os.SystemClock;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public abstract class g8 {
    public static y2.g a(x2.r rVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.a(i11, elapsedRealtime)) {
                i10++;
            }
        }
        return new y2.g(1, 0, length, i10);
    }
}
