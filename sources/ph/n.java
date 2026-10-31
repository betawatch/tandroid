package ph;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.j20;
import org.telegram.messenger.t9;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ha;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f11;
import rh.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n(Context context, p6 p6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = p6Var;
        this.b = j10;
        this.f = starGift;
        this.e = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        t9 t9Var;
        ArrayList arrayList;
        int i10 = this.a;
        TLObject tLObject = null;
        Context context = this.c;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.f;
        final int i11 = 1;
        switch (i10) {
            case 0:
                w wVar = (w) obj3;
                p6 p6Var = (p6) obj;
                Runnable runnable = (Runnable) obj2;
                t9 t9Var2 = wVar.e2;
                if (t9Var2 != null && !t9Var2.f()) {
                    long j11 = this.b;
                    Context context2 = this.c;
                    if ((j11 == 0 || j11 == d20.i(wVar.a).e()) && (arrayList = (t9Var = wVar.e2).h) != null) {
                        new d0(context2, p6Var, j11, t9Var.d, arrayList, runnable, false).show();
                    } else {
                        new t(context2, wVar.a, wVar.e2.d, null, j11, runnable, false, false).show();
                    }
                }
                wVar.dismiss();
                break;
            case 1:
                d0 d0Var = (d0) obj3;
                d0Var.getClass();
                m mVar = new m(context, (p6) obj, new l(j10, true, null), d0Var.V1);
                mVar.show();
                mVar.f2 = (Runnable) obj2;
                d0Var.dismiss();
                break;
            case 2:
                new d0(this.c, (p6) obj, this.b, (TL_stars.StarGift) obj3, (ArrayList) obj2, null, true).show();
                break;
            default:
                final g4 g4Var = (g4) obj3;
                Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int i12 = g4Var.Q1;
                b4 b4Var = g4Var.l2;
                vh.d dVar = g4Var.g2;
                if (!dVar.Q) {
                    if (g4Var.V1 != null) {
                        m mVar2 = new m(context, g4Var.I0, new l(j10, g4Var.i2, g4Var.d1()), g4Var.V1);
                        mVar2.show();
                        mVar2.f2 = runnable2;
                        org.telegram.messenger.i0.v1(b4Var);
                        g4Var.dismiss();
                        if (!g4Var.p2) {
                            org.telegram.messenger.i0.h3(new w3(g4Var, 5), 500L);
                            break;
                        }
                    } else {
                        dVar.setLoading(true);
                        org.telegram.ui.Cells.h3 h3Var = b4Var.b;
                        if (h3Var.getEmojiPadding() > 0) {
                            h3Var.k(true);
                        } else if (h3Var.w) {
                            h3Var.d();
                        }
                        final int i13 = 0;
                        if (starGift != null) {
                            e6.y(i12, false).i(g4Var.U1, g4Var.i2, g4Var.j2, g4Var.R1, g4Var.d1(), new u3(g4Var, i11));
                            break;
                        } else {
                            kg.m mVar3 = g4Var.W1;
                            final TLRPC.User Z1 = vp.r1(i12).Z1(Long.valueOf(g4Var.R1));
                            if (Z1 == null) {
                                dVar.setLoading(false);
                                break;
                            } else {
                                if (g4Var.k2) {
                                    TLObject tLObject2 = mVar3.c;
                                    TLObject tLObject3 = mVar3.d;
                                    if (tLObject2 != null || tLObject3 != null) {
                                        if (tLObject2 != null) {
                                            tLObject = tLObject2;
                                        } else if (tLObject3 != null) {
                                            tLObject = tLObject3;
                                        }
                                        if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                                                mg.k0.k(new ArrayList(Arrays.asList(Z1)), tL_premiumGiftCodeOption, null, g4Var.d1(), new kg.q1(g4Var, 8), new f11(24, g4Var, Z1), new h1(g4Var, 3));
                                                break;
                                            } else {
                                                e6.y(i12, false).g(g4Var.R1, tL_premiumGiftCodeOption, g4Var.d1(), new j20() { // from class: ph.v3
                                                    @Override // org.telegram.messenger.j20
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i14 = i11;
                                                        TLRPC.User user = Z1;
                                                        g4 g4Var2 = g4Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i14) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = g4Var2.Y1;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.i0.v1(g4Var2.l2);
                                                                    g4Var2.dismiss();
                                                                    org.telegram.messenger.i0.h3(new x3(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new cc(g4Var2.E, g4Var2.I0).Q(R.raw.error, 36, cd.a0(null, null, 2131743903, str)).j();
                                                                }
                                                                g4Var2.g2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = g4Var2.Y1;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.i0.v1(g4Var2.l2);
                                                                    g4Var2.dismiss();
                                                                    org.telegram.messenger.i0.h3(new x3(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new cc(g4Var2.E, g4Var2.I0).Q(R.raw.error, 36, cd.a0(null, null, 2131743903, str)).j();
                                                                }
                                                                g4Var2.g2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        } else if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                                            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                                                if (!org.telegram.messenger.v2.b()) {
                                                    if (org.telegram.messenger.u1.i().k() && mVar3.h != null) {
                                                        TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
                                                        tL_inputStorePaymentGiftPremium.user_id = vp.r1(i12).p1(Z1);
                                                        tL_inputStorePaymentGiftPremium.currency = mVar3.h.a().c;
                                                        tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(tL_inputStorePaymentGiftPremium.currency)) * (r3.b / Math.pow(10.0d, 6.0d)));
                                                        org.telegram.messenger.u1.i().d(mVar3.a.store_product, new ig.i(g4Var, i11));
                                                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                                                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                                                        ConnectionsManager.getInstance(i12).sendRequest(tL_payments_canPurchaseStore, new ag.p0(g4Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, 17));
                                                        break;
                                                    }
                                                } else {
                                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                                    if (launchActivity != null) {
                                                        Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                                                        if (parse.getHost().equals("t.me")) {
                                                            if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                                                launchActivity.Z0 = new w3(g4Var, i13);
                                                            } else {
                                                                launchActivity.Y0 = true;
                                                            }
                                                        }
                                                        gf.f.r(launchActivity, mVar3.a.bot_url);
                                                        g4Var.dismiss();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                e6.y(i12, false).g(g4Var.R1, tL_premiumGiftOption, g4Var.d1(), new j20() { // from class: ph.v3
                                                    @Override // org.telegram.messenger.j20
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i14 = i13;
                                                        TLRPC.User user = Z1;
                                                        g4 g4Var2 = g4Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i14) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = g4Var2.Y1;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.i0.v1(g4Var2.l2);
                                                                    g4Var2.dismiss();
                                                                    org.telegram.messenger.i0.h3(new x3(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new cc(g4Var2.E, g4Var2.I0).Q(R.raw.error, 36, cd.a0(null, null, 2131743903, str)).j();
                                                                }
                                                                g4Var2.g2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = g4Var2.Y1;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.i0.v1(g4Var2.l2);
                                                                    g4Var2.dismiss();
                                                                    org.telegram.messenger.i0.h3(new x3(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new cc(g4Var2.E, g4Var2.I0).Q(R.raw.error, 36, cd.a0(null, null, 2131743903, str)).j();
                                                                }
                                                                g4Var2.g2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        }
                                    }
                                }
                                tLObject = mVar3.b;
                                if (tLObject == null && (tLObject = mVar3.a) == null) {
                                    dVar.setLoading(false);
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

    public /* synthetic */ n(ha haVar, long j10, Context context, p6 p6Var, Runnable runnable, int i10) {
        this.a = i10;
        this.f = haVar;
        this.b = j10;
        this.c = context;
        this.d = p6Var;
        this.e = runnable;
    }

    public /* synthetic */ n(g4 g4Var, long j10, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = g4Var;
        this.b = j10;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
