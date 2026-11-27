// default package

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class z3c extends a8c {
    static {
        a8c.h(new z3c());
    }

    public static b8c i(int i, CharSequence charSequence, boolean z, View.OnClickListener onClickListener, o66 o66Var, View.OnClickListener onClickListener2) {
        b8c K = b8c.K(z3c.class);
        K.d = i;
        K.m = charSequence;
        K.f = z;
        K.u = false;
        K.E = onClickListener;
        K.H = o66Var;
        K.F = onClickListener2;
        return K;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a8c
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        int i;
        ImageView imageView;
        a4c a4cVar = (a4c) view;
        CharSequence charSequence = b8cVar.m;
        boolean z2 = b8cVar.f;
        View.OnClickListener onClickListener = b8cVar.E;
        Object obj = b8cVar.H;
        o66 o66Var = obj != null ? (o66) obj : null;
        boolean z3 = b8cVar.u;
        View.OnClickListener onClickListener2 = b8cVar.F;
        ImageView imageView2 = a4cVar.n;
        TextView textView = a4cVar.d;
        x3c x3cVar = a4cVar.c;
        y3c y3cVar = a4cVar.f;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : hm.cloneSpans(charSequence));
        int i2 = 0;
        ya6[] ya6VarArr = (ya6[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ya6.class);
        if (ya6VarArr != null) {
            while (i2 < ya6VarArr.length) {
                int spanStart = spannableStringBuilder.getSpanStart(ya6VarArr[i2]);
                int spanEnd = spannableStringBuilder.getSpanEnd(ya6VarArr[i2]);
                boolean z4 = z3;
                spannableStringBuilder.removeSpan(ya6VarArr[i2]);
                int i3 = i2;
                ya6 ya6Var = ya6VarArr[i3];
                View.OnClickListener onClickListener3 = onClickListener2;
                ya6 ya6Var2 = new ya6(y3cVar, ya6Var.a, ya6Var.d, null);
                ya6 ya6Var3 = ya6VarArr[i3];
                ya6Var2.f = ya6Var3.f;
                ya6Var2.h = ya6Var3.h;
                ya6Var2.n = ya6Var3.n;
                if (!ya6Var3.n || vm2.h(aob.v0(aob.G6, a4cVar.a)) <= 0.5d) {
                    imageView = imageView2;
                } else {
                    float max = Math.max(0.05f, ya6VarArr[i3].h);
                    imageView = imageView2;
                    ya6Var2.a(aob.p1(Math.min(1.0f, 0.07f / max), -1), aob.p1(Math.min(1.0f, 0.115f / max), -1));
                }
                spannableStringBuilder.setSpan(ya6Var2, spanStart, spanEnd, 33);
                i2 = i3 + 1;
                z3 = z4;
                onClickListener2 = onClickListener3;
                imageView2 = imageView;
            }
        }
        View.OnClickListener onClickListener4 = onClickListener2;
        boolean z5 = z3;
        ImageView imageView3 = imageView2;
        if (!a4cVar.h || z2) {
            i = 0;
            x3cVar.setVisibility(z2 ? 0 : 8);
            y3cVar.setVisibility(!z2 ? 0 : 8);
        } else {
            i = 0;
            x3cVar.setVisibility(0);
            y3cVar.setVisibility(0);
            ViewPropertyAnimator withEndAction = x3cVar.animate().alpha(0.0f).withEndAction(new azb(a4cVar, (byte) 2));
            TimeInterpolator timeInterpolator = k43.h;
            withEndAction.setInterpolator(timeInterpolator).setDuration(320L).start();
            y3cVar.animate().alpha(1.0f).setInterpolator(timeInterpolator).setDuration(320L).start();
        }
        a4cVar.h = z2;
        textView.setVisibility(z2 ? i : 8);
        textView.setOnClickListener(onClickListener);
        a4cVar.setClipChildren(z2);
        x3cVar.setText(spannableStringBuilder);
        y3cVar.setText(spannableStringBuilder);
        y3cVar.setTextIsSelectable((z5 || !(ya6VarArr == null || ya6VarArr.length == 0)) ? i : 1);
        y3cVar.setOnLinkPressListener(o66Var);
        imageView3.setVisibility(onClickListener4 != null ? i : 8);
        imageView3.setOnClickListener(onClickListener4);
        a4cVar.b = z;
        a4cVar.setWillNotDraw(!z);
    }

    @Override // a8c
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        return TextUtils.equals(b8cVar.m, b8cVar2.m) && b8cVar.f == b8cVar2.f;
    }

    @Override // a8c
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new a4c(context, vnbVar);
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
