package vh;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class a3 {
    public final /* synthetic */ s3 a;

    public a3(s3 s3Var) {
        this.a = s3Var;
    }

    public final void a(a aVar) {
        s3 s3Var = this.a;
        ArrayList arrayList = s3Var.i3;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf < 0 || !s3.w3(aVar)) {
            return;
        }
        int O3 = s3Var.O3(indexOf);
        if (O3 >= arrayList.size()) {
            O3 = arrayList.size() - 1;
        }
        d2 d2Var = s3Var.G3;
        if (d2Var != null) {
            d2Var.d();
        }
        while (O3 >= indexOf) {
            arrayList.remove(O3);
            O3--;
        }
        a aVar2 = null;
        a aVar3 = indexOf > 0 ? (a) arrayList.get(indexOf - 1) : null;
        if (aVar3 != null && !aVar3.i && !s3.w3(aVar3) && !s3.D3(aVar3.b)) {
            aVar2 = aVar3;
        }
        if (arrayList.isEmpty()) {
            aVar2 = new a(new TL_iv.pageBlockParagraph(), 0, 0);
            arrayList.add(aVar2);
        }
        s3Var.V2.N(false);
        d2 d2Var2 = s3Var.G3;
        if (d2Var2 != null) {
            d2Var2.h();
        }
        if (aVar2 != null) {
            s3Var.post(new k2(s3Var, aVar2, 22));
        }
    }
}
