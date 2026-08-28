package qh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.m9;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class i2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ i2(o3 o3Var, a aVar, int i9) {
        this.a = i9;
        this.b = o3Var;
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
                if (z12 instanceof s5) {
                    s5 s5Var = (s5) z12;
                    s5Var.B();
                    s5Var.getEditText().setSelection(0);
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
                o3 o3Var = this.b;
                KeyEvent.Callback z13 = o3Var.z1(this.c);
                if (z13 instanceof m9) {
                    o3Var.j3.c0(0, 0, (m9) z13);
                    break;
                }
                break;
            case 15:
                o3 o3Var2 = this.b;
                KeyEvent.Callback z14 = o3Var2.z1(this.c);
                if (z14 instanceof m9) {
                    o3Var2.j3.c0(0, z14 instanceof s5 ? ((s5) z14).getEditText().length() : 0, (m9) z14);
                    break;
                }
                break;
            case 16:
                this.b.f3(this.c);
                break;
            case 17:
                View z15 = this.b.z1(this.c);
                if (z15 instanceof s5) {
                    s5 s5Var2 = (s5) z15;
                    s5Var2.B();
                    s5Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View z16 = this.b.z1(this.c);
                if (!(z16 instanceof s5)) {
                    if (z16 instanceof f5) {
                        f5 f5Var = (f5) z16;
                        if (f5Var.getGrid().getChildCount() > 0) {
                            View childAt = f5Var.getGrid().getChildAt(0);
                            if (childAt instanceof i5) {
                                ((i5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    s5 s5Var3 = (s5) z16;
                    s5Var3.B();
                    s5Var3.getEditText().setSelection(s5Var3.getEditText().length());
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
                if (z18 instanceof s5) {
                    s5 s5Var4 = (s5) z18;
                    s5Var4.B();
                    s5Var4.getEditText().setSelection(0);
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
