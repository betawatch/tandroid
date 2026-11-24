// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yeb {
    public final int a;
    public final int b;

    public yeb(int i, int i2) {
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
        if (obj == null || yeb.class != obj.getClass()) {
            return false;
        }
        yeb yebVar = (yeb) obj;
        return this.b == yebVar.b && this.a == yebVar.a;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
