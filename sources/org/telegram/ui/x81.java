package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class x81 extends org.telegram.ui.Components.w51 {
    static {
        org.telegram.ui.Components.w51.setup(new x81());
    }

    public static org.telegram.ui.Components.x51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.x51 J = org.telegram.ui.Components.x51.J(x81.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.w51
    public final void bindView(View view, org.telegram.ui.Components.x51 x51Var, boolean z10, org.telegram.ui.Components.l61 l61Var, org.telegram.ui.Components.t61 t61Var) {
        y81 y81Var = (y81) view;
        CharSequence charSequence = x51Var.l;
        CharSequence charSequence2 = x51Var.m;
        CharSequence charSequence3 = x51Var.n;
        View.OnClickListener onClickListener = x51Var.D;
        CharSequence charSequence4 = x51Var.o;
        View.OnClickListener onClickListener2 = x51Var.E;
        ci.d dVar = y81Var.e;
        org.telegram.ui.Components.p90 p90Var = y81Var.b;
        p90Var.setText(Emoji.replaceEmoji(charSequence, p90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.p90 p90Var2 = y81Var.c;
        p90Var2.setText(Emoji.replaceEmoji(charSequence2, p90Var2.getPaint().getFontMetricsInt(), false));
        ci.d dVar2 = y81Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, org.telegram.ui.Components.yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y81(context, d6Var);
    }

    @Override // org.telegram.ui.Components.w51
    public final boolean isClickable() {
        return false;
    }
}
