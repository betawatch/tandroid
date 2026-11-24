// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yk3 extends FrameLayout {
    public boolean a;
    public final /* synthetic */ zk3 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk3(zk3 zk3Var, Context context) {
        super(context);
        this.b = zk3Var;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        zk3 zk3Var = this.b;
        int size = zk3Var.N.size();
        int i5 = zk3Var.r;
        boolean z = i5 == 0 && zk3Var.h == 0 && oc7.r1(zk3Var.G).R.f(2305843009213693953L) != null;
        View view = (View) getParent();
        int i6 = view instanceof rm0 ? ((rm0) view).f3 : 0;
        boolean z2 = zk3Var.K;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int i7 = paddingTop - i6;
        if (i5 == 1 && size == 1 && ((xk3) zk3Var.N.get(0)).a == 19) {
            i3 = View.MeasureSpec.getSize(i2);
            if (i3 == 0) {
                i3 = view.getMeasuredHeight();
            }
            if (i3 == 0) {
                i3 = (gm.q.y - a.getCurrentActionBarHeight()) - gm.m;
            }
            if (zk3Var.S.L) {
                i3 += gm.L(81.0f);
            }
        } else {
            if (size != 0 && (i7 != 0 || z)) {
                int size2 = View.MeasureSpec.getSize(i2);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (gm.q.y - a.getCurrentActionBarHeight()) - gm.m;
                }
                int i8 = size2 - i6;
                int L = gm.L(gda.l1 ? 76.0f : 70.0f);
                int i9 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    int i11 = ((xk3) zk3Var.N.get(i10)).a;
                    ArrayList arrayList = zk3Var.N;
                    if (i11 == 0) {
                        if (((xk3) arrayList.get(i10)).f && !z2) {
                            i9 += gm.L(gda.l1 ? 86.0f : 91.0f);
                        }
                        i9 += L;
                    } else {
                        if (((xk3) arrayList.get(i10)).a != 1) {
                        }
                        i9 += L;
                    }
                }
                int i12 = (size - 1) + i9;
                ArrayList arrayList2 = zk3Var.d;
                if (arrayList2 != null) {
                    i12 = hg9.v(52.0f, (zk3Var.d.size() - 1) + (gm.L(58.0f) * arrayList2.size()), i12);
                }
                int i13 = z ? L + 1 : 0;
                if (i12 < i8) {
                    i3 = ((i8 - i12) + i13) - paddingBottom;
                    if (i7 != 0) {
                        i3 -= gm.m;
                        if (!z2) {
                            if (!zk3Var.T) {
                                i3 -= a.getCurrentActionBarHeight();
                                if (getParent() instanceof jk3) {
                                    i4 = ((jk3) getParent()).A3;
                                    i3 -= i4;
                                }
                            }
                        }
                        i3 -= i7;
                    }
                } else {
                    int i14 = i12 - i8;
                    if (i14 < i13) {
                        i3 = (i13 - i14) - paddingBottom;
                        if (i7 != 0) {
                            i3 -= gm.m;
                            if (!z2) {
                                if (!zk3Var.T) {
                                    i3 -= a.getCurrentActionBarHeight();
                                    if (getParent() instanceof jk3) {
                                        i4 = ((jk3) getParent()).A3;
                                        i3 -= i4;
                                    }
                                }
                            }
                            i3 -= i7;
                        }
                    }
                }
            }
            i3 = 0;
        }
        int i15 = i3 >= 0 ? i3 : 0;
        if (zk3Var.T) {
            i15 += gm.L(1000.0f);
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i15, TLObject.FLAG_30));
    }
}
