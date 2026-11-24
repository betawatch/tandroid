// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wn5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yn5 b;
    public final /* synthetic */ dy7 c;

    public /* synthetic */ wn5(yn5 yn5Var, dy7 dy7Var, byte b) {
        this.a = b;
        this.b = yn5Var;
        this.c = dy7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        dy7 dy7Var = this.c;
        yn5 yn5Var = this.b;
        switch (b) {
            case 0:
                gl.d3(new wn5(yn5Var, dy7Var, (byte) 1));
                break;
            default:
                yn5Var.i = dy7Var.a;
                break;
        }
    }
}
