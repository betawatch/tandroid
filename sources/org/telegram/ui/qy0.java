package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class qy0 extends org.telegram.ui.ActionBar.w2 {
    public static final /* synthetic */ int w1 = 0;
    public final hi.i1 m1;
    public final Paint n1;
    public int o1;
    public final boolean p1;
    public final boolean q1;
    public final boolean r1;
    public final ArrayList s1;
    public final byte[] t1;
    public final long u1;
    public ly0 v1;

    public qy0(Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, byte[] bArr) {
        this(true, context, h6Var, j3, false, false, null, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_messages_reportSponsoredMessage] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.tgnet.ConnectionsManager] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.tgnet.tl.TL_ephemeral$TL_reportMessage] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.tgnet.tl.TL_stories$TL_stories_report] */
    public static void J0(qy0 qy0Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = qy0Var.u1;
        ArrayList arrayList = qy0Var.s1;
        if (qy0Var.p1) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = qy0Var.t1;
            r02.option = bArr;
        } else {
            if (qy0Var.q1) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.np.u1(qy0Var.a).l1(j3);
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                tL_stories_report.message = str != null ? str : "";
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (qy0Var.r1) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = org.telegram.messenger.np.u1(qy0Var.a).l1(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                tL_reportMessage.message = str != null ? str : "";
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = org.telegram.messenger.np.u1(qy0Var.a).l1(j3);
                if (arrayList != null) {
                    tL_messages_report2.id.addAll(arrayList);
                }
                tL_messages_report2.message = str != null ? str : "";
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
            r02 = tL_messages_report;
        }
        ConnectionsManager.getInstance(qy0Var.a).sendRequest(r02, new bi.k2(qy0Var, charSequence, bArr, str, 18));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K0(int i7, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.lc lcVar, final org.telegram.ui.ActionBar.h6 h6Var, byte[] bArr, String str, final org.telegram.messenger.y10 y10Var) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            int i10 = 1;
            final boolean[] zArr = {false};
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = org.telegram.messenger.np.u1(i7).l1(j3);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                tL_stories_report.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_stories_report;
            } else {
                if (z11) {
                    TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                    tL_reportMessage.peer = org.telegram.messenger.np.u1(i7).l1(j3);
                    if (!arrayList.isEmpty()) {
                        tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                    }
                    tL_reportMessage.message = TextUtils.isEmpty(str) ? "" : str;
                    tL_reportMessage.option = bArr;
                    tL_messages_report = tL_reportMessage;
                    ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(i10), new org.telegram.messenger.r10() { // from class: org.telegram.ui.jy0
                        @Override // org.telegram.messenger.r10
                        public final void a(Object obj, Object obj2) {
                            TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                            boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                            boolean[] zArr2 = zArr;
                            org.telegram.messenger.y10 y10Var2 = y10Var;
                            if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                                org.telegram.messenger.g0.h3(new di.g8(1, y10Var2, zArr2), 200L);
                                return;
                            }
                            qy0 qy0Var = new qy0(false, context, h6Var, j3, z10, z11, arrayList, null);
                            if (z12) {
                                qy0Var.P0((TLRPC.TL_reportResultChooseOption) reportResult);
                            } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                                TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                                View[] viewPages = qy0Var.m1.getViewPages();
                                View view = viewPages[0];
                                if (view instanceof py0) {
                                    ((py0) view).a(0);
                                    qy0Var.b.post(new tr0(25, viewPages, tL_reportResultAddComment));
                                }
                                View view2 = viewPages[1];
                                if (view2 instanceof py0) {
                                    ((py0) view2).a(1);
                                }
                            }
                            qy0Var.v1 = new md0(zArr2, y10Var2, lcVar, 1);
                            qy0Var.n(new di.g8(2, y10Var2, zArr2));
                            qy0Var.show();
                        }
                    });
                }
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = org.telegram.messenger.np.u1(i7).l1(j3);
                tL_messages_report3.id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                tL_messages_report3.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i7).sendRequestTyped(tL_messages_report, new d3.b(i10), new org.telegram.messenger.r10() { // from class: org.telegram.ui.jy0
                @Override // org.telegram.messenger.r10
                public final void a(Object obj, Object obj2) {
                    TLRPC.ReportResult reportResult = (TLRPC.ReportResult) obj;
                    boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
                    boolean[] zArr2 = zArr;
                    org.telegram.messenger.y10 y10Var2 = y10Var;
                    if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
                        org.telegram.messenger.g0.h3(new di.g8(1, y10Var2, zArr2), 200L);
                        return;
                    }
                    qy0 qy0Var = new qy0(false, context, h6Var, j3, z10, z11, arrayList, null);
                    if (z12) {
                        qy0Var.P0((TLRPC.TL_reportResultChooseOption) reportResult);
                    } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
                        TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
                        View[] viewPages = qy0Var.m1.getViewPages();
                        View view = viewPages[0];
                        if (view instanceof py0) {
                            ((py0) view).a(0);
                            qy0Var.b.post(new tr0(25, viewPages, tL_reportResultAddComment));
                        }
                        View view2 = viewPages[1];
                        if (view2 instanceof py0) {
                            ((py0) view2).a(1);
                        }
                    }
                    qy0Var.v1 = new md0(zArr2, y10Var2, lcVar, 1);
                    qy0Var.n(new di.g8(2, y10Var2, zArr2));
                    qy0Var.show();
                }
            });
        }
    }

    public static void L0(long j3, org.telegram.ui.ActionBar.g2 g2Var) {
        int currentAccount = g2Var.getCurrentAccount();
        Context context = g2Var.getContext();
        if (context == null) {
            return;
        }
        K0(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void M0(bn bnVar, org.telegram.messenger.gj gjVar) {
        int currentAccount = bnVar.getCurrentAccount();
        Activity parentActivity = bnVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        K0(currentAccount, parentActivity, org.telegram.messenger.gj.B0(gjVar.k), false, org.telegram.messenger.gj.c3(gjVar.k), new ArrayList(Collections.singleton(Integer.valueOf(org.telegram.messenger.gj.c3(gjVar.k) ? gjVar.P0() : gjVar.e1()))), org.telegram.ui.Components.lc.b0(bnVar), bnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void N0(bn bnVar, org.telegram.messenger.gj gjVar, org.telegram.ui.ActionBar.h6 h6Var) {
        int currentAccount = bnVar.getCurrentAccount();
        Activity parentActivity = bnVar.getParentActivity();
        long a10 = bnVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = gjVar.R0;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ii.f(parentActivity, h6Var, a10, bArr, bnVar, gjVar, currentAccount));
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        if (this.m1.getCurrentView() instanceof py0) {
            return !((py0) r0).f.canScrollVertically(-1);
        }
        return true;
    }

    public final void O0(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof py0) {
            ((py0) view).a(0);
            this.b.post(new tr0(24, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof py0) {
            ((py0) view2).a(1);
        }
    }

    public final void P0(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.m1.getViewPages();
        View view = viewPages[0];
        if (view instanceof py0) {
            ((py0) view).a(0);
            this.b.post(new tr0(26, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof py0) {
            ((py0) view2).a(1);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        ny0 ny0Var;
        hi.i1 i1Var = this.m1;
        if ((i1Var.getCurrentView() instanceof py0) && (ny0Var = ((py0) i1Var.getCurrentView()).n) != null) {
            org.telegram.messenger.g0.v1(ny0Var);
        }
        if (i1Var.getCurrentPosition() > 0) {
            i1Var.A(i1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        int i7;
        Paint paint = this.n1;
        super.s0();
        try {
            int w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.h5, this.J0);
            if (paint.getColor() != w02) {
                paint.setColor(w02);
                ViewGroup viewGroup = this.b;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            if (this.G0 >= 0 || (i7 = this.H0) != this.o1 || w02 == i7) {
                return;
            }
            this.H0 = w02;
            this.o1 = w02;
            E0(w02);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public qy0(boolean z10, Context context, org.telegram.ui.ActionBar.h6 h6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, h6Var, true);
        Paint paint = new Paint(1);
        this.n1 = paint;
        this.p1 = z10;
        this.s1 = arrayList;
        this.q1 = z11;
        this.r1 = z12;
        this.t1 = bArr;
        this.u1 = j3;
        int i7 = org.telegram.ui.ActionBar.m6.h5;
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(i7, h6Var));
        Q(i7);
        this.o1 = this.H0;
        this.Q0 = true;
        this.R0 = true;
        this.b = new y50(this, context);
        hi.i1 i1Var = new hi.i1(6, context, this);
        this.m1 = i1Var;
        int i10 = this.u0;
        i1Var.setPadding(i10, 0, i10, 0);
        this.b.addView(i1Var, c8.ma.e(-1, -1, org.telegram.messenger.ls.E1));
        i1Var.setAdapter(new di.i4(5, context, this));
        if (arrayList == null && bArr == null) {
            if (z10) {
                O0(null);
            } else {
                P0(null);
            }
        }
    }
}
