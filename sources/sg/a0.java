package sg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.k6;
import bi.wa;
import bi.ze;
import com.google.android.gms.internal.vision.e2;
import di.n3;
import di.y4;
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
import org.telegram.messenger.a2;
import org.telegram.messenger.x2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fz0;
import org.telegram.ui.hn0;
import org.telegram.ui.y20;
import w7.a6;
import xh.i7;
import xh.v5;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class a0 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList X;
    public final List Y;
    public final List Z;
    public final List a0;
    public final TLRPC.Chat b0;
    public final ArrayList c0;
    public final ArrayList d0;
    public final ArrayList e0;
    public final ArrayList f0;
    public tg.b g0;
    public int h0;
    public int i0;
    public int j0;
    public boolean k0;
    public int l0;
    public long m0;
    public int n0;
    public int o0;
    public long p0;
    public final ug.a q0;
    public n7.a1 r0;
    public int s0;
    public j t0;
    public final TL_stories.PrepaidGiveaway u0;
    public String v0;
    public boolean w0;
    public boolean x0;
    public final t y0;

    public a0(p2 p2Var, long j3, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(p2Var, false);
        this.X = new ArrayList();
        this.Y = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.Z = s.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.a0 = Arrays.asList(750, 10000, 50000);
        this.c0 = new ArrayList();
        this.d0 = new ArrayList();
        this.e0 = new ArrayList();
        this.f0 = new ArrayList();
        int i10 = ug.d.s;
        this.h0 = 2;
        this.i0 = 0;
        int i11 = ug.u.s;
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
        N();
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = ug.d.s;
            this.h0 = 3;
        }
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(wr.h);
        jVar.C = false;
        jVar.m = false;
        this.d.setItemAnimator(jVar);
        vl0 vl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new z());
        this.d.setOnItemClickListener(new ai.b0(22, this, p2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j3));
        this.b0 = chat;
        tg.b bVar = this.g0;
        ArrayList arrayList = this.X;
        vl0 vl0Var2 = this.d;
        u uVar = new u(this);
        u uVar2 = new u(this);
        u uVar3 = new u(this);
        bVar.e = arrayList;
        bVar.v = chat;
        bVar.f = vl0Var2;
        bVar.h = uVar;
        bVar.n = uVar2;
        bVar.s = uVar3;
        a0(false, false);
        ug.a aVar = new ug.a(getContext(), this.resourcesProvider);
        this.q0 = aVar;
        aVar.setOnClickListener(new pr(this, prepaidGiveaway, j3, p2Var));
        Z(false);
        this.containerView.addView(aVar, a6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        s.j(this.currentAccount, chat, new v(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(a0 a0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j3, p2 p2Var) {
        int i10;
        String str;
        ArrayList arrayList = a0Var.e0;
        ArrayList arrayList2 = a0Var.c0;
        TLRPC.Chat chat = a0Var.b0;
        ArrayList arrayList3 = a0Var.d0;
        ArrayList arrayList4 = a0Var.f0;
        ug.a aVar = a0Var.q0;
        if (aVar.a.N) {
            return;
        }
        int i11 = 25;
        if (a0Var.Y()) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            x2 x2Var = new x2(a0Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j3, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, 8);
            p2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
            String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
            d2 d2Var = alertDialog$Builder.a;
            d2Var.R = string;
            d2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new org.telegram.tgnet.j(x2Var, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new s0.b(i11));
            alertDialog$Builder.o();
            return;
        }
        int i12 = a0Var.h0;
        int i13 = ug.d.s;
        int i14 = 3;
        if (i12 == 3) {
            Activity findActivity = AndroidUtilities.findActivity(a0Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
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
            int i15 = a0Var.j0;
            int i16 = ug.u.s;
            boolean z10 = i15 == 1;
            v5 y3 = v5.y(a0Var.currentAccount, false);
            int l4 = s.l(a0Var.m0);
            boolean z11 = a0Var.x0;
            boolean z12 = a0Var.w0;
            String str2 = a0Var.v0;
            k6 k6Var = new k6(19, a0Var, W);
            int i17 = y3.a;
            if (!MessagesController.getInstance(i17).starsPurchaseAvailable()) {
                p2 R2 = LaunchActivity.R();
                if (R2 == null || R2.getContext() == null) {
                    v5.e0(findActivity, null);
                    return;
                } else {
                    v5.e0(R2.getContext(), R2.getResourceProvider());
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
                BillingController.getInstance().queryProductDetails(Arrays.asList(aVar2.a()), new a1.d(y3, k6Var, tL_inputStorePaymentStarsGiveaway, activity, 22));
                return;
            }
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p5 = n3.p(v5.I(), false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new wa(y3, k6Var, tL_inputInvoiceStars, 25));
            return;
        }
        int i20 = 22;
        if (a0Var.i0 == 1) {
            ArrayList b10 = s.b(arrayList3.size(), arrayList4);
            for (int i21 = 0; i21 < b10.size(); i21++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i21);
                if (tL_premiumGiftCodeOption.months == a0Var.l0 && arrayList3.size() > 0) {
                    if (s.h()) {
                        Context context = a0Var.getContext();
                        f6 f6Var = a0Var.resourcesProvider;
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
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, f6Var);
                            String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            d2 d2Var2 = alertDialog$Builder2.a;
                            d2Var2.R = string2;
                            d2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i23, join));
                            alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new s0.b(i20));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    aVar.b(true);
                    s.k(arrayList3, tL_premiumGiftCodeOption, a0Var.b0, null, p2Var, new v(a0Var, 0), new v(a0Var, 1));
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
                    f6 f6Var2 = a0Var.resourcesProvider;
                    v vVar = new v(a0Var, 2);
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
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, f6Var2);
                        String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                        d2 d2Var3 = alertDialog$Builder3.a;
                        d2Var3.R = string3;
                        d2Var3.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i29, formatPluralString, Integer.valueOf(i30)));
                        alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new fz0(27, vVar, tL_premiumGiftCodeOption5));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new s0.b(i20));
                        alertDialog$Builder3.o();
                        return;
                    }
                }
                int i31 = a0Var.j0;
                int i32 = ug.u.s;
                boolean z13 = i31 == 1;
                int l10 = s.l(a0Var.m0);
                aVar.b(true);
                boolean z14 = a0Var.x0;
                boolean z15 = a0Var.w0;
                String str3 = a0Var.v0;
                v vVar2 = new v(a0Var, i14);
                v vVar3 = new v(a0Var, 4);
                if (s.h()) {
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z13;
                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                    tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
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
                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).id));
                        }
                    }
                    tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.id);
                    int size7 = arrayList.size();
                    int i35 = 0;
                    while (i35 < size7) {
                        Object obj7 = arrayList.get(i35);
                        i35++;
                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                    }
                    c5.a aVar3 = new c5.a();
                    aVar3.b = "inapp";
                    aVar3.a = tL_premiumGiftCodeOption3.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(aVar3.a()), new org.telegram.ui.Components.f1(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, vVar3, vVar2, p2Var, 3));
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
                JSONObject p10 = n3.p(p2Var.getResourceProvider(), false);
                if (p10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = p10.toString();
                    tL_payments_getPaymentForm2.flags |= 1;
                }
                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                connectionsManager2.sendRequest(tL_payments_getPaymentForm2, new ze(vVar3, messagesController2, tL_inputInvoicePremiumGiftCode, p2Var, vVar2, 12));
                return;
            }
            i24++;
            i20 = 22;
        }
    }

    public static void Q(a0 a0Var, p2 p2Var, View view) {
        b4 b4Var;
        n7.a1 a1Var;
        ArrayList arrayList = a0Var.d0;
        t tVar = a0Var.y0;
        if (view instanceof ug.y) {
            ug.y yVar = (ug.y) view;
            int type = yVar.getType();
            boolean z10 = yVar.e.h;
            boolean z11 = !z10;
            yVar.setChecked(z11);
            int i10 = ug.y.L;
            if (type == 0) {
                a0Var.x0 = z11;
                a0Var.a0(false, false);
            } else if (type == 1) {
                yVar.setDivider(z11);
                a0Var.w0 = z11;
                a0Var.a0(false, false);
                tg.b bVar = a0Var.g0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar.e.size()) {
                        break;
                    }
                    tg.a aVar = (tg.a) bVar.e.get(i11);
                    if (aVar.a == 15) {
                        int i12 = aVar.l;
                        int i13 = ug.y.L;
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
        int i14 = 2;
        if (view instanceof ug.c) {
            if (view instanceof ug.d) {
                int selectedType = ((ug.d) view).getSelectedType();
                int i15 = ug.d.s;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && a0Var.h0 == selectedType) {
                        n7.a1 a1Var2 = a0Var.r0;
                        if (a1Var2 != null) {
                            ((c1) a1Var2.b).V(1, arrayList);
                            ((m) a1Var2.c).b.D(1);
                            return;
                        }
                        return;
                    }
                    a0Var.h0 = selectedType;
                    a0Var.a0(true, true);
                    a0Var.Z(true);
                    a0Var.N();
                } else if (selectedType == 1) {
                    n7.a1 a1Var3 = a0Var.r0;
                    if (a1Var3 != null) {
                        ((c1) a1Var3.b).V(1, arrayList);
                        ((m) a1Var3.c).b.D(1);
                    }
                } else {
                    a0Var.i0 = selectedType;
                    a0Var.a0(true, true);
                    a0Var.Z(true);
                    a0Var.N();
                }
            } else {
                ug.c cVar = (ug.c) view;
                vl0 vl0Var = a0Var.d;
                if (cVar.b()) {
                    for (int i16 = 0; i16 < vl0Var.getChildCount(); i16++) {
                        View childAt = vl0Var.getChildAt(i16);
                        if (childAt.getClass().isInstance(cVar)) {
                            ((ug.c) childAt).c(childAt == cVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof ug.u) {
            int selectedType2 = ((ug.u) view).getSelectedType();
            if (a0Var.j0 == selectedType2 && (a1Var = a0Var.r0) != null) {
                ((c1) a1Var.b).V(3, a0Var.e0);
                ((m) a1Var.c).b.D(1);
            }
            a0Var.j0 = selectedType2;
            a0Var.a0(false, false);
            return;
        }
        if (view instanceof ug.i) {
            a0Var.l0 = ((TLRPC.TL_premiumGiftCodeOption) ((ug.i) view).getGifCode()).months;
            a0Var.a0(false, false);
            a0Var.g0.G();
            return;
        }
        if (!(view instanceof ug.h)) {
            if (view instanceof ug.b) {
                n7.a1 a1Var4 = a0Var.r0;
                if (a1Var4 != null) {
                    ((c1) a1Var4.b).V(2, a0Var.c0);
                    ((m) a1Var4.c).b.D(1);
                    return;
                }
                return;
            }
            if (!(view instanceof ug.w)) {
                if (view instanceof i7) {
                    a0Var.k0 = true;
                    a0Var.a0(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((ug.w) view).getOption();
            if (option != null) {
                a0Var.p0 = option.stars;
                a0Var.a0(true, true);
                a0Var.Z(true);
                a0Var.N();
                return;
            }
            return;
        }
        Context context = p2Var.getContext();
        long j3 = a0Var.m0;
        u uVar = new u(a0Var);
        f6 f6Var = a0Var.resourcesProvider;
        b5 b5Var = new b5(f6Var);
        c3 c3Var = new c3(context, f6Var);
        c3Var.a();
        dd0 dd0Var = new dd0(context, f6Var);
        int i17 = b5Var.a;
        dd0Var.setTextColor(i17);
        dd0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        dd0Var.setItemCount(5);
        g gVar = new g(context, f6Var);
        gVar.setWrapSelectorWheel(true);
        gVar.setAllItemsCount(24);
        gVar.setItemCount(5);
        gVar.setTextColor(i17);
        gVar.setTextOffset(-AndroidUtilities.dp(10.0f));
        gVar.setTag("HOUR");
        h hVar = new h(context, f6Var);
        hVar.setWrapSelectorWheel(true);
        hVar.setAllItemsCount(60);
        hVar.setItemCount(5);
        hVar.setTextColor(i17);
        hVar.setTextOffset(-AndroidUtilities.dp(34.0f));
        b4 b4Var2 = new b4(context, b5Var, dd0Var, gVar, hVar);
        b4Var2.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        b4Var2.addView(frameLayout, a6.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        textView.setTextColor(i17);
        e2.k(20.0f, 1, textView);
        frameLayout.addView(textView, a6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new ai.h(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        b4Var2.addView(linearLayout, a6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i18 = calendar.get(1);
        hn0 hn0Var = new hn0(context, i14);
        long j10 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j10);
        int i19 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j10);
        int i20 = calendar2.get(11);
        int i21 = calendar.get(12);
        linearLayout.addView(dd0Var, a6.l(0.5f, 0, 270));
        dd0Var.setMinValue(0);
        dd0Var.setMaxValue(i19 - 1);
        dd0Var.setWrapSelectorWheel(false);
        dd0Var.setTag("DAY");
        dd0Var.setFormatter(new y20(currentTimeMillis, calendar, i18, 1));
        y4 y4Var = new y4(b4Var2, gVar, hVar, i20, i21, dd0Var);
        dd0Var.setOnValueChangedListener(y4Var);
        gVar.setMinValue(0);
        gVar.setMaxValue(23);
        linearLayout.addView(gVar, a6.l(0.2f, 0, 270));
        gVar.setFormatter(new s0.b(23));
        gVar.setOnValueChangedListener(y4Var);
        hVar.setMinValue(0);
        hVar.setMaxValue(11);
        hVar.setValue(0);
        hVar.setFormatter(new s0.b(24));
        linearLayout.addView(hVar, a6.l(0.3f, 0, 270));
        hVar.setOnValueChangedListener(y4Var);
        if (j3 > 0) {
            b4Var = b4Var2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j3 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j3);
            hVar.setValue(calendar.get(12) / 5);
            gVar.setValue(calendar.get(11));
            dd0Var.setValue(timeInMillis);
            dd0Var.getValue();
            y4Var.q(dd0Var, dd0Var.getValue());
            gVar.getValue();
            y4Var.q(gVar, gVar.getValue());
        } else {
            b4Var = b4Var2;
        }
        hn0Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        hn0Var.setGravity(17);
        hn0Var.setTextColor(b5Var.g);
        hn0Var.setTextSize(1, 14.0f);
        hn0Var.setTypeface(AndroidUtilities.bold());
        hn0Var.setBackground(z5.e(new float[]{8.0f}, b5Var.h));
        hn0Var.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        b4Var.addView(hn0Var, a6.t(-1, 48, 83, 16, 15, 16, 16));
        hn0Var.setOnClickListener(new org.telegram.ui.Components.o0(calendar, dd0Var, gVar, hVar, uVar, c3Var));
        c3Var.b(b4Var);
        h3 h3Var = c3Var.a;
        h3Var.show();
        int i22 = b5Var.b;
        h3Var.setBackgroundColor(i22);
        h3Var.fixNavigationBar(i22);
        AndroidUtilities.setLightStatusBar(h3Var, i0.a.f(i22) > 0.699999988079071d);
    }

    public static void R(a0 a0Var) {
        qg.m1 m1Var = new qg.m1(a0Var.n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        int i10 = 1;
        m1Var.setOnDismissListener(new w(a0Var, i10));
        m1Var.setOnShowListener(new x(a0Var, i10));
        m1Var.show();
    }

    public static void S(a0 a0Var) {
        qg.m1 m1Var = new qg.m1(a0Var.n, a0Var.currentAccount, null, a0Var.resourcesProvider);
        int i10 = 0;
        m1Var.setOnDismissListener(new w(a0Var, i10));
        m1Var.setOnShowListener(new x(a0Var, i10));
        m1Var.show();
    }

    @Override // org.telegram.ui.Components.ab
    public final void C(Canvas canvas, int i10) {
        this.s0 = i10;
    }

    public final ArrayList T(long j3) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(j3);
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
        int i11 = ug.d.s;
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
        int i11 = ug.d.s;
        if (i10 == 2) {
            U = ((Integer) this.Y.get(this.n0)).intValue();
            g10 = s.g();
        } else {
            TL_stars.TL_starsGiveawayOption W = W(this.p0);
            if (W != null) {
                return W.yearly_boosts;
            }
            U = U();
            g10 = s.g();
        }
        return g10 * U;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j3) {
        ArrayList v = v5.y(this.currentAccount, false).v();
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

    public final List X() {
        int i10 = this.h0;
        int i11 = ug.d.s;
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
        ug.a aVar = this.q0;
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
        int i11 = ug.d.s;
        if (i10 == 0) {
            aVar.a(V(), z10);
            return;
        }
        ArrayList arrayList = this.d0;
        int g10 = s.g() * arrayList.size();
        boolean z11 = arrayList.size() > 0;
        aVar.e = true;
        bi.d dVar = aVar.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.b(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.b.setBackgroundColor(j6.v0(j6.h5, aVar.c));
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
    public final void a0(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        ?? r15;
        int i11;
        boolean z13;
        ?? r152;
        tg.b bVar;
        ?? r153;
        long longValue;
        ArrayList arrayList = this.X;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i12 = this.h0;
        int i13 = ug.d.s;
        boolean z14 = i12 == 3;
        tg.a aVar = new tg.a(0, false);
        aVar.g = z14;
        arrayList.add(aVar);
        boolean Y = Y();
        ArrayList arrayList3 = this.d0;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.u0;
        if (Y) {
            tg.a aVar2 = new tg.a(14, false);
            aVar2.f = prepaidGiveaway;
            arrayList.add(aVar2);
        } else {
            int size = arrayList3.size();
            tg.a aVar3 = new tg.a(2, this.h0 == 2);
            aVar3.l = 2;
            aVar3.i = size;
            aVar3.f = null;
            arrayList.add(aVar3);
            int size2 = arrayList3.size();
            tg.a aVar4 = new tg.a(2, this.h0 == 3);
            aVar4.l = 3;
            aVar4.i = size2;
            aVar4.f = null;
            arrayList.add(aVar4);
        }
        arrayList.add(new tg.a(4, false));
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
                tg.a aVar5 = new tg.a(13, false);
                aVar5.c = string;
                aVar5.i = V;
                arrayList.add(aVar5);
                ArrayList v = v5.y(this.currentAccount, false).v();
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
                    TL_stars.TL_starsGiveawayOption W = W(((Long) arrayList6.get(i17)).longValue());
                    if (!W.missingStorePrice) {
                        if (this.p0 == 0 && W.isDefault) {
                            this.p0 = W.stars;
                        }
                        if (!W.extended || this.k0) {
                            i16++;
                            int i18 = this.k0 ? i17 : i17 + 2;
                            long j3 = W.stars;
                            ArrayList T = T(j3);
                            if (T.isEmpty()) {
                                float f7 = j3;
                                ArrayList T2 = T(this.p0);
                                int i19 = this.o0;
                                if (i19 < 0 || i19 >= T2.size()) {
                                    this.o0 = 0;
                                }
                                longValue = Math.round(f7 / (this.o0 >= T2.size() ? 1L : ((Long) T2.get(this.o0)).longValue()));
                            } else {
                                longValue = ((Long) T.get(Utilities.clamp(this.o0, T.size() - 1, 0))).longValue();
                            }
                            arrayList.add(tg.a.d(W, i18, longValue, this.p0 == W.stars, true));
                        }
                    }
                }
                if (!this.k0 && i16 < arrayList6.size()) {
                    arrayList.add(new tg.a(18, false));
                }
                if (i16 <= 0) {
                    arrayList.add(tg.a.d(null, 0, 1L, false, true));
                    arrayList.add(tg.a.d(null, 1, 1L, false, true));
                    arrayList.add(tg.a.d(null, 2, 1L, false, false));
                }
                aVar5.i = V();
                arrayList.add(tg.a.c(LocaleController.getString(R.string.BoostingStarsOptionsInfo), false));
                List X = X();
                int i20 = this.o0;
                if (i20 < 0 || i20 >= X.size()) {
                    this.o0 = 0;
                }
                if (X.size() > 1) {
                    arrayList.add(tg.a.f(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                    List X2 = X();
                    int i21 = this.o0;
                    tg.a aVar6 = new tg.a(5, false);
                    aVar6.k = X2;
                    aVar6.i = i21;
                    arrayList.add(aVar6);
                    arrayList.add(tg.a.c(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
                }
            }
            arrayList.add(tg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
            if (!Y()) {
                arrayList.add(tg.a.b(chat, V(), false));
            } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                arrayList.add(tg.a.b(chat, prepaidGiveaway.quantity, false));
            } else {
                arrayList.add(tg.a.b(chat, s.g() * prepaidGiveaway.quantity, false));
            }
            int size3 = arrayList5.size();
            int i22 = 0;
            while (i22 < size3) {
                Object obj = arrayList5.get(i22);
                i22++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.Chat) {
                    arrayList.add(tg.a.b((TLRPC.Chat) tLObject, V(), true));
                }
                if (tLObject instanceof TLRPC.InputPeer) {
                    int V2 = V();
                    tg.a aVar7 = new tg.a(9, false);
                    aVar7.d = (TLRPC.InputPeer) tLObject;
                    aVar7.e = null;
                    aVar7.g = true;
                    aVar7.i = V2;
                    arrayList.add(aVar7);
                }
            }
            if (arrayList5.size() < s.f()) {
                r153 = 0;
                arrayList.add(new tg.a(8, false));
            } else {
                r153 = 0;
            }
            arrayList.add(tg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r153));
            arrayList.add(tg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
            int i23 = ug.u.s;
            arrayList.add(tg.a.e(r153, this.j0, true, arrayList4));
            arrayList.add(tg.a.e(1, this.j0, r153, arrayList4));
            arrayList.add(tg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r153));
        } else {
            z12 = isChannelAndNotMegaGroup;
            if (this.i0 == 0) {
                if (!Y()) {
                    String string2 = LocaleController.getString(R.string.BoostingQuantityPrizes);
                    int V3 = V();
                    tg.a aVar8 = new tg.a(13, false);
                    aVar8.c = string2;
                    aVar8.i = V3;
                    arrayList.add(aVar8);
                    int i24 = this.n0;
                    tg.a aVar9 = new tg.a(5, false);
                    aVar9.k = this.Y;
                    aVar9.i = i24;
                    arrayList.add(aVar9);
                    arrayList.add(tg.a.c(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                arrayList.add(tg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (!Y()) {
                    arrayList.add(tg.a.b(chat, V(), false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(tg.a.b(chat, prepaidGiveaway.quantity, false));
                } else {
                    arrayList.add(tg.a.b(chat, s.g() * prepaidGiveaway.quantity, false));
                }
                int size4 = arrayList5.size();
                int i25 = 0;
                while (i25 < size4) {
                    Object obj2 = arrayList5.get(i25);
                    i25++;
                    TLObject tLObject2 = (TLObject) obj2;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        arrayList.add(tg.a.b((TLRPC.Chat) tLObject2, V(), true));
                    }
                    if (tLObject2 instanceof TLRPC.InputPeer) {
                        int V4 = V();
                        tg.a aVar10 = new tg.a(9, false);
                        aVar10.d = (TLRPC.InputPeer) tLObject2;
                        aVar10.e = null;
                        aVar10.g = true;
                        aVar10.i = V4;
                        arrayList.add(aVar10);
                    }
                }
                if (arrayList5.size() < s.f()) {
                    r15 = 0;
                    arrayList.add(new tg.a(8, false));
                } else {
                    r15 = 0;
                }
                arrayList.add(tg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r15));
                arrayList.add(tg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
                int i26 = ug.u.s;
                arrayList.add(tg.a.e(r15, this.j0, true, arrayList4));
                arrayList.add(tg.a.e(1, this.j0, r15, arrayList4));
                arrayList.add(tg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r15));
            }
            if (!Y()) {
                arrayList.add(tg.a.f(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                int i27 = this.i0;
                int i28 = ug.d.s;
                ArrayList b10 = s.b(i27 == 0 ? U() : arrayList3.size(), this.f0);
                int i29 = 0;
                while (i29 < b10.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i29);
                    int i30 = tL_premiumGiftCodeOption.months;
                    int i31 = this.i0;
                    int i32 = ug.d.s;
                    int U = i31 == 0 ? U() : arrayList3.size();
                    long j10 = tL_premiumGiftCodeOption.amount;
                    int i33 = this.l0;
                    String str = tL_premiumGiftCodeOption.currency;
                    boolean z16 = i29 != b10.size() + (-1);
                    ArrayList arrayList7 = b10;
                    tg.a aVar11 = new tg.a(12, i30 == i33);
                    aVar11.i = i30;
                    aVar11.j = U;
                    aVar11.h = j10;
                    aVar11.g = z16;
                    aVar11.c = str;
                    aVar11.m = tL_premiumGiftCodeOption;
                    arrayList.add(aVar11);
                    i29++;
                    b10 = arrayList7;
                }
            }
            if (!Y()) {
                i10 = 3;
                arrayList.add(tg.a.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), j6.gc, 0, new t(this, i10), this.resourcesProvider), true));
                i11 = this.h0;
                int i34 = ug.d.s;
                if (i11 != i10 || this.i0 == 0) {
                    String string3 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
                    boolean z17 = this.w0;
                    int i35 = ug.y.L;
                    tg.a aVar12 = new tg.a(15, z17);
                    aVar12.c = string3;
                    aVar12.g = z17;
                    aVar12.l = 1;
                    arrayList.add(aVar12);
                    if (this.w0) {
                        z13 = false;
                        arrayList.add(tg.a.c(LocaleController.getString(this.h0 == 3 ? R.string.BoostingStarsGiveawayAdditionPrizeHint : R.string.BoostingGiveawayAdditionPrizeHint), false));
                    } else {
                        int U2 = Y() ? prepaidGiveaway.quantity : U();
                        z13 = false;
                        tg.a aVar13 = new tg.a(16, false);
                        aVar13.i = U2;
                        arrayList.add(aVar13);
                        String formatPluralString = LocaleController.formatPluralString("BoldMonths", this.l0, new Object[0]);
                        if (this.h0 == 3) {
                            if (this.v0.isEmpty()) {
                                arrayList.add(tg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.p0, new Object[0])), false));
                            } else {
                                arrayList.add(tg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.p0, Integer.valueOf(U2), this.v0)), false));
                            }
                        } else if (this.v0.isEmpty()) {
                            arrayList.add(tg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", U2, formatPluralString)), false));
                        } else {
                            arrayList.add(tg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", U2, this.v0, formatPluralString)), false));
                        }
                    }
                    arrayList.add(tg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
                    long j11 = this.m0;
                    tg.a aVar14 = new tg.a(10, z13);
                    aVar14.h = j11;
                    arrayList.add(aVar14);
                    if (this.h0 != 3) {
                        if (Y()) {
                            r152 = 0;
                            arrayList.add(tg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        } else {
                            r152 = 0;
                            arrayList.add(tg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", U(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.p0, new Object[0])), false));
                        }
                    } else {
                        r152 = 0;
                        r152 = 0;
                        if (Y()) {
                            arrayList.add(tg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                        } else {
                            arrayList.add(tg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", U(), new Object[0]), false));
                        }
                    }
                    String string4 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
                    tg.a aVar15 = new tg.a(15, this.x0);
                    aVar15.c = string4;
                    aVar15.g = r152;
                    aVar15.l = r152;
                    arrayList.add(aVar15);
                    if (Y()) {
                        arrayList.add(tg.a.c(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r152));
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                        sb2.append(this.h0 != 3 ? a2.h(R.string.BoostingStoriesFeaturesAndTerms, new StringBuilder("\n\n")) : "");
                        arrayList.add(tg.a.c(AndroidUtilities.replaceSingleTag(sb2.toString(), j6.gc, 0, new t(this, 4), this.resourcesProvider), true));
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
        int i342 = ug.d.s;
        if (i11 != i10) {
        }
        String string32 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
        boolean z172 = this.w0;
        int i352 = ug.y.L;
        tg.a aVar122 = new tg.a(15, z172);
        aVar122.c = string32;
        aVar122.g = z172;
        aVar122.l = 1;
        arrayList.add(aVar122);
        if (this.w0) {
        }
        arrayList.add(tg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
        long j112 = this.m0;
        tg.a aVar142 = new tg.a(10, z13);
        aVar142.h = j112;
        arrayList.add(aVar142);
        if (this.h0 != 3) {
        }
        String string42 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
        tg.a aVar152 = new tg.a(15, this.x0);
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
        vl0 vl0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (vl0Var = this.d) != null && vl0Var.G) {
            a0(true, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.l2
    public final void dismiss() {
        j jVar = this.t0;
        if (jVar != null) {
            jVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        tg.b bVar = new tg.b(this.resourcesProvider);
        this.g0 = bVar;
        return bVar;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        int i10 = this.i0;
        int i11 = ug.d.s;
        return i10 == 1 ? LocaleController.getString(R.string.GiftPremium) : LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
