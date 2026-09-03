package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class vx implements ng.g, org.telegram.ui.Components.yn0, org.telegram.ui.Components.kl0, ph.u9, org.telegram.ui.Components.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ vx(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // ng.g
    public void D(Canvas canvas) {
        sg.d dVar;
        sg.d dVar2;
        switch (this.a) {
            case 0:
                qy qyVar = this.b;
                int measuredWidth = qyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = qyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar = qyVar.C3;
                    sf1 sf1Var = (lxVar == null || !(lxVar.getFragment() instanceof sf1)) ? null : (sf1) qyVar.C3.getFragment();
                    if (sf1Var != null && sf1Var.getFragmentView() != null && !qyVar.g2 && (dVar = sf1Var.d1) != null) {
                        canvas.save();
                        canvas.translate(sf1Var.getFragmentView().getTranslationX(), sf1Var.getFragmentView().getTranslationY());
                        dVar.H(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    qyVar.i4.b(canvas, -3);
                    break;
                }
                break;
            default:
                qy qyVar2 = this.b;
                int measuredWidth2 = qyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = qyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(qyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar2 = qyVar2.C3;
                    sf1 sf1Var2 = (lxVar2 == null || !(lxVar2.getFragment() instanceof sf1)) ? null : (sf1) qyVar2.C3.getFragment();
                    if (sf1Var2 != null && sf1Var2.getFragmentView() != null && !qyVar2.g2 && (dVar2 = sf1Var2.e1) != null) {
                        canvas.save();
                        canvas.translate(sf1Var2.getFragmentView().getTranslationX(), sf1Var2.getFragmentView().getTranslationY());
                        dVar2.H(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    qyVar2.i4.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // ng.g
    public void D1(g.x xVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.d6;
                qy qyVar = this.b;
                xVar.a(qyVar.getThemedColor(i10));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar = qyVar.C3;
                    sf1 sf1Var = (lxVar == null || !(lxVar.getFragment() instanceof sf1)) ? null : (sf1) qyVar.C3.getFragment();
                    if (sf1Var != null && sf1Var.getFragmentView() != null && !qyVar.g2) {
                        xVar.b = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.d6;
                qy qyVar2 = this.b;
                xVar.a(qyVar2.getThemedColor(i11));
                xVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar2 = qyVar2.C3;
                    sf1 sf1Var2 = (lxVar2 == null || !(lxVar2.getFragment() instanceof sf1)) ? null : (sf1) qyVar2.C3.getFragment();
                    if (sf1Var2 != null && sf1Var2.getFragmentView() != null && !qyVar2.g2) {
                        xVar.b = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // ph.u9
    public ph.y9 a(long j10) {
        ix ixVar = this.b.B0;
        return ph.y9.c(ixVar != null ? ixVar.e(j10) : null);
    }

    @Override // ph.u9
    public void b(long j10, gg.y1 y1Var) {
        qy qyVar = this.b;
        if (qyVar.B0 == null) {
            y1Var.run();
            return;
        }
        qyVar.x4(false, true);
        qyVar.N = true;
        qyVar.fragmentView.invalidate();
        if (j10 == 0 || j10 == qyVar.getUserConfig().getClientUserId()) {
            qyVar.B0.P.h1(0, 0);
        } else {
            qyVar.B0.k(j10);
        }
        qyVar.b0[0].a.getViewTreeObserver().addOnPreDrawListener(new hh.f(2, this, y1Var));
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean c(float f10, float f11, int i10, View view) {
        boolean z4 = view instanceof org.telegram.ui.Cells.g6;
        qy qyVar = this.b;
        if (z4) {
            org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
            if (g6Var.k0) {
                qyVar.N4(g6Var.getDialogId(), view);
                return true;
            }
        }
        zx zxVar = qyVar.z0;
        lh.e1 e1Var = zxVar.S;
        return qyVar.o4(view, i10, f10, zxVar.V);
    }

    public void d(tf.e0 e0Var) {
        qy qyVar = this.b;
        if (qyVar.m3) {
            zx zxVar = qyVar.z0;
            if (zxVar != null) {
                zxVar.x0.remove(e0Var);
                zx zxVar2 = qyVar.z0;
                String obj = qyVar.g0.getSearchField().getText().toString();
                View currentView = zxVar2.getCurrentView();
                boolean z4 = TextUtils.isEmpty(zxVar2.H0) ? true : !zxVar2.b0;
                zxVar2.H0 = obj;
                zxVar2.O(currentView, zxVar2.getCurrentPosition(), obj, z4);
            }
            qyVar.W4(true, null, null, false, true);
            qyVar.V.a.q(qyVar.U.r);
        }
    }

    @Override // org.telegram.ui.Components.yn0
    public void e(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f10);
        }
    }

    @Override // org.telegram.ui.Components.yn0
    public void f(org.telegram.ui.Cells.q2 q2Var) {
        this.b.H4(q2Var);
    }

    @Override // org.telegram.ui.Components.yn0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.kl0
    public void p(float f10) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f10);
        }
    }
}
