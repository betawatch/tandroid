package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class v70 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v70(Object obj, int i10) {
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
                    ((w70) obj).finishFragment();
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
                xb0 xb0Var = (xb0) obj;
                if (i10 == -1) {
                    xb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(xb0Var.F);
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((nc0) obj).finishFragment();
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
                    ((yg0) obj).finishFragment();
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((yh0) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                if (i10 == -1) {
                    ((zh0) obj).finishFragment();
                    break;
                }
                break;
            case 9:
                jj0 jj0Var = (jj0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", jj0Var.b);
                        jj0Var.presentFragment(new za1(bundle));
                        break;
                    }
                } else {
                    jj0Var.finishFragment();
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
                mq0 mq0Var = (mq0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (mq0Var.c != null && !mq0Var.f) {
                            kq0 kq0Var = mq0Var.d;
                            float f7 = kq0Var.f - kq0Var.x;
                            float f10 = kq0Var.v;
                            float f11 = (kq0Var.h - kq0Var.y) / kq0Var.w;
                            float f12 = kq0Var.d / f10;
                            float f13 = kq0Var.e / f10;
                            mq0 mq0Var2 = kq0Var.H;
                            int width = (int) ((f7 / f10) * mq0Var2.a.getWidth());
                            int height = (int) (f11 * mq0Var2.a.getHeight());
                            int width2 = (int) (f12 * mq0Var2.a.getWidth());
                            int width3 = (int) (f13 * mq0Var2.a.getWidth());
                            if (width < 0) {
                                width = 0;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            if (width + width2 > mq0Var2.a.getWidth()) {
                                width2 = mq0Var2.a.getWidth() - width;
                            }
                            if (height + width3 > mq0Var2.a.getHeight()) {
                                width3 = mq0Var2.a.getHeight() - height;
                            }
                            try {
                                bitmap = Bitmaps.createBitmap(mq0Var2.a, width, height, width2, width3);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmaps.createBitmap(mq0Var2.a, width, height, width2, width3);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == mq0Var.a) {
                                mq0Var.e = true;
                            }
                            ((org.telegram.ui.Components.u40) mq0Var.c).s(false, bitmap, null);
                            mq0Var.f = true;
                        }
                        mq0Var.finishFragment();
                        break;
                    }
                } else {
                    mq0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                ar0 ar0Var = (ar0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            zq0 zq0Var = ar0Var.s0;
                            if (zq0Var != null) {
                                zq0Var.g();
                            }
                            ar0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = ar0Var.Y;
                        ar0Var.Y = !z10;
                        if (z10) {
                            ar0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            ar0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        ar0Var.K.B0();
                        ar0Var.M.h1(0, 0);
                        ar0Var.L.l();
                        break;
                    }
                } else {
                    ar0Var.finishFragment();
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
                            int i12 = PopupNotificationActivity.b0;
                            popupNotificationActivity.p();
                            break;
                        }
                    } else {
                        int i13 = PopupNotificationActivity.b0;
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
                    ((h31) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((m31) obj).finishFragment();
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
