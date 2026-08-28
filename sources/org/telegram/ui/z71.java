package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z71 extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d40, mg0, td.b {
    public org.telegram.ui.Components.z8 A;
    public org.telegram.ui.Components.o9 B;
    public FrameLayout C;
    public FrameLayout D;
    public ImageView E;
    public TextView F;
    public TextView G;
    public TextView H;
    public boolean I;
    public View J;
    public int K;
    public boolean L;
    public ValueAnimator M;
    public final ArrayList N;
    public int O;
    public int P;
    public int Q;
    public final ig.e R;
    public final ng.d S;
    public final ng.d T;
    public ig.k U;
    public final ArrayList V;
    public final RectF W;
    public final RectF X;
    public final td.a a;
    public fh.x4 b;
    public org.telegram.ui.Components.i51 c;
    public kh.h6 d;
    public org.telegram.ui.ActionBar.w0 e;
    public org.telegram.ui.ActionBar.w0 f;
    public r71 h;
    public org.telegram.ui.Components.e40 n;
    public AnimatorSet r;
    public org.telegram.ui.Cells.z3 s;
    public TLRPC.FileLocation v;
    public TLRPC.FileLocation w;
    public FrameLayout x;
    public FrameLayout y;

    public z71() {
        this(null);
    }

    public static boolean T(z71 z71Var, org.telegram.ui.Components.l41 l41Var, View view) {
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            mh.c3.j(z71Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new m71(z71Var, 0));
            return true;
        }
        if (l41Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = l41Var.G;
            String str = obj2 instanceof e01 ? ((e01) obj2).h : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).url : null;
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(z71Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new n21(6, z71Var, str), false);
                H.W(z71Var.c.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void U(z71 z71Var) {
        TLRPC.User user = MessagesController.getInstance(z71Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(z71Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(z71Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.e40 e40Var = z71Var.n;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        e40Var.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new m71(z71Var, 4), new kh.g1(6), 0);
    }

    public static /* synthetic */ void V(z71 z71Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(LaunchActivity.C1, z71Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(z71Var.currentAccount).updateAttachMenuBotsInCache();
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void X(z71 z71Var) {
        String str;
        int i9;
        String string;
        String str2;
        int i10;
        char c10;
        String string2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i11 = z71Var.K + 1;
        z71Var.K = i11;
        if (i11 < 2 && !BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                Toast.makeText(z71Var.getParentActivity(), LocaleController.getString(R.string.DebugMenuLongPress), 0).show();
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z71Var.getParentActivity(), 0, z71Var.resourceProvider);
        String string3 = LocaleController.getString(R.string.DebugMenu);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
        c2Var.N = string3;
        String string4 = LocaleController.getString(R.string.DebugMenuImportContacts);
        String string5 = LocaleController.getString(R.string.DebugMenuReloadContacts);
        String string6 = LocaleController.getString(R.string.DebugMenuResetContacts);
        String string7 = LocaleController.getString(R.string.DebugMenuResetDialogs);
        if (BuildVars.DEBUG_VERSION) {
            string = null;
        } else {
            if (BuildVars.LOGS_ENABLED) {
                str = "DebugMenuDisableLogs";
                i9 = R.string.DebugMenuDisableLogs;
            } else {
                str = "DebugMenuEnableLogs";
                i9 = R.string.DebugMenuEnableLogs;
            }
            string = LocaleController.getString(str, i9);
        }
        if (SharedConfig.inappCamera) {
            str2 = "DebugMenuDisableCamera";
            i10 = R.string.DebugMenuDisableCamera;
        } else {
            str2 = "DebugMenuEnableCamera";
            i10 = R.string.DebugMenuEnableCamera;
        }
        String string8 = LocaleController.getString(str2, i10);
        String string9 = LocaleController.getString("DebugMenuClearMediaCache", R.string.DebugMenuClearMediaCache);
        String string10 = LocaleController.getString(R.string.DebugMenuCallSettings);
        if (BuildVars.DEBUG_PRIVATE_VERSION || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            c10 = 1;
            string2 = LocaleController.getString("DebugMenuCheckAppUpdate", R.string.DebugMenuCheckAppUpdate);
        } else {
            string2 = null;
            c10 = 1;
        }
        String string11 = LocaleController.getString("DebugMenuReadAllDialogs", R.string.DebugMenuReadAllDialogs);
        String str7 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects" : null;
        boolean z10 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str8 = z10 ? "Clean app update" : null;
        String str9 = z10 ? "Reset suggestions" : null;
        String string12 = z10 ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : null;
        String string13 = LocaleController.getString(R.string.DebugMenuClearWebViewCookies);
        String string14 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
        String str10 = (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) ? SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode" : null;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str3 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
        } else {
            str3 = null;
        }
        boolean z11 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str11 = z11 ? "Force remove premium suggestions" : null;
        String str12 = z11 ? "Share device info" : null;
        String str13 = z11 ? "Force performance class" : null;
        String str14 = (!z11 || org.telegram.ui.Components.f50.c()) ? null : !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
        String string15 = LocaleController.getString(kh.d1.q(z71Var.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        String str15 = BuildVars.DEBUG_VERSION ? SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories" : null;
        String str16 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer" : null;
        String str17 = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
        String str18 = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : null;
        String str19 = !SharedConfig.isUsingCamera2(z71Var.currentAccount) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str20 = BuildVars.DEBUG_VERSION ? "Clear Mini Apps Permissions and Files" : null;
        String str21 = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : null;
        if (SharedConfig.canBlurChat()) {
            str4 = string2;
            if (Build.VERSION.SDK_INT >= 31) {
                str5 = SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
                String str22 = !SharedConfig.adaptableColorInBrowser ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
                String str23 = !SharedConfig.debugVideoQualities ? "Disable video qualities debug" : "Enable video qualities debug";
                String str24 = str5;
                if (Build.VERSION.SDK_INT < 28) {
                    str6 = LocaleController.getString(SharedConfig.useSystemBoldFont ? R.string.DebugMenuDontUseSystemBoldFont : R.string.DebugMenuUseSystemBoldFont);
                } else {
                    str6 = null;
                }
                String str25 = SharedConfig.forceForumTabs ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
                String str26 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.fastWallpaperDisabled ? "enable wallpaper shader" : "disable wallpaper shader" : null;
                String str27 = !SharedConfig.frameMetricsEnabled ? "hide frame metrics" : "show frame metrics";
                String str28 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.shadowsInSections ? "disable shadows in settings" : "enable shadows in settings" : null;
                String str29 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.debugViewMetrics ? "disable debug view metrics" : "enable debug view metrics" : null;
                CharSequence[] charSequenceArr = new CharSequence[42];
                charSequenceArr[0] = string4;
                charSequenceArr[c10] = string5;
                charSequenceArr[2] = string6;
                charSequenceArr[3] = string7;
                charSequenceArr[4] = string;
                charSequenceArr[5] = string8;
                charSequenceArr[6] = string9;
                charSequenceArr[7] = string10;
                charSequenceArr[8] = null;
                charSequenceArr[9] = str4;
                charSequenceArr[10] = string11;
                charSequenceArr[11] = str7;
                charSequenceArr[12] = str8;
                charSequenceArr[13] = str9;
                charSequenceArr[14] = string12;
                charSequenceArr[15] = string13;
                charSequenceArr[16] = string14;
                charSequenceArr[17] = str10;
                charSequenceArr[18] = str3;
                charSequenceArr[19] = str11;
                charSequenceArr[20] = str12;
                charSequenceArr[21] = str13;
                charSequenceArr[22] = str14;
                charSequenceArr[23] = string15;
                charSequenceArr[24] = str15;
                charSequenceArr[25] = str16;
                charSequenceArr[26] = str17;
                charSequenceArr[27] = str18;
                charSequenceArr[28] = str19;
                charSequenceArr[29] = str20;
                charSequenceArr[30] = str21;
                charSequenceArr[31] = str24;
                charSequenceArr[32] = str22;
                charSequenceArr[33] = str23;
                charSequenceArr[34] = str6;
                charSequenceArr[35] = "Reload app config";
                charSequenceArr[36] = str25;
                charSequenceArr[37] = "Make Memory Dump";
                charSequenceArr[38] = str26;
                charSequenceArr[39] = str27;
                charSequenceArr[40] = str28;
                charSequenceArr[41] = str29;
                alertDialog$Builder.f(charSequenceArr, new hv(z71Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                z71Var.showDialog(c2Var);
            }
        } else {
            str4 = string2;
        }
        str5 = null;
        if (!SharedConfig.adaptableColorInBrowser) {
        }
        if (!SharedConfig.debugVideoQualities) {
        }
        String str242 = str5;
        if (Build.VERSION.SDK_INT < 28) {
        }
        if (SharedConfig.forceForumTabs) {
        }
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        if (!SharedConfig.frameMetricsEnabled) {
        }
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        if (!BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        CharSequence[] charSequenceArr2 = new CharSequence[42];
        charSequenceArr2[0] = string4;
        charSequenceArr2[c10] = string5;
        charSequenceArr2[2] = string6;
        charSequenceArr2[3] = string7;
        charSequenceArr2[4] = string;
        charSequenceArr2[5] = string8;
        charSequenceArr2[6] = string9;
        charSequenceArr2[7] = string10;
        charSequenceArr2[8] = null;
        charSequenceArr2[9] = str4;
        charSequenceArr2[10] = string11;
        charSequenceArr2[11] = str7;
        charSequenceArr2[12] = str8;
        charSequenceArr2[13] = str9;
        charSequenceArr2[14] = string12;
        charSequenceArr2[15] = string13;
        charSequenceArr2[16] = string14;
        charSequenceArr2[17] = str10;
        charSequenceArr2[18] = str3;
        charSequenceArr2[19] = str11;
        charSequenceArr2[20] = str12;
        charSequenceArr2[21] = str13;
        charSequenceArr2[22] = str14;
        charSequenceArr2[23] = string15;
        charSequenceArr2[24] = str15;
        charSequenceArr2[25] = str16;
        charSequenceArr2[26] = str17;
        charSequenceArr2[27] = str18;
        charSequenceArr2[28] = str19;
        charSequenceArr2[29] = str20;
        charSequenceArr2[30] = str21;
        charSequenceArr2[31] = str242;
        charSequenceArr2[32] = str22;
        charSequenceArr2[33] = str23;
        charSequenceArr2[34] = str6;
        charSequenceArr2[35] = "Reload app config";
        charSequenceArr2[36] = str25;
        charSequenceArr2[37] = "Make Memory Dump";
        charSequenceArr2[38] = str26;
        charSequenceArr2[39] = str27;
        charSequenceArr2[40] = str28;
        charSequenceArr2[41] = str29;
        alertDialog$Builder.f(charSequenceArr2, new hv(z71Var, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        z71Var.showDialog(c2Var);
    }

    public static /* synthetic */ void Y(z71 z71Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        z71Var.actionBar.getTitlesContainer().setAlpha(floatValue);
        z71Var.d.setAlpha(floatValue);
    }

    public static void Z(z71 z71Var, ArrayList arrayList) {
        int i9;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        ArrayList arrayList3 = z71Var.N;
        org.telegram.ui.ActionBar.r0 r0Var = z71Var.e.B;
        int i10 = 0;
        if (r0Var != null && r0Var.getTag() != null) {
            arrayList.add(org.telegram.ui.Components.l41.C(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            r71 r71Var = z71Var.h;
            ArrayList arrayList4 = r71Var.d;
            ArrayList arrayList5 = r71Var.v;
            if (r71Var.w) {
                ArrayList arrayList6 = r71Var.r;
                int size = arrayList6.size();
                int i11 = 0;
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList6.get(i12);
                    i12++;
                    int i13 = i11 + 1;
                    CharSequence charSequence = (CharSequence) r71Var.n.get(i11);
                    int i14 = org.telegram.ui.Cells.u6.a;
                    org.telegram.ui.Components.l41 J = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.u6.class);
                    J.l = charSequence;
                    J.G = (e01) obj;
                    arrayList.add(J);
                    i11 = i13;
                }
                if (r71Var.s.isEmpty()) {
                    return;
                }
                arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                ArrayList arrayList7 = r71Var.s;
                int size2 = arrayList7.size();
                while (i10 < size2) {
                    Object obj2 = arrayList7.get(i10);
                    i10++;
                    int i15 = i11 + 1;
                    CharSequence charSequence2 = (CharSequence) r71Var.n.get(i11);
                    int i16 = org.telegram.ui.Cells.u6.a;
                    org.telegram.ui.Components.l41 J2 = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.u6.class);
                    J2.l = charSequence2;
                    J2.G = (MessagesController.FaqSearchResult) obj2;
                    arrayList.add(J2);
                    i11 = i15;
                }
                return;
            }
            if (!arrayList5.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList5.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj3 = arrayList5.get(i17);
                    i17++;
                    if (obj3 instanceof e01) {
                        e01 e01Var = (e01) obj3;
                        String str = e01Var.a;
                        int i18 = org.telegram.ui.Cells.u6.a;
                        org.telegram.ui.Components.l41 J3 = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.u6.class);
                        J3.l = str;
                        J3.G = e01Var;
                        arrayList.add(J3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str2 = faqSearchResult.title;
                        int i19 = org.telegram.ui.Cells.u6.a;
                        org.telegram.ui.Components.l41 J4 = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.u6.class);
                        J4.l = str2;
                        J4.G = faqSearchResult;
                        arrayList.add(J4);
                    }
                }
            }
            if (arrayList4.isEmpty()) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.l41.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
            int size4 = arrayList4.size();
            while (i10 < size4) {
                Object obj4 = arrayList4.get(i10);
                i10++;
                MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                String str3 = faqSearchResult2.title;
                int i20 = org.telegram.ui.Cells.u6.a;
                org.telegram.ui.Components.l41 J5 = org.telegram.ui.Components.l41.J(org.telegram.ui.Cells.u6.class);
                J5.l = str3;
                J5.G = faqSearchResult2;
                arrayList.add(J5);
            }
            return;
        }
        FrameLayout frameLayout = z71Var.x;
        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(-4);
        l41Var.c = frameLayout;
        l41Var.z = 188;
        arrayList.add(l41Var);
        arrayList3.clear();
        int i21 = 0;
        while (true) {
            i9 = 4;
            if (i21 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i21).isClientActivated() && z71Var.currentAccount != i21) {
                arrayList3.add(Integer.valueOf(i21));
            }
            i21++;
        }
        Collections.sort(arrayList3, new org.telegram.ui.Components.jn0(15));
        Set<String> set = z71Var.getMessagesController().pendingSuggestions;
        int i22 = 1;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(x71.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new n71(z71Var, i10)));
            arrayList.add(org.telegram.ui.Components.l41.B(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && z71Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(x71.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.ll.g(new StringBuilder("+"), z71Var.getUserConfig().getCurrentUser().phone, ne.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new m71(z71Var, i22)), LocaleController.getString(R.string.CheckPhoneNumberNo), new n71(z71Var, i22), gh.k5.g2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new n71(z71Var, 2)));
            arrayList.add(org.telegram.ui.Components.l41.B(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(x71.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new n71(z71Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new n71(z71Var, i9)));
            arrayList.add(org.telegram.ui.Components.l41.B(null));
        }
        if (arrayList3.size() > 0) {
            org.telegram.ui.Cells.j2.l(R.string.SettingsAccounts, arrayList);
            for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                int intValue = ((Integer) arrayList3.get(i23)).intValue();
                int i24 = t71.a;
                org.telegram.ui.Components.l41 J6 = org.telegram.ui.Components.l41.J(t71.class);
                J6.d = i23;
                J6.z = intValue;
                arrayList.add(J6);
            }
            arrayList.add(org.telegram.ui.Components.l41.B(null));
        }
        arrayList.add(v71.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(v71.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(v71.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(v71.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(v71.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(v71.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(v71.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(v71.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(v71.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.l41.B(null));
        if (!z71Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(v71.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence3 = "";
        if (z71Var.getMessagesController().starsPurchaseAvailable()) {
            gh.v7 y10 = gh.v7.y(z71Var.currentAccount, false);
            arrayList.add(v71.a(12, -1071598, -1608430, R.drawable.settings_stars, LocaleController.getString(R.string.TelegramStars), null, (!y10.e || y10.p().amount <= 0) ? "" : gh.oa.I0(y10.p(), 0.85f, ' ')));
        }
        gh.v7.y(z71Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (gh.v7.y(z71Var.currentAccount, true).e && (gh.v7.y(z71Var.currentAccount, true).O(0) || gh.v7.y(z71Var.currentAccount, true).p().positive()))) {
            gh.v7 y11 = gh.v7.y(z71Var.currentAccount, true);
            long j10 = y11.p().amount;
            int i25 = R.drawable.settings_gram_24;
            String string = LocaleController.getString(R.string.MyTON);
            if (y11.e && j10 > 0) {
                charSequence3 = gh.oa.I0(y11.p(), 0.85f, ' ');
            }
            arrayList.add(v71.a(13, -14965523, -15431455, i25, string, null, charSequence3));
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (attachMenuBots != null && (arrayList2 = attachMenuBots.bots) != null && !arrayList2.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList8 = attachMenuBots.bots;
            int size5 = arrayList8.size();
            while (i10 < size5) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList8.get(i10);
                i10++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu && tL_attachMenuBot2.bot_id == 1985737506) {
                    int i26 = R.drawable.settings_wallet;
                    org.telegram.ui.Components.l41 J7 = org.telegram.ui.Components.l41.J(v71.class);
                    long j11 = tL_attachMenuBot2.bot_id;
                    J7.d = (int) (j11 ^ (j11 >>> 32));
                    J7.k = i26;
                    J7.l = tL_attachMenuBot2.short_name;
                    J7.B = ((-15431455) << 32) | ((-14965523) & 4294967295L);
                    J7.G = tL_attachMenuBot2;
                    arrayList.add(J7);
                }
            }
        }
        if (!z71Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(v71.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!z71Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(v71.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.l41) j3.r0.j(1, arrayList)).a != 7) {
            arrayList.add(org.telegram.ui.Components.l41.B(null));
        }
        org.telegram.ui.Cells.j2.l(R.string.SettingsHelp, arrayList);
        arrayList.add(v71.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(v71.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(v71.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(v71.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.l41.B(null));
            org.telegram.ui.Cells.j2.l(R.string.SettingsDebug, arrayList);
            arrayList.add(v71.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(v71.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(v71.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.l41.l(z71Var.H));
    }

    public static /* synthetic */ void a0(z71 z71Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        z71Var.Q = -1;
        if (tL_error == null) {
            TLRPC.User user = z71Var.getMessagesController().getUser(Long.valueOf(z71Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = z71Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                } else {
                    z71Var.getMessagesController().putUser(user, false);
                }
            } else {
                z71Var.getUserConfig().setCurrentUser(user);
            }
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, ImageReceiver.DEFAULT_CROSSFADE_DURATION);
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
            TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, MediaDataController.MAX_STYLE_RUNS_COUNT);
            TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
            user.photo = tL_userProfilePhoto;
            tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
            if (closestPhotoSizeWithSize != null) {
                tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
            }
            if (closestPhotoSizeWithSize2 != null) {
                tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
            }
            if (closestPhotoSizeWithSize != null && z71Var.v != null) {
                FileLoader.getInstance(z71Var.currentAccount).getPathToAttach(z71Var.v, true).renameTo(FileLoader.getInstance(z71Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(z71Var.v.volume_id);
                sb2.append("_");
                String l10 = aa.d.l(z71Var.v.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(l10, aa.d.l(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(z71Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(z71Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && z71Var.w != null) {
                FileLoader.getInstance(z71Var.currentAccount).getPathToAttach(z71Var.w, true).renameTo(FileLoader.getInstance(z71Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            z71Var.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            z71Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = z71Var.getMessagesController().getUserFull(z71Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                z71Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            z71Var.l0(user);
        }
        z71Var.v = null;
        z71Var.w = null;
        z71Var.m0(false, true);
        z71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        z71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        z71Var.getUserConfig().saveConfig(true);
    }

    public static void b0(z71 z71Var, int i9) {
        long j10;
        Long l10;
        int i10 = 1;
        int i11 = 0;
        if (i9 == 0) {
            z71Var.getUserConfig().syncContacts = true;
            z71Var.getUserConfig().saveConfig(false);
            z71Var.getContactsController().forceImportContacts();
            return;
        }
        long j11 = 0;
        if (i9 == 1) {
            z71Var.getContactsController().loadContacts(false, 0L);
            return;
        }
        if (i9 == 2) {
            z71Var.getContactsController().resetImportedContacts();
            return;
        }
        if (i9 == 3) {
            z71Var.getMessagesController().forceResetDialogs();
            return;
        }
        if (i9 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            z71Var.c.U2.N(true);
            if (BuildVars.LOGS_ENABLED) {
                j3.r0.z(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            }
            return;
        }
        if (i9 == 5) {
            SharedConfig.toggleInappCamera();
            return;
        }
        if (i9 == 6) {
            z71Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(org.telegram.messenger.l0.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").apply();
            g7.d6.a();
            SharedPrefsHelper.cleanupAccount(z71Var.currentAccount);
            MessagesController.getEmojiSettings(z71Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
            MessagesController.getGlobalNotificationsSettings().edit().remove("disable_sharing_learn").remove("askedAboutFSILockscreen").apply();
            SharedConfig.textSelectionHintShows = 0;
            SharedConfig.lockRecordAudioVideoHint = 0;
            SharedConfig.stickersReorderingHintUsed = false;
            SharedConfig.forwardingOptionsHintShown = false;
            SharedConfig.replyingOptionsHintShown = false;
            SharedConfig.messageSeenHintCount = 3;
            SharedConfig.emojiInteractionsHintCount = 3;
            SharedConfig.dayNightThemeSwitchHintCount = 3;
            SharedConfig.fastScrollHintCount = 3;
            SharedConfig.stealthModeSendMessageConfirm = 2;
            SharedConfig.updateStealthModeSendMessageConfirm(2);
            SharedConfig.setStoriesReactionsLongPressHintUsed(false);
            SharedConfig.setStoriesIntroShown(false);
            SharedConfig.setMultipleReactionsPromoShowed(false);
            ChatThemeController.getInstance(z71Var.currentAccount).clearCache();
            z71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            b31.V();
            xf.s0.e(z71Var.currentAccount).a();
            SharedPreferences mainSettings = z71Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.l0.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : mainSettings.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    edit.remove(str);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(z71Var.currentAccount).edit();
            for (String str2 : MessagesController.getNotificationsSettings(z71Var.currentAccount).getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    edit2.remove(str2);
                }
            }
            edit2.apply();
            return;
        }
        if (i9 == 7) {
            org.telegram.ui.Components.voip.e2.j(z71Var.getParentActivity());
            return;
        }
        if (i9 == 8) {
            SharedConfig.toggleRoundCamera16to9();
            return;
        }
        if (i9 == 9) {
            ((LaunchActivity) z71Var.getParentActivity()).z(true);
            return;
        }
        if (i9 == 10) {
            z71Var.getMessagesStorage().readAllDialogs(-1);
            return;
        }
        if (i9 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
            return;
        }
        if (i9 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        if (i9 == 13) {
            Set<String> set = z71Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            z71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            return;
        }
        try {
            if (i9 == 14) {
                ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(ApplicationLoader.applicationContext);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i9 == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i9 == 16) {
                SharedConfig.toggleDebugWebView();
                Toast.makeText(z71Var.getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i9 == 17) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity parentActivity = z71Var.getParentActivity();
                if (parentActivity != null) {
                    Intent launchIntentForPackage = parentActivity.getPackageManager().getLaunchIntentForPackage(parentActivity.getPackageName());
                    parentActivity.finishAffinity();
                    parentActivity.startActivity(launchIntentForPackage);
                }
                System.exit(0);
                return;
            }
            if (i9 == 18) {
                g7.v7.a((LaunchActivity) z71Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                return;
            }
            if (i9 == 19) {
                z71Var.getMessagesController().loadAppConfig();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                z71Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new p71(z71Var, i11));
                return;
            }
            if (i9 != 20) {
                if (i9 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(z71Var.getParentActivity(), 0, z71Var.resourceProvider);
                    alertDialog$Builder.a.N = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    alertDialog$Builder.f(new CharSequence[]{AndroidUtilities.replaceTags((devicePerformanceClass == 2 ? "**HIGH**" : "HIGH").concat(measureDevicePerformanceClass == 2 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE").concat(measureDevicePerformanceClass == 1 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 0 ? "**LOW**" : "LOW").concat(measureDevicePerformanceClass == 0 ? " (measured)" : ""))}, new fy0(measureDevicePerformanceClass, i10));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                    return;
                }
                if (i9 == 22) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i9 == 23) {
                    boolean q10 = kh.d1.q(z71Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q10).apply();
                    Toast.makeText(z71Var.getParentActivity(), LocaleController.getString(!q10 ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                    return;
                }
                if (i9 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i11 < z71Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.o2) z71Var.getParentLayout().getFragmentStack().get(i11)).clearSheets();
                        i11++;
                    }
                    return;
                }
                if (i9 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                    return;
                }
                if (i9 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                    return;
                }
                if (i9 == 27) {
                    z71Var.getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i9 == 28) {
                    SharedConfig.toggleUseCamera2(z71Var.currentAccount);
                    return;
                }
                if (i9 == 29) {
                    mh.r.b();
                    mh.u0.c();
                    mh.k0.a();
                    mh.q4.c();
                    return;
                }
                if (i9 == 30) {
                    AuthTokensHelper.clearLogInTokens();
                    return;
                }
                if (i9 == 31) {
                    SharedConfig.toggleUseNewBlur();
                    return;
                }
                if (i9 == 32) {
                    SharedConfig.toggleBrowserAdaptableColors();
                    return;
                }
                if (i9 == 33) {
                    SharedConfig.toggleDebugVideoQualities();
                    return;
                }
                if (i9 == 34) {
                    SharedConfig.toggleUseSystemBoldFont();
                    return;
                }
                if (i9 == 35) {
                    MessagesController.getInstance(z71Var.currentAccount).loadAppConfig(true);
                    return;
                }
                if (i9 == 36) {
                    SharedConfig.toggleForceForumTabs();
                    return;
                }
                if (i9 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                    return;
                }
                if (i9 == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                    return;
                }
                if (i9 == 39) {
                    SharedConfig.toggleFrameMetricsEnabled();
                    LaunchActivity launchActivity = LaunchActivity.C1;
                    if (launchActivity != null) {
                        launchActivity.B();
                        return;
                    }
                    return;
                }
                if (i9 == 40) {
                    SharedPreferences.Editor edit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.shadowsInSections;
                    SharedConfig.shadowsInSections = z10;
                    edit3.putBoolean("shadowsInSections", z10).apply();
                    return;
                }
                if (i9 == 41) {
                    SharedPreferences.Editor edit4 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z11 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z11;
                    edit4.putBoolean("debugViewMetrics", z11).apply();
                    return;
                }
                return;
            }
            int i12 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            StringBuilder sb2 = new StringBuilder();
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            long j19 = 0;
            while (i11 < i12) {
                long j20 = j11;
                Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_min_freq");
                Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_cur_freq");
                Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i11 + "/cpufreq/cpuinfo_max_freq");
                Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i11 + "/cpu_capacity");
                sb2.append("#");
                sb2.append(i11);
                sb2.append(" ");
                int i13 = i11;
                if (sysInfoLong != null) {
                    sb2.append("min=");
                    l10 = sysInfoLong3;
                    sb2.append(sysInfoLong.longValue() / 1000);
                    sb2.append(" ");
                    j12 += sysInfoLong.longValue() / 1000;
                    j13++;
                } else {
                    l10 = sysInfoLong3;
                }
                if (sysInfoLong2 != null) {
                    sb2.append("cur=");
                    sb2.append(sysInfoLong2.longValue() / 1000);
                    sb2.append(" ");
                    j14 += sysInfoLong2.longValue() / 1000;
                    j15++;
                }
                if (l10 != null) {
                    sb2.append("max=");
                    sb2.append(l10.longValue() / 1000);
                    sb2.append(" ");
                    j16 = (l10.longValue() / 1000) + j16;
                    j17++;
                }
                if (sysInfoLong4 != null) {
                    sb2.append("cpc=");
                    sb2.append(sysInfoLong4);
                    sb2.append(" ");
                    j18 = sysInfoLong4.longValue() + j18;
                    j19++;
                }
                sb2.append("\n");
                i11 = i13 + 1;
                j11 = j20;
            }
            long j21 = j11;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Build.MANUFACTURER);
            sb3.append(", ");
            sb3.append(Build.MODEL);
            sb3.append(" (");
            sb3.append(Build.PRODUCT);
            sb3.append(", ");
            sb3.append(Build.DEVICE);
            sb3.append(")  (android ");
            int i14 = Build.VERSION.SDK_INT;
            sb3.append(i14);
            sb3.append(")\n");
            if (i14 >= 31) {
                sb3.append("SoC: ");
                sb3.append(Build.SOC_MANUFACTURER);
                sb3.append(", ");
                sb3.append(Build.SOC_MODEL);
                sb3.append("\n");
            }
            String sysInfoString = AndroidUtilities.getSysInfoString("/sys/kernel/gpu/gpu_model");
            if (sysInfoString != null) {
                sb3.append("GPU: ");
                sb3.append(sysInfoString);
                Long sysInfoLong5 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_min_clock");
                Long sysInfoLong6 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_mm_min_clock");
                Long sysInfoLong7 = AndroidUtilities.getSysInfoLong("/sys/kernel/gpu/gpu_max_clock");
                if (sysInfoLong5 != null) {
                    sb3.append(", min=");
                    j10 = j12;
                    sb3.append(sysInfoLong5.longValue() / 1000);
                } else {
                    j10 = j12;
                }
                if (sysInfoLong6 != null) {
                    sb3.append(", mmin=");
                    sb3.append(sysInfoLong6.longValue() / 1000);
                }
                if (sysInfoLong7 != null) {
                    sb3.append(", max=");
                    sb3.append(sysInfoLong7.longValue() / 1000);
                }
                sb3.append("\n");
            } else {
                j10 = j12;
            }
            ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getDeviceConfigurationInfo();
            sb3.append("GLES Version: ");
            sb3.append(deviceConfigurationInfo.getGlEsVersion());
            sb3.append("\nMemory: class=");
            sb3.append(AndroidUtilities.formatFileSize(memoryClass * 1048576));
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryInfo(memoryInfo);
            sb3.append(", total=");
            sb3.append(AndroidUtilities.formatFileSize(memoryInfo.totalMem));
            sb3.append(", avail=");
            sb3.append(AndroidUtilities.formatFileSize(memoryInfo.availMem));
            sb3.append(", low?=");
            sb3.append(memoryInfo.lowMemory);
            sb3.append(" (threshold=");
            sb3.append(AndroidUtilities.formatFileSize(memoryInfo.threshold));
            sb3.append(")\nCurrent class: ");
            sb3.append(SharedConfig.performanceClassName(SharedConfig.getDevicePerformanceClass()));
            sb3.append(", measured: ");
            sb3.append(SharedConfig.performanceClassName(SharedConfig.measureDevicePerformanceClass()));
            if (i14 >= 31) {
                sb3.append(", suggest=");
                sb3.append(Build.VERSION.MEDIA_PERFORMANCE_CLASS);
            }
            sb3.append("\n");
            sb3.append(i12);
            sb3.append(" CPUs");
            if (j13 > j21) {
                sb3.append(", avgMinFreq=");
                sb3.append(j10 / j13);
            }
            if (j15 > j21) {
                sb3.append(", avgCurFreq=");
                sb3.append(j14 / j15);
            }
            if (j17 > j21) {
                sb3.append(", avgMaxFreq=");
                sb3.append(j16 / j17);
            }
            if (j19 > j21) {
                sb3.append(", avgCapacity=");
                sb3.append(j18 / j19);
            }
            sb3.append("\n");
            sb3.append((CharSequence) sb2);
            j0(MediaController.VIDEO_MIME_TYPE, sb3);
            j0("video/hevc", sb3);
            j0("video/x-vnd.on2.vp8", sb3);
            j0("video/x-vnd.on2.vp9", sb3);
            z71Var.showDialog(new s71(z71Var, z71Var.getParentActivity(), sb3.toString()));
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void c0(z71 z71Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            z71Var.v = fileLocation;
            z71Var.w = photoSize2.location;
            z71Var.B.h(ImageLocation.getForLocal(fileLocation), "90_90", z71Var.A, null);
            z71Var.m0(true, false);
        } else {
            if (z71Var.v == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i9 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i9 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            z71Var.Q = z71Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new v40(29, z71Var, str));
        }
        z71Var.actionBar.n().requestLayout();
    }

    public static void d0(z71 z71Var, org.telegram.ui.Components.l41 l41Var) {
        Object obj = l41Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                fi1.a(z71Var.getParentActivity(), new ih.a2(8, z71Var, tL_attachMenuBot), null);
                return;
            } else {
                LaunchActivity.C0(LaunchActivity.C1, z71Var.currentAccount, tL_attachMenuBot, null, true);
            }
        }
        if (l41Var.G(t71.class)) {
            int i9 = l41Var.z;
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.K0(i9);
                return;
            }
            return;
        }
        if (l41Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = l41Var.G;
            if (obj2 instanceof e01) {
                e01 e01Var = (e01) obj2;
                org.telegram.ui.ActionBar.b5 parentLayout = z71Var.getParentLayout();
                e01Var.b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, e01Var.c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(z71Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, z71Var.h.A, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = l41Var.G;
            if (obj3 != null) {
                z71Var.h.E(obj3);
                return;
            }
            return;
        }
        switch (l41Var.d) {
            case 1:
                z71Var.k0(new UserInfoActivity());
                break;
            case 2:
                z71Var.k0(new ThemeActivity(0));
                break;
            case 3:
                z71Var.k0(new PrivacySettingsActivity());
                break;
            case 5:
                z71Var.k0(new NotificationsSettingsActivity());
                break;
            case 6:
                z71Var.k0(new DataSettingsActivity());
                break;
            case 7:
                z71Var.k0(new FiltersSetupActivity());
                break;
            case 8:
                z71Var.k0(new SessionsActivity(0));
                break;
            case 9:
                z71Var.k0(new sb0());
                break;
            case 10:
                z71Var.k0(new LanguageSelectActivity());
                break;
            case 11:
                z71Var.k0(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                z71Var.k0(new gh.oa());
                break;
            case 13:
                z71Var.k0(new lh.g());
                break;
            case 15:
                z71Var.k0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                bg.g3.d0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                break;
            case 17:
                z71Var.showDialog(org.telegram.ui.Components.y4.U(z71Var, z71Var.resourceProvider));
                break;
            case 18:
                ve.e.s(z71Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                break;
            case 19:
                ve.e.s(z71Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                break;
            case 20:
                ProfileActivity.H4(z71Var.getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.H4(z71Var.getParentActivity(), true);
                break;
            case 22:
                FileLog.cleanupLogs();
                break;
            case 23:
                if (!MessagesController.getInstance(z71Var.currentAccount).isFrozen()) {
                    ve.e.s(z71Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                    break;
                } else {
                    b.b(z71Var.currentAccount);
                    break;
                }
        }
    }

    public static /* synthetic */ void e0(z71 z71Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(z71Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(z71Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new o71(0, z71Var, tL_attachMenuBot), 66);
    }

    public static void j0(String str, StringBuilder sb2) {
        String[] supportedTypes;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i9 = 0; i9 < codecCount; i9++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i9);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i10 = 0;
                    while (true) {
                        if (i10 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i10].equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i9));
                        } else {
                            i10++;
                        }
                    }
                }
            }
            if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                return;
            }
            sb2.append("\n");
            sb2.append(arrayList.size());
            sb2.append("+");
            sb2.append(arrayList2.size());
            sb2.append(" ");
            sb2.append(str.substring(6));
            sb2.append(" codecs:\n");
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (i11 > 0) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i11)).intValue());
                sb2.append("{d} ");
                sb2.append(codecInfoAt2.getName());
                sb2.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt2.isHardwareAccelerated()) {
                        sb2.append("gpu");
                    }
                    if (codecInfoAt2.isSoftwareOnly()) {
                        sb2.append("cpu");
                    }
                    if (codecInfoAt2.isVendor()) {
                        sb2.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfoAt2.getCapabilitiesForType(str);
                sb2.append("; mi=");
                sb2.append(capabilitiesForType.getMaxSupportedInstances());
                sb2.append(")");
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (i12 > 0 || !arrayList.isEmpty()) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i12)).intValue());
                sb2.append("{e} ");
                sb2.append(codecInfoAt3.getName());
                sb2.append(" (");
                if (Build.VERSION.SDK_INT >= 29) {
                    if (codecInfoAt3.isHardwareAccelerated()) {
                        sb2.append("gpu");
                    }
                    if (codecInfoAt3.isSoftwareOnly()) {
                        sb2.append("cpu");
                    }
                    if (codecInfoAt3.isVendor()) {
                        sb2.append(", v");
                    }
                }
                MediaCodecInfo.CodecCapabilities capabilitiesForType2 = codecInfoAt3.getCapabilitiesForType(str);
                sb2.append("; mi=");
                sb2.append(capabilitiesForType2.getMaxSupportedInstances());
                sb2.append(")");
            }
            sb2.append("\n");
        } catch (Exception unused) {
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final void D(float f10) {
        org.telegram.ui.Cells.z3 z3Var = this.s;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(f10);
    }

    @Override // org.telegram.ui.Components.d40
    public final void J(boolean z10, boolean z11) {
        org.telegram.ui.Cells.z3 z3Var = this.s;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(0.0f);
    }

    @Override // td.b
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        if (i9 == 0) {
            i0();
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final void P(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new nh.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.b = new fh.x4(this, context, 8);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.K();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setActionBarMenuOnItemClick(new cd0(this, 25));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.w0 c10 = n10.c(0, R.drawable.outline_header_search, this.resourceProvider);
        c10.F();
        c10.D = new cb(this, 16);
        this.e = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.w0 a2 = n10.a(1, R.drawable.ic_ab_other);
        this.f = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        r71 r71Var = new r71(this, this, context);
        this.h = r71Var;
        r71Var.G();
        org.telegram.ui.Components.i51 i51Var = new org.telegram.ui.Components.i51(this, new a5(this, 26), new q71(this), new q71(this));
        this.c = i51Var;
        i51Var.U2.r = false;
        i51Var.p1();
        this.c.setPadding(0, AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight + this.P);
        this.c.setClipToPadding(false);
        this.c.j(new l3(this, 29));
        org.telegram.ui.Components.i51 i51Var2 = this.c;
        fh.x4 x4Var = this.b;
        Objects.requireNonNull(i51Var2);
        this.U = new ig.k(i51Var2, x4Var, new u8(i51Var2, 0));
        this.c.C0(new m71(this, 2));
        this.b.addView(this.c, g7.e6.e(-1, -1, 119));
        kh.h6 h6Var = new kh.h6(this, context);
        this.d = h6Var;
        this.b.addView(h6Var, g7.e6.e(-1, 200, 48));
        this.b.addView(this.actionBar, g7.e6.e(-1, -2, 55));
        org.telegram.ui.Components.e40 e40Var = new org.telegram.ui.Components.e40(0, true, true);
        this.n = e40Var;
        e40Var.D = true;
        e40Var.a = this;
        e40Var.b = this;
        this.x = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        this.x.addView(frameLayout, g7.e6.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.y.setOnClickListener(new n71(this, 5));
        g7.g6.a(this.y);
        this.A = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.B = o9Var;
        o9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.y.addView(this.B, g7.e6.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(this, context);
        this.s = z3Var;
        z3Var.setSize(AndroidUtilities.dp(26.0f));
        this.s.setProgressColor(-1);
        this.s.setNoProgress(false);
        this.y.addView(this.s, g7.e6.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        m0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.C = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(32.0f), getThemedColor(org.telegram.ui.ActionBar.f6.a7)));
        this.C.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.D = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(30.0f), getThemedColor(org.telegram.ui.ActionBar.f6.Oh)));
        ImageView imageView = new ImageView(context);
        this.E = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.E.setImageResource(R.drawable.filled_premium_camera);
        this.D.addView(this.E, g7.e6.e(22, 22, 17));
        this.C.addView(this.D, g7.e6.c(30.0f, 30));
        this.y.addView(this.C, g7.e6.d(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        g7.g6.a(this.C);
        TextView textView = new TextView(context);
        this.F = textView;
        textView.setTextSize(1, 22.0f);
        this.F.setTypeface(AndroidUtilities.bold());
        this.F.setGravity(17);
        this.F.setSingleLine();
        TextView textView2 = this.F;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView g10 = org.telegram.ui.Cells.j2.g(this.x, this.F, g7.e6.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.G = g10;
        g10.setTextSize(1, 13.0f);
        this.G.setGravity(17);
        this.G.setSingleLine();
        this.G.setEllipsize(truncateAt);
        TextView g11 = org.telegram.ui.Cells.j2.g(this.x, this.G, g7.e6.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.H = g11;
        g11.setTextSize(1, 14.0f);
        this.H.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.B6));
        this.H.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.H.setGravity(17);
        this.H.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.i6), 2, -1));
        this.H.setOnClickListener(new n71(this, 6));
        this.J = new View(context);
        n0(true, false);
        this.c.U2.N(false);
        l0(getUserConfig().getCurrentUser());
        o0();
        i0();
        fh.x4 x4Var2 = this.b;
        q71 q71Var = new q71(this);
        WeakHashMap weakHashMap = r0.j0.a;
        r0.b0.j(x4Var2, q71Var);
        fh.x4 x4Var3 = this.b;
        this.fragmentView = x4Var3;
        return x4Var3;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        org.telegram.ui.Components.i51 i51Var;
        if (i9 == NotificationCenter.starBalanceUpdated) {
            l0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.i51 i51Var2 = this.c;
            if (i51Var2 != null) {
                i51Var2.U2.N(true);
                return;
            }
            return;
        }
        if (i9 == NotificationCenter.updateInterfaces) {
            l0(getUserConfig().getCurrentUser());
        } else {
            if (i9 != NotificationCenter.newSuggestionsAvailable || (i51Var = this.c) == null) {
                return;
            }
            i51Var.U2.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ bu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    public final void h0() {
        ig.e eVar;
        if (Build.VERSION.SDK_INT < 31 || (eVar = this.R) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.O) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.W.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
        RectF rectF = this.X;
        rectF.set(0.0f, dp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        eVar.g(this.I ? 2 : 1, this.V);
        eVar.e(this.U, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    public final void i0() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f;
        td.a aVar = this.a;
        org.telegram.ui.Components.j10.d(w0Var, 1.0f - aVar.e);
        org.telegram.ui.Components.j10.d(this.actionBar.getBackButton(), AndroidUtilities.lerp(this.I ? 0.0f : 1.0f, 1.0f, aVar.e));
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    public final void k0(org.telegram.ui.ActionBar.o2 o2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!AndroidUtilities.isTablet() || (launchActivity = LaunchActivity.C1) == null || (actionBarLayout = launchActivity.o0) == null) {
            presentFragment(o2Var);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.a0((org.telegram.ui.ActionBar.o2) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.l(false, false);
        }
        org.telegram.ui.ActionBar.z4 z4Var = new org.telegram.ui.ActionBar.z4(o2Var);
        z4Var.c = true;
        z4Var.g = true;
        actionBarLayout.R(z4Var);
    }

    public final void l0(TLRPC.User user) {
        String str;
        String str2;
        if (this.B != null && this.Q == -1) {
            this.A.r(user);
            this.B.e(user, this.A);
            this.F.setText(UserObject.getUserName(user));
            StringBuilder sb2 = new StringBuilder();
            if (user != null) {
                sb2.append(ne.b.c().b("+" + user.phone));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                sb2.append(" • @");
                sb2.append(publicUsername);
            }
            this.G.setText(sb2);
            TextView textView = this.H;
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                int i9 = packageInfo.versionCode;
                int i10 = i9 / 10;
                int i11 = i9 % 10;
                if (i11 == 1 || i11 == 2) {
                    str2 = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else if (ApplicationLoader.isStandaloneBuild()) {
                    str2 = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str2 = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                int i12 = R.string.TelegramVersion;
                Locale locale = Locale.US;
                str = LocaleController.formatString(i12, "v" + packageInfo.versionName + " (" + i10 + ")\n" + str2);
            } catch (Exception e10) {
                FileLog.e(e10);
                str = null;
            }
            textView.setText(str);
        }
    }

    public final void m0(boolean z10, boolean z11) {
        if (this.s == null) {
            return;
        }
        AnimatorSet animatorSet = this.r;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.r = null;
        }
        if (!z11) {
            if (z10) {
                this.s.setAlpha(1.0f);
                this.s.setVisibility(0);
                return;
            } else {
                this.s.setAlpha(0.0f);
                this.s.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.r = animatorSet2;
        if (z10) {
            this.s.setVisibility(0);
            this.r.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Cells.z3, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Cells.z3, Float>) View.ALPHA, 0.0f));
        }
        this.r.setDuration(180L);
        this.r.addListener(new n60(9, this, z10));
        this.r.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x003c, code lost:
    
        if ((r0.getY() + r0.getHeight()) >= r4.actionBar.getHeight()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n0(boolean z10, boolean z11) {
        boolean z12;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.r0 r0Var = this.e.B;
        if (r0Var == null || r0Var.getTag() == null) {
            if (this.c.getChildCount() > 0) {
                View childAt = this.c.getChildAt(0);
                this.c.getClass();
                if (RecyclerView.R(childAt) <= 0) {
                }
            }
            z12 = false;
            if (this.L == z12 || z10) {
                this.L = z12;
                valueAnimator = this.M;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.M = null;
                }
                if (z11) {
                    this.actionBar.getTitlesContainer().setAlpha(z12 ? 1.0f : 0.0f);
                    this.d.setAlpha(z12 ? 1.0f : 0.0f);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.actionBar.getTitlesContainer().getAlpha(), z12 ? 1.0f : 0.0f);
                this.M = ofFloat;
                ofFloat.addUpdateListener(new v01(this, 11));
                this.M.setInterpolator(org.telegram.ui.Components.gr.h);
                this.M.setDuration(420L);
                this.M.start();
                return;
            }
            return;
        }
        z12 = true;
        if (this.L == z12) {
        }
        this.L = z12;
        valueAnimator = this.M;
        if (valueAnimator != null) {
        }
        if (z11) {
        }
    }

    public final void o0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        kVar.setTitleColor(getThemedColor(i9));
        this.actionBar.C(getThemedColor(i9), false);
        this.b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.f6.a7));
        this.F.setTextColor(getThemedColor(i9));
        this.G.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.y6));
        this.e.N();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.d6);
        this.J.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.f6.l1(0.0f, themedColor), themedColor}));
        this.d.invalidate();
        this.c.invalidate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (!kVar.j0) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        kVar.h(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.I = bundle.getBoolean("hasMainTabs", false);
        }
        this.P = this.I ? AndroidUtilities.dp(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override // org.telegram.ui.mg0
    public final void s() {
        this.c.x0(0);
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.mg0
    public final ng.d y() {
        return this.T;
    }

    public z71(Bundle bundle) {
        super(bundle);
        this.a = new td.a(0, this, org.telegram.ui.Components.gr.h, 350L, false);
        this.K = 0;
        this.N = new ArrayList();
        this.Q = -1;
        ArrayList arrayList = new ArrayList();
        this.V = arrayList;
        RectF rectF = new RectF();
        this.W = rectF;
        RectF rectF2 = new RectF();
        this.X = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (Build.VERSION.SDK_INT >= 31) {
            this.R = new ig.e(false);
            this.S = new ng.d(null);
            this.T = new ng.d(null);
        } else {
            this.R = null;
            this.S = null;
            this.T = null;
        }
    }

    @Override // org.telegram.ui.Components.d40
    public final /* synthetic */ void O() {
    }

    @Override // td.b
    public final /* synthetic */ void B(float f10, int i9) {
    }
}
