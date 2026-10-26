package vg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.ca;
import bi.h2;
import bi.jc;
import bi.n9;
import di.x4;
import hi.m3;
import hi.s4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import m4.w1;
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
import org.telegram.messenger.y2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.r1;
import org.telegram.ui.bn0;
import org.telegram.ui.j20;
import org.telegram.ui.zg1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class a0 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List a0;
    public final TLRPC.Chat b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final ArrayList e0;
    public final ArrayList f0;
    public wg.b g0;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public int l0;
    public long m0;
    public int n0;
    public int o0;
    public long p0;
    public final xg.a q0;
    public w1 r0;
    public int s0;
    public k t0;
    public final TL_stories.PrepaidGiveaway u0;
    public String v0;
    public boolean w0;
    public boolean x0;
    public final t y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(r2 r2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(r2Var, false);
        int i10 = 5;
        this.X = new ArrayList();
        this.Y = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.Z = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.a0 = Arrays.asList(750, 10000, 50000);
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        int i11 = xg.d.v;
        this.h0 = 2;
        this.i0 = 0;
        int i12 = xg.u.v;
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
        N();
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i14 = xg.d.v;
            this.h0 = 3;
        }
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(ds.h);
        lVar.C = false;
        lVar.m = false;
        this.d.setItemAnimator(lVar);
        mm0 mm0Var = this.d;
        int i15 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i15, 0, i15, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new z());
        this.d.setOnItemClickListener(new x4(23, this, r2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.b0 = chat;
        wg.b bVar = this.g0;
        ArrayList arrayList = this.X;
        mm0 mm0Var2 = this.d;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f = mm0Var2;
        bVar.h = uVar;
        bVar.n = uVar2;
        bVar.s = uVar3;
        a0(false, false);
        xg.a aVar = new xg.a(getContext(), this.resourcesProvider);
        this.q0 = aVar;
        aVar.setOnClickListener(new wr(this, prepaidGiveaway, j10, r2Var));
        Z(false);
        this.containerView.addView(aVar, gb1.h(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.currentAccount, chat, new v(this, i10));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, r2 r2Var) {
        String str;
        int i10;
        String str2;
        ArrayList arrayList = a0Var.e0;
        ArrayList arrayList2 = a0Var.c0;
        TLRPC.Chat chat = a0Var.b0;
        ArrayList arrayList3 = a0Var.d0;
        ArrayList arrayList4 = a0Var.f0;
        xg.a aVar = a0Var.q0;
        if (aVar.a.Q) {
            return;
        }
        int i11 = 3;
        if (a0Var.Y()) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            y2 y2Var = new y2(a0Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, 8);
            r2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
            String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
            e2 e2Var = alertDialog$Builder.a;
            e2Var.R = string;
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new org.telegram.ui.Components.voip.j1(y2Var, 26));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new d(3));
            alertDialog$Builder.p();
            return;
        }
        int i12 = a0Var.h0;
        int i13 = xg.d.v;
        String str3 = "inapp";
        if (i12 == 3) {
            Activity findActivity = AndroidUtilities.findActivity(a0Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.I1;
            }
            if (findActivity == null || findActivity.isFinishing()) {
                return;
            }
            TL_stars.TL_starsGiveawayOption W = a0Var.W(a0Var.p0);
            int U = a0Var.U();
            if (W == null) {
                return;
            }
            aVar.a.setLoading(true);
            int i14 = a0Var.j0;
            int i15 = xg.u.v;
            boolean z10 = i14 == 1;
            ca y3 = ca.y(a0Var.currentAccount, false);
            int l4 = s.l(a0Var.m0);
            boolean z11 = a0Var.x0;
            boolean z12 = a0Var.w0;
            int i16 = 4;
            String str4 = a0Var.v0;
            r1 r1Var = new r1(6, a0Var, W);
            int i17 = y3.a;
            if (!MessagesController.getInstance(i17).starsPurchaseAvailable()) {
                r2 R2 = LaunchActivity.R();
                if (R2 == null || R2.getContext() == null) {
                    ca.e0(findActivity, null);
                    return;
                } else {
                    ca.e0(R2.getContext(), R2.getResourceProvider());
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
                tL_inputStorePaymentStarsGiveaway.prize_description = str4;
            }
            tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i17).getNextRandomId();
            tL_inputStorePaymentStarsGiveaway.until_date = l4;
            tL_inputStorePaymentStarsGiveaway.currency = W.currency;
            tL_inputStorePaymentStarsGiveaway.amount = W.amount;
            tL_inputStorePaymentStarsGiveaway.users = U;
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str2 = W.store_product) != null) {
                d5.a aVar2 = new d5.a();
                aVar2.b = "inapp";
                aVar2.a = str2;
                BillingController.getInstance().queryProductDetails(Arrays.asList(aVar2.a()), new a1.d(y3, r1Var, tL_inputStorePaymentStarsGiveaway, activity, 2));
                return;
            }
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject q5 = m3.q(ca.I(), false);
            if (q5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new h2(y3, r1Var, tL_inputInvoiceStars, i16));
            return;
        }
        int i20 = 2;
        if (a0Var.i0 == 1) {
            ArrayList b10 = s.b(arrayList3.size(), arrayList4);
            for (int i21 = 0; i21 < b10.size(); i21++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i21);
                if (tL_premiumGiftCodeOption.months == a0Var.l0 && arrayList3.size() > 0) {
                    if (s.h()) {
                        Context context = a0Var.getContext();
                        u6 u6Var = a0Var.resourcesProvider;
                        if (tL_premiumGiftCodeOption.store_product == null) {
                            ArrayList arrayList6 = new ArrayList();
                            int size3 = arrayList4.size();
                            int i22 = 0;
                            while (i22 < size3) {
                                Object obj3 = arrayList4.get(i22);
                                i22++;
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                    arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                }
                            }
                            String join = TextUtils.join(", ", arrayList6);
                            int i23 = tL_premiumGiftCodeOption.users;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, u6Var);
                            String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            e2 e2Var2 = alertDialog$Builder2.a;
                            e2Var2.R = string2;
                            e2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i23, join));
                            alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new d(0));
                            alertDialog$Builder2.p();
                            return;
                        }
                    }
                    aVar.b(true);
                    s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.b0, null, r2Var, new v(a0Var, 0), new v(a0Var, 1));
                    return;
                }
            }
            return;
        }
        ArrayList b11 = s.b(a0Var.U(), arrayList4);
        int i24 = 0;
        while (i24 < b11.size()) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i24);
            if (tL_premiumGiftCodeOption3.months == a0Var.l0) {
                if (s.h()) {
                    List list = a0Var.Y;
                    Context context2 = a0Var.getContext();
                    u6 u6Var2 = a0Var.resourcesProvider;
                    v vVar = new v(a0Var, i20);
                    if (tL_premiumGiftCodeOption3.store_product == null) {
                        ArrayList arrayList7 = new ArrayList();
                        int size4 = arrayList4.size();
                        int i25 = 0;
                        while (i25 < size4) {
                            Object obj4 = arrayList4.get(i25);
                            i25++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                            if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                arrayList7.add(tL_premiumGiftCodeOption4);
                            }
                        }
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                        int size5 = arrayList7.size();
                        int i26 = 0;
                        while (i26 < size5) {
                            Object obj5 = arrayList7.get(i26);
                            i26++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                            int i27 = tL_premiumGiftCodeOption3.users;
                            int i28 = tL_premiumGiftCodeOption6.users;
                            if (i27 > i28 && i28 > tL_premiumGiftCodeOption5.users) {
                                tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                            }
                        }
                        String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                        int i29 = tL_premiumGiftCodeOption3.users;
                        int i30 = tL_premiumGiftCodeOption5.users;
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, u6Var2);
                        String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                        e2 e2Var3 = alertDialog$Builder3.a;
                        e2Var3.R = string3;
                        e2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i29, formatPluralString, Integer.valueOf(i30)));
                        alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new zg1(20, vVar, tL_premiumGiftCodeOption5));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new d(0));
                        alertDialog$Builder3.p();
                        return;
                    }
                }
                int i31 = a0Var.j0;
                int i32 = xg.u.v;
                boolean z13 = i31 == 1;
                int l10 = s.l(a0Var.m0);
                aVar.b(true);
                boolean z14 = a0Var.x0;
                boolean z15 = a0Var.w0;
                String str5 = a0Var.v0;
                v vVar2 = new v(a0Var, i11);
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
                    int i33 = tL_inputStorePaymentPremiumGiveaway.flags;
                    tL_inputStorePaymentPremiumGiveaway.flags = i33 | 6;
                    if (z15) {
                        tL_inputStorePaymentPremiumGiveaway.flags = i33 | 22;
                    }
                    tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                    int size6 = arrayList2.size();
                    int i34 = 0;
                    while (i34 < size6) {
                        Object obj6 = arrayList2.get(i34);
                        i34++;
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
                    int i35 = 0;
                    while (i35 < size7) {
                        Object obj7 = arrayList.get(i35);
                        i35++;
                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                    }
                    d5.a aVar3 = new d5.a();
                    aVar3.b = str7;
                    aVar3.a = tL_premiumGiftCodeOption3.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(aVar3.a()), new org.telegram.ui.Components.c1(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, vVar3, vVar2, r2Var, 3));
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
                int i36 = tL_inputStorePaymentPremiumGiveaway2.flags;
                tL_inputStorePaymentPremiumGiveaway2.flags = i36 | 6;
                if (z15) {
                    tL_inputStorePaymentPremiumGiveaway2.flags = i36 | 22;
                }
                tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                int size8 = arrayList2.size();
                int i37 = 0;
                while (i37 < size8) {
                    Object obj8 = arrayList2.get(i37);
                    int i38 = i37 + 1;
                    TLObject tLObject2 = (TLObject) obj8;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        i10 = i38;
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).id));
                    } else {
                        i10 = i38;
                    }
                    i37 = i10;
                }
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.id);
                tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                int size9 = arrayList.size();
                int i39 = 0;
                while (i39 < size9) {
                    Object obj9 = arrayList.get(i39);
                    i39++;
                    tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                }
                tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                JSONObject q9 = m3.q(r2Var.getResourceProvider(), false);
                if (q9 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = q9.toString();
                    tL_payments_getPaymentForm2.flags |= 1;
                }
                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                connectionsManager2.sendRequest(tL_payments_getPaymentForm2, new n9(vVar3, messagesController2, tL_inputInvoicePremiumGiftCode, r2Var, vVar2, 13));
                return;
            }
            i24++;
            str3 = str3;
        }
    }

    public static void Q(a0 a0Var, r2 r2Var, View view) {
        e4 e4Var;
        w1 w1Var;
        ArrayList arrayList = a0Var.d0;
        t tVar = a0Var.y0;
        if (view instanceof xg.y) {
            xg.y yVar = (xg.y) view;
            int type = yVar.getType();
            boolean z10 = yVar.e.h;
            boolean z11 = !z10;
            yVar.setChecked(z11);
            int i10 = xg.y.L;
            if (type == 0) {
                a0Var.x0 = z11;
                a0Var.a0(false, false);
            } else if (type == 1) {
                yVar.setDivider(z11);
                a0Var.w0 = z11;
                a0Var.a0(false, false);
                wg.b bVar = a0Var.g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.e.size()) {
                        break;
                    }
                    wg.a aVar = (wg.a) bVar.e.get(i11);
                    if (aVar.a == 15) {
                        int i12 = aVar.l;
                        int i13 = xg.y.L;
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
        if (view instanceof xg.c) {
            if (view instanceof xg.d) {
                int selectedType = ((xg.d) view).getSelectedType();
                int i14 = xg.d.v;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && a0Var.h0 == selectedType) {
                        w1 w1Var2 = a0Var.r0;
                        if (w1Var2 != null) {
                            ((z0) w1Var2.b).V(1, arrayList);
                            ((n) w1Var2.c).b.E(1);
                            return;
                        }
                        return;
                    }
                    a0Var.h0 = selectedType;
                    a0Var.a0(true, true);
                    a0Var.Z(true);
                    a0Var.N();
                } else if (selectedType == 1) {
                    w1 w1Var3 = a0Var.r0;
                    if (w1Var3 != null) {
                        ((z0) w1Var3.b).V(1, arrayList);
                        ((n) w1Var3.c).b.E(1);
                    }
                } else {
                    a0Var.i0 = selectedType;
                    a0Var.a0(true, true);
                    a0Var.Z(true);
                    a0Var.N();
                }
            } else {
                xg.c cVar = (xg.c) view;
                mm0 mm0Var = a0Var.d;
                if (cVar.b()) {
                    for (int i15 = 0; i15 < mm0Var.getChildCount(); i15++) {
                        View childAt = mm0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(cVar)) {
                            ((xg.c) childAt).c(childAt == cVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof xg.u) {
            int selectedType2 = ((xg.u) view).getSelectedType();
            if (a0Var.j0 == selectedType2 && (w1Var = a0Var.r0) != null) {
                ((z0) w1Var.b).V(3, a0Var.e0);
                ((n) w1Var.c).b.E(1);
            }
            a0Var.j0 = selectedType2;
            a0Var.a0(false, false);
            return;
        }
        if (view instanceof xg.i) {
            a0Var.l0 = ((TLRPC.TL_premiumGiftCodeOption) ((xg.i) view).getGifCode()).months;
            a0Var.a0(false, false);
            a0Var.g0.G();
            return;
        }
        if (!(view instanceof xg.h)) {
            if (view instanceof xg.b) {
                w1 w1Var4 = a0Var.r0;
                if (w1Var4 != null) {
                    ((z0) w1Var4.b).V(2, a0Var.c0);
                    ((n) w1Var4.c).b.E(1);
                    return;
                }
                return;
            }
            if (!(view instanceof xg.w)) {
                if (view instanceof jc) {
                    a0Var.k0 = true;
                    a0Var.a0(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((xg.w) view).getOption();
            if (option != null) {
                a0Var.p0 = option.stars;
                a0Var.a0(true, true);
                a0Var.Z(true);
                a0Var.N();
                return;
            }
            return;
        }
        Context context = r2Var.getContext();
        long j10 = a0Var.m0;
        u uVar = new u(a0Var);
        u6 u6Var = a0Var.resourcesProvider;
        d5 d5Var = new d5(u6Var);
        e3 e3Var = new e3(context, u6Var);
        e3Var.a();
        md0 md0Var = new md0(context, u6Var);
        int i16 = d5Var.a;
        md0Var.setTextColor(i16);
        md0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        md0Var.setItemCount(5);
        h hVar = new h(context, u6Var);
        hVar.setWrapSelectorWheel(true);
        hVar.setAllItemsCount(24);
        hVar.setItemCount(5);
        hVar.setTextColor(i16);
        hVar.setTextOffset(-AndroidUtilities.dp(10.0f));
        hVar.setTag("HOUR");
        i iVar = new i(context, u6Var);
        iVar.setWrapSelectorWheel(true);
        iVar.setAllItemsCount(60);
        iVar.setItemCount(5);
        iVar.setTextColor(i16);
        iVar.setTextOffset(-AndroidUtilities.dp(34.0f));
        e4 e4Var2 = new e4(context, d5Var, md0Var, hVar, iVar);
        e4Var2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e4Var2.addView(frameLayout, gb1.x(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        textView.setTextColor(i16);
        ic.a.o(20.0f, 1, textView);
        frameLayout.addView(textView, gb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ei.d(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        e4Var2.addView(linearLayout, gb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i17 = calendar.get(1);
        bn0 bn0Var = new bn0(context, 3);
        long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j11);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(md0Var, gb1.p(0.5f, 0, 270));
        md0Var.setMinValue(0);
        md0Var.setMaxValue(i18 - 1);
        md0Var.setWrapSelectorWheel(false);
        md0Var.setTag("DAY");
        md0Var.setFormatter(new j20(currentTimeMillis, calendar, i17, 1));
        s4 s4Var = new s4(e4Var2, hVar, iVar, i19, i20, md0Var);
        md0Var.setOnValueChangedListener(s4Var);
        hVar.setMinValue(0);
        hVar.setMaxValue(23);
        linearLayout.addView(hVar, gb1.p(0.2f, 0, 270));
        hVar.setFormatter(new d(1));
        hVar.setOnValueChangedListener(s4Var);
        iVar.setMinValue(0);
        iVar.setMaxValue(11);
        iVar.setValue(0);
        iVar.setFormatter(new d(2));
        linearLayout.addView(iVar, gb1.p(0.3f, 0, 270));
        iVar.setOnValueChangedListener(s4Var);
        if (j10 > 0) {
            e4Var = e4Var2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            iVar.setValue(calendar.get(12) / 5);
            hVar.setValue(calendar.get(11));
            md0Var.setValue(timeInMillis);
            md0Var.getValue();
            s4Var.q(md0Var, md0Var.getValue());
            hVar.getValue();
            s4Var.q(hVar, hVar.getValue());
        } else {
            e4Var = e4Var2;
        }
        bn0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        bn0Var.setGravity(17);
        bn0Var.setTextColor(d5Var.g);
        bn0Var.setTextSize(1, 14.0f);
        bn0Var.setTypeface(AndroidUtilities.bold());
        bn0Var.setBackground(o6.e(new float[]{8.0f}, d5Var.h));
        bn0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        e4Var.addView(bn0Var, gb1.x(-1, 48, 83, 16, 15, 16, 16));
        bn0Var.setOnClickListener(new org.telegram.ui.Components.m0(calendar, md0Var, hVar, iVar, uVar, e3Var));
        e3Var.b(e4Var);
        k3 k3Var = e3Var.a;
        k3Var.show();
        int i21 = d5Var.b;
        k3Var.setBackgroundColor(i21);
        k3Var.fixNavigationBar(i21);
        AndroidUtilities.setLightStatusBar(k3Var, i0.a.h(i21) > 0.699999988079071d);
    }

    public static void R(a0 a0Var) {
        tg.m1 m1Var = new tg.m1(a0Var.n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        int i10 = 1;
        m1Var.setOnDismissListener(new w(a0Var, i10));
        m1Var.setOnShowListener(new x(a0Var, i10));
        m1Var.show();
    }

    public static void S(a0 a0Var) {
        tg.m1 m1Var = new tg.m1(a0Var.n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        int i10 = 0;
        m1Var.setOnDismissListener(new w(a0Var, i10));
        m1Var.setOnShowListener(new x(a0Var, i10));
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
        int i11 = xg.d.v;
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
        int g7;
        int i10 = this.h0;
        int i11 = xg.d.v;
        if (i10 == 2) {
            U = ((Integer) this.Y.get(this.n0)).intValue();
            g7 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption W = W(this.p0);
            if (W != null) {
                return W.yearly_boosts;
            }
            U = U();
            g7 = s.g();
        }
        return g7 * U;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j10) {
        ArrayList v = ca.y(this.currentAccount, false).v();
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
        int i11 = xg.d.v;
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
        xg.a aVar = this.q0;
        if (Y) {
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
        int i11 = xg.d.v;
        if (i10 == 0) {
            aVar.a(V(), z10);
            return;
        }
        ArrayList arrayList = this.d0;
        int g7 = s.g() * arrayList.size();
        boolean z11 = arrayList.size() > 0;
        aVar.e = true;
        fi.d dVar = aVar.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g7, z10);
        dVar.i(LocaleController.getString(R.string.GiftPremium), z10, true);
        f7.i(y6.h5, aVar.b, aVar.c);
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
        wg.b bVar;
        ?? r153;
        boolean z14;
        long longValue;
        ArrayList arrayList = this.X;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i12 = this.h0;
        int i13 = xg.d.v;
        boolean z15 = i12 == 3;
        wg.a aVar = new wg.a(0, false);
        aVar.g = z15;
        arrayList.add(aVar);
        boolean Y = Y();
        ArrayList arrayList3 = this.d0;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.u0;
        if (Y) {
            wg.a aVar2 = new wg.a(14, false);
            aVar2.f = prepaidGiveaway;
            arrayList.add(aVar2);
        } else {
            int size = arrayList3.size();
            wg.a aVar3 = new wg.a(2, this.h0 == 2);
            aVar3.l = 2;
            aVar3.i = size;
            aVar3.f = null;
            arrayList.add(aVar3);
            int size2 = arrayList3.size();
            wg.a aVar4 = new wg.a(2, this.h0 == 3);
            aVar4.l = 3;
            aVar4.i = size2;
            aVar4.f = null;
            arrayList.add(aVar4);
        }
        arrayList.add(new wg.a(4, false));
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
                wg.a aVar5 = new wg.a(13, false);
                aVar5.c = string;
                aVar5.i = V;
                arrayList.add(aVar5);
                ArrayList v = ca.y(this.currentAccount, false).v();
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
                            arrayList.add(wg.a.d(W, i18, longValue, this.p0 == W.stars, true));
                        }
                    }
                }
                if (!this.k0 && i16 < arrayList6.size()) {
                    arrayList.add(new wg.a(18, false));
                }
                if (i16 <= 0) {
                    arrayList.add(wg.a.d(null, 0, 1L, false, true));
                    arrayList.add(wg.a.d(null, 1, 1L, false, true));
                    arrayList.add(wg.a.d(null, 2, 1L, false, false));
                }
                aVar5.i = V();
                arrayList.add(wg.a.c(LocaleController.getString(R.string.BoostingStarsOptionsInfo), false));
                List X = X();
                int i20 = this.o0;
                if (i20 < 0 || i20 >= X.size()) {
                    this.o0 = 0;
                }
                if (X.size() > 1) {
                    arrayList.add(wg.a.f(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                    List X2 = X();
                    int i21 = this.o0;
                    wg.a aVar6 = new wg.a(5, false);
                    aVar6.k = X2;
                    aVar6.i = i21;
                    arrayList.add(aVar6);
                    arrayList.add(wg.a.c(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
                }
            }
            arrayList.add(wg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
            if (!Y()) {
                arrayList.add(wg.a.b(chat, V(), false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(wg.a.b(chat, prepaidGiveaway.quantity, false));
            } else {
                arrayList.add(wg.a.b(chat, s.g() * prepaidGiveaway.quantity, false));
            }
            int size3 = arrayList5.size();
            int i22 = 0;
            while (i22 < size3) {
                Object obj = arrayList5.get(i22);
                i22++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(wg.a.b((TLRPC.Chat) tLObject, V(), true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int V2 = V();
                    wg.a aVar7 = new wg.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = V2;
                    arrayList.add(aVar7);
                }
            }
            if (arrayList5.size() < s.f()) {
                r153 = 0;
                arrayList.add(new wg.a(8, false));
            } else {
                r153 = 0;
            }
            arrayList.add(wg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r153));
            arrayList.add(wg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
            int i23 = xg.u.v;
            arrayList.add(wg.a.e(r153, this.j0, true, arrayList4));
            arrayList.add(wg.a.e(1, this.j0, r153, arrayList4));
            arrayList.add(wg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r153));
        } else {
            z12 = isChannelAndNotMegaGroup;
            if (this.i0 == 0) {
                if (!Y()) {
                    String string2 = LocaleController.getString(R.string.BoostingQuantityPrizes);
                    int V3 = V();
                    wg.a aVar8 = new wg.a(13, false);
                    aVar8.c = string2;
                    aVar8.i = V3;
                    arrayList.add(aVar8);
                    int i24 = this.n0;
                    wg.a aVar9 = new wg.a(5, false);
                    aVar9.k = this.Y;
                    aVar9.i = i24;
                    arrayList.add(aVar9);
                    arrayList.add(wg.a.c(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                arrayList.add(wg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (!Y()) {
                    arrayList.add(wg.a.b(chat, V(), false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(wg.a.b(chat, prepaidGiveaway.quantity, false));
                } else {
                    arrayList.add(wg.a.b(chat, s.g() * prepaidGiveaway.quantity, false));
                }
                int size4 = arrayList5.size();
                int i25 = 0;
                while (i25 < size4) {
                    Object obj2 = arrayList5.get(i25);
                    i25++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(wg.a.b((TLRPC.Chat) tLObject2, V(), true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int V4 = V();
                        wg.a aVar10 = new wg.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = V4;
                        arrayList.add(aVar10);
                    }
                }
                if (arrayList5.size() < s.f()) {
                    r15 = 0;
                    arrayList.add(new wg.a(8, false));
                } else {
                    r15 = 0;
                }
                arrayList.add(wg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r15));
                arrayList.add(wg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
                int i26 = xg.u.v;
                arrayList.add(wg.a.e(r15, this.j0, true, arrayList4));
                arrayList.add(wg.a.e(1, this.j0, r15, arrayList4));
                arrayList.add(wg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r15));
            }
            if (!Y()) {
                arrayList.add(wg.a.f(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                int i27 = this.i0;
                int i28 = xg.d.v;
                ArrayList b10 = s.b(i27 == 0 ? U() : arrayList3.size(), this.f0);
                int i29 = 0;
                while (i29 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i29);
                    int i30 = tL_premiumGiftCodeOption.months;
                    int i31 = this.i0;
                    int i32 = xg.d.v;
                    int U = i31 == 0 ? U() : arrayList3.size();
                    long j11 = tL_premiumGiftCodeOption.amount;
                    int i33 = this.l0;
                    String str = tL_premiumGiftCodeOption.currency;
                    boolean z17 = i29 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    wg.a aVar11 = new wg.a(12, i30 == i33);
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
                arrayList.add(wg.a.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), y6.gc, 0, new t(this, i10), this.resourcesProvider), true));
                i11 = this.h0;
                int i34 = xg.d.v;
                if (i11 != i10 || this.i0 == 0) {
                    String string3 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
                    boolean z18 = this.w0;
                    int i35 = xg.y.L;
                    wg.a aVar12 = new wg.a(15, z18);
                    aVar12.c = string3;
                    aVar12.g = z18;
                    aVar12.l = 1;
                    arrayList.add(aVar12);
                    if (this.w0) {
                        z13 = false;
                        arrayList.add(wg.a.c(LocaleController.getString(this.h0 == 3 ? R.string.BoostingStarsGiveawayAdditionPrizeHint : R.string.BoostingGiveawayAdditionPrizeHint), false));
                    } else {
                        int U2 = Y() ? prepaidGiveaway.quantity : U();
                        z13 = false;
                        wg.a aVar13 = new wg.a(16, false);
                        aVar13.i = U2;
                        arrayList.add(aVar13);
                        String formatPluralString = LocaleController.formatPluralString("BoldMonths", this.l0, new Object[0]);
                        if (this.h0 == 3) {
                            if (this.v0.isEmpty()) {
                                arrayList.add(wg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.p0, new Object[0])), false));
                            } else {
                                arrayList.add(wg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.p0, Integer.valueOf(U2), this.v0)), false));
                            }
                        } else if (this.v0.isEmpty()) {
                            arrayList.add(wg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", U2, formatPluralString)), false));
                        } else {
                            arrayList.add(wg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", U2, this.v0, formatPluralString)), false));
                        }
                    }
                    arrayList.add(wg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
                    long j12 = this.m0;
                    wg.a aVar14 = new wg.a(10, z13);
                    aVar14.h = j12;
                    arrayList.add(aVar14);
                    if (this.h0 != 3) {
                        if (Y()) {
                            r152 = 0;
                            arrayList.add(wg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        } else {
                            r152 = 0;
                            arrayList.add(wg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", U(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        }
                    } else {
                        r152 = 0;
                        r152 = 0;
                        if (Y()) {
                            arrayList.add(wg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                        } else {
                            arrayList.add(wg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", U(), new Object[0]), false));
                        }
                    }
                    String string4 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
                    wg.a aVar15 = new wg.a(15, this.x0);
                    aVar15.c = string4;
                    aVar15.g = r152;
                    aVar15.l = r152;
                    arrayList.add(aVar15);
                    if (Y()) {
                        arrayList.add(wg.a.c(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r152));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                        sb2.append(this.h0 != 3 ? org.telegram.messenger.t.h(R.string.BoostingStoriesFeaturesAndTerms, new StringBuilder("\n\n")) : "");
                        arrayList.add(wg.a.c(AndroidUtilities.replaceSingleTag(sb2.toString(), y6.gc, 0, new t(this, 4), this.resourcesProvider), true));
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
        int i342 = xg.d.v;
        if (i11 != i10) {
        }
        String string32 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
        boolean z182 = this.w0;
        int i352 = xg.y.L;
        wg.a aVar122 = new wg.a(15, z182);
        aVar122.c = string32;
        aVar122.g = z182;
        aVar122.l = 1;
        arrayList.add(aVar122);
        if (this.w0) {
        }
        arrayList.add(wg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
        long j122 = this.m0;
        wg.a aVar142 = new wg.a(10, z13);
        aVar142.h = j122;
        arrayList.add(aVar142);
        if (this.h0 != 3) {
        }
        String string42 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
        wg.a aVar152 = new wg.a(15, this.x0);
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

    @Override // org.telegram.ui.ActionBar.k3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.n2
    public final void dismiss() {
        k kVar = this.t0;
        if (kVar != null) {
            kVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override // org.telegram.ui.Components.bb
    public final lm0 v(mm0 mm0Var) {
        wg.b bVar = new wg.b(this.resourcesProvider);
        this.g0 = bVar;
        return bVar;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        int i10 = this.i0;
        int i11 = xg.d.v;
        return i10 == 1 ? LocaleController.getString(R.string.GiftPremium) : LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
