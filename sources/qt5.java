// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qt5 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ qt5(j5 j5Var, int i, byte b) {
        this.a = b;
        this.b = j5Var;
        this.c = i;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ConnectionsManager.getInstance(this.b.a).cancelRequest(this.c, true);
                break;
            default:
                ConnectionsManager.getInstance(this.b.a).cancelRequest(this.c, true);
                break;
        }
    }
}
