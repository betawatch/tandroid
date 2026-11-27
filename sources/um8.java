// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class um8 {
    public final String a;
    public final String b;
    public final int c;

    public um8(String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = str2.hashCode() + (str.hashCode() * 31);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof um8)) {
            return false;
        }
        um8 um8Var = (um8) obj;
        return this.a.equals(um8Var.a) && this.b.equals(um8Var.b);
    }

    public final int hashCode() {
        return this.c;
    }
}
