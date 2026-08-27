package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni0 b;

    public /* synthetic */ sh0(ni0 ni0Var, int i10) {
        this.a = i10;
        this.b = ni0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                ni0 ni0Var = this.b;
                ni0Var.getClass();
                eh.j.f(false);
                eh.j jVar = ni0Var.e0;
                if (jVar != null) {
                    jVar.b(ni0Var.B);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var, 0));
                break;
            case 2:
                eh.j.f(false);
                ni0 ni0Var2 = this.b;
                eh.j jVar2 = ni0Var2.e0;
                if (jVar2 != null) {
                    jVar2.b(ni0Var2.B);
                }
                AndroidUtilities.runOnUIThread(new sh0(ni0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
