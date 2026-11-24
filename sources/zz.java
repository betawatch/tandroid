// default package

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class zz implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zz(Context context, ylb ylbVar, long j, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = (byte) 2;
        this.c = context;
        this.d = ylbVar;
        this.b = j;
        this.f = starGift;
        this.e = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0114  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        hv4 hv4Var;
        ArrayList arrayList;
        byte b = this.a;
        TLObject tLObject = null;
        Context context = this.c;
        long j = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        final byte b2 = 1;
        switch (b) {
            case 0:
                e00 e00Var = (e00) obj3;
                ylb ylbVar = (ylb) obj2;
                bx4 bx4Var = (bx4) obj;
                hv4 hv4Var2 = e00Var.h2;
                if (hv4Var2 != null && !hv4Var2.f()) {
                    long j2 = this.b;
                    Context context2 = this.c;
                    if ((j2 == 0 || j2 == z8c.h(e00Var.a).e()) && (arrayList = (hv4Var = e00Var.h2).h) != null) {
                        new m00(context2, ylbVar, j2, hv4Var.d, arrayList, bx4Var, false).show();
                    } else {
                        new b00(context2, e00Var.a, e00Var.h2.d, null, j2, bx4Var, false, false).show();
                    }
                }
                e00Var.dismiss();
                break;
            case 1:
                m00 m00Var = (m00) obj3;
                tz tzVar = new tz(context, (ylb) obj2, new sz(j, true, null), m00Var.Y1);
                tzVar.show();
                tzVar.i2 = (bx4) obj;
                m00Var.dismiss();
                break;
            case 2:
                new m00(this.c, (ylb) obj2, this.b, (TL_stars.StarGift) obj3, (ArrayList) obj, null, true).show();
                break;
            default:
                final j3a j3aVar = (j3a) obj3;
                Runnable runnable = (Runnable) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int i = j3aVar.T1;
                e3a e3aVar = j3aVar.o2;
                b61 b61Var = j3aVar.j2;
                if (!b61Var.R) {
                    if (j3aVar.Y1 != null) {
                        tz tzVar2 = new tz(context, j3aVar.J0, new sz(j, j3aVar.l2, j3aVar.Y0()), j3aVar.Y1);
                        tzVar2.show();
                        tzVar2.i2 = runnable;
                        gm.t1(e3aVar);
                        j3aVar.dismiss();
                        if (!j3aVar.s2) {
                            gm.d3(new a3a(j3aVar, (byte) 5), 500L);
                            break;
                        }
                    } else {
                        b61Var.setLoading(true);
                        int emojiPadding = e3aVar.b.getEmojiPadding();
                        du3 du3Var = e3aVar.b;
                        if (emojiPadding > 0) {
                            du3Var.k(true);
                        } else if (du3Var.w) {
                            du3Var.d();
                        }
                        final byte b3 = 0;
                        if (starGift != null) {
                            jva.v(i, false).g(j3aVar.X1, j3aVar.l2, j3aVar.m2, j3aVar.U1, j3aVar.Y0(), new y2a(j3aVar, b2));
                            break;
                        } else {
                            nw4 nw4Var = j3aVar.Z1;
                            final TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(j3aVar.U1));
                            if (W1 == null) {
                                b61Var.setLoading(false);
                                break;
                            } else {
                                if (j3aVar.n2) {
                                    TLObject tLObject2 = nw4Var.c;
                                    TLObject tLObject3 = nw4Var.d;
                                    if (tLObject2 != null || tLObject3 != null) {
                                        if (tLObject2 != null) {
                                            tLObject = tLObject2;
                                        } else if (tLObject3 != null) {
                                            tLObject = tLObject3;
                                        }
                                        if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                                                oo0.m(new ArrayList(Arrays.asList(W1)), tL_premiumGiftCodeOption, null, j3aVar.Y0(), new qv0(j3aVar, (byte) 12), new ts9(j3aVar, W1, (byte) 2), new eg9(j3aVar, (byte) 6));
                                                break;
                                            } else {
                                                jva.v(i, false).e(j3aVar.U1, tL_premiumGiftCodeOption, j3aVar.Y0(), new jac() { // from class: z2a
                                                    @Override // jac
                                                    public final void a(Object obj4, Object obj5) {
                                                        byte b4 = b2;
                                                        TLRPC.User user = W1;
                                                        j3a j3aVar2 = j3aVar;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (b4) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable2 = j3aVar2.b2;
                                                                    if (runnable2 != null) {
                                                                        runnable2.run();
                                                                    }
                                                                    gm.t1(j3aVar2.o2);
                                                                    j3aVar2.dismiss();
                                                                    gm.d3(new lo8(user, (byte) 2), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new c41(j3aVar2.F, j3aVar2.J0).Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, str)).j();
                                                                }
                                                                j3aVar2.j2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = j3aVar2.b2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    gm.t1(j3aVar2.o2);
                                                                    j3aVar2.dismiss();
                                                                    gm.d3(new lo8(user, (byte) 3), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new c41(j3aVar2.F, j3aVar2.J0).Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, str)).j();
                                                                }
                                                                j3aVar2.j2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        } else if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                                            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                                                if (!e21.b()) {
                                                    if (cj0.h().j() && nw4Var.h != null) {
                                                        TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
                                                        tL_inputStorePaymentGiftPremium.user_id = oc7.r1(i).p1(W1);
                                                        tL_inputStorePaymentGiftPremium.currency = nw4Var.h.a().c;
                                                        tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, cj0.h().g(tL_inputStorePaymentGiftPremium.currency)) * (r2.b / 1000000.0d));
                                                        cj0.h().c(nw4Var.a.store_product, new gx(j3aVar, (byte) 16));
                                                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                                                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                                                        ConnectionsManager.getInstance(i).sendRequest(tL_payments_canPurchaseStore, new fm8((Object) j3aVar, (Object) tL_inputStorePaymentGiftPremium, (Object) tL_payments_canPurchaseStore, (byte) 7));
                                                        break;
                                                    }
                                                } else {
                                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                                    if (launchActivity != null) {
                                                        Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                                                        if (parse.getHost().equals("t.me")) {
                                                            if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                                                launchActivity.Y0 = new a3a(j3aVar, b3);
                                                            } else {
                                                                launchActivity.X0 = true;
                                                            }
                                                        }
                                                        l11.u(launchActivity, nw4Var.a.bot_url);
                                                        j3aVar.dismiss();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                jva.v(i, false).e(j3aVar.U1, tL_premiumGiftOption, j3aVar.Y0(), new jac() { // from class: z2a
                                                    @Override // jac
                                                    public final void a(Object obj4, Object obj5) {
                                                        byte b4 = b3;
                                                        TLRPC.User user = W1;
                                                        j3a j3aVar2 = j3aVar;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (b4) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable2 = j3aVar2.b2;
                                                                    if (runnable2 != null) {
                                                                        runnable2.run();
                                                                    }
                                                                    gm.t1(j3aVar2.o2);
                                                                    j3aVar2.dismiss();
                                                                    gm.d3(new lo8(user, (byte) 2), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new c41(j3aVar2.F, j3aVar2.J0).Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, str)).j();
                                                                }
                                                                j3aVar2.j2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = j3aVar2.b2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    gm.t1(j3aVar2.o2);
                                                                    j3aVar2.dismiss();
                                                                    gm.d3(new lo8(user, (byte) 3), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new c41(j3aVar2.F, j3aVar2.J0).Q(R.raw.error, 36, jb6.a0(null, null, 2131743565, str)).j();
                                                                }
                                                                j3aVar2.j2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        }
                                    }
                                }
                                tLObject = nw4Var.b;
                                if (tLObject == null && (tLObject = nw4Var.a) == null) {
                                    b61Var.setLoading(false);
                                    break;
                                }
                                if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ zz(mz0 mz0Var, long j, Context context, Object obj, Object obj2, byte b) {
        this.a = b;
        this.f = mz0Var;
        this.b = j;
        this.c = context;
        this.d = obj;
        this.e = obj2;
    }
}
