package ph;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.om0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y extends il0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    public final void E(a0.h hVar) {
        ArrayList arrayList = this.c;
        arrayList.clear();
        ArrayList arrayList2 = this.d;
        arrayList2.clear();
        ArrayList arrayList3 = this.e;
        arrayList3.clear();
        for (int i10 = 0; i10 < hVar.m(); i10++) {
            TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i10);
            for (int i11 = 0; i11 < botInfo.commands.size(); i11++) {
                TLRPC.BotCommand botCommand = botInfo.commands.get(i11);
                if (botCommand != null && botCommand.command != null) {
                    arrayList.add("/" + botCommand.command);
                    arrayList2.add(botCommand.description);
                    arrayList3.add(Boolean.valueOf(botCommand.ephemeral));
                }
            }
        }
        l();
    }

    @Override // f2.p0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        x xVar = (x) n1Var.a;
        String str = (String) this.c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            iq iqVar = new iq(R.drawable.mini_ephemeral_hidden_14, 0);
            iqVar.setColorKey(g6.A6);
            iqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(iqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            xVar.a.setText(spannableStringBuilder);
        } else {
            xVar.a.setText(str);
        }
        xVar.b.setText((CharSequence) this.d.get(i10));
        xVar.c = str;
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        x xVar = new x(context);
        xVar.setOrientation(0);
        xVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        om0 om0Var = new om0(context, 3);
        xVar.b = om0Var;
        NotificationCenter.listenEmojiLoading(om0Var);
        om0Var.setTextSize(1, 16.0f);
        int i11 = g6.G6;
        om0Var.setTextColor(g6.w0(null, i11, false));
        om0Var.setTag(Integer.valueOf(i11));
        om0Var.setMaxLines(2);
        om0Var.setEllipsize(TextUtils.TruncateAt.END);
        xVar.addView(om0Var, f6.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        xVar.a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = g6.y6;
        textView.setTextColor(g6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        xVar.addView(textView, f6.o(-2, -2, 0.0f, 16));
        xVar.setLayoutParams(new f2.x0(-1, -2));
        return new vk0(xVar);
    }
}
