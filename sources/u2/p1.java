package u2;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class p1 {
    public static final p1 d = new p1(new b2.l1[0]);
    public static final String e;
    public final int a;
    public final e9.a1 b;
    public int c;

    static {
        String str = e2.d0.a;
        e = Integer.toString(0, 36);
    }

    public p1(b2.l1... l1VarArr) {
        e9.a1 w10 = e9.i0.w(l1VarArr);
        this.b = w10;
        this.a = l1VarArr.length;
        int i10 = 0;
        while (i10 < w10.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < w10.d; i12++) {
                if (((b2.l1) w10.get(i10)).equals(w10.get(i12))) {
                    e2.a.f("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final b2.l1 a(int i10) {
        return (b2.l1) this.b.get(i10);
    }

    public final int b(b2.l1 l1Var) {
        int indexOf = this.b.indexOf(l1Var);
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
