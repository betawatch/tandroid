// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class u1c {
    public static final u1c d = new u1c(new t1c[0]);
    public static final String e;
    public final int a;
    public final j99 b;
    public int c;

    static {
        String str = gcc.a;
        e = "0";
    }

    public u1c(t1c... t1cVarArr) {
        j99 r = po5.r(t1cVarArr);
        this.b = r;
        this.a = t1cVarArr.length;
        int i = 0;
        while (i < r.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < r.d; i3++) {
                if (((t1c) r.get(i)).equals(r.get(i3))) {
                    efd.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final t1c a(int i) {
        return (t1c) this.b.get(i);
    }

    public final int b(t1c t1cVar) {
        int indexOf = this.b.indexOf(t1cVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u1c.class != obj.getClass()) {
            return false;
        }
        u1c u1cVar = (u1c) obj;
        return this.a == u1cVar.a && this.b.equals(u1cVar.b);
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.b.hashCode();
        this.c = hashCode;
        return hashCode;
    }

    public final String toString() {
        return this.b.toString();
    }
}
