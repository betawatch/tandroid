package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ zg(fo foVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = foVar;
        this.c = a2VarArr;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.a2[] a2VarArr = this.c;
                org.telegram.ui.ActionBar.a2 a2Var = a2VarArr[0];
                if (a2Var != null) {
                    final int i10 = 0;
                    final fo foVar = this.b;
                    final int i11 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.kh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    foVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    foVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    foVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    foVar.showDialog(a2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final int i12 = 1;
                    final fo foVar2 = this.b;
                    final int i13 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.kh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    foVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    foVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    foVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    foVar2.showDialog(a2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr3 = this.c;
                org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr3[0];
                if (a2Var3 != null) {
                    final int i14 = 2;
                    final fo foVar3 = this.b;
                    final int i15 = this.d;
                    a2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.kh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    foVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    foVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    foVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    foVar3.showDialog(a2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
