package z6;

import ae.k;
import android.support.v4.media.session.a0;
import android.util.Log;
import b8.ib;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import hd.j;
import java.util.Iterator;
import java.util.LinkedList;
import m.o3;
import od.p;
import org.telegram.tgnet.TLObject;
import z9.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c implements SuccessContinuation, zd.b {
    public final Object a;

    public /* synthetic */ c(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [hd.j, od.p] */
    @Override // zd.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object U(zd.c cVar, hd.c cVar2) {
        zd.a aVar;
        int i3;
        Throwable th2;
        k kVar;
        if (cVar2 instanceof zd.a) {
            aVar = (zd.a) cVar2;
            int i10 = aVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                aVar.d = i10 - TLObject.FLAG_31;
                Object obj = aVar.b;
                gd.a aVar2 = gd.a.a;
                i3 = aVar.d;
                dd.k kVar2 = dd.k.a;
                if (i3 != 0) {
                    ib.b(obj);
                    k kVar3 = new k(cVar, aVar.getContext());
                    try {
                        aVar.a = kVar3;
                        aVar.d = 1;
                        Object invoke = ((j) this.a).invoke(kVar3, aVar);
                        if (invoke != aVar2) {
                            invoke = kVar2;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        kVar = kVar3;
                    } catch (Throwable th3) {
                        th2 = th3;
                        kVar = kVar3;
                        kVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kVar = aVar.a;
                    try {
                        ib.b(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        kVar.releaseIntercepted();
                        throw th2;
                    }
                }
                kVar.releaseIntercepted();
                return kVar2;
            }
        }
        aVar = new zd.a(this, cVar2);
        Object obj2 = aVar.b;
        gd.a aVar22 = gd.a.a;
        i3 = aVar.d;
        dd.k kVar22 = dd.k.a;
        if (i3 != 0) {
        }
        kVar.releaseIntercepted();
        return kVar22;
    }

    public void a(a0 a0Var) {
        o3 o3Var = (o3) this.a;
        o3Var.b = a0Var;
        Iterator it = ((LinkedList) o3Var.c).iterator();
        while (it.hasNext()) {
            ((d) it.next()).b();
        }
        ((LinkedList) o3Var.c).clear();
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ha.b bVar = (ha.b) obj;
        m mVar = ((z9.k) this.a).e;
        if (bVar != null) {
            return Tasks.whenAll((Task<?>[]) new Task[]{m.b(mVar), mVar.m.h(null, mVar.e.a)});
        }
        Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
        return Tasks.forResult(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar) {
        this.a = (j) pVar;
    }

    public c(z9.k kVar, String str) {
        this.a = kVar;
    }
}
