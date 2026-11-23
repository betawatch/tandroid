package ug;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ma;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class l1 extends FrameLayout {
    public float a;
    public final k1 b;
    public final ImageReceiver c;
    public final ImageReceiver d;
    public boolean e;
    public boolean f;
    public float h;
    public float n;
    public TLRPC.Document r;
    public boolean s;
    public final /* synthetic */ u0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(u0 u0Var, Context context) {
        super(context);
        this.w = u0Var;
        this.f = true;
        k1 k1Var = new k1(this, context);
        this.b = k1Var;
        ImageReceiver imageReceiver = new ImageReceiver(k1Var);
        this.c = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(k1Var);
        this.d = imageReceiver2;
        imageReceiver.u0 = false;
        imageReceiver2.u0 = false;
        setClipChildren(false);
        addView(k1Var, ma.e(-1, -2, 21));
    }

    public final void a(boolean z10, boolean z11, boolean z12) {
        boolean z13 = this.e;
        k1 k1Var = this.b;
        if (z13 != z11) {
            this.e = z11;
            if (!z12) {
                this.h = z11 ? 1.0f : 0.0f;
            }
            k1Var.invalidate();
        }
        if (this.f != z10) {
            this.f = z10;
            if (!z12) {
                this.n = z10 ? 1.0f : 0.0f;
            }
            k1Var.invalidate();
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
        int i11 = (int) (this.w.s3 * 0.6f);
        k1 k1Var = this.b;
        ViewGroup.LayoutParams layoutParams = k1Var.getLayoutParams();
        ViewGroup.LayoutParams layoutParams2 = k1Var.getLayoutParams();
        int L = i11 - org.telegram.messenger.g0.L(16.0f);
        layoutParams2.height = L;
        layoutParams.width = L;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (i11 * 0.7f), TLObject.FLAG_30));
    }
}
