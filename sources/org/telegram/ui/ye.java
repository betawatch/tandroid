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

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class ye implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn b;

    public /* synthetic */ ye(yn ynVar, int i10) {
        this.a = i10;
        this.b = ynVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        MessageObject messageObject = null;
        final int i12 = 0;
        final int i13 = 1;
        yn ynVar = this.b;
        switch (i11) {
            case 0:
                yn ynVar2 = this.b;
                rg.k0.C1(ynVar2, ynVar2.B1, ynVar2.C1, ynVar2.R5, false);
                break;
            case 1:
                ynVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", ynVar.r);
                ynVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (ynVar.I3 != null) {
                    ynVar.Kb(!ynVar.vc.f);
                    break;
                }
                break;
            case 3:
                ynVar.jb(!ynVar.y0.N);
                break;
            case 4:
                ck ckVar = ynVar.G1;
                if (ckVar != null) {
                    ckVar.setReversed(true);
                    ynVar.G1.getAdapter().k0 = true;
                    ynVar.m7();
                }
                ynVar.Q2.setVisibility(8);
                ynVar.R2.setVisibility(8);
                ynVar.l3 = true;
                ynVar.m3 = null;
                ynVar.n3 = null;
                ynVar.h0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                ynVar.h0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(ynVar.h0.getSearchField());
                org.telegram.ui.ActionBar.v0 v0Var = ynVar.h0;
                v0Var.r = null;
                ci.h2 h2Var = v0Var.e;
                if (h2Var != null) {
                    h2Var.setText("");
                    break;
                }
                break;
            case 5:
                if (ynVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.v0 v0Var2 = ynVar.h0;
                    if (v0Var2 != null) {
                        AndroidUtilities.hideKeyboard(v0Var2.getSearchField());
                    }
                    ynVar.showDialog(org.telegram.ui.Components.e5.p(ynVar.getParentActivity(), new cl(ynVar), ynVar.ca).a);
                    break;
                }
                break;
            case 6:
                ynVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = ynVar.b5;
                if (messageObject2 != null) {
                    ynVar.I9(messageObject2, false, false);
                    nf.f.r(ynVar.getParentActivity(), Uri.parse(ynVar.b5.sponsoredUrl), true, false, false, null, null, false, ynVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(ynVar.b5.sponsoredInfo)) {
                    org.telegram.messenger.ok.o(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.ca));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(ynVar.b5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.ok.o(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.ca));
                    break;
                }
                break;
            case 10:
                if (ynVar.V0 != null && ynVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.f3 j3 = org.telegram.messenger.ok.j(1, ynVar.V0.getContext(), null, false);
                    Activity parentActivity = ynVar.getParentActivity();
                    wn wnVar = ynVar.ca;
                    final f91 f91Var = new f91(parentActivity);
                    LinearLayout e7 = org.telegram.messenger.f0.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i14 = org.telegram.ui.ActionBar.i6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(parentActivity, wnVar);
                    q90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), wnVar));
                    q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, wnVar));
                    q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
                    q90Var.setTextSize(1, 14.0f);
                    q90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    q90Var.setOnLinkPressListener(new org.telegram.ui.Components.p90() { // from class: org.telegram.ui.d91
                        @Override // org.telegram.ui.Components.p90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(f91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(f91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(f91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.q90 q90Var2 = new org.telegram.ui.Components.q90(parentActivity, null);
                    q90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), wnVar));
                    q90Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
                    q90Var2.setTextSize(1, 14.0f);
                    q90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    q90Var2.setOnLinkPressListener(new org.telegram.ui.Components.p90() { // from class: org.telegram.ui.d91
                        @Override // org.telegram.ui.Components.p90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(f91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(f91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(f91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.q90 q90Var3 = new org.telegram.ui.Components.q90(parentActivity, null);
                    q90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), wnVar));
                    q90Var3.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
                    q90Var3.setTextSize(1, 14.0f);
                    q90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    final int i15 = 2;
                    q90Var3.setOnLinkPressListener(new org.telegram.ui.Components.p90() { // from class: org.telegram.ui.d91
                        @Override // org.telegram.ui.Components.p90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i15) {
                                case 0:
                                    clickableSpan.onClick(f91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(f91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(f91Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.i6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.i6.v0(i16, wnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    pk pkVar = new pk(parentActivity, paint);
                    pkVar.setOnClickListener(new e91(parentActivity));
                    pkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    pkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    pkVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i16, wnVar));
                    pkVar.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, wnVar)));
                    pkVar.setTextSize(1, 14.0f);
                    pkVar.setGravity(16);
                    org.telegram.ui.Components.q90 q90Var4 = new org.telegram.ui.Components.q90(parentActivity, null);
                    q90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), wnVar));
                    q90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    q90Var4.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
                    q90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(textView);
                    q90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(q90Var, w7.z5.t(-1, -2, 0, 0, 18, 0, 0));
                    q90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(q90Var2, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    q90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(q90Var3, w7.z5.t(-1, -2, 0, 0, 24, 0, 0));
                    e7.addView(pkVar, w7.z5.t(-2, 34, 1, 22, 14, 22, 0));
                    q90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    e7.addView(q90Var4, w7.z5.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(f91Var.getContext());
                    scrollView.addView(e7);
                    f91Var.addView(scrollView, w7.z5.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    j3.customView = f91Var;
                    j3.show();
                    break;
                }
                break;
            case 11:
                ynVar.finishPreviewFragment();
                break;
            case 12:
                ynVar.getClass();
                ynVar.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) ynVar, 28, true));
                break;
            case 13:
                yn ynVar3 = this.b;
                org.telegram.ui.Components.e5.j0(ynVar3, ynVar3.R5, ynVar3.f, ynVar3.e, ynVar3.h, ynVar3.L1.getTag(R.id.object_tag) != null, ynVar3.X7, new ah(ynVar3, i13), ynVar3.ca);
                break;
            case 14:
                yn.q1(ynVar);
                break;
            case 15:
                if (ynVar.a4 != null) {
                    TopicsController topicsController = ynVar.getMessagesController().getTopicsController();
                    long j10 = ynVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = ynVar.a4;
                    int i17 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i17, false);
                }
                ynVar.Qc();
                ynVar.gc(false);
                ynVar.Pc(true);
                break;
            case 16:
                long j11 = ynVar.R5;
                if (ynVar.h != null) {
                    j11 = ynVar.f.id;
                }
                ynVar.Vb = false;
                ynVar.getMessagesController().hidePeerSettingsBar(j11, ynVar.f, ynVar.e);
                ynVar.Pc(true);
                ynVar.nc(true);
                break;
            case 17:
                yn ynVar4 = this.b;
                ynVar4.B4 = true;
                if (!ynVar4.E9() || ynVar4.f4) {
                    int i18 = ynVar4.J4;
                    if (i18 != 0) {
                        if (!ynVar4.F4.isEmpty()) {
                            if (i18 == ((Integer) hg.k0.g(1, ynVar4.F4)).intValue()) {
                                i12 = ((Integer) ynVar4.F4.get(0)).intValue() + 1;
                                ynVar4.M4 = true;
                            } else {
                                ynVar4.M4 = false;
                                i12 = i18 - 1;
                            }
                        }
                        ynVar4.L4 = i12;
                        if (!ynVar4.M4) {
                            i12 = -i12;
                        }
                        ynVar4.D(i18, 0, 0, i12, true, true);
                        ynVar4.tc();
                        break;
                    }
                } else {
                    ynVar4.D((int) ynVar4.b4, 0, 0, 0, true, true);
                    break;
                }
                break;
            case 18:
                ynVar.ha(false);
                break;
            case 19:
                yn.b0(ynVar);
                break;
            case 20:
                yn.Y(ynVar);
                break;
            case 21:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", ynVar.a());
                ynVar.presentFragment(new xk(bundle2));
                break;
            case 22:
                yn.H0(ynVar);
                break;
            case 23:
                yn.a1(ynVar);
                break;
            case 24:
                ynVar.aa(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = ynVar.U5;
                for (int i19 = 1; i19 >= 0; i19--) {
                    if (messageObject == null && sparseArrayArr[i19].size() != 0) {
                        messageObject = (MessageObject) ynVar.m6[i19].get(sparseArrayArr[i19].keyAt(0));
                    }
                    sparseArrayArr[i19].clear();
                    ynVar.V5[i19].clear();
                    ynVar.W5[i19].clear();
                }
                ynVar.d9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && ynVar.h != null))) {
                    ynVar.Ab(messageObject);
                }
                ynVar.xc(0, true);
                ynVar.Vc(false);
                ynVar.Kc();
                break;
            case 26:
                yn.K0(ynVar);
                break;
            case 27:
                yn ynVar5 = this.b;
                MessageObject messageObject3 = ynVar5.n5;
                if (messageObject3 != null) {
                    ynVar5.D(messageObject3.getId(), 0, 0, 0, true, true);
                    break;
                }
                break;
            case 28:
                ynVar.ka(ynVar.D9() ? "" : null);
                break;
            default:
                ynVar.Q7();
                ynVar.w3.m(ynVar.R5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
