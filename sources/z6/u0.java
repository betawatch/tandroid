package z6;

import com.google.android.gms.internal.cast.z4;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u0 extends c1 {
    public final m a;
    public final int b;

    public u0(x xVar) {
        xVar.getClass();
        this.a = xVar;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            m mVar = this.a;
            if (i10 >= mVar.size()) {
                break;
            }
            int a2 = ((c1) mVar.get(i10)).a();
            if (i11 < a2) {
                i11 = a2;
            }
            i10++;
        }
        int i12 = i11 + 1;
        this.b = i12;
        if (i12 > 8) {
            throw new z4("Exceeded cutoff limit for max depth of cbor value");
        }
    }

    @Override // z6.c1
    public final int a() {
        return this.b;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        int zza = c1Var.zza();
        int c3 = c1.c(Byte.MIN_VALUE);
        if (c3 != zza) {
            return c3 - c1Var.zza();
        }
        m mVar = ((u0) c1Var).a;
        m mVar2 = this.a;
        if (mVar2.size() != mVar.size()) {
            return mVar2.size() - mVar.size();
        }
        for (int i10 = 0; i10 < mVar2.size(); i10++) {
            int compareTo = ((c1) mVar2.get(i10)).compareTo((c1) mVar.get(i10));
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
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((c1) mVar.get(i10)).toString().replace("\n", "\n  "));
        }
        StringBuilder sb2 = new StringBuilder("[\n  ");
        Iterator it = arrayList.iterator();
        try {
            if (it.hasNext()) {
                sb2.append(bb.a.H3(it.next()));
                while (it.hasNext()) {
                    sb2.append((CharSequence) ",\n  ");
                    sb2.append(bb.a.H3(it.next()));
                }
            }
            sb2.append("\n]");
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // z6.c1
    public final int zza() {
        return c1.c(Byte.MIN_VALUE);
    }
}
