package tc;

import bd.p;
import i7.c7;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import sc.h;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c extends uc.c {
    public int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ sc.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(sc.c cVar, h hVar, p pVar, sc.c cVar2) {
        super(cVar, hVar);
        this.b = pVar;
        this.c = cVar2;
    }

    @Override // uc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.a = 2;
            c7.b(obj);
            return obj;
        }
        this.a = 1;
        c7.b(obj);
        p pVar = this.b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.c, this);
    }
}
