package zg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.kb1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class b extends xg.c {
    public final aq s;
    public TLRPC.TL_help_country v;
    public final TextPaint w;
    public final ti.g x;

    public b(Context context, u6 u6Var) {
        super(context, u6Var);
        TextPaint textPaint = new TextPaint();
        this.w = textPaint;
        this.x = new ti.g(this, 16);
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        this.f.setVisibility(8);
        this.c.setVisibility(8);
        aq aqVar = new aq(context, 21, u6Var);
        this.s = aqVar;
        aqVar.b(y6.B5, y6.j7, y6.C5);
        aqVar.setDrawUnchecked(true);
        aqVar.setDrawBackgroundAsArc(10);
        addView(aqVar);
        aqVar.a(false, false);
        aqVar.setLayoutParams(kb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 13.0f, 0.0f, 14.0f, 0.0f));
    }

    @Override // xg.c
    public final int a() {
        return 22;
    }

    @Override // xg.c
    public final boolean b() {
        return true;
    }

    @Override // xg.c
    public final void c(boolean z10, boolean z11) {
        aq aqVar = this.s;
        if (aqVar.getVisibility() == 0) {
            aqVar.a(z10, z11);
        }
    }

    @Override // xg.c
    public final void d() {
        boolean z10 = LocaleController.isRTL;
        this.d.setLayoutParams(kb1.h(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 52.0f, 0.0f, z10 ? 52.0f : 20.0f, 0.0f));
        boolean z11 = LocaleController.isRTL;
        this.e.setLayoutParams(kb1.h(-1, -2.0f, (z11 ? 5 : 3) | 16, z11 ? 20.0f : 52.0f, 0.0f, z11 ? 52.0f : 20.0f, 0.0f));
        boolean z12 = LocaleController.isRTL;
        this.f.setLayoutParams(kb1.h(22, 22.0f, (z12 ? 5 : 3) | 16, z12 ? 15.0f : 20.0f, 0.0f, z12 ? 20.0f : 15.0f, 0.0f));
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

    @Override // xg.c
    public int getFullHeight() {
        return 44;
    }
}
