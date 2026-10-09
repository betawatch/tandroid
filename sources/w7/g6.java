package w7;

import android.graphics.Path;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class g6 {
    public static void a(Path path, float f7, float f10) {
        path.rewind();
        path.addRoundRect(0.0f, 0.0f, f7, f10, (f7 * 0.15f) / 2.0f, (0.15f * f10) / 1.212122f, Path.Direction.CW);
    }
}
