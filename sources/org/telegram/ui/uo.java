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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class uo extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs {
    public qo E;
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
    public ro a;
    public org.telegram.ui.Components.ek0 b;
    public org.telegram.ui.ActionBar.g5 c;
    public org.telegram.ui.Components.sy d;
    public to e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public org.telegram.ui.ActionBar.t1 r;
    public boolean s;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public static /* synthetic */ void Z(uo uoVar, org.telegram.ui.ActionBar.t1[] t1VarArr) {
        try {
            t1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        t1VarArr[0] = null;
        uoVar.h.linked_chat_id = 0L;
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(uoVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.ks.T, uoVar.h, 0, bool, bool);
        org.telegram.messenger.g0.h3(new jo(uoVar, 2), 1000L);
        if (uoVar.s) {
            return;
        }
        uoVar.finishFragment();
    }

    public static /* synthetic */ void b0(uo uoVar, org.telegram.ui.ActionBar.t1[] t1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.g2 g2Var) {
        org.telegram.ui.ActionBar.t1 t1Var = t1VarArr[0];
        if (t1Var != null) {
            try {
                t1Var.dismiss();
            } catch (Throwable unused) {
            }
            t1VarArr[0] = null;
        }
        uoVar.h.linked_chat_id = chat.id;
        org.telegram.messenger.ks f10 = org.telegram.messenger.ks.f(uoVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.ks.T, uoVar.h, 0, bool, bool);
        org.telegram.messenger.g0.h3(new jo(uoVar, 1), 1000L);
        if (g2Var == null) {
            uoVar.finishFragment();
        } else {
            uoVar.removeSelfFromStack();
            g2Var.finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131751377, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new y7(this, 9));
        org.telegram.ui.ActionBar.g5 b10 = this.simpleActionBar.t().b(0, R.drawable.outline_header_search);
        b10.O();
        b10.C0 = new bi.x1(this, 3);
        this.c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        this.e = new to(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.sy syVar = new org.telegram.ui.Components.sy(context, null);
        this.d = syVar;
        syVar.b();
        this.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.b = ek0Var;
        ek0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new v4.c0(1, false));
        org.telegram.ui.Components.ek0 ek0Var2 = this.b;
        ro roVar = new ro(this, context);
        this.a = roVar;
        ek0Var2.setAdapter(roVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.gd.a0 ? 1 : 2);
        frameLayout.addView(this.b, c8.na.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.na.c(-1.0f, -1));
        this.b.setOnItemClickListener(new h(this, 4));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, org.telegram.ui.ActionBar.g2 g2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.v3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.id, this, new oi.f0(21, this, g2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.t1[] t1VarArr = {g2Var == null ? new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.mp.k1(this.f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.mp.k1(chat);
        org.telegram.messenger.g0.h3(new ko(this, t1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.m2(this, t1VarArr, chat, g2Var, 11), 64), 1), 500L);
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        qo qoVar;
        TLRPC.Chat O0;
        TLRPC.Chat chat = null;
        if (i7 == org.telegram.messenger.ks.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.id;
            if (j3 == this.F) {
                this.h = chatFull;
                e0();
                g0();
                return;
            }
            TLRPC.Chat chat2 = this.n;
            if (chat2 == null || chat2.id != j3) {
                return;
            }
            try {
                this.r.dismiss();
            } catch (Throwable unused) {
            }
            this.r = null;
            f0(this.n, false);
            this.n = null;
            return;
        }
        if (i7 != org.telegram.messenger.ks.r) {
            if (i7 == org.telegram.messenger.ks.y1) {
                if ((-this.F) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
                    if (r4Var == null || r4Var.getLastFragment() != this) {
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
        int i11 = org.telegram.messenger.mp.I8;
        if ((intValue & TLObject.FLAG_13) == 0 || this.f == null) {
            return;
        }
        TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(this.f.id));
        if (O02 != null) {
            this.f = O02;
        }
        if (this.w.size() > 0 && (O0 = getMessagesController().O0(Long.valueOf(((TLRPC.Chat) this.w.get(0)).id))) != null) {
            this.w.set(0, O0);
        }
        if (!this.s) {
            chat = this.f;
        } else if (this.w.size() > 0) {
            chat = (TLRPC.Chat) this.w.get(0);
        }
        if (chat == null || (qoVar = this.E) == null) {
            return;
        }
        if (!this.Q) {
            qoVar.setJoinRequest(chat.join_request);
        }
        if (this.P) {
            return;
        }
        this.E.setJoinToSend(chat.join_to_send);
    }

    public final void e0() {
        if (this.h.linked_chat_id != 0) {
            this.w.clear();
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.h.linked_chat_id));
            if (O0 != null) {
                this.w.add(O0);
            }
            org.telegram.ui.ActionBar.g5 g5Var = this.c;
            if (g5Var != null) {
                g5Var.setVisibility(8);
            }
        }
        if (!this.x && this.s && this.h.linked_chat_id == 0) {
            this.x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new l(this, 3));
        }
    }

    public final void f0(TLRPC.Chat chat, boolean z10) {
        TLRPC.ChatFull P0 = getMessagesController().P0(chat.id);
        int i7 = 0;
        if (P0 == null) {
            if (z10) {
                getMessagesController().b3(0, chat.id, true);
                this.n = chat;
                this.r = new org.telegram.ui.ActionBar.t1(3, getParentActivity(), null);
                org.telegram.messenger.g0.h3(new jo(this, i7), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 48);
        String a02 = !org.telegram.messenger.v3.t0(chat) ? org.telegram.messenger.gd.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751364, chat.title, this.f.title) : !org.telegram.messenger.v3.t0(this.f) ? org.telegram.messenger.gd.a0("DiscussionLinkGroupPrivateAlert", null, 2131751366, chat.title, this.f.title) : org.telegram.messenger.gd.a0("DiscussionLinkGroupPublicAlert", null, 2131751365, chat.title, this.f.title);
        if (P0.hidden_prehistory) {
            a02 = i5.c.k(2131751367, null, p5.c.n(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.g0.W2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(getParentActivity());
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        frameLayout.addView(p9Var, c8.na.d(40, 40.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.f3.l(textView2, org.telegram.ui.ActionBar.n6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = org.telegram.messenger.gd.a0;
        frameLayout.addView(textView2, c8.na.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, c8.na.d(-2, -2.0f, (org.telegram.messenger.gd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        a9Var.q(chat);
        p9Var.f(chat, a9Var);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751368, null), new a7(this, P0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void g0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.s;
        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(this.F));
        this.f = O0;
        if (O0 == null) {
            return;
        }
        this.G = -1;
        this.H = -1;
        this.I = -1;
        this.J = -1;
        this.K = -1;
        this.L = -1;
        this.M = -1;
        this.N = 1;
        if (z10) {
            if (this.h.linked_chat_id == 0) {
                this.N = 2;
                this.G = 1;
            }
            int i7 = this.N;
            this.H = i7;
            int size = this.w.size() + i7;
            this.N = size;
            this.I = size;
            if (this.h.linked_chat_id != 0) {
                this.N = size + 1;
                this.G = size;
            }
        } else {
            this.H = 1;
            int size2 = this.w.size();
            int i10 = 1 + size2;
            this.I = i10;
            this.N = size2 + 2;
            this.G = i10;
        }
        int i11 = this.N;
        this.N = i11 + 1;
        this.K = i11;
        if (!z10 || (this.w.size() > 0 && this.h.linked_chat_id != 0)) {
            TLRPC.Chat chat = z10 ? (TLRPC.Chat) this.w.get(0) : this.f;
            if (chat != null && ((!org.telegram.messenger.v3.t0(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                int i12 = this.N;
                this.N = i12 + 1;
                this.L = i12;
            }
        }
        ro roVar = this.a;
        if (roVar != null) {
            roVar.f();
        }
        org.telegram.ui.ActionBar.g5 g5Var = this.c;
        if (g5Var != null) {
            g5Var.setVisibility(this.w.size() <= 10 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.n6.n6));
        return arrayList;
    }

    public final void h0() {
        try {
            if (this.b == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.n6, false);
            if (this.R && x02 == this.S && x03 == this.T) {
                return;
            }
            this.R = true;
            this.S = x02;
            this.T = x03;
            int i7 = 0;
            while (i7 < 4) {
                int childCount = i7 == 0 ? this.b.getChildCount() : i7 == 1 ? this.b.getHiddenChildCount() : i7 == 2 ? this.b.getCachedChildCount() : this.b.getAttachedScrapChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i7 == 0 ? this.b.getChildAt(i10) : i7 == 1 ? this.b.V(i10) : i7 == 2 ? this.b.P(i10) : this.b.O(i10);
                    if (childAt instanceof org.telegram.ui.Cells.b5) {
                        org.telegram.ui.Cells.b5 b5Var = (org.telegram.ui.Cells.b5) childAt;
                        b5Var.P = true;
                        b5Var.I = x02;
                        b5Var.J = x03;
                        if (i7 != 0) {
                            ((org.telegram.ui.Cells.b5) childAt).d(0);
                        }
                    }
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.ks.T);
        getNotificationCenter().c(this, org.telegram.messenger.ks.r);
        getNotificationCenter().c(this, org.telegram.messenger.ks.y1);
        e0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.ks.T);
        getNotificationCenter().n(this, org.telegram.messenger.ks.r);
        getNotificationCenter().n(this, org.telegram.messenger.ks.y1);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        ro roVar = this.a;
        if (roVar != null) {
            roVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            h0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
