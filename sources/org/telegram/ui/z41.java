package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z41 extends org.telegram.ui.Components.tv {
    public final /* synthetic */ int c0;
    public final /* synthetic */ d61 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z41(d61 d61Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, int i10, t31 t31Var, int i11, int i12) {
        super(context, c6Var, z10, z11, false, true, i10, t31Var, i11, false);
        this.d0 = d61Var;
        this.c0 = i12;
    }

    @Override // org.telegram.ui.Components.tv
    public final ColorFilter getEmojiColorFilter() {
        return this.d0.g1;
    }

    @Override // org.telegram.ui.Components.tv
    public final boolean h(int i10) {
        int i11;
        r51 r51Var;
        d61 d61Var = this.d0;
        SparseIntArray sparseIntArray = d61Var.t0;
        if (d61Var.s1) {
            return false;
        }
        int i12 = this.c0;
        if (i12 == 4 && i10 == 0) {
            d61Var.M = !d61Var.M;
            d61Var.W.setVisibility(8);
            org.telegram.ui.Components.tv tvVar = d61Var.V[d61Var.M ? 1 : 0];
            d61Var.W = tvVar;
            tvVar.setVisibility(0);
            d61Var.W.x.setDrawable(getContext().getDrawable(d61Var.M ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            d61Var.W.x.setContentDescription(LocaleController.getString(d61Var.M ? R.string.AccDescrStickers : R.string.Emoji));
            d61Var.B(true, false, false);
            d61Var.n0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.pv pvVar = this.A;
        int i13 = ((pvVar == null || !this.U) ? 0 : 1) + 1;
        if (pvVar != null && this.U && i10 == 1) {
            i11 = d61Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        d61.a(d61Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        d61Var.W.j(i10, true);
        d61Var.d0.H1 = true;
        d61Var.v(null, true, true);
        u41 u41Var = d61Var.b0;
        if (u41Var != null && (r51Var = u41Var.n) != null) {
            r51Var.F1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.tv
    public final void i(org.telegram.ui.Components.pv pvVar) {
        ValueAnimator valueAnimator = this.d0.Q1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            pvVar.setScaleX(0.0f);
            pvVar.setScaleY(0.0f);
        }
    }
}
