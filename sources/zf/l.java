package zf;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.m5;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.r9;
import org.telegram.ui.wx;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l extends FrameLayout {
    public boolean a;
    public final /* synthetic */ m b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, Context context) {
        super(context);
        this.b = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0134, code lost:
    
        if (r8 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0136, code lost:
    
        r14 = r14 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015f, code lost:
    
        if (r8 != false) goto L75;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        m mVar = this.b;
        int size = mVar.M.size();
        int i14 = mVar.r;
        boolean z10 = i14 == 0 && mVar.h == 0 && vp.r1(mVar.F).Q.f(2305843009213693952L | ((long) 1)) != null;
        View view = (View) getParent();
        int i15 = view instanceof r9 ? ((r9) view).e3 : 0;
        boolean z11 = mVar.J;
        int paddingTop = view.getPaddingTop();
        int paddingBottom = view.getPaddingBottom();
        int i16 = paddingTop - i15;
        if (i14 == 1 && size == 1 && ((k) mVar.M.get(0)).a == 19) {
            i12 = View.MeasureSpec.getSize(i11);
            if (i12 == 0) {
                i12 = view.getMeasuredHeight();
            }
            if (i12 == 0) {
                i12 = (org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.m;
            }
            if (mVar.R.K) {
                i12 += org.telegram.messenger.i0.L(81.0f);
            }
        } else {
            if (size != 0 && (i16 != 0 || z10)) {
                int size2 = View.MeasureSpec.getSize(i11);
                if (size2 == 0) {
                    size2 = view.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (org.telegram.messenger.i0.q.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.m;
                }
                int i17 = size2 - i15;
                int L = org.telegram.messenger.i0.L(tz.p1 ? 76.0f : 70.0f);
                int i18 = 0;
                for (int i19 = 0; i19 < size; i19++) {
                    if (((k) mVar.M.get(i19)).a == 0) {
                        if (((k) mVar.M.get(i19)).f && !z11) {
                            i18 += org.telegram.messenger.i0.L(tz.p1 ? 86.0f : 91.0f);
                        }
                        i18 += L;
                    } else {
                        if (((k) mVar.M.get(i19)).a != 1) {
                        }
                        i18 += L;
                    }
                }
                int i20 = (size - 1) + i18;
                ArrayList arrayList = mVar.d;
                if (arrayList != null) {
                    i20 = m5.C(52.0f, (mVar.d.size() - 1) + (org.telegram.messenger.i0.L(58.0f) * arrayList.size()), i20);
                }
                int i21 = z10 ? L + 1 : 0;
                if (i20 < i17) {
                    i12 = ((i17 - i20) + i21) - paddingBottom;
                    if (i16 != 0) {
                        i12 -= org.telegram.messenger.i0.m;
                        if (!z11 && !mVar.S) {
                            i12 -= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                            if (getParent() instanceof wx) {
                                i13 = ((wx) getParent()).z3;
                                i12 -= i13;
                            }
                        }
                    }
                } else {
                    int i22 = i20 - i17;
                    if (i22 < i21) {
                        i12 = (i21 - i22) - paddingBottom;
                        if (i16 != 0) {
                            i12 -= org.telegram.messenger.i0.m;
                            if (!z11 && !mVar.S) {
                                i12 -= org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                                if (getParent() instanceof wx) {
                                    i13 = ((wx) getParent()).z3;
                                    i12 -= i13;
                                }
                            }
                        }
                    }
                }
            }
            i12 = 0;
        }
        int i23 = i12 >= 0 ? i12 : 0;
        if (mVar.S) {
            i23 += org.telegram.messenger.i0.L(1000.0f);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i23, TLObject.FLAG_30));
    }
}
