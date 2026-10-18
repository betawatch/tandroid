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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ xe(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        sn snVar = this.b;
        switch (i11) {
            case 0:
                sn snVar2 = this.b;
                sg.k0.D1(snVar2, snVar2.D1, snVar2.E1, snVar2.T5, false);
                break;
            case 1:
                snVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", snVar.r);
                snVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (snVar.K3 != null) {
                    snVar.Pb(!snVar.zc.f);
                    break;
                }
                break;
            case 3:
                snVar.ob(!snVar.A0.N);
                break;
            case 4:
                zj zjVar = snVar.I1;
                if (zjVar != null) {
                    zjVar.setReversed(true);
                    snVar.I1.getAdapter().k0 = true;
                    snVar.p7();
                }
                snVar.S2.setVisibility(8);
                snVar.T2.setVisibility(8);
                snVar.n3 = true;
                snVar.o3 = null;
                snVar.p3 = null;
                snVar.j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                snVar.j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(snVar.j0.getSearchField());
                org.telegram.ui.ActionBar.u0 u0Var = snVar.j0;
                u0Var.r = null;
                ei.e2 e2Var = u0Var.e;
                if (e2Var != null) {
                    e2Var.setText("");
                    break;
                }
                break;
            case 5:
                if (snVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = snVar.j0;
                    if (u0Var2 != null) {
                        AndroidUtilities.hideKeyboard(u0Var2.getSearchField());
                    }
                    snVar.showDialog(org.telegram.ui.Components.f5.o(snVar.getParentActivity(), new al(snVar), snVar.ea).a);
                    break;
                }
                break;
            case 6:
                snVar.D7(true);
                break;
            case 7:
                MessageObject messageObject2 = snVar.d5;
                if (messageObject2 != null) {
                    snVar.O9(messageObject2, false, false);
                    pf.d.q(snVar.getParentActivity(), Uri.parse(snVar.d5.sponsoredUrl), true, false, false, null, null, false, snVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(snVar.d5.sponsoredInfo)) {
                    org.telegram.messenger.lk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.ea));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(snVar.d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.lk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.ea));
                    break;
                }
                break;
            case 10:
                if (snVar.X0 != null && snVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 i15 = org.telegram.messenger.lk.i(1, snVar.X0.getContext(), null, false);
                    Activity parentActivity = snVar.getParentActivity();
                    qn qnVar = snVar.ea;
                    final e81 e81Var = new e81(parentActivity);
                    LinearLayout e = org.telegram.messenger.g0.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i16 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, qnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(parentActivity, qnVar);
                    x90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), qnVar));
                    x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, qnVar));
                    x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, qnVar));
                    x90Var.setTextSize(1, 14.0f);
                    x90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var.setOnLinkPressListener(new org.telegram.ui.Components.w90() { // from class: org.telegram.ui.c81
                        @Override // org.telegram.ui.Components.w90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(e81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(e81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(e81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.x90 x90Var2 = new org.telegram.ui.Components.x90(parentActivity, null);
                    x90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), qnVar));
                    x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, qnVar));
                    x90Var2.setTextSize(1, 14.0f);
                    x90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var2.setOnLinkPressListener(new org.telegram.ui.Components.w90() { // from class: org.telegram.ui.c81
                        @Override // org.telegram.ui.Components.w90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(e81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(e81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(e81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.x90 x90Var3 = new org.telegram.ui.Components.x90(parentActivity, null);
                    x90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), qnVar));
                    x90Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, qnVar));
                    x90Var3.setTextSize(1, 14.0f);
                    x90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var3.setOnLinkPressListener(new org.telegram.ui.Components.w90() { // from class: org.telegram.ui.c81
                        @Override // org.telegram.ui.Components.w90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(e81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(e81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(e81Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i17 = org.telegram.ui.ActionBar.h6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(i17, qnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    mk mkVar = new mk(parentActivity, paint);
                    mkVar.setOnClickListener(new d81(parentActivity));
                    mkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    mkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    mkVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i17, qnVar));
                    mkVar.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, qnVar)));
                    mkVar.setTextSize(1, 14.0f);
                    mkVar.setGravity(16);
                    org.telegram.ui.Components.x90 x90Var4 = new org.telegram.ui.Components.x90(parentActivity, null);
                    x90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), qnVar));
                    x90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, qnVar));
                    x90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(textView);
                    x90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var, w7.z5.t(-1, -2, 0, 0, 18, 0, 0));
                    x90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var2, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    x90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var3, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    e.addView(mkVar, w7.z5.t(-2, 34, 1, 22, 14, 22, 0));
                    x90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var4, w7.z5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(e81Var.getContext());
                    scrollView.addView(e);
                    e81Var.addView(scrollView, w7.z5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i15.customView = e81Var;
                    i15.show();
                    break;
                }
                break;
            case 11:
                snVar.finishPreviewFragment();
                break;
            case 12:
                snVar.getClass();
                snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) snVar, 28, true));
                break;
            case 13:
                sn snVar3 = this.b;
                org.telegram.ui.Components.f5.i0(snVar3, snVar3.T5, snVar3.f, snVar3.e, snVar3.h, snVar3.N1.getTag(R.id.object_tag) != null, snVar3.Z7, new ug(snVar3, i12), snVar3.ea);
                break;
            case 14:
                sn.k0(snVar);
                break;
            case 15:
                if (snVar.c4 != null) {
                    TopicsController topicsController = snVar.getMessagesController().getTopicsController();
                    long j10 = snVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = snVar.c4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i18, false);
                }
                snVar.Vc();
                snVar.lc(false);
                snVar.Uc(true);
                break;
            case 16:
                long j11 = snVar.T5;
                if (snVar.h != null) {
                    j11 = snVar.f.id;
                }
                snVar.Yb = false;
                snVar.getMessagesController().hidePeerSettingsBar(j11, snVar.f, snVar.e);
                snVar.Uc(true);
                snVar.sc(true);
                break;
            case 17:
                sn snVar4 = this.b;
                snVar4.D4 = true;
                if (!snVar4.K9() || snVar4.h4) {
                    int i19 = snVar4.L4;
                    if (i19 != 0) {
                        if (!snVar4.H4.isEmpty()) {
                            if (i19 == ((Integer) i2.d.h(1, snVar4.H4)).intValue()) {
                                i13 = ((Integer) snVar4.H4.get(0)).intValue() + 1;
                                snVar4.O4 = true;
                            } else {
                                snVar4.O4 = false;
                                i13 = i19 - 1;
                            }
                        }
                        snVar4.N4 = i13;
                        if (!snVar4.O4) {
                            i13 = -i13;
                        }
                        snVar4.j(i19, 0, true, 0, true, i13);
                        snVar4.yc();
                        break;
                    }
                } else {
                    snVar4.j((int) snVar4.d4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                snVar.na(false);
                break;
            case 19:
                sn.b1(snVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", snVar.a());
                snVar.presentFragment(new uk(bundle2));
                break;
            case 21:
                sn.m0(snVar);
                break;
            case 22:
                sn.Y0(snVar);
                break;
            case 23:
                sn.i0(snVar);
                break;
            case 24:
                snVar.ga(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = snVar.W5;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (messageObject == null && sparseArrayArr[i20].size() != 0) {
                        messageObject = (MessageObject) snVar.o6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    snVar.X5[i20].clear();
                    snVar.Y5[i20].clear();
                }
                snVar.h9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && snVar.h != null))) {
                    snVar.Fb(messageObject);
                }
                snVar.Cc(0, true);
                snVar.ad(false);
                snVar.Pc();
                break;
            case 26:
                sn.c1(snVar);
                break;
            case 27:
                sn snVar5 = this.b;
                MessageObject messageObject3 = snVar5.p5;
                if (messageObject3 != null) {
                    snVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                snVar.qa(snVar.J9() ? "" : null);
                break;
            default:
                snVar.T7();
                snVar.y3.m(snVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
