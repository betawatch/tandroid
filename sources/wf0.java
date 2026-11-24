// default package

import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class wf0 implements h8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wf0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // h8c
    public final Object run() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((d) obj).getSimpleMenuOverlay();
            case 1:
                return Boolean.valueOf(((EditTextBoldCursor) obj).w());
            case 2:
                return ((vl5) obj).getCloseIntoObject();
            case 3:
                return Boolean.valueOf(((gt3) obj).w());
            case 4:
                return ((ProfileActivity) obj).getSimpleMenuOverlay();
            case 5:
                return ((on9) obj).K;
            default:
                return ((vqa) obj).j();
        }
    }
}
