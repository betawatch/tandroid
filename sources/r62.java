// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r62 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ it3 b;

    public /* synthetic */ r62(it3 it3Var, byte b) {
        this.a = b;
        this.b = it3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        it3 it3Var = this.b;
        switch (b) {
            case 0:
                ht3 ht3Var = it3Var.d;
                ht3Var.requestFocus();
                gl.F3(ht3Var);
                break;
            default:
                gl.t1(it3Var.d);
                break;
        }
    }
}
