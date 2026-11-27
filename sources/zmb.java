// default package

import org.telegram.messenger.voip.OrientationHelper;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
