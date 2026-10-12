package zh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class v2 {
    public final ag.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final ag.a c;

    public v2(ag.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j10;
        this.a = bVar;
        this.b = tL_payments_paymentFormStarGift;
        n5[][] n5VarArr = n5.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i10 = 0;
            j10 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j10 += tL_labeledPrice.amount;
            }
        } else {
            j10 = 0;
        }
        ag.b bVar2 = ag.b.a;
        if (bVar == bVar2) {
            this.c = ag.a.g(j10, bVar2);
            return;
        }
        ag.b bVar3 = ag.b.b;
        if (bVar == bVar3) {
            this.c = ag.a.i(j10, bVar3);
        } else {
            this.c = ag.a.i(0L, bVar2);
        }
    }
}
