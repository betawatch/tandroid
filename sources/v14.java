// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class v14 implements en5 {
    public final boolean a;

    public v14(boolean z) {
        this.a = z;
    }

    @Override // en5
    public final rj7 b() {
        return null;
    }

    @Override // en5
    public final boolean isActive() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.a ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
