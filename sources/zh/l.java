package zh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import kg.o0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.q5;
import org.telegram.messenger.si;
import org.telegram.messenger.v3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.wz;
import ug.j1;
import wg.r;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public abstract class l implements f5 {
    public final boolean a;
    public boolean b;
    public final h2 g;
    public final FrameLayout h;
    public final si i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public kv0 n;
    public kv0 o;
    public ck0 p;
    public wz q;
    public TLRPC.TL_chatInviteImporter r;
    public k s;
    public String t;
    public e u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f = new g(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final j1 D = new j1(this, 4);

    public l(h2 h2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.g = h2Var;
        this.h = frameLayout;
        this.j = j3;
        int currentAccount = h2Var.getCurrentAccount();
        this.k = currentAccount;
        this.a = v3.U(currentAccount, j3);
        this.l = z10;
        this.i = si.b(currentAccount);
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

    public final kv0 a() {
        if (this.n == null) {
            h2 h2Var = this.g;
            kv0 kv0Var = new kv0(h2Var.getParentActivity(), null, 16, h2Var.getResourceProvider());
            this.n = kv0Var;
            boolean z10 = this.a;
            kv0Var.d.setText(gd.M0(z10 ? 2131747954 : 2131748003, null));
            this.n.e.setText(gd.M0(z10 ? 2131747953 : 2131748002, null));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final wz b() {
        if (this.q == null) {
            h2 h2Var = this.g;
            wz wzVar = new wz(h2Var.getParentActivity(), h2Var.getResourceProvider());
            this.q = wzVar;
            wzVar.setAlpha(0.0f);
            if (this.B) {
                u6.h(n6.d6, this.q, h2Var.getResourceProvider());
            }
            this.q.e(n6.d6, n6.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final kv0 c() {
        if (this.o == null) {
            h2 h2Var = this.g;
            kv0 kv0Var = new kv0(h2Var.getParentActivity(), null, 1, h2Var.getResourceProvider());
            this.o = kv0Var;
            if (this.B) {
                u6.h(n6.d6, kv0Var, h2Var.getResourceProvider());
            }
            this.o.d.setText(gd.M0(2131747975, null));
            this.o.e.setText(gd.M0(2131745612, null));
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
        int i7 = this.k;
        tL_messages_hideChatJoinRequest.peer = mp.u1(i7).l1(-this.j);
        tL_messages_hideChatJoinRequest.user_id = mp.u1(i7).s1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
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
        g0.g3(new pp0(18, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z12 = !arrayList.isEmpty() || z10;
            kv0 kv0Var = this.n;
            if (kv0Var != null) {
                kv0Var.setVisibility(z12 ? 4 : 0);
            }
            kv0 kv0Var2 = this.o;
            if (kv0Var2 != null) {
                kv0Var2.setVisibility(4);
            }
        } else {
            z12 = !this.c.isEmpty() || z10;
            kv0 kv0Var3 = this.n;
            if (kv0Var3 != null) {
                kv0Var3.setVisibility(4);
            }
            kv0 kv0Var4 = this.o;
            if (kv0Var4 != null) {
                kv0Var4.setVisibility(z12 ? 4 : 0);
            }
        }
        k(this.p, z12, true);
        if (arrayList.isEmpty()) {
            kv0 kv0Var5 = this.n;
            if (kv0Var5 != null) {
                kv0Var5.setVisibility(0);
            }
            kv0 kv0Var6 = this.o;
            if (kv0Var6 != null) {
                kv0Var6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().t().i(true);
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
        int i7;
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
        g gVar = this.f;
        if (z10) {
            gVar.E(tL_messages_chatInviteImporters.importers);
            z13 = true;
        } else {
            if (tL_messages_chatInviteImporters.importers.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z12 = true;
                    if (z12) {
                        gVar.s(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    l lVar = gVar.c;
                    ArrayList arrayList3 = lVar.c;
                    i7 = 0;
                    while (i7 < arrayList.size()) {
                        long j3 = arrayList.get(i7).user_id;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList3.size()) {
                                z14 = z16;
                                break;
                            }
                            z14 = z16;
                            if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i11)).user_id == j3) {
                                arrayList.remove(i7);
                                i7--;
                                break;
                            } else {
                                i11++;
                                z16 = z14;
                            }
                        }
                        i7++;
                        z16 = z14;
                    }
                    z13 = z16;
                    arrayList3.addAll(arrayList);
                    gVar.o((arrayList3.size() + (!lVar.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z12) {
                        gVar.i(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z12 = false;
            if (z12) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            l lVar2 = gVar.c;
            ArrayList arrayList32 = lVar2.c;
            i7 = 0;
            while (i7 < arrayList.size()) {
            }
            z13 = z16;
            arrayList32.addAll(arrayList);
            gVar.o((arrayList32.size() + (!lVar2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
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
                this.g.getActionBar().t().j(0).setVisibility(arrayList4.isEmpty() ? 8 : 0);
                f(str, z11, z15);
                this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count ? z13 : z15;
                if (z17 == ((arrayList2.isEmpty() && this.x) ? z13 : z15)) {
                    if (this.x) {
                        gVar.i(gVar.b() - 1);
                        return;
                    } else {
                        gVar.s(gVar.b());
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
        if (view instanceof g5) {
            if (this.y) {
                g0.v1(this.g.getParentActivity().getCurrentFocus());
            }
            g0.h3(new r(20, this, (g5) view), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z10) {
        int i7;
        ck0 ck0Var = this.p;
        if (ck0Var == null || (i7 = !this.f.c.B ? 1 : 0) < 0 || i7 >= ck0Var.getChildCount()) {
            return;
        }
        this.p.getChildAt(i7).setEnabled(z10);
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
            kv0 kv0Var = this.o;
            if (kv0Var != null) {
                kv0Var.setVisibility(4);
            }
            if (str == null && this.l) {
                this.g.getActionBar().t().j(0).setVisibility(this.e.isEmpty() ? 8 : 0);
            }
        } else {
            this.f.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            q5 q5Var = Utilities.g;
            e eVar = new e(this, 2);
            this.u = eVar;
            q5Var.d(eVar, 300L);
        }
        if (str != null) {
            kv0 kv0Var2 = this.n;
            if (kv0Var2 != null) {
                kv0Var2.setVisibility(4);
            }
            kv0 kv0Var3 = this.o;
            if (kv0Var3 != null) {
                kv0Var3.setVisibility(4);
            }
        }
    }
}
