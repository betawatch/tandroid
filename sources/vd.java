// default package

import android.app.Activity;
import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vd implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id b;
    public final /* synthetic */ Context c;

    public /* synthetic */ vd(id idVar, Context context) {
        this.a = (byte) 2;
        this.c = context;
        this.b = idVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        id idVar = this.b;
        Context context = this.c;
        switch (b) {
            case 0:
                if (idVar != null) {
                    idVar.dismiss();
                }
                m01.u(context, ob6.M0(2131752876, null));
                break;
            case 1:
                if (idVar != null) {
                    idVar.dismiss();
                }
                m01.u(context, ob6.M0(2131752876, null));
                break;
            default:
                if (!((Activity) context).isFinishing()) {
                    try {
                        idVar.dismiss();
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                }
                break;
        }
    }

    public /* synthetic */ vd(id idVar, Context context, byte b) {
        this.a = b;
        this.b = idVar;
        this.c = context;
    }
}
