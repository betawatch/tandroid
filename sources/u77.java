// default package

import android.util.SparseArray;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class u77 implements Runnable {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ oc7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ u77(oc7 oc7Var, ArrayList arrayList, long j, TLRPC.updates_ChannelDifference updates_channeldifference, TLRPC.Chat chat, vh6 vh6Var, int i, long j2) {
        this.b = oc7Var;
        this.f = arrayList;
        this.c = j;
        this.h = updates_channeldifference;
        this.n = chat;
        this.r = vh6Var;
        this.d = i;
        this.e = j2;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Serializable, java.lang.Runnable[]] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 0;
        switch (this.a) {
            case 0:
                oc7 oc7Var = this.b;
                boolean[] zArr = (boolean[]) this.f;
                cf7 cf7Var = (cf7) this.h;
                long j = this.c;
                ?? r8 = (Runnable[]) this.n;
                long j2 = this.e;
                int i2 = this.d;
                dc7 dc7Var = (dc7) this.r;
                if (!zArr[0]) {
                    gm.c3(new pf(oc7Var, zArr, cf7Var.N(j), r8, j2, i2, dc7Var, (byte) 3));
                    break;
                }
                break;
            default:
                oc7 oc7Var2 = this.b;
                ArrayList arrayList = (ArrayList) this.f;
                long j3 = this.c;
                TLRPC.updates_ChannelDifference updates_channeldifference = (TLRPC.updates_ChannelDifference) this.h;
                TLRPC.Chat chat = (TLRPC.Chat) this.n;
                vh6 vh6Var = (vh6) this.r;
                int i3 = this.d;
                long j4 = this.e;
                if (!arrayList.isEmpty()) {
                    SparseArray sparseArray = new SparseArray();
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        int i4 = i + 1;
                        TL_update.TL_updateMessageID tL_updateMessageID = (TL_update.TL_updateMessageID) obj;
                        ArrayList arrayList2 = arrayList;
                        long[] X1 = oc7Var2.getMessagesStorage().X1(tL_updateMessageID.random_id, -j3, null, tL_updateMessageID.id, 0, -1, 0);
                        if (X1 != null) {
                            sparseArray.put(tL_updateMessageID.id, X1);
                        }
                        i = i4;
                        arrayList = arrayList2;
                    }
                    if (sparseArray.size() != 0) {
                        gm.c3(new k97(oc7Var2, sparseArray, (byte) 1));
                    }
                }
                Utilities.d.c(new y97(oc7Var2, updates_channeldifference, j3, chat, vh6Var, i3, j4));
                break;
        }
    }

    public /* synthetic */ u77(oc7 oc7Var, boolean[] zArr, cf7 cf7Var, long j, Runnable[] runnableArr, long j2, int i, dc7 dc7Var) {
        this.b = oc7Var;
        this.f = zArr;
        this.h = cf7Var;
        this.c = j;
        this.n = runnableArr;
        this.e = j2;
        this.d = i;
        this.r = dc7Var;
    }
}
