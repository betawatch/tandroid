package zh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wr;
import org.telegram.ui.iw0;
import org.telegram.ui.zp0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class o1 extends m0 {
    public final /* synthetic */ u7 h0;
    public final /* synthetic */ a3 i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(a3 a3Var, Context context, u7 u7Var, j7 j7Var, View view, FrameLayout frameLayout, u7 u7Var2) {
        super(context, u7Var, j7Var, view, frameLayout);
        this.i0 = a3Var;
        this.h0 = u7Var2;
    }

    @Override // zh.m0
    public final TLRPC.Peer getDefaultSendAs() {
        t0 t0Var = this.h0.A0;
        if (t0Var != null) {
            return t0Var.i();
        }
        return null;
    }

    @Override // zh.m0
    public final void h(long j3) {
        e1 e1Var = this.i0.Y1;
        if (e1Var == null) {
            return;
        }
        ArrayList arrayList = e1Var.h;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((d1) arrayList.get(i10)).a == j3) {
                ((d1) arrayList.get(i10)).h = true;
            }
        }
    }

    @Override // zh.m0
    public final void i(int i10, int i11, long j3) {
        e1 e1Var = this.i0.Y1;
        if (e1Var == null) {
            return;
        }
        int i12 = e1Var.a;
        ArrayList arrayList = e1Var.h;
        arrayList.add(new d1(e1Var, e1Var, i12, j3, i11, arrayList.size() < 5));
        e1Var.invalidate();
    }

    @Override // zh.m0
    public final void j() {
        a3 a3Var = this.i0;
        a3Var.Z1.setCount((int) getStarsCount());
        a3Var.Z1.setFilled(this.W != null);
    }

    @Override // zh.m0
    public final void q(boolean z10, boolean z11) {
        if (!z11 || this.f0 != z10) {
            this.f0 = z10;
            ValueAnimator valueAnimator = this.e0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.e0 = null;
            }
            zp0 zp0Var = this.c;
            zp0Var.invalidate();
            if (z11) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(zp0Var.getAlpha(), z10 ? 0.0f : 1.0f);
                this.e0 = ofFloat;
                ofFloat.addUpdateListener(new qg.o(this, 17));
                this.e0.addListener(new iw0(15, this, z10));
                this.e0.setDuration(420L);
                this.e0.setInterpolator(wr.h);
                this.e0.start();
            } else {
                this.a.setAlpha(z10 ? 0.0f : 0.5f);
                zp0Var.setAlpha(z10 ? 0.0f : 1.0f);
            }
            invalidate();
        }
        a aVar = this.i0.X1;
        if (aVar != null) {
            aVar.a(z10, z11);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        this.i0.M0.setVisibility(i10);
    }
}
