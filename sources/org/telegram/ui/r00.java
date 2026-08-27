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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        k70 k70Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                i10 i10Var = (i10) obj;
                AndroidUtilities.cancelRunOnUIThread(i10Var.j0);
                i10Var.a.a(false, true);
                break;
            case 1:
                i10 i10Var2 = ((x00) obj).a;
                i10Var2.h(i10Var2.A, i10Var2.B, i10Var2.D, i10Var2.C, i10Var2.y, i10Var2.F, i10Var2.w, false);
                break;
            case 2:
                ((FiltersSetupActivity) ((hh.f1) obj).U2).getMessagesController().lockFiltersInternal();
                break;
            case 3:
                k10 k10Var = (k10) obj;
                k10Var.s.a();
                k10Var.n.invalidate();
                k10Var.A.Z(true);
                break;
            case 4:
                FiltersSetupActivity filtersSetupActivity = ((r10) obj).d;
                if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium()) {
                    ArrayList<MessagesController.DialogFilter> dialogFilters = filtersSetupActivity.getMessagesController().getDialogFilters();
                    for (int i13 = 0; i13 < dialogFilters.size(); i13++) {
                        if (dialogFilters.get(i13).isDefault() && i13 != 0) {
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
                                filtersSetupActivity2.Z(true);
                            }
                            filtersSetupActivity.a.u0(0);
                            try {
                                filtersSetupActivity.fragmentView.performHapticFeedback(3, i10);
                            } catch (Exception unused) {
                            }
                            org.telegram.ui.Components.mc a02 = org.telegram.ui.Components.mc.a0(filtersSetupActivity);
                            int i15 = R.raw.filter_reorder;
                            int i16 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new j10(filtersSetupActivity, i12)).j();
                            break;
                        }
                    }
                    break;
                }
                break;
            case 5:
                s50 s50Var = ((y20) obj).b;
                s50Var.f2 = null;
                s50Var.J1(s50Var.B1, true);
                break;
            case 6:
                z40 z40Var = (z40) obj;
                s50 s50Var2 = z40Var.f;
                l30 l30Var = s50Var2.b;
                ImageLocation imageLocation = z40Var.d;
                if (imageLocation != null) {
                    l30Var.G0 = imageLocation;
                    l30Var.m1 = null;
                    l30Var.n1 = null;
                    z40Var.d = null;
                }
                TLRPC.Chat chat = s50Var2.d.getMessagesController().getChat(Long.valueOf(-z40Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(z40Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(z40Var.c);
                }
                l30Var.setCreateThumbFromParent(false);
                l30Var.H(null, forChat, forChat2, true);
                z40Var.c = null;
                z40Var.b = null;
                AndroidUtilities.updateVisibleRows(s50Var2.M);
                z40Var.a(1.0f);
                break;
            case 7:
                ag.s0 s0Var = ((c50) obj).g;
                if (s0Var != null) {
                    s0Var.invalidate();
                    break;
                }
                break;
            case 8:
                u60 u60Var = (u60) obj;
                u60Var.y = null;
                u60Var.A = null;
                u60Var.B = null;
                u60Var.C = null;
                u60Var.E = null;
                u60Var.D = null;
                u60Var.F = 0.0d;
                u60Var.Z(false, true);
                u60Var.d.h(null, null, u60Var.r, null);
                u60Var.f.setAnimation(u60Var.N);
                u60Var.N.K(0);
                break;
            case 9:
                org.telegram.messenger.y1.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.mc.a0(((x60) obj).c), R.raw.done, 36);
                break;
            case 10:
                l70 l70Var = (l70) obj;
                k70 k70Var2 = l70Var.E;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.g6.d6;
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, i18, false);
                int i19 = k70.y;
                k70Var2.b(i17, 17, w02, true);
                int[] iArr = l70Var.E.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                k70 k70Var3 = l70Var.E;
                k70Var3.c(k70Var3.v, 23, true);
                int[] iArr2 = l70Var.E.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i18, false));
                break;
            case 11:
                h70 h70Var = (h70) obj;
                h70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                l70 l70Var2 = (l70) h70Var.b;
                Intro.setPage(l70Var2.D);
                Intro.setDate((currentTimeMillis - l70Var2.F) / 1000.0f);
                Intro.onDrawFrame(0);
                k70 k70Var4 = l70Var2.E;
                if (k70Var4 != null && k70Var4.isAlive() && (eGLDisplay = (k70Var = l70Var2.E).c) != null && (eGLSurface = k70Var.f) != null) {
                    try {
                        k70Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 12:
                l70 l70Var3 = ((i70) obj).b;
                l70Var3.presentFragment(new ig0(), true);
                l70Var3.I = true;
                break;
            case 13:
                ((k70) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 14:
                ((we.d) obj).b();
                break;
            case 15:
                ((ga0) obj).a.y0.setVisibility(8);
                break;
            case 16:
                ((mb0) obj).g0();
                break;
            case 17:
                try {
                    org.telegram.ui.Components.zk0 currentListView = ((rc0) obj).u0.G0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 18:
                EditTextBoldCursor[] editTextBoldCursorArr = ((yd0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 19:
                be0 be0Var = (be0) obj;
                org.telegram.ui.Components.ri0 ri0Var = be0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = be0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ig0.T0(be0Var.y, editTextBoldCursor2);
                    ri0Var.getAnimatedDrawable().L(0, false, false);
                    ri0Var.d();
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.ri0) obj).d();
                break;
            case 21:
                ((je0) ((gg.g) obj).c).getClass();
                break;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                je0 je0Var = ((ie0) obj).a;
                double d = je0Var.M;
                kf0 kf0Var = je0Var.v;
                je0Var.M = currentTimeMillis2;
                int i20 = (int) (je0Var.L - (currentTimeMillis2 - d));
                je0Var.L = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    kf0Var.setTextSize(1, 13.0f);
                    int i24 = je0Var.A;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            kf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        kf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    je0Var.r();
                    int i25 = je0Var.A;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        kf0Var.setTextSize(1, 15.0f);
                        int i26 = je0Var.A;
                        if (i26 == 4) {
                            kf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            kf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            kf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            kf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.g6.P9;
                        kf0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i27, false));
                        kf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                mf0 mf0Var = (mf0) ((lh.h2) obj).b;
                double d10 = currentTimeMillis3 - mf0Var.U;
                mf0Var.U = currentTimeMillis3;
                int i28 = (int) (mf0Var.S - d10);
                mf0Var.S = i28;
                if (i28 <= 1000) {
                    mf0Var.setProblemTextVisible(true);
                    mf0Var.v.setVisibility(8);
                    kf0 kf0Var2 = mf0Var.x;
                    if (kf0Var2 != null) {
                        kf0Var2.setVisibility(0);
                    }
                    mf0Var.u();
                    break;
                }
                break;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                mf0 mf0Var2 = ((lf0) obj).a;
                double d11 = mf0Var2.T;
                kf0 kf0Var3 = mf0Var2.v;
                mf0Var2.T = currentTimeMillis4;
                int i29 = (int) (mf0Var2.R - (currentTimeMillis4 - d11));
                mf0Var2.R = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = mf0Var2.c0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (mf0Var2.b0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                kf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            kf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        kf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    mf0Var2.w();
                    int i34 = mf0Var2.c0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            kf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            kf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            kf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.g6.P9;
                        kf0Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i35, false));
                        kf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 25:
                ((org.telegram.ui.Components.l11) obj).run();
                break;
            case 26:
                ((sg0) obj).setSkipDrawSelector(false);
                break;
            case 27:
                ((org.telegram.ui.Components.fi) obj).setVisibility(8);
                break;
            case 28:
                AndroidUtilities.showKeyboard(((oj0) ((g) obj).b).M);
                break;
            default:
                NotificationsSettingsActivity.V((NotificationsSettingsActivity) obj);
                break;
        }
    }
}
