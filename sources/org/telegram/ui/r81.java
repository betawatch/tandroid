package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                new ug.z0((org.telegram.ui.ActionBar.h2) w81Var, 11, false).show();
                break;
            default:
                w81 w81Var2 = this.b;
                w81Var2.e.requestFocus();
                org.telegram.messenger.g0.I3(w81Var2.e);
                break;
        }
    }
}
