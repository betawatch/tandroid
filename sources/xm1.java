// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class xm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ hd[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ xm1(mu1 mu1Var, hd[] hdVarArr, int i, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = hdVarArr;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        hd[] hdVarArr = this.c;
        final mu1 mu1Var = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    final byte b3 = 1;
                    hdVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pn1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b4 = b3;
                            int i2 = i;
                            mu1 mu1Var2 = mu1Var;
                            switch (b4) {
                                case 0:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                case 1:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                default:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                            }
                        }
                    });
                    mu1Var.showDialog(hdVarArr[0]);
                    break;
                }
                break;
            case 1:
                hd hdVar2 = hdVarArr[0];
                if (hdVar2 != null) {
                    hdVar2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pn1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b4 = b2;
                            int i2 = i;
                            mu1 mu1Var2 = mu1Var;
                            switch (b4) {
                                case 0:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                case 1:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                default:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                            }
                        }
                    });
                    mu1Var.showDialog(hdVarArr[0]);
                    break;
                }
                break;
            default:
                hd hdVar3 = hdVarArr[0];
                if (hdVar3 != null) {
                    final byte b4 = 2;
                    hdVar3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: pn1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b42 = b4;
                            int i2 = i;
                            mu1 mu1Var2 = mu1Var;
                            switch (b42) {
                                case 0:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                case 1:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                default:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                            }
                        }
                    });
                    mu1Var.showDialog(hdVarArr[0]);
                    break;
                }
                break;
        }
    }
}
