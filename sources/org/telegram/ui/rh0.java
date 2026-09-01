package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class rh0 extends org.telegram.ui.ActionBar.p2 {
    public final org.telegram.ui.Components.ga0 a;

    public rh0(long j10) {
        super(null);
        this.a = new org.telegram.ui.Components.ga0(this, this, getLayoutContainer(), j10);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.z51(this, 25));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ga0 ga0Var = this.a;
        kVar.setTitle(LocaleController.getString(ga0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new fb(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.p2 p2Var = ga0Var.g;
        if (ga0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(p2Var.getParentActivity());
            ga0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.a7, p2Var.getResourceProvider()));
            org.telegram.ui.Components.u00 b10 = ga0Var.b();
            ga0Var.q = b10;
            ga0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.ax0 c3 = ga0Var.c();
            ga0Var.o = c3;
            ga0Var.m.addView(c3, -1, -1);
            org.telegram.ui.Components.ax0 a10 = ga0Var.a();
            ga0Var.n = a10;
            ga0Var.m.addView(a10, k7.c6.c(-1.0f, -1));
            p2Var.getParentActivity();
            f2.j0 j0Var = new f2.j0();
            org.telegram.ui.Components.tl0 tl0Var = new org.telegram.ui.Components.tl0(p2Var.getParentActivity(), null);
            ga0Var.p = tl0Var;
            tl0Var.setAdapter(ga0Var.f);
            ga0Var.p.p1();
            ga0Var.p.setLayoutManager(j0Var);
            ga0Var.p.setOnItemClickListener(new ag.h(ga0Var, 6));
            ga0Var.p.setOnScrollListener(ga0Var.D);
            ga0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.i6, p2Var.getResourceProvider()));
            ga0Var.m.addView(ga0Var.p, -1, -1);
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.pr.h);
            lVar.C = false;
            lVar.m = false;
            ga0Var.p.setItemAnimator(lVar);
        }
        FrameLayout frameLayout2 = ga0Var.m;
        this.actionBar.A(ga0Var.p, false);
        ga0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        kh.u uVar = this.a.s;
        if (uVar == null) {
            return true;
        }
        if (z4) {
            uVar.e(false);
        }
        return false;
    }
}
