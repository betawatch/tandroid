package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class yn extends FrameLayout {
    public final xn a;
    public final org.telegram.ui.ActionBar.j5 b;
    public View c;
    public int d;
    public boolean e;

    public yn(Context context, org.telegram.ui.ActionBar.j5 j5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = j5Var;
        xn xnVar = new xn(this, bundle);
        this.a = xnVar;
        xnVar.fb = true;
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
            xnVar.Ca();
            addView(this.c, org.telegram.ui.Components.kb1.g(-1.0f, -1));
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
