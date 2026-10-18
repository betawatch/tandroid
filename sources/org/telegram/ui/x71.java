package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class x71 extends org.telegram.ui.Components.e61 {
    static {
        org.telegram.ui.Components.e61.setup(new x71());
    }

    public static org.telegram.ui.Components.f61 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.f61 J = org.telegram.ui.Components.f61.J(x71.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, org.telegram.ui.Components.f61 f61Var, boolean z10, org.telegram.ui.Components.s61 s61Var, org.telegram.ui.Components.a71 a71Var) {
        y71 y71Var = (y71) view;
        CharSequence charSequence = f61Var.l;
        CharSequence charSequence2 = f61Var.m;
        CharSequence charSequence3 = f61Var.n;
        View.OnClickListener onClickListener = f61Var.D;
        CharSequence charSequence4 = f61Var.o;
        View.OnClickListener onClickListener2 = f61Var.E;
        ei.d dVar = y71Var.e;
        org.telegram.ui.Components.x90 x90Var = y71Var.b;
        x90Var.setText(Emoji.replaceEmoji(charSequence, x90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.x90 x90Var2 = y71Var.c;
        x90Var2.setText(Emoji.replaceEmoji(charSequence2, x90Var2.getPaint().getFontMetricsInt(), false));
        ei.d dVar2 = y71Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, org.telegram.ui.Components.im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y71(context, d6Var);
    }

    @Override // org.telegram.ui.Components.e61
    public final boolean isClickable() {
        return false;
    }
}
