// default package

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class yn0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yn0(ao0 ao0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j, e eVar) {
        this.a = (byte) 0;
        this.c = ao0Var;
        this.d = prepaidGiveaway;
        this.b = j;
        this.e = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tn0 tn0Var;
        String str;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ao0 ao0Var = (ao0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                e eVar = (e) obj;
                ArrayList arrayList = ao0Var.Z1;
                ArrayList arrayList2 = ao0Var.X1;
                TLRPC.Chat chat = ao0Var.W1;
                ArrayList arrayList3 = ao0Var.Y1;
                ArrayList arrayList4 = ao0Var.a2;
                o8 o8Var = ao0Var.l2;
                if (!o8Var.a.R) {
                    if (ao0Var.e1()) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
                        hv4 hv4Var = new hv4((Object) ao0Var, (TLObject) prepaidGiveaway, (TLObject) tL_prepaidStarsGiveaway, this.b, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, (byte) 2);
                        e Q = LaunchActivity.Q();
                        if (Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
                            String M0 = ob6.M0(2131753184, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            idVar.U = hl.S2(ob6.M0(2131753185, null));
                            alertDialog$Builder.j(ob6.M0(2131744572, null), new tg0(hv4Var, (byte) 5));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), new rm0((byte) 1));
                            alertDialog$Builder.o();
                            break;
                        }
                    } else {
                        int i = ao0Var.c2;
                        int i2 = pn0.w;
                        byte b2 = 4;
                        byte b3 = 2;
                        if (i != 3) {
                            byte b4 = 16;
                            if (ao0Var.d2 == 1) {
                                ArrayList c = on0.c(arrayList3.size(), arrayList4);
                                int i3 = 0;
                                while (i3 < c.size()) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) c.get(i3);
                                    if (tL_premiumGiftCodeOption.months == ao0Var.g2 && arrayList3.size() > 0) {
                                        if (on0.j()) {
                                            Context context = ao0Var.getContext();
                                            vnb vnbVar = ao0Var.J0;
                                            if (tL_premiumGiftCodeOption.store_product == null) {
                                                ArrayList arrayList5 = new ArrayList();
                                                int size = arrayList4.size();
                                                int i4 = 0;
                                                while (i4 < size) {
                                                    Object obj4 = arrayList4.get(i4);
                                                    i4++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                        arrayList5.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                                    }
                                                }
                                                String join = TextUtils.join(", ", arrayList5);
                                                int i5 = tL_premiumGiftCodeOption.users;
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, vnbVar, context);
                                                String M02 = ob6.M0(2131753295, "BoostingReduceQuantity");
                                                id idVar2 = alertDialog$Builder2.a;
                                                idVar2.S = M02;
                                                idVar2.U = hl.S2(ob6.G(i5, "BoostingReduceUsersTextPlural", join));
                                                alertDialog$Builder2.j(ob6.M0(2131747558, "OK"), new vr9(b4));
                                                alertDialog$Builder2.o();
                                                break;
                                            }
                                        }
                                        o8Var.b(true);
                                        on0.m(arrayList3, tL_premiumGiftCodeOption, ao0Var.W1, null, eVar, new tn0(ao0Var, (byte) 0), new tn0(ao0Var, (byte) 1));
                                        break;
                                    } else {
                                        i3++;
                                        b4 = 16;
                                    }
                                }
                                break;
                            } else {
                                ArrayList c2 = on0.c(ao0Var.a1(), arrayList4);
                                for (int i6 = 0; i6 < c2.size(); i6++) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) c2.get(i6);
                                    if (tL_premiumGiftCodeOption3.months == ao0Var.g2) {
                                        if (on0.j()) {
                                            List list = ao0Var.T1;
                                            Context context2 = ao0Var.getContext();
                                            vnb vnbVar2 = ao0Var.J0;
                                            tn0 tn0Var2 = new tn0(ao0Var, b3);
                                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                int size2 = arrayList4.size();
                                                int i7 = 0;
                                                while (i7 < size2) {
                                                    Object obj5 = arrayList4.get(i7);
                                                    i7++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                                        arrayList6.add(tL_premiumGiftCodeOption4);
                                                    }
                                                }
                                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList6.get(0);
                                                int size3 = arrayList6.size();
                                                int i8 = 0;
                                                while (i8 < size3) {
                                                    Object obj6 = arrayList6.get(i8);
                                                    i8++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj6;
                                                    int i9 = tL_premiumGiftCodeOption3.users;
                                                    int i10 = tL_premiumGiftCodeOption6.users;
                                                    if (i9 > i10 && i10 > tL_premiumGiftCodeOption5.users) {
                                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                                    }
                                                }
                                                String G = ob6.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                                int i11 = tL_premiumGiftCodeOption3.users;
                                                int i12 = tL_premiumGiftCodeOption5.users;
                                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, vnbVar2, context2);
                                                String M03 = ob6.M0(2131753295, "BoostingReduceQuantity");
                                                id idVar3 = alertDialog$Builder3.a;
                                                idVar3.S = M03;
                                                idVar3.U = hl.S2(ob6.G(i11, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i12)));
                                                alertDialog$Builder3.j(ob6.M0(2131746068, "Reduce"), new o(tn0Var2, tL_premiumGiftCodeOption5, (byte) 20));
                                                alertDialog$Builder3.g(ob6.M0(2131752570, "Cancel"), new vr9((byte) 16));
                                                alertDialog$Builder3.o();
                                                break;
                                            }
                                        }
                                        int i13 = ao0Var.e2;
                                        int i14 = ky7.w;
                                        boolean z = i13 == 1;
                                        int n = on0.n(ao0Var.h2);
                                        o8Var.b(true);
                                        boolean z2 = ao0Var.s2;
                                        boolean z3 = ao0Var.r2;
                                        String str2 = ao0Var.q2;
                                        tn0 tn0Var3 = new tn0(ao0Var, (byte) 3);
                                        tn0 tn0Var4 = new tn0(ao0Var, b2);
                                        boolean j = on0.j();
                                        int i15 = yac.t0;
                                        if (j) {
                                            uc7 s1 = uc7.s1(i15);
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z;
                                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z2;
                                            tL_inputStorePaymentPremiumGiveaway.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway.until_date = n;
                                            int i16 = tL_inputStorePaymentPremiumGiveaway.flags;
                                            tL_inputStorePaymentPremiumGiveaway.flags = i16 | 6;
                                            if (z3) {
                                                tL_inputStorePaymentPremiumGiveaway.flags = i16 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                            int size4 = arrayList2.size();
                                            int i17 = 0;
                                            while (i17 < size4) {
                                                Object obj7 = arrayList2.get(i17);
                                                i17++;
                                                TLObject tLObject = (TLObject) obj7;
                                                if (tLObject instanceof TLRPC.Chat) {
                                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(s1.j1(-((TLRPC.Chat) tLObject).id));
                                                }
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.boost_peer = s1.j1(-chat.id);
                                            int size5 = arrayList.size();
                                            int i18 = 0;
                                            while (i18 < size5) {
                                                Object obj8 = arrayList.get(i18);
                                                i18++;
                                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj8)).iso2);
                                            }
                                            we3 we3Var = new we3();
                                            we3Var.b = "inapp";
                                            we3Var.a = tL_premiumGiftCodeOption3.store_product;
                                            di0.h().o(Arrays.asList(we3Var.a()), new kh((Object) tL_inputStorePaymentPremiumGiveaway, (Object) tL_premiumGiftCodeOption3, (Object) connectionsManager, (Object) tn0Var4, (Object) tn0Var3, (Object) eVar, (byte) 3));
                                            break;
                                        } else {
                                            uc7 s12 = uc7.s1(i15);
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(yac.t0);
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z;
                                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z2;
                                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway2.until_date = n;
                                            int i19 = tL_inputStorePaymentPremiumGiveaway2.flags;
                                            tL_inputStorePaymentPremiumGiveaway2.flags = i19 | 6;
                                            if (z3) {
                                                tL_inputStorePaymentPremiumGiveaway2.flags = i19 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                                            int size6 = arrayList2.size();
                                            int i20 = 0;
                                            while (i20 < size6) {
                                                Object obj9 = arrayList2.get(i20);
                                                i20++;
                                                TLObject tLObject2 = (TLObject) obj9;
                                                if (tLObject2 instanceof TLRPC.Chat) {
                                                    tn0Var = tn0Var4;
                                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject2).id));
                                                } else {
                                                    tn0Var = tn0Var4;
                                                }
                                                tn0Var4 = tn0Var;
                                            }
                                            tn0 tn0Var5 = tn0Var4;
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = s12.j1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = s12.j1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                                            tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                                            int size7 = arrayList.size();
                                            int i21 = 0;
                                            while (i21 < size7) {
                                                Object obj10 = arrayList.get(i21);
                                                i21++;
                                                tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                                            }
                                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                                            JSONObject u = xw0.u(eVar.getResourceProvider(), false);
                                            if (u != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                                tL_dataJSON.data = u.toString();
                                                tL_payments_getPaymentForm.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
                                            connectionsManager2.sendRequest(tL_payments_getPaymentForm, new in0((Object) tn0Var5, (Object) s12, (Object) tL_inputInvoicePremiumGiftCode, (Object) eVar, (Object) tn0Var3, (byte) 0));
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        } else {
                            Activity W = hl.W(ao0Var.getContext());
                            if (W == null) {
                                W = LaunchActivity.H1;
                            }
                            if (W != null && !W.isFinishing()) {
                                TL_stars.TL_starsGiveawayOption c1 = ao0Var.c1(ao0Var.k2);
                                int a1 = ao0Var.a1();
                                if (c1 != null) {
                                    o8Var.a.setLoading(true);
                                    int i22 = ao0Var.e2;
                                    int i23 = ky7.w;
                                    boolean z4 = i22 == 1;
                                    jxa v = jxa.v(ao0Var.a, false);
                                    int n2 = on0.n(ao0Var.h2);
                                    boolean z5 = ao0Var.s2;
                                    boolean z6 = ao0Var.r2;
                                    String str3 = ao0Var.q2;
                                    qe2 qe2Var = new qe2(ao0Var, c1, b3);
                                    int i24 = v.a;
                                    if (uc7.s1(i24).i5()) {
                                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z4;
                                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z5;
                                        Activity activity = W;
                                        tL_inputStorePaymentStarsGiveaway.stars = c1.stars;
                                        uc7.s1(i24);
                                        tL_inputStorePaymentStarsGiveaway.boost_peer = uc7.l1(chat);
                                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                            int size8 = arrayList2.size();
                                            int i25 = 0;
                                            while (i25 < size8) {
                                                Object obj11 = arrayList2.get(i25);
                                                i25++;
                                                ArrayList<TLRPC.InputPeer> arrayList7 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                                uc7.s1(i24);
                                                arrayList7.add(uc7.k1((TLObject) obj11));
                                            }
                                        }
                                        int size9 = arrayList.size();
                                        int i26 = 0;
                                        while (i26 < size9) {
                                            Object obj12 = arrayList.get(i26);
                                            i26++;
                                            tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj12)).iso2);
                                        }
                                        if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                        }
                                        if (z6) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                            tL_inputStorePaymentStarsGiveaway.prize_description = str3;
                                        }
                                        r7a.B(i24);
                                        tL_inputStorePaymentStarsGiveaway.random_id = r7a.D();
                                        tL_inputStorePaymentStarsGiveaway.until_date = n2;
                                        tL_inputStorePaymentStarsGiveaway.currency = c1.currency;
                                        tL_inputStorePaymentStarsGiveaway.amount = c1.amount;
                                        tL_inputStorePaymentStarsGiveaway.users = a1;
                                        if (!f11.b() && di0.h().j() && (str = c1.store_product) != null) {
                                            we3 we3Var2 = new we3();
                                            we3Var2.b = "inapp";
                                            we3Var2.a = str;
                                            di0.h().o(Arrays.asList(we3Var2.a()), new pt((Object) v, (Object) qe2Var, (Object) tL_inputStorePaymentStarsGiveaway, (Object) activity, (byte) 24));
                                            break;
                                        } else {
                                            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                            JSONObject u2 = xw0.u(jxa.F(), false);
                                            if (u2 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                                tL_dataJSON2.data = u2.toString();
                                                tL_payments_getPaymentForm2.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm2.invoice = tL_inputInvoiceStars;
                                            ConnectionsManager.getInstance(i24).sendRequest(tL_payments_getPaymentForm2, new qn8((Object) v, (Object) qe2Var, (Object) tL_inputInvoiceStars, (byte) 19));
                                            break;
                                        }
                                    } else {
                                        e Q2 = LaunchActivity.Q();
                                        if (Q2 != null && Q2.getContext() != null) {
                                            jxa.d0(Q2.getContext(), Q2.getResourceProvider());
                                            break;
                                        } else {
                                            jxa.d0(W, null);
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                y13 y13Var = (y13) obj3;
                c51 c51Var = (c51) obj;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, y13Var.J0, (Context) obj2);
                String M04 = ob6.M0(2131748552, null);
                id idVar4 = alertDialog$Builder4.a;
                idVar4.S = M04;
                idVar4.U = ob6.M0(2131748553, null);
                alertDialog$Builder4.j(ob6.M0(2131745751, null), new ps0((Object) y13Var, (Object) c51Var, this.b, (byte) 2));
                alertDialog$Builder4.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder4.c(-1);
                alertDialog$Builder4.o();
                break;
            default:
                uj3 uj3Var = (uj3) obj3;
                uj3Var.finishPreviewFragment();
                hl.d3(new ba7((Object) uj3Var, obj2, obj, this.b, (byte) 7), 100L);
                break;
        }
    }

    public /* synthetic */ yn0(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
