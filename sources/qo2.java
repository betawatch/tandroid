// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qo2 extends mz0 {
    public final nh2 S1;
    public l7c T1;

    public qo2(Context context, TLRPC.Chat chat, Runnable runnable) {
        super((ylb) null, context, false);
        this.E1 = gm.L(30.0f);
        r59 r59Var = this.n1;
        int i = this.u0;
        r59Var.setPadding(i, 0, i, gm.L(130.0f) + gm.n);
        this.n1.setClipToPadding(false);
        b61 b61Var = new b61(this.J0, context, true);
        b61Var.setText(jb6.M0(2131752542, null));
        b61Var.e();
        b61Var.f();
        b61Var.setOnClickListener(new k81(this, (byte) 19));
        boolean V = sd2.V(chat);
        b61 b61Var2 = new b61(this.J0, context, true);
        b61Var2.setText(jb6.M0(V ? 2131751861 : 2131751859, null));
        b61Var2.f();
        b61Var2.setOnClickListener(new rc1((Object) this, (Object) runnable, (byte) 22));
        nh2 nh2Var = new nh2(context, (byte) 3);
        TextView textView = (TextView) nh2Var.d;
        TextView textView2 = (TextView) nh2Var.c;
        this.S1 = nh2Var;
        nh2Var.setPadding(gm.L(20.0f), 0, gm.L(20.0f), gm.L(17.0f));
        ((bf0) nh2Var.b).f(chat, new pc0(chat));
        textView2.setText(pg3.l(chat));
        int i2 = cmb.F6;
        anb.X(textView2, i2, this.J0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new pn2(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) jb6.M0(V ? 2131751862 : 2131751860, null));
        anb.X(textView, i2, this.J0);
        textView.setText(spannableStringBuilder);
        this.b.addView(b61Var2, qoe.f(48.0f, -1, 80, gm.L(12.0f) + this.u0, 0, gm.L(12.0f) + this.u0, gm.L(70.0f) + gm.n));
        this.b.addView(b61Var, qoe.f(48.0f, -1, 80, gm.L(12.0f) + this.u0, 0, gm.L(12.0f) + this.u0, gm.L(12.0f) + gm.n));
        this.T1.O(false);
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(this.n1, getContext(), this.a, 0, true, new h92(this, (byte) 8), this.J0);
        this.T1 = l7cVar;
        l7cVar.r = false;
        return l7cVar;
    }

    @Override // mz0
    public final CharSequence J0() {
        return null;
    }
}
