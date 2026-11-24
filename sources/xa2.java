// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xa2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ib2 b;
    public final /* synthetic */ he[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ xa2(ib2 ib2Var, he[] heVarArr, int i, byte b) {
        this.a = b;
        this.b = ib2Var;
        this.c = heVarArr;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        he[] heVarArr = this.c;
        final ib2 ib2Var = this.b;
        final byte b2 = 0;
        switch (b) {
            case 0:
                he heVar = heVarArr[0];
                if (heVar != null) {
                    final byte b3 = 1;
                    heVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ya2
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b4 = b3;
                            int i2 = i;
                            ib2 ib2Var2 = ib2Var;
                            switch (b4) {
                                case 0:
                                    ib2Var2.c0(i2);
                                    break;
                                default:
                                    ib2Var2.a0(i2);
                                    break;
                            }
                        }
                    });
                    ib2Var.showDialog(heVarArr[0]);
                    break;
                }
                break;
            default:
                he heVar2 = heVarArr[0];
                if (heVar2 != null) {
                    heVar2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: ya2
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b4 = b2;
                            int i2 = i;
                            ib2 ib2Var2 = ib2Var;
                            switch (b4) {
                                case 0:
                                    ib2Var2.c0(i2);
                                    break;
                                default:
                                    ib2Var2.a0(i2);
                                    break;
                            }
                        }
                    });
                    ib2Var.showDialog(heVarArr[0]);
                    break;
                }
                break;
        }
    }
}
