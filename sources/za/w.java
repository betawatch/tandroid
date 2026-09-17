package za;

import android.util.Log;
import v7.t7;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes.dex */
public final class w extends kd.j implements rd.q {
    public int a;
    public /* synthetic */ ce.c b;
    public /* synthetic */ Throwable c;

    @Override // rd.q
    public final Object c(Object obj, Object obj2, kd.c cVar) {
        w wVar = new w(3, cVar);
        wVar.b = (ce.c) obj;
        wVar.c = (Throwable) obj2;
        return wVar.invokeSuspend(gd.i.a);
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
