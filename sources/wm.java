// default package

import android.animation.TimeInterpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class wm implements TimeInterpolator {
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
