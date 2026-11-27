// default package

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public abstract class pk3 extends l9c {
    public final int Q;
    public final int R;
    public final ArrayList S;
    public final ArrayList T;
    public final ArrayList U;
    public final ArrayList V;
    public boolean W;
    public boolean X;
    public final ArrayList Y;
    public boolean Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public int d0;
    public String e0;
    public final zg3 f0;

    public pk3(d79 d79Var, Activity activity, int i, int i2) {
        super(d79Var, activity, i, 0, false, null, null);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.Y = new ArrayList();
        ix9 ix9Var = (ix9) this;
        this.f0 = new zg3(ix9Var, (byte) 10);
        this.w = new n82(ix9Var, (byte) 20);
        this.Q = i;
        this.R = i2;
        O(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(boolean z) {
        this.Z = true;
        int i = this.d0 + 1;
        this.d0 = i;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = true;
        int i2 = this.R;
        if (i2 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i2;
        }
        tL_messages_searchGlobal.q = this.e0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i3 = this.Q;
        if (z) {
            ArrayList arrayList = this.S;
            if (!arrayList.isEmpty()) {
                r47 r47Var = (r47) c00.g(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.c0;
                tL_messages_searchGlobal.offset_id = r47Var.e1();
                if (r47Var.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = uc7.s1(i3).m1(r47Var.k.peer_id);
                }
                hl.d3(new ps1(this, i, tL_messages_searchGlobal, z, (byte) 3), !z ? 800L : 0L);
                if (z) {
                    this.a0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 20;
                    tL_contacts_search.broadcasts = true;
                    tL_contacts_search.q = this.e0;
                    ConnectionsManager.getInstance(i3).sendRequestTyped(tL_contacts_search, new ic((byte) 0), new qe2(this, tL_contacts_search, (byte) 12));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        hl.d3(new ps1(this, i, tL_messages_searchGlobal, z, (byte) 3), !z ? 800L : 0L);
        if (z) {
        }
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i = this.Q;
        ArrayList arrayList2 = uc7.s1(i).y;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            TLRPC.Chat M0 = uc7.s1(i).M0(Long.valueOf(-((TLRPC.Dialog) obj).id));
            if (M0 != null && xc2.V(M0) && xc2.t0(M0) && !xc2.r0(M0)) {
                arrayList.add(M0);
                if (arrayList.size() >= 100) {
                    break;
                }
            }
        }
        ArrayList arrayList3 = this.Y;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
    }
}
