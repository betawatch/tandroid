// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class qba extends a8c {
    static {
        a8c.h(new qba());
    }

    public static b8c i(int i, int i2, int i3, int i4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        b8c K = b8c.K(qba.class);
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
        rba rbaVar = (rba) view;
        int i3 = b8cVar.k;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        CharSequence charSequence3 = b8cVar.o;
        TextView textView = rbaVar.e;
        TextView textView2 = rbaVar.f;
        rbaVar.n = (i == 0 && i2 == 0) ? false : true;
        rbaVar.c.setVisibility(i3 != 0 ? 0 : 8);
        textView.setTranslationX(i3 == 0 ? hl.L(2.0f) : 0.0f);
        textView2.setTranslationX(i3 == 0 ? hl.L(2.0f) : 0.0f);
        rbaVar.b.b(i, i2);
        rbaVar.d.setImageResource(i3);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        rbaVar.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        rbaVar.setValue(charSequence3);
        rbaVar.updateColors();
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new rba(context, vnbVar);
    }
}
