// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sx1 implements r69 {
    public final /* synthetic */ ChatActivityEnterView a;

    public sx1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // r69
    public final void e(int i, View view) {
        if (view instanceof cp0) {
            String command = ((cp0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                jj.J(chatActivityEnterView.D3, chatActivityEnterView.F3, new h01(this, command, (byte) 21), chatActivityEnterView.K4);
                return;
            }
            zu1 zu1Var = chatActivityEnterView.E3;
            if (zu1Var == null || !zu1Var.q5(view)) {
                jj.X(chatActivityEnterView.R, chatActivityEnterView.F3, 1, new rx1(this, command, (byte) 0));
            }
        }
    }
}
