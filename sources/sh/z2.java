package sh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class z2 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new z2());
    }

    @Override // org.telegram.ui.Components.i51
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        Object obj = j51Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                a3 a3Var = (a3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z10 = j51Var.r;
                TLRPC.User user = MessagesController.getInstance(a3Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                z8 z8Var = new z8((g6) null);
                z8Var.r(user);
                a3Var.c.e(user, z8Var);
                a3Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    z00 z00Var = new z00();
                    z00Var.f = k6.w0(null, k6.uj, false);
                    z00Var.n = j.G0(starrefprogram.commission_permille);
                    if (z00Var.c != null) {
                        z00Var.c = null;
                        z00Var.a();
                    }
                    spannableStringBuilder.setSpan(z00Var, 1, 2, 33);
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
                a3Var.r.setVisibility(z10 ? 0 : 8);
                a3Var.d.setVisibility(8);
                a3Var.f.setVisibility(8);
                a3Var.e.setVisibility(8);
                a3Var.s = z4;
                a3Var.setWillNotDraw(!z4);
                return;
            }
            return;
        }
        a3 a3Var2 = (a3) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z11 = j51Var.r;
        View view2 = a3Var2.e;
        ImageView imageView = a3Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(a3Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        z8 z8Var2 = new z8((g6) null);
        z8Var2.r(user2);
        a3Var2.c.e(user2, z8Var2);
        TextView textView = a3Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            z00 z00Var2 = new z00();
            z00Var2.f = k6.w0(null, k6.uj, false);
            z00Var2.n = j.G0(connectedbotstarref.commission_permille);
            if (z00Var2.c != null) {
                z00Var2.c = null;
                z00Var2.a();
            }
            spannableStringBuilder2.setSpan(z00Var2, 1, 2, 33);
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
        a3Var2.r.setVisibility(z11 ? 0 : 8);
        a3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        view2.setBackground(k6.K(AndroidUtilities.dp(9.665f), k6.v0(connectedbotstarref.revoked ? k6.wj : k6.uj, a3Var2.b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        a3Var2.s = z4;
        a3Var2.setWillNotDraw(!z4);
    }

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, g6 g6Var) {
        return new a3(context, i10, g6Var);
    }
}
