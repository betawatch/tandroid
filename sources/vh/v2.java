package vh;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ v2(s3 s3Var, a aVar, int i10) {
        this.a = i10;
        this.b = s3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                View y12 = this.b.y1(this.c);
                if (y12 instanceof w5) {
                    w5 w5Var = (w5) y12;
                    w5Var.B();
                    w5Var.getEditText().setSelection(0);
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
