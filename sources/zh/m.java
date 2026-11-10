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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.ma;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m(Context context, h6 h6Var, long j3, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = 2;
        this.c = context;
        this.d = h6Var;
        this.b = j3;
        this.f = starGift;
        this.e = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0123  */
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
                h6 h6Var = (h6) obj;
                Runnable runnable = (Runnable) obj2;
                s9 s9Var2 = uVar.h2;
                if (s9Var2 != null && !s9Var2.f()) {
                    long j10 = this.b;
                    Context context2 = this.c;
                    if ((j10 == 0 || j10 == p10.i(uVar.a).e()) && (arrayList = (s9Var = uVar.h2).h) != null) {
                        new b0(context2, h6Var, j10, s9Var.d, arrayList, runnable, false).show();
                    } else {
                        new r(context2, uVar.a, uVar.h2.d, null, j10, runnable, false, false).show();
                    }
                }
                uVar.dismiss();
                break;
            case 1:
                b0 b0Var = (b0) obj3;
                b0Var.getClass();
                l lVar = new l(context, (h6) obj, new k(j3, true, null), b0Var.Y1);
                lVar.show();
                lVar.i2 = (Runnable) obj2;
                b0Var.dismiss();
                break;
            case 2:
                new b0(this.c, (h6) obj, this.b, (TL_stars.StarGift) obj3, (ArrayList) obj2, null, true).show();
                break;
            default:
                final b4 b4Var = (b4) obj3;
                Runnable runnable2 = (Runnable) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int i11 = b4Var.T1;
                w3 w3Var = b4Var.o2;
                fi.d dVar = b4Var.j2;
                if (!dVar.Q) {
                    int i12 = 5;
                    if (b4Var.Y1 != null) {
                        l lVar2 = new l(context, b4Var.I0, new k(j3, b4Var.l2, b4Var.d1()), b4Var.Y1);
                        lVar2.show();
                        lVar2.i2 = runnable2;
                        org.telegram.messenger.g0.v1(w3Var);
                        b4Var.dismiss();
                        if (!b4Var.s2) {
                            org.telegram.messenger.g0.i3(new r3(b4Var, i12), 500L);
                            break;
                        }
                    } else {
                        dVar.setLoading(true);
                        org.telegram.ui.Cells.f3 f3Var = w3Var.b;
                        if (f3Var.getEmojiPadding() > 0) {
                            f3Var.k(true);
                        } else if (f3Var.w) {
                            f3Var.d();
                        }
                        final int i13 = 0;
                        if (starGift != null) {
                            ea.y(i11, false).i(b4Var.X1, b4Var.l2, b4Var.m2, b4Var.U1, b4Var.d1(), new p3(b4Var, i10));
                            break;
                        } else {
                            ug.j jVar = b4Var.Z1;
                            final TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(b4Var.U1));
                            if (a22 == null) {
                                dVar.setLoading(false);
                                break;
                            } else {
                                if (b4Var.n2) {
                                    TLObject tLObject2 = jVar.c;
                                    TLObject tLObject3 = jVar.d;
                                    if (tLObject2 != null || tLObject3 != null) {
                                        if (tLObject2 != null) {
                                            tLObject = tLObject2;
                                        } else if (tLObject3 != null) {
                                            tLObject = tLObject3;
                                        }
                                        if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                                                wg.r.k(new ArrayList(Arrays.asList(a22)), tL_premiumGiftCodeOption, null, b4Var.d1(), new w4(b4Var, 13), new org.telegram.ui.Wallet.s(18, b4Var, a22), new xg.a(b4Var, 5));
                                                break;
                                            } else {
                                                ea.y(i11, false).g(b4Var.U1, tL_premiumGiftCodeOption, b4Var.d1(), new v10() { // from class: zh.q3
                                                    @Override // org.telegram.messenger.v10
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i14 = i10;
                                                        TLRPC.User user = a22;
                                                        b4 b4Var2 = b4Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i14) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = b4Var2.b2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(b4Var2.o2);
                                                                    b4Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new s3(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new gc(b4Var2.E, b4Var2.I0).Q(R.raw.error, 36, id.a0(null, null, 2131743878, str)).j();
                                                                }
                                                                b4Var2.j2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = b4Var2.b2;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(b4Var2.o2);
                                                                    b4Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new s3(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new gc(b4Var2.E, b4Var2.I0).Q(R.raw.error, 36, id.a0(null, null, 2131743878, str)).j();
                                                                }
                                                                b4Var2.j2.setLoading(false);
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
                                                        org.telegram.messenger.r1.i().d(jVar.a.store_product, new q9(b4Var, 6));
                                                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                                                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                                                        ConnectionsManager.getInstance(i11).sendRequest(tL_payments_canPurchaseStore, new bi.f2(b4Var, tL_inputStorePaymentGiftPremium, tL_payments_canPurchaseStore, 26));
                                                        break;
                                                    }
                                                } else {
                                                    LaunchActivity launchActivity = LaunchActivity.G1;
                                                    if (launchActivity != null) {
                                                        Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                                                        if (parse.getHost().equals("t.me")) {
                                                            if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                                                launchActivity.X0 = new r3(b4Var, i13);
                                                            } else {
                                                                launchActivity.W0 = true;
                                                            }
                                                        }
                                                        vf.c.t(launchActivity, jVar.a.bot_url);
                                                        b4Var.dismiss();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                ea.y(i11, false).g(b4Var.U1, tL_premiumGiftOption, b4Var.d1(), new v10() { // from class: zh.q3
                                                    @Override // org.telegram.messenger.v10
                                                    public final void a(Object obj4, Object obj5) {
                                                        int i14 = i13;
                                                        TLRPC.User user = a22;
                                                        b4 b4Var2 = b4Var;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (i14) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = b4Var2.b2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(b4Var2.o2);
                                                                    b4Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new s3(1, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new gc(b4Var2.E, b4Var2.I0).Q(R.raw.error, 36, id.a0(null, null, 2131743878, str)).j();
                                                                }
                                                                b4Var2.j2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable4 = b4Var2.b2;
                                                                    if (runnable4 != null) {
                                                                        runnable4.run();
                                                                    }
                                                                    org.telegram.messenger.g0.v1(b4Var2.o2);
                                                                    b4Var2.dismiss();
                                                                    org.telegram.messenger.g0.i3(new s3(2, user), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new gc(b4Var2.E, b4Var2.I0).Q(R.raw.error, 36, id.a0(null, null, 2131743878, str)).j();
                                                                }
                                                                b4Var2.j2.setLoading(false);
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
                                if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                                }
                            }
                        }
                    }
                }
                break;
        }
    }

    public /* synthetic */ m(ma maVar, long j3, Context context, h6 h6Var, Runnable runnable, int i7) {
        this.a = i7;
        this.f = maVar;
        this.b = j3;
        this.c = context;
        this.d = h6Var;
        this.e = runnable;
    }

    public /* synthetic */ m(b4 b4Var, long j3, Context context, Runnable runnable, TL_stars.StarGift starGift) {
        this.a = 3;
        this.f = b4Var;
        this.b = j3;
        this.c = context;
        this.e = runnable;
        this.d = starGift;
    }
}
