package r4;

import com.google.firebase.messaging.r;
import g5.n0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class k {
    public final n0 a;
    public final r b;
    public final int[] c;
    public final int d;
    public final g5.m e;
    public final long f;
    public final n g;
    public final i[] h;
    public f5.c i;
    public s4.c j;
    public int k;
    public o4.b l;
    public boolean m;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, r4.k] */
    public k(n0 n0Var, s4.c cVar, r rVar, int i10, int[] iArr, f5.c cVar2, int i11, g5.m mVar, long j10, boolean z4, ArrayList arrayList, n nVar) {
        r3.k iVar;
        int i12;
        q4.d dVar;
        ?? obj = new Object();
        obj.a = n0Var;
        obj.j = cVar;
        obj.b = rVar;
        obj.c = iArr;
        obj.i = cVar2;
        obj.d = i11;
        obj.e = mVar;
        obj.k = i10;
        obj.f = j10;
        obj.g = nVar;
        long d = cVar.d(i10);
        ArrayList a2 = obj.a();
        obj.h = new i[cVar2.p()];
        int i13 = 0;
        int i14 = 0;
        k kVar = obj;
        while (i14 < kVar.h.length) {
            s4.m mVar2 = (s4.m) a2.get(cVar2.f(i14));
            s4.b Q = rVar.Q(mVar2.b);
            i[] iVarArr = kVar.h;
            int i15 = i14;
            Q = Q == null ? (s4.b) mVar2.b.get(i13) : Q;
            j3.n0 n0Var2 = mVar2.a;
            String str = n0Var2.B;
            if (h5.o.i(str)) {
                i12 = i15;
                dVar = null;
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    i12 = i15;
                    iVar = new x3.d(1);
                } else {
                    i12 = i15;
                    iVar = new z3.i(z4 ? 4 : 0, null, arrayList, nVar);
                }
                dVar = new q4.d(iVar, i11, n0Var2);
            }
            q4.d dVar2 = dVar;
            int i16 = i12;
            iVarArr[i16] = new i(d, mVar2, Q, dVar2, 0L, mVar2.c());
            i14 = i16 + 1;
            kVar = this;
            i13 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.j.b(this.k).c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.c) {
            arrayList.addAll(((s4.a) list.get(i10)).c);
        }
        return arrayList;
    }

    public final i b(int i10) {
        i[] iVarArr = this.h;
        i iVar = iVarArr[i10];
        s4.b Q = this.b.Q(iVar.b.b);
        if (Q == null || Q.equals(iVar.c)) {
            return iVar;
        }
        i iVar2 = new i(iVar.e, iVar.b, Q, iVar.a, iVar.f, iVar.d);
        iVarArr[i10] = iVar2;
        return iVar2;
    }
}
