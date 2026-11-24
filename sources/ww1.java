// default package

import android.app.Dialog;
import android.view.ViewTreeObserver;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ww1 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Dialog b;
    public final /* synthetic */ ChatActivityEnterView c;

    public /* synthetic */ ww1(ChatActivityEnterView chatActivityEnterView, Dialog dialog, byte b) {
        this.a = b;
        this.c = chatActivityEnterView;
        this.b = dialog;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        Dialog dialog = this.b;
        ChatActivityEnterView chatActivityEnterView = this.c;
        switch (b) {
            case 0:
                chatActivityEnterView.q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.q0.postDelayed(new hq1(dialog, (byte) 8), 100L);
                break;
            default:
                chatActivityEnterView.q0.getViewTreeObserver().removeOnPreDrawListener(this);
                chatActivityEnterView.q0.postDelayed(new hq1(dialog, (byte) 8), 100L);
                break;
        }
        return true;
    }
}
