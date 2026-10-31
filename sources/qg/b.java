package qg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ep;
import ph.x1;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b extends og.d {
    public final ep s;
    public TLRPC.TL_help_country w;
    public final TextPaint x;
    public final x1 y;

    public b(Context context, p6 p6Var) {
        super(context, p6Var);
        TextPaint textPaint = new TextPaint();
        this.x = textPaint;
        this.y = new x1(this, 1);
        textPaint.setTextSize(i0.L(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        ep epVar = new ep(21, context, p6Var);
        this.s = epVar;
        epVar.b(t6.B5, t6.j7, t6.C5);
        epVar.setDrawUnchecked(true);
        epVar.setDrawBackgroundAsArc(10);
        addView(epVar);
        epVar.a(false, false);
        epVar.setLayoutParams(b6.d(24, 24.0f, (cd.X ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // og.d
    public final int a() {
        return 22;
    }

    @Override // og.d
    public final boolean b() {
        return true;
    }

    @Override // og.d
    public final void c(boolean z10, boolean z11) {
        ep epVar = this.s;
        if (epVar.getVisibility() == 0) {
            epVar.a(z10, z11);
        }
    }

    @Override // og.d
    public final void d() {
        boolean z10 = cd.X;
        this.d.setLayoutParams(b6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f));
        boolean z11 = cd.X;
        this.e.setLayoutParams(b6.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 52.0f, 0.0f, z11 ? 52.0f : 20.0f, 0.0f));
        boolean z12 = cd.X;
        this.f.setLayoutParams(b6.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.w;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence o10 = k6.o(cd.E0(tL_help_country.iso2), this.x.getFontMetricsInt(), 0, this.y);
        if (o10 != null) {
            spannableStringBuilder.append(o10).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new a(16), o10.length(), o10.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new a(34), 0, 1, 0);
        }
        String i02 = cd.i0(2131750530, tL_help_country.iso2);
        if (TextUtils.isEmpty(i02)) {
            i02 = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) i02);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.w;
    }

    @Override // og.d
    public int getFullHeight() {
        return 44;
    }
}
