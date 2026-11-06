package z1;

import a0.m;
import androidx.lifecycle.p0;
import ca.i;
import d6.d;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class b extends p0 {
    public static final pb.b f = new pb.b(29);
    public final m d = new m();
    public boolean e = false;

    @Override // androidx.lifecycle.p0
    public final void b() {
        m mVar = this.d;
        int i7 = mVar.c;
        for (int i10 = 0; i10 < i7; i10++) {
            a aVar = (a) mVar.b[i10];
            d dVar = aVar.l;
            dVar.a();
            dVar.c = true;
            i iVar = aVar.n;
            if (iVar != null) {
                aVar.i(iVar);
            }
            a aVar2 = dVar.a;
            if (aVar2 == null) {
                throw new IllegalStateException("No listener register");
            }
            if (aVar2 != aVar) {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
            dVar.a = null;
            if (iVar != null) {
                boolean z9 = iVar.b;
            }
            dVar.d = true;
            dVar.b = false;
            dVar.c = false;
            dVar.e = false;
        }
        int i11 = mVar.c;
        Object[] objArr = mVar.b;
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        mVar.c = 0;
    }
}
