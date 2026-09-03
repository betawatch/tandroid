package vc;

import dd.p;
import k7.p7;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import uc.h;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class c extends wc.c {
    public int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ uc.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(uc.c cVar, h hVar, p pVar, uc.c cVar2) {
        super(cVar, hVar);
        this.b = pVar;
        this.c = cVar2;
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.a = 2;
            p7.b(obj);
            return obj;
        }
        this.a = 1;
        p7.b(obj);
        p pVar = this.b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.c, this);
    }
}
