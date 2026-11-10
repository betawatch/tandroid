package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class uk implements org.telegram.ui.Components.ai {
    public final /* synthetic */ cn a;

    public uk(cn cnVar) {
        this.a = cnVar;
    }

    @Override // org.telegram.ui.Components.ai
    public final void F0() {
        this.a.Z.L();
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ boolean G1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ai
    public final void Y0(TLRPC.User user) {
        String n10 = org.telegram.messenger.t10.n(user);
        cn cnVar = this.a;
        if (cnVar.Z == null || user == null || TextUtils.isEmpty(n10)) {
            return;
        }
        cnVar.Z.setFieldText("@" + n10 + " ");
        cnVar.Z.H0();
    }

    @Override // org.telegram.ui.Components.ai
    public final void c0(org.telegram.ui.Components.pg pgVar) {
        this.a.x8(pgVar);
    }

    @Override // org.telegram.ui.Components.ai
    public final boolean f0() {
        return this.a.ra();
    }

    @Override // org.telegram.ui.Components.ai
    public final void o1(int i7, boolean z9, boolean z10, int i10, int i11, long j3, boolean z11, boolean z12, long j10) {
        di.u2 u2Var;
        HashMap<Object, Object> hashMap;
        boolean z13;
        int i12;
        int i13;
        char c10;
        char c11;
        ArrayList arrayList;
        boolean z14;
        HashMap<Object, Object> hashMap2;
        boolean z15;
        String str;
        TLRPC.Message message;
        cn cnVar = this.a;
        if (cnVar.getParentActivity() == null || (u2Var = cnVar.X1) == null) {
            return;
        }
        boolean z16 = u2Var.A1;
        org.telegram.messenger.ij ijVar = u2Var.E3;
        cnVar.F5 = ijVar;
        if (ijVar != null && (message = ijVar.k) != null) {
            message.invert_media = z11;
        }
        if (i7 != 8 && i7 != 7 && (i7 != 4 || u2Var.d2.getSelectedPhotos().isEmpty())) {
            di.u2 u2Var2 = cnVar.X1;
            if (u2Var2 != null) {
                u2Var2.L(i7);
            }
            cnVar.bb(i7);
            return;
        }
        di.u2 u2Var3 = cnVar.X1;
        if (u2Var3 != null && i7 != 8) {
            u2Var3.a(true);
        }
        HashMap<Object, Object> selectedPhotos = cnVar.X1.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = cnVar.X1.d2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            hashMap = selectedPhotos;
        } else {
            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
            int i14 = 0;
            while (i14 < ceil) {
                int i15 = i14 * 10;
                int min = Math.min(10, selectedPhotos.size() - i15);
                ArrayList arrayList2 = new ArrayList();
                int i16 = 0;
                while (i16 < min) {
                    int i17 = i15 + i16;
                    if (i17 >= selectedPhotosOrder.size()) {
                        hashMap2 = selectedPhotos;
                        z15 = z16;
                    } else {
                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) selectedPhotos.get(selectedPhotosOrder.get(i17));
                        org.telegram.messenger.fz fzVar = new org.telegram.messenger.fz();
                        fzVar.b = gfVar.h;
                        boolean d = gfVar.d();
                        fzVar.p = d;
                        boolean z17 = gfVar.b;
                        if (z16 && d) {
                            fzVar.p = false;
                            z17 = false;
                        }
                        if (z17 || (str = gfVar.h) == null) {
                            String str2 = gfVar.I;
                            if (str2 != null) {
                                fzVar.c = str2;
                            }
                        } else {
                            fzVar.c = str;
                            if (!z16 && gfVar.c()) {
                                fzVar.y = gfVar.clone();
                            }
                        }
                        fzVar.e = gfVar.c;
                        fzVar.f = gfVar.g;
                        fzVar.g = gfVar.e;
                        fzVar.o = z17;
                        fzVar.q = gfVar.j();
                        hashMap2 = selectedPhotos;
                        z15 = z16;
                        fzVar.z = gfVar.m;
                        fzVar.A = gfVar.P;
                        CharSequence charSequence = gfVar.a;
                        fzVar.d = charSequence != null ? charSequence.toString() : null;
                        fzVar.i = gfVar.n;
                        fzVar.j = gfVar.r;
                        fzVar.h = gfVar.x;
                        fzVar.k = gfVar.s;
                        fzVar.r = gfVar.L;
                        fzVar.t = org.telegram.messenger.gz.h(gfVar.a);
                        fzVar.u = gfVar.M;
                        fzVar.w = gfVar.N;
                        fzVar.x = !z15 && gfVar.c();
                        arrayList2.add(fzVar);
                        gfVar.e();
                    }
                    i16++;
                    z16 = z15;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z18 = z16;
                if (i14 == 0) {
                    cnVar.C8(((org.telegram.messenger.fz) arrayList2.get(0)).d, ((org.telegram.messenger.fz) arrayList2.get(0)).i);
                    z13 = ((org.telegram.messenger.fz) arrayList2.get(0)).t;
                } else {
                    z13 = false;
                }
                org.telegram.messenger.ij ijVar2 = cnVar.F5;
                if (ijVar2 == null || !ijVar2.p5()) {
                    i12 = ceil;
                    i13 = i14;
                    c10 = 4;
                    org.telegram.messenger.gz.X(cnVar.getAccountInstance(), arrayList2, cnVar.j6, cnVar.D5, cnVar.l4, null, cnVar.B5, i7 == 4 || z12, z9, cnVar.F5, null, z10, i10, i11, z13, null, cnVar.X8(), j3, z11, j10, cnVar.i9(), cnVar.w5, null, false);
                } else {
                    org.telegram.messenger.nj njVar = cnVar.w5;
                    if (njVar == null) {
                        njVar = org.telegram.messenger.nj.b(cnVar.F5.k.suggested_post);
                    }
                    org.telegram.messenger.nj njVar2 = njVar;
                    org.telegram.messenger.c accountInstance = cnVar.getAccountInstance();
                    int i18 = ceil;
                    long j11 = cnVar.j6;
                    org.telegram.messenger.ij ijVar3 = cnVar.F5;
                    int i19 = i14;
                    org.telegram.messenger.ij ijVar4 = cnVar.l4;
                    sm smVar = cnVar.B5;
                    if (i7 == 4 || z12) {
                        c11 = 4;
                        arrayList = arrayList2;
                        z14 = true;
                    } else {
                        c11 = 4;
                        arrayList = arrayList2;
                        z14 = false;
                    }
                    i13 = i19;
                    i12 = i18;
                    c10 = c11;
                    org.telegram.messenger.gz.X(accountInstance, arrayList, j11, ijVar3, ijVar4, null, smVar, z14, z9, null, null, z10, i10, i11, z13, null, cnVar.X8(), j3, z11, j10, cnVar.i9(), njVar2, null, false);
                }
                i14 = i13 + 1;
                ceil = i12;
                selectedPhotos = hashMap3;
                z16 = z18;
            }
            hashMap = selectedPhotos;
            cnVar.L6();
            cnVar.Z.setFieldText("");
        }
        if (i10 != 0) {
            if (cnVar.g4 == -1) {
                cnVar.g4 = 0;
            }
            cnVar.g4 += hashMap.size();
            cnVar.ld(true);
        }
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void M0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void t0() {
    }

    @Override // org.telegram.ui.Components.ai
    public final /* synthetic */ void M1(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
    }
}
