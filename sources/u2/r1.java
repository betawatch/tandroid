package u2;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class r1 {
    public static final r1 d = new r1(new b2.q1[0]);
    public static final String e;
    public final int a;
    public final f9.s1 b;
    public int c;

    static {
        String str = e2.n0.a;
        e = Integer.toString(0, 36);
    }

    public r1(b2.q1... q1VarArr) {
        f9.s1 v = f9.i0.v(q1VarArr);
        this.b = v;
        this.a = q1VarArr.length;
        int i10 = 0;
        while (i10 < v.d) {
            int i11 = i10 + 1;
            for (int i12 = i11; i12 < v.d; i12++) {
                if (((b2.q1) v.get(i10)).equals(v.get(i12))) {
                    e2.a.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i10 = i11;
        }
    }

    public final b2.q1 a(int i10) {
        return (b2.q1) this.b.get(i10);
    }

    public final int b(b2.q1 q1Var) {
        int indexOf = this.b.indexOf(q1Var);
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
