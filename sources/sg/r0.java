package sg;

import android.text.SpannableStringBuilder;
import org.telegram.messenger.cd;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r0 extends vh.d {
    public SpannableStringBuilder k0;

    public void setLvlRequiredState(int i10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.k0).append((CharSequence) cd.G(i10, "ReactionLevelRequiredBtn", new Object[0]));
        g(spannableStringBuilder, true);
    }
}
