package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                q00.V(this.b);
                break;
            default:
                q00.W(this.b);
                break;
        }
    }
}
