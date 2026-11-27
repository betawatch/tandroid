// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class yn2 extends ny0 {
    public final rg2 S1;
    public l9c T1;

    public yn2(Context context, TLRPC.Chat chat, Runnable runnable) {
        super((vnb) null, context, false);
        this.E1 = hl.L(30.0f);
        d79 d79Var = this.n1;
        int i = this.u0;
        d79Var.setPadding(i, 0, i, hl.L(130.0f) + hl.n);
        this.n1.setClipToPadding(false);
        c51 c51Var = new c51(this.J0, context, true);
        c51Var.setText(ob6.M0(2131752570, null));
        c51Var.e();
        c51Var.f();
        c51Var.setOnClickListener(new r81(this, (byte) 18));
        boolean V = xc2.V(chat);
        c51 c51Var2 = new c51(this.J0, context, true);
        c51Var2.setText(ob6.M0(V ? 2131751889 : 2131751887, null));
        c51Var2.f();
        c51Var2.setOnClickListener(new sb1((Object) this, (Object) runnable, (byte) 23));
        rg2 rg2Var = new rg2(context, (byte) 3);
        TextView textView = (TextView) rg2Var.d;
        TextView textView2 = (TextView) rg2Var.c;
        this.S1 = rg2Var;
        rg2Var.setPadding(hl.L(20.0f), 0, hl.L(20.0f), hl.L(17.0f));
        ((de0) rg2Var.b).f(chat, new rb0(chat));
        textView2.setText(wf3.l(chat));
        int i2 = aob.G6;
        yob.X(textView2, i2, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new wm2(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) ob6.M0(V ? 2131751890 : 2131751888, null));
        yob.X(textView, i2, this.J0);
        textView.setText(spannableStringBuilder);
        this.b.addView(c51Var2, tre.f(48.0f, -1, 80, hl.L(12.0f) + this.u0, 0, hl.L(12.0f) + this.u0, hl.L(70.0f) + hl.n));
        this.b.addView(c51Var, tre.f(48.0f, -1, 80, hl.L(12.0f) + this.u0, 0, hl.L(12.0f) + this.u0, hl.L(12.0f) + hl.n));
        this.T1.O(false);
    }

    @Override // ny0
    public final c79 H0(d79 d79Var) {
        l9c l9cVar = new l9c(this.n1, getContext(), this.a, 0, true, new n82(this, (byte) 8), this.J0);
        this.T1 = l9cVar;
        l9cVar.r = false;
        return l9cVar;
    }

    @Override // ny0
    public final CharSequence K0() {
        return null;
    }
}
