package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yy(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        q60 q60Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((fz) obj).a.getBackground().setState(new int[0]);
                break;
            case 1:
                y00 y00Var = (y00) obj;
                org.telegram.messenger.i0.r(y00Var.n0);
                y00Var.a.a(false, true);
                break;
            case 2:
                y00 y00Var2 = ((n00) obj).a;
                y00Var2.h(y00Var2.E, y00Var2.F, y00Var2.H, y00Var2.G, y00Var2.D, y00Var2.J, y00Var2.x, false);
                break;
            case 3:
                ((FiltersSetupActivity) ((ag.b1) obj).f3).getMessagesController().g3();
                break;
            case 4:
                a10 a10Var = (a10) obj;
                a10Var.s.a();
                a10Var.n.invalidate();
                a10Var.H.g0(true);
                break;
            case 5:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.sz) obj).f;
                if (!org.telegram.messenger.e20.i(org.telegram.messenger.e20.s0).q()) {
                    ArrayList S0 = filtersSetupActivity.getMessagesController().S0();
                    int i13 = 0;
                    while (true) {
                        if (i13 < S0.size()) {
                            if (!((org.telegram.messenger.bp) S0.get(i13)).e() || i13 == 0) {
                                i13++;
                            } else {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().P0;
                                if (i13 < 0 || i13 >= arrayList.size()) {
                                    i10 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.bp) arrayList.remove(i13));
                                    for (int i14 = 0; i14 <= i13; i14++) {
                                        ((org.telegram.messenger.bp) arrayList.get(i14)).f = i14;
                                    }
                                    i10 = 1;
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.g0(true);
                                }
                                filtersSetupActivity.a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i10];
                                objArr[0] = org.telegram.messenger.dd.L0(2131750808, null);
                                a02.J(R.raw.filter_reorder, org.telegram.messenger.i0.W2(org.telegram.messenger.dd.a0("LimitReachedReorderFolder", null, 2131748954, objArr)), org.telegram.messenger.dd.L0(2131747048, null), 5000, false, new z00(filtersSetupActivity, i12)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.f0(null);
                break;
            case 6:
                a50 a50Var = ((n20) obj).b;
                a50Var.a4 = null;
                a50Var.M1(a50Var.w3, true);
                break;
            case 7:
                i40 i40Var = (i40) obj;
                a50 a50Var2 = i40Var.f;
                z20 z20Var = a50Var2.i1;
                org.telegram.messenger.jc jcVar = i40Var.d;
                if (jcVar != null) {
                    z20Var.K0 = jcVar;
                    z20Var.q1 = null;
                    z20Var.r1 = null;
                    i40Var.d = null;
                }
                TLRPC.Chat L0 = org.telegram.messenger.wp.r1(a50Var2.k1.a).L0(Long.valueOf(-i40Var.e));
                org.telegram.messenger.jc a2 = org.telegram.messenger.jc.a(0, L0);
                org.telegram.messenger.jc a10 = org.telegram.messenger.jc.a(1, L0);
                if (org.telegram.messenger.jc.e(i40Var.b) == null) {
                    a10 = org.telegram.messenger.jc.e(i40Var.c);
                }
                z20Var.setCreateThumbFromParent(false);
                z20Var.H(null, a2, a10, true);
                i40Var.c = null;
                i40Var.b = null;
                org.telegram.messenger.i0.a4(a50Var2.H1);
                i40Var.a(1.0f);
                break;
            case 8:
                bi.t0 t0Var = (bi.t0) ((g.b) obj).i;
                if (t0Var != null) {
                    t0Var.invalidate();
                    break;
                }
                break;
            case 9:
                b60 b60Var = (b60) obj;
                b60Var.D = null;
                b60Var.E = null;
                b60Var.F = null;
                b60Var.G = null;
                b60Var.I = null;
                b60Var.H = null;
                b60Var.J = 0.0d;
                b60Var.e0(false, true);
                b60Var.d.j(null, null, b60Var.r, null);
                b60Var.f.setAnimation(b60Var.R);
                b60Var.R.M(0);
                break;
            case 10:
                org.telegram.messenger.m5.n(null, 2131749387, org.telegram.ui.Components.cc.a0(((e60) obj).c), R.raw.done, 36);
                break;
            case 11:
                r60 r60Var = (r60) obj;
                q60 q60Var2 = r60Var.I;
                int i15 = org.telegram.ui.ActionBar.t6.d6;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i15, false);
                int i16 = q60.D;
                q60Var2.a(R.drawable.intro_powerful_mask, 17, x02, true);
                r60Var.I.c();
                q60 q60Var3 = r60Var.I;
                q60Var3.b(q60Var3.w, 23, true);
                r60Var.I.d();
                Intro.a(org.telegram.ui.ActionBar.t6.x0(null, i15, false));
                break;
            case 12:
                p60 p60Var = (p60) obj;
                p60Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                r60 r60Var2 = (r60) p60Var.b;
                Intro.setPage(r60Var2.H);
                Intro.setDate((currentTimeMillis - r60Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                q60 q60Var4 = r60Var2.I;
                if (q60Var4 != null && q60Var4.isAlive() && (eGLDisplay = (q60Var = r60Var2.I).c) != null && (eGLSurface = q60Var.f) != null) {
                    try {
                        q60Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                r60 r60Var3 = (r60) ((org.telegram.messenger.zs) obj).c;
                r60Var3.presentFragment(new gf0(), true);
                r60Var3.M = true;
                break;
            case 14:
                ((q60) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                w60 w60Var = (w60) obj;
                w60Var.f.e.smoothScrollTo(0, w60Var.getHeight());
                break;
            case 16:
                ((gf.e) obj).b();
                break;
            case 17:
                m90 m90Var = (m90) obj;
                LaunchActivity launchActivity = m90Var.c;
                launchActivity.P0 = false;
                boolean z10 = launchActivity.O0;
                launchActivity.E();
                if (z10 != launchActivity.O0) {
                    m90Var.requestLayout();
                    break;
                }
                break;
            case 18:
                ((n90) obj).a.C0.setVisibility(8);
                break;
            case 19:
                ra0 ra0Var = (ra0) obj;
                qh.x0 x0Var = ra0Var.d;
                if (x0Var != null) {
                    ra0Var.i0(x0Var.getCurrentLink());
                    break;
                }
                break;
            case 20:
                try {
                    org.telegram.ui.Components.uk0 currentListView = ((xb0) ((vb0) obj).i0).S0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ad0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.i0.J3(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 22:
                dd0 dd0Var = (dd0) obj;
                org.telegram.ui.Components.fi0 fi0Var = dd0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = dd0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    gf0.a1(dd0Var.D, editTextBoldCursor2);
                    fi0Var.getAnimatedDrawable().N(0, false, false);
                    fi0Var.d();
                    break;
                }
                break;
            case 23:
                ((org.telegram.ui.Components.fi0) obj).d();
                break;
            case 24:
                ((kd0) ((org.telegram.ui.ActionBar.n0) obj).H1).getClass();
                break;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                kd0 kd0Var = (kd0) ((e6.r) obj).b;
                double d = kd0Var.Q;
                je0 je0Var = kd0Var.w;
                kd0Var.Q = currentTimeMillis2;
                int i17 = (int) (kd0Var.P - (currentTimeMillis2 - d));
                kd0Var.P = i17;
                if (i17 >= 1000) {
                    int i18 = i17 / 1000;
                    int i19 = i18 / 60;
                    int i20 = i18 - (i19 * 60);
                    je0Var.setTextSize(1, 13.0f);
                    int i21 = kd0Var.E;
                    if (i21 != 4 && i21 != 3 && i21 != 11) {
                        if (i21 == 2) {
                            je0Var.setText(org.telegram.messenger.dd.a0(null, null, 2131745314, Integer.valueOf(i19), Integer.valueOf(i20)));
                            break;
                        }
                    } else {
                        je0Var.setText(org.telegram.messenger.dd.a0(null, null, 2131752629, Integer.valueOf(i19), Integer.valueOf(i20)));
                        break;
                    }
                } else {
                    kd0Var.q();
                    int i22 = kd0Var.E;
                    if (i22 == 3 || i22 == 4 || i22 == 2 || i22 == 11) {
                        je0Var.setTextSize(1, 15.0f);
                        int i23 = kd0Var.E;
                        if (i23 == 4) {
                            je0Var.setText(org.telegram.messenger.dd.L0(2131746194, null));
                        } else if (i23 == 15) {
                            je0Var.setText(org.telegram.messenger.dd.L0(2131751448, null));
                        } else if (i23 == 11 || i23 == 3) {
                            je0Var.setText(org.telegram.messenger.dd.L0(2131746193, null));
                        } else {
                            je0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.dd.L0(2131746195, null), true, 0.0f, 0.0f));
                        }
                        int i24 = org.telegram.ui.ActionBar.t6.P9;
                        org.telegram.ui.ActionBar.a7.V(je0Var, i24, null);
                        je0Var.setTag(R.id.color_key_tag, Integer.valueOf(i24));
                        break;
                    }
                }
                break;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                le0 le0Var = ((ke0) obj).b;
                double d10 = currentTimeMillis3 - le0Var.d0;
                le0Var.d0 = currentTimeMillis3;
                int i25 = (int) (le0Var.b0 - d10);
                le0Var.b0 = i25;
                if (i25 <= 1000) {
                    le0Var.setProblemTextVisible(true);
                    le0Var.w.setVisibility(8);
                    je0 je0Var2 = le0Var.y;
                    if (je0Var2 != null) {
                        je0Var2.setVisibility(0);
                    }
                    le0Var.t();
                    break;
                }
                break;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                le0 le0Var2 = ((ke0) obj).b;
                double d11 = le0Var2.c0;
                je0 je0Var3 = le0Var2.w;
                le0Var2.c0 = currentTimeMillis4;
                int i26 = (int) (le0Var2.a0 - (currentTimeMillis4 - d11));
                le0Var2.a0 = i26;
                if (i26 >= 1000) {
                    int i27 = i26 / 1000;
                    int i28 = i27 / 60;
                    int i29 = i27 - (i28 * 60);
                    int i30 = le0Var2.i0;
                    if (i30 != 4 && i30 != 3 && i30 != 11) {
                        if (le0Var2.h0 != 2 || (i30 != 2 && i30 != 17 && i30 != 16)) {
                            if (i30 == 2 || i30 == 17 || i30 == 16) {
                                je0Var3.setText(org.telegram.messenger.dd.a0("SmsAvailableIn", null, 2131745315, Integer.valueOf(i28), Integer.valueOf(i29)));
                                break;
                            }
                        } else {
                            je0Var3.setText(org.telegram.messenger.dd.a0("ResendSmsAvailableIn", null, 2131746136, Integer.valueOf(i28), Integer.valueOf(i29)));
                            break;
                        }
                    } else {
                        je0Var3.setText(org.telegram.messenger.dd.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i28), Integer.valueOf(i29)));
                        break;
                    }
                } else {
                    le0Var2.u();
                    int i31 = le0Var2.i0;
                    if (i31 == 3 || i31 == 4 || i31 == 2 || i31 == 17 || i31 == 16 || i31 == 11) {
                        if (i31 == 4) {
                            je0Var3.setText(org.telegram.messenger.dd.L0(2131746194, "RequestCallButton"));
                        } else if (i31 == 11 || i31 == 3) {
                            je0Var3.setText(org.telegram.messenger.dd.L0(2131746193, null));
                        } else {
                            je0Var3.setText(org.telegram.messenger.dd.L0(2131746192, "RequestSmsButton"));
                        }
                        int i32 = org.telegram.ui.ActionBar.t6.P9;
                        org.telegram.ui.ActionBar.a7.V(je0Var3, i32, null);
                        je0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i32));
                        break;
                    }
                }
            case 28:
                ((v50) obj).run();
                break;
            default:
                ((qf0) obj).setSkipDrawSelector(false);
                break;
        }
    }
}
