package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ rg(zn znVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = znVar;
        this.c = d2VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.d2[] d2VarArr = this.c;
                org.telegram.ui.ActionBar.d2 d2Var = d2VarArr[0];
                if (d2Var != null) {
                    final int i10 = 0;
                    final zn znVar = this.b;
                    final int i11 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ah
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    znVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    znVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    znVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    znVar.showDialog(d2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.c;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final int i12 = 1;
                    final zn znVar2 = this.b;
                    final int i13 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ah
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    znVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    znVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    znVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    znVar2.showDialog(d2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr3 = this.c;
                org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr3[0];
                if (d2Var3 != null) {
                    final int i14 = 2;
                    final zn znVar3 = this.b;
                    final int i15 = this.d;
                    d2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ah
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    znVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    znVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    znVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    znVar3.showDialog(d2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
