package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class u70 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u70(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        Bitmap bitmap;
        int i11 = this.a;
        Object obj = this.b;
        switch (i11) {
            case 0:
                if (i10 == -1) {
                    ((v70) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((l80) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                vb0 vb0Var = (vb0) obj;
                if (i10 == -1) {
                    vb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(vb0Var.F);
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((mc0) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                wg0 wg0Var = (wg0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && wg0Var.onBackPressed(true)) {
                        wg0Var.finishFragment();
                        break;
                    }
                } else {
                    wg0Var.p1();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((zg0) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((zh0) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((ai0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                lj0 lj0Var = (lj0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", lj0Var.b);
                        lj0Var.presentFragment(new bb1(bundle));
                        break;
                    }
                } else {
                    lj0Var.finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                nq0 nq0Var = (nq0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (nq0Var.c != null && !nq0Var.f) {
                            lq0 lq0Var = nq0Var.d;
                            float f7 = lq0Var.f - lq0Var.x;
                            float f10 = lq0Var.v;
                            float f11 = (lq0Var.h - lq0Var.y) / lq0Var.w;
                            float f12 = lq0Var.d / f10;
                            float f13 = lq0Var.e / f10;
                            nq0 nq0Var2 = lq0Var.H;
                            int width = (int) ((f7 / f10) * nq0Var2.a.getWidth());
                            int height = (int) (f11 * nq0Var2.a.getHeight());
                            int width2 = (int) (f12 * nq0Var2.a.getWidth());
                            int width3 = (int) (f13 * nq0Var2.a.getWidth());
                            int i12 = width < 0 ? 0 : width;
                            int i13 = height < 0 ? 0 : height;
                            if (i12 + width2 > nq0Var2.a.getWidth()) {
                                width2 = nq0Var2.a.getWidth() - i12;
                            }
                            int i14 = width2;
                            if (i13 + width3 > nq0Var2.a.getHeight()) {
                                width3 = nq0Var2.a.getHeight() - i13;
                            }
                            int i15 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(nq0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(nq0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == nq0Var.a) {
                                nq0Var.e = true;
                            }
                            ((org.telegram.ui.Components.m50) nq0Var.c).r(false, bitmap, null);
                            nq0Var.f = true;
                        }
                        nq0Var.finishFragment();
                        break;
                    }
                } else {
                    nq0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                br0 br0Var = (br0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ar0 ar0Var = br0Var.s0;
                            if (ar0Var != null) {
                                ar0Var.g();
                            }
                            br0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = br0Var.Y;
                        br0Var.Y = !z10;
                        if (z10) {
                            br0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            br0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        br0Var.K.B0();
                        br0Var.M.h1(0, 0);
                        br0Var.L.l();
                        break;
                    }
                } else {
                    br0Var.finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((gr0) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                PopupNotificationActivity popupNotificationActivity = (PopupNotificationActivity) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            int i16 = PopupNotificationActivity.b0;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i17 = PopupNotificationActivity.b0;
                        popupNotificationActivity.k();
                        break;
                    }
                } else {
                    popupNotificationActivity.i();
                    popupNotificationActivity.finish();
                    break;
                }
                break;
            case 18:
                tw0 tw0Var = (tw0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        tw0Var.Y();
                        break;
                    }
                } else if (tw0Var.onBackPressed(true)) {
                    tw0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    break;
                }
                break;
            case 20:
                PrivacyControlActivity privacyControlActivity = (PrivacyControlActivity) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        privacyControlActivity.z0();
                        break;
                    }
                } else if (privacyControlActivity.v0(true)) {
                    privacyControlActivity.finishFragment();
                    break;
                }
                break;
            case 21:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((gy0) obj).finishFragment();
                    break;
                }
                break;
            case 23:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 24:
                if (i10 == -1) {
                    ((g31) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((l31) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((f41) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((n41) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    break;
                }
                break;
        }
    }
}
