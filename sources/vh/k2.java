package vh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ k2(s3 s3Var, a aVar, int i10) {
        this.a = i10;
        this.b = s3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c3(this.c);
                break;
            case 1:
                View y12 = this.b.y1(this.c);
                if (y12 instanceof w5) {
                    w5 w5Var = (w5) y12;
                    w5Var.B();
                    w5Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 2:
                this.b.c3(this.c);
                break;
            case 3:
                this.b.b3(this.c, true);
                break;
            case 4:
                this.b.b3(this.c, false);
                break;
            case 5:
                this.b.b3(this.c, true);
                break;
            case 6:
                this.b.c3(this.c);
                break;
            case 7:
                this.b.a3(this.c, false);
                break;
            case 8:
                this.b.a3(this.c, true);
                break;
            case 9:
                this.b.c3(this.c);
                break;
            case 10:
                this.b.a3(this.c, true);
                break;
            case 11:
                this.b.c3(this.c);
                break;
            case 12:
                this.b.b3(this.c, false);
                break;
            case 13:
                this.b.a3(this.c, true);
                break;
            case 14:
                s3 s3Var = this.b;
                KeyEvent.Callback y13 = s3Var.y1(this.c);
                if (y13 instanceof k9) {
                    s3Var.k3.c0(0, 0, (k9) y13);
                    break;
                }
                break;
            case 15:
                s3 s3Var2 = this.b;
                KeyEvent.Callback y14 = s3Var2.y1(this.c);
                if (y14 instanceof k9) {
                    s3Var2.k3.c0(0, y14 instanceof w5 ? ((w5) y14).getEditText().length() : 0, (k9) y14);
                    break;
                }
                break;
            case 16:
                this.b.e3(this.c);
                break;
            case 17:
                View y15 = this.b.y1(this.c);
                if (y15 instanceof w5) {
                    w5 w5Var2 = (w5) y15;
                    w5Var2.B();
                    w5Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View y16 = this.b.y1(this.c);
                if (!(y16 instanceof w5)) {
                    if (y16 instanceof j5) {
                        j5 j5Var = (j5) y16;
                        if (j5Var.getGrid().getChildCount() > 0) {
                            View childAt = j5Var.getGrid().getChildAt(0);
                            if (childAt instanceof m5) {
                                ((m5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    w5 w5Var3 = (w5) y16;
                    w5Var3.B();
                    w5Var3.getEditText().setSelection(w5Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.d3(this.c);
                break;
            case 20:
                View y17 = this.b.y1(this.c);
                if (y17 instanceof r0) {
                    ((r0) y17).d.r();
                    break;
                }
                break;
            case 21:
                this.b.d3(this.c);
                break;
            case 22:
                this.b.d3(this.c);
                break;
            case 23:
                View y18 = this.b.y1(this.c);
                if (y18 instanceof w5) {
                    w5 w5Var4 = (w5) y18;
                    w5Var4.B();
                    w5Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                this.b.c3(this.c);
                break;
            case 25:
                this.b.Y4("", this.c);
                break;
            case 26:
                this.b.c3(this.c);
                break;
            case 27:
                this.b.c3(this.c);
                break;
            case 28:
                this.b.c3(this.c);
                break;
            default:
                this.b.c3(this.c);
                break;
        }
    }
}
