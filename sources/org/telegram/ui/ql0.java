package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class ql0 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ PasscodeActivity d;

    public ql0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.kl0
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
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            i11 = passcodeActivity.fingerprintRow;
            if (i10 == i11) {
                w8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                return;
            } else {
                if (i10 == passcodeActivity.J) {
                    w8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
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
                    rl0 rl0Var = (rl0) view;
                    rl0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    rl0Var.a.d();
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
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == passcodeActivity.G) {
                e9Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
                e9Var.setBackground(null);
                e9Var.getTextView().setGravity(1);
                return;
            } else if (i10 == passcodeActivity.H) {
                e9Var.setText(LocaleController.getString(R.string.AutoLockInfo));
                e9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                return;
            } else {
                if (i10 == passcodeActivity.K) {
                    e9Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
                    e9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
        i12 = passcodeActivity.changePasscodeRow;
        if (i10 == i12) {
            eaVar.b(LocaleController.getString(R.string.ChangePasscode), true);
            if (SharedConfig.passcodeHash.isEmpty()) {
                int i16 = org.telegram.ui.ActionBar.i6.E6;
                eaVar.setTag(Integer.valueOf(i16));
                eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i16, false));
                return;
            } else {
                int i17 = org.telegram.ui.ActionBar.i6.G6;
                eaVar.setTag(Integer.valueOf(i17));
                eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i17, false));
                return;
            }
        }
        i13 = passcodeActivity.autoLockRow;
        if (i10 == i13) {
            int i18 = SharedConfig.autoLockIn;
            eaVar.c(LocaleController.getString(R.string.AutoLock), i18 == 0 ? LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]) : i18 < 3600 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0])) : i18 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i18 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i18 / 60.0f) / 60.0f) / 24.0f), new Object[0])), false, true);
            int i19 = org.telegram.ui.ActionBar.i6.G6;
            eaVar.setTag(Integer.valueOf(i19));
            eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i19, false));
            return;
        }
        i14 = passcodeActivity.disablePasscodeRow;
        if (i10 == i14) {
            eaVar.b(LocaleController.getString(R.string.DisablePasscode), false);
            int i20 = org.telegram.ui.ActionBar.i6.q7;
            eaVar.setTag(Integer.valueOf(i20));
            eaVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i20, false));
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View w8Var;
        Context context = this.c;
        if (i10 == 0) {
            w8Var = new org.telegram.ui.Cells.w8(context);
        } else if (i10 == 1) {
            w8Var = new org.telegram.ui.Cells.ea(context);
        } else if (i10 == 3) {
            w8Var = new org.telegram.ui.Cells.m4(context);
        } else if (i10 != 4) {
            w8Var = new org.telegram.ui.Cells.e9(context);
        } else {
            w8Var = new rl0(context);
            w8Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.vk0(w8Var);
    }
}
