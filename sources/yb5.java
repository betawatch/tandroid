// default package

import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yb5 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ ac5 b;

    public yb5(ac5 ac5Var, FrameLayout frameLayout) {
        this.b = ac5Var;
        this.a = frameLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        ac5 ac5Var = this.b;
        oi1 oi1Var = ac5Var.A0;
        if (oi1Var == null) {
            oi1Var = (oi1) ac5Var.C0(ac5Var.a0);
            ac5Var.A0 = oi1Var;
        }
        oi1Var.f.setOnClickListener(new ca5(this, (byte) 6));
    }
}
