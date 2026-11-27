// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class pq7 implements pcc {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ vnb d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ pq7(Context context, int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx, a35 a35Var, vnb vnbVar, d31 d31Var) {
        this.b = context;
        this.c = i;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = tL_payments_starGiftOnchainOfferTx;
        this.g = a35Var;
        this.d = vnbVar;
        this.h = d31Var;
    }

    @Override // pcc
    public final void a(Object obj) {
        byte b;
        String a0;
        String M0;
        byte b2 = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        TLObject tLObject = this.f;
        Object obj4 = this.e;
        switch (b2) {
            case 0:
                String str = (String) obj;
                id idVar = new id(3, null, this.b);
                idVar.q(200L);
                TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                ((String[]) obj4)[0] = str;
                tL_messages_checkUrlAuthMatchCode.match_code = str;
                tL_messages_checkUrlAuthMatchCode.url = ((TLRPC.TL_messages_requestUrlAuth) tLObject).url;
                ConnectionsManager.getInstance(this.c).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new ic((byte) 0), new nu0(idVar, (x35) obj3, (String) obj2, this.d, (byte) 13));
                break;
            default:
                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj4;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) tLObject;
                final a35 a35Var = (a35) obj3;
                final d31 d31Var = (d31) obj2;
                final long longValue = ((Long) obj).longValue();
                long j = tL_payments_starGiftOnchainOfferTx.fine;
                if (j <= 0) {
                    j = 0;
                }
                long max = Math.max(0L, tL_messageActionStarGiftOnchainOffer.amount - j);
                if (j > 0) {
                    b = 0;
                    a0 = ob6.a0(null, null, 2131749511, it7.l(j), it7.l(max));
                } else {
                    b = 0;
                    a0 = ob6.a0(null, null, 2131749509, it7.l(max));
                }
                SpannableStringBuilder S2 = hl.S2(a0);
                if (j > 0) {
                    String l = it7.l(j);
                    Object[] objArr = new Object[1];
                    objArr[b] = l;
                    M0 = ob6.a0(null, null, 2131749510, objArr);
                } else {
                    M0 = ob6.M0(2131749513, null);
                }
                TL_wallet.walletOnchainGiftActionOfferCancel walletonchaingiftactionoffercancel = new TL_wallet.walletOnchainGiftActionOfferCancel();
                walletonchaingiftactionoffercancel.offer_address = tL_messageActionStarGiftOnchainOffer.offer_address;
                int i = walletonchaingiftactionoffercancel.flags;
                walletonchaingiftactionoffercancel.flags = i | 2;
                walletonchaingiftactionoffercancel.price = tL_messageActionStarGiftOnchainOffer.amount;
                walletonchaingiftactionoffercancel.refund_amount = max;
                long j2 = tL_payments_starGiftOnchainOfferTx.fine;
                if (j2 > 0) {
                    walletonchaingiftactionoffercancel.flags = i | 6;
                    walletonchaingiftactionoffercancel.fine = j2;
                }
                TL_stars.StarGift starGift = tL_messageActionStarGiftOnchainOffer.gift;
                a35Var.h = walletonchaingiftactionoffercancel;
                a35Var.i = starGift;
                final long j3 = tL_messageActionStarGiftOnchainOffer.offer_id;
                final boolean[] zArr = new boolean[1];
                vs7.j(j3, Long.MAX_VALUE);
                final vnb vnbVar = this.d;
                final Context context = this.b;
                byte b3 = b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b3, vnbVar, context);
                ps7 ps7Var = new ps7(zArr, j3, b3);
                id idVar2 = alertDialog$Builder.a;
                idVar2.setOnDismissListener(ps7Var);
                idVar2.S = ob6.M0(2131749507, null);
                idVar2.U = S2;
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                final int i2 = this.c;
                alertDialog$Builder.j(M0, new fd() { // from class: qs7
                    @Override // fd
                    public final void w(id idVar3, int i3) {
                        a35 a35Var2 = a35Var;
                        long j4 = a35Var2.b + longValue;
                        Context context2 = context;
                        int i4 = i2;
                        vnb vnbVar2 = vnbVar;
                        if (ms7.Z0(context2, i4, vnbVar2, j4, 2131749576)) {
                            l01 g = idVar3.g(i3, true, true);
                            g.d();
                            fd7 fd7Var = new fd7(new boolean[1], g, idVar3, (byte) 15);
                            zArr[0] = true;
                            HashSet hashSet = vs7.b;
                            long j5 = j3;
                            hashSet.add(Long.valueOf(j5));
                            vs7.j(j5, 300000L);
                            c.C(i4).p0(a35Var2, new dg1(j5, fd7Var, context2, i4, vnbVar2, d31Var), new p4c((Object) fd7Var, j5, (TLObject) tL_messageActionStarGiftOnchainOffer, (byte) 5), new kt(j5, fd7Var, (byte) 22));
                        }
                    }
                });
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ pq7(Context context, String[] strArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i, x35 x35Var, String str, vnb vnbVar) {
        this.b = context;
        this.e = strArr;
        this.f = tL_messages_requestUrlAuth;
        this.c = i;
        this.g = x35Var;
        this.h = str;
        this.d = vnbVar;
    }
}
