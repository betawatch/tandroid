// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class pi8 extends FrameLayout {
    public float a;
    public final oi8 b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public TLRPC.Document r;
    public boolean s;
    public final /* synthetic */ dh8 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi8(dh8 dh8Var, Context context) {
        super(context);
        this.w = dh8Var;
        this.f = true;
        oi8 oi8Var = new oi8(this, context);
        this.b = oi8Var;
        ImageReceiver imageReceiver = new ImageReceiver(oi8Var);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(oi8Var);
        this.d = imageReceiver2;
        imageReceiver.u0 = false;
        imageReceiver2.u0 = false;
        setClipChildren(false);
        addView(oi8Var, nme.e(-1, -2, 21));
    }

    public final void a(boolean z, boolean z2, boolean z3) {
        boolean z4 = this.e;
        oi8 oi8Var = this.b;
        if (z4 != z2) {
            this.e = z2;
            if (!z3) {
                this.h = z2 ? 1.0f : 0.0f;
            }
            oi8Var.invalidate();
        }
        if (this.f != z) {
            this.f = z;
            if (!z3) {
                this.n = z ? 1.0f : 0.0f;
            }
            oi8Var.invalidate();
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
        oi8 oi8Var = this.b;
        ViewGroup.LayoutParams layoutParams = oi8Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = oi8Var.getLayoutParams();
        int L = i3 - gl.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (i3 * 0.7f), TLObject.FLAG_30));
    }
}
