// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class r82 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f92 b;

    public /* synthetic */ r82(f92 f92Var, byte b) {
        this.a = b;
        this.b = f92Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        f92 f92Var = this.b;
        switch (b) {
            case 0:
                f92Var.d0 = true;
                f92Var.g0();
                break;
            case 1:
                f92Var.Y = f92Var.getMessagesController().K0(Long.valueOf(f92Var.a0));
                f92Var.d0();
                break;
            case 2:
                f92Var.f0(false);
                break;
            case 3:
                f92Var.d0 = true;
                if (f92Var.b.length() > 0) {
                    f92Var.b0(f92Var.b.getText().toString());
                }
                f92Var.g0();
                break;
            case 4:
                f92Var.d0();
                break;
            default:
                f92Var.f0(true);
                break;
        }
    }
}
