// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
