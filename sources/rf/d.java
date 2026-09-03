package rf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ov0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements RequestTimeDelegate {
    public final /* synthetic */ f a;
    public final /* synthetic */ e b;

    public /* synthetic */ d(f fVar, e eVar) {
        this.a = fVar;
        this.b = eVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new ov0(this.a, this.b, j10));
    }
}
