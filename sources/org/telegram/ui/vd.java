package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class vd extends LinearLayout {
    public static final /* synthetic */ int y = 0;
    public final int a;
    public final sd b;
    public final ud c;
    public final k0 d;
    public final long e;
    public final dd f;
    public String h;
    public final ArrayList n;
    public final ArrayList r;
    public String s;
    public final boolean[] w;
    public final /* synthetic */ zd x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(zd zdVar, Context context, int i7, long j3, int i10, dd ddVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.x = zdVar;
        this.h = "";
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.s = "";
        this.w = new boolean[]{false, false};
        this.a = i7;
        this.e = j3;
        this.f = ddVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        sd sdVar = new sd(this, context, f6Var, zdVar);
        this.b = sdVar;
        ud udVar = new ud(this, context, i7, j3, i10, f6Var);
        this.c = udVar;
        sdVar.setAdapter(udVar);
        org.telegram.ui.Components.u61 n10 = sdVar.n(-2, true);
        oi.q qVar = zdVar.d1;
        if (qVar != null) {
            qVar.c(sdVar);
        }
        k0 k0Var = new k0(5, context, this);
        this.d = k0Var;
        k0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        k0Var.addView(n10, c8.ha.e(-1, 48, 48));
        addView(sdVar, c8.ha.o(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        return (this.n.isEmpty() && this.r.isEmpty()) ? false : true;
    }

    public final boolean b(int i7) {
        boolean isEmpty;
        if (i7 == 1) {
            isEmpty = this.n.isEmpty();
        } else {
            if (i7 != 0) {
                return false;
            }
            isEmpty = this.r.isEmpty();
        }
        return !isEmpty;
    }

    public final void c(final int i7) {
        boolean[] zArr = this.w;
        if (zArr[i7]) {
            return;
        }
        final boolean a10 = a();
        final boolean b10 = b(i7);
        long j3 = this.e;
        zd zdVar = this.x;
        int i10 = this.a;
        if (i7 == 1) {
            if (this.h == null || !zdVar.b1) {
                return;
            }
            zArr[i7] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = org.telegram.messenger.qp.s1(i10).j1(j3);
            tL_payments_getStarsTransactions.offset = this.h;
            tL_payments_getStarsTransactions.limit = this.n.isEmpty() ? 5 : 20;
            final int i11 = 0;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.qd
                public final /* synthetic */ vd b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 1;
                            final vd vdVar = this.b;
                            final int i13 = i7;
                            final boolean z9 = a10;
                            final boolean z10 = b10;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.rd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dd ddVar;
                                    dd ddVar2;
                                    switch (i12) {
                                        case 0:
                                            vd vdVar2 = vdVar;
                                            int i14 = vdVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z11 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i15 = i13;
                                            if (z11) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.qp.s1(i14).Y3(starsStatus.users, false);
                                                org.telegram.messenger.qp.s1(i14).S3(starsStatus.chats, false);
                                                vdVar2.r.addAll(starsStatus.history);
                                                vdVar2.s = starsStatus.next_offset;
                                                vdVar2.w[i15] = false;
                                                vdVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.hc.d0(tL_error2);
                                                }
                                            }
                                            if (vdVar2.a() != z9 && (ddVar = vdVar2.f) != null) {
                                                ddVar.run();
                                            }
                                            if (vdVar2.b(i15) != z10) {
                                                vdVar2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            vd vdVar3 = vdVar;
                                            int i16 = vdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z12 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i13;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                org.telegram.messenger.qp.s1(i16).Y3(starsStatus2.users, false);
                                                org.telegram.messenger.qp.s1(i16).S3(starsStatus2.chats, false);
                                                vdVar3.n.addAll(starsStatus2.history);
                                                vdVar3.h = starsStatus2.next_offset;
                                                vdVar3.w[i17] = false;
                                                vdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.hc.d0(tL_error3);
                                                }
                                            }
                                            if (vdVar3.a() != z9 && (ddVar2 = vdVar3.f) != null) {
                                                ddVar2.run();
                                            }
                                            if (vdVar3.b(i17) != z10) {
                                                vdVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i14 = 0;
                            final vd vdVar2 = this.b;
                            final int i15 = i7;
                            final boolean z11 = a10;
                            final boolean z12 = b10;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.rd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dd ddVar;
                                    dd ddVar2;
                                    switch (i14) {
                                        case 0:
                                            vd vdVar22 = vdVar2;
                                            int i142 = vdVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i152 = i15;
                                            if (z112) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.qp.s1(i142).Y3(starsStatus.users, false);
                                                org.telegram.messenger.qp.s1(i142).S3(starsStatus.chats, false);
                                                vdVar22.r.addAll(starsStatus.history);
                                                vdVar22.s = starsStatus.next_offset;
                                                vdVar22.w[i152] = false;
                                                vdVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.hc.d0(tL_error2);
                                                }
                                            }
                                            if (vdVar22.a() != z11 && (ddVar = vdVar22.f) != null) {
                                                ddVar.run();
                                            }
                                            if (vdVar22.b(i152) != z12) {
                                                vdVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            vd vdVar3 = vdVar2;
                                            int i16 = vdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i15;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                org.telegram.messenger.qp.s1(i16).Y3(starsStatus2.users, false);
                                                org.telegram.messenger.qp.s1(i16).S3(starsStatus2.chats, false);
                                                vdVar3.n.addAll(starsStatus2.history);
                                                vdVar3.h = starsStatus2.next_offset;
                                                vdVar3.w[i17] = false;
                                                vdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.hc.d0(tL_error3);
                                                }
                                            }
                                            if (vdVar3.a() != z11 && (ddVar2 = vdVar3.f) != null) {
                                                ddVar2.run();
                                            }
                                            if (vdVar3.b(i17) != z12) {
                                                vdVar3.e();
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
        if (i7 == 0 && this.s != null && zdVar.c1) {
            zArr[i7] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = org.telegram.messenger.qp.s1(i10).j1(j3);
            tL_payments_getStarsTransactions2.offset = this.s;
            tL_payments_getStarsTransactions2.limit = this.r.isEmpty() ? 5 : 20;
            final int i12 = 1;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.qd
                public final /* synthetic */ vd b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i122 = 1;
                            final vd vdVar = this.b;
                            final int i13 = i7;
                            final boolean z9 = a10;
                            final boolean z10 = b10;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.rd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dd ddVar;
                                    dd ddVar2;
                                    switch (i122) {
                                        case 0:
                                            vd vdVar22 = vdVar;
                                            int i142 = vdVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i152 = i13;
                                            if (z112) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.qp.s1(i142).Y3(starsStatus.users, false);
                                                org.telegram.messenger.qp.s1(i142).S3(starsStatus.chats, false);
                                                vdVar22.r.addAll(starsStatus.history);
                                                vdVar22.s = starsStatus.next_offset;
                                                vdVar22.w[i152] = false;
                                                vdVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.hc.d0(tL_error2);
                                                }
                                            }
                                            if (vdVar22.a() != z9 && (ddVar = vdVar22.f) != null) {
                                                ddVar.run();
                                            }
                                            if (vdVar22.b(i152) != z10) {
                                                vdVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            vd vdVar3 = vdVar;
                                            int i16 = vdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i13;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                org.telegram.messenger.qp.s1(i16).Y3(starsStatus2.users, false);
                                                org.telegram.messenger.qp.s1(i16).S3(starsStatus2.chats, false);
                                                vdVar3.n.addAll(starsStatus2.history);
                                                vdVar3.h = starsStatus2.next_offset;
                                                vdVar3.w[i17] = false;
                                                vdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.hc.d0(tL_error3);
                                                }
                                            }
                                            if (vdVar3.a() != z9 && (ddVar2 = vdVar3.f) != null) {
                                                ddVar2.run();
                                            }
                                            if (vdVar3.b(i17) != z10) {
                                                vdVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i14 = 0;
                            final vd vdVar2 = this.b;
                            final int i15 = i7;
                            final boolean z11 = a10;
                            final boolean z12 = b10;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.rd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dd ddVar;
                                    dd ddVar2;
                                    switch (i14) {
                                        case 0:
                                            vd vdVar22 = vdVar2;
                                            int i142 = vdVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z112 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i152 = i15;
                                            if (z112) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.qp.s1(i142).Y3(starsStatus.users, false);
                                                org.telegram.messenger.qp.s1(i142).S3(starsStatus.chats, false);
                                                vdVar22.r.addAll(starsStatus.history);
                                                vdVar22.s = starsStatus.next_offset;
                                                vdVar22.w[i152] = false;
                                                vdVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.hc.d0(tL_error2);
                                                }
                                            }
                                            if (vdVar22.a() != z11 && (ddVar = vdVar22.f) != null) {
                                                ddVar.run();
                                            }
                                            if (vdVar22.b(i152) != z12) {
                                                vdVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            vd vdVar3 = vdVar2;
                                            int i16 = vdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z122 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i15;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                org.telegram.messenger.qp.s1(i16).Y3(starsStatus2.users, false);
                                                org.telegram.messenger.qp.s1(i16).S3(starsStatus2.chats, false);
                                                vdVar3.n.addAll(starsStatus2.history);
                                                vdVar3.h = starsStatus2.next_offset;
                                                vdVar3.w[i17] = false;
                                                vdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.hc.d0(tL_error3);
                                                }
                                            }
                                            if (vdVar3.a() != z11 && (ddVar2 = vdVar3.f) != null) {
                                                ddVar2.run();
                                            }
                                            if (vdVar3.b(i17) != z12) {
                                                vdVar3.e();
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
        int i7 = 0;
        while (true) {
            sd sdVar = this.b;
            if (i7 >= sdVar.getViewPages().length) {
                return;
            }
            View view = sdVar.getViewPages()[i7];
            if (view instanceof td) {
                td tdVar = (td) view;
                org.telegram.ui.Components.q41 q41Var = tdVar.a;
                q41Var.f3.O(true);
                if (q41Var.canScrollVertically(1)) {
                    for (int i10 = 0; i10 < q41Var.getChildCount(); i10++) {
                        if (!(q41Var.getChildAt(i10) instanceof org.telegram.ui.Components.lz)) {
                        }
                    }
                }
                tdVar.e.run();
                break;
            }
            i7++;
        }
    }

    public final void e() {
        ud udVar = this.c;
        ArrayList arrayList = udVar.e;
        ArrayList arrayList2 = udVar.e;
        int size = arrayList.size();
        sd sdVar = this.b;
        int h = size == 0 ? -1 : udVar.h(sdVar.getCurrentPosition());
        int i7 = 0;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            i7 |= 1 << udVar.h(i10);
        }
        udVar.i();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            int h7 = udVar.h(i13);
            i11 |= 1 << h7;
            if (h7 == h) {
                i12 = i13;
            }
        }
        if (i7 == i11) {
            return;
        }
        sdVar.onTouchEvent(null);
        sdVar.setPosition(i12);
        sdVar.J();
        sdVar.o(false);
        this.x.p();
    }

    public org.telegram.ui.Components.pj0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof td) {
            return ((td) currentView).a;
        }
        return null;
    }
}
