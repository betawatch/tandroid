package w1;

import a0.n;
import a6.d;
import androidx.lifecycle.p0;
import b2.p;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public class b extends p0 {
    public static final qb.b f = new qb.b(24);
    public final n d = new n();
    public boolean e = false;

    @Override // androidx.lifecycle.p0
    public final void b() {
        n nVar = this.d;
        int i10 = nVar.c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) nVar.b[i11];
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
        int i12 = nVar.c;
        Object[] objArr = nVar.b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        nVar.c = 0;
    }
}
