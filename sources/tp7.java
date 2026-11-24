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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tp7 implements qac {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Context b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ylb d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ TLObject f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ tp7(Context context, int i, TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer, TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx, w25 w25Var, ylb ylbVar, c41 c41Var) {
        this.b = context;
        this.c = i;
        this.e = tL_messageActionStarGiftOnchainOffer;
        this.f = tL_payments_starGiftOnchainOfferTx;
        this.g = w25Var;
        this.d = ylbVar;
        this.h = c41Var;
    }

    @Override // qac
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
                he heVar = new he(3, null, this.b);
                heVar.q(200L);
                TLRPC.TL_messages_checkUrlAuthMatchCode tL_messages_checkUrlAuthMatchCode = new TLRPC.TL_messages_checkUrlAuthMatchCode();
                ((String[]) obj4)[0] = str;
                tL_messages_checkUrlAuthMatchCode.match_code = str;
                tL_messages_checkUrlAuthMatchCode.url = ((TLRPC.TL_messages_requestUrlAuth) tLObject).url;
                ConnectionsManager.getInstance(this.c).sendRequestTyped(tL_messages_checkUrlAuthMatchCode, new kc((byte) 0), new nv0(heVar, (r35) obj3, (String) obj2, this.d, (byte) 13));
                break;
            default:
                final TLRPC.TL_messageActionStarGiftOnchainOffer tL_messageActionStarGiftOnchainOffer = (TLRPC.TL_messageActionStarGiftOnchainOffer) obj4;
                TL_stars.TL_payments_starGiftOnchainOfferTx tL_payments_starGiftOnchainOfferTx = (TL_stars.TL_payments_starGiftOnchainOfferTx) tLObject;
                final w25 w25Var = (w25) obj3;
                final c41 c41Var = (c41) obj2;
                final long longValue = ((Long) obj).longValue();
                long j = tL_payments_starGiftOnchainOfferTx.fine;
                if (j <= 0) {
                    j = 0;
                }
                long max = Math.max(0L, tL_messageActionStarGiftOnchainOffer.amount - j);
                if (j > 0) {
                    b = 0;
                    a0 = jb6.a0(null, null, 2131749499, fs7.k(j), fs7.k(max));
                } else {
                    b = 0;
                    a0 = jb6.a0(null, null, 2131749497, fs7.k(max));
                }
                SpannableStringBuilder S2 = gm.S2(a0);
                if (j > 0) {
                    String k = fs7.k(j);
                    Object[] objArr = new Object[1];
                    objArr[b] = k;
                    M0 = jb6.a0(null, null, 2131749498, objArr);
                } else {
                    M0 = jb6.M0(2131749501, null);
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
                w25Var.h = walletonchaingiftactionoffercancel;
                w25Var.i = starGift;
                final long j3 = tL_messageActionStarGiftOnchainOffer.offer_id;
                final boolean[] zArr = new boolean[1];
                yr7.j(j3, Long.MAX_VALUE);
                final ylb ylbVar = this.d;
                final Context context = this.b;
                byte b3 = b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(b3, ylbVar, context);
                sr7 sr7Var = new sr7(zArr, j3, b3);
                he heVar2 = alertDialog$Builder.a;
                heVar2.setOnDismissListener(sr7Var);
                heVar2.S = jb6.M0(2131749495, null);
                heVar2.U = S2;
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                final int i2 = this.c;
                alertDialog$Builder.j(M0, new ee() { // from class: tr7
                    @Override // ee
                    public final void r(he heVar3, int i3) {
                        w25 w25Var2 = w25Var;
                        long j4 = w25Var2.b + longValue;
                        Context context2 = context;
                        int i4 = i2;
                        ylb ylbVar2 = ylbVar;
                        if (pr7.Y0(context2, i4, ylbVar2, j4, 2131749564)) {
                            k11 g = heVar3.g(i3, true, true);
                            g.d();
                            ud7 ud7Var = new ud7(new boolean[1], g, heVar3, (byte) 10);
                            zArr[0] = true;
                            HashSet hashSet = yr7.b;
                            long j5 = j3;
                            hashSet.add(Long.valueOf(j5));
                            yr7.j(j5, 300000L);
                            c.C(i4).n0(w25Var2, new ah1(j5, ud7Var, context2, i4, ylbVar2, c41Var), new p2c((Object) ud7Var, j5, (TLObject) tL_messageActionStarGiftOnchainOffer, (byte) 5), new fu(j5, ud7Var, (byte) 22));
                        }
                    }
                });
                alertDialog$Builder.o();
                break;
        }
    }

    public /* synthetic */ tp7(Context context, String[] strArr, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, int i, r35 r35Var, String str, ylb ylbVar) {
        this.b = context;
        this.e = strArr;
        this.f = tL_messages_requestUrlAuth;
        this.c = i;
        this.g = r35Var;
        this.h = str;
        this.d = ylbVar;
    }
}
