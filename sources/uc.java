// default package

import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class uc implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ uc(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        View view = this.b;
        switch (b) {
            case 0:
                if (view instanceof bjb) {
                    bjb bjbVar = (bjb) view;
                    if (!bjbVar.a) {
                        bjbVar.a = true;
                        bjbVar.invalidate();
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
                gba.H(0);
                ((uib) view).c.c(k96.M0(2131744160, null), true, true);
                break;
            case 8:
                gba.H(1);
                ((uib) view).c.c(k96.M0(2131744159, null), true, true);
                break;
            default:
                gba.H(2);
                ((uib) view).c.c(k96.M0(2131744158, null), true, true);
                break;
        }
    }
}
