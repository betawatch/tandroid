// default package

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uy1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uy1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i == 4) {
                    chatActivityEnterView.w1();
                } else if (keyEvent != null && i == 0 && !keyEvent.isShiftPressed()) {
                    if (chatActivityEnterView.r3) {
                        if (keyEvent.isCtrlPressed()) {
                        }
                    } else if (!keyEvent.isCtrlPressed()) {
                    }
                    if (keyEvent.getAction() == 0 && chatActivityEnterView.P2 == null) {
                        chatActivityEnterView.w1();
                    }
                }
                break;
            case 1:
                if (i == 6) {
                    ((bi3) obj).run();
                    break;
                }
                break;
            case 2:
                if (i == 6) {
                    ((Runnable) obj).run();
                    break;
                }
                break;
            default:
                ((SearchView) obj).p();
                break;
        }
        return true;
    }
}
