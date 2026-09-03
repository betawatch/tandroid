package vc;

import dd.p;
import k7.q7;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import uc.h;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
            q7.b(obj);
            return obj;
        }
        this.a = 1;
        q7.b(obj);
        p pVar = this.b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.c, this);
    }
}
