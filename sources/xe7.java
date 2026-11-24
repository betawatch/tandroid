// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xe7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ye7 b;

    public /* synthetic */ xe7(ye7 ye7Var, byte b) {
        this.a = b;
        this.b = ye7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ye7 ye7Var = this.b;
        switch (b) {
            case 0:
                ye7Var.x();
                break;
            default:
                ye7Var.m(true);
                break;
        }
    }
}
