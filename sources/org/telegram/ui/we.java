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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class we implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ zn b;

    public /* synthetic */ we(zn znVar, int i10) {
        this.a = i10;
        this.b = znVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        zn znVar = this.b;
        switch (i11) {
            case 0:
                zn znVar2 = this.b;
                eg.v0.C1(znVar2, znVar2.A1, znVar2.B1, znVar2.Q5, false);
                break;
            case 1:
                znVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", znVar.r);
                znVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (znVar.H3 != null) {
                    znVar.Lb(!znVar.vc.f);
                    break;
                }
                break;
            case 3:
                znVar.kb(!znVar.x0.K);
                break;
            case 4:
                dk dkVar = znVar.F1;
                if (dkVar != null) {
                    dkVar.setReversed(true);
                    znVar.F1.getAdapter().h0 = true;
                    znVar.m7();
                }
                znVar.P2.setVisibility(8);
                znVar.Q2.setVisibility(8);
                znVar.k3 = true;
                znVar.l3 = null;
                znVar.m3 = null;
                znVar.g0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                znVar.g0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(znVar.g0.getSearchField());
                org.telegram.ui.ActionBar.w0 w0Var = znVar.g0;
                w0Var.r = null;
                kg.f fVar = w0Var.e;
                if (fVar != null) {
                    fVar.setText("");
                    break;
                }
                break;
            case 5:
                if (znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var2 = znVar.g0;
                    if (w0Var2 != null) {
                        AndroidUtilities.hideKeyboard(w0Var2.getSearchField());
                    }
                    znVar.showDialog(org.telegram.ui.Components.z4.p(znVar.getParentActivity(), new el(znVar), znVar.ba).a);
                    break;
                }
                break;
            case 6:
                znVar.A7(true);
                break;
            case 7:
                MessageObject messageObject2 = znVar.a5;
                if (messageObject2 != null) {
                    znVar.J9(messageObject2, false, false);
                    ze.d.r(znVar.getParentActivity(), Uri.parse(znVar.a5.sponsoredUrl), true, false, false, null, null, false, znVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(znVar.a5.sponsoredInfo)) {
                    b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(znVar.getParentActivity()), znVar.ba));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(znVar.a5.sponsoredAdditionalInfo)) {
                    b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(znVar.getParentActivity()), znVar.ba));
                    break;
                }
                break;
            case 10:
                if (znVar.U0 != null && znVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(znVar.U0.getContext(), null, false, false);
                    Activity parentActivity = znVar.getParentActivity();
                    xn xnVar = znVar.ba;
                    final b91 b91Var = new b91(parentActivity);
                    LinearLayout h = kf.k0.h(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i15 = org.telegram.ui.ActionBar.j6.G6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, xnVar));
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(parentActivity, xnVar);
                    f90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), xnVar));
                    f90Var.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, xnVar));
                    f90Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, xnVar));
                    f90Var.setTextSize(1, 14.0f);
                    f90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    f90Var.setOnLinkPressListener(new org.telegram.ui.Components.e90() { // from class: org.telegram.ui.z81
                        @Override // org.telegram.ui.Components.e90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(b91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(b91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(b91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.f90 f90Var2 = new org.telegram.ui.Components.f90(parentActivity, null);
                    f90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), xnVar));
                    f90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, xnVar));
                    f90Var2.setTextSize(1, 14.0f);
                    f90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    f90Var2.setOnLinkPressListener(new org.telegram.ui.Components.e90() { // from class: org.telegram.ui.z81
                        @Override // org.telegram.ui.Components.e90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(b91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(b91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(b91Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.f90 f90Var3 = new org.telegram.ui.Components.f90(parentActivity, null);
                    f90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), xnVar));
                    f90Var3.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, xnVar));
                    f90Var3.setTextSize(1, 14.0f);
                    f90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    f90Var3.setOnLinkPressListener(new org.telegram.ui.Components.e90() { // from class: org.telegram.ui.z81
                        @Override // org.telegram.ui.Components.e90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(b91Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(b91Var);
                                    break;
                                default:
                                    clickableSpan.onClick(b91Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i16 = org.telegram.ui.ActionBar.j6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.j6.v0(i16, xnVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    rk rkVar = new rk(parentActivity, paint);
                    rkVar.setOnClickListener(new a91(parentActivity));
                    rkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    rkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    rkVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i16, xnVar));
                    rkVar.setBackground(org.telegram.ui.ActionBar.z5.e(new float[]{4.0f}, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, xnVar)));
                    rkVar.setTextSize(1, 14.0f);
                    rkVar.setGravity(16);
                    org.telegram.ui.Components.f90 f90Var4 = new org.telegram.ui.Components.f90(parentActivity, null);
                    f90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), xnVar));
                    f90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    f90Var4.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, xnVar));
                    f90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(textView);
                    f90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(f90Var, k7.b6.t(-1, -2, 0, 0, 18, 0, 0));
                    f90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(f90Var2, k7.b6.t(-1, -2, 0, 0, 24, 0, 0));
                    f90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(f90Var3, k7.b6.t(-1, -2, 0, 0, 24, 0, 0));
                    h.addView(rkVar, k7.b6.t(-2, 34, 1, 22, 14, 22, 0));
                    f90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    h.addView(f90Var4, k7.b6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(b91Var.getContext());
                    scrollView.addView(h);
                    b91Var.addView(scrollView, k7.b6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    o10.customView = b91Var;
                    o10.show();
                    break;
                }
                break;
            case 11:
                znVar.finishPreviewFragment();
                break;
            case 12:
                znVar.getClass();
                znVar.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) znVar, 28, true));
                break;
            case 13:
                zn znVar3 = this.b;
                org.telegram.ui.Components.z4.j0(znVar3, znVar3.Q5, znVar3.f, znVar3.e, znVar3.h, znVar3.K1.getTag(R.id.object_tag) != null, znVar3.W7, new xg(znVar3, i12), znVar3.ba);
                break;
            case 14:
                zn.j0(znVar);
                break;
            case 15:
                if (znVar.Z3 != null) {
                    TopicsController topicsController = znVar.getMessagesController().getTopicsController();
                    long j10 = znVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = znVar.Z3;
                    int i17 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i17, false);
                }
                znVar.Rc();
                znVar.hc(false);
                znVar.Qc(true);
                break;
            case 16:
                long j11 = znVar.Q5;
                if (znVar.h != null) {
                    j11 = znVar.f.id;
                }
                znVar.Vb = false;
                znVar.getMessagesController().hidePeerSettingsBar(j11, znVar.f, znVar.e);
                znVar.Qc(true);
                znVar.oc(true);
                break;
            case 17:
                zn znVar4 = this.b;
                znVar4.A4 = true;
                if (!znVar4.F9() || znVar4.e4) {
                    int i18 = znVar4.I4;
                    if (i18 != 0) {
                        if (!znVar4.E4.isEmpty()) {
                            if (i18 == ((Integer) kf.k0.i(1, znVar4.E4)).intValue()) {
                                i13 = ((Integer) znVar4.E4.get(0)).intValue() + 1;
                                znVar4.L4 = true;
                            } else {
                                znVar4.L4 = false;
                                i13 = i18 - 1;
                            }
                        }
                        znVar4.K4 = i13;
                        if (!znVar4.L4) {
                            i13 = -i13;
                        }
                        znVar4.j(i18, 0, true, 0, true, i13);
                        znVar4.uc();
                        break;
                    }
                } else {
                    znVar4.j((int) znVar4.a4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                znVar.ia(false);
                break;
            case 19:
                zn.Z(znVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", znVar.a());
                znVar.presentFragment(new zk(bundle2));
                break;
            case 21:
                zn.C0(znVar);
                break;
            case 22:
                zn.L0(znVar);
                break;
            case 23:
                zn.b1(znVar);
                break;
            case 24:
                znVar.ba(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = znVar.T5;
                for (int i19 = 1; i19 >= 0; i19--) {
                    if (messageObject == null && sparseArrayArr[i19].size() != 0) {
                        messageObject = (MessageObject) znVar.l6[i19].get(sparseArrayArr[i19].keyAt(0));
                    }
                    sparseArrayArr[i19].clear();
                    znVar.U5[i19].clear();
                    znVar.V5[i19].clear();
                }
                znVar.c9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && znVar.h != null))) {
                    znVar.Bb(messageObject);
                }
                znVar.yc(0, true);
                znVar.Wc(false);
                znVar.Lc();
                break;
            case 26:
                zn.f1(znVar);
                break;
            case 27:
                zn znVar5 = this.b;
                MessageObject messageObject3 = znVar5.m5;
                if (messageObject3 != null) {
                    znVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                znVar.la(znVar.E9() ? "" : null);
                break;
            default:
                znVar.Q7();
                znVar.v3.m(znVar.Q5, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
