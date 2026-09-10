package zh;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e4 extends FrameLayout implements r0.m {
    public final b2.q0 a;
    public final /* synthetic */ g4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(g4 g4Var, Context context) {
        super(context);
        this.b = g4Var;
        this.a = new b2.q0();
    }

    @Override // r0.l
    public final void E(ViewGroup viewGroup, int i10, int i11, int[] iArr, int i12) {
        g4 g4Var = this.b;
        u7 u7Var = g4Var.r;
        if (g4Var.x > 0) {
            return;
        }
        float f7 = u7Var.e0;
        float f10 = g4Var.c;
        if (f7 >= f10 || i11 <= 0) {
            return;
        }
        float f11 = f7 + i11;
        iArr[1] = i11;
        if (f11 <= f10) {
            f10 = f11;
        }
        g4Var.setOffset(f10);
        u7Var.e0 = f10;
        a3 currentPeerView = u7Var.n0.getCurrentPeerView();
        if (currentPeerView != null) {
            currentPeerView.invalidate();
        }
        j7 j7Var = u7Var.v;
        if (j7Var != null) {
            j7Var.invalidate();
        }
    }

    @Override // r0.m
    public final void h(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        g4 g4Var = this.b;
        u7 u7Var = g4Var.r;
        if (g4Var.x <= 0 && i13 != 0 && i11 == 0) {
            float f7 = u7Var.e0;
            float f10 = i13 + f7;
            if (f10 <= f7) {
                f7 = f10;
            }
            g4Var.setOffset(f7);
            u7Var.e0 = f7;
            a3 currentPeerView = u7Var.n0.getCurrentPeerView();
            if (currentPeerView != null) {
                currentPeerView.invalidate();
            }
            j7 j7Var = u7Var.v;
            if (j7Var != null) {
                j7Var.invalidate();
            }
        }
    }

    @Override // r0.l
    public final void n(int i10, View view) {
        this.a.a = 0;
    }

    @Override // r0.l
    public final boolean o(View view, View view2, int i10, int i11) {
        return this.b.x <= 0 && i10 == 2;
    }

    @Override // r0.l
    public final void r(View view, View view2, int i10, int i11) {
        this.a.a = i10;
    }

    @Override // r0.l
    public final void b(ViewGroup viewGroup, int i10, int i11, int i12, int i13, int i14) {
    }
}
