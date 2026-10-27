package ti;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.dc0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements RequestTimeDelegate {
    public final /* synthetic */ e a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(e eVar, d dVar) {
        this.a = eVar;
        this.b = dVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j10) {
        AndroidUtilities.runOnUIThread(new dc0(this.a, this.b, j10, 2));
    }
}
