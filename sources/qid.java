// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
