package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xr0 extends org.telegram.ui.ActionBar.d2 {
    public final long a;
    public org.telegram.ui.Cells.s7 b;
    public org.telegram.ui.Components.m70 c;
    public org.telegram.ui.Components.l41 d;
    public org.telegram.ui.ActionBar.b5 e;
    public final boolean f;
    public final long h;
    public boolean n;
    public long r;
    public gn s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        this.w = true;
        this.a = j10;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j10));
        if (M0 != null && M0.linked_monoforum_id != 0) {
            chat = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z10 = M0 != null && M0.broadcast_messages_allowed;
        this.f = z10;
        long k10 = Utilities.k(z10 ? j11 : ((org.telegram.messenger.j0) getMessagesController().x7.b.b).c, getMessagesController().I6, 0L);
        this.h = k10;
        this.n = z10;
        this.r = k10;
    }

    public static /* synthetic */ void Z(xr0 xr0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            xr0Var.e.b(false);
            org.telegram.ui.Components.fc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        xr0Var.getMessagesController().S3(updates.chats, false);
        xr0Var.getMessagesController().O3(updates, false);
        if (xr0Var.isFinished || xr0Var.finishing) {
            return;
        }
        gn gnVar = xr0Var.s;
        if (gnVar != null) {
            gnVar.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        xr0Var.finishFragment();
    }

    public final void a0(boolean z10) {
        boolean c02;
        if (this.e == null || this.w == (c02 = c0())) {
            return;
        }
        this.w = c02;
        this.e.a(c02, z10);
    }

    public final String b0() {
        return org.telegram.messenger.bd.a0(null, null, 2131747081, ii.k.J0(getMessagesController().J6), String.valueOf(((int) (((this.r * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().c6)) / 100.0d));
    }

    public final boolean c0() {
        return (this.r == this.h && this.n == this.f) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.bd.M0(2131747104, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new hx(this, 28));
        this.e = this.simpleActionBar.n(org.telegram.messenger.bd.M0(2131745956, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context, this.resourceProvider);
        this.b = s7Var;
        int i3 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.r6.i(i3, s7Var, getResourceProvider());
        org.telegram.ui.Components.m70 m70Var = new org.telegram.ui.Components.m70(context, this, null, true, true);
        this.c = m70Var;
        m70Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), 0);
        org.telegram.ui.ActionBar.r6.i(i3, this.c, getResourceProvider());
        this.c.b(true);
        this.c.d(0, null, false);
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(context, this.currentAccount, this.classGuid, false, new c5(this, 16), new wr0(this, 2), null, this.resourceProvider);
        this.d = l41Var;
        l41Var.r1();
        frameLayout2.addView(this.d, b8.mf.e(-1, -1, 51));
        return this.fragmentView;
    }

    public final void d0() {
        if (this.e.y.f) {
            return;
        }
        if (!c0()) {
            finishFragment();
            return;
        }
        this.e.b(true);
        TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
        org.telegram.messenger.hp messagesController = getMessagesController();
        long j10 = this.a;
        updatepaidmessagesprice.channel = messagesController.h1(j10);
        boolean z10 = this.n;
        updatepaidmessagesprice.send_paid_messages_stars = z10 ? this.r : 0L;
        updatepaidmessagesprice.suggestions_allowed = z10;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new xy(21, this, updatepaidmessagesprice));
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j10));
        if (M0 != null) {
            if (this.n) {
                M0.flags2 |= 65536;
                M0.broadcast_messages_allowed = true;
            } else {
                M0.flags2 &= -65537;
                M0.broadcast_messages_allowed = false;
            }
            getMessagesController().Q3(M0, true);
            TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
            if (M02 != null) {
                if (this.n) {
                    M02.flags2 |= TLObject.FLAG_14;
                    M02.send_paid_messages_stars = this.r;
                } else {
                    M02.flags2 &= -16385;
                    M02.send_paid_messages_stars = 0L;
                }
                getMessagesController().Q3(M02, true);
            }
        }
        gn gnVar = this.s;
        if (gnVar != null) {
            gnVar.run(this.n ? this.r : -1L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final org.telegram.ui.Components.tj0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !c0();
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onBackPressed(boolean z10) {
        if (!c0()) {
            return super.onBackPressed(z10);
        }
        int i3 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = org.telegram.messenger.bd.M0(2131743845, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
            s1Var.S = M0;
            s1Var.U = org.telegram.messenger.bd.M0(2131748478, null);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131754216, null), new wr0(this, i3));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751407, null), new wr0(this, 1));
            showDialog(s1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.f41 f41Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.l41 l41Var = this.d;
        if (l41Var == null || (f41Var = l41Var.g3) == null) {
            return true;
        }
        f41Var.O(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
