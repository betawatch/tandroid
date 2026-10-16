package xh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import ig.n0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MemberRequestsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.zr0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public abstract class l implements f5 {
    public final boolean a;
    public boolean b;
    public final m2 g;
    public final FrameLayout h;
    public final MemberRequestsController i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public wx0 n;
    public wx0 o;
    public mm0 p;
    public f10 q;
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
    public final kc0 D = new kc0(this, 18);

    public l(m2 m2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.g = m2Var;
        this.h = frameLayout;
        this.j = j10;
        int currentAccount = m2Var.getCurrentAccount();
        this.k = currentAccount;
        this.a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.l = z10;
        this.i = MemberRequestsController.getInstance(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        if (view == null) {
            return;
        }
        boolean z12 = view.getVisibility() == 0;
        float f7 = z10 ? 1.0f : 0.0f;
        if (z10 == z12 && f7 == view.getAlpha()) {
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
        view.animate().alpha(f7).setDuration(150L).start();
    }

    public final wx0 a() {
        if (this.n == null) {
            m2 m2Var = this.g;
            wx0 wx0Var = new wx0(m2Var.getParentActivity(), null, 16, m2Var.getResourceProvider());
            this.n = wx0Var;
            boolean z10 = this.a;
            wx0Var.d.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequests : R.string.NoMemberRequests));
            this.n.e.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequestsDescription : R.string.NoMemberRequestsDescription));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final f10 b() {
        if (this.q == null) {
            m2 m2Var = this.g;
            f10 f10Var = new f10(m2Var.getParentActivity(), m2Var.getResourceProvider());
            this.q = f10Var;
            f10Var.setAlpha(0.0f);
            if (this.B) {
                this.q.setBackgroundColor(g6.w0(g6.d6, m2Var.getResourceProvider()));
            }
            this.q.f(g6.d6, g6.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final wx0 c() {
        if (this.o == null) {
            m2 m2Var = this.g;
            wx0 wx0Var = new wx0(m2Var.getParentActivity(), null, 1, m2Var.getResourceProvider());
            this.o = wx0Var;
            if (this.B) {
                wx0Var.setBackgroundColor(g6.w0(g6.d6, m2Var.getResourceProvider()));
            }
            this.o.d.setText(LocaleController.getString(R.string.NoResult));
            this.o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
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
        int i10 = this.k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.i.getCachedImporters(this.j)) != null) {
            this.z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new zr0(17, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z12 = !arrayList.isEmpty() || z10;
            wx0 wx0Var = this.n;
            if (wx0Var != null) {
                wx0Var.setVisibility(z12 ? 4 : 0);
            }
            wx0 wx0Var2 = this.o;
            if (wx0Var2 != null) {
                wx0Var2.setVisibility(4);
            }
        } else {
            z12 = !this.c.isEmpty() || z10;
            wx0 wx0Var3 = this.n;
            if (wx0Var3 != null) {
                wx0Var3.setVisibility(4);
            }
            wx0 wx0Var4 = this.o;
            if (wx0Var4 != null) {
                wx0Var4.setVisibility(z12 ? 4 : 0);
            }
        }
        k(this.p, z12, true);
        if (arrayList.isEmpty()) {
            wx0 wx0Var5 = this.n;
            if (wx0Var5 != null) {
                wx0Var5.setVisibility(0);
            }
            wx0 wx0Var6 = this.o;
            if (wx0Var6 != null) {
                wx0Var6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().n().j(true);
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
        int i10;
        boolean z13;
        boolean z14;
        boolean z15;
        ArrayList arrayList2 = this.c;
        boolean z16 = true;
        boolean z17 = !arrayList2.isEmpty() && this.x;
        for (int i11 = 0; i11 < tL_messages_chatInviteImporters.users.size(); i11++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i11);
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
                        gVar.u(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    l lVar = gVar.c;
                    ArrayList arrayList3 = lVar.c;
                    i10 = 0;
                    while (i10 < arrayList.size()) {
                        long j10 = arrayList.get(i10).user_id;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList3.size()) {
                                z14 = z16;
                                break;
                            }
                            z14 = z16;
                            if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i12)).user_id == j10) {
                                arrayList.remove(i10);
                                i10--;
                                break;
                            } else {
                                i12++;
                                z16 = z14;
                            }
                        }
                        i10++;
                        z16 = z14;
                    }
                    z13 = z16;
                    arrayList3.addAll(arrayList);
                    gVar.s((arrayList3.size() + (!lVar.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z12) {
                        gVar.o(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z12 = false;
            if (z12) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            l lVar2 = gVar.c;
            ArrayList arrayList32 = lVar2.c;
            i10 = 0;
            while (i10 < arrayList.size()) {
            }
            z13 = z16;
            arrayList32.addAll(arrayList);
            gVar.s((arrayList32.size() + (!lVar2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
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
                this.g.getActionBar().n().k(0).setVisibility(arrayList4.isEmpty() ? 8 : 0);
                f(str, z11, z15);
                this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count ? z13 : z15;
                if (z17 == ((arrayList2.isEmpty() && this.x) ? z13 : z15)) {
                    if (this.x) {
                        gVar.o(gVar.h() - 1);
                        return;
                    } else {
                        gVar.u(gVar.h());
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
                AndroidUtilities.hideKeyboard(this.g.getParentActivity().getCurrentFocus());
            }
            AndroidUtilities.runOnUIThread(new s9.b(23, this, (g5) view), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z10) {
        int i10;
        mm0 mm0Var = this.p;
        if (mm0Var == null || (i10 = !this.f.c.B ? 1 : 0) < 0 || i10 >= mm0Var.getChildCount()) {
            return;
        }
        this.p.getChildAt(i10).setEnabled(z10);
    }

    public final void j(String str) {
        if (this.u != null) {
            Utilities.searchQueue.cancelRunnable(this.u);
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
            wx0 wx0Var = this.o;
            if (wx0Var != null) {
                wx0Var.setVisibility(4);
            }
            if (str == null && this.l) {
                this.g.getActionBar().n().k(0).setVisibility(this.e.isEmpty() ? 8 : 0);
            }
        } else {
            this.f.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            wx0 wx0Var2 = this.n;
            if (wx0Var2 != null) {
                wx0Var2.setVisibility(4);
            }
            wx0 wx0Var3 = this.o;
            if (wx0Var3 != null) {
                wx0Var3.setVisibility(4);
            }
        }
    }
}
