package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class zv extends eq0 {
    public final /* synthetic */ boolean[] a;
    public final /* synthetic */ uw b;

    public zv(uw uwVar, boolean[] zArr) {
        this.b = uwVar;
        this.a = zArr;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final CharSequence C(int i3) {
        uw uwVar = this.b;
        if (i3 < 0 || i3 >= uwVar.E2.size() || !((org.telegram.messenger.ye) uwVar.E2.get(i3)).b) {
            return uw.w2(uwVar);
        }
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void D() {
        int i3;
        uw uwVar = this.b;
        org.telegram.ui.Components.ro0 ro0Var = uwVar.H2;
        if (ro0Var != null) {
            i3 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
            ro0Var.i(i3, uwVar.E2);
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        uw uwVar = this.b;
        org.telegram.ui.Components.ro0 ro0Var = uwVar.H2;
        org.telegram.ui.Components.k9 f10 = ro0Var != null ? ro0Var.f(i3) : null;
        if (f10 == null) {
            return null;
        }
        int[] iArr = new int[2];
        f10.getLocationInWindow(iArr);
        mq0 mq0Var = new mq0();
        mq0Var.b = iArr[0];
        mq0Var.c = iArr[1];
        mq0Var.d = uwVar.H2;
        ImageReceiver imageReceiver = f10.getImageReceiver();
        mq0Var.a = imageReceiver;
        mq0Var.e = imageReceiver.p();
        mq0Var.k = f10.getScaleX();
        mq0Var.h = new int[]{org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f)};
        return mq0Var;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int H() {
        ArrayList arrayList = this.b.E2;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean I() {
        return this.b.x3();
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final long a() {
        uw uwVar = this.b;
        if (uwVar.J2.isEmpty()) {
            return 0L;
        }
        return ((Long) uwVar.J2.get(0)).longValue();
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean b() {
        uw uwVar = this.b;
        if (uwVar.J2.isEmpty()) {
            return false;
        }
        ArrayList arrayList = uwVar.J2;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            long longValue = ((Long) obj).longValue();
            if (org.telegram.messenger.m5.C(longValue) || uwVar.getMessagesController().N1(longValue) > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final CharSequence c0(int i3) {
        uw uwVar = this.b;
        ArrayList arrayList = uwVar.E2;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        int size = uwVar.E2.size();
        if (size == 1) {
            return org.telegram.messenger.bd.M0(((org.telegram.messenger.ye) uwVar.E2.get(0)).b ? 2131753933 : 2131753948, null);
        }
        ArrayList arrayList2 = uwVar.E2;
        int size2 = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i12 < size2) {
            Object obj = arrayList2.get(i12);
            i12++;
            if (((org.telegram.messenger.ye) obj).b) {
                i10++;
            } else {
                i11++;
            }
        }
        return i10 == 0 ? org.telegram.messenger.bd.G(size, "ShareSendPhotos", new Object[0]) : i11 == 0 ? org.telegram.messenger.bd.G(size, "ShareSendVideos", new Object[0]) : org.telegram.messenger.bd.G(size, "ShareSendItems", new Object[0]);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void e(CharSequence charSequence) {
        uw uwVar = this.b;
        gv gvVar = uwVar.C1;
        if (gvVar != null) {
            gvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = uwVar.E2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((org.telegram.messenger.ye) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean h() {
        TLRPC.User a22;
        uw uwVar = this.b;
        if (uwVar.J2.isEmpty()) {
            return false;
        }
        org.telegram.messenger.hp messagesController = uwVar.getMessagesController();
        ArrayList arrayList = uwVar.J2;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            Long l10 = (Long) obj;
            if (!org.telegram.messenger.m5.E(l10.longValue()) || (a22 = messagesController.a2(l10)) == null || a22.bot || org.telegram.messenger.l10.B(a22)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.messenger.cc j(int i3) {
        org.telegram.ui.Components.ro0 ro0Var = this.b.H2;
        org.telegram.ui.Components.k9 f10 = ro0Var != null ? ro0Var.f(i3) : null;
        if (f10 != null) {
            return f10.getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        int i12;
        ArrayList arrayList;
        uw uwVar = this.b;
        ArrayList arrayList2 = uwVar.J2;
        if (uwVar.C1 != null && (arrayList = uwVar.E2) != null && !arrayList.isEmpty()) {
            org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) uwVar.E2.get(0);
            gv gvVar = uwVar.C1;
            CharSequence charSequence = yeVar.a;
            if (charSequence == null) {
                charSequence = "";
            }
            gvVar.setFieldText(charSequence);
        }
        org.telegram.ui.Components.ro0 ro0Var = uwVar.H2;
        if (ro0Var != null) {
            i12 = ((org.telegram.ui.ActionBar.d2) uwVar).currentAccount;
            ro0Var.i(i12, uwVar.E2);
        }
        if ((z10 && i10 == 0 && !z11) || uwVar.D2 == null || arrayList2.isEmpty()) {
            PhotoViewer.v1().H0(true, false);
            return;
        }
        uwVar.K2 = z10;
        uwVar.L2 = i10;
        uwVar.N2 = z11;
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList2.size(); i13++) {
            arrayList3.add(org.telegram.messenger.pr.a(((Long) arrayList2.get(i13)).longValue(), 0L));
        }
        PhotoViewer.v1().H0(true, false);
        uwVar.D2.y(uwVar, arrayList3, uwVar.C1.getFieldText(), false, z10, i10, i11, null);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void s() {
        gv gvVar;
        org.telegram.ui.Components.sc h12;
        PhotoViewer v12 = PhotoViewer.v1();
        CharSequence charSequence = null;
        if (v12.U1() && (h12 = v12.h1()) != null) {
            charSequence = h12.getText();
        }
        uw uwVar = this.b;
        if (charSequence != null && (gvVar = uwVar.C1) != null) {
            gvVar.setFieldText(charSequence);
        }
        ArrayList arrayList = uwVar.E2;
        if (arrayList != null) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ((org.telegram.messenger.ye) obj).a = charSequence;
            }
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean x(int i3) {
        return this.a[i3];
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int k(int i3, org.telegram.messenger.b20 b20Var) {
        return i3;
    }
}
