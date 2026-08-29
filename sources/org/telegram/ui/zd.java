package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class zd extends LinearLayout {
    public final int a;
    public final org.telegram.ui.Components.z71 b;
    public final yd c;
    public final long d;
    public final jd e;
    public String f;
    public final ArrayList h;
    public final ArrayList n;
    public String r;
    public final boolean[] s;
    public final /* synthetic */ de v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd(de deVar, Context context, int i10, long j10, int i11, jd jdVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.v = deVar;
        this.f = "";
        this.h = new ArrayList();
        this.n = new ArrayList();
        this.r = "";
        this.s = new boolean[]{false, false};
        this.a = i10;
        this.d = j10;
        this.e = jdVar;
        setOrientation(1);
        org.telegram.ui.Components.z71 z71Var = new org.telegram.ui.Components.z71(context, null);
        this.b = z71Var;
        yd ydVar = new yd(this, context, i10, j10, i11, c6Var);
        this.c = ydVar;
        z71Var.setAdapter(ydVar);
        View n10 = z71Var.n(3, true);
        View view = new View(context);
        view.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.d7, c6Var));
        addView(n10, i7.f6.n(-1, 48));
        addView(view, new LinearLayout.LayoutParams(i7.f6.z(-1.0f), i7.f6.z(1.0f / AndroidUtilities.density)));
        addView(z71Var, i7.f6.n(-1, -1));
        setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        c(1);
        c(0);
    }

    public final boolean a() {
        return (this.h.isEmpty() && this.n.isEmpty()) ? false : true;
    }

    public final boolean b(int i10) {
        boolean isEmpty;
        if (i10 == 1) {
            isEmpty = this.h.isEmpty();
        } else {
            if (i10 != 0) {
                return false;
            }
            isEmpty = this.n.isEmpty();
        }
        return !isEmpty;
    }

    public final void c(final int i10) {
        boolean[] zArr = this.s;
        if (zArr[i10]) {
            return;
        }
        final boolean a2 = a();
        final boolean b10 = b(i10);
        long j10 = this.d;
        de deVar = this.v;
        int i11 = this.a;
        if (i10 == 1) {
            if (this.f == null || !deVar.b1) {
                return;
            }
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions.offset = this.f;
            tL_payments_getStarsTransactions.limit = this.h.isEmpty() ? 5 : 20;
            final int i12 = 0;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.vd
                public final /* synthetic */ zd b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i13 = 1;
                            final zd zdVar = this.b;
                            final int i14 = i10;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    jd jdVar;
                                    jd jdVar2;
                                    switch (i13) {
                                        case 0:
                                            zd zdVar2 = zdVar;
                                            int i15 = zdVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i16 = i14;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i15).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i15).putChats(starsStatus.chats, false);
                                                zdVar2.n.addAll(starsStatus.history);
                                                zdVar2.r = starsStatus.next_offset;
                                                zdVar2.s[i16] = false;
                                                zdVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.tc.b0(tL_error2);
                                                }
                                            }
                                            if (zdVar2.a() != z10 && (jdVar = zdVar2.e) != null) {
                                                jdVar.run();
                                            }
                                            if (zdVar2.b(i16) != z11) {
                                                zdVar2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            zd zdVar3 = zdVar;
                                            int i17 = zdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z13) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                zdVar3.h.addAll(starsStatus2.history);
                                                zdVar3.f = starsStatus2.next_offset;
                                                zdVar3.s[i18] = false;
                                                zdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.tc.b0(tL_error3);
                                                }
                                            }
                                            if (zdVar3.a() != z10 && (jdVar2 = zdVar3.e) != null) {
                                                jdVar2.run();
                                            }
                                            if (zdVar3.b(i18) != z11) {
                                                zdVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final zd zdVar2 = this.b;
                            final int i16 = i10;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    jd jdVar;
                                    jd jdVar2;
                                    switch (i15) {
                                        case 0:
                                            zd zdVar22 = zdVar2;
                                            int i152 = zdVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                zdVar22.n.addAll(starsStatus.history);
                                                zdVar22.r = starsStatus.next_offset;
                                                zdVar22.s[i162] = false;
                                                zdVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.tc.b0(tL_error2);
                                                }
                                            }
                                            if (zdVar22.a() != z12 && (jdVar = zdVar22.e) != null) {
                                                jdVar.run();
                                            }
                                            if (zdVar22.b(i162) != z13) {
                                                zdVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            zd zdVar3 = zdVar2;
                                            int i17 = zdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                zdVar3.h.addAll(starsStatus2.history);
                                                zdVar3.f = starsStatus2.next_offset;
                                                zdVar3.s[i18] = false;
                                                zdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.tc.b0(tL_error3);
                                                }
                                            }
                                            if (zdVar3.a() != z12 && (jdVar2 = zdVar3.e) != null) {
                                                jdVar2.run();
                                            }
                                            if (zdVar3.b(i18) != z13) {
                                                zdVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 0 && this.r != null && deVar.c1) {
            zArr[i10] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = MessagesController.getInstance(i11).getInputPeer(j10);
            tL_payments_getStarsTransactions2.offset = this.r;
            tL_payments_getStarsTransactions2.limit = this.n.isEmpty() ? 5 : 20;
            final int i13 = 1;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.vd
                public final /* synthetic */ zd b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i13) {
                        case 0:
                            final int i132 = 1;
                            final zd zdVar = this.b;
                            final int i14 = i10;
                            final boolean z10 = a2;
                            final boolean z11 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    jd jdVar;
                                    jd jdVar2;
                                    switch (i132) {
                                        case 0:
                                            zd zdVar22 = zdVar;
                                            int i152 = zdVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i14;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                zdVar22.n.addAll(starsStatus.history);
                                                zdVar22.r = starsStatus.next_offset;
                                                zdVar22.s[i162] = false;
                                                zdVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.tc.b0(tL_error2);
                                                }
                                            }
                                            if (zdVar22.a() != z10 && (jdVar = zdVar22.e) != null) {
                                                jdVar.run();
                                            }
                                            if (zdVar22.b(i162) != z11) {
                                                zdVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            zd zdVar3 = zdVar;
                                            int i17 = zdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i14;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                zdVar3.h.addAll(starsStatus2.history);
                                                zdVar3.f = starsStatus2.next_offset;
                                                zdVar3.s[i18] = false;
                                                zdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.tc.b0(tL_error3);
                                                }
                                            }
                                            if (zdVar3.a() != z10 && (jdVar2 = zdVar3.e) != null) {
                                                jdVar2.run();
                                            }
                                            if (zdVar3.b(i18) != z11) {
                                                zdVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i15 = 0;
                            final zd zdVar2 = this.b;
                            final int i16 = i10;
                            final boolean z12 = a2;
                            final boolean z13 = b10;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.wd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    jd jdVar;
                                    jd jdVar2;
                                    switch (i15) {
                                        case 0:
                                            zd zdVar22 = zdVar2;
                                            int i152 = zdVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i162 = i16;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                MessagesController.getInstance(i152).putUsers(starsStatus.users, false);
                                                MessagesController.getInstance(i152).putChats(starsStatus.chats, false);
                                                zdVar22.n.addAll(starsStatus.history);
                                                zdVar22.r = starsStatus.next_offset;
                                                zdVar22.s[i162] = false;
                                                zdVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.tc.b0(tL_error2);
                                                }
                                            }
                                            if (zdVar22.a() != z12 && (jdVar = zdVar22.e) != null) {
                                                jdVar.run();
                                            }
                                            if (zdVar22.b(i162) != z13) {
                                                zdVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            zd zdVar3 = zdVar2;
                                            int i17 = zdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i18 = i16;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                MessagesController.getInstance(i17).putUsers(starsStatus2.users, false);
                                                MessagesController.getInstance(i17).putChats(starsStatus2.chats, false);
                                                zdVar3.h.addAll(starsStatus2.history);
                                                zdVar3.f = starsStatus2.next_offset;
                                                zdVar3.s[i18] = false;
                                                zdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.tc.b0(tL_error3);
                                                }
                                            }
                                            if (zdVar3.a() != z12 && (jdVar2 = zdVar3.e) != null) {
                                                jdVar2.run();
                                            }
                                            if (zdVar3.b(i18) != z13) {
                                                zdVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
        }
    }

    public final void d() {
        int i10 = 0;
        while (true) {
            org.telegram.ui.Components.z71 z71Var = this.b;
            if (i10 >= z71Var.getViewPages().length) {
                return;
            }
            View view = z71Var.getViewPages()[i10];
            if (view instanceof xd) {
                xd xdVar = (xd) view;
                org.telegram.ui.Components.u51 u51Var = xdVar.a;
                u51Var.U2.N(true);
                if (u51Var.canScrollVertically(1)) {
                    for (int i11 = 0; i11 < u51Var.getChildCount(); i11++) {
                        if (!(u51Var.getChildAt(i11) instanceof org.telegram.ui.Components.p00)) {
                        }
                    }
                }
                xdVar.e.run();
                break;
            }
            i10++;
        }
    }

    public final void e() {
        this.c.i();
        org.telegram.ui.Components.z71 z71Var = this.b;
        z71Var.o(false);
        View[] viewArr = z71Var.e;
        int[] iArr = z71Var.f;
        if (iArr[0] != z71Var.H.h(z71Var.b)) {
            z71Var.I(0);
            View view = viewArr[1];
            if (view != null) {
                z71Var.h.put(iArr[1], view);
                z71Var.removeView(viewArr[1]);
                viewArr[1] = null;
            }
            viewArr[0].setTranslationX(0.0f);
        }
    }

    public org.telegram.ui.Components.jl0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof xd) {
            return ((xd) currentView).a;
        }
        return null;
    }
}
