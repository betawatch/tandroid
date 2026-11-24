// default package

import android.view.View;
import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
