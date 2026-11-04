package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ym extends FrameLayout {
    public final xm a;
    public final org.telegram.ui.ActionBar.q4 b;
    public View c;
    public int d;
    public boolean e;

    public ym(Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = q4Var;
        xm xmVar = new xm(this, bundle);
        this.a = xmVar;
        xmVar.jb = true;
    }

    public void a() {
        int i3;
        xm xmVar = this.a;
        if (xmVar.onFragmentCreate()) {
            this.c = xmVar.fragmentView;
            xmVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = xmVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    xmVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            wi wiVar = xmVar.A0;
            if (wiVar != null && (i3 = this.d) != 0) {
                wiVar.setPadding(0, i3, 0, 0);
            }
            xmVar.Pa();
            addView(this.c, b8.mf.c(-1.0f, -1));
            if (this.e) {
                xmVar.onResume();
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

    public void setTopPadding(int i3) {
        this.d = i3;
    }

    public void b(boolean z10) {
    }
}
