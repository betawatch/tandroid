package rg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class n1 extends FrameLayout {
    public float a;
    public final m1 b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public TLRPC.Document r;
    public boolean s;
    public final /* synthetic */ s0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(s0 s0Var, Context context) {
        super(context);
        this.v = s0Var;
        this.f = true;
        m1 m1Var = new m1(this, context);
        this.b = m1Var;
        ImageReceiver imageReceiver = new ImageReceiver(m1Var);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(m1Var);
        this.d = imageReceiver2;
        imageReceiver.setAllowStartAnimation(false);
        imageReceiver2.setAllowStartAnimation(false);
        setClipChildren(false);
        addView(m1Var, x5.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.e;
        m1 m1Var = this.b;
        if (z13 != z11) {
            this.e = z11;
            if (!z12) {
                this.h = z11 ? 1.0f : 0.0f;
            }
            m1Var.invalidate();
        }
        if (this.f != z10) {
            this.f = z10;
            if (!z12) {
                this.n = z10 ? 1.0f : 0.0f;
            }
            m1Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.onAttachedToWindow();
        this.d.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.onDetachedFromWindow();
        this.d.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int i12 = (int) (this.v.k3 * 0.6f);
        m1 m1Var = this.b;
        ViewGroup.LayoutParams layoutParams = m1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = m1Var.getLayoutParams();
        int dp = i12 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (i12 * 0.7f), TLObject.FLAG_30));
    }
}
