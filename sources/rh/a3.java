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
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class a3 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new a3());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        Object obj = i51Var.G;
        if (!(obj instanceof TL_payments.connectedBotStarRef)) {
            if (obj instanceof TL_payments.starRefProgram) {
                b3 b3Var = (b3) view;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
                boolean z10 = i51Var.r;
                TLRPC.User user = MessagesController.getInstance(b3Var.a).getUser(Long.valueOf(starrefprogram.bot_id));
                z8 z8Var = new z8((f6) null);
                z8Var.r(user);
                b3Var.c.e(user, z8Var);
                b3Var.h.setText(UserObject.getUserName(user));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                if (starrefprogram.commission_permille > 0) {
                    spannableStringBuilder.append((CharSequence) " d");
                    z00 z00Var = new z00();
                    z00Var.f = j6.w0(null, j6.uj, false);
                    z00Var.n = k.G0(starrefprogram.commission_permille);
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
                b3Var.n.setText(spannableStringBuilder);
                b3Var.r.setVisibility(z10 ? 0 : 8);
                b3Var.d.setVisibility(8);
                b3Var.f.setVisibility(8);
                b3Var.e.setVisibility(8);
                b3Var.s = z4;
                b3Var.setWillNotDraw(!z4);
                return;
            }
            return;
        }
        b3 b3Var2 = (b3) view;
        TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
        boolean z11 = i51Var.r;
        View view2 = b3Var2.e;
        ImageView imageView = b3Var2.f;
        TLRPC.User user2 = MessagesController.getInstance(b3Var2.a).getUser(Long.valueOf(connectedbotstarref.bot_id));
        z8 z8Var2 = new z8((f6) null);
        z8Var2.r(user2);
        b3Var2.c.e(user2, z8Var2);
        TextView textView = b3Var2.h;
        textView.setText(Emoji.replaceEmoji(UserObject.getUserName(user2), textView.getPaint().getFontMetricsInt(), false));
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        if (connectedbotstarref.commission_permille > 0) {
            spannableStringBuilder2.append((CharSequence) " d");
            z00 z00Var2 = new z00();
            z00Var2.f = j6.w0(null, j6.uj, false);
            z00Var2.n = k.G0(connectedbotstarref.commission_permille);
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
        b3Var2.n.setText(spannableStringBuilder2);
        b3Var2.r.setVisibility(z11 ? 0 : 8);
        b3Var2.d.setVisibility(0);
        imageView.setVisibility(0);
        view2.setVisibility(0);
        view2.setBackground(j6.K(AndroidUtilities.dp(9.665f), j6.v0(connectedbotstarref.revoked ? j6.wj : j6.uj, b3Var2.b)));
        imageView.setImageResource(connectedbotstarref.revoked ? R.drawable.msg_link_2 : R.drawable.msg_limit_links);
        imageView.setScaleX(connectedbotstarref.revoked ? 0.8f : 0.6f);
        imageView.setScaleY(connectedbotstarref.revoked ? 0.8f : 0.6f);
        b3Var2.s = z4;
        b3Var2.setWillNotDraw(!z4);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, f6 f6Var) {
        return new b3(context, i10, f6Var);
    }
}
