package p2;

import j$.util.Objects;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public b(int i7, int i10, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i7;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.c == bVar.c && this.d == bVar.d && Objects.equals(this.a, bVar.a) && Objects.equals(this.b, bVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
