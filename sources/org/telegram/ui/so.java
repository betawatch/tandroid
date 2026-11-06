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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class so extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls {
    public oo D;
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
    public po a;
    public org.telegram.ui.Components.pj0 b;
    public org.telegram.ui.ActionBar.f5 c;
    public org.telegram.ui.Components.iy d;
    public ro e;
    public TLRPC.Chat f;
    public TLRPC.ChatFull h;
    public TLRPC.Chat n;
    public org.telegram.ui.ActionBar.u1 r;
    public boolean s;
    public ArrayList w;
    public boolean x;
    public boolean y;

    public static /* synthetic */ void Z(so soVar, org.telegram.ui.ActionBar.u1[] u1VarArr) {
        try {
            u1VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        u1VarArr[0] = null;
        soVar.h.linked_chat_id = 0L;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(soVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.qs.T, soVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new ho(soVar, 2), 1000L);
        if (soVar.s) {
            return;
        }
        soVar.finishFragment();
    }

    public static /* synthetic */ void b0(so soVar, org.telegram.ui.ActionBar.u1[] u1VarArr, TLRPC.Chat chat, org.telegram.ui.ActionBar.f2 f2Var) {
        org.telegram.ui.ActionBar.u1 u1Var = u1VarArr[0];
        if (u1Var != null) {
            try {
                u1Var.dismiss();
            } catch (Throwable unused) {
            }
            u1VarArr[0] = null;
        }
        soVar.h.linked_chat_id = chat.id;
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(soVar.currentAccount);
        Boolean bool = Boolean.FALSE;
        f10.k(org.telegram.messenger.qs.T, soVar.h, 0, bool, bool);
        org.telegram.messenger.g0.i3(new ho(soVar, 1), 1000L);
        if (f2Var == null) {
            soVar.finishFragment();
        } else {
            soVar.removeSelfFromStack();
            f2Var.finishFragment();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
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

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.N = false;
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131751390, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new w9(this, 6));
        org.telegram.ui.ActionBar.f5 b10 = this.simpleActionBar.o().b(0, R.drawable.outline_header_search);
        b10.N();
        b10.B0 = new kg.v1(this, 2);
        this.c = b10;
        b10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745837, null));
        this.e = new ro(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.iy iyVar = new org.telegram.ui.Components.iy(context, null);
        this.d = iyVar;
        iyVar.b();
        this.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.b = pj0Var;
        pj0Var.r1();
        this.b.setSectionsDrawBackground(true);
        this.b.setEmptyView(this.d);
        this.b.setLayoutManager(new v4.b0(1, false));
        org.telegram.ui.Components.pj0 pj0Var2 = this.b;
        po poVar = new po(this, context);
        this.a = poVar;
        pj0Var2.setAdapter(poVar);
        this.b.setVerticalScrollbarPosition(org.telegram.messenger.hd.a0 ? 1 : 2);
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        frameLayout.addView(this.d, c8.ha.c(-1.0f, -1));
        this.b.setOnItemClickListener(new h(this, 4));
        g0();
        return this.fragmentView;
    }

    public final void d0(TLRPC.Chat chat, org.telegram.ui.ActionBar.f2 f2Var) {
        if (chat == null) {
            return;
        }
        if (!org.telegram.messenger.t3.T(chat)) {
            getMessagesController().T(getParentActivity(), chat.id, this, new ni.c(19, this, f2Var), null);
            return;
        }
        org.telegram.ui.ActionBar.u1[] u1VarArr = {f2Var == null ? new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null) : null};
        TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
        tL_channels_setDiscussionGroup.broadcast = org.telegram.messenger.qp.i1(this.f);
        tL_channels_setDiscussionGroup.group = org.telegram.messenger.qp.i1(chat);
        org.telegram.messenger.g0.i3(new io(this, u1VarArr, getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new bi.g2(this, u1VarArr, chat, f2Var, 10), 64), 1), 500L);
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        oo ooVar;
        TLRPC.Chat M0;
        TLRPC.Chat chat = null;
        if (i7 == org.telegram.messenger.qs.T) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            long j3 = chatFull.id;
            if (j3 == this.E) {
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
        if (i7 != org.telegram.messenger.qs.r) {
            if (i7 == org.telegram.messenger.qs.y1) {
                if ((-this.E) == ((Long) objArr[0]).longValue()) {
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
        int i11 = org.telegram.messenger.qp.C8;
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
        if (chat == null || (ooVar = this.D) == null) {
            return;
        }
        if (!this.P) {
            ooVar.setJoinRequest(chat.join_request);
        }
        if (this.O) {
            return;
        }
        this.D.setJoinToSend(chat.join_to_send);
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

    public final void f0(TLRPC.Chat chat, boolean z9) {
        TLRPC.ChatFull N0 = getMessagesController().N0(chat.id);
        int i7 = 0;
        if (N0 == null) {
            if (z9) {
                getMessagesController().V2(0, chat.id, true);
                this.n = chat;
                this.r = new org.telegram.ui.ActionBar.u1(3, getParentActivity(), null);
                org.telegram.messenger.g0.i3(new ho(this, i7), 500L);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        TextView textView = new TextView(getParentActivity());
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, null);
        textView.setTextSize(1, 16.0f);
        textView.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 48);
        String a02 = !org.telegram.messenger.t3.t0(chat) ? org.telegram.messenger.hd.a0("DiscussionLinkGroupPublicPrivateAlert", null, 2131751377, chat.title, this.f.title) : !org.telegram.messenger.t3.t0(this.f) ? org.telegram.messenger.hd.a0("DiscussionLinkGroupPrivateAlert", null, 2131751379, chat.title, this.f.title) : org.telegram.messenger.hd.a0("DiscussionLinkGroupPublicAlert", null, 2131751378, chat.title, this.f.title);
        if (N0.hidden_prehistory) {
            a02 = jg.g.l(2131751380, null, rf.b.j(a02, "\n\n"));
        }
        textView.setText(org.telegram.messenger.g0.X2(a02));
        FrameLayout frameLayout = new FrameLayout(getParentActivity());
        alertDialog$Builder.o(frameLayout);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.u(org.telegram.messenger.g0.L(12.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(getParentActivity());
        l9Var.setRoundRadius(org.telegram.messenger.g0.L(20.0f));
        frameLayout.addView(l9Var, c8.ha.d(40, 40.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 22.0f, 5.0f, 22.0f, 0.0f));
        TextView textView2 = new TextView(getParentActivity());
        org.telegram.messenger.k5.n(textView2, org.telegram.ui.ActionBar.k6.E8, null, 1, 20.0f);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setText(chat.title);
        boolean z10 = org.telegram.messenger.hd.a0;
        frameLayout.addView(textView2, c8.ha.d(-1, -2.0f, (z10 ? 5 : 3) | 48, z10 ? 21 : 76, 11.0f, z10 ? 76 : 21, 0.0f));
        frameLayout.addView(textView, c8.ha.d(-2, -2.0f, (org.telegram.messenger.hd.a0 ? 5 : 3) | 48, 24.0f, 57.0f, 24.0f, 9.0f));
        w8Var.q(chat);
        l9Var.e(chat, w8Var);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751381, null), new a7(this, N0, chat, 9));
        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
        showDialog(alertDialog$Builder.a);
    }

    public final void g0() {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        boolean z9 = this.s;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.E));
        this.f = M0;
        if (M0 == null) {
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
        if (z9) {
            if (this.h.linked_chat_id == 0) {
                this.M = 2;
                this.F = 1;
            }
            int i7 = this.M;
            this.G = i7;
            int size = this.w.size() + i7;
            this.M = size;
            this.H = size;
            if (this.h.linked_chat_id != 0) {
                this.M = size + 1;
                this.F = size;
            }
        } else {
            this.G = 1;
            int size2 = this.w.size();
            int i10 = 1 + size2;
            this.H = i10;
            this.M = size2 + 2;
            this.F = i10;
        }
        int i11 = this.M;
        this.M = i11 + 1;
        this.J = i11;
        if (!z9 || (this.w.size() > 0 && this.h.linked_chat_id != 0)) {
            TLRPC.Chat chat = z9 ? (TLRPC.Chat) this.w.get(0) : this.f;
            if (chat != null && ((!org.telegram.messenger.t3.t0(chat) || z9) && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.ban_users)))) {
                int i12 = this.M;
                this.M = i12 + 1;
                this.K = i12;
            }
        }
        po poVar = this.a;
        if (poVar != null) {
            poVar.f();
        }
        org.telegram.ui.ActionBar.f5 f5Var = this.c;
        if (f5Var != null) {
            f5Var.setVisibility(this.w.size() <= 10 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(2, this);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.y6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.k6.n6));
        return arrayList;
    }

    public final void h0() {
        try {
            if (this.b == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.y6, false);
            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.n6, false);
            if (this.Q && x02 == this.R && x03 == this.S) {
                return;
            }
            this.Q = true;
            this.R = x02;
            this.S = x03;
            int i7 = 0;
            while (i7 < 4) {
                int childCount = i7 == 0 ? this.b.getChildCount() : i7 == 1 ? this.b.getHiddenChildCount() : i7 == 2 ? this.b.getCachedChildCount() : this.b.getAttachedScrapChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i7 == 0 ? this.b.getChildAt(i10) : i7 == 1 ? this.b.V(i10) : i7 == 2 ? this.b.P(i10) : this.b.O(i10);
                    if (childAt instanceof org.telegram.ui.Cells.a5) {
                        org.telegram.ui.Cells.a5 a5Var = (org.telegram.ui.Cells.a5) childAt;
                        a5Var.O = true;
                        a5Var.H = x02;
                        a5Var.I = x03;
                        if (i7 != 0) {
                            ((org.telegram.ui.Cells.a5) childAt).d(0);
                        }
                    }
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().c(this, org.telegram.messenger.qs.T);
        getNotificationCenter().c(this, org.telegram.messenger.qs.r);
        getNotificationCenter().c(this, org.telegram.messenger.qs.y1);
        e0();
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, org.telegram.messenger.qs.T);
        getNotificationCenter().n(this, org.telegram.messenger.qs.r);
        getNotificationCenter().n(this, org.telegram.messenger.qs.y1);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        po poVar = this.a;
        if (poVar != null) {
            poVar.f();
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            h0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
