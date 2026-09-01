package uf;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pq;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class d0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final g6 a;
    public final p9 b;
    public final TextView c;
    public pq d;
    public e0 e;

    public d0(Context context, g6 g6Var) {
        super(context);
        this.a = g6Var;
        p9 p9Var = new p9(context);
        this.b = p9Var;
        addView(p9Var, c6.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, c6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = k6.ci;
        g6 g6Var = this.a;
        setBackground(k6.b0(dp, k6.v0(i10, g6Var)));
        this.c.setTextColor(k6.v0(k6.G6, g6Var));
        pq pqVar = this.d;
        if (pqVar != null) {
            if (this.e.d == 7) {
                k6.v1(pqVar, k6.v0(k6.Oh, g6Var), false);
                k6.v1(this.d, k6.v0(k6.Sh, g6Var), true);
            } else {
                k6.v1(pqVar, k6.v0(k6.Oh, g6Var), false);
                k6.v1(this.d, k6.v0(k6.Sh, g6Var), true);
            }
        }
    }

    public void setData(e0 e0Var) {
        this.e = e0Var;
        p9 p9Var = this.b;
        p9Var.getImageReceiver().clearImage();
        int i10 = e0Var.d;
        String str = e0Var.c;
        TextView textView = this.c;
        g6 g6Var = this.a;
        if (i10 == 7) {
            pq L = k6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.e = dp;
            L.f = dp2;
            k6.v1(this.d, k6.v0(k6.Oh, g6Var), false);
            k6.v1(this.d, k6.v0(k6.Sh, g6Var), true);
            p9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        pq L2 = k6.L(AndroidUtilities.dp(32.0f), e0Var.a);
        this.d = L2;
        int i11 = k6.Oh;
        k6.v1(L2, k6.v0(i11, g6Var), false);
        pq pqVar = this.d;
        int i12 = k6.Sh;
        k6.v1(pqVar, k6.v0(i12, g6Var), true);
        if (e0Var.d == 4) {
            TLObject tLObject = e0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    pq L3 = k6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.e = dp3;
                    L3.f = dp4;
                    k6.v1(L3, k6.v0(i11, g6Var), false);
                    k6.v1(L3, k6.v0(i12, g6Var), true);
                    p9Var.setImageDrawable(L3);
                } else {
                    p9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    p9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                p9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(ChatObject.isCommunity(chat) ? 10.0f : 16.0f));
                p9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            p9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
