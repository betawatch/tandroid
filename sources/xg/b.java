package xg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.qp;
import rg.s1;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class b extends vg.c {
    public final qp r;
    public TLRPC.TL_help_country s;
    public final TextPaint v;
    public final s1 w;

    public b(Context context, d6 d6Var) {
        super(context, d6Var);
        TextPaint textPaint = new TextPaint();
        this.v = textPaint;
        this.w = new s1(this, 12);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        qp qpVar = new qp(context, 21, d6Var);
        this.r = qpVar;
        qpVar.b(i6.B5, i6.j7, i6.C5);
        qpVar.setDrawUnchecked(true);
        qpVar.setDrawBackgroundAsArc(10);
        addView(qpVar);
        qpVar.a(false, false);
        qpVar.setLayoutParams(z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // vg.c
    public final int a() {
        return 22;
    }

    @Override // vg.c
    public final boolean b() {
        return true;
    }

    @Override // vg.c
    public final void c(boolean z10, boolean z11) {
        qp qpVar = this.r;
        if (qpVar.getVisibility() == 0) {
            qpVar.a(z10, z11);
        }
    }

    @Override // vg.c
    public final void d() {
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(z5.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(z5.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 52.0f, 0.0f, z11 ? 52.0f : 20.0f, 0.0f));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(z5.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.s;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence replaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.v.getFontMetricsInt(), 0, this.w);
        if (replaceWithRestrictedEmoji != null) {
            spannableStringBuilder.append(replaceWithRestrictedEmoji).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new a(16), replaceWithRestrictedEmoji.length(), replaceWithRestrictedEmoji.length() + 1, 0);
        } else {
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.setSpan(new a(34), 0, 1, 0);
        }
        String countryName = LocaleController.getCountryName(tL_help_country.iso2);
        if (TextUtils.isEmpty(countryName)) {
            countryName = tL_help_country.default_name;
        }
        spannableStringBuilder.append((CharSequence) countryName);
        this.d.k(spannableStringBuilder);
    }

    public TLRPC.TL_help_country getCountry() {
        return this.s;
    }

    @Override // vg.c
    public int getFullHeight() {
        return 44;
    }
}
