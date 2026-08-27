package pf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.o00;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class s0 extends LinearLayout {
    public final c6 a;
    public final n9 b;
    public final y8 c;
    public final TextView d;
    public final TextView e;

    public s0(Context context, c6 c6Var, boolean z10) {
        super(context);
        this.c = new y8((c6) null);
        this.a = c6Var;
        setOrientation(0);
        n9 n9Var = new n9(context);
        this.b = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(n9Var, z5.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, z5.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = g6.G6;
        textView.setTextColor(g6.v0(i10, c6Var));
        TextView i11 = pa.i(linearLayout, textView, z5.n(-1, -2), context);
        this.e = i11;
        i11.setTextSize(1, 13.0f);
        i11.setTextColor(z10 ? g6.l1(0.5f, g6.v0(i10, c6Var)) : g6.v0(g6.z6, c6Var));
        linearLayout.addView(i11, z5.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.e;
        TextView textView2 = this.d;
        n9 n9Var = this.b;
        if (i10 == 0) {
            dq dqVar = new dq(g6.b0(AndroidUtilities.dp(28.0f), g6.v0(g6.Oh, this.a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            dqVar.s = AndroidUtilities.dp(-0.66f);
            dqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            dqVar.e = dp;
            dqVar.f = dp2;
            n9Var.setImageDrawable(dqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        y8 y8Var = this.c;
        y8Var.q(chat);
        n9Var.e(chat, y8Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder f10 = s3.c.f(str, "@");
        f10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, f10.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        o00 o00Var = new o00(8);
        o00Var.f = g6.w0(null, g6.Lj, false);
        spannableStringBuilder.setSpan(o00Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
