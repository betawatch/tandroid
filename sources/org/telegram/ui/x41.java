package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class x41 extends org.telegram.ui.Components.kw {
    public final /* synthetic */ int g0;
    public final /* synthetic */ b61 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(b61 b61Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11, int i10, mv0 mv0Var, int i11, int i12) {
        super(context, g6Var, z10, z11, false, true, i10, mv0Var, i11, false);
        this.h0 = b61Var;
        this.g0 = i12;
    }

    @Override // org.telegram.ui.Components.kw
    public final ColorFilter getEmojiColorFilter() {
        return this.h0.k1;
    }

    @Override // org.telegram.ui.Components.kw
    public final boolean h(int i10) {
        int i11;
        p51 p51Var;
        b61 b61Var = this.h0;
        SparseIntArray sparseIntArray = b61Var.x0;
        if (b61Var.x1) {
            return false;
        }
        int i12 = this.g0;
        if (i12 == 4 && i10 == 0) {
            b61Var.Q = !b61Var.Q;
            b61Var.d0.setVisibility(8);
            org.telegram.ui.Components.kw kwVar = b61Var.c0[b61Var.Q ? 1 : 0];
            b61Var.d0 = kwVar;
            kwVar.setVisibility(0);
            b61Var.d0.x.setDrawable(getContext().getDrawable(b61Var.Q ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            b61Var.d0.x.setContentDescription(LocaleController.getString(b61Var.Q ? R.string.AccDescrStickers : R.string.Emoji));
            b61Var.B(true, false, false);
            b61Var.r0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.gw gwVar = this.E;
        int i13 = ((gwVar == null || !this.b0) ? 0 : 1) + 1;
        if (gwVar != null && this.b0 && i10 == 1) {
            i11 = b61Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        b61.a(b61Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        b61Var.d0.j(i10, true);
        b61Var.h0.J1 = true;
        b61Var.v(null, true, true);
        s41 s41Var = b61Var.f0;
        if (s41Var != null && (p51Var = s41Var.n) != null) {
            p51Var.L1(null);
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
