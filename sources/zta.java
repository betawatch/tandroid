// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zta {
    public final pj a;
    public final TLRPC.TL_payments_paymentFormStarGift b;
    public final oj c;

    public zta(pj pjVar, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        long j;
        this.a = pjVar;
        this.b = tL_payments_paymentFormStarGift;
        jxa[][] jxaVarArr = jxa.S;
        if (tL_payments_paymentFormStarGift != null) {
            ArrayList<TLRPC.TL_labeledPrice> arrayList = tL_payments_paymentFormStarGift.invoice.prices;
            int size = arrayList.size();
            int i = 0;
            j = 0;
            while (i < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i);
                i++;
                j += tL_labeledPrice.amount;
            }
        } else {
            j = 0;
        }
        pj pjVar2 = pj.a;
        if (pjVar == pjVar2) {
            this.c = oj.h(j, pjVar2);
            return;
        }
        pj pjVar3 = pj.b;
        if (pjVar == pjVar3) {
            this.c = oj.j(j, pjVar3);
        } else {
            this.c = oj.j(0L, pjVar2);
        }
    }
}
