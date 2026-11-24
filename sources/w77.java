// default package

import android.os.SystemClock;
import android.util.SparseArray;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class w77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ int c;

    public /* synthetic */ w77(oc7 oc7Var, int i, byte b) {
        this.a = b;
        this.b = oc7Var;
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
        vh6 vh6Var;
        boolean z;
        long j2;
        long j3;
        vh6 vh6Var2;
        long j4;
        switch (this.a) {
            case 0:
                this.b.getConnectionsManager().cancelRequestsForGuid(this.c);
                break;
            case 1:
                oc7 oc7Var = this.b;
                int i2 = this.c;
                if ((oc7Var.O1 == null && oc7Var.P1 == null && !oc7Var.M1) || ((i = oc7Var.N1) != 0 && i2 < i)) {
                    vh6 vh6Var3 = null;
                    Utilities.d.c(new b77(oc7Var, vh6Var3, vh6Var3, (byte) 2));
                    break;
                }
                break;
            case 2:
                oc7 oc7Var2 = this.b;
                int i3 = this.c;
                if (i3 != 1) {
                    oc7Var2.n4(i3);
                    break;
                } else {
                    oc7Var2.h0 = false;
                    oc7Var2.z();
                    break;
                }
            default:
                oc7 oc7Var3 = this.b;
                int i4 = this.c;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                vh6 vh6Var4 = oc7Var3.B0;
                int m = vh6Var4.m();
                int i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                int i6 = 0;
                while (i6 < m) {
                    SparseArray sparseArray = (SparseArray) vh6Var4.n(i6);
                    if (sparseArray == null) {
                        j = elapsedRealtime;
                        vh6Var = vh6Var4;
                    } else {
                        int size = sparseArray.size();
                        int i7 = 0;
                        while (true) {
                            int i8 = 1000;
                            if (i7 < size) {
                                k47 k47Var = (k47) sparseArray.valueAt(i7);
                                TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) k47Var.k.media).poll;
                                int i9 = poll.close_date;
                                boolean z2 = (i9 == 0 || poll.closed) ? false : true;
                                if (z2) {
                                    if (i9 <= i4) {
                                        j2 = elapsedRealtime;
                                        z = true;
                                        if (Math.abs(j2 - k47Var.w0) >= i8) {
                                            if (!k47Var.v0 && !z2) {
                                                sparseArray.remove(k47Var.e1());
                                                size--;
                                                i7--;
                                            }
                                            j3 = j2;
                                            vh6Var2 = vh6Var4;
                                        } else {
                                            j3 = j2;
                                            k47Var.w0 = j3;
                                            TLRPC.TL_messages_getPollResults tL_messages_getPollResults = new TLRPC.TL_messages_getPollResults();
                                            vh6Var2 = vh6Var4;
                                            tL_messages_getPollResults.peer = oc7Var3.i1(k47.B0(k47Var.k));
                                            tL_messages_getPollResults.msg_id = k47Var.e1();
                                            TLRPC.Message message = k47Var.k;
                                            if (message != null && k47Var.D == 17) {
                                                TLRPC.MessageMedia n1 = k47.n1(message);
                                                if (n1 instanceof TLRPC.TL_messageMediaPoll) {
                                                    j4 = ((TLRPC.TL_messageMediaPoll) n1).poll.hash;
                                                    tL_messages_getPollResults.poll_hash = j4;
                                                    oc7Var3.getConnectionsManager().sendRequest(tL_messages_getPollResults, new r91((byte) 6, oc7Var3, z2));
                                                }
                                            }
                                            j4 = 0;
                                            tL_messages_getPollResults.poll_hash = j4;
                                            oc7Var3.getConnectionsManager().sendRequest(tL_messages_getPollResults, new r91((byte) 6, oc7Var3, z2));
                                        }
                                        i7++;
                                        elapsedRealtime = j3;
                                        vh6Var4 = vh6Var2;
                                    } else {
                                        i5 = Math.min(i5, i9 - i4);
                                    }
                                }
                                i8 = 30000;
                                z = true;
                                j2 = elapsedRealtime;
                                if (Math.abs(j2 - k47Var.w0) >= i8) {
                                }
                                i7++;
                                elapsedRealtime = j3;
                                vh6Var4 = vh6Var2;
                            } else {
                                j = elapsedRealtime;
                                vh6 vh6Var5 = vh6Var4;
                                if (i5 < 5) {
                                    oc7Var3.D0 = Math.min(oc7Var3.D0, System.currentTimeMillis() - ((5 - i5) * 1000));
                                }
                                if (sparseArray.size() == 0) {
                                    vh6Var = vh6Var5;
                                    vh6Var.l(vh6Var.j(i6));
                                    m--;
                                    i6--;
                                } else {
                                    vh6Var = vh6Var5;
                                }
                            }
                        }
                    }
                    i6++;
                    vh6Var4 = vh6Var;
                    elapsedRealtime = j;
                }
                oc7Var3.C0 = vh6Var4.m();
                break;
        }
    }
}
