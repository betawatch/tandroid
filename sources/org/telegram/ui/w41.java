package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w41 extends org.telegram.ui.Components.mv {
    public final /* synthetic */ int e0;
    public final /* synthetic */ a61 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w41(a61 a61Var, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, int i10, m21 m21Var, int i11, int i12) {
        super(context, c6Var, z10, z11, false, true, i10, m21Var, i11, false);
        this.f0 = a61Var;
        this.e0 = i12;
    }

    @Override // org.telegram.ui.Components.mv
    public final ColorFilter getEmojiColorFilter() {
        return this.f0.g1;
    }

    @Override // org.telegram.ui.Components.mv
    public final boolean h(int i10) {
        int i11;
        o51 o51Var;
        a61 a61Var = this.f0;
        SparseIntArray sparseIntArray = a61Var.t0;
        if (a61Var.s1) {
            return false;
        }
        int i12 = this.e0;
        if (i12 == 4 && i10 == 0) {
            a61Var.M = !a61Var.M;
            a61Var.W.setVisibility(8);
            org.telegram.ui.Components.mv mvVar = a61Var.V[a61Var.M ? 1 : 0];
            a61Var.W = mvVar;
            mvVar.setVisibility(0);
            a61Var.W.x.setDrawable(getContext().getDrawable(a61Var.M ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            a61Var.W.x.setContentDescription(LocaleController.getString(a61Var.M ? R.string.AccDescrStickers : R.string.Emoji));
            a61Var.B(true, false, false);
            a61Var.n0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.iv ivVar = this.A;
        int i13 = ((ivVar == null || !this.V) ? 0 : 1) + 1;
        if (ivVar != null && this.V && i10 == 1) {
            i11 = a61Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        a61.a(a61Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        a61Var.W.j(i10, true);
        a61Var.d0.H1 = true;
        a61Var.v(null, true, true);
        r41 r41Var = a61Var.b0;
        if (r41Var != null && (o51Var = r41Var.n) != null) {
            o51Var.F1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.mv
    public final void i(org.telegram.ui.Components.iv ivVar) {
        ValueAnimator valueAnimator = this.f0.Q1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            ivVar.setScaleX(0.0f);
            ivVar.setScaleY(0.0f);
        }
    }
}
