// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e;
import org.webrtc.DtmfSender;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class wr3 implements NativeLifecycleLock.NativePointerCallable, fd, NativeLifecycleLock.NativeCallable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wr3(int i, int i2, Object obj) {
        this.c = obj;
        this.a = i;
        this.b = i2;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativeCallable
    public final Object call() {
        Boolean lambda$startRtcEventLog$39;
        lambda$startRtcEventLog$39 = ((PeerConnection) this.c).lambda$startRtcEventLog$39(this.a, this.b);
        return lambda$startRtcEventLog$39;
    }

    @Override // fd
    public final void w(id idVar, int i) {
        e eVar = (e) this.c;
        l01 g = idVar.g(-1, true, true);
        g.d();
        TL_payments.TL_resolveStarGiftOffer tL_resolveStarGiftOffer = new TL_payments.TL_resolveStarGiftOffer();
        tL_resolveStarGiftOffer.offer_msg_id = this.a;
        int i2 = this.b;
        ConnectionsManager.getInstance(i2).sendRequestTyped(tL_resolveStarGiftOffer, new f(i2, eVar, g, idVar));
    }

    public /* synthetic */ wr3(int i, int i2, e eVar) {
        this.a = i;
        this.b = i2;
        this.c = eVar;
    }

    @Override // org.webrtc.NativeLifecycleLock.NativePointerCallable
    public final Object call(long j) {
        Boolean lambda$insertDtmf$1;
        lambda$insertDtmf$1 = DtmfSender.lambda$insertDtmf$1((String) this.c, this.a, this.b, j);
        return lambda$insertDtmf$1;
    }
}
