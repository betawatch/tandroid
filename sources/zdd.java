// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zdd extends qdd {
    public final ou8 a;

    public zdd(ou8 ou8Var) {
        this.a = ou8Var;
    }

    @Override // qdd
    public final Object a() {
        return this.a;
    }

    @Override // qdd
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zdd) {
            return this.a.equals(((zdd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + 1502476572;
    }

    public final String toString() {
        return tb4.y("Optional.of(", this.a.toString(), ")");
    }
}
