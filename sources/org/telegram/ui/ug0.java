package org.telegram.ui;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ug0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah0 b;

    public /* synthetic */ ug0(ah0 ah0Var, int i7) {
        this.a = i7;
        this.b = ah0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.v1(this.b.i1);
                break;
            default:
                org.telegram.messenger.g0.K3(this.b.j1.getEditText());
                break;
        }
    }
}
