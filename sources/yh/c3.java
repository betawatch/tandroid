package yh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class c3 {
    public final zf.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final zf.a c;

    public c3(zf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.a = bVar;
        this.b = tL_payments_paymentFormStarGift;
        u5[][] u5VarArr = u5.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i10 = 0;
            j3 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j3 += tL_labeledPrice.amount;
            }
        } else {
            j3 = 0;
        }
        zf.b bVar2 = zf.b.a;
        if (bVar == bVar2) {
            this.c = zf.a.g(j3, bVar2);
            return;
        }
        zf.b bVar3 = zf.b.b;
        if (bVar == bVar3) {
            this.c = zf.a.i(j3, bVar3);
        } else {
            this.c = zf.a.i(0L, bVar2);
        }
    }
}
