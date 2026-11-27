// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qid extends iid {
    public final xx8 a;

    public qid(xx8 xx8Var) {
        this.a = xx8Var;
    }

    @Override // iid
    public final Object a() {
        return this.a;
    }

    @Override // iid
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qid) {
            return this.a.equals(((qid) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return qd4.y("Optional.of(", this.a.toString(), ")");
    }
}
