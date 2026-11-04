package wd;

import b8.ib;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class j1 extends hd.i implements od.p {
    public o1 b;
    public q c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ n1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(fd.c cVar, n1 n1Var) {
        super(2, cVar);
        this.f = n1Var;
    }

    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        j1 j1Var = new j1(cVar, this.f);
        j1Var.e = obj;
        return j1Var;
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j1) create((td.c) obj, (fd.c) obj2)).invokeSuspend(dd.k.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0066 -> B:6:0x007a). Please report as a decompilation issue!!! */
    @Override // hd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        o1 b10;
        o1 o1Var;
        be.j jVar;
        td.c cVar;
        gd.a aVar = gd.a.a;
        int i3 = this.d;
        if (i3 == 0) {
            ib.b(obj);
            td.c cVar2 = (td.c) this.e;
            Object obj2 = n1.a.get(this.f);
            if (obj2 instanceof q) {
                r rVar = ((q) obj2).e;
                this.d = 1;
                cVar2.b(rVar, this);
                return aVar;
            }
            if ((obj2 instanceof x0) && (b10 = ((x0) obj2).b()) != null) {
                Object obj3 = be.j.a.get(b10);
                kotlin.jvm.internal.j.c(obj3, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                be.j jVar2 = (be.j) obj3;
                o1Var = b10;
                jVar = jVar2;
                cVar = cVar2;
                if (!jVar.equals(o1Var)) {
                }
            }
        } else if (i3 == 1) {
            ib.b(obj);
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = this.c;
            o1Var = this.b;
            cVar = (td.c) this.e;
            ib.b(obj);
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
                    gd.a aVar2 = gd.a.a;
                    return aVar;
                }
                jVar = jVar.f();
                if (!jVar.equals(o1Var)) {
                }
            }
        }
        return dd.k.a;
    }
}
