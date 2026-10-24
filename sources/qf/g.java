package qf;

import java.util.ArrayList;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
