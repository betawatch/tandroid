package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Emoji;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class u81 extends org.telegram.ui.Components.h51 {
    static {
        org.telegram.ui.Components.h51.setup(new u81());
    }

    public static org.telegram.ui.Components.i51 a(String str, CharSequence charSequence, String str2, View.OnClickListener onClickListener, CharSequence charSequence2, View.OnClickListener onClickListener2) {
        org.telegram.ui.Components.i51 J = org.telegram.ui.Components.i51.J(u81.class);
        J.l = str;
        J.m = charSequence;
        J.n = str2;
        J.D = onClickListener;
        J.o = charSequence2;
        J.E = onClickListener2;
        return J;
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, org.telegram.ui.Components.i51 i51Var, boolean z4, org.telegram.ui.Components.w51 w51Var, org.telegram.ui.Components.g61 g61Var) {
        v81 v81Var = (v81) view;
        CharSequence charSequence = i51Var.l;
        CharSequence charSequence2 = i51Var.m;
        CharSequence charSequence3 = i51Var.n;
        View.OnClickListener onClickListener = i51Var.D;
        CharSequence charSequence4 = i51Var.o;
        View.OnClickListener onClickListener2 = i51Var.E;
        ph.d dVar = v81Var.e;
        org.telegram.ui.Components.f90 f90Var = v81Var.b;
        f90Var.setText(Emoji.replaceEmoji(charSequence, f90Var.getPaint().getFontMetricsInt(), false));
        org.telegram.ui.Components.f90 f90Var2 = v81Var.c;
        f90Var2.setText(Emoji.replaceEmoji(charSequence2, f90Var2.getPaint().getFontMetricsInt(), false));
        ph.d dVar2 = v81Var.d;
        dVar2.setVisibility(TextUtils.isEmpty(charSequence3) ? 8 : 0);
        dVar2.setText(charSequence3);
        dVar2.setOnClickListener(onClickListener);
        dVar.setText(charSequence4);
        dVar.setOnClickListener(onClickListener2);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, org.telegram.ui.Components.rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v81(context, f6Var);
    }

    @Override // org.telegram.ui.Components.h51
    public final boolean isClickable() {
        return false;
    }
}
