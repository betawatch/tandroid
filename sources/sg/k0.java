package sg;

import android.content.Context;
import android.graphics.Paint;
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
import bi.r4;
import di.pc;
import di.r6;
import di.s7;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.s50;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.x9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
import org.telegram.ui.co;
import org.telegram.ui.t50;
import org.telegram.ui.uy;
import org.telegram.ui.wy0;
import org.telegram.ui.xo;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class k0 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int V0 = 0;
    public final ArrayList A0;
    public ArrayList B0;
    public ArrayList C0;
    public ArrayList D0;
    public a0 E0;
    public final TextView F0;
    public di.d G0;
    public Runnable H0;
    public boolean I0;
    public qk0 J0;
    public final n2 K0;
    public t50 L0;
    public androidx.emoji2.text.p M0;
    public boolean N0;
    public TLRPC.Chat O0;
    public final r00 P0;
    public Runnable Q0;
    public int R0;
    public final di.d S0;
    public int T0;
    public String U0;
    public int X;
    public boolean Y;
    public int Z;
    public long a0;
    public TL_stories.TL_premium_boostsStatus b0;
    public ChannelBoostsController.CanApplyBoost c0;
    public j0 d0;
    public boolean e0;
    public boolean f0;
    public org.telegram.ui.Cells.t1 g0;
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
    public i0 x0;
    public final HashSet y0;
    public final ArrayList z0;

    public k0(int i10, int i11, Context context, n2 n2Var, f6 f6Var) {
        super(context, n2Var, false, v1(i10), f6Var);
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
        this.T0 = -4;
        fixNavigationBar(j6.v0(j6.h5, this.resourcesProvider));
        this.K0 = n2Var;
        this.currentAccount = i11;
        this.h0 = i10;
        N();
        M1();
        if (i10 == 2) {
            this.I0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new v(this, 0));
        } else if (i10 == 5) {
            this.I0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new v(this, 2));
        }
        L1();
        if (i10 == 32 || w1()) {
            r00 r00Var = new r00(getContext());
            this.P0 = r00Var;
            this.container.addView(r00Var, x5.c(-1.0f, -1));
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35 || i10 == 31) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            t50 t50Var = this.L0;
            if (t50Var != null) {
                ((ViewGroup) t50Var.getParent()).removeView(this.L0);
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
            textView.setTextColor(j6.v0(j6.Sh, f6Var));
            textView.setOnClickListener(new u(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = j6.v0(j6.Oh, f6Var);
            int k10 = i0.a.k(j6.v0(j6.d6, f6Var), 120);
            textView.setBackground(j6.i0(dp, dp, dp, dp, v02, k10, k10));
        }
        if (i10 == 32) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            di.d dVar = new di.d(context, f6Var, true);
            this.S0 = dVar;
            dVar.k();
            dVar.g(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new u(this, 1));
            this.containerView.addView(dVar, x5.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new w(this, 3));
        }
        if (i10 == 19 || i10 == 18) {
            this.containerView.post(new w(this, 4));
        }
    }

    public static String A1(int i10) {
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

    public static void C1(n2 n2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j3, boolean z10) {
        if (tL_premium_boostsStatus == null || canApplyBoost == null || n2Var.getContext() == null) {
            return;
        }
        k0 k0Var = new k0(32, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, n2Var.getResourceProvider());
        k0Var.G1(canApplyBoost);
        k0Var.F1(tL_premium_boostsStatus, true);
        k0Var.H1(j3);
        if (z10) {
            n2Var.showDialog(k0Var);
        } else {
            k0Var.show();
        }
    }

    public static /* synthetic */ void P(k0 k0Var, ArrayList arrayList, TLRPC.User user) {
        k0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
            MessagesController.getInstance(k0Var.currentAccount).putChat(chat, false);
            MessagesController.getInstance(k0Var.currentAccount).deleteParticipantFromChat(chat.id, user);
        }
    }

    public static /* synthetic */ void Q(k0 k0Var, ArrayList arrayList) {
        k0Var.dismiss();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i10));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(k0Var.currentAccount).sendRequest(tL_channels_updateUsername, new v(k0Var, 1), 64);
        }
    }

    public static void R(k0 k0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int i11;
        ll0 ll0Var = k0Var.d;
        ArrayList arrayList2 = k0Var.A0;
        arrayList2.clear();
        ArrayList arrayList3 = k0Var.z0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i12 = 0; i12 < i10; i12++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i12));
        }
        k0Var.I0 = false;
        k0Var.J0.b(k0Var.n0 + 4);
        int i13 = 0;
        while (true) {
            if (i13 >= ll0Var.getChildCount()) {
                i11 = 0;
                break;
            } else {
                if (ll0Var.getChildAt(i13) instanceof j0) {
                    i11 = ll0Var.getChildAt(i13).getTop();
                    break;
                }
                i13++;
            }
        }
        k0Var.M1();
        if (k0Var.l0 >= 0 && i11 != 0) {
            ((s4.c0) ll0Var.getLayoutManager()).h1(k0Var.l0 + 1, i11);
        }
        if (k0Var.M0 == null) {
            k0Var.M0 = u1(k0Var.h0, k0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), k0Var.M0.b);
        i0 i0Var = k0Var.x0;
        if (i0Var != null) {
            i0Var.g(max, false);
            k0Var.x0.setBagePosition(max / k0Var.M0.c);
            i0 i0Var2 = k0Var.x0;
            i0Var2.H = true;
            i0Var2.requestLayout();
        }
    }

    public static void S(k0 k0Var) {
        int i10 = k0Var.h0;
        HashSet hashSet = k0Var.y0;
        int i11 = 1;
        if (k0Var.j0) {
            n2 n2Var = k0Var.K0;
            if (n2Var == null) {
                return;
            }
            l2 l2Var = new l2();
            l2Var.a = true;
            n2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
        } else if (i10 == 19 || i10 == 32 || k0Var.y1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = k0Var.c0;
            if (canApplyBoost.canApply) {
                k0Var.E0.r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = k0Var.c0;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    AndroidUtilities.runOnUIThread(new w(k0Var, i11), canApplyBoost2.needSelector ? 300L : 0L);
                    return;
                }
                return;
            }
            if (canApplyBoost.alreadyActive && ug.t.i() && !k0Var.c0.isMaxLvl) {
                ug.j.i(k0Var.a0, k0Var);
                return;
            } else {
                k0Var.dismiss();
                return;
            }
        }
        if (i10 == 11 || i10 == 34) {
            if (hashSet.isEmpty()) {
                k0Var.dismiss();
                return;
            } else {
                k0Var.E1(null);
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
                k0Var.i0.add((TLRPC.Chat) it.next());
            }
            k0Var.D1(arrayList);
            return;
        }
        if (i10 == 5) {
            TLRPC.User user = MessagesController.getInstance(k0Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(k0Var.currentAccount).getClientUserId()));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList2.add((TLRPC.Chat) it2.next());
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k0Var.getContext(), 0, k0Var.resourcesProvider);
            String formatPluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = formatPluralString;
            if (arrayList2.size() == 1) {
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
            } else {
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new s50(k0Var, arrayList2, user, 9));
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(j6.v0(j6.q7, k0Var.resourcesProvider));
            }
        }
    }

    public static /* synthetic */ void U(k0 k0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            ArrayList arrayList = new ArrayList();
            int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i10 = 0; i10 < min; i10++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i10);
                int currentTime = (ConnectionsManager.getInstance(k0Var.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i10).intValue()) / 86400;
                String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                if (ChatObject.isMegagroup(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                } else if (ChatObject.isChannel(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new r11(k0Var, arrayList, min, tL_messages_inactiveChats, 17));
        }
    }

    public static void V(k0 k0Var, Context context) {
        n2 n2Var = k0Var.K0;
        int i10 = k0Var.h0;
        if (i10 == 11 || i10 == 34) {
            return;
        }
        int i11 = 28;
        int i12 = 27;
        int i13 = 0;
        if (i10 != 19 && i10 != 32 && !k0Var.y1()) {
            if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
                AndroidUtilities.addToClipboard(k0Var.p1());
                k0Var.dismiss();
                return;
            }
            if (UserConfig.getInstance(k0Var.currentAccount).isPremium() || MessagesController.getInstance(k0Var.currentAccount).premiumFeaturesBlocked() || k0Var.N0) {
                k0Var.dismiss();
                return;
            } else {
                if (n2Var == null) {
                    return;
                }
                if (n2Var.getVisibleDialog() != null) {
                    n2Var.getVisibleDialog().dismiss();
                }
                n2Var.presentFragment(new PremiumPreviewFragment(0, A1(i10)));
                k0Var.dismiss();
                return;
            }
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = k0Var.c0;
        if (canApplyBoost.empty) {
            if (UserConfig.getInstance(k0Var.currentAccount).isPremium() && ug.t.i()) {
                ug.j.i(k0Var.a0, k0Var);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, k0Var.resourcesProvider);
            String string = LocaleController.getString(R.string.PremiumNeeded);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(k0Var.x1() ? R.string.PremiumNeededForBoostingGroup : R.string.PremiumNeededForBoosting));
            alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new y(k0Var, i13));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r9.i(i12));
            alertDialog$Builder.o();
            return;
        }
        boolean z10 = canApplyBoost.canApply;
        int i14 = 1;
        if (z10 && canApplyBoost.replaceDialogId == 0) {
            if (!canApplyBoost.needSelector || !ug.t.i()) {
                k0Var.n1();
                return;
            }
            k0Var.f0 = true;
            k0Var.x0.d0 = false;
            n2 n2Var2 = k0Var.n;
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = k0Var.c0;
            ug.t0 t0Var = new ug.t0(n2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
            t0Var.show();
            t0Var.setOnHideListener(new r4(k0Var, 9));
            return;
        }
        if (!z10) {
            int i15 = canApplyBoost.floodWait;
            if (i15 != 0) {
                ug.j.g(i15);
                return;
            }
            return;
        }
        FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
        x9 x9Var = new x9(k0Var.getContext());
        x9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(x9Var, x5.c(60.0f, 60));
        frameLayout.setClipChildren(false);
        Paint paint = new Paint(1);
        paint.setColor(j6.w0(null, j6.h5, false));
        frameLayout.addView(new r6(k0Var.getContext(), paint, k0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), x5.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(k0Var.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(j6.w0(null, j6.m6, false));
        frameLayout.addView(imageView, x5.e(24, 24, 17));
        x9 x9Var2 = new x9(k0Var.getContext());
        x9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(x9Var2, x5.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(k0Var.getContext());
        frameLayout2.addView(frameLayout, x5.e(-2, 60, 1));
        frameLayout2.setClipChildren(false);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(j6.w0(null, j6.j5, false));
        textView.setTextSize(1, 16.0f);
        frameLayout2.addView(textView, x5.t(-1, -2, 0, 24, 80, 24, 0));
        i9 i9Var = new i9((f6) null);
        TLRPC.Chat chat = MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(-k0Var.c0.replaceDialogId));
        i9Var.k(k0Var.currentAccount, chat);
        x9Var.e(chat, i9Var);
        i9 i9Var2 = new i9((f6) null);
        TLRPC.Chat chat2 = MessagesController.getInstance(k0Var.currentAccount).getChat(Long.valueOf(-k0Var.a0));
        i9Var2.k(k0Var.currentAccount, chat2);
        x9Var2.e(chat2, i9Var2);
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
        alertDialog$Builder2.n(frameLayout2);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new y(k0Var, i14));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new r9.i(i11));
        alertDialog$Builder2.o();
    }

    public static void W(k0 k0Var, View view) {
        int i10;
        HashSet hashSet = k0Var.y0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.r.a(hashSet.contains(currentChannel), true);
            k0Var.K1();
            return;
        }
        if (view instanceof f4) {
            if (k0Var.Y || !((i10 = k0Var.h0) == 11 || i10 == 34)) {
                f4 f4Var = (f4) view;
                Object object = f4Var.getObject();
                if (!f4Var.O) {
                    if (hashSet.contains(object)) {
                        hashSet.remove(object);
                    } else {
                        hashSet.add(object);
                    }
                    f4Var.c(hashSet.contains(object), true);
                    k0Var.K1();
                    return;
                }
                if (object instanceof TLRPC.User) {
                    long j3 = ((TLRPC.User) object).id;
                    int i11 = -k0Var.T0;
                    k0Var.T0 = i11;
                    AndroidUtilities.shakeViewSpring(f4Var, i11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String forcedFirstName = j3 >= 0 ? UserObject.getForcedFirstName(MessagesController.getInstance(k0Var.currentAccount).getUser(Long.valueOf(j3))) : "";
                    (MessagesController.getInstance(k0Var.currentAccount).premiumFeaturesBlocked() ? new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName))) : new yc((FrameLayout) k0Var.containerView, k0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new w(k0Var, 0))).j();
                }
            }
        }
    }

    public static androidx.emoji2.text.p u1(int i10, int i11) {
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

    public static boolean v1(int i10) {
        return i10 == 0 || i10 == 33 || i10 == 3 || i10 == 4 || i10 == 6 || i10 == 7 || i10 == 12 || i10 == 13 || i10 == 14 || i10 == 15 || i10 == 16;
    }

    public final boolean B1() {
        String str;
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.b0, this.c0.copy(), Long.valueOf(this.a0));
        di.d dVar = this.S0;
        if (dVar != null) {
            TLRPC.ChatFull t12 = t1();
            int max = Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0);
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
        j0 j0Var = this.d0;
        ug.b bVar = j0Var.c;
        int indexOfChild = j0Var.indexOfChild(j0Var.b);
        k0 k0Var = j0Var.e;
        if (k0Var.e0) {
            int indexOfChild2 = j0Var.indexOfChild(j0Var.d);
            j0Var.removeView(j0Var.d);
            j0Var.d.removeView(j0Var.a);
            j0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(j0Var.getContext());
            j0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            j0Var.d.setWeightSum(1.0f);
            j0Var.d.addView(j0Var.a, x5.o(-2, -2, 1.0f, 0));
            j0Var.d.addView(bVar, x5.t(-2, -2, 48, 0, 2, 0, 0));
            j0Var.addView(j0Var.d, indexOfChild2, x5.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = j0Var.indexOfChild(j0Var.a);
            j0Var.removeView(j0Var.a);
            TextView textView = new TextView(j0Var.getContext());
            j0Var.a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            j0Var.a.setTextSize(1, 20.0f);
            j0Var.a.setTextColor(j6.v0(j6.G6, k0Var.resourcesProvider));
            j0Var.a.setGravity(17);
            j0Var.addView(j0Var.a, indexOfChild3, x5.t(-2, -2, 1, 0, 22, 0, 0));
        }
        j0Var.removeView(j0Var.b);
        TextView textView2 = new TextView(j0Var.getContext());
        j0Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = j0Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), j0Var.b.getLineSpacingMultiplier() * 1.1f);
        j0Var.b.setGravity(1);
        j0Var.b.setTextColor(j6.v0(j6.G6, k0Var.resourcesProvider));
        j0Var.addView(j0Var.b, indexOfChild, x5.t(-2, -2, 1, 24, -2, 24, 17));
        this.d0.a.setText(r1());
        TextView textView4 = this.d0.b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean x12 = x1();
        int i10 = this.h0;
        if (i10 == 20) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(o1()));
        } else if (i10 == 24) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(o1()));
        } else if (i10 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i10 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i10 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i10 == 25) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i10 == 26) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i10 == 27) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i10 == 28) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(x12 ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i10 == 22) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i10 == 23) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else {
            str = null;
        }
        if (str == null) {
            str = q1(false);
        }
        textView4.setText(AndroidUtilities.replaceTags(str));
        K1();
        r00 r00Var = this.P0;
        r00Var.c(false);
        try {
            r00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.d0.c.a(this.c0.boostCount, true);
        this.d.x0(0);
        if (i10 == 32) {
            this.d0.c.setVisibility(8);
        }
        return true;
    }

    public final void D1(ArrayList arrayList) {
        int i10 = 0;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
        b2Var.R = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.v0) {
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.v0) {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new x(i10, this, arrayList));
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(j6.v0(j6.q7, this.resourcesProvider));
        }
    }

    public final void E1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.U0)) {
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
            str = this.U0;
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
        if (hashMap2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            e5.c0(this.currentAccount, arrayList3, 1, new org.telegram.ui.web.b1(this, 8));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            long longValue = hashMap2 == null ? 0L : ((Long) hashMap2.get(Long.valueOf(user2.id))).longValue();
            Iterator it3 = it2;
            SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str2, user2.id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            of2.payStars = longValue;
            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            if (of2.payStars > 0) {
                z10 = true;
            }
            hashMap2 = hashMap;
            it2 = it3;
        }
        if (!z10) {
            AndroidUtilities.runOnUIThread(new w(this, 2));
        }
        dismiss();
    }

    public final void F1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.b0 = tL_premium_boostsStatus;
        this.e0 = z10;
        M1();
    }

    @Override // org.telegram.ui.Components.bb
    public final void G(ov0 ov0Var) {
        int i10;
        Context context = ov0Var.getContext();
        di.d dVar = new di.d(context, this.resourcesProvider, true);
        this.G0 = dVar;
        dVar.setFlickeringLoading(true);
        this.G0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.G0.setOnClickListener(new u(this, 2));
        a0 a0Var = new a0(this, context, this.resourcesProvider);
        this.E0 = a0Var;
        z5.b(a0Var, 0.02f, 1.2f);
        if (!this.r && (i10 = this.h0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            t50 t50Var = new t50(this, context, 11);
            this.L0 = t50Var;
            t50Var.setBackgroundColor(j6.v0(j6.h5, this.resourcesProvider));
            ov0Var.addView(this.L0, x5.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        a0 a0Var2 = this.E0;
        float f7 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        ov0Var.addView(a0Var2, x5.d(-1, 48.0f, 80, f7, 0.0f, f7, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        ll0 ll0Var = this.d;
        ll0Var.setPadding(0, 0, 0, dp);
        ll0Var.setClipToPadding(false);
        ll0Var.setClipChildren(false);
        ll0Var.setOnItemClickListener(new bi.d(this, 16));
        ll0Var.setOnItemLongClickListener(new y(this, 2));
        this.E0.r.setOnClickListener(new wy0(16, this, context));
        this.E0.e.setOnClickListener(new u(this, 3));
        this.J0 = new qk0(ll0Var, true);
    }

    public final void G1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.c0 = canApplyBoost;
        K1();
        L1();
    }

    public final void H1(long j3) {
        this.a0 = j3;
        M1();
    }

    public final void I1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.O0 = chat;
        this.U0 = str;
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
        M1();
        K1();
        int i11 = this.h0;
        if ((i11 == 11 || i11 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.B0.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            a0 a0Var = this.E0;
            if (a0Var != null && a0Var.getParent() != null) {
                ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            }
            t50 t50Var = this.L0;
            if (t50Var != null && t50Var.getParent() != null) {
                ((ViewGroup) this.L0.getParent()).removeView(this.L0);
            }
            ll0 ll0Var = this.d;
            if (ll0Var != null) {
                ll0Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void J1() {
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
            int max = Math.max(10, peerColors != null ? peerColors.maxLevel(x1()) : 0);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            int max2 = Math.max(max, peerColors2 != null ? peerColors2.maxLevel(x1()) : 0);
            i12 = x1() ? Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
        }
        ArrayList arrayList = null;
        while (i11 <= i12) {
            boolean x12 = x1();
            ArrayList arrayList2 = new ArrayList();
            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
            if (messagesController2 != null) {
                if (!x12 && i11 >= messagesController2.channelAutotranslationLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                f0 b10 = f0.b(R.drawable.menu_feature_stories, i11, "BoostFeatureStoriesPerDay");
                b10.f = true;
                arrayList2.add(b10);
                if (!x12) {
                    f0 b11 = f0.b(R.drawable.menu_feature_reactions, i11, "BoostFeatureCustomReaction");
                    b11.f = true;
                    arrayList2.add(b11);
                }
                MessagesController.PeerColors peerColors3 = messagesController2.peerColors;
                int colorsAvailable = peerColors3 != null ? peerColors3.colorsAvailable(i11, false) : 0;
                MessagesController.PeerColors peerColors4 = messagesController2.profilePeerColors;
                int colorsAvailable2 = peerColors4 != null ? peerColors4.colorsAvailable(i11, x12) : 0;
                if (!x12 && colorsAvailable > 0) {
                    arrayList2.add(f0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!x12 && colorsAvailable > 0) {
                    arrayList2.add(f0.b(R.drawable.menu_feature_links, colorsAvailable, "BoostFeatureReplyColor"));
                }
                if (!x12 && i11 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (colorsAvailable2 > 0) {
                    arrayList2.add(f0.b(R.drawable.menu_feature_color_profile, colorsAvailable2, x12 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
                }
                if (x12 && i11 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!x12 && i11 >= messagesController2.channelProfileIconLevelMin) || (x12 && i11 >= messagesController2.groupProfileBgIconLevelMin)) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_cover, x12 ? R.string.BoostFeatureProfileIconGroup : R.string.BoostFeatureProfileIcon));
                }
                if (x12 && i11 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!x12 && i11 >= messagesController2.channelEmojiStatusLevelMin) || (x12 && i11 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new f0(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!x12 && i11 >= messagesController2.channelWallpaperLevelMin) || (x12 && i11 >= messagesController2.groupWallpaperLevelMin)) {
                    arrayList2.add(f0.b(R.drawable.menu_feature_wallpaper, 8, x12 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
                }
                if ((!x12 && i11 >= messagesController2.channelCustomWallpaperLevelMin) || (x12 && i11 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_custombg, x12 ? R.string.BoostFeatureCustomBackgroundGroup : R.string.BoostFeatureCustomBackground));
                }
                if (!x12 && i11 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(f0.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                while (i10 < arrayList.size()) {
                    f0 f0Var = (f0) arrayList.get(i10);
                    f0 f0Var2 = (f0) arrayList2.get(i10);
                    int i13 = f0Var.e;
                    i10 = (f0Var2 != null && ((f0Var.f && i13 > 2) || (f0Var.a == f0Var2.a && f0Var.b == f0Var2.b && TextUtils.equals(f0Var.c, f0Var2.c) && TextUtils.equals(f0Var.d, f0Var2.d) && i13 == f0Var2.e))) ? i10 + 1 : 0;
                }
                i11++;
            }
            ArrayList arrayList3 = this.u0;
            arrayList3.add(new e0(i11, arrayList3.isEmpty()));
            this.u0.addAll(arrayList2);
            arrayList = arrayList2;
            i11++;
        }
    }

    public final void K1() {
        if (this.j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i10 = this.h0;
        if (i10 != 19 && i10 != 32 && !y1()) {
            String str = null;
            HashSet hashSet = this.y0;
            if (i10 != 11 && i10 != 34) {
                if (hashSet.size() <= 0) {
                    a0 a0Var = this.E0;
                    a0Var.h = false;
                    a0Var.d(true);
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
            a0 a0Var2 = this.E0;
            if (a0Var2.G == null) {
                vq vqVar = new vq(a0Var2.getContext(), null);
                a0Var2.G = vqVar;
                vqVar.setGravity(3);
                vq vqVar2 = a0Var2.G;
                int i11 = j6.Oh;
                int i12 = j6.Sh;
                uq uqVar = vqVar2.a;
                uqVar.v = i11;
                uqVar.w = i12;
                uqVar.b = 0.8f;
                a0Var2.setClipChildren(false);
                a0Var2.addView(a0Var2.G, x5.e(-1, 24, 16));
            }
            if (!this.Y) {
                this.E0.b(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.E0.b(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.E0.b(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            this.E0.G.a.c(hashSet.size(), true);
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
            a0 a0Var3 = this.E0;
            a0Var3.h = false;
            a0Var3.d(true);
            return;
        }
        di.d dVar = this.S0;
        if (z10) {
            if (ug.t.i()) {
                this.E0.b(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                this.E0.b(LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel), true, true);
            }
            this.G0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
                return;
            }
            return;
        }
        if (canApplyBoost.isMaxLvl) {
            this.G0.g(LocaleController.getString(R.string.OK), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.E0.b(LocaleController.getString(R.string.OK), true, true);
            return;
        }
        if (ug.t.i()) {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.G0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            this.E0.b(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            return;
        }
        if (dVar != null) {
            dVar.g(LocaleController.getString(R.string.OK), true, true);
        }
        this.G0.g(LocaleController.getString(R.string.OK), true, true);
        this.E0.b(LocaleController.getString(R.string.OK), true, true);
    }

    public final void L1() {
        String string;
        if (this.j0) {
            this.E0.b(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i10 = this.h0;
        if (i10 == 19 || i10 == 32 || y1()) {
            if (!ug.t.i()) {
                this.E0.d.setText(LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel));
                return;
            }
            q0 q0Var = this.E0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.c0;
            if (canApplyBoost == null || !canApplyBoost.alreadyActive) {
                string = LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            } else {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            }
            q0Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.c0;
            if (canApplyBoost2 == null || !canApplyBoost2.isMaxLvl) {
                return;
            }
            this.E0.d.setText(LocaleController.getString(R.string.OK));
            return;
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new nq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.E0.d.setText(spannableStringBuilder);
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.N0) {
            this.E0.d.setText(LocaleController.getString(R.string.OK));
            a0 a0Var = this.E0;
            a0Var.w.p = null;
            a0Var.y.setVisibility(8);
            return;
        }
        this.E0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
        androidx.emoji2.text.p pVar = this.M0;
        if (pVar == null) {
            a0 a0Var2 = this.E0;
            a0Var2.w.p = null;
            a0Var2.y.setVisibility(8);
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
        a0 a0Var3 = this.E0;
        a0Var3.w.p = null;
        a0Var3.y.setVisibility(8);
    }

    public final void M1() {
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
            if (i10 != 19 || ChatObject.hasAdminRights(s1())) {
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
            J1();
            int i13 = this.k0;
            int i14 = i13 + 1;
            this.k0 = i14;
            this.t0 = i13;
            this.k0 = (this.u0.size() - 1) + i14;
        } else if (i10 == 31 || i10 == 32) {
            this.v = 0.24f;
            J1();
            int i15 = this.k0;
            this.o0 = i15;
            int i16 = i15 + 1;
            this.k0 = i16;
            this.t0 = i15;
            int size = (this.u0.size() - 1) + i16;
            this.k0 = size;
            this.p0 = size;
        } else if (!v1(i10)) {
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
        TLRPC.ChatFull t12;
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
            if (this.h0 == 32 && (t12 = t1()) != null) {
                t12.boosts_applied += intValue;
            }
            z1();
            F1(tL_premium_boostsStatus, this.e0);
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.c0;
            canApplyBoost.isMaxLvl = this.b0.next_level_boosts <= 0;
            canApplyBoost.boostedNow = true;
            canApplyBoost.setMyBoosts(tL_premium_myBoosts);
            if (B1()) {
                qc Q = new yc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                Q.j = 4000;
                Q.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        n2 n2Var = this.n;
        n2 lastFragment = n2Var.getParentLayout().getLastFragment();
        if (lastFragment instanceof ah.b0) {
            List fragmentStack = n2Var.getParentLayout().getFragmentStack();
            n2 n2Var2 = fragmentStack.size() >= 2 ? (n2) p6.g(2, fragmentStack) : null;
            n2 n2Var3 = fragmentStack.size() >= 3 ? (n2) p6.g(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (n2) p6.g(4, fragmentStack) : null;
            if (n2Var2 instanceof xo) {
                ((ActionBarLayout) n2Var.getParentLayout()).a0(n2Var2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                ug.j.f(n2Var3, chat, false);
                return;
            } else {
                if (n2Var3 instanceof ProfileActivity) {
                    ((ActionBarLayout) n2Var.getParentLayout()).a0(n2Var3, false);
                }
                lastFragment.finishFragment();
                ug.j.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof co) && booleanValue) {
            ug.j.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof bd) && booleanValue) {
            List fragmentStack2 = n2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                n2 n2Var4 = (n2) fragmentStack2.get(size);
                if ((n2Var4 instanceof co) || (n2Var4 instanceof uy)) {
                    r6 = n2Var4;
                    break;
                }
                arrayList.add(n2Var4);
            }
            if (r6 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ((ActionBarLayout) n2Var.getParentLayout()).a0((n2) obj, false);
            }
            n2Var.finishFragment();
            dismiss();
            ug.j.f(r6, chat, true);
            return;
        }
        if (!booleanValue) {
            pc pcVar = pc.F2;
            if (pcVar == null || !pcVar.d) {
                dismiss();
                ug.j.f(LaunchActivity.R(), chat, false);
                return;
            }
            co R9 = co.R9(-chat.id);
            LaunchActivity.R().presentFragment(R9, false, false);
            pc.x();
            dismiss();
            ug.j.f(R9, chat, false);
            return;
        }
        pc pcVar2 = pc.F2;
        if (pcVar2 != null && pcVar2.d) {
            co R92 = co.R9(-chat.id);
            LaunchActivity.R().presentFragment(R92, false, false);
            pc.x();
            dismiss();
            ug.j.f(R92, chat, true);
            return;
        }
        List fragmentStack3 = n2Var.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (n2) p6.g(2, fragmentStack3) : null;
        n2Var.finishFragment();
        dismiss();
        if (r6 instanceof co) {
            ug.j.f(r6, chat, true);
        }
    }

    public final void m1(final g90 g90Var, boolean z10) {
        if (!g90Var.c() || z10) {
            g90Var.setLoading(true);
            ChannelBoostsController boostsController = MessagesController.getInstance(this.currentAccount).getBoostsController();
            long j3 = this.a0;
            int i10 = this.c0.slot;
            final int i11 = 0;
            Utilities.Callback<TL_stories.TL_premium_myBoosts> callback = new Utilities.Callback(this) { // from class: sg.z
                public final /* synthetic */ k0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.a0, new s7(this.b, g90Var, (TL_stories.TL_premium_myBoosts) obj, 2));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            g90 g90Var2 = g90Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(19, this.b, g90Var2), intValue * 1000);
                                    break;
                                } else {
                                    ug.j.g(intValue);
                                }
                            }
                            g90Var2.setLoading(false);
                            break;
                    }
                }
            };
            final int i12 = 1;
            boostsController.applyBoost(j3, i10, callback, new Utilities.Callback(this) { // from class: sg.z
                public final /* synthetic */ k0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.a0, new s7(this.b, g90Var, (TL_stories.TL_premium_myBoosts) obj, 2));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            g90 g90Var2 = g90Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.web.g1(19, this.b, g90Var2), intValue * 1000);
                                    break;
                                } else {
                                    ug.j.g(intValue);
                                }
                            }
                            g90Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void n1() {
        if (this.G0.isAttachedToWindow()) {
            m1(this.G0, false);
            return;
        }
        di.d dVar = this.S0;
        if (dVar == null || !dVar.isAttachedToWindow()) {
            m1(this.E0, false);
        } else {
            m1(dVar, false);
        }
    }

    public int o1() {
        return 0;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostByChannelCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.boostedChannelByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didStartedMultiGiftsSelector);
    }

    public final String p1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.b0;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.b0.boost_url;
        }
        int i10 = this.currentAccount;
        long j3 = -this.a0;
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(j3));
        if (TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return a4.a.o(j3, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
    }

    public final String q1(boolean z10) {
        String str;
        if (this.h0 == 32) {
            TLRPC.Chat s12 = s1();
            TLRPC.ChatFull t12 = t1();
            return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), s12 == null ? "" : s12.title);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.a0));
        if (chat == null) {
            str = LocaleController.getString(x1() ? R.string.AccDescrGroup : R.string.AccDescrChannel);
        } else {
            str = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.b0;
        boolean z11 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (y1() && this.b0.next_level_boosts != 0 && z10) {
            int i10 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.b0;
            int i11 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i10, str, LocaleController.formatPluralString("MoreBoosts", i11, Integer.valueOf(i11)));
        }
        if (z11 && this.c0.alreadyActive) {
            if (this.b0.level == 1) {
                return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevel1 : R.string.ChannelBoostsJustReachedLevel1, new Object[0]);
            }
            return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.b0.level), LocaleController.formatPluralString("BoostStories", this.b0.level, new Object[0]));
        }
        if (this.c0.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.b0;
            if (tL_premium_boostsStatus3.level == 0) {
                int i12 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.b0;
                int i13 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i12, str, LocaleController.formatPluralString("MoreBoosts", i13, Integer.valueOf(i13)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.b0.level), LocaleController.formatPluralString("BoostStories", this.b0.level + 1, new Object[0]));
            }
            int i14 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.b0;
            int i15 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return LocaleController.formatString(i14, str, LocaleController.formatPluralString("MoreBoosts", i15, Integer.valueOf(i15)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.b0;
        if (tL_premium_boostsStatus6.level == 0) {
            int i16 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.b0;
            int i17 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return LocaleController.formatString(i16, str, LocaleController.formatPluralString("MoreBoosts", i17, Integer.valueOf(i17)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.b0.level), LocaleController.formatPluralString("BoostStories", this.b0.level + 1, new Object[0]));
        }
        int i18 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.b0;
        int i19 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return LocaleController.formatString(i18, str, LocaleController.formatPluralString("MoreBoosts", i19, Integer.valueOf(i19)));
    }

    public final String r1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.b0;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.c0.alreadyActive) {
            return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        boolean z10 = this.e0;
        int i10 = this.h0;
        if (!z10) {
            if (i10 == 32) {
                return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            }
            if (this.c0.alreadyActive) {
                return LocaleController.getString(x1() ? R.string.YouBoostedGroup : R.string.YouBoostedChannel);
            }
            return LocaleController.getString(x1() ? R.string.BoostingEnableStoriesForGroup : R.string.BoostingEnableStoriesForChannel);
        }
        if (i10 == 32) {
            return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.a0));
        if (this.c0.alreadyActive) {
            return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
        }
        return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
    }

    public final TLRPC.Chat s1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.a0));
    }

    public final TLRPC.ChatFull t1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.a0);
    }

    @Override // org.telegram.ui.Components.bb
    public final kl0 v(ll0 ll0Var) {
        return new d0(this);
    }

    public final boolean w1() {
        int i10 = this.h0;
        return i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 27 || i10 == 28 || i10 == 23 || i10 == 30 || i10 == 35;
    }

    public final boolean x1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.a0)));
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
                return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            case MessageObject.TYPE_GIFT_THEME_UPDATE /* 31 */:
                return LocaleController.getString(R.string.BoostingAdditionalFeaturesTitle);
            case 32:
                return LocaleController.getString(R.string.BoostGroup);
            default:
                return LocaleController.getString(R.string.LimitReached);
        }
    }

    public final boolean y1() {
        return w1() && ChatObject.hasAdminRights(s1());
    }

    public final void z1() {
        i0 i0Var = this.x0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.b0;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        i0Var.b++;
        i0Var.a = w7.p.a((i10 - r3) / i11, 0.0f, 1.0f);
        i0Var.W = true;
        i0Var.a0 = i0Var.n;
        i0Var.g(i10, true);
        i0Var.I.requestLayout();
        i0Var.requestLayout();
    }
}
