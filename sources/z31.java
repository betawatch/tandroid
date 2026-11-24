// default package

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class z31 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ KeyEvent.Callback b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z31(KeyEvent.Callback callback, Object obj, byte b) {
        this.a = b;
        this.b = callback;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.c;
        KeyEvent.Callback callback = this.b;
        switch (b) {
            case 0:
                View view = (View) callback;
                c41 c41Var = (c41) obj;
                if (view != null) {
                    view.clearFocus();
                }
                c41Var.requestFocus();
                gl.E3(c41Var);
                break;
            default:
                VoIPService.lambda$toggleSpeakerphoneOrShowRouteSheet$90((fx0) callback, (Integer) obj, dialogInterface);
                break;
        }
    }
}
