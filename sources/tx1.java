// default package

import android.content.Context;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tx1 extends oq0 {
    public final /* synthetic */ ChatActivityEnterView E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx1(ChatActivityEnterView chatActivityEnterView, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.E = chatActivityEnterView;
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ChatActivityEnterView chatActivityEnterView = this.E;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.e4 != 1) {
            return;
        }
        chatActivityEnterView.P3.k(f);
    }
}
