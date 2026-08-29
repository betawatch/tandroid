package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
import org.telegram.ui.n00;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class z2 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new z2());
    }

    @Override // org.telegram.ui.Components.v41
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        Object obj = w41Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                a3 a3Var = (a3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z11 = w41Var.r;
                TLRPC.User user = MessagesController.getInstance(a3Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                e9 e9Var = new e9((c6) null);
                e9Var.r(user);
                a3Var.c.e(user, e9Var);
                a3Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    n00 n00Var = new n00();
                    n00Var.f = g6.w0(null, g6.uj, false);
                    n00Var.n = j.G0(starrefprogram.commission_permille);
                    if (n00Var.c != null) {
                        n00Var.c = null;
                        n00Var.a();
                    }
                    spannableStringBuilder.setSpan(n00Var, 1, 2, 33);
                }
                int i10 = starrefprogram.duration_months;
                if (i10 == 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Lifetime));
                } else if (i10 < 12 || i10 % 12 != 0) {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Months", i10, new Object[0]));
                } else {
                    spannableStringBuilder.append((CharSequence) LocaleController.formatPluralString("Years", i10 / 12, new Object[0]));
                }
                a3Var.n.setText(spannableStringBuilder);
                a3Var.r.setVisibility(z11 ? 0 : 8);
                a3Var.d.setVisibility(8);
                a3Var.f.setVisibility(8);
                a3Var.e.setVisibility(8);
                a3Var.s = z10;
                a3Var.setWillNotDraw(!z10);
                return;
            }
            return;
        }
        a3 a3Var2 = (a3) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z12 = w41Var.r;
        View view2 = a3Var2.e;
        ImageView imageView = a3Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(a3Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        e9 e9Var2 = new e9((c6) null);
        e9Var2.r(user2);
        a3Var2.c.e(user2, e9Var2);
        TextView textView = a3Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            n00 n00Var2 = new n00();
            n00Var2.f = g6.w0(null, g6.uj, false);
            n00Var2.n = j.G0(connectedbotstarref.commission_permille);
            if (n00Var2.c != null) {
                n00Var2.c = null;
                n00Var2.a();
            }
            spannableStringBuilder2.setSpan(n00Var2, 1, 2, 33);
        }
        int i11 = connectedbotstarref.duration_months;
        if (i11 == 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Lifetime));
        } else if (i11 < 12 || i11 % 12 != 0) {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Months", i11, new Object[0]));
        } else {
            spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("Years", i11 / 12, new Object[0]));
        }
        a3Var2.n.setText(spannableStringBuilder2);
        a3Var2.r.setVisibility(z12 ? 0 : 8);
        a3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        view2.setBackground(g6.K(AndroidUtilities.dp(9.665f), g6.v0(connectedbotstarref.revoked ? g6.wj : g6.uj, a3Var2.b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        a3Var2.s = z10;
        a3Var2.setWillNotDraw(!z10);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new a3(context, i10, c6Var);
    }
}
