package sg;

import org.telegram.ui.Components.hn;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                hn hnVar = i0Var.a;
                if (hnVar != null) {
                    hnVar.l();
                    break;
                }
                break;
            default:
                this.b.b();
                break;
        }
    }
}
