// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wzb extends b4c {
    static {
        b4c.h(new wzb());
    }

    public static c4c i(int i, String str, String str2, String str3, tzb tzbVar) {
        return j(i, str, str2, str3, tzbVar, false, null, null);
    }

    public static c4c j(int i, String str, String str2, String str3, View.OnClickListener onClickListener, boolean z, View.OnClickListener onClickListener2, a0 a0Var) {
        c4c K = c4c.K(wzb.class);
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

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        xzb xzbVar = (xzb) view;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        CharSequence charSequence3 = c4cVar.o;
        View.OnClickListener onClickListener = c4cVar.E;
        boolean z2 = c4cVar.e;
        View.OnClickListener onClickListener2 = c4cVar.F;
        Object obj = c4cVar.H;
        View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
        LinearLayout linearLayout = xzbVar.r;
        LinearLayout linearLayout2 = xzbVar.h;
        LinearLayout linearLayout3 = xzbVar.b;
        xzbVar.c.setText(charSequence);
        xzbVar.d.setText(charSequence2);
        xzbVar.e.setText(charSequence3);
        xzbVar.f.setVisibility(onClickListener != null ? 0 : 8);
        linearLayout3.setOnClickListener(onClickListener);
        byte b = 1;
        linearLayout3.setClickable(onClickListener != null);
        xzbVar.n.a(z2, false);
        linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
        linearLayout2.setOnClickListener(onClickListener2);
        linearLayout.setVisibility(onClickListener3 != null ? 0 : 8);
        linearLayout.setOnClickListener(new vzb(xzbVar, onClickListener3, b));
        xzbVar.updateColors();
    }

    @Override // b4c
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        return TextUtils.equals(c4cVar.m, c4cVar2.m) && TextUtils.equals(c4cVar.n, c4cVar2.n) && TextUtils.equals(c4cVar.o, c4cVar2.o) && c4cVar.F == c4cVar2.F;
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new xzb(context, wjbVar);
    }

    @Override // b4c
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.d == c4cVar2.d;
    }

    @Override // b4c
    public final boolean f() {
        return false;
    }
}
