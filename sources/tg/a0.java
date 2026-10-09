package tg;

import ai.o6;
import ai.t5;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.hd;
import com.google.android.gms.internal.vision.e2;
import ei.k3;
import ei.t4;
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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.eb;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.pm0;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.gn0;
import org.telegram.ui.v20;
import qg.x1;
import w7.x5;
import yh.m5;
import yh.y6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class a0 extends eb implements NotificationCenter.NotificationCenterDelegate {
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
    public b5 r0;
    public int s0;
    public j t0;
    public final TL_stories.PrepaidGiveaway u0;
    public String v0;
    public boolean w0;
    public boolean x0;
    public final t y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(n2 n2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(n2Var, false);
        int i10 = 5;
        this.X = new ArrayList();
        this.Y = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.Z = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.a0 = Arrays.asList(750, 10000, 50000);
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        int i11 = vg.d.v;
        this.h0 = 2;
        this.i0 = 0;
        int i12 = vg.u.v;
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
        this.y0 = new t(this, 0);
        this.u0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        O();
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i14 = vg.d.v;
            this.h0 = 3;
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(hs.h);
        jVar.C = false;
        jVar.m = false;
        this.d.setItemAnimator(jVar);
        qm0 qm0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        qm0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new z());
        this.d.setOnItemClickListener(new o6(23, this, n2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.b0 = chat;
        ug.b bVar = this.g0;
        ArrayList arrayList = this.X;
        qm0 qm0Var2 = this.d;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f = qm0Var2;
        bVar.h = uVar;
        bVar.n = uVar2;
        bVar.s = uVar3;
        b0(false, false);
        vg.a aVar = new vg.a(getContext(), this.resourcesProvider);
        this.q0 = aVar;
        aVar.setOnClickListener(new as(this, prepaidGiveaway, j3, n2Var));
        a0(false);
        this.containerView.addView(aVar, x5.a(68.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 80));
        s.j(this.currentAccount, chat, new v(this, i10));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void Q(a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, n2 n2Var) {
        int i10;
        String str;
        ArrayList arrayList = a0Var.e0;
        ArrayList arrayList2 = a0Var.c0;
        TLRPC.Chat chat = a0Var.b0;
        ArrayList arrayList3 = a0Var.d0;
        ArrayList arrayList4 = a0Var.f0;
        vg.a aVar = a0Var.q0;
        if (aVar.a.N) {
            return;
        }
        if (a0Var.Z()) {
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
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new r5.d(t2Var, 7));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0.b(12));
            alertDialog$Builder.o();
            return;
        }
        int i11 = a0Var.h0;
        int i12 = vg.d.v;
        int i13 = 3;
        int i14 = 1;
        if (i11 == 3) {
            Activity findActivity = AndroidUtilities.findActivity(a0Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            if (findActivity == null || findActivity.isFinishing()) {
                return;
            }
            TL_stars.TL_starsGiveawayOption X = a0Var.X(a0Var.p0);
            int V = a0Var.V();
            if (X == null) {
                return;
            }
            aVar.a.setLoading(true);
            int i15 = a0Var.j0;
            int i16 = vg.u.v;
            boolean z10 = i15 == 1;
            m5 y3 = m5.y(a0Var.currentAccount, false);
            int l4 = s.l(a0Var.m0);
            boolean z11 = a0Var.x0;
            boolean z12 = a0Var.w0;
            String str2 = a0Var.v0;
            qh.r rVar = new qh.r(i14, a0Var, X);
            int i17 = y3.a;
            if (!MessagesController.getInstance(i17).starsPurchaseAvailable()) {
                n2 R2 = LaunchActivity.R();
                if (R2 == null || R2.getContext() == null) {
                    m5.e0(findActivity, null);
                    return;
                } else {
                    m5.e0(R2.getContext(), R2.getResourceProvider());
                    return;
                }
            }
            TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
            tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
            tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
            tL_inputStorePaymentStarsGiveaway.stars = X.stars;
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
            tL_inputStorePaymentStarsGiveaway.currency = X.currency;
            tL_inputStorePaymentStarsGiveaway.amount = X.amount;
            tL_inputStorePaymentStarsGiveaway.users = V;
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str = X.store_product) != null) {
                c5.a aVar2 = new c5.a();
                aVar2.c = "inapp";
                aVar2.b = str;
                BillingController.getInstance().queryProductDetails(Arrays.asList(aVar2.a()), new a1.d(y3, rVar, tL_inputStorePaymentStarsGiveaway, findActivity, 22));
                return;
            }
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = k3.q(m5.I(), false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new t5(y3, rVar, tL_inputInvoiceStars, 26));
            return;
        }
        int i20 = 2;
        int i21 = 4;
        int i22 = 9;
        if (a0Var.i0 == 1) {
            ArrayList b10 = s.b(arrayList3.size(), arrayList4);
            for (int i23 = 0; i23 < b10.size(); i23++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i23);
                if (tL_premiumGiftCodeOption.months == a0Var.l0 && arrayList3.size() > 0) {
                    if (s.h()) {
                        Context context = a0Var.getContext();
                        e6 e6Var = a0Var.resourcesProvider;
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
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, e6Var);
                            String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            b2 b2Var2 = alertDialog$Builder2.a;
                            b2Var2.R = string2;
                            b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i25, join));
                            alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new s0.b(i22));
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
        ArrayList b11 = s.b(a0Var.V(), arrayList4);
        for (int i26 = 0; i26 < b11.size(); i26++) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i26);
            if (tL_premiumGiftCodeOption3.months == a0Var.l0) {
                if (s.h()) {
                    List list = a0Var.Y;
                    Context context2 = a0Var.getContext();
                    e6 e6Var2 = a0Var.resourcesProvider;
                    v vVar = new v(a0Var, i20);
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
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, e6Var2);
                        String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                        b2 b2Var3 = alertDialog$Builder3.a;
                        b2Var3.R = string3;
                        b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i31, formatPluralString, Integer.valueOf(i32)));
                        alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new x1(6, vVar, tL_premiumGiftCodeOption5));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(i22));
                        alertDialog$Builder3.o();
                        return;
                    }
                }
                int i33 = a0Var.j0;
                int i34 = vg.u.v;
                boolean z13 = i33 == 1;
                int l10 = s.l(a0Var.m0);
                aVar.b(true);
                boolean z14 = a0Var.x0;
                boolean z15 = a0Var.w0;
                String str3 = a0Var.v0;
                v vVar2 = new v(a0Var, i13);
                v vVar3 = new v(a0Var, i21);
                if (s.h()) {
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
                    aVar3.c = "inapp";
                    aVar3.b = tL_premiumGiftCodeOption3.store_product;
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
                JSONObject q10 = k3.q(n2Var.getResourceProvider(), false);
                if (q10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = q10.toString();
                    tL_payments_getPaymentForm2.flags |= 1;
                }
                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                connectionsManager2.sendRequest(tL_payments_getPaymentForm2, new hd(vVar3, messagesController2, tL_inputInvoicePremiumGiftCode, n2Var, vVar2, 12));
                return;
            }
        }
    }

    public static void R(a0 a0Var, n2 n2Var, View view) {
        e5 e5Var;
        b5 b5Var;
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
                a0Var.b0(false, false);
            } else if (type == 1) {
                yVar.setDivider(z11);
                a0Var.w0 = z11;
                a0Var.b0(false, false);
                ug.b bVar = a0Var.g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.e.size()) {
                        break;
                    }
                    ug.a aVar = (ug.a) bVar.e.get(i11);
                    if (aVar.a == 15) {
                        int i12 = aVar.l;
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
                int i14 = vg.d.v;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && a0Var.h0 == selectedType) {
                        b5 b5Var2 = a0Var.r0;
                        if (b5Var2 != null) {
                            ((z0) b5Var2.b).W(1, arrayList);
                            ((m) b5Var2.c).b.D(1);
                            return;
                        }
                        return;
                    }
                    a0Var.h0 = selectedType;
                    a0Var.b0(true, true);
                    a0Var.a0(true);
                    a0Var.O();
                } else if (selectedType == 1) {
                    b5 b5Var3 = a0Var.r0;
                    if (b5Var3 != null) {
                        ((z0) b5Var3.b).W(1, arrayList);
                        ((m) b5Var3.c).b.D(1);
                    }
                } else {
                    a0Var.i0 = selectedType;
                    a0Var.b0(true, true);
                    a0Var.a0(true);
                    a0Var.O();
                }
            } else {
                vg.c cVar = (vg.c) view;
                qm0 qm0Var = a0Var.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < qm0Var.getChildCount(); i15++) {
                        View childAt = qm0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            ((vg.c) childAt).c(childAt == cVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof vg.u) {
            int selectedType2 = ((vg.u) view).getSelectedType();
            if (a0Var.j0 == selectedType2 && (b5Var = a0Var.r0) != null) {
                ((z0) b5Var.b).W(3, a0Var.e0);
                ((m) b5Var.c).b.D(1);
            }
            a0Var.j0 = selectedType2;
            a0Var.b0(false, false);
            return;
        }
        if (view instanceof vg.i) {
            a0Var.l0 = ((TLRPC.TL_premiumGiftCodeOption) ((vg.i) view).getGifCode()).months;
            a0Var.b0(false, false);
            a0Var.g0.G();
            return;
        }
        if (!(view instanceof vg.h)) {
            if (view instanceof vg.b) {
                b5 b5Var4 = a0Var.r0;
                if (b5Var4 != null) {
                    ((z0) b5Var4.b).W(2, a0Var.c0);
                    ((m) b5Var4.c).b.D(1);
                    return;
                }
                return;
            }
            if (!(view instanceof vg.w)) {
                if (view instanceof y6) {
                    a0Var.k0 = true;
                    a0Var.b0(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((vg.w) view).getOption();
            if (option != null) {
                a0Var.p0 = option.stars;
                a0Var.b0(true, true);
                a0Var.a0(true);
                a0Var.O();
                return;
            }
            return;
        }
        Context context = n2Var.getContext();
        long j3 = a0Var.m0;
        u uVar = new u(a0Var);
        e6 e6Var = a0Var.resourcesProvider;
        e5 e5Var2 = new e5(e6Var);
        a3 a3Var = new a3(context, e6Var);
        a3Var.a();
        ud0 ud0Var = new ud0(context, e6Var);
        int i16 = e5Var2.a;
        ud0Var.setTextColor(i16);
        ud0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        ud0Var.setItemCount(5);
        g gVar = new g(context, e6Var);
        gVar.setWrapSelectorWheel(true);
        gVar.setAllItemsCount(24);
        gVar.setItemCount(5);
        gVar.setTextColor(i16);
        gVar.setTextOffset(-AndroidUtilities.dp(10.0f));
        gVar.setTag("HOUR");
        h hVar = new h(context, e6Var);
        hVar.setWrapSelectorWheel(true);
        hVar.setAllItemsCount(60);
        hVar.setItemCount(5);
        hVar.setTextColor(i16);
        hVar.setTextOffset(-AndroidUtilities.dp(34.0f));
        e4 e4Var = new e4(context, e5Var2, ud0Var, gVar, hVar);
        e4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e4Var.addView(frameLayout, x5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        textView.setTextColor(i16);
        e2.l(20.0f, 1, textView);
        frameLayout.addView(textView, x5.a(-2.0f, 0.0f, 12.0f, 0.0f, 0.0f, -2, 51));
        textView.setOnTouchListener(new bi.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        e4Var.addView(linearLayout, x5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        gn0 gn0Var = new gn0(context, 3);
        long j10 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j10);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j10);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(ud0Var, x5.l(0.5f, 0, 270));
        ud0Var.setMinValue(0);
        ud0Var.setMaxValue(i18 - 1);
        ud0Var.setWrapSelectorWheel(false);
        ud0Var.setTag("DAY");
        ud0Var.setFormatter(new v20(currentTimeMillis, calendar, i17, 1));
        t4 t4Var = new t4(e4Var, gVar, hVar, i19, i20, ud0Var);
        ud0Var.setOnValueChangedListener(t4Var);
        gVar.setMinValue(0);
        gVar.setMaxValue(23);
        linearLayout.addView(gVar, x5.l(0.2f, 0, 270));
        gVar.setFormatter(new s0.b(10));
        gVar.setOnValueChangedListener(t4Var);
        hVar.setMinValue(0);
        hVar.setMaxValue(11);
        hVar.setValue(0);
        hVar.setFormatter(new s0.b(11));
        linearLayout.addView(hVar, x5.l(0.3f, 0, 270));
        hVar.setOnValueChangedListener(t4Var);
        if (j3 > 0) {
            e5Var = e5Var2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j3 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j3);
            hVar.setValue(calendar.get(12) / 5);
            gVar.setValue(calendar.get(11));
            ud0Var.setValue(timeInMillis);
            ud0Var.getValue();
            t4Var.r(ud0Var, ud0Var.getValue());
            gVar.getValue();
            t4Var.r(gVar, gVar.getValue());
        } else {
            e5Var = e5Var2;
        }
        gn0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        gn0Var.setGravity(17);
        gn0Var.setTextColor(e5Var.g);
        gn0Var.setTextSize(1, 14.0f);
        gn0Var.setTypeface(AndroidUtilities.bold());
        gn0Var.setBackground(y5.e(new float[]{8.0f}, e5Var.h));
        gn0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        e4Var.addView(gn0Var, x5.t(-1, 48, 83, 16, 15, 16, 16));
        gn0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, ud0Var, gVar, hVar, uVar, a3Var));
        a3Var.b(e4Var);
        f3 f3Var = a3Var.a;
        f3Var.show();
        int i21 = e5Var.b;
        f3Var.setBackgroundColor(i21);
        f3Var.fixNavigationBar(i21);
        AndroidUtilities.setLightStatusBar(f3Var, i0.a.f(i21) > 0.699999988079071d);
    }

    public static void S(a0 a0Var) {
        rg.l1 l1Var = new rg.l1(a0Var.n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        int i10 = 1;
        l1Var.setOnDismissListener(new w(a0Var, i10));
        l1Var.setOnShowListener(new x(a0Var, i10));
        l1Var.show();
    }

    public static void T(a0 a0Var) {
        rg.l1 l1Var = new rg.l1(a0Var.n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        int i10 = 0;
        l1Var.setOnDismissListener(new w(a0Var, i10));
        l1Var.setOnShowListener(new x(a0Var, i10));
        l1Var.show();
    }

    @Override // org.telegram.ui.Components.eb
    public final CharSequence B() {
        int i10 = this.i0;
        int i11 = vg.d.v;
        return i10 == 1 ? LocaleController.getString(R.string.GiftPremium) : LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }

    @Override // org.telegram.ui.Components.eb
    public final void E(Canvas canvas, int i10) {
        this.s0 = i10;
    }

    public final ArrayList U(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption X = X(j3);
        if (X != null) {
            for (int i10 = 0; i10 < X.winners.size(); i10++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = X.winners.get(i10);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int V() {
        int i10 = this.h0;
        int i11 = vg.d.v;
        if (i10 == 2) {
            return ((Integer) this.Y.get(this.n0)).intValue();
        }
        List Y = Y();
        int i12 = this.o0;
        if (i12 < 0 || i12 >= Y.size()) {
            this.o0 = 0;
        }
        if (this.o0 >= Y.size()) {
            return 0;
        }
        return ((Integer) Y.get(this.o0)).intValue();
    }

    public final int W() {
        int V;
        int g10;
        int i10 = this.h0;
        int i11 = vg.d.v;
        if (i10 == 2) {
            V = ((Integer) this.Y.get(this.n0)).intValue();
            g10 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption X = X(this.p0);
            if (X != null) {
                return X.yearly_boosts;
            }
            V = V();
            g10 = s.g();
        }
        return g10 * V;
    }

    public final TL_stars.TL_starsGiveawayOption X(long j3) {
        ArrayList v = m5.y(this.currentAccount, false).v();
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

    public final List Y() {
        int i10 = this.h0;
        int i11 = vg.d.v;
        if (i10 == 2) {
            return this.Y;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption X = X(this.p0);
        if (X != null) {
            for (int i12 = 0; i12 < X.winners.size(); i12++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = X.winners.get(i12);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean Z() {
        return this.u0 != null;
    }

    public final void a0(boolean z10) {
        boolean Z = Z();
        vg.a aVar = this.q0;
        if (Z) {
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
        int i11 = vg.d.v;
        if (i10 == 0) {
            aVar.a(W(), z10);
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
        aVar.b.setBackgroundColor(i6.w0(i6.h5, aVar.c));
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
    public final void b0(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        ?? r15;
        int i11;
        boolean z13;
        ?? r152;
        ug.b bVar;
        ?? r153;
        boolean z14;
        long longValue;
        ArrayList arrayList = this.X;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i12 = this.h0;
        int i13 = vg.d.v;
        boolean z15 = i12 == 3;
        ug.a aVar = new ug.a(0, false);
        aVar.g = z15;
        arrayList.add(aVar);
        boolean Z = Z();
        ArrayList arrayList3 = this.d0;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.u0;
        if (Z) {
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
            if (Z()) {
                z12 = isChannelAndNotMegaGroup;
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    this.p0 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                }
            } else {
                String string = LocaleController.getString(R.string.BoostingStarsOptions);
                int W = W();
                ug.a aVar5 = new ug.a(13, false);
                aVar5.c = string;
                aVar5.i = W;
                arrayList.add(aVar5);
                ArrayList v = m5.y(this.currentAccount, false).v();
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
                    TL_stars.TL_starsGiveawayOption X = X(((Long) arrayList6.get(i17)).longValue());
                    if (X.missingStorePrice) {
                        z14 = true;
                    } else {
                        z14 = true;
                        if (this.p0 == 0 && X.isDefault) {
                            this.p0 = X.stars;
                        }
                        if (!X.extended || this.k0) {
                            i16++;
                            int i18 = this.k0 ? i17 : i17 + 2;
                            long j3 = X.stars;
                            ArrayList U = U(j3);
                            if (U.isEmpty()) {
                                float f7 = j3;
                                ArrayList U2 = U(this.p0);
                                int i19 = this.o0;
                                if (i19 < 0 || i19 >= U2.size()) {
                                    this.o0 = 0;
                                }
                                longValue = Math.round(f7 / (this.o0 >= U2.size() ? 1L : ((Long) U2.get(this.o0)).longValue()));
                            } else {
                                longValue = ((Long) U.get(Utilities.clamp(this.o0, U.size() - 1, 0))).longValue();
                            }
                            arrayList.add(ug.a.d(X, i18, longValue, this.p0 == X.stars, true));
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
                aVar5.i = W();
                arrayList.add(ug.a.c(LocaleController.getString(R.string.BoostingStarsOptionsInfo), false));
                List Y = Y();
                int i20 = this.o0;
                if (i20 < 0 || i20 >= Y.size()) {
                    this.o0 = 0;
                }
                if (Y.size() > 1) {
                    arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                    List Y2 = Y();
                    int i21 = this.o0;
                    ug.a aVar6 = new ug.a(5, false);
                    aVar6.k = Y2;
                    aVar6.i = i21;
                    arrayList.add(aVar6);
                    arrayList.add(ug.a.c(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
                }
            }
            arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
            if (!Z()) {
                arrayList.add(ug.a.b(chat, W(), false));
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
                    arrayList.add(ug.a.b((TLRPC.Chat) tLObject, W(), true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int W2 = W();
                    ug.a aVar7 = new ug.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = W2;
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
            int i23 = vg.u.v;
            arrayList.add(ug.a.e(r153, this.j0, true, arrayList4));
            arrayList.add(ug.a.e(1, this.j0, r153, arrayList4));
            arrayList.add(ug.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r153));
        } else {
            z12 = isChannelAndNotMegaGroup;
            if (this.i0 == 0) {
                if (!Z()) {
                    String string2 = LocaleController.getString(R.string.BoostingQuantityPrizes);
                    int W3 = W();
                    ug.a aVar8 = new ug.a(13, false);
                    aVar8.c = string2;
                    aVar8.i = W3;
                    arrayList.add(aVar8);
                    int i24 = this.n0;
                    ug.a aVar9 = new ug.a(5, false);
                    aVar9.k = this.Y;
                    aVar9.i = i24;
                    arrayList.add(aVar9);
                    arrayList.add(ug.a.c(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (!Z()) {
                    arrayList.add(ug.a.b(chat, W(), false));
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
                        arrayList.add(ug.a.b((TLRPC.Chat) tLObject2, W(), true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int W4 = W();
                        ug.a aVar10 = new ug.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = W4;
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
                int i26 = vg.u.v;
                arrayList.add(ug.a.e(r15, this.j0, true, arrayList4));
                arrayList.add(ug.a.e(1, this.j0, r15, arrayList4));
                arrayList.add(ug.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r15));
            }
            if (!Z()) {
                arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                int i27 = this.i0;
                int i28 = vg.d.v;
                ArrayList b10 = s.b(i27 == 0 ? V() : arrayList3.size(), this.f0);
                int i29 = 0;
                while (i29 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i29);
                    int i30 = tL_premiumGiftCodeOption.months;
                    int i31 = this.i0;
                    int i32 = vg.d.v;
                    int V = i31 == 0 ? V() : arrayList3.size();
                    long j10 = tL_premiumGiftCodeOption.amount;
                    int i33 = this.l0;
                    String str = tL_premiumGiftCodeOption.currency;
                    boolean z17 = i29 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    ug.a aVar11 = new ug.a(12, i30 == i33);
                    aVar11.i = i30;
                    aVar11.j = V;
                    aVar11.h = j10;
                    aVar11.g = z17;
                    aVar11.c = str;
                    aVar11.m = tL_premiumGiftCodeOption;
                    arrayList.add(aVar11);
                    i29++;
                    b10 = arrayList7;
                }
            }
            if (!Z()) {
                i10 = 3;
                arrayList.add(ug.a.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), i6.gc, 0, new t(this, i10), this.resourcesProvider), true));
                i11 = this.h0;
                int i34 = vg.d.v;
                if (i11 != i10 || this.i0 == 0) {
                    String string3 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
                    boolean z18 = this.w0;
                    int i35 = vg.y.L;
                    ug.a aVar12 = new ug.a(15, z18);
                    aVar12.c = string3;
                    aVar12.g = z18;
                    aVar12.l = 1;
                    arrayList.add(aVar12);
                    if (this.w0) {
                        z13 = false;
                        arrayList.add(ug.a.c(LocaleController.getString(this.h0 == 3 ? R.string.BoostingStarsGiveawayAdditionPrizeHint : R.string.BoostingGiveawayAdditionPrizeHint), false));
                    } else {
                        int V2 = Z() ? prepaidGiveaway.quantity : V();
                        z13 = false;
                        ug.a aVar13 = new ug.a(16, false);
                        aVar13.i = V2;
                        arrayList.add(aVar13);
                        String formatPluralString = LocaleController.formatPluralString("BoldMonths", this.l0, new Object[0]);
                        if (this.h0 == 3) {
                            if (this.v0.isEmpty()) {
                                arrayList.add(ug.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.p0, new Object[0])), false));
                            } else {
                                arrayList.add(ug.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.p0, Integer.valueOf(V2), this.v0)), false));
                            }
                        } else if (this.v0.isEmpty()) {
                            arrayList.add(ug.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", V2, formatPluralString)), false));
                        } else {
                            arrayList.add(ug.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", V2, this.v0, formatPluralString)), false));
                        }
                    }
                    arrayList.add(ug.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
                    long j11 = this.m0;
                    ug.a aVar14 = new ug.a(10, z13);
                    aVar14.h = j11;
                    arrayList.add(aVar14);
                    if (this.h0 != 3) {
                        if (Z()) {
                            r152 = 0;
                            arrayList.add(ug.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        } else {
                            r152 = 0;
                            arrayList.add(ug.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", V(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        }
                    } else {
                        r152 = 0;
                        r152 = 0;
                        if (Z()) {
                            arrayList.add(ug.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                        } else {
                            arrayList.add(ug.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", V(), new Object[0]), false));
                        }
                    }
                    String string4 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
                    ug.a aVar15 = new ug.a(15, this.x0);
                    aVar15.c = string4;
                    aVar15.g = r152;
                    aVar15.l = r152;
                    arrayList.add(aVar15);
                    if (Z()) {
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
        int i342 = vg.d.v;
        if (i11 != i10) {
        }
        String string32 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
        boolean z182 = this.w0;
        int i352 = vg.y.L;
        ug.a aVar122 = new ug.a(15, z182);
        aVar122.c = string32;
        aVar122.g = z182;
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
        if (Z()) {
        }
        bVar = this.g0;
        if (bVar != null) {
            if (z10) {
            }
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        qm0 qm0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (qm0Var = this.d) != null && qm0Var.G) {
            b0(true, true);
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

    @Override // org.telegram.ui.Components.eb
    public final pm0 x(qm0 qm0Var) {
        ug.b bVar = new ug.b(this.resourcesProvider);
        this.g0 = bVar;
        return bVar;
    }
}
