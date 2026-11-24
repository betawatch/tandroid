// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class qqa implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wsa b;

    public /* synthetic */ qqa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.f2.setLoading(false);
                break;
            default:
                wsaVar.f2.setLoading(false);
                break;
        }
    }
}
