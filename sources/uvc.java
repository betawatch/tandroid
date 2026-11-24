// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class uvc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xvc b;
    public final /* synthetic */ wvc c;

    public /* synthetic */ uvc(xvc xvcVar, wvc wvcVar, byte b) {
        this.a = b;
        this.b = xvcVar;
        this.c = wvcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        wvc wvcVar = this.c;
        xvc xvcVar = this.b;
        switch (b) {
            case 0:
                if (((wvc) xvcVar.c) == wvcVar) {
                    xvcVar.d = null;
                    xvcVar.r(wvcVar);
                    break;
                }
                break;
            case 1:
                if (((wvc) xvcVar.c) == wvcVar) {
                    uvc uvcVar = (uvc) xvcVar.d;
                    if (uvcVar != null) {
                        gm.r(uvcVar);
                        xvcVar.d = null;
                    }
                    int i = wvcVar.d;
                    if (i != 0) {
                        uvc uvcVar2 = new uvc(xvcVar, wvcVar, (byte) 2);
                        xvcVar.e = uvcVar2;
                        gm.d3(uvcVar2, 20000L);
                        wm2 wm2Var = wvcVar.a;
                        ((ConnectionsManager) wm2Var.b).checkWebProxyInternal(wvcVar.b, i, new vvc(xvcVar, wvcVar));
                        break;
                    } else {
                        xvcVar.r(wvcVar);
                        break;
                    }
                }
                break;
            default:
                if (((wvc) xvcVar.c) == wvcVar) {
                    xvcVar.e = null;
                    xvcVar.r(wvcVar);
                    break;
                }
                break;
        }
    }
}
