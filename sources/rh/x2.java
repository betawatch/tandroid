package rh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class x2 {
    public final /* synthetic */ p3 a;

    public x2(p3 p3Var) {
        this.a = p3Var;
    }

    public final void a(a aVar) {
        p3 p3Var = this.a;
        ArrayList arrayList = p3Var.h3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !p3.x3(aVar)) {
            return;
        }
        int P3 = p3Var.P3(indexOf);
        if (P3 >= arrayList.size()) {
            P3 = arrayList.size() - 1;
        }
        b2 b2Var = p3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        while (P3 >= indexOf) {
            arrayList.remove(P3);
            P3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !p3.x3(aVar3) && !p3.E3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        p3Var.U2.N(false);
        b2 b2Var2 = p3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        if (aVar2 != null) {
            p3Var.post(new i2(p3Var, aVar2, 22));
        }
    }
}
