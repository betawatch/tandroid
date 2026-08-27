package y6;

import com.google.android.gms.internal.cast.x4;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class z0 extends c1 {
    public final int a;
    public final r b;

    public z0(r rVar) {
        rVar.getClass();
        this.b = rVar;
        d0 p6 = rVar.entrySet().p();
        int i10 = 0;
        while (p6.hasNext()) {
            Map.Entry entry = (Map.Entry) p6.next();
            int a2 = ((c1) entry.getKey()).a();
            i10 = i10 < a2 ? a2 : i10;
            int a3 = ((c1) entry.getValue()).a();
            if (i10 < a3) {
                i10 = a3;
            }
        }
        int i11 = i10 + 1;
        this.a = i11;
        if (i11 > 8) {
            throw new x4("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // y6.c1
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c((byte) -96);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        r rVar = ((z0) c1Var).b;
        r rVar2 = this.b;
        if (rVar2.d.size() != rVar.d.size()) {
            return rVar2.d.size() - rVar.d.size();
        }
        d0 p6 = rVar2.entrySet().p();
        d0 p9 = rVar.entrySet().p();
        do {
            if (!p6.hasNext() && !p9.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) p6.next();
            Map.Entry entry2 = (Map.Entry) p9.next();
            int compareTo2 = ((c1) entry.getKey()).compareTo((c1) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((c1) entry.getValue()).compareTo((c1) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z0.class == obj.getClass()) {
            return this.b.equals(((z0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c((byte) -96)), this.b});
    }

    public final String toString() {
        r rVar = this.b;
        if (rVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d0 p6 = rVar.entrySet().p();
        while (p6.hasNext()) {
            Map.Entry entry = (Map.Entry) p6.next();
            linkedHashMap.put(((c1) entry.getKey()).toString().replace("\n", "\n  "), ((c1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        za.b bVar = new za.b(26);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), bVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e9) {
            throw new AssertionError(e9);
        }
    }

    @Override // y6.c1
    public final int zza() {
        return c1.c((byte) -96);
    }
}
