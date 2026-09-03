package rh;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.a10;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class z2 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new z2());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        Object obj = i51Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                a3 a3Var = (a3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z10 = i51Var.r;
                TLRPC.User user = MessagesController.getInstance(a3Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                z8 z8Var = new z8((f6) null);
                z8Var.r(user);
                a3Var.c.e(user, z8Var);
                a3Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    a10 a10Var = new a10();
                    a10Var.f = j6.w0(null, j6.uj, false);
                    a10Var.n = j.G0(starrefprogram.commission_permille);
                    if (a10Var.c != null) {
                        a10Var.c = null;
                        a10Var.a();
                    }
                    spannableStringBuilder.setSpan(a10Var, 1, 2, 33);
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
        boolean z11 = i51Var.r;
        View view2 = a3Var2.e;
        ImageView imageView = a3Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(a3Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        z8 z8Var2 = new z8((f6) null);
        z8Var2.r(user2);
        a3Var2.c.e(user2, z8Var2);
        TextView textView = a3Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            a10 a10Var2 = new a10();
            a10Var2.f = j6.w0(null, j6.uj, false);
            a10Var2.n = j.G0(connectedbotstarref.commission_permille);
            if (a10Var2.c != null) {
                a10Var2.c = null;
                a10Var2.a();
            }
            spannableStringBuilder2.setSpan(a10Var2, 1, 2, 33);
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
        view2.setBackground(j6.K(AndroidUtilities.dp(9.665f), j6.v0(connectedbotstarref.revoked ? j6.wj : j6.uj, a3Var2.b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        a3Var2.s = z4;
        a3Var2.setWillNotDraw(!z4);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new a3(context, i10, f6Var);
    }
}
