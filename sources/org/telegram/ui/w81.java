package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class w81 extends org.telegram.ui.Components.g61 {
    static {
        org.telegram.ui.Components.g61.setup(new w81());
    }

    public static org.telegram.ui.Components.h61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.h61 K = org.telegram.ui.Components.h61.K(w81.class);
        K.l = str;
        K.m = charSequence;
        K.n = str2;
        K.D = onClickListener;
        K.o = charSequence2;
        K.E = onClickListener2;
        return K;
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        x81 x81Var = (x81) view;
        CharSequence charSequence = h61Var.l;
        CharSequence charSequence2 = h61Var.m;
        CharSequence charSequence3 = h61Var.n;
        View.OnClickListener onClickListener = h61Var.D;
        CharSequence charSequence4 = h61Var.o;
        View.OnClickListener onClickListener2 = h61Var.E;
        ci.d dVar = x81Var.e;
        org.telegram.ui.Components.q90 q90Var = x81Var.b;
        q90Var.setText(Emoji.replaceEmoji(charSequence, q90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.q90 q90Var2 = x81Var.c;
        q90Var2.setText(Emoji.replaceEmoji(charSequence2, q90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = x81Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new x81(context, d6Var);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return false;
    }
}
