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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zy implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zy(Context context, wjb wjbVar, long j, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = (byte) 2;
        this.c = context;
        this.d = wjbVar;
        this.b = j;
        this.f = starGift;
        this.e = arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        gt4 gt4Var;
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
                ez ezVar = (ez) obj3;
                wjb wjbVar = (wjb) obj2;
                av4 av4Var = (av4) obj;
                gt4 gt4Var2 = ezVar.h2;
                if (gt4Var2 != null && !gt4Var2.f()) {
                    long j2 = this.b;
                    Context context2 = this.c;
                    if ((j2 == 0 || j2 == y6c.h(ezVar.a).e()) && (arrayList = (gt4Var = ezVar.h2).h) != null) {
                        new lz(context2, wjbVar, j2, gt4Var.d, arrayList, av4Var, false).show();
                    } else {
                        new bz(context2, ezVar.a, ezVar.h2.d, null, j2, av4Var, false, false).show();
                    }
                }
                ezVar.dismiss();
                break;
            case 1:
                lz lzVar = (lz) obj3;
                ty tyVar = new ty(context, (wjb) obj2, new sy(j, true, null), lzVar.Y1);
                tyVar.show();
                tyVar.i2 = (av4) obj;
                lzVar.dismiss();
                break;
            case 2:
                new lz(this.c, (wjb) obj2, this.b, (TL_stars.StarGift) obj3, (ArrayList) obj, null, true).show();
                break;
            default:
                final h1a h1aVar = (h1a) obj3;
                Runnable runnable = (Runnable) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int i = h1aVar.T1;
                c1a c1aVar = h1aVar.o2;
                u41 u41Var = h1aVar.j2;
                if (!u41Var.R) {
                    if (h1aVar.Y1 != null) {
                        ty tyVar2 = new ty(context, h1aVar.J0, new sy(j, h1aVar.l2, h1aVar.Y0()), h1aVar.Y1);
                        tyVar2.show();
                        tyVar2.i2 = runnable;
                        gl.t1(c1aVar);
                        h1aVar.dismiss();
                        if (!h1aVar.s2) {
                            gl.e3(new y0a(h1aVar, (byte) 5), 500L);
                            break;
                        }
                    } else {
                        u41Var.setLoading(true);
                        int emojiPadding = c1aVar.b.getEmojiPadding();
                        ts3 ts3Var = c1aVar.b;
                        if (emojiPadding > 0) {
                            ts3Var.k(true);
                        } else if (ts3Var.w) {
                            ts3Var.d();
                        }
                        final byte b3 = 0;
                        if (starGift != null) {
                            gta.v(i, false).g(h1aVar.X1, h1aVar.l2, h1aVar.m2, h1aVar.U1, h1aVar.Y0(), new w0a(h1aVar, b2));
                            break;
                        } else {
                            mu4 mu4Var = h1aVar.Z1;
                            final TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(h1aVar.U1));
                            if (V1 == null) {
                                u41Var.setLoading(false);
                                break;
                            } else {
                                if (h1aVar.n2) {
                                    TLObject tLObject2 = mu4Var.c;
                                    TLObject tLObject3 = mu4Var.d;
                                    if (tLObject2 != null || tLObject3 != null) {
                                        if (tLObject2 != null) {
                                            tLObject = tLObject2;
                                        } else if (tLObject3 != null) {
                                            tLObject = tLObject3;
                                        }
                                        if (!(tLObject instanceof TLRPC.TL_premiumGiftCodeOption)) {
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency)) {
                                                on0.m(new ArrayList(Arrays.asList(V1)), tL_premiumGiftCodeOption, null, h1aVar.Y0(), new hu0(h1aVar, (byte) 12), new nu9(h1aVar, V1, (byte) 1), new ae9(h1aVar, (byte) 6));
                                                break;
                                            } else {
                                                gta.v(i, false).e(h1aVar.U1, tL_premiumGiftCodeOption, h1aVar.Y0(), new i8c() { // from class: x0a
                                                    @Override // i8c
                                                    public final void a(Object obj4, Object obj5) {
                                                        byte b4 = b2;
                                                        TLRPC.User user = V1;
                                                        h1a h1aVar2 = h1aVar;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (b4) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable2 = h1aVar2.b2;
                                                                    if (runnable2 != null) {
                                                                        runnable2.run();
                                                                    }
                                                                    gl.t1(h1aVar2.o2);
                                                                    h1aVar2.dismiss();
                                                                    gl.e3(new mm8(user, (byte) 2), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new u21(h1aVar2.F, h1aVar2.J0).Q(R.raw.error, 36, k96.a0(null, null, 2131743639, str)).j();
                                                                }
                                                                h1aVar2.j2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = h1aVar2.b2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    gl.t1(h1aVar2.o2);
                                                                    h1aVar2.dismiss();
                                                                    gl.e3(new mm8(user, (byte) 3), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new u21(h1aVar2.F, h1aVar2.J0).Q(R.raw.error, 36, k96.a0(null, null, 2131743639, str)).j();
                                                                }
                                                                h1aVar2.j2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        } else if (tLObject instanceof TLRPC.TL_premiumGiftOption) {
                                            TLRPC.TL_premiumGiftOption tL_premiumGiftOption = (TLRPC.TL_premiumGiftOption) tLObject;
                                            if (!"XTR".equalsIgnoreCase(tL_premiumGiftOption.currency)) {
                                                if (!w01.b()) {
                                                    if (ci0.h().j() && mu4Var.h != null) {
                                                        TLRPC.TL_inputStorePaymentGiftPremium tL_inputStorePaymentGiftPremium = new TLRPC.TL_inputStorePaymentGiftPremium();
                                                        tL_inputStorePaymentGiftPremium.user_id = na7.q1(i).o1(V1);
                                                        tL_inputStorePaymentGiftPremium.currency = mu4Var.h.a().c;
                                                        tL_inputStorePaymentGiftPremium.amount = (long) (Math.pow(10.0d, ci0.h().g(tL_inputStorePaymentGiftPremium.currency)) * (r2.b / 1000000.0d));
                                                        ci0.h().c(mu4Var.a.store_product, new gw(h1aVar, (byte) 16));
                                                        TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                                                        tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentGiftPremium;
                                                        ConnectionsManager.getInstance(i).sendRequest(tL_payments_canPurchaseStore, new ck8((Object) h1aVar, (Object) tL_inputStorePaymentGiftPremium, (Object) tL_payments_canPurchaseStore, (byte) 7));
                                                        break;
                                                    }
                                                } else {
                                                    LaunchActivity launchActivity = LaunchActivity.H1;
                                                    if (launchActivity != null) {
                                                        Uri parse = Uri.parse(tL_premiumGiftOption.bot_url);
                                                        if (parse.getHost().equals("t.me")) {
                                                            if (parse.getPath().startsWith("/$") || parse.getPath().startsWith("/invoice/")) {
                                                                launchActivity.Y0 = new y0a(h1aVar, b3);
                                                            } else {
                                                                launchActivity.X0 = true;
                                                            }
                                                        }
                                                        d01.t(launchActivity, mu4Var.a.bot_url);
                                                        h1aVar.dismiss();
                                                        break;
                                                    }
                                                }
                                            } else {
                                                gta.v(i, false).e(h1aVar.U1, tL_premiumGiftOption, h1aVar.Y0(), new i8c() { // from class: x0a
                                                    @Override // i8c
                                                    public final void a(Object obj4, Object obj5) {
                                                        byte b4 = b3;
                                                        TLRPC.User user = V1;
                                                        h1a h1aVar2 = h1aVar;
                                                        Boolean bool = (Boolean) obj4;
                                                        String str = (String) obj5;
                                                        switch (b4) {
                                                            case 0:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable2 = h1aVar2.b2;
                                                                    if (runnable2 != null) {
                                                                        runnable2.run();
                                                                    }
                                                                    gl.t1(h1aVar2.o2);
                                                                    h1aVar2.dismiss();
                                                                    gl.e3(new mm8(user, (byte) 2), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new u21(h1aVar2.F, h1aVar2.J0).Q(R.raw.error, 36, k96.a0(null, null, 2131743639, str)).j();
                                                                }
                                                                h1aVar2.j2.setLoading(false);
                                                                break;
                                                            default:
                                                                if (bool.booleanValue()) {
                                                                    Runnable runnable3 = h1aVar2.b2;
                                                                    if (runnable3 != null) {
                                                                        runnable3.run();
                                                                    }
                                                                    gl.t1(h1aVar2.o2);
                                                                    h1aVar2.dismiss();
                                                                    gl.e3(new mm8(user, (byte) 3), 250L);
                                                                } else if (!TextUtils.isEmpty(str)) {
                                                                    new u21(h1aVar2.F, h1aVar2.J0).Q(R.raw.error, 36, k96.a0(null, null, 2131743639, str)).j();
                                                                }
                                                                h1aVar2.j2.setLoading(false);
                                                                break;
                                                        }
                                                    }
                                                });
                                                break;
                                            }
                                        }
                                    }
                                }
                                tLObject = mu4Var.b;
                                if (tLObject == null && (tLObject = mu4Var.a) == null) {
                                    u41Var.setLoading(false);
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

    public /* synthetic */ zy(fy0 fy0Var, long j, Context context, Object obj, Object obj2, byte b) {
        this.a = b;
        this.f = fy0Var;
        this.b = j;
        this.c = context;
        this.d = obj;
        this.e = obj2;
    }
}
