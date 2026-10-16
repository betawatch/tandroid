package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
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
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.lz0 lz0Var;
        int i10 = 19;
        final int i11 = 4;
        final int i12 = 3;
        final int i13 = 2;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                ((u60) this.b).b.T0(19);
                break;
            case 1:
                j70 j70Var = ((h70) this.b).I;
                j70Var.X = null;
                j70Var.Z.b();
                j70Var.h.b();
                j70Var.k0();
                j70Var.r0();
                break;
            case 2:
                y70.a0(((w70) this.b).d, null);
                break;
            case 3:
                p80.V((p80) this.b);
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.E0;
                launchActivity.H0 = null;
                launchActivity.p0(new LanguageSelectActivity());
                while (i14 < arrayList.size()) {
                    if (((Dialog) arrayList.get(i14)).isShowing()) {
                        ((Dialog) arrayList.get(i14)).dismiss();
                    }
                    i14++;
                }
                arrayList.clear();
                break;
            case 5:
                final ef0 ef0Var = (ef0) this.b;
                ah0 ah0Var = ef0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ah0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.df0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i15) {
                        switch (i14) {
                            case 0:
                                ef0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ef0 ef0Var2 = ef0Var;
                                ah0.n0(ef0Var2.y, ef0Var2.r, ef0Var2.s, ef0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.df0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i15) {
                        switch (c10) {
                            case 0:
                                ef0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ef0 ef0Var2 = ef0Var;
                                ah0.n0(ef0Var2.y, ef0Var2.r, ef0Var2.s, ef0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = ah0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 6:
                mf0 mf0Var = (mf0) this.b;
                ah0 ah0Var2 = mf0Var.E;
                if (ah0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ah0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new mu(mf0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    ah0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 7:
                pf0 pf0Var = (pf0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new of0(pf0Var), NotificationCenter.onActivityResultReceived);
                Context context = pf0Var.getContext();
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
                com.google.android.gms.internal.clearcut.u0 a2 = w7.b9.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new qw(21, pf0Var, a2));
                break;
            case 8:
                final ai0 ai0Var = (ai0) this.b;
                di0 di0Var = ai0Var.K;
                if (ai0Var.n != null) {
                    View view2 = di0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.l80 F = org.telegram.ui.Components.l80.F((ViewGroup) view2, null, ai0Var);
                        if (ai0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.xh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final ai0 ai0Var2 = ai0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ai0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ai0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            ai0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ai0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.d.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            ai0 ai0Var3 = ai0Var;
                                            try {
                                                if (ai0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ai0Var3.n.link));
                                                    org.telegram.ui.Components.zc.j(ai0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ai0 ai0Var4 = ai0Var;
                                            di0 di0Var2 = ai0Var4.K;
                                            try {
                                                if (ai0Var4.n.link != null) {
                                                    Context context2 = ai0Var4.getContext();
                                                    String str2 = ai0Var4.n.link;
                                                    di0Var2.showDialog(new zh0(ai0Var4, context2, str2, str2, di0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            ai0 ai0Var5 = ai0Var;
                                            di0 di0Var3 = ai0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ai0Var5.n;
                                            zb0 zb0Var = new zb0(1, di0Var3.n);
                                            zb0Var.T = di0Var3.s0;
                                            zb0Var.Y(tL_chatInviteExported2);
                                            di0Var3.presentFragment(zb0Var);
                                            break;
                                        default:
                                            final ai0 ai0Var6 = ai0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ai0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ai0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            ai0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ai0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.d.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i15 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.xh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final ai0 ai0Var2 = ai0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ai0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ai0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            ai0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ai0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.d.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            ai0 ai0Var3 = ai0Var;
                                            try {
                                                if (ai0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ai0Var3.n.link));
                                                    org.telegram.ui.Components.zc.j(ai0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ai0 ai0Var4 = ai0Var;
                                            di0 di0Var2 = ai0Var4.K;
                                            try {
                                                if (ai0Var4.n.link != null) {
                                                    Context context2 = ai0Var4.getContext();
                                                    String str2 = ai0Var4.n.link;
                                                    di0Var2.showDialog(new zh0(ai0Var4, context2, str2, str2, di0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            ai0 ai0Var5 = ai0Var;
                                            di0 di0Var3 = ai0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ai0Var5.n;
                                            zb0 zb0Var = new zb0(1, di0Var3.n);
                                            zb0Var.T = di0Var3.s0;
                                            zb0Var.Y(tL_chatInviteExported2);
                                            di0Var3.presentFragment(zb0Var);
                                            break;
                                        default:
                                            final ai0 ai0Var6 = ai0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ai0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ai0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            ai0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ai0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.d.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.xh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final ai0 ai0Var2 = ai0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ai0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ai0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            ai0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ai0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.d.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            ai0 ai0Var3 = ai0Var;
                                            try {
                                                if (ai0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ai0Var3.n.link));
                                                    org.telegram.ui.Components.zc.j(ai0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ai0 ai0Var4 = ai0Var;
                                            di0 di0Var2 = ai0Var4.K;
                                            try {
                                                if (ai0Var4.n.link != null) {
                                                    Context context2 = ai0Var4.getContext();
                                                    String str2 = ai0Var4.n.link;
                                                    di0Var2.showDialog(new zh0(ai0Var4, context2, str2, str2, di0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            ai0 ai0Var5 = ai0Var;
                                            di0 di0Var3 = ai0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ai0Var5.n;
                                            zb0 zb0Var = new zb0(1, di0Var3.n);
                                            zb0Var.T = di0Var3.s0;
                                            zb0Var.Y(tL_chatInviteExported2);
                                            di0Var3.presentFragment(zb0Var);
                                            break;
                                        default:
                                            final ai0 ai0Var6 = ai0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ai0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ai0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            ai0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ai0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.d.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.xh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final ai0 ai0Var2 = ai0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ai0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ai0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            ai0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ai0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.d.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            ai0 ai0Var3 = ai0Var;
                                            try {
                                                if (ai0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ai0Var3.n.link));
                                                    org.telegram.ui.Components.zc.j(ai0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ai0 ai0Var4 = ai0Var;
                                            di0 di0Var2 = ai0Var4.K;
                                            try {
                                                if (ai0Var4.n.link != null) {
                                                    Context context2 = ai0Var4.getContext();
                                                    String str2 = ai0Var4.n.link;
                                                    di0Var2.showDialog(new zh0(ai0Var4, context2, str2, str2, di0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            ai0 ai0Var5 = ai0Var;
                                            di0 di0Var3 = ai0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ai0Var5.n;
                                            zb0 zb0Var = new zb0(1, di0Var3.n);
                                            zb0Var.T = di0Var3.s0;
                                            zb0Var.Y(tL_chatInviteExported2);
                                            di0Var3.presentFragment(zb0Var);
                                            break;
                                        default:
                                            final ai0 ai0Var6 = ai0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ai0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ai0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            ai0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ai0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.d.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !ai0Var.n.permanent && di0Var.p0);
                            F.m(di0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.xh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final ai0 ai0Var2 = ai0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ai0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ai0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            ai0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ai0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.d.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            ai0 ai0Var3 = ai0Var;
                                            try {
                                                if (ai0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ai0Var3.n.link));
                                                    org.telegram.ui.Components.zc.j(ai0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ai0 ai0Var4 = ai0Var;
                                            di0 di0Var2 = ai0Var4.K;
                                            try {
                                                if (ai0Var4.n.link != null) {
                                                    Context context2 = ai0Var4.getContext();
                                                    String str2 = ai0Var4.n.link;
                                                    di0Var2.showDialog(new zh0(ai0Var4, context2, str2, str2, di0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            ai0 ai0Var5 = ai0Var;
                                            di0 di0Var3 = ai0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ai0Var5.n;
                                            zb0 zb0Var = new zb0(1, di0Var3.n);
                                            zb0Var.T = di0Var3.s0;
                                            zb0Var.Y(tL_chatInviteExported2);
                                            di0Var3.presentFragment(zb0Var);
                                            break;
                                        default:
                                            final ai0 ai0Var6 = ai0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ai0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ai0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.yh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            ai0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ai0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.d.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(di0Var.b.V0(ai0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 9:
                pj0 pj0Var = (pj0) this.b;
                long j10 = pj0Var.b;
                if (!pj0Var.n.isStory()) {
                    if (pj0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) pj0Var.getParentLayout().getFragmentStack().get(pj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((m2Var instanceof fo) && ((fo) m2Var).e.id == j10) {
                            pj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle e = t8.b.e(j10, "chat_id");
                    e.putInt("message_id", pj0Var.c);
                    e.putBoolean("need_remove_previous_same_chat_activity", false);
                    pj0Var.presentFragment(new fo(e));
                    break;
                }
                break;
            case 10:
                ((org.telegram.ui.Cells.w8) this.b).setChecked(!r1.e.h);
                break;
            case 11:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.g5.a;
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
                xl0 xl0Var = (xl0) this.b;
                if (!xl0Var.a.getAnimatedDrawable().k0) {
                    xl0Var.a.getAnimatedDrawable().N(0, false, false);
                    xl0Var.a.d();
                    break;
                }
                break;
            case 14:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 15:
                on0 on0Var = (on0) this.b;
                if (!on0Var.J) {
                    int i17 = on0Var.M;
                    if ((i17 != 4 || on0Var.L != 2) && i17 != 0) {
                        on0Var.t();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + on0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + on0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + on0Var.K);
                            on0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.g5.t0(on0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 16:
                oq0 oq0Var = (oq0) this.b;
                fo foVar = oq0Var.F;
                if (foVar != null && foVar.c()) {
                    org.telegram.ui.Components.g5.K(oq0Var.getParentActivity(), foVar.a(), new fq0(oq0Var, i14));
                    break;
                } else {
                    oq0Var.V(oq0Var.b, oq0Var.c, true, 0);
                    oq0Var.finishFragment();
                    break;
                }
                break;
            case 17:
                fr0 fr0Var = (fr0) this.b;
                fo foVar2 = fr0Var.U;
                if (foVar2 != null && foVar2.c()) {
                    org.telegram.ui.Components.g5.K(fr0Var.getParentActivity(), foVar2.a(), new sq0(fr0Var, i14));
                    break;
                } else {
                    fr0Var.e0(0, true);
                    break;
                }
                break;
            case 18:
                uu0 uu0Var = (uu0) this.b;
                if (uu0Var != null) {
                    uu0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 19:
                cv0 cv0Var = (cv0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = cv0Var.d;
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
                fw0 fw0Var = (fw0) this.b;
                boolean[] zArr = fw0Var.w;
                CharSequence[] charSequenceArr = fw0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view.getParent();
                    s4.b1 G = fw0Var.c.G(d6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - fw0Var.n0;
                        if (fw0Var.I && i18 < fw0Var.x) {
                            int i19 = -fw0Var.O;
                            fw0Var.O = i19;
                            AndroidUtilities.shakeViewSpring(d6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            fw0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = fw0Var.y - 1;
                            fw0Var.y = i21;
                            if (fw0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = fw0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                fw0Var.r = iArr;
                            }
                            if (fw0Var.y == charSequenceArr.length - 1) {
                                fw0Var.b.o((fw0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.b1 K = fw0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = d6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    fw0Var.i0();
                                    fw0Var.r0();
                                    lz0Var = fw0Var.Q;
                                    if (lz0Var != null) {
                                        lz0Var.f();
                                        fw0Var.Q.setDelegate(null);
                                    }
                                    fw0Var.b.m(fw0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                fw0Var.k0(true);
                            } else if (fw0Var.B0) {
                                fw0Var.k0(true);
                            }
                            textView.clearFocus();
                            fw0Var.i0();
                            fw0Var.r0();
                            lz0Var = fw0Var.Q;
                            if (lz0Var != null) {
                            }
                            fw0Var.b.m(fw0Var.p0);
                        }
                    }
                }
                break;
            case 21:
                ((rw0) this.b).c(true);
                break;
            case 22:
                ((rw0) ((nw0) this.b).c).c(true);
                break;
            case 23:
                PrivacyControlActivity privacyControlActivity = ((ey0) this.b).d;
                privacyControlActivity.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) privacyControlActivity, 27, false));
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
                n21 n21Var = (n21) this.b;
                ProxyListActivity proxyListActivity = n21Var.s;
                SharedConfig.ProxyInfo proxyInfo = n21Var.d;
                v21 v21Var = new v21(null);
                v21Var.e = new org.telegram.ui.Cells.a7[3];
                v21Var.f = new org.telegram.ui.Cells.e9[2];
                v21Var.s = new org.telegram.ui.Cells.k6[3];
                v21Var.y = 1.0f;
                v21Var.E = new float[2];
                v21Var.F = true;
                v21Var.L = new o21(v21Var);
                v21Var.J = proxyInfo;
                proxyListActivity.presentFragment(v21Var);
                break;
            case 26:
                k31 k31Var = (k31) this.b;
                ValueAnimator valueAnimator = k31Var.N;
                if (valueAnimator == null) {
                    boolean z11 = !k31Var.M;
                    l31 l31Var = k31Var.d;
                    i31 i31Var = k31Var.F;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) l31Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) k31Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    i31Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    i31Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    i31Var.getLocationInWindow(iArr2);
                    float f7 = iArr2[0];
                    float f10 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    k31Var.O = new di.sb(k31Var, l31Var.getParentActivity(), z11, canvas, (i31Var.getMeasuredWidth() / 2.0f) + f7, (i31Var.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 2);
                    k31Var.P = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    k31Var.N = ofFloat;
                    ofFloat.addUpdateListener(new f21(k31Var, i12));
                    k31Var.N.addListener(new kj0(k31Var, 20));
                    k31Var.N.setDuration(400L);
                    k31Var.N.setInterpolator(org.telegram.ui.Components.xt.e);
                    k31Var.N.start();
                    frameLayout2.addView(k31Var.O, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.zr0(13, k31Var, z11));
                    break;
                }
                break;
            case 27:
                h41 h41Var = (h41) this.b;
                di.d dVar = h41Var.s;
                if (dVar.W && !dVar.N) {
                    dVar.setLoading(true);
                    i41.I(h41Var.v, ((TextView) h41Var.h.d).getText(), h41Var.d.option, h41Var.n.getText().toString());
                    break;
                }
                break;
            case 28:
                f41 f41Var = (f41) ((x5) this.b).e;
                if (f41Var != null) {
                    f41Var.run();
                    break;
                }
                break;
            default:
                ((n41) this.b).dismiss();
                break;
        }
    }
}
