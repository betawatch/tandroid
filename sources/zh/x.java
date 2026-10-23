package zh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ o2 d;

    public /* synthetic */ x(String str, Utilities.Callback callback, o2 o2Var) {
        this.b = str;
        this.c = callback;
        this.d = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = this.b;
                Utilities.Callback callback = this.c;
                o2 o2Var = this.d;
                b0.p(o2Var, 0, new x(str, callback, o2Var));
                break;
            default:
                String str2 = this.b;
                if (str2 == null) {
                    xc.a0(this.d).N(LocaleController.getString(R.string.ScanQrCode), LocaleController.getString(R.string.ErrorOccurred)).j();
                    break;
                } else {
                    this.c.run(str2);
                    break;
                }
        }
    }

    public /* synthetic */ x(o2 o2Var, String str, Utilities.Callback callback) {
        this.d = o2Var;
        this.b = str;
        this.c = callback;
    }
}
