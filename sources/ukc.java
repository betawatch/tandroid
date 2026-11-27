// default package

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class ukc implements fd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ Intent c;

    public /* synthetic */ ukc(Activity activity, Intent intent, byte b) {
        this.a = b;
        this.b = activity;
        this.c = intent;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        byte b = this.a;
        Intent intent = this.c;
        Activity activity = this.b;
        switch (b) {
            case 0:
                activity.startActivity(intent);
                break;
            default:
                activity.startActivity(intent);
                break;
        }
    }
}
