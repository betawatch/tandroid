// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class vnc extends FrameLayout {
    public View a;
    public float b;
    public int c;
    public final cc d;
    public final /* synthetic */ goc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vnc(goc gocVar, Context context) {
        super(context);
        this.e = gocVar;
        this.d = new cc(this, (byte) 10);
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
        this.e.Y0();
    }
}
