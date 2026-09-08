package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class sl0 extends org.telegram.ui.Components.kl0 {
    public final Context c;
    public final /* synthetic */ PasscodeActivity d;

    public sl0(PasscodeActivity passcodeActivity, Context context) {
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
                    tl0 tl0Var = (tl0) view;
                    tl0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                    tl0Var.a.d();
                    return;
                }
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                l4Var.setHeight(46);
                if (i10 == passcodeActivity.I) {
                    l4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
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
                int i16 = org.telegram.ui.ActionBar.j6.E6;
                eaVar.setTag(Integer.valueOf(i16));
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i16, false));
                return;
            } else {
                int i17 = org.telegram.ui.ActionBar.j6.G6;
                eaVar.setTag(Integer.valueOf(i17));
                eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
                return;
            }
        }
        i13 = passcodeActivity.autoLockRow;
        if (i10 == i13) {
            int i18 = SharedConfig.autoLockIn;
            eaVar.c(LocaleController.getString(R.string.AutoLock), i18 == 0 ? LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]) : i18 < 3600 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i18 / 60, new Object[0])) : i18 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i18 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i18 / 60.0f) / 60.0f) / 24.0f), new Object[0])), false, true);
            int i19 = org.telegram.ui.ActionBar.j6.G6;
            eaVar.setTag(Integer.valueOf(i19));
            eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
            return;
        }
        i14 = passcodeActivity.disablePasscodeRow;
        if (i10 == i14) {
            eaVar.b(LocaleController.getString(R.string.DisablePasscode), false);
            int i20 = org.telegram.ui.ActionBar.j6.q7;
            eaVar.setTag(Integer.valueOf(i20));
            eaVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
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
            w8Var = new org.telegram.ui.Cells.l4(context);
        } else if (i10 != 4) {
            w8Var = new org.telegram.ui.Cells.e9(context);
        } else {
            w8Var = new tl0(context);
            w8Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.vk0(w8Var);
    }
}
