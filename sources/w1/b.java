package w1;

import a0.n;
import androidx.lifecycle.p0;
import b2.p;
import na.d;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class b extends p0 {
    public static final d f = new d(25);
    public final n d = new n();
    public boolean e = false;

    @Override // androidx.lifecycle.p0
    public final void b() {
        n nVar = this.d;
        int i10 = nVar.c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) nVar.b[i11];
            a6.d dVar = aVar.l;
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
