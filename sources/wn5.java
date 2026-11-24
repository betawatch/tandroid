// default package

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wn5 implements jm7 {
    public k47 E;
    public String F;
    public boolean G;
    public boolean I;
    public final boolean J;
    public TLRPC.User M;
    public TLRPC.InputFile N;
    public TLRPC.InputFile O;
    public TLRPC.VideoSize P;
    public double Q;
    public final boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public byte V;
    public final byte W;
    public float X;
    public d a;
    public vn5 b;
    public i22 c;
    public String f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize n;
    public Bitmap r;
    public boolean s;
    public String w;
    public String x;
    public String y;
    public final int d = z8c.t0;
    public boolean H = true;
    public boolean K = true;
    public boolean L = true;
    public final ImageReceiver e = new ImageReceiver(null);

    /* JADX WARN: Multi-variable type inference failed */
    public wn5(int i, boolean z, boolean z2) {
        this.R = z;
        this.J = z2;
        this.W = i;
    }

    public final void a() {
        this.U = true;
        String str = this.w;
        int i = this.d;
        if (str != null) {
            bc4.G(i).b(this.w, false);
        }
        if (this.x != null) {
            bc4.G(i).b(this.x, false);
        }
        vn5 vn5Var = this.b;
        if (vn5Var != null) {
            vn5Var.T();
        }
    }

    public final void b() {
        this.w = null;
        this.x = null;
        this.y = null;
        this.E = null;
        if (this.G) {
            this.e.g0(null);
            this.a = null;
            this.b = null;
        }
    }

    public final void c() {
        this.U = false;
        if (this.w == null && this.x == null && this.E == null) {
            this.a = null;
            this.b = null;
        } else {
            this.G = true;
        }
        i22 i22Var = this.c;
        if (i22Var != null) {
            i22Var.H();
            this.c.e1();
        }
    }

    public final void d() {
        wg0 wg0Var;
        d dVar = this.a;
        if (dVar == null || dVar.getParentActivity() == null) {
            return;
        }
        i22 i22Var = this.c;
        byte b = 2;
        if (i22Var == null) {
            i22 i22Var2 = new i22(this.a.getParentActivity(), this.a, this.S, this.T);
            this.c = i22Var2;
            byte b2 = this.R ? (byte) 2 : (byte) 1;
            vn5 vn5Var = this.b;
            if (vn5Var == null || !vn5Var.w()) {
                wg0Var = null;
            } else {
                vn5 vn5Var2 = this.b;
                Objects.requireNonNull(vn5Var2);
                wg0Var = new wg0(vn5Var2, b);
            }
            i22Var2.N2 = b2;
            i22Var2.O2 = wg0Var;
            i22Var2.P2 = false;
            a22 a22Var = i22Var2.v2;
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = i22Var2.d2;
            if (a22Var == null || a22Var == chatAttachAlertPhotoLayout) {
                i22Var2.u3.setVisibility(8);
            }
            byte b3 = i22Var2.N2;
            TextView textView = i22Var2.g3;
            if (b3 == 2) {
                textView.setText(jb6.M0(2131752058, null));
            } else {
                textView.setText(jb6.M0(2131752060, null));
            }
            if (chatAttachAlertPhotoLayout != null) {
                i22 i22Var3 = chatAttachAlertPhotoLayout.b;
                chatAttachAlertPhotoLayout.h1 = (i22Var3.N2 == 0 || i22Var3.z1) ? false : true;
            }
            i22Var = this.c;
            i22Var.W3 = new sn5(this);
            i22Var.O1 = this;
        }
        TextView textView2 = i22Var.g3;
        byte b4 = this.V;
        if (b4 == 1) {
            textView2.setText(jb6.a0("SetPhotoFor", null, 2131745252, this.M.first_name));
        } else if (b4 == 2) {
            textView2.setText(jb6.a0("SuggestPhotoFor", null, 2131744091, this.M.first_name));
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        vn5 vn5Var;
        d dVar;
        int i3 = nm7.W1;
        int i4 = nm7.V1;
        int i5 = this.d;
        int i6 = nm7.U1;
        if (i == i6 || i == i4) {
            String str = (String) objArr[0];
            if (str.equals(this.w)) {
                this.w = null;
                if (i == i6) {
                    this.N = (TLRPC.InputFile) objArr[1];
                }
            } else {
                if (!str.equals(this.x)) {
                    return;
                }
                this.x = null;
                if (i == i6) {
                    this.O = (TLRPC.InputFile) objArr[1];
                }
            }
            if (this.w == null && this.x == null && this.E == null) {
                nm7.f(i5).n(this, i6);
                nm7.f(i5).n(this, i3);
                nm7.f(i5).n(this, i4);
                if (i == i6 && (vn5Var = this.b) != null) {
                    vn5Var.U(this.N, this.O, this.Q, this.y, this.h, this.n, this.s, this.P);
                }
                b();
                return;
            }
            return;
        }
        if (i == i3) {
            String str2 = (String) objArr[0];
            String str3 = this.E != null ? this.x : this.w;
            if (this.b == null || !str2.equals(str3)) {
                return;
            }
            float min = Math.min(1.0f, ((Long) objArr[1]).longValue() / ((Long) objArr[2]).longValue());
            vn5 vn5Var2 = this.b;
            this.X = min;
            vn5Var2.H(min);
            return;
        }
        int i7 = nm7.S1;
        int i8 = nm7.R1;
        int i9 = nm7.Z1;
        int i10 = nm7.Y1;
        if (i == i10 || i == i9 || i == i8 || i == i7) {
            String str4 = (String) objArr[0];
            this.X = 1.0f;
            if (str4.equals(this.w)) {
                nm7.f(i5).n(this, i10);
                nm7.f(i5).n(this, i9);
                nm7.f(i5).n(this, i8);
                nm7.f(i5).n(this, i7);
                this.w = null;
                if (i == i10 || i == i8) {
                    r(false, fn5.G(this.F, null, 800.0f, 800.0f, true), null);
                    return;
                }
                this.e.g0(null);
                vn5 vn5Var3 = this.b;
                if (vn5Var3 != null) {
                    vn5Var3.T();
                    return;
                }
                return;
            }
            return;
        }
        int i11 = nm7.c2;
        int i12 = nm7.b2;
        int i13 = nm7.a2;
        if (i == i11) {
            if (((k47) objArr[0]) != this.E || this.a == null) {
                return;
            }
            nm7.f(i5).n(this, i13);
            nm7.f(i5).n(this, i11);
            nm7.f(i5).n(this, i12);
            b();
            return;
        }
        if (i != i12) {
            if (i == i13 && ((k47) objArr[0]) == this.E && (dVar = this.a) != null) {
                this.x = (String) objArr[1];
                dVar.getFileLoader().g0(this.x, false, false, (int) this.E.r0.q, 33554432, false);
                return;
            }
            return;
        }
        if (((k47) objArr[0]) != this.E || this.a == null) {
            return;
        }
        String str5 = (String) objArr[1];
        long longValue = ((Long) objArr[2]).longValue();
        long longValue2 = ((Long) objArr[3]).longValue();
        this.a.getFileLoader().n(str5, false, longValue, longValue2, null);
        if (longValue2 != 0) {
            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
            double d = this.Q;
            if (d > longValue3) {
                this.Q = longValue3;
            } else {
                longValue3 = d;
            }
            Bitmap r = a6a.r(str5, (long) (longValue3 * 1000.0d), null, true);
            if (r != null) {
                bc4.G(i5);
                File J = bc4.J(this.n, null, true, true);
                if (J != null) {
                    if (e21.a) {
                        fc4.d("delete file " + J);
                    }
                    J.delete();
                }
                bc4.G(i5);
                File J2 = bc4.J(this.h, null, true, true);
                if (J2 != null) {
                    if (e21.a) {
                        fc4.d("delete file " + J2);
                    }
                    J2.delete();
                }
                this.h = fn5.T(r, 800.0f, 800.0f, 80, nm7.q5, nm7.q5);
                TLRPC.PhotoSize T = fn5.T(r, 150.0f, 150.0f, 80, nm7.f2, nm7.f2);
                this.n = T;
                if (T != null) {
                    try {
                        bc4.G(i5);
                        fn5.z().K(new BitmapDrawable(BitmapFactory.decodeFile(bc4.J(this.n, null, true, true).getAbsolutePath())), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                    } catch (Throwable unused) {
                    }
                }
            }
            nm7.f(i5).n(this, i13);
            nm7.f(i5).n(this, i11);
            nm7.f(i5).n(this, i12);
            this.y = str5;
            this.x = str5;
            this.E = null;
        }
    }

    public final void e(ArrayList arrayList, boolean z) {
        k47 k47Var;
        boolean z2;
        Bitmap G;
        if (arrayList.isEmpty()) {
            return;
        }
        z5a z5aVar = (z5a) arrayList.get(0);
        Bitmap bitmap = null;
        if ((z5aVar.o || z5aVar.k != null) && !z5aVar.p) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            k47Var = new k47(z8c.t0, tL_message, false, false);
            k47Var.k.attachPath = new File(bc4.z(4), gda.p() + "_avatar.mp4").getAbsolutePath();
            k47Var.r0 = z5aVar.k;
            k47Var.s = z5aVar.v;
            bitmap = fn5.G(z5aVar.e, null, 800.0f, 800.0f, true);
        } else {
            String str = z5aVar.c;
            if (str == null) {
                no6 no6Var = z5aVar.l;
                if (no6Var != null) {
                    TLRPC.Photo photo = no6Var.K;
                    ImageReceiver imageReceiver = this.e;
                    int i = this.d;
                    if (photo != null) {
                        TLRPC.PhotoSize w = bc4.w(photo.sizes, gm.Y0(false), false, null, false);
                        if (w != null) {
                            bc4.G(i);
                            File J = bc4.J(w, null, true, true);
                            this.F = J.getAbsolutePath();
                            if (!J.exists()) {
                                bc4.G(i);
                                J = bc4.J(w, null, false, true);
                                if (!J.exists()) {
                                    J = null;
                                }
                            }
                            if (J != null) {
                                G = fn5.G(J.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                nm7.f(i).a(this, nm7.Y1);
                                nm7.f(i).a(this, nm7.Z1);
                                this.w = bc4.r(null, w.location);
                                imageReceiver.d0(gn5.i(w, z5aVar.l.K), null, null, "jpg", null, 1);
                            }
                        }
                        G = null;
                    } else if (no6Var.C != null) {
                        File file = new File(bc4.z(4), Utilities.a(z5aVar.l.C) + "." + fn5.x(z5aVar.l.C, "jpg"));
                        this.F = file.getAbsolutePath();
                        if (!file.exists() || file.length() == 0) {
                            this.w = z5aVar.l.C;
                            nm7.f(i).a(this, nm7.R1);
                            nm7.f(i).a(this, nm7.S1);
                            imageReceiver.e0(z5aVar.l.C, null, null, "jpg", 1L);
                        } else {
                            G = fn5.G(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                        }
                    }
                }
                z2 = z;
                k47Var = null;
                r(z2, bitmap, k47Var);
            }
            G = fn5.G(str, null, 800.0f, 800.0f, true);
            k47Var = null;
            bitmap = G;
        }
        z2 = z;
        r(z2, bitmap, k47Var);
    }

    public final boolean f(Dialog dialog) {
        i22 i22Var = this.c;
        if (i22Var == null || dialog != i22Var) {
            return false;
        }
        i22Var.d2.b0(false);
        this.c.H();
        this.c.d2.f0(true);
        return true;
    }

    public final boolean g() {
        return (this.w == null && this.x == null && this.E == null) ? false : true;
    }

    public final void h(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i == 0 || i == 2) {
                d();
                i22 i22Var = this.c;
                if (i22Var != null) {
                    i22Var.d2.j0(i, intent, this.f);
                }
                this.f = null;
                return;
            }
            byte b = 13;
            if (i == 13) {
                this.a.getParentActivity().overridePendingTransition(R.anim.alpha_in, R.anim.alpha_out);
                PhotoViewer.r0().T1(null, this.a, null);
                o(this.f, null, gm.N0(this.f), false);
                gm.e(this.f);
                this.f = null;
                return;
            }
            if (i == 14) {
                if (intent == null || intent.getData() == null) {
                    return;
                }
                gm.c3(new fd5(this, intent.getData(), b));
                return;
            }
            if (i == 15) {
                p(this.f, null, true);
                gm.e(this.f);
                this.f = null;
            }
        }
    }

    public final void i() {
        i22 i22Var = this.c;
        if (i22Var != null) {
            i22Var.g1();
        }
    }

    public final void j(int i, String[] strArr, int[] iArr) {
        i22 i22Var = this.c;
        if (i22Var != null) {
            if (i == 17) {
                i22Var.d2.U(false);
                this.c.d2.Z();
            } else if (i == 4) {
                i22Var.d2.Z();
            }
        }
    }

    public final void k() {
        i22 i22Var = this.c;
        if (i22Var != null) {
            i22Var.h1();
        }
    }

    public final void l() {
        d dVar = this.a;
        if (dVar == null || dVar.getParentActivity() == null) {
            return;
        }
        try {
            if (this.a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                this.a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                return;
            }
            Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
            File q0 = gm.q0(null, false);
            if (q0 != null) {
                if (Build.VERSION.SDK_INT >= 24) {
                    Activity parentActivity = this.a.getParentActivity();
                    a.d();
                    intent.putExtra("output", FileProvider.c(parentActivity, "org.telegram.messenger.beta.provider", q0));
                    intent.addFlags(2);
                    intent.addFlags(1);
                } else {
                    intent.putExtra("output", Uri.fromFile(q0));
                }
                this.f = q0.getAbsolutePath();
            }
            this.a.startActivityForResult(intent, 13);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void m() {
        d dVar = this.a;
        if (dVar == null) {
            return;
        }
        Activity parentActivity = dVar.getParentActivity();
        if (Build.VERSION.SDK_INT < 33 || parentActivity == null) {
            if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, nm7.g2);
                return;
            }
        } else if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, nm7.g2);
            return;
        }
        j68 j68Var = new j68(this.R ? 3 : 1, false, false, null);
        j68Var.y = this.K;
        j68Var.W = new k44(this, (byte) 10);
        this.a.presentFragment(j68Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(boolean z, Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i) {
        gy0 gy0Var;
        d dVar = this.a;
        if (dVar == null || dVar.getParentActivity() == null) {
            return;
        }
        byte b = 0;
        this.U = false;
        this.V = i;
        boolean z2 = this.H;
        d dVar2 = this.a;
        if (z2) {
            if (dVar2 == null || dVar2.getParentActivity() == null) {
                return;
            }
            d();
            i22 i22Var = this.c;
            i22Var.R3 = this.I;
            i22Var.t1(1, false);
            this.c.d2.h0();
            this.c.Z0();
            i22 i22Var2 = this.c;
            i22Var2.I0 = onDismissListener;
            byte b2 = this.V;
            if (b2 != 0) {
                i22Var2.K1 = new un5(b2, this.M);
            }
            this.a.showDialog(i22Var2);
            return;
        }
        my0 i2 = wi8.i(dVar2.getParentActivity(), false, 1, null);
        if (i == 1) {
            i2.P = jb6.a0("SetPhotoFor", null, 2131745252, this.M.first_name);
            i2.Q = true;
        } else if (i == 2) {
            i2.P = jb6.a0("SuggestPhotoFor", null, 2131744091, this.M.first_name);
            i2.Q = true;
        } else {
            i2.P = jb6.M0(2131752060, null);
            i2.Q = true;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        b10.r(null, 2131752050, arrayList, R.drawable.msg_camera, arrayList2);
        arrayList3.add(0);
        if (this.R) {
            b10.r(null, 2131752057, arrayList, R.drawable.msg_video, arrayList2);
            arrayList3.add(4);
        }
        b10.r(null, 2131752065, arrayList, R.drawable.msg_photos, arrayList2);
        arrayList3.add(1);
        if (this.K) {
            b10.r(null, 2131752063, arrayList, R.drawable.msg_search, arrayList2);
            arrayList3.add(2);
        }
        if (z) {
            b10.r(null, 2131751451, arrayList, R.drawable.msg_delete, arrayList2);
            arrayList3.add(3);
        }
        int[] iArr = new int[arrayList2.size()];
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = ((Integer) arrayList2.get(i3)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        rn5 rn5Var = new rn5(this, arrayList3, runnable, b);
        i2.M = charSequenceArr;
        i2.N = iArr;
        i2.L = rn5Var;
        i2.I0 = onDismissListener;
        this.a.showDialog(i2);
        if (z) {
            int size2 = arrayList.size() - 1;
            int i4 = cmb.p7;
            int w0 = cmb.w0(null, i4, false);
            int i5 = cmb.o7;
            i2.w0(size2, w0, cmb.w0(null, i5, false));
            int size3 = arrayList.size() - 1;
            if (size3 < 0 || size3 >= i2.x0.size() || (gy0Var = (gy0) i2.x0.get(size3)) == null || gy0Var.getTextView() == null || gy0Var.getImageView() == null) {
                return;
            }
            anb.X(gy0Var.getTextView(), i4, null);
            anb.s(gy0Var.getImageView(), i5, null, PorterDuff.Mode.MULTIPLY);
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z) {
        ArrayList arrayList = new ArrayList();
        jo6 jo6Var = new jo6(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        jo6Var.n(pair);
        jo6Var.b = z;
        jo6Var.c = str2;
        arrayList.add(jo6Var);
        PhotoViewer.r0().T1(null, this.a, null);
        PhotoViewer.r0().o1(arrayList, 0, 1, false, new tn5(this, arrayList), null);
        PhotoViewer.r0().Q = true;
    }

    public final void p(String str, String str2, boolean z) {
        o(str, str2, new Pair(0, 0), z);
    }

    public final void q() {
        if (this.a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        w78 w78Var = new w78(0, null, hashMap, arrayList, 1, false, null, this.S);
        yh4 yh4Var = new yh4();
        yh4Var.d = this;
        yh4Var.b = hashMap;
        yh4Var.c = arrayList;
        w78Var.t0 = yh4Var;
        w78Var.k0(1, false);
        w78Var.q0 = this.b.getInitialSearchString();
        boolean z = this.T;
        d dVar = this.a;
        if (z) {
            dVar.showAsSheet(w78Var);
        } else {
            dVar.presentFragment(w78Var);
        }
    }

    public final void r(boolean z, Bitmap bitmap, k47 k47Var) {
        if (bitmap != null) {
            this.O = null;
            this.N = null;
            this.E = null;
            this.y = null;
            this.P = k47Var == null ? null : k47Var.s;
            this.h = fn5.T(bitmap, 800.0f, 800.0f, 80, nm7.q5, nm7.q5);
            TLRPC.PhotoSize T = fn5.T(bitmap, 150.0f, 150.0f, 80, nm7.f2, nm7.f2);
            this.n = T;
            if (T != null) {
                try {
                    bc4.G(this.d);
                    Bitmap decodeFile = BitmapFactory.decodeFile(bc4.J(this.n, null, true, true).getAbsolutePath());
                    this.r = decodeFile;
                    fn5.z().K(new BitmapDrawable(decodeFile), this.n.location.volume_id + "_" + this.n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                z8c.h(this.d).u(false);
                StringBuilder sb = new StringBuilder();
                sb.append(bc4.z(4));
                sb.append("/");
                sb.append(this.h.location.volume_id);
                sb.append("_");
                this.w = hg9.k(sb, this.h.location.local_id, ".jpg");
                if (this.L) {
                    if (k47Var == null || k47Var.r0 == null) {
                        vn5 vn5Var = this.b;
                        if (vn5Var != null) {
                            vn5Var.O(z, false);
                        }
                        this.s = false;
                    } else {
                        if (this.J && !oc7.r1(this.d).l4.D0.f) {
                            vn5 vn5Var2 = this.b;
                            if (vn5Var2 != null) {
                                vn5Var2.O(z, true);
                            }
                            vn5 vn5Var3 = this.b;
                            if (vn5Var3 != null) {
                                vn5Var3.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
                                this.b.U(null, null, this.Q, this.y, this.h, this.n, this.s, this.P);
                                b();
                                return;
                            }
                            return;
                        }
                        this.E = k47Var;
                        rcc rccVar = k47Var.r0;
                        long j = rccVar.a;
                        if (j < 0) {
                            j = 0;
                        }
                        this.Q = (rccVar.c - j) / 1000000.0d;
                        rccVar.Y = false;
                        nm7.f(this.d).a(this, nm7.a2);
                        nm7.f(this.d).a(this, nm7.c2);
                        nm7.f(this.d).a(this, nm7.b2);
                        MediaController.w().g0(k47Var, true, true, false);
                        this.w = null;
                        vn5 vn5Var4 = this.b;
                        if (vn5Var4 != null) {
                            vn5Var4.O(z, true);
                        }
                        this.s = true;
                    }
                    nm7.f(this.d).a(this, nm7.U1);
                    nm7.f(this.d).a(this, nm7.W1);
                    nm7.f(this.d).a(this, nm7.V1);
                    if (this.w != null) {
                        bc4.G(this.d).h0(false, 16777216, this.w, true);
                    }
                }
                vn5 vn5Var5 = this.b;
                if (vn5Var5 != null) {
                    vn5Var5.U(null, null, 0.0d, null, this.h, this.n, this.s, null);
                }
            }
        }
    }

    public final void s(jo6 jo6Var) {
        Bitmap G;
        String str = jo6Var.h;
        if (str == null) {
            str = jo6Var.I;
        }
        k47 k47Var = null;
        if ((jo6Var.b || jo6Var.s != null) && !jo6Var.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            k47 k47Var2 = new k47(z8c.t0, tL_message, false, false);
            k47Var2.k.attachPath = new File(bc4.z(4), gda.p() + "_avatar.mp4").getAbsolutePath();
            k47Var2.r0 = jo6Var.s;
            k47Var2.s = jo6Var.S;
            G = fn5.G(jo6Var.c, null, 800.0f, 800.0f, true);
            k47Var = k47Var2;
        } else {
            G = fn5.G(str, null, 800.0f, 800.0f, true);
        }
        r(false, G, k47Var);
    }
}
