package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Point;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class wx implements ah.j, org.telegram.ui.Components.un0, org.telegram.ui.Components.dl0, ci.cc, org.telegram.ui.Components.b20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ wx(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
    }

    @Override // ci.cc
    public ci.gc a(long j3) {
        ix ixVar = this.b.E0;
        return ci.gc.c(ixVar != null ? ixVar.e(j3) : null);
    }

    @Override // ah.j
    public void b(Canvas canvas) {
        fh.d dVar;
        fh.d dVar2;
        switch (this.a) {
            case 0:
                ry ryVar = this.b;
                int measuredWidth = ryVar.fragmentView.getMeasuredWidth();
                int measuredHeight = ryVar.fragmentView.getMeasuredHeight();
                canvas.drawColor(ryVar.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar = ryVar.F3;
                    wf1 wf1Var = (lxVar == null || !(lxVar.getFragment() instanceof wf1)) ? null : (wf1) ryVar.F3.getFragment();
                    if (wf1Var != null && wf1Var.getFragmentView() != null && !ryVar.j2 && (dVar = wf1Var.g1) != null) {
                        canvas.save();
                        canvas.translate(wf1Var.getFragmentView().getTranslationX(), wf1Var.getFragmentView().getTranslationY());
                        dVar.y(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                        canvas.restore();
                    }
                    ryVar.k4.b(canvas, -3);
                    break;
                }
                break;
            default:
                ry ryVar2 = this.b;
                int measuredWidth2 = ryVar2.fragmentView.getMeasuredWidth();
                int measuredHeight2 = ryVar2.fragmentView.getMeasuredHeight();
                canvas.drawColor(ryVar2.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar2 = ryVar2.F3;
                    wf1 wf1Var2 = (lxVar2 == null || !(lxVar2.getFragment() instanceof wf1)) ? null : (wf1) ryVar2.F3.getFragment();
                    if (wf1Var2 != null && wf1Var2.getFragmentView() != null && !ryVar2.j2 && (dVar2 = wf1Var2.h1) != null) {
                        canvas.save();
                        canvas.translate(wf1Var2.getFragmentView().getTranslationX(), wf1Var2.getFragmentView().getTranslationY());
                        dVar2.y(canvas, 0.0f, 0.0f, measuredWidth2, measuredHeight2);
                        canvas.restore();
                    }
                    ryVar2.k4.b(canvas, -2);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public boolean c(float f7, float f10, int i10, View view) {
        boolean z10 = view instanceof org.telegram.ui.Cells.i6;
        ry ryVar = this.b;
        if (z10) {
            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
            if (i6Var.n0) {
                ryVar.N4(i6Var.getDialogId(), view);
                return true;
            }
        }
        ay ayVar = ryVar.C0;
        ai.w0 w0Var = ayVar.V;
        return ryVar.o4(view, i10, f7, ayVar.b0);
    }

    @Override // ci.cc
    public void d(long j3, ai.j jVar) {
        ry ryVar = this.b;
        if (ryVar.E0 == null) {
            jVar.run();
            return;
        }
        ryVar.x4(false, true);
        ryVar.Q = true;
        ryVar.fragmentView.invalidate();
        if (j3 == 0 || j3 == ryVar.getUserConfig().getClientUserId()) {
            ryVar.E0.S.h1(0, 0);
        } else {
            ryVar.E0.k(j3);
        }
        ryVar.e0[0].a.getViewTreeObserver().addOnPreDrawListener(new em(1, this, jVar));
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

    @Override // org.telegram.ui.Components.dl0
    public void g() {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.finishPreviewFragment();
        }
    }

    public void h(gg.q0 q0Var) {
        ry ryVar = this.b;
        if (ryVar.p3) {
            ay ayVar = ryVar.C0;
            if (ayVar != null) {
                ayVar.A0.remove(q0Var);
                ay ayVar2 = ryVar.C0;
                String obj = ryVar.j0.getSearchField().getText().toString();
                View currentView = ayVar2.getCurrentView();
                boolean z10 = TextUtils.isEmpty(ayVar2.K0) ? true : !ayVar2.e0;
                ayVar2.K0 = obj;
                ayVar2.O(currentView, ayVar2.getCurrentPosition(), obj, z10);
            }
            ryVar.W4(true, null, null, false, true);
            ryVar.Y.a.q(ryVar.X.r);
        }
    }

    @Override // ah.j
    public void m(ah.a aVar) {
        switch (this.a) {
            case 0:
                int i10 = org.telegram.ui.ActionBar.h6.d6;
                ry ryVar = this.b;
                aVar.a(ryVar.getThemedColor(i10));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar = ryVar.F3;
                    wf1 wf1Var = (lxVar == null || !(lxVar.getFragment() instanceof wf1)) ? null : (wf1) ryVar.F3.getFragment();
                    if (wf1Var != null && wf1Var.getFragmentView() != null && !ryVar.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
            default:
                int i11 = org.telegram.ui.ActionBar.h6.d6;
                ry ryVar2 = this.b;
                aVar.a(ryVar2.getThemedColor(i11));
                aVar.b(SharedConfig.chatBlurEnabled());
                if (SharedConfig.chatBlurEnabled()) {
                    lx lxVar2 = ryVar2.F3;
                    wf1 wf1Var2 = (lxVar2 == null || !(lxVar2.getFragment() instanceof wf1)) ? null : (wf1) ryVar2.F3.getFragment();
                    if (wf1Var2 != null && wf1Var2.getFragmentView() != null && !ryVar2.j2) {
                        aVar.a = true;
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.dl0
    public void q(float f7) {
        Point point = AndroidUtilities.displaySize;
        if (point.x > point.y) {
            this.b.movePreviewFragment(f7);
        }
    }
}
