package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class x71 extends org.telegram.ui.Components.k41 {
    static {
        org.telegram.ui.Components.k41.setup(new x71());
    }

    public static org.telegram.ui.Components.l41 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(x71.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.k41
    public final void bindView(View view, org.telegram.ui.Components.l41 l41Var, boolean z10, org.telegram.ui.Components.z41 z41Var, org.telegram.ui.Components.i51 i51Var) {
        y71 y71Var = (y71) view;
        CharSequence charSequence = l41Var.l;
        CharSequence charSequence2 = l41Var.m;
        CharSequence charSequence3 = l41Var.n;
        View.OnClickListener onClickListener = l41Var.D;
        CharSequence charSequence4 = l41Var.o;
        View.OnClickListener onClickListener2 = l41Var.E;
        kh.d dVar = y71Var.e;
        org.telegram.ui.Components.l80 l80Var = y71Var.b;
        l80Var.setText(Emoji.replaceEmoji(charSequence, l80Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.l80 l80Var2 = y71Var.c;
        l80Var2.setText(Emoji.replaceEmoji(charSequence2, l80Var2.getPaint().getFontMetricsInt(), false));
        kh.d dVar2 = y71Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, org.telegram.ui.Components.wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new y71(context, b6Var);
    }

    @Override // org.telegram.ui.Components.k41
    public final boolean isClickable() {
        return false;
    }
}
