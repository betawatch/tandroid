// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class u9a {
    public final aaa a;
    public final tr b;

    public u9a(aaa aaaVar, tr trVar) {
        this.a = aaaVar;
        this.b = trVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9a)) {
            return false;
        }
        u9a u9aVar = (u9a) obj;
        return this.a.equals(u9aVar.a) && this.b.equals(u9aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.a.hashCode() + (j54.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + j54.b + ", sessionData=" + this.a + ", applicationInfo=" + this.b + ')';
    }
}
