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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ ve(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        qn qnVar = this.b;
        switch (i11) {
            case 0:
                qn qnVar2 = this.b;
                sg.k0.D1(qnVar2, qnVar2.D1, qnVar2.E1, qnVar2.T5, false);
                break;
            case 1:
                qnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", qnVar.r);
                qnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (qnVar.K3 != null) {
                    qnVar.Qb(!qnVar.zc.f);
                    break;
                }
                break;
            case 3:
                qnVar.pb(!qnVar.A0.N);
                break;
            case 4:
                xj xjVar = qnVar.I1;
                if (xjVar != null) {
                    xjVar.setReversed(true);
                    qnVar.I1.getAdapter().k0 = true;
                    qnVar.p7();
                }
                qnVar.S2.setVisibility(8);
                qnVar.T2.setVisibility(8);
                qnVar.n3 = true;
                qnVar.o3 = null;
                qnVar.p3 = null;
                qnVar.j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                qnVar.j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(qnVar.j0.getSearchField());
                org.telegram.ui.ActionBar.u0 u0Var = qnVar.j0;
                u0Var.r = null;
                ei.e2 e2Var = u0Var.e;
                if (e2Var != null) {
                    e2Var.setText("");
                    break;
                }
                break;
            case 5:
                if (qnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = qnVar.j0;
                    if (u0Var2 != null) {
                        AndroidUtilities.hideKeyboard(u0Var2.getSearchField());
                    }
                    qnVar.showDialog(org.telegram.ui.Components.f5.o(qnVar.getParentActivity(), new yk(qnVar), qnVar.ea).a);
                    break;
                }
                break;
            case 6:
                qnVar.D7(true);
                break;
            case 7:
                MessageObject messageObject2 = qnVar.d5;
                if (messageObject2 != null) {
                    qnVar.O9(messageObject2, false, false);
                    pf.d.q(qnVar.getParentActivity(), Uri.parse(qnVar.d5.sponsoredUrl), true, false, false, null, null, false, qnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(qnVar.d5.sponsoredInfo)) {
                    org.telegram.messenger.mk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qnVar.getParentActivity()), qnVar.ea));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(qnVar.d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.mk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qnVar.getParentActivity()), qnVar.ea));
                    break;
                }
                break;
            case 10:
                if (qnVar.X0 != null && qnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 i15 = org.telegram.messenger.mk.i(1, qnVar.X0.getContext(), null, false);
                    Activity parentActivity = qnVar.getParentActivity();
                    on onVar = qnVar.ea;
                    final c81 c81Var = new c81(parentActivity);
                    LinearLayout e = org.telegram.messenger.g0.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i16 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, onVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(parentActivity, onVar);
                    x90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), onVar));
                    x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, onVar));
                    x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, onVar));
                    x90Var.setTextSize(1, 14.0f);
                    x90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var.setOnLinkPressListener(new org.telegram.ui.Components.w90() { // from class: org.telegram.ui.a81
                        @Override // org.telegram.ui.Components.w90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(c81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(c81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(c81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.x90 x90Var2 = new org.telegram.ui.Components.x90(parentActivity, null);
                    x90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), onVar));
                    x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, onVar));
                    x90Var2.setTextSize(1, 14.0f);
                    x90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var2.setOnLinkPressListener(new org.telegram.ui.Components.w90() { // from class: org.telegram.ui.a81
                        @Override // org.telegram.ui.Components.w90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(c81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(c81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(c81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.x90 x90Var3 = new org.telegram.ui.Components.x90(parentActivity, null);
                    x90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), onVar));
                    x90Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, onVar));
                    x90Var3.setTextSize(1, 14.0f);
                    x90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var3.setOnLinkPressListener(new org.telegram.ui.Components.w90() { // from class: org.telegram.ui.a81
                        @Override // org.telegram.ui.Components.w90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(c81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(c81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(c81Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i17 = org.telegram.ui.ActionBar.h6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.h6.w0(i17, onVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    kk kkVar = new kk(parentActivity, paint);
                    kkVar.setOnClickListener(new b81(parentActivity));
                    kkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    kkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    kkVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i17, onVar));
                    kkVar.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.h5, onVar)));
                    kkVar.setTextSize(1, 14.0f);
                    kkVar.setGravity(16);
                    org.telegram.ui.Components.x90 x90Var4 = new org.telegram.ui.Components.x90(parentActivity, null);
                    x90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), onVar));
                    x90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    x90Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, onVar));
                    x90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(textView);
                    x90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var, w7.z5.t(-1, -2, 0, 0, 18, 0, 0));
                    x90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var2, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    x90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var3, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    e.addView(kkVar, w7.z5.t(-2, 34, 1, 22, 14, 22, 0));
                    x90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(x90Var4, w7.z5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(c81Var.getContext());
                    scrollView.addView(e);
                    c81Var.addView(scrollView, w7.z5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i15.customView = c81Var;
                    i15.show();
                    break;
                }
                break;
            case 11:
                qnVar.finishPreviewFragment();
                break;
            case 12:
                qnVar.getClass();
                qnVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) qnVar, 28, true));
                break;
            case 13:
                qn qnVar3 = this.b;
                org.telegram.ui.Components.f5.i0(qnVar3, qnVar3.T5, qnVar3.f, qnVar3.e, qnVar3.h, qnVar3.N1.getTag(R.id.object_tag) != null, qnVar3.Z7, new sg(qnVar3, i12), qnVar3.ea);
                break;
            case 14:
                qn.k0(qnVar);
                break;
            case 15:
                if (qnVar.c4 != null) {
                    TopicsController topicsController = qnVar.getMessagesController().getTopicsController();
                    long j10 = qnVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = qnVar.c4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i18, false);
                }
                qnVar.Wc();
                qnVar.mc(false);
                qnVar.Vc(true);
                break;
            case 16:
                long j11 = qnVar.T5;
                if (qnVar.h != null) {
                    j11 = qnVar.f.id;
                }
                qnVar.Yb = false;
                qnVar.getMessagesController().hidePeerSettingsBar(j11, qnVar.f, qnVar.e);
                qnVar.Vc(true);
                qnVar.tc(true);
                break;
            case 17:
                qn qnVar4 = this.b;
                qnVar4.D4 = true;
                if (!qnVar4.K9() || qnVar4.h4) {
                    int i19 = qnVar4.L4;
                    if (i19 != 0) {
                        if (!qnVar4.H4.isEmpty()) {
                            if (i19 == ((Integer) i2.e.h(1, qnVar4.H4)).intValue()) {
                                i13 = ((Integer) qnVar4.H4.get(0)).intValue() + 1;
                                qnVar4.O4 = true;
                            } else {
                                qnVar4.O4 = false;
                                i13 = i19 - 1;
                            }
                        }
                        qnVar4.N4 = i13;
                        if (!qnVar4.O4) {
                            i13 = -i13;
                        }
                        qnVar4.j(i19, 0, true, 0, true, i13);
                        qnVar4.zc();
                        break;
                    }
                } else {
                    qnVar4.j((int) qnVar4.d4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                qnVar.na(false);
                break;
            case 19:
                qn.b1(qnVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", qnVar.a());
                qnVar.presentFragment(new sk(bundle2));
                break;
            case 21:
                qn.m0(qnVar);
                break;
            case 22:
                qn.Y0(qnVar);
                break;
            case 23:
                qn.i0(qnVar);
                break;
            case 24:
                qnVar.ga(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = qnVar.W5;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (messageObject == null && sparseArrayArr[i20].size() != 0) {
                        messageObject = (MessageObject) qnVar.o6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    qnVar.X5[i20].clear();
                    qnVar.Y5[i20].clear();
                }
                qnVar.h9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && qnVar.h != null))) {
                    qnVar.Gb(messageObject);
                }
                qnVar.Dc(0, true);
                qnVar.bd(false);
                qnVar.Qc();
                break;
            case 26:
                qn.c1(qnVar);
                break;
            case 27:
                qn qnVar5 = this.b;
                MessageObject messageObject3 = qnVar5.p5;
                if (messageObject3 != null) {
                    qnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                qnVar.qa(qnVar.J9() ? "" : null);
                break;
            default:
                qnVar.T7();
                qnVar.y3.m(qnVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
