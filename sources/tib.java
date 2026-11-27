// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tib {
    public final int a;
    public final int b;

    public tib(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b - this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tib.class != obj.getClass()) {
            return false;
        }
        tib tibVar = (tib) obj;
        return this.b == tibVar.b && this.a == tibVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
