// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class q25 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ s25 c;
    public final /* synthetic */ ki7 d;

    public /* synthetic */ q25(boolean[] zArr, s25 s25Var, ki7 ki7Var, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = s25Var;
        this.d = ki7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ki7 ki7Var = this.d;
        s25 s25Var = this.c;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    if (!s25Var.m) {
                        ki7Var.dismiss();
                        break;
                    } else {
                        gl.e3(this, 1000L);
                        break;
                    }
                }
                break;
            default:
                if (!zArr[0]) {
                    if (!s25Var.m) {
                        ki7Var.dismiss();
                        break;
                    } else {
                        gl.e3(this, 1000L);
                        break;
                    }
                }
                break;
        }
    }
}
