package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class sh0 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public int X;
    public Drawable Y;
    public Drawable Z;
    public rh0 a;
    public Drawable a0;
    public org.telegram.ui.Components.wl0 b;
    public boolean b0;
    public TLRPC.Chat c;
    public boolean c0;
    public TLRPC.ChatFull d;
    public boolean d0;
    public TLRPC.TL_chatInviteExported e;
    public boolean e0;
    public final long f;
    public final int f0;
    public boolean g0;
    public final boolean h;
    public org.telegram.ui.Components.bl0 h0;
    public final ArrayList i0;
    public final ArrayList j0;
    public final HashMap k0;
    public org.telegram.ui.Components.c70 l0;
    public final ArrayList m0;
    public final long n;
    public long n0;
    public boolean o0;
    public final boolean p0;
    public final hh0 q0;
    public int r;
    public boolean r0;
    public int s;
    public final ih0 s0;
    public final AnimationNotificationsLocker t0;
    public int v;
    public int w;
    public int x;
    public int y;

    public sh0(long j3, long j10, int i10) {
        super(null);
        this.i0 = new ArrayList();
        this.j0 = new ArrayList();
        this.k0 = new HashMap();
        this.m0 = new ArrayList();
        this.q0 = new hh0(this);
        boolean z10 = false;
        this.r0 = false;
        this.s0 = new ih0(this);
        this.t0 = new AnimationNotificationsLocker();
        this.n = j3;
        this.f0 = i10;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j3));
        this.c = chat;
        this.h = ChatObject.isChannel(chat) && !this.c.megagroup;
        if (j10 == 0) {
            this.f = getAccountInstance().getUserConfig().clientUserId;
        } else {
            this.f = j10;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f));
        if (this.f == getAccountInstance().getUserConfig().clientUserId || (user != null && !user.bot)) {
            z10 = true;
        }
        this.p0 = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0147, code lost:
    
        if ((r9.m0.size() + (r2.size() + r3.size())) >= 5) goto L78;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void U(sh0 sh0Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject, boolean z10) {
        boolean z11;
        boolean z12;
        long j3 = sh0Var.f;
        ArrayList arrayList = sh0Var.j0;
        ArrayList arrayList2 = sh0Var.i0;
        jh0 f02 = sh0Var.f0();
        sh0Var.W = false;
        sh0Var.b0 = false;
        if (tL_chatInviteExported != null) {
            sh0Var.e = tL_chatInviteExported;
            TLRPC.ChatFull chatFull = sh0Var.d;
            if (chatFull != null) {
                chatFull.exported_invite = tL_chatInviteExported;
            }
        }
        if (tL_error == null) {
            TLRPC.TL_messages_exportedChatInvites tL_messages_exportedChatInvites = (TLRPC.TL_messages_exportedChatInvites) tLObject;
            if (z10) {
                for (int i10 = 0; i10 < tL_messages_exportedChatInvites.invites.size(); i10++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i10);
                    sh0Var.c0(tL_chatInviteExported2);
                    arrayList.add(tL_chatInviteExported2);
                }
            } else {
                if (j3 != sh0Var.getAccountInstance().getUserConfig().clientUserId && arrayList2.size() == 0 && tL_messages_exportedChatInvites.invites.size() > 0) {
                    sh0Var.e = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(0);
                    tL_messages_exportedChatInvites.invites.remove(0);
                }
                for (int i11 = 0; i11 < tL_messages_exportedChatInvites.invites.size(); i11++) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = (TLRPC.TL_chatInviteExported) tL_messages_exportedChatInvites.invites.get(i11);
                    sh0Var.c0(tL_chatInviteExported3);
                    arrayList2.add(tL_chatInviteExported3);
                }
            }
            for (int i12 = 0; i12 < tL_messages_exportedChatInvites.users.size(); i12++) {
                sh0Var.k0.put(Long.valueOf(tL_messages_exportedChatInvites.users.get(i12).id), tL_messages_exportedChatInvites.users.get(i12));
            }
            int i13 = sh0Var.X;
            if (tL_messages_exportedChatInvites.invites.size() == 0) {
                sh0Var.b0 = false;
            } else if (z10) {
                sh0Var.b0 = arrayList.size() + 1 < tL_messages_exportedChatInvites.count;
            } else {
                sh0Var.b0 = arrayList2.size() + 1 < tL_messages_exportedChatInvites.count;
            }
            if (tL_messages_exportedChatInvites.invites.size() <= 0 || !sh0Var.g0) {
                z11 = true;
            } else {
                org.telegram.ui.Components.bl0 bl0Var = sh0Var.h0;
                if (bl0Var != null && !sh0Var.isPaused) {
                    bl0Var.b(i13 + 1);
                }
                z11 = false;
            }
            TLRPC.ChatFull chatFull2 = sh0Var.d;
            if (chatFull2 != null && !z10) {
                chatFull2.invitesCount = tL_messages_exportedChatInvites.count;
                sh0Var.getMessagesStorage().saveChatLinksCount(sh0Var.n, sh0Var.d.invitesCount);
            }
        } else {
            sh0Var.b0 = false;
            z11 = false;
        }
        if (sh0Var.b0 || sh0Var.r0 || j3 != sh0Var.getAccountInstance().getUserConfig().clientUserId) {
            if (sh0Var.b0 || sh0Var.r0) {
                z12 = false;
                if (sh0Var.b0) {
                }
                sh0Var.resumeDelayedFragmentAnimation();
                if (z12) {
                    sh0Var.d0(false);
                }
                if (!z11 && sh0Var.a != null && sh0Var.b.getChildCount() > 0) {
                    sh0Var.h0(f02);
                    return;
                }
                sh0Var.i0(true);
            }
            sh0Var.b0 = true;
            sh0Var.r0 = true;
        } else {
            sh0Var.b0 = true;
            sh0Var.d0 = true;
        }
        z12 = true;
        if (sh0Var.b0) {
        }
        sh0Var.resumeDelayedFragmentAnimation();
        if (z12) {
        }
        if (!z11) {
        }
        sh0Var.i0(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if ((r0.size() + (r8.j0.size() + r8.i0.size())) >= 5) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void V(sh0 sh0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        org.telegram.ui.Components.bl0 bl0Var;
        ArrayList arrayList = sh0Var.m0;
        sh0Var.W = false;
        if (tL_error == null) {
            TLRPC.TL_messages_chatAdminsWithInvites tL_messages_chatAdminsWithInvites = (TLRPC.TL_messages_chatAdminsWithInvites) tLObject;
            for (int i10 = 0; i10 < tL_messages_chatAdminsWithInvites.admins.size(); i10++) {
                TLRPC.TL_chatAdminWithInvites tL_chatAdminWithInvites = tL_messages_chatAdminsWithInvites.admins.get(i10);
                if (tL_chatAdminWithInvites.admin_id != sh0Var.getAccountInstance().getUserConfig().clientUserId) {
                    arrayList.add(tL_chatAdminWithInvites);
                }
            }
            for (int i11 = 0; i11 < tL_messages_chatAdminsWithInvites.users.size(); i11++) {
                TLRPC.User user = tL_messages_chatAdminsWithInvites.users.get(i11);
                sh0Var.k0.put(Long.valueOf(user.id), user);
            }
        }
        int i12 = sh0Var.X;
        sh0Var.e0 = true;
        sh0Var.b0 = false;
        if (arrayList.size() > 0 && (bl0Var = sh0Var.h0) != null && !sh0Var.isPaused && sh0Var.g0) {
            bl0Var.b(i12 + 1);
        }
        if (sh0Var.b0) {
        }
        sh0Var.resumeDelayedFragmentAnimation();
        if (!sh0Var.b0 && !sh0Var.r0) {
            sh0Var.b0 = true;
            sh0Var.r0 = true;
            sh0Var.d0(false);
        }
        sh0Var.i0(true);
    }

    public static void W(sh0 sh0Var) {
        if (sh0Var.f != sh0Var.getAccountInstance().getUserConfig().clientUserId) {
            sh0Var.e0(sh0Var.e);
            return;
        }
        TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
        tL_messages_exportChatInvite.peer = sh0Var.getMessagesController().getInputPeer(-sh0Var.n);
        tL_messages_exportChatInvite.legacy_revoke_permanent = true;
        TLRPC.TL_chatInviteExported tL_chatInviteExported = sh0Var.e;
        sh0Var.e = null;
        sh0Var.d.exported_invite = null;
        int sendRequest = sh0Var.getConnectionsManager().sendRequest(tL_messages_exportChatInvite, new ch0(sh0Var, tL_chatInviteExported, 0));
        AndroidUtilities.updateVisibleRows(sh0Var.b);
        sh0Var.getConnectionsManager().bindRequestToGuid(sendRequest, sh0Var.classGuid);
    }

    public final void b0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_deleteExportedChatInvite tL_messages_deleteExportedChatInvite = new TLRPC.TL_messages_deleteExportedChatInvite();
        tL_messages_deleteExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_deleteExportedChatInvite.peer = getMessagesController().getInputPeer(-this.n);
        getConnectionsManager().sendRequest(tL_messages_deleteExportedChatInvite, new ch0(this, tL_chatInviteExported, 1));
    }

    public final void c0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        if (tL_chatInviteExported.expire_date > 0) {
            tL_chatInviteExported.expired = getConnectionsManager().getCurrentTime() >= tL_chatInviteExported.expire_date;
            return;
        }
        int i10 = tL_chatInviteExported.usage_limit;
        if (i10 > 0) {
            tL_chatInviteExported.expired = tL_chatInviteExported.usage >= i10;
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.InviteLinks));
        this.actionBar.setActionBarMenuOnItemClick(new q70(this, 7));
        k0 k0Var = new k0(this, context, 14);
        this.fragmentView = k0Var;
        int i10 = org.telegram.ui.ActionBar.h6.a7;
        k0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(null, i10, false));
        this.fragmentView.setTag(Integer.valueOf(i10));
        FrameLayout frameLayout = (FrameLayout) this.fragmentView;
        org.telegram.ui.Components.wl0 wl0Var = new org.telegram.ui.Components.wl0(context, null);
        this.b = wl0Var;
        wl0Var.p1();
        this.actionBar.setAdaptiveBackground(this.b);
        gg.b0 b0Var = new gg.b0(1, false, 12);
        this.b.setLayoutManager(b0Var);
        org.telegram.ui.Components.wl0 wl0Var2 = this.b;
        rh0 rh0Var = new rh0(this, context);
        this.a = rh0Var;
        wl0Var2.setAdapter(rh0Var);
        this.b.setOnScrollListener(new ii.n3(6, this, b0Var));
        this.h0 = new org.telegram.ui.Components.bl0(this.b, false);
        s4.j jVar = new s4.j();
        jVar.n(420L);
        jVar.o(org.telegram.ui.Components.rr.h);
        jVar.C = false;
        jVar.m = false;
        this.b.setItemAnimator(jVar);
        this.b.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.b, w7.y5.c(-1.0f, -1));
        this.b.setOnItemClickListener(new ai.n6(19, this, context));
        this.b.setOnItemLongClickListener(new eh0(this));
        this.Y = context.getDrawable(R.drawable.msg_link_1);
        this.Z = context.getDrawable(R.drawable.msg_link_2);
        this.a0 = context.getDrawable(R.drawable.large_income);
        this.Y.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        i0(true);
        this.n0 = getConnectionsManager().getCurrentTime() - (System.currentTimeMillis() / 1000);
        return this.fragmentView;
    }

    public final void d0(boolean z10) {
        boolean z11 = this.d0;
        long j3 = this.n;
        if (!z11 || this.e0) {
            TLRPC.TL_messages_getExportedChatInvites tL_messages_getExportedChatInvites = new TLRPC.TL_messages_getExportedChatInvites();
            tL_messages_getExportedChatInvites.peer = getMessagesController().getInputPeer(-j3);
            long clientUserId = getUserConfig().getClientUserId();
            long j10 = this.f;
            if (j10 == clientUserId) {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(getUserConfig().getCurrentUser());
            } else {
                tL_messages_getExportedChatInvites.admin_id = getMessagesController().getInputUser(j10);
            }
            boolean z12 = this.r0;
            if (z12) {
                tL_messages_getExportedChatInvites.revoked = true;
                ArrayList arrayList = this.j0;
                if (!arrayList.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList)).date;
                }
            } else {
                ArrayList arrayList2 = this.i0;
                if (!arrayList2.isEmpty()) {
                    tL_messages_getExportedChatInvites.flags |= 4;
                    tL_messages_getExportedChatInvites.offset_link = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList2)).link;
                    tL_messages_getExportedChatInvites.offset_date = ((TLRPC.TL_chatInviteExported) hg.c.g(1, arrayList2)).date;
                }
            }
            this.W = true;
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getExportedChatInvites, new ci.v1(this, this.o0 ? null : this.e, z12, 6)), getClassGuid());
        } else {
            this.W = true;
            TLRPC.TL_messages_getAdminsWithInvites tL_messages_getAdminsWithInvites = new TLRPC.TL_messages_getAdminsWithInvites();
            tL_messages_getAdminsWithInvites.peer = getMessagesController().getInputPeer(-j3);
            getConnectionsManager().bindRequestToGuid(getConnectionsManager().sendRequest(tL_messages_getAdminsWithInvites, new bh0(this, 0)), getClassGuid());
        }
        if (z10) {
            i0(true);
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.dialogDeleted && ((Long) objArr[0]).longValue() == (-this.n)) {
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var == null || b5Var.getLastFragment() != this) {
                removeSelfFromStack();
            } else {
                finishFragment();
            }
        }
    }

    public final void e0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
        TLRPC.TL_messages_editExportedChatInvite tL_messages_editExportedChatInvite = new TLRPC.TL_messages_editExportedChatInvite();
        tL_messages_editExportedChatInvite.link = tL_chatInviteExported.link;
        tL_messages_editExportedChatInvite.revoked = true;
        tL_messages_editExportedChatInvite.peer = getMessagesController().getInputPeer(-this.n);
        getConnectionsManager().sendRequest(tL_messages_editExportedChatInvite, new ch0(this, tL_chatInviteExported, 2));
    }

    public final jh0 f0() {
        jh0 jh0Var = new jh0(this);
        jh0Var.f(jh0Var.i);
        jh0Var.c = this.y;
        jh0Var.d = this.E;
        jh0Var.e = this.H;
        jh0Var.f = this.I;
        jh0Var.g = this.U;
        jh0Var.h = this.V;
        jh0Var.b = this.X;
        jh0Var.k.clear();
        jh0Var.k.addAll(this.i0);
        jh0Var.l.clear();
        jh0Var.l.addAll(this.j0);
        return jh0Var;
    }

    public final void g0(TLRPC.ChatFull chatFull, TLRPC.ExportedChatInvite exportedChatInvite) {
        this.d = chatFull;
        this.e = (TLRPC.TL_chatInviteExported) exportedChatInvite;
        this.o0 = ChatObject.isPublic(this.c);
        d0(true);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 24);
        int i10 = org.telegram.ui.ActionBar.h6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 16, new Class[]{org.telegram.ui.Cells.m4.class, org.telegram.ui.Cells.g2.class, org.telegram.ui.Components.g90.class, ph0.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, org.telegram.ui.ActionBar.h6.a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.k0, null, null, org.telegram.ui.ActionBar.h6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32, new Class[]{org.telegram.ui.Cells.e9.class}, null, null, null, org.telegram.ui.ActionBar.h6.b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.e9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.B6));
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"nameTextView"}, null, null, -1, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.y6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusColor"}, null, null, -1, eVar, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"statusOnlineColor"}, null, null, -1, eVar, org.telegram.ui.ActionBar.h6.n6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.b5.class}, null, org.telegram.ui.ActionBar.h6.r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{lh0.class}, new String[]{"messageTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.g9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.V8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.u6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 262144, new Class[]{org.telegram.ui.Cells.y4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.v6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.o6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 32, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.g2.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.k7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{ph0.class}, new String[]{"titleView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 0, new Class[]{ph0.class}, new String[]{"subtitleView"}, null, null, -1, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.b, 8, new Class[]{ph0.class}, new String[]{"optionsView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Uh));
        return arrayList;
    }

    public final void h0(jh0 jh0Var) {
        if (this.isPaused || this.a == null || this.b == null) {
            i0(true);
            return;
        }
        i0(false);
        jh0Var.f(jh0Var.j);
        s4.o.c(jh0Var, true).b(this.a);
        AndroidUtilities.updateVisibleRows(this.b);
    }

    public final void i0(boolean z10) {
        rh0 rh0Var;
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(this.n));
        this.c = chat;
        if (chat == null) {
            return;
        }
        this.Q = -1;
        this.R = -1;
        this.y = -1;
        this.E = -1;
        this.F = -1;
        this.H = -1;
        this.I = -1;
        this.L = -1;
        this.J = -1;
        this.K = -1;
        this.N = -1;
        this.M = -1;
        this.O = -1;
        this.r = -1;
        this.x = -1;
        this.V = -1;
        this.U = -1;
        this.T = -1;
        this.S = -1;
        this.P = -1;
        this.w = -1;
        this.G = -1;
        this.X = 0;
        boolean z11 = this.f != getAccountInstance().getUserConfig().clientUserId;
        if (z11) {
            int i10 = this.X;
            this.Q = i10;
            this.X = i10 + 2;
            this.R = i10 + 1;
        } else {
            int i11 = this.X;
            this.X = i11 + 1;
            this.r = i11;
        }
        int i12 = this.X;
        this.s = i12;
        int i13 = i12 + 2;
        this.X = i13;
        this.v = i12 + 1;
        ArrayList arrayList = this.i0;
        if (!z11) {
            this.w = i13;
            this.X = i12 + 4;
            this.x = i12 + 3;
        } else if (!arrayList.isEmpty()) {
            int i14 = this.X;
            this.w = i14;
            this.X = i14 + 2;
            this.P = i14 + 1;
        }
        if (!arrayList.isEmpty()) {
            int i15 = this.X;
            this.y = i15;
            int size = arrayList.size() + i15;
            this.X = size;
            this.E = size;
        }
        if (!z11 && arrayList.isEmpty() && this.x >= 0 && (!this.W || this.d0 || this.r0)) {
            int i16 = this.X;
            this.X = i16 + 1;
            this.O = i16;
        }
        if (!z11) {
            ArrayList arrayList2 = this.m0;
            if (arrayList2.size() > 0) {
                if ((!arrayList.isEmpty() || this.x >= 0) && this.O == -1) {
                    int i17 = this.X;
                    this.X = i17 + 1;
                    this.T = i17;
                }
                int i18 = this.X;
                int i19 = i18 + 1;
                this.X = i19;
                this.S = i18;
                this.U = i19;
                int size2 = arrayList2.size() + i19;
                this.X = size2;
                this.V = size2;
            }
        }
        ArrayList arrayList3 = this.j0;
        if (!arrayList3.isEmpty()) {
            if (this.U >= 0) {
                int i20 = this.X;
                this.X = i20 + 1;
                this.J = i20;
            } else if ((!arrayList.isEmpty() || this.x >= 0) && this.O == -1) {
                int i21 = this.X;
                this.X = i21 + 1;
                this.J = i21;
            } else if (z11 && this.y == -1) {
                int i22 = this.X;
                this.X = i22 + 1;
                this.J = i22;
            }
            int i23 = this.X;
            int i24 = i23 + 1;
            this.X = i24;
            this.L = i23;
            this.H = i24;
            int size3 = arrayList3.size() + i24;
            this.I = size3;
            this.M = size3;
            this.X = size3 + 2;
            this.N = size3 + 1;
        }
        if (!this.d0 && !this.r0 && ((this.W || this.b0) && !z11)) {
            int i25 = this.X;
            this.X = i25 + 1;
            this.F = i25;
        }
        if (!arrayList.isEmpty()) {
            int i26 = this.E;
            int i27 = this.X;
            if (i26 == i27) {
                this.X = i27 + 1;
                this.G = i27;
                rh0Var = this.a;
                if (rh0Var == null && z10) {
                    rh0Var.l();
                    return;
                }
            }
        }
        if (!arrayList.isEmpty() || !arrayList3.isEmpty()) {
            int i28 = this.X;
            this.X = i28 + 1;
            this.K = i28;
        }
        rh0Var = this.a;
        if (rh0Var == null) {
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean needDelayOpenAnimation() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.dialogDeleted);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.dialogDeleted);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        rh0 rh0Var = this.a;
        if (rh0Var != null) {
            rh0Var.l();
        }
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        org.telegram.ui.Components.c70 c70Var;
        super.onTransitionAnimationEnd(z10, z11);
        if (z10) {
            this.g0 = true;
            if (z11 && (c70Var = this.l0) != null && c70Var.l0) {
                c70Var.show();
            }
        }
        this.t0.unlock();
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        this.t0.lock();
    }
}
