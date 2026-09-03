package rh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.ym0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class y extends ql0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
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

    @Override // f2.o0
    public final int h() {
        return this.c.size();
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        x xVar = (x) l1Var.a;
        String str = (String) this.c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            lq lqVar = new lq(R.drawable.mini_ephemeral_hidden_14, 0);
            lqVar.setColorKey(j6.A6);
            lqVar.setTopOffset(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(lqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            xVar.a.setText(spannableStringBuilder);
        } else {
            xVar.a.setText(str);
        }
        xVar.b.setText((CharSequence) this.d.get(i10));
        xVar.c = str;
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        x xVar = new x(context);
        xVar.setOrientation(0);
        xVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        ym0 ym0Var = new ym0(context, 3);
        xVar.b = ym0Var;
        NotificationCenter.listenEmojiLoading(ym0Var);
        ym0Var.setTextSize(1, 16.0f);
        int i11 = j6.G6;
        ym0Var.setTextColor(j6.w0(null, i11, false));
        ym0Var.setTag(Integer.valueOf(i11));
        ym0Var.setMaxLines(2);
        ym0Var.setEllipsize(TextUtils.TruncateAt.END);
        xVar.addView(ym0Var, b6.p(-1, -2, 1.0f, 16, 0, 0, AndroidUtilities.dp(8.0f), 0));
        TextView textView = new TextView(context);
        xVar.a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = j6.y6;
        textView.setTextColor(j6.w0(null, i12, false));
        textView.setTag(Integer.valueOf(i12));
        xVar.addView(textView, b6.o(-2, -2, 0.0f, 16));
        xVar.setLayoutParams(new f2.w0(-1, -2));
        return new dl0(xVar);
    }
}
