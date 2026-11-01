package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class wn extends FrameLayout {
    public final vn a;
    public final org.telegram.ui.ActionBar.z4 b;
    public View c;
    public int d;
    public boolean e;

    public wn(Context context, org.telegram.ui.ActionBar.z4 z4Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = z4Var;
        vn vnVar = new vn(this, bundle);
        this.a = vnVar;
        vnVar.ib = true;
    }

    public void a() {
        int i10;
        vn vnVar = this.a;
        if (vnVar.onFragmentCreate()) {
            this.c = vnVar.fragmentView;
            vnVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = vnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    vnVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            vj vjVar = vnVar.z0;
            if (vjVar != null && (i10 = this.d) != 0) {
                vjVar.setPadding(0, i10, 0, 0);
            }
            vnVar.Ka();
            addView(this.c, w7.b6.c(-1.0f, -1));
            if (this.e) {
                vnVar.onResume();
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
