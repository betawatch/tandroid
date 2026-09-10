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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo b;

    public /* synthetic */ ye(eo eoVar, int i10) {
        this.a = i10;
        this.b = eoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        eo eoVar = this.b;
        switch (i11) {
            case 0:
                eo eoVar2 = this.b;
                qg.k0.C1(eoVar2, eoVar2.D1, eoVar2.E1, eoVar2.T5, false);
                break;
            case 1:
                eoVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", eoVar.r);
                eoVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (eoVar.K3 != null) {
                    eoVar.Lb(!eoVar.yc.f);
                    break;
                }
                break;
            case 3:
                eoVar.kb(!eoVar.A0.N);
                break;
            case 4:
                hk hkVar = eoVar.I1;
                if (hkVar != null) {
                    hkVar.setReversed(true);
                    eoVar.I1.getAdapter().k0 = true;
                    eoVar.m7();
                }
                eoVar.S2.setVisibility(8);
                eoVar.T2.setVisibility(8);
                eoVar.n3 = true;
                eoVar.o3 = null;
                eoVar.p3 = null;
                eoVar.j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                eoVar.j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(eoVar.j0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = eoVar.j0;
                w0Var.r = null;
                bi.t2 t2Var = w0Var.e;
                if (t2Var != null) {
                    t2Var.setText("");
                    break;
                }
                break;
            case 5:
                if (eoVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = eoVar.j0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    eoVar.showDialog(org.telegram.ui.Components.d5.p(eoVar.getParentActivity(), new hl(eoVar), eoVar.ea).a);
                    break;
                }
                break;
            case 6:
                eoVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = eoVar.d5;
                if (messageObject2 != null) {
                    eoVar.J9(messageObject2, false, false);
                    nf.f.r(eoVar.getParentActivity(), Uri.parse(eoVar.d5.sponsoredUrl), true, false, false, null, null, false, eoVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(eoVar.d5.sponsoredInfo)) {
                    org.telegram.messenger.em.o(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(eoVar.getParentActivity()), eoVar.ea));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(eoVar.d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.em.o(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(eoVar.getParentActivity()), eoVar.ea));
                    break;
                }
                break;
            case 10:
                if (eoVar.X0 != null && eoVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.h3 i15 = org.telegram.messenger.em.i(1, eoVar.X0.getContext(), null, false);
                    Activity parentActivity = eoVar.getParentActivity();
                    bo boVar = eoVar.ea;
                    final q91 q91Var = new q91(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.a2.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i16 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, boVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(parentActivity, boVar);
                    m90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), boVar));
                    m90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, boVar));
                    m90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, boVar));
                    m90Var.setTextSize(1, 14.0f);
                    m90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    m90Var.setOnLinkPressListener(new org.telegram.ui.Components.l90() { // from class: org.telegram.ui.o91
                        @Override // org.telegram.ui.Components.l90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(q91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(q91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(q91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.m90 m90Var2 = new org.telegram.ui.Components.m90(parentActivity, null);
                    m90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), boVar));
                    m90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, boVar));
                    m90Var2.setTextSize(1, 14.0f);
                    m90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    m90Var2.setOnLinkPressListener(new org.telegram.ui.Components.l90() { // from class: org.telegram.ui.o91
                        @Override // org.telegram.ui.Components.l90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(q91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(q91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(q91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.m90 m90Var3 = new org.telegram.ui.Components.m90(parentActivity, null);
                    m90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), boVar));
                    m90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, boVar));
                    m90Var3.setTextSize(1, 14.0f);
                    m90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    m90Var3.setOnLinkPressListener(new org.telegram.ui.Components.l90() { // from class: org.telegram.ui.o91
                        @Override // org.telegram.ui.Components.l90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(q91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(q91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(q91Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i17 = org.telegram.ui.ActionBar.j6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(i17, boVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    uk ukVar = new uk(parentActivity, paint);
                    ukVar.setOnClickListener(new p91(parentActivity));
                    ukVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    ukVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    ukVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i17, boVar));
                    ukVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, boVar)));
                    ukVar.setTextSize(1, 14.0f);
                    ukVar.setGravity(16);
                    org.telegram.ui.Components.m90 m90Var4 = new org.telegram.ui.Components.m90(parentActivity, null);
                    m90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), boVar));
                    m90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    m90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, boVar));
                    m90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    m90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(m90Var, w7.a6.t(-1, -2, 0, 0, 18, 0, 0));
                    m90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(m90Var2, w7.a6.t(-1, -2, 0, 0, 24, 0, 0));
                    m90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(m90Var3, w7.a6.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(ukVar, w7.a6.t(-2, 34, 1, 22, 14, 22, 0));
                    m90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(m90Var4, w7.a6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(q91Var.getContext());
                    scrollView.addView(f7);
                    q91Var.addView(scrollView, w7.a6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i15.customView = q91Var;
                    i15.show();
                    break;
                }
                break;
            case 11:
                eoVar.finishPreviewFragment();
                break;
            case 12:
                eoVar.getClass();
                eoVar.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) eoVar, 28, true));
                break;
            case 13:
                eo eoVar3 = this.b;
                org.telegram.ui.Components.d5.j0(eoVar3, eoVar3.T5, eoVar3.f, eoVar3.e, eoVar3.h, eoVar3.N1.getTag(R.id.object_tag) != null, eoVar3.Z7, new dh(eoVar3, i12), eoVar3.ea);
                break;
            case 14:
                eo.j0(eoVar);
                break;
            case 15:
                if (eoVar.c4 != null) {
                    TopicsController topicsController = eoVar.getMessagesController().getTopicsController();
                    long j3 = eoVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = eoVar.c4;
                    int i18 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j3, i18, false);
                }
                eoVar.Rc();
                eoVar.hc(false);
                eoVar.Qc(true);
                break;
            case 16:
                long j10 = eoVar.T5;
                if (eoVar.h != null) {
                    j10 = eoVar.f.id;
                }
                eoVar.Yb = false;
                eoVar.getMessagesController().hidePeerSettingsBar(j10, eoVar.f, eoVar.e);
                eoVar.Qc(true);
                eoVar.oc(true);
                break;
            case 17:
                eo eoVar4 = this.b;
                eoVar4.D4 = true;
                if (!eoVar4.F9() || eoVar4.h4) {
                    int i19 = eoVar4.L4;
                    if (i19 != 0) {
                        if (!eoVar4.H4.isEmpty()) {
                            if (i19 == ((Integer) hc.b.i(1, eoVar4.H4)).intValue()) {
                                i13 = ((Integer) eoVar4.H4.get(0)).intValue() + 1;
                                eoVar4.O4 = true;
                            } else {
                                eoVar4.O4 = false;
                                i13 = i19 - 1;
                            }
                        }
                        eoVar4.N4 = i13;
                        if (!eoVar4.O4) {
                            i13 = -i13;
                        }
                        eoVar4.E(i19, 0, 0, i13, true, true);
                        eoVar4.uc();
                        break;
                    }
                } else {
                    eoVar4.E((int) eoVar4.d4, 0, 0, 0, true, true);
                    break;
                }
                break;
            case 18:
                eoVar.ia(false);
                break;
            case 19:
                eo.Z(eoVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", eoVar.a());
                eoVar.presentFragment(new cl(bundle2));
                break;
            case 21:
                eo.C0(eoVar);
                break;
            case 22:
                eo.L0(eoVar);
                break;
            case 23:
                eo.b1(eoVar);
                break;
            case 24:
                eoVar.ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = eoVar.W5;
                for (int i20 = 1; i20 >= 0; i20--) {
                    if (messageObject == null && sparseArrayArr[i20].size() != 0) {
                        messageObject = (MessageObject) eoVar.o6[i20].get(sparseArrayArr[i20].keyAt(0));
                    }
                    sparseArrayArr[i20].clear();
                    eoVar.X5[i20].clear();
                    eoVar.Y5[i20].clear();
                }
                eoVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && eoVar.h != null))) {
                    eoVar.Bb(messageObject);
                }
                eoVar.yc(0, true);
                eoVar.Wc(false);
                eoVar.Lc();
                break;
            case 26:
                eo.f1(eoVar);
                break;
            case 27:
                eo eoVar5 = this.b;
                MessageObject messageObject3 = eoVar5.p5;
                if (messageObject3 != null) {
                    eoVar5.E(messageObject3.getId(), 0, 0, 0, true, true);
                    break;
                }
                break;
            case 28:
                eoVar.la(eoVar.E9() ? "" : null);
                break;
            default:
                eoVar.Q7();
                eoVar.y3.m(eoVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
