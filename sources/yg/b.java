package yg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.aq;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class b extends wg.c {
    public final aq s;
    public TLRPC.TL_help_country v;
    public final TextPaint w;
    public final rh.j x;

    public b(Context context, c6 c6Var) {
        super(context, c6Var);
        TextPaint textPaint = new TextPaint();
        this.w = textPaint;
        this.x = new rh.j(this, 22);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        aq aqVar = new aq(context, 21, c6Var);
        this.s = aqVar;
        aqVar.b(g6.B5, g6.j7, g6.C5);
        aqVar.setDrawUnchecked(true);
        aqVar.setDrawBackgroundAsArc(10);
        addView(aqVar);
        aqVar.a(false, false);
        aqVar.setLayoutParams(a6.a(24.0f, 13.0f, 0.0f, 14.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
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
        aq aqVar = this.s;
        if (aqVar.getVisibility() == 0) {
            aqVar.a(z10, z11);
        }
    }

    @Override // wg.c
    public final void d() {
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(a6.a(-2.0f, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f, -1, (z10 ? 5 : 3) | 16));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(a6.a(-2.0f, z11 ? 20.0f : 52.0f, 0.0f, z11 ? 52.0f : 20.0f, 0.0f, -1, (z11 ? 5 : 3) | 16));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(a6.a(22.0f, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f, 22, (z12 ? 5 : 3) | 16));
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
