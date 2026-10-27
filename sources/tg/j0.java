package tg;

import a8.ee;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.cb;
import bi.v3;
import fi.f6;
import fi.sb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b20;
import org.telegram.ui.bd;
import org.telegram.ui.bh1;
import org.telegram.ui.ey;
import org.telegram.ui.oo;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public class j0 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int W0 = 0;
    public final ArrayList A0;
    public ArrayList B0;
    public ArrayList C0;
    public ArrayList D0;
    public z E0;
    public final TextView F0;
    public fi.d G0;
    public Runnable H0;
    public boolean I0;
    public rl0 J0;
    public final r2 K0;
    public b20 L0;
    public androidx.emoji2.text.p M0;
    public boolean N0;
    public TLRPC.Chat O0;
    public final z00 P0;
    public Runnable Q0;
    public int R0;
    public final fi.d S0;
    public int T0;
    public int U0;
    public String V0;
    public int X;
    public boolean Y;
    public int Z;
    public long a0;
    public TL_stories.TL_premium_boostsStatus b0;
    public ChannelBoostsController.CanApplyBoost c0;
    public i0 d0;
    public boolean e0;
    public boolean f0;
    public org.telegram.ui.Cells.s1 g0;
    public final int h0;
    public final ArrayList i0;
    public boolean j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;
    public int t0;
    public ArrayList u0;
    public boolean v0;
    public int w0;
    public h0 x0;
    public final HashSet y0;
    public final ArrayList z0;

    public j0(int i10, int i11, Context context, r2 r2Var, u6 u6Var) {
        super(context, r2Var, false, z1(i10), u6Var);
        this.Z = -1;
        this.f0 = false;
        this.i0 = new ArrayList();
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = -1;
        this.w0 = -1;
        this.y0 = new HashSet();
        this.z0 = new ArrayList();
        this.A0 = new ArrayList();
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.D0 = new ArrayList();
        this.I0 = false;
        this.R0 = 0;
        this.U0 = -4;
        fixNavigationBar(y6.w0(y6.h5, this.resourcesProvider));
        this.T0 = this.navBarColor;
        this.K0 = r2Var;
        this.currentAccount = i11;
        this.h0 = i10;
        N();
        Q1();
        if (i10 == 2) {
            this.I0 = true;
            Q1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new v(this, 0));
        } else if (i10 == 5) {
            this.I0 = true;
            Q1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new v(this, 2));
        }
        P1();
        if (i10 == 32 || A1()) {
            z00 z00Var = new z00(getContext());
            this.P0 = z00Var;
            this.container.addView(z00Var, kb1.g(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            b20 b20Var = this.L0;
            if (b20Var != null) {
                ((ViewGroup) b20Var.getParent()).removeView(this.L0);
            }
            this.d.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.F0 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(this.E0.getTextView().getText());
            f7.V(textView, y6.Sh, u6Var);
            textView.setOnClickListener(new u(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int i12 = y6.Oh;
            int w02 = y6.w0(i12, u6Var);
            int i13 = y6.d6;
            int o10 = i0.a.o(y6.w0(i13, u6Var), 120);
            org.telegram.ui.Cells.y j02 = y6.j0(dp, dp, dp, dp, w02, o10, o10);
            b7 N = f7.N(i12);
            b7 h = f7.h(i13, 120);
            textView.setBackground(j02);
            f7.k(textView, j02, N, h, u6Var);
        }
        if (i10 == 32) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            fi.d dVar = new fi.d(context, u6Var, true);
            this.S0 = dVar;
            dVar.k();
            dVar.i(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new u(this, 1));
            this.containerView.addView(dVar, kb1.h(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new w(this, 3));
        }
        if (i10 == 19 || i10 == 18) {
            this.containerView.post(new w(this, 4));
        }
    }

    public static String E1(int i10) {
        switch (i10) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    public static void G1(r2 r2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j10, boolean z10) {
        if (tL_premium_boostsStatus == null || canApplyBoost == null || r2Var.getContext() == null) {
            return;
        }
        j0 j0Var = new j0(32, r2Var.getCurrentAccount(), r2Var.getContext(), r2Var, r2Var.getResourceProvider());
        j0Var.K1(canApplyBoost);
        j0Var.J1(tL_premium_boostsStatus, true);
        j0Var.L1(j10);
        if (z10) {
            r2Var.showDialog(j0Var);
        } else {
            j0Var.show();
        }
    }

    public static /* synthetic */ void P(j0 j0Var, ArrayList arrayList, TLRPC.User user) {
        j0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
            MessagesController.getInstance(j0Var.currentAccount).putChat(chat, false);
            MessagesController.getInstance(j0Var.currentAccount).deleteParticipantFromChat(chat.id, user);
        }
    }

    public static /* synthetic */ void Q(j0 j0Var, ArrayList arrayList) {
        j0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i10));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(j0Var.currentAccount).sendRequest(tL_channels_updateUsername, new v(j0Var, 1), 64);
        }
    }

    public static void R(j0 j0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int i11;
        nm0 nm0Var = j0Var.d;
        ArrayList arrayList2 = j0Var.A0;
        arrayList2.clear();
        ArrayList arrayList3 = j0Var.z0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i12));
        }
        j0Var.I0 = false;
        j0Var.J0.b(j0Var.n0 + 4);
        int i13 = 0;
        while (true) {
            if (i13 >= nm0Var.getChildCount()) {
                i11 = 0;
                break;
            } else {
                if (nm0Var.getChildAt(i13) instanceof i0) {
                    i11 = nm0Var.getChildAt(i13).getTop();
                    break;
                }
                i13++;
            }
        }
        j0Var.Q1();
        if (j0Var.l0 >= 0 && i11 != 0) {
            ((s4.c0) nm0Var.getLayoutManager()).h1(j0Var.l0 + 1, i11);
        }
        if (j0Var.M0 == null) {
            j0Var.M0 = y1(j0Var.h0, j0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), j0Var.M0.b);
        h0 h0Var = j0Var.x0;
        if (h0Var != null) {
            h0Var.i(max, false);
            j0Var.x0.setBagePosition(max / j0Var.M0.c);
            h0 h0Var2 = j0Var.x0;
            h0Var2.H = true;
            h0Var2.requestLayout();
        }
    }

    public static void S(j0 j0Var) {
        int i10 = j0Var.h0;
        HashSet hashSet = j0Var.y0;
        int i11 = 1;
        if (j0Var.j0) {
            r2 r2Var = j0Var.K0;
            if (r2Var == null) {
                return;
            }
            p2 p2Var = new p2();
            p2Var.a = true;
            r2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), p2Var);
        } else if (i10 == 19 || i10 == 32 || j0Var.C1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.c0;
            if (canApplyBoost.canApply) {
                j0Var.E0.v.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.c0;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    AndroidUtilities.runOnUIThread(new w(j0Var, i11), canApplyBoost2.needSelector ? 300L : 0L);
                    return;
                }
                return;
            }
            if (canApplyBoost.alreadyActive && vg.s.i() && !j0Var.c0.isMaxLvl) {
                vg.j.i(j0Var.a0, j0Var);
                return;
            } else {
                j0Var.dismiss();
                return;
            }
        }
        int i12 = 11;
        if (i10 == 11 || i10 == 34) {
            if (hashSet.isEmpty()) {
                j0Var.dismiss();
                return;
            } else {
                j0Var.I1(null);
                return;
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        if (i10 == 2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                j0Var.i0.add((TLRPC.Chat) it.next());
            }
            j0Var.H1(arrayList);
            return;
        }
        if (i10 == 5) {
            TLRPC.User user = MessagesController.getInstance(j0Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(j0Var.currentAccount).getClientUserId()));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList2.add((TLRPC.Chat) it2.next());
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j0Var.getContext(), 0, j0Var.resourcesProvider);
            String formatPluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
            e2 e2Var = alertDialog$Builder.a;
            e2Var.R = formatPluralString;
            if (arrayList2.size() == 1) {
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
            } else {
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new qy(j0Var, arrayList2, user, i12));
            e2Var.show();
            TextView textView = (TextView) e2Var.d(-1);
            if (textView != null) {
                f7.V(textView, y6.q7, j0Var.resourcesProvider);
            }
        }
    }

    public static /* synthetic */ void U(j0 j0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            ArrayList arrayList = new ArrayList();
            int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i10 = 0; i10 < min; i10++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                int currentTime = (ConnectionsManager.getInstance(j0Var.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                if (ChatObject.isMegagroup(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                } else if (ChatObject.isChannel(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new as0(j0Var, arrayList, min, tL_messages_inactiveChats, 24));
        }
    }

    public static void V(j0 j0Var, Context context) {
        r2 r2Var = j0Var.K0;
        int i10 = j0Var.h0;
        if (i10 == 11 || i10 == 34) {
            return;
        }
        int i11 = 0;
        if (i10 != 19 && i10 != 32 && !j0Var.C1()) {
            if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
                AndroidUtilities.addToClipboard(j0Var.t1());
                j0Var.dismiss();
                return;
            }
            if (UserConfig.getInstance(j0Var.currentAccount).isPremium() || MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked() || j0Var.N0) {
                j0Var.dismiss();
                return;
            } else {
                if (r2Var == null) {
                    return;
                }
                if (r2Var.getVisibleDialog() != null) {
                    r2Var.getVisibleDialog().dismiss();
                }
                r2Var.presentFragment(new PremiumPreviewFragment(0, E1(i10)));
                j0Var.dismiss();
                return;
            }
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.c0;
        if (canApplyBoost.empty) {
            if (UserConfig.getInstance(j0Var.currentAccount).isPremium() && vg.s.i()) {
                vg.j.i(j0Var.a0, j0Var);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, j0Var.resourcesProvider);
            String string = LocaleController.getString(R.string.PremiumNeeded);
            e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(j0Var.B1() ? R.string.PremiumNeededForBoostingGroup : R.string.PremiumNeededForBoosting));
            alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new x(j0Var, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0.b(15));
            alertDialog$Builder.p();
            return;
        }
        boolean z10 = canApplyBoost.canApply;
        int i12 = 1;
        if (z10 && canApplyBoost.replaceDialogId == 0) {
            if (!canApplyBoost.needSelector || !vg.s.i()) {
                j0Var.r1();
                return;
            }
            j0Var.f0 = true;
            j0Var.x0.d0 = false;
            r2 r2Var2 = j0Var.n;
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.c0;
            vg.s0 s0Var = new vg.s0(r2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
            s0Var.show();
            s0Var.setOnHideListener(new cb(j0Var, 12));
            return;
        }
        if (!z10) {
            int i13 = canApplyBoost.floodWait;
            if (i13 != 0) {
                vg.j.g(i13);
                return;
            }
            return;
        }
        FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
        y9 y9Var = new y9(j0Var.getContext());
        y9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(y9Var, kb1.g(60.0f, 60));
        frameLayout.setClipChildren(false);
        Paint paint = new Paint(1);
        paint.setColor(y6.x0(null, y6.h5, false));
        frameLayout.addView(new f6(j0Var.getContext(), paint, j0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), kb1.h(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(j0Var.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        f7.t(imageView, y6.m6, null, PorterDuff.Mode.SRC_ATOP);
        frameLayout.addView(imageView, kb1.i(24, 24, 17));
        y9 y9Var2 = new y9(j0Var.getContext());
        y9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(y9Var2, kb1.h(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(j0Var.getContext());
        frameLayout2.addView(frameLayout, kb1.i(-2, 60, 1));
        frameLayout2.setClipChildren(false);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        f7.V(textView, y6.j5, null);
        textView.setTextSize(1, 16.0f);
        frameLayout2.addView(textView, kb1.x(-1, -2, 0, 24, 80, 24, 0));
        j9 j9Var = new j9((u6) null);
        TLRPC.Chat chat = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.c0.replaceDialogId));
        j9Var.k(j0Var.currentAccount, chat);
        y9Var.f(chat, j9Var);
        j9 j9Var2 = new j9((u6) null);
        TLRPC.Chat chat2 = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.a0));
        j9Var2.k(j0Var.currentAccount, chat2);
        y9Var2.f(chat2, j9Var2);
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
        alertDialog$Builder2.o(frameLayout2);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new x(j0Var, i12));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new s0.b(16));
        alertDialog$Builder2.p();
    }

    public static void W(j0 j0Var, View view) {
        int i10;
        HashSet hashSet = j0Var.y0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.r.a(hashSet.contains(currentChannel), true);
            j0Var.O1();
            return;
        }
        if (view instanceof k4) {
            if (j0Var.Y || !((i10 = j0Var.h0) == 11 || i10 == 34)) {
                k4 k4Var = (k4) view;
                Object object = k4Var.getObject();
                if (!k4Var.O) {
                    if (hashSet.contains(object)) {
                        hashSet.remove(object);
                    } else {
                        hashSet.add(object);
                    }
                    k4Var.c(hashSet.contains(object), true);
                    j0Var.O1();
                    return;
                }
                if (object instanceof TLRPC.User) {
                    long j10 = ((TLRPC.User) object).id;
                    int i11 = -j0Var.U0;
                    j0Var.U0 = i11;
                    AndroidUtilities.shakeViewSpring(k4Var, i11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String forcedFirstName = j10 >= 0 ? UserObject.getForcedFirstName(MessagesController.getInstance(j0Var.currentAccount).getUser(Long.valueOf(j10))) : "";
                    (MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked() ? new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).R(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName))) : new wc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new w(j0Var, 0))).j();
                }
            }
        }
    }

    public static androidx.emoji2.text.p y1(int i10, int i11) {
        androidx.emoji2.text.p pVar = new androidx.emoji2.text.p();
        pVar.a = 0;
        pVar.d = null;
        pVar.e = null;
        pVar.f = null;
        pVar.b = 0;
        pVar.c = 0;
        if (i10 == 0) {
            pVar.b = MessagesController.getInstance(i11).dialogFiltersPinnedLimitDefault;
            pVar.c = MessagesController.getInstance(i11).dialogFiltersPinnedLimitPremium;
            pVar.a = R.drawable.msg_limit_pin;
            pVar.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 33) {
            pVar.b = MessagesController.getInstance(i11).savedDialogsPinnedLimitDefault;
            pVar.c = MessagesController.getInstance(i11).savedDialogsPinnedLimitPremium;
            pVar.a = R.drawable.msg_limit_pin;
            pVar.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 2) {
            pVar.b = MessagesController.getInstance(i11).publicLinksLimitDefault;
            pVar.c = MessagesController.getInstance(i11).publicLinksLimitPremium;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 12) {
            pVar.b = MessagesController.getInstance(i11).chatlistInvitesLimitDefault;
            pVar.c = MessagesController.getInstance(i11).chatlistInvitesLimitPremium;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 13) {
            pVar.b = MessagesController.getInstance(i11).chatlistJoinedLimitDefault;
            pVar.c = MessagesController.getInstance(i11).chatlistJoinedLimitPremium;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 3) {
            pVar.b = MessagesController.getInstance(i11).dialogFiltersLimitDefault;
            pVar.c = MessagesController.getInstance(i11).dialogFiltersLimitPremium;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 4) {
            pVar.b = MessagesController.getInstance(i11).dialogFiltersChatsLimitDefault;
            pVar.c = MessagesController.getInstance(i11).dialogFiltersChatsLimitPremium;
            pVar.a = R.drawable.msg_limit_chats;
            pVar.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 5) {
            pVar.b = MessagesController.getInstance(i11).channelsLimitDefault;
            pVar.c = MessagesController.getInstance(i11).channelsLimitPremium;
            pVar.a = R.drawable.msg_limit_groups;
            pVar.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 6) {
            pVar.b = 100;
            pVar.c = 200;
            pVar.a = R.drawable.msg_limit_folder;
            pVar.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            pVar.e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            pVar.f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return pVar;
        }
        if (i10 == 7) {
            pVar.b = 3;
            pVar.c = 4;
            pVar.a = R.drawable.msg_limit_accounts;
            pVar.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 11) {
            pVar.b = 0;
            pVar.c = 0;
            pVar.a = R.drawable.msg_limit_links;
            pVar.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(pVar.c));
            pVar.e = "";
            pVar.f = "";
            return pVar;
        }
        if (i10 == 14) {
            pVar.b = MessagesController.getInstance(i11).storyExpiringLimitDefault;
            pVar.c = MessagesController.getInstance(i11).storyExpiringLimitPremium;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", pVar.b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", pVar.c);
            pVar.e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", pVar.c);
            pVar.f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", pVar.b);
            return pVar;
        }
        if (i10 == 15) {
            pVar.b = MessagesController.getInstance(i11).storiesSentWeeklyLimitDefault;
            pVar.c = MessagesController.getInstance(i11).storiesSentWeeklyLimitPremium;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 == 16) {
            pVar.b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            pVar.c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            pVar.a = R.drawable.msg_limit_stories;
            pVar.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
            pVar.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(pVar.c));
            pVar.f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(pVar.b));
            return pVar;
        }
        if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return pVar;
        }
        pVar.b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
        pVar.c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
        pVar.a = R.drawable.filled_limit_boost;
        pVar.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(pVar.b), Integer.valueOf(pVar.c));
        pVar.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(pVar.c));
        pVar.f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(pVar.b));
        return pVar;
    }

    public static boolean z1(int i10) {
        return i10 == 0 || i10 == 33 || i10 == 3 || i10 == 4 || i10 == 6 || i10 == 7 || i10 == 12 || i10 == 13 || i10 == 14 || i10 == 15 || i10 == 16;
    }

    public final boolean A1() {
        int i10 = this.h0;
        return i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 27 || i10 == 28 || i10 == 23 || i10 == 30 || i10 == 35;
    }

    public final boolean B1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.a0)));
    }

    public final boolean C1() {
        return A1() && ChatObject.hasAdminRights(w1());
    }

    public final void D1() {
        h0 h0Var = this.x0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.b0;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        h0Var.b++;
        h0Var.a = ee.a((i10 - r3) / i11, 0.0f, 1.0f);
        h0Var.W = true;
        h0Var.a0 = h0Var.n;
        h0Var.i(i10, true);
        h0Var.I.requestLayout();
        h0Var.requestLayout();
    }

    public final boolean F1() {
        String str;
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.b0, this.c0.copy(), Long.valueOf(this.a0));
        fi.d dVar = this.S0;
        if (dVar != null) {
            TLRPC.ChatFull x12 = x1();
            int max = Math.max(x12.boosts_unrestrict - x12.boosts_applied, 0);
            if (max == 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.groupRestrictionsUnlockedByBoosts, new Object[0]);
                dismiss();
                return false;
            }
            dVar.b(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.n0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.d0, transitionSet);
        i0 i0Var = this.d0;
        vg.b bVar = i0Var.c;
        int indexOfChild = i0Var.indexOfChild(i0Var.b);
        j0 j0Var = i0Var.e;
        if (j0Var.e0) {
            int indexOfChild2 = i0Var.indexOfChild(i0Var.d);
            i0Var.removeView(i0Var.d);
            i0Var.d.removeView(i0Var.a);
            i0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(i0Var.getContext());
            i0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            i0Var.d.setWeightSum(1.0f);
            i0Var.d.addView(i0Var.a, kb1.s(-2, -2, 1.0f, 0));
            i0Var.d.addView(bVar, kb1.x(-2, -2, 48, 0, 2, 0, 0));
            i0Var.addView(i0Var.d, indexOfChild2, kb1.x(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = i0Var.indexOfChild(i0Var.a);
            i0Var.removeView(i0Var.a);
            TextView textView = new TextView(i0Var.getContext());
            i0Var.a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            i0Var.a.setTextSize(1, 20.0f);
            f7.V(i0Var.a, y6.G6, j0Var.resourcesProvider);
            i0Var.a.setGravity(17);
            i0Var.addView(i0Var.a, indexOfChild3, kb1.x(-2, -2, 1, 0, 22, 0, 0));
        }
        i0Var.removeView(i0Var.b);
        TextView textView2 = new TextView(i0Var.getContext());
        i0Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = i0Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), i0Var.b.getLineSpacingMultiplier() * 1.1f);
        i0Var.b.setGravity(1);
        f7.V(i0Var.b, y6.G6, j0Var.resourcesProvider);
        i0Var.addView(i0Var.b, indexOfChild, kb1.x(-2, -2, 1, 24, -2, 24, 17));
        this.d0.a.setText(v1());
        TextView textView4 = this.d0.b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean B1 = B1();
        int i10 = this.h0;
        if (i10 == 20) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(s1()));
        } else if (i10 == 24) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(s1()));
        } else if (i10 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i10 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i10 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i10 == 25) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(B1 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i10 == 26) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(B1 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i10 == 27) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i10 == 28) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(B1 ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i10 == 22) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(B1 ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i10 == 23) {
            str = LocaleController.formatString(B1 ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(B1 ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else {
            str = null;
        }
        if (str == null) {
            str = u1(false);
        }
        textView4.setText(AndroidUtilities.replaceTags(str));
        O1();
        z00 z00Var = this.P0;
        z00Var.c(false);
        try {
            z00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.d0.c.a(this.c0.boostCount, true);
        this.d.y0(0);
        if (i10 == 32) {
            this.d0.c.setVisibility(8);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.bb
    public final void G(ww0 ww0Var) {
        int i10;
        Context context = ww0Var.getContext();
        fi.d dVar = new fi.d(context, this.resourcesProvider, true);
        this.G0 = dVar;
        dVar.setFlickeringLoading(true);
        this.G0.i(LocaleController.getString(R.string.BoostBtn), false, true);
        this.G0.setOnClickListener(new u(this, 2));
        z zVar = new z(this, context, this.resourcesProvider);
        this.E0 = zVar;
        kb1.c(zVar, 0.02f, 1.2f);
        if (!this.r && (i10 = this.h0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            b20 b20Var = new b20(this, context, 12);
            this.L0 = b20Var;
            f7.i(y6.h5, b20Var, this.resourcesProvider);
            ww0Var.addView(this.L0, kb1.h(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        z zVar2 = this.E0;
        float f7 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        ww0Var.addView(zVar2, kb1.h(-1, 48.0f, 80, f7, 0.0f, f7, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        nm0 nm0Var = this.d;
        nm0Var.setPadding(0, 0, 0, dp);
        nm0Var.setClipToPadding(false);
        nm0Var.setClipChildren(false);
        nm0Var.setOnItemClickListener(new ai.k(this, 21));
        nm0Var.setOnItemLongClickListener(new x(this, 2));
        this.E0.v.setOnClickListener(new org.telegram.ui.web.c(4, this, context));
        this.E0.h.setOnClickListener(new u(this, 3));
        this.J0 = new rl0(nm0Var, true);
    }

    public final void H1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        e2 e2Var = alertDialog$Builder.a;
        e2Var.R = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.v0) {
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.v0) {
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new bh1(15, this, arrayList));
        e2Var.show();
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            f7.V(textView, y6.q7, this.resourcesProvider);
        }
    }

    public final void I1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.V0)) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.O0.id);
            if (chatFull == null) {
                dismiss();
                return;
            }
            if (this.O0.username != null) {
                str = "@" + this.O0.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                if (tL_chatInviteExported == null) {
                    dismiss();
                    return;
                }
                str = tL_chatInviteExported.link;
            }
        } else {
            str = this.V0;
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = this.y0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.id));
            }
            (sendPaidMessagesStars >= 0 ? arrayList : arrayList2).add(user);
        }
        int i10 = 0;
        boolean z10 = true;
        if (hashMap2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            g5.b0(this.currentAccount, arrayList3, 1, new ig.o(this, 21));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            boolean z12 = z10;
            Iterator it3 = it2;
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            of2.payStars = longValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            if (of2.payStars > 0) {
                z11 = z12;
            }
            hashMap2 = hashMap;
            z10 = z12;
            it2 = it3;
        }
        if (!z11) {
            AndroidUtilities.runOnUIThread(new w(this, 2));
        }
        dismiss();
    }

    public final void J1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.b0 = tL_premium_boostsStatus;
        this.e0 = z10;
        Q1();
    }

    public final void K1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.c0 = canApplyBoost;
        O1();
        P1();
    }

    public final void L1(long j10) {
        this.a0 = j10;
        Q1();
    }

    public final void M1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.O0 = chat;
        this.V0 = str;
        this.Y = !TextUtils.isEmpty(str) || ChatObject.canUserDoAdminAction(chat, 3);
        this.B0 = new ArrayList(arrayList);
        this.C0 = arrayList2;
        this.D0 = arrayList3;
        HashSet hashSet = this.y0;
        hashSet.clear();
        if (this.Y) {
            ArrayList arrayList4 = this.B0;
            int size = arrayList4.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList4.get(i10);
                i10++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.id))) {
                    hashSet.add(user);
                }
            }
        }
        Q1();
        O1();
        int i11 = this.h0;
        if ((i11 == 11 || i11 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.B0.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            z zVar = this.E0;
            if (zVar != null && zVar.getParent() != null) {
                ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            }
            b20 b20Var = this.L0;
            if (b20Var != null && b20Var.getParent() != null) {
                ((ViewGroup) this.L0.getParent()).removeView(this.L0);
            }
            nm0 nm0Var = this.d;
            if (nm0Var != null) {
                nm0Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void N1() {
        int i10;
        this.u0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.b0;
        int i11 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.h0 == 31) {
            i11 = 1;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        int i12 = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int max = Math.max(10, peerColors != null ? peerColors.maxLevel(B1()) : 0);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            int max2 = Math.max(max, peerColors2 != null ? peerColors2.maxLevel(B1()) : 0);
            i12 = B1() ? Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
        }
        ArrayList arrayList = null;
        while (i11 <= i12) {
            boolean B1 = B1();
            ArrayList arrayList2 = new ArrayList();
            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
            if (messagesController2 != null) {
                if (!B1 && i11 >= messagesController2.channelAutotranslationLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                e0 b10 = e0.b(R.drawable.menu_feature_stories, i11, "BoostFeatureStoriesPerDay");
                b10.f = true;
                arrayList2.add(b10);
                if (!B1) {
                    e0 b11 = e0.b(R.drawable.menu_feature_reactions, i11, "BoostFeatureCustomReaction");
                    b11.f = true;
                    arrayList2.add(b11);
                }
                MessagesController.PeerColors peerColors3 = messagesController2.peerColors;
                int colorsAvailable = peerColors3 != null ? peerColors3.colorsAvailable(i11, false) : 0;
                MessagesController.PeerColors peerColors4 = messagesController2.profilePeerColors;
                int colorsAvailable2 = peerColors4 != null ? peerColors4.colorsAvailable(i11, B1) : 0;
                if (!B1 && colorsAvailable > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!B1 && colorsAvailable > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_links, colorsAvailable, "BoostFeatureReplyColor"));
                }
                if (!B1 && i11 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (colorsAvailable2 > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_color_profile, colorsAvailable2, B1 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
                }
                if (B1 && i11 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!B1 && i11 >= messagesController2.channelProfileIconLevelMin) || (B1 && i11 >= messagesController2.groupProfileBgIconLevelMin)) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_cover, B1 ? R.string.BoostFeatureProfileIconGroup : R.string.BoostFeatureProfileIcon));
                }
                if (B1 && i11 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!B1 && i11 >= messagesController2.channelEmojiStatusLevelMin) || (B1 && i11 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new e0(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!B1 && i11 >= messagesController2.channelWallpaperLevelMin) || (B1 && i11 >= messagesController2.groupWallpaperLevelMin)) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_wallpaper, 8, B1 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
                }
                if ((!B1 && i11 >= messagesController2.channelCustomWallpaperLevelMin) || (B1 && i11 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_custombg, B1 ? R.string.BoostFeatureCustomBackgroundGroup : R.string.BoostFeatureCustomBackground));
                }
                if (!B1 && i11 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (0; i10 < arrayList.size(); i10 + 1) {
                    e0 e0Var = (e0) arrayList.get(i10);
                    e0 e0Var2 = (e0) arrayList2.get(i10);
                    int i13 = e0Var.e;
                    i10 = (e0Var2 != null && ((e0Var.f && i13 > 2) || (e0Var.a == e0Var2.a && e0Var.b == e0Var2.b && TextUtils.equals(e0Var.c, e0Var2.c) && TextUtils.equals(e0Var.d, e0Var2.d) && i13 == e0Var2.e))) ? i10 + 1 : 0;
                }
                i11++;
            }
            ArrayList arrayList3 = this.u0;
            arrayList3.add(new d0(i11, arrayList3.isEmpty()));
            this.u0.addAll(arrayList2);
            arrayList = arrayList2;
            i11++;
        }
    }

    public final void O1() {
        if (this.j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i10 = this.h0;
        if (i10 != 19 && i10 != 32 && !C1()) {
            String str = null;
            HashSet hashSet = this.y0;
            if (i10 != 11 && i10 != 34) {
                if (hashSet.size() <= 0) {
                    z zVar = this.E0;
                    zVar.r = false;
                    zVar.d(true);
                    return;
                } else {
                    if (i10 == 2) {
                        str = LocaleController.formatPluralString("RevokeLinks", hashSet.size(), new Object[0]);
                    } else if (i10 == 5) {
                        str = LocaleController.formatPluralString("LeaveCommunities", hashSet.size(), new Object[0]);
                    }
                    this.E0.b(str, true, true);
                    return;
                }
            }
            z zVar2 = this.E0;
            if (zVar2.I == null) {
                hr hrVar = new hr(zVar2.getContext(), null);
                zVar2.I = hrVar;
                hrVar.setGravity(3);
                hr hrVar2 = zVar2.I;
                int i11 = y6.Oh;
                int i12 = y6.Sh;
                gr grVar = hrVar2.a;
                grVar.v = i11;
                grVar.w = i12;
                grVar.b = 0.8f;
                zVar2.setClipChildren(false);
                zVar2.addView(zVar2.I, kb1.i(-1, 24, 16));
            }
            if (!this.Y) {
                this.E0.b(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.E0.b(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.E0.b(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            this.E0.I.a.c(hashSet.size(), true);
            this.E0.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.c0;
        boolean z10 = canApplyBoost.canApply;
        if ((z10 || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
            if (canApplyBoost.isMaxLvl) {
                this.E0.b(LocaleController.getString(R.string.OK), true, true);
                return;
            }
            z zVar3 = this.E0;
            zVar3.r = false;
            zVar3.d(true);
            return;
        }
        fi.d dVar = this.S0;
        if (z10) {
            if (vg.s.i()) {
                this.E0.b(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                this.E0.b(LocaleController.getString(B1() ? R.string.BoostGroup : R.string.BoostChannel), true, true);
            }
            this.G0.i(LocaleController.getString(R.string.BoostBtn), true, true);
            if (dVar != null) {
                dVar.i(LocaleController.getString(R.string.BoostGroup), true, true);
                return;
            }
            return;
        }
        if (canApplyBoost.isMaxLvl) {
            this.G0.i(LocaleController.getString(R.string.OK), true, true);
            if (dVar != null) {
                dVar.i(LocaleController.getString(R.string.OK), true, true);
            }
            this.E0.b(LocaleController.getString(R.string.OK), true, true);
            return;
        }
        if (vg.s.i()) {
            if (dVar != null) {
                dVar.i(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.G0.i(LocaleController.getString(R.string.BoostBtn), true, true);
            this.E0.b(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            return;
        }
        if (dVar != null) {
            dVar.i(LocaleController.getString(R.string.OK), true, true);
        }
        this.G0.i(LocaleController.getString(R.string.OK), true, true);
        this.E0.b(LocaleController.getString(R.string.OK), true, true);
    }

    public final void P1() {
        String string;
        if (this.j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i10 = this.h0;
        if (i10 == 19 || i10 == 32 || C1()) {
            if (!vg.s.i()) {
                this.E0.f.setText(LocaleController.getString(B1() ? R.string.BoostGroup : R.string.BoostChannel));
                return;
            }
            o0 o0Var = this.E0.f;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.c0;
            if (canApplyBoost == null || !canApplyBoost.alreadyActive) {
                string = LocaleController.getString(B1() ? R.string.BoostGroup : R.string.BoostChannel);
            } else {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            }
            o0Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.c0;
            if (canApplyBoost2 == null || !canApplyBoost2.isMaxLvl) {
                return;
            }
            this.E0.f.setText(LocaleController.getString(R.string.OK));
            return;
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new zq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.E0.f.setText(spannableStringBuilder);
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.N0) {
            this.E0.f.setText(LocaleController.getString(R.string.OK));
            z zVar = this.E0;
            zVar.y.p = null;
            zVar.F.setVisibility(8);
            return;
        }
        this.E0.f.setText(LocaleController.getString(R.string.IncreaseLimit));
        androidx.emoji2.text.p pVar = this.M0;
        if (pVar == null) {
            z zVar2 = this.E0;
            zVar2.y.p = null;
            zVar2.F.setVisibility(8);
            return;
        }
        int i11 = pVar.b;
        int i12 = i11 + 1;
        int i13 = pVar.c;
        if (i12 == i13) {
            this.E0.setIcon(R.raw.addone_icon);
            return;
        }
        if (i11 != 0 && i13 != 0) {
            float f7 = i13 / i11;
            if (f7 >= 1.6f && f7 <= 2.5f) {
                this.E0.setIcon(R.raw.double_icon);
                return;
            }
        }
        z zVar3 = this.E0;
        zVar3.y.p = null;
        zVar3.F.setVisibility(8);
    }

    public final void Q1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.m0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.Z = -1;
        this.r0 = -1;
        this.t0 = -1;
        this.k0 = 1;
        this.l0 = 0;
        int i10 = this.h0;
        if (i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 27 || i10 == 28 || i10 == 22 || i10 == 23 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 21 || i10 == 30 || i10 == 35) {
            if (i10 != 19 || ChatObject.hasAdminRights(w1())) {
                this.v = 0.24f;
                int i11 = this.k0;
                this.k0 = i11 + 1;
                this.Z = i11;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i12 = this.k0;
                    this.k0 = i12 + 1;
                    this.s0 = i12;
                }
            }
            N1();
            int i13 = this.k0;
            int i14 = i13 + 1;
            this.k0 = i14;
            this.t0 = i13;
            this.k0 = (this.u0.size() - 1) + i14;
        } else if (i10 == 31 || i10 == 32) {
            this.v = 0.24f;
            N1();
            int i15 = this.k0;
            this.o0 = i15;
            int i16 = i15 + 1;
            this.k0 = i16;
            this.t0 = i15;
            int size = (this.u0.size() - 1) + i16;
            this.k0 = size;
            this.p0 = size;
        } else if (!z1(i10)) {
            if (i10 == 11 || i10 == 34) {
                this.v = 0.24f;
            } else {
                int i17 = this.k0;
                this.m0 = i17;
                this.k0 = i17 + 2;
                this.n0 = i17 + 1;
            }
            if (this.I0) {
                int i18 = this.k0;
                this.k0 = i18 + 1;
                this.q0 = i18;
            } else if (i10 != 11 || this.Y) {
                if (i10 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.D0) == null || arrayList.isEmpty()) && ((arrayList2 = this.C0) == null || arrayList2.size() < this.B0.size())) || (arrayList3 = this.D0) == null || arrayList3.size() != 1 || (arrayList4 = this.C0) == null || arrayList4.size() != 1 || !this.Y)) {
                    int i19 = this.k0;
                    this.o0 = i19;
                    if (i10 == 11 || i10 == 34) {
                        this.k0 = this.B0.size() + i19;
                    } else if (i10 == 5) {
                        this.k0 = this.z0.size() + i19;
                    } else {
                        this.k0 = this.i0.size() + i19;
                    }
                    this.p0 = this.k0;
                }
                if (this.p0 - this.o0 > 1) {
                    int i20 = this.k0;
                    this.k0 = i20 + 1;
                    this.r0 = i20;
                }
            }
        }
        this.d.getAdapter().l();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TLRPC.ChatFull x12;
        if (i10 != NotificationCenter.boostByChannelCreated) {
            if (i10 != NotificationCenter.boostedChannelByUser) {
                if (i10 == NotificationCenter.didStartedMultiGiftsSelector) {
                    dismiss();
                    return;
                }
                return;
            }
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.c0 == null) {
                return;
            }
            this.b0.boosts += intValue;
            if (this.h0 == 32 && (x12 = x1()) != null) {
                x12.boosts_applied += intValue;
            }
            D1();
            J1(tL_premium_boostsStatus, this.e0);
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.c0;
            canApplyBoost.isMaxLvl = this.b0.next_level_boosts <= 0;
            canApplyBoost.boostedNow = true;
            canApplyBoost.setMyBoosts(tL_premium_myBoosts);
            if (F1()) {
                qc R = new wc(this.container, this.resourcesProvider).R(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                R.j = 4000;
                R.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        r2 r2Var = this.n;
        r2 lastFragment = r2Var.getParentLayout().getLastFragment();
        if (lastFragment instanceof bh.u) {
            List fragmentStack = r2Var.getParentLayout().getFragmentStack();
            r2 r2Var2 = fragmentStack.size() >= 2 ? (r2) b10.h(2, fragmentStack) : null;
            r2 r2Var3 = fragmentStack.size() >= 3 ? (r2) b10.h(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (r2) b10.h(4, fragmentStack) : null;
            if (r2Var2 instanceof oo) {
                ((ActionBarLayout) r2Var.getParentLayout()).c0(r2Var2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                vg.j.f(r2Var3, chat, false);
                return;
            } else {
                if (r2Var3 instanceof ProfileActivity) {
                    ((ActionBarLayout) r2Var.getParentLayout()).c0(r2Var3, false);
                }
                lastFragment.finishFragment();
                vg.j.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof wn) && booleanValue) {
            vg.j.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof bd) && booleanValue) {
            List fragmentStack2 = r2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                r2 r2Var4 = (r2) fragmentStack2.get(size);
                if ((r2Var4 instanceof wn) || (r2Var4 instanceof ey)) {
                    r6 = r2Var4;
                    break;
                }
                arrayList.add(r2Var4);
            }
            if (r6 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((ActionBarLayout) r2Var.getParentLayout()).c0((r2) obj, false);
            }
            r2Var.finishFragment();
            dismiss();
            vg.j.f(r6, chat, true);
            return;
        }
        if (!booleanValue) {
            sb sbVar = sb.F2;
            if (sbVar == null || !sbVar.d) {
                dismiss();
                vg.j.f(LaunchActivity.R(), chat, false);
                return;
            }
            wn ea2 = wn.ea(-chat.id);
            LaunchActivity.R().presentFragment(ea2, false, false);
            sb.w();
            dismiss();
            vg.j.f(ea2, chat, false);
            return;
        }
        sb sbVar2 = sb.F2;
        if (sbVar2 != null && sbVar2.d) {
            wn ea3 = wn.ea(-chat.id);
            LaunchActivity.R().presentFragment(ea3, false, false);
            sb.w();
            dismiss();
            vg.j.f(ea3, chat, true);
            return;
        }
        List fragmentStack3 = r2Var.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (r2) b10.h(2, fragmentStack3) : null;
        r2Var.finishFragment();
        dismiss();
        if (r6 instanceof wn) {
            vg.j.f(r6, chat, true);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override // org.telegram.ui.ActionBar.k3
    public final void onThemeColorsChanged() {
        int w02;
        super.onThemeColorsChanged();
        try {
            if (this.navBarColorKey >= 0 || this.navBarColor != this.T0 || (w02 = y6.w0(y6.h5, this.resourcesProvider)) == this.navBarColor) {
                return;
            }
            this.navBarColor = w02;
            this.T0 = w02;
            setOverlayNavBarColor(w02);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void q1(final da0 da0Var, boolean z10) {
        if (!da0Var.c() || z10) {
            da0Var.setLoading(true);
            ChannelBoostsController boostsController = MessagesController.getInstance(this.currentAccount).getBoostsController();
            long j10 = this.a0;
            int i10 = this.c0.slot;
            final int i11 = 0;
            Utilities.Callback<TL_stories.TL_premium_myBoosts> callback = new Utilities.Callback(this) { // from class: tg.y
                public final /* synthetic */ j0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.a0, new v3(this.b, da0Var, (TL_stories.TL_premium_myBoosts) obj, 11));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            da0 da0Var2 = da0Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new s9.g(7, this.b, da0Var2), intValue * 1000);
                                    break;
                                } else {
                                    vg.j.g(intValue);
                                }
                            }
                            da0Var2.setLoading(false);
                            break;
                    }
                }
            };
            final int i12 = 1;
            boostsController.applyBoost(j10, i10, callback, new Utilities.Callback(this) { // from class: tg.y
                public final /* synthetic */ j0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.a0, new v3(this.b, da0Var, (TL_stories.TL_premium_myBoosts) obj, 11));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            da0 da0Var2 = da0Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new s9.g(7, this.b, da0Var2), intValue * 1000);
                                    break;
                                } else {
                                    vg.j.g(intValue);
                                }
                            }
                            da0Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void r1() {
        if (this.G0.isAttachedToWindow()) {
            q1(this.G0, false);
            return;
        }
        fi.d dVar = this.S0;
        if (dVar == null || !dVar.isAttachedToWindow()) {
            q1(this.E0, false);
        } else {
            q1(dVar, false);
        }
    }

    public int s1() {
        return 0;
    }

    public final String t1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.b0;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.b0.boost_url;
        }
        int i10 = this.currentAccount;
        long j10 = -this.a0;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        if (TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return a1.g.o(j10, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
    }

    public final String u1(boolean z10) {
        String str;
        if (this.h0 == 32) {
            TLRPC.Chat w12 = w1();
            TLRPC.ChatFull x12 = x1();
            return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", Math.max(x12.boosts_unrestrict - x12.boosts_applied, 0), w12 == null ? "" : w12.title);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.a0));
        if (chat == null) {
            str = LocaleController.getString(B1() ? R.string.AccDescrGroup : R.string.AccDescrChannel);
        } else {
            str = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.b0;
        boolean z11 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (C1() && this.b0.next_level_boosts != 0 && z10) {
            int i10 = B1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.b0;
            int i11 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i10, str, LocaleController.formatPluralString("MoreBoosts", i11, Integer.valueOf(i11)));
        }
        if (z11 && this.c0.alreadyActive) {
            if (this.b0.level == 1) {
                return LocaleController.formatString(B1() ? R.string.GroupBoostsJustReachedLevel1 : R.string.ChannelBoostsJustReachedLevel1, new Object[0]);
            }
            return LocaleController.formatString(B1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.b0.level), LocaleController.formatPluralString("BoostStories", this.b0.level, new Object[0]));
        }
        if (this.c0.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.b0;
            if (tL_premium_boostsStatus3.level == 0) {
                int i12 = B1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.b0;
                int i13 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i12, str, LocaleController.formatPluralString("MoreBoosts", i13, Integer.valueOf(i13)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return LocaleController.formatString(B1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.b0.level), LocaleController.formatPluralString("BoostStories", this.b0.level + 1, new Object[0]));
            }
            int i14 = B1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.b0;
            int i15 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return LocaleController.formatString(i14, str, LocaleController.formatPluralString("MoreBoosts", i15, Integer.valueOf(i15)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.b0;
        if (tL_premium_boostsStatus6.level == 0) {
            int i16 = B1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.b0;
            int i17 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return LocaleController.formatString(i16, str, LocaleController.formatPluralString("MoreBoosts", i17, Integer.valueOf(i17)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return LocaleController.formatString(B1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.b0.level), LocaleController.formatPluralString("BoostStories", this.b0.level + 1, new Object[0]));
        }
        int i18 = B1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.b0;
        int i19 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return LocaleController.formatString(i18, str, LocaleController.formatPluralString("MoreBoosts", i19, Integer.valueOf(i19)));
    }

    @Override // org.telegram.ui.Components.bb
    public final mm0 v(nm0 nm0Var) {
        return new c0(this);
    }

    public final String v1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.b0;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.c0.alreadyActive) {
            return LocaleController.getString(B1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        boolean z10 = this.e0;
        int i10 = this.h0;
        if (!z10) {
            if (i10 == 32) {
                return LocaleController.getString(B1() ? R.string.BoostGroup : R.string.BoostChannel);
            }
            if (this.c0.alreadyActive) {
                return LocaleController.getString(B1() ? R.string.YouBoostedGroup : R.string.YouBoostedChannel);
            }
            return LocaleController.getString(B1() ? R.string.BoostingEnableStoriesForGroup : R.string.BoostingEnableStoriesForChannel);
        }
        if (i10 == 32) {
            return LocaleController.getString(B1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.a0));
        if (this.c0.alreadyActive) {
            return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
        }
        return LocaleController.getString(B1() ? R.string.BoostGroup : R.string.BoostChannel);
    }

    public final TLRPC.Chat w1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.a0));
    }

    public final TLRPC.ChatFull x1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.a0);
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        int i10 = this.h0;
        if (i10 == 11) {
            return LocaleController.getString(R.string.ChannelInviteViaLink2);
        }
        if (i10 == 34) {
            return LocaleController.getString(R.string.CallInviteViaLink);
        }
        if (i10 == 35) {
            return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
        }
        switch (i10) {
            case 18:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
                return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
            case 19:
            case MessageObject.TYPE_GIFT_STARS /* 30 */:
                return LocaleController.getString(B1() ? R.string.BoostGroup : R.string.BoostChannel);
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                return LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle);
            case 32:
                return LocaleController.getString(R.string.BoostGroup);
            default:
                return LocaleController.getString(R.string.LimitReached);
        }
    }
}
