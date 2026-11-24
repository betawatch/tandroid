// default package

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class q62 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ye9 b;

    public /* synthetic */ q62(ye9 ye9Var, byte b) {
        this.a = b;
        this.b = ye9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x016c, code lost:
    
        if (r3 <= (r1.getHeight() + r1.getTop())) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x013b, code lost:
    
        if (wi9.j(r1, r1.getLeft(), r1.getTop(), r0, r3) == false) goto L81;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b = this.a;
        ye9 ye9Var = this.b;
        switch (b) {
            case 0:
                ye9Var.y2();
                break;
            case 1:
                ye9Var.p3();
                break;
            case 2:
                if (ye9Var.F3 != null && !ye9Var.v3.w()) {
                    if (ye9Var.W4(ye9Var.F3, ye9Var.D3, ye9Var.E3)) {
                        ye9Var.I3 = true;
                        break;
                    } else {
                        int left = (int) ((ye9Var.D3 - ye9Var.F3.getLeft()) - ye9Var.getLeft());
                        int top = (int) ((ye9Var.E3 - ye9Var.F3.getTop()) - ye9Var.getTop());
                        View view = ye9Var.F3;
                        if (view instanceof pb9) {
                            pb9 pb9Var = (pb9) view;
                            pb9Var.getLocationOnScreen(new int[2]);
                            float f = r7[0] + left;
                            float f2 = r7[1] + top;
                            if (!pb9.g(pb9Var.x, f, f2) && !pb9.g(pb9Var.y, f, f2)) {
                                ArrayList arrayList = pb9Var.E;
                                int size = arrayList.size();
                                int i = 0;
                                while (i < size) {
                                    Object obj = arrayList.get(i);
                                    i++;
                                    if (pb9.g((mb9) obj, f, f2)) {
                                    }
                                }
                            }
                            ye9Var.I3 = true;
                            break;
                        }
                        View view2 = ye9Var.F3;
                        if (view2 instanceof ii9) {
                            ii9 ii9Var = (ii9) view2;
                            if (ye9Var.f3(ii9Var, left, top)) {
                                try {
                                    ii9Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                ye9Var.I3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell o = ii9Var.o(left, top);
                                if (o != null) {
                                    cs5 cs5Var = ye9Var.r4;
                                    if (cs5Var != null) {
                                        ye9Var.r4 = null;
                                        cs5Var.u();
                                    }
                                    ye9Var.b2(ii9Var);
                                    ye9Var.D0();
                                    ye9Var.requestDisallowInterceptTouchEvent(true);
                                    ye9Var.J3 = true;
                                    ye9Var.L3 = o;
                                    ye9Var.M3 = o;
                                    ii9Var.y(o, o);
                                    try {
                                        ii9Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    ye9Var.I3 = true;
                                    break;
                                } else {
                                    ye9Var.M4(ye9Var.F3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof wi9) {
                            wi9 wi9Var = (wi9) view2;
                            mc9 mc9Var = wi9Var.h;
                            mc9 mc9Var2 = wi9Var.f;
                            LinearLayout linearLayout = wi9Var.b;
                            if (!wi9.j(mc9Var2, mc9Var2.getLeft() + linearLayout.getLeft(), mc9Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (mc9Var.getVisibility() == 0) {
                                    break;
                                }
                                ye9Var.M4(ye9Var.F3);
                                break;
                            }
                            ye9Var.I3 = true;
                            break;
                        } else {
                            if (view2 instanceof ac9) {
                                mc9 mc9Var3 = ((ac9) view2).d;
                                if (mc9Var3.length() == 0 && left >= mc9Var3.getLeft()) {
                                    if (left <= mc9Var3.getWidth() + mc9Var3.getLeft() && top >= mc9Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            ye9Var.M4(ye9Var.F3);
                        }
                    }
                }
                break;
            case 3:
                me9 me9Var = ye9Var.v3;
                if (me9Var != null && me9Var.w()) {
                    for (int i2 = 0; i2 < ye9Var.getChildCount(); i2++) {
                        View childAt = ye9Var.getChildAt(i2);
                        if ((childAt instanceof wi9) || (childAt instanceof ii9) || (childAt instanceof tb9) || (childAt instanceof ac9)) {
                            childAt.invalidate();
                        }
                    }
                    me9Var.v();
                    break;
                }
                break;
            case 4:
                ye9Var.k3(true);
                break;
            default:
                ye9Var.W2();
                break;
        }
    }
}
