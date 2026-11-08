package q7;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class u0 extends c1 {
    public final m a;
    public final int b;

    public u0(x xVar) {
        xVar.getClass();
        this.a = xVar;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            m mVar = this.a;
            if (i7 >= mVar.size()) {
                break;
            }
            int a10 = ((c1) mVar.get(i7)).a();
            if (i10 < a10) {
                i10 = a10;
            }
            i7++;
        }
        int i11 = i10 + 1;
        this.b = i11;
        if (i11 > 8) {
            throw new androidx.datastore.preferences.protobuf.l("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // q7.c1
    public final int a() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c10 = c1.c(Byte.MIN_VALUE);
        if (c10 != zza) {
            return c10 - c1Var.zza();
        }
        m mVar = ((u0) c1Var).a;
        m mVar2 = this.a;
        if (mVar2.size() != mVar.size()) {
            return mVar2.size() - mVar.size();
        }
        for (int i7 = 0; i7 < mVar2.size(); i7++) {
            int compareTo = ((c1) mVar2.get(i7)).compareTo((c1) mVar.get(i7));
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
        if (obj != null && u0.class == obj.getClass()) {
            return this.a.equals(((u0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(c1.c(Byte.MIN_VALUE)), this.a});
    }

    public final String toString() {
        m mVar = this.a;
        if (mVar.isEmpty()) {
            return "[]";
        }
        ArrayList arrayList = new ArrayList();
        int size = mVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((c1) mVar.get(i7)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(nb.a.t0(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(nb.a.t0(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // q7.c1
    public final int zza() {
        return c1.c(Byte.MIN_VALUE);
    }
}
