package w7;

import android.os.SystemClock;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class f8 {
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
