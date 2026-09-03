package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ux implements og.g, org.telegram.ui.Components.zn0, org.telegram.ui.Components.ll0, qh.r9, org.telegram.ui.Components.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ ux(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
    }

    @Override // og.g
    public void P(g.x xVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.k6.d6;
                py pyVar = this.b;
                xVar.a(pyVar.getThemedColor(i10));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar = pyVar.C3;
                    sf1 sf1Var = (kxVar == null || !(kxVar.getFragment() instanceof sf1)) ? null : (sf1) pyVar.C3.getFragment();
                    if (sf1Var != null && sf1Var.getFragmentView() != null && !pyVar.g2) {
                        xVar.b = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.k6.d6;
                py pyVar2 = this.b;
                xVar.a(pyVar2.getThemedColor(i11));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar2 = pyVar2.C3;
                    sf1 sf1Var2 = (kxVar2 == null || !(kxVar2.getFragment() instanceof sf1)) ? null : (sf1) pyVar2.C3.getFragment();
                    if (sf1Var2 != null && sf1Var2.getFragmentView() != null && !pyVar2.g2) {
                        xVar.b = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // qh.r9
    public qh.w9 a(long j10) {
        hx hxVar = this.b.B0;
        return qh.w9.c(hxVar != null ? hxVar.e(j10) : null);
    }

    @Override // qh.r9
    public void b(long j10, hg.y1 y1Var) {
        py pyVar = this.b;
        if (pyVar.B0 == null) {
            y1Var.run();
            return;
        }
        pyVar.x4(false, true);
        pyVar.N = true;
        pyVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == pyVar.getUserConfig().getClientUserId()) {
            pyVar.B0.P.h1(0, 0);
        } else {
            pyVar.B0.k(j10);
        }
        pyVar.b0[0].a.getViewTreeObserver().addOnPreDrawListener(new ih.f(2, this, y1Var));
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.h6;
        py pyVar = this.b;
        if (z4) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.k0) {
                pyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        yx yxVar = pyVar.z0;
        mh.d1 d1Var = yxVar.S;
        return pyVar.o4(view, i10, f10, yxVar.V);
    }

    public void d(uf.e0 e0Var) {
        py pyVar = this.b;
        if (pyVar.m3) {
            yx yxVar = pyVar.z0;
            if (yxVar != null) {
                yxVar.x0.remove(e0Var);
                yx yxVar2 = pyVar.z0;
                String obj = pyVar.g0.getSearchField().getText().toString();
                View currentView = yxVar2.getCurrentView();
                boolean z4 = TextUtils.isEmpty(yxVar2.H0) ? true : !yxVar2.b0;
                yxVar2.H0 = obj;
                yxVar2.O(currentView, yxVar2.getCurrentPosition(), obj, z4);
            }
            pyVar.W4(true, null, null, false, true);
            pyVar.V.a.q(pyVar.U.r);
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

    @Override // og.g
    public void i(Canvas canvas) {
        tg.d dVar;
        tg.d dVar2;
        switch (this.a) {
            case 0:
                py pyVar = this.b;
                int measuredWidth = pyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = pyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(pyVar.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar = pyVar.C3;
                    sf1 sf1Var = (kxVar == null || !(kxVar.getFragment() instanceof sf1)) ? null : (sf1) pyVar.C3.getFragment();
                    if (sf1Var != null && sf1Var.getFragmentView() != null && !pyVar.g2 && (dVar = sf1Var.d1) != null) {
                        canvas.save();
                        canvas.translate(sf1Var.getFragmentView().getTranslationX(), sf1Var.getFragmentView().getTranslationY());
                        dVar.I(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    pyVar.i4.b(canvas, -3);
                    break;
                }
                break;
            default:
                py pyVar2 = this.b;
                int measuredWidth2 = pyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = pyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(pyVar2.getThemedColor(org.telegram.ui.ActionBar.k6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar2 = pyVar2.C3;
                    sf1 sf1Var2 = (kxVar2 == null || !(kxVar2.getFragment() instanceof sf1)) ? null : (sf1) pyVar2.C3.getFragment();
                    if (sf1Var2 != null && sf1Var2.getFragmentView() != null && !pyVar2.g2 && (dVar2 = sf1Var2.e1) != null) {
                        canvas.save();
                        canvas.translate(sf1Var2.getFragmentView().getTranslationX(), sf1Var2.getFragmentView().getTranslationY());
                        dVar2.I(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    pyVar2.i4.b(canvas, -2);
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
