package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class sk implements org.telegram.ui.Components.ii {
    public final /* synthetic */ an a;

    public sk(an anVar) {
        this.a = anVar;
    }

    @Override // org.telegram.ui.Components.ii
    public final void K0() {
        this.a.a0.S();
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.ii
    public final void d0(org.telegram.ui.Components.vg vgVar) {
        this.a.y8(vgVar);
    }

    @Override // org.telegram.ui.Components.ii
    public final boolean g0() {
        return this.a.sa();
    }

    @Override // org.telegram.ui.Components.ii
    public final void h1(TLRPC.User user) {
        String n10 = org.telegram.messenger.q10.n(user);
        an anVar = this.a;
        if (anVar.a0 == null || user == null || TextUtils.isEmpty(n10)) {
            return;
        }
        anVar.a0.setFieldText("@" + n10 + " ");
        anVar.a0.W0();
    }

    @Override // org.telegram.ui.Components.ii
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.p2 p2Var;
        HashMap<Object, Object> hashMap;
        boolean z14;
        int i12;
        int i13;
        char c10;
        char c11;
        ArrayList arrayList;
        boolean z15;
        HashMap<Object, Object> hashMap2;
        boolean z16;
        String str;
        TLRPC.Message message;
        an anVar = this.a;
        if (anVar.getParentActivity() == null || (p2Var = anVar.Y1) == null) {
            return;
        }
        boolean z17 = p2Var.B1;
        org.telegram.messenger.gj gjVar = p2Var.F3;
        anVar.G5 = gjVar;
        if (gjVar != null && (message = gjVar.k) != null) {
            message.invert_media = z12;
        }
        if (i7 != 8 && i7 != 7 && (i7 != 4 || p2Var.e2.getSelectedPhotos().isEmpty())) {
            fi.p2 p2Var2 = anVar.Y1;
            if (p2Var2 != null) {
                p2Var2.M(i7);
            }
            anVar.cb(i7);
            return;
        }
        fi.p2 p2Var3 = anVar.Y1;
        if (p2Var3 != null && i7 != 8) {
            p2Var3.a(true);
        }
        HashMap<Object, Object> selectedPhotos = anVar.Y1.e2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = anVar.Y1.e2.getSelectedPhotosOrder();
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
                        z16 = z17;
                    } else {
                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) selectedPhotos.get(selectedPhotosOrder.get(i17));
                        org.telegram.messenger.dz dzVar = new org.telegram.messenger.dz();
                        dzVar.b = ffVar.h;
                        boolean d = ffVar.d();
                        dzVar.p = d;
                        boolean z18 = ffVar.b;
                        if (z17 && d) {
                            dzVar.p = false;
                            z18 = false;
                        }
                        if (z18 || (str = ffVar.h) == null) {
                            String str2 = ffVar.I;
                            if (str2 != null) {
                                dzVar.c = str2;
                            }
                        } else {
                            dzVar.c = str;
                            if (!z17 && ffVar.c()) {
                                dzVar.y = ffVar.clone();
                            }
                        }
                        dzVar.e = ffVar.c;
                        dzVar.f = ffVar.g;
                        dzVar.g = ffVar.e;
                        dzVar.o = z18;
                        dzVar.q = ffVar.j();
                        hashMap2 = selectedPhotos;
                        z16 = z17;
                        dzVar.z = ffVar.m;
                        dzVar.A = ffVar.P;
                        CharSequence charSequence = ffVar.a;
                        dzVar.d = charSequence != null ? charSequence.toString() : null;
                        dzVar.i = ffVar.n;
                        dzVar.j = ffVar.r;
                        dzVar.h = ffVar.x;
                        dzVar.k = ffVar.s;
                        dzVar.r = ffVar.L;
                        dzVar.t = org.telegram.messenger.ez.h(ffVar.a);
                        dzVar.u = ffVar.M;
                        dzVar.w = ffVar.N;
                        dzVar.x = !z16 && ffVar.c();
                        arrayList2.add(dzVar);
                        ffVar.e();
                    }
                    i16++;
                    z17 = z16;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z19 = z17;
                if (i14 == 0) {
                    anVar.D8(((org.telegram.messenger.dz) arrayList2.get(0)).d, ((org.telegram.messenger.dz) arrayList2.get(0)).i);
                    z14 = ((org.telegram.messenger.dz) arrayList2.get(0)).t;
                } else {
                    z14 = false;
                }
                org.telegram.messenger.gj gjVar2 = anVar.G5;
                if (gjVar2 == null || !gjVar2.p5()) {
                    i12 = ceil;
                    i13 = i14;
                    c10 = 4;
                    org.telegram.messenger.ez.X(anVar.getAccountInstance(), arrayList2, anVar.k6, anVar.E5, anVar.m4, null, anVar.C5, i7 == 4 || z13, z10, anVar.G5, null, z11, i10, i11, z14, null, anVar.Y8(), j3, z12, j10, anVar.j9(), anVar.x5, null, false);
                } else {
                    org.telegram.messenger.lj ljVar = anVar.x5;
                    if (ljVar == null) {
                        ljVar = org.telegram.messenger.lj.b(anVar.G5.k.suggested_post);
                    }
                    org.telegram.messenger.lj ljVar2 = ljVar;
                    org.telegram.messenger.c accountInstance = anVar.getAccountInstance();
                    int i18 = ceil;
                    long j11 = anVar.k6;
                    org.telegram.messenger.gj gjVar3 = anVar.G5;
                    int i19 = i14;
                    org.telegram.messenger.gj gjVar4 = anVar.m4;
                    qm qmVar = anVar.C5;
                    if (i7 == 4 || z13) {
                        c11 = 4;
                        arrayList = arrayList2;
                        z15 = true;
                    } else {
                        c11 = 4;
                        arrayList = arrayList2;
                        z15 = false;
                    }
                    i13 = i19;
                    i12 = i18;
                    c10 = c11;
                    org.telegram.messenger.ez.X(accountInstance, arrayList, j11, gjVar3, gjVar4, null, qmVar, z15, z10, null, null, z11, i10, i11, z14, null, anVar.Y8(), j3, z12, j10, anVar.j9(), ljVar2, null, false);
                }
                i14 = i13 + 1;
                ceil = i12;
                selectedPhotos = hashMap3;
                z17 = z19;
            }
            hashMap = selectedPhotos;
            anVar.L6();
            anVar.a0.setFieldText("");
        }
        if (i10 != 0) {
            if (anVar.h4 == -1) {
                anVar.h4 = 0;
            }
            anVar.h4 += hashMap.size();
            anVar.md(true);
        }
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.ii
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
