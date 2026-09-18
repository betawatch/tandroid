package xh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
