package q1;

import gd.k;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kd.j;
import rd.p;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class c extends j implements p {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ j d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(p pVar, id.c cVar, int i7) {
        super(2, cVar);
        this.a = i7;
        switch (i7) {
            case 1:
                this.d = (j) pVar;
                super(2, cVar);
                break;
            default:
                this.d = (j) pVar;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kd.j, rd.p] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kd.j, rd.p] */
    @Override // kd.a
    public final id.c create(Object obj, id.c cVar) {
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

    @Override // rd.p
    public final Object invoke(Object obj, Object obj2) {
        b bVar = (b) obj;
        id.c cVar = (id.c) obj2;
        switch (this.a) {
        }
        return ((c) create(bVar, cVar)).invokeSuspend(k.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kd.j, rd.p] */
    /* JADX WARN: Type inference failed for: r5v14, types: [kd.j, rd.p] */
    @Override // kd.a
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                jd.a aVar = jd.a.a;
                int i7 = this.b;
                if (i7 == 0) {
                    af.b.c(obj);
                    b bVar = (b) this.c;
                    this.b = 1;
                    obj = this.d.invoke(bVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    af.b.c(obj);
                }
                b bVar2 = (b) obj;
                kotlin.jvm.internal.j.c(bVar2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
                ((AtomicBoolean) bVar2.b.b).set(true);
                return bVar2;
            default:
                jd.a aVar2 = jd.a.a;
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b bVar3 = (b) this.c;
                    af.b.c(obj);
                    return bVar3;
                }
                af.b.c(obj);
                b bVar4 = new b(new LinkedHashMap(((b) this.c).a()), false);
                this.c = bVar4;
                this.b = 1;
                return this.d.invoke(bVar4, this) == aVar2 ? aVar2 : bVar4;
        }
    }
}
