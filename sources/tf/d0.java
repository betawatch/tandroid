package tf;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p9;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d0 extends FrameLayout {
    public static final /* synthetic */ int f = 0;
    public final f6 a;
    public final p9 b;
    public final TextView c;
    public nq d;
    public e0 e;

    public d0(Context context, f6 f6Var) {
        super(context);
        this.a = f6Var;
        p9 p9Var = new p9(context);
        this.b = p9Var;
        addView(p9Var, b6.c(30.0f, 30));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        addView(textView, b6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        a();
    }

    public final void a() {
        int dp = AndroidUtilities.dp(28.0f);
        int i10 = j6.ci;
        f6 f6Var = this.a;
        setBackground(j6.b0(dp, j6.v0(i10, f6Var)));
        this.c.setTextColor(j6.v0(j6.G6, f6Var));
        nq nqVar = this.d;
        if (nqVar != null) {
            if (this.e.d == 7) {
                j6.v1(nqVar, j6.v0(j6.Oh, f6Var), false);
                j6.v1(this.d, j6.v0(j6.Sh, f6Var), true);
            } else {
                j6.v1(nqVar, j6.v0(j6.Oh, f6Var), false);
                j6.v1(this.d, j6.v0(j6.Sh, f6Var), true);
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
        f6 f6Var = this.a;
        if (i10 == 7) {
            nq L = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_archive);
            this.d = L;
            int dp = AndroidUtilities.dp(16.0f);
            int dp2 = AndroidUtilities.dp(16.0f);
            L.e = dp;
            L.f = dp2;
            j6.v1(this.d, j6.v0(j6.Oh, f6Var), false);
            j6.v1(this.d, j6.v0(j6.Sh, f6Var), true);
            p9Var.setImageDrawable(this.d);
            textView.setText(str);
            return;
        }
        nq L2 = j6.L(AndroidUtilities.dp(32.0f), e0Var.a);
        this.d = L2;
        int i11 = j6.Oh;
        j6.v1(L2, j6.v0(i11, f6Var), false);
        nq nqVar = this.d;
        int i12 = j6.Sh;
        j6.v1(nqVar, j6.v0(i12, f6Var), true);
        if (e0Var.d == 4) {
            TLObject tLObject = e0Var.f;
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                if (UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id) {
                    nq L3 = j6.L(AndroidUtilities.dp(32.0f), R.drawable.chats_saved);
                    int dp3 = AndroidUtilities.dp(16.0f);
                    int dp4 = AndroidUtilities.dp(16.0f);
                    L3.e = dp3;
                    L3.f = dp4;
                    j6.v1(L3, j6.v0(i11, f6Var), false);
                    j6.v1(L3, j6.v0(i12, f6Var), true);
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
