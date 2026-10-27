package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv implements dh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ vv(org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, Object obj, int i10) {
        this.a = i10;
        this.b = r2Var;
        this.c = frameLayout;
        this.d = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // dh.a
    public final void b(ch.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // dh.a
    public final void f(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        switch (this.a) {
            case 0:
                ey eyVar = (ey) this.b;
                wx wxVar = (wx) this.c;
                PointF pointF = (PointF) this.d;
                mx mxVar = eyVar.C0;
                int alpha = mxVar != null ? (int) (mxVar.getAlpha() * 255.0f) : 0;
                dy[] dyVarArr = eyVar.e0;
                int length = dyVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    dy dyVar = dyVarArr[i10];
                    if (dyVar != null && dyVar.getVisibility() == 0 && dyVar.getAlpha() > 0.0f) {
                        float d42 = eyVar.d4();
                        if (dyVar.F == null || d42 <= 0.0f) {
                            zx zxVar = dyVar.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(zxVar, canvas2, rectF2, zxVar, wxVar, 255 - alpha);
                            i10++;
                            canvas = canvas2;
                            rectF = rectF2;
                        } else if (!jh.k.b(dyVar.a, wxVar, pointF)) {
                            break;
                        } else {
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF.x, pointF.y);
                            dyVar.a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    canvas2 = canvas;
                    rectF2 = rectF;
                    i10++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                Canvas canvas3 = canvas;
                RectF rectF3 = rectF;
                mx mxVar2 = eyVar.C0;
                if (mxVar2 != null && mxVar2.getVisibility() == 0 && eyVar.C0.getAlpha() > 0.0f) {
                    mx mxVar3 = eyVar.C0;
                    ih.d.b(mxVar3, canvas3, rectF3, mxVar3, wxVar, alpha);
                    break;
                }
                break;
            default:
                y91 y91Var = (y91) this.b;
                e6 e6Var = (e6) this.d;
                x81 x81Var = y91Var.S;
                FrameLayout frameLayout = this.c;
                if (x81Var != null) {
                    ih.d.a(x81Var, canvas, rectF, x81Var, frameLayout);
                }
                dc dcVar = y91Var.i0;
                if (dcVar != null) {
                    org.telegram.ui.Components.nm0 nm0Var = dcVar.F;
                    ih.d.a(nm0Var, canvas, rectF, nm0Var, frameLayout);
                }
                ke keVar = y91Var.j0;
                if (keVar != null && keVar.getParent() == y91Var.h0 && y91Var.j0.getVisibility() == 0) {
                    y91Var.j0.d(canvas, rectF, e6Var);
                    break;
                }
                break;
        }
    }
}
