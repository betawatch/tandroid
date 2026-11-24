// default package

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wua extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new wua());
    }

    public static c4c i(int i, int i2, TL_stars.TL_starsTopupOption tL_starsTopupOption) {
        c4c K = c4c.K(wua.class);
        K.d = i;
        K.A = i2;
        long j = tL_starsTopupOption.stars;
        K.C = j;
        K.m = k96.H(' ', "StarsCount", (int) j);
        K.n = tL_starsTopupOption.loadingStorePrice ? null : ci0.h().e(tL_starsTopupOption.amount, tL_starsTopupOption.currency);
        K.H = tL_starsTopupOption;
        return K;
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        xua xuaVar = (xua) view;
        int i = c4cVar.A;
        CharSequence charSequence = c4cVar.m;
        CharSequence charSequence2 = c4cVar.n;
        hn hnVar = xuaVar.e;
        TextView textView = xuaVar.d;
        boolean equals = TextUtils.equals(textView.getText(), charSequence);
        xuaVar.n = i;
        if (!equals) {
            xuaVar.r.e(true, i);
        }
        textView.setText(charSequence);
        if (charSequence2 == null) {
            if (xuaVar.f == null) {
                SpannableString spannableString = new SpannableString("x");
                xuaVar.f = spannableString;
                spannableString.setSpan(new u86(gl.L(55.0f), hnVar), 0, xuaVar.f.length(), 33);
            }
            charSequence2 = xuaVar.f;
        }
        hnVar.setText(charSequence2);
        float f = k96.a0 ? -1.0f : 1.0f;
        if (equals) {
            textView.animate().translationX(f * (i - 1) * gl.L(2.66f)).setDuration(320L).setInterpolator(s33.h).start();
        } else {
            textView.setTranslationX(f * (i - 1) * gl.L(2.66f));
        }
        xuaVar.h = z;
        xuaVar.invalidate();
    }

    @Override // b4c
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.A == c4cVar2.A && c4cVar.d == c4cVar2.d && TextUtils.equals(c4cVar.n, c4cVar2.n);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new xua(context, wjbVar);
    }

    @Override // b4c
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        return c4cVar.d == c4cVar2.d;
    }
}
