// default package

import java.util.function.ToDoubleFunction;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class po7 implements ToDoubleFunction {
    public final /* synthetic */ byte a;

    public /* synthetic */ po7(byte b) {
        this.a = b;
    }

    @Override // java.util.function.ToDoubleFunction
    public final double applyAsDouble(Object obj) {
        switch (this.a) {
            case 0:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 1:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 2:
                return ((TLRPC.TL_topPeer) obj).rating;
            case 3:
                return kpa.Z0((TL_stars.starGiftAttributeBackdrop) obj);
            case 4:
                return kpa.Z0((TL_stars.starGiftAttributePattern) obj);
            case 5:
                return kpa.Z0((TL_stars.starGiftAttributeModel) obj);
            default:
                return ((eec) obj).a;
        }
    }
}
