package vh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.l9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ j2(r3 r3Var, a aVar, int i10) {
        this.a = i10;
        this.b = r3Var;
        this.c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d3(this.c);
                break;
            case 1:
                View z12 = this.b.z1(this.c);
                if (z12 instanceof v5) {
                    v5 v5Var = (v5) z12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(0);
                    break;
                }
                break;
            case 2:
                this.b.d3(this.c);
                break;
            case 3:
                this.b.c3(this.c, true);
                break;
            case 4:
                this.b.c3(this.c, false);
                break;
            case 5:
                this.b.c3(this.c, true);
                break;
            case 6:
                this.b.d3(this.c);
                break;
            case 7:
                this.b.b3(this.c, false);
                break;
            case 8:
                this.b.b3(this.c, true);
                break;
            case 9:
                this.b.d3(this.c);
                break;
            case 10:
                this.b.b3(this.c, true);
                break;
            case 11:
                this.b.d3(this.c);
                break;
            case 12:
                this.b.c3(this.c, false);
                break;
            case 13:
                this.b.b3(this.c, true);
                break;
            case 14:
                r3 r3Var = this.b;
                KeyEvent.Callback z13 = r3Var.z1(this.c);
                if (z13 instanceof l9) {
                    r3Var.k3.c0(0, 0, (l9) z13);
                    break;
                }
                break;
            case 15:
                r3 r3Var2 = this.b;
                KeyEvent.Callback z14 = r3Var2.z1(this.c);
                if (z14 instanceof l9) {
                    r3Var2.k3.c0(0, z14 instanceof v5 ? ((v5) z14).getEditText().length() : 0, (l9) z14);
                    break;
                }
                break;
            case 16:
                this.b.f3(this.c);
                break;
            case 17:
                View z15 = this.b.z1(this.c);
                if (z15 instanceof v5) {
                    v5 v5Var2 = (v5) z15;
                    v5Var2.B();
                    v5Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View z16 = this.b.z1(this.c);
                if (!(z16 instanceof v5)) {
                    if (z16 instanceof i5) {
                        i5 i5Var = (i5) z16;
                        if (i5Var.getGrid().getChildCount() > 0) {
                            View childAt = i5Var.getGrid().getChildAt(0);
                            if (childAt instanceof l5) {
                                ((l5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    v5 v5Var3 = (v5) z16;
                    v5Var3.B();
                    v5Var3.getEditText().setSelection(v5Var3.getEditText().length());
                    break;
                }
                break;
            case 19:
                this.b.e3(this.c);
                break;
            case 20:
                View z17 = this.b.z1(this.c);
                if (z17 instanceof q0) {
                    ((q0) z17).d.r();
                    break;
                }
                break;
            case 21:
                this.b.e3(this.c);
                break;
            case 22:
                this.b.e3(this.c);
                break;
            case 23:
                View z18 = this.b.z1(this.c);
                if (z18 instanceof v5) {
                    v5 v5Var4 = (v5) z18;
                    v5Var4.B();
                    v5Var4.getEditText().setSelection(0);
                    break;
                }
                break;
            case 24:
                this.b.d3(this.c);
                break;
            case 25:
                this.b.Z4("", this.c);
                break;
            case 26:
                this.b.d3(this.c);
                break;
            case 27:
                this.b.d3(this.c);
                break;
            case 28:
                this.b.d3(this.c);
                break;
            default:
                this.b.d3(this.c);
                break;
        }
    }
}
