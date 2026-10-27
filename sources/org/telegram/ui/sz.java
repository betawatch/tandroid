package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q00 b;

    public /* synthetic */ sz(q00 q00Var, int i10) {
        this.a = i10;
        this.b = q00Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                q00.W(this.b);
                break;
            default:
                q00.X(this.b);
                break;
        }
    }
}
