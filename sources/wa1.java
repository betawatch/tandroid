// default package

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class wa1 implements OnFailureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ya1 b;

    public /* synthetic */ wa1(ya1 ya1Var, byte b) {
        this.a = b;
        this.b = ya1Var;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        byte b = this.a;
        String str = "MSG_NULL";
        ya1 ya1Var = this.b;
        switch (b) {
            case 0:
                fa4.e("CaptchaController: getTasksClient failure", exc);
                StringBuilder sb = new StringBuilder("RECAPTCHA_FAILED_GETCLIENT_EXCEPTION_");
                if (exc == null) {
                    str = "NULL";
                } else if (exc.getMessage() != null) {
                    str = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb.append(str);
                ya1Var.a(sb.toString());
                break;
            default:
                fa4.e("CaptchaController: executeTask failure", exc);
                StringBuilder sb2 = new StringBuilder("RECAPTCHA_FAILED_TASK_EXCEPTION_");
                if (exc == null) {
                    str = "NULL";
                } else if (exc.getMessage() != null) {
                    str = exc.getMessage().replaceAll(" ", "_").toUpperCase();
                }
                sb2.append(str);
                ya1Var.a(sb2.toString());
                break;
        }
    }
}
