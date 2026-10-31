package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class zy implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zy(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        r60 r60Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((gz) obj).a.getBackground().setState(new int[0]);
                break;
            case 1:
                z00 z00Var = (z00) obj;
                org.telegram.messenger.i0.r(z00Var.n0);
                z00Var.a.a(false, true);
                break;
            case 2:
                z00 z00Var2 = ((o00) obj).a;
                z00Var2.h(z00Var2.E, z00Var2.F, z00Var2.H, z00Var2.G, z00Var2.D, z00Var2.J, z00Var2.x, false);
                break;
            case 3:
                ((FiltersSetupActivity) ((ag.b1) obj).f3).getMessagesController().g3();
                break;
            case 4:
                b10 b10Var = (b10) obj;
                b10Var.s.a();
                b10Var.n.invalidate();
                b10Var.H.f0(true);
                break;
            case 5:
                FiltersSetupActivity filtersSetupActivity = (FiltersSetupActivity) ((org.telegram.ui.Components.sz) obj).f;
                if (!org.telegram.messenger.d20.i(org.telegram.messenger.d20.s0).q()) {
                    ArrayList S0 = filtersSetupActivity.getMessagesController().S0();
                    int i13 = 0;
                    while (true) {
                        if (i13 < S0.size()) {
                            if (!((org.telegram.messenger.ap) S0.get(i13)).e() || i13 == 0) {
                                i13++;
                            } else {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList arrayList = filtersSetupActivity2.getMessagesController().P0;
                                if (i13 < 0 || i13 >= arrayList.size()) {
                                    i10 = 1;
                                } else {
                                    arrayList.add(0, (org.telegram.messenger.ap) arrayList.remove(i13));
                                    for (int i14 = 0; i14 <= i13; i14++) {
                                        ((org.telegram.messenger.ap) arrayList.get(i14)).f = i14;
                                    }
                                    i10 = 1;
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.f0(true);
                                }
                                filtersSetupActivity.a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(filtersSetupActivity);
                                Object[] objArr = new Object[i10];
                                objArr[0] = org.telegram.messenger.cd.L0(2131750808, null);
                                a02.J(R.raw.filter_reorder, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("LimitReachedReorderFolder", null, 2131748954, objArr)), org.telegram.messenger.cd.L0(2131747048, null), 5000, false, new a10(filtersSetupActivity, i12)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.e0(null);
                break;
            case 6:
                b50 b50Var = ((o20) obj).b;
                b50Var.a4 = null;
                b50Var.M1(b50Var.w3, true);
                break;
            case 7:
                j40 j40Var = (j40) obj;
                b50 b50Var2 = j40Var.f;
                a30 a30Var = b50Var2.i1;
                org.telegram.messenger.ic icVar = j40Var.d;
                if (icVar != null) {
                    a30Var.K0 = icVar;
                    a30Var.q1 = null;
                    a30Var.r1 = null;
                    j40Var.d = null;
                }
                TLRPC.Chat L0 = org.telegram.messenger.vp.r1(b50Var2.k1.a).L0(Long.valueOf(-j40Var.e));
                org.telegram.messenger.ic a2 = org.telegram.messenger.ic.a(0, L0);
                org.telegram.messenger.ic a10 = org.telegram.messenger.ic.a(1, L0);
                if (org.telegram.messenger.ic.e(j40Var.b) == null) {
                    a10 = org.telegram.messenger.ic.e(j40Var.c);
                }
                a30Var.setCreateThumbFromParent(false);
                a30Var.H(null, a2, a10, true);
                j40Var.c = null;
                j40Var.b = null;
                org.telegram.messenger.i0.a4(b50Var2.H1);
                j40Var.a(1.0f);
                break;
            case 8:
                bi.t0 t0Var = (bi.t0) ((g.b) obj).i;
                if (t0Var != null) {
                    t0Var.invalidate();
                    break;
                }
                break;
            case 9:
                c60 c60Var = (c60) obj;
                c60Var.D = null;
                c60Var.E = null;
                c60Var.F = null;
                c60Var.G = null;
                c60Var.I = null;
                c60Var.H = null;
                c60Var.J = 0.0d;
                c60Var.d0(false, true);
                c60Var.d.j(null, null, c60Var.r, null);
                c60Var.f.setAnimation(c60Var.R);
                c60Var.R.M(0);
                break;
            case 10:
                org.telegram.messenger.m5.n(null, 2131749387, org.telegram.ui.Components.cc.a0(((f60) obj).c), R.raw.done, 36);
                break;
            case 11:
                s60 s60Var = (s60) obj;
                r60 r60Var2 = s60Var.I;
                int i15 = org.telegram.ui.ActionBar.t6.d6;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i15, false);
                int i16 = r60.D;
                r60Var2.a(R.drawable.intro_powerful_mask, 17, x02, true);
                s60Var.I.c();
                r60 r60Var3 = s60Var.I;
                r60Var3.b(r60Var3.w, 23, true);
                s60Var.I.d();
                Intro.a(org.telegram.ui.ActionBar.t6.x0(null, i15, false));
                break;
            case 12:
                q60 q60Var = (q60) obj;
                q60Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                s60 s60Var2 = (s60) q60Var.b;
                Intro.setPage(s60Var2.H);
                Intro.setDate((currentTimeMillis - s60Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                r60 r60Var4 = s60Var2.I;
                if (r60Var4 != null && r60Var4.isAlive() && (eGLDisplay = (r60Var = s60Var2.I).c) != null && (eGLSurface = r60Var.f) != null) {
                    try {
                        r60Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                s60 s60Var3 = (s60) ((org.telegram.messenger.ys) obj).c;
                s60Var3.presentFragment(new hf0(), true);
                s60Var3.M = true;
                break;
            case 14:
                ((r60) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                x60 x60Var = (x60) obj;
                x60Var.f.e.smoothScrollTo(0, x60Var.getHeight());
                break;
            case 16:
                ((gf.e) obj).b();
                break;
            case 17:
                n90 n90Var = (n90) obj;
                LaunchActivity launchActivity = n90Var.c;
                launchActivity.P0 = false;
                boolean z10 = launchActivity.O0;
                launchActivity.E();
                if (z10 != launchActivity.O0) {
                    n90Var.requestLayout();
                    break;
                }
                break;
            case 18:
                ((o90) obj).a.C0.setVisibility(8);
                break;
            case 19:
                sa0 sa0Var = (sa0) obj;
                qh.x0 x0Var = sa0Var.d;
                if (x0Var != null) {
                    sa0Var.h0(x0Var.getCurrentLink());
                    break;
                }
                break;
            case 20:
                try {
                    org.telegram.ui.Components.tk0 currentListView = ((yb0) ((wb0) obj).i0).S0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 21:
                EditTextBoldCursor[] editTextBoldCursorArr = ((bd0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    org.telegram.messenger.i0.J3(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 22:
                ed0 ed0Var = (ed0) obj;
                org.telegram.ui.Components.ei0 ei0Var = ed0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = ed0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    hf0.Z0(ed0Var.D, editTextBoldCursor2);
                    ei0Var.getAnimatedDrawable().N(0, false, false);
                    ei0Var.d();
                    break;
                }
                break;
            case 23:
                ((org.telegram.ui.Components.ei0) obj).d();
                break;
            case 24:
                ((ld0) ((org.telegram.ui.ActionBar.n0) obj).H1).getClass();
                break;
            case 25:
                double currentTimeMillis2 = System.currentTimeMillis();
                ld0 ld0Var = (ld0) ((e6.r) obj).b;
                double d = ld0Var.Q;
                ke0 ke0Var = ld0Var.w;
                ld0Var.Q = currentTimeMillis2;
                int i17 = (int) (ld0Var.P - (currentTimeMillis2 - d));
                ld0Var.P = i17;
                if (i17 >= 1000) {
                    int i18 = i17 / 1000;
                    int i19 = i18 / 60;
                    int i20 = i18 - (i19 * 60);
                    ke0Var.setTextSize(1, 13.0f);
                    int i21 = ld0Var.E;
                    if (i21 != 4 && i21 != 3 && i21 != 11) {
                        if (i21 == 2) {
                            ke0Var.setText(org.telegram.messenger.cd.a0(null, null, 2131745314, Integer.valueOf(i19), Integer.valueOf(i20)));
                            break;
                        }
                    } else {
                        ke0Var.setText(org.telegram.messenger.cd.a0(null, null, 2131752629, Integer.valueOf(i19), Integer.valueOf(i20)));
                        break;
                    }
                } else {
                    ld0Var.q();
                    int i22 = ld0Var.E;
                    if (i22 == 3 || i22 == 4 || i22 == 2 || i22 == 11) {
                        ke0Var.setTextSize(1, 15.0f);
                        int i23 = ld0Var.E;
                        if (i23 == 4) {
                            ke0Var.setText(org.telegram.messenger.cd.L0(2131746194, null));
                        } else if (i23 == 15) {
                            ke0Var.setText(org.telegram.messenger.cd.L0(2131751448, null));
                        } else if (i23 == 11 || i23 == 3) {
                            ke0Var.setText(org.telegram.messenger.cd.L0(2131746193, null));
                        } else {
                            ke0Var.setText(org.telegram.messenger.i0.H2(org.telegram.messenger.cd.L0(2131746195, null), true, 0.0f, 0.0f));
                        }
                        int i24 = org.telegram.ui.ActionBar.t6.P9;
                        org.telegram.ui.ActionBar.a7.V(ke0Var, i24, null);
                        ke0Var.setTag(R.id.color_key_tag, Integer.valueOf(i24));
                        break;
                    }
                }
                break;
            case 26:
                double currentTimeMillis3 = System.currentTimeMillis();
                me0 me0Var = ((le0) obj).b;
                double d10 = currentTimeMillis3 - me0Var.d0;
                me0Var.d0 = currentTimeMillis3;
                int i25 = (int) (me0Var.b0 - d10);
                me0Var.b0 = i25;
                if (i25 <= 1000) {
                    me0Var.setProblemTextVisible(true);
                    me0Var.w.setVisibility(8);
                    ke0 ke0Var2 = me0Var.y;
                    if (ke0Var2 != null) {
                        ke0Var2.setVisibility(0);
                    }
                    me0Var.t();
                    break;
                }
                break;
            case 27:
                double currentTimeMillis4 = System.currentTimeMillis();
                me0 me0Var2 = ((le0) obj).b;
                double d11 = me0Var2.c0;
                ke0 ke0Var3 = me0Var2.w;
                me0Var2.c0 = currentTimeMillis4;
                int i26 = (int) (me0Var2.a0 - (currentTimeMillis4 - d11));
                me0Var2.a0 = i26;
                if (i26 >= 1000) {
                    int i27 = i26 / 1000;
                    int i28 = i27 / 60;
                    int i29 = i27 - (i28 * 60);
                    int i30 = me0Var2.i0;
                    if (i30 != 4 && i30 != 3 && i30 != 11) {
                        if (me0Var2.h0 != 2 || (i30 != 2 && i30 != 17 && i30 != 16)) {
                            if (i30 == 2 || i30 == 17 || i30 == 16) {
                                ke0Var3.setText(org.telegram.messenger.cd.a0("SmsAvailableIn", null, 2131745315, Integer.valueOf(i28), Integer.valueOf(i29)));
                                break;
                            }
                        } else {
                            ke0Var3.setText(org.telegram.messenger.cd.a0("ResendSmsAvailableIn", null, 2131746136, Integer.valueOf(i28), Integer.valueOf(i29)));
                            break;
                        }
                    } else {
                        ke0Var3.setText(org.telegram.messenger.cd.a0("CallAvailableIn", null, 2131752630, Integer.valueOf(i28), Integer.valueOf(i29)));
                        break;
                    }
                } else {
                    me0Var2.u();
                    int i31 = me0Var2.i0;
                    if (i31 == 3 || i31 == 4 || i31 == 2 || i31 == 17 || i31 == 16 || i31 == 11) {
                        if (i31 == 4) {
                            ke0Var3.setText(org.telegram.messenger.cd.L0(2131746194, "RequestCallButton"));
                        } else if (i31 == 11 || i31 == 3) {
                            ke0Var3.setText(org.telegram.messenger.cd.L0(2131746193, null));
                        } else {
                            ke0Var3.setText(org.telegram.messenger.cd.L0(2131746192, "RequestSmsButton"));
                        }
                        int i32 = org.telegram.ui.ActionBar.t6.P9;
                        org.telegram.ui.ActionBar.a7.V(ke0Var3, i32, null);
                        ke0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i32));
                        break;
                    }
                }
            case 28:
                ((w50) obj).run();
                break;
            default:
                ((rf0) obj).setSkipDrawSelector(false);
                break;
        }
    }
}
