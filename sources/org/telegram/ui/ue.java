package org.telegram.ui;

import android.app.Activity;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ue implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ ue(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        xn xnVar = this.b;
        switch (i11) {
            case 0:
                xn xnVar2 = this.b;
                fg.v0.C1(xnVar2, xnVar2.A1, xnVar2.B1, xnVar2.Q5, false);
                break;
            case 1:
                xnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", xnVar.r);
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (xnVar.H3 != null) {
                    xnVar.Lb(!xnVar.vc.f);
                    break;
                }
                break;
            case 3:
                xnVar.kb(!xnVar.x0.K);
                break;
            case 4:
                bk bkVar = xnVar.F1;
                if (bkVar != null) {
                    bkVar.setReversed(true);
                    xnVar.F1.getAdapter().h0 = true;
                    xnVar.m7();
                }
                xnVar.P2.setVisibility(8);
                xnVar.Q2.setVisibility(8);
                xnVar.k3 = true;
                xnVar.l3 = null;
                xnVar.m3 = null;
                xnVar.g0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                xnVar.g0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(xnVar.g0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = xnVar.g0;
                w0Var.r = null;
                lg.f fVar = w0Var.e;
                if (fVar != null) {
                    fVar.setText("");
                    break;
                }
                break;
            case 5:
                if (xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = xnVar.g0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    xnVar.showDialog(org.telegram.ui.Components.z4.p(xnVar.getParentActivity(), new cl(xnVar), xnVar.ba).a);
                    break;
                }
                break;
            case 6:
                xnVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = xnVar.a5;
                if (messageObject2 != null) {
                    xnVar.J9(messageObject2, false, false);
                    af.g.r(xnVar.getParentActivity(), Uri.parse(xnVar.a5.sponsoredUrl), true, false, false, null, null, false, xnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(xnVar.a5.sponsoredInfo)) {
                    b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.ba));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(xnVar.a5.sponsoredAdditionalInfo)) {
                    b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.ba));
                    break;
                }
                break;
            case 10:
                if (xnVar.U0 != null && xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(xnVar.U0.getContext(), null, false, false);
                    Activity parentActivity = xnVar.getParentActivity();
                    vn vnVar = xnVar.ba;
                    final u81 u81Var = new u81(parentActivity);
                    LinearLayout h = l.d.h(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i15 = org.telegram.ui.ActionBar.k6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, vnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(parentActivity, vnVar);
                    g90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), vnVar));
                    g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.gc, vnVar));
                    g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, vnVar));
                    g90Var.setTextSize(1, 14.0f);
                    g90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    g90Var.setOnLinkPressListener(new org.telegram.ui.Components.f90() { // from class: org.telegram.ui.s81
                        @Override // org.telegram.ui.Components.f90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(u81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(u81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(u81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.g90 g90Var2 = new org.telegram.ui.Components.g90(parentActivity, null);
                    g90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), vnVar));
                    g90Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, vnVar));
                    g90Var2.setTextSize(1, 14.0f);
                    g90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    g90Var2.setOnLinkPressListener(new org.telegram.ui.Components.f90() { // from class: org.telegram.ui.s81
                        @Override // org.telegram.ui.Components.f90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(u81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(u81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(u81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.g90 g90Var3 = new org.telegram.ui.Components.g90(parentActivity, null);
                    g90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), vnVar));
                    g90Var3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, vnVar));
                    g90Var3.setTextSize(1, 14.0f);
                    g90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    g90Var3.setOnLinkPressListener(new org.telegram.ui.Components.f90() { // from class: org.telegram.ui.s81
                        @Override // org.telegram.ui.Components.f90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(u81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(u81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(u81Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.k6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.k6.v0(i16, vnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    pk pkVar = new pk(parentActivity, paint);
                    pkVar.setOnClickListener(new t81(parentActivity));
                    pkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    pkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    pkVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i16, vnVar));
                    pkVar.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.h5, vnVar)));
                    pkVar.setTextSize(1, 14.0f);
                    pkVar.setGravity(16);
                    org.telegram.ui.Components.g90 g90Var4 = new org.telegram.ui.Components.g90(parentActivity, null);
                    g90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), vnVar));
                    g90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    g90Var4.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, vnVar));
                    g90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(textView);
                    g90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(g90Var, k7.c6.t(-1, -2, 0, 0, 18, 0, 0));
                    g90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(g90Var2, k7.c6.t(-1, -2, 0, 0, 24, 0, 0));
                    g90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(g90Var3, k7.c6.t(-1, -2, 0, 0, 24, 0, 0));
                    h.addView(pkVar, k7.c6.t(-2, 34, 1, 22, 14, 22, 0));
                    g90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(g90Var4, k7.c6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(u81Var.getContext());
                    scrollView.addView(h);
                    u81Var.addView(scrollView, k7.c6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    o10.customView = u81Var;
                    o10.show();
                    break;
                }
                break;
            case 11:
                xnVar.finishPreviewFragment();
                break;
            case 12:
                xnVar.getClass();
                xnVar.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) xnVar, 28, true));
                break;
            case 13:
                xn xnVar3 = this.b;
                org.telegram.ui.Components.z4.j0(xnVar3, xnVar3.Q5, xnVar3.f, xnVar3.e, xnVar3.h, xnVar3.K1.getTag(R.id.object_tag) != null, xnVar3.W7, new vg(xnVar3, i12), xnVar3.ba);
                break;
            case 14:
                xn.j0(xnVar);
                break;
            case 15:
                if (xnVar.Z3 != null) {
                    TopicsController topicsController = xnVar.getMessagesController().getTopicsController();
                    long j10 = xnVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = xnVar.Z3;
                    int i17 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i17, false);
                }
                xnVar.Rc();
                xnVar.hc(false);
                xnVar.Qc(true);
                break;
            case 16:
                long j11 = xnVar.Q5;
                if (xnVar.h != null) {
                    j11 = xnVar.f.id;
                }
                xnVar.Vb = false;
                xnVar.getMessagesController().hidePeerSettingsBar(j11, xnVar.f, xnVar.e);
                xnVar.Qc(true);
                xnVar.oc(true);
                break;
            case 17:
                xn xnVar4 = this.b;
                xnVar4.A4 = true;
                if (!xnVar4.F9() || xnVar4.e4) {
                    int i18 = xnVar4.I4;
                    if (i18 != 0) {
                        if (!xnVar4.E4.isEmpty()) {
                            if (i18 == ((Integer) l.d.i(1, xnVar4.E4)).intValue()) {
                                i13 = ((Integer) xnVar4.E4.get(0)).intValue() + 1;
                                xnVar4.L4 = true;
                            } else {
                                xnVar4.L4 = false;
                                i13 = i18 - 1;
                            }
                        }
                        xnVar4.K4 = i13;
                        if (!xnVar4.L4) {
                            i13 = -i13;
                        }
                        xnVar4.j(i18, 0, true, 0, true, i13);
                        xnVar4.uc();
                        break;
                    }
                } else {
                    xnVar4.j((int) xnVar4.a4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                xnVar.ia(false);
                break;
            case 19:
                xn.Z(xnVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", xnVar.a());
                xnVar.presentFragment(new xk(bundle2));
                break;
            case 21:
                xn.C0(xnVar);
                break;
            case 22:
                xn.L0(xnVar);
                break;
            case 23:
                xn.b1(xnVar);
                break;
            case 24:
                xnVar.ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = xnVar.T5;
                for (int i19 = 1; i19 >= 0; i19--) {
                    if (messageObject == null && sparseArrayArr[i19].size() != 0) {
                        messageObject = (MessageObject) xnVar.l6[i19].get(sparseArrayArr[i19].keyAt(0));
                    }
                    sparseArrayArr[i19].clear();
                    xnVar.U5[i19].clear();
                    xnVar.V5[i19].clear();
                }
                xnVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && xnVar.h != null))) {
                    xnVar.Bb(messageObject);
                }
                xnVar.yc(0, true);
                xnVar.Wc(false);
                xnVar.Lc();
                break;
            case 26:
                xn.f1(xnVar);
                break;
            case 27:
                xn xnVar5 = this.b;
                MessageObject messageObject3 = xnVar5.m5;
                if (messageObject3 != null) {
                    xnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                xnVar.la(xnVar.E9() ? "" : null);
                break;
            default:
                xnVar.Q7();
                xnVar.v3.m(xnVar.Q5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
