package qh;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.x60;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o3 b;

    public /* synthetic */ b(o3 o3Var, int i9) {
        this.a = i9;
        this.b = o3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (qh.s5.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                o3 o3Var = this.b;
                if (o3Var.t3 != null && !o3Var.j3.y()) {
                    if (o3Var.T4(o3Var.t3, o3Var.r3, o3Var.s3)) {
                        o3Var.w3 = true;
                        break;
                    } else {
                        int left = (int) ((o3Var.r3 - o3Var.t3.getLeft()) - o3Var.getLeft());
                        int top = (int) ((o3Var.s3 - o3Var.t3.getTop()) - o3Var.getTop());
                        View view = o3Var.t3;
                        if (view instanceof e0) {
                            e0 e0Var = (e0) view;
                            e0Var.getLocationOnScreen(new int[2]);
                            float f10 = r8[0] + left;
                            float f11 = r8[1] + top;
                            if (!e0.h(e0Var.w, f10, f11) && !e0.h(e0Var.x, f10, f11)) {
                                ArrayList arrayList = e0Var.y;
                                int size = arrayList.size();
                                int i9 = 0;
                                while (i9 < size) {
                                    Object obj = arrayList.get(i9);
                                    i9++;
                                    if (e0.h((b0) obj, f10, f11)) {
                                    }
                                }
                            }
                            o3Var.w3 = true;
                            break;
                        }
                        View view2 = o3Var.t3;
                        if (view2 instanceof f5) {
                            f5 f5Var = (f5) view2;
                            if (o3Var.j3(f5Var, left, top)) {
                                try {
                                    f5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                o3Var.w3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell m10 = f5Var.m(left, top);
                                if (m10 != null) {
                                    x60 x60Var = o3Var.f4;
                                    if (x60Var != null) {
                                        o3Var.f4 = null;
                                        x60Var.u();
                                    }
                                    o3Var.g2(f5Var);
                                    o3Var.B0();
                                    o3Var.requestDisallowInterceptTouchEvent(true);
                                    o3Var.x3 = true;
                                    o3Var.z3 = m10;
                                    o3Var.A3 = m10;
                                    f5Var.w(m10, m10);
                                    try {
                                        f5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    o3Var.w3 = true;
                                    break;
                                } else {
                                    o3Var.J4(o3Var.t3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof s5) {
                            s5 s5Var = (s5) view2;
                            d1 d1Var = s5Var.h;
                            d1 d1Var2 = s5Var.f;
                            LinearLayout linearLayout = s5Var.b;
                            if (!s5.m(d1Var2, d1Var2.getLeft() + linearLayout.getLeft(), d1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (d1Var.getVisibility() == 0) {
                                    break;
                                }
                                o3Var.J4(o3Var.t3);
                                break;
                            }
                            o3Var.w3 = true;
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
                            o3Var.J4(o3Var.t3);
                        }
                    }
                }
                break;
            case 3:
                o3 o3Var2 = this.b;
                c3 c3Var = o3Var2.j3;
                if (c3Var != null && c3Var.y()) {
                    for (int i10 = 0; i10 < o3Var2.getChildCount(); i10++) {
                        View childAt = o3Var2.getChildAt(i10);
                        if ((childAt instanceof s5) || (childAt instanceof f5) || (childAt instanceof i0) || (childAt instanceof q0)) {
                            childAt.invalidate();
                        }
                    }
                    c3Var.x();
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
