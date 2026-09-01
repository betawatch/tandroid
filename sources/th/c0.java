package th;

import android.content.Context;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class c0 extends f0 {
    public final /* synthetic */ i0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(i0 i0Var, Context context) {
        super(i0Var, context);
        int i10;
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        this.h = i0Var;
        AndroidUtilities.removeFromParent(this.b);
        i10 = ((h3) i0Var).currentAccount;
        r rVar = new r(i0Var, 3);
        s sVar = new s(i0Var, 2);
        g6Var = ((h3) i0Var).resourcesProvider;
        i61 i61Var = new i61(context, i10, 0, false, rVar, sVar, null, g6Var);
        this.d = i61Var;
        i61Var.p1();
        i61 i61Var2 = this.d;
        i61Var2.V2.r = false;
        i61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        this.c.addView(i0Var.D, c6.g());
        this.c.addView(this.d, 0, c6.c(-1.0f, -1));
        this.c.addView(i0Var.F, c6.g());
        g6Var2 = ((h3) i0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, g6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setTitleColor(i0Var.getThemedColor(k6.G6));
        this.a.B(i0Var.getThemedColor(k6.z8), false);
        org.telegram.ui.ActionBar.k kVar2 = this.a;
        boolean z4 = i0Var.K;
        kVar2.setBackButtonImage(z4 ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
        this.a.C(i0Var.getThemedColor(k6.y8), false);
        this.a.setTitle(LocaleController.getString(R.string.CommunityAddAChatToCommunity));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new e(this, 3));
        this.c.addView(this.a, c6.e(-1, 56, 48));
        this.c.addView(i0Var.B, c6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        Context context2 = getContext();
        g6Var3 = ((h3) i0Var).resourcesProvider;
        qh.d dVar = new qh.d(context2, g6Var3, true);
        i0Var.r = dVar;
        dVar.e();
        i0Var.r.setText(LocaleController.getString(R.string.OK));
        i0Var.r.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 17));
        if (z4) {
            i0Var.r.setVisibility(8);
        }
        this.c.addView(i0Var.r, c6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // th.f0
    public final float b() {
        return lf.l0.b(this.h.c.e) * super.b();
    }

    @Override // th.f0
    public final void c() {
        super.c();
        this.h.B.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
