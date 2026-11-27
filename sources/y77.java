// default package

import android.os.SystemClock;
import android.util.SparseArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class y77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ y77(uc7 uc7Var, int i, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0094  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        boolean z;
        long j;
        boolean z2;
        long j2;
        long j3;
        int i2 = 0;
        boolean z3 = true;
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequestsForGuid(this.c);
                break;
            case 1:
                uc7 uc7Var = this.b;
                int i3 = this.c;
                if ((uc7Var.O1 == null && uc7Var.P1 == null && !uc7Var.M1) || ((i = uc7Var.N1) != 0 && i3 < i)) {
                    zh6 zh6Var = null;
                    Utilities.d.c(new d77(uc7Var, zh6Var, zh6Var, (byte) 2));
                    break;
                }
                break;
            case 2:
                uc7 uc7Var2 = this.b;
                int i4 = this.c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zh6 zh6Var2 = uc7Var2.B0;
                int m = zh6Var2.m();
                int i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i6 = 0;
                while (i6 < m) {
                    SparseArray sparseArray = (SparseArray) zh6Var2.n(i6);
                    if (sparseArray == null) {
                        z = z3;
                        j = elapsedRealtime;
                    } else {
                        int size = sparseArray.size();
                        int i7 = i2;
                        while (true) {
                            int i8 = 1000;
                            if (i7 < size) {
                                r47 r47Var = (r47) sparseArray.valueAt(i7);
                                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) r47Var.k.media).poll;
                                int i9 = poll.close_date;
                                boolean z4 = (i9 == 0 || poll.closed) ? false : z3;
                                if (z4) {
                                    if (i9 <= i4) {
                                        z2 = z3;
                                        j2 = elapsedRealtime;
                                        boolean z5 = z2;
                                        if (Math.abs(j2 - r47Var.w0) < i8) {
                                            r47Var.w0 = j2;
                                            TLRPC.TL_messages_getPollResults tL_messages_getPollResults = new TLRPC.TL_messages_getPollResults();
                                            tL_messages_getPollResults.peer = uc7Var2.j1(r47.B0(r47Var.k));
                                            tL_messages_getPollResults.msg_id = r47Var.e1();
                                            TLRPC.Message message = r47Var.k;
                                            if (message != null && r47Var.D == 17) {
                                                TLRPC.MessageMedia n1 = r47.n1(message);
                                                if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                                                    j3 = ((TLRPC.TL_messageMediaPoll) n1).poll.hash;
                                                    tL_messages_getPollResults.poll_hash = j3;
                                                    uc7Var2.getConnectionsManager().sendRequest(tL_messages_getPollResults, new q81((byte) 6, uc7Var2, z4));
                                                }
                                            }
                                            j3 = 0;
                                            tL_messages_getPollResults.poll_hash = j3;
                                            uc7Var2.getConnectionsManager().sendRequest(tL_messages_getPollResults, new q81((byte) 6, uc7Var2, z4));
                                        } else if (!r47Var.v0 && !z4) {
                                            sparseArray.remove(r47Var.e1());
                                            size--;
                                            i7--;
                                        }
                                        i7++;
                                        z3 = z5;
                                        elapsedRealtime = j2;
                                    } else {
                                        i5 = Math.min(i5, i9 - i4);
                                    }
                                }
                                z2 = z3;
                                i8 = 30000;
                                j2 = elapsedRealtime;
                                boolean z52 = z2;
                                if (Math.abs(j2 - r47Var.w0) < i8) {
                                }
                                i7++;
                                z3 = z52;
                                elapsedRealtime = j2;
                            } else {
                                z = z3;
                                j = elapsedRealtime;
                                if (i5 < 5) {
                                    uc7Var2.D0 = Math.min(uc7Var2.D0, System.currentTimeMillis() - ((5 - i5) * 1000));
                                }
                                if (sparseArray.size() == 0) {
                                    zh6Var2.l(zh6Var2.j(i6));
                                    m--;
                                    i6--;
                                }
                            }
                        }
                    }
                    i6++;
                    i2 = 0;
                    z3 = z;
                    elapsedRealtime = j;
                }
                uc7Var2.C0 = zh6Var2.m();
                break;
            default:
                uc7 uc7Var3 = this.b;
                int i10 = this.c;
                if (i10 != 1) {
                    uc7Var3.t4(i10);
                    break;
                } else {
                    uc7Var3.h0 = false;
                    uc7Var3.B();
                    break;
                }
        }
    }
}
