package pf;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import kh.b8;
import mh.m2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qd;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.o71;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class g0 extends sa {
    public static final int c0 = -1;
    public static final int d0 = -2;
    public final TL_account.TL_connectedBot T;
    public final TLRPC.User U;
    public final x V;
    public final LinearLayout W;
    public final kh.d X;
    public final kh.d Y;
    public z41 Z;
    public boolean a0;
    public Boolean b0;

    public g0(Activity activity, TL_account.TL_connectedBot tL_connectedBot, qd qdVar, b6 b6Var) {
        super(activity, null, false, false, false, 2, b6Var);
        this.T = tL_connectedBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
        this.U = user;
        this.G = AndroidUtilities.dp(36.0f);
        this.v = 0.15f;
        x xVar = new x(activity, this.currentAccount, new m2(this, 25), b6Var);
        this.V = xVar;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = tL_connectedBot.recipients;
        this.a0 = tL_businessBotRecipients.exclude_selected;
        xVar.i(tL_businessBotRecipients);
        LinearLayout linearLayout = new LinearLayout(activity);
        this.W = linearLayout;
        linearLayout.setOrientation(1);
        z8 z8Var = new z8((b6) null);
        o9 o9Var = new o9(activity);
        o9Var.setRoundRadius(AndroidUtilities.dp(40.0f));
        z8Var.r(user);
        o9Var.e(user, z8Var);
        linearLayout.addView(o9Var, e6.t(80, 80, 1, 0, 0, 0, 0));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(getThemedColor(f6.G6));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(UserObject.getUserName(user));
        linearLayout.addView(textView, e6.r(-1, -2, 1, 32.0f, 15.66f, 32.0f, 3.66f));
        this.e.setTitle(UserObject.getUserName(user));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(getThemedColor(f6.y6));
        textView2.setGravity(17);
        textView2.setText(LocaleController.getString(R.string.SessionBot));
        linearLayout.addView(textView2, e6.r(-1, -2, 1, 32.0f, 0.0f, 32.0f, 3.66f));
        String publicUsername = UserObject.getPublicUsername(user);
        if (!TextUtils.isEmpty(publicUsername)) {
            TextView textView3 = new TextView(activity);
            textView3.setTextSize(1, 14.0f);
            textView3.setTextColor(getThemedColor(f6.gc));
            textView3.setText("@" + publicUsername);
            textView3.setGravity(17);
            linearLayout.addView(textView3, e6.t(-1, -2, 1, 32, 0, 32, 18));
        }
        int i9 = f6.a7;
        setBackgroundColor(getThemedColor(i9));
        fixNavigationBar(getThemedColor(i9));
        wk0 wk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i10, 0, i10, AndroidUtilities.dp(72.0f));
        this.d.p1();
        this.d.setOnItemClickListener(new eh.j(this, 18));
        FrameLayout frameLayout = new FrameLayout(activity);
        frameLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{f6.l1(0.0f, getThemedColor(i9)), getThemedColor(i9), getThemedColor(i9)}));
        kh.d dVar = new kh.d(activity, b6Var, true);
        dVar.setRoundRadius(24);
        this.X = dVar;
        dVar.setColor(getThemedColor(f6.wj));
        dVar.setText(LocaleController.getString(R.string.TerminateSession));
        dVar.setOnClickListener(new gd0(this, tL_connectedBot, qdVar, 5));
        frameLayout.addView(dVar, e6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        kh.d dVar2 = new kh.d(activity, b6Var, true);
        dVar2.setRoundRadius(24);
        this.Y = dVar2;
        dVar2.setText(LocaleController.getString(R.string.BusinessBotUpdate));
        dVar2.setOnClickListener(new v(1, this, tL_connectedBot));
        frameLayout.addView(dVar2, e6.d(-1, 48.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        S(false);
        FrameLayout.LayoutParams e10 = e6.e(-1, -2, 80);
        int i11 = e10.leftMargin;
        int i12 = this.backgroundPaddingLeft;
        e10.leftMargin = i11 + i12;
        e10.rightMargin += i12;
        this.containerView.addView(frameLayout, e10);
        f2.n nVar = new f2.n();
        nVar.m = false;
        nVar.C = false;
        nVar.o(gr.h);
        nVar.n(350L);
        this.d.setItemAnimator(nVar);
        z41 z41Var = this.Z;
        if (z41Var != null) {
            z41Var.N(false);
        }
    }

    public static void O(g0 g0Var, TL_account.TL_connectedBot tL_connectedBot, TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        g.a(g0Var.currentAccount).b();
        g0Var.dismiss();
        tL_connectedBot.recipients = tL_businessBotRecipients;
        o2 U = LaunchActivity.U();
        if (U != null) {
            j2.q(R.string.BusinessBotUpdated, new Object[]{UserObject.getUserName(g0Var.U)}, oc.a0(U), R.raw.contact_check, 36);
        }
    }

    public static void P(g0 g0Var, TL_account.TL_connectedBot tL_connectedBot) {
        x xVar = g0Var.V;
        kh.d dVar = g0Var.Y;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.bot = MessagesController.getInstance(g0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = xVar.b();
        ConnectionsManager.getInstance(g0Var.currentAccount).sendRequest(updateconnectedbot, new bg.b0(g0Var, tL_connectedBot, xVar.c(), 26));
    }

    public static /* synthetic */ void Q(g0 g0Var, qd qdVar) {
        g.a(g0Var.currentAccount).b();
        qdVar.run();
        g0Var.dismiss();
    }

    public static void R(g0 g0Var, TL_account.TL_connectedBot tL_connectedBot, qd qdVar) {
        kh.d dVar = g0Var.X;
        if (dVar.J) {
            return;
        }
        dVar.setLoading(true);
        TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
        updateconnectedbot.deleted = true;
        updateconnectedbot.bot = MessagesController.getInstance(g0Var.currentAccount).getInputUser(tL_connectedBot.bot_id);
        updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
        ConnectionsManager.getInstance(g0Var.currentAccount).sendRequest(updateconnectedbot, new o71(9, g0Var, qdVar));
    }

    @Override // org.telegram.ui.Components.sa
    public final void A(float f10) {
        h5 titleTextView = this.e.getTitleTextView();
        if (titleTextView != null) {
            titleTextView.setAlpha(f10);
        }
    }

    public final void S(boolean z10) {
        x xVar = this.V;
        final boolean z11 = xVar != null && xVar.g();
        Boolean bool = this.b0;
        if (bool == null || bool.booleanValue() != z11) {
            this.b0 = Boolean.valueOf(z11);
            kh.d dVar = this.X;
            kh.d dVar2 = this.Y;
            if (z10) {
                dVar2.setVisibility(0);
                ViewPropertyAnimator duration = dVar2.animate().alpha(z11 ? 1.0f : 0.0f).scaleX(z11 ? 1.0f : 0.8f).scaleY(z11 ? 1.0f : 0.8f).setDuration(320L);
                gr grVar = gr.h;
                final int i9 = 0;
                duration.setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: pf.f0
                    public final /* synthetic */ g0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                boolean z12 = z11;
                                g0 g0Var = this.b;
                                if (!z12) {
                                    g0Var.Y.setVisibility(8);
                                    break;
                                } else {
                                    g0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                g0 g0Var2 = this.b;
                                if (!z13) {
                                    g0Var2.getClass();
                                    break;
                                } else {
                                    g0Var2.X.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                dVar.setVisibility(0);
                final int i10 = 1;
                dVar.animate().alpha(z11 ? 0.0f : 1.0f).scaleX(!z11 ? 1.0f : 0.8f).scaleY(z11 ? 0.8f : 1.0f).setDuration(320L).setInterpolator(grVar).withEndAction(new Runnable(this) { // from class: pf.f0
                    public final /* synthetic */ g0 b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z12 = z11;
                                g0 g0Var = this.b;
                                if (!z12) {
                                    g0Var.Y.setVisibility(8);
                                    break;
                                } else {
                                    g0Var.getClass();
                                    break;
                                }
                            default:
                                boolean z13 = z11;
                                g0 g0Var2 = this.b;
                                if (!z13) {
                                    g0Var2.getClass();
                                    break;
                                } else {
                                    g0Var2.X.setVisibility(8);
                                    break;
                                }
                        }
                    }
                }).start();
                return;
            }
            dVar2.setVisibility(z11 ? 0 : 8);
            dVar2.animate().cancel();
            dVar2.setAlpha(z11 ? 1.0f : 0.0f);
            dVar2.setScaleX(z11 ? 1.0f : 0.8f);
            dVar2.setScaleY(z11 ? 1.0f : 0.8f);
            dVar.setVisibility(z11 ? 8 : 0);
            dVar.animate().cancel();
            dVar.setAlpha(z11 ? 0.0f : 1.0f);
            dVar.setScaleX(!z11 ? 1.0f : 0.8f);
            dVar.setScaleY(z11 ? 0.8f : 1.0f);
        }
    }

    @Override // org.telegram.ui.Components.sa, org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        x xVar = this.V;
        if (xVar != null) {
            xVar.g();
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithTouchOutside() {
        x xVar = this.V;
        if (xVar == null || !xVar.g()) {
            return super.canDismissWithTouchOutside();
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.currentAccount, 0, true, new b8(this, 17), this.resourcesProvider);
        this.Z = z41Var;
        z41Var.r = false;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return null;
    }
}
