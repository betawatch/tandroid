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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ we(wn wnVar, int i10) {
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
                tg.j0.G1(wnVar2, wnVar2.P1, wnVar2.Q1, wnVar2.j6, false);
                break;
            case 1:
                wnVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", wnVar.r);
                wnVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (wnVar.W3 != null) {
                    wnVar.bc(!wnVar.Zc.f);
                    break;
                }
                break;
            case 3:
                wnVar.zb(!wnVar.A0.N);
                break;
            case 4:
                bk bkVar = wnVar.U1;
                if (bkVar != null) {
                    bkVar.setReversed(true);
                    wnVar.U1.getAdapter().k0 = true;
                    wnVar.v7();
                }
                wnVar.e3.setVisibility(8);
                wnVar.f3.setVisibility(8);
                wnVar.z3 = true;
                wnVar.A3 = null;
                wnVar.B3 = null;
                wnVar.j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                wnVar.j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(wnVar.j0.getSearchField());
                wnVar.j0.n();
                break;
            case 5:
                if (wnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var = wnVar.j0;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    wnVar.showDialog(org.telegram.ui.Components.g5.o(wnVar.getParentActivity(), new cl(wnVar), wnVar.ua).a);
                    break;
                }
                break;
            case 6:
                wnVar.J7(true);
                break;
            case 7:
                MessageObject messageObject2 = wnVar.t5;
                if (messageObject2 != null) {
                    wnVar.W9(messageObject2, false, false);
                    qf.d.q(wnVar.getParentActivity(), Uri.parse(wnVar.t5.sponsoredUrl), true, false, false, null, null, false, wnVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(wnVar.t5.sponsoredInfo)) {
                    org.telegram.messenger.wh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.ua));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(wnVar.t5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.wh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.ua));
                    break;
                }
                break;
            case 10:
                if (wnVar.j1 != null && wnVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.k3 i15 = org.telegram.messenger.wh.i(1, wnVar.j1.getContext(), null, false);
                    Activity parentActivity = wnVar.getParentActivity();
                    un unVar = wnVar.ua;
                    final k81 k81Var = new k81(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.t.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i16 = org.telegram.ui.ActionBar.y6.G6;
                    org.telegram.ui.ActionBar.f7.V(textView, i16, unVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(parentActivity, unVar);
                    aa0Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), unVar));
                    org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, unVar);
                    org.telegram.ui.ActionBar.f7.V(aa0Var, i16, unVar);
                    aa0Var.setTextSize(1, 14.0f);
                    aa0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    aa0Var.setOnLinkPressListener(new org.telegram.ui.Components.z90() { // from class: org.telegram.ui.i81
                        @Override // org.telegram.ui.Components.z90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(k81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(k81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(k81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.aa0 aa0Var2 = new org.telegram.ui.Components.aa0(parentActivity, null);
                    aa0Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), unVar));
                    org.telegram.ui.ActionBar.f7.V(aa0Var2, i16, unVar);
                    aa0Var2.setTextSize(1, 14.0f);
                    aa0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    aa0Var2.setOnLinkPressListener(new org.telegram.ui.Components.z90() { // from class: org.telegram.ui.i81
                        @Override // org.telegram.ui.Components.z90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(k81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(k81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(k81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.aa0 aa0Var3 = new org.telegram.ui.Components.aa0(parentActivity, null);
                    aa0Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), unVar));
                    org.telegram.ui.ActionBar.f7.V(aa0Var3, i16, unVar);
                    aa0Var3.setTextSize(1, 14.0f);
                    aa0Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    aa0Var3.setOnLinkPressListener(new org.telegram.ui.Components.z90() { // from class: org.telegram.ui.i81
                        @Override // org.telegram.ui.Components.z90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(k81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(k81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(k81Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i17 = org.telegram.ui.ActionBar.y6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.y6.w0(i17, unVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    ok okVar = new ok(parentActivity, paint);
                    okVar.setOnClickListener(new j81(parentActivity));
                    okVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    okVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    org.telegram.ui.ActionBar.f7.V(okVar, i17, unVar);
                    int i18 = org.telegram.ui.ActionBar.y6.h5;
                    org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.w0(i18, unVar));
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i18);
                    org.telegram.ui.ActionBar.b7 f10 = org.telegram.ui.ActionBar.f7.f(i18);
                    okVar.setBackground(e);
                    org.telegram.ui.ActionBar.f7.k(okVar, e, N, f10, unVar);
                    okVar.setTextSize(1, 14.0f);
                    okVar.setGravity(16);
                    org.telegram.ui.Components.aa0 aa0Var4 = new org.telegram.ui.Components.aa0(parentActivity, null);
                    aa0Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), unVar));
                    aa0Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.f7.V(aa0Var4, i16, unVar);
                    aa0Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    aa0Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(aa0Var, org.telegram.ui.Components.kb1.x(-1, -2, 0, 0, 18, 0, 0));
                    aa0Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(aa0Var2, org.telegram.ui.Components.kb1.x(-1, -2, 0, 0, 24, 0, 0));
                    aa0Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(aa0Var3, org.telegram.ui.Components.kb1.x(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(okVar, org.telegram.ui.Components.kb1.x(-2, 34, 1, 22, 14, 22, 0));
                    aa0Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(aa0Var4, org.telegram.ui.Components.kb1.x(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(k81Var.getContext());
                    scrollView.addView(f7);
                    k81Var.addView(scrollView, org.telegram.ui.Components.kb1.h(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i15.customView = k81Var;
                    i15.show();
                    break;
                }
                break;
            case 11:
                wnVar.finishPreviewFragment();
                break;
            case 12:
                wnVar.getClass();
                wnVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) wnVar, 28, true));
                break;
            case 13:
                wn wnVar3 = this.b;
                org.telegram.ui.Components.g5.i0(wnVar3, wnVar3.j6, wnVar3.f, wnVar3.e, wnVar3.h, wnVar3.Z1.getTag(R.id.object_tag) != null, wnVar3.p8, new rg(wnVar3, i12), wnVar3.ua);
                break;
            case 14:
                wn.g0(wnVar);
                break;
            case 15:
                if (wnVar.o4 != null) {
                    TopicsController topicsController = wnVar.getMessagesController().getTopicsController();
                    long j10 = wnVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = wnVar.o4;
                    int i19 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i19, false);
                }
                wnVar.id();
                wnVar.yc(false);
                wnVar.hd(true);
                break;
            case 16:
                long j11 = wnVar.j6;
                if (wnVar.h != null) {
                    j11 = wnVar.f.id;
                }
                wnVar.yc = false;
                wnVar.getMessagesController().hidePeerSettingsBar(j11, wnVar.f, wnVar.e);
                wnVar.hd(true);
                wnVar.Fc(true);
                break;
            case 17:
                wn wnVar4 = this.b;
                wnVar4.P4 = true;
                if (!wnVar4.R9() || wnVar4.t4) {
                    int i20 = wnVar4.X4;
                    if (i20 != 0) {
                        if (!wnVar4.T4.isEmpty()) {
                            if (i20 == ((Integer) ic.a.g(1, wnVar4.T4)).intValue()) {
                                i13 = ((Integer) wnVar4.T4.get(0)).intValue() + 1;
                                wnVar4.a5 = true;
                            } else {
                                wnVar4.a5 = false;
                                i13 = i20 - 1;
                            }
                        }
                        wnVar4.Z4 = i13;
                        if (!wnVar4.a5) {
                            i13 = -i13;
                        }
                        wnVar4.j(i20, 0, true, 0, true, i13);
                        wnVar4.Lc();
                        break;
                    }
                } else {
                    wnVar4.j((int) wnVar4.p4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                wnVar.va(false);
                break;
            case 19:
                wn.k1(wnVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", wnVar.a());
                wnVar.presentFragment(new wk(bundle2));
                break;
            case 21:
                wn.J0(wnVar);
                break;
            case 22:
                wn.Z0(wnVar);
                break;
            case 23:
                wn.q0(wnVar);
                break;
            case 24:
                wnVar.oa(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = wnVar.m6;
                for (int i21 = 1; i21 >= 0; i21--) {
                    if (messageObject == null && sparseArrayArr[i21].size() != 0) {
                        messageObject = (MessageObject) wnVar.E6[i21].get(sparseArrayArr[i21].keyAt(0));
                    }
                    sparseArrayArr[i21].clear();
                    wnVar.n6[i21].clear();
                    wnVar.o6[i21].clear();
                }
                wnVar.p9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && wnVar.h != null))) {
                    wnVar.Rb(messageObject);
                }
                wnVar.Pc(0, true);
                wnVar.nd(false);
                wnVar.cd();
                break;
            case 26:
                wn.K0(wnVar);
                break;
            case 27:
                wn wnVar5 = this.b;
                MessageObject messageObject3 = wnVar5.F5;
                if (messageObject3 != null) {
                    wnVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                wnVar.ya(wnVar.Q9() ? "" : null);
                break;
            default:
                wnVar.Z7();
                wnVar.K3.m(wnVar.j6, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
