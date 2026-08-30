package vh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        if (indexOf < 0 || !r3.x3(aVar)) {
            return;
        }
        int P3 = r3Var.P3(indexOf);
        if (P3 >= arrayList.size()) {
            P3 = arrayList.size() - 1;
        }
        c2 c2Var = r3Var.G3;
        if (c2Var != null) {
            c2Var.d();
        }
        while (P3 >= indexOf) {
            arrayList.remove(P3);
            P3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !r3.x3(aVar3) && !r3.E3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        r3Var.V2.N(false);
        c2 c2Var2 = r3Var.G3;
        if (c2Var2 != null) {
            c2Var2.h();
        }
        if (aVar2 != null) {
            r3Var.post(new j2(r3Var, aVar2, 22));
        }
    }
}
