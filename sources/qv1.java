// default package

import android.view.KeyEvent;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qv1 implements lq0, ed, et3, k8 {
    public final /* synthetic */ ChatActivityEnterView a;

    public /* synthetic */ qv1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // et3
    public final void m() {
        int i = ChatActivityEnterView.r7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.F0.f();
        hy1 hy1Var = chatActivityEnterView.P3;
        if (hy1Var != null) {
            hy1Var.P0(chatActivityEnterView.F0.getTextToUse());
        }
    }

    @Override // k8
    public final void r(KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView;
        zw1 zw1Var;
        int i = ChatActivityEnterView.r7;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (zw1Var = (chatActivityEnterView = this.a).O0) != null && zw1Var.isShowing()) {
            chatActivityEnterView.O0.dismiss();
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        int i2 = ChatActivityEnterView.r7;
        ChatActivityEnterView chatActivityEnterView = this.a;
        chatActivityEnterView.R();
        ex1 ex1Var = chatActivityEnterView.F0;
        if (ex1Var != null) {
            ex1Var.setText("");
        }
    }
}
