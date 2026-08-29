package rf;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import i7.f6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.t9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final c6 a;
    public final t9 b;
    public final TextView c;
    public jq d;
    public f0 e;

    public e0(Context context, c6 c6Var) {
        super(context);
        this.a = c6Var;
        t9 t9Var = new t9(context);
        this.b = t9Var;
        addView(t9Var, f6.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, f6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = g6.ci;
        c6 c6Var = this.a;
        setBackground(g6.b0(dp, g6.v0(i10, c6Var)));
        this.c.setTextColor(g6.v0(g6.G6, c6Var));
        jq jqVar = this.d;
        if (jqVar != null) {
            if (this.e.d == 7) {
                g6.v1(jqVar, g6.v0(g6.Oh, c6Var), false);
                g6.v1(this.d, g6.v0(g6.Sh, c6Var), true);
            } else {
                g6.v1(jqVar, g6.v0(g6.Oh, c6Var), false);
                g6.v1(this.d, g6.v0(g6.Sh, c6Var), true);
            }
        }
    }

    public void setData(f0 f0Var) {
        this.e = f0Var;
        t9 t9Var = this.b;
        t9Var.getImageReceiver().clearImage();
        int i10 = f0Var.d;
        String str = f0Var.c;
        TextView textView = this.c;
        c6 c6Var = this.a;
        if (i10 == 7) {
            jq L = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.e = dp;
            L.f = dp2;
            g6.v1(this.d, g6.v0(g6.Oh, c6Var), false);
            g6.v1(this.d, g6.v0(g6.Sh, c6Var), true);
            t9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        jq L2 = g6.L(AndroidUtilities.dp(32.0f), f0Var.a);
        this.d = L2;
        int i11 = g6.Oh;
        g6.v1(L2, g6.v0(i11, c6Var), false);
        jq jqVar = this.d;
        int i12 = g6.Sh;
        g6.v1(jqVar, g6.v0(i12, c6Var), true);
        if (f0Var.d == 4) {
            TLObject tLObject = f0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    jq L3 = g6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.e = dp3;
                    L3.f = dp4;
                    g6.v1(L3, g6.v0(i11, c6Var), false);
                    g6.v1(L3, g6.v0(i12, c6Var), true);
                    t9Var.setImageDrawable(L3);
                } else {
                    t9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(16.0f));
                    t9Var.getImageReceiver().setForUserOrChat(user, this.d);
                }
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                t9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(ChatObject.isCommunity(chat) ? 10.0f : 16.0f));
                t9Var.getImageReceiver().setForUserOrChat(chat, this.d);
            }
        } else {
            t9Var.setImageDrawable(this.d);
        }
        textView.setText(str);
    }
}
