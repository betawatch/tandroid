// default package

import android.text.Editable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rs1 implements l12 {
    public final /* synthetic */ zu1 a;

    public rs1(zu1 zu1Var) {
        this.a = zu1Var;
    }

    @Override // l12
    public final boolean E0() {
        return false;
    }

    @Override // l12
    public final void O0(vq0 vq0Var) {
        this.a.z6(vq0Var);
    }

    @Override // l12
    public final void V() {
        this.a.a0.U();
    }

    @Override // l12
    public final void i0(TLRPC.User user) {
        String p = lbc.p(user);
        zu1 zu1Var = this.a;
        if (zu1Var.a0 == null || user == null || TextUtils.isEmpty(p)) {
            return;
        }
        zu1Var.a0.setFieldText("@" + p + " ");
        zu1Var.a0.o1();
    }

    @Override // l12
    public final boolean o() {
        return this.a.fa();
    }

    @Override // l12
    public final void z0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        f41 f41Var;
        HashMap<Object, Object> hashMap;
        int i4;
        boolean z5;
        int i5;
        int i6;
        ArrayList arrayList;
        boolean z6;
        HashMap<Object, Object> hashMap2;
        boolean z7;
        String str;
        TLRPC.Message message;
        zu1 zu1Var = this.a;
        if (zu1Var.getParentActivity() == null || (f41Var = zu1Var.Y1) == null) {
            return;
        }
        boolean z8 = f41Var.A1;
        r47 r47Var = f41Var.E3;
        zu1Var.H5 = r47Var;
        if (r47Var != null && (message = r47Var.k) != null) {
            message.invert_media = z3;
        }
        if (i != 8 && i != 7 && (i != 4 || f41Var.d2.getSelectedPhotos().isEmpty())) {
            f41 f41Var2 = zu1Var.Y1;
            if (f41Var2 != null) {
                f41Var2.I(i);
            }
            zu1Var.Ta(i);
            return;
        }
        f41 f41Var3 = zu1Var.Y1;
        if (f41Var3 != null && i != 8) {
            f41Var3.a(true);
        }
        HashMap<Object, Object> selectedPhotos = zu1Var.Y1.d2.getSelectedPhotos();
        ArrayList<Object> selectedPhotosOrder = zu1Var.Y1.d2.getSelectedPhotosOrder();
        if (selectedPhotos.isEmpty()) {
            hashMap = selectedPhotos;
            i4 = 0;
        } else {
            int ceil = (int) Math.ceil(selectedPhotos.size() / 10.0f);
            int i7 = 0;
            while (i7 < ceil) {
                int i8 = i7 * 10;
                int min = Math.min(10, selectedPhotos.size() - i8);
                ArrayList arrayList2 = new ArrayList();
                int i9 = 0;
                while (i9 < min) {
                    int i10 = i8 + i9;
                    if (i10 >= selectedPhotosOrder.size()) {
                        hashMap2 = selectedPhotos;
                        z7 = z8;
                    } else {
                        no6 no6Var = (no6) selectedPhotos.get(selectedPhotosOrder.get(i10));
                        q7a q7aVar = new q7a();
                        q7aVar.b = no6Var.h;
                        boolean d = no6Var.d();
                        q7aVar.p = d;
                        boolean z9 = no6Var.b;
                        if (z8 && d) {
                            q7aVar.p = false;
                            z9 = false;
                        }
                        if (z9 || (str = no6Var.h) == null) {
                            String str2 = no6Var.I;
                            if (str2 != null) {
                                q7aVar.c = str2;
                            }
                        } else {
                            q7aVar.c = str;
                            if (!z8 && no6Var.c()) {
                                q7aVar.y = no6Var.clone();
                            }
                        }
                        q7aVar.e = no6Var.c;
                        q7aVar.f = no6Var.g;
                        q7aVar.g = no6Var.e;
                        q7aVar.o = z9;
                        q7aVar.q = no6Var.j();
                        hashMap2 = selectedPhotos;
                        z7 = z8;
                        q7aVar.z = no6Var.m;
                        q7aVar.A = no6Var.P;
                        CharSequence charSequence = no6Var.a;
                        q7aVar.d = charSequence != null ? charSequence.toString() : null;
                        q7aVar.i = no6Var.n;
                        q7aVar.j = no6Var.r;
                        q7aVar.h = no6Var.x;
                        q7aVar.k = no6Var.s;
                        q7aVar.r = no6Var.L;
                        q7aVar.t = r7a.h(no6Var.a);
                        q7aVar.u = no6Var.M;
                        q7aVar.w = no6Var.N;
                        q7aVar.x = !z7 && no6Var.c();
                        arrayList2.add(q7aVar);
                        no6Var.e();
                    }
                    i9++;
                    z8 = z7;
                    selectedPhotos = hashMap2;
                }
                HashMap<Object, Object> hashMap3 = selectedPhotos;
                boolean z10 = z8;
                if (i7 == 0) {
                    zu1Var.F6(((q7a) arrayList2.get(0)).d, ((q7a) arrayList2.get(0)).i);
                    z5 = ((q7a) arrayList2.get(0)).t;
                } else {
                    z5 = false;
                }
                r47 r47Var2 = zu1Var.H5;
                if (r47Var2 == null || !r47Var2.o5()) {
                    i5 = ceil;
                    i6 = i7;
                    r7a.W(zu1Var.getAccountInstance(), arrayList2, zu1Var.l6, zu1Var.F5, zu1Var.m4, null, zu1Var.D5, i == 4 || z4, z, zu1Var.H5, null, z2, i2, i3, z5, null, zu1Var.X6(), j, z3, j2, zu1Var.k7(), zu1Var.y5, null, false);
                } else {
                    b77 b77Var = zu1Var.y5;
                    if (b77Var == null) {
                        b77Var = b77.b(zu1Var.H5.k.suggested_post);
                    }
                    b77 b77Var2 = b77Var;
                    k5 accountInstance = zu1Var.getAccountInstance();
                    int i11 = ceil;
                    long j3 = zu1Var.l6;
                    r47 r47Var3 = zu1Var.H5;
                    int i12 = i7;
                    r47 r47Var4 = zu1Var.m4;
                    ou1 ou1Var = zu1Var.D5;
                    if (i == 4 || z4) {
                        arrayList = arrayList2;
                        z6 = true;
                    } else {
                        arrayList = arrayList2;
                        z6 = false;
                    }
                    i5 = i11;
                    i6 = i12;
                    r7a.W(accountInstance, arrayList, j3, r47Var3, r47Var4, null, ou1Var, z6, z, null, null, z2, i2, i3, z5, null, zu1Var.X6(), j, z3, j2, zu1Var.k7(), b77Var2, null, false);
                }
                i7 = i6 + 1;
                z8 = z10;
                selectedPhotos = hashMap3;
                ceil = i5;
            }
            hashMap = selectedPhotos;
            i4 = 0;
            zu1Var.E4();
            zu1Var.a0.setFieldText("");
        }
        if (i2 != 0) {
            int i13 = zu1Var.h4;
            if (i13 == -1) {
                zu1Var.h4 = i4;
                i13 = i4;
            }
            zu1Var.h4 = hashMap.size() + i13;
            zu1Var.md(true);
        }
    }

    @Override // l12
    public final void R() {
    }

    @Override // l12
    public final void e0(Object obj) {
    }

    @Override // l12
    public final void f0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
