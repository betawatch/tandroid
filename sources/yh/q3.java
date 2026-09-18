package yh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.gm0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class q3 extends xc {
    public final org.telegram.ui.ActionBar.f6 N;
    public String O;
    public int P;

    public q3(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null);
        this.N = f6Var;
        setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var));
        setTextSize(1, 14.0f);
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
    }

    public final void e(String str, int i10, x0 x0Var) {
        if (str == this.O && this.P == i10) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Emoji.replaceEmoji(str, getPaint().getFontMetricsInt(), false));
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) yc.b(ei.l.G0(i10), x0Var != null ? new gm0(this, x0Var, i10, 16) : null, this.N, null));
        setText(spannableStringBuilder);
        this.O = str;
        this.P = i10;
    }
}
