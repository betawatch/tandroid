package q5;

import android.util.Log;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class k implements o {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ n c;

    public /* synthetic */ k(n nVar, o oVar, int i9) {
        this.a = i9;
        this.c = nVar;
        this.b = oVar;
    }

    @Override // q5.o
    public final void b(String str, long j10, long j11, long j12) {
        switch (this.a) {
            case 0:
                o oVar = this.b;
                if (oVar != null) {
                    oVar.b(str, j10, j11, j12);
                    break;
                }
                break;
            default:
                o oVar2 = this.b;
                if (oVar2 != null) {
                    oVar2.b(str, j10, j11, j12);
                    break;
                }
                break;
        }
    }

    @Override // q5.o
    public final void p(String str, long j10, int i9, Object obj, long j11, long j12) {
        int i10;
        int i11 = this.a;
        n nVar = this.c;
        switch (i11) {
            case 0:
                nVar.g = null;
                o oVar = this.b;
                if (oVar != null) {
                    oVar.p(str, j10, i9, obj, j11, j12);
                    break;
                }
                break;
            default:
                if (this.b != null) {
                    if (i9 == 2001) {
                        Object[] objArr = {Integer.valueOf(nVar.i)};
                        b bVar = nVar.a;
                        Log.w(bVar.a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                        Iterator it = ((o5.h) nVar.h.b).i.iterator();
                        while (it.hasNext()) {
                            ((o5.g) it.next()).o();
                        }
                        i10 = 2001;
                    } else {
                        i10 = i9;
                    }
                    this.b.p(str, j10, i10, obj, j11, j12);
                    break;
                }
                break;
        }
    }
}
