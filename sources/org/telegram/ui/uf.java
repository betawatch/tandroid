package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uf implements kg.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm b;

    public /* synthetic */ uf(jm jmVar, int i10) {
        this.a = i10;
        this.b = jmVar;
    }

    @Override // kg.a
    public final void e(Canvas canvas, RectF rectF) {
        switch (this.a) {
            case 0:
                jm jmVar = this.b;
                rn rnVar = jmVar.F0;
                rn rnVar2 = rnVar.Z9;
                jm jmVar2 = rnVar2 != null ? rnVar2.T0 : rnVar.T0;
                float f10 = rnVar.uc.e;
                int i10 = (int) ((1.0f - f10) * 255.0f);
                int i11 = (int) (255.0f * f10);
                if (f10 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.g6.l1(f10 * 0.85f, rnVar.getThemedColor(org.telegram.ui.ActionBar.g6.d6)));
                }
                pg.c.a(new uf(jmVar, 1), canvas, rectF, rnVar.t0, jmVar2, i10);
                hh.f1 f1Var = rnVar.H3;
                if (f1Var != null) {
                    pg.c.a(f1Var, canvas, rectF, f1Var, jmVar2, i11);
                }
                lh.h1 h1Var = rnVar.m1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = rnVar.m1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = rnVar.m1.getChildAt(i12);
                        if ((childAt instanceof tn) && childAt.getVisibility() == 0) {
                            tn tnVar = (tn) childAt;
                            sn snVar = tnVar.a;
                            jm jmVar3 = snVar.T0;
                            Objects.requireNonNull(jmVar3);
                            pg.c.b(new uf(jmVar3, 0), canvas, rectF, snVar.T0, tnVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                rn rnVar3 = this.b.F0;
                if (rnVar3.t0.Z0()) {
                    rnVar3.t0.e(canvas, rectF);
                    break;
                } else {
                    rnVar3.t0.w1(canvas, rectF);
                    for (int i13 = 0; i13 < rnVar3.t0.getChildCount(); i13++) {
                        View childAt2 = rnVar3.t0.getChildAt(i13);
                        if (!rn.d2(rnVar3, childAt2, rectF)) {
                            if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                                if (s1Var.B1()) {
                                    canvas.save();
                                    canvas.translate(0.0f, s1Var.R);
                                    s1Var.C1(canvas, true, false);
                                    canvas.restore();
                                }
                                canvas.restore();
                                rnVar3.t0.drawChild(canvas, childAt2, uptimeMillis);
                                if (s1Var.T2()) {
                                    canvas.save();
                                    canvas.translate(s1Var.getX(), s1Var.getY());
                                    s1Var.W1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                                rnVar3.t0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.v0) childAt2).B(canvas);
                                canvas.restore();
                            } else {
                                rnVar3.t0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    rnVar3.t0.x1(canvas, rectF);
                    break;
                }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // kg.a
    public final void g(g.y yVar, RectF rectF) {
        switch (this.a) {
        }
        yVar.b = true;
    }
}
