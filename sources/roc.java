// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class roc extends b4c {
    public static final /* synthetic */ int b = 0;

    static {
        b4c.h(new roc());
    }

    @Override // b4c
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        soc socVar = (soc) view;
        String charSequence = c4cVar.m.toString();
        long j = c4cVar.C;
        int i = c4cVar.A;
        boolean z2 = c4cVar.r;
        TextView textView = socVar.c;
        TextView textView2 = socVar.b;
        textView2.setText(noc.Z(charSequence));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (j < 0) {
            spannableStringBuilder.append((CharSequence) k96.M0(2131748587, null));
            spannableStringBuilder.setSpan(new u86(gl.L(35.0f), textView), 0, spannableStringBuilder.length(), 33);
        } else {
            spannableStringBuilder.append((CharSequence) c.w(j, false));
        }
        if (i > 0) {
            spannableStringBuilder = new SpannableStringBuilder(k96.V(null, null, 2131742787, spannableStringBuilder, k96.Q(i)));
        }
        textView.setText(spannableStringBuilder);
        textView2.setAlpha(z2 ? 0.5f : 1.0f);
        textView.setAlpha(z2 ? 0.5f : 1.0f);
        socVar.d.setAlpha(z2 ? 0.5f : 1.0f);
    }

    @Override // b4c
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new soc(context, wjbVar);
    }
}
