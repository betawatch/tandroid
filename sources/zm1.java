// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zm1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;
    public final /* synthetic */ id[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ zm1(zu1 zu1Var, id[] idVarArr, int i, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = idVarArr;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        id[] idVarArr = this.c;
        final zu1 zu1Var = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                id idVar = idVarArr[0];
                if (idVar != null) {
                    idVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xn1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b3 = b2;
                            int i2 = i;
                            zu1 zu1Var2 = zu1Var;
                            switch (b3) {
                                case 0:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                case 1:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                default:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                            }
                        }
                    });
                    zu1Var.showDialog(idVarArr[0]);
                    break;
                }
                break;
            case 1:
                id idVar2 = idVarArr[0];
                if (idVar2 != null) {
                    final byte b3 = 1;
                    idVar2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xn1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b32 = b3;
                            int i2 = i;
                            zu1 zu1Var2 = zu1Var;
                            switch (b32) {
                                case 0:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                case 1:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                default:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                            }
                        }
                    });
                    zu1Var.showDialog(idVarArr[0]);
                    break;
                }
                break;
            default:
                id idVar3 = idVarArr[0];
                if (idVar3 != null) {
                    final byte b4 = 2;
                    idVar3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xn1
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b32 = b4;
                            int i2 = i;
                            zu1 zu1Var2 = zu1Var;
                            switch (b32) {
                                case 0:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                case 1:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                                default:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    break;
                            }
                        }
                    });
                    zu1Var.showDialog(idVarArr[0]);
                    break;
                }
                break;
        }
    }
}
