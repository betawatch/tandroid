package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hp b;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2[] c;
    public final /* synthetic */ int d;

    public /* synthetic */ xo(hp hpVar, org.telegram.ui.ActionBar.c2[] c2VarArr, int i9, int i10) {
        this.a = i10;
        this.b = hpVar;
        this.c = c2VarArr;
        this.d = i9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.c2[] c2VarArr = this.c;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    final int i9 = 1;
                    final hp hpVar = this.b;
                    final int i10 = this.d;
                    c2Var.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.yo
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i9) {
                                case 0:
                                    ConnectionsManager.getInstance(hpVar.currentAccount).cancelRequest(i10, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(hpVar.currentAccount).cancelRequest(i10, true);
                                    break;
                            }
                        }
                    });
                    hpVar.showDialog(c2VarArr[0]);
                    break;
                }
                break;
            default:
                org.telegram.ui.ActionBar.c2[] c2VarArr2 = this.c;
                org.telegram.ui.ActionBar.c2 c2Var2 = c2VarArr2[0];
                if (c2Var2 != null) {
                    final int i11 = 0;
                    final hp hpVar2 = this.b;
                    final int i12 = this.d;
                    c2Var2.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: org.telegram.ui.yo
                        @Override // android.content.DialogInterface.OnCancelListener
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (i11) {
                                case 0:
                                    ConnectionsManager.getInstance(hpVar2.currentAccount).cancelRequest(i12, true);
                                    break;
                                default:
                                    ConnectionsManager.getInstance(hpVar2.currentAccount).cancelRequest(i12, true);
                                    break;
                            }
                        }
                    });
                    hpVar2.showDialog(c2VarArr2[0]);
                    break;
                }
                break;
        }
    }
}
