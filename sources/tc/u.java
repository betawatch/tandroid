package tc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k7.q7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class u extends wc.h implements dd.p {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Iterator h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Iterator it, uc.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override // wc.a
    public final uc.c create(Object obj, uc.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f = obj;
        return uVar;
    }

    @Override // dd.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((id.c) obj, (uc.c) obj2)).invokeSuspend(sc.i.a);
    }

    @Override // wc.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i10;
        id.c cVar;
        Iterator it;
        int i11;
        t tVar;
        id.c cVar2;
        Object[] array;
        vc.a aVar = vc.a.a;
        int i12 = this.e;
        if (i12 == 0) {
            q7.b(obj);
            id.c cVar3 = (id.c) this.f;
            arrayList = new ArrayList(20);
            i10 = 0;
            cVar = cVar3;
            it = this.h;
            i11 = 0;
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        Iterator it2 = this.c;
                        t tVar2 = (t) this.b;
                        id.c cVar4 = (id.c) this.f;
                        q7.b(obj);
                        tVar2.n();
                        while (true) {
                            int i13 = tVar2.b;
                            Object[] objArr = tVar2.a;
                            if (!it2.hasNext()) {
                                tVar = tVar2;
                                cVar2 = cVar4;
                                break;
                            }
                            Object next = it2.next();
                            if (tVar2.i() == i13) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i14 = tVar2.c;
                            int i15 = tVar2.d;
                            objArr[(i14 + i15) % i13] = next;
                            tVar2.d = i15 + 1;
                            if (tVar2.i() == i13) {
                                if (tVar2.d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(tVar2);
                                    this.f = cVar4;
                                    this.b = tVar2;
                                    this.c = it2;
                                    this.e = 3;
                                    cVar4.c(arrayList2, this);
                                    vc.a aVar2 = vc.a.a;
                                    return aVar;
                                }
                                int i16 = i13 + (i13 >> 1) + 1;
                                if (i16 > 20) {
                                    i16 = 20;
                                }
                                if (tVar2.c == 0) {
                                    array = Arrays.copyOf(objArr, i16);
                                    kotlin.jvm.internal.j.d(array, "copyOf(...)");
                                } else {
                                    array = tVar2.toArray(new Object[i16]);
                                }
                                tVar2 = new t(tVar2.d, array);
                            }
                        }
                    } else if (i12 == 4) {
                        tVar = (t) this.b;
                        cVar2 = (id.c) this.f;
                        q7.b(obj);
                        tVar.n();
                    } else if (i12 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (tVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(tVar);
                        this.f = cVar2;
                        this.b = tVar;
                        this.c = null;
                        this.e = 4;
                        cVar2.c(arrayList3, this);
                        vc.a aVar3 = vc.a.a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f = null;
                        this.b = null;
                        this.c = null;
                        this.e = 5;
                        cVar2.c(tVar, this);
                        vc.a aVar4 = vc.a.a;
                        return aVar;
                    }
                    return sc.i.a;
                }
                q7.b(obj);
                return sc.i.a;
            }
            i10 = this.d;
            Iterator it3 = this.c;
            id.c cVar5 = (id.c) this.f;
            q7.b(obj);
            arrayList = new ArrayList(20);
            cVar = cVar5;
            it = it3;
            i11 = i10;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i10 > 0) {
                i10--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f = cVar;
                    this.b = arrayList;
                    this.c = it;
                    this.d = i11;
                    this.e = 1;
                    cVar.c(arrayList, this);
                    vc.a aVar5 = vc.a.a;
                    return aVar;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.f = null;
            this.b = null;
            this.c = null;
            this.e = 2;
            cVar.c(arrayList, this);
            vc.a aVar6 = vc.a.a;
            return aVar;
        }
        return sc.i.a;
    }
}
