package w1;

import a0.l;
import androidx.lifecycle.p0;
import h7.u;
import o5.d;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class b extends p0 {
    public static final u f = new u(24);
    public final l d = new l();
    public boolean e = false;

    @Override // androidx.lifecycle.p0
    public final void b() {
        l lVar = this.d;
        int i10 = lVar.c;
        for (int i11 = 0; i11 < i10; i11++) {
            a aVar = (a) lVar.b[i11];
            d dVar = aVar.l;
            dVar.a();
            dVar.c = true;
            c2.u uVar = aVar.n;
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
