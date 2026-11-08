package zh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ r3(int i7, TLRPC.User user) {
        this.a = i7;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLRPC.User user = this.b;
        switch (i7) {
            case 0:
                wg.j0.l1(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                wg.j0.l1(new ArrayList(Arrays.asList(user)));
                break;
            default:
                wg.j0.l1(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
