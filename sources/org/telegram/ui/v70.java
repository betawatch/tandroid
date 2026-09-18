package org.telegram.ui;

import android.graphics.Bitmap;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                yb0 yb0Var = (yb0) obj;
                if (i10 == -1) {
                    yb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(yb0Var.F);
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((oc0) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                xg0 xg0Var = (xg0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && xg0Var.onBackPressed(true)) {
                        xg0Var.finishFragment();
                        break;
                    }
                } else {
                    xg0Var.p1();
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
                kj0 kj0Var = (kj0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", kj0Var.b);
                        kj0Var.presentFragment(new za1(bundle));
                        break;
                    }
                } else {
                    kj0Var.finishFragment();
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
                oq0 oq0Var = (oq0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (oq0Var.c != null && !oq0Var.f) {
                            mq0 mq0Var = oq0Var.d;
                            float f7 = mq0Var.f - mq0Var.x;
                            float f10 = mq0Var.v;
                            float f11 = (mq0Var.h - mq0Var.y) / mq0Var.w;
                            float f12 = mq0Var.d / f10;
                            float f13 = mq0Var.e / f10;
                            oq0 oq0Var2 = mq0Var.H;
                            int width = (int) ((f7 / f10) * oq0Var2.a.getWidth());
                            int height = (int) (f11 * oq0Var2.a.getHeight());
                            int width2 = (int) (f12 * oq0Var2.a.getWidth());
                            int width3 = (int) (f13 * oq0Var2.a.getWidth());
                            if (width < 0) {
                                width = 0;
                            }
                            if (height < 0) {
                                height = 0;
                            }
                            if (width + width2 > oq0Var2.a.getWidth()) {
                                width2 = oq0Var2.a.getWidth() - width;
                            }
                            if (height + width3 > oq0Var2.a.getHeight()) {
                                width3 = oq0Var2.a.getHeight() - height;
                            }
                            try {
                                bitmap = Bitmaps.createBitmap(oq0Var2.a, width, height, width2, width3);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmaps.createBitmap(oq0Var2.a, width, height, width2, width3);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == oq0Var.a) {
                                oq0Var.e = true;
                            }
                            ((org.telegram.ui.Components.u40) oq0Var.c).s(false, bitmap, null);
                            oq0Var.f = true;
                        }
                        oq0Var.finishFragment();
                        break;
                    }
                } else {
                    oq0Var.finishFragment();
                    break;
                }
                break;
            case 15:
                cr0 cr0Var = (cr0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            br0 br0Var = cr0Var.s0;
                            if (br0Var != null) {
                                br0Var.g();
                            }
                            cr0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = cr0Var.Y;
                        cr0Var.Y = !z10;
                        if (z10) {
                            cr0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            cr0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        cr0Var.K.C0();
                        cr0Var.M.h1(0, 0);
                        cr0Var.L.l();
                        break;
                    }
                } else {
                    cr0Var.finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((hr0) obj).finishFragment();
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
                    ((hy0) obj).finishFragment();
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
                    ((e41) obj).finishFragment();
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
