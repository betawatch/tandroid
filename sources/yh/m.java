package yh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import kg.l0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.p5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.messenger.vi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.d5;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Components.av0;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tp0;
import wi.q;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class m implements d5 {
    public final boolean a;
    public boolean b;
    public final f2 g;
    public final FrameLayout h;
    public final vi i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public av0 n;
    public av0 o;
    public pj0 p;
    public lz q;
    public TLRPC.TL_chatInviteImporter r;
    public l s;
    public String t;
    public e u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final h f = new h(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final f D = new f(this, 0);

    public m(f2 f2Var, FrameLayout frameLayout, long j3, boolean z9) {
        this.g = f2Var;
        this.h = frameLayout;
        this.j = j3;
        int currentAccount = f2Var.getCurrentAccount();
        this.k = currentAccount;
        this.a = t3.U(currentAccount, j3);
        this.l = z9;
        this.i = vi.b(currentAccount);
    }

    public static void k(View view, boolean z9, boolean z10) {
        if (view == null) {
            return;
        }
        boolean z11 = view.getVisibility() == 0;
        float f10 = z9 ? 1.0f : 0.0f;
        if (z9 == z11 && f10 == view.getAlpha()) {
            return;
        }
        if (!z10) {
            view.setVisibility(z9 ? 0 : 4);
            return;
        }
        if (z9) {
            view.setAlpha(0.0f);
        }
        view.setVisibility(0);
        view.animate().alpha(f10).setDuration(150L).start();
    }

    public final av0 a() {
        if (this.n == null) {
            f2 f2Var = this.g;
            av0 av0Var = new av0(f2Var.getParentActivity(), null, 16, f2Var.getResourceProvider());
            this.n = av0Var;
            boolean z9 = this.a;
            av0Var.d.setText(hd.M0(z9 ? 2131748145 : 2131748194, null));
            this.n.e.setText(hd.M0(z9 ? 2131748144 : 2131748193, null));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final lz b() {
        if (this.q == null) {
            f2 f2Var = this.g;
            lz lzVar = new lz(f2Var.getParentActivity(), f2Var.getResourceProvider());
            this.q = lzVar;
            lzVar.setAlpha(0.0f);
            if (this.B) {
                r6.i(k6.d6, this.q, f2Var.getResourceProvider());
            }
            this.q.e(k6.d6, k6.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final av0 c() {
        if (this.o == null) {
            f2 f2Var = this.g;
            av0 av0Var = new av0(f2Var.getParentActivity(), null, 1, f2Var.getResourceProvider());
            this.o = av0Var;
            if (this.B) {
                r6.i(k6.d6, av0Var, f2Var.getResourceProvider());
            }
            this.o.d.setText(hd.M0(2131748166, null));
            this.o.e.setText(hd.M0(2131745808, null));
            this.o.setAnimateLayoutChange(true);
            this.o.setVisibility(8);
        }
        return this.o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z9) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z9;
        int i7 = this.k;
        tL_messages_hideChatJoinRequest.peer = qp.s1(i7).j1(-this.j);
        tL_messages_hideChatJoinRequest.user_id = qp.s1(i7).q1(user);
        ConnectionsManager.getInstance(i7).sendRequest(tL_messages_hideChatJoinRequest, new l0(this, tL_chatInviteImporter, z9, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        boolean z9 = true;
        if (this.A) {
            TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters = (TLRPC.TL_messages_chatInviteImporters) this.i.a.get(this.j);
            if (tL_messages_chatInviteImporters != null) {
                this.z = true;
                g(tL_messages_chatInviteImporters, null, true, true);
                z9 = false;
            }
        }
        g0.h3(new tp0(17, this, z9));
    }

    public void f(String str, boolean z9, boolean z10) {
        boolean z11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z11 = !arrayList.isEmpty() || z9;
            av0 av0Var = this.n;
            if (av0Var != null) {
                av0Var.setVisibility(z11 ? 4 : 0);
            }
            av0 av0Var2 = this.o;
            if (av0Var2 != null) {
                av0Var2.setVisibility(4);
            }
        } else {
            z11 = !this.c.isEmpty() || z9;
            av0 av0Var3 = this.n;
            if (av0Var3 != null) {
                av0Var3.setVisibility(4);
            }
            av0 av0Var4 = this.o;
            if (av0Var4 != null) {
                av0Var4.setVisibility(z11 ? 4 : 0);
            }
        }
        k(this.p, z11, true);
        if (arrayList.isEmpty()) {
            av0 av0Var5 = this.n;
            if (av0Var5 != null) {
                av0Var5.setVisibility(0);
            }
            av0 av0Var6 = this.o;
            if (av0Var6 != null) {
                av0Var6.setVisibility(4);
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
    public final void g(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z9, boolean z10) {
        boolean z11;
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList;
        int i7;
        boolean z12;
        boolean z13;
        boolean z14;
        ArrayList arrayList2 = this.c;
        boolean z15 = true;
        boolean z16 = !arrayList2.isEmpty() && this.x;
        for (int i10 = 0; i10 < tL_messages_chatInviteImporters.users.size(); i10++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i10);
            this.d.put(user.id, user);
        }
        h hVar = this.f;
        if (z9) {
            hVar.E(tL_messages_chatInviteImporters.importers);
            z12 = true;
        } else {
            if (tL_messages_chatInviteImporters.importers.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z11 = true;
                    if (z11) {
                        hVar.s(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    m mVar = hVar.c;
                    ArrayList arrayList3 = mVar.c;
                    i7 = 0;
                    while (i7 < arrayList.size()) {
                        long j3 = arrayList.get(i7).user_id;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= arrayList3.size()) {
                                z13 = z15;
                                break;
                            }
                            z13 = z15;
                            if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i11)).user_id == j3) {
                                arrayList.remove(i7);
                                i7--;
                                break;
                            } else {
                                i11++;
                                z15 = z13;
                            }
                        }
                        i7++;
                        z15 = z13;
                    }
                    z12 = z15;
                    arrayList3.addAll(arrayList);
                    hVar.o((arrayList3.size() + (!mVar.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z11) {
                        hVar.i(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z11 = false;
            if (z11) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            m mVar2 = hVar.c;
            ArrayList arrayList32 = mVar2.c;
            i7 = 0;
            while (i7 < arrayList.size()) {
            }
            z12 = z15;
            arrayList32.addAll(arrayList);
            hVar.o((arrayList32.size() + (!mVar2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
            if (z11) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList4 = this.e;
            if (z9) {
                arrayList4.clear();
            }
            arrayList4.addAll(tL_messages_chatInviteImporters.importers);
            if (this.l) {
                z14 = false;
                this.g.getActionBar().q().j(0).setVisibility(arrayList4.isEmpty() ? 8 : 0);
                f(str, z10, z14);
                this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count ? z12 : z14;
                if (z16 == ((arrayList2.isEmpty() && this.x) ? z12 : z14)) {
                    if (this.x) {
                        hVar.i(hVar.b() - 1);
                        return;
                    } else {
                        hVar.s(hVar.b());
                        return;
                    }
                }
                return;
            }
        }
        z14 = false;
        f(str, z10, z14);
        this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count ? z12 : z14;
        if (z16 == ((arrayList2.isEmpty() && this.x) ? z12 : z14)) {
        }
    }

    public final void h(View view) {
        if (view instanceof e5) {
            if (this.y) {
                g0.v1(this.g.getParentActivity().getCurrentFocus());
            }
            g0.i3(new q(9, this, (e5) view), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z9) {
        int i7;
        pj0 pj0Var = this.p;
        if (pj0Var == null || (i7 = !this.f.c.B ? 1 : 0) < 0 || i7 >= pj0Var.getChildCount()) {
            return;
        }
        this.p.getChildAt(i7).setEnabled(z9);
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
            av0 av0Var = this.o;
            if (av0Var != null) {
                av0Var.setVisibility(4);
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
            p5Var.d(eVar, 300L);
        }
        if (str != null) {
            av0 av0Var2 = this.n;
            if (av0Var2 != null) {
                av0Var2.setVisibility(4);
            }
            av0 av0Var3 = this.o;
            if (av0Var3 != null) {
                av0Var3.setVisibility(4);
            }
        }
    }
}
