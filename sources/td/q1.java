package td;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q1 extends ed.i implements ld.p {
    public v1 b;
    public q c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ u1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(cd.c cVar, u1 u1Var) {
        super(cVar);
        this.f = u1Var;
    }

    @Override // ed.a
    public final cd.c create(Object obj, cd.c cVar) {
        q1 q1Var = new q1(cVar, this.f);
        q1Var.e = obj;
        return q1Var;
    }

    @Override // ld.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q1) create((qd.c) obj, (cd.c) obj2)).invokeSuspend(ad.j.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0062 -> B:6:0x0076). Please report as a decompilation issue!!! */
    @Override // ed.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        v1 c10;
        v1 v1Var;
        yd.k kVar;
        qd.c cVar;
        dd.a aVar = dd.a.a;
        int i10 = this.d;
        if (i10 == 0) {
            l9.b.b(obj);
            qd.c cVar2 = (qd.c) this.e;
            Object u10 = this.f.u();
            if (u10 instanceof q) {
                r rVar = ((q) u10).e;
                this.d = 1;
                cVar2.b(rVar, this);
                return aVar;
            }
            if ((u10 instanceof a1) && (c10 = ((a1) u10).c()) != null) {
                Object f7 = c10.f();
                kotlin.jvm.internal.i.c(f7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                yd.k kVar2 = (yd.k) f7;
                v1Var = c10;
                kVar = kVar2;
                cVar = cVar2;
                if (!kVar.equals(v1Var)) {
                }
            }
        } else if (i10 == 1) {
            l9.b.b(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kVar = this.c;
            v1Var = this.b;
            cVar = (qd.c) this.e;
            l9.b.b(obj);
            kVar = kVar.g();
            if (!kVar.equals(v1Var)) {
                if (kVar instanceof q) {
                    q qVar = (q) kVar;
                    r rVar2 = qVar.e;
                    this.e = cVar;
                    this.b = v1Var;
                    this.c = qVar;
                    this.d = 2;
                    cVar.b(rVar2, this);
                    dd.a aVar2 = dd.a.a;
                    return aVar;
                }
                kVar = kVar.g();
                if (!kVar.equals(v1Var)) {
                }
            }
        }
        return ad.j.a;
    }
}
