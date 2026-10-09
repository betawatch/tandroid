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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uz implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uz(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        b80 b80Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        int i11 = this.a;
        int i12 = 2;
        Object obj = this.b;
        switch (i11) {
            case 0:
                ((a00) obj).a.getBackground().setState(new int[0]);
                break;
            case 1:
                w10 w10Var = (w10) obj;
                AndroidUtilities.cancelRunOnUIThread(w10Var.n0);
                w10Var.a.a(false, true);
                break;
            case 2:
                w10 w10Var2 = ((l10) obj).a;
                w10Var2.h(w10Var2.E, w10Var2.F, w10Var2.H, w10Var2.G, w10Var2.y, w10Var2.J, w10Var2.w, false);
                break;
            case 3:
                ((FiltersSetupActivity) ((ai.w0) obj).W2).getMessagesController().lockFiltersInternal();
                break;
            case 4:
                y10 y10Var = (y10) obj;
                y10Var.s.a();
                y10Var.n.invalidate();
                y10Var.E.Z(true);
                break;
            case 5:
                FiltersSetupActivity filtersSetupActivity = ((f20) obj).d;
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
                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(filtersSetupActivity);
                            int i15 = R.raw.filter_reorder;
                            int i16 = R.string.LimitReachedReorderFolder;
                            Object[] objArr = new Object[i10];
                            objArr[0] = LocaleController.getString(R.string.FilterAllChats);
                            a02.I(i15, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", i16, objArr)), LocaleController.getString(R.string.PremiumMore), 5000, false, new x10(filtersSetupActivity, i12)).j();
                            break;
                        }
                    }
                    break;
                }
                break;
            case 6:
                g60 g60Var = ((o30) obj).b;
                g60Var.j2 = null;
                g60Var.K1(g60Var.F1, true);
                break;
            case 7:
                n50 n50Var = (n50) obj;
                g60 g60Var2 = n50Var.f;
                a40 a40Var = g60Var2.b;
                ImageLocation imageLocation = n50Var.d;
                if (imageLocation != null) {
                    a40Var.K0 = imageLocation;
                    a40Var.q1 = null;
                    a40Var.r1 = null;
                    n50Var.d = null;
                }
                TLRPC.Chat chat = g60Var2.d.getMessagesController().getChat(Long.valueOf(-n50Var.e));
                ImageLocation forChat = ImageLocation.getForChat(chat, 0);
                ImageLocation forChat2 = ImageLocation.getForChat(chat, 1);
                if (ImageLocation.getForLocal(n50Var.b) == null) {
                    forChat2 = ImageLocation.getForLocal(n50Var.c);
                }
                a40Var.setCreateThumbFromParent(false);
                a40Var.H(null, forChat, forChat2, true);
                n50Var.c = null;
                n50Var.b = null;
                AndroidUtilities.updateVisibleRows(g60Var2.Q);
                n50Var.a(1.0f);
                break;
            case 8:
                q50 q50Var = ((r50) obj).g;
                if (q50Var != null) {
                    q50Var.invalidate();
                    break;
                }
                break;
            case 9:
                j70 j70Var = (j70) obj;
                j70Var.y = null;
                j70Var.E = null;
                j70Var.F = null;
                j70Var.G = null;
                j70Var.I = null;
                j70Var.H = null;
                j70Var.J = 0.0d;
                j70Var.Z(false, true);
                j70Var.d.h(null, null, j70Var.r, null);
                j70Var.f.setAnimation(j70Var.R);
                j70Var.R.M(0);
                break;
            case 10:
                org.telegram.messenger.q.q(R.string.GroupsEmojiPackUpdated, org.telegram.ui.Components.ad.a0(((n70) obj).c), R.raw.done, 36);
                break;
            case 11:
                d80 d80Var = (d80) obj;
                b80 b80Var2 = d80Var.I;
                int i17 = R.drawable.intro_powerful_mask;
                int i18 = org.telegram.ui.ActionBar.i6.d6;
                int x02 = org.telegram.ui.ActionBar.i6.x0(null, i18, false);
                int i19 = b80.y;
                b80Var2.b(i17, 17, x02, true);
                int[] iArr = d80Var.I.n;
                Intro.setPowerfulTextures(iArr[17], iArr[18], iArr[16], iArr[15]);
                b80 b80Var3 = d80Var.I;
                b80Var3.c(b80Var3.v, 23, true);
                int[] iArr2 = d80Var.I.n;
                Intro.setTelegramTextures(iArr2[22], iArr2[21], iArr2[23]);
                Intro.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, i18, false));
                break;
            case 12:
                y70 y70Var = (y70) obj;
                y70Var.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                d80 d80Var2 = (d80) y70Var.b;
                Intro.setPage(d80Var2.H);
                Intro.setDate((currentTimeMillis - d80Var2.J) / 1000.0f);
                Intro.onDrawFrame(0);
                b80 b80Var4 = d80Var2.I;
                if (b80Var4 != null && b80Var4.isAlive() && (eGLDisplay = (b80Var = d80Var2.I).c) != null && (eGLSurface = b80Var.f) != null) {
                    try {
                        b80Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 13:
                d80 d80Var3 = ((z70) obj).b;
                d80Var3.presentFragment(new wg0(), true);
                d80Var3.M = true;
                break;
            case 14:
                ((b80) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                ((of.e) obj).b();
                break;
            case 16:
                ((va0) obj).a.C0.setVisibility(8);
                break;
            case 17:
                ((cc0) obj).f0();
                break;
            case 18:
                try {
                    org.telegram.ui.Components.qm0 currentListView = ((hd0) ((fd0) obj).z0).K0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().l();
                        break;
                    }
                } catch (Throwable unused3) {
                    return;
                }
                break;
            case 19:
                EditTextBoldCursor[] editTextBoldCursorArr = ((le0) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    AndroidUtilities.showKeyboard(editTextBoldCursorArr[0]);
                    break;
                }
                break;
            case 20:
                oe0 oe0Var = (oe0) obj;
                org.telegram.ui.Components.fk0 fk0Var = oe0Var.e;
                EditTextBoldCursor editTextBoldCursor2 = oe0Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    wg0.T0(oe0Var.y, editTextBoldCursor2);
                    fk0Var.getAnimatedDrawable().N(0, false, false);
                    fk0Var.d();
                    break;
                }
                break;
            case 21:
                ((org.telegram.ui.Components.fk0) obj).d();
                break;
            case 22:
                ((we0) ((ci.g2) obj).c).getClass();
                break;
            case 23:
                double currentTimeMillis2 = System.currentTimeMillis();
                we0 we0Var = ((ve0) obj).a;
                double d = we0Var.Q;
                xf0 xf0Var = we0Var.v;
                we0Var.Q = currentTimeMillis2;
                int i20 = (int) (we0Var.P - (currentTimeMillis2 - d));
                we0Var.P = i20;
                if (i20 >= 1000) {
                    int i21 = i20 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i22 = i21 / 60;
                    int i23 = i21 - (i22 * 60);
                    xf0Var.setTextSize(1, 13.0f);
                    int i24 = we0Var.E;
                    if (i24 != 4 && i24 != 3 && i24 != 11) {
                        if (i24 == 2) {
                            xf0Var.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                            break;
                        }
                    } else {
                        xf0Var.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i22), Integer.valueOf(i23)));
                        break;
                    }
                } else {
                    we0Var.r();
                    int i25 = we0Var.E;
                    if (i25 == 3 || i25 == 4 || i25 == 2 || i25 == 11) {
                        xf0Var.setTextSize(1, 15.0f);
                        int i26 = we0Var.E;
                        if (i26 == 4) {
                            xf0Var.setText(LocaleController.getString(R.string.RequestCallButton));
                        } else if (i26 == 15) {
                            xf0Var.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                        } else if (i26 == 11 || i26 == 3) {
                            xf0Var.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            xf0Var.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                        }
                        int i27 = org.telegram.ui.ActionBar.i6.P9;
                        xf0Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i27, false));
                        xf0Var.setTag(R.id.color_key_tag, Integer.valueOf(i27));
                        break;
                    }
                }
                break;
            case 24:
                double currentTimeMillis3 = System.currentTimeMillis();
                zf0 zf0Var = (zf0) ((ci.n2) obj).b;
                double d10 = currentTimeMillis3 - zf0Var.b0;
                zf0Var.b0 = currentTimeMillis3;
                int i28 = (int) (zf0Var.W - d10);
                zf0Var.W = i28;
                if (i28 <= 1000) {
                    zf0Var.setProblemTextVisible(true);
                    zf0Var.v.setVisibility(8);
                    xf0 xf0Var2 = zf0Var.x;
                    if (xf0Var2 != null) {
                        xf0Var2.setVisibility(0);
                    }
                    zf0Var.v();
                    break;
                }
                break;
            case 25:
                double currentTimeMillis4 = System.currentTimeMillis();
                zf0 zf0Var2 = ((yf0) obj).a;
                double d11 = zf0Var2.a0;
                xf0 xf0Var3 = zf0Var2.v;
                zf0Var2.a0 = currentTimeMillis4;
                int i29 = (int) (zf0Var2.V - (currentTimeMillis4 - d11));
                zf0Var2.V = i29;
                if (i29 >= 1000) {
                    int i30 = i29 / MediaDataController.MAX_STYLE_RUNS_COUNT;
                    int i31 = i30 / 60;
                    int i32 = i30 - (i31 * 60);
                    int i33 = zf0Var2.g0;
                    if (i33 != 4 && i33 != 3 && i33 != 11) {
                        if (zf0Var2.f0 != 2 || (i33 != 2 && i33 != 17 && i33 != 16)) {
                            if (i33 == 2 || i33 == 17 || i33 == 16) {
                                xf0Var3.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                                break;
                            }
                        } else {
                            xf0Var3.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                            break;
                        }
                    } else {
                        xf0Var3.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i31), Integer.valueOf(i32)));
                        break;
                    }
                } else {
                    zf0Var2.w();
                    int i34 = zf0Var2.g0;
                    if (i34 == 3 || i34 == 4 || i34 == 2 || i34 == 17 || i34 == 16 || i34 == 11) {
                        if (i34 == 4) {
                            xf0Var3.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (i34 == 11 || i34 == 3) {
                            xf0Var3.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            xf0Var3.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        int i35 = org.telegram.ui.ActionBar.i6.P9;
                        xf0Var3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i35, false));
                        xf0Var3.setTag(R.id.color_key_tag, Integer.valueOf(i35));
                        break;
                    }
                }
            case 26:
                ((org.telegram.ui.Components.oo0) obj).run();
                break;
            case 27:
                ((hh0) obj).setSkipDrawSelector(false);
                break;
            case 28:
                ((org.telegram.ui.Components.xi) obj).setVisibility(8);
                break;
            default:
                AndroidUtilities.showKeyboard(((dk0) ((g) obj).b).Q);
                break;
        }
    }
}
