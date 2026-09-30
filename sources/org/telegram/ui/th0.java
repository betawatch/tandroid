package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class th0 extends org.telegram.ui.ActionBar.m2 {
    public final org.telegram.ui.Components.qa0 a;

    public th0(long j3) {
        super(null);
        this.a = new org.telegram.ui.Components.qa0(this, this, getLayoutContainer(), j3);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 8));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.qa0 qa0Var = this.a;
        kVar.setTitle(LocaleController.getString(qa0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 13);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.m2 m2Var = qa0Var.g;
        if (qa0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(m2Var.getParentActivity());
            qa0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.a7, m2Var.getResourceProvider()));
            org.telegram.ui.Components.v00 b10 = qa0Var.b();
            qa0Var.q = b10;
            qa0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.kx0 c10 = qa0Var.c();
            qa0Var.o = c10;
            qa0Var.m.addView(c10, -1, -1);
            org.telegram.ui.Components.kx0 a10 = qa0Var.a();
            qa0Var.n = a10;
            qa0Var.m.addView(a10, w7.y5.c(-1.0f, -1));
            m2Var.getParentActivity();
            s4.c0 c0Var = new s4.c0();
            org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(m2Var.getParentActivity(), null);
            qa0Var.p = yl0Var;
            yl0Var.setAdapter(qa0Var.f);
            qa0Var.p.p1();
            qa0Var.p.setLayoutManager(c0Var);
            qa0Var.p.setOnItemClickListener(new ai.g(qa0Var, 19));
            qa0Var.p.setOnScrollListener(qa0Var.D);
            qa0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i6, m2Var.getResourceProvider()));
            qa0Var.m.addView(qa0Var.p, -1, -1);
            s4.j jVar = new s4.j();
            jVar.n(350L);
            jVar.o(org.telegram.ui.Components.sr.h);
            jVar.C = false;
            jVar.m = false;
            qa0Var.p.setItemAnimator(jVar);
        }
        FrameLayout frameLayout2 = qa0Var.m;
        this.actionBar.z(qa0Var.p, false);
        qa0Var.e();
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
