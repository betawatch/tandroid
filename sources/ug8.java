// default package

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class ug8 implements o8a, x71 {
    public final String a;
    public final ku4 b;
    public final byte c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final h26 i;
    public final h26 j;
    public final h26 k;

    /* JADX WARN: Multi-variable type inference failed */
    public ug8(String str, ku4 ku4Var, int i) {
        this.a = str;
        this.b = ku4Var;
        this.c = i;
        String[] strArr = new String[i];
        final byte b = 0;
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i3 = this.c;
        this.f = new List[i3];
        this.g = new boolean[i3];
        this.h = y24.a;
        this.i = ure.a(new sr4(this) { // from class: sg8
            public final /* synthetic */ ug8 b;

            {
                this.b = this;
            }

            @Override // sr4
            public final Object invoke() {
                byte b2 = b;
                ug8 ug8Var = this.b;
                switch (b2) {
                    case 0:
                        return ug8Var.b.a();
                    default:
                        o8a[] o8aVarArr = (o8a[]) ug8Var.j.getValue();
                        o8aVarArr.getClass();
                        int hashCode = (ug8Var.a().hashCode() * 31) + Arrays.hashCode(o8aVarArr);
                        int f = ug8Var.f();
                        int i4 = 1;
                        while (true) {
                            int i5 = 0;
                            if (f > 0) {
                                int i6 = f - 1;
                                int i7 = i4 * 31;
                                String a = ug8Var.i(ug8Var.f() - f).a();
                                if (a != null) {
                                    i5 = a.hashCode();
                                }
                                i4 = i7 + i5;
                                f = i6;
                            } else {
                                int f2 = ug8Var.f();
                                int i8 = 1;
                                while (true) {
                                    if (!(f2 > 0)) {
                                        return Integer.valueOf((((hashCode * 31) + i4) * 31) + i8);
                                    }
                                    int i9 = f2 - 1;
                                    int i10 = i8 * 31;
                                    nye e = ug8Var.i(ug8Var.f() - f2).e();
                                    i8 = i10 + (e != null ? e.hashCode() : 0);
                                    f2 = i9;
                                }
                            }
                        }
                }
            }
        });
        this.j = ure.a(new tg8(this));
        final byte b2 = 1;
        this.k = ure.a(new sr4(this) { // from class: sg8
            public final /* synthetic */ ug8 b;

            {
                this.b = this;
            }

            @Override // sr4
            public final Object invoke() {
                byte b22 = b2;
                ug8 ug8Var = this.b;
                switch (b22) {
                    case 0:
                        return ug8Var.b.a();
                    default:
                        o8a[] o8aVarArr = (o8a[]) ug8Var.j.getValue();
                        o8aVarArr.getClass();
                        int hashCode = (ug8Var.a().hashCode() * 31) + Arrays.hashCode(o8aVarArr);
                        int f = ug8Var.f();
                        int i4 = 1;
                        while (true) {
                            int i5 = 0;
                            if (f > 0) {
                                int i6 = f - 1;
                                int i7 = i4 * 31;
                                String a = ug8Var.i(ug8Var.f() - f).a();
                                if (a != null) {
                                    i5 = a.hashCode();
                                }
                                i4 = i7 + i5;
                                f = i6;
                            } else {
                                int f2 = ug8Var.f();
                                int i8 = 1;
                                while (true) {
                                    if (!(f2 > 0)) {
                                        return Integer.valueOf((((hashCode * 31) + i4) * 31) + i8);
                                    }
                                    int i9 = f2 - 1;
                                    int i10 = i8 * 31;
                                    nye e = ug8Var.i(ug8Var.f() - f2).e();
                                    i8 = i10 + (e != null ? e.hashCode() : 0);
                                    f2 = i9;
                                }
                            }
                        }
                }
            }
        });
    }

    @Override // o8a
    public final String a() {
        return this.a;
    }

    @Override // x71
    public final Set b() {
        return this.h.keySet();
    }

    @Override // o8a
    public final boolean c() {
        return false;
    }

    @Override // o8a
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // o8a
    public final nye e() {
        return tdb.b;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ug8) {
            o8a o8aVar = (o8a) obj;
            if (this.a.equals(o8aVar.a()) && Arrays.equals((o8a[]) this.j.getValue(), (o8a[]) ((ug8) obj).j.getValue())) {
                int f = o8aVar.f();
                byte b = this.c;
                if (b == f) {
                    for (0; i < b; i + 1) {
                        i = (ur5.a(i(i).a(), o8aVar.i(i).a()) && ur5.a(i(i).e(), o8aVar.i(i).e())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o8a
    public final int f() {
        return this.c;
    }

    @Override // o8a
    public final String g(int i) {
        return this.e[i];
    }

    @Override // o8a
    public final List getAnnotations() {
        return x24.a;
    }

    @Override // o8a
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? x24.a : list;
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // o8a
    public final o8a i(int i) {
        return ((hx5[]) this.i.getValue())[i].d();
    }

    @Override // o8a
    public final boolean isInline() {
        return false;
    }

    public final void j(String str, boolean z) {
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = hashMap;
        }
    }

    public final String toString() {
        return sl2.f(bxe.a(0, this.c), ", ", this.a.concat("("), ")", new a2((Object) this, (byte) 7), 24);
    }
}
