package v2;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class a {
    public final Integer a;
    public final Object b;
    public final d c;
    public final b d;

    public a(Integer num, Object obj, d dVar, b bVar) {
        this.a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.b = obj;
        this.c = dVar;
        this.d = bVar;
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            b bVar2 = aVar.d;
            Integer num = aVar.a;
            Integer num2 = this.a;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.b.equals(aVar.b) && this.c.equals(aVar.c) && ((bVar = this.d) != null ? bVar.equals(bVar2) : bVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        b bVar = this.d;
        return (bVar != null ? bVar.hashCode() : 0) ^ hashCode;
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + ", productData=" + this.d + "}";
    }
}
