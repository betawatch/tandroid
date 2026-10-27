package org.telegram.ui;

import android.os.Looper;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.Intro;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r00 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r00(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        p70 p70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                j10 j10Var = (j10) obj;
                AndroidUtilities.cancelRunOnUIThread(j10Var.n0);
                j10Var.a.a(false, true);
                break;
            case 1:
                j10 j10Var2 = ((x00) obj).a;
                j10Var2.h(j10Var2.E, j10Var2.F, j10Var2.H, j10Var2.G, j10Var2.y, j10Var2.J, j10Var2.w, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((m10) obj).g3).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                n10 n10Var = (n10) obj;
                n10Var.s.a();
                n10Var.n.invalidate();
                n10Var.H.c0(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((u10) obj).e;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    int i13 = 0;
                    while (true) {
                        if (i13 < dialogFilters.size()) {
                            if (!dialogFilters.get(i13).isDefault() || i13 == 0) {
                                i13++;
                            } else {
                                FiltersSetupActivity filtersSetupActivity2 = filtersSetupActivity.b.e;
                                ArrayList<MessagesController.DialogFilter> arrayList = filtersSetupActivity2.getMessagesController().dialogFilters;
                                if (i13 < 0 || i13 >= arrayList.size()) {
                                    i10 = 1;
                                } else {
                                    arrayList.add(0, arrayList.remove(i13));
                                    for (int i14 = 0; i14 <= i13; i14++) {
                                        arrayList.get(i14).order = i14;
                                    }
                                    i10 = 1;
                                    filtersSetupActivity2.e = true;
                                    filtersSetupActivity2.c0(true);
                                }
                                filtersSetupActivity.a.v0(0);
                                try {
                                    filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                                } catch (Exception unused) {
                                }
                                org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(filtersSetupActivity);
                                int i15 = R.raw.filter_reorder;
                                int i16 = R.string.LimitReachedReorderFolder;
                                Object[] objArr = new Object[i10];
                                objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                                b02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new k10(filtersSetupActivity, i12)).j();
                            }
                        }
                    }
                }
                filtersSetupActivity.b0(null);
                break;
            case 5:
                x50 x50Var = ((e30) obj).b;
                x50Var.j2 = null;
                x50Var.K1(x50Var.F1, true);
                break;
            case 6:
                e50 e50Var = (e50) obj;
                x50 x50Var2 = e50Var.f;
                q30 q30Var = x50Var2.b;
                ImageLocation imageLocation = e50Var.d;
                if (imageLocation != null) {
                    q30Var.K0 = imageLocation;
                    q30Var.q1 = null;
                    q30Var.r1 = null;
                    e50Var.d = null;
                }
                TLRPC.Chat chat = x50Var2.d.getMessagesController().getChat(Long.valueOf(-e50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(e50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(e50Var.c);
                }
                q30Var.setCreateThumbFromParent(false);
                q30Var.H(null, forChat, forChat2, true);
                e50Var.c = null;
                e50Var.b = null;
                AndroidUtilities.updateVisibleRows(x50Var2.Q);
                e50Var.a(1.0f);
                break;
            case 7:
                b20 b20Var = ((h50) obj).g;
                if (b20Var != null) {
                    b20Var.invalidate();
                    break;
                }
                break;
            case 8:
                z60 z60Var = (z60) obj;
                z60Var.y = null;
                z60Var.E = null;
                z60Var.F = null;
                z60Var.G = null;
                z60Var.I = null;
                z60Var.H = null;
                z60Var.J = 0.0d;
                z60Var.a0(false, true);
                z60Var.d.h(null, null, z60Var.r, null);
                z60Var.f.setAnimation(z60Var.R);
                z60Var.R.M(0);
                break;
            case 9:
                org.telegram.messenger.t.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.wc.b0(((c70) obj).c), R.raw.done, 36);
                break;
            case 10:
                r70 r70Var = (r70) obj;
                p70 p70Var2 = r70Var.I;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.y6.d6;
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, i18, false);
                int i19 = p70.y;
                p70Var2.b(i17, 17, x02, true);
                r70Var.I.d();
                p70 p70Var3 = r70Var.I;
                p70Var3.c(p70Var3.v, 23, true);
                r70Var.I.f();
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, i18, false));
                break;
            case 11:
                n70 n70Var = (n70) obj;
                n70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                r70 r70Var2 = (r70) n70Var.b;
                Intro.setPage(r70Var2.H);
                Intro.setDate((currentTimeMillis - r70Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                p70 p70Var4 = r70Var2.I;
                if (p70Var4 != null && p70Var4.isAlive() && (eGLDisplay = (p70Var = r70Var2.I).c) != null && (eGLSurface = p70Var.f) != null) {
                    try {
                        p70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                r70 r70Var3 = ((o70) obj).b;
                r70Var3.presentFragment(new ig0(), true);
                r70Var3.M = true;
                break;
            case 13:
                ((p70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 14:
                x70 x70Var = (x70) obj;
                x70Var.f.e.smoothScrollTo(0, x70Var.getHeight());
                break;
            case 15:
                ((qf.c) obj).b();
                break;
            case 16:
                ha0 ha0Var = (ha0) obj;
                LaunchActivity launchActivity = ha0Var.c;
                launchActivity.P0 = false;
                boolean z10 = launchActivity.O0;
                launchActivity.F();
                if (z10 != launchActivity.O0) {
                    ha0Var.requestLayout();
                    break;
                }
                break;
            case 17:
                ((ia0) obj).a.C0.setVisibility(8);
                break;
            case 18:
                mb0 mb0Var = (mb0) obj;
                ai.t1 t1Var = mb0Var.d;
                if (t1Var != null) {
                    mb0Var.e0(t1Var.getCurrentLink());
                    break;
                }
                break;
            case 19:
                try {
                    org.telegram.ui.Components.nm0 currentListView = ((rc0) ((pc0) obj).o0).J0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 20:
                EditTextBoldCursor[] editTextBoldCursorArr = ((wd0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 21:
                ae0 ae0Var = (ae0) obj;
                org.telegram.ui.Components.bk0 bk0Var = ae0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = ae0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ig0.W0(ae0Var.y, editTextBoldCursor2);
                    bk0Var.getAnimatedDrawable().N(0, false, false);
                    bk0Var.d();
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.Components.bk0) obj).d();
                break;
            case 23:
                ((ie0) ((fi.c2) obj).c).getClass();
                break;
            case 24:
                double currentTimeMillis2 = System.currentTimeMillis();
                ie0 ie0Var = ((he0) obj).a;
                double d = ie0Var.Q;
                jf0 jf0Var = ie0Var.v;
                ie0Var.Q = currentTimeMillis2;
                int i20 = (int) (ie0Var.P - (currentTimeMillis2 - d));
                ie0Var.P = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    jf0Var.setTextSize(1, 13.0f);
                    int i24 = ie0Var.E;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            jf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        jf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    ie0Var.q();
                    int i25 = ie0Var.E;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        jf0Var.setTextSize(1, 15.0f);
                        int i26 = ie0Var.E;
                        if (i26 == 4) {
                            jf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            jf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            jf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            jf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.y6.P9;
                        org.telegram.ui.ActionBar.f7.V(jf0Var, i27, null);
                        jf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 25:
                double currentTimeMillis3 = System.currentTimeMillis();
                lf0 lf0Var = (lf0) ((f6.r) obj).b;
                double d10 = currentTimeMillis3 - lf0Var.d0;
                lf0Var.d0 = currentTimeMillis3;
                int i28 = (int) (lf0Var.b0 - d10);
                lf0Var.b0 = i28;
                if (i28 <= 1000) {
                    lf0Var.setProblemTextVisible(true);
                    lf0Var.v.setVisibility(8);
                    jf0 jf0Var2 = lf0Var.x;
                    if (jf0Var2 != null) {
                        jf0Var2.setVisibility(0);
                    }
                    lf0Var.t();
                    break;
                }
                break;
            case 26:
                double currentTimeMillis4 = System.currentTimeMillis();
                lf0 lf0Var2 = ((kf0) obj).a;
                double d11 = lf0Var2.c0;
                jf0 jf0Var3 = lf0Var2.v;
                lf0Var2.c0 = currentTimeMillis4;
                int i29 = (int) (lf0Var2.a0 - (currentTimeMillis4 - d11));
                lf0Var2.a0 = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = lf0Var2.i0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (lf0Var2.h0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                jf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            jf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        jf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    lf0Var2.v();
                    int i34 = lf0Var2.i0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            jf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            jf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            jf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.y6.P9;
                        org.telegram.ui.ActionBar.f7.V(jf0Var3, i35, null);
                        jf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 27:
                ((org.telegram.ui.Components.e10) obj).run();
                break;
            case 28:
                ((tg0) obj).setSkipDrawSelector(false);
                break;
            default:
                ((org.telegram.ui.Components.si) obj).setVisibility(8);
                break;
        }
    }
}
