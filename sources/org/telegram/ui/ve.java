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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ bo b;

    public /* synthetic */ ve(bo boVar, int i10) {
        this.a = i10;
        this.b = boVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        bo boVar = this.b;
        switch (i11) {
            case 0:
                bo boVar2 = this.b;
                rg.j0.C1(boVar2, boVar2.D1, boVar2.E1, boVar2.T5, false);
                break;
            case 1:
                boVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", boVar.r);
                boVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (boVar.K3 != null) {
                    boVar.Lb(!boVar.xc.f);
                    break;
                }
                break;
            case 3:
                boVar.kb(!boVar.A0.N);
                break;
            case 4:
                fk fkVar = boVar.I1;
                if (fkVar != null) {
                    fkVar.setReversed(true);
                    boVar.I1.getAdapter().k0 = true;
                    boVar.m7();
                }
                boVar.S2.setVisibility(8);
                boVar.T2.setVisibility(8);
                boVar.n3 = true;
                boVar.o3 = null;
                boVar.p3 = null;
                boVar.j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                boVar.j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(boVar.j0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = boVar.j0;
                v0Var.r = null;
                ci.h2 h2Var = v0Var.e;
                if (h2Var != null) {
                    h2Var.setText("");
                    break;
                }
                break;
            case 5:
                if (boVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = boVar.j0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    boVar.showDialog(org.telegram.ui.Components.c5.p(boVar.getParentActivity(), new fl(boVar), boVar.ea).a);
                    break;
                }
                break;
            case 6:
                boVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = boVar.d5;
                if (messageObject2 != null) {
                    boVar.J9(messageObject2, false, false);
                    nf.f.r(boVar.getParentActivity(), Uri.parse(boVar.d5.sponsoredUrl), true, false, false, null, null, false, boVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(boVar.d5.sponsoredInfo)) {
                    org.telegram.messenger.vl.p(R.string.TextCopied, new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.ea));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(boVar.d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.vl.p(R.string.TextCopied, new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(boVar.getParentActivity()), boVar.ea));
                    break;
                }
                break;
            case 10:
                if (boVar.X0 != null && boVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 j3 = org.telegram.messenger.vl.j(1, boVar.X0.getContext(), null, false);
                    Activity parentActivity = boVar.getParentActivity();
                    zn znVar = boVar.ea;
                    final k91 k91Var = new k91(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.y0.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i15 = org.telegram.ui.ActionBar.i6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, znVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.c90 c90Var = new org.telegram.ui.Components.c90(parentActivity, znVar);
                    c90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), znVar));
                    c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, znVar));
                    c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, znVar));
                    c90Var.setTextSize(1, 14.0f);
                    c90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    c90Var.setOnLinkPressListener(new org.telegram.ui.Components.b90() { // from class: org.telegram.ui.i91
                        @Override // org.telegram.ui.Components.b90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(k91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(k91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(k91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.c90 c90Var2 = new org.telegram.ui.Components.c90(parentActivity, null);
                    c90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), znVar));
                    c90Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, znVar));
                    c90Var2.setTextSize(1, 14.0f);
                    c90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    c90Var2.setOnLinkPressListener(new org.telegram.ui.Components.b90() { // from class: org.telegram.ui.i91
                        @Override // org.telegram.ui.Components.b90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(k91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(k91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(k91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.c90 c90Var3 = new org.telegram.ui.Components.c90(parentActivity, null);
                    c90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), znVar));
                    c90Var3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, znVar));
                    c90Var3.setTextSize(1, 14.0f);
                    c90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    c90Var3.setOnLinkPressListener(new org.telegram.ui.Components.b90() { // from class: org.telegram.ui.i91
                        @Override // org.telegram.ui.Components.b90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(k91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(k91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(k91Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.i6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.i6.v0(i16, znVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    sk skVar = new sk(parentActivity, paint);
                    skVar.setOnClickListener(new j91(parentActivity));
                    skVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    skVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    skVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i16, znVar));
                    skVar.setBackground(org.telegram.ui.ActionBar.y5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, znVar)));
                    skVar.setTextSize(1, 14.0f);
                    skVar.setGravity(16);
                    org.telegram.ui.Components.c90 c90Var4 = new org.telegram.ui.Components.c90(parentActivity, null);
                    c90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), znVar));
                    c90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    c90Var4.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, znVar));
                    c90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    c90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(c90Var, w7.x5.t(-1, -2, 0, 0, 18, 0, 0));
                    c90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(c90Var2, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    c90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(c90Var3, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(skVar, w7.x5.t(-2, 34, 1, 22, 14, 22, 0));
                    c90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(c90Var4, w7.x5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(k91Var.getContext());
                    scrollView.addView(f7);
                    k91Var.addView(scrollView, w7.x5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j3.customView = k91Var;
                    j3.show();
                    break;
                }
                break;
            case 11:
                boVar.finishPreviewFragment();
                break;
            case 12:
                boVar.getClass();
                boVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) boVar, 28, true));
                break;
            case 13:
                bo boVar3 = this.b;
                org.telegram.ui.Components.c5.j0(boVar3, boVar3.T5, boVar3.f, boVar3.e, boVar3.h, boVar3.N1.getTag(R.id.object_tag) != null, boVar3.Z7, new ch(boVar3, i12), boVar3.ea);
                break;
            case 14:
                bo.j0(boVar);
                break;
            case 15:
                if (boVar.c4 != null) {
                    TopicsController topicsController = boVar.getMessagesController().getTopicsController();
                    long j10 = boVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = boVar.c4;
                    int i17 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i17, false);
                }
                boVar.Rc();
                boVar.hc(false);
                boVar.Qc(true);
                break;
            case 16:
                long j11 = boVar.T5;
                if (boVar.h != null) {
                    j11 = boVar.f.id;
                }
                boVar.Xb = false;
                boVar.getMessagesController().hidePeerSettingsBar(j11, boVar.f, boVar.e);
                boVar.Qc(true);
                boVar.oc(true);
                break;
            case 17:
                bo boVar4 = this.b;
                boVar4.D4 = true;
                if (!boVar4.F9() || boVar4.h4) {
                    int i18 = boVar4.L4;
                    if (i18 != 0) {
                        if (!boVar4.H4.isEmpty()) {
                            if (i18 == ((Integer) hg.c.h(1, boVar4.H4)).intValue()) {
                                i13 = ((Integer) boVar4.H4.get(0)).intValue() + 1;
                                boVar4.O4 = true;
                            } else {
                                boVar4.O4 = false;
                                i13 = i18 - 1;
                            }
                        }
                        boVar4.N4 = i13;
                        if (!boVar4.O4) {
                            i13 = -i13;
                        }
                        boVar4.F(i18, 0, 0, i13, true, true);
                        boVar4.uc();
                        break;
                    }
                } else {
                    boVar4.F((int) boVar4.d4, 0, 0, 0, true, true);
                    break;
                }
                break;
            case 18:
                boVar.ia(false);
                break;
            case 19:
                bo.Z(boVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", boVar.a());
                boVar.presentFragment(new al(bundle2));
                break;
            case 21:
                bo.C0(boVar);
                break;
            case 22:
                bo.L0(boVar);
                break;
            case 23:
                bo.b1(boVar);
                break;
            case 24:
                boVar.ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = boVar.W5;
                for (int i19 = 1; i19 >= 0; i19--) {
                    if (messageObject == null && sparseArrayArr[i19].size() != 0) {
                        messageObject = (MessageObject) boVar.o6[i19].get(sparseArrayArr[i19].keyAt(0));
                    }
                    sparseArrayArr[i19].clear();
                    boVar.X5[i19].clear();
                    boVar.Y5[i19].clear();
                }
                boVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && boVar.h != null))) {
                    boVar.Bb(messageObject);
                }
                boVar.yc(0, true);
                boVar.Wc(false);
                boVar.Lc();
                break;
            case 26:
                bo.f1(boVar);
                break;
            case 27:
                bo boVar5 = this.b;
                MessageObject messageObject3 = boVar5.p5;
                if (messageObject3 != null) {
                    boVar5.F(messageObject3.getId(), 0, 0, 0, true, true);
                    break;
                }
                break;
            case 28:
                boVar.la(boVar.E9() ? "" : null);
                break;
            default:
                boVar.Q7();
                boVar.y3.m(boVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
