package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class wg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;
    public final /* synthetic */ org.telegram.ui.ActionBar.b2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ wg(co coVar, org.telegram.ui.ActionBar.b2[] b2VarArr, int i10, int i11) {
        this.a = i11;
        this.b = coVar;
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
                    final co coVar = this.b;
                    final int i11 = this.d;
                    b2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i10) {
                                case 0:
                                    coVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                case 1:
                                    coVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                                default:
                                    coVar.getConnectionsManager().cancelRequest(i11, true);
                                    break;
                            }
                        }
                    });
                    coVar.showDialog(b2VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.b2[] b2VarArr2 = this.c;
                org.telegram.ui.ActionBar.b2 b2Var2 = b2VarArr2[0];
                if (b2Var2 != null) {
                    final int i12 = 1;
                    final co coVar2 = this.b;
                    final int i13 = this.d;
                    b2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i12) {
                                case 0:
                                    coVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                case 1:
                                    coVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                                default:
                                    coVar2.getConnectionsManager().cancelRequest(i13, true);
                                    break;
                            }
                        }
                    });
                    coVar2.showDialog(b2VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.b2[] b2VarArr3 = this.c;
                org.telegram.ui.ActionBar.b2 b2Var3 = b2VarArr3[0];
                if (b2Var3 != null) {
                    final int i14 = 2;
                    final co coVar3 = this.b;
                    final int i15 = this.d;
                    b2Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.gh
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i14) {
                                case 0:
                                    coVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                case 1:
                                    coVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                                default:
                                    coVar3.getConnectionsManager().cancelRequest(i15, true);
                                    break;
                            }
                        }
                    });
                    coVar3.showDialog(b2VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
