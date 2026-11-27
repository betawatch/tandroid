// default package

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ vc(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                if (view instanceof xmb) {
                    xmb xmbVar = (xmb) view;
                    if (!xmbVar.a) {
                        xmbVar.a = true;
                        xmbVar.invalidate();
                        break;
                    }
                }
                break;
            case 1:
                view.setBackgroundDrawable(null);
                break;
            case 2:
            case 4:
                view.callOnClick();
                break;
            case 3:
                view.performClick();
                break;
            case 5:
                hl.t1(view);
                break;
            case 6:
                view.invalidate();
                break;
            case 7:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 8:
                xea.H(0);
                ((qmb) view).c.c(ob6.M0(2131744054, null), true, true);
                break;
            case 9:
                xea.H(1);
                ((qmb) view).c.c(ob6.M0(2131744053, null), true, true);
                break;
            default:
                xea.H(2);
                ((qmb) view).c.c(ob6.M0(2131744052, null), true, true);
                break;
        }
    }
}
