package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ wg(bo boVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = boVar;
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
                    final bo boVar = this.b;
                    final int i11 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.fh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    boVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    boVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    boVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    boVar.showDialog(b2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final int i12 = 1;
                    final bo boVar2 = this.b;
                    final int i13 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.fh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    boVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    boVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    boVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    boVar2.showDialog(b2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr3 = this.c;
                org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr3[0];
                if (b2Var3 != null) {
                    final int i14 = 2;
                    final bo boVar3 = this.b;
                    final int i15 = this.d;
                    b2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.fh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    boVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    boVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    boVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    boVar3.showDialog(b2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
