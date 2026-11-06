package zd;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class j1 extends kd.i implements rd.p {
    public o1 b;
    public q c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ n1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(id.c cVar, n1 n1Var) {
        super(2, cVar);
        this.f = n1Var;
    }

    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
        j1 j1Var = new j1(cVar, this.f);
        j1Var.e = obj;
        return j1Var;
    }

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((wd.c) obj, (id.c) obj2)).invokeSuspend(gd.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0066 -> B:6:0x007a). Please report as a decompilation issue!!! */
    @Override // kd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o1 b10;
        o1 o1Var;
        ee.j jVar;
        wd.c cVar;
        jd.a aVar = jd.a.a;
        int i7 = this.d;
        if (i7 == 0) {
            af.b.c(obj);
            wd.c cVar2 = (wd.c) this.e;
            Object obj2 = n1.a.get(this.f);
            if (obj2 instanceof q) {
                r rVar = ((q) obj2).e;
                this.d = 1;
                cVar2.b(rVar, this);
                return aVar;
            }
            if ((obj2 instanceof x0) && (b10 = ((x0) obj2).b()) != null) {
                Object obj3 = ee.j.a.get(b10);
                kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                ee.j jVar2 = (ee.j) obj3;
                o1Var = b10;
                jVar = jVar2;
                cVar = cVar2;
                if (!jVar.equals(o1Var)) {
                }
            }
        } else if (i7 == 1) {
            af.b.c(obj);
        } else {
            if (i7 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = this.c;
            o1Var = this.b;
            cVar = (wd.c) this.e;
            af.b.c(obj);
            jVar = jVar.f();
            if (!jVar.equals(o1Var)) {
                if (jVar instanceof q) {
                    q qVar = (q) jVar;
                    r rVar2 = qVar.e;
                    this.e = cVar;
                    this.b = o1Var;
                    this.c = qVar;
                    this.d = 2;
                    cVar.b(rVar2, this);
                    jd.a aVar2 = jd.a.a;
                    return aVar;
                }
                jVar = jVar.f();
                if (!jVar.equals(o1Var)) {
                }
            }
        }
        return gd.k.a;
    }
}
