package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.em0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class p3 extends xc {
    public final org.telegram.ui.ActionBar.e6 N;
    public String O;
    public int P;

    public p3(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null);
        this.N = e6Var;
        setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, x0 x0Var) {
        if (str == this.O && this.P == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) yc.b(ei.l.G0(i10), x0Var != null ? new em0(this, x0Var, i10, 16) : null, this.N, null));
        setText(spannableStringBuilder);
        this.O = str;
        this.P = i10;
    }
}
