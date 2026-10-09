package xg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.dq;
import rg.x1;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class b extends vg.c {
    public final dq s;
    public TLRPC.TL_help_country v;
    public final TextPaint w;
    public final x1 x;

    public b(Context context, e6 e6Var) {
        super(context, e6Var);
        TextPaint textPaint = new TextPaint();
        this.w = textPaint;
        this.x = new x1(this, 15);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        dq dqVar = new dq(context, 21, e6Var);
        this.s = dqVar;
        dqVar.b(i6.B5, i6.j7, i6.C5);
        dqVar.setDrawUnchecked(true);
        dqVar.setDrawBackgroundAsArc(10);
        addView(dqVar);
        dqVar.a(false, false);
        dqVar.setLayoutParams(x5.a(24.0f, 13.0f, 0.0f, 14.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 16));
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
        dq dqVar = this.s;
        if (dqVar.getVisibility() == 0) {
            dqVar.a(z10, z11);
        }
    }

    @Override // vg.c
    public final void d() {
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(x5.a(-2.0f, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f, -1, (z10 ? 5 : 3) | 16));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(x5.a(-2.0f, z11 ? 20.0f : 52.0f, 0.0f, z11 ? 52.0f : 20.0f, 0.0f, -1, (z11 ? 5 : 3) | 16));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(x5.a(22.0f, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f, 22, (z12 ? 5 : 3) | 16));
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

    @Override // vg.c
    public int getFullHeight() {
        return 44;
    }
}
