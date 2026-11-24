// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qz1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ x02 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ qz1(x02 x02Var, boolean z, byte b) {
        this.a = b;
        this.b = x02Var;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        boolean z = this.c;
        x02 x02Var = this.b;
        switch (b) {
            case 0:
                if (!z) {
                    x02Var.Z2.setVisibility(8);
                    break;
                }
                break;
            case 1:
                if (!z) {
                    x02Var.v1.setVisibility(8);
                    break;
                }
                break;
            case 2:
                if (!z) {
                    x02Var.x1.setVisibility(8);
                    break;
                }
                break;
            default:
                if (!z) {
                    x02Var.getClass();
                    break;
                } else {
                    x02Var.u3.setVisibility(4);
                    break;
                }
        }
    }
}
