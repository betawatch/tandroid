// default package

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ud implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ ud(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                if (view instanceof clb) {
                    clb clbVar = (clb) view;
                    if (!clbVar.a) {
                        clbVar.a = true;
                        clbVar.invalidate();
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
                view.invalidate();
                break;
            case 6:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 7:
                gda.H(0);
                ((vkb) view).c.c(jb6.M0(2131744086, null), true, true);
                break;
            case 8:
                gda.H(1);
                ((vkb) view).c.c(jb6.M0(2131744085, null), true, true);
                break;
            default:
                gda.H(2);
                ((vkb) view).c.c(jb6.M0(2131744084, null), true, true);
                break;
        }
    }
}
