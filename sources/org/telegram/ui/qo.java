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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class qo extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs {
    public mo E;
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
    public no a;
    public org.telegram.ui.Components.tj0 b;
    public org.telegram.ui.ActionBar.f5 c;
    public org.telegram.ui.Components.gy d;
    public po e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public org.telegram.ui.ActionBar.s1 r;
    public boolean s;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public static /* synthetic */ void Z(qo qoVar, org.telegram.ui.ActionBar.s1[] s1VarArr) {
        try {
            s1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        s1VarArr[0] = null;
        qoVar.h.linked_chat_id = 0L;
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(qoVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.hs.T, qoVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new co(qoVar, 2), 1000L);
        if (qoVar.s) {
            return;
        }
        qoVar.finishFragment();
    }

    public static /* synthetic */ void b0(qo qoVar, org.telegram.ui.ActionBar.s1[] s1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.d2 d2Var) {
        org.telegram.ui.ActionBar.s1 s1Var = s1VarArr[0];
        if (s1Var != null) {
            try {
                s1Var.dismiss();
            } catch (Throwable unused) {
            }
            s1VarArr[0] = null;
        }
        qoVar.h.linked_chat_id = chat.id;
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(qoVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.hs.T, qoVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new co(qoVar, 1), 1000L);
        if (d2Var == null) {
            qoVar.finishFragment();
        } else {
            qoVar.removeSelfFromStack();
            d2Var.finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.u6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.O = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131751390, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new o9(this, 7));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
        b10.N();
        b10.C0 = new lg.w1(this, 2);
        this.c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        this.e = new po(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.gy gyVar = new org.telegram.ui.Components.gy(context, null);
        this.d = gyVar;
        gyVar.b();
        this.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        org.telegram.ui.Components.tj0 tj0Var = new org.telegram.ui.Components.tj0(context, null);
        this.b = tj0Var;
        tj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new u4.b0(1, false));
        org.telegram.ui.Components.tj0 tj0Var2 = this.b;
        no noVar = new no(this, context);
        this.a = noVar;
        tj0Var2.setAdapter(noVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.bd.a0 ? 1 : 2);
        frameLayout.addView(this.b, b8.mf.c(-1.0f, -1));
        frameLayout.addView(this.d, b8.mf.c(-1.0f, -1));
        this.b.setOnItemClickListener(new h(this, 4));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, org.telegram.ui.ActionBar.d2 d2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.t3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.id, this, new mi.d4(29, this, d2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.s1[] s1VarArr = {d2Var == null ? new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.hp.i1(this.f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.hp.i1(chat);
        org.telegram.messenger.g0.i3(new eo(this, s1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new ai.q1(this, s1VarArr, chat, d2Var, 11), 64), 1), 500L);
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        mo moVar;
        TLRPC.Chat M0;
        TLRPC.Chat chat = null;
        if (i3 == org.telegram.messenger.hs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j10 = chatFull.id;
            if (j10 == this.F) {
                this.h = chatFull;
                e0();
                g0();
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
            f0(this.n, false);
            this.n = null;
            return;
        }
        if (i3 != org.telegram.messenger.hs.r) {
            if (i3 == org.telegram.messenger.hs.y1) {
                if ((-this.F) == ((Long) objArr[0]).longValue()) {
                    org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
                    if (q4Var == null || q4Var.getLastFragment() != this) {
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
        int i11 = org.telegram.messenger.hp.C8;
        if ((intValue & TLObject.FLAG_13) == 0 || this.f == null) {
            return;
        }
        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f.id));
        if (M02 != null) {
            this.f = M02;
        }
        if (this.w.size() > 0 && (M0 = getMessagesController().M0(Long.valueOf(((TLRPC.Chat) this.w.get(0)).id))) != null) {
            this.w.set(0, M0);
        }
        if (!this.s) {
            chat = this.f;
        } else if (this.w.size() > 0) {
            chat = (TLRPC.Chat) this.w.get(0);
        }
        if (chat == null || (moVar = this.E) == null) {
            return;
        }
        if (!this.Q) {
            moVar.setJoinRequest(chat.join_request);
        }
        if (this.P) {
            return;
        }
        this.E.setJoinToSend(chat.join_to_send);
    }

    public final void e0() {
        if (this.h.linked_chat_id != 0) {
            this.w.clear();
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.h.linked_chat_id));
            if (M0 != null) {
                this.w.add(M0);
            }
            org.telegram.ui.ActionBar.f5 f5Var = this.c;
            if (f5Var != null) {
                f5Var.setVisibility(8);
            }
        }
        if (!this.x && this.s && this.h.linked_chat_id == 0) {
            this.x = true;
            getConnectionsManager().sendRequest(new TLRPC.TL_channels_getGroupsForDiscussion(), new l(this, 3));
        }
    }

    public final void f0(TLRPC.Chat chat, boolean z10) {
        TLRPC.ChatFull N0 = getMessagesController().N0(chat.id);
        int i3 = 0;
        if (N0 == null) {
            if (z10) {
                getMessagesController().V2(0, chat.id, true);
                this.n = chat;
                this.r = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), null);
                org.telegram.messenger.g0.i3(new co(this, i3), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 48);
        String a02 = !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.bd.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751377, chat.title, this.f.title) : !org.telegram.messenger.t3.t0(this.f) ? org.telegram.messenger.bd.a0("DiscussionLinkGroupPrivateAlert", null, 2131751379, chat.title, this.f.title) : org.telegram.messenger.bd.a0("DiscussionLinkGroupPublicAlert", null, 2131751378, chat.title, this.f.title);
        if (N0.hidden_prehistory) {
            a02 = k2.p1.k(2131751380, null, t4.c.h(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.g0.X2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(getParentActivity());
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        frameLayout.addView(k9Var, b8.mf.d(40, 40.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((org.telegram.messenger.bd.a0 ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z11 = org.telegram.messenger.bd.a0;
        frameLayout.addView(textView2, b8.mf.d(-1, -2.0f, (z11 ? 5 : 3) | 48, z11 ? 21 : 76, 11.0f, z11 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, b8.mf.d(-2, -2.0f, (org.telegram.messenger.bd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        u8Var.q(chat);
        k9Var.e(chat, u8Var);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751381, null), new b7(this, N0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void g0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z10 = this.s;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.F));
        this.f = M0;
        if (M0 == null) {
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
            int i3 = this.N;
            this.H = i3;
            int size = this.w.size() + i3;
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
            if (chat != null && ((!org.telegram.messenger.t3.t0(chat) || z10) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                int i12 = this.N;
                this.N = i12 + 1;
                this.L = i12;
            }
        }
        no noVar = this.a;
        if (noVar != null) {
            noVar.f();
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.c;
        if (f5Var != null) {
            f5Var.setVisibility(this.w.size() <= 10 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        h6 h6Var = new h6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.n6));
        return arrayList;
    }

    public final void h0() {
        try {
            if (this.b == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
            if (this.R && x02 == this.S && x03 == this.T) {
                return;
            }
            this.R = true;
            this.S = x02;
            this.T = x03;
            int i3 = 0;
            while (i3 < 4) {
                int childCount = i3 == 0 ? this.b.getChildCount() : i3 == 1 ? this.b.getHiddenChildCount() : i3 == 2 ? this.b.getCachedChildCount() : this.b.getAttachedScrapChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i3 == 0 ? this.b.getChildAt(i10) : i3 == 1 ? this.b.V(i10) : i3 == 2 ? this.b.P(i10) : this.b.O(i10);
                    if (childAt instanceof org.telegram.ui.Cells.a5) {
                        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                        a5Var.P = true;
                        a5Var.I = x02;
                        a5Var.J = x03;
                        if (i3 != 0) {
                            ((org.telegram.ui.Cells.a5) childAt).d(0);
                        }
                    }
                }
                i3++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.hs.T);
        getNotificationCenter().c(this, org.telegram.messenger.hs.r);
        getNotificationCenter().c(this, org.telegram.messenger.hs.y1);
        e0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.hs.T);
        getNotificationCenter().n(this, org.telegram.messenger.hs.r);
        getNotificationCenter().n(this, org.telegram.messenger.hs.y1);
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onResume() {
        super.onResume();
        no noVar = this.a;
        if (noVar != null) {
            noVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            h0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
