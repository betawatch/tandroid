// default package

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ty1 implements View.OnKeyListener {
    public final /* synthetic */ ChatActivityEnterView a;

    public ty1(ChatActivityEnterView chatActivityEnterView) {
        this.a = chatActivityEnterView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d3, code lost:
    
        if (r7.getAction() != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d7, code lost:
    
        if (r4.P2 != null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d9, code lost:
    
        r4.w1();
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
        if (i == 4 && !chatActivityEnterView.p3 && chatActivityEnterView.R0() && keyEvent.getAction() == 1) {
            if (hx2.g0 != null && hx2.e().E) {
                hx2.e().c();
                return true;
            }
            if (chatActivityEnterView.V2 != 1 || chatActivityEnterView.c3 == null) {
                if (keyEvent.getAction() == 1) {
                    if (chatActivityEnterView.V2 == 1 && chatActivityEnterView.c3 != null) {
                        oc7.r1(chatActivityEnterView.R).X3.edit().putInt("hidekeyboard_" + chatActivityEnterView.G3, chatActivityEnterView.c3.e1()).commit();
                    }
                    if (chatActivityEnterView.H2 != 0) {
                        chatActivityEnterView.R1(0, true);
                        jz1 jz1Var = chatActivityEnterView.V0;
                        if (jz1Var != null) {
                            jz1Var.r(true);
                        }
                        chatActivityEnterView.F0.requestFocus();
                        return true;
                    }
                    if (chatActivityEnterView.p4) {
                        chatActivityEnterView.S1(false, true, false, true);
                        return true;
                    }
                    if (chatActivityEnterView.r4 == null) {
                        if (chatActivityEnterView.c3 != null && chatActivityEnterView.V2 != 1 && TextUtils.isEmpty(chatActivityEnterView.F0.getTextToUse())) {
                            chatActivityEnterView.Z1(1, 1, true, true);
                            return true;
                        }
                        chatActivityEnterView.Z1(0, 0, true, false);
                    }
                }
                return true;
            }
        } else if (i == 66 && !keyEvent.isShiftPressed()) {
            if (chatActivityEnterView.r3) {
            }
        }
        return false;
    }
}
