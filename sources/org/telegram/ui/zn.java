package org.telegram.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class zn extends FrameLayout {
    public final yn a;
    public final org.telegram.ui.ActionBar.f5 b;
    public View c;
    public int d;
    public boolean e;

    public zn(Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = f5Var;
        yn ynVar = new yn(this, bundle);
        this.a = ynVar;
        ynVar.La = true;
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
            qj qjVar = ynVar.u0;
            if (qjVar != null && (i10 = this.d) != 0) {
                qjVar.setPadding(0, i10, 0, 0);
            }
            ynVar.pa();
            addView(this.c, k7.c6.c(-1.0f, -1));
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

    public void b(boolean z4) {
    }
}
