package rc;

import g7.y5;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import qc.h;
import zc.p;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class c extends sc.c {
    public int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ qc.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qc.c cVar, h hVar, p pVar, qc.c cVar2) {
        super(cVar, hVar);
        this.b = pVar;
        this.c = cVar2;
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        int i9 = this.a;
        if (i9 != 0) {
            if (i9 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.a = 2;
            y5.b(obj);
            return obj;
        }
        this.a = 1;
        y5.b(obj);
        p pVar = this.b;
        i.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, pVar);
        return pVar.invoke(this.c, this);
    }
}
