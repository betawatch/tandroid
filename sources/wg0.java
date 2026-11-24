// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wg0 implements iac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wg0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // iac
    public final Object run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((d) obj).getSimpleMenuOverlay();
            case 1:
                return Boolean.valueOf(((EditTextBoldCursor) obj).w());
            case 2:
                return ((vn5) obj).getCloseIntoObject();
            case 3:
                return Boolean.valueOf(((qu3) obj).w());
            case 4:
                return ((ProfileActivity) obj).getSimpleMenuOverlay();
            case 5:
                return ((pp9) obj).K;
            default:
                return ((wsa) obj).j();
        }
    }
}
