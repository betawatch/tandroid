// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zd6 implements View.OnAttachStateChangeListener {
    public boolean b;
    public final /* synthetic */ ae6 d;
    public long a = System.currentTimeMillis();
    public final yd6 c = new yd6(this, (byte) 0);

    public zd6(ae6 ae6Var) {
        this.d = ae6Var;
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
