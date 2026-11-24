// default package

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pv5 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j5 b;
    public final /* synthetic */ int c;

    public /* synthetic */ pv5(j5 j5Var, int i, byte b) {
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
