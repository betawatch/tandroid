package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wu(org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, Object obj, int i7) {
        this.a = i7;
        this.b = g2Var;
        this.c = frameLayout;
        this.d = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // eh.a
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // eh.a
    public final void d(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        switch (this.a) {
            case 0:
                cx cxVar = (cx) this.b;
                vw vwVar = (vw) this.c;
                PointF pointF = (PointF) this.d;
                kw kwVar = cxVar.D0;
                int alpha = kwVar != null ? (int) (kwVar.getAlpha() * 255.0f) : 0;
                bx[] bxVarArr = cxVar.f0;
                int length = bxVarArr.length;
                int i7 = 0;
                while (i7 < length) {
                    bx bxVar = bxVarArr[i7];
                    if (bxVar != null && bxVar.getVisibility() == 0 && bxVar.getAlpha() > 0.0f) {
                        float i42 = cxVar.i4();
                        if (bxVar.G == null || i42 <= 0.0f) {
                            yw ywVar = bxVar.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(ywVar, canvas2, rectF2, ywVar, vwVar, 255 - alpha);
                            i7++;
                            canvas = canvas2;
                            rectF = rectF2;
                        } else if (!jh.k.b(bxVar.a, vwVar, pointF)) {
                            break;
                        } else {
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF.x, pointF.y);
                            bxVar.a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    canvas2 = canvas;
                    rectF2 = rectF;
                    i7++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                Canvas canvas3 = canvas;
                RectF rectF3 = rectF;
                kw kwVar2 = cxVar.D0;
                if (kwVar2 != null && kwVar2.getVisibility() == 0 && cxVar.D0.getAlpha() > 0.0f) {
                    kw kwVar3 = cxVar.D0;
                    ih.d.b(kwVar3, canvas3, rectF3, kwVar3, vwVar, alpha);
                    break;
                }
                break;
            default:
                c51 c51Var = (c51) this.b;
                z5 z5Var = (z5) this.d;
                c41 c41Var = c51Var.T;
                FrameLayout frameLayout = this.c;
                if (c41Var != null) {
                    ih.d.a(c41Var, canvas, rectF, c41Var, frameLayout);
                }
                sb sbVar = c51Var.j0;
                if (sbVar != null) {
                    org.telegram.ui.Components.ek0 ek0Var = sbVar.G;
                    ih.d.a(ek0Var, canvas, rectF, ek0Var, frameLayout);
                }
                xd xdVar = c51Var.k0;
                if (xdVar != null && xdVar.getParent() == c51Var.i0 && c51Var.k0.getVisibility() == 0) {
                    c51Var.k0.d(canvas, rectF, z5Var);
                    break;
                }
                break;
        }
    }
}
