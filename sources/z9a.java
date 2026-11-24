// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z9a extends b6c {
    static {
        b6c.h(new z9a());
    }

    public static c6c i(int i, int i2, int i3, int i4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        c6c K = c6c.K(z9a.class);
        K.d = i;
        K.k = i4;
        K.m = charSequence;
        K.n = charSequence2;
        K.o = charSequence3;
        K.C = (i3 << 32) | (i2 & 4294967295L);
        return K;
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        long j = c6cVar.C;
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        aaa aaaVar = (aaa) view;
        int i3 = c6cVar.k;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        CharSequence charSequence3 = c6cVar.o;
        TextView textView = aaaVar.e;
        TextView textView2 = aaaVar.f;
        aaaVar.n = (i == 0 && i2 == 0) ? false : true;
        aaaVar.c.setVisibility(i3 != 0 ? 0 : 8);
        textView.setTranslationX(i3 == 0 ? gm.L(2.0f) : 0.0f);
        textView2.setTranslationX(i3 == 0 ? gm.L(2.0f) : 0.0f);
        aaaVar.b.b(i, i2);
        aaaVar.d.setImageResource(i3);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        aaaVar.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        aaaVar.setValue(charSequence3);
        aaaVar.updateColors();
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new aaa(context, ylbVar);
    }
}
