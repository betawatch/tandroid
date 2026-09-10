package w7;

import android.os.SystemClock;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
