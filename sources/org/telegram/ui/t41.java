package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class t41 extends org.telegram.ui.Components.kw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ x51 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t41(x51 x51Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, int i10, jv0 jv0Var, int i11, int i12) {
        super(context, d6Var, z10, z11, false, true, i10, jv0Var, i11, false);
        this.h0 = x51Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.kw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.kw
    public final boolean h(int i10) {
        int i11;
        l51 l51Var;
        x51 x51Var = this.h0;
        SparseIntArray sparseIntArray = x51Var.x0;
        if (x51Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            x51Var.Q = !x51Var.Q;
            x51Var.d0.setVisibility(8);
            org.telegram.ui.Components.kw kwVar = x51Var.c0[x51Var.Q ? 1 : 0];
            x51Var.d0 = kwVar;
            kwVar.setVisibility(0);
            x51Var.d0.x.setDrawable(getContext().getDrawable(x51Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            x51Var.d0.x.setContentDescription(LocaleController.getString(x51Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            x51Var.B(true, false, false);
            x51Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.gw gwVar = this.E;
        int i13 = ((gwVar == null || !this.b0) ? 0 : 1) + 1;
        if (gwVar != null && this.b0 && i10 == 1) {
            i11 = x51Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        x51.a(x51Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        x51Var.d0.j(i10, true);
        x51Var.h0.J1 = true;
        x51Var.v(null, true, true);
        o41 o41Var = x51Var.f0;
        if (o41Var != null && (l51Var = o41Var.n) != null) {
            l51Var.G1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.kw
    public final void i(org.telegram.ui.Components.gw gwVar) {
        ValueAnimator valueAnimator = this.h0.U1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            gwVar.setScaleX(0.0f);
            gwVar.setScaleY(0.0f);
        }
    }
}
