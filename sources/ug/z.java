package ug;

import ai.ga;
import ai.k2;
import ai.rc;
import ai.s9;
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
import org.telegram.messenger.w2;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.d4;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.ur;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.s1;
import org.telegram.ui.g20;
import org.telegram.ui.md0;
import w7.z5;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class z extends bb implements NotificationCenter.NotificationCenterDelegate {
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
    public j t0;
    public final TL_stories.PrepaidGiveaway u0;
    public String v0;
    public boolean w0;
    public boolean x0;
    public final s y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(n2 n2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(n2Var, false);
        int i10 = 5;
        this.X = new ArrayList();
        this.Y = r.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.Z = r.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
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
        this.y0 = new s(this, 0);
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
            int i14 = wg.d.v;
            this.h0 = 3;
        }
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.C = false;
        kVar.m = false;
        this.d.setItemAnimator(kVar);
        im0 im0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        im0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new y());
        this.d.setOnItemClickListener(new x4(23, this, n2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.b0 = chat;
        vg.b bVar = this.g0;
        ArrayList arrayList = this.X;
        im0 im0Var2 = this.d;
        t tVar = new t(this);
        t tVar2 = new t(this);
        t tVar3 = new t(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f = im0Var2;
        bVar.h = tVar;
        bVar.n = tVar2;
        bVar.s = tVar3;
        b0(false, false);
        wg.a aVar = new wg.a(getContext(), this.resourcesProvider);
        this.q0 = aVar;
        aVar.setOnClickListener(new ur(this, prepaidGiveaway, j10, n2Var));
        a0(false);
        this.containerView.addView(aVar, z5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        r.j(this.currentAccount, chat, new u(this, i10));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void Q(z zVar, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, n2 n2Var) {
        int i10;
        String str;
        ArrayList arrayList = zVar.e0;
        ArrayList arrayList2 = zVar.c0;
        TLRPC.Chat chat = zVar.b0;
        ArrayList arrayList3 = zVar.d0;
        ArrayList arrayList4 = zVar.f0;
        wg.a aVar = zVar.q0;
        if (aVar.a.N) {
            return;
        }
        if (zVar.Z()) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            w2 w2Var = new w2(zVar, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, 8);
            n2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
            String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
            b2 b2Var = alertDialog$Builder.a;
            b2Var.R = string;
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new qg.g0(w2Var, 21));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new sg.y(15));
            alertDialog$Builder.o();
            return;
        }
        int i11 = zVar.h0;
        int i12 = wg.d.v;
        int i13 = 3;
        if (i11 == 3) {
            Activity findActivity = AndroidUtilities.findActivity(zVar.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.H1;
            }
            if (findActivity == null || findActivity.isFinishing()) {
                return;
            }
            TL_stars.TL_starsGiveawayOption X = zVar.X(zVar.p0);
            int V = zVar.V();
            if (X == null) {
                return;
            }
            aVar.a.setLoading(true);
            int i14 = zVar.j0;
            int i15 = wg.u.v;
            boolean z10 = i14 == 1;
            ga y3 = ga.y(zVar.currentAccount, false);
            int i16 = 4;
            int l4 = r.l(zVar.m0);
            boolean z11 = zVar.x0;
            boolean z12 = zVar.w0;
            String str2 = zVar.v0;
            s1 s1Var = new s1(6, zVar, X);
            int i17 = y3.a;
            if (!MessagesController.getInstance(i17).starsPurchaseAvailable()) {
                n2 R2 = LaunchActivity.R();
                if (R2 == null || R2.getContext() == null) {
                    ga.e0(findActivity, null);
                    return;
                } else {
                    ga.e0(R2.getContext(), R2.getResourceProvider());
                    return;
                }
            }
            TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
            tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
            tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
            Activity activity = findActivity;
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
                aVar2.b = "inapp";
                aVar2.a = str;
                BillingController.getInstance().queryProductDetails(Arrays.asList(aVar2.a()), new a1.d(y3, s1Var, tL_inputStorePaymentStarsGiveaway, activity, 2));
                return;
            }
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q6 = d3.q(ga.I(), false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new k2(y3, s1Var, tL_inputInvoiceStars, i16));
            return;
        }
        int i20 = 2;
        int i21 = 12;
        if (zVar.i0 == 1) {
            ArrayList b10 = r.b(arrayList3.size(), arrayList4);
            for (int i22 = 0; i22 < b10.size(); i22++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i22);
                if (tL_premiumGiftCodeOption.months == zVar.l0 && arrayList3.size() > 0) {
                    if (r.h()) {
                        Context context = zVar.getContext();
                        d6 d6Var = zVar.resourcesProvider;
                        if (tL_premiumGiftCodeOption.store_product == null) {
                            ArrayList arrayList6 = new ArrayList();
                            int size3 = arrayList4.size();
                            int i23 = 0;
                            while (i23 < size3) {
                                Object obj3 = arrayList4.get(i23);
                                i23++;
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                    arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                }
                            }
                            String join = TextUtils.join(", ", arrayList6);
                            int i24 = tL_premiumGiftCodeOption.users;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, d6Var);
                            String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            b2 b2Var2 = alertDialog$Builder2.a;
                            b2Var2.R = string2;
                            b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i24, join));
                            alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new sg.y(i21));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    aVar.b(true);
                    r.k(arrayList3, tL_premiumGiftCodeOption, zVar.b0, null, n2Var, new u(zVar, 0), new u(zVar, 1));
                    return;
                }
            }
            return;
        }
        ArrayList b11 = r.b(zVar.V(), arrayList4);
        for (int i25 = 0; i25 < b11.size(); i25++) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i25);
            if (tL_premiumGiftCodeOption3.months == zVar.l0) {
                if (r.h()) {
                    List list = zVar.Y;
                    Context context2 = zVar.getContext();
                    d6 d6Var2 = zVar.resourcesProvider;
                    u uVar = new u(zVar, i20);
                    if (tL_premiumGiftCodeOption3.store_product == null) {
                        ArrayList arrayList7 = new ArrayList();
                        int size4 = arrayList4.size();
                        int i26 = 0;
                        while (i26 < size4) {
                            Object obj4 = arrayList4.get(i26);
                            i26++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                            if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                arrayList7.add(tL_premiumGiftCodeOption4);
                            }
                        }
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                        int size5 = arrayList7.size();
                        int i27 = 0;
                        while (i27 < size5) {
                            Object obj5 = arrayList7.get(i27);
                            i27++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                            int i28 = tL_premiumGiftCodeOption3.users;
                            int i29 = tL_premiumGiftCodeOption6.users;
                            if (i28 > i29 && i29 > tL_premiumGiftCodeOption5.users) {
                                tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                            }
                        }
                        String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                        int i30 = tL_premiumGiftCodeOption3.users;
                        int i31 = tL_premiumGiftCodeOption5.users;
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, d6Var2);
                        String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                        b2 b2Var3 = alertDialog$Builder3.a;
                        b2Var3.R = string3;
                        b2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i30, formatPluralString, Integer.valueOf(i31)));
                        alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new org.telegram.ui.web.n(14, uVar, tL_premiumGiftCodeOption5));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new sg.y(i21));
                        alertDialog$Builder3.o();
                        return;
                    }
                }
                int i32 = zVar.j0;
                int i33 = wg.u.v;
                boolean z13 = i32 == 1;
                int l10 = r.l(zVar.m0);
                aVar.b(true);
                boolean z14 = zVar.x0;
                boolean z15 = zVar.w0;
                String str3 = zVar.v0;
                u uVar2 = new u(zVar, i13);
                u uVar3 = new u(zVar, 4);
                if (r.h()) {
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z13;
                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                    tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                    tL_inputStorePaymentPremiumGiveaway.until_date = l10;
                    int i34 = tL_inputStorePaymentPremiumGiveaway.flags;
                    tL_inputStorePaymentPremiumGiveaway.flags = i34 | 6;
                    if (z15) {
                        tL_inputStorePaymentPremiumGiveaway.flags = i34 | 22;
                    }
                    tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                    int size6 = arrayList2.size();
                    int i35 = 0;
                    while (i35 < size6) {
                        Object obj6 = arrayList2.get(i35);
                        i35++;
                        TLObject tLObject = (TLObject) obj6;
                        if (tLObject instanceof TLRPC.Chat) {
                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).id));
                        }
                    }
                    tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    int size7 = arrayList.size();
                    int i36 = 0;
                    while (i36 < size7) {
                        Object obj7 = arrayList.get(i36);
                        i36++;
                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                    }
                    c5.a aVar3 = new c5.a();
                    aVar3.b = "inapp";
                    aVar3.a = tL_premiumGiftCodeOption3.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(aVar3.a()), new org.telegram.ui.Components.d1(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, uVar3, uVar2, n2Var, 3));
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
                int i37 = tL_inputStorePaymentPremiumGiveaway2.flags;
                tL_inputStorePaymentPremiumGiveaway2.flags = i37 | 6;
                if (z15) {
                    tL_inputStorePaymentPremiumGiveaway2.flags = i37 | 22;
                }
                tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                int size8 = arrayList2.size();
                int i38 = 0;
                while (i38 < size8) {
                    Object obj8 = arrayList2.get(i38);
                    int i39 = i38 + 1;
                    TLObject tLObject2 = (TLObject) obj8;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        i10 = i39;
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).id));
                    } else {
                        i10 = i39;
                    }
                    i38 = i10;
                }
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                int size9 = arrayList.size();
                int i40 = 0;
                while (i40 < size9) {
                    Object obj9 = arrayList.get(i40);
                    i40++;
                    tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                }
                tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                JSONObject q10 = d3.q(n2Var.getResourceProvider(), false);
                if (q10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = q10.toString();
                    tL_payments_getPaymentForm2.flags |= 1;
                }
                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                connectionsManager2.sendRequest(tL_payments_getPaymentForm2, new s9(uVar3, messagesController2, tL_inputInvoicePremiumGiftCode, n2Var, uVar2, 13));
                return;
            }
        }
    }

    public static void R(z zVar, n2 n2Var, View view) {
        n2.e eVar;
        ArrayList arrayList = zVar.d0;
        s sVar = zVar.y0;
        if (view instanceof wg.y) {
            wg.y yVar = (wg.y) view;
            int type = yVar.getType();
            boolean z10 = yVar.e.h;
            boolean z11 = !z10;
            yVar.setChecked(z11);
            int i10 = wg.y.L;
            if (type == 0) {
                zVar.x0 = z11;
                zVar.b0(false, false);
            } else if (type == 1) {
                yVar.setDivider(z11);
                zVar.w0 = z11;
                zVar.b0(false, false);
                vg.b bVar = zVar.g0;
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
                zVar.g0.G();
                if (zVar.w0) {
                    AndroidUtilities.cancelRunOnUIThread(sVar);
                } else {
                    AndroidUtilities.runOnUIThread(sVar, 250L);
                }
            }
        }
        if (view instanceof wg.c) {
            if (view instanceof wg.d) {
                int selectedType = ((wg.d) view).getSelectedType();
                int i14 = wg.d.v;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && zVar.h0 == selectedType) {
                        n2.e eVar2 = zVar.r0;
                        if (eVar2 != null) {
                            ((y0) eVar2.b).W(1, arrayList);
                            ((m) eVar2.c).b.D(1);
                            return;
                        }
                        return;
                    }
                    zVar.h0 = selectedType;
                    zVar.b0(true, true);
                    zVar.a0(true);
                    zVar.O();
                } else if (selectedType == 1) {
                    n2.e eVar3 = zVar.r0;
                    if (eVar3 != null) {
                        ((y0) eVar3.b).W(1, arrayList);
                        ((m) eVar3.c).b.D(1);
                    }
                } else {
                    zVar.i0 = selectedType;
                    zVar.b0(true, true);
                    zVar.a0(true);
                    zVar.O();
                }
            } else {
                wg.c cVar = (wg.c) view;
                im0 im0Var = zVar.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < im0Var.getChildCount(); i15++) {
                        View childAt = im0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            ((wg.c) childAt).c(childAt == cVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof wg.u) {
            int selectedType2 = ((wg.u) view).getSelectedType();
            if (zVar.j0 == selectedType2 && (eVar = zVar.r0) != null) {
                ((y0) eVar.b).W(3, zVar.e0);
                ((m) eVar.c).b.D(1);
            }
            zVar.j0 = selectedType2;
            zVar.b0(false, false);
            return;
        }
        if (view instanceof wg.i) {
            zVar.l0 = ((TLRPC.TL_premiumGiftCodeOption) ((wg.i) view).getGifCode()).months;
            zVar.b0(false, false);
            zVar.g0.G();
            return;
        }
        if (!(view instanceof wg.h)) {
            if (view instanceof wg.b) {
                n2.e eVar4 = zVar.r0;
                if (eVar4 != null) {
                    ((y0) eVar4.b).W(2, zVar.c0);
                    ((m) eVar4.c).b.D(1);
                    return;
                }
                return;
            }
            if (!(view instanceof wg.w)) {
                if (view instanceof rc) {
                    zVar.k0 = true;
                    zVar.b0(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((wg.w) view).getOption();
            if (option != null) {
                zVar.p0 = option.stars;
                zVar.b0(true, true);
                zVar.a0(true);
                zVar.O();
                return;
            }
            return;
        }
        Context context = n2Var.getContext();
        long j10 = zVar.m0;
        t tVar = new t(zVar);
        d6 d6Var = zVar.resourcesProvider;
        d5 d5Var = new d5(d6Var);
        a3 a3Var = new a3(context, d6Var);
        a3Var.a();
        od0 od0Var = new od0(context, d6Var);
        int i16 = d5Var.a;
        od0Var.setTextColor(i16);
        od0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        od0Var.setItemCount(5);
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
        d4 d4Var = new d4(context, d5Var, od0Var, gVar, hVar);
        d4Var.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        d4Var.addView(frameLayout, z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        textView.setTextColor(i16);
        k3.m(20.0f, 1, textView);
        frameLayout.addView(textView, z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new di.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        d4Var.addView(linearLayout, z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        md0 md0Var = new md0(context, 4);
        long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j11);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(od0Var, z5.l(0.5f, 0, 270));
        od0Var.setMinValue(0);
        od0Var.setMaxValue(i18 - 1);
        od0Var.setWrapSelectorWheel(false);
        od0Var.setTag("DAY");
        od0Var.setFormatter(new g20(currentTimeMillis, calendar, i17, 1));
        j4 j4Var = new j4(d4Var, gVar, hVar, i19, i20, od0Var);
        od0Var.setOnValueChangedListener(j4Var);
        gVar.setMinValue(0);
        gVar.setMaxValue(23);
        linearLayout.addView(gVar, z5.l(0.2f, 0, 270));
        gVar.setFormatter(new sg.y(13));
        gVar.setOnValueChangedListener(j4Var);
        hVar.setMinValue(0);
        hVar.setMaxValue(11);
        hVar.setValue(0);
        hVar.setFormatter(new sg.y(14));
        linearLayout.addView(hVar, z5.l(0.3f, 0, 270));
        hVar.setOnValueChangedListener(j4Var);
        if (j10 > 0) {
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            hVar.setValue(calendar.get(12) / 5);
            gVar.setValue(calendar.get(11));
            od0Var.setValue(timeInMillis);
            od0Var.getValue();
            j4Var.q(od0Var, od0Var.getValue());
            gVar.getValue();
            j4Var.q(gVar, gVar.getValue());
        }
        md0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        md0Var.setGravity(17);
        md0Var.setTextColor(d5Var.g);
        md0Var.setTextSize(1, 14.0f);
        md0Var.setTypeface(AndroidUtilities.bold());
        md0Var.setBackground(x5.e(new float[]{8.0f}, d5Var.h));
        md0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        d4Var.addView(md0Var, z5.t(-1, 48, 83, 16, 15, 16, 16));
        md0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, od0Var, gVar, hVar, tVar, a3Var));
        a3Var.b(d4Var);
        f3 f3Var = a3Var.a;
        f3Var.show();
        int i21 = d5Var.b;
        f3Var.setBackgroundColor(i21);
        f3Var.fixNavigationBar(i21);
        AndroidUtilities.setLightStatusBar(f3Var, i0.a.h(i21) > 0.699999988079071d);
    }

    public static void S(z zVar) {
        sg.m1 m1Var = new sg.m1(zVar.n, zVar.currentAccount, null, zVar.resourcesProvider);
        int i10 = 1;
        m1Var.setOnDismissListener(new v(zVar, i10));
        m1Var.setOnShowListener(new w(zVar, i10));
        m1Var.show();
    }

    public static void T(z zVar) {
        sg.m1 m1Var = new sg.m1(zVar.n, zVar.currentAccount, null, zVar.resourcesProvider);
        int i10 = 0;
        m1Var.setOnDismissListener(new v(zVar, i10));
        m1Var.setOnShowListener(new w(zVar, i10));
        m1Var.show();
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence A() {
        int i10 = this.i0;
        int i11 = wg.d.v;
        return i10 == 1 ? LocaleController.getString(R.string.GiftPremium) : LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }

    @Override // org.telegram.ui.Components.bb
    public final void D(Canvas canvas, int i10) {
        this.s0 = i10;
    }

    public final ArrayList U(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption X = X(j10);
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
        int i11 = wg.d.v;
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
        int i11 = wg.d.v;
        if (i10 == 2) {
            V = ((Integer) this.Y.get(this.n0)).intValue();
            g10 = r.g();
        } else {
            TL_stars.TL_starsGiveawayOption X = X(this.p0);
            if (X != null) {
                return X.yearly_boosts;
            }
            V = V();
            g10 = r.g();
        }
        return g10 * V;
    }

    public final TL_stars.TL_starsGiveawayOption X(long j10) {
        ArrayList v = ga.y(this.currentAccount, false).v();
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

    public final List Y() {
        int i10 = this.h0;
        int i11 = wg.d.v;
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
        wg.a aVar = this.q0;
        if (Z) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.u0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            } else {
                aVar.a(r.g() * prepaidGiveaway.quantity, z10);
                return;
            }
        }
        int i10 = this.i0;
        int i11 = wg.d.v;
        if (i10 == 0) {
            aVar.a(W(), z10);
            return;
        }
        ArrayList arrayList = this.d0;
        int g10 = r.g() * arrayList.size();
        boolean z11 = arrayList.size() > 0;
        aVar.e = true;
        ei.d dVar = aVar.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.b.setBackgroundColor(h6.w0(h6.h5, aVar.c));
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
        boolean Z = Z();
        ArrayList arrayList3 = this.d0;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.u0;
        if (Z) {
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
            if (Z()) {
                z12 = isChannelAndNotMegaGroup;
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    this.p0 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
                }
            } else {
                String string = LocaleController.getString(R.string.BoostingStarsOptions);
                int W = W();
                vg.a aVar5 = new vg.a(13, false);
                aVar5.c = string;
                aVar5.i = W;
                arrayList.add(aVar5);
                ArrayList v = ga.y(this.currentAccount, false).v();
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
                            long j10 = X.stars;
                            ArrayList U = U(j10);
                            if (U.isEmpty()) {
                                float f7 = j10;
                                ArrayList U2 = U(this.p0);
                                int i19 = this.o0;
                                if (i19 < 0 || i19 >= U2.size()) {
                                    this.o0 = 0;
                                }
                                longValue = Math.round(f7 / (this.o0 >= U2.size() ? 1L : ((Long) U2.get(this.o0)).longValue()));
                            } else {
                                longValue = ((Long) U.get(Utilities.clamp(this.o0, U.size() - 1, 0))).longValue();
                            }
                            arrayList.add(vg.a.d(X, i18, longValue, this.p0 == X.stars, true));
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
                aVar5.i = W();
                arrayList.add(vg.a.c(LocaleController.getString(R.string.BoostingStarsOptionsInfo), false));
                List Y = Y();
                int i20 = this.o0;
                if (i20 < 0 || i20 >= Y.size()) {
                    this.o0 = 0;
                }
                if (Y.size() > 1) {
                    arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                    List Y2 = Y();
                    int i21 = this.o0;
                    vg.a aVar6 = new vg.a(5, false);
                    aVar6.k = Y2;
                    aVar6.i = i21;
                    arrayList.add(aVar6);
                    arrayList.add(vg.a.c(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
                }
            }
            arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
            if (!Z()) {
                arrayList.add(vg.a.b(chat, W(), false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(vg.a.b(chat, prepaidGiveaway.quantity, false));
            } else {
                arrayList.add(vg.a.b(chat, r.g() * prepaidGiveaway.quantity, false));
            }
            int size3 = arrayList5.size();
            int i22 = 0;
            while (i22 < size3) {
                Object obj = arrayList5.get(i22);
                i22++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(vg.a.b((TLRPC.Chat) tLObject, W(), true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int W2 = W();
                    vg.a aVar7 = new vg.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = W2;
                    arrayList.add(aVar7);
                }
            }
            if (arrayList5.size() < r.f()) {
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
                if (!Z()) {
                    String string2 = LocaleController.getString(R.string.BoostingQuantityPrizes);
                    int W3 = W();
                    vg.a aVar8 = new vg.a(13, false);
                    aVar8.c = string2;
                    aVar8.i = W3;
                    arrayList.add(aVar8);
                    int i24 = this.n0;
                    vg.a aVar9 = new vg.a(5, false);
                    aVar9.k = this.Y;
                    aVar9.i = i24;
                    arrayList.add(aVar9);
                    arrayList.add(vg.a.c(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (!Z()) {
                    arrayList.add(vg.a.b(chat, W(), false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(vg.a.b(chat, prepaidGiveaway.quantity, false));
                } else {
                    arrayList.add(vg.a.b(chat, r.g() * prepaidGiveaway.quantity, false));
                }
                int size4 = arrayList5.size();
                int i25 = 0;
                while (i25 < size4) {
                    Object obj2 = arrayList5.get(i25);
                    i25++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(vg.a.b((TLRPC.Chat) tLObject2, W(), true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int W4 = W();
                        vg.a aVar10 = new vg.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = W4;
                        arrayList.add(aVar10);
                    }
                }
                if (arrayList5.size() < r.f()) {
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
            if (!Z()) {
                arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                int i27 = this.i0;
                int i28 = wg.d.v;
                ArrayList b10 = r.b(i27 == 0 ? V() : arrayList3.size(), this.f0);
                int i29 = 0;
                while (i29 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i29);
                    int i30 = tL_premiumGiftCodeOption.months;
                    int i31 = this.i0;
                    int i32 = wg.d.v;
                    int V = i31 == 0 ? V() : arrayList3.size();
                    long j11 = tL_premiumGiftCodeOption.amount;
                    int i33 = this.l0;
                    String str = tL_premiumGiftCodeOption.currency;
                    boolean z17 = i29 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    vg.a aVar11 = new vg.a(12, i30 == i33);
                    aVar11.i = i30;
                    aVar11.j = V;
                    aVar11.h = j11;
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
                arrayList.add(vg.a.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), h6.gc, 0, new s(this, i10), this.resourcesProvider), true));
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
                        int V2 = Z() ? prepaidGiveaway.quantity : V();
                        z13 = false;
                        vg.a aVar13 = new vg.a(16, false);
                        aVar13.i = V2;
                        arrayList.add(aVar13);
                        String formatPluralString = LocaleController.formatPluralString("BoldMonths", this.l0, new Object[0]);
                        if (this.h0 == 3) {
                            if (this.v0.isEmpty()) {
                                arrayList.add(vg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.p0, new Object[0])), false));
                            } else {
                                arrayList.add(vg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.p0, Integer.valueOf(V2), this.v0)), false));
                            }
                        } else if (this.v0.isEmpty()) {
                            arrayList.add(vg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", V2, formatPluralString)), false));
                        } else {
                            arrayList.add(vg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", V2, this.v0, formatPluralString)), false));
                        }
                    }
                    arrayList.add(vg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
                    long j12 = this.m0;
                    vg.a aVar14 = new vg.a(10, z13);
                    aVar14.h = j12;
                    arrayList.add(aVar14);
                    if (this.h0 != 3) {
                        if (Z()) {
                            r152 = 0;
                            arrayList.add(vg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        } else {
                            r152 = 0;
                            arrayList.add(vg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", V(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        }
                    } else {
                        r152 = 0;
                        r152 = 0;
                        if (Z()) {
                            arrayList.add(vg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                        } else {
                            arrayList.add(vg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", V(), new Object[0]), false));
                        }
                    }
                    String string4 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
                    vg.a aVar15 = new vg.a(15, this.x0);
                    aVar15.c = string4;
                    aVar15.g = r152;
                    aVar15.l = r152;
                    arrayList.add(aVar15);
                    if (Z()) {
                        arrayList.add(vg.a.c(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r152));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                        sb2.append(this.h0 != 3 ? org.telegram.messenger.g0.g(R.string.BoostingStoriesFeaturesAndTerms, new StringBuilder("\n\n")) : "");
                        arrayList.add(vg.a.c(AndroidUtilities.replaceSingleTag(sb2.toString(), h6.gc, 0, new s(this, 4), this.resourcesProvider), true));
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
        im0 im0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (im0Var = this.d) != null && im0Var.G) {
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

    @Override // org.telegram.ui.Components.bb
    public final hm0 x(im0 im0Var) {
        vg.b bVar = new vg.b(this.resourcesProvider);
        this.g0 = bVar;
        return bVar;
    }
}
