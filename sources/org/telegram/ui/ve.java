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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ve implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ ve(xn xnVar, int i10) {
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
                rg.j0.C1(xnVar2, xnVar2.D1, xnVar2.E1, xnVar2.T5, false);
                break;
            case 1:
                xnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", xnVar.r);
                xnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (xnVar.K3 != null) {
                    xnVar.Lb(!xnVar.xc.f);
                    break;
                }
                break;
            case 3:
                xnVar.kb(!xnVar.A0.N);
                break;
            case 4:
                ck ckVar = xnVar.I1;
                if (ckVar != null) {
                    ckVar.setReversed(true);
                    xnVar.I1.getAdapter().k0 = true;
                    xnVar.m7();
                }
                xnVar.S2.setVisibility(8);
                xnVar.T2.setVisibility(8);
                xnVar.n3 = true;
                xnVar.o3 = null;
                xnVar.p3 = null;
                xnVar.j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                xnVar.j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(xnVar.j0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = xnVar.j0;
                v0Var.r = null;
                ci.h2 h2Var = v0Var.e;
                if (h2Var != null) {
                    h2Var.setText("");
                    break;
                }
                break;
            case 5:
                if (xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = xnVar.j0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    xnVar.showDialog(org.telegram.ui.Components.e5.p(xnVar.getParentActivity(), new cl(xnVar), xnVar.ea).a);
                    break;
                }
                break;
            case 6:
                xnVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = xnVar.d5;
                if (messageObject2 != null) {
                    xnVar.J9(messageObject2, false, false);
                    nf.f.r(xnVar.getParentActivity(), Uri.parse(xnVar.d5.sponsoredUrl), true, false, false, null, null, false, xnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(xnVar.d5.sponsoredInfo)) {
                    org.telegram.messenger.ul.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(xnVar.getParentActivity()), xnVar.ea));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(xnVar.d5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.ul.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(xnVar.getParentActivity()), xnVar.ea));
                    break;
                }
                break;
            case 10:
                if (xnVar.X0 != null && xnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 j3 = org.telegram.messenger.ul.j(1, xnVar.X0.getContext(), null, false);
                    Activity parentActivity = xnVar.getParentActivity();
                    vn vnVar = xnVar.ea;
                    final c91 c91Var = new c91(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.z0.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i15 = org.telegram.ui.ActionBar.h6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, vnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.d90 d90Var = new org.telegram.ui.Components.d90(parentActivity, vnVar);
                    d90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), vnVar));
                    d90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, vnVar));
                    d90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, vnVar));
                    d90Var.setTextSize(1, 14.0f);
                    d90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var.setOnLinkPressListener(new org.telegram.ui.Components.c90() { // from class: org.telegram.ui.a91
                        @Override // org.telegram.ui.Components.c90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(c91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(c91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(c91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.d90 d90Var2 = new org.telegram.ui.Components.d90(parentActivity, null);
                    d90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), vnVar));
                    d90Var2.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, vnVar));
                    d90Var2.setTextSize(1, 14.0f);
                    d90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var2.setOnLinkPressListener(new org.telegram.ui.Components.c90() { // from class: org.telegram.ui.a91
                        @Override // org.telegram.ui.Components.c90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(c91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(c91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(c91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.d90 d90Var3 = new org.telegram.ui.Components.d90(parentActivity, null);
                    d90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), vnVar));
                    d90Var3.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, vnVar));
                    d90Var3.setTextSize(1, 14.0f);
                    d90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var3.setOnLinkPressListener(new org.telegram.ui.Components.c90() { // from class: org.telegram.ui.a91
                        @Override // org.telegram.ui.Components.c90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(c91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(c91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(c91Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.h6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.h6.v0(i16, vnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    pk pkVar = new pk(parentActivity, paint);
                    pkVar.setOnClickListener(new b91(parentActivity));
                    pkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    pkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    pkVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i16, vnVar));
                    pkVar.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, vnVar)));
                    pkVar.setTextSize(1, 14.0f);
                    pkVar.setGravity(16);
                    org.telegram.ui.Components.d90 d90Var4 = new org.telegram.ui.Components.d90(parentActivity, null);
                    d90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), vnVar));
                    d90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    d90Var4.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, vnVar));
                    d90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    d90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var, w7.x5.t(-1, -2, 0, 0, 18, 0, 0));
                    d90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var2, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    d90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var3, w7.x5.t(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(pkVar, w7.x5.t(-2, 34, 1, 22, 14, 22, 0));
                    d90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(d90Var4, w7.x5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(c91Var.getContext());
                    scrollView.addView(f7);
                    c91Var.addView(scrollView, w7.x5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j3.customView = c91Var;
                    j3.show();
                    break;
                }
                break;
            case 11:
                xnVar.finishPreviewFragment();
                break;
            case 12:
                xnVar.getClass();
                xnVar.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) xnVar, 28, true));
                break;
            case 13:
                xn xnVar3 = this.b;
                org.telegram.ui.Components.e5.j0(xnVar3, xnVar3.T5, xnVar3.f, xnVar3.e, xnVar3.h, xnVar3.N1.getTag(R.id.object_tag) != null, xnVar3.Z7, new ah(xnVar3, i12), xnVar3.ea);
                break;
            case 14:
                xn.k0(xnVar);
                break;
            case 15:
                if (xnVar.c4 != null) {
                    TopicsController topicsController = xnVar.getMessagesController().getTopicsController();
                    long j10 = xnVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = xnVar.c4;
                    int i17 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i17, false);
                }
                xnVar.Rc();
                xnVar.hc(false);
                xnVar.Qc(true);
                break;
            case 16:
                long j11 = xnVar.T5;
                if (xnVar.h != null) {
                    j11 = xnVar.f.id;
                }
                xnVar.Xb = false;
                xnVar.getMessagesController().hidePeerSettingsBar(j11, xnVar.f, xnVar.e);
                xnVar.Qc(true);
                xnVar.oc(true);
                break;
            case 17:
                xn xnVar4 = this.b;
                xnVar4.D4 = true;
                if (!xnVar4.F9() || xnVar4.h4) {
                    int i18 = xnVar4.L4;
                    if (i18 != 0) {
                        if (!xnVar4.H4.isEmpty()) {
                            if (i18 == ((Integer) hg.c.h(1, xnVar4.H4)).intValue()) {
                                i13 = ((Integer) xnVar4.H4.get(0)).intValue() + 1;
                                xnVar4.O4 = true;
                            } else {
                                xnVar4.O4 = false;
                                i13 = i18 - 1;
                            }
                        }
                        xnVar4.N4 = i13;
                        if (!xnVar4.O4) {
                            i13 = -i13;
                        }
                        xnVar4.F(i18, 0, 0, i13, true, true);
                        xnVar4.uc();
                        break;
                    }
                } else {
                    xnVar4.F((int) xnVar4.d4, 0, 0, 0, true, true);
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
                SparseArray[] sparseArrayArr = xnVar.W5;
                for (int i19 = 1; i19 >= 0; i19--) {
                    if (messageObject == null && sparseArrayArr[i19].size() != 0) {
                        messageObject = (MessageObject) xnVar.o6[i19].get(sparseArrayArr[i19].keyAt(0));
                    }
                    sparseArrayArr[i19].clear();
                    xnVar.X5[i19].clear();
                    xnVar.Y5[i19].clear();
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
                MessageObject messageObject3 = xnVar5.p5;
                if (messageObject3 != null) {
                    xnVar5.F(messageObject3.getId(), 0, 0, 0, true, true);
                    break;
                }
                break;
            case 28:
                xnVar.la(xnVar.E9() ? "" : null);
                break;
            default:
                xnVar.Q7();
                xnVar.y3.m(xnVar.T5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
