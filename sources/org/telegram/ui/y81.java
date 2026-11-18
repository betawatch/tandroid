package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y91 b;

    public /* synthetic */ y81(y91 y91Var, int i7) {
        this.a = i7;
        this.b = y91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                y91 y91Var = this.b;
                y91Var.B0();
                y91Var.F0();
                break;
            case 1:
                this.b.B0();
                break;
            case 2:
                this.b.S0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                y91 y91Var2 = this.b;
                y91Var2.B0 = null;
                y91Var2.Z0(true, false);
                break;
            default:
                y91 y91Var3 = this.b;
                y91Var3.O.postOnAnimation(new y81(y91Var3, 1));
                break;
        }
    }
}
