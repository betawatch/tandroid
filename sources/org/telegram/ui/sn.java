package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class sn extends FrameLayout {
    public final rn a;
    public final org.telegram.ui.ActionBar.d5 b;
    public View c;
    public int d;
    public boolean e;

    public sn(Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = d5Var;
        rn rnVar = new rn(this, bundle);
        this.a = rnVar;
        rnVar.Pa = true;
    }

    public void a() {
        int i10;
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
            nj njVar = rnVar.x0;
            if (njVar != null && (i10 = this.d) != 0) {
                njVar.setPadding(0, i10, 0, 0);
            }
            rnVar.ua();
            addView(this.c, w7.z5.c(-1.0f, -1));
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

    public void setTopPadding(int i10) {
        this.d = i10;
    }

    public void b(boolean z10) {
    }
}
