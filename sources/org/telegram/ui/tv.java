package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tv implements dh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.r2 b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tv(org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, Object obj, int i10) {
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
                cy cyVar = (cy) this.b;
                tx txVar = (tx) this.c;
                PointF pointF = (PointF) this.d;
                jx jxVar = cyVar.C0;
                int alpha = jxVar != null ? (int) (jxVar.getAlpha() * 255.0f) : 0;
                ay[] ayVarArr = cyVar.e0;
                int length = ayVarArr.length;
                int i10 = 0;
                while (i10 < length) {
                    ay ayVar = ayVarArr[i10];
                    if (ayVar != null && ayVar.getVisibility() == 0 && ayVar.getAlpha() > 0.0f) {
                        float d42 = cyVar.d4();
                        if (ayVar.F == null || d42 <= 0.0f) {
                            wx wxVar = ayVar.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            ih.d.b(wxVar, canvas2, rectF2, wxVar, txVar, 255 - alpha);
                            i10++;
                            canvas = canvas2;
                            rectF = rectF2;
                        } else if (!jh.k.b(ayVar.a, txVar, pointF)) {
                            break;
                        } else {
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF.x, pointF.y);
                            ayVar.a.dispatchDraw(canvas);
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
                jx jxVar2 = cyVar.C0;
                if (jxVar2 != null && jxVar2.getVisibility() == 0 && cyVar.C0.getAlpha() > 0.0f) {
                    jx jxVar3 = cyVar.C0;
                    ih.d.b(jxVar3, canvas3, rectF3, jxVar3, txVar, alpha);
                    break;
                }
                break;
            default:
                w91 w91Var = (w91) this.b;
                e6 e6Var = (e6) this.d;
                v81 v81Var = w91Var.S;
                FrameLayout frameLayout = this.c;
                if (v81Var != null) {
                    ih.d.a(v81Var, canvas, rectF, v81Var, frameLayout);
                }
                dc dcVar = w91Var.i0;
                if (dcVar != null) {
                    org.telegram.ui.Components.mm0 mm0Var = dcVar.F;
                    ih.d.a(mm0Var, canvas, rectF, mm0Var, frameLayout);
                }
                ke keVar = w91Var.j0;
                if (keVar != null && keVar.getParent() == w91Var.h0 && w91Var.j0.getVisibility() == 0) {
                    w91Var.j0.d(canvas, rectF, e6Var);
                    break;
                }
                break;
        }
    }
}
