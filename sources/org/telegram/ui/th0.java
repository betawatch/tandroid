package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class th0 extends org.telegram.ui.ActionBar.m2 {
    public final org.telegram.ui.Components.oa0 a;

    public th0(long j3) {
        super(null);
        this.a = new org.telegram.ui.Components.oa0(this, this, getLayoutContainer(), j3);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.oa0 oa0Var = this.a;
        kVar.setTitle(LocaleController.getString(oa0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.m2 m2Var = oa0Var.g;
        if (oa0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            oa0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.a7, m2Var.getResourceProvider()));
            org.telegram.ui.Components.u00 b10 = oa0Var.b();
            oa0Var.q = b10;
            oa0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.ix0 c10 = oa0Var.c();
            oa0Var.o = c10;
            oa0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.ix0 a10 = oa0Var.a();
            oa0Var.n = a10;
            oa0Var.m.addView(a10, w7.y5.c(-1.0f, -1));
            m2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(m2Var.getParentActivity(), null);
            oa0Var.p = wl0Var;
            wl0Var.setAdapter(oa0Var.f);
            oa0Var.p.p1();
            oa0Var.p.setLayoutManager(c0Var);
            oa0Var.p.setOnItemClickListener(new ai.g(oa0Var, 19));
            oa0Var.p.setOnScrollListener(oa0Var.D);
            oa0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, m2Var.getResourceProvider()));
            oa0Var.m.addView(oa0Var.p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.rr.h);
            jVar.C = false;
            jVar.m = false;
            oa0Var.p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = oa0Var.m;
        this.actionBar.z(oa0Var.p, false);
        oa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onBackPressed(boolean z10) {
        wh.m mVar = this.a.s;
        if (mVar == null) {
            return true;
        }
        if (z10) {
            mVar.e(false);
        }
        return false;
    }
}
