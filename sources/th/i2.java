package th;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.j9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ i2(p3 p3Var, a aVar, int i10) {
        this.a = i10;
        this.b = p3Var;
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
                if (z12 instanceof t5) {
                    t5 t5Var = (t5) z12;
                    t5Var.B();
                    t5Var.getEditText().setSelection(0);
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
                p3 p3Var = this.b;
                KeyEvent.Callback z13 = p3Var.z1(this.c);
                if (z13 instanceof j9) {
                    p3Var.j3.c0(0, 0, (j9) z13);
                    break;
                }
                break;
            case 15:
                p3 p3Var2 = this.b;
                KeyEvent.Callback z14 = p3Var2.z1(this.c);
                if (z14 instanceof j9) {
                    p3Var2.j3.c0(0, z14 instanceof t5 ? ((t5) z14).getEditText().length() : 0, (j9) z14);
                    break;
                }
                break;
            case 16:
                this.b.f3(this.c);
                break;
            case 17:
                View z15 = this.b.z1(this.c);
                if (z15 instanceof t5) {
                    t5 t5Var2 = (t5) z15;
                    t5Var2.B();
                    t5Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View z16 = this.b.z1(this.c);
                if (!(z16 instanceof t5)) {
                    if (z16 instanceof g5) {
                        g5 g5Var = (g5) z16;
                        if (g5Var.getGrid().getChildCount() > 0) {
                            View childAt = g5Var.getGrid().getChildAt(0);
                            if (childAt instanceof j5) {
                                ((j5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    t5 t5Var3 = (t5) z16;
                    t5Var3.B();
                    t5Var3.getEditText().setSelection(t5Var3.getEditText().length());
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
                if (z18 instanceof t5) {
                    t5 t5Var4 = (t5) z18;
                    t5Var4.B();
                    t5Var4.getEditText().setSelection(0);
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
