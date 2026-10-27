package w1;

import a0.m;
import androidx.lifecycle.p0;
import b2.u;
import b6.d;
import u7.s;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class b extends p0 {
    public static final s f = new s(25);
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
                boolean z10 = uVar.b;
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
