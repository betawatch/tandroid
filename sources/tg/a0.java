package tg;

import ai.n6;
import ai.s5;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.gd;
import com.google.android.gms.internal.vision.e2;
import ei.l3;
import ei.v4;
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
import org.telegram.messenger.t2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.c4;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dn0;
import org.telegram.ui.x20;
import w7.z5;
import yh.h7;
import yh.u5;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class a0 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List a0;
    public final TLRPC.Chat b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final ArrayList e0;
    public final ArrayList f0;
    public ug.b g0;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public int l0;
    public long m0;
    public int n0;
    public int o0;
    public long p0;
    public final vg.a q0;
    public o0.a r0;
    public int s0;
    public j t0;
    public final TL_stories.PrepaidGiveaway u0;
    public String v0;
    public boolean w0;
    public boolean x0;
    public final t y0;

    public a0(n2 n2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(n2Var, false);
        this.X = new ArrayList();
        this.Y = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.Z = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.a0 = Arrays.asList(750, 10000, 50000);
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        int i10 = vg.d.s;
        this.h0 = 2;
        this.i0 = 0;
        int i11 = vg.u.s;
        this.j0 = 0;
        this.l0 = 12;
        long time = new Date().getTime() + 259200000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i12 = calendar.get(12);
        while (i12 % 5 != 0) {
            i12++;
        }
        calendar.set(12, i12);
        this.m0 = calendar.getTimeInMillis();
        this.n0 = 2;
        this.o0 = 2;
        this.v0 = "";
        this.x0 = true;
        this.y0 = new t(this, 0);
        this.u0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        L();
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = vg.d.s;
            this.h0 = 3;
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(tr.h);
        jVar.C = false;
        jVar.m = false;
        this.d.setItemAnimator(jVar);
        zl0 zl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new z());
        this.d.setOnItemClickListener(new n6(23, this, n2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.b0 = chat;
        ug.b bVar = this.g0;
        ArrayList arrayList = this.X;
        zl0 zl0Var2 = this.d;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f = zl0Var2;
        bVar.h = uVar;
        bVar.n = uVar2;
        bVar.s = uVar3;
        Z(false, false);
        vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
        this.q0 = aVar;
        aVar.setOnClickListener(new mr(this, prepaidGiveaway, j3, n2Var));
        Y(false);
        this.containerView.addView(aVar, z5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.currentAccount, chat, new v(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void N(a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, n2 n2Var) {
        String str;
        int i10;
        String str2;
        ArrayList arrayList = a0Var.e0;
        ArrayList arrayList2 = a0Var.c0;
        TLRPC.Chat chat = a0Var.b0;
        ArrayList arrayList3 = a0Var.d0;
        ArrayList arrayList4 = a0Var.f0;
        vg.a aVar = a0Var.q0;
        if (aVar.a.N) {
            return;
        }
        if (a0Var.X()) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            t2 t2Var = new t2(a0Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j3, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, 8);
            n2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
            String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
            b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new r2.s(t2Var, 9));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0.b(27));
            alertDialog$Builder.o();
            return;
        }
        int i11 = a0Var.h0;
        int i12 = vg.d.s;
        int i13 = 3;
        String str3 = "inapp";
        if (i11 == 3) {
            Activity findActivity = AndroidUtilities.findActivity(a0Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            if (findActivity == null || findActivity.isFinishing()) {
                return;
            }
            TL_stars.TL_starsGiveawayOption U = a0Var.U(a0Var.p0);
            int S = a0Var.S();
            if (U == null) {
                return;
            }
            aVar.a.setLoading(true);
            int i14 = a0Var.j0;
            int i15 = vg.u.s;
            boolean z10 = i14 == 1;
            u5 y3 = u5.y(a0Var.currentAccount, false);
            int l4 = s.l(a0Var.m0);
            boolean z11 = a0Var.x0;
            boolean z12 = a0Var.w0;
            String str4 = a0Var.v0;
            ai.m0 m0Var = new ai.m0(21, a0Var, U);
            int i16 = y3.a;
            if (!MessagesController.getInstance(i16).starsPurchaseAvailable()) {
                n2 R2 = LaunchActivity.R();
                if (R2 == null || R2.getContext() == null) {
                    u5.e0(findActivity, null);
                    return;
                } else {
                    u5.e0(R2.getContext(), R2.getResourceProvider());
                    return;
                }
            }
            TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
            tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
            tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
            Activity activity = findActivity;
            tL_inputStorePaymentStarsGiveaway.stars = U.stars;
            MessagesController.getInstance(i16);
            tL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(chat);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 2;
                int size = arrayList2.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj = arrayList2.get(i17);
                    i17++;
                    ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                    MessagesController.getInstance(i16);
                    arrayList5.add(MessagesController.getInputPeer((TLObject) obj));
                }
            }
            int size2 = arrayList.size();
            int i18 = 0;
            while (i18 < size2) {
                Object obj2 = arrayList.get(i18);
                i18++;
                tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj2)).iso2);
            }
            if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 4;
            }
            if (z12) {
                tL_inputStorePaymentStarsGiveaway.flags |= 16;
                tL_inputStorePaymentStarsGiveaway.prize_description = str4;
            }
            tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i16).getNextRandomId();
            tL_inputStorePaymentStarsGiveaway.until_date = l4;
            tL_inputStorePaymentStarsGiveaway.currency = U.currency;
            tL_inputStorePaymentStarsGiveaway.amount = U.amount;
            tL_inputStorePaymentStarsGiveaway.users = S;
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str2 = U.store_product) != null) {
                c5.a aVar2 = new c5.a();
                aVar2.b = "inapp";
                aVar2.a = str2;
                BillingController.getInstance().queryProductDetails(Arrays.asList(aVar2.a()), new a1.d(y3, m0Var, tL_inputStorePaymentStarsGiveaway, activity, 22));
                return;
            }
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p5 = l3.p(u5.I(), false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i16).sendRequest(tL_payments_getPaymentForm, new s5(y3, m0Var, tL_inputInvoiceStars, 26));
            return;
        }
        int i19 = 24;
        if (a0Var.i0 == 1) {
            ArrayList b10 = s.b(arrayList3.size(), arrayList4);
            for (int i20 = 0; i20 < b10.size(); i20++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i20);
                if (tL_premiumGiftCodeOption.months == a0Var.l0 && arrayList3.size() > 0) {
                    if (s.h()) {
                        Context context = a0Var.getContext();
                        d6 d6Var = a0Var.resourcesProvider;
                        if (tL_premiumGiftCodeOption.store_product == null) {
                            ArrayList arrayList6 = new ArrayList();
                            int size3 = arrayList4.size();
                            int i21 = 0;
                            while (i21 < size3) {
                                Object obj3 = arrayList4.get(i21);
                                i21++;
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                    arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                }
                            }
                            String join = TextUtils.join(", ", arrayList6);
                            int i22 = tL_premiumGiftCodeOption.users;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, d6Var);
                            String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            b2 b2Var2 = alertDialog$Builder2.a;
                            b2Var2.R = string2;
                            b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i22, join));
                            alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new s0.b(i19));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    aVar.b(true);
                    s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.b0, null, n2Var, new v(a0Var, 0), new v(a0Var, 1));
                    return;
                }
            }
            return;
        }
        ArrayList b11 = s.b(a0Var.S(), arrayList4);
        int i23 = 0;
        while (i23 < b11.size()) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i23);
            if (tL_premiumGiftCodeOption3.months == a0Var.l0) {
                if (s.h()) {
                    List list = a0Var.Y;
                    Context context2 = a0Var.getContext();
                    d6 d6Var2 = a0Var.resourcesProvider;
                    v vVar = new v(a0Var, 2);
                    if (tL_premiumGiftCodeOption3.store_product == null) {
                        ArrayList arrayList7 = new ArrayList();
                        int size4 = arrayList4.size();
                        int i24 = 0;
                        while (i24 < size4) {
                            Object obj4 = arrayList4.get(i24);
                            i24++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                            if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                arrayList7.add(tL_premiumGiftCodeOption4);
                            }
                        }
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                        int size5 = arrayList7.size();
                        int i25 = 0;
                        while (i25 < size5) {
                            Object obj5 = arrayList7.get(i25);
                            i25++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                            int i26 = tL_premiumGiftCodeOption3.users;
                            int i27 = tL_premiumGiftCodeOption6.users;
                            if (i26 > i27 && i27 > tL_premiumGiftCodeOption5.users) {
                                tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                            }
                        }
                        String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                        int i28 = tL_premiumGiftCodeOption3.users;
                        int i29 = tL_premiumGiftCodeOption5.users;
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, d6Var2);
                        String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                        b2 b2Var3 = alertDialog$Builder3.a;
                        b2Var3.R = string3;
                        b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i28, formatPluralString, Integer.valueOf(i29)));
                        alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new rg.x(i13, vVar, tL_premiumGiftCodeOption5));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(i19));
                        alertDialog$Builder3.o();
                        return;
                    }
                }
                int i30 = a0Var.j0;
                int i31 = vg.u.s;
                boolean z13 = i30 == 1;
                int l10 = s.l(a0Var.m0);
                aVar.b(true);
                boolean z14 = a0Var.x0;
                boolean z15 = a0Var.w0;
                String str5 = a0Var.v0;
                v vVar2 = new v(a0Var, i13);
                String str6 = str3;
                v vVar3 = new v(a0Var, 4);
                if (s.h()) {
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z13;
                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                    tL_inputStorePaymentPremiumGiveaway.prize_description = str5;
                    tL_inputStorePaymentPremiumGiveaway.until_date = l10;
                    int i32 = tL_inputStorePaymentPremiumGiveaway.flags;
                    tL_inputStorePaymentPremiumGiveaway.flags = i32 | 6;
                    if (z15) {
                        tL_inputStorePaymentPremiumGiveaway.flags = i32 | 22;
                    }
                    tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                    int size6 = arrayList2.size();
                    int i33 = 0;
                    while (i33 < size6) {
                        Object obj6 = arrayList2.get(i33);
                        i33++;
                        TLObject tLObject = (TLObject) obj6;
                        if (tLObject instanceof TLRPC.Chat) {
                            str = str6;
                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).id));
                        } else {
                            str = str6;
                        }
                        str6 = str;
                    }
                    String str7 = str6;
                    tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    int size7 = arrayList.size();
                    int i34 = 0;
                    while (i34 < size7) {
                        Object obj7 = arrayList.get(i34);
                        i34++;
                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                    }
                    c5.a aVar3 = new c5.a();
                    aVar3.b = str7;
                    aVar3.a = tL_premiumGiftCodeOption3.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(aVar3.a()), new org.telegram.ui.Components.d1(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, vVar3, vVar2, n2Var, 3));
                    return;
                }
                MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z13;
                tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                tL_inputStorePaymentPremiumGiveaway2.prize_description = str5;
                tL_inputStorePaymentPremiumGiveaway2.until_date = l10;
                int i35 = tL_inputStorePaymentPremiumGiveaway2.flags;
                tL_inputStorePaymentPremiumGiveaway2.flags = i35 | 6;
                if (z15) {
                    tL_inputStorePaymentPremiumGiveaway2.flags = i35 | 22;
                }
                tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                int size8 = arrayList2.size();
                int i36 = 0;
                while (i36 < size8) {
                    Object obj8 = arrayList2.get(i36);
                    int i37 = i36 + 1;
                    TLObject tLObject2 = (TLObject) obj8;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        i10 = i37;
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).id));
                    } else {
                        i10 = i37;
                    }
                    i36 = i10;
                }
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                int size9 = arrayList.size();
                int i38 = 0;
                while (i38 < size9) {
                    Object obj9 = arrayList.get(i38);
                    i38++;
                    tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                }
                tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                JSONObject p10 = l3.p(n2Var.getResourceProvider(), false);
                if (p10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = p10.toString();
                    tL_payments_getPaymentForm2.flags |= 1;
                }
                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                connectionsManager2.sendRequest(tL_payments_getPaymentForm2, new gd(vVar3, messagesController2, tL_inputInvoicePremiumGiftCode, n2Var, vVar2, 12));
                return;
            }
            i23++;
            str3 = str3;
        }
    }

    public static void O(a0 a0Var, n2 n2Var, View view) {
        c5 c5Var;
        o0.a aVar;
        ArrayList arrayList = a0Var.d0;
        t tVar = a0Var.y0;
        if (view instanceof vg.y) {
            vg.y yVar = (vg.y) view;
            int type = yVar.getType();
            boolean z10 = yVar.e.h;
            boolean z11 = !z10;
            yVar.setChecked(z11);
            int i10 = vg.y.L;
            if (type == 0) {
                a0Var.x0 = z11;
                a0Var.Z(false, false);
            } else if (type == 1) {
                yVar.setDivider(z11);
                a0Var.w0 = z11;
                a0Var.Z(false, false);
                ug.b bVar = a0Var.g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.e.size()) {
                        break;
                    }
                    ug.a aVar2 = (ug.a) bVar.e.get(i11);
                    if (aVar2.a == 15) {
                        int i12 = aVar2.l;
                        int i13 = vg.y.L;
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
                a0Var.g0.G();
                if (a0Var.w0) {
                    AndroidUtilities.cancelRunOnUIThread(tVar);
                } else {
                    AndroidUtilities.runOnUIThread(tVar, 250L);
                }
            }
        }
        if (view instanceof vg.c) {
            if (view instanceof vg.d) {
                int selectedType = ((vg.d) view).getSelectedType();
                int i14 = vg.d.s;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && a0Var.h0 == selectedType) {
                        o0.a aVar3 = a0Var.r0;
                        if (aVar3 != null) {
                            ((z0) aVar3.b).T(1, arrayList);
                            ((m) aVar3.c).b.E(1);
                            return;
                        }
                        return;
                    }
                    a0Var.h0 = selectedType;
                    a0Var.Z(true, true);
                    a0Var.Y(true);
                    a0Var.L();
                } else if (selectedType == 1) {
                    o0.a aVar4 = a0Var.r0;
                    if (aVar4 != null) {
                        ((z0) aVar4.b).T(1, arrayList);
                        ((m) aVar4.c).b.E(1);
                    }
                } else {
                    a0Var.i0 = selectedType;
                    a0Var.Z(true, true);
                    a0Var.Y(true);
                    a0Var.L();
                }
            } else {
                vg.c cVar = (vg.c) view;
                zl0 zl0Var = a0Var.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < zl0Var.getChildCount(); i15++) {
                        View childAt = zl0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            ((vg.c) childAt).c(childAt == cVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof vg.u) {
            int selectedType2 = ((vg.u) view).getSelectedType();
            if (a0Var.j0 == selectedType2 && (aVar = a0Var.r0) != null) {
                ((z0) aVar.b).T(3, a0Var.e0);
                ((m) aVar.c).b.E(1);
            }
            a0Var.j0 = selectedType2;
            a0Var.Z(false, false);
            return;
        }
        if (view instanceof vg.i) {
            a0Var.l0 = ((TLRPC.TL_premiumGiftCodeOption) ((vg.i) view).getGifCode()).months;
            a0Var.Z(false, false);
            a0Var.g0.G();
            return;
        }
        if (!(view instanceof vg.h)) {
            if (view instanceof vg.b) {
                o0.a aVar5 = a0Var.r0;
                if (aVar5 != null) {
                    ((z0) aVar5.b).T(2, a0Var.c0);
                    ((m) aVar5.c).b.E(1);
                    return;
                }
                return;
            }
            if (!(view instanceof vg.w)) {
                if (view instanceof h7) {
                    a0Var.k0 = true;
                    a0Var.Z(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((vg.w) view).getOption();
            if (option != null) {
                a0Var.p0 = option.stars;
                a0Var.Z(true, true);
                a0Var.Y(true);
                a0Var.L();
                return;
            }
            return;
        }
        Context context = n2Var.getContext();
        long j3 = a0Var.m0;
        u uVar = new u(a0Var);
        d6 d6Var = a0Var.resourcesProvider;
        c5 c5Var2 = new c5(d6Var);
        a3 a3Var = new a3(context, d6Var);
        a3Var.a();
        gd0 gd0Var = new gd0(context, d6Var);
        int i16 = c5Var2.a;
        gd0Var.setTextColor(i16);
        gd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        gd0Var.setItemCount(5);
        g gVar = new g(context, d6Var);
        gVar.setWrapSelectorWheel(true);
        gVar.setAllItemsCount(24);
        gVar.setItemCount(5);
        gVar.setTextColor(i16);
        gVar.setTextOffset(-AndroidUtilities.dp(10.0f));
        gVar.setTag("HOUR");
        h hVar = new h(context, d6Var);
        hVar.setWrapSelectorWheel(true);
        hVar.setAllItemsCount(60);
        hVar.setItemCount(5);
        hVar.setTextColor(i16);
        hVar.setTextOffset(-AndroidUtilities.dp(34.0f));
        c4 c4Var = new c4(context, c5Var2, gd0Var, gVar, hVar);
        c4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        c4Var.addView(frameLayout, z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        textView.setTextColor(i16);
        e2.l(20.0f, 1, textView);
        frameLayout.addView(textView, z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        c4Var.addView(linearLayout, z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        dn0 dn0Var = new dn0(context, 3);
        long j10 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j10);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j10);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(gd0Var, z5.l(0.5f, 0, 270));
        gd0Var.setMinValue(0);
        gd0Var.setMaxValue(i18 - 1);
        gd0Var.setWrapSelectorWheel(false);
        gd0Var.setTag("DAY");
        gd0Var.setFormatter(new x20(currentTimeMillis, calendar, i17, 1));
        v4 v4Var = new v4(c4Var, gVar, hVar, i19, i20, gd0Var);
        gd0Var.setOnValueChangedListener(v4Var);
        gVar.setMinValue(0);
        gVar.setMaxValue(23);
        linearLayout.addView(gVar, z5.l(0.2f, 0, 270));
        gVar.setFormatter(new s0.b(25));
        gVar.setOnValueChangedListener(v4Var);
        hVar.setMinValue(0);
        hVar.setMaxValue(11);
        hVar.setValue(0);
        hVar.setFormatter(new s0.b(26));
        linearLayout.addView(hVar, z5.l(0.3f, 0, 270));
        hVar.setOnValueChangedListener(v4Var);
        if (j3 > 0) {
            c5Var = c5Var2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j3 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j3);
            hVar.setValue(calendar.get(12) / 5);
            gVar.setValue(calendar.get(11));
            gd0Var.setValue(timeInMillis);
            gd0Var.getValue();
            v4Var.q(gd0Var, gd0Var.getValue());
            gVar.getValue();
            v4Var.q(gVar, gVar.getValue());
        } else {
            c5Var = c5Var2;
        }
        dn0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        dn0Var.setGravity(17);
        dn0Var.setTextColor(c5Var.g);
        dn0Var.setTextSize(1, 14.0f);
        dn0Var.setTypeface(AndroidUtilities.bold());
        dn0Var.setBackground(x5.e(new float[]{8.0f}, c5Var.h));
        dn0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        c4Var.addView(dn0Var, z5.t(-1, 48, 83, 16, 15, 16, 16));
        dn0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, gd0Var, gVar, hVar, uVar, a3Var));
        a3Var.b(c4Var);
        f3 f3Var = a3Var.a;
        f3Var.show();
        int i21 = c5Var.b;
        f3Var.setBackgroundColor(i21);
        f3Var.fixNavigationBar(i21);
        AndroidUtilities.setLightStatusBar(f3Var, i0.a.f(i21) > 0.699999988079071d);
    }

    public static void P(a0 a0Var) {
        rg.m1 m1Var = new rg.m1(a0Var.n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        int i10 = 1;
        m1Var.setOnDismissListener(new w(a0Var, i10));
        m1Var.setOnShowListener(new x(a0Var, i10));
        m1Var.show();
    }

    public static void Q(a0 a0Var) {
        rg.m1 m1Var = new rg.m1(a0Var.n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        int i10 = 0;
        m1Var.setOnDismissListener(new w(a0Var, i10));
        m1Var.setOnShowListener(new x(a0Var, i10));
        m1Var.show();
    }

    @Override // org.telegram.ui.Components.cb
    public final void B(Canvas canvas, int i10) {
        this.s0 = i10;
    }

    public final ArrayList R(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption U = U(j3);
        if (U != null) {
            for (int i10 = 0; i10 < U.winners.size(); i10++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = U.winners.get(i10);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int S() {
        int i10 = this.h0;
        int i11 = vg.d.s;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.n0)).intValue();
        }
        List W = W();
        int i12 = this.o0;
        if (i12 < 0 || i12 >= W.size()) {
            this.o0 = 0;
        }
        if (this.o0 >= W.size()) {
            return 0;
        }
        return ((Integer) W.get(this.o0)).intValue();
    }

    public final int T() {
        int S;
        int g10;
        int i10 = this.h0;
        int i11 = vg.d.s;
        if (i10 == 2) {
            S = ((Integer) this.Y.get(this.n0)).intValue();
            g10 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption U = U(this.p0);
            if (U != null) {
                return U.yearly_boosts;
            }
            S = S();
            g10 = s.g();
        }
        return g10 * S;
    }

    public final TL_stars.TL_starsGiveawayOption U(long j3) {
        ArrayList v = u5.y(this.currentAccount, false).v();
        if (v == null) {
            return null;
        }
        for (int i10 = 0; i10 < v.size(); i10++) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i10);
            if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j3) {
                return tL_starsGiveawayOption;
            }
        }
        return null;
    }

    public final List W() {
        int i10 = this.h0;
        int i11 = vg.d.s;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption U = U(this.p0);
        if (U != null) {
            for (int i12 = 0; i12 < U.winners.size(); i12++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = U.winners.get(i12);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean X() {
        return this.u0 != null;
    }

    public final void Y(boolean z10) {
        boolean X = X();
        vg.a aVar = this.q0;
        if (X) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            } else {
                aVar.a(s.g() * prepaidGiveaway.quantity, z10);
                return;
            }
        }
        int i10 = this.i0;
        int i11 = vg.d.s;
        if (i10 == 0) {
            aVar.a(T(), z10);
            return;
        }
        ArrayList arrayList = this.d0;
        int g10 = s.g() * arrayList.size();
        boolean z11 = arrayList.size() > 0;
        aVar.e = true;
        ci.d dVar = aVar.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.b.setBackgroundColor(i6.v0(i6.h5, aVar.c));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x06e2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0693  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0637  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x05b3  */
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
    public final void Z(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        ?? r15;
        int i11;
        boolean z13;
        ?? r152;
        ug.b bVar;
        ?? r153;
        long longValue;
        ArrayList arrayList = this.X;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i12 = this.h0;
        int i13 = vg.d.s;
        boolean z14 = i12 == 3;
        ug.a aVar = new ug.a(0, false);
        aVar.g = z14;
        arrayList.add(aVar);
        boolean X = X();
        ArrayList arrayList3 = this.d0;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.u0;
        if (X) {
            ug.a aVar2 = new ug.a(14, false);
            aVar2.f = prepaidGiveaway;
            arrayList.add(aVar2);
        } else {
            int size = arrayList3.size();
            ug.a aVar3 = new ug.a(2, this.h0 == 2);
            aVar3.l = 2;
            aVar3.i = size;
            aVar3.f = null;
            arrayList.add(aVar3);
            int size2 = arrayList3.size();
            ug.a aVar4 = new ug.a(2, this.h0 == 3);
            aVar4.l = 3;
            aVar4.i = size2;
            aVar4.f = null;
            arrayList.add(aVar4);
        }
        arrayList.add(new ug.a(4, false));
        TLRPC.Chat chat = this.b0;
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        int i14 = this.h0;
        ArrayList arrayList4 = this.e0;
        ArrayList arrayList5 = this.c0;
        if (i14 == 3) {
            if (X()) {
                z12 = isChannelAndNotMegaGroup;
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    this.p0 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                }
            } else {
                String string = LocaleController.getString(R.string.BoostingStarsOptions);
                int T = T();
                ug.a aVar5 = new ug.a(13, false);
                aVar5.c = string;
                aVar5.i = T;
                arrayList.add(aVar5);
                ArrayList v = u5.y(this.currentAccount, false).v();
                ArrayList arrayList6 = new ArrayList();
                if (v != null) {
                    int i15 = 0;
                    while (i15 < v.size()) {
                        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i15);
                        boolean z15 = isChannelAndNotMegaGroup;
                        if (tL_starsGiveawayOption != null && !arrayList6.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                            arrayList6.add(Long.valueOf(tL_starsGiveawayOption.stars));
                        }
                        i15++;
                        isChannelAndNotMegaGroup = z15;
                    }
                }
                z12 = isChannelAndNotMegaGroup;
                int i16 = 0;
                for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                    TL_stars.TL_starsGiveawayOption U = U(((Long) arrayList6.get(i17)).longValue());
                    if (!U.missingStorePrice) {
                        if (this.p0 == 0 && U.isDefault) {
                            this.p0 = U.stars;
                        }
                        if (!U.extended || this.k0) {
                            i16++;
                            int i18 = this.k0 ? i17 : i17 + 2;
                            long j3 = U.stars;
                            ArrayList R = R(j3);
                            if (R.isEmpty()) {
                                float f7 = j3;
                                ArrayList R2 = R(this.p0);
                                int i19 = this.o0;
                                if (i19 < 0 || i19 >= R2.size()) {
                                    this.o0 = 0;
                                }
                                longValue = Math.round(f7 / (this.o0 >= R2.size() ? 1L : ((Long) R2.get(this.o0)).longValue()));
                            } else {
                                longValue = ((Long) R.get(Utilities.clamp(this.o0, R.size() - 1, 0))).longValue();
                            }
                            arrayList.add(ug.a.d(U, i18, longValue, this.p0 == U.stars, true));
                        }
                    }
                }
                if (!this.k0 && i16 < arrayList6.size()) {
                    arrayList.add(new ug.a(18, false));
                }
                if (i16 <= 0) {
                    arrayList.add(ug.a.d(null, 0, 1L, false, true));
                    arrayList.add(ug.a.d(null, 1, 1L, false, true));
                    arrayList.add(ug.a.d(null, 2, 1L, false, false));
                }
                aVar5.i = T();
                arrayList.add(ug.a.c(LocaleController.getString(R.string.BoostingStarsOptionsInfo), false));
                List W = W();
                int i20 = this.o0;
                if (i20 < 0 || i20 >= W.size()) {
                    this.o0 = 0;
                }
                if (W.size() > 1) {
                    arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                    List W2 = W();
                    int i21 = this.o0;
                    ug.a aVar6 = new ug.a(5, false);
                    aVar6.k = W2;
                    aVar6.i = i21;
                    arrayList.add(aVar6);
                    arrayList.add(ug.a.c(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
                }
            }
            arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
            if (!X()) {
                arrayList.add(ug.a.b(chat, T(), false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(ug.a.b(chat, prepaidGiveaway.quantity, false));
            } else {
                arrayList.add(ug.a.b(chat, s.g() * prepaidGiveaway.quantity, false));
            }
            int size3 = arrayList5.size();
            int i22 = 0;
            while (i22 < size3) {
                Object obj = arrayList5.get(i22);
                i22++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(ug.a.b((TLRPC.Chat) tLObject, T(), true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int T2 = T();
                    ug.a aVar7 = new ug.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = T2;
                    arrayList.add(aVar7);
                }
            }
            if (arrayList5.size() < s.f()) {
                r153 = 0;
                arrayList.add(new ug.a(8, false));
            } else {
                r153 = 0;
            }
            arrayList.add(ug.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r153));
            arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
            int i23 = vg.u.s;
            arrayList.add(ug.a.e(r153, this.j0, true, arrayList4));
            arrayList.add(ug.a.e(1, this.j0, r153, arrayList4));
            arrayList.add(ug.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r153));
        } else {
            z12 = isChannelAndNotMegaGroup;
            if (this.i0 == 0) {
                if (!X()) {
                    String string2 = LocaleController.getString(R.string.BoostingQuantityPrizes);
                    int T3 = T();
                    ug.a aVar8 = new ug.a(13, false);
                    aVar8.c = string2;
                    aVar8.i = T3;
                    arrayList.add(aVar8);
                    int i24 = this.n0;
                    ug.a aVar9 = new ug.a(5, false);
                    aVar9.k = this.Y;
                    aVar9.i = i24;
                    arrayList.add(aVar9);
                    arrayList.add(ug.a.c(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (!X()) {
                    arrayList.add(ug.a.b(chat, T(), false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(ug.a.b(chat, prepaidGiveaway.quantity, false));
                } else {
                    arrayList.add(ug.a.b(chat, s.g() * prepaidGiveaway.quantity, false));
                }
                int size4 = arrayList5.size();
                int i25 = 0;
                while (i25 < size4) {
                    Object obj2 = arrayList5.get(i25);
                    i25++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(ug.a.b((TLRPC.Chat) tLObject2, T(), true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int T4 = T();
                        ug.a aVar10 = new ug.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = T4;
                        arrayList.add(aVar10);
                    }
                }
                if (arrayList5.size() < s.f()) {
                    r15 = 0;
                    arrayList.add(new ug.a(8, false));
                } else {
                    r15 = 0;
                }
                arrayList.add(ug.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r15));
                arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
                int i26 = vg.u.s;
                arrayList.add(ug.a.e(r15, this.j0, true, arrayList4));
                arrayList.add(ug.a.e(1, this.j0, r15, arrayList4));
                arrayList.add(ug.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r15));
            }
            if (!X()) {
                arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                int i27 = this.i0;
                int i28 = vg.d.s;
                ArrayList b10 = s.b(i27 == 0 ? S() : arrayList3.size(), this.f0);
                int i29 = 0;
                while (i29 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i29);
                    int i30 = tL_premiumGiftCodeOption.months;
                    int i31 = this.i0;
                    int i32 = vg.d.s;
                    int S = i31 == 0 ? S() : arrayList3.size();
                    long j10 = tL_premiumGiftCodeOption.amount;
                    int i33 = this.l0;
                    String str = tL_premiumGiftCodeOption.currency;
                    boolean z16 = i29 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    ug.a aVar11 = new ug.a(12, i30 == i33);
                    aVar11.i = i30;
                    aVar11.j = S;
                    aVar11.h = j10;
                    aVar11.g = z16;
                    aVar11.c = str;
                    aVar11.m = tL_premiumGiftCodeOption;
                    arrayList.add(aVar11);
                    i29++;
                    b10 = arrayList7;
                }
            }
            if (!X()) {
                i10 = 3;
                arrayList.add(ug.a.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), i6.gc, 0, new t(this, i10), this.resourcesProvider), true));
                i11 = this.h0;
                int i34 = vg.d.s;
                if (i11 != i10 || this.i0 == 0) {
                    String string3 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
                    boolean z17 = this.w0;
                    int i35 = vg.y.L;
                    ug.a aVar12 = new ug.a(15, z17);
                    aVar12.c = string3;
                    aVar12.g = z17;
                    aVar12.l = 1;
                    arrayList.add(aVar12);
                    if (this.w0) {
                        z13 = false;
                        arrayList.add(ug.a.c(LocaleController.getString(this.h0 == 3 ? R.string.BoostingStarsGiveawayAdditionPrizeHint : R.string.BoostingGiveawayAdditionPrizeHint), false));
                    } else {
                        int S2 = X() ? prepaidGiveaway.quantity : S();
                        z13 = false;
                        ug.a aVar13 = new ug.a(16, false);
                        aVar13.i = S2;
                        arrayList.add(aVar13);
                        String formatPluralString = LocaleController.formatPluralString("BoldMonths", this.l0, new Object[0]);
                        if (this.h0 == 3) {
                            if (this.v0.isEmpty()) {
                                arrayList.add(ug.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.p0, new Object[0])), false));
                            } else {
                                arrayList.add(ug.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.p0, Integer.valueOf(S2), this.v0)), false));
                            }
                        } else if (this.v0.isEmpty()) {
                            arrayList.add(ug.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", S2, formatPluralString)), false));
                        } else {
                            arrayList.add(ug.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", S2, this.v0, formatPluralString)), false));
                        }
                    }
                    arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
                    long j11 = this.m0;
                    ug.a aVar14 = new ug.a(10, z13);
                    aVar14.h = j11;
                    arrayList.add(aVar14);
                    if (this.h0 != 3) {
                        if (X()) {
                            r152 = 0;
                            arrayList.add(ug.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        } else {
                            r152 = 0;
                            arrayList.add(ug.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", S(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        }
                    } else {
                        r152 = 0;
                        r152 = 0;
                        if (X()) {
                            arrayList.add(ug.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                        } else {
                            arrayList.add(ug.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", S(), new Object[0]), false));
                        }
                    }
                    String string4 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
                    ug.a aVar15 = new ug.a(15, this.x0);
                    aVar15.c = string4;
                    aVar15.g = r152;
                    aVar15.l = r152;
                    arrayList.add(aVar15);
                    if (X()) {
                        arrayList.add(ug.a.c(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r152));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                        sb2.append(this.h0 != 3 ? org.telegram.messenger.q.g(R.string.BoostingStoriesFeaturesAndTerms, new StringBuilder("\n\n")) : "");
                        arrayList.add(ug.a.c(AndroidUtilities.replaceSingleTag(sb2.toString(), i6.gc, 0, new t(this, 4), this.resourcesProvider), true));
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
        int i342 = vg.d.s;
        if (i11 != i10) {
        }
        String string32 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
        boolean z172 = this.w0;
        int i352 = vg.y.L;
        ug.a aVar122 = new ug.a(15, z172);
        aVar122.c = string32;
        aVar122.g = z172;
        aVar122.l = 1;
        arrayList.add(aVar122);
        if (this.w0) {
        }
        arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
        long j112 = this.m0;
        ug.a aVar142 = new ug.a(10, z13);
        aVar142.h = j112;
        arrayList.add(aVar142);
        if (this.h0 != 3) {
        }
        String string42 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
        ug.a aVar152 = new ug.a(15, this.x0);
        aVar152.c = string42;
        aVar152.g = r152;
        aVar152.l = r152;
        arrayList.add(aVar152);
        if (X()) {
        }
        bVar = this.g0;
        if (bVar != null) {
            if (z10) {
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        zl0 zl0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (zl0Var = this.d) != null && zl0Var.G) {
            Z(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        j jVar = this.t0;
        if (jVar != null) {
            jVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override // org.telegram.ui.Components.cb
    public final yl0 v(zl0 zl0Var) {
        ug.b bVar = new ug.b(this.resourcesProvider);
        this.g0 = bVar;
        return bVar;
    }

    @Override // org.telegram.ui.Components.cb
    public final CharSequence y() {
        int i10 = this.i0;
        int i11 = vg.d.s;
        return i10 == 1 ? LocaleController.getString(R.string.GiftPremium) : LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
