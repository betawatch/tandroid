package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class sh0 extends org.telegram.ui.ActionBar.p2 {
    public final org.telegram.ui.Components.fa0 a;

    public sh0(long j10) {
        super(null);
        this.a = new org.telegram.ui.Components.fa0(this, this, getLayoutContainer(), j10);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new org.telegram.ui.Components.y51(this, 25));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.Components.fa0 fa0Var = this.a;
        kVar.setTitle(LocaleController.getString(fa0Var.a ? R.string.SubscribeRequests : R.string.MemberRequests));
        org.telegram.ui.ActionBar.w0 a2 = this.actionBar.n().a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new hb(this, 12);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setVisibility(8);
        org.telegram.ui.ActionBar.p2 p2Var = fa0Var.g;
        if (fa0Var.m == null) {
            FrameLayout frameLayout = new FrameLayout(p2Var.getParentActivity());
            fa0Var.m = frameLayout;
            frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.a7, p2Var.getResourceProvider()));
            org.telegram.ui.Components.u00 b10 = fa0Var.b();
            fa0Var.q = b10;
            fa0Var.m.addView(b10, -1, -1);
            org.telegram.ui.Components.zw0 c3 = fa0Var.c();
            fa0Var.o = c3;
            fa0Var.m.addView(c3, -1, -1);
            org.telegram.ui.Components.zw0 a10 = fa0Var.a();
            fa0Var.n = a10;
            fa0Var.m.addView(a10, k7.b6.c(-1.0f, -1));
            p2Var.getParentActivity();
            f2.i0 i0Var = new f2.i0();
            org.telegram.ui.Components.rl0 rl0Var = new org.telegram.ui.Components.rl0(p2Var.getParentActivity(), null);
            fa0Var.p = rl0Var;
            rl0Var.setAdapter(fa0Var.f);
            fa0Var.p.o1();
            fa0Var.p.setLayoutManager(i0Var);
            fa0Var.p.setOnItemClickListener(new dg.n(fa0Var, 5));
            fa0Var.p.setOnScrollListener(fa0Var.D);
            fa0Var.p.setSelectorDrawableColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i6, p2Var.getResourceProvider()));
            fa0Var.m.addView(fa0Var.p, -1, -1);
            f2.l lVar = new f2.l();
            lVar.n(350L);
            lVar.o(org.telegram.ui.Components.mr.h);
            lVar.C = false;
            lVar.m = false;
            fa0Var.p.setItemAnimator(lVar);
        }
        FrameLayout frameLayout2 = fa0Var.m;
        this.actionBar.A(fa0Var.p, false);
        fa0Var.e();
        this.fragmentView = frameLayout2;
        return frameLayout2;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onBackPressed(boolean z4) {
        jh.u uVar = this.a.s;
        if (uVar == null) {
            return true;
        }
        if (z4) {
            uVar.e(false);
        }
        return false;
    }
}
