package zh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ov0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class f extends ov0 implements r0.m {
    public final b2.q0 w0;
    public final /* synthetic */ g x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Context context) {
        super(context, null);
        this.x0 = gVar;
        this.w0 = new b2.q0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        org.telegram.ui.ActionBar.k kVar;
        int i13;
        org.telegram.ui.ActionBar.k kVar2;
        g gVar = this.x0;
        if (viewGroup == gVar.e && gVar.F.isAttachedToWindow()) {
            kVar = ((org.telegram.ui.ActionBar.n2) gVar).actionBar;
            boolean z10 = kVar.n0;
            int top = (((View) gVar.F.getParent()).getTop() - AndroidUtilities.statusBarHeight) - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int bottom = ((View) gVar.F.getParent()).getBottom();
            boolean z11 = false;
            if (i11 >= 0) {
                if (z10) {
                    ll0 currentListView = gVar.F.getCurrentListView();
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
                    ll0 currentListView2 = gVar.F.getCurrentListView();
                    if (gVar.e.getHeight() - bottom < 0 || currentListView2 == null || currentListView2.canScrollVertically(1)) {
                        return;
                    }
                    iArr[1] = i11;
                    gVar.e.B0();
                    return;
                }
                return;
            }
            kVar2 = ((org.telegram.ui.ActionBar.n2) gVar).actionBar;
            kVar2.setCastShadows(gVar.e.getHeight() - bottom < 0);
            if (gVar.e.getHeight() - bottom >= 0) {
                ll0 currentListView3 = gVar.F.getCurrentListView();
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
    public final void i(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        org.telegram.ui.ActionBar.k kVar;
        g gVar = this.x0;
        try {
            if (viewGroup == gVar.e && gVar.F.isAttachedToWindow()) {
                ll0 currentListView = gVar.F.getCurrentListView();
                int bottom = ((View) gVar.F.getParent()).getBottom();
                kVar = ((org.telegram.ui.ActionBar.n2) gVar).actionBar;
                kVar.setCastShadows(gVar.e.getHeight() - bottom < 0);
                if (gVar.e.getHeight() - bottom >= 0) {
                    iArr[1] = i13;
                    currentListView.scrollBy(0, i13);
                }
            }
        } catch (Throwable th2) {
            FileLog.e(th2);
            AndroidUtilities.runOnUIThread(new sg.p0(this, 24));
        }
    }

    @Override // r0.l
    public final void n(int i10, View view) {
        this.w0.a = 0;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // r0.l
    public final boolean p(View view, View view2, int i10, int i11) {
        return i10 == 2;
    }

    @Override // r0.l
    public final void s(View view, View view2, int i10, int i11) {
        this.w0.a = i10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
