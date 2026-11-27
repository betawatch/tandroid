// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class xa4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hb4 b;

    public /* synthetic */ xa4(hb4 hb4Var, byte b) {
        this.a = b;
        this.b = hb4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        hb4 hb4Var = this.b;
        switch (b) {
            case 0:
                if (hb4Var.Y == 1 && !hb4Var.Z) {
                    hb4Var.q(-1);
                    break;
                }
                break;
            case 1:
                if (hb4Var.j) {
                    if (f11.a) {
                        cc4.b("debug_loading: " + hb4Var.L0.getName() + " pause operation, clear requests");
                    }
                    hb4Var.c(null, false, true);
                    break;
                } else {
                    while (i < hb4Var.G0.size()) {
                        ConnectionsManager.getInstance(hb4Var.R).failNotRunningRequest(((gb4) hb4Var.G0.get(i)).a);
                        i++;
                    }
                    break;
                }
            case 2:
                if (hb4Var.Y == 5) {
                    hb4Var.h(1, false);
                    break;
                }
                break;
            case 3:
                hb4Var.F0.clear();
                break;
            case 4:
                hb4Var.j();
                xb4.G(hb4Var.R).e(null, null, null, null, null, hb4Var.r);
                break;
            case 5:
                hb4Var.h(0, false);
                break;
            case 6:
                hb4Var.q(-1);
                break;
            default:
                if (hb4Var.Y != 3) {
                    byte b2 = 2;
                    if (hb4Var.Y != 2) {
                        hb4Var.Y = (byte) 5;
                        xa4 xa4Var = new xa4(hb4Var, b2);
                        cc4.b("cancelRequests with callback");
                        if (hb4Var.G0 != null) {
                            int[] iArr = new int[1];
                            int[] iArr2 = new int[8];
                            for (int i2 = 0; i2 < hb4Var.G0.size(); i2++) {
                                gb4 gb4Var = (gb4) hb4Var.G0.get(i2);
                                if (gb4Var.a != 0) {
                                    gb4Var.j = true;
                                    gb4Var.l = new cv2(gb4Var, iArr, xa4Var, (byte) 25);
                                    iArr[0] = iArr[0] + 1;
                                    cc4.b("cancelRequests cancel " + gb4Var.a + " with callback");
                                    ConnectionsManager.getInstance(hb4Var.R).cancelRequest(gb4Var.a, true, new bb4(gb4Var, (byte) 1));
                                    int i3 = gb4Var.d >>> 16;
                                    iArr2[i3] = iArr2[i3] + gb4Var.c;
                                }
                            }
                            while (i < 8) {
                                int i4 = (i << 16) | 2;
                                if (iArr2[i] > ((!hb4Var.j || pq3.d()) ? TLObject.FLAG_20 : 262144)) {
                                    ConnectionsManager.getInstance(hb4Var.R).discardConnection(hb4Var.u0 ? hb4Var.y0 : hb4Var.T, i4);
                                }
                                i++;
                            }
                            break;
                        }
                    }
                }
                break;
        }
    }
}
