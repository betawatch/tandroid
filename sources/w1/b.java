package w1;

import a0.l;
import androidx.lifecycle.p0;
import c2.t;
import v9.d;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class b extends p0 {
    public static final d f = new d(25);
    public final l d = new l();
    public boolean e = false;

    @Override // androidx.lifecycle.p0
    public final void b() {
        l lVar = this.d;
        int i9 = lVar.c;
        for (int i10 = 0; i10 < i9; i10++) {
            a aVar = (a) lVar.b[i10];
            k5.d dVar = aVar.l;
            dVar.a();
            dVar.c = true;
            t tVar = aVar.n;
            if (tVar != null) {
                aVar.i(tVar);
            }
            a aVar2 = dVar.a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.a = null;
            if (tVar != null) {
                boolean z10 = tVar.b;
            }
            dVar.d = true;
            dVar.b = false;
            dVar.c = false;
            dVar.e = false;
        }
        int i11 = lVar.c;
        Object[] objArr = lVar.b;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        lVar.c = 0;
    }
}
