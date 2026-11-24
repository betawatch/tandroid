// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sy9 extends mz3 {
    public final /* synthetic */ int g0;
    public final /* synthetic */ vz9 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sy9(vz9 vz9Var, Context context, ylb ylbVar, boolean z, boolean z2, int i, il9 il9Var, int i2, int i3) {
        super(context, ylbVar, z, z2, false, true, i, il9Var, i2, false);
        this.h0 = vz9Var;
        this.g0 = i3;
    }

    @Override // mz3
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.l1;
    }

    @Override // mz3
    public final boolean h(int i) {
        int i2;
        kz9 kz9Var;
        vz9 vz9Var = this.h0;
        SparseIntArray sparseIntArray = vz9Var.y0;
        if (vz9Var.y1) {
            return false;
        }
        int i3 = this.g0;
        if (i3 == 4 && i == 0) {
            vz9Var.R = !vz9Var.R;
            vz9Var.e0.setVisibility(8);
            mz3 mz3Var = vz9Var.d0[vz9Var.R ? 1 : 0];
            vz9Var.e0 = mz3Var;
            mz3Var.setVisibility(0);
            vz9Var.e0.x.setDrawable(getContext().getDrawable(vz9Var.R ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            vz9Var.e0.x.setContentDescription(jb6.M0(vz9Var.R ? 2131754755 : 2131751133, null));
            vz9Var.B(true, false, false);
            vz9Var.s0.g1(0, 0);
            return true;
        }
        jz3 jz3Var = this.E;
        int i4 = ((jz3Var == null || !this.b0) ? 0 : 1) + 1;
        if (jz3Var != null && this.b0 && i == 1) {
            i2 = vz9Var.n;
        } else {
            if ((i3 != 4 || i != 0) && i > 0) {
                int i5 = i - i4;
                if (sparseIntArray.indexOfKey(i5) >= 0) {
                    i2 = sparseIntArray.get(i5);
                }
            }
            i2 = 0;
        }
        vz9Var.u(i2, gm.L((i3 == 6 ? 7 : 0) - 2));
        vz9Var.e0.j(i, true);
        vz9Var.i0.K1 = true;
        vz9Var.v(null, true, true);
        ny9 ny9Var = vz9Var.g0;
        if (ny9Var != null && (kz9Var = ny9Var.n) != null) {
            kz9Var.I1(null);
        }
        return true;
    }

    @Override // mz3
    public final void i(jz3 jz3Var) {
        ValueAnimator valueAnimator = this.h0.W1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            jz3Var.setScaleX(0.0f);
            jz3Var.setScaleY(0.0f);
        }
    }
}
