package pf;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.n9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final c6 a;
    public final n9 b;
    public final TextView c;
    public dq d;
    public e0 e;

    public d0(Context context, c6 c6Var) {
        super(context);
        this.a = c6Var;
        n9 n9Var = new n9(context);
        this.b = n9Var;
        addView(n9Var, z5.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, z5.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = g6.ci;
        c6 c6Var = this.a;
        setBackground(g6.b0(dp, g6.v0(i10, c6Var)));
        this.c.setTextColor(g6.v0(g6.G6, c6Var));
        dq dqVar = this.d;
        if (dqVar != null) {
            if (this.e.d == 7) {
                g6.v1(dqVar, g6.v0(g6.Oh, c6Var), false);
                g6.v1(this.d, g6.v0(g6.Sh, c6Var), true);
            } else {
                g6.v1(dqVar, g6.v0(g6.Oh, c6Var), false);
                g6.v1(this.d, g6.v0(g6.Sh, c6Var), true);
            }
        }
    }

    public void setData(e0 e0Var) {
        this.e = e0Var;
        n9 n9Var = this.b;
        n9Var.getImageReceiver().clearImage();
        int i10 = e0Var.d;
        String str = e0Var.c;
        TextView textView = this.c;
        c6 c6Var = this.a;
        if (i10 == 7) {
            dq L = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.e = dp;
            L.f = dp2;
            g6.v1(this.d, g6.v0(g6.Oh, c6Var), false);
            g6.v1(this.d, g6.v0(g6.Sh, c6Var), true);
            n9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        dq L2 = g6.L(AndroidUtilities.dp(32.0f), e0Var.a);
        this.d = L2;
        int i11 = g6.Oh;
        g6.v1(L2, g6.v0(i11, c6Var), false);
        dq dqVar = this.d;
        int i12 = g6.Sh;
        g6.v1(dqVar, g6.v0(i12, c6Var), true);
        if (e0Var.d == 4) {
            TLObject tLObject = e0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    dq L3 = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.e = dp3;
                    L3.f = dp4;
                    g6.v1(L3, g6.v0(i11, c6Var), false);
                    g6.v1(L3, g6.v0(i12, c6Var), true);
                    n9Var.setImageDrawable(L3);
                } else {
                    n9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    n9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                n9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(ChatObject.isCommunity(chat) ? 10.0f : 16.0f));
                n9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            n9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
