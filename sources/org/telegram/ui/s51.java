package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s51 extends org.telegram.ui.Components.wv {
    public final /* synthetic */ int d0;
    public final /* synthetic */ x61 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(x61 x61Var, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10, int i10, b11 b11Var, int i11, int i12) {
        super(context, f6Var, z4, z10, false, true, i10, b11Var, i11, false);
        this.e0 = x61Var;
        this.d0 = i12;
    }

    @Override // org.telegram.ui.Components.wv
    public final ColorFilter getEmojiColorFilter() {
        return this.e0.h1;
    }

    @Override // org.telegram.ui.Components.wv
    public final boolean h(int i10) {
        int i11;
        k61 k61Var;
        x61 x61Var = this.e0;
        SparseIntArray sparseIntArray = x61Var.u0;
        if (x61Var.t1) {
            return false;
        }
        int i12 = this.d0;
        if (i12 == 4 && i10 == 0) {
            x61Var.N = !x61Var.N;
            x61Var.a0.setVisibility(8);
            org.telegram.ui.Components.wv wvVar = x61Var.W[x61Var.N ? 1 : 0];
            x61Var.a0 = wvVar;
            wvVar.setVisibility(0);
            x61Var.a0.x.setDrawable(getContext().getDrawable(x61Var.N ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            x61Var.a0.x.setContentDescription(LocaleController.getString(x61Var.N ? R.string.AccDescrStickers : R.string.Emoji));
            x61Var.B(true, false, false);
            x61Var.o0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.sv svVar = this.B;
        int i13 = ((svVar == null || !this.V) ? 0 : 1) + 1;
        if (svVar != null && this.V && i10 == 1) {
            i11 = x61Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        x61.a(x61Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        x61Var.a0.j(i10, true);
        x61Var.e0.I1 = true;
        x61Var.v(null, true, true);
        n51 n51Var = x61Var.c0;
        if (n51Var != null && (k61Var = n51Var.n) != null) {
            k61Var.E1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.wv
    public final void i(org.telegram.ui.Components.sv svVar) {
        ValueAnimator valueAnimator = this.e0.R1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            svVar.setScaleX(0.0f);
            svVar.setScaleY(0.0f);
        }
    }
}
