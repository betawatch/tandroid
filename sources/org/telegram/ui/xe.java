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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xe implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ xe(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        int i11 = this.a;
        final int i12 = 2;
        MessageObject messageObject = null;
        final int i13 = 0;
        final int i14 = 1;
        un unVar = this.b;
        switch (i11) {
            case 0:
                un unVar2 = this.b;
                tg.j0.G1(unVar2, unVar2.P1, unVar2.Q1, unVar2.f6, false);
                break;
            case 1:
                unVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", unVar.r);
                unVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (unVar.W3 != null) {
                    unVar.Xb(!unVar.Vc.f);
                    break;
                }
                break;
            case 3:
                unVar.vb(!unVar.A0.N);
                break;
            case 4:
                zj zjVar = unVar.U1;
                if (zjVar != null) {
                    zjVar.setReversed(true);
                    unVar.U1.getAdapter().k0 = true;
                    unVar.t7();
                }
                unVar.e3.setVisibility(8);
                unVar.f3.setVisibility(8);
                unVar.z3 = true;
                unVar.A3 = null;
                unVar.B3 = null;
                unVar.j0.setSearchFieldHint(LocaleController.getString(R.string.SearchMembers));
                unVar.j0.setSearchFieldCaption(LocaleController.getString(R.string.SearchFrom));
                AndroidUtilities.showKeyboard(unVar.j0.getSearchField());
                unVar.j0.n();
                break;
            case 5:
                if (unVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.w0 w0Var = unVar.j0;
                    if (w0Var != null) {
                        AndroidUtilities.hideKeyboard(w0Var.getSearchField());
                    }
                    unVar.showDialog(org.telegram.ui.Components.g5.o(unVar.getParentActivity(), new al(unVar), unVar.qa).a);
                    break;
                }
                break;
            case 6:
                unVar.H7(true);
                break;
            case 7:
                MessageObject messageObject2 = unVar.p5;
                if (messageObject2 != null) {
                    unVar.T9(messageObject2, false, false);
                    qf.d.q(unVar.getParentActivity(), Uri.parse(unVar.p5.sponsoredUrl), true, false, false, null, null, false, unVar.getMessagesController().sponsoredLinksInappAllow, false);
                    break;
                }
                break;
            case 8:
                if (AndroidUtilities.addToClipboard(unVar.p5.sponsoredInfo)) {
                    org.telegram.messenger.vh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(unVar.getParentActivity()), unVar.qa));
                    break;
                }
                break;
            case 9:
                if (AndroidUtilities.addToClipboard(unVar.p5.sponsoredAdditionalInfo)) {
                    org.telegram.messenger.vh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(unVar.getParentActivity()), unVar.qa));
                    break;
                }
                break;
            case 10:
                if (unVar.j1 != null && unVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.k3 i15 = org.telegram.messenger.vh.i(1, unVar.j1.getContext(), null, false);
                    Activity parentActivity = unVar.getParentActivity();
                    sn snVar = unVar.qa;
                    final i81 i81Var = new i81(parentActivity);
                    LinearLayout f7 = org.telegram.messenger.t.f(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(LocaleController.getString(R.string.SponsoredMessageInfo));
                    textView.setTypeface(AndroidUtilities.bold());
                    int i16 = org.telegram.ui.ActionBar.y6.G6;
                    org.telegram.ui.ActionBar.f7.V(textView, i16, snVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(parentActivity, snVar);
                    z90Var.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description1"), snVar));
                    org.telegram.ui.ActionBar.f7.H(z90Var, org.telegram.ui.ActionBar.y6.gc, snVar);
                    org.telegram.ui.ActionBar.f7.V(z90Var, i16, snVar);
                    z90Var.setTextSize(1, 14.0f);
                    z90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    z90Var.setOnLinkPressListener(new org.telegram.ui.Components.y90() { // from class: org.telegram.ui.g81
                        @Override // org.telegram.ui.Components.y90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(i81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(i81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(i81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.z90 z90Var2 = new org.telegram.ui.Components.z90(parentActivity, null);
                    z90Var2.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description2"), snVar));
                    org.telegram.ui.ActionBar.f7.V(z90Var2, i16, snVar);
                    z90Var2.setTextSize(1, 14.0f);
                    z90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    z90Var2.setOnLinkPressListener(new org.telegram.ui.Components.y90() { // from class: org.telegram.ui.g81
                        @Override // org.telegram.ui.Components.y90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(i81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(i81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(i81Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.z90 z90Var3 = new org.telegram.ui.Components.z90(parentActivity, null);
                    z90Var3.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description3"), snVar));
                    org.telegram.ui.ActionBar.f7.V(z90Var3, i16, snVar);
                    z90Var3.setTextSize(1, 14.0f);
                    z90Var3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    z90Var3.setOnLinkPressListener(new org.telegram.ui.Components.y90() { // from class: org.telegram.ui.g81
                        @Override // org.telegram.ui.Components.y90
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i12) {
                                case 0:
                                    clickableSpan.onClick(i81Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(i81Var);
                                    break;
                                default:
                                    clickableSpan.onClick(i81Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i17 = org.telegram.ui.ActionBar.y6.Oh;
                    paint.setColor(org.telegram.ui.ActionBar.y6.w0(i17, snVar));
                    paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                    mk mkVar = new mk(parentActivity, paint);
                    mkVar.setOnClickListener(new h81(parentActivity));
                    mkVar.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
                    mkVar.setText(LocaleController.getString(R.string.SponsoredMessageAlertLearnMoreUrl));
                    org.telegram.ui.ActionBar.f7.V(mkVar, i17, snVar);
                    int i18 = org.telegram.ui.ActionBar.y6.h5;
                    org.telegram.ui.Cells.y e = org.telegram.ui.ActionBar.o6.e(new float[]{4.0f}, org.telegram.ui.ActionBar.y6.w0(i18, snVar));
                    org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i18);
                    org.telegram.ui.ActionBar.b7 f10 = org.telegram.ui.ActionBar.f7.f(i18);
                    mkVar.setBackground(e);
                    org.telegram.ui.ActionBar.f7.k(mkVar, e, N, f10, snVar);
                    mkVar.setTextSize(1, 14.0f);
                    mkVar.setGravity(16);
                    org.telegram.ui.Components.z90 z90Var4 = new org.telegram.ui.Components.z90(parentActivity, null);
                    z90Var4.setText(AndroidUtilities.replaceLinks(LocaleController.getString("SponsoredMessageInfo2Description4"), snVar));
                    z90Var4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.f7.V(z90Var4, i16, snVar);
                    z90Var4.setTextSize(1, 14.0f);
                    textView.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(textView);
                    z90Var.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(z90Var, org.telegram.ui.Components.gb1.x(-1, -2, 0, 0, 18, 0, 0));
                    z90Var2.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(z90Var2, org.telegram.ui.Components.gb1.x(-1, -2, 0, 0, 24, 0, 0));
                    z90Var3.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(z90Var3, org.telegram.ui.Components.gb1.x(-1, -2, 0, 0, 24, 0, 0));
                    f7.addView(mkVar, org.telegram.ui.Components.gb1.x(-2, 34, 1, 22, 14, 22, 0));
                    z90Var4.setPadding(AndroidUtilities.dp(22.0f), 0, AndroidUtilities.dp(22.0f), 0);
                    f7.addView(z90Var4, org.telegram.ui.Components.gb1.x(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(i81Var.getContext());
                    scrollView.addView(f7);
                    i81Var.addView(scrollView, org.telegram.ui.Components.gb1.h(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    i15.customView = i81Var;
                    i15.show();
                    break;
                }
                break;
            case 11:
                unVar.finishPreviewFragment();
                break;
            case 12:
                unVar.getClass();
                unVar.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) unVar, 28, true));
                break;
            case 13:
                un unVar3 = this.b;
                org.telegram.ui.Components.g5.i0(unVar3, unVar3.f6, unVar3.f, unVar3.e, unVar3.h, unVar3.Z1.getTag(R.id.object_tag) != null, unVar3.l8, new tg(unVar3, i12), unVar3.qa);
                break;
            case 14:
                un.k0(unVar);
                break;
            case 15:
                if (unVar.o4 != null) {
                    TopicsController topicsController = unVar.getMessagesController().getTopicsController();
                    long j10 = unVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = unVar.o4;
                    int i19 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    topicsController.toggleCloseTopic(j10, i19, false);
                }
                unVar.ed();
                unVar.uc(false);
                unVar.dd(true);
                break;
            case 16:
                long j11 = unVar.f6;
                if (unVar.h != null) {
                    j11 = unVar.f.id;
                }
                unVar.uc = false;
                unVar.getMessagesController().hidePeerSettingsBar(j11, unVar.f, unVar.e);
                unVar.dd(true);
                unVar.Bc(true);
                break;
            case 17:
                un unVar4 = this.b;
                unVar4.P4 = true;
                if (!unVar4.O9() || unVar4.t4) {
                    int i20 = unVar4.X4;
                    if (i20 != 0) {
                        if (!unVar4.T4.isEmpty()) {
                            if (i20 == ((Integer) ic.a.g(1, unVar4.T4)).intValue()) {
                                i13 = ((Integer) unVar4.T4.get(0)).intValue() + 1;
                                unVar4.a5 = true;
                            } else {
                                unVar4.a5 = false;
                                i13 = i20 - 1;
                            }
                        }
                        unVar4.Z4 = i13;
                        if (!unVar4.a5) {
                            i13 = -i13;
                        }
                        unVar4.j(i20, 0, true, 0, true, i13);
                        unVar4.Hc();
                        break;
                    }
                } else {
                    unVar4.j((int) unVar4.p4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                unVar.sa(false);
                break;
            case 19:
                un.c1(unVar);
                break;
            case 20:
                un.H0(unVar);
                break;
            case 21:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", unVar.a());
                unVar.presentFragment(new uk(bundle2));
                break;
            case 22:
                un.U0(unVar);
                break;
            case 23:
                un.X0(unVar);
                break;
            case 24:
                unVar.la(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = unVar.i6;
                for (int i21 = 1; i21 >= 0; i21--) {
                    if (messageObject == null && sparseArrayArr[i21].size() != 0) {
                        messageObject = (MessageObject) unVar.A6[i21].get(sparseArrayArr[i21].keyAt(0));
                    }
                    sparseArrayArr[i21].clear();
                    unVar.j6[i21].clear();
                    unVar.k6[i21].clear();
                }
                unVar.m9();
                if (messageObject != null && ((i10 = messageObject.messageOwner.id) > 0 || (i10 < 0 && unVar.h != null))) {
                    unVar.Nb(messageObject);
                }
                unVar.Lc(0, true);
                unVar.jd(false);
                unVar.Yc();
                break;
            case 26:
                un.J0(unVar);
                break;
            case 27:
                un unVar5 = this.b;
                MessageObject messageObject3 = unVar5.B5;
                if (messageObject3 != null) {
                    unVar5.j(messageObject3.getId(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                unVar.va(unVar.N9() ? "" : null);
                break;
            default:
                unVar.X7();
                unVar.K3.m(unVar.f6, LocaleController.getString(R.string.BroadcastGroupInfo), 18);
                break;
        }
    }
}
