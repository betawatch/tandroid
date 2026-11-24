// default package

import android.content.DialogInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class p8b implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9b b;

    public /* synthetic */ p8b(v9b v9bVar, byte b) {
        this.a = b;
        this.b = v9bVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        v9b v9bVar = this.b;
        switch (b) {
            case 0:
                v9bVar.Y0.x(3, false);
                v9bVar.r0 = null;
                break;
            default:
                k9b k9bVar = v9bVar.Y0;
                if (k9bVar != null) {
                    k9bVar.x(4, false);
                    break;
                }
                break;
        }
    }
}
