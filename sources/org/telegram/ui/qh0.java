package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li0 b;

    public /* synthetic */ qh0(li0 li0Var, int i9) {
        this.a = i9;
        this.b = li0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                li0 li0Var = this.b;
                li0Var.getClass();
                dh.k.f(false);
                dh.k kVar = li0Var.e0;
                if (kVar != null) {
                    kVar.b(li0Var.B);
                }
                AndroidUtilities.runOnUIThread(new qh0(li0Var, 0));
                break;
            case 2:
                dh.k.f(false);
                li0 li0Var2 = this.b;
                dh.k kVar2 = li0Var2.e0;
                if (kVar2 != null) {
                    kVar2.b(li0Var2.B);
                }
                AndroidUtilities.runOnUIThread(new qh0(li0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
