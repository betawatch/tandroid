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
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class xz1 implements fd, wa9, t69, sy4, nl0, ry4, n7, r42, z62, hj, u12 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n12 b;

    public /* synthetic */ xz1(n12 n12Var, byte b) {
        this.a = b;
        this.b = n12Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ec, code lost:
    
        if (r23 != 0) goto L56;
     */
    /* JADX WARN: Type inference failed for: r1v20, types: [r5a] */
    @Override // z62
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(TLRPC.MessageMedia messageMedia, Editable editable, ih8 ih8Var, ArrayList arrayList, final boolean z, final int i, final long j) {
        String str;
        ArrayList arrayList2;
        final long j2;
        b77 b77Var;
        final r47 r47Var;
        zu1 zu1Var;
        final r47 r47Var2;
        final c5a c5aVar;
        long j3;
        long j4;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b = this.a;
        n12 n12Var = this.b;
        switch (b) {
            case 13:
                zu1 zu1Var2 = (zu1) n12Var.Z1;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) messageMedia;
                if (zu1Var2.r5()) {
                    p7a c = p7a.c(null, null, null, null, null, null, null, null, null, null, zu1Var2.l6, null, zu1Var2.F5, zu1Var2.m4, null, true, null, null, null, null, z, i, 0, 0, null, null, false, false);
                    c.l = tL_messageMediaToDo;
                    c.K = zu1Var2.X6();
                    c.Q = j;
                    c.R = zu1Var2.k7();
                    c.T = zu1Var2.y5;
                    zu1Var2.getSendMessagesHelper().q0(c);
                    zu1Var2.E4();
                    break;
                }
                break;
            default:
                zu1 zu1Var3 = (zu1) n12Var.Z1;
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia;
                if (zu1Var3.r5()) {
                    long nextLong = Utilities.b.nextLong();
                    if (editable != null) {
                        CharSequence[] charSequenceArr = {editable};
                        ArrayList Y = zu1Var3.getMediaDataController().Y(charSequenceArr, true, true);
                        str = charSequenceArr[0].toString();
                        arrayList2 = Y;
                    } else {
                        str = null;
                        arrayList2 = null;
                    }
                    final ki8 ki8Var = new ki8(ih8Var, tL_messageMediaPoll, nextLong, str, arrayList2, arrayList);
                    final k5 accountInstance = zu1Var3.getAccountInstance();
                    long j5 = zu1Var3.l6;
                    r47 r47Var3 = zu1Var3.F5;
                    r47 r47Var4 = zu1Var3.m4;
                    final ou1 ou1Var = zu1Var3.D5;
                    c5a X6 = zu1Var3.X6();
                    final long k7 = zu1Var3.k7();
                    final b77 b77Var2 = zu1Var3.y5;
                    to3 to3Var = r7a.J;
                    if (ih8Var != null) {
                        final ArrayList arrayList3 = new ArrayList();
                        ArrayList arrayList4 = new ArrayList();
                        j2 = j5;
                        ArrayList arrayList5 = new ArrayList();
                        ArrayList arrayList6 = new ArrayList();
                        ArrayList arrayList7 = new ArrayList();
                        ArrayList arrayList8 = new ArrayList();
                        ArrayList arrayList9 = new ArrayList();
                        ArrayList arrayList10 = new ArrayList();
                        r47Var = r47Var3;
                        final int[] iArr = new int[1];
                        SparseArray sparseArray = ih8Var.a;
                        int size = sparseArray.size();
                        int i6 = 0;
                        while (i6 < size) {
                            int i7 = size;
                            zg8 zg8Var = (zg8) sparseArray.valueAt(i6);
                            zu1 zu1Var4 = zu1Var3;
                            int keyAt = sparseArray.keyAt(i6);
                            SparseArray sparseArray2 = sparseArray;
                            if (zg8Var instanceof hh8) {
                                arrayList9.add(((hh8) zg8Var).b);
                                arrayList10.add(Integer.valueOf(keyAt));
                            } else if (zg8Var instanceof dh8) {
                                q7a q7aVar = ((dh8) zg8Var).c;
                                q7aVar.B = keyAt;
                                arrayList3.add(q7aVar);
                            } else if (zg8Var instanceof ch8) {
                                ch8 ch8Var = (ch8) zg8Var;
                                String str2 = ch8Var.b;
                                if (TextUtils.isEmpty(str2)) {
                                    Uri uri = ch8Var.c;
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
                            zu1Var3 = zu1Var4;
                            sparseArray = sparseArray2;
                        }
                        zu1 zu1Var5 = zu1Var3;
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
                        zu1Var = zu1Var5;
                        accountInstance = accountInstance;
                        final q5a q5aVar = new q5a(arrayList4, arrayList7, accountInstance, arrayList5, j2, r47Var, r47Var4, ou1Var, z, i, X6, j, k7, b77Var2, ki8Var, arrayList6, arrayList8);
                        r47Var2 = r47Var4;
                        c5aVar = X6;
                        ?? r1 = new Runnable() { // from class: r5a
                            @Override // java.lang.Runnable
                            public final void run() {
                                ArrayList arrayList11 = arrayList3;
                                boolean isEmpty = arrayList11.isEmpty();
                                q5a q5aVar2 = q5aVar;
                                if (isEmpty) {
                                    q5aVar2.run();
                                    return;
                                }
                                int[] iArr2 = iArr;
                                int i8 = iArr2[0] - 1;
                                iArr2[0] = i8;
                                r7a.W(accountInstance, arrayList11, j2, r47Var, r47Var2, null, ou1Var, false, true, null, null, z, i, 0, false, null, c5aVar, 0L, false, j, k7, b77Var2, ki8Var, i8 > 0);
                                r7a.J.c(new ux9(q5aVar2, (byte) 13));
                            }
                        };
                        ki8Var = ki8Var;
                        if (!arrayList9.isEmpty()) {
                            int i8 = iArr[0] - 1;
                            iArr[0] = i8;
                            j3 = k7;
                            b77Var = b77Var2;
                            o5a o5aVar = new o5a(ki8Var, arrayList9, j2, accountInstance, "", i8 > 0, arrayList10, null, r47Var, r47Var2, z, i, 0, null, c5aVar, 0L, false, j, r1);
                            ki8Var = ki8Var;
                            accountInstance = accountInstance;
                            r47Var2 = r47Var2;
                            c5aVar = c5aVar;
                            j4 = j;
                            new Thread(o5aVar).start();
                            break;
                        } else {
                            j4 = j;
                            j3 = k7;
                            b77Var = b77Var2;
                            r1.run();
                            break;
                        }
                    } else {
                        j2 = j5;
                        b77Var = b77Var2;
                        r47Var = r47Var3;
                        zu1Var = zu1Var3;
                        r47Var2 = r47Var4;
                        c5aVar = X6;
                        j3 = k7;
                        j4 = j;
                    }
                    p7a c2 = p7a.c(null, null, null, null, null, null, null, null, ki8Var.a, null, j2, null, r47Var, r47Var2, null, true, null, null, null, null, z, i, 0, 0, null, null, false, false);
                    c2.b = ki8Var.d;
                    c2.L = true;
                    c2.w = ki8Var.e;
                    c2.K = c5aVar;
                    c2.Q = j4;
                    c2.R = j3;
                    c2.T = b77Var;
                    c2.j = ki8Var;
                    r7a.B(accountInstance.a).q0(c2);
                    zu1Var.E4();
                    break;
                }
                break;
        }
    }

    @Override // r42
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        byte b = this.a;
        n12 n12Var = this.b;
        switch (b) {
            case 11:
                ((zu1) n12Var.Z1).b(messageMedia, i, z, i2, 0L);
                break;
            case 12:
                ((zu1) n12Var.Z1).b(messageMedia, i, z, i2, j);
                break;
            default:
                ((zu1) n12Var.Z1).b(messageMedia, i, z, i2, j);
                break;
        }
    }

    @Override // u12
    public final void d(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        n12 n12Var = this.b;
        u12 u12Var = n12Var.S1;
        if (u12Var != null) {
            u12Var.d(arrayList, editable, z, i, i2, j, z2, j2);
            return;
        }
        e eVar = n12Var.Z1;
        if (eVar == null || !(eVar instanceof zu1)) {
            l12 l12Var = n12Var.W3;
            if (l12Var != null) {
                l12Var.f0(arrayList, editable, z, i, i2, j, z2, j2);
                return;
            }
            return;
        }
        zu1 zu1Var = (zu1) eVar;
        if (zu1Var.r5()) {
            zu1Var.F6(editable, null);
            k5 accountInstance = zu1Var.getAccountInstance();
            Editable editable2 = editable != null ? editable : null;
            long j3 = zu1Var.l6;
            r47 r47Var = zu1Var.F5;
            r47 r47Var2 = zu1Var.m4;
            r47 r47Var3 = zu1Var.H5;
            c5a X6 = zu1Var.X6();
            to3 to3Var = r7a.J;
            new Thread(new o5a(null, arrayList, j3, accountInstance, editable2, false, null, r47Var3, r47Var, r47Var2, z, i, i2, null, X6, j, z2, j2, null)).start();
            zu1Var.E4();
        }
    }

    @Override // t69
    public final boolean e(int i, View view) {
        TLRPC.User user;
        if (!(view instanceof g12)) {
            return false;
        }
        g12 g12Var = (g12) view;
        n12 n12Var = this.b;
        if (n12Var.P1 || (user = g12Var.b) == null) {
            return false;
        }
        n12Var.g1(g12Var.c, user);
        return true;
    }

    @Override // wa9
    public final void f(xa9 xa9Var) {
        this.b.e1();
    }

    @Override // n7
    public final void g(int i) {
        this.b.U2.getActionBarMenuOnItemClick().b(i);
    }

    @Override // sy4
    public final int h() {
        return aob.v0(aob.d6, this.b.J0);
    }

    @Override // ry4
    public final void k(int i) {
        n12 n12Var = this.b;
        tq3 tq3Var = n12Var.C4;
        if (Build.VERSION.SDK_INT < 31 || tq3Var == null) {
            return;
        }
        if (vsd.a(i, 4)) {
            fz4 e = n12Var.X0.e();
            e.b(n12Var.b.getY(), n12Var.b.getWidth(), n12Var.b.getY() + n12Var.b.getHeight());
            tq3Var.h(e);
        }
        tq3Var.e(n12Var.F4, n12Var.b.getWidth(), n12Var.b.getHeight());
    }

    @Override // nl0
    public final int l(vnb vnbVar, boolean z) {
        byte b = this.a;
        n12 n12Var = this.b;
        switch (b) {
            case 4:
                float f = i86.e(262144) ? 0.85f : 0.76f;
                int v0 = aob.v0(z ? aob.a7 : aob.i5, vnbVar);
                int v02 = aob.v0(aob.d6, vnbVar);
                return n12Var.j4 ? vm2.f(0.75f, v02, n12Var.k4) : dtd.m(f, v0, v02);
            case 5:
                if (n12Var.j4) {
                    return 0;
                }
                return z ? 687865855 : -1;
            case 6:
                if (n12Var.j4) {
                    return 0;
                }
                return z ? 352321535 : -1;
            default:
                if (n12Var.j4) {
                    if (hl.B(n12Var.k4) <= 0.72f) {
                        return 1090519039;
                    }
                } else if (z) {
                    return 0;
                }
                return TLObject.FLAG_29;
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        n12 n12Var = this.b;
        n12Var.A4 = true;
        n12Var.dismiss();
    }

    @Override // hj
    public final void y(int i, int i2, boolean z) {
        boolean q1;
        switch (this.a) {
            case 14:
                n12 n12Var = this.b;
                f12 f12Var = n12Var.v2;
                if (f12Var != n12Var.d2 && f12Var != n12Var.k2) {
                    if (!f12Var.K(z, i, i2, 0L, n12Var.b1())) {
                        n12Var.A4 = true;
                        n12Var.dismiss();
                        break;
                    }
                } else {
                    n12Var.q1(z, i, 0, n12Var.K2, n12Var.b1());
                    break;
                }
                break;
            default:
                n12 n12Var2 = this.b;
                ox1 ox1Var = n12Var2.b2;
                long i3 = ox1Var != null ? ox1Var.i() : 0L;
                u02 u02Var = n12Var2.F2;
                n12Var2.K2 = i3;
                u02Var.setEffect(i3);
                f12 f12Var2 = n12Var2.v2;
                if (f12Var2 == n12Var2.d2 || f12Var2 == n12Var2.k2) {
                    q1 = n12Var2.q1(z, i, i2, i3, n12Var2.b1());
                } else {
                    if (!f12Var2.K(z, i, i2, i3, n12Var2.b1())) {
                        n12Var2.dismiss();
                    }
                    q1 = false;
                }
                ox1 ox1Var2 = n12Var2.b2;
                if (ox1Var2 != null) {
                    ox1Var2.f(!q1);
                    n12Var2.b2 = null;
                    break;
                }
                break;
        }
    }

    @Override // wa9
    public final void c() {
    }
}
