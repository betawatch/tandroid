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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class uf8 extends d {
    public final long a;
    public ija b;
    public f36 c;
    public q5c d;
    public sha e;
    public final boolean f;
    public final long h;
    public boolean n;
    public long r;
    public j82 s;
    public boolean w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf8(long j) {
        super(null);
        TLRPC.Chat chat = null;
        this.w = true;
        this.a = j;
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j));
        if (K0 != null && K0.linked_monoforum_id != 0) {
            chat = getMessagesController().K0(Long.valueOf(K0.linked_monoforum_id));
        }
        long j2 = chat != null ? chat.send_paid_messages_stars : 0L;
        boolean z = K0 != null && K0.broadcast_messages_allowed;
        this.f = z;
        long k = Utilities.k(z ? j2 : getMessagesController().k4.c.f(), getMessagesController().k4.H1.f(), 0L);
        this.h = k;
        this.n = z;
        this.r = k;
    }

    public final void Y(boolean z) {
        boolean a0;
        if (this.e == null || this.w == (a0 = a0())) {
            return;
        }
        this.w = a0;
        this.e.a(a0, z);
    }

    public final String Z() {
        return k96.a0(null, null, 2131746882, bc.I0(getMessagesController().k4.I1.f()), String.valueOf(((int) (((this.r * (r0 / 1000.0f)) / 1000.0d) * getMessagesController().k4.s3.i)) / 100.0d));
    }

    public final boolean a0() {
        return (this.r == this.h && this.n == this.f) ? false : true;
    }

    public final /* synthetic */ void b0(TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        if (tL_error != null) {
            this.e.b(false);
            u21.e0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        getMessagesController().V3(updates.chats, false);
        getMessagesController().R3(updates, false);
        if (this.isFinished || this.finishing) {
            return;
        }
        j82 j82Var = this.s;
        if (j82Var != null) {
            j82Var.run(updatepaidmessagesprice.suggestions_allowed ? updatepaidmessagesprice.send_paid_messages_stars : -1L);
        }
        finishFragment();
    }

    public final void c0() {
        if (this.e.y.f) {
            return;
        }
        if (!a0()) {
            finishFragment();
            return;
        }
        this.e.b(true);
        TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
        na7 messagesController = getMessagesController();
        long j = this.a;
        updatepaidmessagesprice.channel = messagesController.f1(j);
        boolean z = this.n;
        updatepaidmessagesprice.send_paid_messages_stars = z ? this.r : 0L;
        updatepaidmessagesprice.suggestions_allowed = z;
        getConnectionsManager().sendRequest(updatepaidmessagesprice, new hj7(this, updatepaidmessagesprice, (byte) 8));
        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(j));
        if (K0 != null) {
            boolean z2 = this.n;
            int i = K0.flags2;
            if (z2) {
                K0.flags2 = i | 65536;
                K0.broadcast_messages_allowed = true;
            } else {
                K0.flags2 = i & (-65537);
                K0.broadcast_messages_allowed = false;
            }
            getMessagesController().T3(K0, true);
            TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(K0.linked_monoforum_id));
            if (K02 != null) {
                boolean z3 = this.n;
                int i2 = K02.flags2;
                if (z3) {
                    K02.flags2 = i2 | TLObject.FLAG_14;
                    K02.send_paid_messages_stars = this.r;
                } else {
                    K02.flags2 = i2 & (-16385);
                    K02.send_paid_messages_stars = 0L;
                }
                getMessagesController().T3(K02, true);
            }
        }
        j82 j82Var = this.s;
        if (j82Var != null) {
            j82Var.run(this.n ? this.r : -1L);
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(k96.M0(2131746903, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 24));
        this.e = this.simpleActionBar.s(k96.M0(2131745754, null));
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        zkb.h(bkb.Z6, null, frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        ija ijaVar = new ija(context, this.resourceProvider);
        this.b = ijaVar;
        int i = bkb.c6;
        zkb.h(i, getResourceProvider(), ijaVar);
        f36 f36Var = new f36(context, this, null, true, true);
        this.c = f36Var;
        f36Var.setPadding(gl.L(16.0f), gl.L(12.0f), gl.L(16.0f), 0);
        zkb.h(i, getResourceProvider(), this.c);
        this.c.b(true);
        this.c.d(0, null, false);
        q5c q5cVar = new q5c(context, this.currentAccount, this.classGuid, false, new tf8(this, (byte) 0), new sf8(this, (byte) 2), null, this.resourceProvider);
        this.d = q5cVar;
        q5cVar.r1();
        frameLayout2.addView(this.d, nme.e(-1, -1, 51));
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !a0();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onBackPressed(boolean z) {
        if (!a0()) {
            return super.onBackPressed(z);
        }
        byte b = 0;
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            String M0 = k96.M0(2131743596, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131748278, null);
            alertDialog$Builder.j(k96.M0(2131754213, null), new sf8(this, b));
            alertDialog$Builder.g(k96.M0(2131751394, null), new sf8(this, (byte) 1));
            showDialog(hdVar);
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean onFragmentCreate() {
        l5c l5cVar;
        super.onFragmentCreate();
        q5c q5cVar = this.d;
        if (q5cVar == null || (l5cVar = q5cVar.g3) == null) {
            return true;
        }
        l5cVar.O(false);
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
