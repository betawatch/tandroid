package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class tx implements ng.g, org.telegram.ui.Components.zn0, org.telegram.ui.Components.ll0, ph.u9, org.telegram.ui.Components.b20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;

    public /* synthetic */ tx(oy oyVar, int i10) {
        this.a = i10;
        this.b = oyVar;
    }

    @Override // ng.g
    public void Y(g.x xVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.d6;
                oy oyVar = this.b;
                xVar.a(oyVar.getThemedColor(i10));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    jx jxVar = oyVar.C3;
                    kf1 kf1Var = (jxVar == null || !(jxVar.getFragment() instanceof kf1)) ? null : (kf1) oyVar.C3.getFragment();
                    if (kf1Var != null && kf1Var.getFragmentView() != null && !oyVar.g2) {
                        xVar.b = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.d6;
                oy oyVar2 = this.b;
                xVar.a(oyVar2.getThemedColor(i11));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    jx jxVar2 = oyVar2.C3;
                    kf1 kf1Var2 = (jxVar2 == null || !(jxVar2.getFragment() instanceof kf1)) ? null : (kf1) oyVar2.C3.getFragment();
                    if (kf1Var2 != null && kf1Var2.getFragmentView() != null && !oyVar2.g2) {
                        xVar.b = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // ph.u9
    public ph.y9 a(long j10) {
        gx gxVar = this.b.B0;
        return ph.y9.c(gxVar != null ? gxVar.e(j10) : null);
    }

    @Override // ph.u9
    public void b(long j10, gg.y1 y1Var) {
        oy oyVar = this.b;
        if (oyVar.B0 == null) {
            y1Var.run();
            return;
        }
        oyVar.x4(false, true);
        oyVar.N = true;
        oyVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == oyVar.getUserConfig().getClientUserId()) {
            oyVar.B0.P.h1(0, 0);
        } else {
            oyVar.B0.k(j10);
        }
        oyVar.b0[0].a.getViewTreeObserver().addOnPreDrawListener(new hh.f(2, this, y1Var));
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.h6;
        oy oyVar = this.b;
        if (z4) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.k0) {
                oyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        xx xxVar = oyVar.z0;
        lh.e1 e1Var = xxVar.S;
        return oyVar.o4(view, i10, f10, xxVar.V);
    }

    public void d(tf.e0 e0Var) {
        oy oyVar = this.b;
        if (oyVar.m3) {
            xx xxVar = oyVar.z0;
            if (xxVar != null) {
                xxVar.x0.remove(e0Var);
                xx xxVar2 = oyVar.z0;
                String obj = oyVar.g0.getSearchField().getText().toString();
                View currentView = xxVar2.getCurrentView();
                boolean z4 = TextUtils.isEmpty(xxVar2.H0) ? true : !xxVar2.b0;
                xxVar2.H0 = obj;
                xxVar2.O(currentView, xxVar2.getCurrentPosition(), obj, z4);
            }
            oyVar.W4(true, null, null, false, true);
            oyVar.V.a.q(oyVar.U.r);
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.b.H4(r2Var);
    }

    @Override // org.telegram.ui.Components.zn0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // ng.g
    public void k(Canvas canvas) {
        sg.d dVar;
        sg.d dVar2;
        switch (this.a) {
            case 0:
                oy oyVar = this.b;
                int measuredWidth = oyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = oyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(oyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    jx jxVar = oyVar.C3;
                    kf1 kf1Var = (jxVar == null || !(jxVar.getFragment() instanceof kf1)) ? null : (kf1) oyVar.C3.getFragment();
                    if (kf1Var != null && kf1Var.getFragmentView() != null && !oyVar.g2 && (dVar = kf1Var.d1) != null) {
                        canvas.save();
                        canvas.translate(kf1Var.getFragmentView().getTranslationX(), kf1Var.getFragmentView().getTranslationY());
                        dVar.X(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    oyVar.i4.b(canvas, -3);
                    break;
                }
                break;
            default:
                oy oyVar2 = this.b;
                int measuredWidth2 = oyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = oyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(oyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    jx jxVar2 = oyVar2.C3;
                    kf1 kf1Var2 = (jxVar2 == null || !(jxVar2.getFragment() instanceof kf1)) ? null : (kf1) oyVar2.C3.getFragment();
                    if (kf1Var2 != null && kf1Var2.getFragmentView() != null && !oyVar2.g2 && (dVar2 = kf1Var2.e1) != null) {
                        canvas.save();
                        canvas.translate(kf1Var2.getFragmentView().getTranslationX(), kf1Var2.getFragmentView().getTranslationY());
                        dVar2.X(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    oyVar2.i4.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ll0
    public void p(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f10);
        }
    }
}
