package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf implements pg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ pm b;

    public /* synthetic */ yf(pm pmVar, int i10) {
        this.a = i10;
        this.b = pmVar;
    }

    @Override // pg.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                pm pmVar = this.b;
                xn xnVar = pmVar.G0;
                xn xnVar2 = xnVar.aa;
                pm pmVar2 = xnVar2 != null ? xnVar2.U0 : xnVar.U0;
                float f10 = xnVar.vc.e;
                int i10 = (int) ((1.0f - f10) * 255.0f);
                int i11 = (int) (255.0f * f10);
                if (f10 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.k6.l1(f10 * 0.85f, xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6)));
                }
                ug.c.a(new yf(pmVar, 1), canvas, rectF, xnVar.u0, pmVar2, i10);
                mh.d1 d1Var = xnVar.I3;
                if (d1Var != null) {
                    ug.c.a(d1Var, canvas, rectF, d1Var, pmVar2, i11);
                }
                ek ekVar = xnVar.n1;
                if (ekVar != null && ekVar.getVisibility() == 0) {
                    int childCount = xnVar.n1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = xnVar.n1.getChildAt(i12);
                        if ((childAt instanceof zn) && childAt.getVisibility() == 0) {
                            zn znVar = (zn) childAt;
                            yn ynVar = znVar.a;
                            pm pmVar3 = ynVar.U0;
                            Objects.requireNonNull(pmVar3);
                            ug.c.b(new yf(pmVar3, 0), canvas, rectF, ynVar.U0, znVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                xn xnVar3 = this.b.G0;
                if (xnVar3.u0.Z0()) {
                    xnVar3.u0.e(canvas, rectF);
                    break;
                } else {
                    xnVar3.u0.w1(canvas, rectF);
                    for (int i13 = 0; i13 < xnVar3.u0.getChildCount(); i13++) {
                        View childAt2 = xnVar3.u0.getChildAt(i13);
                        if (!xn.d2(xnVar3, childAt2, rectF)) {
                            if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                                if (t1Var.C1()) {
                                    canvas.save();
                                    canvas.translate(0.0f, t1Var.S);
                                    t1Var.D1(canvas, true, false);
                                    canvas.restore();
                                }
                                canvas.restore();
                                xnVar3.u0.drawChild(canvas, childAt2, uptimeMillis);
                                if (t1Var.U2()) {
                                    canvas.save();
                                    canvas.translate(t1Var.getX(), t1Var.getY());
                                    t1Var.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                                xnVar3.u0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.v0) childAt2).A(canvas);
                                canvas.restore();
                            } else {
                                xnVar3.u0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    xnVar3.u0.x1(canvas, rectF);
                    break;
                }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // pg.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
