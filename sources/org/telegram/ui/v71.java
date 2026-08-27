package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class v71 extends org.telegram.ui.Components.m41 {
    static {
        org.telegram.ui.Components.m41.setup(new v71());
    }

    public static org.telegram.ui.Components.n41 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.n41 J = org.telegram.ui.Components.n41.J(v71.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.m41
    public final void bindView(View view, org.telegram.ui.Components.n41 n41Var, boolean z10, org.telegram.ui.Components.b51 b51Var, org.telegram.ui.Components.k51 k51Var) {
        w71 w71Var = (w71) view;
        CharSequence charSequence = n41Var.l;
        CharSequence charSequence2 = n41Var.m;
        CharSequence charSequence3 = n41Var.n;
        View.OnClickListener onClickListener = n41Var.D;
        CharSequence charSequence4 = n41Var.o;
        View.OnClickListener onClickListener2 = n41Var.E;
        lh.d dVar = w71Var.e;
        org.telegram.ui.Components.p80 p80Var = w71Var.b;
        p80Var.setText(Emoji.replaceEmoji(charSequence, p80Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.p80 p80Var2 = w71Var.c;
        p80Var2.setText(Emoji.replaceEmoji(charSequence2, p80Var2.getPaint().getFontMetricsInt(), false));
        lh.d dVar2 = w71Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, org.telegram.ui.Components.zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new w71(context, c6Var);
    }

    @Override // org.telegram.ui.Components.m41
    public final boolean isClickable() {
        return false;
    }
}
