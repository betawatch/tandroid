package wh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class z2 {
    public final /* synthetic */ r3 a;

    public z2(r3 r3Var) {
        this.a = r3Var;
    }

    public final void a(a aVar) {
        r3 r3Var = this.a;
        ArrayList arrayList = r3Var.i3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !r3.w3(aVar)) {
            return;
        }
        int O3 = r3Var.O3(indexOf);
        if (O3 >= arrayList.size()) {
            O3 = arrayList.size() - 1;
        }
        d2 d2Var = r3Var.G3;
        if (d2Var != null) {
            d2Var.d();
        }
        while (O3 >= indexOf) {
            arrayList.remove(O3);
            O3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !r3.w3(aVar3) && !r3.D3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        r3Var.V2.N(false);
        d2 d2Var2 = r3Var.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        if (aVar2 != null) {
            r3Var.post(new k2(r3Var, aVar2, 22));
        }
    }
}
