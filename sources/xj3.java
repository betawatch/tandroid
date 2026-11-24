// default package

import android.app.Activity;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public abstract class xj3 extends l5c {
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
    public final li3 f0;

    public xj3(o39 o39Var, Activity activity, int i, int i2) {
        super(o39Var, activity, i, 0, false, null, null);
        this.S = new ArrayList();
        this.T = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.Y = new ArrayList();
        ot9 ot9Var = (ot9) this;
        this.f0 = new li3(ot9Var, (byte) 4);
        this.w = new w72(ot9Var, (byte) 20);
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
                k27 k27Var = (k27) b00.f(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.c0;
                tL_messages_searchGlobal.offset_id = k27Var.e1();
                if (k27Var.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = na7.q1(i3).k1(k27Var.k.peer_id);
                }
                gl.e3(new bs1(this, i, tL_messages_searchGlobal, z, (byte) 3), !z ? 800L : 0L);
                if (z) {
                    this.a0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 20;
                    tL_contacts_search.broadcasts = true;
                    tL_contacts_search.q = this.e0;
                    ConnectionsManager.getInstance(i3).sendRequestTyped(tL_contacts_search, new hc((byte) 0), new ae2(this, tL_contacts_search, (byte) 12));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        gl.e3(new bs1(this, i, tL_messages_searchGlobal, z, (byte) 3), !z ? 800L : 0L);
        if (z) {
        }
    }

    public final void X() {
        ArrayList arrayList = new ArrayList();
        int i = this.Q;
        ArrayList arrayList2 = na7.q1(i).y;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            TLRPC.Chat K0 = na7.q1(i).K0(Long.valueOf(-((TLRPC.Dialog) obj).id));
            if (K0 != null && hc2.V(K0) && hc2.t0(K0) && !hc2.r0(K0)) {
                arrayList.add(K0);
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
