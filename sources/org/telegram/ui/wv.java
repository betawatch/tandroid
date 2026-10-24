package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wv implements org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.md0, org.telegram.ui.ActionBar.o6, org.telegram.ui.ActionBar.p6, GenericProvider, FlagSecureReason.FlagSecureCondition, Utilities.Callback2Return, org.telegram.ui.Components.rw0 {
    public final /* synthetic */ int a;

    public /* synthetic */ wv(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.ActionBar.p6
    public void d(int i10, View view) {
        switch (this.a) {
            case 5:
                Drawable background = view.getBackground();
                if (background instanceof org.telegram.ui.Components.yq) {
                    Drawable drawable = ((org.telegram.ui.Components.yq) background).a;
                    if (drawable instanceof ColorDrawable) {
                        ((ColorDrawable) drawable).setColor(i10);
                        view.invalidate();
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.Wallet.f3 f3Var = (org.telegram.ui.Wallet.f3) view;
                ShapeDrawable shapeDrawable = f3Var.e0;
                if (shapeDrawable != null) {
                    shapeDrawable.getPaint().setColor(i10);
                    f3Var.e0.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.md0
    public String e(int i10) {
        switch (this.a) {
            case 2:
                break;
            case 3:
                break;
            default:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 == 4) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
                break;
        }
        return String.format("%02d", Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.ActionBar.o6
    public int f(View view) {
        switch (this.a) {
            case 4:
                Drawable background = view.getBackground();
                if (background instanceof org.telegram.ui.Components.yq) {
                    Drawable drawable = ((org.telegram.ui.Components.yq) background).a;
                    if (drawable instanceof ColorDrawable) {
                        return ((ColorDrawable) drawable).getColor();
                    }
                }
                return 0;
            default:
                ShapeDrawable shapeDrawable = ((org.telegram.ui.Wallet.f3) view).e0;
                if (shapeDrawable != null) {
                    return shapeDrawable.getPaint().getColor();
                }
                return 0;
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 0:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
                break;
            case 1:
                MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
                break;
            case 10:
                c2Var.dismiss();
                break;
            case 12:
                Drawable[] drawableArr = PhotoViewer.U8;
                break;
            case 13:
                c2Var.dismiss();
                break;
            case 14:
                c2Var.dismiss();
                break;
            case 16:
                c2Var.dismiss();
                break;
            case 17:
                c2Var.dismiss();
                break;
            case 23:
                c2Var.dismiss();
                break;
            case 27:
                c2Var.dismiss();
                break;
            case 28:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.rw0
    public void i(int i10) {
        SharedConfig.proxyRotationTimeout = i10;
        SharedConfig.saveConfig();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        switch (this.a) {
            case 6:
                int dp = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(200.0f), dp, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                canvas.drawColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false));
                Paint paint = new Paint(1);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                canvas.drawCircle(createBitmap.getWidth() / 2.0f, createBitmap.getHeight() / 2.0f, dp / 2.0f, paint);
                return createBitmap;
            case 7:
                Paint paint2 = new Paint(1);
                paint2.setColor(-14509328);
                int dp2 = AndroidUtilities.dp(150.0f);
                Bitmap createBitmap2 = Bitmap.createBitmap(dp2, dp2, Bitmap.Config.ARGB_8888);
                float f7 = dp2 / 2.0f;
                new Canvas(createBitmap2).drawCircle(f7, f7, f7, paint2);
                return createBitmap2;
            default:
                Pattern pattern = LaunchActivity.E1;
                return new rg0();
        }
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return ((Integer) obj).intValue() == 0 ? ai.nd.Y0(false, LocaleController.formatPluralStringComma("Stars", ((Integer) obj2).intValue()), 0.66f, null) : LocaleController.formatNumber(r4.intValue(), ',');
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        Pattern pattern = LaunchActivity.E1;
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    @Override // org.telegram.ui.Components.rw0
    public /* synthetic */ void m() {
    }
}
