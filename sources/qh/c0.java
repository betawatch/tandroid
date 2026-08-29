package qh;

import android.content.Context;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class c0 extends f0 {
    public final /* synthetic */ i0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(i0 i0Var, Context context) {
        super(i0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        this.h = i0Var;
        AndroidUtilities.removeFromParent(this.b);
        i10 = ((f3) i0Var).currentAccount;
        r rVar = new r(i0Var, 3);
        s sVar = new s(i0Var, 2);
        c6Var = ((f3) i0Var).resourcesProvider;
        u51 u51Var = new u51(context, i10, 0, false, rVar, sVar, null, c6Var);
        this.d = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.d;
        u51Var2.U2.r = false;
        u51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.c.addView(i0Var.C, f6.g());
        this.c.addView(this.d, 0, f6.c(-1.0f, -1));
        this.c.addView(i0Var.E, f6.g());
        c6Var2 = ((f3) i0Var).resourcesProvider;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, c6Var2);
        this.a = lVar;
        lVar.setOccupyStatusBar(false);
        this.a.setTitleColor(i0Var.getThemedColor(g6.G6));
        this.a.B(i0Var.getThemedColor(g6.z8), false);
        org.telegram.ui.ActionBar.l lVar2 = this.a;
        boolean z10 = i0Var.J;
        lVar2.setBackButtonImage(z10 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
        this.a.C(i0Var.getThemedColor(g6.y8), false);
        this.a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new e(this, 3));
        this.c.addView(this.a, f6.e(-1, 56, 48));
        this.c.addView(i0Var.A, f6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.a0 n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        c6Var3 = ((f3) i0Var).resourcesProvider;
        nh.d dVar = new nh.d(context2, c6Var3, true);
        i0Var.r = dVar;
        dVar.e();
        i0Var.r.setText(LocaleController.getString(R.string.OK));
        i0Var.r.setOnClickListener(new mh.n(this, 17));
        if (z10) {
            i0Var.r.setVisibility(8);
        }
        this.c.addView(i0Var.r, f6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // qh.f0
    public final float b() {
        return jf.l0.b(this.h.c.e) * super.b();
    }

    @Override // qh.f0
    public final void c() {
        super.c();
        this.h.A.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
