// default package

import android.text.TextUtils;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ry1 implements f59 {
    public final /* synthetic */ ChatActivityEnterView a;

    public ry1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    @Override // f59
    public final void g(int i, View view) {
        if (view instanceof cq0) {
            String command = ((cq0) view).getCommand();
            if (TextUtils.isEmpty(command)) {
                return;
            }
            ChatActivityEnterView chatActivityEnterView = this.a;
            if (chatActivityEnterView.c()) {
                ik.J(chatActivityEnterView.E3, chatActivityEnterView.G3, new g11(this, command, (byte) 21), chatActivityEnterView.L4);
                return;
            }
            yv1 yv1Var = chatActivityEnterView.F3;
            if (yv1Var == null || !yv1Var.r5(view)) {
                ik.X(chatActivityEnterView.R, chatActivityEnterView.G3, 1, new qy1(this, command, (byte) 0));
            }
        }
    }
}
