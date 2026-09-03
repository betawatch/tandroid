package wh;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                View y12 = this.b.y1(this.c);
                if (y12 instanceof v5) {
                    v5 v5Var = (v5) y12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 1:
                this.b.c3(this.c);
                break;
            case 2:
                this.b.c3(this.c);
                break;
            case 3:
                this.b.d3(this.c);
                break;
            case 4:
                this.b.c3(this.c);
                break;
            default:
                this.b.c3(this.c);
                break;
        }
    }
}
