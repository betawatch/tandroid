package xh;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a3 {
    public final yf.b a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final yf.a c;

    public a3(yf.b bVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j3;
        this.a = bVar;
        this.b = tL_payments_paymentFormStarGift;
        v5[][] v5VarArr = v5.S;
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
        yf.b bVar2 = yf.b.a;
        if (bVar == bVar2) {
            this.c = yf.a.g(j3, bVar2);
            return;
        }
        yf.b bVar3 = yf.b.b;
        if (bVar == bVar3) {
            this.c = yf.a.i(j3, bVar3);
        } else {
            this.c = yf.a.i(0L, bVar2);
        }
    }
}
