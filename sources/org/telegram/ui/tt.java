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
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tt implements org.telegram.ui.Components.hk0, org.telegram.ui.Components.xu0, org.telegram.ui.Components.wf0, org.telegram.ui.ActionBar.u1, org.telegram.messenger.gp, org.telegram.messenger.o20, org.telegram.ui.Components.xc0, org.telegram.ui.ActionBar.i1, org.telegram.ui.Components.dk0, zf.l1, org.telegram.ui.Components.ik0, r0.m, qt, fe.e, yh0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tt(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // zf.l1
    public /* synthetic */ a0.h M() {
        switch (this.a) {
        }
        return null;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        n90 n90Var = (n90) this.b;
        i0.c I0 = org.telegram.messenger.i0.I0(j1Var, false);
        if (!n90Var.a.equals(I0)) {
            n90Var.a = I0;
            n90Var.requestLayout();
        }
        int childCount = n90Var.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            r0.h0.b(n90Var.getChildAt(i10), j1Var);
        }
        return j1Var;
    }

    @Override // zf.l1
    public /* synthetic */ boolean Y(int i10) {
        switch (this.a) {
        }
        return true;
    }

    @Override // org.telegram.messenger.gp
    public boolean a(TLRPC.TL_error tL_error) {
        ((a3.h0) this.b).run();
        return true;
    }

    @Override // org.telegram.ui.Components.hk0
    public void b(float f7, float f10, int i10, View view) {
        org.telegram.ui.Components.a51 G;
        Object obj;
        long j10;
        int Y;
        int i11 = this.a;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                ut utVar = (ut) obj2;
                HashSet hashSet = utVar.T1;
                if (!utVar.U1 && (G = utVar.V1.G(i10 - 1)) != null && (obj = G.G) != null) {
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
                    if (view instanceof qg.k) {
                        ((qg.k) view).c(hashSet.contains(Long.valueOf(j10)), true);
                        break;
                    }
                }
                break;
            case 1:
                DataAutoDownloadActivity.a0((DataAutoDownloadActivity) obj2, view, i10, f7);
                break;
            default:
                bb0 bb0Var = (bb0) obj2;
                ArrayList arrayList = bb0Var.s;
                if (view != null && i10 >= 0 && i10 < arrayList.size()) {
                    wa0 wa0Var = (wa0) arrayList.get(i10);
                    int i12 = wa0Var.a;
                    int i13 = wa0Var.e;
                    if (i12 == 3 || i12 == 4) {
                        if (!org.telegram.messenger.sc.f()) {
                            if (wa0Var.a == 3 && Integer.bitCount(i13) > 1 && (!org.telegram.messenger.cd.X ? f7 >= view.getMeasuredWidth() - org.telegram.messenger.i0.L(75.0f) : f7 <= org.telegram.messenger.i0.L(75.0f)) && (Y = bb0Var.Y(i13)) != -1) {
                                bb0Var.n[Y] = !r7[Y];
                                bb0Var.c0();
                                bb0Var.b0();
                                break;
                            } else {
                                boolean z10 = (org.telegram.messenger.sc.d(true) & i13) > 0;
                                int d = org.telegram.messenger.sc.d(true);
                                org.telegram.messenger.sc.i = !z10 ? d | i13 : d & (~i13);
                                org.telegram.messenger.sc.k();
                                bb0Var.c0();
                            }
                        } else {
                            bb0Var.e = org.telegram.ui.Components.cc.a0(bb0Var).M(new org.telegram.ui.Components.i9(0.1f, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Y5, false)), org.telegram.messenger.cd.L0(2131748879, null)).j();
                            break;
                        }
                    } else if (i12 == 5 && wa0Var.f == 1) {
                        SharedPreferences d12 = org.telegram.messenger.vp.d1();
                        boolean z11 = d12.getBoolean("view_animations", true);
                        SharedPreferences.Editor edit = d12.edit();
                        boolean z12 = !z11;
                        edit.putBoolean("view_animations", z12);
                        org.telegram.messenger.tz.C1 = Boolean.valueOf(z12);
                        edit.commit();
                        ((org.telegram.ui.Cells.p8) view).setChecked(z12);
                    }
                    ei.r.f();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.qt
    public void c(nt ntVar) {
        gf0 gf0Var = (gf0) this.b;
        gf0Var.K = true;
        String str = ntVar.c;
        gf0Var.a.setText(str);
        gf0Var.s(str, ntVar);
        gf0Var.F = ntVar;
        gf0Var.E = 0;
        gf0Var.K = false;
        org.telegram.messenger.vp.d1().edit().putString("phone_code_last_matched_" + ntVar.c, ntVar.d).apply();
        org.telegram.messenger.i0.h3(new xe0(gf0Var, 4), 300L);
        ef0 ef0Var = gf0Var.b;
        ef0Var.requestFocus();
        ef0Var.setSelection(ef0Var.length());
    }

    @Override // zf.l1
    public /* synthetic */ void c0(ArrayList arrayList) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.yh0
    public void d(Canvas canvas) {
        ((Layout) this.b).draw(canvas);
    }

    @Override // org.telegram.ui.Components.ik0
    public boolean f(int i10, View view) {
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 14:
                break;
            case 23:
                final sh0 sh0Var = (sh0) obj;
                if (i10 >= sh0Var.I && i10 < sh0Var.J) {
                    try {
                        view.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                    }
                    final org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sh0Var.y.get(i10 - sh0Var.I);
                    final long B0 = org.telegram.messenger.jj.B0(jjVar.k);
                    final boolean E = org.telegram.messenger.o5.E(B0);
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, sh0Var.getParentActivity(), sh0Var.getResourceProvider());
                    if (jjVar.x4()) {
                        arrayList.add(org.telegram.messenger.cd.L0(E ? 2131747802 : 2131747827, null));
                        arrayList3.add(Integer.valueOf(E ? R.drawable.msg_openprofile : R.drawable.msg_channel));
                    } else {
                        org.telegram.ui.Cells.f1.t(null, 2131743576, arrayList, R.drawable.msg_msgbubble3, arrayList3);
                    }
                    arrayList2.add(0);
                    CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[arrayList2.size()]);
                    Typeface typeface = org.telegram.messenger.i0.a;
                    int size = arrayList3.size();
                    int[] iArr = new int[size];
                    for (int i12 = 0; i12 < size; i12++) {
                        iArr[i12] = ((Integer) arrayList3.get(i12)).intValue();
                    }
                    DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: org.telegram.ui.nh0
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            org.telegram.messenger.jj jjVar2 = jjVar;
                            boolean x42 = jjVar2.x4();
                            org.telegram.ui.ActionBar.k2 k2Var = sh0.this;
                            boolean z10 = E;
                            long j10 = B0;
                            if (x42) {
                                k2Var.presentFragment(z10 ? ProfileActivity.z4(j10) : un.ha(j10));
                                return;
                            }
                            Bundle bundle = new Bundle();
                            if (z10) {
                                bundle.putLong("user_id", j10);
                            } else {
                                bundle.putLong("chat_id", -j10);
                            }
                            bundle.putInt("message_id", jjVar2.f1());
                            bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                            if (k2Var.getMessagesController().E(bundle, k2Var, null, null)) {
                                k2Var.presentFragment(new un(bundle));
                            }
                        }
                    };
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.P = charSequenceArr;
                    x1Var.Q = iArr;
                    x1Var.M = onClickListener;
                    sh0Var.showDialog(x1Var);
                    break;
                }
                break;
            default:
                yi0 yi0Var = (yi0) obj;
                yi0Var.getClass();
                if (view instanceof xi0) {
                    xi0 xi0Var = (xi0) view;
                    yi0Var.d0(xi0Var.e);
                    xi0Var.performHapticFeedback(0);
                    break;
                }
                break;
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        int i11;
        of.d dVar;
        int i12 = this.a;
        int i13 = 1;
        Object obj = this.b;
        switch (i12) {
            case 4:
                ((a3.i0) obj).run();
                break;
            case 13:
                ((e60) obj).Y(true);
                break;
            case 15:
                Pattern pattern = LaunchActivity.D1;
                org.telegram.messenger.i0.g((StringBuilder) obj);
                break;
            case 18:
                wc0 wc0Var = (wc0) obj;
                Bundle bundle = new Bundle();
                bundle.putString("phone", wc0Var.I);
                bundle.putString("ephone", wc0Var.J);
                bundle.putString("phoneFormated", wc0Var.L);
                TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
                tL_auth_resetLoginEmail.phone_number = wc0Var.L;
                tL_auth_resetLoginEmail.phone_code_hash = wc0Var.M;
                wc0Var.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new oc0(wc0Var, bundle, tL_auth_resetLoginEmail, i13), 10);
                break;
            case 19:
                ed0 ed0Var = (ed0) obj;
                hf0.r0(ed0Var.D, ed0Var.s, ed0Var.w, ed0Var.x);
                break;
            case 20:
                xd0 xd0Var = (xd0) obj;
                hf0 hf0Var = xd0Var.G;
                hf0Var.v1(0, true);
                TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
                deleteaccount.reason = "Forgot password";
                i11 = ((org.telegram.ui.ActionBar.k2) hf0Var).currentAccount;
                ConnectionsManager.getInstance(i11).sendRequest(deleteaccount, new k(xd0Var, 13), 10);
                break;
            case 26:
                ((org.telegram.messenger.dx) obj).run();
                break;
            case 28:
                yi0 yi0Var = ((vi0) obj).b;
                SparseArray sparseArray = yi0Var.I;
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                    wi0 wi0Var = (wi0) sparseArray.valueAt(i14);
                    TLRPC.Document document = wi0Var.e;
                    if (document != null) {
                        arrayList.add(document);
                        of.c cVar = yi0Var.getMediaDataController().z0;
                        TLRPC.Document document2 = wi0Var.e;
                        ArrayList arrayList2 = cVar.e;
                        if (document2 != null) {
                            if (!cVar.f) {
                                cVar.f(true);
                                cVar.f = true;
                            }
                            int i15 = 0;
                            while (true) {
                                if (i15 < arrayList2.size()) {
                                    if (((of.b) arrayList2.get(i15)).a == null || ((of.b) arrayList2.get(i15)).a.id != document2.id) {
                                        i15++;
                                    } else {
                                        arrayList2.remove(i15);
                                    }
                                }
                            }
                        }
                    }
                    if (wi0Var.g != null && (dVar = (of.d) yi0Var.getMediaDataController().Z.get(wi0Var.g)) != null) {
                        dVar.c = true;
                        dVar.a();
                        int i16 = dVar.a;
                        org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(i16);
                        String str = dVar.b;
                        G.b(str, false);
                        org.telegram.messenger.ui.b0(i16).i1(str, null, true);
                    }
                    if (wi0Var == yi0Var.G) {
                        yi0Var.M = null;
                        yi0Var.G = (wi0) yi0Var.b.get(0);
                        yi0Var.H = true;
                    }
                    yi0Var.a.remove(wi0Var);
                    yi0Var.c.remove(wi0Var);
                }
                yi0Var.getMediaDataController().z0.h();
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    TLRPC.Document document3 = (TLRPC.Document) arrayList.get(i17);
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
                    yi0Var.getConnectionsManager().sendRequest(saveringtone, new ag.c3(4));
                }
                yi0.a0(yi0Var);
                yi0Var.h0();
                yi0Var.e.f();
                x1Var.dismiss();
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                org.telegram.messenger.tz.s = "";
                org.telegram.messenger.tz.x = false;
                org.telegram.messenger.tz.y();
                passcodeActivity.getMediaDataController().m();
                int childCount = passcodeActivity.c.getChildCount();
                int i18 = 0;
                while (true) {
                    if (i18 < childCount) {
                        View childAt = passcodeActivity.c.getChildAt(i18);
                        if (childAt instanceof org.telegram.ui.Cells.x9) {
                            org.telegram.ui.ActionBar.a7.V(((org.telegram.ui.Cells.x9) childAt).getTextView(), org.telegram.ui.ActionBar.t6.E6, null);
                        } else {
                            i18++;
                        }
                    }
                }
                org.telegram.messenger.zs.e().k(50, new Object[0]);
                passcodeActivity.finishFragment();
                break;
        }
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ boolean h1(View view) {
        switch (this.a) {
        }
        return false;
    }

    @Override // zf.l1
    public void i(int i10) {
        switch (this.a) {
            case 12:
                t50 t50Var = (t50) this.b;
                v50 v50Var = t50Var.I;
                v50Var.u0(t50Var.H);
                if (t50Var.h == null && !t50Var.f.e() && t50Var.b() == 0) {
                    v50Var.s.e(false, true);
                }
                t50Var.f();
                break;
            default:
                si0 si0Var = (si0) this.b;
                if (si0Var.f == null && !si0Var.h.e()) {
                    si0Var.n.c.c();
                }
                si0Var.f();
                break;
        }
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        qy qyVar = (qy) this.b;
        View view = (View) obj2;
        if (((org.telegram.ui.Components.a51) obj).d != 1 || qyVar.b == null) {
            return;
        }
        boolean z10 = !qyVar.c;
        qyVar.c = z10;
        jo joVar = qyVar.h;
        if (joVar != null) {
            joVar.a(Boolean.valueOf(z10), Boolean.valueOf(qyVar.d), Boolean.valueOf(qyVar.e));
        }
        ((org.telegram.ui.Cells.t8) view).setChecked(qyVar.c);
        qyVar.f.f3.O(true);
    }

    @Override // org.telegram.ui.Components.xu0
    public void m(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        DataAutoDownloadActivity dataAutoDownloadActivity = (DataAutoDownloadActivity) ((fg.j) this.b).e;
        org.telegram.messenger.a6 a6Var = (org.telegram.messenger.a6) dataAutoDownloadActivity.c.get(i10);
        if (a6Var == dataAutoDownloadActivity.D) {
            dataAutoDownloadActivity.e = 0;
        } else if (a6Var == dataAutoDownloadActivity.E) {
            dataAutoDownloadActivity.e = 1;
        } else if (a6Var == dataAutoDownloadActivity.F) {
            dataAutoDownloadActivity.e = 2;
        } else {
            dataAutoDownloadActivity.e = 3;
        }
        int i18 = dataAutoDownloadActivity.f;
        if (i18 == 0) {
            i17 = ((org.telegram.ui.ActionBar.k2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.b6.q(i17).P = dataAutoDownloadActivity.e;
        } else if (i18 == 1) {
            i12 = ((org.telegram.ui.ActionBar.k2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.b6.q(i12).Q = dataAutoDownloadActivity.e;
        } else {
            i11 = ((org.telegram.ui.ActionBar.k2) dataAutoDownloadActivity).currentAccount;
            org.telegram.messenger.b6.q(i11).R = dataAutoDownloadActivity.e;
        }
        i13 = ((org.telegram.ui.ActionBar.k2) dataAutoDownloadActivity).currentAccount;
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(i13).f7.edit();
        edit.putInt(dataAutoDownloadActivity.K, dataAutoDownloadActivity.e);
        edit.commit();
        i14 = ((org.telegram.ui.ActionBar.k2) dataAutoDownloadActivity).currentAccount;
        org.telegram.messenger.b6.q(i14).g();
        for (int i19 = 0; i19 < 4; i19++) {
            org.telegram.ui.Components.tk0 tk0Var = dataAutoDownloadActivity.b;
            i15 = dataAutoDownloadActivity.photosRow;
            s4.c1 K = tk0Var.K(i15 + i19);
            if (K != null) {
                fg.j jVar = dataAutoDownloadActivity.a;
                i16 = dataAutoDownloadActivity.photosRow;
                jVar.t(K, i16 + i19);
            }
        }
        dataAutoDownloadActivity.I = true;
    }

    @Override // org.telegram.ui.Components.xc0
    public void o(org.telegram.ui.Components.zc0 zc0Var) {
        ExternalActionActivity externalActionActivity = (ExternalActionActivity) this.b;
        ArrayList arrayList = ExternalActionActivity.y;
        org.telegram.messenger.tz.C = false;
        Intent intent = externalActionActivity.h;
        if (intent != null) {
            externalActionActivity.d(intent, externalActionActivity.n, externalActionActivity.w, true, externalActionActivity.r, externalActionActivity.s);
            externalActionActivity.h = null;
        }
        externalActionActivity.c.e0();
        if (org.telegram.messenger.i0.Q1()) {
            externalActionActivity.d.e0();
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.o0, zc0Var);
    }

    @Override // org.telegram.ui.Components.hk0
    public /* synthetic */ void q0(View view, float f7, float f10) {
        int i10 = this.a;
    }

    @Override // org.telegram.ui.ActionBar.i1
    public void r(KeyEvent keyEvent) {
        gz gzVar = (gz) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && gzVar.y.isShowing()) {
            gzVar.y.d(true);
        }
    }

    @Override // org.telegram.ui.Components.dk0
    public int run() {
        return ((FiltersSetupActivity) this.b).x;
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        rf0 rf0Var = (rf0) this.b;
        rf0Var.getClass();
        rf0Var.setScaleX(org.telegram.messenger.i0.T1(1.0f, 1.019f, f7));
        rf0Var.setScaleY(org.telegram.messenger.i0.T1(1.0f, 1.019f, f7));
    }

    @Override // zf.l1
    public /* synthetic */ a0.h x() {
        switch (this.a) {
        }
        return null;
    }

    private final /* synthetic */ void l(ArrayList arrayList) {
    }

    private final /* synthetic */ void n(ArrayList arrayList) {
    }

    @Override // org.telegram.ui.Components.xu0
    public /* synthetic */ void s() {
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }

    private final /* synthetic */ void e(View view, float f7, float f10) {
    }

    private final /* synthetic */ void g(View view, float f7, float f10) {
    }

    private final /* synthetic */ void j(View view, float f7, float f10) {
    }
}
