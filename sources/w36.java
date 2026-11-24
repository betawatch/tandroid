// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class w36 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a46 b;

    public /* synthetic */ w36(a46 a46Var, byte b) {
        this.a = b;
        this.b = a46Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        a46 a46Var = this.b;
        switch (b) {
            case 0:
                a46Var.b();
                break;
            default:
                a46Var.c();
                break;
        }
    }
}
