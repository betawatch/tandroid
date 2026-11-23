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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements gx, org.telegram.ui.Components.rj0, org.telegram.ui.Components.gu0, org.telegram.ui.Components.if0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.yo, org.telegram.messenger.w10, org.telegram.ui.Components.oc0, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.nj0, jg.y1, org.telegram.ui.Components.sj0, r0.m, te.b, xg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zr(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        oe0 oe0Var = (oe0) this.b;
        oe0Var.getClass();
        oe0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        oe0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        y80 y80Var = (y80) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        if (!y80Var.a.equals(I0)) {
            y80Var.a = I0;
            y80Var.requestLayout();
        }
        int childCount = y80Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            r0.i0.b(y80Var.getChildAt(i7), l1Var);
        }
        return l1Var;
    }

    @Override // jg.y1
    public /* synthetic */ void P1(ArrayList arrayList) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.xg0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.gx
    public void b() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.b;
        int i7 = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 15:
                break;
            case 23:
                final og0 og0Var = (og0) obj;
                if (i7 >= og0Var.J && i7 < og0Var.K) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) og0Var.y.get(i7 - og0Var.J);
                    final long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                    final boolean E = org.telegram.messenger.n5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, og0Var.getParentActivity(), og0Var.getResourceProvider());
                    if (gjVar.x4()) {
                        arrayList.add(org.telegram.messenger.hd.N0(E ? 2131747592 : 2131747617, null));
                        arrayList3.add(Integer.valueOf(E ? R.drawable.msg_openprofile : R.drawable.msg_channel));
                    } else {
                        org.telegram.ui.Cells.c0.v(null, 2131743305, arrayList, R.drawable.msg_msgbubble3, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.g0.a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        iArr[i11] = ((Integer) arrayList3.get(i11)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.hg0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i12) {
                            org.telegram.messenger.gj gjVar2 = gjVar;
                            boolean x42 = gjVar2.x4();
                            org.telegram.ui.ActionBar.g2 g2Var = og0.this;
                            boolean z10 = E;
                            long j3 = B0;
                            if (x42) {
                                g2Var.presentFragment(z10 ? ProfileActivity.D4(j3) : bn.ua(j3));
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j3);
                            } else {
                                bundle.putLong("chat_id", -j3);
                            }
                            bundle.putInt("message_id", gjVar2.e1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (g2Var.getMessagesController().E(bundle, g2Var, null, null)) {
                                g2Var.presentFragment(new bn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.Q = charSequenceArr;
                    t1Var.R = iArr;
                    t1Var.N = onClickListener;
                    og0Var.showDialog(t1Var);
                    break;
                }
                break;
            default:
                yh0 yh0Var = (yh0) obj;
                yh0Var.getClass();
                if (view instanceof xh0) {
                    xh0 xh0Var = (xh0) view;
                    yh0Var.e0(xh0Var.e);
                    xh0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h d1() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.messenger.yo
    public boolean e(TLRPC.TL_error tL_error) {
        ((d3.e0) this.b).run();
        return true;
    }

    @Override // org.telegram.ui.Components.rj0
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.ui.Components.o41 G;
        Object obj;
        long j3;
        int Z;
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 1:
                ws wsVar = (ws) obj2;
                HashSet hashSet = wsVar.X1;
                if (!wsVar.Y1 && (G = wsVar.Z1.G(i7 - 1)) != null && (obj = G.H) != null) {
                    if (obj instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) obj).id;
                    } else if (obj instanceof TLRPC.Chat) {
                        j3 = ((TLRPC.Chat) obj).id;
                    }
                    if (hashSet.contains(Long.valueOf(j3))) {
                        hashSet.remove(Long.valueOf(j3));
                    } else {
                        hashSet.add(Long.valueOf(j3));
                    }
                    if (view instanceof ah.r) {
                        ((ah.r) view).c(hashSet.contains(Long.valueOf(j3)), true);
                        break;
                    }
                }
                break;
            case 2:
                DataAutoDownloadActivity.b0((DataAutoDownloadActivity) obj2, view, i7, f10);
                break;
            default:
                z90 z90Var = (z90) obj2;
                ArrayList arrayList = z90Var.s;
                if (view != null && i7 >= 0 && i7 < arrayList.size()) {
                    u90 u90Var = (u90) arrayList.get(i7);
                    int i11 = u90Var.a;
                    int i12 = u90Var.e;
                    if (i11 == 3 || i11 == 4) {
                        if (!org.telegram.messenger.qc.f()) {
                            if (u90Var.a == 3 && Integer.bitCount(i12) > 1 && (!org.telegram.messenger.hd.a0 ? f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 <= org.telegram.messenger.g0.L(75.0f)) && (Z = z90Var.Z(i12)) != -1) {
                                z90Var.n[Z] = !r7[Z];
                                z90Var.d0();
                                z90Var.c0();
                                break;
                            } else {
                                boolean z10 = (org.telegram.messenger.qc.d(true) & i12) > 0;
                                int d = org.telegram.messenger.qc.d(true);
                                org.telegram.messenger.qc.i = !z10 ? d | i12 : d & (~i12);
                                org.telegram.messenger.qc.k();
                                z90Var.d0();
                            }
                        } else {
                            z90Var.e = org.telegram.ui.Components.lc.b0(z90Var).M(new org.telegram.ui.Components.s9(0.1f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Y5, false)), org.telegram.messenger.hd.N0(2131748676, null)).j();
                            break;
                        }
                    } else if (i11 == 5 && u90Var.f == 1) {
                        SharedPreferences g12 = org.telegram.messenger.np.g1();
                        boolean z11 = g12.getBoolean("view_animations", true);
                        SharedPreferences.Editor edit = g12.edit();
                        boolean z12 = !z11;
                        edit.putBoolean("view_animations", z12);
                        org.telegram.messenger.cz.C1 = Boolean.valueOf(z12);
                        edit.commit();
                        ((org.telegram.ui.Cells.n8) view).setChecked(z12);
                    }
                    ri.q.f();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        int i10;
        yf.e eVar;
        int i11 = this.a;
        int i12 = 1;
        Object obj = this.b;
        switch (i11) {
            case 5:
                ((bi.q2) obj).run();
                break;
            case 14:
                ((h50) obj).Z(true);
                break;
            case 16:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g((StringBuilder) obj);
                break;
            case 19:
                pb0 pb0Var = (pb0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", pb0Var.J);
                bundle.putString("ephone", pb0Var.K);
                bundle.putString("phoneFormated", pb0Var.M);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = pb0Var.M;
                tL_auth_resetLoginEmail.phone_code_hash = pb0Var.N;
                pb0Var.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new gb0(pb0Var, bundle, tL_auth_resetLoginEmail, i12), 10);
                break;
            case 20:
                xb0 xb0Var = (xb0) obj;
                de0.t0(xb0Var.E, xb0Var.s, xb0Var.w, xb0Var.x);
                break;
            case 21:
                qc0 qc0Var = (qc0) obj;
                de0 de0Var = qc0Var.H;
                de0Var.F1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i10 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(deleteaccount, new l(qc0Var, 12), 10);
                break;
            case 26:
                ((bi.t4) obj).run();
                break;
            case 28:
                yh0 yh0Var = ((vh0) obj).b;
                SparseArray sparseArray = yh0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    wh0 wh0Var = (wh0) sparseArray.valueAt(i13);
                    TLRPC.Document document = wh0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.c cVar = yh0Var.getMediaDataController().A0;
                        TLRPC.Document document2 = wh0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f) {
                                cVar.f(true);
                                cVar.f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((yf.b) arrayList2.get(i14)).a == null || ((yf.b) arrayList2.get(i14)).a.id != document2.id) {
                                        i14++;
                                    } else {
                                        arrayList2.remove(i14);
                                    }
                                }
                            }
                        }
                    }
                    if (wh0Var.g != null && (eVar = (yf.e) yh0Var.getMediaDataController().a0.get(wh0Var.g)) != null) {
                        eVar.c = true;
                        eVar.a();
                        int i15 = eVar.a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i15);
                        String str2 = eVar.b;
                        G.b(str2, false);
                        org.telegram.messenger.si.d0(i15).l1(str2, null, true);
                    }
                    if (wh0Var == yh0Var.H) {
                        yh0Var.N = null;
                        yh0Var.H = (wh0) yh0Var.b.get(0);
                        yh0Var.I = true;
                    }
                    yh0Var.a.remove(wh0Var);
                    yh0Var.c.remove(wh0Var);
                }
                yh0Var.getMediaDataController().A0.h();
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
                    yh0Var.getConnectionsManager().sendRequest(saveringtone, new fi.l5(9));
                }
                yh0.b0(yh0Var);
                yh0Var.i0();
                yh0Var.e.f();
                t1Var.dismiss();
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.cz.s = "";
                org.telegram.messenger.cz.x = false;
                org.telegram.messenger.cz.y();
                passcodeActivity.getMediaDataController().o();
                int childCount = passcodeActivity.c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.x9) {
                            org.telegram.ui.ActionBar.t6.U(((org.telegram.ui.Cells.x9) childAt).getTextView(), org.telegram.ui.ActionBar.m6.E6, null);
                        } else {
                            i17++;
                        }
                    }
                }
                org.telegram.messenger.ls.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        iy iyVar = (iy) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && iyVar.y.isShowing()) {
            iyVar.y.d(true);
        }
    }

    @Override // org.telegram.ui.Components.gu0
    public void k(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((l4) this.b).e;
        org.telegram.messenger.z5 z5Var = (org.telegram.messenger.z5) dataAutoDownloadActivity.c.get(i7);
        if (z5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 0;
        } else if (z5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 1;
        } else if (z5Var == dataAutoDownloadActivity.G) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i17 = dataAutoDownloadActivity.f;
        if (i17 == 0) {
            i16 = ((org.telegram.ui.ActionBar.g2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.a6.q(i16).Q = dataAutoDownloadActivity.e;
        } else if (i17 == 1) {
            i11 = ((org.telegram.ui.ActionBar.g2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.a6.q(i11).R = dataAutoDownloadActivity.e;
        } else {
            i10 = ((org.telegram.ui.ActionBar.g2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.a6.q(i10).S = dataAutoDownloadActivity.e;
        }
        i12 = ((org.telegram.ui.ActionBar.g2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = org.telegram.messenger.np.u1(i12).h7.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.e);
        edit.commit();
        i13 = ((org.telegram.ui.ActionBar.g2) dataAutoDownloadActivity).currentAccount;
        org.telegram.messenger.a6.q(i13).g();
        for (int i18 = 0; i18 < 4; i18++) {
            org.telegram.ui.Components.ek0 ek0Var = dataAutoDownloadActivity.b;
            i14 = dataAutoDownloadActivity.photosRow;
            v4.f1 K = ek0Var.K(i14 + i18);
            if (K != null) {
                l4 l4Var = dataAutoDownloadActivity.a;
                i15 = dataAutoDownloadActivity.photosRow;
                l4Var.t(K, i15 + i18);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override // org.telegram.messenger.w10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        rx rxVar = (rx) this.b;
        View view = (View) obj2;
        if (((org.telegram.ui.Components.o41) obj).d != 1 || rxVar.b == null) {
            return;
        }
        boolean z10 = !rxVar.c;
        rxVar.c = z10;
        fi.b0 b0Var = rxVar.h;
        if (b0Var != null) {
            b0Var.a(Boolean.valueOf(z10), Boolean.valueOf(rxVar.d), Boolean.valueOf(rxVar.e));
        }
        ((org.telegram.ui.Cells.s8) view).setChecked(rxVar.c);
        rxVar.f.g3.O(true);
    }

    @Override // org.telegram.ui.Components.oc0
    public void p(org.telegram.ui.Components.qc0 qc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.y;
        org.telegram.messenger.cz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.e(intent, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.ls.e().k(org.telegram.messenger.ls.o0, qc0Var);
    }

    @Override // jg.y1
    public void r(int i7) {
        switch (this.a) {
            case 13:
                x40 x40Var = (x40) this.b;
                z40 z40Var = x40Var.J;
                z40Var.v0(x40Var.I);
                if (x40Var.h == null && !x40Var.f.e() && x40Var.b() == 0) {
                    z40Var.s.e(false, true);
                }
                x40Var.f();
                break;
            default:
                sh0 sh0Var = (sh0) this.b;
                if (sh0Var.f == null && !sh0Var.h.e()) {
                    sh0Var.n.c.c();
                }
                sh0Var.f();
                break;
        }
    }

    @Override // org.telegram.ui.Components.nj0
    public int run() {
        return ((FiltersSetupActivity) this.b).x;
    }

    @Override // org.telegram.ui.Components.rj0
    public /* synthetic */ void s0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // jg.y1
    public /* synthetic */ boolean v1(int i7) {
        switch (this.a) {
        }
        return true;
    }

    private final /* synthetic */ void m(ArrayList arrayList) {
    }

    private final /* synthetic */ void n(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.gu0
    public /* synthetic */ void o() {
    }

    @Override // te.b
    public /* synthetic */ void D(float f10, int i7) {
    }

    private final /* synthetic */ void d(View view, float f10, float f11) {
    }

    private final /* synthetic */ void g(View view, float f10, float f11) {
    }

    private final /* synthetic */ void i(View view, float f10, float f11) {
    }
}
