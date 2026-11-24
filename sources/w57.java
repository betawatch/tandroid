// default package

import android.os.SystemClock;
import android.util.SparseArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class w57 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ na7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w57(na7 na7Var, int i, byte b) {
        this.a = b;
        this.b = na7Var;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        long j;
        vf6 vf6Var;
        boolean z;
        long j2;
        long j3;
        vf6 vf6Var2;
        long j4;
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequestsForGuid(this.c);
                break;
            case 1:
                na7 na7Var = this.b;
                int i2 = this.c;
                if ((na7Var.O1 == null && na7Var.P1 == null && !na7Var.M1) || ((i = na7Var.N1) != 0 && i2 < i)) {
                    vf6 vf6Var3 = null;
                    Utilities.d.c(new b57(na7Var, vf6Var3, vf6Var3, (byte) 2));
                    break;
                }
                break;
            case 2:
                na7 na7Var2 = this.b;
                int i3 = this.c;
                if (i3 != 1) {
                    na7Var2.l4(i3);
                    break;
                } else {
                    na7Var2.h0 = false;
                    na7Var2.z();
                    break;
                }
            default:
                na7 na7Var3 = this.b;
                int i4 = this.c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                vf6 vf6Var4 = na7Var3.B0;
                int m = vf6Var4.m();
                int i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i6 = 0;
                while (i6 < m) {
                    SparseArray sparseArray = (SparseArray) vf6Var4.n(i6);
                    if (sparseArray == null) {
                        j = elapsedRealtime;
                        vf6Var = vf6Var4;
                    } else {
                        int size = sparseArray.size();
                        int i7 = 0;
                        while (true) {
                            int i8 = 1000;
                            if (i7 < size) {
                                k27 k27Var = (k27) sparseArray.valueAt(i7);
                                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) k27Var.k.media).poll;
                                int i9 = poll.close_date;
                                boolean z2 = (i9 == 0 || poll.closed) ? false : true;
                                if (z2) {
                                    if (i9 <= i4) {
                                        j2 = elapsedRealtime;
                                        z = true;
                                        if (Math.abs(j2 - k27Var.w0) >= i8) {
                                            if (!k27Var.v0 && !z2) {
                                                sparseArray.remove(k27Var.e1());
                                                size--;
                                                i7--;
                                            }
                                            j3 = j2;
                                            vf6Var2 = vf6Var4;
                                        } else {
                                            j3 = j2;
                                            k27Var.w0 = j3;
                                            TLRPC.TL_messages_getPollResults tL_messages_getPollResults = new TLRPC.TL_messages_getPollResults();
                                            vf6Var2 = vf6Var4;
                                            tL_messages_getPollResults.peer = na7Var3.h1(k27.B0(k27Var.k));
                                            tL_messages_getPollResults.msg_id = k27Var.e1();
                                            TLRPC.Message message = k27Var.k;
                                            if (message != null && k27Var.D == 17) {
                                                TLRPC.MessageMedia n1 = k27.n1(message);
                                                if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                                                    j4 = ((TLRPC.TL_messageMediaPoll) n1).poll.hash;
                                                    tL_messages_getPollResults.poll_hash = j4;
                                                    na7Var3.getConnectionsManager().sendRequest(tL_messages_getPollResults, new i81((byte) 6, na7Var3, z2));
                                                }
                                            }
                                            j4 = 0;
                                            tL_messages_getPollResults.poll_hash = j4;
                                            na7Var3.getConnectionsManager().sendRequest(tL_messages_getPollResults, new i81((byte) 6, na7Var3, z2));
                                        }
                                        i7++;
                                        elapsedRealtime = j3;
                                        vf6Var4 = vf6Var2;
                                    } else {
                                        i5 = Math.min(i5, i9 - i4);
                                    }
                                }
                                i8 = 30000;
                                z = true;
                                j2 = elapsedRealtime;
                                if (Math.abs(j2 - k27Var.w0) >= i8) {
                                }
                                i7++;
                                elapsedRealtime = j3;
                                vf6Var4 = vf6Var2;
                            } else {
                                j = elapsedRealtime;
                                vf6 vf6Var5 = vf6Var4;
                                if (i5 < 5) {
                                    na7Var3.D0 = Math.min(na7Var3.D0, System.currentTimeMillis() - ((5 - i5) * 1000));
                                }
                                if (sparseArray.size() == 0) {
                                    vf6Var = vf6Var5;
                                    vf6Var.l(vf6Var.j(i6));
                                    m--;
                                    i6--;
                                } else {
                                    vf6Var = vf6Var5;
                                }
                            }
                        }
                    }
                    i6++;
                    vf6Var4 = vf6Var;
                    elapsedRealtime = j;
                }
                na7Var3.C0 = vf6Var4.m();
                break;
        }
    }
}
