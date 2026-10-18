package w7;

import android.graphics.Path;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class i6 {
    public static void a(Path path, float f7, float f10) {
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, f7, f10, (f7 * 0.15f) / 2.0f, (0.15f * f10) / 1.212122f, Path.Direction.CW);
    }
}
