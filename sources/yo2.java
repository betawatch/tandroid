// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class yo2 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ yo2(int i, int i2, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = i2;
        this.d = obj;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.d;
        int i = this.c;
        int i2 = this.b;
        switch (b) {
            case 0:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                ((id[]) obj)[0] = null;
                break;
            default:
                ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                ((icc) obj).a(null, "CANCELLED");
                break;
        }
    }
}
