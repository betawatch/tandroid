package qh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u51;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class d0 extends f0 {
    public final t9 h;
    public final e9 n;
    public final /* synthetic */ i0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(i0 i0Var, Context context) {
        super(i0Var, context);
        int i10;
        c6 c6Var;
        c6 c6Var2;
        c6 c6Var3;
        this.r = i0Var;
        i10 = ((f3) i0Var).currentAccount;
        r rVar = new r(i0Var, 4);
        s sVar = new s(i0Var, 3);
        s sVar2 = new s(i0Var, 4);
        c6Var = ((f3) i0Var).resourcesProvider;
        u51 u51Var = new u51(context, i10, 0, false, rVar, sVar, sVar2, c6Var);
        this.d = u51Var;
        u51Var.p1();
        u51 u51Var2 = this.d;
        u51Var2.U2.r = false;
        u51Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.b);
        this.c.addView(i0Var.B, f6.g());
        this.c.addView(this.d, f6.g());
        this.c.addView(i0Var.D, f6.g());
        c6Var2 = ((f3) i0Var).resourcesProvider;
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, c6Var2);
        this.a = lVar;
        lVar.setOccupyStatusBar(false);
        this.a.setTitleColor(i0Var.getThemedColor(g6.G6));
        this.a.B(i0Var.getThemedColor(g6.z8), false);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        this.a.C(i0Var.getThemedColor(g6.y8), false);
        this.a.setTitle(DialogObject.getName(i0Var.f));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new e(this, 4));
        e9 e9Var = new e9(i0Var.f);
        this.n = e9Var;
        t9 t9Var = new t9(getContext());
        this.h = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        t9Var.e(i0Var.f, e9Var);
        this.a.addView(t9Var, f6.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, f6.e(-1, 56, 48));
        this.c.addView(i0Var.y, f6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.a0 n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(i0Var.f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        c6Var3 = ((f3) i0Var).resourcesProvider;
        nh.d dVar = new nh.d(context2, c6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(i0Var.f)) {
            iq iqVar = new iq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(iqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        i0Var.n = dVar;
        dVar.setOnClickListener(new mh.n(this, 18));
        this.c.addView(dVar, f6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // qh.f0
    public final float b() {
        return jf.l0.b(this.r.b.e) * super.b();
    }

    @Override // qh.f0
    public final void c() {
        super.c();
        this.r.y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
