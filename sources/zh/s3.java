package zh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class s3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ s3(int i7, TLRPC.User user) {
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
