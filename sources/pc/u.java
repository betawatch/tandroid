package pc;

import g7.y5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u extends sc.h implements zc.p {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Iterator h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(Iterator it, qc.c cVar) {
        super(cVar);
        this.h = it;
    }

    @Override // sc.a
    public final qc.c create(Object obj, qc.c cVar) {
        u uVar = new u(this.h, cVar);
        uVar.f = obj;
        return uVar;
    }

    @Override // zc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((ed.c) obj, (qc.c) obj2)).invokeSuspend(oc.i.a);
    }

    @Override // sc.a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i9;
        ed.c cVar;
        Iterator it;
        int i10;
        t tVar;
        ed.c cVar2;
        Object[] array;
        rc.a aVar = rc.a.a;
        int i11 = this.e;
        if (i11 == 0) {
            y5.b(obj);
            ed.c cVar3 = (ed.c) this.f;
            arrayList = new ArrayList(20);
            i9 = 0;
            cVar = cVar3;
            it = this.h;
            i10 = 0;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        Iterator it2 = this.c;
                        t tVar2 = (t) this.b;
                        ed.c cVar4 = (ed.c) this.f;
                        y5.b(obj);
                        tVar2.n();
                        while (true) {
                            int i12 = tVar2.b;
                            Object[] objArr = tVar2.a;
                            if (!it2.hasNext()) {
                                tVar = tVar2;
                                cVar2 = cVar4;
                                break;
                            }
                            Object next = it2.next();
                            if (tVar2.i() == i12) {
                                throw new IllegalStateException("ring buffer is full");
                            }
                            int i13 = tVar2.c;
                            int i14 = tVar2.d;
                            objArr[(i13 + i14) % i12] = next;
                            tVar2.d = i14 + 1;
                            if (tVar2.i() == i12) {
                                if (tVar2.d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(tVar2);
                                    this.f = cVar4;
                                    this.b = tVar2;
                                    this.c = it2;
                                    this.e = 3;
                                    cVar4.c(arrayList2, this);
                                    rc.a aVar2 = rc.a.a;
                                    return aVar;
                                }
                                int i15 = i12 + (i12 >> 1) + 1;
                                if (i15 > 20) {
                                    i15 = 20;
                                }
                                if (tVar2.c == 0) {
                                    array = Arrays.copyOf(objArr, i15);
                                    kotlin.jvm.internal.i.d(array, "copyOf(...)");
                                } else {
                                    array = tVar2.toArray(new Object[i15]);
                                }
                                tVar2 = new t(tVar2.d, array);
                            }
                        }
                    } else if (i11 == 4) {
                        tVar = (t) this.b;
                        cVar2 = (ed.c) this.f;
                        y5.b(obj);
                        tVar.n();
                    } else if (i11 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (tVar.d > 20) {
                        ArrayList arrayList3 = new ArrayList(tVar);
                        this.f = cVar2;
                        this.b = tVar;
                        this.c = null;
                        this.e = 4;
                        cVar2.c(arrayList3, this);
                        rc.a aVar3 = rc.a.a;
                        return aVar;
                    }
                    if (!tVar.isEmpty()) {
                        this.f = null;
                        this.b = null;
                        this.c = null;
                        this.e = 5;
                        cVar2.c(tVar, this);
                        rc.a aVar4 = rc.a.a;
                        return aVar;
                    }
                    return oc.i.a;
                }
                y5.b(obj);
                return oc.i.a;
            }
            i9 = this.d;
            Iterator it3 = this.c;
            ed.c cVar5 = (ed.c) this.f;
            y5.b(obj);
            arrayList = new ArrayList(20);
            cVar = cVar5;
            it = it3;
            i10 = i9;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i9 > 0) {
                i9--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.f = cVar;
                    this.b = arrayList;
                    this.c = it;
                    this.d = i10;
                    this.e = 1;
                    cVar.c(arrayList, this);
                    rc.a aVar5 = rc.a.a;
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
            rc.a aVar6 = rc.a.a;
            return aVar;
        }
        return oc.i.a;
    }
}
