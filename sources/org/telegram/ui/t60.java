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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        org.telegram.ui.Components.kz0 kz0Var;
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
                final ff0 ff0Var = (ff0) this.b;
                bh0 bh0Var = ff0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bh0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.ef0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i15) {
                        switch (i14) {
                            case 0:
                                ff0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ff0 ff0Var2 = ff0Var;
                                bh0.n0(ff0Var2.y, ff0Var2.r, ff0Var2.s, ff0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.ef0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i15) {
                        switch (c10) {
                            case 0:
                                ff0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ff0 ff0Var2 = ff0Var;
                                bh0.n0(ff0Var2.y, ff0Var2.r, ff0Var2.s, ff0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = bh0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 6:
                nf0 nf0Var = (nf0) this.b;
                bh0 bh0Var2 = nf0Var.E;
                if (bh0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(bh0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new mu(nf0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    bh0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 7:
                qf0 qf0Var = (qf0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new pf0(qf0Var), NotificationCenter.onActivityResultReceived);
                Context context = qf0Var.getContext();
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
                a2.g().addOnCompleteListener(new gw(22, qf0Var, a2));
                break;
            case 8:
                final bi0 bi0Var = (bi0) this.b;
                ei0 ei0Var = bi0Var.K;
                if (bi0Var.n != null) {
                    View view2 = ei0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.m80 F = org.telegram.ui.Components.m80.F((ViewGroup) view2, null, bi0Var);
                        if (bi0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.yh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final bi0 bi0Var2 = bi0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = bi0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bi0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.zh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            bi0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            bi0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            bi0 bi0Var3 = bi0Var;
                                            try {
                                                if (bi0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bi0Var3.n.link));
                                                    org.telegram.ui.Components.zc.j(bi0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            bi0 bi0Var4 = bi0Var;
                                            ei0 ei0Var2 = bi0Var4.K;
                                            try {
                                                if (bi0Var4.n.link != null) {
                                                    Context context2 = bi0Var4.getContext();
                                                    String str2 = bi0Var4.n.link;
                                                    ei0Var2.showDialog(new ai0(bi0Var4, context2, str2, str2, ei0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            bi0 bi0Var5 = bi0Var;
                                            ei0 ei0Var3 = bi0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bi0Var5.n;
                                            ac0 ac0Var = new ac0(1, ei0Var3.n);
                                            ac0Var.T = ei0Var3.s0;
                                            ac0Var.Y(tL_chatInviteExported2);
                                            ei0Var3.presentFragment(ac0Var);
                                            break;
                                        default:
                                            final bi0 bi0Var6 = bi0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bi0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bi0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.zh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            bi0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            bi0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i15 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.yh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final bi0 bi0Var2 = bi0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = bi0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bi0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.zh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            bi0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            bi0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            bi0 bi0Var3 = bi0Var;
                                            try {
                                                if (bi0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bi0Var3.n.link));
                                                    org.telegram.ui.Components.zc.j(bi0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            bi0 bi0Var4 = bi0Var;
                                            ei0 ei0Var2 = bi0Var4.K;
                                            try {
                                                if (bi0Var4.n.link != null) {
                                                    Context context2 = bi0Var4.getContext();
                                                    String str2 = bi0Var4.n.link;
                                                    ei0Var2.showDialog(new ai0(bi0Var4, context2, str2, str2, ei0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            bi0 bi0Var5 = bi0Var;
                                            ei0 ei0Var3 = bi0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bi0Var5.n;
                                            ac0 ac0Var = new ac0(1, ei0Var3.n);
                                            ac0Var.T = ei0Var3.s0;
                                            ac0Var.Y(tL_chatInviteExported2);
                                            ei0Var3.presentFragment(ac0Var);
                                            break;
                                        default:
                                            final bi0 bi0Var6 = bi0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bi0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bi0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.zh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            bi0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            bi0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.yh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final bi0 bi0Var2 = bi0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = bi0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bi0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.zh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            bi0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            bi0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            bi0 bi0Var3 = bi0Var;
                                            try {
                                                if (bi0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bi0Var3.n.link));
                                                    org.telegram.ui.Components.zc.j(bi0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            bi0 bi0Var4 = bi0Var;
                                            ei0 ei0Var2 = bi0Var4.K;
                                            try {
                                                if (bi0Var4.n.link != null) {
                                                    Context context2 = bi0Var4.getContext();
                                                    String str2 = bi0Var4.n.link;
                                                    ei0Var2.showDialog(new ai0(bi0Var4, context2, str2, str2, ei0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            bi0 bi0Var5 = bi0Var;
                                            ei0 ei0Var3 = bi0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bi0Var5.n;
                                            ac0 ac0Var = new ac0(1, ei0Var3.n);
                                            ac0Var.T = ei0Var3.s0;
                                            ac0Var.Y(tL_chatInviteExported2);
                                            ei0Var3.presentFragment(ac0Var);
                                            break;
                                        default:
                                            final bi0 bi0Var6 = bi0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bi0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bi0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.zh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            bi0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            bi0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.yh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final bi0 bi0Var2 = bi0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = bi0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bi0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.zh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            bi0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            bi0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            bi0 bi0Var3 = bi0Var;
                                            try {
                                                if (bi0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bi0Var3.n.link));
                                                    org.telegram.ui.Components.zc.j(bi0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            bi0 bi0Var4 = bi0Var;
                                            ei0 ei0Var2 = bi0Var4.K;
                                            try {
                                                if (bi0Var4.n.link != null) {
                                                    Context context2 = bi0Var4.getContext();
                                                    String str2 = bi0Var4.n.link;
                                                    ei0Var2.showDialog(new ai0(bi0Var4, context2, str2, str2, ei0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            bi0 bi0Var5 = bi0Var;
                                            ei0 ei0Var3 = bi0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bi0Var5.n;
                                            ac0 ac0Var = new ac0(1, ei0Var3.n);
                                            ac0Var.T = ei0Var3.s0;
                                            ac0Var.Y(tL_chatInviteExported2);
                                            ei0Var3.presentFragment(ac0Var);
                                            break;
                                        default:
                                            final bi0 bi0Var6 = bi0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bi0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bi0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.zh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            bi0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            bi0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !bi0Var.n.permanent && ei0Var.p0);
                            F.m(ei0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.yh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final bi0 bi0Var2 = bi0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = bi0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(bi0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.zh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            bi0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            bi0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            bi0 bi0Var3 = bi0Var;
                                            try {
                                                if (bi0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bi0Var3.n.link));
                                                    org.telegram.ui.Components.zc.j(bi0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            bi0 bi0Var4 = bi0Var;
                                            ei0 ei0Var2 = bi0Var4.K;
                                            try {
                                                if (bi0Var4.n.link != null) {
                                                    Context context2 = bi0Var4.getContext();
                                                    String str2 = bi0Var4.n.link;
                                                    ei0Var2.showDialog(new ai0(bi0Var4, context2, str2, str2, ei0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            bi0 bi0Var5 = bi0Var;
                                            ei0 ei0Var3 = bi0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bi0Var5.n;
                                            ac0 ac0Var = new ac0(1, ei0Var3.n);
                                            ac0Var.T = ei0Var3.s0;
                                            ac0Var.Y(tL_chatInviteExported2);
                                            ei0Var3.presentFragment(ac0Var);
                                            break;
                                        default:
                                            final bi0 bi0Var6 = bi0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bi0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bi0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.zh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            bi0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            bi0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            org.telegram.messenger.q.q(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(ei0Var.b.V0(bi0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 9:
                qj0 qj0Var = (qj0) this.b;
                long j10 = qj0Var.b;
                if (!qj0Var.n.isStory()) {
                    if (qj0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) qj0Var.getParentLayout().getFragmentStack().get(qj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((m2Var instanceof fo) && ((fo) m2Var).e.id == j10) {
                            qj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle e = t8.b.e(j10, "chat_id");
                    e.putInt("message_id", qj0Var.c);
                    e.putBoolean("need_remove_previous_same_chat_activity", false);
                    qj0Var.presentFragment(new fo(e));
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
                zl0 zl0Var = (zl0) this.b;
                if (!zl0Var.a.getAnimatedDrawable().k0) {
                    zl0Var.a.getAnimatedDrawable().N(0, false, false);
                    zl0Var.a.d();
                    break;
                }
                break;
            case 14:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 15:
                qn0 qn0Var = (qn0) this.b;
                if (!qn0Var.J) {
                    int i17 = qn0Var.M;
                    if ((i17 != 4 || qn0Var.L != 2) && i17 != 0) {
                        qn0Var.t();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + qn0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + qn0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + qn0Var.K);
                            qn0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.g5.t0(qn0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 16:
                qq0 qq0Var = (qq0) this.b;
                fo foVar = qq0Var.F;
                if (foVar != null && foVar.c()) {
                    org.telegram.ui.Components.g5.K(qq0Var.getParentActivity(), foVar.a(), new hq0(qq0Var, i14));
                    break;
                } else {
                    qq0Var.V(qq0Var.b, qq0Var.c, true, 0);
                    qq0Var.finishFragment();
                    break;
                }
                break;
            case 17:
                hr0 hr0Var = (hr0) this.b;
                fo foVar2 = hr0Var.U;
                if (foVar2 != null && foVar2.c()) {
                    org.telegram.ui.Components.g5.K(hr0Var.getParentActivity(), foVar2.a(), new uq0(hr0Var, i14));
                    break;
                } else {
                    hr0Var.e0(0, true);
                    break;
                }
                break;
            case 18:
                vu0 vu0Var = (vu0) this.b;
                if (vu0Var != null) {
                    vu0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 19:
                dv0 dv0Var = (dv0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = dv0Var.d;
                int indexOf = photoViewer.g7.indexOf(tag);
                if (indexOf < 0) {
                    int Q = photoViewer.d.Q(tag);
                    if (Q >= 0) {
                        photoViewer.p1.u(Q);
                        if (Q == 0) {
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
                gw0 gw0Var = (gw0) this.b;
                boolean[] zArr = gw0Var.w;
                CharSequence[] charSequenceArr = gw0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view.getParent();
                    s4.b1 G = gw0Var.c.G(d6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - gw0Var.n0;
                        if (gw0Var.I && i18 < gw0Var.x) {
                            int i19 = -gw0Var.O;
                            gw0Var.O = i19;
                            AndroidUtilities.shakeViewSpring(d6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            gw0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = gw0Var.y - 1;
                            gw0Var.y = i21;
                            if (gw0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = gw0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                gw0Var.r = iArr;
                            }
                            if (gw0Var.y == charSequenceArr.length - 1) {
                                gw0Var.b.o((gw0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.b1 K = gw0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = d6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    gw0Var.i0();
                                    gw0Var.r0();
                                    kz0Var = gw0Var.Q;
                                    if (kz0Var != null) {
                                        kz0Var.f();
                                        gw0Var.Q.setDelegate(null);
                                    }
                                    gw0Var.b.m(gw0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                gw0Var.k0(true);
                            } else if (gw0Var.B0) {
                                gw0Var.k0(true);
                            }
                            textView.clearFocus();
                            gw0Var.i0();
                            gw0Var.r0();
                            kz0Var = gw0Var.Q;
                            if (kz0Var != null) {
                            }
                            gw0Var.b.m(gw0Var.p0);
                        }
                    }
                }
                break;
            case 21:
                ((sw0) this.b).c(true);
                break;
            case 22:
                ((sw0) ((ow0) this.b).c).c(true);
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
                v21Var.e = new org.telegram.ui.Cells.b7[3];
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
                    k31Var.N.addListener(new lj0(k31Var, 20));
                    k31Var.N.setDuration(400L);
                    k31Var.N.setInterpolator(org.telegram.ui.Components.xt.e);
                    k31Var.N.start();
                    frameLayout2.addView(k31Var.O, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sn0(13, k31Var, z11));
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
