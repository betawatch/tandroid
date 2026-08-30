package vh;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ u2(r3 r3Var, a aVar, int i10) {
        this.a = i10;
        this.b = r3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View z12 = this.b.z1(this.c);
                if (z12 instanceof v5) {
                    v5 v5Var = (v5) z12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                this.b.d3(this.c);
                break;
            case 2:
                this.b.d3(this.c);
                break;
            case 3:
                this.b.e3(this.c);
                break;
            case 4:
                this.b.d3(this.c);
                break;
            default:
                this.b.d3(this.c);
                break;
        }
    }
}
