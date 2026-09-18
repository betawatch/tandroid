package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class zx implements ah.k, org.telegram.ui.Components.ho0, org.telegram.ui.Components.nl0, ci.fc, org.telegram.ui.Components.a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ zx(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // ah.k
    public void U(ah.a aVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.d6;
                uy uyVar = this.b;
                aVar.a(uyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    dg1 dg1Var = (oxVar == null || !(oxVar.getFragment() instanceof dg1)) ? null : (dg1) uyVar.F3.getFragment();
                    if (dg1Var != null && dg1Var.getFragmentView() != null && !uyVar.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.j6.d6;
                uy uyVar2 = this.b;
                aVar.a(uyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar2 = uyVar2.F3;
                    dg1 dg1Var2 = (oxVar2 == null || !(oxVar2.getFragment() instanceof dg1)) ? null : (dg1) uyVar2.F3.getFragment();
                    if (dg1Var2 != null && dg1Var2.getFragmentView() != null && !uyVar2.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // ci.fc
    public ci.jc a(long j3) {
        lx lxVar = this.b.E0;
        return ci.jc.c(lxVar != null ? lxVar.e(j3) : null);
    }

    @Override // ci.fc
    public void b(long j3, ai.j jVar) {
        uy uyVar = this.b;
        if (uyVar.E0 == null) {
            jVar.run();
            return;
        }
        uyVar.x4(false, true);
        uyVar.Q = true;
        uyVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == uyVar.getUserConfig().getClientUserId()) {
            uyVar.E0.S.h1(0, 0);
        } else {
            uyVar.E0.k(j3);
        }
        uyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new fm(1, this, jVar));
    }

    @Override // org.telegram.ui.Components.nl0
    public boolean c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        uy uyVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.n0) {
                uyVar.N4(i6Var.getDialogId(), view);
                return true;
            }
        }
        ey eyVar = uyVar.C0;
        ai.w0 w0Var = eyVar.W;
        return uyVar.o4(view, i10, f7, eyVar.c0);
    }

    @Override // ah.k
    public void d(Canvas canvas) {
        fh.d dVar;
        fh.d dVar2;
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                int measuredWidth = uyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = uyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    dg1 dg1Var = (oxVar == null || !(oxVar.getFragment() instanceof dg1)) ? null : (dg1) uyVar.F3.getFragment();
                    if (dg1Var != null && dg1Var.getFragmentView() != null && !uyVar.j2 && (dVar = dg1Var.g1) != null) {
                        canvas.save();
                        canvas.translate(dg1Var.getFragmentView().getTranslationX(), dg1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    uyVar.k4.b(canvas, -3);
                    break;
                }
                break;
            default:
                uy uyVar2 = this.b;
                int measuredWidth2 = uyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = uyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(uyVar2.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar2 = uyVar2.F3;
                    dg1 dg1Var2 = (oxVar2 == null || !(oxVar2.getFragment() instanceof dg1)) ? null : (dg1) uyVar2.F3.getFragment();
                    if (dg1Var2 != null && dg1Var2.getFragmentView() != null && !uyVar2.j2 && (dVar2 = dg1Var2.h1) != null) {
                        canvas.save();
                        canvas.translate(dg1Var2.getFragmentView().getTranslationX(), dg1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    uyVar2.k4.b(canvas, -2);
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
        uy uyVar = this.b;
        if (uyVar.p3) {
            ey eyVar = uyVar.C0;
            if (eyVar != null) {
                eyVar.B0.remove(q0Var);
                ey eyVar2 = uyVar.C0;
                String obj = uyVar.j0.getSearchField().getText().toString();
                View currentView = eyVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(eyVar2.L0) ? true : !eyVar2.f0;
                eyVar2.L0 = obj;
                eyVar2.P(currentView, eyVar2.getCurrentPosition(), obj, z10);
            }
            uyVar.W4(true, null, null, false, true);
            uyVar.Y.a.q(uyVar.X.r);
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
