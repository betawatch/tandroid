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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x21 extends org.telegram.ui.ActionBar.e3 {
    public static final /* synthetic */ int v = 0;
    public final lh.h1 b;
    public final Paint c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ArrayList h;
    public final byte[] n;
    public final long r;
    public s21 s;

    public x21(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, byte[] bArr) {
        this(true, context, c6Var, j10, false, false, null, bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [org.telegram.tgnet.TLObject] */
    /* JADX WARN: Type inference failed for: r0v13, types: [org.telegram.tgnet.TLRPC$TL_messages_reportSponsoredMessage] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v1, types: [org.telegram.tgnet.ConnectionsManager] */
    /* JADX WARN: Type inference failed for: r3v4, types: [org.telegram.tgnet.tl.TL_ephemeral$TL_reportMessage] */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.telegram.tgnet.tl.TL_stories$TL_stories_report] */
    public static void H(x21 x21Var, CharSequence charSequence, byte[] bArr, String str) {
        TLRPC.TL_messages_report tL_messages_report;
        ?? r02;
        long j10 = x21Var.r;
        ArrayList arrayList = x21Var.h;
        if (x21Var.d) {
            r02 = new TLRPC.TL_messages_reportSponsoredMessage();
            r02.random_id = x21Var.n;
            r02.option = bArr;
        } else {
            if (x21Var.e) {
                ?? tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(x21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_stories_report.id.addAll(arrayList);
                }
                tL_stories_report.message = str != null ? str : "";
                tL_stories_report.option = bArr;
                tL_messages_report = tL_stories_report;
            } else if (x21Var.f) {
                ?? tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                tL_reportMessage.peer = MessagesController.getInstance(x21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null && !arrayList.isEmpty()) {
                    tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                }
                tL_reportMessage.message = str != null ? str : "";
                tL_reportMessage.option = bArr;
                tL_messages_report = tL_reportMessage;
            } else {
                TLRPC.TL_messages_report tL_messages_report2 = new TLRPC.TL_messages_report();
                tL_messages_report2.peer = MessagesController.getInstance(x21Var.currentAccount).getInputPeer(j10);
                if (arrayList != null) {
                    tL_messages_report2.id.addAll(arrayList);
                }
                tL_messages_report2.message = str != null ? str : "";
                tL_messages_report2.option = bArr;
                tL_messages_report = tL_messages_report2;
            }
            r02 = tL_messages_report;
        }
        ConnectionsManager.getInstance(x21Var.currentAccount).sendRequest(r02, new gh.f1(x21Var, charSequence, bArr, str, 16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void K(int i10, final Context context, final long j10, final boolean z10, final boolean z11, final ArrayList arrayList, final org.telegram.ui.Components.mc mcVar, final org.telegram.ui.ActionBar.c6 c6Var, byte[] bArr, String str, final Utilities.Callback callback) {
        TLRPC.TL_messages_report tL_messages_report;
        TLRPC.TL_messages_report tL_messages_report2;
        if (context != null) {
            final boolean[] zArr = {false};
            if (z10) {
                TL_stories.TL_stories_report tL_stories_report = new TL_stories.TL_stories_report();
                tL_stories_report.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_stories_report.id.addAll(arrayList);
                tL_stories_report.option = bArr;
                tL_stories_report.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_stories_report;
            } else {
                if (z11) {
                    TL_ephemeral.TL_reportMessage tL_reportMessage = new TL_ephemeral.TL_reportMessage();
                    tL_reportMessage.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    if (!arrayList.isEmpty()) {
                        tL_reportMessage.id = ((Integer) arrayList.get(0)).intValue();
                    }
                    tL_reportMessage.message = TextUtils.isEmpty(str) ? "" : str;
                    tL_reportMessage.option = bArr;
                    tL_messages_report = tL_reportMessage;
                    ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.l21
                        @Override // org.telegram.messenger.Utilities.Callback2
                        public final void run(Object obj, Object obj2) {
                            x21.m(context, c6Var, z10, z11, j10, arrayList, zArr, callback, mcVar, (TLRPC.ReportResult) obj);
                        }
                    });
                }
                TLRPC.TL_messages_report tL_messages_report3 = new TLRPC.TL_messages_report();
                tL_messages_report3.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                tL_messages_report3.id.addAll(arrayList);
                tL_messages_report3.option = bArr;
                tL_messages_report3.message = TextUtils.isEmpty(str) ? "" : str;
                tL_messages_report2 = tL_messages_report3;
            }
            tL_messages_report = tL_messages_report2;
            ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_report, new org.telegram.messenger.a(), new Utilities.Callback2() { // from class: org.telegram.ui.l21
                @Override // org.telegram.messenger.Utilities.Callback2
                public final void run(Object obj, Object obj2) {
                    x21.m(context, c6Var, z10, z11, j10, arrayList, zArr, callback, mcVar, (TLRPC.ReportResult) obj);
                }
            });
        }
    }

    public static void L(long j10, org.telegram.ui.ActionBar.n2 n2Var) {
        int currentAccount = n2Var.getCurrentAccount();
        Context context = n2Var.getContext();
        if (context == null) {
            return;
        }
        K(currentAccount, context, j10, false, false, new ArrayList(), null, null, new byte[0], null, null);
    }

    public static void M(rn rnVar, MessageObject messageObject) {
        int currentAccount = rnVar.getCurrentAccount();
        Activity parentActivity = rnVar.getParentActivity();
        if (parentActivity == null) {
            return;
        }
        K(currentAccount, parentActivity, messageObject.getDialogId(), false, messageObject.isEphemeral(), new ArrayList(Collections.singleton(Integer.valueOf(messageObject.isEphemeral() ? messageObject.getEphemeralId() : messageObject.getId()))), org.telegram.ui.Components.mc.a0(rnVar), rnVar.getResourceProvider(), new byte[0], null, null);
    }

    public static void N(rn rnVar, MessageObject messageObject, org.telegram.ui.ActionBar.c6 c6Var) {
        int currentAccount = rnVar.getCurrentAccount();
        Activity parentActivity = rnVar.getParentActivity();
        long a2 = rnVar.a();
        if (parentActivity == null) {
            return;
        }
        TLRPC.TL_messages_reportSponsoredMessage tL_messages_reportSponsoredMessage = new TLRPC.TL_messages_reportSponsoredMessage();
        byte[] bArr = messageObject.sponsoredId;
        tL_messages_reportSponsoredMessage.random_id = bArr;
        tL_messages_reportSponsoredMessage.option = new byte[0];
        ConnectionsManager.getInstance(currentAccount).sendRequest(tL_messages_reportSponsoredMessage, new nh.y0(parentActivity, c6Var, a2, bArr, rnVar, messageObject, currentAccount));
    }

    public static void m(Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11, long j10, ArrayList arrayList, boolean[] zArr, Utilities.Callback callback, org.telegram.ui.Components.mc mcVar, TLRPC.ReportResult reportResult) {
        boolean z12 = reportResult instanceof TLRPC.TL_reportResultChooseOption;
        if (!z12 && !(reportResult instanceof TLRPC.TL_reportResultAddComment)) {
            AndroidUtilities.runOnUIThread(new hh.n6(zArr, callback, 1), 200L);
            return;
        }
        x21 x21Var = new x21(false, context, c6Var, j10, z10, z11, arrayList, null);
        if (z12) {
            x21Var.P((TLRPC.TL_reportResultChooseOption) reportResult);
        } else if (reportResult instanceof TLRPC.TL_reportResultAddComment) {
            TLRPC.TL_reportResultAddComment tL_reportResultAddComment = (TLRPC.TL_reportResultAddComment) reportResult;
            View[] viewPages = x21Var.b.getViewPages();
            View view = viewPages[0];
            if (view instanceof w21) {
                ((w21) view).a(0);
                x21Var.containerView.post(new zs0(29, viewPages, tL_reportResultAddComment));
            }
            View view2 = viewPages[1];
            if (view2 instanceof w21) {
                ((w21) view2).a(1);
            }
        }
        x21Var.s = new n21(zArr, callback, mcVar);
        x21Var.setOnDismissListener(new hh.n6(zArr, callback, 2));
        x21Var.show();
    }

    public static void n(x21 x21Var, TLObject tLObject, CharSequence charSequence, TLRPC.TL_error tL_error, byte[] bArr, String str) {
        s21 s21Var;
        s21 s21Var2;
        lh.d dVar;
        lh.h1 h1Var = x21Var.b;
        if ((h1Var.getCurrentView() instanceof w21) && (dVar = ((w21) h1Var.getCurrentView()).s) != null) {
            dVar.setLoading(false);
        }
        if (tLObject == null) {
            if (tL_error != null) {
                if (!x21Var.d && "MESSAGE_ID_REQUIRED".equals(tL_error.text)) {
                    long j10 = x21Var.r;
                    String charSequence2 = charSequence.toString();
                    int i10 = rn.Dc;
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        Bundle bundle = new Bundle();
                        if (DialogObject.isUserDialog(j10)) {
                            bundle.putLong("user_id", j10);
                        } else {
                            bundle.putLong("chat_id", -j10);
                        }
                        bundle.putString("reportTitle", charSequence2);
                        bundle.putByteArray("reportOption", bArr);
                        bundle.putString("reportMessage", str);
                        U.presentFragment(new rn(bundle));
                    }
                } else if ("PREMIUM_ACCOUNT_REQUIRED".equals(tL_error.text)) {
                    s21 s21Var3 = x21Var.s;
                    if (s21Var3 != null) {
                        s21Var3.c();
                    }
                } else if ("AD_EXPIRED".equals(tL_error.text) && (s21Var = x21Var.s) != null) {
                    s21Var.a();
                }
                x21Var.dismiss();
                return;
            }
            return;
        }
        boolean z10 = tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption;
        if (!z10 && !(tLObject instanceof TLRPC.TL_reportResultChooseOption) && !(tLObject instanceof TLRPC.TL_reportResultAddComment)) {
            if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                MessagesController.getInstance(x21Var.currentAccount).disableAds(false);
                s21 s21Var4 = x21Var.s;
                if (s21Var4 != null) {
                    s21Var4.b();
                    x21Var.dismiss();
                    return;
                }
                return;
            }
            if (((tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) || (tLObject instanceof TLRPC.TL_reportResultReported)) && (s21Var2 = x21Var.s) != null) {
                s21Var2.a();
                x21Var.dismiss();
                return;
            }
            return;
        }
        h1Var.D(h1Var.b + 1);
        w21 w21Var = (w21) h1Var.getViewPages()[1];
        if (w21Var != null) {
            org.telegram.ui.Components.k51 k51Var = w21Var.f;
            if (tLObject instanceof TLRPC.TL_reportResultChooseOption) {
                w21Var.b = null;
                w21Var.c = (TLRPC.TL_reportResultChooseOption) tLObject;
                w21Var.d = null;
                k51Var.U2.N(false);
            } else if (tLObject instanceof TLRPC.TL_reportResultAddComment) {
                w21Var.b((TLRPC.TL_reportResultAddComment) tLObject);
            } else if (z10) {
                w21Var.b = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) tLObject;
                w21Var.c = null;
                w21Var.d = null;
                k51Var.U2.N(false);
            }
            if (charSequence != null) {
                ag.w wVar = w21Var.h;
                ((TextView) wVar.d).setText(charSequence);
                ((TextView) wVar.d).getText();
                wVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_31));
                if (k51Var != null) {
                    k51Var.U2.N(true);
                }
            }
        }
    }

    public final void O(TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption) {
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof w21) {
            ((w21) view).a(0);
            this.containerView.post(new zs0(28, viewPages, tL_channels_sponsoredMessageReportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof w21) {
            ((w21) view2).a(1);
        }
    }

    public final void P(TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption) {
        View[] viewPages = this.b.getViewPages();
        View view = viewPages[0];
        if (view instanceof w21) {
            ((w21) view).a(0);
            this.containerView.post(new m21(0, viewPages, tL_reportResultChooseOption));
        }
        View view2 = viewPages[1];
        if (view2 instanceof w21) {
            ((w21) view2).a(1);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final boolean canDismissWithSwipe() {
        if (this.b.getCurrentView() instanceof w21) {
            return !((w21) r0).f.canScrollVertically(-1);
        }
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void onBackPressed() {
        u21 u21Var;
        lh.h1 h1Var = this.b;
        if ((h1Var.getCurrentView() instanceof w21) && (u21Var = ((w21) h1Var.getCurrentView()).n) != null) {
            AndroidUtilities.hideKeyboard(u21Var);
        }
        if (h1Var.getCurrentPosition() > 0) {
            h1Var.D(h1Var.getCurrentPosition() - 1);
        } else {
            super.onBackPressed();
        }
    }

    public x21(boolean z10, Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, boolean z11, boolean z12, ArrayList arrayList, byte[] bArr) {
        super(context, c6Var, true, false);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = z10;
        this.h = arrayList;
        this.e = z11;
        this.f = z12;
        this.n = bArr;
        this.r = j10;
        int i10 = org.telegram.ui.ActionBar.g6.h5;
        paint.setColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        this.containerView = new r21(this, context);
        lh.h1 h1Var = new lh.h1(this, context, 6);
        this.b = h1Var;
        int i11 = this.backgroundPaddingLeft;
        h1Var.setPadding(i11, 0, i11, 0);
        this.containerView.addView(h1Var, h7.z5.e(-1, -1, 119));
        h1Var.setAdapter(new cg.u(this, context, 3));
        if (arrayList == null && bArr == null) {
            if (z10) {
                O(null);
            } else {
                P(null);
            }
        }
    }
}
