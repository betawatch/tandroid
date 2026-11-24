// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ro extends efc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ro(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // efc, dfc
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((qo) obj).b.E.setVisibility(0);
                break;
            case 1:
                bp bpVar = (bp) obj;
                bpVar.E.setVisibility(0);
                if (bpVar.E.getParent() instanceof View) {
                    View view = (View) bpVar.E.getParent();
                    WeakHashMap weakHashMap = jdc.a;
                    zcc.c(view);
                    break;
                }
                break;
        }
    }

    @Override // dfc
    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bp bpVar = ((qo) obj).b;
                bpVar.E.setAlpha(1.0f);
                bpVar.H.d(null);
                bpVar.H = null;
                break;
            case 1:
                bp bpVar2 = (bp) obj;
                bpVar2.E.setAlpha(1.0f);
                bpVar2.H.d(null);
                bpVar2.H = null;
                break;
            default:
                bp bpVar3 = (bp) ((tg2) obj).c;
                bpVar3.E.setVisibility(8);
                PopupWindow popupWindow = bpVar3.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (bpVar3.E.getParent() instanceof View) {
                    View view = (View) bpVar3.E.getParent();
                    WeakHashMap weakHashMap = jdc.a;
                    zcc.c(view);
                }
                bpVar3.E.e();
                bpVar3.H.d(null);
                bpVar3.H = null;
                ViewGroup viewGroup = bpVar3.K;
                WeakHashMap weakHashMap2 = jdc.a;
                zcc.c(viewGroup);
                break;
        }
    }
}
