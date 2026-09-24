package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class x81 extends org.telegram.ui.Components.u51 {
    static {
        org.telegram.ui.Components.u51.setup(new x81());
    }

    public static org.telegram.ui.Components.v51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.v51 J = org.telegram.ui.Components.v51.J(x81.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.u51
    public final void bindView(View view, org.telegram.ui.Components.v51 v51Var, boolean z10, org.telegram.ui.Components.j61 j61Var, org.telegram.ui.Components.r61 r61Var) {
        y81 y81Var = (y81) view;
        CharSequence charSequence = v51Var.l;
        CharSequence charSequence2 = v51Var.m;
        CharSequence charSequence3 = v51Var.n;
        View.OnClickListener onClickListener = v51Var.D;
        CharSequence charSequence4 = v51Var.o;
        View.OnClickListener onClickListener2 = v51Var.E;
        ci.d dVar = y81Var.e;
        org.telegram.ui.Components.n90 n90Var = y81Var.b;
        n90Var.setText(Emoji.replaceEmoji(charSequence, n90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.n90 n90Var2 = y81Var.c;
        n90Var2.setText(Emoji.replaceEmoji(charSequence2, n90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = y81Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, org.telegram.ui.Components.wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y81(context, d6Var);
    }

    @Override // org.telegram.ui.Components.u51
    public final boolean isClickable() {
        return false;
    }
}
