package u3;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a extends mc.k {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public a(int i10, long j10) {
        super(i10, 1);
        this.c = j10;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final a e(int i10) {
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

    public final b f(int i10) {
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

    @Override // mc.k
    public final String toString() {
        return mc.k.a(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
