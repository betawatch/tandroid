package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class v41 extends org.telegram.ui.Components.kw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ z51 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(z51 z51Var, Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, int i10, lv0 lv0Var, int i11, int i12) {
        super(context, d6Var, z10, z11, false, true, i10, lv0Var, i11, false);
        this.h0 = z51Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.kw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.kw
    public final boolean h(int i10) {
        int i11;
        n51 n51Var;
        z51 z51Var = this.h0;
        SparseIntArray sparseIntArray = z51Var.x0;
        if (z51Var.w1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            z51Var.Q = !z51Var.Q;
            z51Var.d0.setVisibility(8);
            org.telegram.ui.Components.kw kwVar = z51Var.c0[z51Var.Q ? 1 : 0];
            z51Var.d0 = kwVar;
            kwVar.setVisibility(0);
            z51Var.d0.x.setDrawable(getContext().getDrawable(z51Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            z51Var.d0.x.setContentDescription(LocaleController.getString(z51Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            z51Var.B(true, false, false);
            z51Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.gw gwVar = this.E;
        int i13 = ((gwVar == null || !this.b0) ? 0 : 1) + 1;
        if (gwVar != null && this.b0 && i10 == 1) {
            i11 = z51Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        z51.a(z51Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        z51Var.d0.j(i10, true);
        z51Var.h0.J1 = true;
        z51Var.v(null, true, true);
        q41 q41Var = z51Var.f0;
        if (q41Var != null && (n51Var = q41Var.n) != null) {
            n51Var.G1(null);
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
