package vh;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.o70;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r3 b;

    public /* synthetic */ b(r3 r3Var, int i10) {
        this.a = i10;
        this.b = r3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (vh.v5.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                r3 r3Var = this.b;
                if (r3Var.u3 != null && !r3Var.k3.y()) {
                    if (r3Var.T4(r3Var.u3, r3Var.s3, r3Var.t3)) {
                        r3Var.x3 = true;
                        break;
                    } else {
                        int left = (int) ((r3Var.s3 - r3Var.u3.getLeft()) - r3Var.getLeft());
                        int top = (int) ((r3Var.t3 - r3Var.u3.getTop()) - r3Var.getTop());
                        View view = r3Var.u3;
                        if (view instanceof e0) {
                            e0 e0Var = (e0) view;
                            e0Var.getLocationOnScreen(new int[2]);
                            float f10 = r8[0] + left;
                            float f11 = r8[1] + top;
                            if (!e0.h(e0Var.w, f10, f11) && !e0.h(e0Var.x, f10, f11)) {
                                ArrayList arrayList = e0Var.y;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    if (e0.h((b0) obj, f10, f11)) {
                                    }
                                }
                            }
                            r3Var.x3 = true;
                            break;
                        }
                        View view2 = r3Var.u3;
                        if (view2 instanceof i5) {
                            i5 i5Var = (i5) view2;
                            if (r3Var.j3(i5Var, left, top)) {
                                try {
                                    i5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                r3Var.x3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell m9 = i5Var.m(left, top);
                                if (m9 != null) {
                                    o70 o70Var = r3Var.g4;
                                    if (o70Var != null) {
                                        r3Var.g4 = null;
                                        o70Var.u();
                                    }
                                    r3Var.g2(i5Var);
                                    r3Var.B0();
                                    r3Var.requestDisallowInterceptTouchEvent(true);
                                    r3Var.y3 = true;
                                    r3Var.A3 = m9;
                                    r3Var.B3 = m9;
                                    i5Var.w(m9, m9);
                                    try {
                                        i5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    r3Var.x3 = true;
                                    break;
                                } else {
                                    r3Var.J4(r3Var.u3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof v5) {
                            v5 v5Var = (v5) view2;
                            d1 d1Var = v5Var.h;
                            d1 d1Var2 = v5Var.f;
                            LinearLayout linearLayout = v5Var.b;
                            if (!v5.m(d1Var2, d1Var2.getLeft() + linearLayout.getLeft(), d1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (d1Var.getVisibility() == 0) {
                                    break;
                                }
                                r3Var.J4(r3Var.u3);
                                break;
                            }
                            r3Var.x3 = true;
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
                            r3Var.J4(r3Var.u3);
                        }
                    }
                }
                break;
            case 3:
                r3 r3Var2 = this.b;
                f3 f3Var = r3Var2.k3;
                if (f3Var != null && f3Var.y()) {
                    for (int i11 = 0; i11 < r3Var2.getChildCount(); i11++) {
                        View childAt = r3Var2.getChildAt(i11);
                        if ((childAt instanceof v5) || (childAt instanceof i5) || (childAt instanceof i0) || (childAt instanceof q0)) {
                            childAt.invalidate();
                        }
                    }
                    f3Var.x();
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
