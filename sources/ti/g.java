package ti;

import java.util.ArrayList;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final class g implements r1.c {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ og.b b;

    public g(og.b bVar, ArrayList arrayList) {
        this.b = bVar;
        this.a = arrayList;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z9, float f10, float f11) {
        ArrayList arrayList = gVar.k;
        int indexOf = arrayList.indexOf(this);
        if (indexOf >= 0) {
            arrayList.set(indexOf, null);
        }
        ArrayList arrayList2 = this.a;
        arrayList2.add(gVar);
        if (arrayList2.size() == 2) {
            this.b.b();
        }
    }
}
