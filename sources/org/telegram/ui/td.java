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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class td extends LinearLayout {
    public static final /* synthetic */ int y = 0;
    public final int a;
    public final qd b;
    public final sd c;
    public final l0 d;
    public final long e;
    public final cd f;
    public String h;
    public final ArrayList n;
    public final ArrayList r;
    public String s;
    public final boolean[] w;
    public final /* synthetic */ xd x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td(xd xdVar, Context context, int i3, long j10, int i10, cd cdVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.x = xdVar;
        this.h = "";
        this.n = new ArrayList();
        this.r = new ArrayList();
        this.s = "";
        this.w = new boolean[]{false, false};
        this.a = i3;
        this.e = j10;
        this.f = cdVar;
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        qd qdVar = new qd(this, context, e6Var, xdVar);
        this.b = qdVar;
        sd sdVar = new sd(this, context, i3, j10, i10, e6Var);
        this.c = sdVar;
        qdVar.setAdapter(sdVar);
        org.telegram.ui.Components.m61 j11 = qdVar.j(-2, true);
        pi.q qVar = xdVar.e1;
        if (qVar != null) {
            qVar.c(qdVar);
        }
        l0 l0Var = new l0(5, context, this);
        this.d = l0Var;
        l0Var.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(4.0f));
        l0Var.addView(j11, b8.mf.e(-1, 48, 48));
        addView(qdVar, b8.mf.o(-1, -1));
        c(1);
        c(0);
    }

    public final boolean a() {
        return (this.n.isEmpty() && this.r.isEmpty()) ? false : true;
    }

    public final boolean b(int i3) {
        boolean isEmpty;
        if (i3 == 1) {
            isEmpty = this.n.isEmpty();
        } else {
            if (i3 != 0) {
                return false;
            }
            isEmpty = this.r.isEmpty();
        }
        return !isEmpty;
    }

    public final void c(final int i3) {
        boolean[] zArr = this.w;
        if (zArr[i3]) {
            return;
        }
        final boolean a10 = a();
        final boolean b10 = b(i3);
        long j10 = this.e;
        xd xdVar = this.x;
        int i10 = this.a;
        if (i3 == 1) {
            if (this.h == null || !xdVar.c1) {
                return;
            }
            zArr[i3] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions.ton = true;
            tL_payments_getStarsTransactions.peer = org.telegram.messenger.hp.s1(i10).j1(j10);
            tL_payments_getStarsTransactions.offset = this.h;
            tL_payments_getStarsTransactions.limit = this.n.isEmpty() ? 5 : 20;
            final int i11 = 0;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions, new RequestDelegate(this) { // from class: org.telegram.ui.od
                public final /* synthetic */ td b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i11) {
                        case 0:
                            final int i12 = 1;
                            final td tdVar = this.b;
                            final int i13 = i3;
                            final boolean z10 = a10;
                            final boolean z11 = b10;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.pd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cd cdVar;
                                    cd cdVar2;
                                    switch (i12) {
                                        case 0:
                                            td tdVar2 = tdVar;
                                            int i14 = tdVar2.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z12 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i15 = i13;
                                            if (z12) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.hp.s1(i14).Y3(starsStatus.users, false);
                                                org.telegram.messenger.hp.s1(i14).S3(starsStatus.chats, false);
                                                tdVar2.r.addAll(starsStatus.history);
                                                tdVar2.s = starsStatus.next_offset;
                                                tdVar2.w[i15] = false;
                                                tdVar2.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                                }
                                            }
                                            if (tdVar2.a() != z10 && (cdVar = tdVar2.f) != null) {
                                                cdVar.run();
                                            }
                                            if (tdVar2.b(i15) != z11) {
                                                tdVar2.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            td tdVar3 = tdVar;
                                            int i16 = tdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z13 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i13;
                                            if (z13) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                org.telegram.messenger.hp.s1(i16).Y3(starsStatus2.users, false);
                                                org.telegram.messenger.hp.s1(i16).S3(starsStatus2.chats, false);
                                                tdVar3.n.addAll(starsStatus2.history);
                                                tdVar3.h = starsStatus2.next_offset;
                                                tdVar3.w[i17] = false;
                                                tdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.fc.d0(tL_error3);
                                                }
                                            }
                                            if (tdVar3.a() != z10 && (cdVar2 = tdVar3.f) != null) {
                                                cdVar2.run();
                                            }
                                            if (tdVar3.b(i17) != z11) {
                                                tdVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i14 = 0;
                            final td tdVar2 = this.b;
                            final int i15 = i3;
                            final boolean z12 = a10;
                            final boolean z13 = b10;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.pd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cd cdVar;
                                    cd cdVar2;
                                    switch (i14) {
                                        case 0:
                                            td tdVar22 = tdVar2;
                                            int i142 = tdVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i152 = i15;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.hp.s1(i142).Y3(starsStatus.users, false);
                                                org.telegram.messenger.hp.s1(i142).S3(starsStatus.chats, false);
                                                tdVar22.r.addAll(starsStatus.history);
                                                tdVar22.s = starsStatus.next_offset;
                                                tdVar22.w[i152] = false;
                                                tdVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                                }
                                            }
                                            if (tdVar22.a() != z12 && (cdVar = tdVar22.f) != null) {
                                                cdVar.run();
                                            }
                                            if (tdVar22.b(i152) != z13) {
                                                tdVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            td tdVar3 = tdVar2;
                                            int i16 = tdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i15;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                org.telegram.messenger.hp.s1(i16).Y3(starsStatus2.users, false);
                                                org.telegram.messenger.hp.s1(i16).S3(starsStatus2.chats, false);
                                                tdVar3.n.addAll(starsStatus2.history);
                                                tdVar3.h = starsStatus2.next_offset;
                                                tdVar3.w[i17] = false;
                                                tdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.fc.d0(tL_error3);
                                                }
                                            }
                                            if (tdVar3.a() != z12 && (cdVar2 = tdVar3.f) != null) {
                                                cdVar2.run();
                                            }
                                            if (tdVar3.b(i17) != z13) {
                                                tdVar3.e();
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
        if (i3 == 0 && this.s != null && xdVar.d1) {
            zArr[i3] = true;
            TL_stars.TL_payments_getStarsTransactions tL_payments_getStarsTransactions2 = new TL_stars.TL_payments_getStarsTransactions();
            tL_payments_getStarsTransactions2.ton = false;
            tL_payments_getStarsTransactions2.peer = org.telegram.messenger.hp.s1(i10).j1(j10);
            tL_payments_getStarsTransactions2.offset = this.s;
            tL_payments_getStarsTransactions2.limit = this.r.isEmpty() ? 5 : 20;
            final int i12 = 1;
            ConnectionsManager.getInstance(i10).sendRequest(tL_payments_getStarsTransactions2, new RequestDelegate(this) { // from class: org.telegram.ui.od
                public final /* synthetic */ td b;

                {
                    this.b = this;
                }

                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    switch (i12) {
                        case 0:
                            final int i122 = 1;
                            final td tdVar = this.b;
                            final int i13 = i3;
                            final boolean z10 = a10;
                            final boolean z11 = b10;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.pd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cd cdVar;
                                    cd cdVar2;
                                    switch (i122) {
                                        case 0:
                                            td tdVar22 = tdVar;
                                            int i142 = tdVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i152 = i13;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.hp.s1(i142).Y3(starsStatus.users, false);
                                                org.telegram.messenger.hp.s1(i142).S3(starsStatus.chats, false);
                                                tdVar22.r.addAll(starsStatus.history);
                                                tdVar22.s = starsStatus.next_offset;
                                                tdVar22.w[i152] = false;
                                                tdVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                                }
                                            }
                                            if (tdVar22.a() != z10 && (cdVar = tdVar22.f) != null) {
                                                cdVar.run();
                                            }
                                            if (tdVar22.b(i152) != z11) {
                                                tdVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            td tdVar3 = tdVar;
                                            int i16 = tdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i13;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                org.telegram.messenger.hp.s1(i16).Y3(starsStatus2.users, false);
                                                org.telegram.messenger.hp.s1(i16).S3(starsStatus2.chats, false);
                                                tdVar3.n.addAll(starsStatus2.history);
                                                tdVar3.h = starsStatus2.next_offset;
                                                tdVar3.w[i17] = false;
                                                tdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.fc.d0(tL_error3);
                                                }
                                            }
                                            if (tdVar3.a() != z10 && (cdVar2 = tdVar3.f) != null) {
                                                cdVar2.run();
                                            }
                                            if (tdVar3.b(i17) != z11) {
                                                tdVar3.e();
                                                break;
                                            }
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            final int i14 = 0;
                            final td tdVar2 = this.b;
                            final int i15 = i3;
                            final boolean z12 = a10;
                            final boolean z13 = b10;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.pd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    cd cdVar;
                                    cd cdVar2;
                                    switch (i14) {
                                        case 0:
                                            td tdVar22 = tdVar2;
                                            int i142 = tdVar22.a;
                                            TLObject tLObject2 = tLObject;
                                            boolean z122 = tLObject2 instanceof TL_stars.StarsStatus;
                                            int i152 = i15;
                                            if (z122) {
                                                TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject2;
                                                org.telegram.messenger.hp.s1(i142).Y3(starsStatus.users, false);
                                                org.telegram.messenger.hp.s1(i142).S3(starsStatus.chats, false);
                                                tdVar22.r.addAll(starsStatus.history);
                                                tdVar22.s = starsStatus.next_offset;
                                                tdVar22.w[i152] = false;
                                                tdVar22.d();
                                            } else {
                                                TLRPC.TL_error tL_error2 = tL_error;
                                                if (tL_error2 != null) {
                                                    org.telegram.ui.Components.fc.d0(tL_error2);
                                                }
                                            }
                                            if (tdVar22.a() != z12 && (cdVar = tdVar22.f) != null) {
                                                cdVar.run();
                                            }
                                            if (tdVar22.b(i152) != z13) {
                                                tdVar22.e();
                                                break;
                                            }
                                            break;
                                        default:
                                            td tdVar3 = tdVar2;
                                            int i16 = tdVar3.a;
                                            TLObject tLObject3 = tLObject;
                                            boolean z132 = tLObject3 instanceof TL_stars.StarsStatus;
                                            int i17 = i15;
                                            if (z132) {
                                                TL_stars.StarsStatus starsStatus2 = (TL_stars.StarsStatus) tLObject3;
                                                org.telegram.messenger.hp.s1(i16).Y3(starsStatus2.users, false);
                                                org.telegram.messenger.hp.s1(i16).S3(starsStatus2.chats, false);
                                                tdVar3.n.addAll(starsStatus2.history);
                                                tdVar3.h = starsStatus2.next_offset;
                                                tdVar3.w[i17] = false;
                                                tdVar3.d();
                                            } else {
                                                TLRPC.TL_error tL_error3 = tL_error;
                                                if (tL_error3 != null) {
                                                    org.telegram.ui.Components.fc.d0(tL_error3);
                                                }
                                            }
                                            if (tdVar3.a() != z12 && (cdVar2 = tdVar3.f) != null) {
                                                cdVar2.run();
                                            }
                                            if (tdVar3.b(i17) != z13) {
                                                tdVar3.e();
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
        int i3 = 0;
        while (true) {
            qd qdVar = this.b;
            if (i3 >= qdVar.getViewPages().length) {
                return;
            }
            View view = qdVar.getViewPages()[i3];
            if (view instanceof rd) {
                rd rdVar = (rd) view;
                org.telegram.ui.Components.l41 l41Var = rdVar.a;
                l41Var.g3.O(true);
                if (l41Var.canScrollVertically(1)) {
                    for (int i10 = 0; i10 < l41Var.getChildCount(); i10++) {
                        if (!(l41Var.getChildAt(i10) instanceof org.telegram.ui.Components.iz)) {
                        }
                    }
                }
                rdVar.e.run();
                break;
            }
            i3++;
        }
    }

    public final void e() {
        sd sdVar = this.c;
        ArrayList arrayList = sdVar.e;
        ArrayList arrayList2 = sdVar.e;
        int size = arrayList.size();
        qd qdVar = this.b;
        int h = size == 0 ? -1 : sdVar.h(qdVar.getCurrentPosition());
        int i3 = 0;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            i3 |= 1 << sdVar.h(i10);
        }
        sdVar.i();
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            int h7 = sdVar.h(i13);
            i11 |= 1 << h7;
            if (h7 == h) {
                i12 = i13;
            }
        }
        if (i3 == i11) {
            return;
        }
        qdVar.onTouchEvent(null);
        qdVar.setPosition(i12);
        qdVar.J();
        qdVar.k(false);
        this.x.l();
    }

    public org.telegram.ui.Components.tj0 getCurrentListView() {
        View currentView = this.b.getCurrentView();
        if (currentView instanceof rd) {
            return ((rd) currentView).a;
        }
        return null;
    }
}
