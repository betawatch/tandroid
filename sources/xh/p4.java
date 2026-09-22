package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class p4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ p4(int i10, TLRPC.User user) {
        this.a = i10;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.User user = this.b;
        switch (i10) {
            case 0:
                tg.k0.c0(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                tg.k0.c0(new ArrayList(Arrays.asList(user)));
                break;
            default:
                tg.k0.c0(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
