package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class zx implements bh.h, org.telegram.ui.Components.un0, org.telegram.ui.Components.cl0, di.gc, org.telegram.ui.Components.a20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ zx(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    @Override // di.gc
    public di.kc a(long j3) {
        lx lxVar = this.b.E0;
        return di.kc.c(lxVar != null ? lxVar.e(j3) : null);
    }

    @Override // di.gc
    public void b(long j3, bi.g gVar) {
        uy uyVar = this.b;
        if (uyVar.E0 == null) {
            gVar.run();
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
        uyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new im(1, this, gVar));
    }

    public void c(hg.q0 q0Var) {
        uy uyVar = this.b;
        if (uyVar.p3) {
            ey eyVar = uyVar.C0;
            if (eyVar != null) {
                eyVar.A0.remove(q0Var);
                ey eyVar2 = uyVar.C0;
                String obj = uyVar.j0.getSearchField().getText().toString();
                View currentView = eyVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(eyVar2.K0) ? true : !eyVar2.e0;
                eyVar2.K0 = obj;
                eyVar2.O(currentView, eyVar2.getCurrentPosition(), obj, z10);
            }
            uyVar.W4(true, null, null, false, true);
            uyVar.Y.a.q(uyVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public boolean d(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.h6;
        uy uyVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
            if (h6Var.n0) {
                uyVar.N4(h6Var.getDialogId(), view);
                return true;
            }
        }
        ey eyVar = uyVar.C0;
        bi.o0 o0Var = eyVar.V;
        return uyVar.o4(view, i10, f7, eyVar.b0);
    }

    @Override // org.telegram.ui.Components.un0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.un0
    public void f(org.telegram.ui.Cells.r2 r2Var) {
        this.b.H4(r2Var);
    }

    @Override // org.telegram.ui.Components.un0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // bh.h
    public void k(Canvas canvas) {
        gh.d dVar;
        gh.d dVar2;
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                int measuredWidth = uyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = uyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(uyVar.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    eg1 eg1Var = (oxVar == null || !(oxVar.getFragment() instanceof eg1)) ? null : (eg1) uyVar.F3.getFragment();
                    if (eg1Var != null && eg1Var.getFragmentView() != null && !uyVar.j2 && (dVar = eg1Var.g1) != null) {
                        canvas.save();
                        canvas.translate(eg1Var.getFragmentView().getTranslationX(), eg1Var.getFragmentView().getTranslationY());
                        dVar.v(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    uyVar.l4.b(canvas, -3);
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
                    eg1 eg1Var2 = (oxVar2 == null || !(oxVar2.getFragment() instanceof eg1)) ? null : (eg1) uyVar2.F3.getFragment();
                    if (eg1Var2 != null && eg1Var2.getFragmentView() != null && !uyVar2.j2 && (dVar2 = eg1Var2.h1) != null) {
                        canvas.save();
                        canvas.translate(eg1Var2.getFragmentView().getTranslationX(), eg1Var2.getFragmentView().getTranslationY());
                        dVar2.v(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    uyVar2.l4.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // bh.h
    public void v(bh.a aVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.j6.d6;
                uy uyVar = this.b;
                aVar.a(uyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    ox oxVar = uyVar.F3;
                    eg1 eg1Var = (oxVar == null || !(oxVar.getFragment() instanceof eg1)) ? null : (eg1) uyVar.F3.getFragment();
                    if (eg1Var != null && eg1Var.getFragmentView() != null && !uyVar.j2) {
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
                    eg1 eg1Var2 = (oxVar2 == null || !(oxVar2.getFragment() instanceof eg1)) ? null : (eg1) uyVar2.F3.getFragment();
                    if (eg1Var2 != null && eg1Var2.getFragmentView() != null && !uyVar2.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
        }
    }
}
