package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qp extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us {
    public mp D;
    public long E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public int S;
    public np a;
    public org.telegram.ui.Components.tk0 b;
    public org.telegram.ui.ActionBar.p5 c;
    public org.telegram.ui.Components.xy d;
    public pp e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public org.telegram.ui.ActionBar.x1 r;
    public boolean s;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public static /* synthetic */ void Y(qp qpVar, org.telegram.ui.ActionBar.x1[] x1VarArr) {
        try {
            x1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        x1VarArr[0] = null;
        qpVar.h.linked_chat_id = 0L;
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(qpVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f7.k(org.telegram.messenger.zs.T, qpVar.h, 0, bool, bool);
        org.telegram.messenger.i0.h3(new dp(qpVar, 2), 1000L);
        if (qpVar.s) {
            return;
        }
        qpVar.finishFragment();
    }

    public static /* synthetic */ void a0(qp qpVar, org.telegram.ui.ActionBar.x1[] x1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.k2 k2Var) {
        org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
        if (x1Var != null) {
            try {
                x1Var.dismiss();
            } catch (Throwable unused) {
            }
            x1VarArr[0] = null;
        }
        qpVar.h.linked_chat_id = chat.id;
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(qpVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f7.k(org.telegram.messenger.zs.T, qpVar.h, 0, bool, bool);
        org.telegram.messenger.i0.h3(new dp(qpVar, 1), 1000L);
        if (k2Var == null) {
            qpVar.finishFragment();
        } else {
            qpVar.removeSelfFromStack();
            k2Var.finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    public final void c0(TLRPC.Chat chat, org.telegram.ui.ActionBar.k2 k2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.w3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.id, this, new ng.d(19, this, k2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.x1[] x1VarArr = {k2Var == null ? new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.vp.h1(this.f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.vp.h1(chat);
        org.telegram.messenger.i0.h3(new ep(this, x1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new mb(this, x1VarArr, chat, k2Var, 1), 64), 1), 500L);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.N = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131751390, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new ag.e(this, 27));
        org.telegram.ui.ActionBar.p5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
        b10.N();
        b10.B0 = new ag.l3(this, 2);
        this.c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745853, null));
        this.e = new pp(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.xy xyVar = new org.telegram.ui.Components.xy(context, null);
        this.d = xyVar;
        xyVar.b();
        this.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.b = tk0Var;
        tk0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new s4.a0(1, false));
        org.telegram.ui.Components.tk0 tk0Var2 = this.b;
        np npVar = new np(this, context);
        this.a = npVar;
        tk0Var2.setAdapter(npVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.cd.X ? 1 : 2);
        frameLayout.addView(this.b, w7.b6.c(-1.0f, -1));
        frameLayout.addView(this.d, w7.b6.c(-1.0f, -1));
        this.b.setOnItemClickListener(new g(this, 4));
        f0();
        return this.fragmentView;
    }

    public final void d0() {
        if (this.h.linked_chat_id != 0) {
            this.w.clear();
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.h.linked_chat_id));
            if (L0 != null) {
                this.w.add(L0);
            }
            org.telegram.ui.ActionBar.p5 p5Var = this.c;
            if (p5Var != null) {
                p5Var.setVisibility(8);
            }
        }
        if (!this.x && this.s && this.h.linked_chat_id == 0) {
            this.x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new k(this, 3));
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        mp mpVar;
        TLRPC.Chat L0;
        TLRPC.Chat chat = null;
        if (i10 == org.telegram.messenger.zs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.id;
            if (j10 == this.E) {
                this.h = chatFull;
                d0();
                f0();
                return;
            }
            TLRPC.Chat chat2 = this.n;
            if (chat2 == null || chat2.id != j10) {
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
        if (i10 != org.telegram.messenger.zs.r) {
            if (i10 == org.telegram.messenger.zs.y1) {
                if ((-this.E) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
                    if (z4Var == null || z4Var.getLastFragment() != this) {
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
        int i12 = org.telegram.messenger.vp.D8;
        if ((intValue & TLObject.FLAG_13) == 0 || this.f == null) {
            return;
        }
        TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.f.id));
        if (L02 != null) {
            this.f = L02;
        }
        if (this.w.size() > 0 && (L0 = getMessagesController().L0(Long.valueOf(((TLRPC.Chat) this.w.get(0)).id))) != null) {
            this.w.set(0, L0);
        }
        if (!this.s) {
            chat = this.f;
        } else if (this.w.size() > 0) {
            chat = (TLRPC.Chat) this.w.get(0);
        }
        if (chat == null || (mpVar = this.D) == null) {
            return;
        }
        if (!this.P) {
            mpVar.setJoinRequest(chat.join_request);
        }
        if (this.O) {
            return;
        }
        this.D.setJoinToSend(chat.join_to_send);
    }

    public final void e0(TLRPC.Chat chat, boolean z10) {
        TLRPC.ChatFull M0 = getMessagesController().M0(chat.id);
        int i10 = 0;
        if (M0 == null) {
            if (z10) {
                getMessagesController().T2(0, chat.id, true);
                this.n = chat;
                this.r = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), null);
                org.telegram.messenger.i0.h3(new dp(this, i10), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 48);
        String a02 = !org.telegram.messenger.w3.t0(chat) ? org.telegram.messenger.cd.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751377, chat.title, this.f.title) : !org.telegram.messenger.w3.t0(this.f) ? org.telegram.messenger.cd.a0("DiscussionLinkGroupPrivateAlert", null, 2131751379, chat.title, this.f.title) : org.telegram.messenger.cd.a0("DiscussionLinkGroupPublicAlert", null, 2131751378, chat.title, this.f.title);
        if (M0.hidden_prehistory) {
            a02 = a1.g.m(null, 2131751380, sc.e.i(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.i0.W2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        r8Var.u(org.telegram.messenger.i0.L(12.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(getParentActivity());
        g9Var.setRoundRadius(org.telegram.messenger.i0.L(20.0f));
        frameLayout.addView(g9Var, w7.b6.d(40, 40.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.m5.m(textView2, org.telegram.ui.ActionBar.t6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((org.telegram.messenger.cd.X ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = org.telegram.messenger.cd.X;
        frameLayout.addView(textView2, w7.b6.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        r8Var.q(chat);
        g9Var.e(chat, r8Var);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751381, null), new a7(this, M0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void f0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.s;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.E));
        this.f = L0;
        if (L0 == null) {
            return;
        }
        this.F = -1;
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = 1;
        if (z10) {
            if (this.h.linked_chat_id == 0) {
                this.M = 2;
                this.F = 1;
            }
            int i10 = this.M;
            this.G = i10;
            int size = this.w.size() + i10;
            this.M = size;
            this.H = size;
            if (this.h.linked_chat_id != 0) {
                this.M = size + 1;
                this.F = size;
            }
        } else {
            this.G = 1;
            int size2 = this.w.size();
            int i11 = 1 + size2;
            this.H = i11;
            this.M = size2 + 2;
            this.F = i11;
        }
        int i12 = this.M;
        this.M = i12 + 1;
        this.J = i12;
        if (!z10 || (this.w.size() > 0 && this.h.linked_chat_id != 0)) {
            TLRPC.Chat chat = z10 ? (TLRPC.Chat) this.w.get(0) : this.f;
            if (chat != null && ((!org.telegram.messenger.w3.t0(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                int i13 = this.M;
                this.M = i13 + 1;
                this.K = i13;
            }
        }
        np npVar = this.a;
        if (npVar != null) {
            npVar.f();
        }
        org.telegram.ui.ActionBar.p5 p5Var = this.c;
        if (p5Var != null) {
            p5Var.setVisibility(this.w.size() <= 10 ? 8 : 0);
        }
    }

    public final void g0() {
        try {
            if (this.b == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.n6, false);
            if (this.Q && x02 == this.R && x03 == this.S) {
                return;
            }
            this.Q = true;
            this.R = x02;
            this.S = x03;
            int i10 = 0;
            while (i10 < 4) {
                int childCount = i10 == 0 ? this.b.getChildCount() : i10 == 1 ? this.b.getHiddenChildCount() : i10 == 2 ? this.b.getCachedChildCount() : this.b.getAttachedScrapChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = i10 == 0 ? this.b.getChildAt(i11) : i10 == 1 ? this.b.V(i11) : i10 == 2 ? this.b.P(i11) : this.b.O(i11);
                    if (childAt instanceof org.telegram.ui.Cells.e5) {
                        org.telegram.ui.Cells.e5 e5Var = (org.telegram.ui.Cells.e5) childAt;
                        e5Var.O = true;
                        e5Var.H = x02;
                        e5Var.I = x03;
                        if (i10 != 0) {
                            ((org.telegram.ui.Cells.e5) childAt).d(0);
                        }
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.b, 0, new Class[]{org.telegram.ui.Cells.e5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.zs.T);
        getNotificationCenter().c(this, org.telegram.messenger.zs.r);
        getNotificationCenter().c(this, org.telegram.messenger.zs.y1);
        d0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.zs.T);
        getNotificationCenter().n(this, org.telegram.messenger.zs.r);
        getNotificationCenter().n(this, org.telegram.messenger.zs.y1);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        np npVar = this.a;
        if (npVar != null) {
            npVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            g0();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
