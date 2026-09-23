package za;

import android.util.Log;
import v7.t7;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class y extends kd.j implements rd.q {
    public int a;
    public /* synthetic */ ce.c b;
    public /* synthetic */ Throwable c;

    @Override // rd.q
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        y yVar = new y(3, cVar);
        yVar.b = (ce.c) obj;
        yVar.c = (Throwable) obj2;
        return yVar.invokeSuspend(gd.i.a);
    }

    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        jd.a aVar = jd.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            t7.b(obj);
            ce.c cVar = this.b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.c);
            n1.b bVar = new n1.b(true);
            this.b = null;
            this.a = 1;
            if (cVar.a(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t7.b(obj);
        }
        return gd.i.a;
    }
}
