package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wu implements eh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.f2 b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ wu(org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, Object obj, int i7) {
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
                yw ywVar = (yw) this.b;
                rw rwVar = (rw) this.c;
                PointF pointF = (PointF) this.d;
                hw hwVar = ywVar.C0;
                int alpha = hwVar != null ? (int) (hwVar.getAlpha() * 255.0f) : 0;
                xw[] xwVarArr = ywVar.e0;
                int length = xwVarArr.length;
                int i7 = 0;
                while (i7 < length) {
                    xw xwVar = xwVarArr[i7];
                    if (xwVar != null && xwVar.getVisibility() == 0 && xwVar.getAlpha() > 0.0f) {
                        float h42 = ywVar.h4();
                        if (xwVar.F == null || h42 <= 0.0f) {
                            uw uwVar = xwVar.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(uwVar, canvas2, rectF2, uwVar, rwVar, 255 - alpha);
                            i7++;
                            canvas = canvas2;
                            rectF = rectF2;
                        } else if (!jh.k.b(xwVar.a, rwVar, pointF)) {
                            break;
                        } else {
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF.x, pointF.y);
                            xwVar.a.dispatchDraw(canvas);
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
                hw hwVar2 = ywVar.C0;
                if (hwVar2 != null && hwVar2.getVisibility() == 0 && ywVar.C0.getAlpha() > 0.0f) {
                    hw hwVar3 = ywVar.C0;
                    ih.d.b(hwVar3, canvas3, rectF3, hwVar3, rwVar, alpha);
                    break;
                }
                break;
            default:
                d51 d51Var = (d51) this.b;
                z5 z5Var = (z5) this.d;
                c41 c41Var = d51Var.S;
                FrameLayout frameLayout = this.c;
                if (c41Var != null) {
                    ih.d.a(c41Var, canvas, rectF, c41Var, frameLayout);
                }
                tb tbVar = d51Var.i0;
                if (tbVar != null) {
                    org.telegram.ui.Components.qj0 qj0Var = tbVar.F;
                    ih.d.a(qj0Var, canvas, rectF, qj0Var, frameLayout);
                }
                zd zdVar = d51Var.j0;
                if (zdVar != null && zdVar.getParent() == d51Var.h0 && d51Var.j0.getVisibility() == 0) {
                    d51Var.j0.d(canvas, rectF, z5Var);
                    break;
                }
                break;
        }
    }
}
