// default package

import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vx1 implements gk, h59 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ vx1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // h59
    public final boolean g(int i, View view) {
        if (!(view instanceof cq0)) {
            return false;
        }
        String str = ((cq0) view).getCommand() + " ";
        ChatActivityEnterView chatActivityEnterView = this.b;
        chatActivityEnterView.setFieldText(str);
        chatActivityEnterView.n0.c();
        return true;
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        switch (this.a) {
            case 0:
                this.b.x1(z, i, i2, 0L, true);
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = this.b;
                boolean x1 = chatActivityEnterView.x1(z, i, i2, 0L, true);
                j67 j67Var = chatActivityEnterView.M0;
                if (j67Var != null) {
                    j67Var.f(!x1);
                    chatActivityEnterView.M0 = null;
                    break;
                }
                break;
        }
    }
}
