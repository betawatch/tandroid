package wh;

import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Cells.l9;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;
    public final /* synthetic */ a c;

    public /* synthetic */ k2(r3 r3Var, a aVar, int i10) {
        this.a = i10;
        this.b = r3Var;
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
                if (y12 instanceof v5) {
                    v5 v5Var = (v5) y12;
                    v5Var.B();
                    v5Var.getEditText().setSelection(0);
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
                r3 r3Var = this.b;
                KeyEvent.Callback y13 = r3Var.y1(this.c);
                if (y13 instanceof l9) {
                    r3Var.k3.c0(0, 0, (l9) y13);
                    break;
                }
                break;
            case 15:
                r3 r3Var2 = this.b;
                KeyEvent.Callback y14 = r3Var2.y1(this.c);
                if (y14 instanceof l9) {
                    r3Var2.k3.c0(0, y14 instanceof v5 ? ((v5) y14).getEditText().length() : 0, (l9) y14);
                    break;
                }
                break;
            case 16:
                this.b.e3(this.c);
                break;
            case 17:
                View y15 = this.b.y1(this.c);
                if (y15 instanceof v5) {
                    v5 v5Var2 = (v5) y15;
                    v5Var2.B();
                    v5Var2.getEditText().setSelection(0);
                    break;
                }
                break;
            case 18:
                View y16 = this.b.y1(this.c);
                if (!(y16 instanceof v5)) {
                    if (y16 instanceof i5) {
                        i5 i5Var = (i5) y16;
                        if (i5Var.getGrid().getChildCount() > 0) {
                            View childAt = i5Var.getGrid().getChildAt(0);
                            if (childAt instanceof l5) {
                                ((l5) childAt).a.r();
                                break;
                            }
                        }
                    }
                } else {
                    v5 v5Var3 = (v5) y16;
                    v5Var3.B();
                    v5Var3.getEditText().setSelection(v5Var3.getEditText().length());
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
                if (y18 instanceof v5) {
                    v5 v5Var4 = (v5) y18;
                    v5Var4.B();
                    v5Var4.getEditText().setSelection(0);
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
