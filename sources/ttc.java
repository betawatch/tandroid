// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class ttc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wtc b;
    public final /* synthetic */ vtc c;

    public /* synthetic */ ttc(wtc wtcVar, vtc vtcVar, byte b) {
        this.a = b;
        this.b = wtcVar;
        this.c = vtcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vtc vtcVar = this.c;
        wtc wtcVar = this.b;
        switch (b) {
            case 0:
                if (((vtc) wtcVar.b) == vtcVar) {
                    wtcVar.c = null;
                    wtcVar.i(vtcVar);
                    break;
                }
                break;
            case 1:
                if (((vtc) wtcVar.b) == vtcVar) {
                    ttc ttcVar = (ttc) wtcVar.c;
                    if (ttcVar != null) {
                        gl.r(ttcVar);
                        wtcVar.c = null;
                    }
                    int i = vtcVar.d;
                    if (i != 0) {
                        ttc ttcVar2 = new ttc(wtcVar, vtcVar, (byte) 2);
                        wtcVar.d = ttcVar2;
                        gl.e3(ttcVar2, 20000L);
                        rh1 rh1Var = vtcVar.a;
                        ((ConnectionsManager) rh1Var.b).checkWebProxyInternal(vtcVar.b, i, new utc(wtcVar, vtcVar));
                        break;
                    } else {
                        wtcVar.i(vtcVar);
                        break;
                    }
                }
                break;
            default:
                if (((vtc) wtcVar.b) == vtcVar) {
                    wtcVar.d = null;
                    wtcVar.i(vtcVar);
                    break;
                }
                break;
        }
    }
}
