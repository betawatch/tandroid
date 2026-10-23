package qf;

import java.util.ArrayList;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
