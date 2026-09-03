package tf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.a10;
import org.telegram.ui.ai;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s0 extends LinearLayout {
    public final f6 a;
    public final p9 b;
    public final z8 c;
    public final TextView d;
    public final TextView e;

    public s0(Context context, f6 f6Var, boolean z4) {
        super(context);
        this.c = new z8((f6) null);
        this.a = f6Var;
        setOrientation(0);
        p9 p9Var = new p9(context);
        this.b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(28.0f));
        addView(p9Var, b6.t(28, 28, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, b6.t(-1, -2, 55, 0, 4, 12, 4));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 15.0f);
        int i10 = j6.G6;
        textView.setTextColor(j6.v0(i10, f6Var));
        TextView i11 = ai.i(linearLayout, textView, b6.n(-1, -2), context);
        this.e = i11;
        i11.setTextSize(1, 13.0f);
        i11.setTextColor(z4 ? j6.l1(0.5f, j6.v0(i10, f6Var)) : j6.v0(j6.z6, f6Var));
        linearLayout.addView(i11, b6.n(-1, -2));
    }

    public final void a(int i10, String str, TLRPC.Chat chat) {
        if (str == null) {
            return;
        }
        TextView textView = this.e;
        TextView textView2 = this.d;
        p9 p9Var = this.b;
        if (i10 == 0) {
            mq mqVar = new mq(j6.b0(AndroidUtilities.dp(28.0f), j6.v0(j6.Oh, this.a)), getContext().getResources().getDrawable(R.drawable.menu_hashtag).mutate());
            mqVar.s = AndroidUtilities.dp(-0.66f);
            mqVar.v = 0;
            int dp = AndroidUtilities.dp(20.0f);
            int dp2 = AndroidUtilities.dp(20.0f);
            mqVar.e = dp;
            mqVar.f = dp2;
            p9Var.setImageDrawable(mqVar);
            textView2.setText(LocaleController.formatString(R.string.HashtagSuggestion1Title, str));
            textView.setText(LocaleController.getString(R.string.HashtagSuggestion1Text));
            return;
        }
        z8 z8Var = this.c;
        z8Var.q(chat);
        p9Var.e(chat, z8Var);
        int i11 = R.string.HashtagSuggestion2Title;
        StringBuilder f10 = w2.f(str, "@");
        f10.append(ChatObject.getPublicUsername(chat));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.formatString(i11, f10.toString()));
        spannableStringBuilder.append((CharSequence) "  d");
        a10 a10Var = new a10(8);
        a10Var.f = j6.w0(null, j6.Lj, false);
        spannableStringBuilder.setSpan(a10Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
        textView2.setText(spannableStringBuilder);
        textView.setText(LocaleController.getString(R.string.HashtagSuggestion2Text));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }
}
