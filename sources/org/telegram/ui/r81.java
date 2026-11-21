package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w81 b;

    public /* synthetic */ r81(w81 w81Var, int i7) {
        this.a = i7;
        this.b = w81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                w81 w81Var = this.b;
                w81Var.getClass();
                new ug.y0((org.telegram.ui.ActionBar.g2) w81Var, 11, false).show();
                break;
            default:
                w81 w81Var2 = this.b;
                w81Var2.e.requestFocus();
                org.telegram.messenger.g0.I3(w81Var2.e);
                break;
        }
    }
}
