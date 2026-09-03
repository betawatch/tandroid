package vh;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;
    public final /* synthetic */ a c;
    public final /* synthetic */ int d;

    public /* synthetic */ m2(s3 s3Var, a aVar, int i10, int i11) {
        this.a = i11;
        this.b = s3Var;
        this.c = aVar;
        this.d = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View y12;
        View y13;
        switch (this.a) {
            case 0:
                s3 s3Var = this.b;
                a aVar = this.c;
                if (aVar == null) {
                    s3Var.getClass();
                    y12 = null;
                } else {
                    y12 = s3Var.y1(aVar);
                }
                if (y12 instanceof w5) {
                    w5 w5Var = (w5) y12;
                    w5Var.B();
                    w5Var.getEditText().setSelection(Math.min(this.d, w5Var.getEditText().length()));
                    break;
                }
                break;
            case 1:
                s3 s3Var2 = this.b;
                a aVar2 = this.c;
                if (aVar2 == null) {
                    s3Var2.getClass();
                    y13 = null;
                } else {
                    y13 = s3Var2.y1(aVar2);
                }
                if (y13 instanceof w5) {
                    w5 w5Var2 = (w5) y13;
                    w5Var2.B();
                    w5Var2.getEditText().setSelection(Math.min(this.d, w5Var2.getEditText().length()));
                    break;
                }
                break;
            case 2:
                View y14 = this.b.y1(this.c);
                if (y14 instanceof w5) {
                    w5 w5Var3 = (w5) y14;
                    w5Var3.B();
                    w5Var3.getEditText().setSelection(Math.max(0, Math.min(this.d, w5Var3.getEditText().length())));
                    break;
                }
                break;
            case 3:
                View y15 = this.b.y1(this.c);
                if (y15 instanceof w5) {
                    w5 w5Var4 = (w5) y15;
                    w5Var4.B();
                    w5Var4.getEditText().setSelection(Math.max(0, Math.min(this.d, w5Var4.getEditText().length())));
                    break;
                }
                break;
            case 4:
                View y16 = this.b.y1(this.c);
                if (y16 instanceof w5) {
                    w5 w5Var5 = (w5) y16;
                    w5Var5.B();
                    w5Var5.getEditText().setSelection(Math.max(0, Math.min(this.d, w5Var5.getEditText().length())));
                    break;
                }
                break;
            default:
                View y17 = this.b.y1(this.c);
                if (y17 instanceof w5) {
                    w5 w5Var6 = (w5) y17;
                    w5Var6.B();
                    w5Var6.getEditText().setSelection(Math.max(0, Math.min(this.d, w5Var6.getEditText().length())));
                    break;
                }
                break;
        }
    }
}
