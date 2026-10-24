package yg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.xp;
import tg.p;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b extends wg.c {
    public final xp s;
    public TLRPC.TL_help_country v;
    public final TextPaint w;
    public final p x;

    public b(Context context, g6 g6Var) {
        super(context, g6Var);
        TextPaint textPaint = new TextPaint();
        this.w = textPaint;
        this.x = new p(this, 12);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        xp xpVar = new xp(context, 21, g6Var);
        this.s = xpVar;
        xpVar.b(k6.B5, k6.j7, k6.C5);
        xpVar.setDrawUnchecked(true);
        xpVar.setDrawBackgroundAsArc(10);
        addView(xpVar);
        xpVar.a(false, false);
        xpVar.setLayoutParams(z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // wg.c
    public final int a() {
        return 22;
    }

    @Override // wg.c
    public final boolean b() {
        return true;
    }

    @Override // wg.c
    public final void c(boolean z10, boolean z11) {
        xp xpVar = this.s;
        if (xpVar.getVisibility() == 0) {
            xpVar.a(z10, z11);
        }
    }

    @Override // wg.c
    public final void d() {
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(z5.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(z5.d(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 52.0f, 0.0f, z11 ? 52.0f : 20.0f, 0.0f));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(z5.d(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
    }

    public final void f() {
        TLRPC.TL_help_country tL_help_country = this.v;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        CharSequence replaceWithRestrictedEmoji = Emoji.replaceWithRestrictedEmoji(LocaleController.getLanguageFlag(tL_help_country.iso2), this.w.getFontMetricsInt(), 0, this.x);
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
        return this.v;
    }

    @Override // wg.c
    public int getFullHeight() {
        return 44;
    }
}
