package sg;

import a8.xa;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;
    public final /* synthetic */ xa c;

    public /* synthetic */ f0(i0 i0Var, xa xaVar, int i7) {
        this.a = i7;
        this.b = i0Var;
        this.c = xaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p(this.c, true);
                break;
            default:
                i0 i0Var = this.b;
                i0Var.f.f(new f0(i0Var, this.c, 0));
                break;
        }
    }
}
