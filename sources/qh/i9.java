package qh;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class i9 implements b2 {
    public final /* synthetic */ ba a;

    public i9(ba baVar) {
        this.a = baVar;
    }

    @Override // qh.b2
    public final void setInvert(float f10) {
        ba baVar = this.a;
        AndroidUtilities.setLightNavigationBar(baVar.n, f10 > 0.5f);
        AndroidUtilities.setLightStatusBar(baVar.n, f10 > 0.5f);
    }

    @Override // qh.b2
    public final void invalidate() {
    }
}
