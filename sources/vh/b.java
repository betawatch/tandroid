package vh;

import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.p70;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s3 b;

    public /* synthetic */ b(s3 s3Var, int i10) {
        this.a = i10;
        this.b = s3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x017c, code lost:
    
        if (r3 <= (r4.getHeight() + r4.getTop())) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (vh.w5.m(r5, r5.getLeft(), r5.getTop(), r1, r3) != false) goto L87;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.B2();
                break;
            case 1:
                this.b.s3();
                break;
            case 2:
                s3 s3Var = this.b;
                if (s3Var.u3 != null && !s3Var.k3.y()) {
                    if (s3Var.S4(s3Var.u3, s3Var.s3, s3Var.t3)) {
                        s3Var.x3 = true;
                        break;
                    } else {
                        int left = (int) ((s3Var.s3 - s3Var.u3.getLeft()) - s3Var.getLeft());
                        int top = (int) ((s3Var.t3 - s3Var.u3.getTop()) - s3Var.getTop());
                        View view = s3Var.u3;
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
                            s3Var.x3 = true;
                            break;
                        }
                        View view2 = s3Var.u3;
                        if (view2 instanceof j5) {
                            j5 j5Var = (j5) view2;
                            if (s3Var.i3(j5Var, left, top)) {
                                try {
                                    j5Var.performHapticFeedback(0);
                                } catch (Exception unused) {
                                }
                                s3Var.x3 = true;
                                break;
                            } else {
                                TL_iv.pageTableCell m9 = j5Var.m(left, top);
                                if (m9 != null) {
                                    p70 p70Var = s3Var.g4;
                                    if (p70Var != null) {
                                        s3Var.g4 = null;
                                        p70Var.u();
                                    }
                                    s3Var.f2(j5Var);
                                    s3Var.B0();
                                    s3Var.requestDisallowInterceptTouchEvent(true);
                                    s3Var.y3 = true;
                                    s3Var.A3 = m9;
                                    s3Var.B3 = m9;
                                    j5Var.w(m9, m9);
                                    try {
                                        j5Var.performHapticFeedback(0);
                                    } catch (Exception unused2) {
                                    }
                                    s3Var.x3 = true;
                                    break;
                                } else {
                                    s3Var.I4(s3Var.u3);
                                    break;
                                }
                            }
                        } else if (view2 instanceof w5) {
                            w5 w5Var = (w5) view2;
                            e1 e1Var = w5Var.h;
                            e1 e1Var2 = w5Var.f;
                            LinearLayout linearLayout = w5Var.b;
                            if (!w5.m(e1Var2, e1Var2.getLeft() + linearLayout.getLeft(), e1Var2.getTop() + linearLayout.getTop(), left, top)) {
                                if (e1Var.getVisibility() == 0) {
                                    break;
                                }
                                s3Var.I4(s3Var.u3);
                                break;
                            }
                            s3Var.x3 = true;
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
                            s3Var.I4(s3Var.u3);
                        }
                    }
                }
                break;
            case 3:
                s3 s3Var2 = this.b;
                g3 g3Var = s3Var2.k3;
                if (g3Var != null && g3Var.y()) {
                    for (int i11 = 0; i11 < s3Var2.getChildCount(); i11++) {
                        View childAt = s3Var2.getChildAt(i11);
                        if ((childAt instanceof w5) || (childAt instanceof j5) || (childAt instanceof j0) || (childAt instanceof r0)) {
                            childAt.invalidate();
                        }
                    }
                    g3Var.x();
                    break;
                }
                break;
            case 4:
                this.b.n3(true);
                break;
            default:
                this.b.Z2();
                break;
        }
    }
}
