// default package

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class wx1 extends t14 {
    public final /* synthetic */ ChatActivityEnterView V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx1(ChatActivityEnterView chatActivityEnterView, d dVar, boolean z, Context context, TLRPC.ChatFull chatFull, ViewGroup viewGroup, boolean z2, wjb wjbVar, boolean z3, boolean z4) {
        super(dVar, z, true, true, context, true, chatFull, viewGroup, z2, wjbVar, z3, z4);
        this.V2 = chatActivityEnterView;
    }

    @Override // t14, android.view.View
    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        ChatActivityEnterView chatActivityEnterView = this.V2;
        if (chatActivityEnterView.W0 == null || chatActivityEnterView.e4 != 0) {
            return;
        }
        chatActivityEnterView.P3.k(f);
    }
}
