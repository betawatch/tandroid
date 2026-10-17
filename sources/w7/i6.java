package w7;

import android.graphics.Path;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class i6 {
    public static void a(Path path, float f7, float f10) {
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, f7, f10, (f7 * 0.15f) / 2.0f, (0.15f * f10) / 1.212122f, Path.Direction.CW);
    }
}
