package u5;

import android.util.Log;
import java.util.Iterator;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class k implements o {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ n c;

    public /* synthetic */ k(n nVar, o oVar, int i10) {
        this.a = i10;
        this.c = nVar;
        this.b = oVar;
    }

    @Override // u5.o
    public final void m(String str, long j10, long j11, long j12) {
        switch (this.a) {
            case 0:
                o oVar = this.b;
                if (oVar != null) {
                    oVar.m(str, j10, j11, j12);
                    break;
                }
                break;
            default:
                o oVar2 = this.b;
                if (oVar2 != null) {
                    oVar2.m(str, j10, j11, j12);
                    break;
                }
                break;
        }
    }

    @Override // u5.o
    public final void n(String str, long j10, int i10, Object obj, long j11, long j12) {
        int i11;
        int i12 = this.a;
        n nVar = this.c;
        switch (i12) {
            case 0:
                nVar.g = null;
                o oVar = this.b;
                if (oVar != null) {
                    oVar.n(str, j10, i10, obj, j11, j12);
                    break;
                }
                break;
            default:
                if (this.b != null) {
                    if (i10 == 2001) {
                        Object[] objArr = {Integer.valueOf(nVar.i)};
                        b bVar = nVar.a;
                        Log.w(bVar.a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                        Iterator it = ((s5.h) nVar.h.b).i.iterator();
                        while (it.hasNext()) {
                            ((s5.g) it.next()).o();
                        }
                        i11 = 2001;
                    } else {
                        i11 = i10;
                    }
                    this.b.n(str, j10, i11, obj, j11, j12);
                    break;
                }
                break;
        }
    }
}
