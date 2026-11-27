// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
