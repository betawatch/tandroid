package z3;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class a extends n3.a {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public a(int i10, long j10) {
        super(i10, 2);
        this.c = j10;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final a j(int i10) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            if (aVar.b == i10) {
                return aVar;
            }
        }
        return null;
    }

    public final b k(int i10) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) arrayList.get(i11);
            if (bVar.b == i10) {
                return bVar;
            }
        }
        return null;
    }

    @Override // n3.a
    public final String toString() {
        return n3.a.d(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
