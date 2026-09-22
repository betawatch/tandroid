package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class zh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.ca0 a;

    public zh0(long j3) {
        super(null);
        this.a = new org.telegram.ui.Components.ca0(this, this, getLayoutContainer(), j3);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new v70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.ca0 ca0Var = this.a;
        kVar.setTitle(LocaleController.getString(ca0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = ca0Var.g;
        if (ca0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            ca0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.t00 b10 = ca0Var.b();
            ca0Var.q = b10;
            ca0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.yw0 c10 = ca0Var.c();
            ca0Var.o = c10;
            ca0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.yw0 a10 = ca0Var.a();
            ca0Var.n = a10;
            ca0Var.m.addView(a10, w7.x5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(n2Var.getParentActivity(), null);
            ca0Var.p = ll0Var;
            ll0Var.setAdapter(ca0Var.f);
            ca0Var.p.p1();
            ca0Var.p.setLayoutManager(c0Var);
            ca0Var.p.setOnItemClickListener(new ai.g(ca0Var, 19));
            ca0Var.p.setOnScrollListener(ca0Var.D);
            ca0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, n2Var.getResourceProvider()));
            ca0Var.m.addView(ca0Var.p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.qr.h);
            jVar.C = false;
            jVar.m = false;
            ca0Var.p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = ca0Var.m;
        this.actionBar.z(ca0Var.p, false);
        ca0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.n2
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
