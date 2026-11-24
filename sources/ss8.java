// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ss8 {
    public final int a;
    public final boolean b;

    public ss8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ss8.class != obj.getClass()) {
            return false;
        }
        ss8 ss8Var = (ss8) obj;
        return this.a == ss8Var.a && this.b == ss8Var.b;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
