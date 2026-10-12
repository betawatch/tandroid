package w7;

import android.graphics.Path;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class j6 {
    public static void a(Path path, float f7, float f10) {
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, f7, f10, (f7 * 0.15f) / 2.0f, (0.15f * f10) / 1.212122f, Path.Direction.CW);
    }
}
