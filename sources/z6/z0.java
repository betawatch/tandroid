package z6;

import com.google.android.gms.internal.cast.z4;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z0 extends c1 {
    public final int a;
    public final r b;

    public z0(r rVar) {
        rVar.getClass();
        this.b = rVar;
        d0 p10 = rVar.entrySet().p();
        int i10 = 0;
        while (p10.hasNext()) {
            Map.Entry entry = (Map.Entry) p10.next();
            int a2 = ((c1) entry.getKey()).a();
            i10 = i10 < a2 ? a2 : i10;
            int a10 = ((c1) entry.getValue()).a();
            if (i10 < a10) {
                i10 = a10;
            }
        }
        int i11 = i10 + 1;
        this.a = i11;
        if (i11 > 8) {
            throw new z4("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // z6.c1
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c3 = c1.c((byte) -96);
        if (c3 != zza) {
            return c3 - c1Var.zza();
        }
        r rVar = ((z0) c1Var).b;
        r rVar2 = this.b;
        if (rVar2.d.size() != rVar.d.size()) {
            return rVar2.d.size() - rVar.d.size();
        }
        d0 p10 = rVar2.entrySet().p();
        d0 p11 = rVar.entrySet().p();
        do {
            if (!p10.hasNext() && !p11.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) p10.next();
            Map.Entry entry2 = (Map.Entry) p11.next();
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
        d0 p10 = rVar.entrySet().p();
        while (p10.hasNext()) {
            Map.Entry entry = (Map.Entry) p10.next();
            linkedHashMap.put(((c1) entry.getKey()).toString().replace("\n", "\n  "), ((c1) entry.getValue()).toString().replace("\n", "\n  "));
        }
        bb.a aVar = new bb.a(27);
        StringBuilder sb2 = new StringBuilder("{\n  ");
        try {
            a.g(sb2, linkedHashMap.entrySet().iterator(), aVar);
            sb2.append("\n}");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // z6.c1
    public final int zza() {
        return c1.c((byte) -96);
    }
}
