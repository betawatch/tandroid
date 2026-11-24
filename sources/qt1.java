// default package

import android.text.Editable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qt1 implements g22 {
    public final /* synthetic */ yv1 a;

    public qt1(yv1 yv1Var) {
        this.a = yv1Var;
    }

    @Override // g22
    public final boolean B() {
        return this.a.ea();
    }

    @Override // g22
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        e51 e51Var;
        HashMap<Object, Object> hashMap;
        boolean z5;
        int i4;
        int i5;
        ArrayList arrayList;
        boolean z6;
        HashMap<Object, Object> hashMap2;
        boolean z7;
        String str;
        TLRPC.Message message;
        yv1 yv1Var = this.a;
        if (yv1Var.getParentActivity() == null || (e51Var = yv1Var.Y1) == null) {
            return;
        }
        boolean z8 = e51Var.A1;
        k47 k47Var = e51Var.E3;
        yv1Var.H5 = k47Var;
        if (k47Var != null && (message = k47Var.k) != null) {
            message.invert_media = z3;
        }
        if (i != 8 && i != 7 && (i != 4 || e51Var.d2.getSelectedPhotos().isEmpty())) {
            e51 e51Var2 = yv1Var.Y1;
            if (e51Var2 != null) {
                e51Var2.I(i);
            }
            yv1Var.Sa(i);
            return;
        }
        e51 e51Var3 = yv1Var.Y1;
        if (e51Var3 != null && i != 8) {
            e51Var3.a(true);
        }
        HashMap<Object, Object> selectedPhotos = yv1Var.Y1.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = yv1Var.Y1.d2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            hashMap = selectedPhotos;
        } else {
            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
            int i6 = 0;
            while (i6 < ceil) {
                int i7 = i6 * 10;
                int min = Math.min(10, selectedPhotos.size() - i7);
                ArrayList arrayList2 = new ArrayList();
                int i8 = 0;
                while (i8 < min) {
                    int i9 = i7 + i8;
                    if (i9 >= selectedPhotosOrder.size()) {
                        hashMap2 = selectedPhotos;
                        z7 = z8;
                    } else {
                        jo6 jo6Var = (jo6) selectedPhotos.get(selectedPhotosOrder.get(i9));
                        z5a z5aVar = new z5a();
                        z5aVar.b = jo6Var.h;
                        boolean d = jo6Var.d();
                        z5aVar.p = d;
                        boolean z9 = jo6Var.b;
                        if (z8 && d) {
                            z5aVar.p = false;
                            z9 = false;
                        }
                        if (z9 || (str = jo6Var.h) == null) {
                            String str2 = jo6Var.I;
                            if (str2 != null) {
                                z5aVar.c = str2;
                            }
                        } else {
                            z5aVar.c = str;
                            if (!z8 && jo6Var.c()) {
                                z5aVar.y = jo6Var.clone();
                            }
                        }
                        z5aVar.e = jo6Var.c;
                        z5aVar.f = jo6Var.g;
                        z5aVar.g = jo6Var.e;
                        z5aVar.o = z9;
                        z5aVar.q = jo6Var.j();
                        hashMap2 = selectedPhotos;
                        z7 = z8;
                        z5aVar.z = jo6Var.m;
                        z5aVar.A = jo6Var.P;
                        CharSequence charSequence = jo6Var.a;
                        z5aVar.d = charSequence != null ? charSequence.toString() : null;
                        z5aVar.i = jo6Var.n;
                        z5aVar.j = jo6Var.r;
                        z5aVar.h = jo6Var.x;
                        z5aVar.k = jo6Var.s;
                        z5aVar.r = jo6Var.L;
                        z5aVar.t = a6a.h(jo6Var.a);
                        z5aVar.u = jo6Var.M;
                        z5aVar.w = jo6Var.N;
                        z5aVar.x = !z7 && jo6Var.c();
                        arrayList2.add(z5aVar);
                        jo6Var.e();
                    }
                    i8++;
                    z8 = z7;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z10 = z8;
                if (i6 == 0) {
                    yv1Var.F6(((z5a) arrayList2.get(0)).d, ((z5a) arrayList2.get(0)).i);
                    z5 = ((z5a) arrayList2.get(0)).t;
                } else {
                    z5 = false;
                }
                k47 k47Var2 = yv1Var.H5;
                if (k47Var2 == null || !k47Var2.o5()) {
                    i4 = ceil;
                    i5 = i6;
                    a6a.W(yv1Var.getAccountInstance(), arrayList2, yv1Var.l6, yv1Var.F5, yv1Var.m4, null, yv1Var.D5, i == 4 || z4, z, yv1Var.H5, null, z2, i2, i3, z5, null, yv1Var.X6(), j, z3, j2, yv1Var.k7(), yv1Var.y5, null, false);
                } else {
                    v67 v67Var = yv1Var.y5;
                    if (v67Var == null) {
                        v67Var = v67.b(yv1Var.H5.k.suggested_post);
                    }
                    v67 v67Var2 = v67Var;
                    j5 accountInstance = yv1Var.getAccountInstance();
                    int i10 = ceil;
                    long j3 = yv1Var.l6;
                    k47 k47Var3 = yv1Var.H5;
                    int i11 = i6;
                    k47 k47Var4 = yv1Var.m4;
                    nv1 nv1Var = yv1Var.D5;
                    if (i == 4 || z4) {
                        arrayList = arrayList2;
                        z6 = true;
                    } else {
                        arrayList = arrayList2;
                        z6 = false;
                    }
                    i5 = i11;
                    i4 = i10;
                    a6a.W(accountInstance, arrayList, j3, k47Var3, k47Var4, null, nv1Var, z6, z, null, null, z2, i2, i3, z5, null, yv1Var.X6(), j, z3, j2, yv1Var.k7(), v67Var2, null, false);
                }
                i6 = i5 + 1;
                ceil = i4;
                z8 = z10;
                selectedPhotos = hashMap3;
            }
            hashMap = selectedPhotos;
            yv1Var.E4();
            yv1Var.a0.setFieldText("");
        }
        if (i2 != 0) {
            if (yv1Var.h4 == -1) {
                yv1Var.h4 = 0;
            }
            yv1Var.h4 += hashMap.size();
            yv1Var.md(true);
        }
    }

    @Override // g22
    public final boolean K0() {
        return false;
    }

    @Override // g22
    public final void a1(vr0 vr0Var) {
        this.a.z6(vr0Var);
    }

    @Override // g22
    public final void b0() {
        this.a.a0.R();
    }

    @Override // g22
    public final void z0(TLRPC.User user) {
        String p = m9c.p(user);
        yv1 yv1Var = this.a;
        if (yv1Var.a0 == null || user == null || TextUtils.isEmpty(p)) {
            return;
        }
        yv1Var.a0.setFieldText("@" + p + " ");
        yv1Var.a0.j1();
    }

    @Override // g22
    public final void I() {
    }

    @Override // g22
    public final void f0(Object obj) {
    }

    @Override // g22
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
