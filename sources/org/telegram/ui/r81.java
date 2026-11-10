package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x81 b;

    public /* synthetic */ r81(x81 x81Var, int i7) {
        this.a = i7;
        this.b = x81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                x81 x81Var = this.b;
                x81Var.getClass();
                new ug.w0((org.telegram.ui.ActionBar.f2) x81Var, 11, false).show();
                break;
            default:
                x81 x81Var2 = this.b;
                x81Var2.e.requestFocus();
                org.telegram.messenger.g0.K3(x81Var2.e);
                break;
        }
    }
}
