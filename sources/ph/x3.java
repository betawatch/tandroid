package ph;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ x3(int i10, TLRPC.User user) {
        this.a = i10;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.User user = this.b;
        switch (i10) {
            case 0:
                mg.f1.l1(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                mg.f1.l1(new ArrayList(Arrays.asList(user)));
                break;
            default:
                mg.f1.l1(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
