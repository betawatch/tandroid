package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.util.SparseIntArray;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x41 extends org.telegram.ui.Components.nv {
    public final /* synthetic */ int c0;
    public final /* synthetic */ b61 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x41(b61 b61Var, Context context, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11, int i9, n21 n21Var, int i10, int i11) {
        super(context, b6Var, z10, z11, false, true, i9, n21Var, i10, false);
        this.d0 = b61Var;
        this.c0 = i11;
    }

    @Override // org.telegram.ui.Components.nv
    public final ColorFilter getEmojiColorFilter() {
        return this.d0.g1;
    }

    @Override // org.telegram.ui.Components.nv
    public final boolean h(int i9) {
        int i10;
        p51 p51Var;
        b61 b61Var = this.d0;
        SparseIntArray sparseIntArray = b61Var.t0;
        if (b61Var.s1) {
            return false;
        }
        int i11 = this.c0;
        if (i11 == 4 && i9 == 0) {
            b61Var.M = !b61Var.M;
            b61Var.W.setVisibility(8);
            org.telegram.ui.Components.nv nvVar = b61Var.V[b61Var.M ? 1 : 0];
            b61Var.W = nvVar;
            nvVar.setVisibility(0);
            b61Var.W.x.setDrawable(getContext().getDrawable(b61Var.M ? R.drawable.msg_emoji_stickers : R.drawable.msg_emoji_smiles));
            b61Var.W.x.setContentDescription(LocaleController.getString(b61Var.M ? R.string.AccDescrStickers : R.string.Emoji));
            b61Var.B(true, false, false);
            b61Var.n0.h1(0, 0);
            return true;
        }
        org.telegram.ui.Components.jv jvVar = this.A;
        int i12 = ((jvVar == null || !this.U) ? 0 : 1) + 1;
        if (jvVar != null && this.U && i9 == 1) {
            i10 = b61Var.n;
        } else {
            if ((i11 != 4 || i9 != 0) && i9 > 0) {
                int i13 = i9 - i12;
                if (sparseIntArray.indexOfKey(i13) >= 0) {
                    i10 = sparseIntArray.get(i13);
                }
            }
            i10 = 0;
        }
        b61.a(b61Var, i10, AndroidUtilities.dp((i11 == 6 ? 7 : 0) - 2));
        b61Var.W.j(i9, true);
        b61Var.d0.H1 = true;
        b61Var.v(null, true, true);
        s41 s41Var = b61Var.b0;
        if (s41Var != null && (p51Var = s41Var.n) != null) {
            p51Var.F1(null);
        }
        return true;
    }

    @Override // org.telegram.ui.Components.nv
    public final void i(org.telegram.ui.Components.jv jvVar) {
        ValueAnimator valueAnimator = this.d0.Q1;
        if (valueAnimator == null || valueAnimator.isRunning()) {
            jvVar.setScaleX(0.0f);
            jvVar.setScaleY(0.0f);
        }
    }
}
