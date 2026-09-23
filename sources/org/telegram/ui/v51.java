package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class v51 extends org.telegram.ui.Components.dw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ z61 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v51(z61 z61Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, int i10, by0 by0Var, int i11, int i12) {
        super(context, d6Var, z10, z11, false, true, i10, by0Var, i11, false);
        this.h0 = z61Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.dw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.dw
    public final boolean h(int i10) {
        int i11;
        n61 n61Var;
        z61 z61Var = this.h0;
        SparseIntArray sparseIntArray = z61Var.x0;
        if (z61Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            z61Var.Q = !z61Var.Q;
            z61Var.d0.setVisibility(8);
            org.telegram.ui.Components.dw dwVar = z61Var.c0[z61Var.Q ? 1 : 0];
            z61Var.d0 = dwVar;
            dwVar.setVisibility(0);
            z61Var.d0.x.setDrawable(getContext().getDrawable(z61Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            z61Var.d0.x.setContentDescription(LocaleController.getString(z61Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            z61Var.B(true, false, false);
            z61Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.zv zvVar = this.E;
        int i13 = ((zvVar == null || !this.b0) ? 0 : 1) + 1;
        if (zvVar != null && this.b0 && i10 == 1) {
            i11 = z61Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        z61.a(z61Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        z61Var.d0.j(i10, true);
        z61Var.h0.L1 = true;
        z61Var.v(null, true, true);
        q51 q51Var = z61Var.f0;
        if (q51Var != null && (n61Var = q51Var.n) != null) {
            n61Var.F1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.dw
    public final void i(org.telegram.ui.Components.zv zvVar) {
        ValueAnimator valueAnimator = this.h0.U1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            zvVar.setScaleX(0.0f);
            zvVar.setScaleY(0.0f);
        }
    }
}
