package zh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import lg.m0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.hp;
import org.telegram.messenger.mi;
import org.telegram.messenger.p5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.d5;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.up0;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class k implements d5 {
    public final boolean a;
    public boolean b;
    public final d2 g;
    public final FrameLayout h;
    public final mi i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public zu0 n;
    public zu0 o;
    public tj0 p;
    public iz q;
    public TLRPC.TL_chatInviteImporter r;
    public j s;
    public String t;
    public e u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final f f = new f(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final wh.d D = new wh.d(this, 3);

    public k(d2 d2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.g = d2Var;
        this.h = frameLayout;
        this.j = j10;
        int currentAccount = d2Var.getCurrentAccount();
        this.k = currentAccount;
        this.a = t3.U(currentAccount, j10);
        this.l = z10;
        this.i = mi.b(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        boolean z12 = view.getVisibility() == 0;
        float f10 = z10 ? 1.0f : 0.0f;
        if (z10 == z12 && f10 == view.getAlpha()) {
            return;
        }
        if (!z11) {
            view.setVisibility(z10 ? 0 : 4);
            return;
        }
        if (z10) {
            view.setAlpha(0.0f);
        }
        view.setVisibility(0);
        view.animate().alpha(f10).setDuration(150L).start();
    }

    public final zu0 a() {
        if (this.n == null) {
            d2 d2Var = this.g;
            zu0 zu0Var = new zu0(d2Var.getParentActivity(), null, 16, d2Var.getResourceProvider());
            this.n = zu0Var;
            boolean z10 = this.a;
            zu0Var.d.setText(bd.M0(z10 ? 2131748154 : 2131748203, null));
            this.n.e.setText(bd.M0(z10 ? 2131748153 : 2131748202, null));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final iz b() {
        if (this.q == null) {
            d2 d2Var = this.g;
            iz izVar = new iz(d2Var.getParentActivity(), d2Var.getResourceProvider());
            this.q = izVar;
            izVar.setAlpha(0.0f);
            if (this.B) {
                r6.i(k6.d6, this.q, d2Var.getResourceProvider());
            }
            this.q.e(k6.d6, k6.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final zu0 c() {
        if (this.o == null) {
            d2 d2Var = this.g;
            zu0 zu0Var = new zu0(d2Var.getParentActivity(), null, 1, d2Var.getResourceProvider());
            this.o = zu0Var;
            if (this.B) {
                r6.i(k6.d6, zu0Var, d2Var.getResourceProvider());
            }
            this.o.d.setText(bd.M0(2131748175, null));
            this.o.e.setText(bd.M0(2131745817, null));
            this.o.setAnimateLayoutChange(true);
            this.o.setVisibility(8);
        }
        return this.o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i3 = this.k;
        tL_messages_hideChatJoinRequest.peer = hp.s1(i3).j1(-this.j);
        tL_messages_hideChatJoinRequest.user_id = hp.s1(i3).q1(user);
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_hideChatJoinRequest, new m0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z10 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.i.a.get(this.j);
            if (tL_messages_chatInviteImporters != null) {
                this.z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z10 = false;
            }
        }
        g0.h3(new up0(17, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z12 = !arrayList.isEmpty() || z10;
            zu0 zu0Var = this.n;
            if (zu0Var != null) {
                zu0Var.setVisibility(z12 ? 4 : 0);
            }
            zu0 zu0Var2 = this.o;
            if (zu0Var2 != null) {
                zu0Var2.setVisibility(4);
            }
        } else {
            z12 = !this.c.isEmpty() || z10;
            zu0 zu0Var3 = this.n;
            if (zu0Var3 != null) {
                zu0Var3.setVisibility(4);
            }
            zu0 zu0Var4 = this.o;
            if (zu0Var4 != null) {
                zu0Var4.setVisibility(z12 ? 4 : 0);
            }
        }
        k(this.p, z12, true);
        if (arrayList.isEmpty()) {
            zu0 zu0Var5 = this.n;
            if (zu0Var5 != null) {
                zu0Var5.setVisibility(0);
            }
            zu0 zu0Var6 = this.o;
            if (zu0Var6 != null) {
                zu0Var6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().q().i(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z10, boolean z11) {
        boolean z12;
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList;
        int i3;
        boolean z13;
        boolean z14;
        boolean z15;
        ArrayList arrayList2 = this.c;
        boolean z16 = true;
        boolean z17 = !arrayList2.isEmpty() && this.x;
        for (int i10 = 0; i10 < tL_messages_chatInviteImporters.users.size(); i10++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i10);
            this.d.put(user.id, user);
        }
        f fVar = this.f;
        if (z10) {
            fVar.E(tL_messages_chatInviteImporters.importers);
            z13 = true;
        } else {
            if (tL_messages_chatInviteImporters.importers.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z12 = true;
                    if (z12) {
                        fVar.s(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    k kVar = fVar.c;
                    ArrayList arrayList3 = kVar.c;
                    i3 = 0;
                    while (i3 < arrayList.size()) {
                        long j10 = arrayList.get(i3).user_id;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList3.size()) {
                                z14 = z16;
                                break;
                            }
                            z14 = z16;
                            if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i11)).user_id == j10) {
                                arrayList.remove(i3);
                                i3--;
                                break;
                            } else {
                                i11++;
                                z16 = z14;
                            }
                        }
                        i3++;
                        z16 = z14;
                    }
                    z13 = z16;
                    arrayList3.addAll(arrayList);
                    fVar.o((arrayList3.size() + (!kVar.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z12) {
                        fVar.i(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z12 = false;
            if (z12) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            k kVar2 = fVar.c;
            ArrayList arrayList32 = kVar2.c;
            i3 = 0;
            while (i3 < arrayList.size()) {
            }
            z13 = z16;
            arrayList32.addAll(arrayList);
            fVar.o((arrayList32.size() + (!kVar2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
            if (z12) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList4 = this.e;
            if (z10) {
                arrayList4.clear();
            }
            arrayList4.addAll(tL_messages_chatInviteImporters.importers);
            if (this.l) {
                z15 = false;
                this.g.getActionBar().q().j(0).setVisibility(arrayList4.isEmpty() ? 8 : 0);
                f(str, z11, z15);
                this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count ? z13 : z15;
                if (z17 == ((arrayList2.isEmpty() && this.x) ? z13 : z15)) {
                    if (this.x) {
                        fVar.i(fVar.b() - 1);
                        return;
                    } else {
                        fVar.s(fVar.b());
                        return;
                    }
                }
                return;
            }
        }
        z15 = false;
        f(str, z11, z15);
        this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count ? z13 : z15;
        if (z17 == ((arrayList2.isEmpty() && this.x) ? z13 : z15)) {
        }
    }

    public final void h(View view) {
        if (view instanceof e5) {
            if (this.y) {
                g0.v1(this.g.getParentActivity().getCurrentFocus());
            }
            g0.i3(new xh.i(12, this, (e5) view), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z10) {
        int i3;
        tj0 tj0Var = this.p;
        if (tj0Var == null || (i3 = !this.f.c.B ? 1 : 0) < 0 || i3 >= tj0Var.getChildCount()) {
            return;
        }
        this.p.getChildAt(i3).setEnabled(z10);
    }

    public final void j(String str) {
        if (this.u != null) {
            Utilities.g.a(this.u);
            this.u = null;
        }
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.t = str;
        if (this.z && this.e.isEmpty()) {
            k(this.q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f.E(this.e);
            k(this.p, true, true);
            k(this.q, false, false);
            zu0 zu0Var = this.o;
            if (zu0Var != null) {
                zu0Var.setVisibility(4);
            }
            if (str == null && this.l) {
                this.g.getActionBar().q().j(0).setVisibility(this.e.isEmpty() ? 8 : 0);
            }
        } else {
            this.f.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            p5 p5Var = Utilities.g;
            e eVar = new e(this, 2);
            this.u = eVar;
            p5Var.e(eVar, 300L);
        }
        if (str != null) {
            zu0 zu0Var2 = this.n;
            if (zu0Var2 != null) {
                zu0Var2.setVisibility(4);
            }
            zu0 zu0Var3 = this.o;
            if (zu0Var3 != null) {
                zu0Var3.setVisibility(4);
            }
        }
    }
}
