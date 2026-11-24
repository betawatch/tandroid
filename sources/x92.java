// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x92 extends d implements gk7 {
    public t92 E;
    public long F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public int T;
    public u92 a;
    public o39 b;
    public xha c;
    public g24 d;
    public w92 e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public hd r;
    public boolean s;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public final /* synthetic */ void Y(hd[] hdVarArr) {
        try {
            hdVarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        hdVarArr[0] = null;
        this.h.linked_chat_id = 0L;
        kk7 f = kk7.f(this.currentAccount);
        Boolean bool = Boolean.FALSE;
        f.k(kk7.S, this.h, 0, bool, bool);
        gl.e3(new k92(this, (byte) 2), 1000L);
        if (this.s) {
            return;
        }
        finishFragment();
    }

    public final /* synthetic */ void Z(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final /* synthetic */ void a0(hd[] hdVarArr, TLRPC.Chat chat, wa5 wa5Var) {
        hd hdVar = hdVarArr[0];
        if (hdVar != null) {
            try {
                hdVar.dismiss();
            } catch (Throwable unused) {
            }
            hdVarArr[0] = null;
        }
        this.h.linked_chat_id = chat.id;
        kk7 f = kk7.f(this.currentAccount);
        Boolean bool = Boolean.FALSE;
        f.k(kk7.S, this.h, 0, bool, bool);
        gl.e3(new k92(this, (byte) 1), 1000L);
        if (wa5Var == null) {
            finishFragment();
        } else {
            removeSelfFromStack();
            wa5Var.finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.u6));
        hashSet.add(Integer.valueOf(bkb.t6));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.f9));
        hashSet.add(Integer.valueOf(bkb.T7));
        hashSet.add(Integer.valueOf(bkb.S7));
        hashSet.add(Integer.valueOf(bkb.R7));
        hashSet.add(Integer.valueOf(bkb.Q7));
        hashSet.add(Integer.valueOf(bkb.P7));
        hashSet.add(Integer.valueOf(bkb.O7));
        hashSet.add(Integer.valueOf(bkb.N7));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.a7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final /* synthetic */ void b0(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public final void c0(TLRPC.Chat chat, wa5 wa5Var) {
        if (chat == null) {
            return;
        }
        byte b = 1;
        if (!hc2.T(chat)) {
            getMessagesController().P(getParentActivity(), chat.id, this, new v82(this, wa5Var, b), null);
            return;
        }
        hd[] hdVarArr = {wa5Var == null ? new hd(3, null, getParentActivity()) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = na7.g1(this.f);
        tL_channels_setDiscussionGroup.group = na7.g1(chat);
        gl.e3(new l92(this, hdVarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new rt0((Object) this, (Object) hdVarArr, (Object) chat, (Object) wa5Var, (byte) 3), 64), b), 500L);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(k96.M0(2131751377, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 25));
        xha a = this.simpleActionBar.t().a(0, R.drawable.outline_header_search);
        a.N();
        a.C0 = new q10(this, (byte) 4);
        this.c = a;
        a.setSearchFieldHint(k96.M0(2131745644, null));
        this.e = new w92(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        g24 g24Var = new g24(context, null);
        this.d = g24Var;
        g24Var.b();
        this.d.setText(k96.M0(2131747975, null));
        o39 o39Var = new o39(context, null);
        this.b = o39Var;
        o39Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new t26(1, false));
        o39 o39Var2 = this.b;
        u92 u92Var = new u92(this, context);
        this.a = u92Var;
        o39Var2.setAdapter(u92Var);
        this.b.setVerticalScrollbarPosition(k96.a0 ? 1 : 2);
        frameLayout.addView(this.b, nme.c(-1.0f, -1));
        frameLayout.addView(this.d, nme.c(-1.0f, -1));
        this.b.setOnItemClickListener(new u(this, (byte) 10));
        f0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.h.linked_chat_id != 0) {
            this.w.clear();
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.h.linked_chat_id));
            if (K0 != null) {
                this.w.add(K0);
            }
            xha xhaVar = this.c;
            if (xhaVar != null) {
                xhaVar.setVisibility(8);
            }
        }
        if (!this.x && this.s && this.h.linked_chat_id == 0) {
            this.x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new uf(this, (byte) 13));
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        t92 t92Var;
        TLRPC.Chat K0;
        TLRPC.Chat chat = null;
        if (i == kk7.S) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j = chatFull.id;
            if (j == this.F) {
                this.h = chatFull;
                d0();
                f0();
                return;
            }
            TLRPC.Chat chat2 = this.n;
            if (chat2 == null || chat2.id != j) {
                return;
            }
            try {
                this.r.dismiss();
            } catch (Throwable unused) {
            }
            this.r = null;
            e0(this.n, false);
            this.n = null;
            return;
        }
        if (i != 2) {
            if (i == kk7.x1) {
                if ((-this.F) == ((Long) objArr[0]).longValue()) {
                    ui5 ui5Var = this.parentLayout;
                    if (ui5Var == null || ui5Var.getLastFragment() != this) {
                        removeSelfFromStack();
                        return;
                    } else {
                        finishFragment();
                        return;
                    }
                }
                return;
            }
            return;
        }
        int intValue = ((Integer) objArr[0]).intValue();
        int i3 = na7.q5;
        if ((intValue & TLObject.FLAG_13) == 0 || this.f == null) {
            return;
        }
        TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(this.f.id));
        if (K02 != null) {
            this.f = K02;
        }
        if (this.w.size() > 0 && (K0 = getMessagesController().K0(Long.valueOf(((TLRPC.Chat) this.w.get(0)).id))) != null) {
            this.w.set(0, K0);
        }
        if (!this.s) {
            chat = this.f;
        } else if (this.w.size() > 0) {
            chat = (TLRPC.Chat) this.w.get(0);
        }
        if (chat == null || (t92Var = this.E) == null) {
            return;
        }
        if (!this.Q) {
            t92Var.setJoinRequest(chat.join_request);
        }
        if (this.P) {
            return;
        }
        this.E.setJoinToSend(chat.join_to_send);
    }

    public final void e0(TLRPC.Chat chat, boolean z) {
        String a0;
        TLRPC.ChatFull L0 = getMessagesController().L0(chat.id);
        byte b = 0;
        if (L0 == null) {
            if (z) {
                getMessagesController().X2(0, chat.id, true);
                this.n = chat;
                this.r = new hd(3, null, getParentActivity());
                gl.e3(new k92(this, b), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        zkb.X(textView, bkb.i5, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((k96.a0 ? 5 : 3) | 48);
        if (hc2.t0(chat)) {
            boolean t0 = hc2.t0(this.f);
            String str = chat.title;
            TLRPC.Chat chat2 = this.f;
            a0 = !t0 ? k96.a0("DiscussionLinkGroupPrivateAlert", null, 2131751366, str, chat2.title) : k96.a0("DiscussionLinkGroupPublicAlert", null, 2131751365, str, chat2.title);
        } else {
            a0 = k96.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751364, chat.title, this.f.title);
        }
        if (L0.hidden_prehistory) {
            StringBuilder k = b00.k(a0, "\n\n");
            k.append(k96.M0(2131751367, null));
            a0 = k.toString();
        }
        textView.setText(gl.T2(a0));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.n(frameLayout);
        pb0 pb0Var = new pb0((wjb) null);
        pb0Var.s(gl.L(12.0f));
        be0 be0Var = new be0(getParentActivity());
        be0Var.setRoundRadius(gl.L(20.0f));
        frameLayout.addView(be0Var, nme.d(40, 40.0f, (k96.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        tb4.w(textView2, bkb.D8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((k96.a0 ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z2 = k96.a0;
        frameLayout.addView(textView2, nme.d(-1, -2.0f, (z2 ? 5 : 3) | 48, z2 ? 21 : 76, 11.0f, z2 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, nme.d(-2, -2.0f, (k96.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        pb0Var.p(chat);
        be0Var.f(chat, pb0Var);
        alertDialog$Builder.j(k96.M0(2131751368, null), new ie((Object) this, (Object) L0, (Object) chat, (byte) 28));
        alertDialog$Builder.g(k96.M0(2131752577, null), null);
        showDialog(alertDialog$Builder.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f0() {
        int i;
        TLRPC.Chat chat;
        u92 u92Var;
        xha xhaVar;
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z = this.s;
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(this.F));
        this.f = K0;
        if (K0 == null) {
            return;
        }
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        int i2 = 1;
        this.N = 1;
        if (z) {
            if (this.h.linked_chat_id == 0) {
                this.N = 2;
                this.G = 1;
                i2 = 2;
            }
            this.H = i2;
            i = this.w.size() + i2;
            this.N = i;
            this.I = i;
            if (this.h.linked_chat_id != 0) {
                int i3 = i + 1;
                this.N = i3;
                this.G = i;
                i = i3;
            }
        } else {
            this.H = 1;
            int size = this.w.size();
            int i4 = 1 + size;
            this.I = i4;
            i = 2 + size;
            this.N = i;
            this.G = i4;
        }
        this.N = i + 1;
        this.K = i;
        if (z) {
            if (this.w.size() > 0 && this.h.linked_chat_id != 0) {
                chat = (TLRPC.Chat) this.w.get(0);
            }
            u92Var = this.a;
            if (u92Var != null) {
                u92Var.f();
            }
            xhaVar = this.c;
            if (xhaVar == null) {
                xhaVar.setVisibility(this.w.size() <= 10 ? 8 : 0);
                return;
            }
            return;
        }
        chat = this.f;
        if (chat != null && ((!hc2.t0(chat) || z) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
            int i5 = this.N;
            this.N = i5 + 1;
            this.L = i5;
        }
        u92Var = this.a;
        if (u92Var != null) {
        }
        xhaVar = this.c;
        if (xhaVar == null) {
        }
    }

    public final void g0() {
        int hiddenChildCount;
        View W;
        try {
            if (this.b != null) {
                int w0 = bkb.w0(null, bkb.x6, false);
                int w02 = bkb.w0(null, bkb.m6, false);
                if (this.R && w0 == this.S && w02 == this.T) {
                    return;
                }
                this.R = true;
                this.S = w0;
                this.T = w02;
                int i = 0;
                while (i < 4) {
                    if (i == 0) {
                        hiddenChildCount = this.b.getChildCount();
                    } else {
                        o39 o39Var = this.b;
                        hiddenChildCount = i == 1 ? o39Var.getHiddenChildCount() : i == 2 ? o39Var.getCachedChildCount() : o39Var.getAttachedScrapChildCount();
                    }
                    for (int i2 = 0; i2 < hiddenChildCount; i2++) {
                        if (i == 0) {
                            W = this.b.getChildAt(i2);
                        } else {
                            o39 o39Var2 = this.b;
                            W = i == 1 ? o39Var2.W(i2) : i == 2 ? o39Var2.P(i2) : o39Var2.O(i2);
                        }
                        if (W instanceof gh6) {
                            gh6 gh6Var = (gh6) W;
                            gh6Var.P = true;
                            gh6Var.I = w0;
                            gh6Var.J = w02;
                            if (i != 0) {
                                ((gh6) W).d(0);
                            }
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        o92 o92Var = new o92(this, (byte) 0);
        arrayList.add(new blb(this.b, 0, new Class[]{gh6.class}, new String[]{"statusColor"}, (Drawable[]) null, o92Var, bkb.x6));
        arrayList.add(new blb(this.b, 0, new Class[]{gh6.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, o92Var, bkb.m6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().b(this, kk7.S);
        getNotificationCenter().b(this, 2);
        getNotificationCenter().b(this, kk7.x1);
        d0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.S);
        getNotificationCenter().n(this, 2);
        getNotificationCenter().n(this, kk7.x1);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onResume() {
        super.onResume();
        u92 u92Var = this.a;
        if (u92Var != null) {
            u92Var.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
