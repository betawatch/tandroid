package zh;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import bi.ea;
import bi.q9;
import bi.w4;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.s9;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.na;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m(Context context, f6 f6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = f6Var;
        this.b = j3;
        this.f = starGift;
        this.e = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        s9 s9Var;
        ArrayList arrayList;
        int i7 = this.a;
        TLObject tLObject = null;
        Context context = this.c;
        long j3 = this.b;
        Object obj = this.d;
        Object obj2 = this.e;
        Object obj3 = this.f;
        final int i10 = 1;
        switch (i7) {
            case 0:
                u uVar = (u) obj3;
                f6 f6Var = (f6) obj;
                Runnable runnable = (Runnable) obj2;
                s9 s9Var2 = uVar.e2;
                if (s9Var2 != null && !s9Var2.f()) {
                    long j10 = this.b;
                    Context context2 = this.c;
                    if ((j10 == 0 || j10 == p10.i(uVar.a).e()) && (arrayList = (s9Var = uVar.e2).h) != null) {
                        new b0(context2, f6Var, j10, s9Var.d, arrayList, runnable, false).show();
                    } else {
                        new r(context2, uVar.a, uVar.e2.d, null, j10, runnable, false, false).show();
                    }
                }
                uVar.dismiss();
                break;
            case 1:
                b0 b0Var = (b0) obj3;
                b0Var.getClass();
                l lVar = new l(context, (f6) obj, new k(j3, true, null), b0Var.V1);
                lVar.show();
                lVar.f2 = (Runnable) obj2;
                b0Var.dismiss();
                break;
            case 2:
                new b0(this.c, (f6) obj, this.b, (TL_stars.StarGift) obj3, (ArrayList) obj2, null, true).show();
                break;
            default:
                final a4 a4Var = (a4) obj3;
                Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int i11 = a4Var.Q1;
                v3 v3Var = a4Var.l2;
                fi.d dVar = a4Var.g2;
                if (!dVar.Q) {
                    if (a4Var.V1 != null) {
                        l lVar2 = new l(context, a4Var.I0, new k(j3, a4Var.i2, a4Var.d1()), a4Var.V1);
                        lVar2.show();
                        lVar2.f2 = runnable2;
                        org.telegram.messenger.g0.v1(v3Var);
                        a4Var.dismiss();
                        if (!a4Var.p2) {
                            org.telegram.messenger.g0.i3(new q3(a4Var, 5), 500L);
                            break;
                        }
                    } else {
                        dVar.setLoading(true);
                        org.telegram.ui.Cells.f3 f3Var = v3Var.b;
                        if (f3Var.getEmojiPadding() > 0) {
                            f3Var.k(true);
                        } else if (f3Var.w) {
                            f3Var.d();
                        }
                        final int i12 = 0;
                        if (starGift != null) {
                            ea.y(i11, false).i(a4Var.U1, a4Var.i2, a4Var.j2, a4Var.R1, a4Var.d1(), new o3(a4Var, i10));
                            break;
                        } else {
                            ug.j jVar = a4Var.W1;
                            final TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(a4Var.R1));
                            if (a22 == null) {
                                dVar.setLoading(false);
                                break;
                            } else {
                                if (a4Var.k2) {
                                    TLObject tLObject2 = jVar.c;
                                    TLObject tLObject3 = jVar.d;
                                    if (tLObject2 != null || tLObject3 != null) {
                                        if (tLObject2 != null) {
                                            tLObject = tLObject2;
                                        } else if (tLObject3 != null) {
                                            tLObject = tLObject3;
                                        }
                                        int i13 = 6;
                                        if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                                                wg.s.k(new ArrayList(Arrays.asList(a22)), tL_premiumGiftCodeOption, null, a4Var.d1(), new w4(a4Var, 13), new org.telegram.ui.Wallet.t(18, a4Var, a22), new xg.a(a4Var, 6));
                                                break;
                                            } else {
                                                ea.y(i11, false).g(a4Var.R1, tL_premiumGiftCodeOption, a4Var.d1(), new v10() { // from class: zh.p3
                                                    @Override // org.telegram.messenger.v10
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i14 = i10;
                                                        TLRPC.User user = a22;
                                                        a4 a4Var2 = a4Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i14) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = a4Var2.Y1;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(a4Var2.l2);
                                                                    a4Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new r3(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new hc(a4Var2.E, a4Var2.I0).Q(R.raw.error, 36, id.a0(null, null, 2131743881, str)).j();
                                                                }
                                                                a4Var2.g2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = a4Var2.Y1;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(a4Var2.l2);
                                                                    a4Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new r3(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new hc(a4Var2.E, a4Var2.I0).Q(R.raw.error, 36, id.a0(null, null, 2131743881, str)).j();
                                                                }
                                                                a4Var2.g2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        } else if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                                            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                                                if (!org.telegram.messenger.r2.b()) {
                                                    if (org.telegram.messenger.r1.i().k() && jVar.h != null) {
                                                        TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
                                                        tL_inputStorePaymentGiftPremium.user_id = qp.s1(i11).q1(a22);
                                                        tL_inputStorePaymentGiftPremium.currency = jVar.h.a().c;
                                                        tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, org.telegram.messenger.r1.i().h(tL_inputStorePaymentGiftPremium.currency)) * (r3.b / Math.pow(10.0d, 6.0d)));
                                                        org.telegram.messenger.r1.i().d(jVar.a.store_product, new q9(a4Var, i13));
                                                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                                                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                                                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new bi.f2(a4Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, 26));
                                                        break;
                                                    }
                                                } else {
                                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                                    if (launchActivity != null) {
                                                        Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                                                        if (parse.getHost().equals("t.me")) {
                                                            if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                                                launchActivity.X0 = new q3(a4Var, i12);
                                                            } else {
                                                                launchActivity.W0 = true;
                                                            }
                                                        }
                                                        vf.c.t(launchActivity, jVar.a.bot_url);
                                                        a4Var.dismiss();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                ea.y(i11, false).g(a4Var.R1, tL_premiumGiftOption, a4Var.d1(), new v10() { // from class: zh.p3
                                                    @Override // org.telegram.messenger.v10
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i14 = i12;
                                                        TLRPC.User user = a22;
                                                        a4 a4Var2 = a4Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i14) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = a4Var2.Y1;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(a4Var2.l2);
                                                                    a4Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new r3(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new hc(a4Var2.E, a4Var2.I0).Q(R.raw.error, 36, id.a0(null, null, 2131743881, str)).j();
                                                                }
                                                                a4Var2.g2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = a4Var2.Y1;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(a4Var2.l2);
                                                                    a4Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new r3(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new hc(a4Var2.E, a4Var2.I0).Q(R.raw.error, 36, id.a0(null, null, 2131743881, str)).j();
                                                                }
                                                                a4Var2.g2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        }
                                    }
                                }
                                tLObject = jVar.b;
                                if (tLObject == null && (tLObject = jVar.a) == null) {
                                    dVar.setLoading(false);
                                    break;
                                }
                                int i132 = 6;
                                if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ m(na naVar, long j3, Context context, f6 f6Var, Runnable runnable, int i7) {
        this.a = i7;
        this.f = naVar;
        this.b = j3;
        this.c = context;
        this.d = f6Var;
        this.e = runnable;
    }

    public /* synthetic */ m(a4 a4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = a4Var;
        this.b = j3;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
