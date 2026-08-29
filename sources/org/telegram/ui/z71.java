package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z71 extends org.telegram.ui.Components.v41 {
    static {
        org.telegram.ui.Components.v41.setup(new z71());
    }

    public static org.telegram.ui.Components.w41 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.w41 J = org.telegram.ui.Components.w41.J(z71.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, org.telegram.ui.Components.w41 w41Var, boolean z10, org.telegram.ui.Components.k51 k51Var, org.telegram.ui.Components.u51 u51Var) {
        a81 a81Var = (a81) view;
        CharSequence charSequence = w41Var.l;
        CharSequence charSequence2 = w41Var.m;
        CharSequence charSequence3 = w41Var.n;
        View.OnClickListener onClickListener = w41Var.D;
        CharSequence charSequence4 = w41Var.o;
        View.OnClickListener onClickListener2 = w41Var.E;
        nh.d dVar = a81Var.e;
        org.telegram.ui.Components.y80 y80Var = a81Var.b;
        y80Var.setText(Emoji.replaceEmoji(charSequence, y80Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.y80 y80Var2 = a81Var.c;
        y80Var2.setText(Emoji.replaceEmoji(charSequence2, y80Var2.getPaint().getFontMetricsInt(), false));
        nh.d dVar2 = a81Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, org.telegram.ui.Components.jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new a81(context, c6Var);
    }

    @Override // org.telegram.ui.Components.v41
    public final boolean isClickable() {
        return false;
    }
}
