package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ tg(wn wnVar, org.telegram.ui.ActionBar.a2[] a2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = wnVar;
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
                    final int i10 = 1;
                    final wn wnVar = this.b;
                    final int i11 = this.d;
                    a2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ih
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    wnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    wnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    wnVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    wnVar.showDialog(a2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.a2[] a2VarArr2 = this.c;
                org.telegram.ui.ActionBar.a2 a2Var2 = a2VarArr2[0];
                if (a2Var2 != null) {
                    final int i12 = 0;
                    final wn wnVar2 = this.b;
                    final int i13 = this.d;
                    a2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ih
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    wnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    wnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    wnVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    wnVar2.showDialog(a2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.a2[] a2VarArr3 = this.c;
                org.telegram.ui.ActionBar.a2 a2Var3 = a2VarArr3[0];
                if (a2Var3 != null) {
                    final int i14 = 2;
                    final wn wnVar3 = this.b;
                    final int i15 = this.d;
                    a2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ih
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    wnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    wnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    wnVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    wnVar3.showDialog(a2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
