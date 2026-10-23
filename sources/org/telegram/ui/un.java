package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public abstract class un extends FrameLayout {
    public final tn a;
    public final org.telegram.ui.ActionBar.h5 b;
    public View c;
    public int d;
    public boolean e;

    public un(Context context, org.telegram.ui.ActionBar.h5 h5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = h5Var;
        tn tnVar = new tn(this, bundle);
        this.a = tnVar;
        tnVar.bb = true;
    }

    public void a() {
        int i10;
        tn tnVar = this.a;
        if (tnVar.onFragmentCreate()) {
            this.c = tnVar.fragmentView;
            tnVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = tnVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    tnVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            nj njVar = tnVar.x0;
            if (njVar != null && (i10 = this.d) != 0) {
                njVar.setPadding(0, i10, 0, 0);
            }
            tnVar.ua();
            addView(this.c, w7.z5.c(-1.0f, -1));
            if (this.e) {
                tnVar.onResume();
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
