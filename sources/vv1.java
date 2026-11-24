// default package

import android.graphics.Canvas;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class vv1 implements p8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ChatActivityEnterView b;

    public /* synthetic */ vv1(ChatActivityEnterView chatActivityEnterView, byte b) {
        this.a = b;
        this.b = chatActivityEnterView;
    }

    @Override // p8c
    public final void a(Object obj) {
        byte b = this.a;
        ChatActivityEnterView chatActivityEnterView = this.b;
        switch (b) {
            case 0:
                int i = ChatActivityEnterView.r7;
                chatActivityEnterView.u0((Canvas) obj, false);
                break;
            case 1:
                chatActivityEnterView.s1((TL_iv.RichMessage) obj);
                break;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int i2 = ChatActivityEnterView.r7;
                chatActivityEnterView.F0.setText(charSequence);
                chatActivityEnterView.F0.setSelection(charSequence.length(), charSequence.length());
                break;
        }
    }
}
