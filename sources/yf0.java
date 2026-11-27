// default package

import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class yf0 implements hcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yf0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // hcc
    public final Object run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((e) obj).getSimpleMenuOverlay();
            case 1:
                return Boolean.valueOf(((EditTextBoldCursor) obj).w());
            case 2:
                return ((yn5) obj).getCloseIntoObject();
            case 3:
                return Boolean.valueOf(((xt3) obj).w());
            case 4:
                return ((ProfileActivity) obj).getSimpleMenuOverlay();
            case 5:
                return ((er9) obj).K;
            default:
                return ((wua) obj).j();
        }
    }
}
