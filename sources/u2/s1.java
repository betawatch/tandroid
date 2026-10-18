package u2;

import e9.x1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class s1 {
    public static final s1 d = new s1(new b2.p1[0]);
    public static final String e;
    public final int a;
    public final x1 b;
    public int c;

    static {
        String str = e2.m0.a;
        e = Integer.toString(0, 36);
    }

    public s1(b2.p1... p1VarArr) {
        x1 v = e9.n0.v(p1VarArr);
        this.b = v;
        this.a = p1VarArr.length;
        int i10 = 0;
        while (i10 < v.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < v.d; i12++) {
                if (((b2.p1) v.get(i10)).equals(v.get(i12))) {
                    e2.a.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final b2.p1 a(int i10) {
        return (b2.p1) this.b.get(i10);
    }

    public final int b(b2.p1 p1Var) {
        int indexOf = this.b.indexOf(p1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1.class != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return this.a == s1Var.a && this.b.equals(s1Var.b);
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }

    public final String toString() {
        return this.b.toString();
    }
}
