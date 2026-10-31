package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zn(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Activity W;
        int i10 = this.a;
        long j10 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        int i11 = 0;
        switch (i10) {
            case 0:
                final oo ooVar = (oo) obj2;
                final boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, ooVar.getParentActivity(), null);
                    x1Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !ooVar.M.d();
                    if (ooVar.M.getCheckBox().F == null) {
                        ooVar.M.setChecked(z10);
                    }
                    org.telegram.messenger.i3 G0 = ooVar.getMessagesController().G0();
                    final long j11 = this.b;
                    G0.a(j11, new org.telegram.messenger.q20() { // from class: org.telegram.ui.io
                        @Override // org.telegram.messenger.q20
                        public final void a(Object obj3) {
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj3;
                            oo ooVar2 = oo.this;
                            TLRPC.Chat chat = ooVar2.w0;
                            int i12 = chat.level;
                            int i13 = tL_premium_boostsStatus.level;
                            if (i12 != i13) {
                                chat.level = i13;
                                ooVar2.getMessagesController().N3(ooVar2.w0, false);
                            }
                            ooVar2.M.getCheckBox().setIcon(tL_premium_boostsStatus.level < ooVar2.getMessagesController().B4 ? R.drawable.permission_locked : 0);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.x1 x1Var2 = x1Var;
                            if (z11 && tL_premium_boostsStatus.level < ooVar2.getMessagesController().B4) {
                                ooVar2.M.setChecked(false);
                                zArr2[0] = false;
                                org.telegram.messenger.i3 G02 = ooVar2.getMessagesController().G0();
                                long j12 = j11;
                                G02.b(j12, tL_premium_boostsStatus, new ko(ooVar2, x1Var2, tL_premium_boostsStatus, j12, 0));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            ooVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = org.telegram.messenger.vp.h1(ooVar2.w0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            ooVar2.M.setChecked(z11);
                            zArr2[0] = false;
                            x1Var2.dismiss();
                            ooVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new org.telegram.messenger.voip.u0(3, ooVar2, z11), 64);
                        }
                    });
                    break;
                }
                break;
            case 1:
                ((org.telegram.ui.ActionBar.x1[]) obj2)[0].dismiss();
                ((org.telegram.ui.Components.pr) obj).run(-j10);
                break;
            case 2:
                ((org.telegram.ui.ActionBar.x1[]) obj2)[0].dismiss();
                ((org.telegram.ui.Components.pr) obj).run(-j10);
                break;
            case 3:
                org.telegram.ui.Components.m60 m60Var = (org.telegram.ui.Components.m60) obj2;
                Context context = (Context) obj;
                a0.h hVar = m60Var.W1;
                if ((m60Var.d2 != null || !hVar.i()) && (W = org.telegram.messenger.i0.W(context)) != null) {
                    if (m60Var.d2 != null) {
                        ArrayList arrayList = new ArrayList();
                        while (i11 < hVar.m()) {
                            arrayList.add(Long.valueOf(hVar.j(i11)));
                            i11++;
                        }
                        iy iyVar = (iy) m60Var.d2.b;
                        ArrayList arrayList2 = iyVar.e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        iyVar.d0();
                        hy hyVar = iyVar.f;
                        if (hyVar != null) {
                            hyVar.a();
                        }
                        m60Var.dismiss();
                        break;
                    } else {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                        String G = org.telegram.messenger.cd.G(hVar.m(), "AddManyMembersAlertTitle", new Object[0]);
                        org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder.a;
                        x1Var2.R = G;
                        StringBuilder sb2 = new StringBuilder();
                        for (int i12 = 0; i12 < hVar.m(); i12++) {
                            TLRPC.User Z1 = org.telegram.messenger.vp.r1(m60Var.a).Z1(Long.valueOf(hVar.j(i12)));
                            if (Z1 != null) {
                                if (sb2.length() > 0) {
                                    sb2.append(", ");
                                }
                                sb2.append("**");
                                sb2.append(org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                                sb2.append("**");
                            }
                        }
                        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(m60Var.a).L0(Long.valueOf(j10));
                        if (hVar.m() > 5) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.G(hVar.m(), "AddManyMembersAlertNamesText", L0.title)));
                            String format = String.format("%d", Integer.valueOf(hVar.m()));
                            int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                            if (indexOf >= 0) {
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), indexOf, format.length() + indexOf, 33);
                            }
                            x1Var2.T = spannableStringBuilder;
                        } else {
                            x1Var2.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("AddMembersAlertNamesText", null, 2131754399, sb2, L0.title));
                        }
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754486, null), new org.telegram.ui.Components.px(m60Var, 6));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        alertDialog$Builder.p();
                        break;
                    }
                }
                break;
            case 4:
                ay ayVar = (ay) obj2;
                boolean hasUnread = ((org.telegram.ui.Cells.v2) obj).getHasUnread();
                long j12 = this.b;
                if (hasUnread) {
                    ayVar.u4(j12);
                } else {
                    ayVar.getMessagesController().i3(j12, null, 0L);
                }
                ayVar.finishPreviewFragment();
                break;
            case 5:
                sm0 sm0Var = (sm0) obj2;
                sm0Var.getClass();
                long longValue = ((Long) ((TextView) obj).getTag()).longValue();
                Long l4 = sm0Var.H0;
                if (l4 == null || longValue != l4.longValue()) {
                    sm0Var.f[0].setText(org.telegram.messenger.cd.D0().q(this.b, false, true, true, sm0Var.C0.invoice.currency));
                } else {
                    sm0Var.m0 = true;
                    sm0Var.f[0].setText("");
                    sm0Var.m0 = false;
                    sm0Var.H0 = 0L;
                    sm0Var.Q0();
                }
                EditTextBoldCursor editTextBoldCursor = sm0Var.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                break;
            default:
                rh.e4 e4Var = (rh.e4) obj2;
                String str = (String) obj;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                if (Q != null) {
                    org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2();
                    i2Var.a = true;
                    ph.r3 r3Var = new ph.r3(e4Var.P1, str, this.b, e4Var.I0);
                    r3Var.e = new rh.w1(e4Var, i11);
                    Q.showAsSheet(r3Var, i2Var);
                    break;
                }
                break;
        }
    }
}
