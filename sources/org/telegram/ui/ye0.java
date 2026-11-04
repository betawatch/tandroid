package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ye0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public TLRPC.User a;
    public org.telegram.ui.Components.s70 b;
    public org.telegram.ui.Components.iz c;
    public boolean d;
    public int e;

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        org.telegram.ui.Components.s70 s70Var = this.b;
        org.telegram.ui.Components.iz izVar = this.c;
        View view = (View) getParent();
        if (view != null && view.getWidth() > 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(view.getWidth(), TLObject.FLAG_30);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(36.0f), TLObject.FLAG_30);
        this.d = true;
        boolean z10 = izVar.getVisibility() == 0;
        s70Var.setVisibility(8);
        if (z10) {
            izVar.setVisibility(8);
        }
        super.onMeasure(i3, makeMeasureSpec);
        if (z10) {
            izVar.getLayoutParams().width = getMeasuredWidth();
            izVar.setVisibility(0);
        }
        s70Var.setVisibility(0);
        s70Var.getLayoutParams().width = getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f);
        this.d = false;
        super.onMeasure(i3, makeMeasureSpec);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.d) {
            return;
        }
        super.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        try {
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.I5, false);
            if (x02 != this.e) {
                this.e = x02;
                org.telegram.ui.ActionBar.k6.H1(getBackground(), x02, true);
            }
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
