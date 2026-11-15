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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements cx, org.telegram.ui.Components.hj0, org.telegram.ui.Components.vt0, org.telegram.ui.Components.we0, org.telegram.ui.ActionBar.q1, org.telegram.messenger.yo, org.telegram.messenger.x10, org.telegram.ui.Components.dc0, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.dj0, jg.y1, org.telegram.ui.Components.ij0, r0.m, te.b, sg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zr(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // te.b
    public void G(int i7, float f10, float f11, te.c cVar) {
        le0 le0Var = (le0) this.b;
        le0Var.getClass();
        le0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        le0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override // jg.y1
    public /* synthetic */ a0.h K() {
        switch (this.a) {
        }
        return null;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        v80 v80Var = (v80) this.b;
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        if (!v80Var.a.equals(I0)) {
            v80Var.a = I0;
            v80Var.requestLayout();
        }
        int childCount = v80Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            r0.i0.b(v80Var.getChildAt(i7), k1Var);
        }
        return k1Var;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h U() {
        switch (this.a) {
        }
        return null;
    }

    @Override // org.telegram.ui.sg0
    public void a(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 15:
                break;
            case 23:
                final jg0 jg0Var = (jg0) obj;
                if (i7 >= jg0Var.J && i7 < jg0Var.K) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) jg0Var.y.get(i7 - jg0Var.J);
                    final long B0 = org.telegram.messenger.gj.B0(gjVar.k);
                    final boolean E = org.telegram.messenger.m5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, jg0Var.getParentActivity(), jg0Var.getResourceProvider());
                    if (gjVar.x4()) {
                        arrayList.add(org.telegram.messenger.hd.M0(E ? 2131747786 : 2131747811, null));
                        arrayList3.add(Integer.valueOf(E ? R.drawable.msg_openprofile : R.drawable.msg_channel));
                    } else {
                        org.telegram.ui.Cells.y0.s(null, 2131743550, arrayList, R.drawable.msg_msgbubble3, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.g0.a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i11 = 0; i11 < size; i11++) {
                        iArr[i11] = ((Integer) arrayList3.get(i11)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.eg0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i12) {
                            org.telegram.messenger.gj gjVar2 = gjVar;
                            boolean x42 = gjVar2.x4();
                            org.telegram.ui.ActionBar.e2 e2Var = jg0.this;
                            boolean z10 = E;
                            long j3 = B0;
                            if (x42) {
                                e2Var.presentFragment(z10 ? ProfileActivity.C4(j3) : an.ua(j3));
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
                            if (e2Var.getMessagesController().E(bundle, e2Var, null, null)) {
                                e2Var.presentFragment(new an(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.Q = charSequenceArr;
                    t1Var.R = iArr;
                    t1Var.N = onClickListener;
                    jg0Var.showDialog(t1Var);
                    break;
                }
                break;
            default:
                uh0 uh0Var = (uh0) obj;
                uh0Var.getClass();
                if (view instanceof th0) {
                    th0 th0Var = (th0) view;
                    uh0Var.e0(th0Var.e);
                    th0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.cx
    public void c() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.b;
        int i7 = ContactsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.F);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ boolean c1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.messenger.yo
    public boolean d(TLRPC.TL_error tL_error) {
        ((d3.e0) this.b).run();
        return true;
    }

    @Override // jg.y1
    public /* synthetic */ boolean e0(int i7) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.hj0
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.ui.Components.b41 G;
        Object obj;
        long j3;
        int Z;
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 1:
                vs vsVar = (vs) obj2;
                HashSet hashSet = vsVar.X1;
                if (!vsVar.Y1 && (G = vsVar.Z1.G(i7 - 1)) != null && (obj = G.G) != null) {
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
                x90 x90Var = (x90) obj2;
                ArrayList arrayList = x90Var.s;
                if (view != null && i7 >= 0 && i7 < arrayList.size()) {
                    s90 s90Var = (s90) arrayList.get(i7);
                    int i11 = s90Var.a;
                    int i12 = s90Var.e;
                    if (i11 == 3 || i11 == 4) {
                        if (!org.telegram.messenger.qc.f()) {
                            if (s90Var.a == 3 && Integer.bitCount(i12) > 1 && (!org.telegram.messenger.hd.a0 ? f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 <= org.telegram.messenger.g0.L(75.0f)) && (Z = x90Var.Z(i12)) != -1) {
                                x90Var.n[Z] = !r7[Z];
                                x90Var.d0();
                                x90Var.c0();
                                break;
                            } else {
                                boolean z10 = (org.telegram.messenger.qc.d(true) & i12) > 0;
                                int d = org.telegram.messenger.qc.d(true);
                                org.telegram.messenger.qc.i = !z10 ? d | i12 : d & (~i12);
                                org.telegram.messenger.qc.k();
                                x90Var.d0();
                            }
                        } else {
                            x90Var.e = org.telegram.ui.Components.cc.a0(x90Var).M(new org.telegram.ui.Components.k9(0.1f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.Y5, false)), org.telegram.messenger.hd.M0(2131748869, null)).j();
                            break;
                        }
                    } else if (i11 == 5 && s90Var.f == 1) {
                        SharedPreferences e12 = org.telegram.messenger.np.e1();
                        boolean z11 = e12.getBoolean("view_animations", true);
                        SharedPreferences.Editor edit = e12.edit();
                        boolean z12 = !z11;
                        edit.putBoolean("view_animations", z12);
                        org.telegram.messenger.gz.C1 = Boolean.valueOf(z12);
                        edit.commit();
                        ((org.telegram.ui.Cells.l8) view).setChecked(z12);
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
        yf.d dVar;
        int i11 = this.a;
        int i12 = 1;
        Object obj = this.b;
        switch (i11) {
            case 5:
                ((bi.m1) obj).run();
                break;
            case 14:
                ((e50) obj).Z(true);
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
                ce0.t0(wb0Var.E, wb0Var.s, wb0Var.w, wb0Var.x);
                break;
            case 21:
                pc0 pc0Var = (pc0) obj;
                ce0 ce0Var = pc0Var.H;
                ce0Var.F1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i10 = ((org.telegram.ui.ActionBar.e2) ce0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(deleteaccount, new l(pc0Var, 12), 10);
                break;
            case 26:
                ((org.telegram.messenger.pw) obj).run();
                break;
            case 28:
                uh0 uh0Var = ((rh0) obj).b;
                SparseArray sparseArray = uh0Var.J;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    sh0 sh0Var = (sh0) sparseArray.valueAt(i13);
                    TLRPC.Document document = sh0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.c cVar = uh0Var.getMediaDataController().A0;
                        TLRPC.Document document2 = sh0Var.e;
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
                    if (sh0Var.g != null && (dVar = (yf.d) uh0Var.getMediaDataController().a0.get(sh0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i15 = dVar.a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i15);
                        String str2 = dVar.b;
                        G.b(str2, false);
                        org.telegram.messenger.si.b0(i15).i1(str2, null, true);
                    }
                    if (sh0Var == uh0Var.H) {
                        uh0Var.N = null;
                        uh0Var.H = (sh0) uh0Var.b.get(0);
                        uh0Var.I = true;
                    }
                    uh0Var.a.remove(sh0Var);
                    uh0Var.c.remove(sh0Var);
                }
                uh0Var.getMediaDataController().A0.h();
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
                    uh0Var.getConnectionsManager().sendRequest(saveringtone, new fi.m5(9));
                }
                uh0.b0(uh0Var);
                uh0Var.i0();
                uh0Var.e.f();
                t1Var.dismiss();
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.gz.s = "";
                org.telegram.messenger.gz.x = false;
                org.telegram.messenger.gz.y();
                passcodeActivity.getMediaDataController().m();
                int childCount = passcodeActivity.c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.v9) {
                            org.telegram.ui.ActionBar.q6.U(((org.telegram.ui.Cells.v9) childAt).getTextView(), org.telegram.ui.ActionBar.j6.E6, null);
                        } else {
                            i17++;
                        }
                    }
                }
                org.telegram.messenger.ns.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                break;
        }
    }

    @Override // jg.y1
    public void i(int i7) {
        switch (this.a) {
            case 13:
                u40 u40Var = (u40) this.b;
                w40 w40Var = u40Var.J;
                w40Var.v0(u40Var.I);
                if (u40Var.h == null && !u40Var.f.e() && u40Var.b() == 0) {
                    w40Var.s.e(false, true);
                }
                u40Var.f();
                break;
            default:
                oh0 oh0Var = (oh0) this.b;
                if (oh0Var.f == null && !oh0Var.h.e()) {
                    oh0Var.n.c.c();
                }
                oh0Var.f();
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        fy fyVar = (fy) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && fyVar.y.isShowing()) {
            fyVar.y.d(true);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public void l(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((l4) this.b).e;
        org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) dataAutoDownloadActivity.c.get(i7);
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
            i16 = ((org.telegram.ui.ActionBar.e2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.z5.q(i16).Q = dataAutoDownloadActivity.e;
        } else if (i17 == 1) {
            i11 = ((org.telegram.ui.ActionBar.e2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.z5.q(i11).R = dataAutoDownloadActivity.e;
        } else {
            i10 = ((org.telegram.ui.ActionBar.e2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.z5.q(i10).S = dataAutoDownloadActivity.e;
        }
        i12 = ((org.telegram.ui.ActionBar.e2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = org.telegram.messenger.np.s1(i12).f7.edit();
        edit.putInt(dataAutoDownloadActivity.L, dataAutoDownloadActivity.e);
        edit.commit();
        i13 = ((org.telegram.ui.ActionBar.e2) dataAutoDownloadActivity).currentAccount;
        org.telegram.messenger.z5.q(i13).g();
        for (int i18 = 0; i18 < 4; i18++) {
            org.telegram.ui.Components.uj0 uj0Var = dataAutoDownloadActivity.b;
            i14 = dataAutoDownloadActivity.photosRow;
            v4.e1 K = uj0Var.K(i14 + i18);
            if (K != null) {
                l4 l4Var = dataAutoDownloadActivity.a;
                i15 = dataAutoDownloadActivity.photosRow;
                l4Var.t(K, i15 + i18);
            }
        }
        dataAutoDownloadActivity.J = true;
    }

    @Override // jg.y1
    public /* synthetic */ void l0(ArrayList arrayList) {
        int i7 = this.a;
    }

    @Override // org.telegram.messenger.x10
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        ox oxVar = (ox) this.b;
        View view = (View) obj2;
        if (((org.telegram.ui.Components.b41) obj).d != 1 || oxVar.b == null) {
            return;
        }
        boolean z10 = !oxVar.c;
        oxVar.c = z10;
        fi.b0 b0Var = oxVar.h;
        if (b0Var != null) {
            b0Var.a(Boolean.valueOf(z10), Boolean.valueOf(oxVar.d), Boolean.valueOf(oxVar.e));
        }
        ((org.telegram.ui.Cells.q8) view).setChecked(oxVar.c);
        oxVar.f.g3.O(true);
    }

    @Override // org.telegram.ui.Components.dc0
    public void q(org.telegram.ui.Components.fc0 fc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.y;
        org.telegram.messenger.gz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.o0, fc0Var);
    }

    @Override // org.telegram.ui.Components.hj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.dj0
    public int run() {
        return ((FiltersSetupActivity) this.b).x;
    }

    private final /* synthetic */ void n(ArrayList arrayList) {
    }

    private final /* synthetic */ void o(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void p() {
    }

    @Override // te.b
    public /* synthetic */ void E(float f10, int i7) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void g(View view, float f10, float f11) {
    }

    private final /* synthetic */ void k(View view, float f10, float f11) {
    }
}
