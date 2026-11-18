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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements gx, org.telegram.ui.Components.pj0, org.telegram.ui.Components.du0, org.telegram.ui.Components.gf0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.xo, org.telegram.messenger.v10, org.telegram.ui.Components.nc0, org.telegram.ui.ActionBar.f1, org.telegram.ui.Components.lj0, jg.y1, org.telegram.ui.Components.qj0, r0.m, te.b, wg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zr(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // te.b
    public void H(int i7, float f10, float f11, te.c cVar) {
        ne0 ne0Var = (ne0) this.b;
        ne0Var.getClass();
        ne0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        ne0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        x80 x80Var = (x80) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        if (!x80Var.a.equals(I0)) {
            x80Var.a = I0;
            x80Var.requestLayout();
        }
        int childCount = x80Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            r0.i0.b(x80Var.getChildAt(i7), l1Var);
        }
        return l1Var;
    }

    @Override // jg.y1
    public /* synthetic */ void P1(ArrayList arrayList) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.wg0
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

    @Override // org.telegram.ui.Components.pj0
    public /* synthetic */ boolean b1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 15:
                break;
            case 23:
                final ng0 ng0Var = (ng0) obj;
                if (i7 >= ng0Var.J && i7 < ng0Var.K) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) ng0Var.y.get(i7 - ng0Var.J);
                    final long B0 = org.telegram.messenger.fj.B0(fjVar.k);
                    final boolean E = org.telegram.messenger.n5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ng0Var.getParentActivity(), ng0Var.getResourceProvider());
                    if (fjVar.x4()) {
                        arrayList.add(org.telegram.messenger.gd.M0(E ? 2131747593 : 2131747618, null));
                        arrayList3.add(Integer.valueOf(E ? R.drawable.msg_openprofile : R.drawable.msg_channel));
                    } else {
                        org.telegram.ui.Cells.c0.v(null, 2131743313, arrayList, R.drawable.msg_msgbubble3, arrayList3);
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
                            org.telegram.messenger.fj fjVar2 = fjVar;
                            boolean x42 = fjVar2.x4();
                            org.telegram.ui.ActionBar.h2 h2Var = ng0.this;
                            boolean z10 = E;
                            long j3 = B0;
                            if (x42) {
                                h2Var.presentFragment(z10 ? ProfileActivity.D4(j3) : bn.ua(j3));
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j3);
                            } else {
                                bundle.putLong("chat_id", -j3);
                            }
                            bundle.putInt("message_id", fjVar2.e1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (h2Var.getMessagesController().E(bundle, h2Var, null, null)) {
                                h2Var.presentFragment(new bn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.Q = charSequenceArr;
                    u1Var.R = iArr;
                    u1Var.N = onClickListener;
                    ng0Var.showDialog(u1Var);
                    break;
                }
                break;
            default:
                xh0 xh0Var = (xh0) obj;
                xh0Var.getClass();
                if (view instanceof wh0) {
                    wh0 wh0Var = (wh0) view;
                    xh0Var.e0(wh0Var.e);
                    wh0Var.performHapticFeedback(0);
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

    @Override // org.telegram.messenger.xo
    public boolean e(TLRPC.TL_error tL_error) {
        ((d3.e0) this.b).run();
        return true;
    }

    @Override // org.telegram.ui.Components.pj0
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.ui.Components.l41 G;
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
                y90 y90Var = (y90) obj2;
                ArrayList arrayList = y90Var.s;
                if (view != null && i7 >= 0 && i7 < arrayList.size()) {
                    t90 t90Var = (t90) arrayList.get(i7);
                    int i11 = t90Var.a;
                    int i12 = t90Var.e;
                    if (i11 == 3 || i11 == 4) {
                        if (!org.telegram.messenger.pc.f()) {
                            if (t90Var.a == 3 && Integer.bitCount(i12) > 1 && (!org.telegram.messenger.gd.a0 ? f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 <= org.telegram.messenger.g0.L(75.0f)) && (Z = y90Var.Z(i12)) != -1) {
                                y90Var.n[Z] = !r7[Z];
                                y90Var.d0();
                                y90Var.c0();
                                break;
                            } else {
                                boolean z10 = (org.telegram.messenger.pc.d(true) & i12) > 0;
                                int d = org.telegram.messenger.pc.d(true);
                                org.telegram.messenger.pc.i = !z10 ? d | i12 : d & (~i12);
                                org.telegram.messenger.pc.k();
                                y90Var.d0();
                            }
                        } else {
                            y90Var.e = org.telegram.ui.Components.lc.b0(y90Var).M(new org.telegram.ui.Components.s9(0.1f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Y5, false)), org.telegram.messenger.gd.M0(2131748677, null)).j();
                            break;
                        }
                    } else if (i11 == 5 && t90Var.f == 1) {
                        SharedPreferences g12 = org.telegram.messenger.mp.g1();
                        boolean z11 = g12.getBoolean("view_animations", true);
                        SharedPreferences.Editor edit = g12.edit();
                        boolean z12 = !z11;
                        edit.putBoolean("view_animations", z12);
                        org.telegram.messenger.bz.C1 = Boolean.valueOf(z12);
                        edit.commit();
                        ((org.telegram.ui.Cells.m8) view).setChecked(z12);
                    }
                    ri.q.f();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        yf.e eVar;
        int i11 = this.a;
        int i12 = 1;
        Object obj = this.b;
        switch (i11) {
            case 5:
                ((bi.m2) obj).run();
                break;
            case 14:
                ((h50) obj).Z(true);
                break;
            case 16:
                String str = LaunchActivity.C1;
                org.telegram.messenger.g0.g((StringBuilder) obj);
                break;
            case 19:
                ob0 ob0Var = (ob0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", ob0Var.J);
                bundle.putString("ephone", ob0Var.K);
                bundle.putString("phoneFormated", ob0Var.M);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = ob0Var.M;
                tL_auth_resetLoginEmail.phone_code_hash = ob0Var.N;
                ob0Var.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fb0(ob0Var, bundle, tL_auth_resetLoginEmail, i12), 10);
                break;
            case 20:
                wb0 wb0Var = (wb0) obj;
                de0.t0(wb0Var.E, wb0Var.s, wb0Var.w, wb0Var.x);
                break;
            case 21:
                pc0 pc0Var = (pc0) obj;
                de0 de0Var = pc0Var.H;
                de0Var.F1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i10 = ((org.telegram.ui.ActionBar.h2) de0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(deleteaccount, new l(pc0Var, 12), 10);
                break;
            case 26:
                ((bi.p4) obj).run();
                break;
            case 28:
                xh0 xh0Var = ((uh0) obj).b;
                SparseArray sparseArray = xh0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    vh0 vh0Var = (vh0) sparseArray.valueAt(i13);
                    TLRPC.Document document = vh0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.c cVar = xh0Var.getMediaDataController().A0;
                        TLRPC.Document document2 = vh0Var.e;
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
                    if (vh0Var.g != null && (eVar = (yf.e) xh0Var.getMediaDataController().a0.get(vh0Var.g)) != null) {
                        eVar.c = true;
                        eVar.a();
                        int i15 = eVar.a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i15);
                        String str2 = eVar.b;
                        G.b(str2, false);
                        org.telegram.messenger.ri.d0(i15).l1(str2, null, true);
                    }
                    if (vh0Var == xh0Var.H) {
                        xh0Var.N = null;
                        xh0Var.H = (vh0) xh0Var.b.get(0);
                        xh0Var.I = true;
                    }
                    xh0Var.a.remove(vh0Var);
                    xh0Var.c.remove(vh0Var);
                }
                xh0Var.getMediaDataController().A0.h();
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
                    xh0Var.getConnectionsManager().sendRequest(saveringtone, new fi.k5(9));
                }
                xh0.b0(xh0Var);
                xh0Var.i0();
                xh0Var.e.f();
                u1Var.dismiss();
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.bz.s = "";
                org.telegram.messenger.bz.x = false;
                org.telegram.messenger.bz.y();
                passcodeActivity.getMediaDataController().o();
                int childCount = passcodeActivity.c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.w9) {
                            org.telegram.ui.ActionBar.u6.U(((org.telegram.ui.Cells.w9) childAt).getTextView(), org.telegram.ui.ActionBar.n6.E6, null);
                        } else {
                            i17++;
                        }
                    }
                }
                org.telegram.messenger.ks.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.f1
    public void j(KeyEvent keyEvent) {
        iy iyVar = (iy) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && iyVar.y.isShowing()) {
            iyVar.y.d(true);
        }
    }

    @Override // org.telegram.ui.Components.du0
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
            i16 = ((org.telegram.ui.ActionBar.h2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.a6.q(i16).Q = dataAutoDownloadActivity.e;
        } else if (i17 == 1) {
            i11 = ((org.telegram.ui.ActionBar.h2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.a6.q(i11).R = dataAutoDownloadActivity.e;
        } else {
            i10 = ((org.telegram.ui.ActionBar.h2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.a6.q(i10).S = dataAutoDownloadActivity.e;
        }
        i12 = ((org.telegram.ui.ActionBar.h2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = org.telegram.messenger.mp.u1(i12).h7.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.e);
        edit.commit();
        i13 = ((org.telegram.ui.ActionBar.h2) dataAutoDownloadActivity).currentAccount;
        org.telegram.messenger.a6.q(i13).g();
        for (int i18 = 0; i18 < 4; i18++) {
            org.telegram.ui.Components.ck0 ck0Var = dataAutoDownloadActivity.b;
            i14 = dataAutoDownloadActivity.photosRow;
            v4.f1 K = ck0Var.K(i14 + i18);
            if (K != null) {
                l4 l4Var = dataAutoDownloadActivity.a;
                i15 = dataAutoDownloadActivity.photosRow;
                l4Var.t(K, i15 + i18);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override // org.telegram.messenger.v10
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        rx rxVar = (rx) this.b;
        View view = (View) obj2;
        if (((org.telegram.ui.Components.l41) obj).d != 1 || rxVar.b == null) {
            return;
        }
        boolean z10 = !rxVar.c;
        rxVar.c = z10;
        fi.b0 b0Var = rxVar.h;
        if (b0Var != null) {
            b0Var.a(Boolean.valueOf(z10), Boolean.valueOf(rxVar.d), Boolean.valueOf(rxVar.e));
        }
        ((org.telegram.ui.Cells.r8) view).setChecked(rxVar.c);
        rxVar.f.g3.O(true);
    }

    @Override // org.telegram.ui.Components.nc0
    public void p(org.telegram.ui.Components.pc0 pc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.y;
        org.telegram.messenger.bz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.e(intent, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.o0, pc0Var);
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
                rh0 rh0Var = (rh0) this.b;
                if (rh0Var.f == null && !rh0Var.h.e()) {
                    rh0Var.n.c.c();
                }
                rh0Var.f();
                break;
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public int run() {
        return ((FiltersSetupActivity) this.b).x;
    }

    @Override // org.telegram.ui.Components.pj0
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

    @Override // org.telegram.ui.Components.du0
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
