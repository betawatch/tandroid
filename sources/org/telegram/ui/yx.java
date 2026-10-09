package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class yx implements ah.j, org.telegram.ui.Components.zo0, org.telegram.ui.Components.hm0, ci.cc, org.telegram.ui.Components.r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ yx(ty tyVar, int i10) {
        this.a = i10;
        this.b = tyVar;
    }

    @Override // ah.j
    public void B0(ah.a aVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.i6.d6;
                ty tyVar = this.b;
                aVar.a(tyVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    nx nxVar = tyVar.F3;
                    fg1 fg1Var = (nxVar == null || !(nxVar.getFragment() instanceof fg1)) ? null : (fg1) tyVar.F3.getFragment();
                    if (fg1Var != null && fg1Var.getFragmentView() != null && !tyVar.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.i6.d6;
                ty tyVar2 = this.b;
                aVar.a(tyVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    nx nxVar2 = tyVar2.F3;
                    fg1 fg1Var2 = (nxVar2 == null || !(nxVar2.getFragment() instanceof fg1)) ? null : (fg1) tyVar2.F3.getFragment();
                    if (fg1Var2 != null && fg1Var2.getFragmentView() != null && !tyVar2.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // ci.cc
    public ci.gc a(long j3) {
        kx kxVar = this.b.E0;
        return ci.gc.c(kxVar != null ? kxVar.e(j3) : null);
    }

    @Override // ci.cc
    public void b(long j3, ai.j jVar) {
        ty tyVar = this.b;
        if (tyVar.E0 == null) {
            jVar.run();
            return;
        }
        tyVar.u4(false, true);
        tyVar.Q = true;
        tyVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == tyVar.getUserConfig().getClientUserId()) {
            tyVar.E0.S.h1(0, 0);
        } else {
            tyVar.E0.k(j3);
        }
        tyVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new gm(1, this, jVar));
    }

    @Override // org.telegram.ui.Components.hm0
    public boolean c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        ty tyVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.n0) {
                tyVar.K4(i6Var.getDialogId(), view);
                return true;
            }
        }
        dy dyVar = tyVar.C0;
        ai.w0 w0Var = dyVar.V;
        return tyVar.l4(view, i10, f7, dyVar.b0);
    }

    public void d(gg.p0 p0Var) {
        ty tyVar = this.b;
        if (tyVar.p3) {
            dy dyVar = tyVar.C0;
            if (dyVar != null) {
                dyVar.A0.remove(p0Var);
                dy dyVar2 = tyVar.C0;
                String obj = tyVar.j0.getSearchField().getText().toString();
                View currentView = dyVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(dyVar2.K0) ? true : !dyVar2.e0;
                dyVar2.K0 = obj;
                dyVar2.O(currentView, dyVar2.getCurrentPosition(), obj, z10);
            }
            tyVar.T4(true, null, null, false, true);
            tyVar.Y.a.q(tyVar.X.r);
        }
    }

    @Override // org.telegram.ui.Components.zo0
    public void e(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }

    @Override // org.telegram.ui.Components.zo0
    public void f(org.telegram.ui.Cells.s2 s2Var) {
        this.b.E4(s2Var);
    }

    @Override // org.telegram.ui.Components.zo0
    public void finish() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // org.telegram.ui.Components.hm0
    public void h() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    @Override // ah.j
    public void l(Canvas canvas) {
        fh.d dVar;
        fh.d dVar2;
        switch (this.a) {
            case 0:
                ty tyVar = this.b;
                int measuredWidth = tyVar.fragmentView.getMeasuredWidth();
                int measuredHeight = tyVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(tyVar.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    nx nxVar = tyVar.F3;
                    fg1 fg1Var = (nxVar == null || !(nxVar.getFragment() instanceof fg1)) ? null : (fg1) tyVar.F3.getFragment();
                    if (fg1Var != null && fg1Var.getFragmentView() != null && !tyVar.j2 && (dVar = fg1Var.g1) != null) {
                        canvas.save();
                        canvas.translate(fg1Var.getFragmentView().getTranslationX(), fg1Var.getFragmentView().getTranslationY());
                        dVar.v(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    tyVar.k4.b(canvas, -3);
                    break;
                }
                break;
            default:
                ty tyVar2 = this.b;
                int measuredWidth2 = tyVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = tyVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(tyVar2.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    nx nxVar2 = tyVar2.F3;
                    fg1 fg1Var2 = (nxVar2 == null || !(nxVar2.getFragment() instanceof fg1)) ? null : (fg1) tyVar2.F3.getFragment();
                    if (fg1Var2 != null && fg1Var2.getFragmentView() != null && !tyVar2.j2 && (dVar2 = fg1Var2.h1) != null) {
                        canvas.save();
                        canvas.translate(fg1Var2.getFragmentView().getTranslationX(), fg1Var2.getFragmentView().getTranslationY());
                        dVar2.v(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    tyVar2.k4.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.hm0
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }
}
