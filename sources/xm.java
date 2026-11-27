// default package

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xm implements TimeInterpolator {
    public int[] a;
    public int b;
    public int c;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        int i = (int) ((f * this.c) + 0.5f);
        int i2 = this.b;
        int[] iArr = this.a;
        int i3 = 0;
        while (true) {
            if (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    f2 = i / this.c;
                    break;
                }
                i -= i4;
                i3++;
            } else {
                f2 = 0.0f;
                break;
            }
        }
        return (i3 / i2) + f2;
    }
}
