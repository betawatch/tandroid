package sh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class d0 extends f0 {
    public final p9 h;
    public final z8 n;
    public final /* synthetic */ i0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(i0 i0Var, Context context) {
        super(i0Var, context);
        int i10;
        f6 f6Var;
        f6 f6Var2;
        f6 f6Var3;
        this.r = i0Var;
        i10 = ((g3) i0Var).currentAccount;
        r rVar = new r(i0Var, 4);
        s sVar = new s(i0Var, 3);
        s sVar2 = new s(i0Var, 4);
        f6Var = ((g3) i0Var).resourcesProvider;
        g61 g61Var = new g61(context, i10, 0, false, rVar, sVar, sVar2, f6Var);
        this.d = g61Var;
        g61Var.o1();
        g61 g61Var2 = this.d;
        g61Var2.V2.r = false;
        g61Var2.setClipToPadding(false);
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + AndroidUtilities.navigationBarHeight);
        AndroidUtilities.removeFromParent(this.b);
        this.c.addView(i0Var.C, b6.g());
        this.c.addView(this.d, b6.g());
        this.c.addView(i0Var.E, b6.g());
        f6Var2 = ((g3) i0Var).resourcesProvider;
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var2);
        this.a = kVar;
        kVar.setOccupyStatusBar(false);
        this.a.setTitleColor(i0Var.getThemedColor(j6.G6));
        this.a.B(i0Var.getThemedColor(j6.z8), false);
        this.a.setBackButtonImage(R.drawable.ic_ab_back);
        this.a.C(i0Var.getThemedColor(j6.y8), false);
        this.a.setTitle(DialogObject.getName(i0Var.f));
        this.a.getTitleTextView().setTranslationX(-AndroidUtilities.dp(18.0f));
        this.a.setActionBarMenuOnItemClick(new e(this, 4));
        z8 z8Var = new z8(i0Var.f);
        this.n = z8Var;
        p9 p9Var = new p9(getContext());
        this.h = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(9.0f));
        p9Var.e(i0Var.f, z8Var);
        this.a.addView(p9Var, b6.b(27.33f, 27.33f, 83, 14.33f, 0.0f, 0.0f, 14.33f));
        this.c.addView(this.a, b6.e(-1, 56, 48));
        this.c.addView(i0Var.y, b6.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
        org.telegram.ui.ActionBar.z n10 = this.a.n();
        n10.setGlassMode(true);
        n10.setTranslationX(-AndroidUtilities.dp(7.0f));
        n10.a(3, R.drawable.outline_header_search);
        if (ChatObject.hasAdminRights(i0Var.f)) {
            n10.a(2, R.drawable.msg_download_settings);
        }
        Context context2 = getContext();
        f6Var3 = ((g3) i0Var).resourcesProvider;
        ph.d dVar = new ph.d(context2, f6Var3, true);
        dVar.e();
        if (ChatObject.canAddChatToCommunity(i0Var.f)) {
            lq lqVar = new lq(R.drawable.filled_add_album, 0);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("+ ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityAddAChatToCommunity));
            spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
            dVar.setText(spannableStringBuilder);
        } else {
            dVar.setText(LocaleController.getString(R.string.OK));
        }
        i0Var.n = dVar;
        dVar.setOnClickListener(new oh.n(this, 18));
        this.c.addView(dVar, b6.f(48.0f, 80, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + AndroidUtilities.navigationBarHeight));
        a();
    }

    @Override // sh.f0
    public final float b() {
        return kf.m0.b(this.r.b.e) * super.b();
    }

    @Override // sh.f0
    public final void c() {
        super.c();
        this.r.y.setTranslationY(Math.max(AndroidUtilities.dp(8.0f) + AndroidUtilities.statusBarHeight, b() + AndroidUtilities.dp(4.0f)));
    }
}
