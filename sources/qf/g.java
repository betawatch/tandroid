package qf;

import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class g {
    public final ArrayList a;

    public g(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final f a(int i10) {
        return (f) this.a.get(i10);
    }

    public g(f fVar) {
        ArrayList arrayList = new ArrayList(1);
        this.a = arrayList;
        arrayList.add(fVar);
    }
}
