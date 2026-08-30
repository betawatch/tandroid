package ph;

import android.graphics.Bitmap;
import android.graphics.Color;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class g0 {
    public static float[] a;

    public static int a(int i10, boolean z4) {
        if (a == null) {
            a = new float[3];
        }
        Color.colorToHSV(i10, a);
        float[] fArr = a;
        fArr[2] = Utilities.clamp(fArr[2] + (z4 ? -0.05f : 0.07f), 0.85f, 0.15f);
        float[] fArr2 = a;
        float f10 = fArr2[1];
        if (f10 > 0.1f && f10 <= 0.95f) {
            if (f10 <= 0.5f) {
                fArr2[1] = Utilities.clamp(f10 + 0.2f, 1.0f, 0.0f);
            } else if (f10 > 0.8f) {
                fArr2[1] = Utilities.clamp(f10 - 0.4f, 1.0f, 0.0f);
            }
        }
        return Color.HSVToColor(a);
    }

    public static int[] b(Bitmap bitmap, boolean z4) {
        return new int[]{a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.1f)), z4), a(bitmap.getPixel(bitmap.getWidth() / 2, (int) (bitmap.getHeight() * 0.9f)), z4)};
    }
}
