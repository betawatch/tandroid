package wh;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.q70;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
    
        if (wh.v5.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
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
                        if (view instanceof f0) {
                            f0 f0Var = (f0) view;
                            f0Var.getLocationOnScreen(new int[2]);
                            float f10 = r8[0] + left;
                            float f11 = r8[1] + top;
                            if (!f0.h(f0Var.w, f10, f11) && !f0.h(f0Var.x, f10, f11)) {
                                ArrayList arrayList = f0Var.y;
                                int size = arrayList.size();
                                int i10 = 0;
                                while (i10 < size) {
                                    Object obj = arrayList.get(i10);
                                    i10++;
                                    if (f0.h((c0) obj, f10, f11)) {
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
                                    q70 q70Var = r3Var.g4;
                                    if (q70Var != null) {
                                        r3Var.g4 = null;
                                        q70Var.u();
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
                            e1 e1Var = v5Var.h;
                            e1 e1Var2 = v5Var.f;
                            LinearLayout linearLayout = v5Var.b;
                            if (!v5.m(e1Var2, e1Var2.getLeft() + linearLayout.getLeft(), e1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (e1Var.getVisibility() == 0) {
                                    break;
                                }
                                r3Var.J4(r3Var.u3);
                                break;
                            }
                            r3Var.x3 = true;
                            break;
                        } else {
                            if (view2 instanceof r0) {
                                e1 e1Var3 = ((r0) view2).d;
                                if (e1Var3.length() == 0 && left >= e1Var3.getLeft()) {
                                    if (left <= e1Var3.getWidth() + e1Var3.getLeft() && top >= e1Var3.getTop()) {
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
                        if ((childAt instanceof v5) || (childAt instanceof i5) || (childAt instanceof j0) || (childAt instanceof r0)) {
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
