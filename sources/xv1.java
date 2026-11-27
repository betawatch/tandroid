// default package

import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xv1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;
    public final /* synthetic */ kg5 c;

    public /* synthetic */ xv1(ChatActivityEnterView chatActivityEnterView, kg5 kg5Var, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
        this.c = kg5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        kg5 kg5Var = this.c;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.X7;
                hl.B2(kg5Var);
                if (chatActivityEnterView.G6 == kg5Var) {
                    chatActivityEnterView.G6 = null;
                    break;
                }
                break;
            default:
                int i2 = ChatActivityEnterView.X7;
                chatActivityEnterView.removeView(kg5Var);
                break;
        }
    }
}
