// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class xfa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    public /* synthetic */ xfa(id[] idVarArr, int i, int i2, byte b) {
        this.a = b;
        this.b = idVarArr;
        this.c = i;
        this.d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        final int i2 = this.c;
        id[] idVarArr = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                id idVar = idVarArr[0];
                if (idVar != null) {
                    idVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: zfa
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (b2) {
                                case 0:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    break;
                            }
                        }
                    });
                    idVarArr[0].show();
                    break;
                }
                break;
            default:
                id idVar2 = idVarArr[0];
                if (idVar2 != null) {
                    final byte b3 = 1;
                    idVar2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: zfa
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (b3) {
                                case 0:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    break;
                            }
                        }
                    });
                    idVarArr[0].show();
                    break;
                }
                break;
        }
    }
}
