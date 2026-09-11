package zd;

import v7.t7;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class q1 extends kd.i implements rd.p {
    public v1 b;
    public q c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ u1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(id.c cVar, u1 u1Var) {
        super(cVar);
        this.f = u1Var;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        q1 q1Var = new q1(cVar, this.f);
        q1Var.e = obj;
        return q1Var;
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((wd.c) obj, (id.c) obj2)).invokeSuspend(gd.i.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0062 -> B:6:0x0076). Please report as a decompilation issue!!! */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v1 c10;
        v1 v1Var;
        ee.k kVar;
        wd.c cVar;
        jd.a aVar = jd.a.a;
        int i10 = this.d;
        if (i10 == 0) {
            t7.b(obj);
            wd.c cVar2 = (wd.c) this.e;
            Object u10 = this.f.u();
            if (u10 instanceof q) {
                r rVar = ((q) u10).e;
                this.d = 1;
                cVar2.c(rVar, this);
                return aVar;
            }
            if ((u10 instanceof a1) && (c10 = ((a1) u10).c()) != null) {
                Object f7 = c10.f();
                kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                ee.k kVar2 = (ee.k) f7;
                v1Var = c10;
                kVar = kVar2;
                cVar = cVar2;
                if (!kVar.equals(v1Var)) {
                }
            }
        } else if (i10 == 1) {
            t7.b(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.c;
            v1Var = this.b;
            cVar = (wd.c) this.e;
            t7.b(obj);
            kVar = kVar.g();
            if (!kVar.equals(v1Var)) {
                if (kVar instanceof q) {
                    q qVar = (q) kVar;
                    r rVar2 = qVar.e;
                    this.e = cVar;
                    this.b = v1Var;
                    this.c = qVar;
                    this.d = 2;
                    cVar.c(rVar2, this);
                    jd.a aVar2 = jd.a.a;
                    return aVar;
                }
                kVar = kVar.g();
                if (!kVar.equals(v1Var)) {
                }
            }
        }
        return gd.i.a;
    }
}
