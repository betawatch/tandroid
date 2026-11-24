// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class txb {
    public static final txb d = new txb(new sxb[0]);
    public static final String e;
    public final int a;
    public final w59 b;
    public int c;

    static {
        String str = g8c.a;
        e = "0";
    }

    public txb(sxb... sxbVarArr) {
        w59 r = mm5.r(sxbVarArr);
        this.b = r;
        this.a = sxbVarArr.length;
        int i = 0;
        while (i < r.d) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < r.d; i3++) {
                if (((sxb) r.get(i)).equals(r.get(i3))) {
                    lad.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final sxb a(int i) {
        return (sxb) this.b.get(i);
    }

    public final int b(sxb sxbVar) {
        int indexOf = this.b.indexOf(sxbVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || txb.class != obj.getClass()) {
            return false;
        }
        txb txbVar = (txb) obj;
        return this.a == txbVar.a && this.b.equals(txbVar.b);
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
