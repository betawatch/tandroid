package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class vi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bj0 b;

    public /* synthetic */ vi0(bj0 bj0Var, int i10) {
        this.a = i10;
        this.b = bj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.dismiss();
                break;
            case 1:
                this.b.V(true, false);
                break;
            default:
                this.b.V(true, false);
                break;
        }
    }
}
