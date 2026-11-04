package org.telegram.ui;

import android.content.DialogInterface;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm b;
    public final /* synthetic */ org.telegram.ui.ActionBar.s1[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ xf(wm wmVar, org.telegram.ui.ActionBar.s1[] s1VarArr, int i3, int i10) {
        this.a = i10;
        this.b = wmVar;
        this.c = s1VarArr;
        this.d = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.s1[] s1VarArr = this.c;
                org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
                if (s1Var != null) {
                    final int i3 = 0;
                    final wm wmVar = this.b;
                    final int i10 = this.d;
                    s1Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.jg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i3) {
                                case 0:
                                    wmVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                                case 1:
                                    wmVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                                default:
                                    wmVar.getConnectionsManager().cancelRequest(i10, true);
                                    break;
                            }
                        }
                    });
                    wmVar.showDialog(s1VarArr[0]);
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.s1[] s1VarArr2 = this.c;
                org.telegram.ui.ActionBar.s1 s1Var2 = s1VarArr2[0];
                if (s1Var2 != null) {
                    final int i11 = 1;
                    final wm wmVar2 = this.b;
                    final int i12 = this.d;
                    s1Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.jg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i11) {
                                case 0:
                                    wmVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                                case 1:
                                    wmVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                                default:
                                    wmVar2.getConnectionsManager().cancelRequest(i12, true);
                                    break;
                            }
                        }
                    });
                    wmVar2.showDialog(s1VarArr2[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.s1[] s1VarArr3 = this.c;
                org.telegram.ui.ActionBar.s1 s1Var3 = s1VarArr3[0];
                if (s1Var3 != null) {
                    final int i13 = 2;
                    final wm wmVar3 = this.b;
                    final int i14 = this.d;
                    s1Var3.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.jg
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i13) {
                                case 0:
                                    wmVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                                case 1:
                                    wmVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                                default:
                                    wmVar3.getConnectionsManager().cancelRequest(i14, true);
                                    break;
                            }
                        }
                    });
                    wmVar3.showDialog(s1VarArr3[0]);
                    break;
                }
                break;
        }
    }
}
