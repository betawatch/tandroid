// default package

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class uje extends jke {
    public final int a;
    public final eod b;

    public uje(eod eodVar) {
        eodVar.getClass();
        this.b = eodVar;
        v9c u = eodVar.entrySet().u();
        int i = 0;
        while (u.hasNext()) {
            Map.Entry entry = (Map.Entry) u.next();
            int a = ((jke) entry.getKey()).a();
            i = i < a ? a : i;
            int a2 = ((jke) entry.getValue()).a();
            if (i < a2) {
                i = a2;
            }
        }
        int i2 = i + 1;
        this.a = i2;
        if (i2 > 8) {
            throw new wk2("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // jke
    public final int a() {
        return this.a;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        int compareTo;
        jke jkeVar = (jke) obj;
        int zza = jkeVar.zza();
        int c = jke.c((byte) -96);
        if (c != zza) {
            return c - jkeVar.zza();
        }
        eod eodVar = ((uje) jkeVar).b;
        eod eodVar2 = this.b;
        if (eodVar2.d.size() != eodVar.d.size()) {
            return eodVar2.d.size() - eodVar.d.size();
        }
        v9c u = eodVar2.entrySet().u();
        v9c u2 = eodVar.entrySet().u();
        do {
            if (!u.hasNext() && !u2.hasNext()) {
                return 0;
            }
            Map.Entry entry = (Map.Entry) u.next();
            Map.Entry entry2 = (Map.Entry) u2.next();
            int compareTo2 = ((jke) entry.getKey()).compareTo((jke) entry2.getKey());
            if (compareTo2 != 0) {
                return compareTo2;
            }
            compareTo = ((jke) entry.getValue()).compareTo((jke) entry2.getValue());
        } while (compareTo == 0);
        return compareTo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uje.class == obj.getClass()) {
            return this.b.equals(((uje) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(jke.c((byte) -96)), this.b});
    }

    public final String toString() {
        eod eodVar = this.b;
        if (eodVar.isEmpty()) {
            return "{}";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        v9c u = eodVar.entrySet().u();
        while (u.hasNext()) {
            Map.Entry entry = (Map.Entry) u.next();
            linkedHashMap.put(((jke) entry.getKey()).toString().replace("\n", "\n  "), ((jke) entry.getValue()).toString().replace("\n", "\n  "));
        }
        ahd ahdVar = new ahd();
        StringBuilder sb = new StringBuilder("{\n  ");
        try {
            j4f.a(sb, linkedHashMap.entrySet().iterator(), ahdVar);
            sb.append("\n}");
            return sb.toString();
        } catch (IOException e) {
            hz6.e(e);
            return null;
        }
    }

    @Override // jke
    public final int zza() {
        return jke.c((byte) -96);
    }
}
