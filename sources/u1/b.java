package u1;

import android.view.animation.Interpolator;
import c3.i0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class b implements Interpolator {
    public final float[] a;
    public final float b;

    public b(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        if (f7 >= 1.0f) {
            return 1.0f;
        }
        if (f7 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int min = Math.min((int) ((fArr.length - 1) * f7), fArr.length - 2);
        float f10 = this.b;
        float g10 = i0.g(min, f10, f7, f10);
        float f11 = fArr[min];
        return i0.z(fArr[min + 1], f11, g10, f11);
    }
}
