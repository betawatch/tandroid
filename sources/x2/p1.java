package x2;

import h9.t1;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class p1 {
    public static final p1 d = new p1(new e2.m1[0]);
    public static final String e;
    public final int a;
    public final t1 b;
    public int c;

    static {
        String str = h2.m0.a;
        e = Integer.toString(0, 36);
    }

    public p1(e2.m1... m1VarArr) {
        t1 r10 = h9.i0.r(m1VarArr);
        this.b = r10;
        this.a = m1VarArr.length;
        int i7 = 0;
        while (i7 < r10.d) {
            int i10 = i7 + 1;
            for (int i11 = i10; i11 < r10.d; i11++) {
                if (((e2.m1) r10.get(i7)).equals(r10.get(i11))) {
                    h2.a.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i10;
        }
    }

    public final e2.m1 a(int i7) {
        return (e2.m1) this.b.get(i7);
    }

    public final int b(e2.m1 m1Var) {
        int indexOf = this.b.indexOf(m1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p1.class != obj.getClass()) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return this.a == p1Var.a && this.b.equals(p1Var.b);
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
