package w2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r1 {
    public static final r1 d = new r1(new d2.o1[0]);
    public static final String e;
    public final int a;
    public final g9.s1 b;
    public int c;

    static {
        String str = g2.n0.a;
        e = Integer.toString(0, 36);
    }

    public r1(d2.o1... o1VarArr) {
        g9.s1 r5 = g9.i0.r(o1VarArr);
        this.b = r5;
        this.a = o1VarArr.length;
        int i3 = 0;
        while (i3 < r5.d) {
            int i10 = i3 + 1;
            for (int i11 = i10; i11 < r5.d; i11++) {
                if (((d2.o1) r5.get(i3)).equals(r5.get(i11))) {
                    g2.a.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i3 = i10;
        }
    }

    public final d2.o1 a(int i3) {
        return (d2.o1) this.b.get(i3);
    }

    public final int b(d2.o1 o1Var) {
        int indexOf = this.b.indexOf(o1Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r1.class != obj.getClass()) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return this.a == r1Var.a && this.b.equals(r1Var.b);
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
