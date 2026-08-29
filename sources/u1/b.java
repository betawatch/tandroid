package u1;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class b implements Interpolator {
    public final float[] a;
    public final float b;

    public b(float[] fArr) {
        this.a = fArr;
        this.b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f9) {
        if (f9 >= 1.0f) {
            return 1.0f;
        }
        if (f9 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.a;
        int min = Math.min((int) ((fArr.length - 1) * f9), fArr.length - 2);
        float f10 = this.b;
        float w10 = com.google.android.recaptcha.internal.a.w(min, f10, f9, f10);
        float f11 = fArr[min];
        return com.google.android.recaptcha.internal.a.z(fArr[min + 1], f11, w10, f11);
    }
}
