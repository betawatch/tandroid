package rh;

import org.telegram.messenger.cs;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x implements cs {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.messenger.cs
    public final void a(int i10) {
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.b;
                b0Var.getClass();
                b0Var.f1(sf.a.i(0L, i10 == 0 ? sf.b.a : sf.b.b), true, false, true);
                b0Var.W1.setText("");
                break;
            case 1:
                e0 e0Var = (e0) this.b;
                e0Var.getClass();
                e0Var.M0(sf.a.i(0L, i10 == 0 ? sf.b.a : sf.b.b), true, false, true);
                e0Var.n1.setText("");
                break;
            default:
                g3 g3Var = (g3) this.b;
                g3Var.getClass();
                g3Var.q = i10 == 0 ? sf.b.a : sf.b.b;
                g3Var.a(true);
                break;
        }
    }
}
