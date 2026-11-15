package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class wf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ wf(an anVar, org.telegram.ui.ActionBar.t1[] t1VarArr, int i7, int i10) {
        this.a = i10;
        this.b = anVar;
        this.c = t1VarArr;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.t1[] t1VarArr = this.c;
                org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
                if (t1Var != null) {
                    final int i7 = 1;
                    final an anVar = this.b;
                    final int i10 = this.d;
                    t1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ng
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i7) {
                                case 0:
                                    anVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                                case 1:
                                    anVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                                default:
                                    anVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                            }
                        }
                    });
                    anVar.showDialog(t1VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.t1[] t1VarArr2 = this.c;
                org.telegram.ui.ActionBar.t1 t1Var2 = t1VarArr2[0];
                if (t1Var2 != null) {
                    final int i11 = 0;
                    final an anVar2 = this.b;
                    final int i12 = this.d;
                    t1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ng
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i11) {
                                case 0:
                                    anVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                                case 1:
                                    anVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                                default:
                                    anVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                            }
                        }
                    });
                    anVar2.showDialog(t1VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.t1[] t1VarArr3 = this.c;
                org.telegram.ui.ActionBar.t1 t1Var3 = t1VarArr3[0];
                if (t1Var3 != null) {
                    final int i13 = 2;
                    final an anVar3 = this.b;
                    final int i14 = this.d;
                    t1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.ng
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i13) {
                                case 0:
                                    anVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                                case 1:
                                    anVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                                default:
                                    anVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                            }
                        }
                    });
                    anVar3.showDialog(t1VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
