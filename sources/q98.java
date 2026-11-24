// default package

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q98 extends x2b {
    public final /* synthetic */ r98 q2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q98(r98 r98Var, Context context, Object obj, TLObject tLObject, ylb ylbVar) {
        super(context, obj, tLObject, ylbVar);
        this.q2 = r98Var;
    }

    @Override // x2b, my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        PhotoViewer photoViewer = this.q2.b;
        if (photoViewer.U3 == this) {
            photoViewer.U3 = null;
        }
    }
}
