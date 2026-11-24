// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yf6 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ zf6 d;
    public long a = System.currentTimeMillis();
    public final xf6 c = new xf6(this, (byte) 0);

    public yf6(zf6 zf6Var) {
        this.d = zf6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = true;
        view.post(this.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b = false;
        view.removeCallbacks(this.c);
    }
}
