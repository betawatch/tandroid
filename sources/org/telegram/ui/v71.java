package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class v71 extends org.telegram.ui.Components.g61 {
    static {
        org.telegram.ui.Components.g61.setup(new v71());
    }

    public static org.telegram.ui.Components.h61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.h61 J = org.telegram.ui.Components.h61.J(v71.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.u61 u61Var, org.telegram.ui.Components.c71 c71Var) {
        w71 w71Var = (w71) view;
        CharSequence charSequence = h61Var.l;
        CharSequence charSequence2 = h61Var.m;
        CharSequence charSequence3 = h61Var.n;
        View.OnClickListener onClickListener = h61Var.D;
        CharSequence charSequence4 = h61Var.o;
        View.OnClickListener onClickListener2 = h61Var.E;
        ei.d dVar = w71Var.e;
        org.telegram.ui.Components.x90 x90Var = w71Var.b;
        x90Var.setText(Emoji.replaceEmoji(charSequence, x90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.x90 x90Var2 = w71Var.c;
        x90Var2.setText(Emoji.replaceEmoji(charSequence2, x90Var2.getPaint().getFontMetricsInt(), false));
        ei.d dVar2 = w71Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, org.telegram.ui.Components.jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w71(context, d6Var);
    }

    @Override // org.telegram.ui.Components.g61
    public final boolean isClickable() {
        return false;
    }
}
