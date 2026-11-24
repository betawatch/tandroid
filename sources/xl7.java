// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class xl7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ im7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;

    public /* synthetic */ xl7(im7 im7Var, long j, long j2, byte b) {
        this.a = b;
        this.b = im7Var;
        this.c = j;
        this.d = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        long j2 = this.c;
        im7 im7Var = this.b;
        switch (b) {
            case 0:
                im7Var.G = j2;
                im7Var.H = j;
                break;
            default:
                im7Var.i(j2, j);
                break;
        }
    }
}
