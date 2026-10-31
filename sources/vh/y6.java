package vh;

import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class y6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o8 b;

    public /* synthetic */ y6(o8 o8Var, int i10) {
        this.a = i10;
        this.b = o8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:229:0x035d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        ArrayList arrayList;
        d8 d8Var;
        n8 n8Var;
        int i12 = this.a;
        int i13 = 2;
        int i14 = 1;
        o8 o8Var = this.b;
        switch (i12) {
            case 0:
                o8Var.q();
                break;
            case 1:
                if (o8Var.t2 >= 0) {
                    vp.d1().edit().putFloat("frontflash_warmth", o8Var.s.o).putFloat("frontflash_intensity", o8Var.s.p).apply();
                }
                o8Var.s.e(0.0f, 240L, null);
                o8Var.E0.setSelected(false);
                break;
            case 2:
                o8Var.l();
                o8Var.W1 = false;
                int i15 = o8Var.c;
                if (o8Var.K1 == null) {
                    o8Var.p(true);
                    break;
                } else {
                    o8Var.x();
                    z6 z6Var = new z6(o8Var, i13);
                    if (o8Var.H1 == null) {
                        n5 n5Var = o8Var.K1;
                        if (n5Var.K && !n5Var.v() && !n5Var.g) {
                            long j10 = n5Var.h0;
                            if (j10 > 0 && !n5Var.n) {
                                long j11 = (long) ((n5Var.a0 - n5Var.Z) * j10);
                                if (j11 < 68999) {
                                    i10 = i15;
                                    arrayList = null;
                                    i11 = 0;
                                } else {
                                    arrayList = new ArrayList();
                                    n5Var.a0 = (59000.0f / n5Var.h0) + n5Var.Z;
                                    arrayList.add(n5Var);
                                    long j12 = 59000;
                                    long j13 = 59000;
                                    while (true) {
                                        i11 = r9;
                                        if (j13 < j11) {
                                            if (Math.min(j12, j11 - j13) >= 1000) {
                                                long j14 = j12;
                                                n5 g10 = n5Var.g();
                                                float f7 = n5Var.Z;
                                                float f10 = n5Var.h0;
                                                g10.Z = (j13 / f10) + f7;
                                                g10.a0 = ((r9 + j13) / f10) + n5Var.Z;
                                                g10.C0 = "";
                                                j13 += j14;
                                                arrayList.add(g10);
                                                r9 = i11;
                                                j12 = j14;
                                                i15 = i15;
                                            }
                                        }
                                    }
                                    i10 = i15;
                                }
                                o8Var.H1 = arrayList;
                                if (arrayList != null) {
                                    o8Var.I1 = new ArrayList();
                                    o8Var.J1 = new ArrayList();
                                    for (int i16 = i11; i16 < o8Var.H1.size(); i16 = c3.i0.j(i16, i16, 1, o8Var.J1)) {
                                        o8Var.I1.add(Integer.valueOf(i16));
                                    }
                                }
                            }
                        }
                        i10 = i15;
                        i11 = 0;
                        arrayList = null;
                        o8Var.H1 = arrayList;
                        if (arrayList != null) {
                        }
                    } else {
                        i10 = i15;
                        i11 = 0;
                    }
                    if (o8Var.H1 != null) {
                        ArrayList arrayList2 = o8Var.J1;
                        int size = arrayList2.size();
                        int i17 = i11;
                        while (i17 < size) {
                            Object obj = arrayList2.get(i17);
                            i17++;
                            Integer num = (Integer) obj;
                            if (o8Var.I1.contains(num)) {
                                n5 n5Var2 = (n5) o8Var.H1.get(num.intValue());
                                n5 n5Var3 = o8Var.K1;
                                if (n5Var3 == n5Var2) {
                                    CharSequence[] charSequenceArr = new CharSequence[1];
                                    charSequenceArr[i11] = o8Var.c1.getText();
                                    ArrayList W = vp.r1(i10).U4() ? ui.b0(i10).W(charSequenceArr, true, true) : new ArrayList();
                                    CharSequence[] charSequenceArr2 = new CharSequence[1];
                                    charSequenceArr2[i11] = o8Var.K1.C0;
                                    ArrayList W2 = vp.r1(i10).U4() ? ui.b0(i10).W(charSequenceArr2, true, true) : new ArrayList();
                                    n5 n5Var4 = o8Var.K1;
                                    n5Var4.k = (TextUtils.equals(n5Var4.C0, charSequenceArr[i11]) && ui.K(W, W2)) ? i11 : 1;
                                    o8Var.K1.C0 = new SpannableString(o8Var.c1.getText());
                                } else if (n5Var2.C0 == null) {
                                    n5Var3.k = i11;
                                    n5Var3.C0 = new SpannableString("");
                                }
                                z6Var.a(n5Var2);
                                i11 = 0;
                            }
                        }
                    } else {
                        CharSequence[] charSequenceArr3 = {o8Var.c1.getText()};
                        ArrayList W3 = vp.r1(i10).U4() ? ui.b0(i10).W(charSequenceArr3, true, true) : new ArrayList();
                        ArrayList W4 = vp.r1(i10).U4() ? ui.b0(i10).W(new CharSequence[]{o8Var.K1.C0}, true, true) : new ArrayList();
                        n5 n5Var5 = o8Var.K1;
                        n5Var5.k = (TextUtils.equals(n5Var5.C0, charSequenceArr3[0]) && ui.K(W3, W4)) ? false : true;
                        o8Var.K1.C0 = new SpannableString(o8Var.c1.getText());
                        z6Var.a(o8Var.K1);
                    }
                    long j15 = d20.i(i10).n;
                    TLRPC.InputPeer inputPeer = o8Var.K1.v0;
                    if (inputPeer != null && !(inputPeer instanceof TLRPC.TL_inputPeerSelf)) {
                        j15 = org.telegram.messenger.o5.n(inputPeer);
                    }
                    o8Var.K1 = null;
                    o8Var.w = true;
                    o8Var.x = j15;
                    o8Var.B2 = true;
                    o8Var.n();
                    bi.e eVar = new bi.e(o8Var, j15, 29);
                    f8 f8Var = o8Var.y;
                    if (f8Var != null) {
                        f8Var.d(j15, eVar);
                    } else {
                        eVar.run();
                    }
                    vp.d1().edit().putInt("storyhint2", 2).apply();
                    break;
                }
                break;
            case 3:
                o8Var.Y(false);
                break;
            case 4:
                n5 n5Var6 = o8Var.K1;
                if (n5Var6 != null) {
                    n5Var6.y0 = !n5Var6.y0;
                    d8 d8Var2 = o8Var.X0;
                    if (d8Var2 != null) {
                        d8Var2.u(n5Var6);
                    }
                    s7 s7Var = o8Var.v1;
                    if (s7Var != null && s7Var.A0 != null) {
                        while (r9 < o8Var.v1.A0.getChildCount()) {
                            View childAt = o8Var.v1.A0.getChildAt(r9);
                            if (childAt instanceof jg.j1) {
                                ((jg.j1) childAt).setupTheme(o8Var.K1);
                            }
                            r9++;
                        }
                    }
                    o8Var.n0(true);
                    break;
                }
                break;
            case 5:
                o8Var.p(true);
                break;
            case 6:
                o8Var.d = true;
                o8Var.w = false;
                if (o8Var.J == 1) {
                    o8Var.h0.setAlpha(1.0f);
                    o8Var.h0.setTranslationX(0.0f);
                    o8Var.h0.setTranslationY(0.0f);
                    o8Var.i0.setAlpha(1.0f);
                    o8Var.k0.setAlpha(1.0f);
                    o8Var.n.setBackgroundColor(-16777216);
                    if (o8Var.f0 == 2) {
                        o8Var.u1.setAlpha(1.0f);
                    }
                }
                y6 y6Var = o8Var.x2;
                if (y6Var != null) {
                    y6Var.run();
                    o8Var.x2 = null;
                } else {
                    o8Var.O();
                }
                n5 n5Var7 = o8Var.K1;
                if (n5Var7 != null && n5Var7.n) {
                    o8Var.t();
                    o8Var.G();
                    o8Var.r();
                    break;
                } else if (n5Var7 != null && n5Var7.u) {
                    if (n5Var7.K) {
                        o8Var.X0.t(n5Var7, null, 0L);
                    }
                    o8Var.r();
                    break;
                }
                break;
            case 7:
                o8Var.f(1.0f, true, new y6(o8Var, 6));
                break;
            case 8:
                o8Var.A0.setCameraThumb(o8Var.z());
                t7 t7Var = o8Var.B0;
                if (t7Var != null) {
                    t7Var.destroy(true, null);
                    org.telegram.messenger.i0.E2(o8Var.B0);
                    c8 c8Var = o8Var.A0;
                    if (c8Var != null) {
                        c8Var.setCameraView(null);
                    }
                    o8Var.B0 = null;
                    break;
                }
                break;
            case 9:
                o8Var.A0.setCameraThumb(o8Var.z());
                break;
            case 10:
                if (o8Var.f0 == 1) {
                    o8Var.k0(2, false, true);
                    break;
                }
                break;
            case 11:
                k7 k7Var = o8Var.d1;
                if (k7Var != null) {
                    int i18 = -(org.telegram.messenger.i0.L(24.0f) + o8Var.c1.getEditTextHeight());
                    k7Var.setTranslationY(i18 - (o8Var.Z0 != null ? r3.getContentHeight() - org.telegram.messenger.i0.L(5.0f) : 0));
                    break;
                }
                break;
            case 12:
                c8 c8Var2 = o8Var.A0;
                if (c8Var2 != null) {
                    c8Var2.c.a(o8Var.D0.D ? o8Var.C0.d : null);
                    break;
                }
                break;
            case 13:
                o8Var.l0(true);
                break;
            case 14:
                o8Var.r();
                break;
            case 15:
                e8 e8Var = o8Var.c1;
                if (e8Var != null) {
                    e8Var.m();
                    break;
                }
                break;
            case 16:
                if (o8Var.g0 == -1 && o8Var.f0 == 1) {
                    e8 e8Var2 = o8Var.c1;
                    if (!e8Var2.o0 && !e8Var2.N1) {
                        z8 z8Var = o8Var.Z0;
                        if (!z8Var.P) {
                            k7 k7Var2 = o8Var.d1;
                            if (k7Var2.M) {
                                k7Var2.c(false, true);
                                break;
                            } else {
                                o8Var.k0(0, false, true);
                                s7 s7Var2 = o8Var.v1;
                                if (s7Var2 != null) {
                                    s7Var2.O0(2);
                                    s7Var2.U1 = true;
                                    s7Var2.l0(true);
                                    o8Var.v1.v0 = true;
                                    break;
                                }
                            }
                        } else {
                            z8Var.P = false;
                            if (z8Var.E && z8Var.h == null) {
                                z8Var.G = true;
                                t8 t8Var = z8Var.a;
                                if (t8Var != null) {
                                    t8Var.A(true);
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 17:
                o8Var.N1 = true;
                o8Var.b1.setShareEnabled(false);
                n0 n0Var = o8Var.e1;
                n0Var.getClass();
                n0Var.c(cd.M0("VideoConvertFail"));
                break;
            case 18:
                o8Var.A0.setCameraThumb(o8Var.z());
                break;
            case 19:
                n8 n8Var2 = o8Var.n;
                th.b bVar = o8Var.a;
                new cc(n8Var2, bVar).Q(R.raw.voip_invite, 36, org.telegram.messenger.i0.R2(cd.L0(2131744600, null), org.telegram.ui.ActionBar.t6.Uc, 0, new y6(o8Var, 27), bVar)).k(true);
                break;
            case 20:
                w6 w6Var = o8Var.q0;
                if (w6Var != null) {
                    w6Var.dismiss();
                }
                o8Var.J(2, true);
                break;
            case 21:
                o8Var.k0(-1, false, true);
                break;
            case 22:
                o8Var.k0(-1, false, true);
                break;
            case 23:
                o8Var.d = false;
                org.telegram.messenger.i0.P3(o8Var.b);
                if (o8Var.B0 != null) {
                    if (o8Var.Q1) {
                        CameraController.getInstance().stopVideoRecording(o8Var.B0.getCameraSession(), false);
                    }
                    o8Var.u(false);
                }
                d8 d8Var3 = o8Var.X0;
                if (d8Var3 != null) {
                    d8Var3.set(null);
                }
                o8Var.y();
                o8Var.x();
                File file = o8Var.G1;
                if (file != null && !o8Var.w) {
                    try {
                        file.delete();
                    } catch (Exception unused) {
                    }
                }
                o8Var.G1 = null;
                org.telegram.messenger.i0.h3(new y6(o8Var, 28), 16L);
                j8 j8Var = o8Var.F;
                if (j8Var != null) {
                    j8Var.f(false);
                }
                if (o8Var.x2 != null) {
                    o8Var.x2 = null;
                }
                o8Var.l2 = null;
                o8 o8Var2 = o8.F2;
                if (o8Var2 != null) {
                    o8Var2.p(false);
                }
                o8.F2 = null;
                n8 n8Var3 = o8Var.n;
                if (n8Var3 != null) {
                    n8Var3.setTag(R.id.bulletin_delegate_tag, null);
                }
                org.telegram.ui.Components.voip.i0 i0Var = o8Var.l0;
                if (i0Var != null) {
                    i0Var.setTag(R.id.bulletin_delegate_tag, null);
                }
                c8 c8Var3 = o8Var.A0;
                if (c8Var3 != null) {
                    c8Var3.e();
                    break;
                }
                break;
            case 24:
                if (!o8Var.K1.b0 && o8Var.q0 != null && (d8Var = o8Var.X0) != null) {
                    d8Var.h(new z6(o8Var, i14), d8Var, o8Var.w1, o8Var.z1);
                }
                o8Var.J(1, true);
                break;
            case 25:
                o8Var.i0(false);
                o8Var.e2 = null;
                break;
            case 26:
                o8Var.i0(false);
                o8Var.e2 = null;
                break;
            case 27:
                o8Var.S();
                break;
            default:
                WindowManager windowManager = o8Var.f;
                if (windowManager != null && (n8Var = o8Var.n) != null && n8Var.getParent() != null) {
                    windowManager.removeView(o8Var.n);
                    break;
                }
                break;
        }
    }
}
