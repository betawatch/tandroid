package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class wn extends FrameLayout {
    public final vn a;
    public final org.telegram.ui.ActionBar.j5 b;
    public View c;
    public int d;
    public boolean e;

    public wn(Context context, org.telegram.ui.ActionBar.j5 j5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = j5Var;
        vn vnVar = new vn(this, bundle);
        this.a = vnVar;
        vnVar.bb = true;
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
            oj ojVar = vnVar.x0;
            if (ojVar != null && (i10 = this.d) != 0) {
                ojVar.setPadding(0, i10, 0, 0);
            }
            vnVar.za();
            addView(this.c, org.telegram.ui.Components.gb1.g(-1.0f, -1));
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
