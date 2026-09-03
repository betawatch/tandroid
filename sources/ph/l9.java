package ph;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class l9 implements c2 {
    public final /* synthetic */ da a;

    public l9(da daVar) {
        this.a = daVar;
    }

    @Override // ph.c2
    public final void setInvert(float f10) {
        da daVar = this.a;
        AndroidUtilities.setLightNavigationBar(daVar.n, f10 > 0.5f);
        AndroidUtilities.setLightStatusBar(daVar.n, f10 > 0.5f);
    }

    @Override // ph.c2
    public final void invalidate() {
    }
}
