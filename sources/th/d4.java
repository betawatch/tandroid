package th;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class d4 extends FrameLayout implements r0.l {
    public final ac.g a;
    public final /* synthetic */ f4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(f4 f4Var, Context context) {
        super(context);
        this.b = f4Var;
        this.a = new ac.g();
    }

    @Override // r0.k
    public final void k(int i10, View view) {
        this.a.a = 0;
    }

    @Override // r0.l
    public final void l(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        f4 f4Var = this.b;
        o7 o7Var = f4Var.r;
        if (f4Var.y <= 0 && i13 != 0 && i11 == 0) {
            float f7 = o7Var.e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            f4Var.setOffset(f7);
            o7Var.e0 = f7;
            z2 currentPeerView = o7Var.n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            d7 d7Var = o7Var.w;
            if (d7Var != null) {
                d7Var.invalidate();
            }
        }
    }

    @Override // r0.k
    public final boolean n(View view, View view2, int i10, int i11) {
        return this.b.y <= 0 && i10 == 2;
    }

    @Override // r0.k
    public final void q(View view, View view2, int i10, int i11) {
        this.a.a = i10;
    }

    @Override // r0.k
    public final void s(View view, int i10, int i11, int[] iArr, int i12) {
        f4 f4Var = this.b;
        o7 o7Var = f4Var.r;
        if (f4Var.y > 0) {
            return;
        }
        float f7 = o7Var.e0;
        float f10 = f4Var.c;
        if (f7 >= f10 || i11 <= 0) {
            return;
        }
        float f11 = f7 + i11;
        iArr[1] = i11;
        if (f11 <= f10) {
            f10 = f11;
        }
        f4Var.setOffset(f10);
        o7Var.e0 = f10;
        z2 currentPeerView = o7Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        d7 d7Var = o7Var.w;
        if (d7Var != null) {
            d7Var.invalidate();
        }
    }

    @Override // r0.k
    public final void m(View view, int i10, int i11, int i12, int i13, int i14) {
    }
}
