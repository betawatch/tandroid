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

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ ve(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        wn wnVar = this.b;
        switch (i11) {
            case 0:
                wn wnVar2 = this.b;
                rg.j0.C1(wnVar2, wnVar2.D1, wnVar2.E1, wnVar2.T5, false);
                break;
            case 1:
                wnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", wnVar.r);
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (wnVar.K3 != null) {
                    wnVar.Lb(!wnVar.xc.f);
                    break;
                }
                break;
            case 3:
                wnVar.kb(!wnVar.A0.N);
                break;
            case 4:
                ck ckVar = wnVar.I1;
                if (ckVar != null) {
                    ckVar.setReversed(true);
                    wnVar.I1.getAdapter().k0 = true;
                    wnVar.m7();
                }
                wnVar.S2.setVisibility(8);
                wnVar.T2.setVisibility(8);
                wnVar.n3 = true;
                wnVar.o3 = null;
                wnVar.p3 = null;
                wnVar.j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                wnVar.j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(wnVar.j0.getSearchField());
                org.telegram.ui.ActionBar.u0 u0Var = wnVar.j0;
                u0Var.r = null;
                ci.h2 h2Var = u0Var.e;
                if (h2Var != null) {
                    h2Var.setText("");
                    break;
                }
                break;
            case 5:
                if (wnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u0 u0Var2 = wnVar.j0;
                    if (u0Var2 != null) {
                        AndroidUtilities.hideKeyboard(u0Var2.getSearchField());
                    }
                    wnVar.showDialog(org.telegram.ui.Components.e5.p(wnVar.getParentActivity(), new cl(wnVar), wnVar.ea).a);
                    break;
                }
                break;
            case 6:
                wnVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = wnVar.d5;
                if (messageObject2 != null) {
                    wnVar.J9(messageObject2, false, false);
                    nf.f.r(wnVar.getParentActivity(), Uri.parse(wnVar.d5.sponsoredUrl), true, false, false, null, null, false, wnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(wnVar.d5.sponsoredInfo)) {
                    org.telegram.messenger.ok.o(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.ea));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(wnVar.d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.ok.o(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.ea));
                    break;
                }
                break;
            case 10:
                if (wnVar.X0 != null && wnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e3 j3 = org.telegram.messenger.ok.j(1, wnVar.X0.getContext(), null, false);
                    Activity parentActivity = wnVar.getParentActivity();
                    un unVar = wnVar.ea;
                    final e91 e91Var = new e91(parentActivity);
                    LinearLayout e = org.telegram.messenger.f0.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i15 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, unVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(parentActivity, unVar);
                    n90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), unVar));
                    n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, unVar));
                    n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, unVar));
                    n90Var.setTextSize(1, 14.0f);
                    n90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    n90Var.setOnLinkPressListener(new org.telegram.ui.Components.m90() { // from class: org.telegram.ui.c91
                        @Override // org.telegram.ui.Components.m90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(e91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(e91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(e91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.n90 n90Var2 = new org.telegram.ui.Components.n90(parentActivity, null);
                    n90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), unVar));
                    n90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, unVar));
                    n90Var2.setTextSize(1, 14.0f);
                    n90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    n90Var2.setOnLinkPressListener(new org.telegram.ui.Components.m90() { // from class: org.telegram.ui.c91
                        @Override // org.telegram.ui.Components.m90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(e91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(e91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(e91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.n90 n90Var3 = new org.telegram.ui.Components.n90(parentActivity, null);
                    n90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), unVar));
                    n90Var3.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, unVar));
                    n90Var3.setTextSize(1, 14.0f);
                    n90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    n90Var3.setOnLinkPressListener(new org.telegram.ui.Components.m90() { // from class: org.telegram.ui.c91
                        @Override // org.telegram.ui.Components.m90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(e91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(e91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(e91Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.h6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.h6.v0(i16, unVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    pk pkVar = new pk(parentActivity, paint);
                    pkVar.setOnClickListener(new d91(parentActivity));
                    pkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    pkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    pkVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i16, unVar));
                    pkVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, unVar)));
                    pkVar.setTextSize(1, 14.0f);
                    pkVar.setGravity(16);
                    org.telegram.ui.Components.n90 n90Var4 = new org.telegram.ui.Components.n90(parentActivity, null);
                    n90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), unVar));
                    n90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    n90Var4.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, unVar));
                    n90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(textView);
                    n90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(n90Var, w7.y5.t(-1, -2, 0, 0, 18, 0, 0));
                    n90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(n90Var2, w7.y5.t(-1, -2, 0, 0, 24, 0, 0));
                    n90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(n90Var3, w7.y5.t(-1, -2, 0, 0, 24, 0, 0));
                    e.addView(pkVar, w7.y5.t(-2, 34, 1, 22, 14, 22, 0));
                    n90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e.addView(n90Var4, w7.y5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(e91Var.getContext());
                    scrollView.addView(e);
                    e91Var.addView(scrollView, w7.y5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j3.customView = e91Var;
                    j3.show();
                    break;
                }
                break;
            case 11:
                wnVar.finishPreviewFragment();
                break;
            case 12:
                wnVar.getClass();
                wnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) wnVar, 28, true));
                break;
            case 13:
                wn wnVar3 = this.b;
                org.telegram.ui.Components.e5.j0(wnVar3, wnVar3.T5, wnVar3.f, wnVar3.e, wnVar3.h, wnVar3.N1.getTag(R.id.object_tag) != null, wnVar3.Z7, new zg(wnVar3, i12), wnVar3.ea);
                break;
            case 14:
                wn.h0(wnVar);
                break;
            case 15:
                if (wnVar.c4 != null) {
                    TopicsController topicsController = wnVar.getMessagesController().getTopicsController();
                    long j10 = wnVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = wnVar.c4;
                    int i17 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i17, false);
                }
                wnVar.Rc();
                wnVar.hc(false);
                wnVar.Qc(true);
                break;
            case 16:
                long j11 = wnVar.T5;
                if (wnVar.h != null) {
                    j11 = wnVar.f.id;
                }
                wnVar.Xb = false;
                wnVar.getMessagesController().hidePeerSettingsBar(j11, wnVar.f, wnVar.e);
                wnVar.Qc(true);
                wnVar.oc(true);
                break;
            case 17:
                wn wnVar4 = this.b;
                wnVar4.D4 = true;
                if (!wnVar4.F9() || wnVar4.h4) {
                    int i18 = wnVar4.L4;
                    if (i18 != 0) {
                        if (!wnVar4.H4.isEmpty()) {
                            if (i18 == ((Integer) hg.c.g(1, wnVar4.H4)).intValue()) {
                                i13 = ((Integer) wnVar4.H4.get(0)).intValue() + 1;
                                wnVar4.O4 = true;
                            } else {
                                wnVar4.O4 = false;
                                i13 = i18 - 1;
                            }
                        }
                        wnVar4.N4 = i13;
                        if (!wnVar4.O4) {
                            i13 = -i13;
                        }
                        wnVar4.F(i18, 0, 0, i13, true, true);
                        wnVar4.uc();
                        break;
                    }
                } else {
                    wnVar4.F((int) wnVar4.d4, 0, 0, 0, true, true);
                    break;
                }
                break;
            case 18:
                wnVar.ia(false);
                break;
            case 19:
                wn.X0(wnVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", wnVar.a());
                wnVar.presentFragment(new xk(bundle2));
                break;
            case 21:
                wn.t0(wnVar);
                break;
            case 22:
                wn.C0(wnVar);
                break;
            case 23:
                wn.h1(wnVar);
                break;
            case 24:
                wnVar.ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = wnVar.W5;
                for (int i19 = 1; i19 >= 0; i19--) {
                    if (messageObject == null && sparseArrayArr[i19].size() != 0) {
                        messageObject = (MessageObject) wnVar.o6[i19].get(sparseArrayArr[i19].keyAt(0));
                    }
                    sparseArrayArr[i19].clear();
                    wnVar.X5[i19].clear();
                    wnVar.Y5[i19].clear();
                }
                wnVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && wnVar.h != null))) {
                    wnVar.Bb(messageObject);
                }
                wnVar.yc(0, true);
                wnVar.Wc(false);
                wnVar.Lc();
                break;
            case 26:
                wn.j1(wnVar);
                break;
            case 27:
                wn wnVar5 = this.b;
                MessageObject messageObject3 = wnVar5.p5;
                if (messageObject3 != null) {
                    wnVar5.F(messageObject3.getId(), 0, 0, 0, true, true);
                    break;
                }
                break;
            case 28:
                wnVar.la(wnVar.E9() ? "" : null);
                break;
            default:
                wnVar.Q7();
                wnVar.y3.m(wnVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
