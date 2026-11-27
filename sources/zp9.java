// default package

import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_phone;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class zp9 implements NativeInstance.PayloadCallback, NativeInstance.VideoSourcesCallback {
    public final /* synthetic */ dq9 a;

    public /* synthetic */ zp9(dq9 dq9Var) {
        this.a = dq9Var;
    }

    @Override // org.telegram.messenger.voip.NativeInstance.VideoSourcesCallback
    public final void run(long j, int[] iArr) {
        dq9 dq9Var = this.a;
        if (dq9Var.P == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = dq9Var.f;
        getgroupparticipants.offset = "";
        int i = 0;
        while (i < iArr.length) {
            i = qd4.g(iArr[i], i, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(dq9Var.e).sendRequest(getgroupparticipants, new p87((Object) dq9Var, (Object) iArr, j, (byte) 15));
    }

    @Override // org.telegram.messenger.voip.NativeInstance.PayloadCallback
    public final void run(int i, String str) {
        this.a.s(i, str);
    }
}
