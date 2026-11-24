// default package

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ta2 implements dm {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ta2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dm
    public final void invalidate() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((gb2) obj).r2();
                break;
            case 1:
                Iterator it = ((w65) obj).i.iterator();
                while (it.hasNext()) {
                    ((View) it.next()).invalidate();
                }
                break;
            default:
                dx9 dx9Var = (dx9) obj;
                if (!pg5.b && dx9Var.getParent() != null) {
                    ((View) dx9Var.getParent()).invalidate();
                    break;
                }
                break;
        }
    }
}
