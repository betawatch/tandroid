// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zvb implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lwb b;

    public /* synthetic */ zvb(lwb lwbVar, byte b) {
        this.a = b;
        this.b = lwbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t26 t26Var;
        byte b = this.a;
        lwb lwbVar = this.b;
        switch (b) {
            case 0:
                lwbVar.P = null;
                lwbVar.j();
                break;
            default:
                long j = lwbVar.b;
                if (!lwbVar.d && lwbVar.y > 0.0f && (t26Var = (t26) lwbVar.r.getLayoutManager()) != null && t26Var.M0() >= lwbVar.s.c.size() - 3) {
                    if (!lwbVar.i()) {
                        pub pubVar = na7.q1(lwbVar.a).g4;
                        long j2 = -j;
                        if (!pubVar.e(j2)) {
                            pubVar.o(j2);
                            break;
                        }
                    } else {
                        lwbVar.j();
                        break;
                    }
                }
                break;
        }
    }
}
