package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class vx implements ah.j, org.telegram.ui.Components.ho0, org.telegram.ui.Components.nl0, ci.cc, org.telegram.ui.Components.b20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ vx(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
    }

    @Override // ah.j
    public void U(ah.a aVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.h6.d6;
                qy qyVar = this.b;
                aVar.a(qyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar = qyVar.F3;
                    wf1 wf1Var = (kxVar == null || !(kxVar.getFragment() instanceof wf1)) ? null : (wf1) qyVar.F3.getFragment();
                    if (wf1Var != null && wf1Var.getFragmentView() != null && !qyVar.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.h6.d6;
                qy qyVar2 = this.b;
                aVar.a(qyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar2 = qyVar2.F3;
                    wf1 wf1Var2 = (kxVar2 == null || !(kxVar2.getFragment() instanceof wf1)) ? null : (wf1) qyVar2.F3.getFragment();
                    if (wf1Var2 != null && wf1Var2.getFragmentView() != null && !qyVar2.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // ci.cc
    public ci.gc a(long j3) {
        hx hxVar = this.b.E0;
        return ci.gc.c(hxVar != null ? hxVar.e(j3) : null);
    }

    @Override // ci.cc
    public void b(long j3, ai.j jVar) {
        qy qyVar = this.b;
        if (qyVar.E0 == null) {
            jVar.run();
            return;
        }
        qyVar.x4(false, true);
        qyVar.Q = true;
        qyVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == qyVar.getUserConfig().getClientUserId()) {
            qyVar.E0.S.h1(0, 0);
        } else {
            qyVar.E0.k(j3);
        }
        qyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new dm(1, this, jVar));
    }

    @Override // org.telegram.ui.Components.nl0
    public boolean c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        qy qyVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.n0) {
                qyVar.N4(i6Var.getDialogId(), view);
                return true;
            }
        }
        zx zxVar = qyVar.C0;
        ai.w0 w0Var = zxVar.V;
        return qyVar.o4(view, i10, f7, zxVar.b0);
    }

    @Override // ah.j
    public void d(Canvas canvas) {
        fh.d dVar;
        fh.d dVar2;
        switch (this.a) {
            case 0:
                qy qyVar = this.b;
                int measuredWidth = qyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = qyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(qyVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar = qyVar.F3;
                    wf1 wf1Var = (kxVar == null || !(kxVar.getFragment() instanceof wf1)) ? null : (wf1) qyVar.F3.getFragment();
                    if (wf1Var != null && wf1Var.getFragmentView() != null && !qyVar.j2 && (dVar = wf1Var.g1) != null) {
                        canvas.save();
                        canvas.translate(wf1Var.getFragmentView().getTranslationX(), wf1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    qyVar.k4.b(canvas, -3);
                    break;
                }
                break;
            default:
                qy qyVar2 = this.b;
                int measuredWidth2 = qyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = qyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(qyVar2.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    kx kxVar2 = qyVar2.F3;
                    wf1 wf1Var2 = (kxVar2 == null || !(kxVar2.getFragment() instanceof wf1)) ? null : (wf1) qyVar2.F3.getFragment();
                    if (wf1Var2 != null && wf1Var2.getFragmentView() != null && !qyVar2.j2 && (dVar2 = wf1Var2.h1) != null) {
                        canvas.save();
                        canvas.translate(wf1Var2.getFragmentView().getTranslationX(), wf1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    qyVar2.k4.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.ho0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.ho0
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.b.H4(s2Var);
    }

    @Override // org.telegram.ui.Components.ho0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    public void h(gg.q0 q0Var) {
        qy qyVar = this.b;
        if (qyVar.p3) {
            zx zxVar = qyVar.C0;
            if (zxVar != null) {
                zxVar.A0.remove(q0Var);
                zx zxVar2 = qyVar.C0;
                String obj = qyVar.j0.getSearchField().getText().toString();
                View currentView = zxVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(zxVar2.K0) ? true : !zxVar2.e0;
                zxVar2.K0 = obj;
                zxVar2.O(currentView, zxVar2.getCurrentPosition(), obj, z10);
            }
            qyVar.W4(true, null, null, false, true);
            qyVar.Y.a.q(qyVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.nl0
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }
}
