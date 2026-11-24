// default package

import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zw1 extends m8 {
    public final /* synthetic */ ChatActivityEnterView o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw1(ChatActivityEnterView chatActivityEnterView, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = chatActivityEnterView;
    }

    @Override // m8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        this.o.K0.invalidate();
    }
}
