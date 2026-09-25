package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class w51 extends org.telegram.ui.Components.dw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ a71 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w51(a71 a71Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, int i10, jx0 jx0Var, int i11, int i12) {
        super(context, d6Var, z10, z11, false, true, i10, jx0Var, i11, false);
        this.h0 = a71Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.dw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.dw
    public final boolean h(int i10) {
        int i11;
        o61 o61Var;
        a71 a71Var = this.h0;
        SparseIntArray sparseIntArray = a71Var.x0;
        if (a71Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            a71Var.Q = !a71Var.Q;
            a71Var.d0.setVisibility(8);
            org.telegram.ui.Components.dw dwVar = a71Var.c0[a71Var.Q ? 1 : 0];
            a71Var.d0 = dwVar;
            dwVar.setVisibility(0);
            a71Var.d0.x.setDrawable(getContext().getDrawable(a71Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            a71Var.d0.x.setContentDescription(LocaleController.getString(a71Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            a71Var.B(true, false, false);
            a71Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.zv zvVar = this.E;
        int i13 = ((zvVar == null || !this.b0) ? 0 : 1) + 1;
        if (zvVar != null && this.b0 && i10 == 1) {
            i11 = a71Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        a71.a(a71Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        a71Var.d0.j(i10, true);
        a71Var.h0.L1 = true;
        a71Var.v(null, true, true);
        r51 r51Var = a71Var.f0;
        if (r51Var != null && (o61Var = r51Var.n) != null) {
            o61Var.F1(null);
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
