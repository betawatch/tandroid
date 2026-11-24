// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class vk8 {
    public static final uk8 Companion = new uk8();
    public final int a;
    public final String b;

    public /* synthetic */ vk8(int i, int i2, String str) {
        if (3 != (i & 3)) {
            are.a(i, 3, tk8.a.d());
            throw null;
        }
        this.a = i2;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk8)) {
            return false;
        }
        vk8 vk8Var = (vk8) obj;
        return this.a == vk8Var.a && rp5.a(this.b, vk8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a * 31);
    }

    public final String toString() {
        return "ProcessData(pid=" + this.a + ", uuid=" + this.b + ')';
    }

    public vk8(int i, String str) {
        str.getClass();
        this.a = i;
        this.b = str;
    }
}
