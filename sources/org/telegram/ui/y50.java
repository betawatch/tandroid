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
import android.util.LongSparseArray;
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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SaveToGallerySettingsHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y50(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bb  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.gz0 gz0Var;
        int i10 = 19;
        final int i11 = 4;
        final int i12 = 3;
        final int i13 = 2;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                ((z50) this.b).b.T0(19);
                break;
            case 1:
                n60 n60Var = ((l60) this.b).I;
                n60Var.X = null;
                n60Var.Z.b();
                n60Var.h.b();
                n60Var.k0();
                n60Var.r0();
                break;
            case 2:
                c70.a0(((a70) this.b).d, null);
                break;
            case 3:
                t70.V((t70) this.b);
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.E0;
                launchActivity.H0 = null;
                launchActivity.t0(new LanguageSelectActivity());
                while (i14 < arrayList.size()) {
                    if (((Dialog) arrayList.get(i14)).isShowing()) {
                        ((Dialog) arrayList.get(i14)).dismiss();
                    }
                    i14++;
                }
                arrayList.clear();
                break;
            case 5:
                final ie0 ie0Var = (ie0) this.b;
                fg0 fg0Var = ie0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.he0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        switch (i14) {
                            case 0:
                                ie0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ie0 ie0Var2 = ie0Var;
                                fg0.n0(ie0Var2.y, ie0Var2.r, ie0Var2.s, ie0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.he0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        switch (c10) {
                            case 0:
                                ie0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ie0 ie0Var2 = ie0Var;
                                fg0.n0(ie0Var2.y, ie0Var2.r, ie0Var2.s, ie0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = fg0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 6:
                qe0 qe0Var = (qe0) this.b;
                fg0 fg0Var2 = qe0Var.E;
                if (fg0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(fg0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new wt(qe0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    fg0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 7:
                te0 te0Var = (te0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new se0(te0Var), NotificationCenter.onActivityResultReceived);
                Context context = te0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                n6.l.f(str);
                hashSet.add(GoogleSignInOptions.w);
                if (hashSet.contains(GoogleSignInOptions.E)) {
                    Scope scope = GoogleSignInOptions.y;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.x);
                com.google.android.gms.internal.clearcut.v0 a2 = w7.c9.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new ov(22, te0Var, a2));
                break;
            case 8:
                final hh0 hh0Var = (hh0) this.b;
                kh0 kh0Var = hh0Var.K;
                if (hh0Var.n != null) {
                    View view2 = kh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.i80 F = org.telegram.ui.Components.i80.F((ViewGroup) view2, null, hh0Var);
                        if (hh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.eh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final hh0 hh0Var2 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            hh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            hh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            hh0 hh0Var3 = hh0Var;
                                            try {
                                                if (hh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(hh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            hh0 hh0Var4 = hh0Var;
                                            kh0 kh0Var2 = hh0Var4.K;
                                            try {
                                                if (hh0Var4.n.link != null) {
                                                    Context context2 = hh0Var4.getContext();
                                                    String str2 = hh0Var4.n.link;
                                                    kh0Var2.showDialog(new gh0(hh0Var4, context2, str2, str2, kh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            hh0 hh0Var5 = hh0Var;
                                            kh0 kh0Var3 = hh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hh0Var5.n;
                                            cb0 cb0Var = new cb0(1, kh0Var3.n);
                                            cb0Var.T = kh0Var3.s0;
                                            cb0Var.Y(tL_chatInviteExported2);
                                            kh0Var3.presentFragment(cb0Var);
                                            break;
                                        default:
                                            final hh0 hh0Var6 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            hh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            hh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i15 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.eh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final hh0 hh0Var2 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            hh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            hh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            hh0 hh0Var3 = hh0Var;
                                            try {
                                                if (hh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(hh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            hh0 hh0Var4 = hh0Var;
                                            kh0 kh0Var2 = hh0Var4.K;
                                            try {
                                                if (hh0Var4.n.link != null) {
                                                    Context context2 = hh0Var4.getContext();
                                                    String str2 = hh0Var4.n.link;
                                                    kh0Var2.showDialog(new gh0(hh0Var4, context2, str2, str2, kh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            hh0 hh0Var5 = hh0Var;
                                            kh0 kh0Var3 = hh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hh0Var5.n;
                                            cb0 cb0Var = new cb0(1, kh0Var3.n);
                                            cb0Var.T = kh0Var3.s0;
                                            cb0Var.Y(tL_chatInviteExported2);
                                            kh0Var3.presentFragment(cb0Var);
                                            break;
                                        default:
                                            final hh0 hh0Var6 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            hh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            hh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.eh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final hh0 hh0Var2 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            hh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            hh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            hh0 hh0Var3 = hh0Var;
                                            try {
                                                if (hh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(hh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            hh0 hh0Var4 = hh0Var;
                                            kh0 kh0Var2 = hh0Var4.K;
                                            try {
                                                if (hh0Var4.n.link != null) {
                                                    Context context2 = hh0Var4.getContext();
                                                    String str2 = hh0Var4.n.link;
                                                    kh0Var2.showDialog(new gh0(hh0Var4, context2, str2, str2, kh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            hh0 hh0Var5 = hh0Var;
                                            kh0 kh0Var3 = hh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hh0Var5.n;
                                            cb0 cb0Var = new cb0(1, kh0Var3.n);
                                            cb0Var.T = kh0Var3.s0;
                                            cb0Var.Y(tL_chatInviteExported2);
                                            kh0Var3.presentFragment(cb0Var);
                                            break;
                                        default:
                                            final hh0 hh0Var6 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            hh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            hh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.eh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final hh0 hh0Var2 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            hh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            hh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            hh0 hh0Var3 = hh0Var;
                                            try {
                                                if (hh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(hh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            hh0 hh0Var4 = hh0Var;
                                            kh0 kh0Var2 = hh0Var4.K;
                                            try {
                                                if (hh0Var4.n.link != null) {
                                                    Context context2 = hh0Var4.getContext();
                                                    String str2 = hh0Var4.n.link;
                                                    kh0Var2.showDialog(new gh0(hh0Var4, context2, str2, str2, kh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            hh0 hh0Var5 = hh0Var;
                                            kh0 kh0Var3 = hh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hh0Var5.n;
                                            cb0 cb0Var = new cb0(1, kh0Var3.n);
                                            cb0Var.T = kh0Var3.s0;
                                            cb0Var.Y(tL_chatInviteExported2);
                                            kh0Var3.presentFragment(cb0Var);
                                            break;
                                        default:
                                            final hh0 hh0Var6 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            hh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            hh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !hh0Var.n.permanent && kh0Var.p0);
                            F.m(kh0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.eh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final hh0 hh0Var2 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = hh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            hh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            hh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            hh0 hh0Var3 = hh0Var;
                                            try {
                                                if (hh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(hh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            hh0 hh0Var4 = hh0Var;
                                            kh0 kh0Var2 = hh0Var4.K;
                                            try {
                                                if (hh0Var4.n.link != null) {
                                                    Context context2 = hh0Var4.getContext();
                                                    String str2 = hh0Var4.n.link;
                                                    kh0Var2.showDialog(new gh0(hh0Var4, context2, str2, str2, kh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            hh0 hh0Var5 = hh0Var;
                                            kh0 kh0Var3 = hh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hh0Var5.n;
                                            cb0 cb0Var = new cb0(1, kh0Var3.n);
                                            cb0Var.T = kh0Var3.s0;
                                            cb0Var.Y(tL_chatInviteExported2);
                                            kh0Var3.presentFragment(cb0Var);
                                            break;
                                        default:
                                            final hh0 hh0Var6 = hh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.fh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            hh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            hh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i0.a.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(kh0Var.b.V0(hh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 9:
                wi0 wi0Var = (wi0) this.b;
                long j10 = wi0Var.b;
                if (!wi0Var.n.isStory()) {
                    if (wi0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) wi0Var.getParentLayout().getFragmentStack().get(wi0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((n2Var instanceof sn) && ((sn) n2Var).e.id == j10) {
                            wi0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle a10 = z7.g5.a(j10, "chat_id");
                    a10.putInt("message_id", wi0Var.c);
                    a10.putBoolean("need_remove_previous_same_chat_activity", false);
                    wi0Var.presentFragment(new sn(a10));
                    break;
                }
                break;
            case 10:
                ((org.telegram.ui.Cells.v8) this.b).setChecked(!r15.e.h);
                break;
            case 11:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.f5.a;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.ForgotPasscode);
                alertDialog$Builder3.a.T = LocaleController.getString(R.string.ForgotPasscodeInfo);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder3.a.show();
                break;
            case 12:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i16 = passcodeActivity.x;
                if (i16 != 1) {
                    if (i16 == 2) {
                        passcodeActivity.j0();
                        break;
                    }
                } else if (passcodeActivity.E != 0) {
                    passcodeActivity.j0();
                    break;
                } else {
                    passcodeActivity.k0();
                    break;
                }
                break;
            case 13:
                el0 el0Var = (el0) this.b;
                if (!el0Var.a.getAnimatedDrawable().k0) {
                    el0Var.a.getAnimatedDrawable().N(0, false, false);
                    el0Var.a.d();
                    break;
                }
                break;
            case 14:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 15:
                tm0 tm0Var = (tm0) this.b;
                if (!tm0Var.J) {
                    int i17 = tm0Var.M;
                    if ((i17 != 4 || tm0Var.L != 2) && i17 != 0) {
                        tm0Var.t();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + tm0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + tm0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + tm0Var.K);
                            tm0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.f5.t0(tm0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 16:
                tp0 tp0Var = (tp0) this.b;
                sn snVar = tp0Var.F;
                if (snVar != null && snVar.c()) {
                    org.telegram.ui.Components.f5.K(tp0Var.getParentActivity(), snVar.a(), new kp0(tp0Var, i14));
                    break;
                } else {
                    tp0Var.V(tp0Var.b, tp0Var.c, true, 0);
                    tp0Var.finishFragment();
                    break;
                }
            case 17:
                kq0 kq0Var = (kq0) this.b;
                sn snVar2 = kq0Var.U;
                if (snVar2 != null && snVar2.c()) {
                    org.telegram.ui.Components.f5.K(kq0Var.getParentActivity(), snVar2.a(), new xp0(kq0Var, i14));
                    break;
                } else {
                    kq0Var.e0(0, true);
                    break;
                }
            case 18:
                wt0 wt0Var = (wt0) this.b;
                if (wt0Var != null) {
                    wt0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 19:
                eu0 eu0Var = (eu0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = eu0Var.d;
                int indexOf = photoViewer.g7.indexOf(tag);
                if (indexOf < 0) {
                    int R = photoViewer.d.R(tag);
                    if (R >= 0) {
                        photoViewer.p1.u(R);
                        if (R == 0) {
                            photoViewer.p1.m(0);
                        }
                        photoViewer.A3();
                        break;
                    }
                } else {
                    int k10 = photoViewer.d.k(indexOf, photoViewer.n1());
                    boolean x10 = photoViewer.d.x(indexOf);
                    if (indexOf == photoViewer.P4) {
                        photoViewer.N0.b(x10, true);
                    }
                    if (k10 >= 0) {
                        photoViewer.p1.u(k10);
                        if (k10 == 0) {
                            photoViewer.p1.m(0);
                        }
                    }
                    photoViewer.A3();
                    break;
                }
                break;
            case 20:
                hv0 hv0Var = (hv0) this.b;
                boolean[] zArr = hv0Var.w;
                CharSequence[] charSequenceArr = hv0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view.getParent();
                    s4.b1 G = hv0Var.c.G(c6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - hv0Var.n0;
                        if (hv0Var.I && i18 < hv0Var.x) {
                            int i19 = -hv0Var.O;
                            hv0Var.O = i19;
                            AndroidUtilities.shakeViewSpring(c6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            hv0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = hv0Var.y - 1;
                            hv0Var.y = i21;
                            if (hv0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = hv0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                hv0Var.r = iArr;
                            }
                            if (hv0Var.y == charSequenceArr.length - 1) {
                                hv0Var.b.o((hv0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.b1 K = hv0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = c6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    hv0Var.i0();
                                    hv0Var.r0();
                                    gz0Var = hv0Var.Q;
                                    if (gz0Var != null) {
                                        gz0Var.f();
                                        hv0Var.Q.setDelegate(null);
                                    }
                                    hv0Var.b.m(hv0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                hv0Var.k0(true);
                            } else if (hv0Var.B0) {
                                hv0Var.k0(true);
                            }
                            textView.clearFocus();
                            hv0Var.i0();
                            hv0Var.r0();
                            gz0Var = hv0Var.Q;
                            if (gz0Var != null) {
                            }
                            hv0Var.b.m(hv0Var.p0);
                        }
                    }
                }
                break;
            case 21:
                ((sv0) this.b).c(true);
                break;
            case 22:
                ((sv0) ((ai.i5) this.b).c).c(true);
                break;
            case 23:
                PrivacyControlActivity privacyControlActivity = ((ex0) this.b).d;
                privacyControlActivity.showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) privacyControlActivity, 27, false));
                break;
            case 24:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                int intValue = ((Integer) a2Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.Z;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                a2Var.c(z10, true);
                break;
            case 25:
                m11 m11Var = (m11) this.b;
                ProxyListActivity proxyListActivity = m11Var.s;
                SharedConfig.ProxyInfo proxyInfo = m11Var.d;
                u11 u11Var = new u11(null);
                u11Var.e = new org.telegram.ui.Cells.z6[3];
                u11Var.f = new org.telegram.ui.Cells.d9[2];
                u11Var.s = new org.telegram.ui.Cells.j6[3];
                u11Var.y = 1.0f;
                u11Var.E = new float[2];
                u11Var.F = true;
                u11Var.L = new n11(u11Var);
                u11Var.J = proxyInfo;
                proxyListActivity.presentFragment(u11Var);
                break;
            case 26:
                p21 p21Var = (p21) this.b;
                ei.d dVar = p21Var.s;
                if (dVar.W && !dVar.N) {
                    dVar.setLoading(true);
                    q21.I(p21Var.v, ((TextView) p21Var.h.c).getText(), p21Var.d.option, p21Var.n.getText().toString());
                    break;
                }
                break;
            case 27:
                n21 n21Var = (n21) ((ai.n5) this.b).e;
                if (n21Var != null) {
                    n21Var.run();
                    break;
                }
                break;
            case 28:
                ((v21) this.b).dismiss();
                break;
            default:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) this.b;
                if (saveToGallerySettingsActivity.d) {
                    LongSparseArray<SaveToGallerySettingsHelper.DialogException> saveGalleryExceptions = saveToGallerySettingsActivity.getUserConfig().getSaveGalleryExceptions(saveToGallerySettingsActivity.a);
                    SaveToGallerySettingsHelper.DialogException dialogException = saveToGallerySettingsActivity.c;
                    saveGalleryExceptions.put(dialogException.dialogId, dialogException);
                    saveToGallerySettingsActivity.getUserConfig().updateSaveGalleryExceptions(saveToGallerySettingsActivity.a, saveGalleryExceptions);
                }
                saveToGallerySettingsActivity.finishFragment();
                break;
        }
    }
}
