// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class so extends djc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ so(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // djc, cjc
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ro) obj).b.E.setVisibility(0);
                break;
            case 1:
                cp cpVar = (cp) obj;
                cpVar.E.setVisibility(0);
                if (cpVar.E.getParent() instanceof View) {
                    View view = (View) cpVar.E.getParent();
                    WeakHashMap weakHashMap = ihc.a;
                    ygc.c(view);
                    break;
                }
                break;
        }
    }

    @Override // cjc
    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cp cpVar = ((ro) obj).b;
                cpVar.E.setAlpha(1.0f);
                cpVar.H.d(null);
                cpVar.H = null;
                break;
            case 1:
                cp cpVar2 = (cp) obj;
                cpVar2.E.setAlpha(1.0f);
                cpVar2.H.d(null);
                cpVar2.H = null;
                break;
            default:
                cp cpVar3 = (cp) ((lh2) obj).c;
                cpVar3.E.setVisibility(8);
                PopupWindow popupWindow = cpVar3.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (cpVar3.E.getParent() instanceof View) {
                    View view = (View) cpVar3.E.getParent();
                    WeakHashMap weakHashMap = ihc.a;
                    ygc.c(view);
                }
                cpVar3.E.e();
                cpVar3.H.d(null);
                cpVar3.H = null;
                ViewGroup viewGroup = cpVar3.K;
                WeakHashMap weakHashMap2 = ihc.a;
                ygc.c(viewGroup);
                break;
        }
    }
}
