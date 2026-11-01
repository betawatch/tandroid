package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xv implements ug.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xv(org.telegram.ui.ActionBar.k2 k2Var, FrameLayout frameLayout, Object obj, int i10) {
        this.a = i10;
        this.b = k2Var;
        this.c = frameLayout;
        this.d = obj;
    }

    @Override // ug.a
    public final void d(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        switch (this.a) {
            case 0:
                zx zxVar = (zx) this.b;
                sx sxVar = (sx) this.c;
                PointF pointF = (PointF) this.d;
                jx jxVar = zxVar.C0;
                int alpha = jxVar != null ? (int) (jxVar.getAlpha() * 255.0f) : 0;
                yx[] yxVarArr = zxVar.e0;
                int length = yxVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    yx yxVar = yxVarArr[i10];
                    if (yxVar != null && yxVar.getVisibility() == 0 && yxVar.getAlpha() > 0.0f) {
                        float h42 = zxVar.h4();
                        if (yxVar.F == null || h42 <= 0.0f) {
                            vx vxVar = yxVar.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            yg.d.b(vxVar, canvas2, rectF2, vxVar, sxVar, 255 - alpha);
                            i10++;
                            canvas = canvas2;
                            rectF = rectF2;
                        } else if (!zg.h.b(yxVar.a, sxVar, pointF)) {
                            break;
                        } else {
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF.x, pointF.y);
                            yxVar.a.dispatchDraw(canvas);
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
                jx jxVar2 = zxVar.C0;
                if (jxVar2 != null && jxVar2.getVisibility() == 0 && zxVar.C0.getAlpha() > 0.0f) {
                    jx jxVar3 = zxVar.C0;
                    yg.d.b(jxVar3, canvas3, rectF3, jxVar3, sxVar, alpha);
                    break;
                }
                break;
            default:
                s61 s61Var = (s61) this.b;
                z5 z5Var = (z5) this.d;
                s51 s51Var = s61Var.S;
                FrameLayout frameLayout = this.c;
                if (s51Var != null) {
                    yg.d.a(s51Var, canvas, rectF, s51Var, frameLayout);
                }
                zb zbVar = s61Var.i0;
                if (zbVar != null) {
                    org.telegram.ui.Components.uk0 uk0Var = zbVar.F;
                    yg.d.a(uk0Var, canvas, rectF, uk0Var, frameLayout);
                }
                le leVar = s61Var.j0;
                if (leVar != null && leVar.getParent() == s61Var.h0 && s61Var.j0.getVisibility() == 0) {
                    s61Var.j0.d(canvas, rectF, z5Var);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ug.a
    public final void g(g.y yVar, RectF rectF) {
        switch (this.a) {
        }
        yVar.b = true;
    }
}
