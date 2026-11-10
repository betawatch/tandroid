package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xu implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xu(org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, Object obj, int i7) {
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
                zw zwVar = (zw) this.b;
                sw swVar = (sw) this.c;
                PointF pointF = (PointF) this.d;
                iw iwVar = zwVar.C0;
                int alpha = iwVar != null ? (int) (iwVar.getAlpha() * 255.0f) : 0;
                yw[] ywVarArr = zwVar.e0;
                int length = ywVarArr.length;
                int i7 = 0;
                while (i7 < length) {
                    yw ywVar = ywVarArr[i7];
                    if (ywVar != null && ywVar.getVisibility() == 0 && ywVar.getAlpha() > 0.0f) {
                        float h42 = zwVar.h4();
                        if (ywVar.F == null || h42 <= 0.0f) {
                            vw vwVar = ywVar.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(vwVar, canvas2, rectF2, vwVar, swVar, 255 - alpha);
                            i7++;
                            canvas = canvas2;
                            rectF = rectF2;
                        } else if (!jh.k.b(ywVar.a, swVar, pointF)) {
                            break;
                        } else {
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF.x, pointF.y);
                            ywVar.a.dispatchDraw(canvas);
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
                iw iwVar2 = zwVar.C0;
                if (iwVar2 != null && iwVar2.getVisibility() == 0 && zwVar.C0.getAlpha() > 0.0f) {
                    iw iwVar3 = zwVar.C0;
                    ih.d.b(iwVar3, canvas3, rectF3, iwVar3, swVar, alpha);
                    break;
                }
                break;
            default:
                e51 e51Var = (e51) this.b;
                z5 z5Var = (z5) this.d;
                d41 d41Var = e51Var.S;
                FrameLayout frameLayout = this.c;
                if (d41Var != null) {
                    ih.d.a(d41Var, canvas, rectF, d41Var, frameLayout);
                }
                tb tbVar = e51Var.i0;
                if (tbVar != null) {
                    org.telegram.ui.Components.pj0 pj0Var = tbVar.F;
                    ih.d.a(pj0Var, canvas, rectF, pj0Var, frameLayout);
                }
                zd zdVar = e51Var.j0;
                if (zdVar != null && zdVar.getParent() == e51Var.h0 && e51Var.j0.getVisibility() == 0) {
                    e51Var.j0.d(canvas, rectF, z5Var);
                    break;
                }
                break;
        }
    }
}
