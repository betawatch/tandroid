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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class x71 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.d50, mg0, ne.d {
    public org.telegram.ui.Components.h9 E;
    public org.telegram.ui.Components.w9 F;
    public FrameLayout G;
    public FrameLayout H;
    public ImageView I;
    public TextView J;
    public TextView K;
    public TextView L;
    public boolean M;
    public View N;
    public int O;
    public boolean P;
    public ValueAnimator Q;
    public final ArrayList R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public final bh.f W;
    public final gh.d X;
    public final gh.d Y;
    public bh.l Z;
    public final ne.b a;
    public final ArrayList a0;
    public y8 b;
    public final RectF b0;
    public org.telegram.ui.Components.c71 c;
    public final RectF c0;
    public ei.g6 d;
    public org.telegram.ui.ActionBar.u0 e;
    public org.telegram.ui.ActionBar.u0 f;
    public p71 h;
    public org.telegram.ui.Components.e50 n;
    public AnimatorSet r;
    public org.telegram.ui.Cells.y3 s;
    public TLRPC.FileLocation v;
    public TLRPC.FileLocation w;
    public FrameLayout x;
    public FrameLayout y;

    public x71() {
        this(null);
    }

    public static boolean U(x71 x71Var, org.telegram.ui.Components.h61 h61Var, View view) {
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            gi.d3.j(x71Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new j71(x71Var, 0));
            return true;
        }
        if (h61Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = h61Var.G;
            String str = obj2 instanceof l01 ? ((l01) obj2).h : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).url : null;
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.i80 H = org.telegram.ui.Components.i80.H(x71Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new k71(0, x71Var, str), false);
                H.W(x71Var.c.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void V(x71 x71Var) {
        TLRPC.User user = MessagesController.getInstance(x71Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(x71Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(x71Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.e50 e50Var = x71Var.n;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        e50Var.n((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new j71(x71Var, 4), new ei.e1(6), 0);
    }

    public static /* synthetic */ void W(x71 x71Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.G0(LaunchActivity.H1, x71Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(x71Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static /* synthetic */ void X(x71 x71Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(x71Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(x71Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new m71(0, x71Var, tL_attachMenuBot), 66);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void Z(x71 x71Var) {
        String str;
        int i10;
        String string;
        String str2;
        int i11;
        String str3;
        CharSequence charSequence;
        String str4;
        CharSequence charSequence2;
        char c10;
        String str5;
        int i12 = x71Var.O + 1;
        x71Var.O = i12;
        if (i12 < 2 && !BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                Toast.makeText(x71Var.getParentActivity(), LocaleController.getString(R.string.DebugMenuLongPress), 0).show();
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x71Var.getParentActivity(), 0, x71Var.resourceProvider);
        alertDialog$Builder.a.R = LocaleController.getString(R.string.DebugMenu);
        String string2 = LocaleController.getString(R.string.DebugMenuImportContacts);
        String string3 = LocaleController.getString(R.string.DebugMenuReloadContacts);
        String string4 = LocaleController.getString(R.string.DebugMenuResetContacts);
        String string5 = LocaleController.getString(R.string.DebugMenuResetDialogs);
        if (BuildVars.DEBUG_VERSION) {
            string = null;
        } else {
            if (BuildVars.LOGS_ENABLED) {
                str = "DebugMenuDisableLogs";
                i10 = R.string.DebugMenuDisableLogs;
            } else {
                str = "DebugMenuEnableLogs";
                i10 = R.string.DebugMenuEnableLogs;
            }
            string = LocaleController.getString(str, i10);
        }
        if (SharedConfig.inappCamera) {
            str2 = "DebugMenuDisableCamera";
            i11 = R.string.DebugMenuDisableCamera;
        } else {
            str2 = "DebugMenuEnableCamera";
            i11 = R.string.DebugMenuEnableCamera;
        }
        String string6 = LocaleController.getString(str2, i11);
        String string7 = LocaleController.getString("DebugMenuClearMediaCache", R.string.DebugMenuClearMediaCache);
        String string8 = LocaleController.getString(R.string.DebugMenuCallSettings);
        String string9 = (BuildVars.DEBUG_PRIVATE_VERSION || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) ? LocaleController.getString("DebugMenuCheckAppUpdate", R.string.DebugMenuCheckAppUpdate) : null;
        String string10 = LocaleController.getString("DebugMenuReadAllDialogs", R.string.DebugMenuReadAllDialogs);
        String str6 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects" : null;
        boolean z10 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str7 = z10 ? "Clean app update" : null;
        String str8 = z10 ? "Reset suggestions" : null;
        String string11 = z10 ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : null;
        String string12 = LocaleController.getString(R.string.DebugMenuClearWebViewCookies);
        String string13 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
        String str9 = (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) ? SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode" : null;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str3 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
        } else {
            str3 = null;
        }
        boolean z11 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str10 = z11 ? "Force remove premium suggestions" : null;
        String str11 = z11 ? "Share device info" : null;
        String str12 = z11 ? "Force performance class" : null;
        String str13 = (!z11 || org.telegram.ui.Components.m60.l()) ? null : !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
        String string14 = LocaleController.getString(ei.c1.q(x71Var.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        String str14 = BuildVars.DEBUG_VERSION ? SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories" : null;
        String str15 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer" : null;
        String str16 = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
        String str17 = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : null;
        String str18 = !SharedConfig.isUsingCamera2(x71Var.currentAccount) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str19 = BuildVars.DEBUG_VERSION ? "Clear Mini Apps Permissions and Files" : null;
        String str20 = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : null;
        if (SharedConfig.canBlurChat()) {
            charSequence = null;
            if (Build.VERSION.SDK_INT >= 31) {
                str4 = SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
                String str21 = !SharedConfig.adaptableColorInBrowser ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
                String str22 = !SharedConfig.debugVideoQualities ? "Disable video qualities debug" : "Enable video qualities debug";
                if (Build.VERSION.SDK_INT < 28) {
                    charSequence2 = LocaleController.getString(SharedConfig.useSystemBoldFont ? R.string.DebugMenuDontUseSystemBoldFont : R.string.DebugMenuUseSystemBoldFont);
                } else {
                    charSequence2 = charSequence;
                }
                String str23 = SharedConfig.forceForumTabs ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
                String str24 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.fastWallpaperDisabled ? "enable wallpaper shader" : "disable wallpaper shader" : charSequence;
                String str25 = !SharedConfig.frameMetricsEnabled ? "hide frame metrics" : "show frame metrics";
                String str26 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.shadowsInSections ? "disable shadows in settings" : "enable shadows in settings" : charSequence;
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    c10 = 28;
                    str5 = charSequence;
                } else {
                    str5 = SharedConfig.debugViewMetrics ? "disable debug view metrics" : "enable debug view metrics";
                    c10 = 28;
                }
                ti.a aVar = ti.e.a;
                aVar.a();
                String str27 = !aVar.d ? "hide experimental settings" : "show experimental settings";
                CharSequence[] charSequenceArr = new CharSequence[43];
                charSequenceArr[0] = string2;
                charSequenceArr[1] = string3;
                charSequenceArr[2] = string4;
                charSequenceArr[3] = string5;
                charSequenceArr[4] = string;
                charSequenceArr[5] = string6;
                charSequenceArr[6] = string7;
                charSequenceArr[7] = string8;
                charSequenceArr[8] = charSequence;
                charSequenceArr[9] = string9;
                charSequenceArr[10] = string10;
                charSequenceArr[11] = str6;
                charSequenceArr[12] = str7;
                charSequenceArr[13] = str8;
                charSequenceArr[14] = string11;
                charSequenceArr[15] = string12;
                charSequenceArr[16] = string13;
                charSequenceArr[17] = str9;
                charSequenceArr[18] = str3;
                charSequenceArr[19] = str10;
                charSequenceArr[20] = str11;
                charSequenceArr[21] = str12;
                charSequenceArr[22] = str13;
                charSequenceArr[23] = string14;
                charSequenceArr[24] = str14;
                charSequenceArr[25] = str15;
                charSequenceArr[26] = str16;
                charSequenceArr[27] = str17;
                charSequenceArr[c10] = str18;
                charSequenceArr[29] = str19;
                charSequenceArr[30] = str20;
                charSequenceArr[31] = str4;
                charSequenceArr[32] = str21;
                charSequenceArr[33] = str22;
                charSequenceArr[34] = charSequence2;
                charSequenceArr[35] = "Reload app config";
                charSequenceArr[36] = str23;
                charSequenceArr[37] = "Make Memory Dump";
                charSequenceArr[38] = str24;
                charSequenceArr[39] = str25;
                charSequenceArr[40] = str26;
                charSequenceArr[41] = str5;
                charSequenceArr[42] = str27;
                alertDialog$Builder.f(charSequenceArr, new p4(x71Var, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), charSequence);
                x71Var.showDialog(alertDialog$Builder.a);
            }
        } else {
            charSequence = null;
        }
        str4 = charSequence;
        if (!SharedConfig.adaptableColorInBrowser) {
        }
        if (!SharedConfig.debugVideoQualities) {
        }
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
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
        }
        ti.a aVar2 = ti.e.a;
        aVar2.a();
        String str272 = !aVar2.d ? "hide experimental settings" : "show experimental settings";
        CharSequence[] charSequenceArr2 = new CharSequence[43];
        charSequenceArr2[0] = string2;
        charSequenceArr2[1] = string3;
        charSequenceArr2[2] = string4;
        charSequenceArr2[3] = string5;
        charSequenceArr2[4] = string;
        charSequenceArr2[5] = string6;
        charSequenceArr2[6] = string7;
        charSequenceArr2[7] = string8;
        charSequenceArr2[8] = charSequence;
        charSequenceArr2[9] = string9;
        charSequenceArr2[10] = string10;
        charSequenceArr2[11] = str6;
        charSequenceArr2[12] = str7;
        charSequenceArr2[13] = str8;
        charSequenceArr2[14] = string11;
        charSequenceArr2[15] = string12;
        charSequenceArr2[16] = string13;
        charSequenceArr2[17] = str9;
        charSequenceArr2[18] = str3;
        charSequenceArr2[19] = str10;
        charSequenceArr2[20] = str11;
        charSequenceArr2[21] = str12;
        charSequenceArr2[22] = str13;
        charSequenceArr2[23] = string14;
        charSequenceArr2[24] = str14;
        charSequenceArr2[25] = str15;
        charSequenceArr2[26] = str16;
        charSequenceArr2[27] = str17;
        charSequenceArr2[c10] = str18;
        charSequenceArr2[29] = str19;
        charSequenceArr2[30] = str20;
        charSequenceArr2[31] = str4;
        charSequenceArr2[32] = str21;
        charSequenceArr2[33] = str22;
        charSequenceArr2[34] = charSequence2;
        charSequenceArr2[35] = "Reload app config";
        charSequenceArr2[36] = str23;
        charSequenceArr2[37] = "Make Memory Dump";
        charSequenceArr2[38] = str24;
        charSequenceArr2[39] = str25;
        charSequenceArr2[40] = str26;
        charSequenceArr2[41] = str5;
        charSequenceArr2[42] = str272;
        alertDialog$Builder.f(charSequenceArr2, new p4(x71Var, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), charSequence);
        x71Var.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void a0(x71 x71Var, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        x71Var.actionBar.getTitlesContainer().setAlpha(floatValue);
        x71Var.d.setAlpha(floatValue);
    }

    public static void b0(x71 x71Var, ArrayList arrayList) {
        int i10;
        org.telegram.ui.ActionBar.p0 p0Var = x71Var.e.F;
        int i11 = 0;
        if (p0Var != null && p0Var.getTag() != null) {
            arrayList.add(org.telegram.ui.Components.h61.C(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            p71 p71Var = x71Var.h;
            ArrayList arrayList2 = p71Var.d;
            ArrayList arrayList3 = p71Var.v;
            if (p71Var.w) {
                ArrayList arrayList4 = p71Var.r;
                int size = arrayList4.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    int i14 = i12 + 1;
                    CharSequence charSequence = (CharSequence) p71Var.n.get(i12);
                    int i15 = org.telegram.ui.Cells.u6.a;
                    org.telegram.ui.Components.h61 J = org.telegram.ui.Components.h61.J(org.telegram.ui.Cells.u6.class);
                    J.l = charSequence;
                    J.G = (l01) obj;
                    arrayList.add(J);
                    i12 = i14;
                }
                if (p71Var.s.isEmpty()) {
                    return;
                }
                arrayList.add(org.telegram.ui.Components.h61.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                ArrayList arrayList5 = p71Var.s;
                int size2 = arrayList5.size();
                while (i11 < size2) {
                    Object obj2 = arrayList5.get(i11);
                    i11++;
                    int i16 = i12 + 1;
                    CharSequence charSequence2 = (CharSequence) p71Var.n.get(i12);
                    int i17 = org.telegram.ui.Cells.u6.a;
                    org.telegram.ui.Components.h61 J2 = org.telegram.ui.Components.h61.J(org.telegram.ui.Cells.u6.class);
                    J2.l = charSequence2;
                    J2.G = (MessagesController.FaqSearchResult) obj2;
                    arrayList.add(J2);
                    i12 = i16;
                }
                return;
            }
            if (!arrayList3.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.h61.q(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList3.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList3.get(i18);
                    i18++;
                    if (obj3 instanceof l01) {
                        l01 l01Var = (l01) obj3;
                        String str = l01Var.a;
                        int i19 = org.telegram.ui.Cells.u6.a;
                        org.telegram.ui.Components.h61 J3 = org.telegram.ui.Components.h61.J(org.telegram.ui.Cells.u6.class);
                        J3.l = str;
                        J3.G = l01Var;
                        arrayList.add(J3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str2 = faqSearchResult.title;
                        int i20 = org.telegram.ui.Cells.u6.a;
                        org.telegram.ui.Components.h61 J4 = org.telegram.ui.Components.h61.J(org.telegram.ui.Cells.u6.class);
                        J4.l = str2;
                        J4.G = faqSearchResult;
                        arrayList.add(J4);
                    }
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.h61.q(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
            int size4 = arrayList2.size();
            while (i11 < size4) {
                Object obj4 = arrayList2.get(i11);
                i11++;
                MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                String str3 = faqSearchResult2.title;
                int i21 = org.telegram.ui.Cells.u6.a;
                org.telegram.ui.Components.h61 J5 = org.telegram.ui.Components.h61.J(org.telegram.ui.Cells.u6.class);
                J5.l = str3;
                J5.G = faqSearchResult2;
                arrayList.add(J5);
            }
            return;
        }
        FrameLayout frameLayout = x71Var.x;
        org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(-4);
        h61Var.c = frameLayout;
        h61Var.z = 188;
        arrayList.add(h61Var);
        x71Var.R.clear();
        int i22 = 0;
        while (true) {
            i10 = 4;
            if (i22 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i22).isClientActivated() && x71Var.currentAccount != i22) {
                x71Var.R.add(Integer.valueOf(i22));
            }
            i22++;
        }
        Collections.sort(x71Var.R, new jg0(6));
        Set<String> set = x71Var.getMessagesController().pendingSuggestions;
        int i23 = 1;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(v71.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new l71(x71Var, i11)));
            arrayList.add(org.telegram.ui.Components.h61.B(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && x71Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(v71.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.mk.g(new StringBuilder("+"), x71Var.getUserConfig().getCurrentUser().phone, jf.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new j71(x71Var, i23)), LocaleController.getString(R.string.CheckPhoneNumberNo), new l71(x71Var, i23), ai.l7.I2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new l71(x71Var, 2)));
            arrayList.add(org.telegram.ui.Components.h61.B(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(v71.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new l71(x71Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new l71(x71Var, i10)));
            arrayList.add(org.telegram.ui.Components.h61.B(null));
        }
        if (x71Var.R.size() > 0) {
            i2.e.p(R.string.SettingsAccounts, arrayList);
            for (int i24 = 0; i24 < x71Var.R.size(); i24++) {
                int intValue = ((Integer) x71Var.R.get(i24)).intValue();
                int i25 = r71.a;
                org.telegram.ui.Components.h61 J6 = org.telegram.ui.Components.h61.J(r71.class);
                J6.d = i24;
                J6.z = intValue;
                arrayList.add(J6);
            }
            arrayList.add(org.telegram.ui.Components.h61.B(null));
        }
        boolean z10 = x71Var.getConnectionsManager().getCurrentTime() - 1791538462 < 2419200;
        if (z10 && x71Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(x71Var.currentAccount);
            int i26 = org.telegram.ui.ActionBar.h6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence string = LocaleController.getString(R.string.WalletAttachMoney);
            int i27 = org.telegram.ui.Cells.q8.Q;
            if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - 1790679020 <= 2419200) {
                string = org.telegram.ui.Cells.q8.a(string);
            }
            arrayList.add(t71.a(25, 0, 0, i26, string, null, w9.u() > 0 ? org.telegram.ui.Wallet.m0.n(w9.u(), false) : null));
            arrayList.add(org.telegram.ui.Components.h61.B(null));
        }
        arrayList.add(t71.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(t71.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(t71.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(t71.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(t71.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(t71.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(t71.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(t71.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(t71.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.h61.B(null));
        if (!z10 && x71Var.getMessagesController().config.walletAvailable.get()) {
            org.telegram.ui.Wallet.m0 w10 = org.telegram.ui.Wallet.m0.w(x71Var.currentAccount);
            int i28 = org.telegram.ui.ActionBar.h6.I.q() ? R.drawable.settings_wallet_dark : R.drawable.settings_wallet;
            CharSequence string2 = LocaleController.getString(R.string.WalletAttachMoney);
            int i29 = org.telegram.ui.Cells.q8.Q;
            if (ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime() - 1790679020 <= 2419200) {
                string2 = org.telegram.ui.Cells.q8.a(string2);
            }
            arrayList.add(t71.a(25, 0, 0, i28, string2, null, w10.u() > 0 ? org.telegram.ui.Wallet.m0.n(w10.u(), false) : null));
            arrayList.add(org.telegram.ui.Components.h61.B(null));
        }
        if (!x71Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(t71.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence3 = "";
        if (x71Var.getMessagesController().starsPurchaseAvailable()) {
            ai.ga y3 = ai.ga.y(x71Var.currentAccount, false);
            arrayList.add(t71.a(12, -1071598, -1608430, R.drawable.settings_stars, LocaleController.getString(R.string.TelegramStars), null, (!y3.e || y3.p().amount <= 0) ? "" : ai.md.K0(y3.p(), 0.85f, ' ')));
        }
        ai.ga.y(x71Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (ai.ga.y(x71Var.currentAccount, true).e && (ai.ga.y(x71Var.currentAccount, true).O(0) || ai.ga.y(x71Var.currentAccount, true).p().positive()))) {
            ai.ga y10 = ai.ga.y(x71Var.currentAccount, true);
            long j10 = y10.p().amount;
            int i30 = R.drawable.filled_gram_earnings;
            String string3 = LocaleController.getString(R.string.GramEarnings);
            if (y10.e && j10 > 0) {
                charSequence3 = ai.md.K0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(t71.a(13, -14965523, -15431455, i30, string3, null, charSequence3));
        }
        if (!x71Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(t71.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!x71Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(t71.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.h61) i2.e.h(1, arrayList)).a != 7) {
            arrayList.add(org.telegram.ui.Components.h61.B(null));
        }
        i2.e.p(R.string.SettingsHelp, arrayList);
        arrayList.add(t71.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(t71.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(t71.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(t71.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        ti.a aVar = ti.e.a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.h61.B(null));
            arrayList.add(org.telegram.ui.Components.h61.t("Experimental"));
            arrayList.add(t71.a(24, -765355, -2148011, 0, LocaleController.getString(R.string.RoundVideoSettings), null, null));
            arrayList.add(t71.a(26, -11154873, -14175180, 0, LocaleController.getString(R.string.AudioRecorderSettings), null, null));
        }
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.h61.B(null));
            i2.e.p(R.string.SettingsDebug, arrayList);
            arrayList.add(t71.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(t71.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(t71.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.h61.l(x71Var.L));
    }

    public static /* synthetic */ void c0(x71 x71Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        x71Var.U = -1;
        if (tL_error == null) {
            TLRPC.User user = x71Var.getMessagesController().getUser(Long.valueOf(x71Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = x71Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                } else {
                    x71Var.getMessagesController().putUser(user, false);
                }
            } else {
                x71Var.getUserConfig().setCurrentUser(user);
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
            if (closestPhotoSizeWithSize != null && x71Var.v != null) {
                FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(x71Var.v, true).renameTo(FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(x71Var.v.volume_id);
                sb2.append("_");
                String n10 = a1.g.n(x71Var.v.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(n10, a1.g.n(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(x71Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && x71Var.w != null) {
                FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(x71Var.w, true).renameTo(FileLoader.getInstance(x71Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            x71Var.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            x71Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = x71Var.getMessagesController().getUserFull(x71Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                x71Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            x71Var.m0(user);
        }
        x71Var.v = null;
        x71Var.w = null;
        x71Var.n0(false, true);
        x71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        x71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        x71Var.getUserConfig().saveConfig(true);
    }

    public static void d0(x71 x71Var, int i10) {
        Long l4;
        long j10;
        int i11 = 1;
        int i12 = 0;
        if (i10 == 0) {
            x71Var.getUserConfig().syncContacts = true;
            x71Var.getUserConfig().saveConfig(false);
            x71Var.getContactsController().forceImportContacts();
            return;
        }
        if (i10 == 1) {
            x71Var.getContactsController().loadContacts(false, 0L);
            return;
        }
        if (i10 == 2) {
            x71Var.getContactsController().resetImportedContacts();
            return;
        }
        if (i10 == 3) {
            x71Var.getMessagesController().forceResetDialogs();
            return;
        }
        if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            x71Var.c.W2.N(true);
            if (BuildVars.LOGS_ENABLED) {
                i2.e.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i10 == 5) {
            SharedConfig.toggleInappCamera();
            return;
        }
        if (i10 == 6) {
            x71Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(org.telegram.messenger.g0.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").remove("walletcardstickerhint").apply();
            w7.y5.a();
            SharedPrefsHelper.cleanupAccount(x71Var.currentAccount);
            MessagesController.getEmojiSettings(x71Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            ChatThemeController.getInstance(x71Var.currentAccount).clearCache();
            x71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            r21.W();
            qg.v0.e(x71Var.currentAccount).a();
            SharedPreferences mainSettings = x71Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.g0.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : mainSettings.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    edit.remove(str);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(x71Var.currentAccount).edit();
            for (String str2 : MessagesController.getNotificationsSettings(x71Var.currentAccount).getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    edit2.remove(str2);
                }
            }
            edit2.apply();
            return;
        }
        if (i10 == 7) {
            org.telegram.ui.Components.voip.d2.i(x71Var.getParentActivity());
            return;
        }
        if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
            return;
        }
        if (i10 == 9) {
            ((LaunchActivity) x71Var.getParentActivity()).z(true);
            return;
        }
        if (i10 == 10) {
            x71Var.getMessagesStorage().readAllDialogs(-1);
            return;
        }
        if (i10 == 11) {
            SharedConfig.toggleDisableVoiceAudioEffects();
            return;
        }
        if (i10 == 12) {
            SharedConfig.pendingAppUpdate = null;
            SharedConfig.saveConfig();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            return;
        }
        if (i10 == 13) {
            Set<String> set = x71Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            x71Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            return;
        }
        try {
            if (i10 == 14) {
                ApplicationLoader.applicationContext.deleteDatabase("webview.db");
                ApplicationLoader.applicationContext.deleteDatabase("webviewCache.db");
                WebStorage.getInstance().deleteAllData();
                WebView webView = new WebView(ApplicationLoader.applicationContext);
                webView.clearHistory();
                webView.destroy();
                return;
            }
            if (i10 == 15) {
                CookieManager cookieManager = CookieManager.getInstance();
                cookieManager.removeAllCookies(null);
                cookieManager.flush();
                return;
            }
            if (i10 == 16) {
                SharedConfig.toggleDebugWebView();
                Toast.makeText(x71Var.getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i10 == 17) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity parentActivity = x71Var.getParentActivity();
                if (parentActivity != null) {
                    Intent launchIntentForPackage = parentActivity.getPackageManager().getLaunchIntentForPackage(parentActivity.getPackageName());
                    parentActivity.finishAffinity();
                    parentActivity.startActivity(launchIntentForPackage);
                }
                System.exit(0);
                return;
            }
            if (i10 == 18) {
                w7.d0.a((LaunchActivity) x71Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                return;
            }
            if (i10 == 19) {
                x71Var.getMessagesController().loadAppConfig();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                x71Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new n71(x71Var, i12));
                return;
            }
            if (i10 != 20) {
                if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(x71Var.getParentActivity(), 0, x71Var.resourceProvider);
                    alertDialog$Builder.a.R = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    alertDialog$Builder.f(new CharSequence[]{AndroidUtilities.replaceTags((devicePerformanceClass == 2 ? "**HIGH**" : "HIGH").concat(measureDevicePerformanceClass == 2 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE").concat(measureDevicePerformanceClass == 1 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 0 ? "**LOW**" : "LOW").concat(measureDevicePerformanceClass == 0 ? " (measured)" : ""))}, new ly0(measureDevicePerformanceClass, i11));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                    return;
                }
                if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i10 == 23) {
                    boolean q6 = ei.c1.q(x71Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q6).apply();
                    Toast.makeText(x71Var.getParentActivity(), LocaleController.getString(!q6 ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                    return;
                }
                if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i12 < x71Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.n2) x71Var.getParentLayout().getFragmentStack().get(i12)).clearSheets();
                        i12++;
                    }
                    return;
                }
                if (i10 == 25) {
                    SharedConfig.togglePhotoViewerBlur();
                    return;
                }
                if (i10 == 26) {
                    SharedConfig.togglePaymentByInvoice();
                    return;
                }
                if (i10 == 27) {
                    x71Var.getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(x71Var.currentAccount);
                    return;
                }
                if (i10 == 29) {
                    gi.r.b();
                    gi.u0.c();
                    gi.j0.a();
                    gi.r4.c();
                    return;
                }
                if (i10 == 30) {
                    AuthTokensHelper.clearLogInTokens();
                    return;
                }
                if (i10 == 31) {
                    SharedConfig.toggleUseNewBlur();
                    return;
                }
                if (i10 == 32) {
                    SharedConfig.toggleBrowserAdaptableColors();
                    return;
                }
                if (i10 == 33) {
                    SharedConfig.toggleDebugVideoQualities();
                    return;
                }
                if (i10 == 34) {
                    SharedConfig.toggleUseSystemBoldFont();
                    return;
                }
                if (i10 == 35) {
                    MessagesController.getInstance(x71Var.currentAccount).loadAppConfig(true);
                    return;
                }
                if (i10 == 36) {
                    SharedConfig.toggleForceForumTabs();
                    return;
                }
                if (i10 == 37) {
                    FileLog.getInstance().dumpMemory(true);
                    return;
                }
                if (i10 == 38) {
                    SharedConfig.toggleFastWallpaperDisabled();
                    return;
                }
                if (i10 == 39) {
                    SharedConfig.toggleFrameMetricsEnabled();
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.B();
                        return;
                    }
                    return;
                }
                if (i10 == 40) {
                    SharedPreferences.Editor edit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.shadowsInSections;
                    SharedConfig.shadowsInSections = z10;
                    edit3.putBoolean("shadowsInSections", z10).apply();
                    return;
                }
                if (i10 == 41) {
                    SharedPreferences.Editor edit4 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z11 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z11;
                    edit4.putBoolean("debugViewMetrics", z11).apply();
                    return;
                }
                if (i10 == 42) {
                    ti.a aVar = ti.e.a;
                    synchronized (aVar) {
                        if (!aVar.b) {
                            SharedPreferences sharedPreferences = ti.d.a;
                            aVar.c = sharedPreferences.contains("experimental_settings_allowed");
                            aVar.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                            aVar.b = true;
                        }
                        boolean z12 = !aVar.d;
                        aVar.d = z12;
                        aVar.c = true;
                        aVar.b = true;
                        ti.d.a.edit().putBoolean("experimental_settings_allowed", z12).apply();
                    }
                    x71Var.c.W2.N(true);
                    return;
                }
                return;
            }
            int i13 = ConnectionsManager.CPU_COUNT;
            int memoryClass = ((ActivityManager) ApplicationLoader.applicationContext.getSystemService("activity")).getMemoryClass();
            StringBuilder sb2 = new StringBuilder();
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            long j18 = 0;
            while (i12 < i13) {
                Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_min_freq");
                Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_cur_freq");
                Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq");
                Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpu_capacity");
                sb2.append("#");
                sb2.append(i12);
                sb2.append(" ");
                if (sysInfoLong != null) {
                    sb2.append("min=");
                    sb2.append(sysInfoLong.longValue() / 1000);
                    sb2.append(" ");
                    j12++;
                    j11 = (sysInfoLong.longValue() / 1000) + j11;
                }
                if (sysInfoLong2 != null) {
                    sb2.append("cur=");
                    j10 = j11;
                    sb2.append(sysInfoLong2.longValue() / 1000);
                    sb2.append(" ");
                    j13 = (sysInfoLong2.longValue() / 1000) + j13;
                    j14++;
                } else {
                    j10 = j11;
                }
                if (sysInfoLong3 != null) {
                    sb2.append("max=");
                    sb2.append(sysInfoLong3.longValue() / 1000);
                    sb2.append(" ");
                    j15 = (sysInfoLong3.longValue() / 1000) + j15;
                    j16++;
                }
                if (sysInfoLong4 != null) {
                    sb2.append("cpc=");
                    sb2.append(sysInfoLong4);
                    sb2.append(" ");
                    j17 = sysInfoLong4.longValue() + j17;
                    j18++;
                }
                sb2.append("\n");
                i12++;
                j11 = j10;
            }
            long j19 = j11;
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
                    l4 = sysInfoLong6;
                    sb3.append(sysInfoLong5.longValue() / 1000);
                } else {
                    l4 = sysInfoLong6;
                }
                if (l4 != null) {
                    sb3.append(", mmin=");
                    sb3.append(l4.longValue() / 1000);
                }
                if (sysInfoLong7 != null) {
                    sb3.append(", max=");
                    sb3.append(sysInfoLong7.longValue() / 1000);
                }
                sb3.append("\n");
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
            sb3.append(i13);
            sb3.append(" CPUs");
            if (j12 > 0) {
                sb3.append(", avgMinFreq=");
                sb3.append(j19 / j12);
            }
            if (j14 > 0) {
                sb3.append(", avgCurFreq=");
                sb3.append(j13 / j14);
            }
            if (j16 > 0) {
                sb3.append(", avgMaxFreq=");
                sb3.append(j15 / j16);
            }
            if (j18 > 0) {
                sb3.append(", avgCapacity=");
                sb3.append(j17 / j18);
            }
            sb3.append("\n");
            sb3.append((CharSequence) sb2);
            k0(MediaController.VIDEO_MIME_TYPE, sb3);
            k0("video/hevc", sb3);
            k0("video/x-vnd.on2.vp8", sb3);
            k0("video/x-vnd.on2.vp9", sb3);
            x71Var.showDialog(new q71(x71Var, x71Var.getParentActivity(), sb3.toString()));
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void e0(x71 x71Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            x71Var.v = fileLocation;
            x71Var.w = photoSize2.location;
            x71Var.F.h(ImageLocation.getForLocal(fileLocation), "90_90", x71Var.E, null);
            x71Var.n0(true, false);
        } else {
            if (x71Var.v == null) {
                return;
            }
            TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
            if (inputFile != null) {
                tL_photos_uploadProfilePhoto.file = inputFile;
                tL_photos_uploadProfilePhoto.flags |= 1;
            }
            if (inputFile2 != null) {
                tL_photos_uploadProfilePhoto.video = inputFile2;
                int i10 = tL_photos_uploadProfilePhoto.flags;
                tL_photos_uploadProfilePhoto.video_start_ts = d;
                tL_photos_uploadProfilePhoto.flags = i10 | 6;
            }
            if (videoSize != null) {
                tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                tL_photos_uploadProfilePhoto.flags |= 16;
            }
            x71Var.U = x71Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new x40(29, x71Var, str));
        }
        x71Var.actionBar.n().requestLayout();
    }

    public static void f0(x71 x71Var, org.telegram.ui.Components.h61 h61Var) {
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                zh1.a(x71Var.getParentActivity(), new org.telegram.ui.Components.qy(23, x71Var, tL_attachMenuBot), null);
                return;
            } else {
                LaunchActivity.G0(LaunchActivity.H1, x71Var.currentAccount, tL_attachMenuBot, null, true);
            }
        }
        if (h61Var.G(r71.class)) {
            int i10 = h61Var.z;
            LaunchActivity launchActivity = LaunchActivity.H1;
            if (launchActivity != null) {
                launchActivity.O0(i10);
                return;
            }
            return;
        }
        if (h61Var.G(org.telegram.ui.Cells.u6.class)) {
            Object obj2 = h61Var.G;
            if (obj2 instanceof l01) {
                l01 l01Var = (l01) obj2;
                org.telegram.ui.ActionBar.d5 parentLayout = x71Var.getParentLayout();
                l01Var.b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, l01Var.c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(x71Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, x71Var.h.E, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = h61Var.G;
            if (obj3 != null) {
                x71Var.h.E(obj3);
                return;
            }
            return;
        }
        switch (h61Var.d) {
            case 1:
                x71Var.l0(new UserInfoActivity());
                break;
            case 2:
                x71Var.l0(new ThemeActivity(0));
                break;
            case 3:
                x71Var.l0(new PrivacySettingsActivity());
                break;
            case 5:
                x71Var.l0(new NotificationsSettingsActivity());
                break;
            case 6:
                x71Var.l0(new DataSettingsActivity());
                break;
            case 7:
                x71Var.l0(new FiltersSetupActivity());
                break;
            case 8:
                x71Var.l0(new SessionsActivity(0));
                break;
            case 9:
                x71Var.l0(new qb0());
                break;
            case 10:
                x71Var.l0(new LanguageSelectActivity());
                break;
            case 11:
                x71Var.l0(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                x71Var.l0(new ai.md());
                break;
            case 13:
                x71Var.l0(new fi.g());
                break;
            case 15:
                x71Var.l0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                ug.m1.f0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                break;
            case 17:
                x71Var.showDialog(org.telegram.ui.Components.f5.T(x71Var, x71Var.resourceProvider));
                break;
            case 18:
                pf.d.r(x71Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                break;
            case 19:
                pf.d.r(x71Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                break;
            case 20:
                ProfileActivity.H4(x71Var.getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.H4(x71Var.getParentActivity(), true);
                break;
            case 22:
                FileLog.cleanupLogs();
                break;
            case 23:
                if (!MessagesController.getInstance(x71Var.currentAccount).isFrozen()) {
                    pf.d.r(x71Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                    break;
                } else {
                    b.b(x71Var.currentAccount);
                    break;
                }
            case 24:
                x71Var.presentFragment(new a31(null));
                break;
            case 25:
                x71Var.l0(new org.telegram.ui.Wallet.o5());
                break;
            case 26:
                x71Var.presentFragment(new r4(null));
                break;
        }
    }

    public static void k0(String str, StringBuilder sb2) {
        String[] supportedTypes;
        try {
            int codecCount = MediaCodecList.getCodecCount();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i10 = 0; i10 < codecCount; i10++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i10);
                if (codecInfoAt != null && (supportedTypes = codecInfoAt.getSupportedTypes()) != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= supportedTypes.length) {
                            break;
                        } else if (supportedTypes[i11].equals(str)) {
                            (codecInfoAt.isEncoder() ? arrayList2 : arrayList).add(Integer.valueOf(i10));
                        } else {
                            i11++;
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
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                if (i12 > 0) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt2 = MediaCodecList.getCodecInfoAt(((Integer) arrayList.get(i12)).intValue());
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
            for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                if (i13 > 0 || !arrayList.isEmpty()) {
                    sb2.append("\n");
                }
                MediaCodecInfo codecInfoAt3 = MediaCodecList.getCodecInfoAt(((Integer) arrayList2.get(i13)).intValue());
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

    @Override // org.telegram.ui.Components.d50
    public final void E(float f7) {
        org.telegram.ui.Cells.y3 y3Var = this.s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.d50
    public final void K(boolean z10, boolean z11) {
        org.telegram.ui.Cells.y3 y3Var = this.s;
        if (y3Var == null) {
            return;
        }
        y3Var.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.d50
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new hi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        this.b = new y8(this, context, 7);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.V = true;
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.L();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setAdditionalTextLeft(-AndroidUtilities.dp(4.0f));
        this.actionBar.setActionBarMenuOnItemClick(new y21(this, 4));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        org.telegram.ui.ActionBar.y n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.u0 c10 = n10.c(0, R.drawable.outline_header_search, this.resourceProvider);
        c10.F();
        c10.H = new ig.c2(this, 17);
        this.e = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.u0 a2 = n10.a(1, R.drawable.ic_ab_other);
        this.f = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.f.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        p71 p71Var = new p71(this, this, context);
        this.h = p71Var;
        p71Var.G();
        org.telegram.ui.Components.c71 c71Var = new org.telegram.ui.Components.c71(this, new g5(this, 26), new o71(this), new o71(this));
        this.c = c71Var;
        c71Var.W2.r = false;
        c71Var.p1();
        this.c.setPadding(0, AndroidUtilities.dp(12.0f) + AndroidUtilities.statusBarHeight, 0, AndroidUtilities.navigationBarHeight + this.T);
        this.c.setClipToPadding(false);
        this.c.j(new k3(this, 28));
        org.telegram.ui.Components.c71 c71Var2 = this.c;
        y8 y8Var = this.b;
        Objects.requireNonNull(c71Var2);
        this.Z = new bh.l(c71Var2, y8Var, new x8(c71Var2, 0));
        this.c.C0(new j71(this, 2));
        this.b.addView(this.c, w7.z5.e(-1, -1, 119));
        ei.g6 g6Var = new ei.g6(this, context);
        this.d = g6Var;
        this.b.addView(g6Var, w7.z5.e(-1, 200, 48));
        this.b.addView(this.actionBar, w7.z5.e(-1, -2, 55));
        org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(0, true, true);
        this.n = e50Var;
        e50Var.H = true;
        e50Var.a = this;
        e50Var.b = this;
        this.x = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.y = frameLayout;
        this.x.addView(frameLayout, w7.z5.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.y.setOnClickListener(new l71(this, 5));
        w7.b6.a(this.y);
        this.E = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.F = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.y.addView(this.F, w7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.y3 y3Var = new org.telegram.ui.Cells.y3(this, context);
        this.s = y3Var;
        y3Var.setSize(AndroidUtilities.dp(26.0f));
        this.s.setProgressColor(-1);
        this.s.setNoProgress(false);
        this.y.addView(this.s, w7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        n0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.G = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(32.0f), getThemedColor(org.telegram.ui.ActionBar.h6.a7)));
        this.G.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.H = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(30.0f), getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
        ImageView imageView = new ImageView(context);
        this.I = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.I.setImageResource(R.drawable.filled_premium_camera);
        this.H.addView(this.I, w7.z5.e(22, 22, 17));
        this.G.addView(this.H, w7.z5.c(30.0f, 30));
        this.y.addView(this.G, w7.z5.d(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        w7.b6.a(this.G);
        TextView textView = new TextView(context);
        this.J = textView;
        textView.setTextSize(1, 22.0f);
        this.J.setTypeface(AndroidUtilities.bold());
        this.J.setGravity(17);
        this.J.setSingleLine();
        TextView textView2 = this.J;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView j10 = org.telegram.ui.Cells.c1.j(this.x, this.J, w7.z5.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.K = j10;
        j10.setTextSize(1, 13.0f);
        this.K.setGravity(17);
        this.K.setSingleLine();
        this.K.setEllipsize(truncateAt);
        TextView j11 = org.telegram.ui.Cells.c1.j(this.x, this.K, w7.z5.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.L = j11;
        j11.setTextSize(1, 14.0f);
        this.L.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.B6));
        this.L.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.L.setGravity(17);
        this.L.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.i6), 2, -1));
        this.L.setOnClickListener(new l71(this, 6));
        this.N = new View(context);
        o0(true, false);
        this.c.W2.N(false);
        m0(getUserConfig().getCurrentUser());
        p0();
        j0();
        y8 y8Var2 = this.b;
        o71 o71Var = new o71(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(y8Var2, o71Var);
        y8 y8Var3 = this.b;
        this.fragmentView = y8Var3;
        return y8Var3;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.c71 c71Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            m0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.c71 c71Var2 = this.c;
            if (c71Var2 != null) {
                c71Var2.W2.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            m0(getUserConfig().getCurrentUser());
        } else {
            if (i10 != NotificationCenter.newSuggestionsAvailable || (c71Var = this.c) == null) {
                return;
            }
            c71Var.W2.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean e() {
        return true;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ ju0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    public final void i0() {
        bh.f fVar;
        if (Build.VERSION.SDK_INT < 31 || (fVar = this.W) == null) {
            return;
        }
        int dp = AndroidUtilities.dp(48.0f);
        int measuredHeight = (this.fragmentView.getMeasuredHeight() - this.S) - AndroidUtilities.dp(8.0f);
        int dp2 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.b0.set(0.0f, -dp, this.fragmentView.getMeasuredWidth(), this.actionBar.getMeasuredHeight() + dp);
        RectF rectF = this.c0;
        rectF.set(0.0f, dp2, this.fragmentView.getMeasuredWidth(), measuredHeight);
        rectF.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        fVar.g(this.M ? 2 : 1, this.a0);
        fVar.e(this.Z, this.fragmentView.getMeasuredWidth(), this.fragmentView.getMeasuredHeight());
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    public final void j0() {
        float f7 = this.a.e;
        org.telegram.ui.Components.h20.d(this.f, 1.0f - f7);
        if (!this.M) {
            org.telegram.ui.Components.h20.d(this.actionBar.getBackButton(), 1.0f);
            return;
        }
        ImageView backButton = this.actionBar.getBackButton();
        if (backButton == null) {
            return;
        }
        boolean z10 = f7 > 0.5f;
        if (z10 != this.V) {
            this.V = z10;
            backButton.setImageResource(z10 ? R.drawable.ic_ab_back : R.drawable.outline_header_qr_24);
            backButton.setContentDescription(LocaleController.getString(z10 ? R.string.AccDescrGoBack : R.string.QrCode));
        }
        float abs = Math.abs((f7 * 2.0f) - 1.0f);
        backButton.setVisibility(0);
        backButton.setAlpha(abs);
        backButton.setScaleX(AndroidUtilities.lerp(0.4f, 1.0f, abs));
        backButton.setScaleY(AndroidUtilities.lerp(0.4f, 1.0f, abs));
    }

    public final void l0(org.telegram.ui.ActionBar.n2 n2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!AndroidUtilities.isTablet() || (launchActivity = LaunchActivity.H1) == null || (actionBarLayout = launchActivity.s0) == null) {
            presentFragment(n2Var);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.a0((org.telegram.ui.ActionBar.n2) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.l(false, false);
        }
        org.telegram.ui.ActionBar.b5 b5Var = new org.telegram.ui.ActionBar.b5(n2Var);
        b5Var.c = true;
        b5Var.g = true;
        actionBarLayout.R(b5Var);
    }

    public final void m0(TLRPC.User user) {
        String str;
        String str2;
        if (this.F != null && this.U == -1) {
            this.E.r(user);
            this.F.e(user, this.E);
            this.J.setText(UserObject.getUserName(user));
            StringBuilder sb2 = new StringBuilder();
            if (user != null) {
                sb2.append(jf.b.c().b("+" + user.phone));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                sb2.append(" • @");
                sb2.append(publicUsername);
            }
            this.K.setText(sb2);
            TextView textView = this.L;
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                int i10 = packageInfo.versionCode;
                int i11 = i10 / 10;
                int i12 = i10 % 10;
                if (i12 == 1 || i12 == 2) {
                    str2 = "store bundled " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else if (ApplicationLoader.isStandaloneBuild()) {
                    str2 = "direct " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                } else {
                    str2 = "universal " + Build.CPU_ABI + " " + Build.CPU_ABI2;
                }
                int i13 = R.string.TelegramVersion;
                Locale locale = Locale.US;
                str = LocaleController.formatString(i13, "v" + packageInfo.versionName + " (" + i11 + ")\n" + str2);
            } catch (Exception e) {
                FileLog.e(e);
                str = null;
            }
            textView.setText(str);
        }
    }

    public final void n0(boolean z10, boolean z11) {
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
            this.r.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Cells.y3, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.s, (Property<org.telegram.ui.Cells.y3, Float>) View.ALPHA, 0.0f));
        }
        this.r.setDuration(180L);
        this.r.addListener(new l40(10, this, z10));
        this.r.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x003c, code lost:
    
        if ((r0.getY() + r0.getHeight()) >= r4.actionBar.getHeight()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0(boolean z10, boolean z11) {
        boolean z12;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.p0 p0Var = this.e.F;
        if (p0Var == null || p0Var.getTag() == null) {
            if (this.c.getChildCount() > 0) {
                View childAt = this.c.getChildAt(0);
                this.c.getClass();
                if (RecyclerView.R(childAt) <= 0) {
                }
            }
            z12 = false;
            if (this.P == z12 || z10) {
                this.P = z12;
                valueAnimator = this.Q;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.Q = null;
                }
                if (z11) {
                    this.actionBar.getTitlesContainer().setAlpha(z12 ? 1.0f : 0.0f);
                    this.d.setAlpha(z12 ? 1.0f : 0.0f);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.actionBar.getTitlesContainer().getAlpha(), z12 ? 1.0f : 0.0f);
                this.Q = ofFloat;
                ofFloat.addUpdateListener(new c11(this, 9));
                this.Q.setInterpolator(org.telegram.ui.Components.bs.h);
                this.Q.setDuration(420L);
                this.Q.start();
                return;
            }
            return;
        }
        z12 = true;
        if (this.P == z12) {
        }
        this.P = z12;
        valueAnimator = this.Q;
        if (valueAnimator != null) {
        }
        if (z11) {
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (!kVar.n0) {
            return super.onBackPressed(z10);
        }
        if (!z10) {
            return false;
        }
        kVar.h(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().addObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.M = bundle.getBoolean("hasMainTabs", false);
        }
        this.T = this.M ? AndroidUtilities.dp(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
        getNotificationCenter().removeObserver(this, NotificationCenter.starBalanceUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.u61 u61Var = this.c.W2;
        if (u61Var != null) {
            u61Var.l();
        }
    }

    public final void p0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.G6;
        kVar.setTitleColor(getThemedColor(i10));
        this.actionBar.C(getThemedColor(i10), false);
        this.b.setBackgroundColor(getThemedColor(org.telegram.ui.ActionBar.h6.a7));
        this.J.setTextColor(getThemedColor(i10));
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.y6));
        this.e.N();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.d6);
        this.N.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.h6.m1(0.0f, themedColor), themedColor}));
        this.d.invalidate();
        this.c.invalidate();
    }

    @Override // ne.d
    public final void r(int i10, float f7, float f10, ne.e eVar) {
        if (i10 == 0) {
            j0();
        }
    }

    @Override // org.telegram.ui.mg0
    public final void t() {
        this.c.x0(0);
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.mg0
    public final gh.d z() {
        return this.Y;
    }

    public x71(Bundle bundle) {
        super(bundle);
        this.a = new ne.b(0, this, org.telegram.ui.Components.bs.h, 350L, false);
        this.O = 0;
        this.R = new ArrayList();
        this.U = -1;
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.a0 = arrayList;
        RectF rectF = new RectF();
        this.b0 = rectF;
        RectF rectF2 = new RectF();
        this.c0 = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        if (Build.VERSION.SDK_INT >= 31) {
            this.W = new bh.f(false);
            this.X = new gh.d(null);
            this.Y = new gh.d(null);
        } else {
            this.W = null;
            this.X = null;
            this.Y = null;
        }
    }

    @Override // org.telegram.ui.Components.d50
    public final /* synthetic */ void P() {
    }

    @Override // ne.d
    public final /* synthetic */ void H(float f7, int i10) {
    }
}
