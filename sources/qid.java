// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
