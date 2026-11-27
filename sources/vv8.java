// default package

import android.graphics.Paint;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class vv8 {
    public Paint a;
    public Paint b;
    public float c;
    public int d;
    public int e;
    public float f;

    public final void a(float f) {
        this.c = f;
        if (f < 0.0f) {
            this.c = 0.0f;
        } else if (f > 1.0f) {
            this.c = 1.0f;
        }
    }
}
