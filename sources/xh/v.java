package xh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.el0;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v extends sk0 {
    public ArrayList c;
    public ArrayList d;
    public ArrayList e;

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
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
        f();
    }

    @Override // s4.g0
    public final int b() {
        return this.c.size();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        u uVar = (u) c1Var.a;
        String str = (String) this.c.get(i10);
        if (((Boolean) this.e.get(i10)).booleanValue()) {
            dq dqVar = new dq(R.drawable.mini_ephemeral_hidden_14, 0);
            dqVar.a(t6.A6);
            dqVar.n = 1;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
            spannableStringBuilder.append((CharSequence) " *");
            spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            uVar.a.setText(spannableStringBuilder);
        } else {
            uVar.a.setText(str);
        }
        uVar.b.setText((CharSequence) this.d.get(i10));
        uVar.c = str;
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = viewGroup.getContext();
        u uVar = new u(context);
        uVar.setOrientation(0);
        uVar.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        el0 el0Var = new el0(context, 5);
        uVar.b = el0Var;
        zs.i(el0Var);
        el0Var.setTextSize(1, 16.0f);
        int i11 = t6.G6;
        a7.V(el0Var, i11, null);
        el0Var.setTag(Integer.valueOf(i11));
        el0Var.setMaxLines(2);
        el0Var.setEllipsize(TextUtils.TruncateAt.END);
        uVar.addView(el0Var, b6.q(-1, -2, 1.0f, 16, 0, 0, org.telegram.messenger.i0.L(8.0f), 0));
        TextView textView = new TextView(context);
        uVar.a = textView;
        textView.setTextSize(1, 14.0f);
        int i12 = t6.y6;
        a7.V(textView, i12, null);
        textView.setTag(Integer.valueOf(i12));
        uVar.addView(textView, b6.p(-2, -2, 0.0f, 16));
        uVar.setLayoutParams(new s4.o0(-1, -2));
        return new ck0(uVar);
    }
}
