package yh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class w0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Utilities.Callback b;

    public /* synthetic */ w0(int i10, Utilities.Callback callback) {
        this.a = i10;
        this.b = callback;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.run((TL_stars.StarGift) obj);
                break;
            default:
                Boolean bool = (Boolean) obj;
                Utilities.Callback callback = this.b;
                if (callback != null) {
                    callback.run(bool);
                    break;
                }
                break;
        }
    }
}
