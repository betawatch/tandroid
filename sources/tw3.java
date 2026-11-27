// default package

import android.graphics.Canvas;
import android.graphics.RectF;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class tw3 {
    public byte a;
    public float b;
    public float c;
    public float d = 0.0f;
    public int e = 0;
    public final RectF f = new RectF();
    public final v41 g;
    public final mm h;

    public tw3(xw3 xw3Var) {
        this.g = new v41(xw3Var);
        this.h = new mm(350L, xw3Var, k43.h);
    }

    public abstract void a(Canvas canvas, float f, float f2);

    public void b(boolean z) {
    }
}
