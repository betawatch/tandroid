package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ yf(bn bnVar, org.telegram.ui.ActionBar.u1[] u1VarArr, int i7, int i10) {
        this.a = i10;
        this.b = bnVar;
        this.c = u1VarArr;
        this.d = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.u1[] u1VarArr = this.c;
                org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
                if (u1Var != null) {
                    final int i7 = 1;
                    final bn bnVar = this.b;
                    final int i10 = this.d;
                    u1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.pg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i7) {
                                case 0:
                                    bnVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                                case 1:
                                    bnVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                                default:
                                    bnVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                            }
                        }
                    });
                    bnVar.showDialog(u1VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.u1[] u1VarArr2 = this.c;
                org.telegram.ui.ActionBar.u1 u1Var2 = u1VarArr2[0];
                if (u1Var2 != null) {
                    final int i11 = 0;
                    final bn bnVar2 = this.b;
                    final int i12 = this.d;
                    u1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.pg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i11) {
                                case 0:
                                    bnVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                                case 1:
                                    bnVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                                default:
                                    bnVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                            }
                        }
                    });
                    bnVar2.showDialog(u1VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.u1[] u1VarArr3 = this.c;
                org.telegram.ui.ActionBar.u1 u1Var3 = u1VarArr3[0];
                if (u1Var3 != null) {
                    final int i13 = 2;
                    final bn bnVar3 = this.b;
                    final int i14 = this.d;
                    u1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.pg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i13) {
                                case 0:
                                    bnVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                                case 1:
                                    bnVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                                default:
                                    bnVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                            }
                        }
                    });
                    bnVar3.showDialog(u1VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
