package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class y41 extends org.telegram.ui.Components.kw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ c61 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y41(c61 c61Var, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11, int i10, fy0 fy0Var, int i11, int i12) {
        super(context, u6Var, z10, z11, false, true, i10, fy0Var, i11, false);
        this.h0 = c61Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.kw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.kw
    public final boolean h(int i10) {
        int i11;
        q51 q51Var;
        c61 c61Var = this.h0;
        SparseIntArray sparseIntArray = c61Var.x0;
        if (c61Var.x1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            c61Var.Q = !c61Var.Q;
            c61Var.d0.setVisibility(8);
            org.telegram.ui.Components.kw kwVar = c61Var.c0[c61Var.Q ? 1 : 0];
            c61Var.d0 = kwVar;
            kwVar.setVisibility(0);
            c61Var.d0.x.setDrawable(getContext().getDrawable(c61Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            c61Var.d0.x.setContentDescription(LocaleController.getString(c61Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            c61Var.B(true, false, false);
            c61Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.gw gwVar = this.E;
        int i13 = ((gwVar == null || !this.b0) ? 0 : 1) + 1;
        if (gwVar != null && this.b0 && i10 == 1) {
            i11 = c61Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        c61.a(c61Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        c61Var.d0.j(i10, true);
        c61Var.h0.J1 = true;
        c61Var.v(null, true, true);
        t41 t41Var = c61Var.f0;
        if (t41Var != null && (q51Var = t41Var.n) != null) {
            q51Var.L1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kw
    public final void i(org.telegram.ui.Components.gw gwVar) {
        ValueAnimator valueAnimator = this.h0.V1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            gwVar.setScaleX(0.0f);
            gwVar.setScaleY(0.0f);
        }
    }
}
