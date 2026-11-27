// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class p8 implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v8 b;

    public /* synthetic */ p8(v8 v8Var, byte b) {
        this.a = b;
        this.b = v8Var;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        v8 v8Var = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    v8Var.getParentActivity().startActivity(intent);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                qh6 qh6Var = new qh6();
                qh6Var.G = (byte) 2;
                v8Var.presentFragment(qh6Var, true);
                break;
        }
    }
}
