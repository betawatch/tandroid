package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements ch.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm b;

    public /* synthetic */ xf(jm jmVar, int i10) {
        this.a = i10;
        this.b = jmVar;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // ch.a
    public final void e(bh.a aVar, RectF rectF) {
        switch (this.a) {
        }
        aVar.a = true;
    }

    @Override // ch.a
    public final void f(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                jm jmVar = this.b;
                qn qnVar = jmVar.J0;
                qn qnVar2 = qnVar.da;
                jm jmVar2 = qnVar2 != null ? qnVar2.X0 : qnVar.X0;
                float f7 = qnVar.zc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.m1(f7 * 0.85f, qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6)));
                }
                hh.d.b(new xf(jmVar, 1), canvas, rectF, qnVar.x0, jmVar2, i10);
                ai.u1 u1Var = qnVar.L3;
                if (u1Var != null) {
                    hh.d.b(u1Var, canvas, rectF, u1Var, jmVar2, i11);
                }
                ei.h1 h1Var = qnVar.q1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = qnVar.q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = qnVar.q1.getChildAt(i12);
                        if ((childAt instanceof sn) && childAt.getVisibility() == 0) {
                            sn snVar = (sn) childAt;
                            rn rnVar = snVar.a;
                            jm jmVar3 = rnVar.X0;
                            Objects.requireNonNull(jmVar3);
                            hh.d.a(new xf(jmVar3, 0), canvas, rectF, rnVar.X0, snVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                qn qnVar3 = this.b.J0;
                if (qnVar3.x0.Z0()) {
                    qnVar3.x0.f(canvas, rectF);
                    break;
                } else {
                    qnVar3.x0.x1(canvas, rectF);
                    for (int i13 = 0; i13 < qnVar3.x0.getChildCount(); i13++) {
                        View childAt2 = qnVar3.x0.getChildAt(i13);
                        if (!qn.e2(qnVar3, childAt2, rectF)) {
                            if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt2;
                                if (u1Var2.C1()) {
                                    canvas.save();
                                    canvas.translate(0.0f, u1Var2.V);
                                    u1Var2.D1(canvas, true, false);
                                    canvas.restore();
                                }
                                canvas.restore();
                                qnVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                if (u1Var2.U2()) {
                                    canvas.save();
                                    canvas.translate(u1Var2.getX(), u1Var2.getY());
                                    u1Var2.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                qnVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.w0) childAt2).B(canvas);
                                canvas.restore();
                            } else {
                                qnVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    qnVar3.x0.y1(canvas, rectF);
                    break;
                }
        }
    }
}
