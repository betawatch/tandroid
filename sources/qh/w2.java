package qh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class w2 {
    public final /* synthetic */ o3 a;

    public w2(o3 o3Var) {
        this.a = o3Var;
    }

    public final void a(a aVar) {
        o3 o3Var = this.a;
        ArrayList arrayList = o3Var.h3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !o3.x3(aVar)) {
            return;
        }
        int P3 = o3Var.P3(indexOf);
        if (P3 >= arrayList.size()) {
            P3 = arrayList.size() - 1;
        }
        b2 b2Var = o3Var.F3;
        if (b2Var != null) {
            b2Var.d();
        }
        while (P3 >= indexOf) {
            arrayList.remove(P3);
            P3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !o3.x3(aVar3) && !o3.E3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        o3Var.U2.N(false);
        b2 b2Var2 = o3Var.F3;
        if (b2Var2 != null) {
            b2Var2.h();
        }
        if (aVar2 != null) {
            o3Var.post(new i2(o3Var, aVar2, 22));
        }
    }
}
