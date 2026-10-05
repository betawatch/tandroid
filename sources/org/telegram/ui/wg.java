package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ wg(yn ynVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = ynVar;
        this.c = b2VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.b2[] b2VarArr = this.c;
                org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
                if (b2Var != null) {
                    final int i10 = 0;
                    final yn ynVar = this.b;
                    final int i11 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.dh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    ynVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    ynVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    ynVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    ynVar.showDialog(b2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final int i12 = 1;
                    final yn ynVar2 = this.b;
                    final int i13 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.dh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    ynVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    ynVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    ynVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    ynVar2.showDialog(b2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr3 = this.c;
                org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr3[0];
                if (b2Var3 != null) {
                    final int i14 = 2;
                    final yn ynVar3 = this.b;
                    final int i15 = this.d;
                    b2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.dh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    ynVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    ynVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    ynVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    ynVar3.showDialog(b2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
