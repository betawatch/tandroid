package vh;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class n4 {
    public final v a;
    public boolean b;
    public m4 c;
    public final org.telegram.ui.Components.t5 d;
    public final org.telegram.ui.Components.t5 e;
    public final org.telegram.ui.Components.t5 f;
    public final org.telegram.ui.Components.t5[] g;
    public final org.telegram.ui.Components.t5[] h;
    public final Paint i;
    public final Path j;

    public n4(v vVar) {
        Paint paint = new Paint(1);
        this.i = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-8697);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(6.0f));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShadowLayer(1.08045274E9f, 0.0f, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(6.0f));
        this.j = new Path();
        this.a = vVar;
        gr grVar = gr.g;
        this.d = new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 320L, grVar);
        this.e = new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar);
        this.f = new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar);
        this.g = new org.telegram.ui.Components.t5[]{new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar)};
        this.h = new org.telegram.ui.Components.t5[]{new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar), new org.telegram.ui.Components.t5(0.0f, vVar, 0L, 160L, grVar)};
    }

    public final void a(m4 m4Var) {
        if (m4Var != null) {
            this.c = m4Var;
        }
        if (m4Var != null) {
            float f7 = m4Var.d;
            float f10 = m4Var.c;
            PointF[] pointFArr = m4Var.b;
            if (!this.b) {
                this.e.e(true, f10);
                this.f.e(true, f7);
                for (int i10 = 0; i10 < Math.min(4, pointFArr.length); i10++) {
                    this.g[i10].e(true, pointFArr[i10].x - f10);
                    this.h[i10].e(true, pointFArr[i10].y - f7);
                }
            }
        }
        this.b = m4Var != null;
        this.a.run();
    }
}
