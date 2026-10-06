package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class xh0 extends org.telegram.ui.ActionBar.n2 {
    public final org.telegram.ui.Components.qa0 a;

    public xh0(long j3) {
        super(null);
        this.a = new org.telegram.ui.Components.qa0(this, this, getLayoutContainer(), j3);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new u70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.qa0 qa0Var = this.a;
        kVar.setTitle(LocaleController.getString(qa0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 14);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.n2 n2Var = qa0Var.g;
        if (qa0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(n2Var.getParentActivity());
            qa0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.a7, n2Var.getResourceProvider()));
            org.telegram.ui.Components.w00 b10 = qa0Var.b();
            qa0Var.q = b10;
            qa0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.ux0 c10 = qa0Var.c();
            qa0Var.o = c10;
            qa0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.ux0 a10 = qa0Var.a();
            qa0Var.n = a10;
            qa0Var.m.addView(a10, w7.z5.c(-1.0f, -1));
            n2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.zl0 zl0Var = new org.telegram.ui.Components.zl0(n2Var.getParentActivity(), null);
            qa0Var.p = zl0Var;
            zl0Var.setAdapter(qa0Var.f);
            qa0Var.p.r1();
            qa0Var.p.setLayoutManager(c0Var);
            qa0Var.p.setOnItemClickListener(new ai.g(qa0Var, 19));
            qa0Var.p.setOnScrollListener(qa0Var.D);
            qa0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i6, n2Var.getResourceProvider()));
            qa0Var.m.addView(qa0Var.p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.tr.h);
            jVar.C = false;
            jVar.m = false;
            qa0Var.p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = qa0Var.m;
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        org.telegram.ui.Components.zl0 zl0Var2 = qa0Var.p;
        kVar2.getClass();
        kVar2.y(zl0Var2, org.telegram.ui.ActionBar.i6.a7, org.telegram.ui.ActionBar.i6.s8);
        qa0Var.e();
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
