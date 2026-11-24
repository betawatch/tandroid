// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class z56 {
    public final Object a;
    public e31 b = new e31();
    public boolean c;
    public boolean d;

    public z56(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z56.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((z56) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
