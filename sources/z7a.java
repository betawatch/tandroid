// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class z7a extends b4c {
    static {
        b4c.h(new z7a());
    }

    public static c4c i(int i, int i2, int i3, int i4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        c4c K = c4c.K(z7a.class);
        K.d = i;
        K.k = i4;
        K.m = charSequence;
        K.n = charSequence2;
        K.o = charSequence3;
        K.C = (i3 << 32) | (i2 & 4294967295L);
        return K;
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        long j = c4cVar.C;
        int i = (int) j;
        int i2 = (int) (j >>> 32);
        a8a a8aVar = (a8a) view;
        int i3 = c4cVar.k;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        CharSequence charSequence3 = c4cVar.o;
        TextView textView = a8aVar.e;
        TextView textView2 = a8aVar.f;
        a8aVar.n = (i == 0 && i2 == 0) ? false : true;
        a8aVar.c.setVisibility(i3 != 0 ? 0 : 8);
        textView.setTranslationX(i3 == 0 ? gl.L(2.0f) : 0.0f);
        textView2.setTranslationX(i3 == 0 ? gl.L(2.0f) : 0.0f);
        a8aVar.b.b(i, i2);
        a8aVar.d.setImageResource(i3);
        textView.setText(charSequence);
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        a8aVar.r = !isEmpty;
        textView2.setVisibility(isEmpty ? 8 : 0);
        textView2.setText(charSequence2);
        a8aVar.setValue(charSequence3);
        a8aVar.updateColors();
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new a8a(context, wjbVar);
    }
}
