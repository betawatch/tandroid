// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wlc extends FrameLayout {
    public View a;
    public float b;
    public int c;
    public final qr1 d;
    public final /* synthetic */ hmc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlc(hmc hmcVar, Context context) {
        super(context);
        this.e = hmcVar;
        this.d = new qr1(this, (byte) 8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        getViewTreeObserver().removeOnPreDrawListener(this.d);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.e.X0();
    }
}
