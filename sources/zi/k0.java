package zi;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.Iterator;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class k0 implements j6.n {
    public final /* synthetic */ Object a;

    public /* synthetic */ k0(Object obj) {
        this.a = obj;
    }

    @Override // j6.n
    public void g(String str, long j3, long j10, long j11) {
        h6.o oVar = (h6.o) this.a;
        try {
            oVar.a(new h6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e10) {
            j6.b bVar = h6.h.k;
            Log.e(bVar.a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e10);
        }
        Iterator it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((h6.g) it.next()).h(str, j3, 2103, j10, j11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004d A[LOOP:0: B:16:0x0047->B:18:0x004d, LOOP_END] */
    @Override // j6.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void j(String str, long j3, int i7, Object obj, long j10, long j11) {
        int i10;
        Iterator it;
        h6.o oVar = (h6.o) this.a;
        try {
            i10 = i7;
            try {
                Status status = new Status(i10, null, null, null);
                Object obj2 = true == (obj instanceof j6.l) ? obj : null;
                if (obj2 != null) {
                }
                if (obj2 != null) {
                }
                oVar.a(new h6.n(status, 2));
            } catch (IllegalStateException e10) {
                e = e10;
                j6.b bVar = h6.h.k;
                Log.e(bVar.a, bVar.d("Result already set when calling onRequestCompleted", new Object[0]), e);
                it = oVar.q.i.iterator();
                while (it.hasNext()) {
                }
            }
        } catch (IllegalStateException e11) {
            e = e11;
            i10 = i7;
        }
        it = oVar.q.i.iterator();
        while (it.hasNext()) {
            ((h6.g) it.next()).h(str, j3, i10, j10, j11);
            i10 = i7;
        }
    }
}
