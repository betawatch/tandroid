package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
                    ((k80) obj).finishFragment();
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
                    ((lc0) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                ug0 ug0Var = (ug0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && ug0Var.onBackPressed(true)) {
                        ug0Var.finishFragment();
                        break;
                    }
                } else {
                    ug0Var.p1();
                    break;
                }
                break;
            case 6:
                if (i10 == -1) {
                    ((wg0) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((wh0) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((xh0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                hj0 hj0Var = (hj0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", hj0Var.b);
                        hj0Var.presentFragment(new ta1(bundle));
                        break;
                    }
                } else {
                    hj0Var.finishFragment();
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
                iq0 iq0Var = (iq0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (iq0Var.c != null && !iq0Var.f) {
                            gq0 gq0Var = iq0Var.d;
                            float f7 = gq0Var.f - gq0Var.x;
                            float f10 = gq0Var.v;
                            float f11 = (gq0Var.h - gq0Var.y) / gq0Var.w;
                            float f12 = gq0Var.d / f10;
                            float f13 = gq0Var.e / f10;
                            iq0 iq0Var2 = gq0Var.H;
                            int width = (int) ((f7 / f10) * iq0Var2.a.getWidth());
                            int height = (int) (f11 * iq0Var2.a.getHeight());
                            int width2 = (int) (f12 * iq0Var2.a.getWidth());
                            int width3 = (int) (f13 * iq0Var2.a.getWidth());
                            int i12 = width < 0 ? 0 : width;
                            int i13 = height < 0 ? 0 : height;
                            if (i12 + width2 > iq0Var2.a.getWidth()) {
                                width2 = iq0Var2.a.getWidth() - i12;
                            }
                            int i14 = width2;
                            if (i13 + width3 > iq0Var2.a.getHeight()) {
                                width3 = iq0Var2.a.getHeight() - i13;
                            }
                            int i15 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(iq0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(iq0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == iq0Var.a) {
                                iq0Var.e = true;
                            }
                            ((org.telegram.ui.Components.y40) iq0Var.c).s(false, bitmap, null);
                            iq0Var.f = true;
                        }
                        iq0Var.finishFragment();
                        break;
                    }
                } else {
                    iq0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                wq0 wq0Var = (wq0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            vq0 vq0Var = wq0Var.s0;
                            if (vq0Var != null) {
                                vq0Var.g();
                            }
                            wq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = wq0Var.Y;
                        wq0Var.Y = !z10;
                        if (z10) {
                            wq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            wq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        wq0Var.K.C0();
                        wq0Var.M.h1(0, 0);
                        wq0Var.L.l();
                        break;
                    }
                } else {
                    wq0Var.finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((br0) obj).finishFragment();
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
                nw0 nw0Var = (nw0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        nw0Var.X();
                        break;
                    }
                } else if (nw0Var.onBackPressed(true)) {
                    nw0Var.finishFragment();
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
                    ((by0) obj).finishFragment();
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
                    ((d31) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((w31) obj).finishFragment();
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
                    ((SaveToGallerySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((SecretMediaViewer) obj).e(true, false);
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((SessionsActivity) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
