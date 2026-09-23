package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class u31 extends org.telegram.ui.ActionBar.f3 {
    public static final /* synthetic */ int v = 0;
    public final ci.i1 b;
    public final Paint c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ArrayList h;
    public final byte[] n;
    public final long r;
    public q31 s;

    public u31(Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, byte[] bArr) {
        this(true, context, d6Var, j3, false, false, null, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_messages_reportSponsoredMessage] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.tgnet.ConnectionsManager] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.tgnet.tl.TL_ephemeral$TL_reportMessage] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.tgnet.tl.TL_stories$TL_stories_report] */
    public static void H(u31 u31Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j3 = u31Var.r;
        ArrayList arrayList = u31Var.h;
        if (u31Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = u31Var.n;
            r02.option = bArr;
        } else {
            if (u31Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(u31Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                tL_stories_report.message = str != null ? str : "";
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (u31Var.f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(u31Var.currentAccount).getInputPeer(j3);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                tL_reportMessage.message = str != null ? str : "";
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(u31Var.currentAccount).getInputPeer(j3);
                if (arrayList != null) {
                    tL_messages_report2.id.addAll(arrayList);
                }
                tL_messages_report2.message = str != null ? str : "";
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
            r02 = tL_messages_report;
        }
        ConnectionsManager.getInstance(u31Var.currentAccount).sendRequest(r02, new ai.p3(u31Var, charSequence, bArr, str, 12));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K(int i10, final Context context, final long j3, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.xc xcVar, final org.telegram.ui.ActionBar.d6 d6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                tL_stories_report.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_stories_report;
            } else {
                if (z11) {
                    TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                    tL_reportMessage.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                    if (!arrayList.isEmpty()) {
                        tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                    }
                    tL_reportMessage.message = TextUtils.isEmpty(str) ? "" : str;
                    tL_reportMessage.option = bArr;
                    tL_messages_report = tL_reportMessage;
                    ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.k31
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            u31.m(context, d6Var, z10, z11, j3, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                        }
                    });
                }
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                tL_messages_report3.id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                tL_messages_report3.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.k31
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    u31.m(context, d6Var, z10, z11, j3, arrayList, zArr, callback, xcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void L(long j3, org.telegram.ui.ActionBar.n2 n2Var) {
        int currentAccount = n2Var.getCurrentAccount();
        Context context = n2Var.getContext();
        if (context == null) {
            return;
        }
        K(currentAccount, context, j3, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void M(xn xnVar, MessageObject messageObject) {
        int currentAccount = xnVar.getCurrentAccount();
        Activity parentActivity = xnVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        K(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(messageObject.isEphemeral() ? messageObject.getEphemeralId() : messageObject.getId()))), org.telegram.ui.Components.xc.a0(xnVar), xnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void N(xn xnVar, MessageObject messageObject, org.telegram.ui.ActionBar.d6 d6Var) {
        int currentAccount = xnVar.getCurrentAccount();
        Activity parentActivity = xnVar.getParentActivity();
        long a2 = xnVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new ei.b1(parentActivity, d6Var, a2, bArr, xnVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11, long j3, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.xc xcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new f31(0, callback, zArr), 200L);
            return;
        }
        u31 u31Var = new u31(false, context, d6Var, j3, z10, z11, arrayList, null);
        if (z12) {
            u31Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = u31Var.b.getViewPages();
            View view = viewPages[0];
            if (view instanceof t31) {
                ((t31) view).a(0);
                u31Var.containerView.post(new by0(17, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof t31) {
                ((t31) view2).a(1);
            }
        }
        u31Var.s = new l31(zArr, callback, xcVar);
        u31Var.setOnDismissListener(new f31(1, callback, zArr));
        u31Var.show();
    }

    public static void n(u31 u31Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        q31 q31Var;
        q31 q31Var2;
        ci.d dVar;
        ci.i1 i1Var = u31Var.b;
        if ((i1Var.getCurrentView() instanceof t31) && (dVar = ((t31) i1Var.getCurrentView()).s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject == null) {
            if (tL_error != null) {
                if (!u31Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                    long j3 = u31Var.r;
                    String charSequence2 = charSequence.toString();
                    int i10 = xn.Gc;
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(j3)) {
                            bundle.putLong("user_id", j3);
                        } else {
                            bundle.putLong("chat_id", -j3);
                        }
                        bundle.putString("reportTitle", charSequence2);
                        bundle.putByteArray("reportOption", bArr);
                        bundle.putString("reportMessage", str);
                        U.presentFragment(new xn(bundle));
                    }
                } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                    q31 q31Var3 = u31Var.s;
                    if (q31Var3 != null) {
                        q31Var3.c();
                    }
                } else if ("AD_EXPIRED".equals(tL_error.text) && (q31Var = u31Var.s) != null) {
                    q31Var.a();
                }
                u31Var.dismiss();
                return;
            }
            return;
        }
        boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
        if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
            if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                MessagesController.getInstance(u31Var.currentAccount).disableAds(false);
                q31 q31Var4 = u31Var.s;
                if (q31Var4 != null) {
                    q31Var4.b();
                    u31Var.dismiss();
                    return;
                }
                return;
            }
            if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (q31Var2 = u31Var.s) != null) {
                q31Var2.a();
                u31Var.dismiss();
                return;
            }
            return;
        }
        i1Var.D(i1Var.b + 1);
        t31 t31Var = (t31) i1Var.getViewPages()[1];
        if (t31Var != null) {
            org.telegram.ui.Components.d61 d61Var = t31Var.f;
            if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                t31Var.b = null;
                t31Var.c = (TLRPC.TL_reportResultChooseOption) tLObject;
                t31Var.d = null;
                d61Var.Y2.N(false);
            } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                t31Var.b((TLRPC.TL_reportResultAddComment) tLObject);
            } else if (z10) {
                t31Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                t31Var.c = null;
                t31Var.d = null;
                d61Var.Y2.N(false);
            }
            if (charSequence != null) {
                u5 u5Var = t31Var.h;
                ((TextView) u5Var.d).setText(charSequence);
                ((TextView) u5Var.d).getText();
                u5Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                if (d61Var != null) {
                    d61Var.Y2.N(true);
                }
            }
        }
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof t31) {
            ((t31) view).a(0);
            this.containerView.post(new by0(16, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof t31) {
            ((t31) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof t31) {
            ((t31) view).a(0);
            this.containerView.post(new by0(18, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof t31) {
            ((t31) view2).a(1);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final boolean canDismissWithSwipe() {
        if (this.b.getCurrentView() instanceof t31) {
            return !((t31) r0).f.canScrollVertically(-1);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onBackPressed() {
        s31 s31Var;
        ci.i1 i1Var = this.b;
        if ((i1Var.getCurrentView() instanceof t31) && (s31Var = ((t31) i1Var.getCurrentView()).n) != null) {
            AndroidUtilities.hideKeyboard(s31Var);
        }
        if (i1Var.getCurrentPosition() > 0) {
            i1Var.D(i1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public u31(boolean z10, Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(1, context, d6Var, true);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f = z12;
        this.n = bArr;
        this.r = j3;
        int i10 = org.telegram.ui.ActionBar.h6.h5;
        paint.setColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new p31(this, context);
        ci.i1 i1Var = new ci.i1(this, context, 6);
        this.b = i1Var;
        int i11 = this.backgroundPaddingLeft;
        i1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(i1Var, w7.x5.e(-1, -1, 119));
        i1Var.setAdapter(new bw0(this, context, 1));
        if (arrayList == null && bArr == null) {
            if (z10) {
                O(null);
            } else {
                P(null);
            }
        }
    }
}
