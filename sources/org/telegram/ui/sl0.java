package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class sl0 extends org.telegram.ui.Components.pm0 {
    public final Context c;
    public final /* synthetic */ PasscodeActivity d;

    public sl0(PasscodeActivity passcodeActivity, Context context) {
        this.d = passcodeActivity;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int b10 = d1Var.b();
        PasscodeActivity passcodeActivity = this.d;
        i10 = passcodeActivity.fingerprintRow;
        if (b10 == i10) {
            return true;
        }
        i11 = passcodeActivity.autoLockRow;
        if (b10 == i11 || b10 == passcodeActivity.N) {
            return true;
        }
        i12 = passcodeActivity.changePasscodeRow;
        if (b10 == i12) {
            return true;
        }
        i13 = passcodeActivity.disablePasscodeRow;
        return b10 == i13 || b10 == passcodeActivity.J || b10 == passcodeActivity.K;
    }

    @Override // s4.i0
    public final int h() {
        return this.d.P;
    }

    @Override // s4.i0
    public final int j(int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        PasscodeActivity passcodeActivity = this.d;
        i11 = passcodeActivity.fingerprintRow;
        if (i10 == i11 || i10 == passcodeActivity.N || i10 == passcodeActivity.K || i10 == passcodeActivity.J) {
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
        if (i10 == passcodeActivity.H || i10 == passcodeActivity.O || i10 == passcodeActivity.G || i10 == passcodeActivity.L) {
            return 2;
        }
        if (i10 == passcodeActivity.M || i10 == passcodeActivity.I) {
            return 3;
        }
        return i10 == 0 ? 4 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01e3, code lost:
    
        if (org.telegram.ui.Wallet.k0.v(r0).G() != false) goto L89;
     */
    @Override // s4.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = d1Var.f;
        View view = d1Var.a;
        boolean z10 = true;
        PasscodeActivity passcodeActivity = this.d;
        if (i18 == 0) {
            org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
            i11 = passcodeActivity.fingerprintRow;
            if (i10 == i11) {
                w8Var.f(LocaleController.getString(R.string.UnlockFingerprint), SharedConfig.useFingerprintLock, false);
                return;
            }
            if (i10 == passcodeActivity.N) {
                w8Var.f(LocaleController.getString(R.string.ScreenCaptureShowContent), SharedConfig.allowScreenCapture, false);
                return;
            }
            if (i10 != passcodeActivity.K) {
                if (i10 == passcodeActivity.J) {
                    String string = LocaleController.getString(R.string.WalletConfirmWithPasscode);
                    i12 = ((org.telegram.ui.ActionBar.n2) passcodeActivity).currentAccount;
                    w8Var.f(string, org.telegram.ui.Wallet.k0.v(i12).H(), false);
                    return;
                }
                return;
            }
            String string2 = LocaleController.getString(R.string.WalletConfirmWithFingerprint);
            i13 = ((org.telegram.ui.ActionBar.n2) passcodeActivity).currentAccount;
            if (org.telegram.ui.Wallet.k0.v(i13).e()) {
                i14 = ((org.telegram.ui.ActionBar.n2) passcodeActivity).currentAccount;
            }
            z10 = false;
            w8Var.f(string2, z10, false);
            return;
        }
        if (i18 == 1) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            i15 = passcodeActivity.changePasscodeRow;
            if (i10 == i15) {
                caVar.b(LocaleController.getString(R.string.ChangePasscode), true);
                if (SharedConfig.passcodeHash.isEmpty()) {
                    int i19 = org.telegram.ui.ActionBar.i6.E6;
                    caVar.setTag(Integer.valueOf(i19));
                    caVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i19, false));
                    return;
                } else {
                    int i20 = org.telegram.ui.ActionBar.i6.G6;
                    caVar.setTag(Integer.valueOf(i20));
                    caVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i20, false));
                    return;
                }
            }
            i16 = passcodeActivity.autoLockRow;
            if (i10 == i16) {
                int i21 = SharedConfig.autoLockIn;
                caVar.c(LocaleController.getString(R.string.AutoLock), i21 == 0 ? LocaleController.formatString("AutoLockDisabled", R.string.AutoLockDisabled, new Object[0]) : i21 < 3600 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Minutes", i21 / 60, new Object[0])) : i21 < 86400 ? LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Hours", (int) Math.ceil((i21 / 60.0f) / 60.0f), new Object[0])) : LocaleController.formatString("AutoLockInTime", R.string.AutoLockInTime, LocaleController.formatPluralString("Days", (int) Math.ceil(((i21 / 60.0f) / 60.0f) / 24.0f), new Object[0])), false, true);
                int i22 = org.telegram.ui.ActionBar.i6.G6;
                caVar.setTag(Integer.valueOf(i22));
                caVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i22, false));
                return;
            }
            i17 = passcodeActivity.disablePasscodeRow;
            if (i10 == i17) {
                caVar.b(LocaleController.getString(R.string.DisablePasscode), false);
                int i23 = org.telegram.ui.ActionBar.i6.q7;
                caVar.setTag(Integer.valueOf(i23));
                caVar.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i23, false));
                return;
            }
            return;
        }
        if (i18 != 2) {
            if (i18 != 3) {
                if (i18 != 4) {
                    return;
                }
                tl0 tl0Var = (tl0) view;
                tl0Var.a.f(R.raw.utyan_passcode, 100, 100, null);
                tl0Var.a.d();
                return;
            }
            org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
            m4Var.setHeight(46);
            if (i10 == passcodeActivity.M) {
                m4Var.setText(LocaleController.getString(R.string.ScreenCaptureHeader));
                return;
            } else {
                if (i10 == passcodeActivity.I) {
                    m4Var.setText(LocaleController.getString(R.string.WalletLock));
                    return;
                }
                return;
            }
        }
        org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
        if (i10 == passcodeActivity.G) {
            e9Var.setText(LocaleController.getString(R.string.PasscodeScreenHint));
            e9Var.setBackground(null);
            e9Var.getTextView().setGravity(1);
        } else if (i10 == passcodeActivity.H) {
            e9Var.setText(LocaleController.getString(R.string.AutoLockInfo));
            e9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
        } else if (i10 == passcodeActivity.L) {
            e9Var.setText(LocaleController.getString(R.string.WalletLockInfo));
            e9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
        } else if (i10 == passcodeActivity.O) {
            e9Var.setText(LocaleController.getString(R.string.ScreenCaptureInfo));
            e9Var.getTextView().setGravity(LocaleController.isRTL ? 5 : 3);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View w8Var;
        Context context = this.c;
        if (i10 == 0) {
            w8Var = new org.telegram.ui.Cells.w8(context);
        } else if (i10 == 1) {
            w8Var = new org.telegram.ui.Cells.ca(context);
        } else if (i10 == 3) {
            w8Var = new org.telegram.ui.Cells.m4(context);
        } else if (i10 != 4) {
            w8Var = new org.telegram.ui.Cells.e9(context);
        } else {
            w8Var = new tl0(context);
            w8Var.setTag(-33024);
        }
        return new org.telegram.ui.Components.am0(w8Var);
    }
}
