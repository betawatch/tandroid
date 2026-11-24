// default package

import java.util.AbstractMap;
import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class qo2 implements Iterator {
    public final /* synthetic */ byte a = 0;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ AbstractMap e;

    public qo2(so2 so2Var, byte b) {
        this.e = so2Var;
        this.b = so2Var.f;
        this.c = so2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public abstract Object a(int i);

    public abstract Object b(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c >= 0) {
                }
                break;
            case 1:
                if (this.c >= 0) {
                }
                break;
            default:
                if (this.c >= 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        byte b = this.a;
        AbstractMap abstractMap = this.e;
        Object obj = null;
        switch (b) {
            case 0:
                so2 so2Var = (so2) abstractMap;
                if (so2Var.f != this.b) {
                    ag.b();
                    break;
                } else if (!hasNext()) {
                    w26.g();
                    break;
                } else {
                    int i = this.c;
                    this.d = i;
                    obj = a(i);
                    int i2 = this.c + 1;
                    this.c = i2 < so2Var.h ? i2 : -1;
                    break;
                }
            case 1:
                so2 so2Var2 = (so2) abstractMap;
                if (so2Var2.f != this.b) {
                    ag.b();
                    break;
                } else if (!hasNext()) {
                    w26.g();
                    break;
                } else {
                    int i3 = this.c;
                    this.d = i3;
                    obj = b(i3);
                    int i4 = this.c + 1;
                    this.c = i4 < so2Var2.h ? i4 : -1;
                    break;
                }
            default:
                so2 so2Var3 = (so2) abstractMap;
                if (so2Var3.f != this.b) {
                    ag.b();
                    break;
                } else if (!hasNext()) {
                    w26.g();
                    break;
                } else {
                    int i5 = this.c;
                    this.d = i5;
                    obj = b(i5);
                    int i6 = this.c + 1;
                    this.c = i6 < so2Var3.h ? i6 : -1;
                    break;
                }
        }
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        byte b = this.a;
        AbstractMap abstractMap = this.e;
        switch (b) {
            case 0:
                so2 so2Var = (so2) abstractMap;
                if (so2Var.f != this.b) {
                    ag.b();
                    break;
                } else {
                    gre.o("no calls to next() since the last call to remove()", this.d >= 0);
                    this.b += 32;
                    int i = this.d;
                    Object obj = so2.w;
                    so2Var.remove(so2Var.g(i));
                    this.c--;
                    this.d = -1;
                    break;
                }
            case 1:
                so2 so2Var2 = (so2) abstractMap;
                int i2 = so2Var2.f;
                int i3 = this.b;
                if (i2 != i3) {
                    ag.b();
                    break;
                } else {
                    int i4 = this.d;
                    if (!(i4 >= 0)) {
                        sc8.j("no calls to next() since the last call to remove()");
                        break;
                    } else {
                        this.b = i3 + 32;
                        Object[] objArr = so2Var2.d;
                        objArr.getClass();
                        so2Var2.remove(objArr[i4]);
                        this.c--;
                        this.d = -1;
                        break;
                    }
                }
            default:
                so2 so2Var3 = (so2) abstractMap;
                int i5 = so2Var3.f;
                int i6 = this.b;
                if (i5 != i6) {
                    ag.b();
                    break;
                } else {
                    int i7 = this.d;
                    if (!(i7 >= 0)) {
                        sc8.j("no calls to next() since the last call to remove()");
                        break;
                    } else {
                        this.b = i6 + 32;
                        Object[] objArr2 = so2Var3.d;
                        objArr2.getClass();
                        so2Var3.remove(objArr2[i7]);
                        this.c--;
                        this.d = -1;
                        break;
                    }
                }
        }
    }

    public qo2(so2 so2Var, char c) {
        this.e = so2Var;
        this.b = so2Var.f;
        this.c = so2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public qo2(so2 so2Var) {
        this.e = so2Var;
        this.b = so2Var.f;
        this.c = so2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}
