package xi;

import org.telegram.messenger.g0;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.ui.f80;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        g0.g3(new f80(this.a, this.b, j3, 3));
    }
}
