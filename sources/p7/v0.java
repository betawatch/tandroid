package p7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v0 extends d1 {
    public final n a;
    public final int b;

    public v0(y yVar) {
        yVar.getClass();
        this.a = yVar;
        int i3 = 0;
        int i10 = 0;
        while (true) {
            n nVar = this.a;
            if (i3 >= nVar.size()) {
                break;
            }
            int a10 = ((d1) nVar.get(i3)).a();
            if (i10 < a10) {
                i10 = a10;
            }
            i3++;
        }
        int i11 = i10 + 1;
        this.b = i11;
        if (i11 > 8) {
            throw new androidx.datastore.preferences.protobuf.l("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // p7.d1
    public final int a() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        d1 d1Var = (d1) obj;
        int zza = d1Var.zza();
        int c2 = d1.c(Byte.MIN_VALUE);
        if (c2 != zza) {
            return c2 - d1Var.zza();
        }
        n nVar = ((v0) d1Var).a;
        n nVar2 = this.a;
        if (nVar2.size() != nVar.size()) {
            return nVar2.size() - nVar.size();
        }
        for (int i3 = 0; i3 < nVar2.size(); i3++) {
            int compareTo = ((d1) nVar2.get(i3)).compareTo((d1) nVar.get(i3));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v0.class == obj.getClass()) {
            return this.a.equals(((v0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(d1.c(Byte.MIN_VALUE)), this.a});
    }

    public final String toString() {
        n nVar = this.a;
        if (nVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = nVar.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList.add(((d1) nVar.get(i3)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(nb.a.D(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(nb.a.D(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // p7.d1
    public final int zza() {
        return d1.c(Byte.MIN_VALUE);
    }
}
