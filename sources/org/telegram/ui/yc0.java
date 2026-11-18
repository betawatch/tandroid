package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class yc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hd0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yc0(hd0 hd0Var, int i7, int i10) {
        this.a = i10;
        this.b = hd0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new yc0(this.b, this.c, 1));
                break;
            case 1:
                this.b.z(this.c);
                break;
            default:
                this.b.f.f[this.c].D(1.0f);
                break;
        }
    }
}
