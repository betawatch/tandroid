// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rk8 extends FrameLayout {
    public float a;
    public final qk8 b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public TLRPC.Document r;
    public boolean s;
    public final /* synthetic */ fj8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk8(fj8 fj8Var, Context context) {
        super(context);
        this.w = fj8Var;
        this.f = true;
        qk8 qk8Var = new qk8(this, context);
        this.b = qk8Var;
        ImageReceiver imageReceiver = new ImageReceiver(qk8Var);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(qk8Var);
        this.d = imageReceiver2;
        imageReceiver.u0 = false;
        imageReceiver2.u0 = false;
        setClipChildren(false);
        addView(qk8Var, qoe.e(-1, -2, 21));
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        boolean z4 = this.e;
        qk8 qk8Var = this.b;
        if (z4 != z2) {
            this.e = z2;
            if (!z3) {
                this.h = z2 ? 1.0f : 0.0f;
            }
            qk8Var.invalidate();
        }
        if (this.f != z) {
            this.f = z;
            if (!z3) {
                this.n = z ? 1.0f : 0.0f;
            }
            qk8Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.I();
        this.d.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.K();
        this.d.K();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = (int) (this.w.s3 * 0.6f);
        qk8 qk8Var = this.b;
        ViewGroup.LayoutParams layoutParams = qk8Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = qk8Var.getLayoutParams();
        int L = i3 - gm.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (i3 * 0.7f), TLObject.FLAG_30));
    }
}
