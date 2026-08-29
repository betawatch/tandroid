package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class vn extends FrameLayout {
    public final un a;
    public final org.telegram.ui.ActionBar.b5 b;
    public View c;
    public int d;
    public boolean e;

    public vn(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = b5Var;
        un unVar = new un(this, bundle);
        this.a = unVar;
        unVar.Ka = true;
    }

    public void a() {
        int i10;
        un unVar = this.a;
        if (unVar.onFragmentCreate()) {
            this.c = unVar.fragmentView;
            unVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = unVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    unVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            lj ljVar = unVar.t0;
            if (ljVar != null && (i10 = this.d) != 0) {
                ljVar.setPadding(0, i10, 0, 0);
            }
            unVar.pa();
            addView(this.c, i7.f6.c(-1.0f, -1));
            if (this.e) {
                unVar.onResume();
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
