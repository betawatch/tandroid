package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
