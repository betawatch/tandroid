// default package

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vx1 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vx1(Object obj, byte b) {
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
                    chatActivityEnterView.E1();
                } else if (keyEvent != null && i == 0 && !keyEvent.isShiftPressed()) {
                    if (chatActivityEnterView.q3) {
                        if (keyEvent.isCtrlPressed()) {
                        }
                    } else if (!keyEvent.isCtrlPressed()) {
                    }
                    if (keyEvent.getAction() == 0 && chatActivityEnterView.O2 == null) {
                        chatActivityEnterView.E1();
                    }
                }
                break;
            case 1:
                if (i == 6) {
                    ((zg3) obj).run();
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
