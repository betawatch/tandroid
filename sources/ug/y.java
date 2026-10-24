package ug;

import ai.ha;
import ai.j2;
import ai.s9;
import ai.sc;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.x4;
import com.google.android.gms.internal.play_billing.k3;
import gi.d3;
import gi.j4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.x2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c4;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.ur;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.e8;
import org.telegram.ui.Wallet.r1;
import org.telegram.ui.h20;
import org.telegram.ui.tm0;
import sg.m1;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class y extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List a0;
    public final TLRPC.Chat b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final ArrayList e0;
    public final ArrayList f0;
    public vg.b g0;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public int l0;
    public long m0;
    public int n0;
    public int o0;
    public long p0;
    public final wg.a q0;
    public n2.e r0;
    public int s0;
    public i t0;
    public final TL_stories.PrepaidGiveaway u0;
    public String v0;
    public boolean w0;
    public boolean x0;
    public final r y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(o2 o2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(o2Var, false);
        int i10 = 5;
        this.X = new ArrayList();
        this.Y = q.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.Z = q.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.a0 = Arrays.asList(750, 10000, 50000);
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        int i11 = wg.d.v;
        this.h0 = 2;
        this.i0 = 0;
        int i12 = wg.u.v;
        this.j0 = 0;
        this.l0 = 12;
        long time = new Date().getTime() + 259200000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i13 = calendar.get(12);
        while (i13 % 5 != 0) {
            i13++;
        }
        calendar.set(12, i13);
        this.m0 = calendar.getTimeInMillis();
        this.n0 = 2;
        this.o0 = 2;
        this.v0 = "";
        this.x0 = true;
        this.y0 = new r(this, 0);
        this.u0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        N();
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i14 = wg.d.v;
            this.h0 = 3;
        }
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.C = false;
        kVar.m = false;
        this.d.setItemAnimator(kVar);
        mm0 mm0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new x());
        this.d.setOnItemClickListener(new x4(23, this, o2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.b0 = chat;
        vg.b bVar = this.g0;
        ArrayList arrayList = this.X;
        mm0 mm0Var2 = this.d;
        s sVar = new s(this);
        s sVar2 = new s(this);
        s sVar3 = new s(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f = mm0Var2;
        bVar.h = sVar;
        bVar.n = sVar2;
        bVar.s = sVar3;
        a0(false, false);
        wg.a aVar = new wg.a(getContext(), this.resourcesProvider);
        this.q0 = aVar;
        aVar.setOnClickListener(new ur(this, prepaidGiveaway, j10, o2Var));
        Z(false);
        this.containerView.addView(aVar, z5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        q.j(this.currentAccount, chat, new t(this, i10));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(y yVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, o2 o2Var) {
        int i10;
        String str;
        ArrayList arrayList = yVar.e0;
        ArrayList arrayList2 = yVar.c0;
        TLRPC.Chat chat = yVar.b0;
        ArrayList arrayList3 = yVar.d0;
        ArrayList arrayList4 = yVar.f0;
        wg.a aVar = yVar.q0;
        if (aVar.a.Q) {
            return;
        }
        if (yVar.Y()) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            x2 x2Var = new x2(yVar, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, 8);
            o2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
            String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
            c2 c2Var = alertDialog$Builder.a;
            c2Var.R = string;
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new qg.g0(x2Var, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0.b(27));
            alertDialog$Builder.p();
            return;
        }
        int i11 = yVar.h0;
        int i12 = wg.d.v;
        int i13 = 3;
        if (i11 == 3) {
            Activity findActivity = AndroidUtilities.findActivity(yVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.J1;
            }
            if (findActivity == null || findActivity.isFinishing()) {
                return;
            }
            TL_stars.TL_starsGiveawayOption W = yVar.W(yVar.p0);
            int U = yVar.U();
            if (W == null) {
                return;
            }
            aVar.a.setLoading(true);
            int i14 = yVar.j0;
            int i15 = wg.u.v;
            boolean z10 = i14 == 1;
            ha y3 = ha.y(yVar.currentAccount, false);
            int i16 = 4;
            int l4 = q.l(yVar.m0);
            boolean z11 = yVar.x0;
            boolean z12 = yVar.w0;
            String str2 = yVar.v0;
            r1 r1Var = new r1(6, yVar, W);
            int i17 = y3.a;
            if (!MessagesController.getInstance(i17).starsPurchaseAvailable()) {
                o2 R2 = LaunchActivity.R();
                if (R2 == null || R2.getContext() == null) {
                    ha.e0(findActivity, null);
                    return;
                } else {
                    ha.e0(R2.getContext(), R2.getResourceProvider());
                    return;
                }
            }
            TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
            tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
            tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
            Activity activity = findActivity;
            tL_inputStorePaymentStarsGiveaway.stars = W.stars;
            MessagesController.getInstance(i17);
            tL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(chat);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 2;
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList2.get(i18);
                    i18++;
                    ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                    MessagesController.getInstance(i17);
                    arrayList5.add(MessagesController.getInputPeer((TLObject) obj));
                }
            }
            int size2 = arrayList.size();
            int i19 = 0;
            while (i19 < size2) {
                Object obj2 = arrayList.get(i19);
                i19++;
                tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj2)).iso2);
            }
            if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 4;
            }
            if (z12) {
                tL_inputStorePaymentStarsGiveaway.flags |= 16;
                tL_inputStorePaymentStarsGiveaway.prize_description = str2;
            }
            tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i17).getNextRandomId();
            tL_inputStorePaymentStarsGiveaway.until_date = l4;
            tL_inputStorePaymentStarsGiveaway.currency = W.currency;
            tL_inputStorePaymentStarsGiveaway.amount = W.amount;
            tL_inputStorePaymentStarsGiveaway.users = U;
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str = W.store_product) != null) {
                c5.a aVar2 = new c5.a();
                aVar2.b = "inapp";
                aVar2.a = str;
                BillingController.getInstance().queryProductDetails(Arrays.asList(aVar2.a()), new a1.d(y3, r1Var, tL_inputStorePaymentStarsGiveaway, activity, 2));
                return;
            }
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = d3.q(ha.I(), false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new j2(y3, r1Var, tL_inputInvoiceStars, i16));
            return;
        }
        int i20 = 2;
        int i21 = 16;
        int i22 = 24;
        if (yVar.i0 == 1) {
            ArrayList b10 = q.b(arrayList3.size(), arrayList4);
            for (int i23 = 0; i23 < b10.size(); i23++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i23);
                if (tL_premiumGiftCodeOption.months == yVar.l0 && arrayList3.size() > 0) {
                    if (q.h()) {
                        Context context = yVar.getContext();
                        g6 g6Var = yVar.resourcesProvider;
                        if (tL_premiumGiftCodeOption.store_product == null) {
                            ArrayList arrayList6 = new ArrayList();
                            int size3 = arrayList4.size();
                            int i24 = 0;
                            while (i24 < size3) {
                                Object obj3 = arrayList4.get(i24);
                                i24++;
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                    arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                }
                            }
                            String join = TextUtils.join(", ", arrayList6);
                            int i25 = tL_premiumGiftCodeOption.users;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, g6Var);
                            String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            c2 c2Var2 = alertDialog$Builder2.a;
                            c2Var2.R = string2;
                            c2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i25, join));
                            alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new s0.b(i22));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    aVar.b(true);
                    q.k(arrayList3, tL_premiumGiftCodeOption, yVar.b0, null, o2Var, new t(yVar, 0), new t(yVar, 1));
                    return;
                }
            }
            return;
        }
        ArrayList b11 = q.b(yVar.U(), arrayList4);
        for (int i26 = 0; i26 < b11.size(); i26++) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i26);
            if (tL_premiumGiftCodeOption3.months == yVar.l0) {
                if (q.h()) {
                    List list = yVar.Y;
                    Context context2 = yVar.getContext();
                    g6 g6Var2 = yVar.resourcesProvider;
                    t tVar = new t(yVar, i20);
                    if (tL_premiumGiftCodeOption3.store_product == null) {
                        ArrayList arrayList7 = new ArrayList();
                        int size4 = arrayList4.size();
                        int i27 = 0;
                        while (i27 < size4) {
                            Object obj4 = arrayList4.get(i27);
                            i27++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                            if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                arrayList7.add(tL_premiumGiftCodeOption4);
                            }
                        }
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                        int size5 = arrayList7.size();
                        int i28 = 0;
                        while (i28 < size5) {
                            Object obj5 = arrayList7.get(i28);
                            i28++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                            int i29 = tL_premiumGiftCodeOption3.users;
                            int i30 = tL_premiumGiftCodeOption6.users;
                            if (i29 > i30 && i30 > tL_premiumGiftCodeOption5.users) {
                                tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                            }
                        }
                        String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                        int i31 = tL_premiumGiftCodeOption3.users;
                        int i32 = tL_premiumGiftCodeOption5.users;
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, g6Var2);
                        String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                        c2 c2Var3 = alertDialog$Builder3.a;
                        c2Var3.R = string3;
                        c2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i31, formatPluralString, Integer.valueOf(i32)));
                        alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new e8(i21, tVar, tL_premiumGiftCodeOption5));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(i22));
                        alertDialog$Builder3.p();
                        return;
                    }
                }
                int i33 = yVar.j0;
                int i34 = wg.u.v;
                boolean z13 = i33 == 1;
                int l10 = q.l(yVar.m0);
                aVar.b(true);
                boolean z14 = yVar.x0;
                boolean z15 = yVar.w0;
                String str3 = yVar.v0;
                t tVar2 = new t(yVar, i13);
                t tVar3 = new t(yVar, 4);
                if (q.h()) {
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z13;
                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                    tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                    tL_inputStorePaymentPremiumGiveaway.until_date = l10;
                    int i35 = tL_inputStorePaymentPremiumGiveaway.flags;
                    tL_inputStorePaymentPremiumGiveaway.flags = i35 | 6;
                    if (z15) {
                        tL_inputStorePaymentPremiumGiveaway.flags = i35 | 22;
                    }
                    tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                    int size6 = arrayList2.size();
                    int i36 = 0;
                    while (i36 < size6) {
                        Object obj6 = arrayList2.get(i36);
                        i36++;
                        TLObject tLObject = (TLObject) obj6;
                        if (tLObject instanceof TLRPC.Chat) {
                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).id));
                        }
                    }
                    tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    int size7 = arrayList.size();
                    int i37 = 0;
                    while (i37 < size7) {
                        Object obj7 = arrayList.get(i37);
                        i37++;
                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                    }
                    c5.a aVar3 = new c5.a();
                    aVar3.b = "inapp";
                    aVar3.a = tL_premiumGiftCodeOption3.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(aVar3.a()), new org.telegram.ui.Components.c1(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, tVar3, tVar2, o2Var, 3));
                    return;
                }
                MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z13;
                tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                tL_inputStorePaymentPremiumGiveaway2.until_date = l10;
                int i38 = tL_inputStorePaymentPremiumGiveaway2.flags;
                tL_inputStorePaymentPremiumGiveaway2.flags = i38 | 6;
                if (z15) {
                    tL_inputStorePaymentPremiumGiveaway2.flags = i38 | 22;
                }
                tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                int size8 = arrayList2.size();
                int i39 = 0;
                while (i39 < size8) {
                    Object obj8 = arrayList2.get(i39);
                    int i40 = i39 + 1;
                    TLObject tLObject2 = (TLObject) obj8;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        i10 = i40;
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).id));
                    } else {
                        i10 = i40;
                    }
                    i39 = i10;
                }
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                int size9 = arrayList.size();
                int i41 = 0;
                while (i41 < size9) {
                    Object obj9 = arrayList.get(i41);
                    i41++;
                    tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                }
                tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                JSONObject q10 = d3.q(o2Var.getResourceProvider(), false);
                if (q10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = q10.toString();
                    tL_payments_getPaymentForm2.flags |= 1;
                }
                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                connectionsManager2.sendRequest(tL_payments_getPaymentForm2, new s9(tVar3, messagesController2, tL_inputInvoicePremiumGiftCode, o2Var, tVar2, 13));
                return;
            }
        }
    }

    public static void Q(y yVar, o2 o2Var, View view) {
        c5 c5Var;
        n2.e eVar;
        ArrayList arrayList = yVar.d0;
        r rVar = yVar.y0;
        if (view instanceof wg.y) {
            wg.y yVar2 = (wg.y) view;
            int type = yVar2.getType();
            boolean z10 = yVar2.e.h;
            boolean z11 = !z10;
            yVar2.setChecked(z11);
            int i10 = wg.y.L;
            if (type == 0) {
                yVar.x0 = z11;
                yVar.a0(false, false);
            } else if (type == 1) {
                yVar2.setDivider(z11);
                yVar.w0 = z11;
                yVar.a0(false, false);
                vg.b bVar = yVar.g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.e.size()) {
                        break;
                    }
                    vg.a aVar = (vg.a) bVar.e.get(i11);
                    if (aVar.a == 15) {
                        int i12 = aVar.l;
                        int i13 = wg.y.L;
                        if (i12 == 1) {
                            if (z10) {
                                bVar.u(i11 + 1);
                            } else {
                                bVar.o(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                yVar.g0.G();
                if (yVar.w0) {
                    AndroidUtilities.cancelRunOnUIThread(rVar);
                } else {
                    AndroidUtilities.runOnUIThread(rVar, 250L);
                }
            }
        }
        if (view instanceof wg.c) {
            if (view instanceof wg.d) {
                int selectedType = ((wg.d) view).getSelectedType();
                int i14 = wg.d.v;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && yVar.h0 == selectedType) {
                        n2.e eVar2 = yVar.r0;
                        if (eVar2 != null) {
                            ((x0) eVar2.b).V(1, arrayList);
                            ((l) eVar2.c).b.D(1);
                            return;
                        }
                        return;
                    }
                    yVar.h0 = selectedType;
                    yVar.a0(true, true);
                    yVar.Z(true);
                    yVar.N();
                } else if (selectedType == 1) {
                    n2.e eVar3 = yVar.r0;
                    if (eVar3 != null) {
                        ((x0) eVar3.b).V(1, arrayList);
                        ((l) eVar3.c).b.D(1);
                    }
                } else {
                    yVar.i0 = selectedType;
                    yVar.a0(true, true);
                    yVar.Z(true);
                    yVar.N();
                }
            } else {
                wg.c cVar = (wg.c) view;
                mm0 mm0Var = yVar.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < mm0Var.getChildCount(); i15++) {
                        View childAt = mm0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            ((wg.c) childAt).c(childAt == cVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof wg.u) {
            int selectedType2 = ((wg.u) view).getSelectedType();
            if (yVar.j0 == selectedType2 && (eVar = yVar.r0) != null) {
                ((x0) eVar.b).V(3, yVar.e0);
                ((l) eVar.c).b.D(1);
            }
            yVar.j0 = selectedType2;
            yVar.a0(false, false);
            return;
        }
        if (view instanceof wg.i) {
            yVar.l0 = ((TLRPC.TL_premiumGiftCodeOption) ((wg.i) view).getGifCode()).months;
            yVar.a0(false, false);
            yVar.g0.G();
            return;
        }
        if (!(view instanceof wg.h)) {
            if (view instanceof wg.b) {
                n2.e eVar4 = yVar.r0;
                if (eVar4 != null) {
                    ((x0) eVar4.b).V(2, yVar.c0);
                    ((l) eVar4.c).b.D(1);
                    return;
                }
                return;
            }
            if (!(view instanceof wg.w)) {
                if (view instanceof sc) {
                    yVar.k0 = true;
                    yVar.a0(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((wg.w) view).getOption();
            if (option != null) {
                yVar.p0 = option.stars;
                yVar.a0(true, true);
                yVar.Z(true);
                yVar.N();
                return;
            }
            return;
        }
        Context context = o2Var.getContext();
        long j10 = yVar.m0;
        s sVar = new s(yVar);
        g6 g6Var = yVar.resourcesProvider;
        c5 c5Var2 = new c5(g6Var);
        b3 b3Var = new b3(context, g6Var);
        b3Var.a();
        qd0 qd0Var = new qd0(context, g6Var);
        int i16 = c5Var2.a;
        qd0Var.setTextColor(i16);
        qd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        qd0Var.setItemCount(5);
        f fVar = new f(context, g6Var);
        fVar.setWrapSelectorWheel(true);
        fVar.setAllItemsCount(24);
        fVar.setItemCount(5);
        fVar.setTextColor(i16);
        fVar.setTextOffset(-AndroidUtilities.dp(10.0f));
        fVar.setTag("HOUR");
        g gVar = new g(context, g6Var);
        gVar.setWrapSelectorWheel(true);
        gVar.setAllItemsCount(60);
        gVar.setItemCount(5);
        gVar.setTextColor(i16);
        gVar.setTextOffset(-AndroidUtilities.dp(34.0f));
        c4 c4Var = new c4(context, c5Var2, qd0Var, fVar, gVar);
        c4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        c4Var.addView(frameLayout, z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        textView.setTextColor(i16);
        k3.m(20.0f, 1, textView);
        frameLayout.addView(textView, z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        c4Var.addView(linearLayout, z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        tm0 tm0Var = new tm0(context, 3);
        long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j11);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(qd0Var, z5.l(0.5f, 0, 270));
        qd0Var.setMinValue(0);
        qd0Var.setMaxValue(i18 - 1);
        qd0Var.setWrapSelectorWheel(false);
        qd0Var.setTag("DAY");
        qd0Var.setFormatter(new h20(currentTimeMillis, calendar, i17, 1));
        j4 j4Var = new j4(c4Var, fVar, gVar, i19, i20, qd0Var);
        qd0Var.setOnValueChangedListener(j4Var);
        fVar.setMinValue(0);
        fVar.setMaxValue(23);
        linearLayout.addView(fVar, z5.l(0.2f, 0, 270));
        fVar.setFormatter(new s0.b(25));
        fVar.setOnValueChangedListener(j4Var);
        gVar.setMinValue(0);
        gVar.setMaxValue(11);
        gVar.setValue(0);
        gVar.setFormatter(new s0.b(26));
        linearLayout.addView(gVar, z5.l(0.3f, 0, 270));
        gVar.setOnValueChangedListener(j4Var);
        if (j10 > 0) {
            c5Var = c5Var2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            gVar.setValue(calendar.get(12) / 5);
            fVar.setValue(calendar.get(11));
            qd0Var.setValue(timeInMillis);
            qd0Var.getValue();
            j4Var.n(qd0Var, qd0Var.getValue());
            fVar.getValue();
            j4Var.n(fVar, fVar.getValue());
        } else {
            c5Var = c5Var2;
        }
        tm0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        tm0Var.setGravity(17);
        tm0Var.setTextColor(c5Var.g);
        tm0Var.setTextSize(1, 14.0f);
        tm0Var.setTypeface(AndroidUtilities.bold());
        tm0Var.setBackground(a6.e(new float[]{8.0f}, c5Var.h));
        tm0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        c4Var.addView(tm0Var, z5.t(-1, 48, 83, 16, 15, 16, 16));
        tm0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, qd0Var, fVar, gVar, sVar, b3Var));
        b3Var.b(c4Var);
        h3 h3Var = b3Var.a;
        h3Var.show();
        int i21 = c5Var.b;
        h3Var.setBackgroundColor(i21);
        h3Var.fixNavigationBar(i21);
        AndroidUtilities.setLightStatusBar(h3Var, i0.a.h(i21) > 0.699999988079071d);
    }

    public static void R(y yVar) {
        m1 m1Var = new m1(yVar.n, yVar.currentAccount, null, yVar.resourcesProvider);
        int i10 = 1;
        m1Var.setOnDismissListener(new u(yVar, i10));
        m1Var.setOnShowListener(new v(yVar, i10));
        m1Var.show();
    }

    public static void S(y yVar) {
        m1 m1Var = new m1(yVar.n, yVar.currentAccount, null, yVar.resourcesProvider);
        int i10 = 0;
        m1Var.setOnDismissListener(new u(yVar, i10));
        m1Var.setOnShowListener(new v(yVar, i10));
        m1Var.show();
    }

    @Override // org.telegram.ui.Components.bb
    public final void C(Canvas canvas, int i10) {
        this.s0 = i10;
    }

    public final ArrayList T(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(j10);
        if (W != null) {
            for (int i10 = 0; i10 < W.winners.size(); i10++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = W.winners.get(i10);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int U() {
        int i10 = this.h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.n0)).intValue();
        }
        List X = X();
        int i12 = this.o0;
        if (i12 < 0 || i12 >= X.size()) {
            this.o0 = 0;
        }
        if (this.o0 >= X.size()) {
            return 0;
        }
        return ((Integer) X.get(this.o0)).intValue();
    }

    public final int V() {
        int U;
        int g10;
        int i10 = this.h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            U = ((Integer) this.Y.get(this.n0)).intValue();
            g10 = q.g();
        } else {
            TL_stars.TL_starsGiveawayOption W = W(this.p0);
            if (W != null) {
                return W.yearly_boosts;
            }
            U = U();
            g10 = q.g();
        }
        return g10 * U;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j10) {
        ArrayList v = ha.y(this.currentAccount, false).v();
        if (v == null) {
            return null;
        }
        for (int i10 = 0; i10 < v.size(); i10++) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i10);
            if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j10) {
                return tL_starsGiveawayOption;
            }
        }
        return null;
    }

    public final List X() {
        int i10 = this.h0;
        int i11 = wg.d.v;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(this.p0);
        if (W != null) {
            for (int i12 = 0; i12 < W.winners.size(); i12++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = W.winners.get(i12);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean Y() {
        return this.u0 != null;
    }

    public final void Z(boolean z10) {
        boolean Y = Y();
        wg.a aVar = this.q0;
        if (Y) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            } else {
                aVar.a(q.g() * prepaidGiveaway.quantity, z10);
                return;
            }
        }
        int i10 = this.i0;
        int i11 = wg.d.v;
        if (i10 == 0) {
            aVar.a(V(), z10);
            return;
        }
        ArrayList arrayList = this.d0;
        int g10 = q.g() * arrayList.size();
        boolean z11 = arrayList.size() > 0;
        aVar.e = true;
        ei.d dVar = aVar.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.i(LocaleController.getString(R.string.GiftPremium), z10, true);
        r6.i(k6.h5, aVar.b, aVar.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05b2  */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v19 */
    /* JADX WARN: Type inference failed for: r15v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v34 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a0(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        ?? r15;
        int i11;
        boolean z13;
        ?? r152;
        vg.b bVar;
        ?? r153;
        boolean z14;
        long longValue;
        ArrayList arrayList = this.X;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i12 = this.h0;
        int i13 = wg.d.v;
        boolean z15 = i12 == 3;
        vg.a aVar = new vg.a(0, false);
        aVar.g = z15;
        arrayList.add(aVar);
        boolean Y = Y();
        ArrayList arrayList3 = this.d0;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.u0;
        if (Y) {
            vg.a aVar2 = new vg.a(14, false);
            aVar2.f = prepaidGiveaway;
            arrayList.add(aVar2);
        } else {
            int size = arrayList3.size();
            vg.a aVar3 = new vg.a(2, this.h0 == 2);
            aVar3.l = 2;
            aVar3.i = size;
            aVar3.f = null;
            arrayList.add(aVar3);
            int size2 = arrayList3.size();
            vg.a aVar4 = new vg.a(2, this.h0 == 3);
            aVar4.l = 3;
            aVar4.i = size2;
            aVar4.f = null;
            arrayList.add(aVar4);
        }
        arrayList.add(new vg.a(4, false));
        TLRPC.Chat chat = this.b0;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        int i14 = this.h0;
        ArrayList arrayList4 = this.e0;
        ArrayList arrayList5 = this.c0;
        if (i14 == 3) {
            if (Y()) {
                z12 = isChannelAndNotMegaGroup;
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    this.p0 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                }
            } else {
                String string = LocaleController.getString(R.string.BoostingStarsOptions);
                int V = V();
                vg.a aVar5 = new vg.a(13, false);
                aVar5.c = string;
                aVar5.i = V;
                arrayList.add(aVar5);
                ArrayList v = ha.y(this.currentAccount, false).v();
                ArrayList arrayList6 = new ArrayList();
                if (v != null) {
                    int i15 = 0;
                    while (i15 < v.size()) {
                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i15);
                        boolean z16 = isChannelAndNotMegaGroup;
                        if (tL_starsGiveawayOption != null && !arrayList6.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                            arrayList6.add(Long.valueOf(tL_starsGiveawayOption.stars));
                        }
                        i15++;
                        isChannelAndNotMegaGroup = z16;
                    }
                }
                z12 = isChannelAndNotMegaGroup;
                int i16 = 0;
                for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                    TL_stars.TL_starsGiveawayOption W = W(((Long) arrayList6.get(i17)).longValue());
                    if (W.missingStorePrice) {
                        z14 = true;
                    } else {
                        z14 = true;
                        if (this.p0 == 0 && W.isDefault) {
                            this.p0 = W.stars;
                        }
                        if (!W.extended || this.k0) {
                            i16++;
                            int i18 = this.k0 ? i17 : i17 + 2;
                            long j10 = W.stars;
                            ArrayList T = T(j10);
                            if (T.isEmpty()) {
                                float f7 = j10;
                                ArrayList T2 = T(this.p0);
                                int i19 = this.o0;
                                if (i19 < 0 || i19 >= T2.size()) {
                                    this.o0 = 0;
                                }
                                longValue = Math.round(f7 / (this.o0 >= T2.size() ? 1L : ((Long) T2.get(this.o0)).longValue()));
                            } else {
                                longValue = ((Long) T.get(Utilities.clamp(this.o0, T.size() - 1, 0))).longValue();
                            }
                            arrayList.add(vg.a.d(W, i18, longValue, this.p0 == W.stars, true));
                        }
                    }
                }
                if (!this.k0 && i16 < arrayList6.size()) {
                    arrayList.add(new vg.a(18, false));
                }
                if (i16 <= 0) {
                    arrayList.add(vg.a.d(null, 0, 1L, false, true));
                    arrayList.add(vg.a.d(null, 1, 1L, false, true));
                    arrayList.add(vg.a.d(null, 2, 1L, false, false));
                }
                aVar5.i = V();
                arrayList.add(vg.a.c(LocaleController.getString(R.string.BoostingStarsOptionsInfo), false));
                List X = X();
                int i20 = this.o0;
                if (i20 < 0 || i20 >= X.size()) {
                    this.o0 = 0;
                }
                if (X.size() > 1) {
                    arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                    List X2 = X();
                    int i21 = this.o0;
                    vg.a aVar6 = new vg.a(5, false);
                    aVar6.k = X2;
                    aVar6.i = i21;
                    arrayList.add(aVar6);
                    arrayList.add(vg.a.c(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
                }
            }
            arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
            if (!Y()) {
                arrayList.add(vg.a.b(chat, V(), false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(vg.a.b(chat, prepaidGiveaway.quantity, false));
            } else {
                arrayList.add(vg.a.b(chat, q.g() * prepaidGiveaway.quantity, false));
            }
            int size3 = arrayList5.size();
            int i22 = 0;
            while (i22 < size3) {
                Object obj = arrayList5.get(i22);
                i22++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(vg.a.b((TLRPC.Chat) tLObject, V(), true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int V2 = V();
                    vg.a aVar7 = new vg.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = V2;
                    arrayList.add(aVar7);
                }
            }
            if (arrayList5.size() < q.f()) {
                r153 = 0;
                arrayList.add(new vg.a(8, false));
            } else {
                r153 = 0;
            }
            arrayList.add(vg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r153));
            arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
            int i23 = wg.u.v;
            arrayList.add(vg.a.e(r153, this.j0, true, arrayList4));
            arrayList.add(vg.a.e(1, this.j0, r153, arrayList4));
            arrayList.add(vg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r153));
        } else {
            z12 = isChannelAndNotMegaGroup;
            if (this.i0 == 0) {
                if (!Y()) {
                    String string2 = LocaleController.getString(R.string.BoostingQuantityPrizes);
                    int V3 = V();
                    vg.a aVar8 = new vg.a(13, false);
                    aVar8.c = string2;
                    aVar8.i = V3;
                    arrayList.add(aVar8);
                    int i24 = this.n0;
                    vg.a aVar9 = new vg.a(5, false);
                    aVar9.k = this.Y;
                    aVar9.i = i24;
                    arrayList.add(aVar9);
                    arrayList.add(vg.a.c(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (!Y()) {
                    arrayList.add(vg.a.b(chat, V(), false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(vg.a.b(chat, prepaidGiveaway.quantity, false));
                } else {
                    arrayList.add(vg.a.b(chat, q.g() * prepaidGiveaway.quantity, false));
                }
                int size4 = arrayList5.size();
                int i25 = 0;
                while (i25 < size4) {
                    Object obj2 = arrayList5.get(i25);
                    i25++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(vg.a.b((TLRPC.Chat) tLObject2, V(), true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int V4 = V();
                        vg.a aVar10 = new vg.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = V4;
                        arrayList.add(aVar10);
                    }
                }
                if (arrayList5.size() < q.f()) {
                    r15 = 0;
                    arrayList.add(new vg.a(8, false));
                } else {
                    r15 = 0;
                }
                arrayList.add(vg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r15));
                arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
                int i26 = wg.u.v;
                arrayList.add(vg.a.e(r15, this.j0, true, arrayList4));
                arrayList.add(vg.a.e(1, this.j0, r15, arrayList4));
                arrayList.add(vg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r15));
            }
            if (!Y()) {
                arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                int i27 = this.i0;
                int i28 = wg.d.v;
                ArrayList b10 = q.b(i27 == 0 ? U() : arrayList3.size(), this.f0);
                int i29 = 0;
                while (i29 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i29);
                    int i30 = tL_premiumGiftCodeOption.months;
                    int i31 = this.i0;
                    int i32 = wg.d.v;
                    int U = i31 == 0 ? U() : arrayList3.size();
                    long j11 = tL_premiumGiftCodeOption.amount;
                    int i33 = this.l0;
                    String str = tL_premiumGiftCodeOption.currency;
                    boolean z17 = i29 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    vg.a aVar11 = new vg.a(12, i30 == i33);
                    aVar11.i = i30;
                    aVar11.j = U;
                    aVar11.h = j11;
                    aVar11.g = z17;
                    aVar11.c = str;
                    aVar11.m = tL_premiumGiftCodeOption;
                    arrayList.add(aVar11);
                    i29++;
                    b10 = arrayList7;
                }
            }
            if (!Y()) {
                i10 = 3;
                arrayList.add(vg.a.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), k6.gc, 0, new r(this, i10), this.resourcesProvider), true));
                i11 = this.h0;
                int i34 = wg.d.v;
                if (i11 != i10 || this.i0 == 0) {
                    String string3 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
                    boolean z18 = this.w0;
                    int i35 = wg.y.L;
                    vg.a aVar12 = new vg.a(15, z18);
                    aVar12.c = string3;
                    aVar12.g = z18;
                    aVar12.l = 1;
                    arrayList.add(aVar12);
                    if (this.w0) {
                        z13 = false;
                        arrayList.add(vg.a.c(LocaleController.getString(this.h0 == 3 ? R.string.BoostingStarsGiveawayAdditionPrizeHint : R.string.BoostingGiveawayAdditionPrizeHint), false));
                    } else {
                        int U2 = Y() ? prepaidGiveaway.quantity : U();
                        z13 = false;
                        vg.a aVar13 = new vg.a(16, false);
                        aVar13.i = U2;
                        arrayList.add(aVar13);
                        String formatPluralString = LocaleController.formatPluralString("BoldMonths", this.l0, new Object[0]);
                        if (this.h0 == 3) {
                            if (this.v0.isEmpty()) {
                                arrayList.add(vg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.p0, new Object[0])), false));
                            } else {
                                arrayList.add(vg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.p0, Integer.valueOf(U2), this.v0)), false));
                            }
                        } else if (this.v0.isEmpty()) {
                            arrayList.add(vg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", U2, formatPluralString)), false));
                        } else {
                            arrayList.add(vg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", U2, this.v0, formatPluralString)), false));
                        }
                    }
                    arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
                    long j12 = this.m0;
                    vg.a aVar14 = new vg.a(10, z13);
                    aVar14.h = j12;
                    arrayList.add(aVar14);
                    if (this.h0 != 3) {
                        if (Y()) {
                            r152 = 0;
                            arrayList.add(vg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        } else {
                            r152 = 0;
                            arrayList.add(vg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", U(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        }
                    } else {
                        r152 = 0;
                        r152 = 0;
                        if (Y()) {
                            arrayList.add(vg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                        } else {
                            arrayList.add(vg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", U(), new Object[0]), false));
                        }
                    }
                    String string4 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
                    vg.a aVar15 = new vg.a(15, this.x0);
                    aVar15.c = string4;
                    aVar15.g = r152;
                    aVar15.l = r152;
                    arrayList.add(aVar15);
                    if (Y()) {
                        arrayList.add(vg.a.c(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r152));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                        sb2.append(this.h0 != 3 ? org.telegram.messenger.v0.h(R.string.BoostingStoriesFeaturesAndTerms, new StringBuilder("\n\n")) : "");
                        arrayList.add(vg.a.c(AndroidUtilities.replaceSingleTag(sb2.toString(), k6.gc, 0, new r(this, 4), this.resourcesProvider), true));
                    }
                }
                bVar = this.g0;
                if (bVar != null && z11) {
                    if (z10) {
                        bVar.l();
                        return;
                    } else {
                        bVar.E(arrayList2, arrayList);
                        return;
                    }
                }
                return;
            }
        }
        i10 = 3;
        i11 = this.h0;
        int i342 = wg.d.v;
        if (i11 != i10) {
        }
        String string32 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
        boolean z182 = this.w0;
        int i352 = wg.y.L;
        vg.a aVar122 = new vg.a(15, z182);
        aVar122.c = string32;
        aVar122.g = z182;
        aVar122.l = 1;
        arrayList.add(aVar122);
        if (this.w0) {
        }
        arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
        long j122 = this.m0;
        vg.a aVar142 = new vg.a(10, z13);
        aVar142.h = j122;
        arrayList.add(aVar142);
        if (this.h0 != 3) {
        }
        String string42 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
        vg.a aVar152 = new vg.a(15, this.x0);
        aVar152.c = string42;
        aVar152.g = r152;
        aVar152.l = r152;
        arrayList.add(aVar152);
        if (Y()) {
        }
        bVar = this.g0;
        if (bVar != null) {
            if (z10) {
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        mm0 mm0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (mm0Var = this.d) != null && mm0Var.G) {
            a0(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        i iVar = this.t0;
        if (iVar != null) {
            iVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 w(mm0 mm0Var) {
        vg.b bVar = new vg.b(this.resourcesProvider);
        this.g0 = bVar;
        return bVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence z() {
        int i10 = this.i0;
        int i11 = wg.d.v;
        return i10 == 1 ? LocaleController.getString(R.string.GiftPremium) : LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
