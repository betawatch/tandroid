package vh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import gg.s0;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.vl0;
import u2.k0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class p implements f5 {
    public final boolean a;
    public boolean b;
    public final p2 g;
    public final FrameLayout h;
    public final MemberRequestsController i;
    public final long j;
    public final int k;
    public final boolean l;
    public FrameLayout m;
    public jx0 n;
    public jx0 o;
    public vl0 p;
    public a10 q;
    public TLRPC.TL_chatInviteImporter r;
    public o s;
    public String t;
    public f u;
    public int v;
    public boolean w;
    public boolean y;
    public boolean z;
    public final ArrayList c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final i f = new i(this);
    public boolean x = true;
    public boolean A = true;
    public boolean B = true;
    public final f C = new f(this, 0);
    public final al0 D = new al0(this, 12);

    public p(p2 p2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.g = p2Var;
        this.h = frameLayout;
        this.j = j3;
        int currentAccount = p2Var.getCurrentAccount();
        this.k = currentAccount;
        this.a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
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

    public final jx0 a() {
        if (this.n == null) {
            p2 p2Var = this.g;
            jx0 jx0Var = new jx0(p2Var.getParentActivity(), null, 16, p2Var.getResourceProvider());
            this.n = jx0Var;
            boolean z10 = this.a;
            jx0Var.d.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequests : R.string.NoMemberRequests));
            this.n.e.setText(LocaleController.getString(z10 ? R.string.NoSubscribeRequestsDescription : R.string.NoMemberRequestsDescription));
            this.n.setAnimateLayoutChange(true);
            this.n.setVisibility(8);
        }
        return this.n;
    }

    public final a10 b() {
        if (this.q == null) {
            p2 p2Var = this.g;
            a10 a10Var = new a10(p2Var.getParentActivity(), p2Var.getResourceProvider());
            this.q = a10Var;
            a10Var.setAlpha(0.0f);
            if (this.B) {
                this.q.setBackgroundColor(j6.v0(j6.d6, p2Var.getResourceProvider()));
            }
            this.q.f(j6.d6, j6.a7, -1);
            this.q.setViewType(15);
            this.q.setMemberRequestButton(this.a);
        }
        return this.q;
    }

    public final jx0 c() {
        if (this.o == null) {
            p2 p2Var = this.g;
            jx0 jx0Var = new jx0(p2Var.getParentActivity(), null, 1, p2Var.getResourceProvider());
            this.o = jx0Var;
            if (this.B) {
                jx0Var.setBackgroundColor(j6.v0(j6.d6, p2Var.getResourceProvider()));
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new s0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.i.getCachedImporters(this.j)) != null) {
            this.z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new bs0(12, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            z12 = !arrayList.isEmpty() || z10;
            jx0 jx0Var = this.n;
            if (jx0Var != null) {
                jx0Var.setVisibility(z12 ? 4 : 0);
            }
            jx0 jx0Var2 = this.o;
            if (jx0Var2 != null) {
                jx0Var2.setVisibility(4);
            }
        } else {
            z12 = !this.c.isEmpty() || z10;
            jx0 jx0Var3 = this.n;
            if (jx0Var3 != null) {
                jx0Var3.setVisibility(4);
            }
            jx0 jx0Var4 = this.o;
            if (jx0Var4 != null) {
                jx0Var4.setVisibility(z12 ? 4 : 0);
            }
        }
        k(this.p, z12, true);
        if (arrayList.isEmpty()) {
            jx0 jx0Var5 = this.n;
            if (jx0Var5 != null) {
                jx0Var5.setVisibility(0);
            }
            jx0 jx0Var6 = this.o;
            if (jx0Var6 != null) {
                jx0Var6.setVisibility(4);
            }
            k(this.q, false, false);
            if (this.y && this.l) {
                this.g.getActionBar().n().j(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TLRPC.TL_messages_chatInviteImporters tL_messages_chatInviteImporters, String str, boolean z10, boolean z11) {
        boolean z12;
        ArrayList<TLRPC.TL_chatInviteImporter> arrayList;
        int i10;
        boolean z13;
        ArrayList arrayList2 = this.c;
        boolean z14 = !arrayList2.isEmpty() && this.x;
        for (int i11 = 0; i11 < tL_messages_chatInviteImporters.users.size(); i11++) {
            TLRPC.User user = tL_messages_chatInviteImporters.users.get(i11);
            this.d.put(user.id, user);
        }
        i iVar = this.f;
        if (z10) {
            iVar.E(tL_messages_chatInviteImporters.importers);
        } else {
            if (tL_messages_chatInviteImporters.importers.size() > 0) {
                if (tL_messages_chatInviteImporters.importers.size() + arrayList2.size() < tL_messages_chatInviteImporters.count) {
                    z12 = true;
                    if (z12) {
                        iVar.u(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                    arrayList = tL_messages_chatInviteImporters.importers;
                    p pVar = iVar.c;
                    ArrayList arrayList3 = pVar.c;
                    i10 = 0;
                    while (i10 < arrayList.size()) {
                        long j3 = arrayList.get(i10).user_id;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= arrayList3.size()) {
                                break;
                            }
                            if (((TLRPC.TL_chatInviteImporter) arrayList3.get(i12)).user_id == j3) {
                                arrayList.remove(i10);
                                i10--;
                                break;
                            }
                            i12++;
                        }
                        i10++;
                    }
                    arrayList3.addAll(arrayList);
                    iVar.s((arrayList3.size() + (!pVar.B ? 1 : 0)) - arrayList.size(), arrayList.size());
                    if (z12) {
                        iVar.o(arrayList2.size() + (!this.B ? 1 : 0));
                    }
                }
            }
            z12 = false;
            if (z12) {
            }
            arrayList = tL_messages_chatInviteImporters.importers;
            p pVar2 = iVar.c;
            ArrayList arrayList32 = pVar2.c;
            i10 = 0;
            while (i10 < arrayList.size()) {
            }
            arrayList32.addAll(arrayList);
            iVar.s((arrayList32.size() + (!pVar2.B ? 1 : 0)) - arrayList.size(), arrayList.size());
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
                z13 = false;
                this.g.getActionBar().n().k(0).setVisibility(arrayList4.isEmpty() ? 8 : 0);
                f(str, z11, z13);
                this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count;
                if (z14 == (arrayList2.isEmpty() && this.x)) {
                    if (this.x) {
                        iVar.o(iVar.h() - 1);
                        return;
                    } else {
                        iVar.u(iVar.h());
                        return;
                    }
                }
                return;
            }
        }
        z13 = false;
        f(str, z11, z13);
        this.x = arrayList2.size() >= tL_messages_chatInviteImporters.count;
        if (z14 == (arrayList2.isEmpty() && this.x)) {
        }
    }

    public final void h(View view) {
        if (view instanceof g5) {
            if (this.y) {
                AndroidUtilities.hideKeyboard(this.g.getParentActivity().getCurrentFocus());
            }
            AndroidUtilities.runOnUIThread(new k0(3, this, (g5) view), this.y ? 100L : 0L);
        }
    }

    public final void i(boolean z10) {
        int i10;
        vl0 vl0Var = this.p;
        if (vl0Var == null || (i10 = !this.f.c.B ? 1 : 0) < 0 || i10 >= vl0Var.getChildCount()) {
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
            jx0 jx0Var = this.o;
            if (jx0Var != null) {
                jx0Var.setVisibility(4);
            }
            if (str == null && this.l) {
                this.g.getActionBar().n().k(0).setVisibility(this.e.isEmpty() ? 8 : 0);
            }
        } else {
            this.f.E(Collections.EMPTY_LIST);
            k(this.p, false, false);
            k(this.q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            f fVar = new f(this, 2);
            this.u = fVar;
            dispatchQueue.postRunnable(fVar, 300L);
        }
        if (str != null) {
            jx0 jx0Var2 = this.n;
            if (jx0Var2 != null) {
                jx0Var2.setVisibility(4);
            }
            jx0 jx0Var3 = this.o;
            if (jx0Var3 != null) {
                jx0Var3.setVisibility(4);
            }
        }
    }
}
