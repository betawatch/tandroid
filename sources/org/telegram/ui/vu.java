package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class vu implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vu(org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, Object obj, int i7) {
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
                bx bxVar = (bx) this.b;
                uw uwVar = (uw) this.c;
                PointF pointF = (PointF) this.d;
                jw jwVar = bxVar.D0;
                int alpha = jwVar != null ? (int) (jwVar.getAlpha() * 255.0f) : 0;
                ax[] axVarArr = bxVar.f0;
                int length = axVarArr.length;
                int i7 = 0;
                while (i7 < length) {
                    ax axVar = axVarArr[i7];
                    if (axVar != null && axVar.getVisibility() == 0 && axVar.getAlpha() > 0.0f) {
                        float i42 = bxVar.i4();
                        if (axVar.G == null || i42 <= 0.0f) {
                            xw xwVar = axVar.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(xwVar, canvas2, rectF2, xwVar, uwVar, 255 - alpha);
                            i7++;
                            canvas = canvas2;
                            rectF = rectF2;
                        } else if (!jh.k.b(axVar.a, uwVar, pointF)) {
                            break;
                        } else {
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF.x, pointF.y);
                            axVar.a.dispatchDraw(canvas);
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
                jw jwVar2 = bxVar.D0;
                if (jwVar2 != null && jwVar2.getVisibility() == 0 && bxVar.D0.getAlpha() > 0.0f) {
                    jw jwVar3 = bxVar.D0;
                    ih.d.b(jwVar3, canvas3, rectF3, jwVar3, uwVar, alpha);
                    break;
                }
                break;
            default:
                b51 b51Var = (b51) this.b;
                a6 a6Var = (a6) this.d;
                b41 b41Var = b51Var.T;
                FrameLayout frameLayout = this.c;
                if (b41Var != null) {
                    ih.d.a(b41Var, canvas, rectF, b41Var, frameLayout);
                }
                sb sbVar = b51Var.j0;
                if (sbVar != null) {
                    org.telegram.ui.Components.ek0 ek0Var = sbVar.G;
                    ih.d.a(ek0Var, canvas, rectF, ek0Var, frameLayout);
                }
                xd xdVar = b51Var.k0;
                if (xdVar != null && xdVar.getParent() == b51Var.i0 && b51Var.k0.getVisibility() == 0) {
                    b51Var.k0.d(canvas, rectF, a6Var);
                    break;
                }
                break;
        }
    }
}
