package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class s60 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s60(Object obj, int i10) {
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
                    ((w60) obj).finishFragment();
                    break;
                }
                break;
            case 1:
                if (i10 == -1) {
                    ((y60) obj).finishFragment();
                    break;
                }
                break;
            case 2:
                if (i10 == -1) {
                    ((e70) obj).finishFragment();
                    break;
                }
                break;
            case 3:
                if (i10 == -1) {
                    ((g70) obj).finishFragment();
                    break;
                }
                break;
            case 4:
                if (i10 == -1) {
                    ((x70) obj).finishFragment();
                    break;
                }
                break;
            case 5:
                if (i10 == -1) {
                    ((LanguageSelectActivity) obj).finishFragment();
                    break;
                }
                break;
            case 6:
                gb0 gb0Var = (gb0) obj;
                if (i10 == -1) {
                    gb0Var.finishFragment();
                    AndroidUtilities.hideKeyboard(gb0Var.F);
                    break;
                }
                break;
            case 7:
                if (i10 == -1) {
                    ((wb0) obj).finishFragment();
                    break;
                }
                break;
            case 8:
                ig0 ig0Var = (ig0) obj;
                if (i10 != 1) {
                    if (i10 == -1 && ig0Var.onBackPressed(true)) {
                        ig0Var.finishFragment();
                        break;
                    }
                } else {
                    ig0Var.t1();
                    break;
                }
                break;
            case 9:
                if (i10 == -1) {
                    ((lg0) obj).finishFragment();
                    break;
                }
                break;
            case 10:
                if (i10 == -1) {
                    ((mh0) obj).finishFragment();
                    break;
                }
                break;
            case 11:
                if (i10 == -1) {
                    ((nh0) obj).finishFragment();
                    break;
                }
                break;
            case 12:
                yi0 yi0Var = (yi0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", yi0Var.b);
                        yi0Var.presentFragment(new u91(bundle));
                        break;
                    }
                } else {
                    yi0Var.finishFragment();
                    break;
                }
                break;
            case 13:
                if (i10 == -1) {
                    ((NotificationsCustomSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 14:
                if (i10 == -1) {
                    ((NotificationsSettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 15:
                if (i10 == -1) {
                    ((PasscodeActivity) obj).finishFragment();
                    break;
                }
                break;
            case 16:
                if (i10 == -1) {
                    ((PasskeysActivity) obj).finishFragment();
                    break;
                }
                break;
            case 17:
                yp0 yp0Var = (yp0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        if (yp0Var.c != null && !yp0Var.f) {
                            wp0 wp0Var = yp0Var.d;
                            float f7 = wp0Var.f - wp0Var.x;
                            float f10 = wp0Var.v;
                            float f11 = (wp0Var.h - wp0Var.y) / wp0Var.w;
                            float f12 = wp0Var.d / f10;
                            float f13 = wp0Var.e / f10;
                            yp0 yp0Var2 = wp0Var.H;
                            int width = (int) ((f7 / f10) * yp0Var2.a.getWidth());
                            int height = (int) (f11 * yp0Var2.a.getHeight());
                            int width2 = (int) (f12 * yp0Var2.a.getWidth());
                            int width3 = (int) (f13 * yp0Var2.a.getWidth());
                            int i12 = width < 0 ? 0 : width;
                            int i13 = height < 0 ? 0 : height;
                            if (i12 + width2 > yp0Var2.a.getWidth()) {
                                width2 = yp0Var2.a.getWidth() - i12;
                            }
                            int i14 = width2;
                            if (i13 + width3 > yp0Var2.a.getHeight()) {
                                width3 = yp0Var2.a.getHeight() - i13;
                            }
                            int i15 = width3;
                            try {
                                bitmap = Bitmap.createBitmap(yp0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                            } catch (Throwable th2) {
                                FileLog.e(th2);
                                System.gc();
                                try {
                                    bitmap = Bitmap.createBitmap(yp0Var2.a, i12, i13, i14, i15, (Matrix) null, false);
                                } catch (Throwable th3) {
                                    FileLog.e(th3);
                                    bitmap = null;
                                }
                            }
                            if (bitmap == yp0Var.a) {
                                yp0Var.e = true;
                            }
                            ((org.telegram.ui.Components.e50) yp0Var.c).r(false, bitmap, null);
                            yp0Var.f = true;
                        }
                        yp0Var.finishFragment();
                        break;
                    }
                } else {
                    yp0Var.finishFragment();
                    break;
                }
                break;
            case 18:
                mq0 mq0Var = (mq0) obj;
                if (i10 != -1) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            lq0 lq0Var = mq0Var.s0;
                            if (lq0Var != null) {
                                lq0Var.g();
                            }
                            mq0Var.finishFragment();
                            break;
                        }
                    } else {
                        boolean z10 = mq0Var.Y;
                        mq0Var.Y = !z10;
                        if (z10) {
                            mq0Var.K.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(50.0f));
                        } else {
                            mq0Var.K.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                        }
                        mq0Var.K.B0();
                        mq0Var.M.h1(0, 0);
                        mq0Var.L.l();
                        break;
                    }
                } else {
                    mq0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                if (i10 == -1) {
                    ((rq0) obj).finishFragment();
                    break;
                }
                break;
            case 20:
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
            case 21:
                bw0 bw0Var = (bw0) obj;
                if (i10 != -1) {
                    if (i10 == 1) {
                        bw0Var.Y();
                        break;
                    }
                } else if (bw0Var.onBackPressed(true)) {
                    bw0Var.finishFragment();
                    break;
                }
                break;
            case 22:
                if (i10 == -1) {
                    ((PremiumPreviewFragment) obj).finishFragment();
                    break;
                }
                break;
            case 23:
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
            case 24:
                if (i10 == -1) {
                    ((PrivacySettingsActivity) obj).finishFragment();
                    break;
                }
                break;
            case 25:
                if (i10 == -1) {
                    ((ox0) obj).finishFragment();
                    break;
                }
                break;
            case 26:
                if (i10 == -1) {
                    ((ProxyListActivity) obj).finishFragment();
                    break;
                }
                break;
            case 27:
                if (i10 == -1) {
                    ((y11) obj).finishFragment();
                    break;
                }
                break;
            case 28:
                if (i10 == -1) {
                    ((d21) obj).finishFragment();
                    break;
                }
                break;
            default:
                if (i10 == -1) {
                    ((v21) obj).finishFragment();
                    break;
                }
                break;
        }
    }
}
