package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class y51 extends org.telegram.ui.Components.gw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ c71 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y51(c71 c71Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, int i10, wx0 wx0Var, int i11, int i12) {
        super(context, d6Var, z10, z11, false, true, i10, wx0Var, i11, false);
        this.h0 = c71Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.gw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.gw
    public final boolean h(int i10) {
        int i11;
        q61 q61Var;
        c71 c71Var = this.h0;
        SparseIntArray sparseIntArray = c71Var.x0;
        if (c71Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            c71Var.Q = !c71Var.Q;
            c71Var.d0.setVisibility(8);
            org.telegram.ui.Components.gw gwVar = c71Var.c0[c71Var.Q ? 1 : 0];
            c71Var.d0 = gwVar;
            gwVar.setVisibility(0);
            c71Var.d0.x.setDrawable(getContext().getDrawable(c71Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            c71Var.d0.x.setContentDescription(LocaleController.getString(c71Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            c71Var.B(true, false, false);
            c71Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.cw cwVar = this.E;
        int i13 = ((cwVar == null || !this.b0) ? 0 : 1) + 1;
        if (cwVar != null && this.b0 && i10 == 1) {
            i11 = c71Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        c71.a(c71Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        c71Var.d0.j(i10, true);
        c71Var.h0.L1 = true;
        c71Var.v(null, true, true);
        t51 t51Var = c71Var.f0;
        if (t51Var != null && (q61Var = t51Var.n) != null) {
            q61Var.H1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.gw
    public final void i(org.telegram.ui.Components.cw cwVar) {
        ValueAnimator valueAnimator = this.h0.U1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            cwVar.setScaleX(0.0f);
            cwVar.setScaleY(0.0f);
        }
    }
}
