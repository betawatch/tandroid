package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class tn extends FrameLayout {
    public final sn a;
    public final org.telegram.ui.ActionBar.b5 b;
    public View c;
    public int d;
    public boolean e;

    public tn(Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = b5Var;
        sn snVar = new sn(this, bundle);
        this.a = snVar;
        snVar.Ka = true;
    }

    public void a() {
        int i10;
        sn snVar = this.a;
        if (snVar.onFragmentCreate()) {
            this.c = snVar.fragmentView;
            snVar.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = snVar.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    snVar.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            kj kjVar = snVar.t0;
            if (kjVar != null && (i10 = this.d) != 0) {
                kjVar.setPadding(0, i10, 0, 0);
            }
            snVar.pa();
            addView(this.c, h7.z5.c(-1.0f, -1));
            if (this.e) {
                snVar.onResume();
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
