package qi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.yb0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
        AndroidUtilities.runOnUIThread(new yb0(this.a, this.b, j10, 2));
    }
}
