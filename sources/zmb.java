// default package

import org.telegram.messenger.voip.OrientationHelper;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
