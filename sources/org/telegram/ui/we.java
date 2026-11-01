package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;
    public final /* synthetic */ org.telegram.ui.Components.ol0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ we(un unVar, org.telegram.ui.Components.ol0 ol0Var, String str, int i10) {
        this.a = i10;
        this.b = unVar;
        this.c = ol0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.cc a02;
        int i10;
        int i11 = this.a;
        String str = this.d;
        org.telegram.ui.Components.ol0 ol0Var = this.c;
        un unVar = this.b;
        switch (i11) {
            case 0:
                ol0Var.dismiss();
                org.telegram.messenger.i0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131746350;
                break;
            case 1:
                ol0Var.dismiss();
                org.telegram.messenger.i0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131743227;
                break;
            case 2:
                ol0Var.dismiss();
                org.telegram.messenger.i0.g(str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131752553;
                break;
            default:
                ol0Var.dismiss();
                org.telegram.messenger.i0.g("@" + str);
                a02 = org.telegram.ui.Components.cc.a0(unVar);
                i10 = 2131743691;
                break;
        }
        org.telegram.messenger.a30.r(null, i10, a02);
    }
}
