// default package

import android.content.Intent;
import android.net.Uri;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ze implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ e c;

    public /* synthetic */ ze(byte b, String str, e eVar) {
        this.a = b;
        this.b = str;
        this.c = eVar;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        e eVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
                    intent.putExtra("sms_body", lv2.r(eVar.getCurrentAccount()).s(1));
                    eVar.getParentActivity().startActivityForResult(intent, 500);
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                try {
                    eVar.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
        }
    }
}
