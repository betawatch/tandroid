package wi;

import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class f implements r1.c {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ og.b b;

    public f(og.b bVar, ArrayList arrayList) {
        this.b = bVar;
        this.a = arrayList;
    }

    @Override // r1.c
    public final void a(r1.g gVar, boolean z10, float f10, float f11) {
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
