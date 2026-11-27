// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
