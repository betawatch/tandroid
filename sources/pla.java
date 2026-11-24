// default package

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class pla extends rc9 implements fs4 {
    public Object b;
    public Iterator c;
    public int d;
    public int e;
    public byte f;
    public /* synthetic */ Object h;
    public final /* synthetic */ Iterator n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pla(Iterator it, px2 px2Var) {
        super(2, px2Var);
        this.n = it;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        pla plaVar = new pla(this.n, px2Var);
        plaVar.h = obj;
        return plaVar;
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        return ((pla) create((q6a) obj, (px2) obj2)).invokeSuspend(g7c.a);
    }

    @Override // og0
    public final Object invokeSuspend(Object obj) {
        byte b;
        int i;
        int i2;
        ArrayList arrayList;
        Iterator it;
        int i3;
        int i4;
        int i5;
        gl9 gl9Var;
        q6a q6aVar = (q6a) this.h;
        byte b2 = this.f;
        boolean z = true;
        ly2 ly2Var = ly2.a;
        if (b2 == 0) {
            b = 1;
            tue.b(obj);
            i = 0;
            i2 = 0;
            arrayList = new ArrayList(20);
            it = this.n;
            i3 = 20;
        } else {
            if (b2 != 1) {
                if (b2 != 2) {
                    if (b2 == 3) {
                        i4 = this.e;
                        int i6 = this.d;
                        Iterator it2 = this.c;
                        gl9 gl9Var2 = (gl9) this.b;
                        tue.b(obj);
                        gl9Var2.i();
                        while (true) {
                            int i7 = gl9Var2.b;
                            Object[] objArr = gl9Var2.a;
                            if (!it2.hasNext()) {
                                i5 = i6;
                                gl9Var = gl9Var2;
                                break;
                            }
                            Object next = it2.next();
                            boolean z2 = z;
                            if (gl9Var2.h() == i7) {
                                dq9.m("ring buffer is full");
                                return null;
                            }
                            int i8 = gl9Var2.c;
                            int i9 = gl9Var2.d;
                            objArr[(i8 + i9) % i7] = next;
                            gl9Var2.d = i9 + 1;
                            if (gl9Var2.h() == i7) {
                                if (gl9Var2.d >= 20) {
                                    ArrayList arrayList2 = new ArrayList(gl9Var2);
                                    this.h = q6aVar;
                                    this.b = gl9Var2;
                                    this.c = it2;
                                    this.d = i6;
                                    this.e = i4;
                                    this.f = (byte) 3;
                                    q6aVar.c(arrayList2, this);
                                    return ly2Var;
                                }
                                int i10 = i7 + (i7 >> 1) + 1;
                                if (i10 > 20) {
                                    i10 = 20;
                                }
                                gl9Var2 = new gl9(gl9Var2.d, gl9Var2.c == 0 ? Arrays.copyOf(objArr, i10) : gl9Var2.toArray(new Object[i10]));
                            }
                            z = z2;
                        }
                    } else if (b2 == 4) {
                        i4 = this.e;
                        i5 = this.d;
                        gl9Var = (gl9) this.b;
                        tue.b(obj);
                        gl9Var.i();
                    } else {
                        if (b2 != 5) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    if (gl9Var.d > 20) {
                        ArrayList arrayList3 = new ArrayList(gl9Var);
                        this.h = q6aVar;
                        this.b = gl9Var;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 4;
                        q6aVar.c(arrayList3, this);
                        return ly2Var;
                    }
                    if (!gl9Var.isEmpty()) {
                        this.h = null;
                        this.b = null;
                        this.c = null;
                        this.d = i5;
                        this.e = i4;
                        this.f = (byte) 5;
                        q6aVar.c(gl9Var, this);
                        return ly2Var;
                    }
                    return g7c.a;
                }
                tue.b(obj);
                return g7c.a;
            }
            b = 1;
            i = this.e;
            int i11 = this.d;
            Iterator it3 = this.c;
            tue.b(obj);
            arrayList = new ArrayList(20);
            it = it3;
            i3 = i11;
            i2 = i;
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i > 0) {
                i--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.h = q6aVar;
                    this.b = arrayList;
                    this.c = it;
                    this.d = i3;
                    this.e = i2;
                    this.f = b;
                    q6aVar.c(arrayList, this);
                    return ly2Var;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.h = null;
            this.b = null;
            this.c = null;
            this.d = i3;
            this.e = i2;
            this.f = (byte) 2;
            q6aVar.c(arrayList, this);
            return ly2Var;
        }
        return g7c.a;
    }
}
