package yh;

import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ TLRPC.User b;

    public /* synthetic */ o4(int i10, TLRPC.User user) {
        this.a = i10;
        this.b = user;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        TLRPC.User user = this.b;
        switch (i10) {
            case 0:
                ug.k0.c0(new ArrayList(Arrays.asList(user)));
                break;
            case 1:
                ug.k0.c0(new ArrayList(Arrays.asList(user)));
                break;
            default:
                ug.k0.c0(new ArrayList(Arrays.asList(user)));
                break;
        }
    }
}
