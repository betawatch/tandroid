package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class wk0 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ PasscodeActivity d;

    public wk0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = n1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (b10 == i10) {
            return true;
        }
        i11 = passcodeActivity.autoLockRow;
        if (b10 == i11 || b10 == passcodeActivity.F) {
            return true;
        }
        i12 = passcodeActivity.changePasscodeRow;
        if (b10 == i12) {
            return true;
        }
        i13 = passcodeActivity.disablePasscodeRow;
        return b10 == i13;
    }

    @Override // f2.p0
    public final int h() {
        return this.d.H;
    }

    @Override // f2.p0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        PasscodeActivity passcodeActivity = this.d;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 == i11 || i10 == passcodeActivity.F) {
            return 0;
        }
        i12 = passcodeActivity.changePasscodeRow;
        if (i10 == i12) {
            return 1;
        }
        i13 = passcodeActivity.autoLockRow;
        if (i10 == i13) {
            return 1;
        }
        i14 = passcodeActivity.disablePasscodeRow;
        if (i10 == i14) {
            return 1;
        }
        if (i10 == passcodeActivity.D || i10 == passcodeActivity.G || i10 == passcodeActivity.C) {
            return 2;
        }
        if (i10 == passcodeActivity.E) {
            return 3;
        }
        return i10 == 0 ? 4 : 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = n1Var.f;
        View view = n1Var.a;
        PasscodeActivity passcodeActivity = this.d;
        if (i15 == 0) {
            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
            i11 = passcodeActivity.fingerprintRow;
            if (i10 == i11) {
                q8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                return;
            } else {
                if (i10 == passcodeActivity.F) {
                    q8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
                    return;
                }
                return;
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                if (i15 != 3) {
                    if (i15 != 4) {
                        return;
                    }
                    xk0 xk0Var = (xk0) view;
                    xk0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    xk0Var.a.d();
                    return;
                }
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                k4Var.setHeight(46);
                if (i10 == passcodeActivity.E) {
                    k4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            if (i10 == passcodeActivity.C) {
                y8Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                y8Var.setBackground(null);
                y8Var.getTextView().setGravity(1);
                return;
            } else if (i10 == passcodeActivity.D) {
                y8Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                y8Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                return;
            } else {
                if (i10 == passcodeActivity.G) {
                    y8Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    y8Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
        i12 = passcodeActivity.changePasscodeRow;
        if (i10 == i12) {
            y9Var.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i16 = org.telegram.ui.ActionBar.g6.E6;
                y9Var.setTag(Integer.valueOf(i16));
                y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                return;
            } else {
                int i17 = org.telegram.ui.ActionBar.g6.G6;
                y9Var.setTag(Integer.valueOf(i17));
                y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i17, false));
                return;
            }
        }
        i13 = passcodeActivity.autoLockRow;
        if (i10 == i13) {
            int i18 = SharedConfig.autoLockIn;
            y9Var.c(LocaleController.getString(R.string.AutoLock), i18 == 0 ? LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]) : i18 < 3600 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0])) : i18 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i18 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i18 / 60.0f) / 60.0f) / 24.0f), new Object[0])), false, true);
            int i19 = org.telegram.ui.ActionBar.g6.G6;
            y9Var.setTag(Integer.valueOf(i19));
            y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i19, false));
            return;
        }
        i14 = passcodeActivity.disablePasscodeRow;
        if (i10 == i14) {
            y9Var.b(LocaleController.getString(R.string.DisablePasscode), false);
            int i20 = org.telegram.ui.ActionBar.g6.q7;
            y9Var.setTag(Integer.valueOf(i20));
            y9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        View q8Var;
        Context context = this.c;
        if (i10 == 0) {
            q8Var = new org.telegram.ui.Cells.q8(context);
        } else if (i10 == 1) {
            q8Var = new org.telegram.ui.Cells.y9(context);
        } else if (i10 == 3) {
            q8Var = new org.telegram.ui.Cells.k4(context);
        } else if (i10 != 4) {
            q8Var = new org.telegram.ui.Cells.y8(context);
        } else {
            q8Var = new xk0(context);
            q8Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.vk0(q8Var);
    }
}
