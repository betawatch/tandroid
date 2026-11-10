package zh;

import org.telegram.messenger.c20;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;
    public final /* synthetic */ c20 c;

    public /* synthetic */ l0(g1 g1Var, c20 c20Var, int i7) {
        this.a = i7;
        this.b = g1Var;
        this.c = c20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g1 g1Var = this.b;
                c20 c20Var = this.c;
                if (c20Var != null) {
                    g1Var.getClass();
                    c20Var.a(Boolean.FALSE);
                }
                g1Var.dismiss();
                break;
            case 1:
                g1 g1Var2 = this.b;
                c20 c20Var2 = this.c;
                if (c20Var2 != null) {
                    g1Var2.getClass();
                    c20Var2.a(Boolean.FALSE);
                }
                g1Var2.dismiss();
                break;
            default:
                g1 g1Var3 = this.b;
                c20 c20Var3 = this.c;
                if (c20Var3 != null) {
                    g1Var3.getClass();
                    c20Var3.a(Boolean.FALSE);
                }
                g1Var3.dismiss();
                break;
        }
    }
}
