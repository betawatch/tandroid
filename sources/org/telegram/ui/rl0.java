package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class rl0 extends org.telegram.ui.Components.ul0 {
    public final Context c;
    public final /* synthetic */ PasscodeActivity d;

    public rl0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = c1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (b10 == i10) {
            return true;
        }
        i11 = passcodeActivity.autoLockRow;
        if (b10 == i11 || b10 == passcodeActivity.J) {
            return true;
        }
        i12 = passcodeActivity.changePasscodeRow;
        if (b10 == i12) {
            return true;
        }
        i13 = passcodeActivity.disablePasscodeRow;
        return b10 == i13;
    }

    @Override // s4.h0
    public final int h() {
        return this.d.L;
    }

    @Override // s4.h0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        PasscodeActivity passcodeActivity = this.d;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 == i11 || i10 == passcodeActivity.J) {
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
        if (i10 == passcodeActivity.H || i10 == passcodeActivity.K || i10 == passcodeActivity.G) {
            return 2;
        }
        if (i10 == passcodeActivity.I) {
            return 3;
        }
        return i10 == 0 ? 4 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = c1Var.f;
        View view = c1Var.a;
        PasscodeActivity passcodeActivity = this.d;
        if (i15 == 0) {
            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
            i11 = passcodeActivity.fingerprintRow;
            if (i10 == i11) {
                x8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                return;
            } else {
                if (i10 == passcodeActivity.J) {
                    x8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
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
                    sl0 sl0Var = (sl0) view;
                    sl0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    sl0Var.a.d();
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setHeight(46);
                if (i10 == passcodeActivity.I) {
                    m4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            if (i10 == passcodeActivity.G) {
                f9Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                f9Var.setBackground(null);
                f9Var.getTextView().setGravity(1);
                return;
            } else if (i10 == passcodeActivity.H) {
                f9Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                f9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                return;
            } else {
                if (i10 == passcodeActivity.K) {
                    f9Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    f9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
        i12 = passcodeActivity.changePasscodeRow;
        if (i10 == i12) {
            gaVar.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i16 = org.telegram.ui.ActionBar.j6.E6;
                gaVar.setTag(Integer.valueOf(i16));
                gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                return;
            } else {
                int i17 = org.telegram.ui.ActionBar.j6.G6;
                gaVar.setTag(Integer.valueOf(i17));
                gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                return;
            }
        }
        i13 = passcodeActivity.autoLockRow;
        if (i10 == i13) {
            int i18 = SharedConfig.autoLockIn;
            gaVar.c(LocaleController.getString(R.string.AutoLock), i18 == 0 ? LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]) : i18 < 3600 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0])) : i18 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i18 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i18 / 60.0f) / 60.0f) / 24.0f), new Object[0])), false, true);
            int i19 = org.telegram.ui.ActionBar.j6.G6;
            gaVar.setTag(Integer.valueOf(i19));
            gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
            return;
        }
        i14 = passcodeActivity.disablePasscodeRow;
        if (i10 == i14) {
            gaVar.b(LocaleController.getString(R.string.DisablePasscode), false);
            int i20 = org.telegram.ui.ActionBar.j6.q7;
            gaVar.setTag(Integer.valueOf(i20));
            gaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View x8Var;
        Context context = this.c;
        if (i10 == 0) {
            x8Var = new org.telegram.ui.Cells.x8(context);
        } else if (i10 == 1) {
            x8Var = new org.telegram.ui.Cells.ga(context);
        } else if (i10 == 3) {
            x8Var = new org.telegram.ui.Cells.m4(context);
        } else if (i10 != 4) {
            x8Var = new org.telegram.ui.Cells.f9(context);
        } else {
            x8Var = new sl0(context);
            x8Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.fl0(x8Var);
    }
}
