package th;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.nb0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p1 extends j0 {
    public final /* synthetic */ o7 h0;
    public final /* synthetic */ z2 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(z2 z2Var, Context context, o7 o7Var, d7 d7Var, View view, FrameLayout frameLayout, o7 o7Var2) {
        super(context, o7Var, d7Var, view, frameLayout);
        this.i0 = z2Var;
        this.h0 = o7Var2;
    }

    @Override // th.j0
    public final TLRPC.Peer getDefaultSendAs() {
        s0 s0Var = this.h0.A0;
        if (s0Var != null) {
            return s0Var.i();
        }
        return null;
    }

    @Override // th.j0
    public final void h(long j10) {
        d1 d1Var = this.i0.H1;
        if (d1Var == null) {
            return;
        }
        ArrayList arrayList = d1Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((c1) arrayList.get(i10)).a == j10) {
                ((c1) arrayList.get(i10)).h = true;
            }
        }
    }

    @Override // th.j0
    public final void i(int i10, int i11, long j10) {
        d1 d1Var = this.i0.H1;
        if (d1Var == null) {
            return;
        }
        int i12 = d1Var.a;
        ArrayList arrayList = d1Var.h;
        arrayList.add(new c1(d1Var, d1Var, i12, j10, i11, arrayList.size() < 5));
        d1Var.invalidate();
    }

    @Override // th.j0
    public final void j() {
        z2 z2Var = this.i0;
        z2Var.I1.setCount((int) getStarsCount());
        z2Var.I1.setFilled(this.W != null);
    }

    @Override // th.j0
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.f0 != z10) {
            this.f0 = z10;
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.e0 = null;
            }
            nb0 nb0Var = this.c;
            nb0Var.invalidate();
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(nb0Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.e0 = ofFloat;
                ofFloat.addUpdateListener(new qh.e0(this, 12));
                this.e0.addListener(new sg.y(2, this, z10));
                this.e0.setDuration(420L);
                this.e0.setInterpolator(gr.h);
                this.e0.start();
            } else {
                this.a.setAlpha(z10 ? 0.0f : 0.5f);
                nb0Var.setAlpha(z10 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        a aVar = this.i0.G1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.i0.v0.setVisibility(i10);
    }
}
