package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s51 extends org.telegram.ui.Components.zv {
    public final /* synthetic */ int d0;
    public final /* synthetic */ w61 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s51(w61 w61Var, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10, int i10, h21 h21Var, int i11, int i12) {
        super(context, g6Var, z4, z10, false, true, i10, h21Var, i11, false);
        this.e0 = w61Var;
        this.d0 = i12;
    }

    @Override // org.telegram.ui.Components.zv
    public final ColorFilter getEmojiColorFilter() {
        return this.e0.h1;
    }

    @Override // org.telegram.ui.Components.zv
    public final boolean h(int i10) {
        int i11;
        k61 k61Var;
        w61 w61Var = this.e0;
        SparseIntArray sparseIntArray = w61Var.u0;
        if (w61Var.t1) {
            return false;
        }
        int i12 = this.d0;
        if (i12 == 4 && i10 == 0) {
            w61Var.N = !w61Var.N;
            w61Var.a0.setVisibility(8);
            org.telegram.ui.Components.zv zvVar = w61Var.W[w61Var.N ? 1 : 0];
            w61Var.a0 = zvVar;
            zvVar.setVisibility(0);
            w61Var.a0.x.setDrawable(getContext().getDrawable(w61Var.N ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            w61Var.a0.x.setContentDescription(LocaleController.getString(w61Var.N ? R.string.AccDescrStickers : R.string.Emoji));
            w61Var.B(true, false, false);
            w61Var.o0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.vv vvVar = this.B;
        int i13 = ((vvVar == null || !this.V) ? 0 : 1) + 1;
        if (vvVar != null && this.V && i10 == 1) {
            i11 = w61Var.n;
        } else {
            if ((i12 != 4 || i10 != 0) && i10 > 0) {
                int i14 = i10 - i13;
                if (sparseIntArray.indexOfKey(i14) >= 0) {
                    i11 = sparseIntArray.get(i14);
                }
            }
            i11 = 0;
        }
        w61.a(w61Var, i11, AndroidUtilities.dp((i12 == 6 ? 7 : 0) - 2));
        w61Var.a0.j(i10, true);
        w61Var.e0.I1 = true;
        w61Var.v(null, true, true);
        n51 n51Var = w61Var.c0;
        if (n51Var != null && (k61Var = n51Var.n) != null) {
            k61Var.E1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.zv
    public final void i(org.telegram.ui.Components.vv vvVar) {
        ValueAnimator valueAnimator = this.e0.R1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            vvVar.setScaleX(0.0f);
            vvVar.setScaleY(0.0f);
        }
    }
}
