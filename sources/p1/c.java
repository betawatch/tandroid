package p1;

import b8.ib;
import dd.k;
import hd.j;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import od.p;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends j implements p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, fd.c cVar, int i3) {
        super(2, cVar);
        this.a = i3;
        switch (i3) {
            case 1:
                this.d = (j) pVar;
                super(2, cVar);
                break;
            default:
                this.d = (j) pVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [hd.j, od.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [hd.j, od.p] */
    @Override // hd.a
    public final fd.c create(Object obj, fd.c cVar) {
        switch (this.a) {
            case 0:
                c cVar2 = new c(this.d, cVar, 0);
                cVar2.c = obj;
                return cVar2;
            default:
                c cVar3 = new c(this.d, cVar, 1);
                cVar3.c = obj;
                return cVar3;
        }
    }

    @Override // od.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        fd.c cVar = (fd.c) obj2;
        switch (this.a) {
        }
        return ((c) create(bVar, cVar)).invokeSuspend(k.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [hd.j, od.p] */
    /* JADX WARN: Type inference failed for: r5v14, types: [hd.j, od.p] */
    @Override // hd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                gd.a aVar = gd.a.a;
                int i3 = this.b;
                if (i3 == 0) {
                    ib.b(obj);
                    b bVar = (b) this.c;
                    this.b = 1;
                    obj = this.d.invoke(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ib.b(obj);
                }
                b bVar2 = (b) obj;
                kotlin.jvm.internal.j.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar2.b.b).set(true);
                return bVar2;
            default:
                gd.a aVar2 = gd.a.a;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.c;
                    ib.b(obj);
                    return bVar3;
                }
                ib.b(obj);
                b bVar4 = new b(new LinkedHashMap(((b) this.c).a()), false);
                this.c = bVar4;
                this.b = 1;
                return this.d.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }
}
