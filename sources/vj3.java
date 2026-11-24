// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class vj3 extends l5c {
    public final int Q;
    public final int R;
    public final boolean S;
    public final uj3 T;
    public final ArrayList U;
    public final ArrayList V;
    public final ArrayList W;
    public boolean X;
    public boolean Y;
    public final SpannableStringBuilder Z;
    public int a0;
    public int b0;
    public boolean c0;
    public boolean d0;
    public boolean e0;
    public int f0;
    public int g0;
    public String h0;
    public final qj3 i0;
    public boolean j0;
    public final hj3 k0;

    public vj3(o39 o39Var, Context context, int i, int i2, boolean z, wjb wjbVar) {
        super(o39Var, context, i, 0, true, null, wjbVar);
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.W = new ArrayList();
        this.i0 = new qj3(this, (byte) 0);
        this.j0 = true;
        this.k0 = new hj3(this, (byte) 1);
        this.w = new w72(this, (byte) 19);
        this.Q = i;
        this.R = i2;
        this.S = z;
        this.T = new uj3(i, new qj3(this, (byte) 1));
        this.Z = gl.D2(gl.N2(k96.M0(2131754174, null), -1, 0, new fe0(this, wjbVar, context), null), true);
        O(false);
        hq6.d0(i).O0(true);
    }

    public final void W() {
        boolean isEmpty = TextUtils.isEmpty(this.h0);
        o39 o39Var = this.d;
        if (isEmpty) {
            if (!this.j0) {
                if (o39Var != null) {
                    for (int i = 0; i < o39Var.getChildCount(); i++) {
                        if (!(o39Var.getChildAt(i) instanceof pi4)) {
                        }
                    }
                }
            }
            this.T.a();
            break;
        }
        if (this.e0 && !this.c0 && o39Var != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= o39Var.getChildCount()) {
                    break;
                }
                if (!(o39Var.getChildAt(i2) instanceof pi4)) {
                    i2++;
                } else if (this.e0 && !this.c0 && !TextUtils.isEmpty(this.h0)) {
                    X(true);
                }
            }
        }
        this.j0 = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(boolean z) {
        this.c0 = true;
        int i = this.g0 + 1;
        this.g0 = i;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.broadcasts_only = false;
        int i2 = this.R;
        if (i2 != 0) {
            tL_messages_searchGlobal.flags |= 1;
            tL_messages_searchGlobal.folder_id = i2;
        }
        tL_messages_searchGlobal.q = this.h0;
        tL_messages_searchGlobal.limit = 25;
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        int i3 = this.Q;
        if (z) {
            ArrayList arrayList = this.W;
            if (!arrayList.isEmpty()) {
                k27 k27Var = (k27) b00.f(1, arrayList);
                tL_messages_searchGlobal.offset_rate = this.f0;
                tL_messages_searchGlobal.offset_id = k27Var.e1();
                if (k27Var.k.peer_id == null) {
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_searchGlobal.offset_peer = na7.q1(i3).k1(k27Var.k.peer_id);
                }
                gl.d3(new bs1(this, i, tL_messages_searchGlobal, z, (byte) 2), !z ? 800L : 0L);
                if (z) {
                    this.d0 = true;
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.limit = 30;
                    tL_contacts_search.bots = true;
                    tL_contacts_search.q = this.h0;
                    ConnectionsManager.getInstance(i3).sendRequestTyped(tL_contacts_search, new hc((byte) 0), new ae2(this, tL_contacts_search, (byte) 11));
                    return;
                }
                return;
            }
        }
        tL_messages_searchGlobal.offset_rate = 0;
        tL_messages_searchGlobal.offset_id = 0;
        tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        gl.d3(new bs1(this, i, tL_messages_searchGlobal, z, (byte) 2), !z ? 800L : 0L);
        if (z) {
        }
    }
}
