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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zr implements dx, org.telegram.ui.Components.cj0, org.telegram.ui.Components.vt0, org.telegram.ui.Components.te0, org.telegram.ui.ActionBar.r1, org.telegram.messenger.bp, org.telegram.messenger.a20, org.telegram.ui.Components.cc0, org.telegram.ui.ActionBar.e1, org.telegram.ui.Components.yi0, jg.y1, org.telegram.ui.Components.dj0, r0.m, te.b, vg0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zr(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        y80 y80Var = (y80) this.b;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        if (!y80Var.a.equals(I0)) {
            y80Var.a = I0;
            y80Var.requestLayout();
        }
        int childCount = y80Var.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            r0.i0.b(y80Var.getChildAt(i7), k1Var);
        }
        return k1Var;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h X0() {
        switch (this.a) {
        }
        return null;
    }

    @Override // te.b
    public void Y(int i7, float f10, float f11, te.c cVar) {
        oe0 oe0Var = (oe0) this.b;
        oe0Var.getClass();
        oe0Var.setScaleX(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
        oe0Var.setScaleY(org.telegram.messenger.g0.T1(1.0f, 1.019f, f10));
    }

    @Override // org.telegram.messenger.bp
    public boolean a(TLRPC.TL_error tL_error) {
        ((bi.h4) this.b).run();
        return true;
    }

    @Override // org.telegram.ui.dx
    public void b() {
        ContactsWidgetConfigActivity contactsWidgetConfigActivity = (ContactsWidgetConfigActivity) this.b;
        int i7 = ContactsWidgetConfigActivity.F;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", contactsWidgetConfigActivity.E);
        contactsWidgetConfigActivity.setResult(-1, intent);
        contactsWidgetConfigActivity.finish();
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        int i10 = this.a;
        Object obj = this.b;
        switch (i10) {
            case 15:
                break;
            case 23:
                final mg0 mg0Var = (mg0) obj;
                if (i7 >= mg0Var.I && i7 < mg0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) mg0Var.y.get(i7 - mg0Var.I);
                    final long B0 = org.telegram.messenger.ij.B0(ijVar.k);
                    final boolean E = org.telegram.messenger.m5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, mg0Var.getParentActivity(), mg0Var.getResourceProvider());
                    if (ijVar.x4()) {
                        arrayList.add(org.telegram.messenger.id.M0(E ? 2131747786 : 2131747811, null));
                        arrayList3.add(Integer.valueOf(E ? R.drawable.msg_openprofile : R.drawable.msg_channel));
                    } else {
                        org.telegram.ui.Cells.f1.t(null, 2131743550, arrayList, R.drawable.msg_msgbubble3, arrayList3);
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
                            org.telegram.messenger.ij ijVar2 = ijVar;
                            boolean x42 = ijVar2.x4();
                            org.telegram.ui.ActionBar.f2 f2Var = mg0.this;
                            boolean z9 = E;
                            long j3 = B0;
                            if (x42) {
                                f2Var.presentFragment(z9 ? ProfileActivity.D4(j3) : cn.ta(j3));
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z9) {
                                bundle.putLong("user_id", j3);
                            } else {
                                bundle.putLong("chat_id", -j3);
                            }
                            bundle.putInt("message_id", ijVar2.e1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (f2Var.getMessagesController().E(bundle, f2Var, null, null)) {
                                f2Var.presentFragment(new cn(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.P = charSequenceArr;
                    u1Var.Q = iArr;
                    u1Var.M = onClickListener;
                    mg0Var.showDialog(u1Var);
                    break;
                }
                break;
            default:
                vh0 vh0Var = (vh0) obj;
                vh0Var.getClass();
                if (view instanceof uh0) {
                    uh0 uh0Var = (uh0) view;
                    vh0Var.e0(uh0Var.e);
                    uh0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.vg0
    public void d(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.cj0
    public void f(float f10, float f11, int i7, View view) {
        org.telegram.ui.Components.x31 G;
        Object obj;
        long j3;
        int Z;
        int i10 = this.a;
        Object obj2 = this.b;
        switch (i10) {
            case 1:
                vs vsVar = (vs) obj2;
                HashSet hashSet = vsVar.W1;
                if (!vsVar.X1 && (G = vsVar.Y1.G(i7 - 1)) != null && (obj = G.G) != null) {
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
                        if (!org.telegram.messenger.sc.f()) {
                            if (u90Var.a == 3 && Integer.bitCount(i12) > 1 && (!org.telegram.messenger.id.a0 ? f10 >= view.getMeasuredWidth() - org.telegram.messenger.g0.L(75.0f) : f10 <= org.telegram.messenger.g0.L(75.0f)) && (Z = z90Var.Z(i12)) != -1) {
                                z90Var.n[Z] = !r7[Z];
                                z90Var.d0();
                                z90Var.c0();
                                break;
                            } else {
                                boolean z9 = (org.telegram.messenger.sc.d(true) & i12) > 0;
                                int d = org.telegram.messenger.sc.d(true);
                                org.telegram.messenger.sc.i = !z9 ? d | i12 : d & (~i12);
                                org.telegram.messenger.sc.k();
                                z90Var.d0();
                            }
                        } else {
                            z90Var.e = org.telegram.ui.Components.gc.a0(z90Var).M(new org.telegram.ui.Components.m9(0.1f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.Y5, false)), org.telegram.messenger.id.M0(2131748869, null)).j();
                            break;
                        }
                    } else if (i11 == 5 && u90Var.f == 1) {
                        SharedPreferences e12 = org.telegram.messenger.qp.e1();
                        boolean z10 = e12.getBoolean("view_animations", true);
                        SharedPreferences.Editor edit = e12.edit();
                        boolean z11 = !z10;
                        edit.putBoolean("view_animations", z11);
                        org.telegram.messenger.iz.C1 = Boolean.valueOf(z11);
                        edit.commit();
                        ((org.telegram.ui.Cells.m8) view).setChecked(z11);
                    }
                    oi.q.f();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ boolean f1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        int i10;
        yf.e eVar;
        int i11 = this.a;
        int i12 = 1;
        Object obj = this.b;
        switch (i11) {
            case 5:
                ((bi.d3) obj).run();
                break;
            case 14:
                ((i50) obj).Z(true);
                break;
            case 16:
                String str = LaunchActivity.B1;
                org.telegram.messenger.g0.g((StringBuilder) obj);
                break;
            case 19:
                rb0 rb0Var = (rb0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", rb0Var.I);
                bundle.putString("ephone", rb0Var.J);
                bundle.putString("phoneFormated", rb0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = rb0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = rb0Var.M;
                rb0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ib0(rb0Var, bundle, tL_auth_resetLoginEmail, i12), 10);
                break;
            case 20:
                ac0 ac0Var = (ac0) obj;
                fe0.t0(ac0Var.D, ac0Var.s, ac0Var.w, ac0Var.x);
                break;
            case 21:
                uc0 uc0Var = (uc0) obj;
                fe0 fe0Var = uc0Var.G;
                fe0Var.F1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i10 = ((org.telegram.ui.ActionBar.f2) fe0Var).currentAccount;
                ConnectionsManager.getInstance(i10).sendRequest(deleteaccount, new l(uc0Var, 12), 10);
                break;
            case 26:
                ((org.telegram.messenger.rw) obj).run();
                break;
            case 28:
                vh0 vh0Var = ((sh0) obj).b;
                SparseArray sparseArray = vh0Var.I;
                ArrayList arrayList = new ArrayList();
                for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                    th0 th0Var = (th0) sparseArray.valueAt(i13);
                    TLRPC.Document document = th0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        yf.d dVar = vh0Var.getMediaDataController().z0;
                        TLRPC.Document document2 = th0Var.e;
                        ArrayList arrayList2 = dVar.e;
                        if (document2 != null) {
                            if (!dVar.f) {
                                dVar.f(true);
                                dVar.f = true;
                            }
                            int i14 = 0;
                            while (true) {
                                if (i14 < arrayList2.size()) {
                                    if (((yf.c) arrayList2.get(i14)).a == null || ((yf.c) arrayList2.get(i14)).a.id != document2.id) {
                                        i14++;
                                    } else {
                                        arrayList2.remove(i14);
                                    }
                                }
                            }
                        }
                    }
                    if (th0Var.g != null && (eVar = (yf.e) vh0Var.getMediaDataController().Z.get(th0Var.g)) != null) {
                        eVar.c = true;
                        eVar.a();
                        int i15 = eVar.a;
                        org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(i15);
                        String str2 = eVar.b;
                        G.b(str2, false);
                        org.telegram.messenger.ui.b0(i15).i1(str2, null, true);
                    }
                    if (th0Var == vh0Var.G) {
                        vh0Var.M = null;
                        vh0Var.G = (th0) vh0Var.b.get(0);
                        vh0Var.H = true;
                    }
                    vh0Var.a.remove(th0Var);
                    vh0Var.c.remove(th0Var);
                }
                vh0Var.getMediaDataController().z0.h();
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
                    vh0Var.getConnectionsManager().sendRequest(saveringtone, new di.v5(9));
                }
                vh0.b0(vh0Var);
                vh0Var.i0();
                vh0Var.e.f();
                u1Var.dismiss();
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.iz.s = "";
                org.telegram.messenger.iz.x = false;
                org.telegram.messenger.iz.y();
                passcodeActivity.getMediaDataController().m();
                int childCount = passcodeActivity.c.getChildCount();
                int i17 = 0;
                while (true) {
                    if (i17 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i17);
                        if (childAt instanceof org.telegram.ui.Cells.w9) {
                            org.telegram.ui.ActionBar.t6.U(((org.telegram.ui.Cells.w9) childAt).getTextView(), org.telegram.ui.ActionBar.m6.E6, null);
                        } else {
                            i17++;
                        }
                    }
                }
                org.telegram.messenger.qs.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                break;
        }
    }

    @Override // org.telegram.messenger.a20
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        qx qxVar = (qx) this.b;
        View view = (View) obj2;
        if (((org.telegram.ui.Components.x31) obj).d != 1 || qxVar.b == null) {
            return;
        }
        boolean z9 = !qxVar.c;
        qxVar.c = z9;
        di.b0 b0Var = qxVar.h;
        if (b0Var != null) {
            b0Var.a(Boolean.valueOf(z9), Boolean.valueOf(qxVar.d), Boolean.valueOf(qxVar.e));
        }
        ((org.telegram.ui.Cells.r8) view).setChecked(qxVar.c);
        qxVar.f.f3.O(true);
    }

    @Override // org.telegram.ui.ActionBar.e1
    public void j(KeyEvent keyEvent) {
        hy hyVar = (hy) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && hyVar.y.isShowing()) {
            hyVar.y.d(true);
        }
    }

    @Override // jg.y1
    public /* synthetic */ boolean k1(int i7) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.ui.Components.vt0
    public void m(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((l4) this.b).e;
        org.telegram.messenger.y5 y5Var = (org.telegram.messenger.y5) dataAutoDownloadActivity.c.get(i7);
        if (y5Var == dataAutoDownloadActivity.D) {
            dataAutoDownloadActivity.e = 0;
        } else if (y5Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (y5Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i17 = dataAutoDownloadActivity.f;
        if (i17 == 0) {
            i16 = ((org.telegram.ui.ActionBar.f2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.z5.q(i16).P = dataAutoDownloadActivity.e;
        } else if (i17 == 1) {
            i11 = ((org.telegram.ui.ActionBar.f2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.z5.q(i11).Q = dataAutoDownloadActivity.e;
        } else {
            i10 = ((org.telegram.ui.ActionBar.f2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.z5.q(i10).R = dataAutoDownloadActivity.e;
        }
        i12 = ((org.telegram.ui.ActionBar.f2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = org.telegram.messenger.qp.s1(i12).e7.edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        i13 = ((org.telegram.ui.ActionBar.f2) dataAutoDownloadActivity).currentAccount;
        org.telegram.messenger.z5.q(i13).g();
        for (int i18 = 0; i18 < 4; i18++) {
            org.telegram.ui.Components.pj0 pj0Var = dataAutoDownloadActivity.b;
            i14 = dataAutoDownloadActivity.photosRow;
            v4.d1 K = pj0Var.K(i14 + i18);
            if (K != null) {
                l4 l4Var = dataAutoDownloadActivity.a;
                i15 = dataAutoDownloadActivity.photosRow;
                l4Var.t(K, i15 + i18);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // jg.y1
    public /* synthetic */ void m1(ArrayList arrayList) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.cc0
    public void p(org.telegram.ui.Components.ec0 ec0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.y;
        org.telegram.messenger.iz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.f0();
        if (org.telegram.messenger.g0.Q1()) {
            externalActionActivity.d.f0();
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.o0, ec0Var);
    }

    @Override // jg.y1
    public void q(int i7) {
        switch (this.a) {
            case 13:
                x40 x40Var = (x40) this.b;
                z40 z40Var = x40Var.I;
                z40Var.v0(x40Var.H);
                if (x40Var.h == null && !x40Var.f.e() && x40Var.b() == 0) {
                    z40Var.s.e(false, true);
                }
                x40Var.f();
                break;
            default:
                ph0 ph0Var = (ph0) this.b;
                if (ph0Var.f == null && !ph0Var.h.e()) {
                    ph0Var.n.c.c();
                }
                ph0Var.f();
                break;
        }
    }

    @Override // org.telegram.ui.Components.cj0
    public /* synthetic */ void r0(View view, float f10, float f11) {
        int i7 = this.a;
    }

    @Override // org.telegram.ui.Components.yi0
    public int run() {
        return ((FiltersSetupActivity) this.b).x;
    }

    @Override // jg.y1
    public /* synthetic */ a0.h v0() {
        switch (this.a) {
        }
        return null;
    }

    private final /* synthetic */ void l(ArrayList arrayList) {
    }

    private final /* synthetic */ void o(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.vt0
    public /* synthetic */ void n() {
    }

    @Override // te.b
    public /* synthetic */ void F(float f10, int i7) {
    }

    private final /* synthetic */ void e(View view, float f10, float f11) {
    }

    private final /* synthetic */ void h(View view, float f10, float f11) {
    }

    private final /* synthetic */ void k(View view, float f10, float f11) {
    }
}
