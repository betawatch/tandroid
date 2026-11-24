// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vzb {
    public static final vzb d = new vzb(new uzb[0]);
    public static final String e;
    public final int a;
    public final y79 b;
    public int c;

    static {
        String str = hac.a;
        e = "0";
    }

    public vzb(uzb... uzbVarArr) {
        y79 r = mo5.r(uzbVarArr);
        this.b = r;
        this.a = uzbVarArr.length;
        int i = 0;
        while (i < r.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < r.d; i3++) {
                if (((uzb) r.get(i)).equals(r.get(i3))) {
                    ncd.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final uzb a(int i) {
        return (uzb) this.b.get(i);
    }

    public final int b(uzb uzbVar) {
        int indexOf = this.b.indexOf(uzbVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vzb.class != obj.getClass()) {
            return false;
        }
        vzb vzbVar = (vzb) obj;
        return this.a == vzbVar.a && this.b.equals(vzbVar.b);
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
