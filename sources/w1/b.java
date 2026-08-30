package w1;

import a0.l;
import androidx.lifecycle.p0;
import c2.u;
import z9.d;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public class b extends p0 {
    public static final d f = new d(24);
    public final l d = new l();
    public boolean e = false;

    @Override // androidx.lifecycle.p0
    public final void b() {
        l lVar = this.d;
        int i10 = lVar.c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) lVar.b[i11];
            o5.d dVar = aVar.l;
            dVar.a();
            dVar.c = true;
            u uVar = aVar.n;
            if (uVar != null) {
                aVar.i(uVar);
            }
            a aVar2 = dVar.a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.a = null;
            if (uVar != null) {
                boolean z4 = uVar.b;
            }
            dVar.d = true;
            dVar.b = false;
            dVar.c = false;
            dVar.e = false;
        }
        int i12 = lVar.c;
        Object[] objArr = lVar.b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        lVar.c = 0;
    }
}
