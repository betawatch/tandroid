// default package

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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wh8 extends d {
    public final long a;
    public jla b;
    public f56 c;
    public q7c d;
    public uja e;
    public final boolean f;
    public final long h;
    public boolean n;
    public long r;
    public u92 s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh8(long j) {
        super(null);
        TLRPC.Chat chat = null;
        this.w = true;
        this.a = j;
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j));
        if (L0 != null && L0.linked_monoforum_id != 0) {
            chat = getMessagesController().L0(Long.valueOf(L0.linked_monoforum_id));
        }
        long j2 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z = L0 != null && L0.broadcast_messages_allowed;
        this.f = z;
        long k = Utilities.k(z ? j2 : getMessagesController().l4.c.f(), getMessagesController().l4.H1.f(), 0L);
        this.h = k;
        this.n = z;
        this.r = k;
    }

    public final void Z(boolean z) {
        boolean b0;
        if (this.e == null || this.w == (b0 = b0())) {
            return;
        }
        this.w = b0;
        this.e.a(b0, z);
    }

    public final String a0() {
        return jb6.a0(null, null, 2131746808, bc.J0(getMessagesController().l4.I1.f()), String.valueOf(((int) (((this.r * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().l4.s3.i)) / 100.0d));
    }

    public final boolean b0() {
        return (this.r == this.h && this.n == this.f) ? false : true;
    }

    public final /* synthetic */ void c0(TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            this.e.b(false);
            c41.e0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        getMessagesController().X3(updates.chats, false);
        getMessagesController().T3(updates, false);
        if (this.isFinished || this.finishing) {
            return;
        }
        u92 u92Var = this.s;
        if (u92Var != null) {
            u92Var.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        finishFragment();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(jb6.M0(2131746829, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 25));
        this.e = this.simpleActionBar.s(jb6.M0(2131745680, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        anb.h(cmb.Z6, null, frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        jla jlaVar = new jla(context, this.resourceProvider);
        this.b = jlaVar;
        int i = cmb.c6;
        anb.h(i, getResourceProvider(), jlaVar);
        f56 f56Var = new f56(context, this, null, true, true);
        this.c = f56Var;
        f56Var.setPadding(gm.L(16.0f), gm.L(12.0f), gm.L(16.0f), 0);
        anb.h(i, getResourceProvider(), this.c);
        this.c.b(true);
        this.c.d(0, null, false);
        q7c q7cVar = new q7c(context, this.currentAccount, this.classGuid, false, new vh8(this, (byte) 0), new uh8(this, (byte) 2), null, this.resourceProvider);
        this.d = q7cVar;
        q7cVar.r1();
        frameLayout2.addView(this.d, qoe.e(-1, -1, 51));
        return this.fragmentView;
    }

    public final void d0() {
        if (this.e.y.f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        this.e.b(true);
        TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
        oc7 messagesController = getMessagesController();
        long j = this.a;
        updatepaidmessagesprice.channel = messagesController.g1(j);
        boolean z = this.n;
        updatepaidmessagesprice.send_paid_messages_stars = z ? this.r : 0L;
        updatepaidmessagesprice.suggestions_allowed = z;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new jl7(this, updatepaidmessagesprice, (byte) 8));
        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j));
        if (L0 != null) {
            boolean z2 = this.n;
            int i = L0.flags2;
            if (z2) {
                L0.flags2 = i | 65536;
                L0.broadcast_messages_allowed = true;
            } else {
                L0.flags2 = i & (-65537);
                L0.broadcast_messages_allowed = false;
            }
            getMessagesController().V3(L0, true);
            TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(L0.linked_monoforum_id));
            if (L02 != null) {
                boolean z3 = this.n;
                int i2 = L02.flags2;
                if (z3) {
                    L02.flags2 = i2 | TLObject.FLAG_14;
                    L02.send_paid_messages_stars = this.r;
                } else {
                    L02.flags2 = i2 & (-16385);
                    L02.send_paid_messages_stars = 0L;
                }
                getMessagesController().V3(L02, true);
            }
        }
        u92 u92Var = this.s;
        if (u92Var != null) {
            u92Var.run(this.n ? this.r : -1L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final r59 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !b0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (!b0()) {
            return super.onBackPressed(z);
        }
        byte b = 0;
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = jb6.M0(2131743522, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131748227, null);
            alertDialog$Builder.j(jb6.M0(2131754181, null), new uh8(this, b));
            alertDialog$Builder.g(jb6.M0(2131751343, null), new uh8(this, (byte) 1));
            showDialog(heVar);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        l7c l7cVar;
        super.onFragmentCreate();
        q7c q7cVar = this.d;
        if (q7cVar == null || (l7cVar = q7cVar.g3) == null) {
            return true;
        }
        l7cVar.O(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
