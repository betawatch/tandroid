package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public abstract class yn extends FrameLayout {
    public final xn a;
    public final org.telegram.ui.ActionBar.b5 b;
    public View c;
    public int d;
    public boolean e;

    public yn(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = b5Var;
        xn xnVar = new xn(this, bundle);
        this.a = xnVar;
        xnVar.Oa = true;
    }

    public void a() {
        int i10;
        xn xnVar = this.a;
        if (xnVar.onFragmentCreate()) {
            this.c = xnVar.fragmentView;
            xnVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = xnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    xnVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            rj rjVar = xnVar.x0;
            if (rjVar != null && (i10 = this.d) != 0) {
                rjVar.setPadding(0, i10, 0, 0);
            }
            xnVar.pa();
            addView(this.c, w7.y5.c(-1.0f, -1));
            if (this.e) {
                xnVar.onResume();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setTopPadding(int i10) {
        this.d = i10;
    }

    public void b(boolean z10) {
    }
}
