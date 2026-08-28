package zf;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        addView(m1Var, e6.e(-1, -2, 21));
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
    public final void onMeasure(int i9, int i10) {
        int i11 = (int) (this.v.g3 * 0.6f);
        m1 m1Var = this.b;
        ViewGroup.LayoutParams layoutParams = m1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = m1Var.getLayoutParams();
        int dp = i11 - AndroidUtilities.dp(16.0f);
        layoutParams2.height = dp;
        layoutParams.width = dp;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (i11 * 0.7f), TLObject.FLAG_30));
    }
}
