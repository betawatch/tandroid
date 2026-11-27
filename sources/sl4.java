// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class sl4 implements ps3 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ m33 b;

    public sl4(m33 m33Var, ArrayList arrayList) {
        this.b = m33Var;
        this.a = arrayList;
    }

    @Override // ps3
    public final void a(vpa vpaVar, boolean z, float f, float f2) {
        ArrayList arrayList = vpaVar.k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.a;
        arrayList2.add(vpaVar);
        if (arrayList2.size() == 2) {
            this.b.b();
        }
    }
}
