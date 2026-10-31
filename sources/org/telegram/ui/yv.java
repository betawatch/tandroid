package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yv implements ug.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.k2 b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yv(org.telegram.ui.ActionBar.k2 k2Var, FrameLayout frameLayout, Object obj, int i10) {
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
                ay ayVar = (ay) this.b;
                tx txVar = (tx) this.c;
                PointF pointF = (PointF) this.d;
                kx kxVar = ayVar.C0;
                int alpha = kxVar != null ? (int) (kxVar.getAlpha() * 255.0f) : 0;
                zx[] zxVarArr = ayVar.e0;
                int length = zxVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    zx zxVar = zxVarArr[i10];
                    if (zxVar != null && zxVar.getVisibility() == 0 && zxVar.getAlpha() > 0.0f) {
                        float g42 = ayVar.g4();
                        if (zxVar.F == null || g42 <= 0.0f) {
                            wx wxVar = zxVar.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            yg.d.b(wxVar, canvas2, rectF2, wxVar, txVar, 255 - alpha);
                            i10++;
                            canvas = canvas2;
                            rectF = rectF2;
                        } else if (!zg.h.b(zxVar.a, txVar, pointF)) {
                            break;
                        } else {
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF.x, pointF.y);
                            zxVar.a.dispatchDraw(canvas);
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
                kx kxVar2 = ayVar.C0;
                if (kxVar2 != null && kxVar2.getVisibility() == 0 && ayVar.C0.getAlpha() > 0.0f) {
                    kx kxVar3 = ayVar.C0;
                    yg.d.b(kxVar3, canvas3, rectF3, kxVar3, txVar, alpha);
                    break;
                }
                break;
            default:
                u61 u61Var = (u61) this.b;
                z5 z5Var = (z5) this.d;
                u51 u51Var = u61Var.S;
                FrameLayout frameLayout = this.c;
                if (u51Var != null) {
                    yg.d.a(u51Var, canvas, rectF, u51Var, frameLayout);
                }
                zb zbVar = u61Var.i0;
                if (zbVar != null) {
                    org.telegram.ui.Components.tk0 tk0Var = zbVar.F;
                    yg.d.a(tk0Var, canvas, rectF, tk0Var, frameLayout);
                }
                le leVar = u61Var.j0;
                if (leVar != null && leVar.getParent() == u61Var.h0 && u61Var.j0.getVisibility() == 0) {
                    u61Var.j0.d(canvas, rectF, z5Var);
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
