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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ ve(sn snVar, int i10) {
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
                sg.j0.G1(snVar2, snVar2.P1, snVar2.Q1, snVar2.f6, false);
                break;
            case 1:
                snVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", snVar.r);
                snVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (snVar.W3 != null) {
                    snVar.Rb(!snVar.Mc.f);
                    break;
                }
                break;
            case 3:
                snVar.qb(!snVar.A0.N);
                break;
            case 4:
                yj yjVar = snVar.U1;
                if (yjVar != null) {
                    yjVar.setReversed(true);
                    snVar.U1.getAdapter().k0 = true;
                    snVar.p7();
                }
                snVar.e3.setVisibility(8);
                snVar.f3.setVisibility(8);
                snVar.z3 = true;
                snVar.A3 = null;
                snVar.B3 = null;
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
                    snVar.showDialog(org.telegram.ui.Components.f5.p(snVar.getParentActivity(), new zk(snVar), snVar.qa).a);
                    break;
                }
                break;
            case 6:
                snVar.D7(true);
                break;
            case 7:
                MessageObject messageObject2 = snVar.p5;
                if (messageObject2 != null) {
                    snVar.O9(messageObject2, false, false);
                    pf.d.q(snVar.getParentActivity(), Uri.parse(snVar.p5.sponsoredUrl), true, false, false, null, null, false, snVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(snVar.p5.sponsoredInfo)) {
                    org.telegram.messenger.sl.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.qa));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(snVar.p5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.sl.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.qa));
                    break;
                }
                break;
            case 10:
                if (snVar.j1 != null && snVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.h3 j10 = org.telegram.messenger.sl.j(1, snVar.j1.getContext(), null, false);
                    Activity parentActivity = snVar.getParentActivity();
                    qn qnVar = snVar.qa;
                    final h81 h81Var = new h81(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.v0.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i15 = org.telegram.ui.ActionBar.k6.G6;
                    org.telegram.ui.ActionBar.r6.W(textView, i15, qnVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(parentActivity, qnVar);
                    y90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), qnVar));
                    org.telegram.ui.ActionBar.r6.I(y90Var, org.telegram.ui.ActionBar.k6.gc, qnVar);
                    org.telegram.ui.ActionBar.r6.W(y90Var, i15, qnVar);
                    y90Var.setTextSize(1, 14.0f);
                    y90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    y90Var.setOnLinkPressListener(new org.telegram.ui.Components.x90() { // from class: org.telegram.ui.f81
                        @Override // org.telegram.ui.Components.x90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(h81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(h81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(h81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.y90 y90Var2 = new org.telegram.ui.Components.y90(parentActivity, null);
                    y90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), qnVar));
                    org.telegram.ui.ActionBar.r6.W(y90Var2, i15, qnVar);
                    y90Var2.setTextSize(1, 14.0f);
                    y90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    y90Var2.setOnLinkPressListener(new org.telegram.ui.Components.x90() { // from class: org.telegram.ui.f81
                        @Override // org.telegram.ui.Components.x90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(h81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(h81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(h81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.y90 y90Var3 = new org.telegram.ui.Components.y90(parentActivity, null);
                    y90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), qnVar));
                    org.telegram.ui.ActionBar.r6.W(y90Var3, i15, qnVar);
                    y90Var3.setTextSize(1, 14.0f);
                    y90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    y90Var3.setOnLinkPressListener(new org.telegram.ui.Components.x90() { // from class: org.telegram.ui.f81
                        @Override // org.telegram.ui.Components.x90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(h81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(h81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(h81Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.k6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.k6.w0(i16, qnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    lk lkVar = new lk(parentActivity, paint);
                    lkVar.setOnClickListener(new g81(parentActivity));
                    lkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    lkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    org.telegram.ui.ActionBar.r6.W(lkVar, i16, qnVar);
                    int i17 = org.telegram.ui.ActionBar.k6.h5;
                    org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.a6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.k6.w0(i17, qnVar));
                    org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i17);
                    org.telegram.ui.ActionBar.n6 f10 = org.telegram.ui.ActionBar.r6.f(i17);
                    lkVar.setBackground(e);
                    org.telegram.ui.ActionBar.r6.k(lkVar, e, O, f10, qnVar);
                    lkVar.setTextSize(1, 14.0f);
                    lkVar.setGravity(16);
                    org.telegram.ui.Components.y90 y90Var4 = new org.telegram.ui.Components.y90(parentActivity, null);
                    y90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), qnVar));
                    y90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.r6.W(y90Var4, i15, qnVar);
                    y90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    y90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(y90Var, w7.z5.t(-1, -2, 0, 0, 18, 0, 0));
                    y90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(y90Var2, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    y90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(y90Var3, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(lkVar, w7.z5.t(-2, 34, 1, 22, 14, 22, 0));
                    y90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(y90Var4, w7.z5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(h81Var.getContext());
                    scrollView.addView(f7);
                    h81Var.addView(scrollView, w7.z5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j10.customView = h81Var;
                    j10.show();
                    break;
                }
                break;
            case 11:
                snVar.finishPreviewFragment();
                break;
            case 12:
                snVar.getClass();
                snVar.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) snVar, 28, true));
                break;
            case 13:
                sn snVar3 = this.b;
                org.telegram.ui.Components.f5.j0(snVar3, snVar3.f6, snVar3.f, snVar3.e, snVar3.h, snVar3.Z1.getTag(R.id.object_tag) != null, snVar3.l8, new rg(snVar3, i12), snVar3.qa);
                break;
            case 14:
                sn.j0(snVar);
                break;
            case 15:
                if (snVar.o4 != null) {
                    TopicsController topicsController = snVar.getMessagesController().getTopicsController();
                    long j11 = snVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = snVar.o4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j11, i18, false);
                }
                snVar.Yc();
                snVar.oc(false);
                snVar.Xc(true);
                break;
            case 16:
                long j12 = snVar.f6;
                if (snVar.h != null) {
                    j12 = snVar.f.id;
                }
                snVar.lc = false;
                snVar.getMessagesController().hidePeerSettingsBar(j12, snVar.f, snVar.e);
                snVar.Xc(true);
                snVar.vc(true);
                break;
            case 17:
                sn snVar4 = this.b;
                snVar4.P4 = true;
                if (!snVar4.K9() || snVar4.t4) {
                    int i19 = snVar4.X4;
                    if (i19 != 0) {
                        if (!snVar4.T4.isEmpty()) {
                            if (i19 == ((Integer) i2.o1.i(1, snVar4.T4)).intValue()) {
                                i13 = ((Integer) snVar4.T4.get(0)).intValue() + 1;
                                snVar4.a5 = true;
                            } else {
                                snVar4.a5 = false;
                                i13 = i19 - 1;
                            }
                        }
                        snVar4.Z4 = i13;
                        if (!snVar4.a5) {
                            i13 = -i13;
                        }
                        snVar4.j(i19, 0, true, 0, true, i13);
                        snVar4.Bc();
                        break;
                    }
                } else {
                    snVar4.j((int) snVar4.p4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                snVar.na(false);
                break;
            case 19:
                sn.f1(snVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", snVar.a());
                snVar.presentFragment(new tk(bundle2));
                break;
            case 21:
                sn.l0(snVar);
                break;
            case 22:
                sn.d1(snVar);
                break;
            case 23:
                sn.h0(snVar);
                break;
            case 24:
                snVar.ga(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = snVar.i6;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (messageObject == null && sparseArrayArr[i20].size() != 0) {
                        messageObject = (MessageObject) snVar.A6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    snVar.j6[i20].clear();
                    snVar.k6[i20].clear();
                }
                snVar.h9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && snVar.h != null))) {
                    snVar.Hb(messageObject);
                }
                snVar.Fc(0, true);
                snVar.dd(false);
                snVar.Sc();
                break;
            case 26:
                sn.g1(snVar);
                break;
            case 27:
                sn snVar5 = this.b;
                MessageObject messageObject3 = snVar5.B5;
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
                snVar.K3.m(snVar.f6, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
