// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class yq1 implements Runnable {
    public final /* synthetic */ mu1 a;

    public yq1(mu1 mu1Var) {
        this.a = mu1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mu1 mu1Var = this.a;
        k27 k27Var = mu1Var.v5;
        if (k27Var == null || mu1Var.l9 == null) {
            return;
        }
        int max = Math.max(0, k27Var.k.ttl_period - (mu1Var.getConnectionsManager().getCurrentTime() - mu1Var.v5.k.date));
        mu1Var.l9.setSubtext(k96.a0(null, null, 2131753850, max < 86400 ? gl.g0(max, false, true) : k96.G(Math.round(max / 86400.0f), "Days", new Object[0])));
        gl.e3(mu1Var.m9, 1000L);
    }
}
