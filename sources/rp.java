// default package

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rp extends ehc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rp(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // ehc, dhc
    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((qp) obj).b.E.setVisibility(0);
                break;
            case 1:
                bq bqVar = (bq) obj;
                bqVar.E.setVisibility(0);
                if (bqVar.E.getParent() instanceof View) {
                    View view = (View) bqVar.E.getParent();
                    WeakHashMap weakHashMap = kfc.a;
                    afc.c(view);
                    break;
                }
                break;
        }
    }

    @Override // dhc
    public final void c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                bq bqVar = ((qp) obj).b;
                bqVar.E.setAlpha(1.0f);
                bqVar.H.d(null);
                bqVar.H = null;
                break;
            case 1:
                bq bqVar2 = (bq) obj;
                bqVar2.E.setAlpha(1.0f);
                bqVar2.H.d(null);
                bqVar2.H = null;
                break;
            default:
                bq bqVar3 = (bq) ((lx6) obj).c;
                bqVar3.E.setVisibility(8);
                PopupWindow popupWindow = bqVar3.F;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (bqVar3.E.getParent() instanceof View) {
                    View view = (View) bqVar3.E.getParent();
                    WeakHashMap weakHashMap = kfc.a;
                    afc.c(view);
                }
                bqVar3.E.e();
                bqVar3.H.d(null);
                bqVar3.H = null;
                ViewGroup viewGroup = bqVar3.K;
                WeakHashMap weakHashMap2 = kfc.a;
                afc.c(viewGroup);
                break;
        }
    }
}
