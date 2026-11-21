package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class tk implements org.telegram.ui.Components.si {
    public final /* synthetic */ bn a;

    public tk(bn bnVar) {
        this.a = bnVar;
    }

    @Override // org.telegram.ui.Components.si
    public final void K0() {
        this.a.a0.U();
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ boolean V1() {
        return false;
    }

    @Override // org.telegram.ui.Components.si
    public final void f0(org.telegram.ui.Components.gh ghVar) {
        this.a.y8(ghVar);
    }

    @Override // org.telegram.ui.Components.si
    public final boolean g0() {
        return this.a.sa();
    }

    @Override // org.telegram.ui.Components.si
    public final void h1(TLRPC.User user) {
        String o4 = org.telegram.messenger.o10.o(user);
        bn bnVar = this.a;
        if (bnVar.a0 == null || user == null || TextUtils.isEmpty(o4)) {
            return;
        }
        bnVar.a0.setFieldText("@" + o4 + " ");
        bnVar.a0.i1();
    }

    @Override // org.telegram.ui.Components.si
    public final void y1(int i7, boolean z10, boolean z11, int i10, int i11, long j3, boolean z12, boolean z13, long j10) {
        fi.n2 n2Var;
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
        bn bnVar = this.a;
        if (bnVar.getParentActivity() == null || (n2Var = bnVar.Y1) == null) {
            return;
        }
        boolean z17 = n2Var.B1;
        org.telegram.messenger.fj fjVar = n2Var.F3;
        bnVar.H5 = fjVar;
        if (fjVar != null && (message = fjVar.k) != null) {
            message.invert_media = z12;
        }
        if (i7 != 8 && i7 != 7 && (i7 != 4 || n2Var.e2.getSelectedPhotos().isEmpty())) {
            fi.n2 n2Var2 = bnVar.Y1;
            if (n2Var2 != null) {
                n2Var2.M(i7);
            }
            bnVar.cb(i7);
            return;
        }
        fi.n2 n2Var3 = bnVar.Y1;
        if (n2Var3 != null && i7 != 8) {
            n2Var3.a(true);
        }
        HashMap<Object, Object> selectedPhotos = bnVar.Y1.e2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = bnVar.Y1.e2.getSelectedPhotosOrder();
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
                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) selectedPhotos.get(selectedPhotosOrder.get(i17));
                        org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
                        yyVar.b = efVar.h;
                        boolean d = efVar.d();
                        yyVar.p = d;
                        boolean z18 = efVar.b;
                        if (z17 && d) {
                            yyVar.p = false;
                            z18 = false;
                        }
                        if (z18 || (str = efVar.h) == null) {
                            String str2 = efVar.I;
                            if (str2 != null) {
                                yyVar.c = str2;
                            }
                        } else {
                            yyVar.c = str;
                            if (!z17 && efVar.c()) {
                                yyVar.y = efVar.clone();
                            }
                        }
                        yyVar.e = efVar.c;
                        yyVar.f = efVar.g;
                        yyVar.g = efVar.e;
                        yyVar.o = z18;
                        yyVar.q = efVar.j();
                        hashMap2 = selectedPhotos;
                        z16 = z17;
                        yyVar.z = efVar.m;
                        yyVar.A = efVar.P;
                        CharSequence charSequence = efVar.a;
                        yyVar.d = charSequence != null ? charSequence.toString() : null;
                        yyVar.i = efVar.n;
                        yyVar.j = efVar.r;
                        yyVar.h = efVar.x;
                        yyVar.k = efVar.s;
                        yyVar.r = efVar.L;
                        yyVar.t = org.telegram.messenger.zy.h(efVar.a);
                        yyVar.u = efVar.M;
                        yyVar.w = efVar.N;
                        yyVar.x = !z16 && efVar.c();
                        arrayList2.add(yyVar);
                        efVar.e();
                    }
                    i16++;
                    z17 = z16;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z19 = z17;
                if (i14 == 0) {
                    bnVar.D8(((org.telegram.messenger.yy) arrayList2.get(0)).d, ((org.telegram.messenger.yy) arrayList2.get(0)).i);
                    z14 = ((org.telegram.messenger.yy) arrayList2.get(0)).t;
                } else {
                    z14 = false;
                }
                org.telegram.messenger.fj fjVar2 = bnVar.H5;
                if (fjVar2 == null || !fjVar2.p5()) {
                    i12 = ceil;
                    i13 = i14;
                    c10 = 4;
                    org.telegram.messenger.zy.X(bnVar.getAccountInstance(), arrayList2, bnVar.l6, bnVar.F5, bnVar.m4, null, bnVar.D5, i7 == 4 || z13, z10, bnVar.H5, null, z11, i10, i11, z14, null, bnVar.Y8(), j3, z12, j10, bnVar.j9(), bnVar.y5, null, false);
                } else {
                    org.telegram.messenger.kj kjVar = bnVar.y5;
                    if (kjVar == null) {
                        kjVar = org.telegram.messenger.kj.b(bnVar.H5.k.suggested_post);
                    }
                    org.telegram.messenger.kj kjVar2 = kjVar;
                    org.telegram.messenger.c accountInstance = bnVar.getAccountInstance();
                    int i18 = ceil;
                    long j11 = bnVar.l6;
                    org.telegram.messenger.fj fjVar3 = bnVar.H5;
                    int i19 = i14;
                    org.telegram.messenger.fj fjVar4 = bnVar.m4;
                    rm rmVar = bnVar.D5;
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
                    org.telegram.messenger.zy.X(accountInstance, arrayList, j11, fjVar3, fjVar4, null, rmVar, z15, z10, null, null, z11, i10, i11, z14, null, bnVar.Y8(), j3, z12, j10, bnVar.j9(), kjVar2, null, false);
                }
                i14 = i13 + 1;
                ceil = i12;
                selectedPhotos = hashMap3;
                z17 = z19;
            }
            hashMap = selectedPhotos;
            bnVar.L6();
            bnVar.a0.setFieldText("");
        }
        if (i10 != 0) {
            if (bnVar.h4 == -1) {
                bnVar.h4 = 0;
            }
            bnVar.h4 += hashMap.size();
            bnVar.md(true);
        }
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void R0(Object obj) {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void v0() {
    }

    @Override // org.telegram.ui.Components.si
    public final /* synthetic */ void b2(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
    }
}
