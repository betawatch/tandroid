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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yn0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yn0(ao0 ao0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j, d dVar) {
        this.a = (byte) 0;
        this.c = ao0Var;
        this.d = prepaidGiveaway;
        this.b = j;
        this.e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i;
        int i2;
        String str;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ao0 ao0Var = (ao0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                d dVar = (d) obj;
                ArrayList arrayList = ao0Var.Z1;
                ArrayList arrayList2 = ao0Var.X1;
                TLRPC.Chat chat = ao0Var.W1;
                ArrayList arrayList3 = ao0Var.Y1;
                ArrayList arrayList4 = ao0Var.a2;
                n8 n8Var = ao0Var.l2;
                if (!n8Var.a.R) {
                    if (ao0Var.d1()) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
                        dt4 dt4Var = new dt4((Object) ao0Var, (TLObject) prepaidGiveaway, (TLObject) tL_prepaidStarsGiveaway, this.b, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, (byte) 2);
                        d Q = LaunchActivity.Q();
                        if (Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
                            String M0 = k96.M0(2131753188, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            hdVar.U = gl.T2(k96.M0(2131753189, null));
                            alertDialog$Builder.j(k96.M0(2131744678, null), new sg0(dt4Var, (byte) 5));
                            alertDialog$Builder.g(k96.M0(2131752577, null), new qm0((byte) 0));
                            alertDialog$Builder.o();
                            break;
                        }
                    } else {
                        int i3 = ao0Var.c2;
                        int i4 = pn0.w;
                        byte b2 = 2;
                        byte b3 = 4;
                        if (i3 != 3) {
                            byte b4 = 2;
                            if (ao0Var.d2 == 1) {
                                ArrayList c = on0.c(arrayList3.size(), arrayList4);
                                for (int i5 = 0; i5 < c.size(); i5++) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) c.get(i5);
                                    if (tL_premiumGiftCodeOption.months == ao0Var.g2 && arrayList3.size() > 0) {
                                        if (on0.j()) {
                                            Context context = ao0Var.getContext();
                                            wjb wjbVar = ao0Var.J0;
                                            if (tL_premiumGiftCodeOption.store_product == null) {
                                                ArrayList arrayList5 = new ArrayList();
                                                int size = arrayList4.size();
                                                int i6 = 0;
                                                while (i6 < size) {
                                                    Object obj4 = arrayList4.get(i6);
                                                    i6++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                        arrayList5.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                                    }
                                                }
                                                String join = TextUtils.join(", ", arrayList5);
                                                int i7 = tL_premiumGiftCodeOption.users;
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, wjbVar, context);
                                                String M02 = k96.M0(2131753299, "BoostingReduceQuantity");
                                                hd hdVar2 = alertDialog$Builder2.a;
                                                hdVar2.S = M02;
                                                hdVar2.U = gl.T2(k96.G(i7, "BoostingReduceUsersTextPlural", join));
                                                alertDialog$Builder2.j(k96.M0(2131747638, "OK"), new ho9((byte) 13));
                                                alertDialog$Builder2.o();
                                                break;
                                            }
                                        }
                                        n8Var.b(true);
                                        on0.m(arrayList3, tL_premiumGiftCodeOption, ao0Var.W1, null, dVar, new tn0(ao0Var, (byte) 0), new tn0(ao0Var, (byte) 1));
                                        break;
                                    }
                                }
                                break;
                            } else {
                                ArrayList c2 = on0.c(ao0Var.Z0(), arrayList4);
                                int i8 = 0;
                                while (i8 < c2.size()) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) c2.get(i8);
                                    if (tL_premiumGiftCodeOption3.months == ao0Var.g2) {
                                        if (on0.j()) {
                                            List list = ao0Var.T1;
                                            Context context2 = ao0Var.getContext();
                                            wjb wjbVar2 = ao0Var.J0;
                                            tn0 tn0Var = new tn0(ao0Var, b4);
                                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                                ArrayList arrayList6 = new ArrayList();
                                                int size2 = arrayList4.size();
                                                int i9 = 0;
                                                while (i9 < size2) {
                                                    Object obj5 = arrayList4.get(i9);
                                                    i9++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                                        arrayList6.add(tL_premiumGiftCodeOption4);
                                                    }
                                                }
                                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList6.get(0);
                                                int size3 = arrayList6.size();
                                                int i10 = 0;
                                                while (i10 < size3) {
                                                    Object obj6 = arrayList6.get(i10);
                                                    i10++;
                                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj6;
                                                    int i11 = tL_premiumGiftCodeOption3.users;
                                                    int i12 = tL_premiumGiftCodeOption6.users;
                                                    if (i11 > i12 && i12 > tL_premiumGiftCodeOption5.users) {
                                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                                    }
                                                }
                                                String G = k96.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                                int i13 = tL_premiumGiftCodeOption3.users;
                                                int i14 = tL_premiumGiftCodeOption5.users;
                                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, wjbVar2, context2);
                                                String M03 = k96.M0(2131753299, "BoostingReduceQuantity");
                                                hd hdVar3 = alertDialog$Builder3.a;
                                                hdVar3.S = M03;
                                                hdVar3.U = gl.T2(k96.G(i13, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i14)));
                                                alertDialog$Builder3.j(k96.M0(2131746148, "Reduce"), new o(tn0Var, tL_premiumGiftCodeOption5, (byte) 20));
                                                alertDialog$Builder3.g(k96.M0(2131752577, "Cancel"), new ho9((byte) 13));
                                                alertDialog$Builder3.o();
                                                break;
                                            }
                                        }
                                        int i15 = ao0Var.e2;
                                        int i16 = dv7.w;
                                        boolean z = i15 == 1;
                                        int n = on0.n(ao0Var.h2);
                                        n8Var.b(true);
                                        boolean z2 = ao0Var.s2;
                                        boolean z3 = ao0Var.r2;
                                        String str2 = ao0Var.q2;
                                        tn0 tn0Var2 = new tn0(ao0Var, (byte) 3);
                                        tn0 tn0Var3 = new tn0(ao0Var, b3);
                                        boolean j = on0.j();
                                        int i17 = y6c.t0;
                                        if (j) {
                                            na7 q1 = na7.q1(i17);
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z;
                                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z2;
                                            tL_inputStorePaymentPremiumGiveaway.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway.until_date = n;
                                            int i18 = tL_inputStorePaymentPremiumGiveaway.flags;
                                            tL_inputStorePaymentPremiumGiveaway.flags = i18 | 6;
                                            if (z3) {
                                                tL_inputStorePaymentPremiumGiveaway.flags = i18 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                            int size4 = arrayList2.size();
                                            int i19 = 0;
                                            while (i19 < size4) {
                                                Object obj7 = arrayList2.get(i19);
                                                int i20 = i19 + 1;
                                                TLObject tLObject = (TLObject) obj7;
                                                if (tLObject instanceof TLRPC.Chat) {
                                                    i = i20;
                                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(q1.h1(-((TLRPC.Chat) tLObject).id));
                                                } else {
                                                    i = i20;
                                                }
                                                i19 = i;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.boost_peer = q1.h1(-chat.id);
                                            int size5 = arrayList.size();
                                            int i21 = 0;
                                            while (i21 < size5) {
                                                Object obj8 = arrayList.get(i21);
                                                i21++;
                                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj8)).iso2);
                                            }
                                            i5 i5Var = new i5();
                                            i5Var.b = "inapp";
                                            i5Var.a = tL_premiumGiftCodeOption3.store_product;
                                            ci0.h().o(Arrays.asList(i5Var.a()), new zd((Object) tL_inputStorePaymentPremiumGiveaway, (Object) tL_premiumGiftCodeOption3, (Object) connectionsManager, (Object) tn0Var3, (Object) tn0Var2, (Object) dVar, (byte) 3));
                                            break;
                                        } else {
                                            na7 q12 = na7.q1(i17);
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(y6c.t0);
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z;
                                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z2;
                                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str2;
                                            tL_inputStorePaymentPremiumGiveaway2.until_date = n;
                                            int i22 = tL_inputStorePaymentPremiumGiveaway2.flags;
                                            tL_inputStorePaymentPremiumGiveaway2.flags = i22 | 6;
                                            if (z3) {
                                                tL_inputStorePaymentPremiumGiveaway2.flags = i22 | 22;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                                            tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                                            int size6 = arrayList2.size();
                                            int i23 = 0;
                                            while (i23 < size6) {
                                                Object obj9 = arrayList2.get(i23);
                                                int i24 = i23 + 1;
                                                TLObject tLObject2 = (TLObject) obj9;
                                                if (tLObject2 instanceof TLRPC.Chat) {
                                                    i2 = i24;
                                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(q12.h1(-((TLRPC.Chat) tLObject2).id));
                                                } else {
                                                    i2 = i24;
                                                }
                                                i23 = i2;
                                            }
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = q12.h1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = q12.h1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                                            tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                                            int size7 = arrayList.size();
                                            int i25 = 0;
                                            while (i25 < size7) {
                                                Object obj10 = arrayList.get(i25);
                                                i25++;
                                                tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj10)).iso2);
                                            }
                                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                                            JSONObject u = ow0.u(dVar.getResourceProvider(), false);
                                            if (u != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                                tL_dataJSON.data = u.toString();
                                                tL_payments_getPaymentForm.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
                                            connectionsManager2.sendRequest(tL_payments_getPaymentForm, new fn0((Object) tn0Var3, (Object) q12, (Object) tL_inputInvoicePremiumGiftCode, (Object) dVar, (Object) tn0Var2, (byte) 0));
                                            break;
                                        }
                                    } else {
                                        i8++;
                                        b4 = b4;
                                    }
                                }
                                break;
                            }
                        } else {
                            Activity W = gl.W(ao0Var.getContext());
                            if (W == null) {
                                W = LaunchActivity.H1;
                            }
                            if (W != null && !W.isFinishing()) {
                                TL_stars.TL_starsGiveawayOption b1 = ao0Var.b1(ao0Var.k2);
                                int Z0 = ao0Var.Z0();
                                if (b1 != null) {
                                    n8Var.a.setLoading(true);
                                    int i26 = ao0Var.e2;
                                    int i27 = dv7.w;
                                    boolean z4 = i26 == 1;
                                    gta v = gta.v(ao0Var.a, false);
                                    int n2 = on0.n(ao0Var.h2);
                                    boolean z5 = ao0Var.s2;
                                    boolean z6 = ao0Var.r2;
                                    String str3 = ao0Var.q2;
                                    ae2 ae2Var = new ae2(ao0Var, b1, b2);
                                    int i28 = v.a;
                                    if (na7.q1(i28).Z4()) {
                                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z4;
                                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z5;
                                        tL_inputStorePaymentStarsGiveaway.stars = b1.stars;
                                        na7.q1(i28);
                                        tL_inputStorePaymentStarsGiveaway.boost_peer = na7.j1(chat);
                                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                            int size8 = arrayList2.size();
                                            int i29 = 0;
                                            while (i29 < size8) {
                                                Object obj11 = arrayList2.get(i29);
                                                i29++;
                                                Activity activity = W;
                                                ArrayList<TLRPC.InputPeer> arrayList7 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                                na7.q1(i28);
                                                arrayList7.add(na7.i1((TLObject) obj11));
                                                W = activity;
                                            }
                                        }
                                        Activity activity2 = W;
                                        int size9 = arrayList.size();
                                        int i30 = 0;
                                        while (i30 < size9) {
                                            Object obj12 = arrayList.get(i30);
                                            i30++;
                                            tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj12)).iso2);
                                        }
                                        if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                        }
                                        if (z6) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                            tL_inputStorePaymentStarsGiveaway.prize_description = str3;
                                        }
                                        z3a.B(i28);
                                        tL_inputStorePaymentStarsGiveaway.random_id = z3a.D();
                                        tL_inputStorePaymentStarsGiveaway.until_date = n2;
                                        tL_inputStorePaymentStarsGiveaway.currency = b1.currency;
                                        tL_inputStorePaymentStarsGiveaway.amount = b1.amount;
                                        tL_inputStorePaymentStarsGiveaway.users = Z0;
                                        if (!w01.b() && ci0.h().j() && (str = b1.store_product) != null) {
                                            i5 i5Var2 = new i5();
                                            i5Var2.b = "inapp";
                                            i5Var2.a = str;
                                            ci0.h().o(Arrays.asList(i5Var2.a()), new lt((Object) v, (Object) ae2Var, (Object) tL_inputStorePaymentStarsGiveaway, (Object) activity2, (byte) 23));
                                            break;
                                        } else {
                                            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                            JSONObject u2 = ow0.u(gta.F(), false);
                                            if (u2 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                                tL_dataJSON2.data = u2.toString();
                                                tL_payments_getPaymentForm2.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm2.invoice = tL_inputInvoiceStars;
                                            ConnectionsManager.getInstance(i28).sendRequest(tL_payments_getPaymentForm2, new ck8((Object) v, (Object) ae2Var, (Object) tL_inputInvoiceStars, (byte) 18));
                                            break;
                                        }
                                    } else {
                                        d Q2 = LaunchActivity.Q();
                                        if (Q2 != null && Q2.getContext() != null) {
                                            gta.c0(Q2.getContext(), Q2.getResourceProvider());
                                            break;
                                        } else {
                                            gta.c0(W, null);
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
                f13 f13Var = (f13) obj3;
                u41 u41Var = (u41) obj;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, f13Var.J0, (Context) obj2);
                String M04 = k96.M0(2131748606, null);
                hd hdVar4 = alertDialog$Builder4.a;
                hdVar4.S = M04;
                hdVar4.U = k96.M0(2131748607, null);
                alertDialog$Builder4.j(k96.M0(2131745831, null), new hs0((Object) f13Var, (Object) u41Var, this.b, (byte) 2));
                alertDialog$Builder4.g(k96.M0(2131752577, null), null);
                alertDialog$Builder4.c(-1);
                alertDialog$Builder4.o();
                break;
            default:
                cj3 cj3Var = (cj3) obj3;
                cj3Var.finishPreviewFragment();
                gl.e3(new m77((Object) cj3Var, obj2, obj, this.b, (byte) 7), 100L);
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
