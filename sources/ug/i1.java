package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class i1 extends FrameLayout {
    public float a;
    public final h1 b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public TLRPC.Document r;
    public boolean s;
    public final /* synthetic */ s0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(s0 s0Var, Context context) {
        super(context);
        this.w = s0Var;
        this.f = true;
        h1 h1Var = new h1(this, context);
        this.b = h1Var;
        ImageReceiver imageReceiver = new ImageReceiver(h1Var);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(h1Var);
        this.d = imageReceiver2;
        imageReceiver.t0 = false;
        imageReceiver2.t0 = false;
        setClipChildren(false);
        addView(h1Var, ha.e(-1, -2, 21));
    }

    public final void a(boolean z9, boolean z10, boolean z11) {
        boolean z12 = this.e;
        h1 h1Var = this.b;
        if (z12 != z10) {
            this.e = z10;
            if (!z11) {
                this.h = z10 ? 1.0f : 0.0f;
            }
            h1Var.invalidate();
        }
        if (this.f != z9) {
            this.f = z9;
            if (!z11) {
                this.n = z9 ? 1.0f : 0.0f;
            }
            h1Var.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c.P();
        this.d.P();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c.R();
        this.d.R();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int i11 = (int) (this.w.r3 * 0.6f);
        h1 h1Var = this.b;
        ViewGroup.LayoutParams layoutParams = h1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = h1Var.getLayoutParams();
        int L = i11 - org.telegram.messenger.g0.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (i11 * 0.7f), TLObject.FLAG_30));
    }
}
