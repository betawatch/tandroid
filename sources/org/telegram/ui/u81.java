package org.telegram.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class u81 extends org.telegram.ui.Components.g61 {
    static {
        org.telegram.ui.Components.g61.setup(new u81());
    }

    public static org.telegram.ui.Components.h61 a(int i10, int i11, int i12, int i13, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        org.telegram.ui.Components.h61 K = org.telegram.ui.Components.h61.K(u81.class);
        K.d = i10;
        K.k = i13;
        K.l = charSequence;
        K.m = charSequence2;
        K.n = charSequence3;
        K.B = (i11 & 4294967295L) | (i12 << 32);
        return K;
    }

    @Override // org.telegram.ui.Components.g61
    public final void bindView(View view, org.telegram.ui.Components.h61 h61Var, boolean z10, org.telegram.ui.Components.w61 w61Var, org.telegram.ui.Components.e71 e71Var) {
        long j3 = h61Var.B;
        int i10 = (int) j3;
        int i11 = (int) (j3 >>> 32);
        v81 v81Var = (v81) view;
        int i12 = h61Var.k;
        CharSequence charSequence = h61Var.l;
        CharSequence charSequence2 = h61Var.m;
        CharSequence charSequence3 = h61Var.n;
        TextView textView = v81Var.e;
        TextView textView2 = v81Var.f;
        v81Var.c.setVisibility(i12 != 0 ? 0 : 8);
        textView.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        textView2.setTranslationX(i12 == 0 ? AndroidUtilities.dp(2.0f) : 0.0f);
        v81Var.b.b(i10, i11);
        v81Var.d.setImageResource(i12);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        v81Var.n = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        v81Var.setValue(charSequence3);
    }

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, org.telegram.ui.Components.zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new v81(context, d6Var);
    }
}
