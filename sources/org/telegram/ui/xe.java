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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        int i12 = 2;
        org.telegram.messenger.jj jjVar = null;
        final int i13 = 0;
        final int i14 = 1;
        un unVar = this.b;
        switch (i11) {
            case 0:
                un unVar2 = this.b;
                kg.q0.w1(unVar2, unVar2.R1, unVar2.S1, unVar2.j6, false);
                break;
            case 1:
                unVar.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", unVar.r);
                unVar.presentFragment(new ProfileActivity(bundle, null));
                break;
            case 2:
                if (unVar.Y3 != null) {
                    unVar.ec(!unVar.Uc.f);
                    break;
                }
                break;
            case 3:
                unVar.Cb(!unVar.C0.N);
                break;
            case 4:
                ek ekVar = unVar.W1;
                if (ekVar != null) {
                    ekVar.setReversed(true);
                    unVar.W1.getAdapter().k0 = true;
                    unVar.u7();
                }
                unVar.g3.setVisibility(8);
                unVar.h3.setVisibility(8);
                unVar.B3 = true;
                unVar.C3 = null;
                unVar.D3 = null;
                unVar.j0.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745774, null));
                unVar.j0.setSearchFieldCaption(org.telegram.messenger.cd.L0(2131745783, null));
                org.telegram.messenger.i0.J3(unVar.j0.getSearchField());
                unVar.j0.n();
                break;
            case 5:
                if (unVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t0 t0Var = unVar.j0;
                    if (t0Var != null) {
                        org.telegram.messenger.i0.v1(t0Var.getSearchField());
                    }
                    unVar.showDialog((org.telegram.ui.ActionBar.z2) org.telegram.ui.Components.s4.o(unVar.getParentActivity(), new fl(unVar), unVar.xa).b);
                    break;
                }
                break;
            case 6:
                unVar.I7(true);
                break;
            case 7:
                org.telegram.messenger.jj jjVar2 = unVar.t5;
                if (jjVar2 != null) {
                    unVar.Z9(jjVar2, false, false);
                    gf.f.q(unVar.getParentActivity(), Uri.parse(unVar.t5.R0), true, false, false, null, null, false, unVar.getMessagesController().e6, false);
                    break;
                }
                break;
            case 8:
                if (org.telegram.messenger.i0.g(unVar.t5.U0)) {
                    org.telegram.messenger.z20.r(null, 2131744219, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.xa));
                    break;
                }
                break;
            case 9:
                if (org.telegram.messenger.i0.g(unVar.t5.V0)) {
                    org.telegram.messenger.z20.r(null, 2131744219, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.xa));
                    break;
                }
                break;
            case 10:
                if (unVar.l1 != null && unVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, unVar.l1.getContext(), null, false);
                    Activity parentActivity = unVar.getParentActivity();
                    sn snVar = unVar.xa;
                    final dg0 dg0Var = new dg0(parentActivity, 10);
                    LinearLayout e = org.telegram.messenger.m5.e(parentActivity, 1);
                    TextView textView = new TextView(parentActivity);
                    textView.setText(org.telegram.messenger.cd.L0(2131745272, null));
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    int i15 = org.telegram.ui.ActionBar.t6.G6;
                    org.telegram.ui.ActionBar.a7.V(textView, i15, snVar);
                    textView.setTextSize(1, 20.0f);
                    org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(parentActivity, snVar);
                    p80Var.setText(org.telegram.messenger.i0.K2(org.telegram.messenger.cd.M0("SponsoredMessageInfo2Description1"), snVar, null));
                    org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, snVar);
                    org.telegram.ui.ActionBar.a7.V(p80Var, i15, snVar);
                    p80Var.setTextSize(1, 14.0f);
                    p80Var.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    p80Var.setOnLinkPressListener(new org.telegram.ui.Components.o80() { // from class: org.telegram.ui.g51
                        @Override // org.telegram.ui.Components.o80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i13) {
                                case 0:
                                    clickableSpan.onClick(dg0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(dg0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(dg0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.p80 p80Var2 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var2.setText(org.telegram.messenger.i0.K2(org.telegram.messenger.cd.M0("SponsoredMessageInfo2Description2"), snVar, null));
                    org.telegram.ui.ActionBar.a7.V(p80Var2, i15, snVar);
                    p80Var2.setTextSize(1, 14.0f);
                    p80Var2.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    p80Var2.setOnLinkPressListener(new org.telegram.ui.Components.o80() { // from class: org.telegram.ui.g51
                        @Override // org.telegram.ui.Components.o80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i14) {
                                case 0:
                                    clickableSpan.onClick(dg0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(dg0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(dg0Var);
                                    break;
                            }
                        }
                    });
                    org.telegram.ui.Components.p80 p80Var3 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var3.setText(org.telegram.messenger.i0.K2(org.telegram.messenger.cd.M0("SponsoredMessageInfo2Description3"), snVar, null));
                    org.telegram.ui.ActionBar.a7.V(p80Var3, i15, snVar);
                    p80Var3.setTextSize(1, 14.0f);
                    p80Var3.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    final int i16 = 2;
                    p80Var3.setOnLinkPressListener(new org.telegram.ui.Components.o80() { // from class: org.telegram.ui.g51
                        @Override // org.telegram.ui.Components.o80
                        public final void a(ClickableSpan clickableSpan) {
                            switch (i16) {
                                case 0:
                                    clickableSpan.onClick(dg0Var);
                                    break;
                                case 1:
                                    clickableSpan.onClick(dg0Var);
                                    break;
                                default:
                                    clickableSpan.onClick(dg0Var);
                                    break;
                            }
                        }
                    });
                    Paint paint = new Paint(1);
                    paint.setStyle(Paint.Style.STROKE);
                    int i17 = org.telegram.ui.ActionBar.t6.Ci;
                    paint.setColor(org.telegram.ui.ActionBar.t6.w0(i17, snVar));
                    paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
                    org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(parentActivity, paint);
                    q2Var.setOnClickListener(new z7(parentActivity, 3));
                    q2Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
                    q2Var.setText(org.telegram.messenger.cd.L0(2131745273, null));
                    org.telegram.ui.ActionBar.a7.V(q2Var, i17, snVar);
                    int i18 = org.telegram.ui.ActionBar.t6.h5;
                    org.telegram.ui.Cells.y e7 = org.telegram.ui.ActionBar.j6.e(org.telegram.ui.ActionBar.t6.w0(i18, snVar), 4.0f);
                    org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i18);
                    org.telegram.ui.ActionBar.w6 f7 = org.telegram.ui.ActionBar.a7.f(i18);
                    q2Var.setBackground(e7);
                    org.telegram.ui.ActionBar.a7.k(q2Var, e7, N, f7, snVar);
                    q2Var.setTextSize(1, 14.0f);
                    q2Var.setGravity(16);
                    org.telegram.ui.Components.p80 p80Var4 = new org.telegram.ui.Components.p80(parentActivity, null);
                    p80Var4.setText(org.telegram.messenger.i0.K2(org.telegram.messenger.cd.M0("SponsoredMessageInfo2Description4"), snVar, null));
                    p80Var4.setLineSpacing(org.telegram.messenger.i0.L(2.0f), 1.0f);
                    org.telegram.ui.ActionBar.a7.V(p80Var4, i15, snVar);
                    p80Var4.setTextSize(1, 14.0f);
                    textView.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                    e.addView(textView);
                    p80Var.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                    e.addView(p80Var, w7.b6.t(-1, -2, 0, 0, 18, 0, 0));
                    p80Var2.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                    e.addView(p80Var2, w7.b6.t(-1, -2, 0, 0, 24, 0, 0));
                    p80Var3.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                    e.addView(p80Var3, w7.b6.t(-1, -2, 0, 0, 24, 0, 0));
                    e.addView(q2Var, w7.b6.t(-2, 34, 1, 22, 14, 22, 0));
                    p80Var4.setPadding(org.telegram.messenger.i0.L(22.0f), 0, org.telegram.messenger.i0.L(22.0f), 0);
                    e.addView(p80Var4, w7.b6.t(-1, -2, 0, 0, 14, 0, 0));
                    ScrollView scrollView = new ScrollView(dg0Var.getContext());
                    scrollView.addView(e);
                    dg0Var.addView(scrollView, w7.b6.d(-1, -2.0f, 0, 0.0f, 12.0f, 0.0f, 22.0f));
                    k10.N = dg0Var;
                    k10.show();
                    break;
                }
                break;
            case 11:
                unVar.finishPreviewFragment();
                break;
            case 12:
                unVar.getClass();
                unVar.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) unVar, 28, true));
                break;
            case 13:
                un unVar3 = this.b;
                org.telegram.ui.Components.s4.i0(unVar3, unVar3.j6, unVar3.f, unVar3.e, unVar3.h, unVar3.b2.getTag(R.id.object_tag) != null, unVar3.p8, new sg(unVar3, i12), unVar3.xa);
                break;
            case 14:
                un.p0(unVar);
                break;
            case 15:
                if (unVar.q4 != null) {
                    org.telegram.messenger.x00 x00Var = unVar.getMessagesController().r7;
                    long j10 = unVar.e.id;
                    TLRPC.TL_forumTopic tL_forumTopic = unVar.q4;
                    int i19 = tL_forumTopic.id;
                    tL_forumTopic.closed = false;
                    x00Var.z(i19, j10, false);
                }
                unVar.md();
                unVar.Bc(false);
                unVar.ld(true);
                break;
            case 16:
                long j11 = unVar.j6;
                if (unVar.h != null) {
                    j11 = unVar.f.id;
                }
                unVar.tc = false;
                unVar.getMessagesController().h2(j11, unVar.f, unVar.e);
                unVar.ld(true);
                unVar.Ic(true);
                break;
            case 17:
                un unVar4 = this.b;
                unVar4.P4 = true;
                if (!unVar4.T9() || unVar4.v4) {
                    int i20 = unVar4.X4;
                    if (i20 != 0) {
                        if (!unVar4.T4.isEmpty()) {
                            if (i20 == ((Integer) i0.a.g(1, unVar4.T4)).intValue()) {
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
                        unVar4.k(i20, 0, true, 0, true, i13);
                        unVar4.Oc();
                        break;
                    }
                } else {
                    unVar4.k((int) unVar4.r4, 0, true, 0, true, 0);
                    break;
                }
                break;
            case 18:
                unVar.ya(false);
                break;
            case 19:
                un.g1(unVar);
                break;
            case 20:
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", unVar.a());
                unVar.presentFragment(new yk(bundle2));
                break;
            case 21:
                un.N0(unVar);
                break;
            case 22:
                un.G1(unVar);
                break;
            case 23:
                un.p1(unVar);
                break;
            case 24:
                unVar.ra(false);
                break;
            case 25:
                SparseArray[] sparseArrayArr = unVar.m6;
                for (int i21 = 1; i21 >= 0; i21--) {
                    if (jjVar == null && sparseArrayArr[i21].size() != 0) {
                        jjVar = (org.telegram.messenger.jj) unVar.E6[i21].get(sparseArrayArr[i21].keyAt(0));
                    }
                    sparseArrayArr[i21].clear();
                    unVar.n6[i21].clear();
                    unVar.o6[i21].clear();
                }
                unVar.p9();
                if (jjVar != null && ((i10 = jjVar.k.id) > 0 || (i10 < 0 && unVar.h != null))) {
                    unVar.Ub(jjVar);
                }
                unVar.Sc(0, true);
                unVar.sd(false);
                unVar.fd();
                break;
            case 26:
                un.P0(unVar);
                break;
            case 27:
                un unVar5 = this.b;
                org.telegram.messenger.jj jjVar3 = unVar5.F5;
                if (jjVar3 != null) {
                    unVar5.k(jjVar3.f1(), 0, true, 0, true, 0);
                    break;
                }
                break;
            case 28:
                unVar.Ba(unVar.S9() ? "" : null);
                break;
            default:
                unVar.Y7();
                unVar.M3.m(unVar.j6, org.telegram.messenger.cd.L0(2131752880, null), 18);
                break;
        }
    }
}
