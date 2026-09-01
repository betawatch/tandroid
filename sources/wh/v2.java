package wh;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ v2(r3 r3Var, a aVar, int i10) {
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
