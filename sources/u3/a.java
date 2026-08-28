package u3;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a extends lc.k {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public a(int i9, long j10) {
        super(i9, 1);
        this.c = j10;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final a e(int i9) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            if (aVar.b == i9) {
                return aVar;
            }
        }
        return null;
    }

    public final b f(int i9) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) arrayList.get(i10);
            if (bVar.b == i9) {
                return bVar;
            }
        }
        return null;
    }

    @Override // lc.k
    public final String toString() {
        return lc.k.a(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
