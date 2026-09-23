package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class uh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.da0 a;

    public uh0(long j3) {
        super(null);
        this.a = new org.telegram.ui.Components.da0(this, this, getLayoutContainer(), j3);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new s70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.da0 da0Var = this.a;
        kVar.setTitle(LocaleController.getString(da0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = da0Var.g;
        if (da0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            da0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.u00 b10 = da0Var.b();
            da0Var.q = b10;
            da0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.xw0 c10 = da0Var.c();
            da0Var.o = c10;
            da0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.xw0 a10 = da0Var.a();
            da0Var.n = a10;
            da0Var.m.addView(a10, w7.x5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.ml0 ml0Var = new org.telegram.ui.Components.ml0(n2Var.getParentActivity(), null);
            da0Var.p = ml0Var;
            ml0Var.setAdapter(da0Var.f);
            da0Var.p.p1();
            da0Var.p.setLayoutManager(c0Var);
            da0Var.p.setOnItemClickListener(new ai.g(da0Var, 19));
            da0Var.p.setOnScrollListener(da0Var.D);
            da0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, n2Var.getResourceProvider()));
            da0Var.m.addView(da0Var.p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.rr.h);
            jVar.C = false;
            jVar.m = false;
            da0Var.p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = da0Var.m;
        this.actionBar.z(da0Var.p, false);
        da0Var.e();
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
