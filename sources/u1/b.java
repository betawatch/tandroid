package u1;

import android.view.animation.Interpolator;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
        float v = e2.v(min, f10, f7, f10);
        float f11 = fArr[min];
        return e2.z(fArr[min + 1], f11, v, f11);
    }
}
