package org.telegram.ui;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x017d  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.uz0 uz0Var;
        final int i10 = 4;
        final int i11 = 3;
        final int i12 = 2;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.aq aqVar = (org.telegram.ui.Components.aq) this.b;
                aqVar.a(!aqVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", aqVar.a.q).apply();
                break;
            case 1:
                ((e60) this.b).b.W0(19);
                break;
            case 2:
                t60 t60Var = ((r60) this.b).I;
                t60Var.X = null;
                t60Var.Z.b();
                t60Var.h.b();
                t60Var.l0();
                t60Var.s0();
                break;
            case 3:
                h70.b0(((f70) this.b).d, null);
                break;
            case 4:
                y70.W((y70) this.b);
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.E0;
                launchActivity.H0 = null;
                launchActivity.u0(new LanguageSelectActivity());
                while (i13 < arrayList.size()) {
                    if (((Dialog) arrayList.get(i13)).isShowing()) {
                        ((Dialog) arrayList.get(i13)).dismiss();
                    }
                    i13++;
                }
                arrayList.clear();
                break;
            case 6:
                fb0 fb0Var = (fb0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fb0Var.getParentActivity());
                alertDialog$Builder.a.T = LocaleController.getString(R.string.RevokeAlert);
                alertDialog$Builder.a.R = LocaleController.getString(R.string.RevokeLink);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new va0(fb0Var, 1 == true ? 1 : 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                fb0Var.showDialog(alertDialog$Builder.a);
                break;
            case 7:
                final le0 le0Var = (le0) this.b;
                ig0 ig0Var = le0Var.y;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ig0Var.getParentActivity());
                alertDialog$Builder2.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder2.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ke0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i14) {
                        switch (i13) {
                            case 0:
                                le0Var.y.z1(6, true, new Bundle(), true);
                                break;
                            default:
                                le0 le0Var2 = le0Var;
                                ig0.o0(le0Var2.y, le0Var2.r, le0Var2.s, le0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder2.h(string, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ke0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i14) {
                        switch (c10) {
                            case 0:
                                le0Var.y.z1(6, true, new Bundle(), true);
                                break;
                            default:
                                le0 le0Var2 = le0Var;
                                ig0.o0(le0Var2.y, le0Var2.r, le0Var2.s, le0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = ig0Var.showDialog(alertDialog$Builder2.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 8:
                ue0 ue0Var = (ue0) this.b;
                ig0 ig0Var2 = ue0Var.G;
                if (ig0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ig0Var2.getParentActivity());
                    alertDialog$Builder3.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder3.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder3.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new st(ue0Var, 20));
                    alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    ig0Var2.showDialog(alertDialog$Builder3.a);
                    break;
                }
                break;
            case 9:
                xe0 xe0Var = (xe0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new we0(xe0Var), NotificationCenter.onActivityResultReceived);
                Context context = xe0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                o6.l.f(str);
                hashSet.add(GoogleSignInOptions.w);
                if (hashSet.contains(GoogleSignInOptions.E)) {
                    Scope scope = GoogleSignInOptions.y;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.x);
                a6.a a2 = a.a.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new org.telegram.ui.Components.voip.k1(29, xe0Var, a2));
                break;
            case 10:
                final ih0 ih0Var = (ih0) this.b;
                lh0 lh0Var = ih0Var.K;
                if (ih0Var.n != null) {
                    View view2 = lh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.l80 F = org.telegram.ui.Components.l80.F((ViewGroup) view2, null, ih0Var);
                        if (ih0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.fh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final ih0 ih0Var2 = ih0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ih0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ih0Var2.K.getParentActivity());
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i14 = 1;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.gh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i15) {
                                                    switch (i14) {
                                                        case 0:
                                                            ih0Var2.K.g0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ih0Var2.K.d0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            ih0 ih0Var3 = ih0Var;
                                            try {
                                                if (ih0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ih0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(ih0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ih0 ih0Var4 = ih0Var;
                                            lh0 lh0Var2 = ih0Var4.K;
                                            try {
                                                if (ih0Var4.n.link != null) {
                                                    Context context2 = ih0Var4.getContext();
                                                    String str2 = ih0Var4.n.link;
                                                    lh0Var2.showDialog(new hh0(ih0Var4, context2, str2, str2, lh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            ih0 ih0Var5 = ih0Var;
                                            lh0 lh0Var3 = ih0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ih0Var5.n;
                                            fb0 fb0Var2 = new fb0(1, lh0Var3.n);
                                            fb0Var2.S = lh0Var3.s0;
                                            fb0Var2.Z(tL_chatInviteExported2);
                                            lh0Var3.presentFragment(fb0Var2);
                                            break;
                                        default:
                                            final ih0 ih0Var6 = ih0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ih0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ih0Var6.K.getParentActivity());
                                            alertDialog$Builder5.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder5.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder5.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.gh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            ih0Var6.K.g0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ih0Var6.K.d0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i14 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            F.c(i14, string2, new Runnable() { // from class: org.telegram.ui.fh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final ih0 ih0Var2 = ih0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ih0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ih0Var2.K.getParentActivity());
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.gh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            ih0Var2.K.g0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ih0Var2.K.d0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            ih0 ih0Var3 = ih0Var;
                                            try {
                                                if (ih0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ih0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(ih0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ih0 ih0Var4 = ih0Var;
                                            lh0 lh0Var2 = ih0Var4.K;
                                            try {
                                                if (ih0Var4.n.link != null) {
                                                    Context context2 = ih0Var4.getContext();
                                                    String str2 = ih0Var4.n.link;
                                                    lh0Var2.showDialog(new hh0(ih0Var4, context2, str2, str2, lh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            ih0 ih0Var5 = ih0Var;
                                            lh0 lh0Var3 = ih0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ih0Var5.n;
                                            fb0 fb0Var2 = new fb0(1, lh0Var3.n);
                                            fb0Var2.S = lh0Var3.s0;
                                            fb0Var2.Z(tL_chatInviteExported2);
                                            lh0Var3.presentFragment(fb0Var2);
                                            break;
                                        default:
                                            final ih0 ih0Var6 = ih0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ih0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ih0Var6.K.getParentActivity());
                                            alertDialog$Builder5.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder5.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder5.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.gh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            ih0Var6.K.g0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ih0Var6.K.d0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.fh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final ih0 ih0Var2 = ih0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ih0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ih0Var2.K.getParentActivity());
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.gh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            ih0Var2.K.g0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ih0Var2.K.d0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            ih0 ih0Var3 = ih0Var;
                                            try {
                                                if (ih0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ih0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(ih0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ih0 ih0Var4 = ih0Var;
                                            lh0 lh0Var2 = ih0Var4.K;
                                            try {
                                                if (ih0Var4.n.link != null) {
                                                    Context context2 = ih0Var4.getContext();
                                                    String str2 = ih0Var4.n.link;
                                                    lh0Var2.showDialog(new hh0(ih0Var4, context2, str2, str2, lh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            ih0 ih0Var5 = ih0Var;
                                            lh0 lh0Var3 = ih0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ih0Var5.n;
                                            fb0 fb0Var2 = new fb0(1, lh0Var3.n);
                                            fb0Var2.S = lh0Var3.s0;
                                            fb0Var2.Z(tL_chatInviteExported2);
                                            lh0Var3.presentFragment(fb0Var2);
                                            break;
                                        default:
                                            final ih0 ih0Var6 = ih0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ih0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ih0Var6.K.getParentActivity());
                                            alertDialog$Builder5.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder5.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder5.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.gh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            ih0Var6.K.g0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ih0Var6.K.d0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.fh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final ih0 ih0Var2 = ih0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ih0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ih0Var2.K.getParentActivity());
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.gh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            ih0Var2.K.g0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ih0Var2.K.d0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            ih0 ih0Var3 = ih0Var;
                                            try {
                                                if (ih0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ih0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(ih0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ih0 ih0Var4 = ih0Var;
                                            lh0 lh0Var2 = ih0Var4.K;
                                            try {
                                                if (ih0Var4.n.link != null) {
                                                    Context context2 = ih0Var4.getContext();
                                                    String str2 = ih0Var4.n.link;
                                                    lh0Var2.showDialog(new hh0(ih0Var4, context2, str2, str2, lh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            ih0 ih0Var5 = ih0Var;
                                            lh0 lh0Var3 = ih0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ih0Var5.n;
                                            fb0 fb0Var2 = new fb0(1, lh0Var3.n);
                                            fb0Var2.S = lh0Var3.s0;
                                            fb0Var2.Z(tL_chatInviteExported2);
                                            lh0Var3.presentFragment(fb0Var2);
                                            break;
                                        default:
                                            final ih0 ih0Var6 = ih0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ih0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ih0Var6.K.getParentActivity());
                                            alertDialog$Builder5.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder5.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder5.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.gh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            ih0Var6.K.g0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ih0Var6.K.d0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, !ih0Var.n.permanent && lh0Var.p0);
                            F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.fh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            final ih0 ih0Var2 = ih0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ih0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ih0Var2.K.getParentActivity());
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.gh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            ih0Var2.K.g0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ih0Var2.K.d0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            ih0 ih0Var3 = ih0Var;
                                            try {
                                                if (ih0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ih0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(ih0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ih0 ih0Var4 = ih0Var;
                                            lh0 lh0Var2 = ih0Var4.K;
                                            try {
                                                if (ih0Var4.n.link != null) {
                                                    Context context2 = ih0Var4.getContext();
                                                    String str2 = ih0Var4.n.link;
                                                    lh0Var2.showDialog(new hh0(ih0Var4, context2, str2, str2, lh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            ih0 ih0Var5 = ih0Var;
                                            lh0 lh0Var3 = ih0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ih0Var5.n;
                                            fb0 fb0Var2 = new fb0(1, lh0Var3.n);
                                            fb0Var2.S = lh0Var3.s0;
                                            fb0Var2.Z(tL_chatInviteExported2);
                                            lh0Var3.presentFragment(fb0Var2);
                                            break;
                                        default:
                                            final ih0 ih0Var6 = ih0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ih0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ih0Var6.K.getParentActivity());
                                            alertDialog$Builder5.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder5.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder5.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.gh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void h(org.telegram.ui.ActionBar.e2 e2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            ih0Var6.K.g0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ih0Var6.K.d0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            ic.a.r(R.string.Cancel, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, LocaleController.getString(R.string.RevokeLink), lh0Var.p0, true);
                        }
                        F.W(lh0Var.b.V0(ih0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 11:
                xi0 xi0Var = (xi0) this.b;
                long j10 = xi0Var.b;
                if (!xi0Var.n.isStory()) {
                    if (xi0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) xi0Var.getParentLayout().getFragmentStack().get(xi0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((r2Var instanceof wn) && ((wn) r2Var).e.id == j10) {
                            xi0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle h = a1.g.h(j10, "chat_id");
                    h.putInt("message_id", xi0Var.c);
                    h.putBoolean("need_remove_previous_same_chat_activity", false);
                    xi0Var.presentFragment(new wn(h));
                    break;
                }
                break;
            case 12:
                zj0.V((zj0) this.b);
                break;
            case 13:
                ((org.telegram.ui.Cells.a9) this.b).setChecked(!r15.e.h);
                break;
            case 14:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.g5.a;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                alertDialog$Builder4.a.R = LocaleController.getString(R.string.ForgotPasscode);
                alertDialog$Builder4.a.T = LocaleController.getString(R.string.ForgotPasscodeInfo);
                alertDialog$Builder4.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder4.a.show();
                break;
            case 15:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i15 = passcodeActivity.x;
                if (i15 != 1) {
                    if (i15 == 2) {
                        passcodeActivity.q0();
                        break;
                    }
                } else if (passcodeActivity.E != 0) {
                    passcodeActivity.q0();
                    break;
                } else {
                    passcodeActivity.r0();
                    break;
                }
                break;
            case 16:
                pl0 pl0Var = (pl0) this.b;
                if (!pl0Var.a.getAnimatedDrawable().k0) {
                    pl0Var.a.getAnimatedDrawable().N(0, false, false);
                    pl0Var.a.d();
                    break;
                }
                break;
            case 17:
                ((PasskeysActivity) this.b).a0(view);
                break;
            case 18:
                gn0 gn0Var = (gn0) this.b;
                if (!gn0Var.J) {
                    int i16 = gn0Var.M;
                    if ((i16 != 4 || gn0Var.L != 2) && i16 != 0) {
                        gn0Var.s();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + gn0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + gn0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + gn0Var.K);
                            gn0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.g5.t0(gn0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 19:
                cq0 cq0Var = (cq0) this.b;
                wn wnVar = cq0Var.F;
                if (wnVar != null && wnVar.c()) {
                    org.telegram.ui.Components.g5.K(cq0Var.getParentActivity(), wnVar.a(), new up0(cq0Var, i13));
                    break;
                } else {
                    cq0Var.W(cq0Var.b, cq0Var.c, true, 0);
                    cq0Var.finishFragment();
                    break;
                }
                break;
            case 20:
                tq0 tq0Var = (tq0) this.b;
                wn wnVar2 = tq0Var.U;
                if (wnVar2 != null && wnVar2.c()) {
                    org.telegram.ui.Components.g5.K(tq0Var.getParentActivity(), wnVar2.a(), new gq0(tq0Var, i13));
                    break;
                } else {
                    tq0Var.f0(0, true);
                    break;
                }
            case 21:
                du0 du0Var = (du0) this.b;
                if (du0Var != null) {
                    du0Var.z(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 22:
                lu0 lu0Var = (lu0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = lu0Var.d;
                int indexOf = photoViewer.g7.indexOf(tag);
                if (indexOf < 0) {
                    int R = photoViewer.d.R(tag);
                    if (R >= 0) {
                        photoViewer.p1.u(R);
                        if (R == 0) {
                            photoViewer.p1.m(0);
                        }
                        photoViewer.D3();
                        break;
                    }
                } else {
                    int k10 = photoViewer.d.k(indexOf, photoViewer.p1());
                    boolean x9 = photoViewer.d.x(indexOf);
                    if (indexOf == photoViewer.P4) {
                        photoViewer.N0.b(x9, true);
                    }
                    if (k10 >= 0) {
                        photoViewer.p1.u(k10);
                        if (k10 == 0) {
                            photoViewer.p1.m(0);
                        }
                    }
                    photoViewer.D3();
                    break;
                }
                break;
            case 23:
                ov0 ov0Var = (ov0) this.b;
                boolean[] zArr = ov0Var.w;
                CharSequence[] charSequenceArr = ov0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view.getParent();
                    s4.e1 G = ov0Var.c.G(h6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i17 = b10 - ov0Var.n0;
                        if (ov0Var.I && i17 < ov0Var.x) {
                            int i18 = -ov0Var.O;
                            ov0Var.O = i18;
                            AndroidUtilities.shakeViewSpring(h6Var, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            ov0Var.b.u(b10);
                            int i19 = i17 + 1;
                            System.arraycopy(charSequenceArr, i19, charSequenceArr, i17, (charSequenceArr.length - 1) - i17);
                            System.arraycopy(zArr, i19, zArr, i17, (zArr.length - 1) - i17);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i20 = ov0Var.y - 1;
                            ov0Var.y = i20;
                            if (ov0Var.r != null) {
                                int[] iArr = new int[i20];
                                while (i13 < i20) {
                                    iArr[i13] = ov0Var.r[i13 >= i17 ? i13 + 1 : i13];
                                    i13++;
                                }
                                ov0Var.r = iArr;
                            }
                            if (ov0Var.y == charSequenceArr.length - 1) {
                                ov0Var.b.o((ov0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.e1 K = ov0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = h6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.h6) {
                                    ((org.telegram.ui.Cells.h6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    ov0Var.j0();
                                    ov0Var.s0();
                                    uz0Var = ov0Var.Q;
                                    if (uz0Var != null) {
                                        uz0Var.f();
                                        ov0Var.Q.setDelegate(null);
                                    }
                                    ov0Var.b.m(ov0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                ov0Var.l0(true);
                            } else if (ov0Var.B0) {
                                ov0Var.l0(true);
                            }
                            textView.clearFocus();
                            ov0Var.j0();
                            ov0Var.s0();
                            uz0Var = ov0Var.Q;
                            if (uz0Var != null) {
                            }
                            ov0Var.b.m(ov0Var.p0);
                        }
                    }
                }
                break;
            case 24:
                ((zv0) this.b).c(true);
                break;
            case 25:
                ((zv0) ((bi.e5) this.b).c).c(true);
                break;
            case 26:
                PrivacyControlActivity privacyControlActivity = ((mx0) this.b).d;
                privacyControlActivity.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) privacyControlActivity, 27, false));
                break;
            case 27:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                int intValue = ((Integer) y1Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.Z;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                y1Var.c(z10, true);
                break;
            case 28:
                u11 u11Var = (u11) this.b;
                ProxyListActivity proxyListActivity = u11Var.s;
                SharedConfig.ProxyInfo proxyInfo = u11Var.d;
                d21 d21Var = new d21(null);
                d21Var.e = new org.telegram.ui.Cells.f7[3];
                d21Var.f = new org.telegram.ui.Cells.i9[2];
                d21Var.s = new org.telegram.ui.Cells.o6[3];
                d21Var.y = 1.0f;
                d21Var.E = new float[2];
                d21Var.F = true;
                d21Var.L = new v11(d21Var);
                d21Var.J = proxyInfo;
                proxyListActivity.presentFragment(d21Var);
                break;
            default:
                w21 w21Var = (w21) this.b;
                fi.d dVar = w21Var.s;
                if (dVar.c0 && !dVar.Q) {
                    dVar.setLoading(true);
                    x21.J(w21Var.v, ((TextView) w21Var.h.c).getText(), w21Var.d.option, w21Var.n.getText().toString());
                    break;
                }
                break;
        }
    }
}
