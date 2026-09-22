package rg;

import ai.g5;
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
import ci.s6;
import ci.s7;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.q3;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.s11;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.wq;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.bo;
import org.telegram.ui.rv0;
import org.telegram.ui.s50;
import org.telegram.ui.uy;
import org.telegram.ui.wo;
import org.telegram.ui.wy0;
import w7.x5;
import w7.z5;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class j0 extends za implements NotificationCenter.NotificationCenterDelegate {
    public static final /* synthetic */ int V0 = 0;
    public final ArrayList A0;
    public ArrayList B0;
    public ArrayList C0;
    public ArrayList D0;
    public z E0;
    public final TextView F0;
    public ci.d G0;
    public Runnable H0;
    public boolean I0;
    public qk0 J0;
    public final n2 K0;
    public s50 L0;
    public androidx.emoji2.text.o M0;
    public boolean N0;
    public TLRPC.Chat O0;
    public final r00 P0;
    public Runnable Q0;
    public int R0;
    public final ci.d S0;
    public int T0;
    public String U0;
    public int X;
    public boolean Y;
    public int Z;
    public long a0;
    public TL_stories.TL_premium_boostsStatus b0;
    public ChannelBoostsController.CanApplyBoost c0;
    public i0 d0;
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
    public h0 x0;
    public final HashSet y0;
    public final ArrayList z0;

    public j0(int i10, int i11, Context context, n2 n2Var, e6 e6Var) {
        super(context, n2Var, false, v1(i10), e6Var);
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
        fixNavigationBar(i6.v0(i6.h5, this.resourcesProvider));
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
            s50 s50Var = this.L0;
            if (s50Var != null) {
                ((ViewGroup) s50Var.getParent()).removeView(this.L0);
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
            textView.setTextColor(i6.v0(i6.Sh, e6Var));
            textView.setOnClickListener(new u(this, 0));
            int dp = AndroidUtilities.dp(8.0f);
            int v02 = i6.v0(i6.Oh, e6Var);
            int k10 = i0.a.k(i6.v0(i6.d6, e6Var), 120);
            textView.setBackground(i6.i0(dp, dp, dp, dp, v02, k10, k10));
        }
        if (i10 == 32) {
            ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            ci.d dVar = new ci.d(context, e6Var, true);
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
        j0 j0Var = new j0(32, n2Var.getCurrentAccount(), n2Var.getContext(), n2Var, n2Var.getResourceProvider());
        j0Var.G1(canApplyBoost);
        j0Var.F1(tL_premium_boostsStatus, true);
        j0Var.H1(j3);
        if (z10) {
            n2Var.showDialog(j0Var);
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
        ll0 ll0Var = j0Var.d;
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
            if (i13 >= ll0Var.getChildCount()) {
                i11 = 0;
                break;
            } else {
                if (ll0Var.getChildAt(i13) instanceof i0) {
                    i11 = ll0Var.getChildAt(i13).getTop();
                    break;
                }
                i13++;
            }
        }
        j0Var.M1();
        if (j0Var.l0 >= 0 && i11 != 0) {
            ((s4.c0) ll0Var.getLayoutManager()).h1(j0Var.l0 + 1, i11);
        }
        if (j0Var.M0 == null) {
            j0Var.M0 = u1(j0Var.h0, j0Var.currentAccount);
        }
        int max = Math.max(arrayList3.size(), j0Var.M0.b);
        h0 h0Var = j0Var.x0;
        if (h0Var != null) {
            h0Var.g(max, false);
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
            n2 n2Var = j0Var.K0;
            if (n2Var == null) {
                return;
            }
            l2 l2Var = new l2();
            l2Var.a = true;
            n2Var.showAsSheet(new PremiumPreviewFragment(0, "invite_privacy"), l2Var);
        } else if (i10 == 19 || i10 == 32 || j0Var.y1()) {
            ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.c0;
            if (canApplyBoost.canApply) {
                j0Var.E0.r.callOnClick();
                ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.c0;
                if (canApplyBoost2.alreadyActive && canApplyBoost2.boostedNow) {
                    AndroidUtilities.runOnUIThread(new w(j0Var, i11), canApplyBoost2.needSelector ? 300L : 0L);
                    return;
                }
                return;
            }
            if (canApplyBoost.alreadyActive && tg.t.i() && !j0Var.c0.isMaxLvl) {
                tg.k.i(j0Var.a0, j0Var);
                return;
            } else {
                j0Var.dismiss();
                return;
            }
        }
        if (i10 == 11 || i10 == 34) {
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
        if (i10 == 2) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                j0Var.i0.add((TLRPC.Chat) it.next());
            }
            j0Var.D1(arrayList);
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
            b2 b2Var = alertDialog$Builder.a;
            b2Var.R = formatPluralString;
            if (arrayList2.size() == 1) {
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChannelLeaveAlertWithName", R.string.ChannelLeaveAlertWithName, ((TLRPC.Chat) arrayList2.get(0)).title));
            } else {
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("ChatsLeaveAlert", R.string.ChatsLeaveAlert, new Object[0]));
            }
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.VoipGroupLeave), new org.telegram.ui.Components.s50(j0Var, arrayList2, user, 6));
            b2Var.show();
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(i6.v0(i6.q7, j0Var.resourcesProvider));
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
            AndroidUtilities.runOnUIThread(new s11(j0Var, arrayList, min, tL_messages_inactiveChats, 17));
        }
    }

    public static void V(j0 j0Var, Context context) {
        n2 n2Var = j0Var.K0;
        int i10 = j0Var.h0;
        if (i10 == 11 || i10 == 34) {
            return;
        }
        int i11 = 0;
        if (i10 != 19 && i10 != 32 && !j0Var.y1()) {
            if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
                AndroidUtilities.addToClipboard(j0Var.p1());
                j0Var.dismiss();
                return;
            }
            if (UserConfig.getInstance(j0Var.currentAccount).isPremium() || MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked() || j0Var.N0) {
                j0Var.dismiss();
                return;
            } else {
                if (n2Var == null) {
                    return;
                }
                if (n2Var.getVisibleDialog() != null) {
                    n2Var.getVisibleDialog().dismiss();
                }
                n2Var.presentFragment(new PremiumPreviewFragment(0, A1(i10)));
                j0Var.dismiss();
                return;
            }
        }
        ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.c0;
        if (canApplyBoost.empty) {
            if (UserConfig.getInstance(j0Var.currentAccount).isPremium() && tg.t.i()) {
                tg.k.i(j0Var.a0, j0Var);
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, j0Var.resourcesProvider);
            String string = LocaleController.getString(R.string.PremiumNeeded);
            b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(j0Var.x1() ? R.string.PremiumNeededForBoostingGroup : R.string.PremiumNeededForBoosting));
            alertDialog$Builder.k(LocaleController.getString(R.string.CheckPhoneNumberYes), new x(j0Var, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new r9.i(3));
            alertDialog$Builder.o();
            return;
        }
        boolean z10 = canApplyBoost.canApply;
        int i12 = 1;
        if (z10 && canApplyBoost.replaceDialogId == 0) {
            if (!canApplyBoost.needSelector || !tg.t.i()) {
                j0Var.n1();
                return;
            }
            j0Var.f0 = true;
            j0Var.x0.d0 = false;
            n2 n2Var2 = j0Var.n;
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = j0Var.c0;
            tg.t0 t0Var = new tg.t0(n2Var2, canApplyBoost2.myBoosts, canApplyBoost2.currentChat);
            t0Var.show();
            t0Var.setOnHideListener(new g5(j0Var, 9));
            return;
        }
        if (!z10) {
            int i13 = canApplyBoost.floodWait;
            if (i13 != 0) {
                tg.k.g(i13);
                return;
            }
            return;
        }
        FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
        u9 u9Var = new u9(j0Var.getContext());
        u9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(u9Var, x5.c(60.0f, 60));
        frameLayout.setClipChildren(false);
        Paint paint = new Paint(1);
        paint.setColor(i6.w0(null, i6.h5, false));
        frameLayout.addView(new s6(j0Var.getContext(), paint, j0Var.getContext().getDrawable(R.drawable.filled_limit_boost)), x5.d(28, 28.0f, 0, 34.0f, 34.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(j0Var.getContext());
        imageView.setImageResource(R.drawable.msg_arrow_avatar);
        imageView.setColorFilter(i6.w0(null, i6.m6, false));
        frameLayout.addView(imageView, x5.e(24, 24, 17));
        u9 u9Var2 = new u9(j0Var.getContext());
        u9Var2.setRoundRadius(AndroidUtilities.dp(30.0f));
        frameLayout.addView(u9Var2, x5.d(60, 60.0f, 0, 96.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout2 = new FrameLayout(j0Var.getContext());
        frameLayout2.addView(frameLayout, x5.e(-2, 60, 1));
        frameLayout2.setClipChildren(false);
        TextView textView = new TextView(context);
        textView.setLetterSpacing(0.025f);
        textView.setTextColor(i6.w0(null, i6.j5, false));
        textView.setTextSize(1, 16.0f);
        frameLayout2.addView(textView, x5.t(-1, -2, 0, 24, 80, 24, 0));
        f9 f9Var = new f9((e6) null);
        TLRPC.Chat chat = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.c0.replaceDialogId));
        f9Var.k(j0Var.currentAccount, chat);
        u9Var.e(chat, f9Var);
        f9 f9Var2 = new f9((e6) null);
        TLRPC.Chat chat2 = MessagesController.getInstance(j0Var.currentAccount).getChat(Long.valueOf(-j0Var.a0));
        f9Var2.k(j0Var.currentAccount, chat2);
        u9Var2.e(chat2, f9Var2);
        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context);
        alertDialog$Builder2.n(frameLayout2);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ReplaceBoostChannelDescription", R.string.ReplaceBoostChannelDescription, chat.title, chat2.title)));
        alertDialog$Builder2.k(LocaleController.getString(R.string.Replace), new x(j0Var, i12));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new r9.i(4));
        alertDialog$Builder2.o();
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
            j0Var.K1();
            return;
        }
        if (view instanceof g4) {
            if (j0Var.Y || !((i10 = j0Var.h0) == 11 || i10 == 34)) {
                g4 g4Var = (g4) view;
                Object object = g4Var.getObject();
                if (!g4Var.O) {
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
                    long j3 = ((TLRPC.User) object).id;
                    int i11 = -j0Var.T0;
                    j0Var.T0 = i11;
                    AndroidUtilities.shakeViewSpring(g4Var, i11);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    String forcedFirstName = j3 >= 0 ? UserObject.getForcedFirstName(MessagesController.getInstance(j0Var.currentAccount).getUser(Long.valueOf(j3))) : "";
                    (MessagesController.getInstance(j0Var.currentAccount).premiumFeaturesBlocked() ? new vc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName))) : new vc((FrameLayout) j0Var.containerView, j0Var.resourcesProvider).J(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, forcedFirstName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new w(j0Var, 0))).j();
                }
            }
        }
    }

    public static androidx.emoji2.text.o u1(int i10, int i11) {
        androidx.emoji2.text.o oVar = new androidx.emoji2.text.o();
        oVar.a = 0;
        oVar.d = null;
        oVar.e = null;
        oVar.f = null;
        oVar.b = 0;
        oVar.c = 0;
        if (i10 == 0) {
            oVar.b = MessagesController.getInstance(i11).dialogFiltersPinnedLimitDefault;
            oVar.c = MessagesController.getInstance(i11).dialogFiltersPinnedLimitPremium;
            oVar.a = R.drawable.msg_limit_pin;
            oVar.d = LocaleController.formatString("LimitReachedPinDialogs", R.string.LimitReachedPinDialogs, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedPinDialogsPremium", R.string.LimitReachedPinDialogsPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedPinDialogsLocked", R.string.LimitReachedPinDialogsLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 33) {
            oVar.b = MessagesController.getInstance(i11).savedDialogsPinnedLimitDefault;
            oVar.c = MessagesController.getInstance(i11).savedDialogsPinnedLimitPremium;
            oVar.a = R.drawable.msg_limit_pin;
            oVar.d = LocaleController.formatString(R.string.LimitReachedPinSavedDialogs, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString(R.string.LimitReachedPinSavedDialogsLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 2) {
            oVar.b = MessagesController.getInstance(i11).publicLinksLimitDefault;
            oVar.c = MessagesController.getInstance(i11).publicLinksLimitPremium;
            oVar.a = R.drawable.msg_limit_links;
            oVar.d = LocaleController.formatString("LimitReachedPublicLinks", R.string.LimitReachedPublicLinks, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedPublicLinksPremium", R.string.LimitReachedPublicLinksPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedPublicLinksLocked", R.string.LimitReachedPublicLinksLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 12) {
            oVar.b = MessagesController.getInstance(i11).chatlistInvitesLimitDefault;
            oVar.c = MessagesController.getInstance(i11).chatlistInvitesLimitPremium;
            oVar.a = R.drawable.msg_limit_links;
            oVar.d = LocaleController.formatString("LimitReachedFolderLinks", R.string.LimitReachedFolderLinks, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedFolderLinksPremium", R.string.LimitReachedFolderLinksPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedFolderLinksLocked", R.string.LimitReachedFolderLinksLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 13) {
            oVar.b = MessagesController.getInstance(i11).chatlistJoinedLimitDefault;
            oVar.c = MessagesController.getInstance(i11).chatlistJoinedLimitPremium;
            oVar.a = R.drawable.msg_limit_folder;
            oVar.d = LocaleController.formatString("LimitReachedSharedFolders", R.string.LimitReachedSharedFolders, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedSharedFoldersPremium", R.string.LimitReachedSharedFoldersPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedSharedFoldersLocked", R.string.LimitReachedSharedFoldersLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 3) {
            oVar.b = MessagesController.getInstance(i11).dialogFiltersLimitDefault;
            oVar.c = MessagesController.getInstance(i11).dialogFiltersLimitPremium;
            oVar.a = R.drawable.msg_limit_folder;
            oVar.d = LocaleController.formatString("LimitReachedFolders", R.string.LimitReachedFolders, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedFoldersPremium", R.string.LimitReachedFoldersPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedFoldersLocked", R.string.LimitReachedFoldersLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 4) {
            oVar.b = MessagesController.getInstance(i11).dialogFiltersChatsLimitDefault;
            oVar.c = MessagesController.getInstance(i11).dialogFiltersChatsLimitPremium;
            oVar.a = R.drawable.msg_limit_chats;
            oVar.d = LocaleController.formatString("LimitReachedChatInFolders", R.string.LimitReachedChatInFolders, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedChatInFoldersPremium", R.string.LimitReachedChatInFoldersPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedChatInFoldersLocked", R.string.LimitReachedChatInFoldersLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 5) {
            oVar.b = MessagesController.getInstance(i11).channelsLimitDefault;
            oVar.c = MessagesController.getInstance(i11).channelsLimitPremium;
            oVar.a = R.drawable.msg_limit_groups;
            oVar.d = LocaleController.formatString("LimitReachedCommunities", R.string.LimitReachedCommunities, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedCommunitiesPremium", R.string.LimitReachedCommunitiesPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedCommunitiesLocked", R.string.LimitReachedCommunitiesLocked, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 6) {
            oVar.b = 100;
            oVar.c = 200;
            oVar.a = R.drawable.msg_limit_folder;
            oVar.d = LocaleController.formatString("LimitReachedFileSize", R.string.LimitReachedFileSize, "2 GB", "4 GB");
            oVar.e = LocaleController.formatString("LimitReachedFileSizePremium", R.string.LimitReachedFileSizePremium, "4 GB");
            oVar.f = LocaleController.formatString("LimitReachedFileSizeLocked", R.string.LimitReachedFileSizeLocked, "2 GB");
            return oVar;
        }
        if (i10 == 7) {
            oVar.b = 3;
            oVar.c = 4;
            oVar.a = R.drawable.msg_limit_accounts;
            oVar.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 3, Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedAccountsPremium", R.string.LimitReachedAccountsPremium, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 11) {
            oVar.b = 0;
            oVar.c = 0;
            oVar.a = R.drawable.msg_limit_links;
            oVar.d = LocaleController.formatString("LimitReachedAccounts", R.string.LimitReachedAccounts, 0, Integer.valueOf(oVar.c));
            oVar.e = "";
            oVar.f = "";
            return oVar;
        }
        if (i10 == 14) {
            oVar.b = MessagesController.getInstance(i11).storyExpiringLimitDefault;
            oVar.c = MessagesController.getInstance(i11).storyExpiringLimitPremium;
            oVar.a = R.drawable.msg_limit_stories;
            oVar.d = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2First", oVar.b) + "\n" + LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Second", oVar.c);
            oVar.e = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", oVar.c);
            oVar.f = LocaleController.formatPluralStringComma("LimitReachedStoriesCount2Premium", oVar.b);
            return oVar;
        }
        if (i10 == 15) {
            oVar.b = MessagesController.getInstance(i11).storiesSentWeeklyLimitDefault;
            oVar.c = MessagesController.getInstance(i11).storiesSentWeeklyLimitPremium;
            oVar.a = R.drawable.msg_limit_stories;
            oVar.d = LocaleController.formatString("LimitReachedStoriesWeekly", R.string.LimitReachedStoriesWeekly, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedStoriesWeeklyPremium", R.string.LimitReachedStoriesWeeklyPremium, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 == 16) {
            oVar.b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
            oVar.c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
            oVar.a = R.drawable.msg_limit_stories;
            oVar.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
            oVar.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.c));
            oVar.f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.b));
            return oVar;
        }
        if (i10 != 18 && i10 != 32 && i10 != 20 && i10 != 24 && i10 != 27 && i10 != 28 && i10 != 25 && i10 != 30 && i10 != 35 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 19 && i10 != 21 && i10 != 26) {
            return oVar;
        }
        oVar.b = MessagesController.getInstance(i11).storiesSentMonthlyLimitDefault;
        oVar.c = MessagesController.getInstance(i11).storiesSentMonthlyLimitPremium;
        oVar.a = R.drawable.filled_limit_boost;
        oVar.d = LocaleController.formatString("LimitReachedStoriesMonthly", R.string.LimitReachedStoriesMonthly, Integer.valueOf(oVar.b), Integer.valueOf(oVar.c));
        oVar.e = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.c));
        oVar.f = LocaleController.formatString("LimitReachedStoriesMonthlyPremium", R.string.LimitReachedStoriesMonthlyPremium, Integer.valueOf(oVar.b));
        return oVar;
    }

    public static boolean v1(int i10) {
        return i10 == 0 || i10 == 33 || i10 == 3 || i10 == 4 || i10 == 6 || i10 == 7 || i10 == 12 || i10 == 13 || i10 == 14 || i10 == 15 || i10 == 16;
    }

    public final boolean B1() {
        String str;
        NotificationCenter.getInstance(this.currentAccount).postNotificationNameOnUIThread(NotificationCenter.chatWasBoostedByUser, this.b0, this.c0.copy(), Long.valueOf(this.a0));
        ci.d dVar = this.S0;
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
        i0 i0Var = this.d0;
        tg.b bVar = i0Var.c;
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
            i0Var.d.addView(i0Var.a, x5.o(-2, -2, 1.0f, 0));
            i0Var.d.addView(bVar, x5.t(-2, -2, 48, 0, 2, 0, 0));
            i0Var.addView(i0Var.d, indexOfChild2, x5.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = i0Var.indexOfChild(i0Var.a);
            i0Var.removeView(i0Var.a);
            TextView textView = new TextView(i0Var.getContext());
            i0Var.a = textView;
            textView.setTypeface(AndroidUtilities.bold());
            i0Var.a.setTextSize(1, 20.0f);
            i0Var.a.setTextColor(i6.v0(i6.G6, j0Var.resourcesProvider));
            i0Var.a.setGravity(17);
            i0Var.addView(i0Var.a, indexOfChild3, x5.t(-2, -2, 1, 0, 22, 0, 0));
        }
        i0Var.removeView(i0Var.b);
        TextView textView2 = new TextView(i0Var.getContext());
        i0Var.b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = i0Var.b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), i0Var.b.getLineSpacingMultiplier() * 1.1f);
        i0Var.b.setGravity(1);
        i0Var.b.setTextColor(i6.v0(i6.G6, j0Var.resourcesProvider));
        i0Var.addView(i0Var.b, indexOfChild, x5.t(-2, -2, 1, 24, -2, 24, 17));
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
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        String formatPluralString = LocaleController.formatPluralString("RevokeLinks", arrayList.size(), new Object[0]);
        b2 b2Var = alertDialog$Builder.a;
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
        alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new rv0(28, this, arrayList));
        b2Var.show();
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(i6.v0(i6.q7, this.resourcesProvider));
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
            c5.c0(this.currentAccount, arrayList3, 1, new org.telegram.ui.web.b1(this, 8));
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

    @Override // org.telegram.ui.Components.za
    public final void G(pv0 pv0Var) {
        int i10;
        Context context = pv0Var.getContext();
        ci.d dVar = new ci.d(context, this.resourcesProvider, true);
        this.G0 = dVar;
        dVar.setFlickeringLoading(true);
        this.G0.g(LocaleController.getString(R.string.BoostBtn), false, true);
        this.G0.setOnClickListener(new u(this, 2));
        z zVar = new z(this, context, this.resourcesProvider);
        this.E0 = zVar;
        z5.b(zVar, 0.02f, 1.2f);
        if (!this.r && (i10 = this.h0) != 18 && i10 != 20 && i10 != 24 && i10 != 25 && i10 != 26 && i10 != 29 && i10 != 22 && i10 != 23 && i10 != 21 && i10 != 27 && i10 != 28 && i10 != 30 && i10 != 35) {
            s50 s50Var = new s50(this, context, 11);
            this.L0 = s50Var;
            s50Var.setBackgroundColor(i6.v0(i6.h5, this.resourcesProvider));
            pv0Var.addView(this.L0, x5.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        z zVar2 = this.E0;
        float f7 = (this.backgroundPaddingLeft / AndroidUtilities.density) + 16.0f;
        pv0Var.addView(zVar2, x5.d(-1, 48.0f, 80, f7, 0.0f, f7, 12.0f));
        int dp = AndroidUtilities.dp(72.0f);
        ll0 ll0Var = this.d;
        ll0Var.setPadding(0, 0, 0, dp);
        ll0Var.setClipToPadding(false);
        ll0Var.setClipChildren(false);
        ll0Var.setOnItemClickListener(new ai.g(this, 16));
        ll0Var.setOnItemLongClickListener(new x(this, 2));
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
            z zVar = this.E0;
            if (zVar != null && zVar.getParent() != null) {
                ((ViewGroup) this.E0.getParent()).removeView(this.E0);
            }
            s50 s50Var = this.L0;
            if (s50Var != null && s50Var.getParent() != null) {
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
                    arrayList2.add(e0.a(R.drawable.menu_feature_translate, R.string.BoostFeatureAutotranslation));
                }
                e0 b10 = e0.b(R.drawable.menu_feature_stories, i11, "BoostFeatureStoriesPerDay");
                b10.f = true;
                arrayList2.add(b10);
                if (!x12) {
                    e0 b11 = e0.b(R.drawable.menu_feature_reactions, i11, "BoostFeatureCustomReaction");
                    b11.f = true;
                    arrayList2.add(b11);
                }
                MessagesController.PeerColors peerColors3 = messagesController2.peerColors;
                int colorsAvailable = peerColors3 != null ? peerColors3.colorsAvailable(i11, false) : 0;
                MessagesController.PeerColors peerColors4 = messagesController2.profilePeerColors;
                int colorsAvailable2 = peerColors4 != null ? peerColors4.colorsAvailable(i11, x12) : 0;
                if (!x12 && colorsAvailable > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_color_name, 7, "BoostFeatureNameColor"));
                }
                if (!x12 && colorsAvailable > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_links, colorsAvailable, "BoostFeatureReplyColor"));
                }
                if (!x12 && i11 >= messagesController2.channelBgIconLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_links2, R.string.BoostFeatureReplyIcon));
                }
                if (colorsAvailable2 > 0) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_color_profile, colorsAvailable2, x12 ? "BoostFeatureProfileColorGroup" : "BoostFeatureProfileColor"));
                }
                if (x12 && i11 >= messagesController2.groupEmojiStickersLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_pack, R.string.BoostFeatureCustomEmojiPack));
                }
                if ((!x12 && i11 >= messagesController2.channelProfileIconLevelMin) || (x12 && i11 >= messagesController2.groupProfileBgIconLevelMin)) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_cover, x12 ? R.string.BoostFeatureProfileIconGroup : R.string.BoostFeatureProfileIcon));
                }
                if (x12 && i11 >= messagesController2.groupTranscribeLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_voice, R.string.BoostFeatureVoiceToTextConversion));
                }
                if ((!x12 && i11 >= messagesController2.channelEmojiStatusLevelMin) || (x12 && i11 >= messagesController2.groupEmojiStatusLevelMin)) {
                    arrayList2.add(new e0(R.drawable.menu_feature_status, R.string.BoostFeatureEmojiStatuses, -1, "1000+", null));
                }
                if ((!x12 && i11 >= messagesController2.channelWallpaperLevelMin) || (x12 && i11 >= messagesController2.groupWallpaperLevelMin)) {
                    arrayList2.add(e0.b(R.drawable.menu_feature_wallpaper, 8, x12 ? "BoostFeatureBackgroundGroup" : "BoostFeatureBackground"));
                }
                if ((!x12 && i11 >= messagesController2.channelCustomWallpaperLevelMin) || (x12 && i11 >= messagesController2.groupCustomWallpaperLevelMin)) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_custombg, x12 ? R.string.BoostFeatureCustomBackgroundGroup : R.string.BoostFeatureCustomBackground));
                }
                if (!x12 && i11 >= messagesController2.channelRestrictSponsoredLevelMin) {
                    arrayList2.add(e0.a(R.drawable.menu_feature_noads, R.string.BoostFeatureSwitchOffAds));
                }
                Collections.reverse(arrayList2);
            }
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                while (i10 < arrayList.size()) {
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
                    z zVar = this.E0;
                    zVar.h = false;
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
            if (zVar2.G == null) {
                wq wqVar = new wq(zVar2.getContext(), null);
                zVar2.G = wqVar;
                wqVar.setGravity(3);
                wq wqVar2 = zVar2.G;
                int i11 = i6.Oh;
                int i12 = i6.Sh;
                vq vqVar = wqVar2.a;
                vqVar.v = i11;
                vqVar.w = i12;
                vqVar.b = 0.8f;
                zVar2.setClipChildren(false);
                zVar2.addView(zVar2.G, x5.e(-1, 24, 16));
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
            z zVar3 = this.E0;
            zVar3.h = false;
            zVar3.d(true);
            return;
        }
        ci.d dVar = this.S0;
        if (z10) {
            if (tg.t.i()) {
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
        if (tg.t.i()) {
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
            if (!tg.t.i()) {
                this.E0.d.setText(LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel));
                return;
            }
            o0 o0Var = this.E0.d;
            ChannelBoostsController.CanApplyBoost canApplyBoost = this.c0;
            if (canApplyBoost == null || !canApplyBoost.alreadyActive) {
                string = LocaleController.getString(x1() ? R.string.BoostGroup : R.string.BoostChannel);
            } else {
                string = LocaleController.getString(R.string.BoostingBoostAgain);
            }
            o0Var.setText(string);
            ChannelBoostsController.CanApplyBoost canApplyBoost2 = this.c0;
            if (canApplyBoost2 == null || !canApplyBoost2.isMaxLvl) {
                return;
            }
            this.E0.d.setText(LocaleController.getString(R.string.OK));
            return;
        }
        if (i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 23 || i10 == 21 || i10 == 27 || i10 == 28 || i10 == 30 || i10 == 35) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new oq(R.drawable.msg_copy_filled, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CopyLink));
            this.E0.d.setText(spannableStringBuilder);
            return;
        }
        if (UserConfig.getInstance(this.currentAccount).isPremium() || MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.N0) {
            this.E0.d.setText(LocaleController.getString(R.string.OK));
            z zVar = this.E0;
            zVar.w.p = null;
            zVar.y.setVisibility(8);
            return;
        }
        this.E0.d.setText(LocaleController.getString(R.string.IncreaseLimit));
        androidx.emoji2.text.o oVar = this.M0;
        if (oVar == null) {
            z zVar2 = this.E0;
            zVar2.w.p = null;
            zVar2.y.setVisibility(8);
            return;
        }
        int i11 = oVar.b;
        int i12 = i11 + 1;
        int i13 = oVar.c;
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
        zVar3.w.p = null;
        zVar3.y.setVisibility(8);
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
                oc Q = new vc(this.container, this.resourcesProvider).Q(R.raw.ic_boosts_replace, 30, LocaleController.formatPluralString("BoostingReassignedFromPlural", intValue, LocaleController.formatPluralString("BoostingFromOtherChannel", intValue2, new Object[0])));
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
        if (lastFragment instanceof zg.q) {
            List fragmentStack = n2Var.getParentLayout().getFragmentStack();
            n2 n2Var2 = fragmentStack.size() >= 2 ? (n2) q3.g(2, fragmentStack) : null;
            n2 n2Var3 = fragmentStack.size() >= 3 ? (n2) q3.g(3, fragmentStack) : null;
            r6 = fragmentStack.size() >= 4 ? (n2) q3.g(4, fragmentStack) : null;
            if (n2Var2 instanceof wo) {
                ((ActionBarLayout) n2Var.getParentLayout()).a0(n2Var2, false);
            }
            dismiss();
            if (!booleanValue) {
                lastFragment.finishFragment();
                tg.k.f(n2Var3, chat, false);
                return;
            } else {
                if (n2Var3 instanceof ProfileActivity) {
                    ((ActionBarLayout) n2Var.getParentLayout()).a0(n2Var3, false);
                }
                lastFragment.finishFragment();
                tg.k.f(r6, chat, true);
                return;
            }
        }
        if ((lastFragment instanceof bo) && booleanValue) {
            tg.k.f(lastFragment, chat, true);
            return;
        }
        if ((lastFragment instanceof ad) && booleanValue) {
            List fragmentStack2 = n2Var.getParentLayout().getFragmentStack();
            ArrayList arrayList = new ArrayList();
            for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                n2 n2Var4 = (n2) fragmentStack2.get(size);
                if ((n2Var4 instanceof bo) || (n2Var4 instanceof uy)) {
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
            tg.k.f(r6, chat, true);
            return;
        }
        if (!booleanValue) {
            ci.oc ocVar = ci.oc.F2;
            if (ocVar == null || !ocVar.d) {
                dismiss();
                tg.k.f(LaunchActivity.R(), chat, false);
                return;
            }
            bo R9 = bo.R9(-chat.id);
            LaunchActivity.R().presentFragment(R9, false, false);
            ci.oc.x();
            dismiss();
            tg.k.f(R9, chat, false);
            return;
        }
        ci.oc ocVar2 = ci.oc.F2;
        if (ocVar2 != null && ocVar2.d) {
            bo R92 = bo.R9(-chat.id);
            LaunchActivity.R().presentFragment(R92, false, false);
            ci.oc.x();
            dismiss();
            tg.k.f(R92, chat, true);
            return;
        }
        List fragmentStack3 = n2Var.getParentLayout().getFragmentStack();
        r6 = fragmentStack3.size() >= 2 ? (n2) q3.g(2, fragmentStack3) : null;
        n2Var.finishFragment();
        dismiss();
        if (r6 instanceof bo) {
            tg.k.f(r6, chat, true);
        }
    }

    public final void m1(final f90 f90Var, boolean z10) {
        if (!f90Var.c() || z10) {
            f90Var.setLoading(true);
            ChannelBoostsController boostsController = MessagesController.getInstance(this.currentAccount).getBoostsController();
            long j3 = this.a0;
            int i10 = this.c0.slot;
            final int i11 = 0;
            Utilities.Callback<TL_stories.TL_premium_myBoosts> callback = new Utilities.Callback(this) { // from class: rg.y
                public final /* synthetic */ j0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.a0, new s7(this.b, f90Var, (TL_stories.TL_premium_myBoosts) obj, 2));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            f90 f90Var2 = f90Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new p2.b(13, this.b, f90Var2), intValue * 1000);
                                    break;
                                } else {
                                    tg.k.g(intValue);
                                }
                            }
                            f90Var2.setLoading(false);
                            break;
                    }
                }
            };
            final int i12 = 1;
            boostsController.applyBoost(j3, i10, callback, new Utilities.Callback(this) { // from class: rg.y
                public final /* synthetic */ j0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            MessagesController.getInstance(r1.currentAccount).getBoostsController().getBoostsStats(r1.a0, new s7(this.b, f90Var, (TL_stories.TL_premium_myBoosts) obj, 2));
                            break;
                        default:
                            TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                            boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                            f90 f90Var2 = f90Var;
                            if (startsWith) {
                                int intValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                                if (intValue <= 5) {
                                    AndroidUtilities.runOnUIThread(new p2.b(13, this.b, f90Var2), intValue * 1000);
                                    break;
                                } else {
                                    tg.k.g(intValue);
                                }
                            }
                            f90Var2.setLoading(false);
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
        ci.d dVar = this.S0;
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
            return a4.a.p(j3, "https://t.me/boost/?c=");
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

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        return new c0(this);
    }

    public final boolean w1() {
        int i10 = this.h0;
        return i10 == 19 || i10 == 18 || i10 == 20 || i10 == 24 || i10 == 25 || i10 == 26 || i10 == 29 || i10 == 22 || i10 == 27 || i10 == 28 || i10 == 23 || i10 == 30 || i10 == 35;
    }

    public final boolean x1() {
        return !ChatObject.isChannelAndNotMegaGroup(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.a0)));
    }

    @Override // org.telegram.ui.Components.za
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
        h0 h0Var = this.x0;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.b0;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        h0Var.b++;
        h0Var.a = w7.p.a((i10 - r3) / i11, 0.0f, 1.0f);
        h0Var.W = true;
        h0Var.a0 = h0Var.n;
        h0Var.g(i10, true);
        h0Var.I.requestLayout();
        h0Var.requestLayout();
    }
}
