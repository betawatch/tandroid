package xh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g extends aw0 implements r0.m {
    public final b2.q0 w0;
    public final /* synthetic */ h x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, Context context) {
        super(context, null);
        this.x0 = hVar;
        this.w0 = new b2.q0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.l lVar;
        int i13;
        org.telegram.ui.ActionBar.l lVar2;
        h hVar = this.x0;
        if (viewGroup == hVar.e && hVar.F.isAttachedToWindow()) {
            lVar = ((org.telegram.ui.ActionBar.p2) hVar).actionBar;
            boolean z10 = lVar.n0;
            int top = (((View) hVar.F.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            int bottom = ((View) hVar.F.getParent()).getBottom();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    vl0 currentListView = hVar.F.getCurrentListView();
                    iArr[1] = i11;
                    if (top > 0) {
                        iArr[1] = 0;
                    }
                    if (currentListView == null || (i13 = iArr[1]) <= 0) {
                        return;
                    }
                    currentListView.scrollBy(0, i13);
                    return;
                }
                if (i11 > 0) {
                    vl0 currentListView2 = hVar.F.getCurrentListView();
                    if (hVar.e.getHeight() - bottom < 0 || currentListView2 == null || currentListView2.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i11;
                    hVar.e.B0();
                    return;
                }
                return;
            }
            lVar2 = ((org.telegram.ui.ActionBar.p2) hVar).actionBar;
            lVar2.setCastShadows(hVar.e.getHeight() - bottom < 0);
            if (hVar.e.getHeight() - bottom >= 0) {
                vl0 currentListView3 = hVar.F.getCurrentListView();
                int L0 = ((s4.c0) currentListView3.getLayoutManager()).L0();
                if (L0 != -1) {
                    s4.c1 K = currentListView3.K(L0);
                    int top2 = K != null ? K.a.getTop() : -1;
                    int paddingTop = currentListView3.getPaddingTop();
                    if (top2 != paddingTop || L0 != 0) {
                        iArr[1] = L0 != 0 ? i11 : Math.max(i11, top2 - paddingTop);
                        currentListView3.scrollBy(0, i11);
                        z11 = true;
                    }
                }
            }
            if (z10) {
                if (z11 || top >= 0) {
                    iArr[1] = i11;
                } else {
                    iArr[1] = i11 - Math.max(top, i11);
                }
            }
        }
    }

    @Override // r0.m
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.l lVar;
        h hVar = this.x0;
        try {
            if (viewGroup == hVar.e && hVar.F.isAttachedToWindow()) {
                vl0 currentListView = hVar.F.getCurrentListView();
                int bottom = ((View) hVar.F.getParent()).getBottom();
                lVar = ((org.telegram.ui.ActionBar.p2) hVar).actionBar;
                lVar.setCastShadows(hVar.e.getHeight() - bottom < 0);
                if (hVar.e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new qg.q0(this, 28));
        }
    }

    @Override // r0.l
    public final void n(int i10, View view) {
        this.w0.a = 0;
    }

    @Override // r0.l
    public final boolean o(View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // r0.l
    public final void r(View view, View view2, int i10, int i11) {
        this.w0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
