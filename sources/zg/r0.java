package zg;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.LocaleController;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class r0 extends ci.d {
    public SpannableStringBuilder h0;

    public void setLvlRequiredState(int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.h0).append((CharSequence) LocaleController.formatPluralString("ReactionLevelRequiredBtn", i10, new Object[0]));
        f(spannableStringBuilder, true);
    }
}
