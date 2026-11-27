// default package

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class ux1 implements View.OnKeyListener {
    public final /* synthetic */ ChatActivityEnterView a;

    public ux1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d3, code lost:
    
        if (r7.getAction() != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d7, code lost:
    
        if (r4.O2 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d9, code lost:
    
        r4.E1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
    
        return true;
     */
    @Override // android.view.View.OnKeyListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        ChatActivityEnterView chatActivityEnterView = this.a;
        if (keyEvent != null) {
            chatActivityEnterView.E0 = keyEvent.isShiftPressed();
            chatActivityEnterView.D0 = keyEvent.isCtrlPressed();
        }
        if (i == 4 && !chatActivityEnterView.o3 && chatActivityEnterView.U0() && keyEvent.getAction() == 1) {
            if (rw2.g0 != null && rw2.e().E) {
                rw2.e().c();
                return true;
            }
            if (chatActivityEnterView.U2 != 1 || chatActivityEnterView.b3 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.U2 == 1 && chatActivityEnterView.b3 != null) {
                        uc7.s1(chatActivityEnterView.R).X3.edit().putInt("hidekeyboard_" + chatActivityEnterView.F3, chatActivityEnterView.b3.e1()).commit();
                    }
                    if (chatActivityEnterView.G2 != 0) {
                        chatActivityEnterView.Z1(0, true);
                        my1 my1Var = chatActivityEnterView.V0;
                        if (my1Var != null) {
                            my1Var.r(true);
                        }
                        chatActivityEnterView.F0.requestFocus();
                        return true;
                    }
                    if (chatActivityEnterView.o4) {
                        chatActivityEnterView.a2(false, true, false, true);
                        return true;
                    }
                    if (chatActivityEnterView.q4 == null) {
                        if (chatActivityEnterView.b3 != null && chatActivityEnterView.U2 != 1 && TextUtils.isEmpty(chatActivityEnterView.F0.getTextToUse())) {
                            chatActivityEnterView.i2(1, 1, true, true);
                            return true;
                        }
                        chatActivityEnterView.i2(0, 0, true, false);
                    }
                }
                return true;
            }
        } else if (i == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.q3) {
            }
        }
        return false;
    }
}
