package ph;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
