package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements ch.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ km b;

    public /* synthetic */ xf(km kmVar, int i10) {
        this.a = i10;
        this.b = kmVar;
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
                km kmVar = this.b;
                sn snVar = kmVar.J0;
                sn snVar2 = snVar.pa;
                km kmVar2 = snVar2 != null ? snVar2.j1 : snVar.j1;
                float f7 = snVar.Mc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.k6.o1(f7 * 0.85f, snVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6)));
                }
                hh.d.b(new xf(kmVar, 1), canvas, rectF, snVar.x0, kmVar2, i10);
                ai.u1 u1Var = snVar.X3;
                if (u1Var != null) {
                    hh.d.b(u1Var, canvas, rectF, u1Var, kmVar2, i11);
                }
                ei.h1 h1Var = snVar.C1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = snVar.C1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = snVar.C1.getChildAt(i12);
                        if ((childAt instanceof un) && childAt.getVisibility() == 0) {
                            un unVar = (un) childAt;
                            tn tnVar = unVar.a;
                            km kmVar3 = tnVar.j1;
                            Objects.requireNonNull(kmVar3);
                            hh.d.a(new xf(kmVar3, 0), canvas, rectF, tnVar.j1, unVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                sn snVar3 = this.b.J0;
                if (snVar3.x0.a1()) {
                    snVar3.x0.f(canvas, rectF);
                    break;
                } else {
                    snVar3.x0.C1(canvas, rectF);
                    for (int i13 = 0; i13 < snVar3.x0.getChildCount(); i13++) {
                        View childAt2 = snVar3.x0.getChildAt(i13);
                        if (!sn.e2(snVar3, childAt2, rectF)) {
                            if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                                if (t1Var.B1()) {
                                    canvas.save();
                                    canvas.translate(0.0f, t1Var.V);
                                    t1Var.C1(canvas, true, false);
                                    canvas.restore();
                                }
                                canvas.restore();
                                snVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                if (t1Var.T2()) {
                                    canvas.save();
                                    canvas.translate(t1Var.getX(), t1Var.getY());
                                    t1Var.W1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                                snVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.v0) childAt2).A(canvas);
                                canvas.restore();
                            } else {
                                snVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    snVar3.x0.D1(canvas, rectF);
                    break;
                }
        }
    }
}
