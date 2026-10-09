package za;

import android.util.Log;
import v7.a8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class x extends ld.j implements sd.q {
    public int a;
    public /* synthetic */ de.c b;
    public /* synthetic */ Throwable c;

    @Override // sd.q
    public final Object c(Object obj, Object obj2, ld.c cVar) {
        x xVar = new x(3, cVar);
        xVar.b = (de.c) obj;
        xVar.c = (Throwable) obj2;
        return xVar.invokeSuspend(hd.i.a);
    }

    @Override // ld.a
    public final Object invokeSuspend(Object obj) {
        kd.a aVar = kd.a.a;
        int i10 = this.a;
        if (i10 == 0) {
            a8.b(obj);
            de.c cVar = this.b;
            Log.e("FirebaseSessionsRepo", "Error reading stored session data.", this.c);
            n1.b bVar = new n1.b(true);
            this.b = null;
            this.a = 1;
            if (cVar.b(bVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a8.b(obj);
        }
        return hd.i.a;
    }
}
