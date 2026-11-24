// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class t1d implements nd0 {
    public final /* synthetic */ hy4 a;

    public t1d(hy4 hy4Var) {
        this.a = hy4Var;
    }

    @Override // nd0
    public final void a(boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        o59 o59Var = this.a.y;
        o59Var.sendMessage(o59Var.obtainMessage(1, valueOf));
    }
}
