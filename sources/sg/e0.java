package sg;

import org.telegram.ui.Components.jn;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i0 b;

    public /* synthetic */ e0(i0 i0Var, int i7) {
        this.a = i7;
        this.b = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i0 i0Var = this.b;
                i0Var.c = null;
                jn jnVar = i0Var.a;
                if (jnVar != null) {
                    jnVar.l();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
