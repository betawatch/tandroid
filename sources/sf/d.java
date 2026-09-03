package sf;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.ov0;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
