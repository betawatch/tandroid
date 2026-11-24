// default package

import android.net.Uri;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class s02 implements m52, ee, l99, h59, py4, mm0, oy4, m7, u72, gk, p22 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i22 b;

    public /* synthetic */ s02(i22 i22Var, byte b) {
        this.a = b;
        this.b = i22Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ec, code lost:
    
        if (r23 != 0) goto L56;
     */
    /* JADX WARN: Type inference failed for: r1v20, types: [f4a] */
    @Override // u72
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(TLRPC.MessageMedia messageMedia, Editable editable, wf8 wf8Var, ArrayList arrayList, final boolean z, final int i, final long j) {
        String str;
        ArrayList arrayList2;
        final long j2;
        v67 v67Var;
        final k47 k47Var;
        yv1 yv1Var;
        final k47 k47Var2;
        final l3a l3aVar;
        long j3;
        long j4;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b = this.a;
        i22 i22Var = this.b;
        switch (b) {
            case 13:
                yv1 yv1Var2 = (yv1) i22Var.Z1;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (yv1Var2.s5()) {
                    y5a c = y5a.c(null, null, null, null, null, null, null, null, null, null, yv1Var2.l6, null, yv1Var2.F5, yv1Var2.m4, null, true, null, null, null, null, z, i, 0, 0, null, null, false, false);
                    c.l = tL_messageMediaToDo;
                    c.K = yv1Var2.X6();
                    c.Q = j;
                    c.R = yv1Var2.k7();
                    c.T = yv1Var2.y5;
                    yv1Var2.getSendMessagesHelper().q0(c);
                    yv1Var2.E4();
                    break;
                }
                break;
            default:
                yv1 yv1Var3 = (yv1) i22Var.Z1;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (yv1Var3.s5()) {
                    long nextLong = Utilities.b.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        ArrayList Y = yv1Var3.getMediaDataController().Y(charSequenceArr, true, true);
                        str = charSequenceArr[0].toString();
                        arrayList2 = Y;
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    final yg8 yg8Var = new yg8(wf8Var, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList);
                    final j5 accountInstance = yv1Var3.getAccountInstance();
                    long j5 = yv1Var3.l6;
                    k47 k47Var3 = yv1Var3.F5;
                    k47 k47Var4 = yv1Var3.m4;
                    final nv1 nv1Var = yv1Var3.D5;
                    l3a X6 = yv1Var3.X6();
                    final long k7 = yv1Var3.k7();
                    final v67 v67Var2 = yv1Var3.y5;
                    mp3 mp3Var = a6a.J;
                    if (wf8Var != null) {
                        final ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        j2 = j5;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        k47Var = k47Var3;
                        final int[] iArr = new int[1];
                        SparseArray sparseArray = wf8Var.a;
                        int size = sparseArray.size();
                        int i6 = 0;
                        while (i6 < size) {
                            int i7 = size;
                            nf8 nf8Var = (nf8) sparseArray.valueAt(i6);
                            yv1 yv1Var4 = yv1Var3;
                            int keyAt = sparseArray.keyAt(i6);
                            SparseArray sparseArray2 = sparseArray;
                            if (nf8Var instanceof vf8) {
                                arrayList9.add(((vf8) nf8Var).b);
                                arrayList10.add(Integer.valueOf(keyAt));
                            } else if (nf8Var instanceof rf8) {
                                z5a z5aVar = ((rf8) nf8Var).c;
                                z5aVar.B = keyAt;
                                arrayList3.add(z5aVar);
                            } else if (nf8Var instanceof qf8) {
                                qf8 qf8Var = (qf8) nf8Var;
                                String str2 = qf8Var.b;
                                if (TextUtils.isEmpty(str2)) {
                                    Uri uri = qf8Var.c;
                                    if (uri != null) {
                                        arrayList7.add(uri);
                                        arrayList8.add(Integer.valueOf(keyAt));
                                    }
                                } else {
                                    arrayList4.add(str2);
                                    arrayList5.add(str2);
                                    arrayList6.add(Integer.valueOf(keyAt));
                                }
                            }
                            i6++;
                            size = i7;
                            yv1Var3 = yv1Var4;
                            sparseArray = sparseArray2;
                        }
                        yv1 yv1Var5 = yv1Var3;
                        if (arrayList3.isEmpty()) {
                            i2 = 0;
                        } else {
                            iArr[0] = iArr[0] + 1;
                            i2 = 1;
                        }
                        if (arrayList4.isEmpty() && arrayList7.isEmpty()) {
                            i4 = i2;
                            i3 = 1;
                        } else {
                            i3 = 1;
                            iArr[0] = iArr[0] + 1;
                            i4 = 1;
                        }
                        if (arrayList9.isEmpty()) {
                            i5 = i4;
                        } else {
                            iArr[0] = iArr[0] + i3;
                            i5 = i3;
                        }
                        yv1Var = yv1Var5;
                        accountInstance = accountInstance;
                        final e4a e4aVar = new e4a(arrayList4, arrayList7, accountInstance, arrayList5, j2, k47Var, k47Var4, nv1Var, z, i, X6, j, k7, v67Var2, yg8Var, arrayList6, arrayList8);
                        k47Var2 = k47Var4;
                        l3aVar = X6;
                        ?? r1 = new Runnable() { // from class: f4a
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList11 = arrayList3;
                                boolean isEmpty = arrayList11.isEmpty();
                                e4a e4aVar2 = e4aVar;
                                if (isEmpty) {
                                    e4aVar2.run();
                                    return;
                                }
                                int[] iArr2 = iArr;
                                int i8 = iArr2[0] - 1;
                                iArr2[0] = i8;
                                a6a.W(accountInstance, arrayList11, j2, k47Var, k47Var2, null, nv1Var, false, true, null, null, z, i, 0, false, null, l3aVar, 0L, false, j, k7, v67Var2, yg8Var, i8 > 0);
                                a6a.J.c(new c0a(e4aVar2, (byte) 5));
                            }
                        };
                        yg8Var = yg8Var;
                        if (!arrayList9.isEmpty()) {
                            int i8 = iArr[0] - 1;
                            iArr[0] = i8;
                            j3 = k7;
                            v67Var = v67Var2;
                            r3a r3aVar = new r3a(yg8Var, arrayList9, j2, accountInstance, "", i8 > 0, arrayList10, null, k47Var, k47Var2, z, i, 0, null, l3aVar, 0L, false, j, r1);
                            yg8Var = yg8Var;
                            accountInstance = accountInstance;
                            k47Var2 = k47Var2;
                            l3aVar = l3aVar;
                            j4 = j;
                            new Thread(r3aVar).start();
                            break;
                        } else {
                            j4 = j;
                            j3 = k7;
                            v67Var = v67Var2;
                            r1.run();
                            break;
                        }
                    } else {
                        j2 = j5;
                        v67Var = v67Var2;
                        k47Var = k47Var3;
                        yv1Var = yv1Var3;
                        k47Var2 = k47Var4;
                        l3aVar = X6;
                        j3 = k7;
                        j4 = j;
                    }
                    y5a c2 = y5a.c(null, null, null, null, null, null, null, null, yg8Var.a, null, j2, null, k47Var, k47Var2, null, true, null, null, null, null, z, i, 0, 0, null, null, false, false);
                    c2.b = yg8Var.d;
                    c2.L = true;
                    c2.w = yg8Var.e;
                    c2.K = l3aVar;
                    c2.Q = j4;
                    c2.R = j3;
                    c2.T = v67Var;
                    c2.j = yg8Var;
                    a6a.B(accountInstance.a).q0(c2);
                    yv1Var.E4();
                    break;
                }
                break;
        }
    }

    @Override // m52
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        byte b = this.a;
        i22 i22Var = this.b;
        switch (b) {
            case 0:
                ((yv1) i22Var.Z1).b(messageMedia, i, z, i2, 0L);
                break;
            case 12:
                ((yv1) i22Var.Z1).b(messageMedia, i, z, i2, j);
                break;
            default:
                ((yv1) i22Var.Z1).b(messageMedia, i, z, i2, j);
                break;
        }
    }

    @Override // l99
    public final void e(m99 m99Var) {
        this.b.d1();
    }

    @Override // p22
    public final void f(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        i22 i22Var = this.b;
        p22 p22Var = i22Var.S1;
        if (p22Var != null) {
            p22Var.f(arrayList, editable, z, i, i2, j, z2, j2);
            return;
        }
        d dVar = i22Var.Z1;
        if (dVar == null || !(dVar instanceof yv1)) {
            g22 g22Var = i22Var.W3;
            if (g22Var != null) {
                g22Var.n0(arrayList, editable, z, i, i2, j, z2, j2);
                return;
            }
            return;
        }
        yv1 yv1Var = (yv1) dVar;
        if (yv1Var.s5()) {
            yv1Var.F6(editable, null);
            j5 accountInstance = yv1Var.getAccountInstance();
            Editable editable2 = editable != null ? editable : null;
            long j3 = yv1Var.l6;
            k47 k47Var = yv1Var.F5;
            k47 k47Var2 = yv1Var.m4;
            k47 k47Var3 = yv1Var.H5;
            l3a X6 = yv1Var.X6();
            mp3 mp3Var = a6a.J;
            new Thread(new r3a(null, arrayList, j3, accountInstance, editable2, false, null, k47Var3, k47Var, k47Var2, z, i, i2, null, X6, j, z2, j2, null)).start();
            yv1Var.E4();
        }
    }

    @Override // h59
    public final boolean g(int i, View view) {
        TLRPC.User user;
        if (!(view instanceof b22)) {
            return false;
        }
        b22 b22Var = (b22) view;
        i22 i22Var = this.b;
        if (i22Var.P1 || (user = b22Var.b) == null) {
            return false;
        }
        i22Var.f1(b22Var.c, user);
        return true;
    }

    @Override // m7
    public final void h(int i) {
        this.b.U2.getActionBarMenuOnItemClick().b(i);
    }

    @Override // py4
    public final int i() {
        return cmb.v0(cmb.c6, this.b.J0);
    }

    @Override // mm0
    public final int o(ylb ylbVar, boolean z) {
        byte b = this.a;
        i22 i22Var = this.b;
        switch (b) {
            case 5:
                float f = e86.e(262144) ? 0.85f : 0.76f;
                int v0 = cmb.v0(z ? cmb.Z6 : cmb.h5, ylbVar);
                int v02 = cmb.v0(cmb.c6, ylbVar);
                return i22Var.j4 ? on2.f(0.75f, v02, i22Var.k4) : qqd.m(f, v0, v02);
            case 6:
                if (i22Var.j4) {
                    return 0;
                }
                return z ? 687865855 : -1;
            case 7:
                if (i22Var.j4) {
                    return 0;
                }
                return z ? 352321535 : -1;
            default:
                if (i22Var.j4) {
                    if (gm.B(i22Var.k4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        i22 i22Var = this.b;
        i22Var.A4 = true;
        i22Var.dismiss();
    }

    @Override // oy4
    public final void s(int i) {
        i22 i22Var = this.b;
        mr3 mr3Var = i22Var.C4;
        if (Build.VERSION.SDK_INT < 31 || mr3Var == null) {
            return;
        }
        if (iqd.a(i, 4)) {
            bz4 e = i22Var.X0.e();
            e.b(i22Var.b.getY(), i22Var.b.getWidth(), i22Var.b.getY() + i22Var.b.getHeight());
            mr3Var.h(e);
        }
        mr3Var.e(i22Var.F4, i22Var.b.getWidth(), i22Var.b.getHeight());
    }

    @Override // gk
    public final void y(int i, int i2, boolean z) {
        boolean p1;
        switch (this.a) {
            case 14:
                i22 i22Var = this.b;
                a22 a22Var = i22Var.v2;
                if (a22Var != i22Var.d2 && a22Var != i22Var.k2) {
                    if (!a22Var.K(z, i, i2, 0L, i22Var.a1())) {
                        i22Var.A4 = true;
                        i22Var.dismiss();
                        break;
                    }
                } else {
                    i22Var.p1(z, i, 0, i22Var.K2, i22Var.a1());
                    break;
                }
                break;
            default:
                i22 i22Var2 = this.b;
                oy1 oy1Var = i22Var2.b2;
                long i3 = oy1Var != null ? oy1Var.i() : 0L;
                p12 p12Var = i22Var2.F2;
                i22Var2.K2 = i3;
                p12Var.setEffect(i3);
                a22 a22Var2 = i22Var2.v2;
                if (a22Var2 == i22Var2.d2 || a22Var2 == i22Var2.k2) {
                    p1 = i22Var2.p1(z, i, i2, i3, i22Var2.a1());
                } else {
                    if (!a22Var2.K(z, i, i2, i3, i22Var2.a1())) {
                        i22Var2.dismiss();
                    }
                    p1 = false;
                }
                oy1 oy1Var2 = i22Var2.b2;
                if (oy1Var2 != null) {
                    oy1Var2.f(!p1);
                    i22Var2.b2 = null;
                    break;
                }
                break;
        }
    }

    @Override // l99
    public final void c() {
    }
}
