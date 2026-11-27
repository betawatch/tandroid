// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pba extends a8c {
    static {
        a8c.h(new pba());
    }

    public static b8c i(int i, int i2, int i3, int i4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        b8c K = b8c.K(pba.class);
        K.d = i;
        K.k = i4;
        K.m = charSequence;
        K.n = charSequence2;
        K.o = charSequence3;
        K.C = (i3 << 32) | (i2 & 4294967295L);
        return K;
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        long j = b8cVar.C;
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        qba qbaVar = (qba) view;
        int i3 = b8cVar.k;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        CharSequence charSequence3 = b8cVar.o;
        TextView textView = qbaVar.e;
        TextView textView2 = qbaVar.f;
        qbaVar.n = (i == 0 && i2 == 0) ? false : true;
        qbaVar.c.setVisibility(i3 != 0 ? 0 : 8);
        textView.setTranslationX(i3 == 0 ? hl.L(2.0f) : 0.0f);
        textView2.setTranslationX(i3 == 0 ? hl.L(2.0f) : 0.0f);
        qbaVar.b.b(i, i2);
        qbaVar.d.setImageResource(i3);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        qbaVar.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        qbaVar.setValue(charSequence3);
        qbaVar.updateColors();
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new qba(context, vnbVar);
    }
}
