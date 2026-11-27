// default package

import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
