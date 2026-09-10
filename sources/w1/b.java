package w1;

import a0.m;
import a6.d;
import androidx.lifecycle.p0;
import b2.p;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public class b extends p0 {
    public static final qb.b f = new qb.b(24);
    public final m d = new m();
    public boolean e = false;

    @Override // androidx.lifecycle.p0
    public final void b() {
        m mVar = this.d;
        int i10 = mVar.c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) mVar.b[i11];
            d dVar = aVar.l;
            dVar.a();
            dVar.c = true;
            p pVar = aVar.n;
            if (pVar != null) {
                aVar.i(pVar);
            }
            a aVar2 = dVar.a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.a = null;
            if (pVar != null) {
                boolean z10 = pVar.b;
            }
            dVar.d = true;
            dVar.b = false;
            dVar.c = false;
            dVar.e = false;
        }
        int i12 = mVar.c;
        Object[] objArr = mVar.b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        mVar.c = 0;
    }
}
