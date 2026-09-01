package qh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class j9 implements c2 {
    public final /* synthetic */ ca a;

    public j9(ca caVar) {
        this.a = caVar;
    }

    @Override // qh.c2
    public final void setInvert(float f10) {
        ca caVar = this.a;
        AndroidUtilities.setLightNavigationBar(caVar.n, f10 > 0.5f);
        AndroidUtilities.setLightStatusBar(caVar.n, f10 > 0.5f);
    }

    @Override // qh.c2
    public final void invalidate() {
    }
}
