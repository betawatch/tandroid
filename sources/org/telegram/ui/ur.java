package org.telegram.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Layout;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ur implements yw, org.telegram.ui.Components.gj0, org.telegram.ui.Components.tt0, org.telegram.ui.Components.ve0, org.telegram.ui.ActionBar.p1, org.telegram.messenger.so, org.telegram.messenger.s10, org.telegram.ui.Components.xb0, org.telegram.ui.ActionBar.d1, org.telegram.ui.Components.cj0, kg.u1, org.telegram.ui.Components.hj0, r0.m, ns, qe.b, mg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ur(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // kg.u1
    public /* synthetic */ a0.h C0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // kg.u1
    public /* synthetic */ boolean J1(int i3) {
        switch (this.a) {
        }
        return true;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        g80 g80Var = (g80) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        if (!g80Var.a.equals(I0)) {
            g80Var.a = I0;
            g80Var.requestLayout();
        }
        int childCount = g80Var.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            r0.i0.b(g80Var.getChildAt(i3), k1Var);
        }
        return k1Var;
    }

    @Override // qe.b
    public void Y(int i3, float f10, float f11, qe.c cVar) {
        ge0 ge0Var = (ge0) this.b;
        ge0Var.getClass();
        ge0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        ge0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override // org.telegram.messenger.so
    public boolean a(TLRPC.TL_error tL_error) {
        ((c3.f0) this.b).run();
        return true;
    }

    @Override // org.telegram.ui.Components.gj0
    public void b(float f10, float f11, int i3, View view) {
        org.telegram.ui.Components.r31 G;
        Object obj;
        long j10;
        int Z;
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 1:
                qs qsVar = (qs) obj2;
                HashSet hashSet = qsVar.U1;
                if (!qsVar.V1 && (G = qsVar.W1.G(i3 - 1)) != null && (obj = G.G) != null) {
                    if (obj instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) obj).id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j10 = ((TLRPC.Chat) obj).id;
                    }
                    if (hashSet.contains(Long.valueOf(j10))) {
                        hashSet.remove(Long.valueOf(j10));
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                    if (view instanceof bh.p) {
                        ((bh.p) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        break;
                    }
                }
                break;
            case 2:
                DataAutoDownloadActivity.b0((DataAutoDownloadActivity) obj2, view, i3, f10);
                break;
            default:
                t90 t90Var = (t90) obj2;
                ArrayList arrayList = t90Var.s;
                if (view != null && i3 >= 0 && i3 < arrayList.size()) {
                    o90 o90Var = (o90) arrayList.get(i3);
                    int i11 = o90Var.a;
                    int i12 = o90Var.e;
                    if (i11 == 3 || i11 == 4) {
                        if (!org.telegram.messenger.lc.f()) {
                            if (o90Var.a == 3 && Integer.bitCount(i12) > 1 && (!org.telegram.messenger.bd.a0 ? f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 <= org.telegram.messenger.g0.L(75.0f)) && (Z = t90Var.Z(i12)) != -1) {
                                t90Var.n[Z] = !r7[Z];
                                t90Var.d0();
                                t90Var.c0();
                                break;
                            } else {
                                boolean z10 = (org.telegram.messenger.lc.d(true) & i12) > 0;
                                int d = org.telegram.messenger.lc.d(true);
                                org.telegram.messenger.lc.i = !z10 ? d | i12 : d & (~i12);
                                org.telegram.messenger.lc.k();
                                t90Var.d0();
                            }
                        } else {
                            t90Var.e = org.telegram.ui.Components.fc.a0(t90Var).M(new org.telegram.ui.Components.m9(0.1f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Y5, false)), org.telegram.messenger.bd.M0(2131748877, null)).j();
                            break;
                        }
                    } else if (i11 == 5 && o90Var.f == 1) {
                        SharedPreferences e12 = org.telegram.messenger.hp.e1();
                        boolean z11 = e12.getBoolean("view_animations", true);
                        SharedPreferences.Editor edit = e12.edit();
                        boolean z12 = !z11;
                        edit.putBoolean("view_animations", z12);
                        org.telegram.messenger.az.C1 = Boolean.valueOf(z12);
                        edit.commit();
                        ((org.telegram.ui.Cells.l8) view).setChecked(z12);
                    }
                    pi.q.f();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // kg.u1
    public /* synthetic */ void b2(ArrayList arrayList) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.ns
    public void c(ks ksVar) {
        wd0 wd0Var = (wd0) this.b;
        wd0Var.L = true;
        String str = ksVar.c;
        wd0Var.a.setText(str);
        wd0Var.s(str, ksVar);
        wd0Var.G = ksVar;
        wd0Var.F = 0;
        wd0Var.L = false;
        org.telegram.messenger.hp.e1().edit().putString("phone_code_last_matched_" + ksVar.c, ksVar.d).apply();
        org.telegram.messenger.g0.i3(new nd0(wd0Var, 4), 300L);
        ud0 ud0Var = wd0Var.b;
        ud0Var.requestFocus();
        ud0Var.setSelection(ud0Var.length());
    }

    @Override // org.telegram.ui.mg0
    public void d(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 15:
                break;
            case 24:
                final dg0 dg0Var = (dg0) obj;
                if (i3 >= dg0Var.J && i3 < dg0Var.K) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) dg0Var.y.get(i3 - dg0Var.J);
                    final long B0 = org.telegram.messenger.zi.B0(ziVar.k);
                    final boolean E = org.telegram.messenger.m5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dg0Var.getParentActivity(), dg0Var.getResourceProvider());
                    if (ziVar.y4()) {
                        arrayList.add(org.telegram.messenger.bd.M0(E ? 2131747794 : 2131747819, null));
                        arrayList3.add(Integer.valueOf(E ? R.drawable.msg_openprofile : R.drawable.msg_channel));
                    } else {
                        org.telegram.ui.Cells.f1.x(null, 2131743560, arrayList, R.drawable.msg_msgbubble3, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.g0.a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        iArr[i11] = ((Integer) arrayList3.get(i11)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.yf0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i12) {
                            org.telegram.messenger.zi ziVar2 = ziVar;
                            boolean y42 = ziVar2.y4();
                            org.telegram.ui.ActionBar.d2 d2Var = dg0.this;
                            boolean z10 = E;
                            long j10 = B0;
                            if (y42) {
                                d2Var.presentFragment(z10 ? ProfileActivity.A4(j10) : wm.ra(j10));
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j10);
                            } else {
                                bundle.putLong("chat_id", -j10);
                            }
                            bundle.putInt("message_id", ziVar2.f1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (d2Var.getMessagesController().E(bundle, d2Var, null, null)) {
                                d2Var.presentFragment(new wm(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.Q = charSequenceArr;
                    s1Var.R = iArr;
                    s1Var.N = onClickListener;
                    dg0Var.showDialog(s1Var);
                    break;
                }
                break;
            default:
                ph0 ph0Var = (ph0) obj;
                ph0Var.getClass();
                if (view instanceof oh0) {
                    oh0 oh0Var = (oh0) view;
                    ph0Var.e0(oh0Var.e);
                    oh0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        int i10;
        zf.d dVar;
        int i11 = this.a;
        int i12 = 1;
        Object obj = this.b;
        switch (i11) {
            case 5:
                ((ai.r1) obj).run();
                break;
            case 14:
                ((a50) obj).Z(true);
                break;
            case 16:
                String str = LaunchActivity.E1;
                org.telegram.messenger.g0.g((StringBuilder) obj);
                break;
            case 19:
                lb0 lb0Var = (lb0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", lb0Var.J);
                bundle.putString("ephone", lb0Var.K);
                bundle.putString("phoneFormated", lb0Var.M);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = lb0Var.M;
                tL_auth_resetLoginEmail.phone_code_hash = lb0Var.N;
                lb0Var.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new bb0(lb0Var, bundle, tL_auth_resetLoginEmail, i12), 10);
                break;
            case 20:
                vb0 vb0Var = (vb0) obj;
                xd0.s0(vb0Var.E, vb0Var.s, vb0Var.w, vb0Var.x);
                break;
            case 21:
                oc0 oc0Var = (oc0) obj;
                xd0 xd0Var = oc0Var.H;
                xd0Var.w1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i10 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(deleteaccount, new l(oc0Var, 13), 10);
                break;
            case 27:
                ((org.telegram.messenger.kw) obj).run();
                break;
            default:
                ph0 ph0Var = ((mh0) obj).b;
                SparseArray sparseArray = ph0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    nh0 nh0Var = (nh0) sparseArray.valueAt(i13);
                    TLRPC.Document document = nh0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        zf.c cVar = ph0Var.getMediaDataController().A0;
                        TLRPC.Document document2 = nh0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f) {
                                cVar.f(true);
                                cVar.f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((zf.b) arrayList2.get(i14)).a == null || ((zf.b) arrayList2.get(i14)).a.id != document2.id) {
                                        i14++;
                                    } else {
                                        arrayList2.remove(i14);
                                    }
                                }
                            }
                        }
                    }
                    if (nh0Var.g != null && (dVar = (zf.d) ph0Var.getMediaDataController().a0.get(nh0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i15 = dVar.a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i15);
                        String str2 = dVar.b;
                        G.b(str2, false);
                        org.telegram.messenger.li.b0(i15).i1(str2, null, true);
                    }
                    if (nh0Var == ph0Var.H) {
                        ph0Var.N = null;
                        ph0Var.H = (nh0) ph0Var.b.get(0);
                        ph0Var.I = true;
                    }
                    ph0Var.a.remove(nh0Var);
                    ph0Var.c.remove(nh0Var);
                }
                ph0Var.getMediaDataController().A0.h();
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i16);
                    TL_account.saveRingtone saveringtone = new TL_account.saveRingtone();
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    saveringtone.id = tL_inputDocument;
                    tL_inputDocument.id = document3.id;
                    tL_inputDocument.access_hash = document3.access_hash;
                    byte[] bArr = document3.file_reference;
                    tL_inputDocument.file_reference = bArr;
                    if (bArr == null) {
                        tL_inputDocument.file_reference = new byte[0];
                    }
                    saveringtone.unsave = true;
                    ph0Var.getConnectionsManager().sendRequest(saveringtone, new ei.u5(9));
                }
                ph0.b0(ph0Var);
                ph0Var.i0();
                ph0Var.e.f();
                s1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.messenger.s10
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        kx kxVar = (kx) this.b;
        View view = (View) obj2;
        if (((org.telegram.ui.Components.r31) obj).d != 1 || kxVar.b == null) {
            return;
        }
        boolean z10 = !kxVar.c;
        kxVar.c = z10;
        ei.d0 d0Var = kxVar.h;
        if (d0Var != null) {
            d0Var.a(Boolean.valueOf(z10), Boolean.valueOf(kxVar.d), Boolean.valueOf(kxVar.e));
        }
        ((org.telegram.ui.Cells.q8) view).setChecked(kxVar.c);
        kxVar.f.g3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.d1
    public void k(KeyEvent keyEvent) {
        zx zxVar = (zx) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && zxVar.y.isShowing()) {
            zxVar.y.d(true);
        }
    }

    @Override // kg.u1
    public /* synthetic */ a0.h k1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.Components.tt0
    public void l(int i3) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((n4) this.b).e;
        org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) dataAutoDownloadActivity.c.get(i3);
        if (y5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 0;
        } else if (y5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 1;
        } else if (y5Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i17 = dataAutoDownloadActivity.f;
        if (i17 == 0) {
            i16 = ((org.telegram.ui.ActionBar.d2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.z5.q(i16).Q = dataAutoDownloadActivity.e;
        } else if (i17 == 1) {
            i11 = ((org.telegram.ui.ActionBar.d2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.z5.q(i11).R = dataAutoDownloadActivity.e;
        } else {
            i10 = ((org.telegram.ui.ActionBar.d2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.z5.q(i10).S = dataAutoDownloadActivity.e;
        }
        i12 = ((org.telegram.ui.ActionBar.d2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(i12).e7.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.e);
        edit.commit();
        i13 = ((org.telegram.ui.ActionBar.d2) dataAutoDownloadActivity).currentAccount;
        org.telegram.messenger.z5.q(i13).g();
        for (int i18 = 0; i18 < 4; i18++) {
            org.telegram.ui.Components.tj0 tj0Var = dataAutoDownloadActivity.b;
            i14 = dataAutoDownloadActivity.photosRow;
            u4.d1 K = tj0Var.K(i14 + i18);
            if (K != null) {
                n4 n4Var = dataAutoDownloadActivity.a;
                i15 = dataAutoDownloadActivity.photosRow;
                n4Var.t(K, i15 + i18);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override // org.telegram.ui.yw
    public void n() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.b;
        int i3 = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override // org.telegram.ui.Components.xb0
    public void q(org.telegram.ui.Components.zb0 zb0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.y;
        org.telegram.messenger.az.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.o0, zb0Var);
    }

    @Override // kg.u1
    public void r(int i3) {
        switch (this.a) {
            case 13:
                p40 p40Var = (p40) this.b;
                r40 r40Var = p40Var.J;
                r40Var.v0(p40Var.I);
                if (p40Var.h == null && !p40Var.f.e() && p40Var.b() == 0) {
                    r40Var.s.e(false, true);
                }
                p40Var.f();
                break;
            default:
                jh0 jh0Var = (jh0) this.b;
                if (jh0Var.f == null && !jh0Var.h.e()) {
                    jh0Var.n.c.c();
                }
                jh0Var.f();
                break;
        }
    }

    @Override // org.telegram.ui.Components.gj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i3 = this.a;
    }

    @Override // org.telegram.ui.Components.cj0
    public int run() {
        return ((FiltersSetupActivity) this.b).x;
    }

    private final /* synthetic */ void m(ArrayList arrayList) {
    }

    private final /* synthetic */ void o(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.tt0
    public /* synthetic */ void p() {
    }

    @Override // qe.b
    public /* synthetic */ void F(float f10, int i3) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void h(View view, float f10, float f11) {
    }

    private final /* synthetic */ void i(View view, float f10, float f11) {
    }
}
