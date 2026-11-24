// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class rp9 {
    public boolean a;
    public boolean b;
    public long c = 104857600;

    public final boolean a() {
        return this.a || this.b;
    }

    public void b() {
        if (a()) {
            this.b = false;
            this.a = false;
        } else {
            this.a = true;
            this.b = true;
        }
    }
}
