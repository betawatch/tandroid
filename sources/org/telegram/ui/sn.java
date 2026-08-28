package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class sn extends FrameLayout {
    public final rn a;
    public final org.telegram.ui.ActionBar.b5 b;
    public View c;
    public int d;
    public boolean e;

    public sn(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = b5Var;
        rn rnVar = new rn(this, bundle);
        this.a = rnVar;
        rnVar.Ka = true;
    }

    public void a() {
        int i9;
        rn rnVar = this.a;
        if (rnVar.onFragmentCreate()) {
            this.c = rnVar.fragmentView;
            rnVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = rnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    rnVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            ij ijVar = rnVar.t0;
            if (ijVar != null && (i9 = this.d) != 0) {
                ijVar.setPadding(0, i9, 0, 0);
            }
            rnVar.pa();
            addView(this.c, g7.e6.c(-1.0f, -1));
            if (this.e) {
                rnVar.onResume();
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

    public void setTopPadding(int i9) {
        this.d = i9;
    }

    public void b(boolean z10) {
    }
}
