package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rf implements mg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ km b;

    public /* synthetic */ rf(km kmVar, int i10) {
        this.a = i10;
        this.b = kmVar;
    }

    @Override // mg.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                km kmVar = this.b;
                tn tnVar = kmVar.F0;
                tn tnVar2 = tnVar.Z9;
                km kmVar2 = tnVar2 != null ? tnVar2.T0 : tnVar.T0;
                float f9 = tnVar.uc.e;
                int i10 = (int) ((1.0f - f9) * 255.0f);
                int i11 = (int) (255.0f * f9);
                if (f9 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(f9 * 0.85f, tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6)));
                }
                rg.c.a(new rf(kmVar, 1), canvas, rectF, tnVar.t0, kmVar2, i10);
                jh.e1 e1Var = tnVar.H3;
                if (e1Var != null) {
                    rg.c.a(e1Var, canvas, rectF, e1Var, kmVar2, i11);
                }
                nh.g1 g1Var = tnVar.m1;
                if (g1Var != null && g1Var.getVisibility() == 0) {
                    int childCount = tnVar.m1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = tnVar.m1.getChildAt(i12);
                        if ((childAt instanceof vn) && childAt.getVisibility() == 0) {
                            vn vnVar = (vn) childAt;
                            un unVar = vnVar.a;
                            km kmVar3 = unVar.T0;
                            Objects.requireNonNull(kmVar3);
                            rg.c.b(new rf(kmVar3, 0), canvas, rectF, unVar.T0, vnVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                tn tnVar3 = this.b.F0;
                if (tnVar3.t0.Z0()) {
                    tnVar3.t0.e(canvas, rectF);
                    break;
                } else {
                    tnVar3.t0.w1(canvas, rectF);
                    for (int i13 = 0; i13 < tnVar3.t0.getChildCount(); i13++) {
                        View childAt2 = tnVar3.t0.getChildAt(i13);
                        if (!tn.d2(tnVar3, childAt2, rectF)) {
                            if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                                if (s1Var.C1()) {
                                    canvas.save();
                                    canvas.translate(0.0f, s1Var.R);
                                    s1Var.D1(canvas, true, false);
                                    canvas.restore();
                                }
                                canvas.restore();
                                tnVar3.t0.drawChild(canvas, childAt2, uptimeMillis);
                                if (s1Var.U2()) {
                                    canvas.save();
                                    canvas.translate(s1Var.getX(), s1Var.getY());
                                    s1Var.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                                tnVar3.t0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.v0) childAt2).A(canvas);
                                canvas.restore();
                            } else {
                                tnVar3.t0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    tnVar3.t0.x1(canvas, rectF);
                    break;
                }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // mg.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
