// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qw9 extends cy3 {
    public final /* synthetic */ int g0;
    public final /* synthetic */ tx9 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qw9(tx9 tx9Var, Context context, wjb wjbVar, boolean z, boolean z2, int i, tj9 tj9Var, int i2, int i3) {
        super(context, wjbVar, z, z2, false, true, i, tj9Var, i2, false);
        this.h0 = tx9Var;
        this.g0 = i3;
    }

    @Override // cy3
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.l1;
    }

    @Override // cy3
    public final boolean h(int i) {
        int i2;
        ix9 ix9Var;
        tx9 tx9Var = this.h0;
        SparseIntArray sparseIntArray = tx9Var.y0;
        if (tx9Var.y1) {
            return false;
        }
        int i3 = this.g0;
        if (i3 == 4 && i == 0) {
            tx9Var.R = !tx9Var.R;
            tx9Var.e0.setVisibility(8);
            cy3 cy3Var = tx9Var.d0[tx9Var.R ? 1 : 0];
            tx9Var.e0 = cy3Var;
            cy3Var.setVisibility(0);
            tx9Var.e0.x.setDrawable(getContext().getDrawable(tx9Var.R ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            tx9Var.e0.x.setContentDescription(k96.M0(tx9Var.R ? 2131754755 : 2131751184, null));
            tx9Var.B(true, false, false);
            tx9Var.s0.g1(0, 0);
            return true;
        }
        zx3 zx3Var = this.E;
        int i4 = ((zx3Var == null || !this.b0) ? 0 : 1) + 1;
        if (zx3Var != null && this.b0 && i == 1) {
            i2 = tx9Var.n;
        } else {
            if ((i3 != 4 || i != 0) && i > 0) {
                int i5 = i - i4;
                if (sparseIntArray.indexOfKey(i5) >= 0) {
                    i2 = sparseIntArray.get(i5);
                }
            }
            i2 = 0;
        }
        tx9Var.u(i2, gl.L((i3 == 6 ? 7 : 0) - 2));
        tx9Var.e0.j(i, true);
        tx9Var.i0.K1 = true;
        tx9Var.v(null, true, true);
        lw9 lw9Var = tx9Var.g0;
        if (lw9Var != null && (ix9Var = lw9Var.n) != null) {
            ix9Var.I1(null);
        }
        return true;
    }

    @Override // cy3
    public final void i(zx3 zx3Var) {
        ValueAnimator valueAnimator = this.h0.W1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            zx3Var.setScaleX(0.0f);
            zx3Var.setScaleY(0.0f);
        }
    }
}
