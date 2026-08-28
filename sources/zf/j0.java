package zf;

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
import bg.g2;
import g7.e6;
import g7.g6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kh.g7;
import kh.h6;
import kh.i9;
import kh.wb;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hq0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.Components.y01;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dy;
import org.telegram.ui.ei1;
import org.telegram.ui.ho;
import org.telegram.ui.qn;
import org.telegram.ui.xc;
import org.telegram.ui.yi0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class j0 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int R0 = 0;
    public y A0;
    public final TextView B0;
    public kh.d C0;
    public Runnable D0;
    public boolean E0;
    public dk0 F0;
    public final o2 G0;
    public yi0 H0;
    public androidx.emoji2.text.o I0;
    public boolean J0;
    public TLRPC.Chat K0;
    public final c00 L0;
    public Runnable M0;
    public int N0;
    public final kh.d O0;
    public int P0;
    public String Q0;
    public int T;
    public boolean U;
    public int V;
    public long W;
    public TL_stories.TL_premium_boostsStatus X;
    public ChannelBoostsController.CanApplyBoost Y;
    public i0 Z;
    public boolean a0;
    public boolean b0;
    public org.telegram.ui.Cells.t1 c0;
    public final int d0;
    public final ArrayList e0;
    public boolean f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public ArrayList q0;
    public boolean r0;
    public int s0;
    public h0 t0;
    public final HashSet u0;
    public final ArrayList v0;
    public final ArrayList w0;
    public ArrayList x0;
    public ArrayList y0;
    public ArrayList z0;

    public j0(int i9, int i10, Context context, o2 o2Var, b6 b6Var) {
        super(context, o2Var, false, v1(i9), false, 1, b6Var);
        this.V = -1;
        this.b0 = false;
        this.e0 = new ArrayList();
        this.h0 = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.s0 = -1;
        this.u0 = new HashSet();
        this.v0 = new ArrayList();
        this.w0 = new ArrayList();
        this.x0 = new ArrayList();
        this.y0 = new ArrayList();
        this.z0 = new ArrayList();
        this.E0 = false;
        this.N0 = 0;
        this.P0 = -4;
        fixNavigationBar(f6.v0(f6.h5, this.resourcesProvider));
        this.G0 = o2Var;
        this.currentAccount = i10;
        this.d0 = i9;
        M();
        M1();
        if (i9 == 2) {
            this.E0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new v(this, 0));
        } else if (i9 == 5) {
            this.E0 = true;
            M1();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new v(this, 2));
        }
        L1();
        if (i9 == 32 || w1()) {
            c00 c00Var = new c00(getContext());
            this.L0 = c00Var;
            this.container.addView(c00Var, e6.c(-1.0f, -1));
        }
        if (i9 == 18 || i9 == 20 || i9 == 24 || i9 == 25 || i9 == 26 || i9 == 29 || i9 == 22 || i9 == 23 || i9 == 21 || i9 == 27 || i9 == 28 || i9 == 30 || i9 == 35 || i9 == 31) {
            ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            yi0 yi0Var = this.H0;
            if (yi0Var != null) {
                ((ViewGroup) yi0Var.getParent()).removeView(this.H0);
            }
            this.d.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.B0 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(this.A0.getTextView().getText());
            textView.setTextColor(f6.v0(f6.Sh, b6Var));
            textView.setOnClickListener(new u(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = f6.v0(f6.Oh, b6Var);
            int k10 = i0.a.k(f6.v0(f6.d6, b6Var), 120);
            textView.setBackground(f6.i0(dp, dp, dp, dp, v02, k10, k10));
        }
        if (i9 == 32) {
            ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            kh.d dVar = new kh.d(context, b6Var, true);
            this.O0 = dVar;
            dVar.k();
            dVar.g(LocaleController.getString(R.string.BoostGroup), false, true);
            dVar.setOnClickListener(new u(this, 1));
            this.containerView.addView(dVar, e6.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.containerView.post(new w(this, 3));
        }
        if (i9 == 19 || i9 == 18) {
            this.containerView.post(new w(this, 4));
        }
    }

    public static String A1(int i9) {
        switch (i9) {
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

    public static void C1(o2 o2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChannelBoostsController.CanApplyBoost canApplyBoost, long j10, boolean z10) {
        if (tL_premium_boostsStatus == null || canApplyBoost == null || o2Var.getContext() == null) {
            return;
        }
        j0 j0Var = new j0(32, o2Var.getCurrentAccount(), o2Var.getContext(), o2Var, o2Var.getResourceProvider());
        j0Var.G1(canApplyBoost);
        j0Var.F1(tL_premium_boostsStatus, true);
        j0Var.H1(j10);
        if (z10) {
            o2Var.showDialog(j0Var);
        } else {
            j0Var.show();
        }
    }

    public static /* synthetic */ void O(j0 j0Var, ArrayList arrayList, TLRPC.User user) {
        j0Var.dismiss();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i9);
            MessagesController.getInstance(j0Var.currentAccount).putChat(chat, false);
            MessagesController.getInstance(j0Var.currentAccount).deleteParticipantFromChat(chat.id, user);
        }
    }

    public static /* synthetic */ void P(j0 j0Var, ArrayList arrayList) {
        j0Var.dismiss();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
            tL_channels_updateUsername.channel = MessagesController.getInputChannel((TLRPC.Chat) arrayList.get(i9));
            tL_channels_updateUsername.username = "";
            ConnectionsManager.getInstance(j0Var.currentAccount).sendRequest(tL_channels_updateUsername, new v(j0Var, 1), 64);
        }
    }

    public static void Q(j0 j0Var, ArrayList arrayList, int i9, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        int i10;
        wk0 wk0Var = j0Var.d;
        ArrayList arrayList2 = j0Var.w0;
        arrayList2.clear();
        ArrayList arrayList3 = j0Var.v0;
        arrayList3.clear();
        arrayList2.addAll(arrayList);
        for (int i11 = 0; i11 < i9; i11++) {
            arrayList3.add(tL_messages_inactiveChats.chats.get(i11));
        }
        j0Var.E0 = false;
        j0Var.F0.b(j0Var.j0 + 4);
        int i12 = 0;
        while (true) {
            if (i12 >= wk0Var.getChildCount()) {
                i10 = 0;
                break;
            } else {
                if (wk0Var.getChildAt(i12) instanceof i0) {
                    i10 = wk0Var.getChildAt(i12).getTop();
                    break;
                }
                i12++;
            }
        }
        j0Var.M1();
        if (j0Var.h0 >= 0 && i10 != 0) {
            ((f2.m0) wk0Var.getLayoutManager()).h1(j0Var.h0 + 1, i10);
        }
        if (j0Var.I0 == null) {
            j0Var.I0 = u1(j0Var.d0, j0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), j0Var.I0.b);
        h0 h0Var = j0Var.t0;
        if (h0Var != null) {
            h0Var.g(max, false);
            j0Var.t0.setBagePosition(max / j0Var.I0.c);
            h0 h0Var2 = j0Var.t0;
            h0Var2.D = true;
            h0Var2.requestLayout();
        }
    }

    public static void R(j0 j0Var) {
        int i9 = j0Var.d0;
        HashSet hashSet = j0Var.u0;
        int i10 = 1;
        if (j0Var.f0) {
            o2 o2Var = j0Var.G0;
            if (o2Var == null) {
                return;
            }
            m2 m2Var = new m2();
            m2Var.a = true;
            o2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), m2Var);
        } else if (i9 == 19 || i9 == 32 || j0Var.y1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.Y;
            if (canApplyBoost.canApply) {
                j0Var.A0.r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.Y;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    AndroidUtilities.runOnUIThread(new w(j0Var, i10), canApplyBoost2.needSelector ? 300L : 0L);
                    return;
                }
                return;
            }
            if (canApplyBoost.alreadyActive && bg.u0.i() && !j0Var.Y.isMaxLvl) {
                bg.u.i(j0Var.W, j0Var);
                return;
            } else {
                j0Var.dismiss();
                return;
            }
        }
        if (i9 == 11 || i9 == 34) {
            if (hashSet.isEmpty()) {
                j0Var.dismiss();
                return;
            } else {
                j0Var.E1(null);
                return;
            }
        }
        if (hashSet.isEmpty()) {
            return;
        }
        if (i9 == 2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                j0Var.e0.add((TLRPC.Chat) it.next());
            }
            j0Var.D1(arrayList);
            return;
        }
        if (i9 == 5) {
            TLRPC.User user = MessagesController.getInstance(j0Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(j0Var.currentAccount).getClientUserId()));
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList2.add((TLRPC.Chat) it2.next());
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j0Var.getContext(), 0, j0Var.resourcesProvider);
            String formatPluralString = LocaleController.formatPluralString("LeaveCommunities", arrayList2.size(), new Object[0]);
            c2 c2Var = alertDialog$Builder.a;
            c2Var.N = formatPluralString;
            if (arrayList2.size() == 1) {
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
            } else {
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new hq0(j0Var, arrayList2, user));
            c2Var.show();
            TextView textView = (TextView) c2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(f6.v0(f6.q7, j0Var.resourcesProvider));
            }
        }
    }

    public static /* synthetic */ void T(j0 j0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats = (TLRPC.TL_messages_inactiveChats) tLObject;
            ArrayList arrayList = new ArrayList();
            int min = Math.min(tL_messages_inactiveChats.chats.size(), tL_messages_inactiveChats.dates.size());
            for (int i9 = 0; i9 < min; i9++) {
                TLRPC.Chat chat = tL_messages_inactiveChats.chats.get(i9);
                int currentTime = (ConnectionsManager.getInstance(j0Var.currentAccount).getCurrentTime() - tL_messages_inactiveChats.dates.get(i9).intValue()) / 86400;
                String formatPluralString = currentTime < 30 ? LocaleController.formatPluralString("Days", currentTime, new Object[0]) : currentTime < 365 ? LocaleController.formatPluralString("Months", currentTime / 30, new Object[0]) : LocaleController.formatPluralString("Years", currentTime / 365, new Object[0]);
                if (ChatObject.isMegagroup(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                } else if (ChatObject.isChannel(chat)) {
                    arrayList.add(LocaleController.formatString("InactiveChannelSignature", R.string.InactiveChannelSignature, formatPluralString));
                } else {
                    arrayList.add(LocaleController.formatString("InactiveChatSignature", R.string.InactiveChatSignature, LocaleController.formatPluralString("Members", chat.participants_count, new Object[0]), formatPluralString));
                }
            }
            AndroidUtilities.runOnUIThread(new y01(j0Var, arrayList, min, tL_messages_inactiveChats, 16));
        }
    }

    public static void U(j0 j0Var, Context context) {
        o2 o2Var = j0Var.G0;
        int i9 = j0Var.d0;
        if (i9 == 11 || i9 == 34) {
            return;
        }
        int i10 = 18;
        int i11 = 19;
        if (i9 != 19 && i9 != 32 && !j0Var.y1()) {
            if (i9 == 18 || i9 == 20 || i9 == 24 || i9 == 25 || i9 == 26 || i9 == 29 || i9 == 22 || i9 == 23 || i9 == 21 || i9 == 27 || i9 == 28 || i9 == 30 || i9 == 35) {
                AndroidUtilities.addToClipboard(j0Var.p1());
                j0Var.dismiss();
                return;
            }
            if (UserConfig.getInstance(j0Var.currentAccount).isPremium() || MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked() || j0Var.J0) {
                j0Var.dismiss();
                return;
            } else {
                if (o2Var == null) {
                    return;
                }
                if (o2Var.getVisibleDialog() != null) {
                    o2Var.getVisibleDialog().dismiss();
                }
                o2Var.presentFragment(new PremiumPreviewFragment(0, A1(i9)));
                j0Var.dismiss();
                return;
            }
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.Y;
        int i12 = 1;
        if (canApplyBoost.empty) {
            if (UserConfig.getInstance(j0Var.currentAccount).isPremium() && bg.u0.i()) {
                bg.u.i(j0Var.W, j0Var);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, j0Var.resourcesProvider);
            String string = LocaleController.getString(R.string.PremiumNeeded);
            c2 c2Var = alertDialog$Builder.a;
            c2Var.N = string;
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(j0Var.x1() ? R.string.PremiumNeededForBoostingGroup : R.string.PremiumNeededForBoosting));
            alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new bg.e(j0Var, i12));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new v0.l(i10));
            alertDialog$Builder.o();
            return;
        }
        boolean z10 = canApplyBoost.canApply;
        if (z10 && canApplyBoost.replaceDialogId == 0) {
            if (!canApplyBoost.needSelector || !bg.u0.i()) {
                j0Var.n1();
                return;
            }
            j0Var.b0 = true;
            j0Var.t0.W = false;
            o2 o2Var2 = j0Var.n;
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.Y;
            g2 g2Var = new g2(o2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
            g2Var.show();
            g2Var.setOnHideListener(new eh.l(j0Var, 13));
            return;
        }
        if (!z10) {
            int i13 = canApplyBoost.floodWait;
            if (i13 != 0) {
                bg.u.g(i13);
                return;
            }
            return;
        }
        FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
        o9 o9Var = new o9(j0Var.getContext());
        o9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(o9Var, e6.c(60.0f, 60));
        frameLayout.setClipChildren(false);
        Paint paint = new Paint(1);
        paint.setColor(f6.w0(null, f6.h5, false));
        frameLayout.addView(new h6(j0Var.getContext(), paint, j0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), e6.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(j0Var.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(f6.w0(null, f6.m6, false));
        frameLayout.addView(imageView, e6.e(24, 24, 17));
        o9 o9Var2 = new o9(j0Var.getContext());
        o9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(o9Var2, e6.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(j0Var.getContext());
        frameLayout2.addView(frameLayout, e6.e(-2, 60, 1));
        frameLayout2.setClipChildren(false);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(f6.w0(null, f6.j5, false));
        textView.setTextSize(1, 16.0f);
        frameLayout2.addView(textView, e6.t(-1, -2, 0, 24, 80, 24, 0));
        z8 z8Var = new z8((b6) null);
        TLRPC.Chat chat = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.Y.replaceDialogId));
        z8Var.k(j0Var.currentAccount, chat);
        o9Var.e(chat, z8Var);
        z8 z8Var2 = new z8((b6) null);
        TLRPC.Chat chat2 = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.W));
        z8Var2.k(j0Var.currentAccount, chat2);
        o9Var2.e(chat2, z8Var2);
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
        alertDialog$Builder2.n(frameLayout2);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new bg.e(j0Var, 2));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new v0.l(i11));
        alertDialog$Builder2.o();
    }

    public static void V(j0 j0Var, View view) {
        int i9;
        HashSet hashSet = j0Var.u0;
        if (view instanceof org.telegram.ui.Cells.n) {
            org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
            TLRPC.Chat currentChannel = nVar.getCurrentChannel();
            if (hashSet.contains(currentChannel)) {
                hashSet.remove(currentChannel);
            } else {
                hashSet.add(currentChannel);
            }
            nVar.r.a(hashSet.contains(currentChannel), true);
            j0Var.K1();
            return;
        }
        if (view instanceof g4) {
            if (j0Var.U || !((i9 = j0Var.d0) == 11 || i9 == 34)) {
                g4 g4Var = (g4) view;
                Object object = g4Var.getObject();
                if (!g4Var.K) {
                    if (hashSet.contains(object)) {
                        hashSet.remove(object);
                    } else {
                        hashSet.add(object);
                    }
                    g4Var.c(hashSet.contains(object), true);
                    j0Var.K1();
                    return;
                }
                if (object instanceof TLRPC.User) {
                    long j10 = ((TLRPC.User) object).id;
                    int i10 = -j0Var.P0;
                    j0Var.P0 = i10;
                    AndroidUtilities.shakeViewSpring(g4Var, i10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String forcedFirstName = j10 >= 0 ? UserObject.getForcedFirstName(MessagesController.getInstance(j0Var.currentAccount).getUser(Long.valueOf(j10))) : "";
                    (MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked() ? new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName))) : new oc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new w(j0Var, 0))).j();
                }
            }
        }
    }

    public static androidx.emoji2.text.o u1(int i9, int i10) {
        androidx.emoji2.text.o oVar = new androidx.emoji2.text.o();
        oVar.a = 0;
        oVar.d = null;
        oVar.e = null;
        oVar.f = null;
        oVar.b = 0;
        oVar.c = 0;
        if (i9 == 0) {
            oVar.b = MessagesController.getInstance(i10).dialogFiltersPinnedLimitDefault;
            oVar.c = MessagesController.getInstance(i10).dialogFiltersPinnedLimitPremium;
            oVar.a = R.drawable.msg_limit_pin;
            oVar.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i9 == 33) {
            oVar.b = MessagesController.getInstance(i10).savedDialogsPinnedLimitDefault;
            oVar.c = MessagesController.getInstance(i10).savedDialogsPinnedLimitPremium;
            oVar.a = R.drawable.msg_limit_pin;
            oVar.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i9 == 2) {
            oVar.b = MessagesController.getInstance(i10).publicLinksLimitDefault;
            oVar.c = MessagesController.getInstance(i10).publicLinksLimitPremium;
            oVar.a = R.drawable.msg_limit_links;
            oVar.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i9 == 12) {
            oVar.b = MessagesController.getInstance(i10).chatlistInvitesLimitDefault;
            oVar.c = MessagesController.getInstance(i10).chatlistInvitesLimitPremium;
            oVar.a = R.drawable.msg_limit_links;
            oVar.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i9 == 13) {
            oVar.b = MessagesController.getInstance(i10).chatlistJoinedLimitDefault;
            oVar.c = MessagesController.getInstance(i10).chatlistJoinedLimitPremium;
            oVar.a = R.drawable.msg_limit_folder;
            oVar.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i9 == 3) {
            oVar.b = MessagesController.getInstance(i10).dialogFiltersLimitDefault;
            oVar.c = MessagesController.getInstance(i10).dialogFiltersLimitPremium;
            oVar.a = R.drawable.msg_limit_folder;
            oVar.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i9 == 4) {
            oVar.b = MessagesController.getInstance(i10).dialogFiltersChatsLimitDefault;
            oVar.c = MessagesController.getInstance(i10).dialogFiltersChatsLimitPremium;
            oVar.a = R.drawable.msg_limit_chats;
            oVar.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i9 == 5) {
            oVar.b = MessagesController.getInstance(i10).channelsLimitDefault;
            oVar.c = MessagesController.getInstance(i10).channelsLimitPremium;
            oVar.a = R.drawable.msg_limit_groups;
            oVar.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i9 == 6) {
            oVar.b = 100;
            oVar.c = 200;
            oVar.a = R.drawable.msg_limit_folder;
            oVar.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            oVar.e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            oVar.f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return oVar;
        }
        if (i9 == 7) {
            oVar.b = 3;
            oVar.c = 4;
            oVar.a = R.drawable.msg_limit_accounts;
            oVar.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i9 == 11) {
            oVar.b = 0;
            oVar.c = 0;
            oVar.a = R.drawable.msg_limit_links;
            oVar.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(oVar.c));
            oVar.e = "";
            oVar.f = "";
            return oVar;
        }
        if (i9 == 14) {
            oVar.b = MessagesController.getInstance(i10).storyExpiringLimitDefault;
            oVar.c = MessagesController.getInstance(i10).storyExpiringLimitPremium;
            oVar.a = R.drawable.msg_limit_stories;
            oVar.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", oVar.b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", oVar.c);
            oVar.e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", oVar.c);
            oVar.f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", oVar.b);
            return oVar;
        }
        if (i9 == 15) {
            oVar.b = MessagesController.getInstance(i10).storiesSentWeeklyLimitDefault;
            oVar.c = MessagesController.getInstance(i10).storiesSentWeeklyLimitPremium;
            oVar.a = R.drawable.msg_limit_stories;
            oVar.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i9 == 16) {
            oVar.b = MessagesController.getInstance(i10).storiesSentMonthlyLimitDefault;
            oVar.c = MessagesController.getInstance(i10).storiesSentMonthlyLimitPremium;
            oVar.a = R.drawable.msg_limit_stories;
            oVar.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i9 != 18 && i9 != 32 && i9 != 20 && i9 != 24 && i9 != 27 && i9 != 28 && i9 != 25 && i9 != 30 && i9 != 35 && i9 != 29 && i9 != 22 && i9 != 23 && i9 != 19 && i9 != 21 && i9 != 26) {
            return oVar;
        }
        oVar.b = MessagesController.getInstance(i10).storiesSentMonthlyLimitDefault;
        oVar.c = MessagesController.getInstance(i10).storiesSentMonthlyLimitPremium;
        oVar.a = R.drawable.filled_limit_boost;
        oVar.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
        oVar.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.c));
        oVar.f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.b));
        return oVar;
    }

    public static boolean v1(int i9) {
        return i9 == 0 || i9 == 33 || i9 == 3 || i9 == 4 || i9 == 6 || i9 == 7 || i9 == 12 || i9 == 13 || i9 == 14 || i9 == 15 || i9 == 16;
    }

    public final boolean B1() {
        String str;
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.X, this.Y.copy(), Long.valueOf(this.W));
        kh.d dVar = this.O0;
        if (dVar != null) {
            TLRPC.ChatFull t12 = t1();
            int max = Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0);
            if (max == 0) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.groupRestrictionsUnlockedByBoosts, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.o0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Z, transitionSet);
        i0 i0Var = this.Z;
        bg.c cVar = i0Var.c;
        int indexOfChild = i0Var.indexOfChild(i0Var.b);
        j0 j0Var = i0Var.e;
        if (j0Var.a0) {
            int indexOfChild2 = i0Var.indexOfChild(i0Var.d);
            i0Var.removeView(i0Var.d);
            i0Var.d.removeView(i0Var.a);
            i0Var.d.removeView(cVar);
            LinearLayout linearLayout = new LinearLayout(i0Var.getContext());
            i0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            i0Var.d.setWeightSum(1.0f);
            i0Var.d.addView(i0Var.a, e6.o(-2, -2, 1.0f, 0));
            i0Var.d.addView(cVar, e6.t(-2, -2, 48, 0, 2, 0, 0));
            i0Var.addView(i0Var.d, indexOfChild2, e6.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = i0Var.indexOfChild(i0Var.a);
            i0Var.removeView(i0Var.a);
            TextView textView = new TextView(i0Var.getContext());
            i0Var.a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            i0Var.a.setTextSize(1, 20.0f);
            i0Var.a.setTextColor(f6.v0(f6.G6, j0Var.resourcesProvider));
            i0Var.a.setGravity(17);
            i0Var.addView(i0Var.a, indexOfChild3, e6.t(-2, -2, 1, 0, 22, 0, 0));
        }
        i0Var.removeView(i0Var.b);
        TextView textView2 = new TextView(i0Var.getContext());
        i0Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = i0Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), i0Var.b.getLineSpacingMultiplier() * 1.1f);
        i0Var.b.setGravity(1);
        i0Var.b.setTextColor(f6.v0(f6.G6, j0Var.resourcesProvider));
        i0Var.addView(i0Var.b, indexOfChild, e6.t(-2, -2, 1, 24, -2, 24, 17));
        this.Z.a.setText(r1());
        TextView textView4 = this.Z.b;
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        boolean x12 = x1();
        int i9 = this.d0;
        if (i9 == 20) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForColorDescription : R.string.ChannelNeedBoostsForColorDescription, Integer.valueOf(o1()));
        } else if (i9 == 24) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileColorDescription : R.string.ChannelNeedBoostsForProfileColorDescription, Integer.valueOf(o1()));
        } else if (i9 == 29) {
            str = LocaleController.formatString(R.string.GroupNeedBoostsForCustomEmojiPackDescription, Integer.valueOf(messagesController.groupEmojiStickersLevelMin));
        } else if (i9 == 30) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForSwitchOffAdsDescription, Integer.valueOf(messagesController.channelRestrictSponsoredLevelMin));
        } else if (i9 == 35) {
            str = LocaleController.formatString(R.string.ChannelNeedBoostsForAutotranslationDescription, Integer.valueOf(messagesController.channelAutotranslationLevelMin));
        } else if (i9 == 25) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForEmojiStatusDescription : R.string.ChannelNeedBoostsForEmojiStatusDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i9 == 26) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWearCollectiblesDescription : R.string.ChannelNeedBoostsForWearCollectiblesDescription, Integer.valueOf(x12 ? messagesController.groupEmojiStatusLevelMin : messagesController.channelEmojiStatusLevelMin));
        } else if (i9 == 27) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForReplyIconDescription : R.string.ChannelNeedBoostsForReplyIconDescription, Integer.valueOf(messagesController.channelBgIconLevelMin));
        } else if (i9 == 28) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForProfileIconDescription : R.string.ChannelNeedBoostsForProfileIconDescription, Integer.valueOf(x12 ? messagesController.groupProfileBgIconLevelMin : messagesController.channelProfileIconLevelMin));
        } else if (i9 == 22) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForWallpaperDescription : R.string.ChannelNeedBoostsForWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupWallpaperLevelMin : messagesController.channelWallpaperLevelMin));
        } else if (i9 == 23) {
            str = LocaleController.formatString(x12 ? R.string.GroupNeedBoostsForCustomWallpaperDescription : R.string.ChannelNeedBoostsForCustomWallpaperDescription, Integer.valueOf(x12 ? messagesController.groupCustomWallpaperLevelMin : messagesController.channelCustomWallpaperLevelMin));
        } else {
            str = null;
        }
        if (str == null) {
            str = q1(false);
        }
        textView4.setText(AndroidUtilities.replaceTags(str));
        K1();
        c00 c00Var = this.L0;
        c00Var.c(false);
        try {
            c00Var.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Z.c.a(this.Y.boostCount, true);
        this.d.x0(0);
        if (i9 == 32) {
            this.Z.c.setVisibility(8);
        }
        return true;
    }

    public final void D1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        c2 c2Var = alertDialog$Builder.a;
        c2Var.N = formatPluralString;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.r0) {
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlertChannel", R.string.RevokeLinkAlertChannel, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            } else {
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinkAlert", R.string.RevokeLinkAlert, MessagesController.getInstance(this.currentAccount).linkPrefix + "/" + ChatObject.getPublicUsername(chat), chat.title));
            }
        } else if (this.r0) {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlertChannel", R.string.RevokeLinksAlertChannel, new Object[0]));
        } else {
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("RevokeLinksAlert", R.string.RevokeLinksAlert, new Object[0]));
        }
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new ei1(14, this, arrayList));
        c2Var.show();
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(f6.v0(f6.q7, this.resourcesProvider));
        }
    }

    public final void E1(HashMap hashMap) {
        String str;
        HashMap hashMap2 = hashMap;
        if (TextUtils.isEmpty(this.Q0)) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(this.currentAccount).getChatFull(this.K0.id);
            if (chatFull == null) {
                dismiss();
                return;
            }
            if (this.K0.username != null) {
                str = "@" + this.K0.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = chatFull.exported_invite;
                if (tL_chatInviteExported == null) {
                    dismiss();
                    return;
                }
                str = tL_chatInviteExported.link;
            }
        } else {
            str = this.Q0;
        }
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet = this.u0;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long sendPaidMessagesStars = MessagesController.getInstance(this.currentAccount).getSendPaidMessagesStars(user.id);
            if (sendPaidMessagesStars <= 0) {
                sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(MessagesController.getInstance(this.currentAccount).isUserContactBlocked(user.id));
            }
            (sendPaidMessagesStars >= 0 ? arrayList : arrayList2).add(user);
        }
        int i9 = 0;
        if (hashMap2 == null && !arrayList.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList.size();
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                arrayList3.add(Long.valueOf(((TLRPC.User) obj).id));
            }
            y4.c0(this.currentAccount, arrayList3, 1, new i9(this, 25));
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

    @Override // org.telegram.ui.Components.sa
    public final void F(xu0 xu0Var) {
        int i9;
        Context context = xu0Var.getContext();
        kh.d dVar = new kh.d(context, this.resourcesProvider, true);
        this.C0 = dVar;
        dVar.setFlickeringLoading(true);
        this.C0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.C0.setOnClickListener(new u(this, 2));
        y yVar = new y(this, context, this.resourcesProvider);
        this.A0 = yVar;
        g6.b(yVar, 0.02f, 1.2f);
        if (!this.r && (i9 = this.d0) != 18 && i9 != 20 && i9 != 24 && i9 != 25 && i9 != 26 && i9 != 29 && i9 != 22 && i9 != 23 && i9 != 21 && i9 != 27 && i9 != 28 && i9 != 30 && i9 != 35) {
            yi0 yi0Var = new yi0(this, context, 13);
            this.H0 = yi0Var;
            yi0Var.setBackgroundColor(f6.v0(f6.h5, this.resourcesProvider));
            xu0Var.addView(this.H0, e6.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        y yVar2 = this.A0;
        float f10 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        xu0Var.addView(yVar2, e6.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        wk0 wk0Var = this.d;
        wk0Var.setPadding(0, 0, 0, dp);
        wk0Var.setClipToPadding(false);
        wk0Var.setClipChildren(false);
        wk0Var.setOnItemClickListener(new eh.j(this, 23));
        wk0Var.setOnItemLongClickListener(new bg.e(this, 3));
        this.A0.r.setOnClickListener(new pf.v(7, this, context));
        this.A0.e.setOnClickListener(new u(this, 3));
        this.F0 = new dk0(wk0Var, true);
    }

    public final void F1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.X = tL_premium_boostsStatus;
        this.a0 = z10;
        M1();
    }

    public final void G1(ChannelBoostsController.CanApplyBoost canApplyBoost) {
        this.Y = canApplyBoost;
        K1();
        L1();
    }

    public final void H1(long j10) {
        this.W = j10;
        M1();
    }

    public final void I1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        this.K0 = chat;
        this.Q0 = str;
        this.U = !TextUtils.isEmpty(str) || ChatObject.canUserDoAdminAction(chat, 3);
        this.x0 = new ArrayList(arrayList);
        this.y0 = arrayList2;
        this.z0 = arrayList3;
        HashSet hashSet = this.u0;
        hashSet.clear();
        if (this.U) {
            ArrayList arrayList4 = this.x0;
            int size = arrayList4.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList4.get(i9);
                i9++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.id))) {
                    hashSet.add(user);
                }
            }
        }
        M1();
        K1();
        int i10 = this.d0;
        if ((i10 == 11 || i10 == 34) && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            if (((arrayList3 == null || arrayList3.isEmpty()) && (arrayList2 == null || arrayList2.size() < this.x0.size())) || arrayList3 == null || arrayList2 == null) {
                return;
            }
            if (!(arrayList3.size() == 1 && arrayList2.size() == 1) && arrayList2.size() < arrayList3.size()) {
                return;
            }
            y yVar = this.A0;
            if (yVar != null && yVar.getParent() != null) {
                ((ViewGroup) this.A0.getParent()).removeView(this.A0);
            }
            yi0 yi0Var = this.H0;
            if (yi0Var != null && yi0Var.getParent() != null) {
                ((ViewGroup) this.H0.getParent()).removeView(this.H0);
            }
            wk0 wk0Var = this.d;
            if (wk0Var != null) {
                wk0Var.setPadding(0, 0, 0, 0);
            }
        }
    }

    public final void J1() {
        int i9;
        this.q0 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        int i10 = tL_premium_boostsStatus != null ? tL_premium_boostsStatus.level + 1 : 1;
        if (this.d0 == 31) {
            i10 = 1;
        }
        MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
        int i11 = 10;
        if (messagesController != null) {
            MessagesController.PeerColors peerColors = messagesController.peerColors;
            int max = Math.max(10, peerColors != null ? peerColors.maxLevel(x1()) : 0);
            MessagesController.PeerColors peerColors2 = messagesController.profilePeerColors;
            int max2 = Math.max(max, peerColors2 != null ? peerColors2.maxLevel(x1()) : 0);
            i11 = x1() ? Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.groupTranscribeLevelMin), messagesController.groupWallpaperLevelMin), messagesController.groupCustomWallpaperLevelMin), messagesController.groupEmojiStatusLevelMin), messagesController.groupProfileBgIconLevelMin) : Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max2, messagesController.channelBgIconLevelMin), messagesController.channelProfileIconLevelMin), messagesController.channelEmojiStatusLevelMin), messagesController.channelWallpaperLevelMin), messagesController.channelCustomWallpaperLevelMin), messagesController.channelRestrictSponsoredLevelMin), messagesController.channelAutotranslationLevelMin);
        }
        ArrayList arrayList = null;
        while (i10 <= i11) {
            boolean x12 = x1();
            ArrayList arrayList2 = new ArrayList();
            MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
            if (messagesController2 != null) {
                if (!x12 && i10 >= messagesController2.channelAutotranslationLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                e0 b10 = e0.b(R.drawable.menu_feature_stories, i10, "BoostFeatureStoriesPerDay");
                b10.f = true;
                arrayList2.add(b10);
                if (!x12) {
                    e0 b11 = e0.b(R.drawable.menu_feature_reactions, i10, "BoostFeatureCustomReaction");
                    b11.f = true;
                    arrayList2.add(b11);
                }
                MessagesController.PeerColors peerColors3 = messagesController2.peerColors;
                int colorsAvailable = peerColors3 != null ? peerColors3.colorsAvailable(i10, false) : 0;
                MessagesController.PeerColors peerColors4 = messagesController2.profilePeerColors;
                int colorsAvailable2 = peerColors4 != null ? peerColors4.colorsAvailable(i10, x12) : 0;
                if (!x12 && colorsAvailable > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!x12 && colorsAvailable > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_links, colorsAvailable, "BoostFeatureReplyColor"));
                }
                if (!x12 && i10 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (colorsAvailable2 > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_color_profile, colorsAvailable2, x12 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
                }
                if (x12 && i10 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!x12 && i10 >= messagesController2.channelProfileIconLevelMin) || (x12 && i10 >= messagesController2.groupProfileBgIconLevelMin)) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_cover, x12 ? R.string.BoostFeatureProfileIconGroup : R.string.BoostFeatureProfileIcon));
                }
                if (x12 && i10 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!x12 && i10 >= messagesController2.channelEmojiStatusLevelMin) || (x12 && i10 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new e0(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!x12 && i10 >= messagesController2.channelWallpaperLevelMin) || (x12 && i10 >= messagesController2.groupWallpaperLevelMin)) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_wallpaper, 8, x12 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
                }
                if ((!x12 && i10 >= messagesController2.channelCustomWallpaperLevelMin) || (x12 && i10 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_custombg, x12 ? R.string.BoostFeatureCustomBackgroundGroup : R.string.BoostFeatureCustomBackground));
                }
                if (!x12 && i10 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                while (i9 < arrayList.size()) {
                    e0 e0Var = (e0) arrayList.get(i9);
                    e0 e0Var2 = (e0) arrayList2.get(i9);
                    int i12 = e0Var.e;
                    i9 = (e0Var2 != null && ((e0Var.f && i12 > 2) || (e0Var.a == e0Var2.a && e0Var.b == e0Var2.b && TextUtils.equals(e0Var.c, e0Var2.c) && TextUtils.equals(e0Var.d, e0Var2.d) && i12 == e0Var2.e))) ? i9 + 1 : 0;
                }
                i10++;
            }
            ArrayList arrayList3 = this.q0;
            arrayList3.add(new d0(i10, arrayList3.isEmpty()));
            this.q0.addAll(arrayList2);
            arrayList = arrayList2;
            i10++;
        }
    }

    public final void K1() {
        if (this.f0) {
            this.A0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i9 = this.d0;
        if (i9 != 19 && i9 != 32 && !y1()) {
            String str = null;
            HashSet hashSet = this.u0;
            if (i9 != 11 && i9 != 34) {
                if (hashSet.size() <= 0) {
                    y yVar = this.A0;
                    yVar.h = false;
                    yVar.d(true);
                    return;
                } else {
                    if (i9 == 2) {
                        str = LocaleController.formatPluralString("RevokeLinks", hashSet.size(), new Object[0]);
                    } else if (i9 == 5) {
                        str = LocaleController.formatPluralString("LeaveCommunities", hashSet.size(), new Object[0]);
                    }
                    this.A0.c(str, true, true);
                    return;
                }
            }
            y yVar2 = this.A0;
            if (yVar2.C == null) {
                mq mqVar = new mq(yVar2.getContext(), null);
                yVar2.C = mqVar;
                mqVar.setGravity(3);
                mq mqVar2 = yVar2.C;
                int i10 = f6.Oh;
                int i11 = f6.Sh;
                lq lqVar = mqVar2.a;
                lqVar.v = i10;
                lqVar.w = i11;
                lqVar.b = 0.8f;
                yVar2.setClipChildren(false);
                yVar2.addView(yVar2.C, e6.e(-1, 24, 16));
            }
            if (!this.U) {
                this.A0.c(LocaleController.getString(R.string.Close), true, true);
            } else if (hashSet.size() > 0) {
                this.A0.c(LocaleController.getString(R.string.SendInviteLink), true, true);
            } else {
                this.A0.c(LocaleController.getString(R.string.ActionSkip), true, true);
            }
            this.A0.C.a.c(hashSet.size(), true);
            this.A0.invalidate();
            return;
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
        boolean z10 = canApplyBoost.canApply;
        if ((z10 || canApplyBoost.empty) && !canApplyBoost.boostedNow && !canApplyBoost.alreadyActive) {
            if (canApplyBoost.isMaxLvl) {
                this.A0.c(LocaleController.getString(R.string.OK), true, true);
                return;
            }
            y yVar3 = this.A0;
            yVar3.h = false;
            yVar3.d(true);
            return;
        }
        kh.d dVar = this.O0;
        if (z10) {
            if (bg.u0.i()) {
                this.A0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            } else {
                this.A0.c(LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
                return;
            }
            return;
        }
        if (canApplyBoost.isMaxLvl) {
            this.C0.g(LocaleController.getString(R.string.OK), true, true);
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.OK), true, true);
            }
            this.A0.c(LocaleController.getString(R.string.OK), true, true);
            return;
        }
        if (bg.u0.i()) {
            if (dVar != null) {
                dVar.g(LocaleController.getString(R.string.BoostGroup), true, true);
            }
            this.C0.g(LocaleController.getString(R.string.BoostBtn), true, true);
            this.A0.c(LocaleController.getString(R.string.BoostingBoostAgain), true, true);
            return;
        }
        if (dVar != null) {
            dVar.g(LocaleController.getString(R.string.OK), true, true);
        }
        this.C0.g(LocaleController.getString(R.string.OK), true, true);
        this.A0.c(LocaleController.getString(R.string.OK), true, true);
    }

    public final void L1() {
        String string;
        if (this.f0) {
            this.A0.c(LocaleController.getString(R.string.InvitePremiumBlockedSubscribe), false, false);
            return;
        }
        int i9 = this.d0;
        if (i9 == 19 || i9 == 32 || y1()) {
            if (!bg.u0.i()) {
                this.A0.d.setText(LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel));
                return;
            }
            o0 o0Var = this.A0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
            if (canApplyBoost == null || !canApplyBoost.alreadyActive) {
                string = LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            } else {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            }
            o0Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.Y;
            if (canApplyBoost2 == null || !canApplyBoost2.isMaxLvl) {
                return;
            }
            this.A0.d.setText(LocaleController.getString(R.string.OK));
            return;
        }
        if (i9 == 18 || i9 == 20 || i9 == 24 || i9 == 25 || i9 == 26 || i9 == 29 || i9 == 22 || i9 == 23 || i9 == 21 || i9 == 27 || i9 == 28 || i9 == 30 || i9 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new eq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.A0.d.setText(spannableStringBuilder);
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.J0) {
            this.A0.d.setText(LocaleController.getString(R.string.OK));
            y yVar = this.A0;
            yVar.w.p = null;
            yVar.y.setVisibility(8);
            return;
        }
        this.A0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
        androidx.emoji2.text.o oVar = this.I0;
        if (oVar == null) {
            y yVar2 = this.A0;
            yVar2.w.p = null;
            yVar2.y.setVisibility(8);
            return;
        }
        int i10 = oVar.b;
        int i11 = i10 + 1;
        int i12 = oVar.c;
        if (i11 == i12) {
            this.A0.setIcon(R.raw.addone_icon);
            return;
        }
        if (i10 != 0 && i12 != 0) {
            float f10 = i12 / i10;
            if (f10 >= 1.6f && f10 <= 2.5f) {
                this.A0.setIcon(R.raw.double_icon);
                return;
            }
        }
        y yVar3 = this.A0;
        yVar3.w.p = null;
        yVar3.y.setVisibility(8);
    }

    public final void M1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.i0 = -1;
        this.k0 = -1;
        this.l0 = -1;
        this.m0 = -1;
        this.V = -1;
        this.n0 = -1;
        this.p0 = -1;
        this.g0 = 1;
        this.h0 = 0;
        int i9 = this.d0;
        if (i9 == 19 || i9 == 18 || i9 == 20 || i9 == 24 || i9 == 27 || i9 == 28 || i9 == 22 || i9 == 23 || i9 == 25 || i9 == 26 || i9 == 29 || i9 == 21 || i9 == 30 || i9 == 35) {
            if (i9 != 19 || ChatObject.hasAdminRights(s1())) {
                this.v = 0.24f;
                int i10 = this.g0;
                this.g0 = i10 + 1;
                this.V = i10;
                if (MessagesController.getInstance(this.currentAccount).giveawayGiftsPurchaseAvailable) {
                    int i11 = this.g0;
                    this.g0 = i11 + 1;
                    this.o0 = i11;
                }
            }
            J1();
            int i12 = this.g0;
            int i13 = i12 + 1;
            this.g0 = i13;
            this.p0 = i12;
            this.g0 = (this.q0.size() - 1) + i13;
        } else if (i9 == 31 || i9 == 32) {
            this.v = 0.24f;
            J1();
            int i14 = this.g0;
            this.k0 = i14;
            int i15 = i14 + 1;
            this.g0 = i15;
            this.p0 = i14;
            int size = (this.q0.size() - 1) + i15;
            this.g0 = size;
            this.l0 = size;
        } else if (!v1(i9)) {
            if (i9 == 11 || i9 == 34) {
                this.v = 0.24f;
            } else {
                int i16 = this.g0;
                this.i0 = i16;
                this.g0 = i16 + 2;
                this.j0 = i16 + 1;
            }
            if (this.E0) {
                int i17 = this.g0;
                this.g0 = i17 + 1;
                this.m0 = i17;
            } else if (i9 != 11 || this.U) {
                if (i9 != 11 || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || ((((arrayList = this.z0) == null || arrayList.isEmpty()) && ((arrayList2 = this.y0) == null || arrayList2.size() < this.x0.size())) || (arrayList3 = this.z0) == null || arrayList3.size() != 1 || (arrayList4 = this.y0) == null || arrayList4.size() != 1 || !this.U)) {
                    int i18 = this.g0;
                    this.k0 = i18;
                    if (i9 == 11 || i9 == 34) {
                        this.g0 = this.x0.size() + i18;
                    } else if (i9 == 5) {
                        this.g0 = this.v0.size() + i18;
                    } else {
                        this.g0 = this.e0.size() + i18;
                    }
                    this.l0 = this.g0;
                }
                if (this.l0 - this.k0 > 1) {
                    int i19 = this.g0;
                    this.g0 = i19 + 1;
                    this.n0 = i19;
                }
            }
        }
        this.d.getAdapter().l();
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TLRPC.ChatFull t12;
        if (i9 != NotificationCenter.boostByChannelCreated) {
            if (i9 != NotificationCenter.boostedChannelByUser) {
                if (i9 == NotificationCenter.didStartedMultiGiftsSelector) {
                    dismiss();
                    return;
                }
                return;
            }
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus == null || this.Y == null) {
                return;
            }
            this.X.boosts += intValue;
            if (this.d0 == 32 && (t12 = t1()) != null) {
                t12.boosts_applied += intValue;
            }
            z1();
            F1(tL_premium_boostsStatus, this.a0);
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.Y;
            canApplyBoost.isMaxLvl = this.X.next_level_boosts <= 0;
            canApplyBoost.boostedNow = true;
            canApplyBoost.setMyBoosts(tL_premium_myBoosts);
            if (B1()) {
                gc Q = new oc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
                Q.j = 4000;
                Q.k(true);
                return;
            }
            return;
        }
        TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
        boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
        o2 o2Var = this.n;
        o2 lastFragment = o2Var.getParentLayout().getLastFragment();
        if (lastFragment instanceof hg.s) {
            List fragmentStack = o2Var.getParentLayout().getFragmentStack();
            o2 o2Var2 = fragmentStack.size() >= 2 ? (o2) j3.r0.k(2, fragmentStack) : null;
            o2 o2Var3 = fragmentStack.size() >= 3 ? (o2) j3.r0.k(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (o2) j3.r0.k(4, fragmentStack) : null;
            if (o2Var2 instanceof ho) {
                ((ActionBarLayout) o2Var.getParentLayout()).a0(o2Var2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                bg.u.f(o2Var3, chat, false);
                return;
            } else {
                if (o2Var3 instanceof ProfileActivity) {
                    ((ActionBarLayout) o2Var.getParentLayout()).a0(o2Var3, false);
                }
                lastFragment.finishFragment();
                bg.u.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof qn) && booleanValue) {
            bg.u.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof xc) && booleanValue) {
            List fragmentStack2 = o2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                o2 o2Var4 = (o2) fragmentStack2.get(size);
                if ((o2Var4 instanceof qn) || (o2Var4 instanceof dy)) {
                    r6 = o2Var4;
                    break;
                }
                arrayList.add(o2Var4);
            }
            if (r6 == null) {
                return;
            }
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj = arrayList.get(i11);
                i11++;
                ((ActionBarLayout) o2Var.getParentLayout()).a0((o2) obj, false);
            }
            o2Var.finishFragment();
            dismiss();
            bg.u.f(r6, chat, true);
            return;
        }
        if (!booleanValue) {
            wb wbVar = wb.B2;
            if (wbVar == null || !wbVar.d) {
                dismiss();
                bg.u.f(LaunchActivity.R(), chat, false);
                return;
            }
            qn R9 = qn.R9(-chat.id);
            LaunchActivity.R().presentFragment(R9, false, false);
            wb.x();
            dismiss();
            bg.u.f(R9, chat, false);
            return;
        }
        wb wbVar2 = wb.B2;
        if (wbVar2 != null && wbVar2.d) {
            qn R92 = qn.R9(-chat.id);
            LaunchActivity.R().presentFragment(R92, false, false);
            wb.x();
            dismiss();
            bg.u.f(R92, chat, true);
            return;
        }
        List fragmentStack3 = o2Var.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (o2) j3.r0.k(2, fragmentStack3) : null;
        o2Var.finishFragment();
        dismiss();
        if (r6 instanceof qn) {
            bg.u.f(r6, chat, true);
        }
    }

    public final void m1(final o80 o80Var, boolean z10) {
        if (!o80Var.b() || z10) {
            o80Var.setLoading(true);
            ChannelBoostsController boostsController = MessagesController.getInstance(this.currentAccount).getBoostsController();
            long j10 = this.W;
            int i9 = this.Y.slot;
            final int i10 = 0;
            Utilities.Callback<TL_stories.TL_premium_myBoosts> callback = new Utilities.Callback(this) { // from class: zf.x
                public final /* synthetic */ j0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i10) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.W, new g7(this.b, o80Var, (TL_stories.TL_premium_myBoosts) obj, 2));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            o80 o80Var2 = o80Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new xf.o0(10, this.b, o80Var2), intValue * 1000);
                                    break;
                                } else {
                                    bg.u.g(intValue);
                                }
                            }
                            o80Var2.setLoading(false);
                            break;
                    }
                }
            };
            final int i11 = 1;
            boostsController.applyBoost(j10, i9, callback, new Utilities.Callback(this) { // from class: zf.x
                public final /* synthetic */ j0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.W, new g7(this.b, o80Var, (TL_stories.TL_premium_myBoosts) obj, 2));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            o80 o80Var2 = o80Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new xf.o0(10, this.b, o80Var2), intValue * 1000);
                                    break;
                                } else {
                                    bg.u.g(intValue);
                                }
                            }
                            o80Var2.setLoading(false);
                            break;
                    }
                }
            });
        }
    }

    public final void n1() {
        if (this.C0.isAttachedToWindow()) {
            m1(this.C0, false);
            return;
        }
        kh.d dVar = this.O0;
        if (dVar == null || !dVar.isAttachedToWindow()) {
            m1(this.A0, false);
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
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.X.boost_url;
        }
        int i9 = this.currentAccount;
        long j10 = -this.W;
        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(j10));
        if (TextUtils.isEmpty(ChatObject.getPublicUsername(chat))) {
            return aa.d.m(j10, "https://t.me/boost/?c=");
        }
        return "https://t.me/boost/" + ChatObject.getPublicUsername(chat);
    }

    public final String q1(boolean z10) {
        String str;
        if (this.d0 == 32) {
            TLRPC.Chat s12 = s1();
            TLRPC.ChatFull t12 = t1();
            return LocaleController.formatPluralString("BoostingRemoveRestrictionsSubtitle", Math.max(t12.boosts_unrestrict - t12.boosts_applied, 0), s12 == null ? "" : s12.title);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
        if (chat == null) {
            str = LocaleController.getString(x1() ? R.string.AccDescrGroup : R.string.AccDescrChannel);
        } else {
            str = chat.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        boolean z11 = tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts;
        if (y1() && this.X.next_level_boosts != 0 && z10) {
            int i9 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X;
            int i10 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return LocaleController.formatString(i9, str, LocaleController.formatPluralString("MoreBoosts", i10, Integer.valueOf(i10)));
        }
        if (z11 && this.Y.alreadyActive) {
            if (this.X.level == 1) {
                return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevel1 : R.string.ChannelBoostsJustReachedLevel1, new Object[0]);
            }
            return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level, new Object[0]));
        }
        if (this.Y.alreadyActive) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.X;
            if (tL_premium_boostsStatus3.level == 0) {
                int i11 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.X;
                int i12 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return LocaleController.formatString(i11, str, LocaleController.formatPluralString("MoreBoosts", i12, Integer.valueOf(i12)));
            }
            if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level + 1, new Object[0]));
            }
            int i13 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.X;
            int i14 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
            return LocaleController.formatString(i13, str, LocaleController.formatPluralString("MoreBoosts", i14, Integer.valueOf(i14)));
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.X;
        if (tL_premium_boostsStatus6.level == 0) {
            int i15 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.X;
            int i16 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
            return LocaleController.formatString(i15, str, LocaleController.formatPluralString("MoreBoosts", i16, Integer.valueOf(i16)));
        }
        if (tL_premium_boostsStatus6.next_level_boosts == 0) {
            return LocaleController.formatString(x1() ? R.string.GroupBoostsJustReachedLevelNext : R.string.ChannelBoostsJustReachedLevelNext, Integer.valueOf(this.X.level), LocaleController.formatPluralString("BoostStories", this.X.level + 1, new Object[0]));
        }
        int i17 = x1() ? R.string.GroupNeedBoostsDescriptionForNewFeatures : R.string.ChannelNeedBoostsDescriptionForNewFeatures;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.X;
        int i18 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
        return LocaleController.formatString(i17, str, LocaleController.formatPluralString("MoreBoosts", i18, Integer.valueOf(i18)));
    }

    public final String r1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return LocaleController.formatString("BoostsMaxLevelReached", R.string.BoostsMaxLevelReached, new Object[0]);
        }
        if (tL_premium_boostsStatus.level > 0 && !this.Y.alreadyActive) {
            return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        boolean z10 = this.a0;
        int i9 = this.d0;
        if (!z10) {
            if (i9 == 32) {
                return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            }
            if (this.Y.alreadyActive) {
                return LocaleController.getString(x1() ? R.string.YouBoostedGroup : R.string.YouBoostedChannel);
            }
            return LocaleController.getString(x1() ? R.string.BoostingEnableStoriesForGroup : R.string.BoostingEnableStoriesForChannel);
        }
        if (i9 == 32) {
            return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
        }
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
        if (this.Y.alreadyActive) {
            return LocaleController.formatString("YouBoostedChannel2", R.string.YouBoostedChannel2, chat.title);
        }
        return LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
    }

    public final TLRPC.Chat s1() {
        return MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W));
    }

    public final TLRPC.ChatFull t1() {
        return MessagesController.getInstance(this.currentAccount).getChatFull(-this.W);
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        return new c0(this);
    }

    public final boolean w1() {
        int i9 = this.d0;
        return i9 == 19 || i9 == 18 || i9 == 20 || i9 == 24 || i9 == 25 || i9 == 26 || i9 == 29 || i9 == 22 || i9 == 27 || i9 == 28 || i9 == 23 || i9 == 30 || i9 == 35;
    }

    public final boolean x1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.W)));
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        int i9 = this.d0;
        if (i9 == 11) {
            return LocaleController.getString(R.string.ChannelInviteViaLink2);
        }
        if (i9 == 34) {
            return LocaleController.getString(R.string.CallInviteViaLink);
        }
        if (i9 == 35) {
            return LocaleController.getString(R.string.UnlockBoostChannelFeatures);
        }
        switch (i9) {
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
        h0 h0Var = this.t0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X;
        int i9 = tL_premium_boostsStatus.boosts;
        int i10 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        h0Var.b++;
        h0Var.a = g7.n.a((i9 - r3) / i10, 0.0f, 1.0f);
        h0Var.S = true;
        h0Var.T = h0Var.n;
        h0Var.g(i9, true);
        h0Var.E.requestLayout();
        h0Var.requestLayout();
    }
}
