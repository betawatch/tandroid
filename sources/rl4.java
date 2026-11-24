// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class rl4 implements ht3 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ f43 b;

    public rl4(f43 f43Var, ArrayList arrayList) {
        this.b = f43Var;
        this.a = arrayList;
    }

    @Override // ht3
    public final void a(zna znaVar, boolean z, float f, float f2) {
        ArrayList arrayList = znaVar.k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.a;
        arrayList2.add(znaVar);
        if (arrayList2.size() == 2) {
            this.b.b();
        }
    }
}
