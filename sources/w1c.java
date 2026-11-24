// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w1c extends b6c {
    static {
        b6c.h(new w1c());
    }

    public static c6c i(int i, String str, String str2, String str3, u1c u1cVar) {
        return j(i, str, str2, str3, u1cVar, false, null, null);
    }

    public static c6c j(int i, String str, String str2, String str3, View.OnClickListener onClickListener, boolean z, View.OnClickListener onClickListener2, a0 a0Var) {
        c6c K = c6c.K(w1c.class);
        K.d = i;
        K.m = str;
        K.n = str2;
        K.o = str3;
        K.E = onClickListener;
        K.e = z;
        K.F = onClickListener2;
        K.H = a0Var;
        return K;
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        x1c x1cVar = (x1c) view;
        CharSequence charSequence = c6cVar.m;
        CharSequence charSequence2 = c6cVar.n;
        CharSequence charSequence3 = c6cVar.o;
        View.OnClickListener onClickListener = c6cVar.E;
        boolean z2 = c6cVar.e;
        View.OnClickListener onClickListener2 = c6cVar.F;
        Object obj = c6cVar.H;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = x1cVar.r;
        LinearLayout linearLayout2 = x1cVar.h;
        LinearLayout linearLayout3 = x1cVar.b;
        x1cVar.c.setText(charSequence);
        x1cVar.d.setText(charSequence2);
        x1cVar.e.setText(charSequence3);
        x1cVar.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        x1cVar.n.a(z2, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new fyb(x1cVar, onClickListener3, (byte) 2));
        x1cVar.updateColors();
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        return TextUtils.equals(c6cVar.m, c6cVar2.m) && TextUtils.equals(c6cVar.n, c6cVar2.n) && TextUtils.equals(c6cVar.o, c6cVar2.o) && c6cVar.F == c6cVar2.F;
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new x1c(context, ylbVar);
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d;
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
