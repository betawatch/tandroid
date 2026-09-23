package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class zn extends FrameLayout {
    public final yn a;
    public final org.telegram.ui.ActionBar.c5 b;
    public View c;
    public int d;
    public boolean e;

    public zn(Context context, org.telegram.ui.ActionBar.c5 c5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = c5Var;
        yn ynVar = new yn(this, bundle);
        this.a = ynVar;
        ynVar.Oa = true;
    }

    public void a() {
        int i10;
        yn ynVar = this.a;
        if (ynVar.onFragmentCreate()) {
            this.c = ynVar.fragmentView;
            ynVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = ynVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    ynVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            rj rjVar = ynVar.x0;
            if (rjVar != null && (i10 = this.d) != 0) {
                rjVar.setPadding(0, i10, 0, 0);
            }
            ynVar.pa();
            addView(this.c, w7.x5.c(-1.0f, -1));
            if (this.e) {
                ynVar.onResume();
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
