package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements jg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ im b;

    public /* synthetic */ uf(im imVar, int i9) {
        this.a = i9;
        this.b = imVar;
    }

    @Override // jg.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                im imVar = this.b;
                qn qnVar = imVar.F0;
                qn qnVar2 = qnVar.Z9;
                im imVar2 = qnVar2 != null ? qnVar2.T0 : qnVar.T0;
                float f10 = qnVar.uc.e;
                int i9 = (int) ((1.0f - f10) * 255.0f);
                int i10 = (int) (255.0f * f10);
                if (f10 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.f6.l1(f10 * 0.85f, qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.d6)));
                }
                og.d.a(new uf(imVar, 1), canvas, rectF, qnVar.t0, imVar2, i9);
                gh.f1 f1Var = qnVar.H3;
                if (f1Var != null) {
                    og.d.a(f1Var, canvas, rectF, f1Var, imVar2, i10);
                }
                kh.j1 j1Var = qnVar.m1;
                if (j1Var != null && j1Var.getVisibility() == 0) {
                    int childCount = qnVar.m1.getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        View childAt = qnVar.m1.getChildAt(i11);
                        if ((childAt instanceof sn) && childAt.getVisibility() == 0) {
                            sn snVar = (sn) childAt;
                            rn rnVar = snVar.a;
                            im imVar3 = rnVar.T0;
                            Objects.requireNonNull(imVar3);
                            og.d.b(new uf(imVar3, 0), canvas, rectF, rnVar.T0, snVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                qn qnVar3 = this.b.F0;
                if (qnVar3.t0.Z0()) {
                    qnVar3.t0.e(canvas, rectF);
                    break;
                } else {
                    qnVar3.t0.w1(canvas, rectF);
                    for (int i12 = 0; i12 < qnVar3.t0.getChildCount(); i12++) {
                        View childAt2 = qnVar3.t0.getChildAt(i12);
                        if (!qn.d2(qnVar3, childAt2, rectF)) {
                            if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                                if (t1Var.C1()) {
                                    canvas.save();
                                    canvas.translate(0.0f, t1Var.R);
                                    t1Var.D1(canvas, true, false);
                                    canvas.restore();
                                }
                                canvas.restore();
                                qnVar3.t0.drawChild(canvas, childAt2, uptimeMillis);
                                if (t1Var.U2()) {
                                    canvas.save();
                                    canvas.translate(t1Var.getX(), t1Var.getY());
                                    t1Var.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                qnVar3.t0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.w0) childAt2).z(canvas);
                                canvas.restore();
                            } else {
                                qnVar3.t0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    qnVar3.t0.x1(canvas, rectF);
                    break;
                }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // jg.a
    public final void g(g.x xVar, RectF rectF) {
        switch (this.a) {
        }
        xVar.b = true;
    }
}
