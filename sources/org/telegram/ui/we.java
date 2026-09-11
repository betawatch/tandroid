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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ co b;

    public /* synthetic */ we(co coVar, int i10) {
        this.a = i10;
        this.b = coVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        co coVar = this.b;
        switch (i11) {
            case 0:
                co coVar2 = this.b;
                sg.k0.C1(coVar2, coVar2.D1, coVar2.E1, coVar2.T5, false);
                break;
            case 1:
                coVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", coVar.r);
                coVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (coVar.K3 != null) {
                    coVar.Lb(!coVar.yc.f);
                    break;
                }
                break;
            case 3:
                coVar.kb(!coVar.A0.N);
                break;
            case 4:
                fk fkVar = coVar.I1;
                if (fkVar != null) {
                    fkVar.setReversed(true);
                    coVar.I1.getAdapter().k0 = true;
                    coVar.m7();
                }
                coVar.S2.setVisibility(8);
                coVar.T2.setVisibility(8);
                coVar.n3 = true;
                coVar.o3 = null;
                coVar.p3 = null;
                coVar.j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                coVar.j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(coVar.j0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = coVar.j0;
                v0Var.r = null;
                di.h2 h2Var = v0Var.e;
                if (h2Var != null) {
                    h2Var.setText("");
                    break;
                }
                break;
            case 5:
                if (coVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = coVar.j0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    coVar.showDialog(org.telegram.ui.Components.e5.p(coVar.getParentActivity(), new fl(coVar), coVar.ea).a);
                    break;
                }
                break;
            case 6:
                coVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = coVar.d5;
                if (messageObject2 != null) {
                    coVar.J9(messageObject2, false, false);
                    of.f.r(coVar.getParentActivity(), Uri.parse(coVar.d5.sponsoredUrl), true, false, false, null, null, false, coVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(coVar.d5.sponsoredInfo)) {
                    org.telegram.messenger.vl.o(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.ea));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(coVar.d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.vl.o(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(coVar.getParentActivity()), coVar.ea));
                    break;
                }
                break;
            case 10:
                if (coVar.X0 != null && coVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 i15 = org.telegram.messenger.vl.i(1, coVar.X0.getContext(), null, false);
                    Activity parentActivity = coVar.getParentActivity();
                    ao aoVar = coVar.ea;
                    final n91 n91Var = new n91(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.w1.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i16 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, aoVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(parentActivity, aoVar);
                    d90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), aoVar));
                    d90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, aoVar));
                    d90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, aoVar));
                    d90Var.setTextSize(1, 14.0f);
                    d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var.setOnLinkPressListener(new org.telegram.ui.Components.c90() { // from class: org.telegram.ui.l91
                        @Override // org.telegram.ui.Components.c90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(n91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.d90 d90Var2 = new org.telegram.ui.Components.d90(parentActivity, null);
                    d90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), aoVar));
                    d90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, aoVar));
                    d90Var2.setTextSize(1, 14.0f);
                    d90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var2.setOnLinkPressListener(new org.telegram.ui.Components.c90() { // from class: org.telegram.ui.l91
                        @Override // org.telegram.ui.Components.c90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(n91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.d90 d90Var3 = new org.telegram.ui.Components.d90(parentActivity, null);
                    d90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), aoVar));
                    d90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, aoVar));
                    d90Var3.setTextSize(1, 14.0f);
                    d90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var3.setOnLinkPressListener(new org.telegram.ui.Components.c90() { // from class: org.telegram.ui.l91
                        @Override // org.telegram.ui.Components.c90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(n91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(n91Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i17 = org.telegram.ui.ActionBar.j6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(i17, aoVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    sk skVar = new sk(parentActivity, paint);
                    skVar.setOnClickListener(new m91(parentActivity));
                    skVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    skVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    skVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, aoVar));
                    skVar.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, aoVar)));
                    skVar.setTextSize(1, 14.0f);
                    skVar.setGravity(16);
                    org.telegram.ui.Components.d90 d90Var4 = new org.telegram.ui.Components.d90(parentActivity, null);
                    d90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), aoVar));
                    d90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, aoVar));
                    d90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    d90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var, w7.x5.t(-1, -2, 0, 0, 18, 0, 0));
                    d90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var2, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    d90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var3, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(skVar, w7.x5.t(-2, 34, 1, 22, 14, 22, 0));
                    d90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var4, w7.x5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(n91Var.getContext());
                    scrollView.addView(f7);
                    n91Var.addView(scrollView, w7.x5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i15.customView = n91Var;
                    i15.show();
                    break;
                }
                break;
            case 11:
                coVar.finishPreviewFragment();
                break;
            case 12:
                coVar.getClass();
                coVar.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) coVar, 28, true));
                break;
            case 13:
                co coVar3 = this.b;
                org.telegram.ui.Components.e5.j0(coVar3, coVar3.T5, coVar3.f, coVar3.e, coVar3.h, coVar3.N1.getTag(R.id.object_tag) != null, coVar3.Z7, new ch(coVar3, i12), coVar3.ea);
                break;
            case 14:
                co.j0(coVar);
                break;
            case 15:
                if (coVar.c4 != null) {
                    TopicsController topicsController = coVar.getMessagesController().getTopicsController();
                    long j3 = coVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = coVar.c4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j3, i18, false);
                }
                coVar.Rc();
                coVar.hc(false);
                coVar.Qc(true);
                break;
            case 16:
                long j10 = coVar.T5;
                if (coVar.h != null) {
                    j10 = coVar.f.id;
                }
                coVar.Yb = false;
                coVar.getMessagesController().hidePeerSettingsBar(j10, coVar.f, coVar.e);
                coVar.Qc(true);
                coVar.oc(true);
                break;
            case 17:
                co coVar4 = this.b;
                coVar4.D4 = true;
                if (!coVar4.F9() || coVar4.h4) {
                    int i19 = coVar4.L4;
                    if (i19 != 0) {
                        if (!coVar4.H4.isEmpty()) {
                            if (i19 == ((Integer) i2.g.h(1, coVar4.H4)).intValue()) {
                                i13 = ((Integer) coVar4.H4.get(0)).intValue() + 1;
                                coVar4.O4 = true;
                            } else {
                                coVar4.O4 = false;
                                i13 = i19 - 1;
                            }
                        }
                        coVar4.N4 = i13;
                        if (!coVar4.O4) {
                            i13 = -i13;
                        }
                        coVar4.F(i19, 0, 0, i13, true, true);
                        coVar4.uc();
                        break;
                    }
                } else {
                    coVar4.F((int) coVar4.d4, 0, 0, 0, true, true);
                    break;
                }
                break;
            case 18:
                coVar.ia(false);
                break;
            case 19:
                co.Z(coVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", coVar.a());
                coVar.presentFragment(new al(bundle2));
                break;
            case 21:
                co.C0(coVar);
                break;
            case 22:
                co.L0(coVar);
                break;
            case 23:
                co.b1(coVar);
                break;
            case 24:
                coVar.ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = coVar.W5;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (messageObject == null && sparseArrayArr[i20].size() != 0) {
                        messageObject = (MessageObject) coVar.o6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    coVar.X5[i20].clear();
                    coVar.Y5[i20].clear();
                }
                coVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && coVar.h != null))) {
                    coVar.Bb(messageObject);
                }
                coVar.yc(0, true);
                coVar.Wc(false);
                coVar.Lc();
                break;
            case 26:
                co.f1(coVar);
                break;
            case 27:
                co coVar5 = this.b;
                MessageObject messageObject3 = coVar5.p5;
                if (messageObject3 != null) {
                    coVar5.F(messageObject3.getId(), 0, 0, 0, true, true);
                    break;
                }
                break;
            case 28:
                coVar.la(coVar.E9() ? "" : null);
                break;
            default:
                coVar.Q7();
                coVar.y3.m(coVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
