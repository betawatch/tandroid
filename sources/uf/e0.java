package uf;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ii1;
import org.telegram.ui.yh;
import ph.d4;
import ph.ga;
import ph.t8;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class e0 extends sa {
    public static final int d0 = -1;
    public static final int e0 = -2;
    public final TL_account.TL_connectedBot U;
    public final TLRPC.User V;
    public final v W;
    public final LinearLayout X;
    public final ph.d Y;
    public final ph.d Z;
    public w51 a0;
    public boolean b0;
    public Boolean c0;

    public e0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, hm hmVar, f6 f6Var) {
        super(activity, null, false, false, false, 2, f6Var);
        this.U = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.V = user;
        this.H = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        v vVar = new v(activity, this.currentAccount, new ga(this, 18), f6Var);
        this.W = vVar;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.b0 = tL_businessBotRecipients.exclude_selected;
        vVar.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
        z8 z8Var = new z8((f6) null);
        p9 p9Var = new p9(activity);
        p9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        z8Var.r(user);
        p9Var.e(user, z8Var);
        linearLayout.addView(p9Var, b6.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(j6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, b6.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(j6.y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, b6.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(j6.gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, b6.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i10 = j6.a7;
        setBackgroundColor(getThemedColor(i10));
        fixNavigationBar(getThemedColor(i10));
        sl0 sl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(72.0f));
        this.d.p1();
        this.d.setOnItemClickListener(new dg.n(this, 22));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{j6.l1(0.0f, getThemedColor(i10)), getThemedColor(i10), getThemedColor(i10)}));
        ph.d dVar = new ph.d(activity, f6Var, true);
        dVar.setRoundRadius(24);
        this.Y = dVar;
        dVar.setColor(getThemedColor(j6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new q31(this, tL_connectedBot, hmVar, 6));
        frameLayout.addView(dVar, b6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        ph.d dVar2 = new ph.d(activity, f6Var, true);
        dVar2.setRoundRadius(24);
        this.Z = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new t8(5, this, tL_connectedBot));
        frameLayout.addView(dVar2, b6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        T(false);
        FrameLayout.LayoutParams e = b6.e(-1, -2, 80);
        int i12 = e.leftMargin;
        int i13 = this.backgroundPaddingLeft;
        e.leftMargin = i12 + i13;
        e.rightMargin += i13;
        this.containerView.addView(frameLayout, e);
        f2.l lVar = new f2.l();
        lVar.m = false;
        lVar.C = false;
        lVar.o(nr.h);
        lVar.n(350L);
        this.d.setItemAnimator(lVar);
        w51 w51Var = this.a0;
        if (w51Var != null) {
            w51Var.N(false);
        }
    }

    public static void P(e0 e0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        f.a(e0Var.currentAccount).b();
        e0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        p2 U = LaunchActivity.U();
        if (U != null) {
            yh.s(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(e0Var.V)}, qc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void Q(e0 e0Var, TL_account.TL_connectedBot tL_connectedBot) {
        v vVar = e0Var.W;
        ph.d dVar = e0Var.Z;
        if (dVar.K) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(e0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = vVar.b();
        ConnectionsManager.getInstance(e0Var.currentAccount).sendRequest(updateconnectedbot, new gg.y(e0Var, tL_connectedBot, vVar.c(), 26));
    }

    public static /* synthetic */ void R(e0 e0Var, hm hmVar) {
        f.a(e0Var.currentAccount).b();
        hmVar.run();
        e0Var.dismiss();
    }

    public static void S(e0 e0Var, TL_account.TL_connectedBot tL_connectedBot, hm hmVar) {
        ph.d dVar = e0Var.Y;
        if (dVar.K) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(e0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(e0Var.currentAccount).sendRequest(updateconnectedbot, new ii1(10, e0Var, hmVar));
    }

    @Override // org.telegram.ui.Components.sa
    public final void B(float f10) {
        k5 titleTextView = this.e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void T(boolean z4) {
        v vVar = this.W;
        final boolean z10 = vVar != null && vVar.g();
        Boolean bool = this.c0;
        if (bool == null || bool.booleanValue() != z10) {
            this.c0 = Boolean.valueOf(z10);
            ph.d dVar = this.Y;
            ph.d dVar2 = this.Z;
            if (z4) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.8f).scaleY(z10 ? 1.0f : 0.8f).setDuration(320L);
                nr nrVar = nr.h;
                final int i10 = 0;
                duration.setInterpolator(nrVar).withEndAction(new Runnable(this) { // from class: uf.d0
                    public final /* synthetic */ e0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z11 = z10;
                                e0 e0Var = this.b;
                                if (!z11) {
                                    e0Var.Z.setVisibility(8);
                                    break;
                                } else {
                                    e0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z12 = z10;
                                e0 e0Var2 = this.b;
                                if (!z12) {
                                    e0Var2.getClass();
                                    break;
                                } else {
                                    e0Var2.Y.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i11 = 1;
                dVar.animate().alpha(z10 ? 0.0f : 1.0f).scaleX(!z10 ? 1.0f : 0.8f).scaleY(z10 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(nrVar).withEndAction(new Runnable(this) { // from class: uf.d0
                    public final /* synthetic */ e0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z11 = z10;
                                e0 e0Var = this.b;
                                if (!z11) {
                                    e0Var.Z.setVisibility(8);
                                    break;
                                } else {
                                    e0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z12 = z10;
                                e0 e0Var2 = this.b;
                                if (!z12) {
                                    e0Var2.getClass();
                                    break;
                                } else {
                                    e0Var2.Y.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                return;
            }
            dVar2.setVisibility(z10 ? 0 : 8);
            dVar2.animate().cancel();
            dVar2.setAlpha(z10 ? 1.0f : 0.0f);
            dVar2.setScaleX(z10 ? 1.0f : 0.8f);
            dVar2.setScaleY(z10 ? 1.0f : 0.8f);
            dVar.setVisibility(z10 ? 8 : 0);
            dVar.animate().cancel();
            dVar.setAlpha(z10 ? 0.0f : 1.0f);
            dVar.setScaleX(!z10 ? 1.0f : 0.8f);
            dVar.setScaleY(z10 ? 0.8f : 1.0f);
        }
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithSwipe() {
        v vVar = this.W;
        if (vVar != null) {
            vVar.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final boolean canDismissWithTouchOutside() {
        v vVar = this.W;
        if (vVar == null || !vVar.g()) {
            return super.canDismissWithTouchOutside();
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sa
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(sl0Var, getContext(), this.currentAccount, 0, true, new d4(this, 18), this.resourcesProvider);
        this.a0 = w51Var;
        w51Var.r = false;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return null;
    }
}
