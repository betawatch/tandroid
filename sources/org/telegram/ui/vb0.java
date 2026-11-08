package org.telegram.ui;

import android.app.Dialog;
import android.text.SpannableStringBuilder;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;

    public /* synthetic */ vb0(xb0 xb0Var, int i7) {
        this.a = i7;
        this.b = xb0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final xb0 xb0Var = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i10;
                        int i11 = i7;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xb0 xb0Var2 = xb0Var;
                        int i12 = 0;
                        switch (i11) {
                            case 0:
                                xb0Var2.getClass();
                                if (tL_error2 == null) {
                                    xb0Var2.n = (TL_account.Password) tLObject2;
                                    xb0Var2.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                ce0 ce0Var = xb0Var2.D;
                                ce0Var.C1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        ce0Var.D1(org.telegram.messenger.id.M0(2131742863, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ce0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0();
                                            uy0Var.a |= 256;
                                            uy0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            uy0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.vy0(uy0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746083, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.id.M0(2131746081, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new pu(20, xb0Var2, tL_auth_passwordRecovery));
                                        Dialog showDialog = ce0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                ce0 ce0Var2 = xb0Var2.D;
                                xb0Var2.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i10 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i10).sendRequest(getpassword, new vb0(xb0Var2, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    ce0Var2.C1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (ce0Var2.getParentActivity() != null) {
                                        xb0Var2.a.setText("");
                                        ce0.c1(ce0Var2, xb0Var2.y, true);
                                        break;
                                    }
                                } else {
                                    ce0Var2.N1(false, true);
                                    xb0Var2.postDelayed(new q10(25, xb0Var2, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 1:
                final int i10 = 1;
                final xb0 xb0Var2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i11 = i10;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xb0 xb0Var22 = xb0Var2;
                        int i12 = 0;
                        switch (i11) {
                            case 0:
                                xb0Var22.getClass();
                                if (tL_error2 == null) {
                                    xb0Var22.n = (TL_account.Password) tLObject2;
                                    xb0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                ce0 ce0Var = xb0Var22.D;
                                ce0Var.C1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        ce0Var.D1(org.telegram.messenger.id.M0(2131742863, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ce0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0();
                                            uy0Var.a |= 256;
                                            uy0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            uy0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.vy0(uy0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746083, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.id.M0(2131746081, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new pu(20, xb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = ce0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                ce0 ce0Var2 = xb0Var22.D;
                                xb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new vb0(xb0Var22, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    ce0Var2.C1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (ce0Var2.getParentActivity() != null) {
                                        xb0Var22.a.setText("");
                                        ce0.c1(ce0Var2, xb0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    ce0Var2.N1(false, true);
                                    xb0Var22.postDelayed(new q10(25, xb0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 2;
                final xb0 xb0Var3 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.wb0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i102;
                        int i112 = i11;
                        TLObject tLObject2 = tLObject;
                        TLRPC.TL_error tL_error2 = tL_error;
                        xb0 xb0Var22 = xb0Var3;
                        int i12 = 0;
                        switch (i112) {
                            case 0:
                                xb0Var22.getClass();
                                if (tL_error2 == null) {
                                    xb0Var22.n = (TL_account.Password) tLObject2;
                                    xb0Var22.h(null);
                                    break;
                                }
                                break;
                            case 1:
                                ce0 ce0Var = xb0Var22.D;
                                ce0Var.C1(false, true);
                                if (tL_error2 != null) {
                                    if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                        ce0Var.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error2.text);
                                        break;
                                    } else {
                                        int intValue = Utilities.z(tL_error2.text).intValue();
                                        ce0Var.D1(org.telegram.messenger.id.M0(2131742863, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, intValue < 60 ? org.telegram.messenger.id.G(intValue, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue / 60, "Minutes", new Object[0])));
                                        break;
                                    }
                                } else {
                                    TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject2;
                                    if (ce0Var.getParentActivity() != null) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ce0Var.getParentActivity());
                                        String str = tL_auth_passwordRecovery.email_pattern;
                                        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str);
                                        int indexOf = str.indexOf(42);
                                        int lastIndexOf = str.lastIndexOf(42);
                                        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                            org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0();
                                            uy0Var.a |= 256;
                                            uy0Var.b = indexOf;
                                            int i13 = lastIndexOf + 1;
                                            uy0Var.c = i13;
                                            valueOf.setSpan(new org.telegram.ui.Components.vy0(uy0Var, 0), indexOf, i13, 0);
                                        }
                                        SpannableStringBuilder m0 = org.telegram.messenger.g0.m0(org.telegram.messenger.id.M0(2131746083, null), valueOf);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.T = m0;
                                        u1Var.R = org.telegram.messenger.id.M0(2131746081, "RestoreEmailSentTitle");
                                        alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751771, null), new pu(20, xb0Var22, tL_auth_passwordRecovery));
                                        Dialog showDialog = ce0Var.showDialog(u1Var);
                                        if (showDialog != null) {
                                            showDialog.setCanceledOnTouchOutside(false);
                                            showDialog.setCancelable(false);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                ce0 ce0Var2 = xb0Var22.D;
                                xb0Var22.h = false;
                                if (tL_error2 != null && "SRP_ID_INVALID".equals(tL_error2.text)) {
                                    TL_account.getPassword getpassword = new TL_account.getPassword();
                                    i102 = ((org.telegram.ui.ActionBar.f2) ce0Var2).currentAccount;
                                    ConnectionsManager.getInstance(i102).sendRequest(getpassword, new vb0(xb0Var22, i12), 8);
                                    break;
                                } else if (!(tLObject2 instanceof TLRPC.TL_auth_authorization)) {
                                    ce0Var2.C1(false, true);
                                    if (!tL_error2.text.equals("PASSWORD_HASH_INVALID")) {
                                        if (!tL_error2.text.startsWith("FLOOD_WAIT")) {
                                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), tL_error2.text);
                                            break;
                                        } else {
                                            int intValue2 = Utilities.z(tL_error2.text).intValue();
                                            ce0Var2.D1(org.telegram.messenger.id.M0(2131746074, null), org.telegram.messenger.id.a0("FloodWaitTime", null, 2131750687, intValue2 < 60 ? org.telegram.messenger.id.G(intValue2, "Seconds", new Object[0]) : org.telegram.messenger.id.G(intValue2 / 60, "Minutes", new Object[0])));
                                            break;
                                        }
                                    } else if (ce0Var2.getParentActivity() != null) {
                                        xb0Var22.a.setText("");
                                        ce0.c1(ce0Var2, xb0Var22.y, true);
                                        break;
                                    }
                                } else {
                                    ce0Var2.N1(false, true);
                                    xb0Var22.postDelayed(new q10(25, xb0Var22, tLObject2), 150L);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
