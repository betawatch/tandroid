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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class yo0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yo0(ap0 ap0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j, d dVar) {
        this.a = (byte) 0;
        this.c = ap0Var;
        this.d = prepaidGiveaway;
        this.b = j;
        this.e = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        to0 to0Var;
        String str;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ap0 ap0Var = (ap0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                d dVar = (d) obj;
                ArrayList arrayList = ap0Var.Z1;
                ArrayList arrayList2 = ap0Var.X1;
                TLRPC.Chat chat = ap0Var.W1;
                ArrayList arrayList3 = ap0Var.Y1;
                ArrayList arrayList4 = ap0Var.a2;
                n8 n8Var = ap0Var.l2;
                if (!n8Var.a.R) {
                    if (ap0Var.d1()) {
                        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
                        ev4 ev4Var = new ev4((Object) ap0Var, (TLObject) prepaidGiveaway, (TLObject) tL_prepaidStarsGiveaway, this.b, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, (byte) 2);
                        d Q = LaunchActivity.Q();
                        if (Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
                            String M0 = jb6.M0(2131753156, null);
                            he heVar = alertDialog$Builder.a;
                            heVar.S = M0;
                            heVar.U = gm.S2(jb6.M0(2131753157, null));
                            alertDialog$Builder.j(jb6.M0(2131744604, null), new xg0(ev4Var, (byte) 7));
                            alertDialog$Builder.g(jb6.M0(2131752542, null), new qn0((byte) 0));
                            alertDialog$Builder.o();
                            break;
                        }
                    } else {
                        int i = ap0Var.c2;
                        int i2 = po0.w;
                        byte b2 = 4;
                        if (i != 3) {
                            byte b3 = 2;
                            if (ap0Var.d2 == 1) {
                                ArrayList c = oo0.c(arrayList3.size(), arrayList4);
                                for (int i3 = 0; i3 < c.size(); i3++) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) c.get(i3);
                                    if (tL_premiumGiftCodeOption.months == ap0Var.g2 && arrayList3.size() > 0) {
                                        if (oo0.j()) {
                                            Context context = ap0Var.getContext();
                                            ylb ylbVar = ap0Var.J0;
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
                                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, ylbVar, context);
                                                String M02 = jb6.M0(2131753267, "BoostingReduceQuantity");
                                                he heVar2 = alertDialog$Builder2.a;
                                                heVar2.S = M02;
                                                heVar2.U = gm.S2(jb6.G(i5, "BoostingReduceUsersTextPlural", join));
                                                alertDialog$Builder2.j(jb6.M0(2131747564, "OK"), new dq9((byte) 14));
                                                alertDialog$Builder2.o();
                                                break;
                                            }
                                        }
                                        n8Var.b(true);
                                        oo0.m(arrayList3, tL_premiumGiftCodeOption, ap0Var.W1, null, dVar, new to0(ap0Var, (byte) 0), new to0(ap0Var, (byte) 1));
                                        break;
                                    }
                                }
                                break;
                            } else {
                                ArrayList c2 = oo0.c(ap0Var.Z0(), arrayList4);
                                int i6 = 0;
                                while (i6 < c2.size()) {
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) c2.get(i6);
                                    if (tL_premiumGiftCodeOption3.months == ap0Var.g2) {
                                        if (oo0.j()) {
                                            List list = ap0Var.T1;
                                            Context context2 = ap0Var.getContext();
                                            ylb ylbVar2 = ap0Var.J0;
                                            to0 to0Var2 = new to0(ap0Var, b3);
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
                                                String G = jb6.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                                int i11 = tL_premiumGiftCodeOption3.users;
                                                int i12 = tL_premiumGiftCodeOption5.users;
                                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, ylbVar2, context2);
                                                String M03 = jb6.M0(2131753267, "BoostingReduceQuantity");
                                                he heVar3 = alertDialog$Builder3.a;
                                                heVar3.S = M03;
                                                heVar3.U = gm.S2(jb6.G(i11, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i12)));
                                                alertDialog$Builder3.j(jb6.M0(2131746074, "Reduce"), new o(to0Var2, tL_premiumGiftCodeOption5, (byte) 20));
                                                alertDialog$Builder3.g(jb6.M0(2131752542, "Cancel"), new dq9((byte) 14));
                                                alertDialog$Builder3.o();
                                                break;
                                            }
                                        }
                                        int i13 = ap0Var.e2;
                                        int i14 = ex7.w;
                                        boolean z = i13 == 1;
                                        int n = oo0.n(ap0Var.h2);
                                        n8Var.b(true);
                                        boolean z2 = ap0Var.s2;
                                        boolean z3 = ap0Var.r2;
                                        String str2 = ap0Var.q2;
                                        to0 to0Var3 = new to0(ap0Var, (byte) 3);
                                        to0 to0Var4 = new to0(ap0Var, b2);
                                        boolean j = oo0.j();
                                        int i15 = z8c.t0;
                                        if (j) {
                                            oc7 r1 = oc7.r1(i15);
                                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
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
                                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(r1.i1(-((TLRPC.Chat) tLObject).id));
                                                }
                                            }
                                            tL_inputStorePaymentPremiumGiveaway.boost_peer = r1.i1(-chat.id);
                                            int size5 = arrayList.size();
                                            int i18 = 0;
                                            while (i18 < size5) {
                                                Object obj8 = arrayList.get(i18);
                                                i18++;
                                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj8)).iso2);
                                            }
                                            i5 i5Var = new i5();
                                            i5Var.b = "inapp";
                                            i5Var.a = tL_premiumGiftCodeOption3.store_product;
                                            cj0.h().o(Arrays.asList(i5Var.a()), new ze((Object) tL_inputStorePaymentPremiumGiveaway, (Object) tL_premiumGiftCodeOption3, (Object) connectionsManager, (Object) to0Var4, (Object) to0Var3, (Object) dVar, (byte) 3));
                                            break;
                                        } else {
                                            oc7 r12 = oc7.r1(i15);
                                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(z8c.t0);
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
                                                    to0Var = to0Var3;
                                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(r12.i1(-((TLRPC.Chat) tLObject2).id));
                                                } else {
                                                    to0Var = to0Var3;
                                                }
                                                to0Var3 = to0Var;
                                            }
                                            to0 to0Var5 = to0Var3;
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = r12.i1(-chat.id);
                                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = r12.i1(-chat.id);
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
                                            JSONObject u = wx0.u(dVar.getResourceProvider(), false);
                                            if (u != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                                tL_dataJSON.data = u.toString();
                                                tL_payments_getPaymentForm.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
                                            connectionsManager2.sendRequest(tL_payments_getPaymentForm, new fo0((Object) to0Var4, (Object) r12, (Object) tL_inputInvoicePremiumGiftCode, (Object) dVar, (Object) to0Var5, (byte) 0));
                                            break;
                                        }
                                    } else {
                                        i6++;
                                        b3 = b3;
                                    }
                                }
                                break;
                            }
                        } else {
                            Activity W = gm.W(ap0Var.getContext());
                            if (W == null) {
                                W = LaunchActivity.H1;
                            }
                            if (W != null && !W.isFinishing()) {
                                TL_stars.TL_starsGiveawayOption b1 = ap0Var.b1(ap0Var.k2);
                                int Z0 = ap0Var.Z0();
                                if (b1 != null) {
                                    n8Var.a.setLoading(true);
                                    int i22 = ap0Var.e2;
                                    int i23 = ex7.w;
                                    boolean z4 = i22 == 1;
                                    jva v = jva.v(ap0Var.a, false);
                                    int n2 = oo0.n(ap0Var.h2);
                                    boolean z5 = ap0Var.s2;
                                    boolean z6 = ap0Var.r2;
                                    String str3 = ap0Var.q2;
                                    lf2 lf2Var = new lf2(ap0Var, b1, b2);
                                    int i24 = v.a;
                                    if (oc7.r1(i24).c5()) {
                                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z4;
                                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z5;
                                        tL_inputStorePaymentStarsGiveaway.stars = b1.stars;
                                        oc7.r1(i24);
                                        tL_inputStorePaymentStarsGiveaway.boost_peer = oc7.k1(chat);
                                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                            int size8 = arrayList2.size();
                                            int i25 = 0;
                                            while (i25 < size8) {
                                                Object obj11 = arrayList2.get(i25);
                                                i25++;
                                                Activity activity = W;
                                                ArrayList<TLRPC.InputPeer> arrayList7 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                                oc7.r1(i24);
                                                arrayList7.add(oc7.j1((TLObject) obj11));
                                                W = activity;
                                            }
                                        }
                                        Activity activity2 = W;
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
                                        a6a.B(i24);
                                        tL_inputStorePaymentStarsGiveaway.random_id = a6a.D();
                                        tL_inputStorePaymentStarsGiveaway.until_date = n2;
                                        tL_inputStorePaymentStarsGiveaway.currency = b1.currency;
                                        tL_inputStorePaymentStarsGiveaway.amount = b1.amount;
                                        tL_inputStorePaymentStarsGiveaway.users = Z0;
                                        if (!e21.b() && cj0.h().j() && (str = b1.store_product) != null) {
                                            i5 i5Var2 = new i5();
                                            i5Var2.b = "inapp";
                                            i5Var2.a = str;
                                            cj0.h().o(Arrays.asList(i5Var2.a()), new lu((Object) v, (Object) lf2Var, (Object) tL_inputStorePaymentStarsGiveaway, (Object) activity2, (byte) 23));
                                            break;
                                        } else {
                                            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                            JSONObject u2 = wx0.u(jva.F(), false);
                                            if (u2 != null) {
                                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                                tL_dataJSON2.data = u2.toString();
                                                tL_payments_getPaymentForm2.flags |= 1;
                                            }
                                            tL_payments_getPaymentForm2.invoice = tL_inputInvoiceStars;
                                            ConnectionsManager.getInstance(i24).sendRequest(tL_payments_getPaymentForm2, new fm8((Object) v, (Object) lf2Var, (Object) tL_inputInvoiceStars, (byte) 18));
                                            break;
                                        }
                                    } else {
                                        d Q2 = LaunchActivity.Q();
                                        if (Q2 != null && Q2.getContext() != null) {
                                            jva.c0(Q2.getContext(), Q2.getResourceProvider());
                                            break;
                                        } else {
                                            jva.c0(W, null);
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
                r23 r23Var = (r23) obj3;
                b61 b61Var = (b61) obj;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, r23Var.J0, (Context) obj2);
                String M04 = jb6.M0(2131748555, null);
                he heVar4 = alertDialog$Builder4.a;
                heVar4.S = M04;
                heVar4.U = jb6.M0(2131748556, null);
                alertDialog$Builder4.j(jb6.M0(2131745757, null), new pt0((Object) r23Var, (Object) b61Var, this.b, (byte) 2));
                alertDialog$Builder4.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder4.c(-1);
                alertDialog$Builder4.o();
                break;
            default:
                nk3 nk3Var = (nk3) obj3;
                nk3Var.finishPreviewFragment();
                gm.d3(new p97((Object) nk3Var, obj2, obj, this.b, (byte) 7), 100L);
                break;
        }
    }

    public /* synthetic */ yo0(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
