package th;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.j70;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p3 b;

    public /* synthetic */ b(p3 p3Var, int i10) {
        this.a = i10;
        this.b = p3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (th.t5.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.C2();
                break;
            case 1:
                this.b.t3();
                break;
            case 2:
                p3 p3Var = this.b;
                if (p3Var.t3 != null && !p3Var.j3.y()) {
                    if (p3Var.T4(p3Var.t3, p3Var.r3, p3Var.s3)) {
                        p3Var.w3 = true;
                        break;
                    } else {
                        int left = (int) ((p3Var.r3 - p3Var.t3.getLeft()) - p3Var.getLeft());
                        int top = (int) ((p3Var.s3 - p3Var.t3.getTop()) - p3Var.getTop());
                        View view = p3Var.t3;
                        if (view instanceof e0) {
                            e0 e0Var = (e0) view;
                            e0Var.getLocationOnScreen(new int[2]);
                            float f9 = r8[0] + left;
                            float f10 = r8[1] + top;
                            if (!e0.h(e0Var.w, f9, f10) && !e0.h(e0Var.x, f9, f10)) {
                                ArrayList arrayList = e0Var.y;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    if (e0.h((b0) obj, f9, f10)) {
                                    }
                                }
                            }
                            p3Var.w3 = true;
                            break;
                        }
                        View view2 = p3Var.t3;
                        if (view2 instanceof g5) {
                            g5 g5Var = (g5) view2;
                            if (p3Var.j3(g5Var, left, top)) {
                                try {
                                    g5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                p3Var.w3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell m10 = g5Var.m(left, top);
                                if (m10 != null) {
                                    j70 j70Var = p3Var.f4;
                                    if (j70Var != null) {
                                        p3Var.f4 = null;
                                        j70Var.u();
                                    }
                                    p3Var.g2(g5Var);
                                    p3Var.B0();
                                    p3Var.requestDisallowInterceptTouchEvent(true);
                                    p3Var.x3 = true;
                                    p3Var.z3 = m10;
                                    p3Var.A3 = m10;
                                    g5Var.w(m10, m10);
                                    try {
                                        g5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    p3Var.w3 = true;
                                    break;
                                } else {
                                    p3Var.J4(p3Var.t3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof t5) {
                            t5 t5Var = (t5) view2;
                            d1 d1Var = t5Var.h;
                            d1 d1Var2 = t5Var.f;
                            LinearLayout linearLayout = t5Var.b;
                            if (!t5.m(d1Var2, d1Var2.getLeft() + linearLayout.getLeft(), d1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (d1Var.getVisibility() == 0) {
                                    break;
                                }
                                p3Var.J4(p3Var.t3);
                                break;
                            }
                            p3Var.w3 = true;
                            break;
                        } else {
                            if (view2 instanceof q0) {
                                d1 d1Var3 = ((q0) view2).d;
                                if (d1Var3.length() == 0 && left >= d1Var3.getLeft()) {
                                    if (left <= d1Var3.getWidth() + d1Var3.getLeft() && top >= d1Var3.getTop()) {
                                        break;
                                    }
                                }
                            }
                            p3Var.J4(p3Var.t3);
                        }
                    }
                }
                break;
            case 3:
                p3 p3Var2 = this.b;
                d3 d3Var = p3Var2.j3;
                if (d3Var != null && d3Var.y()) {
                    for (int i11 = 0; i11 < p3Var2.getChildCount(); i11++) {
                        View childAt = p3Var2.getChildAt(i11);
                        if ((childAt instanceof t5) || (childAt instanceof g5) || (childAt instanceof i0) || (childAt instanceof q0)) {
                            childAt.invalidate();
                        }
                    }
                    d3Var.x();
                    break;
                }
                break;
            case 4:
                this.b.o3(true);
                break;
            default:
                this.b.a3();
                break;
        }
    }
}
