package zh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.xc;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ Utilities.Callback c;
    public final /* synthetic */ n2 d;

    public /* synthetic */ x(String str, Utilities.Callback callback, n2 n2Var) {
        this.b = str;
        this.c = callback;
        this.d = n2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                String str = this.b;
                Utilities.Callback callback = this.c;
                n2 n2Var = this.d;
                b0.p(n2Var, 0, new x(str, callback, n2Var));
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

    public /* synthetic */ x(n2 n2Var, String str, Utilities.Callback callback) {
        this.d = n2Var;
        this.b = str;
        this.c = callback;
    }
}
