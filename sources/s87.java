// default package

import android.content.Context;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class s87 implements RequestDelegate {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ Object h;

    public /* synthetic */ s87(na7 na7Var, long j, int i, int i2, long j2, boolean z, vm1 vm1Var) {
        this.b = na7Var;
        this.c = j;
        this.e = i;
        this.f = i2;
        this.d = j2;
        this.g = z;
        this.h = vm1Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                na7 na7Var = (na7) obj2;
                vm1 vm1Var = (vm1) obj;
                if (tL_error != null) {
                    gl.d3(new vl6(vm1Var, (byte) 15));
                    break;
                } else {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
                    na7Var.O3(tL_messages_affectedHistory.pts, -1, tL_messages_affectedHistory.pts_count);
                    na7Var.getMessagesStorage().a.c(new w87(na7Var, this.c, this.e, this.f, this.d, tL_messages_affectedHistory, this.g, vm1Var));
                    break;
                }
            case 1:
                na7 na7Var2 = (na7) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                long j = this.c;
                if (j != 0) {
                    na7Var2.getMessagesStorage().n1(j);
                }
                if (tL_error == null) {
                    TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory2 = (TLRPC.TL_messages_affectedHistory) tLObject;
                    int i = tL_messages_affectedHistory2.offset;
                    long j2 = this.d;
                    if (i > 0) {
                        na7Var2.U(j2, 0, this.e, this.f, this.g, inputPeer, 0L);
                    }
                    na7Var2.O3(tL_messages_affectedHistory2.pts, -1, tL_messages_affectedHistory2.pts_count);
                    ad7 messagesStorage = na7Var2.getMessagesStorage();
                    messagesStorage.a.c(new ua7(messagesStorage, j2, (byte) 5));
                    break;
                }
                break;
            default:
                VoIPGroupNotification.lambda$request$1(this.e, this.c, this.d, this.f, this.g, (Context) obj2, (String) obj, tLObject, tL_error);
                break;
        }
    }

    public /* synthetic */ s87(na7 na7Var, long j, long j2, int i, int i2, boolean z, TLRPC.InputPeer inputPeer) {
        this.b = na7Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = i2;
        this.g = z;
        this.h = inputPeer;
    }

    public /* synthetic */ s87(Context context, int i, long j, String str, long j2, int i2, boolean z) {
        this.e = i;
        this.c = j;
        this.d = j2;
        this.f = i2;
        this.g = z;
        this.b = context;
        this.h = str;
    }
}
