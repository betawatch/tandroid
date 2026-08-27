package sc;

import ad.p;
import h7.k6;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.t;
import tc.g;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends g {
    public int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ rc.c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p pVar, rc.c cVar, rc.c cVar2) {
        super(cVar);
        this.b = pVar;
        this.c = cVar2;
    }

    @Override // tc.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.a = 2;
            k6.b(obj);
            return obj;
        }
        this.a = 1;
        k6.b(obj);
        p pVar = this.b;
        j.c(pVar, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        t.a(2, pVar);
        return pVar.invoke(this.c, this);
    }
}
