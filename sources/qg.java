// default package

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class qg implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    public /* synthetic */ qg(Context context, byte b) {
        this.a = b;
        this.b = context;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        Context context = this.b;
        switch (b) {
            case 0:
                try {
                    context.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + context.getPackageName())));
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                m01.u(context, f11.g);
                break;
            case 2:
                try {
                    context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    context.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    break;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
