// default package

import org.telegram.messenger.voip.OrientationHelper;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class zmb extends OrientationHelper {
    public final /* synthetic */ bnb a;

    public zmb(bnb bnbVar) {
        this.a = bnbVar;
    }

    @Override // org.telegram.messenger.voip.OrientationHelper
    public final void onOrientationUpdate(int i) {
        bnb bnbVar = this.a;
        if (bnbVar.x) {
            return;
        }
        bnbVar.f();
    }
}
