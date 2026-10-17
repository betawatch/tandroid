package w1;

import a0.m;
import a6.d;
import androidx.lifecycle.p0;
import b2.t;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public class b extends p0 {
    public static final sb.a f = new sb.a(25);
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
        int i12 = mVar.c;
        Object[] objArr = mVar.b;
        for (int i13 = 0; i13 < i12; i13++) {
            objArr[i13] = null;
        }
        mVar.c = 0;
    }
}
