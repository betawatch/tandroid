package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uu implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uu(org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, Object obj, int i7) {
        this.a = i7;
        this.b = f2Var;
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
                ww wwVar = (ww) this.b;
                pw pwVar = (pw) this.c;
                PointF pointF = (PointF) this.d;
                fw fwVar = wwVar.C0;
                int alpha = fwVar != null ? (int) (fwVar.getAlpha() * 255.0f) : 0;
                vw[] vwVarArr = wwVar.e0;
                int length = vwVarArr.length;
                int i7 = 0;
                while (i7 < length) {
                    vw vwVar = vwVarArr[i7];
                    if (vwVar != null && vwVar.getVisibility() == 0 && vwVar.getAlpha() > 0.0f) {
                        float h42 = wwVar.h4();
                        if (vwVar.F == null || h42 <= 0.0f) {
                            sw swVar = vwVar.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(swVar, canvas2, rectF2, swVar, pwVar, 255 - alpha);
                            i7++;
                            canvas = canvas2;
                            rectF = rectF2;
                        } else if (!jh.k.b(vwVar.a, pwVar, pointF)) {
                            break;
                        } else {
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF.x, pointF.y);
                            vwVar.a.dispatchDraw(canvas);
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
                fw fwVar2 = wwVar.C0;
                if (fwVar2 != null && fwVar2.getVisibility() == 0 && wwVar.C0.getAlpha() > 0.0f) {
                    fw fwVar3 = wwVar.C0;
                    ih.d.b(fwVar3, canvas3, rectF3, fwVar3, pwVar, alpha);
                    break;
                }
                break;
            default:
                c51 c51Var = (c51) this.b;
                z5 z5Var = (z5) this.d;
                b41 b41Var = c51Var.S;
                FrameLayout frameLayout = this.c;
                if (b41Var != null) {
                    ih.d.a(b41Var, canvas, rectF, b41Var, frameLayout);
                }
                tb tbVar = c51Var.i0;
                if (tbVar != null) {
                    org.telegram.ui.Components.pj0 pj0Var = tbVar.F;
                    ih.d.a(pj0Var, canvas, rectF, pj0Var, frameLayout);
                }
                zd zdVar = c51Var.j0;
                if (zdVar != null && zdVar.getParent() == c51Var.h0 && c51Var.j0.getVisibility() == 0) {
                    c51Var.j0.d(canvas, rectF, z5Var);
                    break;
                }
                break;
        }
    }
}
