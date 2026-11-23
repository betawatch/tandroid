package xi;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.g80;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements RequestTimeDelegate {
    public final /* synthetic */ e a;
    public final /* synthetic */ d b;

    public /* synthetic */ c(e eVar, d dVar) {
        this.a = eVar;
        this.b = dVar;
    }

    @Override // org.telegram.tgnet.RequestTimeDelegate
    public void run(long j3) {
        g0.g3(new g80(this.a, this.b, j3, 3));
    }
}
