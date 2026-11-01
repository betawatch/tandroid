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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qt0 extends org.telegram.ui.ActionBar.k2 {
    public final long a;
    public org.telegram.ui.Cells.x7 b;
    public org.telegram.ui.Components.j80 c;
    public org.telegram.ui.Components.v51 d;
    public org.telegram.ui.ActionBar.l5 e;
    public final boolean f;
    public final long h;
    public boolean n;
    public long r;
    public go s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qt0(long j10) {
        super(null);
        TLRPC.Chat chat = null;
        this.w = true;
        this.a = j10;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j10));
        if (L0 != null && L0.linked_monoforum_id != 0) {
            chat = getMessagesController().L0(Long.valueOf(L0.linked_monoforum_id));
        }
        long j11 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z10 = L0 != null && L0.broadcast_messages_allowed;
        this.f = z10;
        long k10 = Utilities.k(z10 ? j11 : ((org.telegram.messenger.l0) getMessagesController().y7.b.a).c, getMessagesController().J6, 0L);
        this.h = k10;
        this.n = z10;
        this.r = k10;
    }

    public static /* synthetic */ void Z(qt0 qt0Var, TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            qt0Var.e.b(false);
            org.telegram.ui.Components.cc.d0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        qt0Var.getMessagesController().P3(updates.chats, false);
        qt0Var.getMessagesController().L3(updates, false);
        if (qt0Var.isFinished || qt0Var.finishing) {
            return;
        }
        go goVar = qt0Var.s;
        if (goVar != null) {
            goVar.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        qt0Var.finishFragment();
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
        return org.telegram.messenger.dd.a0(null, null, 2131747088, xh.i.J0(getMessagesController().K6), String.valueOf(((int) (((this.r * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().d6)) / 100.0d));
    }

    public final boolean c0() {
        return (this.r == this.h && this.n == this.f) ? false : true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131747111, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s60(this, 18));
        this.e = this.simpleActionBar.n(org.telegram.messenger.dd.L0(2131745963, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.a7, frameLayout, null);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7(context, this.resourceProvider);
        this.b = x7Var;
        int i10 = org.telegram.ui.ActionBar.t6.d6;
        org.telegram.ui.ActionBar.a7.i(i10, x7Var, getResourceProvider());
        org.telegram.ui.Components.j80 j80Var = new org.telegram.ui.Components.j80(context, this, null, true, true);
        this.c = j80Var;
        j80Var.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), 0);
        org.telegram.ui.ActionBar.a7.i(i10, this.c, getResourceProvider());
        this.c.b(true);
        this.c.d(0, null, false);
        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(context, this.currentAccount, this.classGuid, false, new z4(this, 16), new pt0(this, 2), null, this.resourceProvider);
        this.d = v51Var;
        v51Var.r1();
        frameLayout2.addView(this.d, w7.b6.e(-1, -1, 51));
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
        org.telegram.messenger.wp messagesController = getMessagesController();
        long j10 = this.a;
        updatepaidmessagesprice.channel = messagesController.g1(j10);
        boolean z10 = this.n;
        updatepaidmessagesprice.send_paid_messages_stars = z10 ? this.r : 0L;
        updatepaidmessagesprice.suggestions_allowed = z10;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new sl0(2, this, updatepaidmessagesprice));
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j10));
        if (L0 != null) {
            if (this.n) {
                L0.flags2 |= 65536;
                L0.broadcast_messages_allowed = true;
            } else {
                L0.flags2 &= -65537;
                L0.broadcast_messages_allowed = false;
            }
            getMessagesController().N3(L0, true);
            TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(L0.linked_monoforum_id));
            if (L02 != null) {
                if (this.n) {
                    L02.flags2 |= TLObject.FLAG_14;
                    L02.send_paid_messages_stars = this.r;
                } else {
                    L02.flags2 &= -16385;
                    L02.send_paid_messages_stars = 0L;
                }
                getMessagesController().N3(L02, true);
            }
        }
        go goVar = this.s;
        if (goVar != null) {
            goVar.run(this.n ? this.r : -1L);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !c0();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        if (!c0()) {
            return super.onBackPressed(z10);
        }
        int i10 = 0;
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String L0 = org.telegram.messenger.dd.L0(2131743860, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
            x1Var.R = L0;
            x1Var.T = org.telegram.messenger.dd.L0(2131748485, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754216, null), new pt0(this, i10));
            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131751407, null), new pt0(this, 1));
            showDialog(x1Var);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        org.telegram.ui.Components.q51 q51Var;
        super.onFragmentCreate();
        org.telegram.ui.Components.v51 v51Var = this.d;
        if (v51Var == null || (q51Var = v51Var.f3) == null) {
            return true;
        }
        q51Var.O(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
