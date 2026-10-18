package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import j$.util.Objects;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zf implements ch.a {
    public final /* synthetic */ int a;
    public final /* synthetic */ lm b;

    public /* synthetic */ zf(lm lmVar, int i10) {
        this.a = i10;
        this.b = lmVar;
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
                lm lmVar = this.b;
                sn snVar = lmVar.J0;
                sn snVar2 = snVar.da;
                lm lmVar2 = snVar2 != null ? snVar2.X0 : snVar.X0;
                float f7 = snVar.zc.e;
                int i10 = (int) ((1.0f - f7) * 255.0f);
                int i11 = (int) (255.0f * f7);
                if (f7 > 0.0f) {
                    canvas.drawColor(org.telegram.ui.ActionBar.h6.m1(f7 * 0.85f, snVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6)));
                }
                hh.d.b(new zf(lmVar, 1), canvas, rectF, snVar.x0, lmVar2, i10);
                ai.u1 u1Var = snVar.L3;
                if (u1Var != null) {
                    hh.d.b(u1Var, canvas, rectF, u1Var, lmVar2, i11);
                }
                ei.h1 h1Var = snVar.q1;
                if (h1Var != null && h1Var.getVisibility() == 0) {
                    int childCount = snVar.q1.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = snVar.q1.getChildAt(i12);
                        if ((childAt instanceof un) && childAt.getVisibility() == 0) {
                            un unVar = (un) childAt;
                            tn tnVar = unVar.a;
                            lm lmVar3 = tnVar.X0;
                            Objects.requireNonNull(lmVar3);
                            hh.d.a(new zf(lmVar3, 0), canvas, rectF, tnVar.X0, unVar);
                        }
                    }
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                sn snVar3 = this.b.J0;
                if (snVar3.x0.Z0()) {
                    snVar3.x0.f(canvas, rectF);
                    break;
                } else {
                    snVar3.x0.x1(canvas, rectF);
                    for (int i13 = 0; i13 < snVar3.x0.getChildCount(); i13++) {
                        View childAt2 = snVar3.x0.getChildAt(i13);
                        if (!sn.e2(snVar3, childAt2, rectF)) {
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
                                snVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                if (u1Var2.U2()) {
                                    canvas.save();
                                    canvas.translate(u1Var2.getX(), u1Var2.getY());
                                    u1Var2.X1(canvas);
                                    canvas.restore();
                                }
                            } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                                snVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                                canvas.save();
                                canvas.translate(childAt2.getX(), childAt2.getY());
                                ((org.telegram.ui.Cells.w0) childAt2).B(canvas);
                                canvas.restore();
                            } else {
                                snVar3.x0.drawChild(canvas, childAt2, uptimeMillis);
                            }
                        }
                    }
                    snVar3.x0.y1(canvas, rectF);
                    break;
                }
        }
    }
}
