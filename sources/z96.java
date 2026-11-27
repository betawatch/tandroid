// default package

import android.graphics.SurfaceTexture;
import android.os.SystemClock;
import java.util.TimeZone;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class z96 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z96(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f;
        int i;
        vpa vpaVar;
        byte b = this.a;
        Integer num = null;
        byte b2 = 2;
        Object obj = this.b;
        switch (b) {
            case 0:
                me8 me8Var = ((aa6) obj).e.a;
                if (me8Var != null) {
                    me8Var.e();
                    break;
                }
                break;
            case 1:
                ((SurfaceTexture) obj).release();
                break;
            case 2:
                if (!((ob6) ((ak) obj).b).p0().getTimeZone().equals(TimeZone.getDefault())) {
                    ob6.D0().Y0();
                    break;
                }
                break;
            case 3:
                try {
                    d79 currentListView = ((uc6) ((sc6) obj).j0).R0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        break;
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
            case 4:
                EditTextBoldCursor[] editTextBoldCursorArr = ((if6) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    hl.E3(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 5:
                lf6 lf6Var = (lf6) obj;
                e29 e29Var = lf6Var.e;
                EditTextBoldCursor editTextBoldCursor2 = lf6Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    lf6Var.E.M1(editTextBoldCursor2);
                    e29Var.getAnimatedDrawable().I(0, false, false);
                    e29Var.d();
                    break;
                }
                break;
            case 6:
                ((e29) obj).d();
                break;
            case 7:
                double currentTimeMillis = System.currentTimeMillis();
                sf6 sf6Var = (sf6) ((vw3) obj).b;
                double d = sf6Var.R;
                rg6 rg6Var = sf6Var.w;
                sf6Var.R = currentTimeMillis;
                int i2 = (int) (sf6Var.Q - (currentTimeMillis - d));
                sf6Var.Q = i2;
                if (i2 < 1000) {
                    sf6Var.q();
                    int i3 = sf6Var.F;
                    if (i3 == 3 || i3 == 4 || i3 == 2 || i3 == 11) {
                        rg6Var.setTextSize(1, 15.0f);
                        int i4 = sf6Var.F;
                        if (i4 == 4) {
                            rg6Var.setText(ob6.M0(2131745904, null));
                        } else if (i4 == 15) {
                            rg6Var.setText(ob6.M0(2131751412, null));
                        } else if (i4 == 11 || i4 == 3) {
                            rg6Var.setText(ob6.M0(2131745903, null));
                        } else {
                            rg6Var.setText(hl.E2(ob6.M0(2131745905, null), true, 0.0f, 0.0f));
                        }
                        int i5 = aob.P9;
                        yob.X(rg6Var, i5, null);
                        rg6Var.setTag(R.id.color_key_tag, Integer.valueOf(i5));
                        break;
                    }
                } else {
                    int i6 = i2 / 1000;
                    int i7 = i6 / 60;
                    int i8 = i6 - (i7 * 60);
                    rg6Var.setTextSize(1, 13.0f);
                    int i9 = sf6Var.F;
                    if (i9 != 4 && i9 != 3 && i9 != 11) {
                        if (i9 == 2) {
                            rg6Var.setText(ob6.a0(null, null, 2131745024, Integer.valueOf(i7), Integer.valueOf(i8)));
                            break;
                        }
                    } else {
                        rg6Var.setText(ob6.a0(null, null, 2131752610, Integer.valueOf(i7), Integer.valueOf(i8)));
                        break;
                    }
                }
                break;
            case 8:
                double currentTimeMillis2 = System.currentTimeMillis();
                tg6 tg6Var = ((sg6) obj).b;
                double d2 = currentTimeMillis2 - tg6Var.e0;
                tg6Var.e0 = currentTimeMillis2;
                int i10 = (int) (tg6Var.c0 - d2);
                tg6Var.c0 = i10;
                if (i10 <= 1000) {
                    tg6Var.setProblemTextVisible(true);
                    tg6Var.w.setVisibility(8);
                    rg6 rg6Var2 = tg6Var.y;
                    if (rg6Var2 != null) {
                        rg6Var2.setVisibility(0);
                    }
                    tg6Var.s();
                    break;
                }
                break;
            case 9:
                double currentTimeMillis3 = System.currentTimeMillis();
                tg6 tg6Var2 = ((sg6) obj).b;
                double d3 = tg6Var2.d0;
                rg6 rg6Var3 = tg6Var2.w;
                tg6Var2.d0 = currentTimeMillis3;
                int i11 = (int) (tg6Var2.b0 - (currentTimeMillis3 - d3));
                tg6Var2.b0 = i11;
                if (i11 < 1000) {
                    tg6Var2.t();
                    int i12 = tg6Var2.j0;
                    if (i12 == 3 || i12 == 4 || i12 == 2 || i12 == 17 || i12 == 16 || i12 == 11) {
                        if (i12 == 4) {
                            rg6Var3.setText(ob6.M0(2131745904, "RequestCallButton"));
                        } else if (i12 == 11 || i12 == 3) {
                            rg6Var3.setText(ob6.M0(2131745903, null));
                        } else {
                            rg6Var3.setText(ob6.M0(2131745902, "RequestSmsButton"));
                        }
                        int i13 = aob.P9;
                        yob.X(rg6Var3, i13, null);
                        rg6Var3.setTag(R.id.color_key_tag, Integer.valueOf(i13));
                        break;
                    }
                } else {
                    int i14 = i11 / 1000;
                    int i15 = i14 / 60;
                    int i16 = i14 - (i15 * 60);
                    int i17 = tg6Var2.j0;
                    if (i17 != 4 && i17 != 3 && i17 != 11) {
                        if (tg6Var2.i0 != 2 || (i17 != 2 && i17 != 17 && i17 != 16)) {
                            if (i17 == 2 || i17 == 17 || i17 == 16) {
                                rg6Var3.setText(ob6.a0("SmsAvailableIn", null, 2131745025, Integer.valueOf(i15), Integer.valueOf(i16)));
                                break;
                            }
                        } else {
                            rg6Var3.setText(ob6.a0("ResendSmsAvailableIn", null, 2131745846, Integer.valueOf(i15), Integer.valueOf(i16)));
                            break;
                        }
                    } else {
                        rg6Var3.setText(ob6.a0("CallAvailableIn", null, 2131752611, Integer.valueOf(i15), Integer.valueOf(i16)));
                        break;
                    }
                }
            case 10:
                ((g65) obj).run();
                break;
            case 11:
                ((hj6) obj).q();
                break;
            case 12:
                jk6 jk6Var = (jk6) obj;
                jk6Var.k = false;
                jk6Var.c();
                break;
            case 13:
                hl6 hl6Var = (hl6) obj;
                if (hl6Var.d) {
                    hl6Var.e = true;
                    hl6Var.r = false;
                    hl6Var.f = 0.0f;
                    hl6Var.h = SystemClock.uptimeMillis();
                    hl6Var.invalidate();
                    break;
                }
                break;
            case 14:
                pd1 pd1Var = (pd1) obj;
                if (!PhotoViewer.q0().V0()) {
                    MediaController.Z1 = null;
                    MediaController.R(0);
                    break;
                } else {
                    z96 z96Var = new z96(pd1Var, (byte) 14);
                    MediaController.Z1 = z96Var;
                    hl.d3(z96Var, 2000L);
                    break;
                }
            case 15:
                ((lo6) obj).d();
                break;
            case 16:
                so6 so6Var = (so6) obj;
                try {
                    zz3 zz3Var = new zz3();
                    zz3Var.b = so6Var;
                    Thread thread = new Thread(zz3Var, "VideoConvertRunnable");
                    thread.start();
                    thread.join();
                    break;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 17:
                ((t21) obj).f();
                break;
            case 18:
                c97 c97Var = (c97) obj;
                if (c97Var != null) {
                    c97Var.a(null);
                    break;
                }
                break;
            case 19:
                jn7.e().k(jn7.S4, 0, (TLRPC.Document) obj, 7);
                break;
            case 20:
                ((gu6) obj).n = -1;
                break;
            case 21:
                d17 d17Var = (d17) obj;
                d17Var.f();
                d17Var.e(true);
                break;
            case 22:
                final b27 b27Var = (b27) obj;
                boolean z = b27Var.J;
                boolean z2 = !z;
                uu7 uu7Var = b27Var.e;
                a27 a27Var = b27Var.b;
                if (a27Var != null && uu7Var != null) {
                    if (b27Var.M && (vpaVar = b27Var.L) != null && vpaVar.f && !z) {
                        b27Var.P = 0;
                        break;
                    } else {
                        boolean g = b27Var.g();
                        if (z) {
                            int computeVerticalScrollRange = a27Var.computeVerticalScrollRange();
                            f = (computeVerticalScrollRange - uu7Var.h) + b27Var.s;
                            if (computeVerticalScrollRange <= 0 && b27Var.f.K() > 0 && (i = b27Var.P) < 3) {
                                b27Var.P = i + 1;
                                b27Var.o(true);
                                break;
                            }
                        } else {
                            f = (-b27Var.s) - hl.L(6.0f);
                        }
                        b27Var.P = 0;
                        float f2 = b27Var.w;
                        float max = g ? -Math.max(0.0f, f2 - f) : Math.max(0.0f, f2 - f) + (-f2);
                        if (!z && !g) {
                            max += a27Var.computeVerticalScrollOffset();
                        }
                        final float f3 = max;
                        vpa vpaVar2 = b27Var.L;
                        if (vpaVar2 != null) {
                            vpaVar2.d();
                        }
                        b27Var.M = z2;
                        final float translationY = a27Var.getTranslationY();
                        final float f4 = b27Var.N;
                        float f5 = z ? 0.0f : 1.0f;
                        if (translationY == f3) {
                            b27Var.L = null;
                            num = Integer.valueOf(z ? 0 : 8);
                            if (b27Var.O && !z) {
                                b27Var.O = false;
                                a27Var.setLayoutManager(b27Var.getNeededLayoutManager());
                                b27Var.J = true;
                                b27Var.o(true);
                            }
                        } else {
                            vpa vpaVar3 = new vpa(new xk4(translationY));
                            wpa wpaVar = new wpa(f3);
                            wpaVar.a(1.0f);
                            wpaVar.b(550.0f);
                            vpaVar3.m = wpaVar;
                            b27Var.L = vpaVar3;
                            final float f6 = f5;
                            vpaVar3.b(new qs3() { // from class: s17
                                @Override // qs3
                                public final void a(vpa vpaVar4, float f7, float f8) {
                                    b27 b27Var2 = b27.this;
                                    b27Var2.b.setTranslationY(f7);
                                    b27Var2.i();
                                    float f9 = translationY;
                                    b27Var2.N = hl.R1(f4, f6, (f7 - f9) / (f3 - f9));
                                }
                            });
                            if (!z) {
                                b27Var.L.a(new fy5(b27Var, z2, b2));
                            }
                            b27Var.L.a(new t17());
                            b27Var.L.h();
                        }
                        if (num != null && b27Var.getVisibility() != num.intValue()) {
                            b27Var.setVisibility(num.intValue());
                            break;
                        }
                    }
                } else {
                    b27Var.P = 0;
                    break;
                }
                break;
            case 23:
                ((m12) obj).setVisibility(8);
                break;
            case 24:
                vw7 vw7Var = (vw7) obj;
                vw7Var.z0 = true;
                vw7Var.s();
                break;
            case 25:
                ((m57) ((z37) obj).T).n.f();
                break;
            case 26:
                ((u57) obj).a();
                break;
            case 27:
                hl.E3(((a77) obj).p1);
                break;
            case 28:
                ((gn1) obj).run();
                break;
            default:
                p5b p5bVar = ((yc7) obj).E;
                if (p5bVar != null) {
                    p5bVar.p(3, true);
                    break;
                }
                break;
        }
    }
}
