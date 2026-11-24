// default package

import android.text.TextUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class ux1 implements Runnable {
    public final /* synthetic */ k27 a;
    public final /* synthetic */ long b;
    public final /* synthetic */ TL_keyboard.KeyboardButtonProto c;
    public final /* synthetic */ k27 d;
    public final /* synthetic */ TLRPC.User e;
    public final /* synthetic */ ChatActivityEnterView f;

    public ux1(ChatActivityEnterView chatActivityEnterView, k27 k27Var, long j, TL_keyboard.KeyboardButtonProto keyboardButtonProto, k27 k27Var2, TLRPC.User user) {
        this.f = chatActivityEnterView;
        this.a = k27Var;
        this.b = j;
        this.c = keyboardButtonProto;
        this.d = k27Var2;
        this.e = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ChatActivityEnterView chatActivityEnterView = this.f;
        mu1 mu1Var = chatActivityEnterView.F3;
        if (chatActivityEnterView.c2.Q() > gl.L(20.0f) || chatActivityEnterView.Q0()) {
            chatActivityEnterView.J0(false);
            gl.t1(chatActivityEnterView);
            gl.e3(this, 150L);
            return;
        }
        if (mu1Var != null) {
            int i = chatActivityEnterView.R;
            long j = this.a.k.dialog_id;
            TL_keyboard.KeyboardButtonProto keyboardButtonProto = this.c;
            String text = keyboardButtonProto.getText();
            String url = keyboardButtonProto.getUrl();
            boolean c = jdb.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeSimpleWebView.class);
            k27 k27Var = this.d;
            quc b = quc.b(i, j, this.b, text, url, c ? 1 : 0, k27Var != null ? k27Var.k.id : 0, mu1Var == null ? 0L : mu1Var.a7(), null, false, null, null, 0, false, false);
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().l(b) != null) {
                ep0 ep0Var = chatActivityEnterView.m0;
                if (ep0Var != null) {
                    ep0Var.setOpened(false);
                    return;
                }
                return;
            }
            TLRPC.User user = this.e;
            String C1 = user == null ? null : na7.q1(chatActivityEnterView.R).C1(user.restriction_reason);
            if (!TextUtils.isEmpty(C1)) {
                na7.q1(chatActivityEnterView.R);
                na7.W4(C1, mu1Var);
            } else {
                ow0 ow0Var = new ow0(chatActivityEnterView.getContext(), chatActivityEnterView.L4);
                ow0Var.m0 = chatActivityEnterView.E3;
                ow0Var.x(mu1Var, b);
                ow0Var.show();
            }
        }
    }
}
