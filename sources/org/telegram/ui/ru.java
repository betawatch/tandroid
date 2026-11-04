package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ru implements fh.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2 b;
    public final /* synthetic */ FrameLayout c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ru(org.telegram.ui.ActionBar.d2 d2Var, FrameLayout frameLayout, Object obj, int i3) {
        this.a = i3;
        this.b = d2Var;
        this.c = frameLayout;
        this.d = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // fh.a
    public final void b(eh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // fh.a
    public final void d(Canvas canvas, RectF rectF) {
        Canvas canvas2;
        RectF rectF2;
        switch (this.a) {
            case 0:
                uw uwVar = (uw) this.b;
                mw mwVar = (mw) this.c;
                PointF pointF = (PointF) this.d;
                cw cwVar = uwVar.D0;
                int alpha = cwVar != null ? (int) (cwVar.getAlpha() * 255.0f) : 0;
                tw[] twVarArr = uwVar.f0;
                int length = twVarArr.length;
                int i3 = 0;
                while (i3 < length) {
                    tw twVar = twVarArr[i3];
                    if (twVar != null && twVar.getVisibility() == 0 && twVar.getAlpha() > 0.0f) {
                        float h42 = uwVar.h4();
                        if (twVar.G == null || h42 <= 0.0f) {
                            pw pwVar = twVar.a;
                            canvas2 = canvas;
                            rectF2 = rectF;
                            jh.d.b(pwVar, canvas2, rectF2, pwVar, mwVar, 255 - alpha);
                            i3++;
                            canvas = canvas2;
                            rectF = rectF2;
                        } else if (!kh.k.b(twVar.a, mwVar, pointF)) {
                            break;
                        } else {
                            canvas.save();
                            canvas.clipRect(rectF);
                            canvas.translate(pointF.x, pointF.y);
                            twVar.a.dispatchDraw(canvas);
                            canvas.restore();
                        }
                    }
                    canvas2 = canvas;
                    rectF2 = rectF;
                    i3++;
                    canvas = canvas2;
                    rectF = rectF2;
                }
                Canvas canvas3 = canvas;
                RectF rectF3 = rectF;
                cw cwVar2 = uwVar.D0;
                if (cwVar2 != null && cwVar2.getVisibility() == 0 && uwVar.D0.getAlpha() > 0.0f) {
                    cw cwVar3 = uwVar.D0;
                    jh.d.b(cwVar3, canvas3, rectF3, cwVar3, mwVar, alpha);
                    break;
                }
                break;
            default:
                r41 r41Var = (r41) this.b;
                b6 b6Var = (b6) this.d;
                r31 r31Var = r41Var.T;
                FrameLayout frameLayout = this.c;
                if (r31Var != null) {
                    jh.d.a(r31Var, canvas, rectF, r31Var, frameLayout);
                }
                rb rbVar = r41Var.j0;
                if (rbVar != null) {
                    org.telegram.ui.Components.tj0 tj0Var = rbVar.G;
                    jh.d.a(tj0Var, canvas, rectF, tj0Var, frameLayout);
                }
                xd xdVar = r41Var.k0;
                if (xdVar != null && xdVar.getParent() == r41Var.i0 && r41Var.k0.getVisibility() == 0) {
                    r41Var.k0.d(canvas, rectF, b6Var);
                    break;
                }
                break;
        }
    }
}
