// default package

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r98 extends c6 {
    public final /* synthetic */ ylb a;
    public final /* synthetic */ PhotoViewer b;

    public r98(PhotoViewer photoViewer, ylb ylbVar) {
        this.b = photoViewer;
        this.a = ylbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[RETURN] */
    @Override // c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a() {
        PhotoViewer photoViewer = this.b;
        if (photoViewer.S4 == null && photoViewer.a5 == null) {
            if (photoViewer.Z4 != null) {
                bc4.G(photoViewer.U);
                gn5 gn5Var = photoViewer.Z4;
                File J = bc4.J(gn5Var == null ? null : gn5Var.f, PhotoViewer.o0(gn5Var), photoViewer.y5 != 0 || photoViewer.A5, true);
                File file = new File(bc4.z(4), J.getName());
                bc4.G(photoViewer.U);
                gn5 gn5Var2 = photoViewer.Z4;
                File J2 = bc4.J(gn5Var2 != null ? gn5Var2.f : null, PhotoViewer.o0(gn5Var2), false, true);
                if (!J.exists() && !file.exists() && !J2.exists()) {
                    return false;
                }
            } else if (photoViewer.i7 == null) {
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x03de, code lost:
    
        if (aq1.t(r0) != false) goto L196;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x04a6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:358:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:367:0x066e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0225  */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v13 */
    @Override // c6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        k47 k47Var;
        TLObject tLObject;
        gn5 gn5Var;
        TLRPC.Photo photo;
        String str;
        ms1 ms1Var;
        View findViewWithTag;
        boolean z;
        CharSequence c0;
        gn5 gn5Var2;
        k47 k47Var2;
        k47 k47Var3;
        int i2;
        String str2;
        ee eeVar;
        TextView textView;
        long A0;
        TLRPC.Chat L0;
        TLRPC.User user;
        int i3;
        pb8 pb8Var;
        boolean z2;
        ArrayList arrayList;
        f47 T6;
        boolean z3;
        k47 k47Var4;
        TLRPC.Message message;
        String str3;
        int i4;
        String str4;
        f47 f47Var;
        ?? r15;
        File file;
        boolean a;
        Object[] objArr;
        boolean z4 = true;
        z4 = true;
        z4 = true;
        if (i == -1) {
            sa8 sa8Var = this.b.M1;
            if (sa8Var == null || !sa8Var.p0()) {
                boolean K0 = this.b.K0();
                PhotoViewer photoViewer = this.b;
                if (K0) {
                    photoViewer.x(false);
                    return;
                } else {
                    photoViewer.A(true, false);
                    return;
                }
            }
            return;
        }
        final byte b = 0;
        File file2 = null;
        if (i == 2) {
            PhotoViewer photoViewer2 = this.b;
            if (photoViewer2.i7 != null && !photoViewer2.l2) {
                return;
            }
            if ((Build.VERSION.SDK_INT <= 28 || e21.b) && photoViewer2.E.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.b.E.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            final ArrayList arrayList2 = new ArrayList(1);
            PhotoViewer photoViewer3 = this.b;
            yv1 yv1Var = photoViewer3.k4;
            if (yv1Var != null) {
                i4 = 4;
                str4 = "Cancel";
                f47Var = yv1Var.T6(photoViewer3.S4.c1());
            } else {
                i4 = 4;
                str4 = "Cancel";
                f47Var = null;
            }
            if (f47Var != null) {
                arrayList2.addAll(f47Var.d);
            } else {
                arrayList2.add(this.b.S4);
            }
            if (arrayList2.size() > 1) {
                boolean z5 = false;
                boolean z6 = false;
                boolean z7 = false;
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    k47 k47Var5 = (k47) arrayList2.get(i5);
                    if (k47Var5.D3()) {
                        z7 = true;
                    } else if (k47Var5.G4()) {
                        z5 = true;
                    } else {
                        z6 = true;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.b.E, this.a);
                alertDialog$Builder.k(jb6.M0(2131745675, "SaveGroupMedia"));
                alertDialog$Builder.f(jb6.M0(2131745674, "SaveGroupMediaMessage"));
                alertDialog$Builder.a.J = cmb.fh;
                k47 k47Var6 = this.b.S4;
                String M0 = (k47Var6 == null || !k47Var6.G4() || this.b.S4.D3()) ? jb6.M0(2131743826, "ThisPhoto") : jb6.M0(2131743827, "ThisMedia");
                final byte b2 = true ? (byte) 1 : (byte) 0;
                alertDialog$Builder.g(M0, new ee(this) { // from class: j98
                    public final /* synthetic */ r98 b;

                    {
                        this.b = this;
                    }

                    @Override // ee
                    public final void r(he heVar, int i6) {
                        File M;
                        byte b3 = b2;
                        r98 r98Var = this.b;
                        switch (b3) {
                            case 0:
                                ArrayList arrayList3 = new ArrayList(1);
                                PhotoViewer photoViewer4 = r98Var.b;
                                arrayList3.add(photoViewer4.S4);
                                photoViewer4.j2(arrayList3);
                                break;
                            default:
                                PhotoViewer photoViewer5 = r98Var.b;
                                k47 k47Var7 = photoViewer5.S4;
                                if (k47Var7 != null) {
                                    File file3 = null;
                                    if ((k47.n1(k47Var7.k) instanceof TLRPC.TL_messageMediaWebPage) && k47.n1(photoViewer5.S4.k).webpage != null && k47.n1(photoViewer5.S4.k).webpage.document == null) {
                                        TLObject n0 = photoViewer5.n0(photoViewer5.O4, null);
                                        bc4.G(photoViewer5.U);
                                        M = bc4.J(n0, null, true, true);
                                    } else {
                                        bc4.G(photoViewer5.U);
                                        M = bc4.M(photoViewer5.S4.k, false, true);
                                    }
                                    boolean K4 = k47.K4(photoViewer5.S4.k);
                                    boolean D3 = photoViewer5.S4.D3();
                                    if (D3) {
                                        TLRPC.Document document = k47.n1(photoViewer5.S4.k) != null ? k47.n1(photoViewer5.S4.k).document : null;
                                        if (document != null) {
                                            bc4.G(photoViewer5.U);
                                            File J = bc4.J(document, null, false, true);
                                            if (J == null || !J.exists()) {
                                                bc4.G(photoViewer5.U);
                                                file3 = bc4.J(document, null, true, true);
                                            } else {
                                                file3 = J;
                                            }
                                        }
                                    }
                                    if (!D3) {
                                        if (M != null && M.exists()) {
                                            MediaController.d0(M.toString(), photoViewer5.E, K4 ? 1 : 0, null, null, new m98(r98Var, K4, (byte) 0));
                                            break;
                                        } else {
                                            photoViewer5.d2();
                                            break;
                                        }
                                    } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                        MediaController.c0(M.toString(), file3.toString(), photoViewer5.E, new h98(r98Var, (byte) 1));
                                        break;
                                    } else {
                                        photoViewer5.d2();
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                });
                String G = (z5 || z7) ? jb6.G(arrayList2.size(), "AllNMedia", new Object[0]) : jb6.G(arrayList2.size(), "AllNPhotos", new Object[0]);
                final boolean z8 = z5;
                final boolean z9 = z6;
                final boolean z10 = z7;
                alertDialog$Builder.j(G, new ee() { // from class: o98
                    /* JADX WARN: Type inference failed for: r1v0, types: [k98] */
                    @Override // ee
                    public final void r(he heVar, int i6) {
                        File M;
                        final r98 r98Var = r98.this;
                        PhotoViewer photoViewer4 = r98Var.b;
                        final byte b3 = 1;
                        final int[] iArr = new int[1];
                        final int[] iArr2 = new int[1];
                        final boolean z11 = z8;
                        final boolean z12 = z9;
                        final boolean z13 = z10;
                        final ?? r1 = new Runnable() { // from class: k98
                            @Override // java.lang.Runnable
                            public final void run() {
                                int[] iArr3 = iArr2;
                                int i7 = iArr3[0] + 1;
                                iArr3[0] = i7;
                                int i8 = iArr[0];
                                if (i7 == i8) {
                                    lb8 lb8Var = r98.this.b.f0;
                                    boolean z14 = z11;
                                    int i9 = (z12 ? 1 : 0) + (z14 ? 1 : 0);
                                    boolean z15 = z13;
                                    new c41(lb8Var, null).m(i9 + (z15 ? 1 : 0) > 1 ? b41.w : z15 ? i8 > 1 ? b41.s : b41.r : z14 ? i8 > 1 ? b41.n : b41.h : i8 > 1 ? b41.f : b41.e, i8, -115203550, -1, null).j();
                                }
                            }
                        };
                        final byte b4 = 0;
                        int i7 = 0;
                        while (true) {
                            ArrayList arrayList3 = arrayList2;
                            if (i7 >= arrayList3.size()) {
                                return;
                            }
                            k47 k47Var7 = (k47) arrayList3.get(i7);
                            if (k47Var7 != null) {
                                File file3 = null;
                                if ((k47.n1(k47Var7.k) instanceof TLRPC.TL_messageMediaWebPage) && k47.n1(k47Var7.k).webpage != null && k47.n1(k47Var7.k).webpage.document == null) {
                                    bc4.G(photoViewer4.U);
                                    M = bc4.J(photoViewer4.n0(photoViewer4.O4, null), null, true, true);
                                } else {
                                    bc4.G(photoViewer4.U);
                                    M = bc4.M(k47Var7.k, false, true);
                                }
                                boolean K4 = k47.K4(k47Var7.k);
                                boolean D3 = k47Var7.D3();
                                if (D3) {
                                    TLRPC.Document document = k47.n1(k47Var7.k) != null ? k47.n1(k47Var7.k).document : null;
                                    if (document != null) {
                                        bc4.G(photoViewer4.U);
                                        File J = bc4.J(document, null, false, true);
                                        if (J == null || !J.exists()) {
                                            bc4.G(photoViewer4.U);
                                            file3 = bc4.J(document, null, true, true);
                                        } else {
                                            file3 = J;
                                        }
                                    }
                                }
                                if (D3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    if (file3 == null || !file3.exists()) {
                                        MediaController.d0(M.toString(), photoViewer4.E, 0, null, null, new qac() { // from class: l98
                                            @Override // qac
                                            public final void a(Object obj) {
                                                byte b5 = b3;
                                                k98 k98Var = r1;
                                                switch (b5) {
                                                    case 0:
                                                        gm.c3(k98Var);
                                                        break;
                                                    case 1:
                                                        gm.c3(k98Var);
                                                        break;
                                                    default:
                                                        gm.c3(k98Var);
                                                        break;
                                                }
                                            }
                                        });
                                    } else {
                                        MediaController.c0(M.toString(), file3.toString(), photoViewer4.E, new qac() { // from class: l98
                                            @Override // qac
                                            public final void a(Object obj) {
                                                byte b5 = b4;
                                                k98 k98Var = r1;
                                                switch (b5) {
                                                    case 0:
                                                        gm.c3(k98Var);
                                                        break;
                                                    case 1:
                                                        gm.c3(k98Var);
                                                        break;
                                                    default:
                                                        gm.c3(k98Var);
                                                        break;
                                                }
                                            }
                                        });
                                    }
                                } else if (!D3 && M != null && M.exists()) {
                                    iArr[0] = iArr[0] + 1;
                                    final byte b5 = 2;
                                    MediaController.d0(M.toString(), photoViewer4.E, K4 ? 1 : 0, null, null, new qac() { // from class: l98
                                        @Override // qac
                                        public final void a(Object obj) {
                                            byte b52 = b5;
                                            k98 k98Var = r1;
                                            switch (b52) {
                                                case 0:
                                                    gm.c3(k98Var);
                                                    break;
                                                case 1:
                                                    gm.c3(k98Var);
                                                    break;
                                                default:
                                                    gm.c3(k98Var);
                                                    break;
                                            }
                                        }
                                    });
                                }
                            }
                            i7++;
                        }
                    }
                });
                alertDialog$Builder.h(jb6.M0(2131752542, str4), new i98((byte) 0));
                he heVar = alertDialog$Builder.a;
                heVar.j(this.b.y0(cmb.kh));
                heVar.show();
                View c = heVar.c(-3);
                if (c instanceof TextView) {
                    int i6 = cmb.p7;
                    anb.X((TextView) c, i6, this.b.w2);
                    c.setBackground(cmb.H0(gm.L(3.0f), this.b.y0(i6)));
                    ViewGroup viewGroup = heVar.u0;
                    if ((viewGroup instanceof LinearLayout) && ((LinearLayout) viewGroup).getOrientation() == 1) {
                        c.bringToFront();
                    }
                }
                heVar.o(this.b.y0(cmb.Xg));
                return;
            }
            PhotoViewer photoViewer4 = this.b;
            k47 k47Var7 = photoViewer4.S4;
            if (k47Var7 == null) {
                gn5 gn5Var3 = photoViewer4.Z4;
                if (gn5Var3 != null) {
                    String o0 = PhotoViewer.o0(gn5Var3);
                    bc4.G(this.b.U);
                    PhotoViewer photoViewer5 = this.b;
                    gn5 gn5Var4 = photoViewer5.Z4;
                    File J = bc4.J(gn5Var4 == null ? null : gn5Var4.f, o0, photoViewer5.y5 != 0 || photoViewer5.A5, true);
                    if (J != null && !J.exists()) {
                        bc4.G(this.b.U);
                        gn5 gn5Var5 = this.b.Z4;
                        J = bc4.J(gn5Var5 == null ? null : gn5Var5.f, o0, false, true);
                    }
                    if (o0 != null) {
                        o0 = o0.toLowerCase();
                    }
                    r15 = o0 != null && (o0.equals("webm") || o0.equals("mp4") || o0.equals("gif"));
                    file = J;
                } else {
                    mb8 mb8Var = photoViewer4.i7;
                    if (mb8Var != null) {
                        file = mb8Var.b(photoViewer4.O4);
                        PhotoViewer photoViewer6 = this.b;
                        a = photoViewer6.i7.a(photoViewer6.O4);
                    } else {
                        r15 = 0;
                        file = null;
                    }
                }
                if (file != null && !file.exists()) {
                    file = new File(bc4.z(i4), file.getName());
                }
                k47 k47Var8 = this.b.S4;
                objArr = k47Var8 == null && k47Var8.D3();
                if (objArr != false) {
                    TLRPC.Document document = k47.n1(this.b.S4.k) != null ? k47.n1(this.b.S4.k).document : null;
                    if (document != null) {
                        bc4.G(this.b.U);
                        file2 = bc4.K(document, false);
                        if (file2 == null || !file2.exists()) {
                            bc4.G(this.b.U);
                            file2 = bc4.K(document, true);
                        }
                    }
                }
                if (objArr == true) {
                    if (file == null || !file.exists()) {
                        this.b.d2();
                        return;
                    } else {
                        MediaController.d0(file.toString(), this.b.E, r15, null, null, new m98(this, r15, true ? (byte) 1 : (byte) 0));
                        return;
                    }
                }
                if (file == null || !file.exists() || file2 == null || !file2.exists()) {
                    this.b.d2();
                    return;
                } else {
                    MediaController.c0(file.toString(), file2.toString(), this.b.E, new h98(this, b));
                    return;
                }
            }
            if ((k47.n1(k47Var7.k) instanceof TLRPC.TL_messageMediaWebPage) && k47.n1(this.b.S4.k).webpage != null && k47.n1(this.b.S4.k).webpage.document == null) {
                PhotoViewer photoViewer7 = this.b;
                TLObject n0 = photoViewer7.n0(photoViewer7.O4, null);
                bc4.G(this.b.U);
                file = bc4.K(n0, true);
                if (!file.exists()) {
                    file = new File(bc4.z(i4), file.getName());
                }
            } else {
                bc4.G(this.b.U);
                file = bc4.L(this.b.S4.k);
            }
            a = this.b.S4.G4();
            r15 = a;
            if (file != null) {
                file = new File(bc4.z(i4), file.getName());
            }
            k47 k47Var82 = this.b.S4;
            if (k47Var82 == null) {
            }
            if (objArr != false) {
            }
            if (objArr == true) {
            }
        } else {
            if (i == 24) {
                hi2 v = hi2.v();
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                v.Q(photoViewer8.k0());
                this.b.H0.performClick();
                return;
            }
            if (i == 3) {
                PhotoViewer photoViewer9 = this.b;
                if (photoViewer9.D5 != 0) {
                    photoViewer9.r4 = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("dialog_id", this.b.D5);
                    cm6 cm6Var = new cm6(bundle, null);
                    PhotoViewer photoViewer10 = this.b;
                    yv1 yv1Var2 = photoViewer10.k4;
                    if (yv1Var2 != null) {
                        cm6Var.c = yv1Var2.r8;
                    }
                    photoViewer10.A(false, false);
                    Activity activity = this.b.E;
                    if (activity instanceof LaunchActivity) {
                        ((LaunchActivity) activity).u0(cm6Var, false, true);
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 5 || i == 21) {
                if (this.b.S4 != null) {
                    Bundle bundle2 = new Bundle();
                    PhotoViewer photoViewer11 = this.b;
                    long j = photoViewer11.D5;
                    k47 k47Var9 = photoViewer11.S4;
                    if (k47Var9 != null) {
                        j = k47Var9.A0();
                    }
                    if (pg3.B(j)) {
                        bundle2.putInt("enc_id", pg3.h(j));
                    } else if (pg3.D(j)) {
                        bundle2.putLong("user_id", j);
                    } else {
                        TLRPC.Chat L02 = oc7.r1(this.b.U).L0(Long.valueOf(-j));
                        if (L02 != null && L02.migrated_to != null) {
                            bundle2.putLong("migrated_to", j);
                            j = -L02.migrated_to.channel_id;
                        }
                        bundle2.putLong("chat_id", -j);
                    }
                    bundle2.putInt("message_id", this.b.S4.e1());
                    if (i == 21) {
                        bundle2.putInt("reply_to", this.b.S4.e1());
                    }
                    nm7.f(this.b.U).k(nm7.s, new Object[0]);
                    Activity activity2 = this.b.E;
                    if (activity2 instanceof LaunchActivity) {
                        LaunchActivity launchActivity = (LaunchActivity) activity2;
                        boolean z11 = launchActivity.R() > 1 || gm.O1();
                        yv1 yv1Var3 = new yv1(bundle2);
                        pb8 pb8Var2 = this.b.d;
                        if (pb8Var2 != null) {
                            pb8Var2.A();
                        }
                        launchActivity.u0(yv1Var3, z11, true);
                    }
                    this.b.A(false, false);
                    PhotoViewer photoViewer12 = this.b;
                    photoViewer12.S4 = null;
                    VideoAds videoAds = photoViewer12.T4;
                    if (videoAds != null) {
                        videoAds.stop();
                        this.b.T4 = null;
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 25) {
                PhotoViewer photoViewer13 = this.b;
                if (photoViewer13.l4 == null || photoViewer13.d == null || (k47Var4 = photoViewer13.S4) == null || (message = k47Var4.k) == null) {
                    return;
                }
                if (!TextUtils.isEmpty(message.attachPath)) {
                    str3 = this.b.S4.k.attachPath;
                    if (!TextUtils.isEmpty(str3)) {
                    }
                }
                str3 = null;
                if (TextUtils.isEmpty(str3)) {
                    bc4.G(this.b.U);
                    File N = bc4.N(this.b.S4.k);
                    if (N != null && N.exists()) {
                        str3 = N.getAbsolutePath();
                    }
                }
                String str5 = str3;
                if (TextUtils.isEmpty(str5)) {
                    return;
                }
                yv1 yv1Var4 = this.b.k4;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.add(new jo6(0, str5, 0, false, 0, 0));
                this.b.o1(arrayList3, 0, 11, false, new p98(), yv1Var4);
                this.b.U(null, null, false, null);
                this.b.u1();
                hx2.e().T = null;
                return;
            }
            if (i == 4) {
                PhotoViewer photoViewer14 = this.b;
                k47 k47Var10 = photoViewer14.S4;
                if (k47Var10 == null || !(photoViewer14.E instanceof LaunchActivity)) {
                    return;
                }
                if (!k47Var10.r1) {
                    long A02 = k47Var10.A0();
                    if (pg3.y(A02)) {
                        z2 = sd2.V(oc7.r1(this.b.U).L0(Long.valueOf(-A02)));
                        PhotoViewer photoViewer15 = this.b;
                        ((LaunchActivity) photoViewer15.E).N0(photoViewer15.S4.K1);
                        arrayList = new ArrayList(1);
                        PhotoViewer photoViewer16 = this.b;
                        yv1 yv1Var5 = photoViewer16.k4;
                        T6 = yv1Var5 == null ? yv1Var5.T6(photoViewer16.S4.c1()) : null;
                        if (T6 == null) {
                            arrayList.addAll(T6.d);
                        } else {
                            arrayList.add(this.b.S4);
                        }
                        if (!z2 && arrayList.size() <= 1) {
                            this.b.j2(arrayList);
                            return;
                        }
                        if (arrayList.size() > 1) {
                            Bundle bundle3 = new Bundle();
                            bundle3.putBoolean("onlySelect", true);
                            bundle3.putBoolean("canSelectTopics", true);
                            bundle3.putInt("dialogsType", 3);
                            nk3 nk3Var = new nk3(bundle3);
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(this.b.S4);
                            PhotoViewer photoViewer17 = this.b;
                            nk3Var.E2 = new wu2((Object) this, (Object) arrayList4, (Object) photoViewer17.k4, (byte) 23);
                            ((LaunchActivity) photoViewer17.E).u0(nk3Var, false, true);
                            this.b.A(false, false);
                            return;
                        }
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            if (!((k47) arrayList.get(i7)).Q3() || ((k47) arrayList.get(i7)).G4()) {
                                z3 = false;
                                break;
                            }
                        }
                        z3 = true;
                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.b.E, this.a);
                        alertDialog$Builder2.k(jb6.M0(2131750517, "ForwardGroupMedia"));
                        alertDialog$Builder2.f(jb6.M0(2131750516, "ForwardGroupMediaMessage"));
                        alertDialog$Builder2.a.J = cmb.fh;
                        alertDialog$Builder2.g(z3 ? jb6.M0(2131743826, "ThisPhoto") : jb6.M0(2131743827, "ThisMedia"), new ee(this) { // from class: j98
                            public final /* synthetic */ r98 b;

                            {
                                this.b = this;
                            }

                            @Override // ee
                            public final void r(he heVar2, int i62) {
                                File M;
                                byte b3 = b;
                                r98 r98Var = this.b;
                                switch (b3) {
                                    case 0:
                                        ArrayList arrayList32 = new ArrayList(1);
                                        PhotoViewer photoViewer42 = r98Var.b;
                                        arrayList32.add(photoViewer42.S4);
                                        photoViewer42.j2(arrayList32);
                                        break;
                                    default:
                                        PhotoViewer photoViewer52 = r98Var.b;
                                        k47 k47Var72 = photoViewer52.S4;
                                        if (k47Var72 != null) {
                                            File file3 = null;
                                            if ((k47.n1(k47Var72.k) instanceof TLRPC.TL_messageMediaWebPage) && k47.n1(photoViewer52.S4.k).webpage != null && k47.n1(photoViewer52.S4.k).webpage.document == null) {
                                                TLObject n02 = photoViewer52.n0(photoViewer52.O4, null);
                                                bc4.G(photoViewer52.U);
                                                M = bc4.J(n02, null, true, true);
                                            } else {
                                                bc4.G(photoViewer52.U);
                                                M = bc4.M(photoViewer52.S4.k, false, true);
                                            }
                                            boolean K4 = k47.K4(photoViewer52.S4.k);
                                            boolean D3 = photoViewer52.S4.D3();
                                            if (D3) {
                                                TLRPC.Document document2 = k47.n1(photoViewer52.S4.k) != null ? k47.n1(photoViewer52.S4.k).document : null;
                                                if (document2 != null) {
                                                    bc4.G(photoViewer52.U);
                                                    File J2 = bc4.J(document2, null, false, true);
                                                    if (J2 == null || !J2.exists()) {
                                                        bc4.G(photoViewer52.U);
                                                        file3 = bc4.J(document2, null, true, true);
                                                    } else {
                                                        file3 = J2;
                                                    }
                                                }
                                            }
                                            if (!D3) {
                                                if (M != null && M.exists()) {
                                                    MediaController.d0(M.toString(), photoViewer52.E, K4 ? 1 : 0, null, null, new m98(r98Var, K4, (byte) 0));
                                                    break;
                                                } else {
                                                    photoViewer52.d2();
                                                    break;
                                                }
                                            } else if (M != null && M.exists() && file3 != null && file3.exists()) {
                                                MediaController.c0(M.toString(), file3.toString(), photoViewer52.E, new h98(r98Var, (byte) 1));
                                                break;
                                            } else {
                                                photoViewer52.d2();
                                                break;
                                            }
                                        }
                                        break;
                                }
                            }
                        });
                        alertDialog$Builder2.j(z3 ? jb6.G(arrayList.size(), "AllNPhotos", new Object[0]) : jb6.G(arrayList.size(), "AllNMedia", new Object[0]), new cz6(this, arrayList, (byte) 20));
                        alertDialog$Builder2.h(jb6.M0(2131752542, "Cancel"), new i98((byte) 1));
                        he heVar2 = alertDialog$Builder2.a;
                        heVar2.j(this.b.y0(cmb.kh));
                        heVar2.show();
                        View c2 = heVar2.c(-3);
                        if (c2 instanceof TextView) {
                            int i8 = cmb.p7;
                            anb.X((TextView) c2, i8, this.b.w2);
                            c2.setBackground(cmb.H0(gm.L(3.0f), this.b.y0(i8)));
                            ViewGroup viewGroup2 = heVar2.u0;
                            if ((viewGroup2 instanceof LinearLayout) && ((LinearLayout) viewGroup2).getOrientation() == 1) {
                                c2.bringToFront();
                            }
                        }
                        heVar2.o(this.b.y0(cmb.Xg));
                        return;
                    }
                }
                z2 = false;
                PhotoViewer photoViewer152 = this.b;
                ((LaunchActivity) photoViewer152.E).N0(photoViewer152.S4.K1);
                arrayList = new ArrayList(1);
                PhotoViewer photoViewer162 = this.b;
                yv1 yv1Var52 = photoViewer162.k4;
                if (yv1Var52 == null) {
                }
                if (T6 == null) {
                }
                if (!z2) {
                }
                if (arrayList.size() > 1) {
                }
            } else {
                if (i == 18) {
                    PhotoViewer photoViewer18 = this.b;
                    Drawable[] drawableArr2 = PhotoViewer.d9;
                    photoViewer18.i1();
                    return;
                }
                if (i == 26) {
                    PhotoViewer photoViewer19 = this.b;
                    if (photoViewer19.E == null || (pb8Var = photoViewer19.d) == null) {
                        return;
                    }
                    pb8Var.J();
                    this.b.A(true, false);
                    return;
                }
                if (i != 7) {
                    if (i == 9 || i == 16) {
                        PhotoViewer photoViewer20 = this.b;
                        Drawable[] drawableArr3 = PhotoViewer.d9;
                        photoViewer20.e1();
                        return;
                    }
                    if (i == 10) {
                        try {
                            PhotoViewer photoViewer21 = this.b;
                            if (photoViewer21.s4) {
                                l11.u(photoViewer21.E, k47.n1(photoViewer21.S4.k).webpage.url);
                                this.b.A(false, false);
                                return;
                            }
                            k47 k47Var11 = photoViewer21.S4;
                            if (k47Var11 == null) {
                                mb8 mb8Var2 = photoViewer21.i7;
                                if (mb8Var2 != null) {
                                    boolean t2 = gm.t2(mb8Var2.d(photoViewer21.O4), this.b.E);
                                    PhotoViewer photoViewer22 = this.b;
                                    if (t2) {
                                        photoViewer22.A(false, false);
                                        return;
                                    } else {
                                        photoViewer22.d2();
                                        return;
                                    }
                                }
                                return;
                            }
                            Activity activity3 = photoViewer21.E;
                            ylb ylbVar = this.a;
                            if (!k47Var11.G4() && !this.b.S4.Q3() && !this.b.S4.s4()) {
                                z4 = false;
                            }
                            boolean r2 = gm.r2(k47Var11, activity3, ylbVar, z4);
                            PhotoViewer photoViewer23 = this.b;
                            if (r2) {
                                photoViewer23.A(false, false);
                                return;
                            } else {
                                photoViewer23.d2();
                                return;
                            }
                        } catch (Exception e) {
                            fc4.f(e);
                            return;
                        }
                    }
                    if (i == 11 || i == 13) {
                        PhotoViewer photoViewer24 = this.b;
                        if (photoViewer24.E == null || (k47Var = photoViewer24.S4) == null) {
                            return;
                        }
                        boolean z12 = k47.n1(k47Var.k) instanceof TLRPC.TL_messageMediaPhoto;
                        k47 k47Var12 = this.b.S4;
                        if (z12) {
                            tLObject = k47.n1(k47Var12.k).photo;
                        } else if (!(k47.n1(k47Var12.k) instanceof TLRPC.TL_messageMediaDocument)) {
                            return;
                        } else {
                            tLObject = k47.n1(this.b.S4.k).document;
                        }
                        TLObject tLObject2 = tLObject;
                        PhotoViewer photoViewer25 = this.b;
                        PhotoViewer photoViewer26 = this.b;
                        photoViewer25.U3 = new q98(this, photoViewer26.E, photoViewer26.S4, tLObject2, this.a);
                        this.b.U3.show();
                        return;
                    }
                    byte b3 = 6;
                    if (i == 6) {
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.b.p0.b;
                        if (actionBarPopupWindow$ActionBarPopupWindowLayout == null || (findViewWithTag = actionBarPopupWindow$ActionBarPopupWindowLayout.findViewWithTag(6)) == null || findViewWithTag.getVisibility() != 0) {
                            return;
                        }
                        PhotoViewer photoViewer27 = this.b;
                        if (!photoViewer27.s4) {
                            photoViewer27.r2();
                            return;
                        }
                        if (photoViewer27.g0.d()) {
                            if (PhotoViewer.k9 != null) {
                                PhotoViewer.k9.L();
                            }
                            this.b.J3 = true;
                            PhotoViewer.k9 = PhotoViewer.j9;
                            PhotoViewer.j9 = null;
                            PhotoViewer photoViewer28 = this.b;
                            photoViewer28.e = false;
                            photoViewer28.f = false;
                            qb8 qb8Var = photoViewer28.c5;
                            if (qb8Var != null) {
                                ImageReceiver imageReceiver = qb8Var.a;
                                if (!imageReceiver.R0) {
                                    imageReceiver.v0(true, true);
                                }
                            }
                            PhotoViewer photoViewer29 = this.b;
                            photoViewer29.l6 = 1.0f;
                            photoViewer29.f0.invalidate();
                            this.b.O();
                            return;
                        }
                        return;
                    }
                    if (i == 8) {
                        PhotoViewer photoViewer30 = this.b;
                        if (photoViewer30.S4 != null) {
                            bc4.G(photoViewer30.U).d(this.b.S4.F0());
                            this.b.w1(false);
                            this.b.j0.setTag(r2);
                            this.b.j0.setVisibility(0);
                            return;
                        }
                        return;
                    }
                    if (i == 12) {
                        PhotoViewer photoViewer31 = this.b;
                        k47 k47Var13 = photoViewer31.S4;
                        if (k47Var13 != null) {
                            TLRPC.Document F0 = k47Var13.F0();
                            PhotoViewer photoViewer32 = this.b;
                            yv1 yv1Var6 = photoViewer32.k4;
                            if (yv1Var6 == null || (ms1Var = yv1Var6.a0) == null) {
                                hs6.d0(photoViewer32.U).c(F0, (int) (System.currentTimeMillis() / 1000), true);
                            } else {
                                ms1Var.j(F0);
                            }
                            oc7.r1(this.b.U).y4(this.b.S4, F0);
                        } else {
                            mb8 mb8Var3 = photoViewer31.i7;
                            if (mb8Var3 == null) {
                                return;
                            }
                            TLObject d = mb8Var3.d(photoViewer31.O4);
                            if (d instanceof TLRPC.Document) {
                                TLRPC.Document document2 = (TLRPC.Document) d;
                                hs6.d0(this.b.U).c(document2, (int) (System.currentTimeMillis() / 1000), true);
                                oc7.r1(this.b.U).y4(this.b.i7.g(), document2);
                            }
                        }
                        lb8 lb8Var = this.b.f0;
                        if (lb8Var != null) {
                            c41.a0(lb8Var, this.a).o(b41.E, this.a).j();
                            return;
                        }
                        return;
                    }
                    if (i != 14) {
                        if (i == 15) {
                            bc4.G(this.b.U);
                            gn5 gn5Var6 = this.b.Z4;
                            File J2 = bc4.J(gn5Var6 == null ? null : gn5Var6.f, PhotoViewer.o0(gn5Var6), true, true);
                            PhotoViewer photoViewer33 = this.b;
                            boolean z13 = photoViewer33.Z4.p == 2;
                            if (z13) {
                                bc4.G(photoViewer33.U);
                                gn5 gn5Var7 = this.b.Y4;
                                str = bc4.J(gn5Var7 == null ? null : gn5Var7.f, PhotoViewer.o0(gn5Var7), true, true).getAbsolutePath();
                            } else {
                                str = null;
                            }
                            this.b.d.g(J2.getAbsolutePath(), str, z13);
                            return;
                        }
                        if (i == 19) {
                            PhotoViewer photoViewer34 = this.b;
                            int i9 = photoViewer34.P4;
                            if (i9 < 0 || i9 >= photoViewer34.X6.size()) {
                                return;
                            }
                            PhotoViewer photoViewer35 = this.b;
                            k47 k47Var14 = (k47) photoViewer35.X6.get(photoViewer35.P4);
                            this.b.m5 = true;
                            final byte b4 = true ? (byte) 1 : (byte) 0;
                            gm.d3(new Runnable(this) { // from class: n98
                                public final /* synthetic */ r98 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b5 = b4;
                                    r98 r98Var = this.b;
                                    switch (b5) {
                                        case 0:
                                            r7 r7Var = r98Var.b.p0;
                                            if (r7Var != null) {
                                                r7Var.u(14);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            PhotoViewer photoViewer36 = r98Var.b;
                                            photoViewer36.p0.u(19);
                                            photoViewer36.p0.S(20);
                                            break;
                                        default:
                                            PhotoViewer photoViewer37 = r98Var.b;
                                            photoViewer37.p0.S(19);
                                            photoViewer37.p0.u(20);
                                            break;
                                    }
                                }
                            }, 32L);
                            this.b.F2();
                            oc7.r1(this.b.U).i4.L(k47Var14, new b98(this.b, b3));
                            return;
                        }
                        if (i == 20) {
                            this.b.m5 = false;
                            final byte b5 = 2;
                            gm.d3(new Runnable(this) { // from class: n98
                                public final /* synthetic */ r98 b;

                                {
                                    this.b = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b52 = b5;
                                    r98 r98Var = this.b;
                                    switch (b52) {
                                        case 0:
                                            r7 r7Var = r98Var.b.p0;
                                            if (r7Var != null) {
                                                r7Var.u(14);
                                                break;
                                            }
                                            break;
                                        case 1:
                                            PhotoViewer photoViewer36 = r98Var.b;
                                            photoViewer36.p0.u(19);
                                            photoViewer36.p0.S(20);
                                            break;
                                        default:
                                            PhotoViewer photoViewer37 = r98Var.b;
                                            photoViewer37.p0.S(19);
                                            photoViewer37.p0.u(20);
                                            break;
                                    }
                                }
                            }, 32L);
                            this.b.F2();
                            return;
                        }
                        if (i == 126) {
                            odc odcVar = this.b.k7;
                            if (odcVar != null) {
                                odcVar.d();
                                return;
                            }
                            return;
                        }
                        if (i != 22) {
                            if (i == 23) {
                                PhotoViewer photoViewer36 = this.b;
                                gn5 gn5Var8 = photoViewer36.Y4;
                                TLRPC.Photo photo2 = ((gn5Var8 == null || (photo = gn5Var8.l) == null) && ((gn5Var = photoViewer36.Z4) == null || (photo = gn5Var.l) == null)) ? null : photo;
                                if (photo2 != null) {
                                    ik.G(photoViewer36.U, photoViewer36.y5, new r63(), photoViewer36.E, photo2);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        PhotoViewer photoViewer37 = this.b;
                        boolean z14 = !photoViewer37.Z2;
                        photoViewer37.Z2 = z14;
                        ndc.m0(photoViewer37.S4, z14);
                        PhotoViewer photoViewer38 = this.b;
                        ndc ndcVar = photoViewer38.G2;
                        if (ndcVar != null) {
                            ndcVar.r0(photoViewer38.Z2);
                        }
                        PhotoViewer photoViewer39 = this.b;
                        photoViewer39.t0.f(photoViewer39.Z2);
                        PhotoViewer photoViewer40 = this.b;
                        photoViewer40.t0.setSelectorColor(photoViewer40.Z2 ? 259241196 : 268435455);
                        return;
                    }
                    PhotoViewer photoViewer41 = this.b;
                    TLRPC.Photo photo3 = (TLRPC.Photo) photoViewer41.e7.get(photoViewer41.O4);
                    if (photo3 == null || photo3.sizes.isEmpty()) {
                        return;
                    }
                    TLRPC.PhotoSize u = bc4.u(800, photo3.sizes);
                    TLRPC.PhotoSize u2 = bc4.u(90, photo3.sizes);
                    z8c h = z8c.h(this.b.U);
                    PhotoViewer photoViewer42 = this.b;
                    if (photoViewer42.y5 == h.n) {
                        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                        tL_photos_updateProfilePhoto.id = tL_inputPhoto;
                        tL_inputPhoto.id = photo3.id;
                        tL_inputPhoto.access_hash = photo3.access_hash;
                        tL_inputPhoto.file_reference = photo3.file_reference;
                        ConnectionsManager.getInstance(this.b.U).sendRequest(tL_photos_updateProfilePhoto, new i65(this, h, photo3, (byte) 28));
                        TLRPC.User W1 = oc7.r1(this.b.U).W1(Long.valueOf(h.n));
                        if (W1 != null) {
                            TLRPC.UserProfilePhoto userProfilePhoto = W1.photo;
                            userProfilePhoto.photo_id = photo3.id;
                            userProfilePhoto.dc_id = photo3.dc_id;
                            userProfilePhoto.photo_small = u2.location;
                            userProfilePhoto.photo_big = u.location;
                            h.v(W1);
                            h.u(true);
                            nm7.f(this.b.U).k(nm7.j0, new Object[0]);
                        }
                    } else {
                        TLRPC.Chat L03 = oc7.r1(photoViewer42.U).L0(Long.valueOf(-this.b.y5));
                        if (L03 == null) {
                            return;
                        }
                        TLRPC.TL_inputChatPhoto tL_inputChatPhoto = new TLRPC.TL_inputChatPhoto();
                        TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                        tL_inputChatPhoto.id = tL_inputPhoto2;
                        tL_inputPhoto2.id = photo3.id;
                        tL_inputPhoto2.access_hash = photo3.access_hash;
                        tL_inputPhoto2.file_reference = photo3.file_reference;
                        oc7.r1(this.b.U).x(-this.b.y5, tL_inputChatPhoto, null, null, null, 0.0d, null, null, null, null);
                        TLRPC.ChatPhoto chatPhoto = L03.photo;
                        chatPhoto.dc_id = photo3.dc_id;
                        chatPhoto.photo_small = u2.location;
                        chatPhoto.photo_big = u.location;
                        nm7.f(this.b.U).k(2, 2);
                    }
                    this.b.g7 = gn5.i(u, photo3);
                    PhotoViewer photoViewer43 = this.b;
                    photoViewer43.e7.remove(photoViewer43.O4);
                    this.b.e7.add(0, photo3);
                    PhotoViewer photoViewer44 = this.b;
                    gn5 gn5Var9 = (gn5) photoViewer44.Z6.get(photoViewer44.O4);
                    PhotoViewer photoViewer45 = this.b;
                    photoViewer45.Z6.remove(photoViewer45.O4);
                    this.b.Z6.add(0, gn5Var9);
                    PhotoViewer photoViewer46 = this.b;
                    gn5 gn5Var10 = (gn5) photoViewer46.a7.get(photoViewer46.O4);
                    PhotoViewer photoViewer47 = this.b;
                    photoViewer47.a7.remove(photoViewer47.O4);
                    this.b.a7.add(0, gn5Var10);
                    PhotoViewer photoViewer48 = this.b;
                    Long l = (Long) photoViewer48.b7.get(photoViewer48.O4);
                    PhotoViewer photoViewer49 = this.b;
                    photoViewer49.b7.remove(photoViewer49.O4);
                    this.b.b7.add(0, l);
                    PhotoViewer photoViewer50 = this.b;
                    TLRPC.Message message2 = (TLRPC.Message) photoViewer50.c7.get(photoViewer50.O4);
                    PhotoViewer photoViewer51 = this.b;
                    photoViewer51.c7.remove(photoViewer51.O4);
                    this.b.c7.add(0, message2);
                    xb7 T0 = oc7.r1(this.b.U).T0(this.b.y5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= T0.b.size()) {
                            break;
                        }
                        TLRPC.Photo photo4 = (TLRPC.Photo) T0.b.get(i10);
                        if (photo4 != null && photo4.id == photo3.id) {
                            T0.c(i10);
                            break;
                        }
                        i10++;
                    }
                    PhotoViewer photoViewer52 = this.b;
                    photoViewer52.O4 = -1;
                    photoViewer52.K1(0);
                    td5 td5Var = this.b.m1;
                    td5Var.d.clear();
                    td5Var.e.clear();
                    td5Var.c.clear();
                    this.b.m1.b();
                    PhotoViewer photoViewer53 = this.b;
                    photoViewer53.o1.m(photoViewer53.Z4 == photoViewer53.Y4 ? null : 1, 22, photoViewer53.y5);
                    gm.d3(new Runnable(this) { // from class: n98
                        public final /* synthetic */ r98 b;

                        {
                            this.b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            byte b52 = b;
                            r98 r98Var = this.b;
                            switch (b52) {
                                case 0:
                                    r7 r7Var = r98Var.b.p0;
                                    if (r7Var != null) {
                                        r7Var.u(14);
                                        break;
                                    }
                                    break;
                                case 1:
                                    PhotoViewer photoViewer362 = r98Var.b;
                                    photoViewer362.p0.u(19);
                                    photoViewer362.p0.S(20);
                                    break;
                                default:
                                    PhotoViewer photoViewer372 = r98Var.b;
                                    photoViewer372.p0.S(19);
                                    photoViewer372.p0.u(20);
                                    break;
                            }
                        }
                    }, 300L);
                    return;
                }
                PhotoViewer photoViewer54 = this.b;
                if (photoViewer54.E == null || photoViewer54.d == null) {
                    return;
                }
                k47 k47Var15 = photoViewer54.S4;
                if (k47Var15 != null && !k47Var15.r1) {
                    long A03 = k47Var15.A0();
                    if (pg3.y(A03)) {
                        z = sd2.T(oc7.r1(this.b.U).L0(Long.valueOf(-A03)));
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.b.E);
                        c0 = this.b.d.c0();
                        if (c0 == null) {
                            alertDialog$Builder3.k(jb6.M0(2131754059, "AreYouSureDeletePhotoTitle"));
                            alertDialog$Builder3.f(c0);
                        } else {
                            PhotoViewer photoViewer55 = this.b;
                            if (photoViewer55.s4 || (!((gn5Var2 = photoViewer55.Z4) == null || gn5Var2 == photoViewer55.Y4) || ((k47Var2 = photoViewer55.S4) != null && k47Var2.G4()))) {
                                alertDialog$Builder3.k(jb6.M0(2131754048, "AreYouSureDeleteVideoTitle"));
                                if (z) {
                                    alertDialog$Builder3.f(jb6.Y(2131754049, "AreYouSureDeleteVideoEveryone", new Object[0]));
                                } else {
                                    alertDialog$Builder3.f(jb6.Y(2131754050, "AreYouSureDeleteVideo", new Object[0]));
                                }
                            } else {
                                k47 k47Var16 = this.b.S4;
                                if (k47Var16 == null || !k47Var16.q3()) {
                                    alertDialog$Builder3.k(jb6.M0(2131754059, "AreYouSureDeletePhotoTitle"));
                                    if (z) {
                                        alertDialog$Builder3.f(jb6.Y(2131754060, "AreYouSureDeletePhotoEveryone", new Object[0]));
                                    } else {
                                        alertDialog$Builder3.f(jb6.Y(2131754061, "AreYouSureDeletePhoto", new Object[0]));
                                    }
                                } else {
                                    alertDialog$Builder3.k(jb6.M0(2131754062, "AreYouSureDeleteGIFTitle"));
                                    if (z) {
                                        alertDialog$Builder3.f(jb6.Y(2131754063, "AreYouSureDeleteGIFEveryone", new Object[0]));
                                    } else {
                                        alertDialog$Builder3.f(jb6.Y(2131754064, "AreYouSureDeleteGIF", new Object[0]));
                                    }
                                }
                            }
                        }
                        boolean[] zArr = new boolean[1];
                        k47Var3 = this.b.S4;
                        if (k47Var3 != null && !k47Var3.r1) {
                            A0 = k47Var3.A0();
                            if (!pg3.B(A0)) {
                                boolean D = pg3.D(A0);
                                int i11 = this.b.U;
                                if (D) {
                                    user = oc7.r1(i11).W1(Long.valueOf(A0));
                                    L0 = null;
                                } else {
                                    L0 = oc7.r1(i11).L0(Long.valueOf(-A0));
                                    user = null;
                                }
                                if (user != null || !sd2.T(L0)) {
                                    int currentTime = ConnectionsManager.getInstance(this.b.U).getCurrentTime();
                                    int i12 = this.b.U;
                                    int i13 = user != null ? oc7.r1(i12).U2 : oc7.r1(i12).T2;
                                    if ((user != null && user.id != z8c.h(this.b.U).e()) || L0 != null) {
                                        boolean z15 = user != null && oc7.r1(this.b.U).V2;
                                        k47 k47Var17 = this.b.S4;
                                        TLRPC.MessageAction messageAction = k47Var17.k.action;
                                        if ((messageAction == null || (messageAction instanceof TLRPC.TL_messageActionEmpty)) && ((k47Var17.N3() || z15 || sd2.N(L0)) && currentTime - this.b.S4.k.date <= i13)) {
                                            FrameLayout frameLayout = new FrameLayout(this.b.E);
                                            oh2 oh2Var = new oh2(1, this.a, this.b.E);
                                            oh2Var.setBackgroundDrawable(cmb.L0(false));
                                            if (L0 != null) {
                                                i2 = 2131752542;
                                                i3 = 0;
                                                eeVar = null;
                                                oh2Var.e(jb6.M0(2131751477, "DeleteForAll"), "", false, false, false);
                                                str2 = "Cancel";
                                            } else {
                                                i2 = 2131752542;
                                                eeVar = null;
                                                Object[] objArr2 = {m9c.j(user)};
                                                str2 = "Cancel";
                                                i3 = 0;
                                                oh2Var.e(jb6.Y(2131751476, "DeleteForUser", objArr2), "", false, false, false);
                                            }
                                            int i14 = i3;
                                            oh2Var.setPadding(jb6.a0 ? gm.L(16.0f) : gm.L(8.0f), i14, jb6.a0 ? gm.L(8.0f) : gm.L(16.0f), i14);
                                            frameLayout.addView(oh2Var, qoe.d(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                                            oh2Var.setOnClickListener(new gf(zArr, (byte) 12));
                                            alertDialog$Builder3.n(frameLayout);
                                            alertDialog$Builder3.a.H = (byte) 9;
                                            alertDialog$Builder3.j(jb6.M0(2131751535, "Delete"), new cz6(this, zArr, (byte) 21));
                                            alertDialog$Builder3.g(jb6.M0(i2, str2), eeVar);
                                            he heVar3 = alertDialog$Builder3.a;
                                            this.b.b2(alertDialog$Builder3);
                                            textView = (TextView) heVar3.c(-1);
                                            if (textView != null) {
                                                anb.X(textView, cmb.p7, this.b.w2);
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                        i2 = 2131752542;
                        str2 = "Cancel";
                        eeVar = null;
                        alertDialog$Builder3.j(jb6.M0(2131751535, "Delete"), new cz6(this, zArr, (byte) 21));
                        alertDialog$Builder3.g(jb6.M0(i2, str2), eeVar);
                        he heVar32 = alertDialog$Builder3.a;
                        this.b.b2(alertDialog$Builder3);
                        textView = (TextView) heVar32.c(-1);
                        if (textView != null) {
                        }
                    }
                }
                z = false;
                AlertDialog$Builder alertDialog$Builder32 = new AlertDialog$Builder(this.b.E);
                c0 = this.b.d.c0();
                if (c0 == null) {
                }
                boolean[] zArr2 = new boolean[1];
                k47Var3 = this.b.S4;
                if (k47Var3 != null) {
                    A0 = k47Var3.A0();
                    if (!pg3.B(A0)) {
                    }
                }
                i2 = 2131752542;
                str2 = "Cancel";
                eeVar = null;
                alertDialog$Builder32.j(jb6.M0(2131751535, "Delete"), new cz6(this, zArr2, (byte) 21));
                alertDialog$Builder32.g(jb6.M0(i2, str2), eeVar);
                he heVar322 = alertDialog$Builder32.a;
                this.b.b2(alertDialog$Builder32);
                textView = (TextView) heVar322.c(-1);
                if (textView != null) {
                }
            }
        }
    }
}
