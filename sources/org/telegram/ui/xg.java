package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class xg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ xg(eo eoVar, org.telegram.ui.ActionBar.d2[] d2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = eoVar;
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
                    final eo eoVar = this.b;
                    final int i11 = this.d;
                    d2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    eoVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    eoVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    eoVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    eoVar.showDialog(d2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.d2[] d2VarArr2 = this.c;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2VarArr2[0];
                if (d2Var2 != null) {
                    final int i12 = 1;
                    final eo eoVar2 = this.b;
                    final int i13 = this.d;
                    d2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    eoVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    eoVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    eoVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    eoVar2.showDialog(d2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.d2[] d2VarArr3 = this.c;
                org.telegram.ui.ActionBar.d2 d2Var3 = d2VarArr3[0];
                if (d2Var3 != null) {
                    final int i14 = 2;
                    final eo eoVar3 = this.b;
                    final int i15 = this.d;
                    d2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    eoVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    eoVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    eoVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    eoVar3.showDialog(d2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
