// default package

import android.graphics.Paint;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
