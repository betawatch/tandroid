// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class v3c extends a8c {
    static {
        a8c.h(new v3c());
    }

    public static b8c i(int i, String str, String str2, String str3, t3c t3cVar) {
        return j(i, str, str2, str3, t3cVar, false, null, null);
    }

    public static b8c j(int i, String str, String str2, String str3, View.OnClickListener onClickListener, boolean z, View.OnClickListener onClickListener2, b0 b0Var) {
        b8c K = b8c.K(v3c.class);
        K.d = i;
        K.m = str;
        K.n = str2;
        K.o = str3;
        K.E = onClickListener;
        K.e = z;
        K.F = onClickListener2;
        K.H = b0Var;
        return K;
    }

    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        w3c w3cVar = (w3c) view;
        CharSequence charSequence = b8cVar.m;
        CharSequence charSequence2 = b8cVar.n;
        CharSequence charSequence3 = b8cVar.o;
        View.OnClickListener onClickListener = b8cVar.E;
        boolean z2 = b8cVar.e;
        View.OnClickListener onClickListener2 = b8cVar.F;
        Object obj = b8cVar.H;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = w3cVar.r;
        LinearLayout linearLayout2 = w3cVar.h;
        LinearLayout linearLayout3 = w3cVar.b;
        w3cVar.c.setText(charSequence);
        w3cVar.d.setText(charSequence2);
        w3cVar.e.setText(charSequence3);
        w3cVar.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        linearLayout3.setClickable(onClickListener != null);
        w3cVar.n.a(z2, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new jjb((Object) w3cVar, (Object) onClickListener3, (byte) 4));
        w3cVar.updateColors();
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        return TextUtils.equals(b8cVar.m, b8cVar2.m) && TextUtils.equals(b8cVar.n, b8cVar2.n) && TextUtils.equals(b8cVar.o, b8cVar2.o) && b8cVar.F == b8cVar2.F;
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new w3c(context, vnbVar);
    }

    @Override // a8c
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        return b8cVar.d == b8cVar2.d;
    }

    @Override // a8c
    public final boolean f() {
        return false;
    }
}
