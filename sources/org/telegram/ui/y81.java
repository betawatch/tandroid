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
import android.graphics.drawable.GradientDrawable;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.RecyclerView;
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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class y81 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.x40, bh0, le.d {
    public org.telegram.ui.Components.w9 E;
    public FrameLayout F;
    public FrameLayout G;
    public ImageView H;
    public TextView I;
    public TextView J;
    public TextView K;
    public boolean L;
    public View M;
    public View N;
    public int O;
    public NotificationCenter.ObserversGroup P;
    public boolean Q;
    public ValueAnimator R;
    public final ArrayList S;
    public int T;
    public int U;
    public int V;
    public final le.b a;
    public y8 b;
    public org.telegram.ui.Components.e71 c;
    public org.telegram.ui.ActionBar.v0 d;
    public org.telegram.ui.ActionBar.v0 e;
    public q81 f;
    public org.telegram.ui.Components.y40 h;
    public AnimatorSet n;
    public org.telegram.ui.Cells.z3 r;
    public TLRPC.FileLocation s;
    public TLRPC.FileLocation v;
    public FrameLayout w;
    public FrameLayout x;
    public org.telegram.ui.Components.h9 y;

    public y81() {
        this(null);
    }

    public static boolean S(y81 y81Var, org.telegram.ui.Components.h61 h61Var, View view) {
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            ei.l3.j(y81Var.currentAccount, ((TLRPC.TL_attachMenuBot) obj).bot_id, new l81(y81Var, 2));
            return true;
        }
        if (h61Var.H(org.telegram.ui.Cells.w6.class)) {
            Object obj2 = h61Var.G;
            String str = obj2 instanceof b11 ? ((b11) obj2).h : obj2 instanceof MessagesController.FaqSearchResult ? ((MessagesController.FaqSearchResult) obj2).url : null;
            if (!TextUtils.isEmpty(str)) {
                org.telegram.ui.Components.b80 H = org.telegram.ui.Components.b80.H(y81Var, view);
                H.c(R.drawable.msg_link2, LocaleController.getString(R.string.CopyLink), new wx0(28, y81Var, str), false);
                H.W(y81Var.c.V0(view, false));
                H.Z();
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void T(y81 y81Var, TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
        if (inputFile == null && inputFile2 == null && videoSize == null) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            y81Var.s = fileLocation;
            y81Var.v = photoSize2.location;
            y81Var.E.h(ImageLocation.getForLocal(fileLocation), "90_90", y81Var.y, null);
            y81Var.l0(true, false);
        } else {
            if (y81Var.s == null) {
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
            y81Var.V = y81Var.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new zb0(23, y81Var, str));
        }
        y81Var.actionBar.n().requestLayout();
    }

    public static /* synthetic */ void U(y81 y81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(y81Var.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(y81Var.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new zb0(22, y81Var, tL_attachMenuBot), 66);
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void W(y81 y81Var) {
        String str;
        int i10;
        String string;
        String str2;
        int i11;
        String str3;
        CharSequence charSequence;
        String str4;
        CharSequence charSequence2;
        int i12 = y81Var.O + 1;
        y81Var.O = i12;
        if (i12 < 2 && !BuildVars.DEBUG_PRIVATE_VERSION) {
            try {
                Toast.makeText(y81Var.getParentActivity(), LocaleController.getString(R.string.DebugMenuLongPress), 0).show();
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y81Var.getParentActivity(), 0, y81Var.resourceProvider);
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
        String str5 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.disableVoiceAudioEffects ? "Enable voip audio effects" : "Disable voip audio effects" : null;
        boolean z10 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str6 = z10 ? "Clean app update" : null;
        String str7 = z10 ? "Reset suggestions" : null;
        String string11 = z10 ? LocaleController.getString(R.string.DebugMenuClearWebViewCache) : null;
        String string12 = LocaleController.getString(R.string.DebugMenuClearWebViewCookies);
        String string13 = LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuDisableWebViewDebug : R.string.DebugMenuEnableWebViewDebug);
        String str8 = (AndroidUtilities.isTabletInternal() && BuildVars.DEBUG_PRIVATE_VERSION) ? SharedConfig.forceDisableTabletMode ? "Enable tablet mode" : "Disable tablet mode" : null;
        if (BuildVars.DEBUG_PRIVATE_VERSION) {
            str3 = LocaleController.getString(SharedConfig.isFloatingDebugActive ? R.string.FloatingDebugDisable : R.string.FloatingDebugEnable);
        } else {
            str3 = null;
        }
        boolean z11 = BuildVars.DEBUG_PRIVATE_VERSION;
        String str9 = z11 ? "Force remove premium suggestions" : null;
        String str10 = z11 ? "Share device info" : null;
        String str11 = z11 ? "Force performance class" : null;
        String str12 = (!z11 || org.telegram.ui.Components.f60.l()) ? null : !SharedConfig.bigCameraForRound ? "Force big camera for round" : "Disable big camera for round";
        String string14 = LocaleController.getString(ci.d1.q(y81Var.getParentActivity()) ? "DebugMenuDualOff" : "DebugMenuDualOn");
        String str13 = BuildVars.DEBUG_VERSION ? SharedConfig.useSurfaceInStories ? "back to TextureView in stories" : "use SurfaceView in stories" : null;
        String str14 = BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.photoViewerBlur ? "do not blur in photoviewer" : "blur in photoviewer" : null;
        String str15 = !SharedConfig.payByInvoice ? "Enable Invoice Payment" : "Disable Invoice Payment";
        String str16 = BuildVars.DEBUG_PRIVATE_VERSION ? "Update Attach Bots" : null;
        String str17 = !SharedConfig.isUsingCamera2(y81Var.currentAccount) ? "Use Camera 2 API" : "Use old Camera 1 API";
        String str18 = BuildVars.DEBUG_VERSION ? "Clear Mini Apps Permissions and Files" : null;
        String str19 = BuildVars.DEBUG_PRIVATE_VERSION ? "Clear all login tokens" : null;
        if (SharedConfig.canBlurChat()) {
            charSequence = null;
            if (Build.VERSION.SDK_INT >= 31) {
                str4 = SharedConfig.useNewBlur ? "back to cpu blur" : "use new gpu blur";
                String str20 = !SharedConfig.adaptableColorInBrowser ? "Disabled adaptive browser colors" : "Enable adaptive browser colors";
                String str21 = !SharedConfig.debugVideoQualities ? "Disable video qualities debug" : "Enable video qualities debug";
                if (Build.VERSION.SDK_INT < 28) {
                    charSequence2 = LocaleController.getString(SharedConfig.useSystemBoldFont ? R.string.DebugMenuDontUseSystemBoldFont : R.string.DebugMenuUseSystemBoldFont);
                } else {
                    charSequence2 = charSequence;
                }
                String str22 = SharedConfig.forceForumTabs ? "Force Forum Tabs" : "Do Not Force Forum Tabs";
                String str23 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.fastWallpaperDisabled ? "enable wallpaper shader" : "disable wallpaper shader" : charSequence;
                String str24 = !SharedConfig.frameMetricsEnabled ? "hide frame metrics" : "show frame metrics";
                String str25 = !BuildVars.DEBUG_PRIVATE_VERSION ? SharedConfig.debugViewMetrics ? "disable debug view metrics" : "enable debug view metrics" : charSequence;
                ri.a aVar = ri.e.a;
                aVar.a();
                alertDialog$Builder.f(new CharSequence[]{string2, string3, string4, string5, string, string6, string7, string8, charSequence, string9, string10, str5, str6, str7, string11, string12, string13, str8, str3, str9, str10, str11, str12, string14, str13, str14, str15, str16, str17, str18, str19, str4, str20, str21, charSequence2, "Reload app config", str22, "Make Memory Dump", str23, str24, charSequence, str25, !aVar.d ? "hide experimental settings" : "show experimental settings"}, new vv(y81Var, 3));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), charSequence);
                y81Var.showDialog(alertDialog$Builder.a);
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
        ri.a aVar2 = ri.e.a;
        aVar2.a();
        alertDialog$Builder.f(new CharSequence[]{string2, string3, string4, string5, string, string6, string7, string8, charSequence, string9, string10, str5, str6, str7, string11, string12, string13, str8, str3, str9, str10, str11, str12, string14, str13, str14, str15, str16, str17, str18, str19, str4, str20, str21, charSequence2, "Reload app config", str22, "Make Memory Dump", str23, str24, charSequence, str25, !aVar2.d ? "hide experimental settings" : "show experimental settings"}, new vv(y81Var, 3));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), charSequence);
        y81Var.showDialog(alertDialog$Builder.a);
    }

    public static /* synthetic */ void X(y81 y81Var) {
        TLRPC.User user = MessagesController.getInstance(y81Var.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(y81Var.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(y81Var.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        org.telegram.ui.Components.y40 y40Var = y81Var.h;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        y40Var.o((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new l81(y81Var, 0), new ci.f1(6), 0);
    }

    public static /* synthetic */ void Y(y81 y81Var, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.C0(LaunchActivity.G1, y81Var.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(y81Var.currentAccount).updateAttachMenuBotsInCache();
    }

    public static void Z(y81 y81Var, int i10) {
        long j3;
        Long l4;
        int i11 = 1;
        int i12 = 0;
        if (i10 == 0) {
            y81Var.getUserConfig().syncContacts = true;
            y81Var.getUserConfig().saveConfig(false);
            y81Var.getContactsController().forceImportContacts();
            return;
        }
        long j10 = 0;
        if (i10 == 1) {
            y81Var.getContactsController().loadContacts(false, 0L);
            return;
        }
        if (i10 == 2) {
            y81Var.getContactsController().resetImportedContacts();
            return;
        }
        if (i10 == 3) {
            y81Var.getMessagesController().forceResetDialogs();
            return;
        }
        if (i10 == 4) {
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            y81Var.c.f3.N(true);
            if (BuildVars.LOGS_ENABLED) {
                org.telegram.messenger.q.r(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
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
            y81Var.getMessagesStorage().clearSentMedia();
            SharedConfig.setNoSoundHintShowed(false);
            org.telegram.messenger.q.d(org.telegram.messenger.q.d(org.telegram.messenger.q.d(org.telegram.messenger.q.d(org.telegram.messenger.q.d(org.telegram.messenger.q.d(org.telegram.messenger.q.d(org.telegram.messenger.q.d(org.telegram.messenger.q.d(org.telegram.messenger.q.d(MessagesController.getGlobalMainSettings().edit().remove("archivehint").remove("proximityhint").remove("archivehint_l"), "searchpostsnew", "speedhint", "gifhint", "reminderhint"), "soundHint", "themehint", "bganimationhint", "filterhint"), "n_0", "storyprvhint", "storyhint", "storyhint2"), "storydualhint", "storysvddualhint", "stories_camera", "dualcam"), "dualmatrix", "dual_available", "archivehint", "askNotificationsAfter"), "askNotificationsDuration", "viewoncehint", "voicepausehint", "taptostorysoundhint"), "nothanos", "voiceoncehint", "savedhint", "savedsearchhint"), "savedsearchtaghint", "newppsms", "monetizationadshint", "seekSpeedHintShowed"), "unsupport_video/av01", "statusgiftpage", "multistorieshint", "trimvoicehint"), "taptostoryhighlighthint", "proxycheckstatusip", "callmiconstart", "showchattagsinfo").remove("language_showed2").remove("aihintshown").remove("savedmsgschatshint").apply();
            w7.y5.a();
            SharedPrefsHelper.cleanupAccount(y81Var.currentAccount);
            MessagesController.getEmojiSettings(y81Var.currentAccount).edit().remove("featured_hidden").remove("emoji_featured_hidden").commit();
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
            ChatThemeController.getInstance(y81Var.currentAccount).clearCache();
            y81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
            w31.U();
            pg.u0.e(y81Var.currentAccount).a();
            SharedPreferences mainSettings = y81Var.getMessagesController().getMainSettings();
            SharedPreferences.Editor edit = mainSettings.edit();
            org.telegram.messenger.q.d(edit, "peerColors", "profilePeerColors", "boostingappearance", "bizbothint").remove("movecaptionhint");
            for (String str : mainSettings.getAll().keySet()) {
                if (str.contains("show_gift_for_") || str.contains("bdayhint_") || str.contains("bdayanim_") || str.startsWith("ask_paid_message_") || str.startsWith("topicssidetabs")) {
                    edit.remove(str);
                }
            }
            edit.apply();
            SharedPreferences.Editor edit2 = MessagesController.getNotificationsSettings(y81Var.currentAccount).edit();
            for (String str2 : MessagesController.getNotificationsSettings(y81Var.currentAccount).getAll().keySet()) {
                if (str2.startsWith("dialog_bar_botver")) {
                    edit2.remove(str2);
                }
            }
            edit2.apply();
            return;
        }
        if (i10 == 7) {
            org.telegram.ui.Components.voip.g2.i(y81Var.getParentActivity());
            return;
        }
        if (i10 == 8) {
            SharedConfig.toggleRoundCamera16to9();
            return;
        }
        if (i10 == 9) {
            ((LaunchActivity) y81Var.getParentActivity()).z(true);
            return;
        }
        if (i10 == 10) {
            y81Var.getMessagesStorage().readAllDialogs(-1);
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
            Set<String> set = y81Var.getMessagesController().pendingSuggestions;
            set.add("VALIDATE_PHONE_NUMBER");
            set.add("VALIDATE_PASSWORD");
            y81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.newSuggestionsAvailable, new Object[0]);
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
                Toast.makeText(y81Var.getParentActivity(), LocaleController.getString(SharedConfig.debugWebView ? R.string.DebugMenuWebViewDebugEnabled : R.string.DebugMenuWebViewDebugDisabled), 0).show();
                return;
            }
            if (i10 == 17) {
                SharedConfig.toggleForceDisableTabletMode();
                Activity parentActivity = y81Var.getParentActivity();
                if (parentActivity != null) {
                    Intent launchIntentForPackage = parentActivity.getPackageManager().getLaunchIntentForPackage(parentActivity.getPackageName());
                    parentActivity.finishAffinity();
                    parentActivity.startActivity(launchIntentForPackage);
                }
                System.exit(0);
                return;
            }
            if (i10 == 18) {
                w7.y.a((LaunchActivity) y81Var.getParentActivity(), !SharedConfig.isFloatingDebugActive, true);
                return;
            }
            if (i10 == 19) {
                y81Var.getMessagesController().loadAppConfig();
                TLRPC.TL_help_dismissSuggestion tL_help_dismissSuggestion = new TLRPC.TL_help_dismissSuggestion();
                tL_help_dismissSuggestion.suggestion = "VALIDATE_PHONE_NUMBER";
                tL_help_dismissSuggestion.peer = new TLRPC.TL_inputPeerEmpty();
                y81Var.getConnectionsManager().sendRequest(tL_help_dismissSuggestion, new n81(y81Var, i12));
                return;
            }
            if (i10 != 20) {
                if (i10 == 21) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(y81Var.getParentActivity(), 0, y81Var.resourceProvider);
                    alertDialog$Builder.a.R = "Force performance class";
                    int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                    int measureDevicePerformanceClass = SharedConfig.measureDevicePerformanceClass();
                    alertDialog$Builder.f(new CharSequence[]{AndroidUtilities.replaceTags((devicePerformanceClass == 2 ? "**HIGH**" : "HIGH").concat(measureDevicePerformanceClass == 2 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 1 ? "**AVERAGE**" : "AVERAGE").concat(measureDevicePerformanceClass == 1 ? " (measured)" : "")), AndroidUtilities.replaceTags((devicePerformanceClass == 0 ? "**LOW**" : "LOW").concat(measureDevicePerformanceClass == 0 ? " (measured)" : ""))}, new cz0(measureDevicePerformanceClass, i11));
                    alertDialog$Builder.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    alertDialog$Builder.o();
                    return;
                }
                if (i10 == 22) {
                    SharedConfig.toggleRoundCamera();
                    return;
                }
                if (i10 == 23) {
                    boolean q6 = ci.d1.q(y81Var.getParentActivity());
                    MessagesController.getGlobalMainSettings().edit().putBoolean("dual_available", !q6).apply();
                    Toast.makeText(y81Var.getParentActivity(), LocaleController.getString(!q6 ? R.string.DebugMenuDualOnToast : R.string.DebugMenuDualOffToast), 0).show();
                    return;
                }
                if (i10 == 24) {
                    SharedConfig.toggleSurfaceInStories();
                    while (i12 < y81Var.getParentLayout().getFragmentStack().size()) {
                        ((org.telegram.ui.ActionBar.n2) y81Var.getParentLayout().getFragmentStack().get(i12)).clearSheets();
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
                    y81Var.getMediaDataController().loadAttachMenuBots(false, true);
                    return;
                }
                if (i10 == 28) {
                    SharedConfig.toggleUseCamera2(y81Var.currentAccount);
                    return;
                }
                if (i10 == 29) {
                    ei.s.b();
                    ei.x0.c();
                    ei.m0.a();
                    ei.d5.c();
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
                    MessagesController.getInstance(y81Var.currentAccount).loadAppConfig(true);
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
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null) {
                        launchActivity.C();
                        return;
                    }
                    return;
                }
                if (i10 == 41) {
                    SharedPreferences.Editor edit3 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).edit();
                    boolean z10 = !SharedConfig.debugViewMetrics;
                    SharedConfig.debugViewMetrics = z10;
                    edit3.putBoolean("debugViewMetrics", z10).apply();
                    return;
                }
                if (i10 == 42) {
                    ri.a aVar = ri.e.a;
                    synchronized (aVar) {
                        if (!aVar.b) {
                            SharedPreferences sharedPreferences = ri.d.a;
                            aVar.c = sharedPreferences.contains("experimental_settings_allowed");
                            aVar.d = sharedPreferences.getBoolean("experimental_settings_allowed", true);
                            aVar.b = true;
                        }
                        boolean z11 = !aVar.d;
                        aVar.d = z11;
                        aVar.c = true;
                        aVar.b = true;
                        ri.d.a.edit().putBoolean("experimental_settings_allowed", z11).apply();
                    }
                    y81Var.c.f3.N(true);
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
                long j19 = j10;
                Long sysInfoLong = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_min_freq");
                Long sysInfoLong2 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_cur_freq");
                Long sysInfoLong3 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpufreq/cpuinfo_max_freq");
                Long sysInfoLong4 = AndroidUtilities.getSysInfoLong("/sys/devices/system/cpu/cpu" + i12 + "/cpu_capacity");
                sb2.append("#");
                sb2.append(i12);
                sb2.append(" ");
                if (sysInfoLong != null) {
                    sb2.append("min=");
                    l4 = sysInfoLong2;
                    sb2.append(sysInfoLong.longValue() / 1000);
                    sb2.append(" ");
                    j12++;
                    j3 = (sysInfoLong.longValue() / 1000) + j11;
                } else {
                    j3 = j11;
                    l4 = sysInfoLong2;
                }
                if (l4 != null) {
                    sb2.append("cur=");
                    sb2.append(l4.longValue() / 1000);
                    sb2.append(" ");
                    j13 += l4.longValue() / 1000;
                    j14++;
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
                j10 = j19;
                j11 = j3;
            }
            long j20 = j10;
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
                    sb3.append(sysInfoLong5.longValue() / 1000);
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
            if (j12 > j20) {
                sb3.append(", avgMinFreq=");
                sb3.append(j21 / j12);
            }
            if (j14 > j20) {
                sb3.append(", avgCurFreq=");
                sb3.append(j13 / j14);
            }
            if (j16 > j20) {
                sb3.append(", avgMaxFreq=");
                sb3.append(j15 / j16);
            }
            if (j18 > j20) {
                sb3.append(", avgCapacity=");
                sb3.append(j17 / j18);
            }
            sb3.append("\n");
            sb3.append((CharSequence) sb2);
            h0(MediaController.VIDEO_MIME_TYPE, sb3);
            h0("video/hevc", sb3);
            h0("video/x-vnd.on2.vp8", sb3);
            h0("video/x-vnd.on2.vp9", sb3);
            y81Var.showDialog(new r81(y81Var, y81Var.getParentActivity(), sb3.toString()));
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void b0(y81 y81Var, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
        y81Var.V = -1;
        if (tL_error == null) {
            TLRPC.User user = y81Var.getMessagesController().getUser(Long.valueOf(y81Var.getUserConfig().getClientUserId()));
            if (user == null) {
                user = y81Var.getUserConfig().getCurrentUser();
                if (user == null) {
                    return;
                } else {
                    y81Var.getMessagesController().putUser(user, false);
                }
            } else {
                y81Var.getUserConfig().setCurrentUser(user);
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
            if (closestPhotoSizeWithSize != null && y81Var.s != null) {
                FileLoader.getInstance(y81Var.currentAccount).getPathToAttach(y81Var.s, true).renameTo(FileLoader.getInstance(y81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(y81Var.s.volume_id);
                sb2.append("_");
                String o9 = a4.a.o(y81Var.s.local_id, "@90_90", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(closestPhotoSizeWithSize.location.volume_id);
                sb3.append("_");
                ImageLoader.getInstance().replaceImageInCache(o9, a4.a.o(closestPhotoSizeWithSize.location.local_id, "@90_90", sb3), ImageLocation.getForUserOrChat(y81Var.currentAccount, user, 1), false);
            }
            if (closestVideoSizeWithSize != null && str != null) {
                new File(str).renameTo(FileLoader.getInstance(y81Var.currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
            } else if (closestPhotoSizeWithSize2 != null && y81Var.v != null) {
                FileLoader.getInstance(y81Var.currentAccount).getPathToAttach(y81Var.v, true).renameTo(FileLoader.getInstance(y81Var.currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
            }
            y81Var.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(user);
            y81Var.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
            TLRPC.UserFull userFull = y81Var.getMessagesController().getUserFull(y81Var.getUserConfig().getClientUserId());
            if (userFull != null) {
                userFull.profile_photo = tL_photos_photo.photo;
                y81Var.getMessagesStorage().updateUserInfo(userFull, false);
            }
            y81Var.k0(user);
        }
        y81Var.s = null;
        y81Var.v = null;
        y81Var.l0(false, true);
        y81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
        y81Var.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        y81Var.getUserConfig().saveConfig(true);
    }

    public static void c0(y81 y81Var, ArrayList arrayList) {
        int i10;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList2;
        org.telegram.ui.ActionBar.q0 q0Var = y81Var.d.F;
        int i11 = 0;
        if (q0Var != null && q0Var.getTag() != null) {
            arrayList.add(org.telegram.ui.Components.h61.D(org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()));
            q81 q81Var = y81Var.f;
            ArrayList arrayList3 = q81Var.d;
            ArrayList arrayList4 = q81Var.v;
            if (q81Var.w) {
                ArrayList arrayList5 = q81Var.r;
                int size = arrayList5.size();
                int i12 = 0;
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList5.get(i13);
                    i13++;
                    int i14 = i12 + 1;
                    CharSequence charSequence = (CharSequence) q81Var.n.get(i12);
                    int i15 = org.telegram.ui.Cells.w6.a;
                    org.telegram.ui.Components.h61 K = org.telegram.ui.Components.h61.K(org.telegram.ui.Cells.w6.class);
                    K.l = charSequence;
                    K.G = (b11) obj;
                    arrayList.add(K);
                    i12 = i14;
                }
                if (q81Var.s.isEmpty()) {
                    return;
                }
                arrayList.add(org.telegram.ui.Components.h61.r(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
                ArrayList arrayList6 = q81Var.s;
                int size2 = arrayList6.size();
                while (i11 < size2) {
                    Object obj2 = arrayList6.get(i11);
                    i11++;
                    int i16 = i12 + 1;
                    CharSequence charSequence2 = (CharSequence) q81Var.n.get(i12);
                    int i17 = org.telegram.ui.Cells.w6.a;
                    org.telegram.ui.Components.h61 K2 = org.telegram.ui.Components.h61.K(org.telegram.ui.Cells.w6.class);
                    K2.l = charSequence2;
                    K2.G = (MessagesController.FaqSearchResult) obj2;
                    arrayList.add(K2);
                    i12 = i16;
                }
                return;
            }
            if (!arrayList4.isEmpty()) {
                arrayList.add(org.telegram.ui.Components.h61.r(LocaleController.getString(R.string.SettingsRecent)));
                int size3 = arrayList4.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList4.get(i18);
                    i18++;
                    if (obj3 instanceof b11) {
                        b11 b11Var = (b11) obj3;
                        String str = b11Var.a;
                        int i19 = org.telegram.ui.Cells.w6.a;
                        org.telegram.ui.Components.h61 K3 = org.telegram.ui.Components.h61.K(org.telegram.ui.Cells.w6.class);
                        K3.l = str;
                        K3.G = b11Var;
                        arrayList.add(K3);
                    } else if (obj3 instanceof MessagesController.FaqSearchResult) {
                        MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) obj3;
                        String str2 = faqSearchResult.title;
                        int i20 = org.telegram.ui.Cells.w6.a;
                        org.telegram.ui.Components.h61 K4 = org.telegram.ui.Components.h61.K(org.telegram.ui.Cells.w6.class);
                        K4.l = str2;
                        K4.G = faqSearchResult;
                        arrayList.add(K4);
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(org.telegram.ui.Components.h61.r(LocaleController.getString(R.string.SettingsFaqSearchTitle)));
            int size4 = arrayList3.size();
            while (i11 < size4) {
                Object obj4 = arrayList3.get(i11);
                i11++;
                MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj4;
                String str3 = faqSearchResult2.title;
                int i21 = org.telegram.ui.Cells.w6.a;
                org.telegram.ui.Components.h61 K5 = org.telegram.ui.Components.h61.K(org.telegram.ui.Cells.w6.class);
                K5.l = str3;
                K5.G = faqSearchResult2;
                arrayList.add(K5);
            }
            return;
        }
        arrayList.add(org.telegram.ui.Components.h61.n(y81Var.w, 188));
        y81Var.S.clear();
        int i22 = 0;
        while (true) {
            i10 = 4;
            if (i22 >= 4) {
                break;
            }
            if (UserConfig.getInstance(i22).isClientActivated() && y81Var.currentAccount != i22) {
                y81Var.S.add(Integer.valueOf(i22));
            }
            i22++;
        }
        Collections.sort(y81Var.S, new ff(29));
        Set<String> set = y81Var.getMessagesController().pendingSuggestions;
        int i23 = 1;
        if (set.contains("PREMIUM_GRACE")) {
            arrayList.add(w81.a(LocaleController.getString(R.string.GraceSuggestionTitle), LocaleController.getString(R.string.GraceSuggestionMessage), null, null, LocaleController.getString(R.string.GraceSuggestionButton), new m81(y81Var, i11)));
            arrayList.add(org.telegram.ui.Components.h61.C(null));
        } else if (set.contains("VALIDATE_PHONE_NUMBER") && y81Var.getUserConfig().getCurrentUser() != null) {
            arrayList.add(w81.a(LocaleController.formatString(R.string.CheckPhoneNumber, org.telegram.messenger.bi.g(new StringBuilder("+"), y81Var.getUserConfig().getCurrentUser().phone, gf.b.c())), AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.CheckPhoneNumberInfo), new l81(y81Var, i23)), LocaleController.getString(R.string.CheckPhoneNumberNo), new m81(y81Var, i23), yh.y3.g2(LocaleController.getString(R.string.CheckPhoneNumberYes2)), new m81(y81Var, 2)));
            arrayList.add(org.telegram.ui.Components.h61.C(null));
        } else if (set.contains("VALIDATE_PASSWORD")) {
            arrayList.add(w81.a(LocaleController.getString(R.string.YourPasswordHeader), LocaleController.getString(R.string.YourPasswordRemember), LocaleController.getString(R.string.YourPasswordRememberNo), new m81(y81Var, 3), LocaleController.getString(R.string.YourPasswordRememberYes), new m81(y81Var, i10)));
            arrayList.add(org.telegram.ui.Components.h61.C(null));
        }
        if (y81Var.S.size() > 0) {
            com.google.android.gms.internal.vision.e2.n(R.string.SettingsAccounts, arrayList);
            for (int i24 = 0; i24 < y81Var.S.size(); i24++) {
                int intValue = ((Integer) y81Var.S.get(i24)).intValue();
                int i25 = s81.a;
                org.telegram.ui.Components.h61 K6 = org.telegram.ui.Components.h61.K(s81.class);
                K6.d = i24;
                K6.z = intValue;
                arrayList.add(K6);
            }
            arrayList.add(org.telegram.ui.Components.h61.C(null));
        }
        arrayList.add(u81.a(1, -14899731, -15431455, R.drawable.settings_account, LocaleController.getString(R.string.SettingsAccount), LocaleController.getString(R.string.SettingsAccountInfo), null));
        arrayList.add(u81.a(2, -1007845, -1996271, R.drawable.settings_chat, LocaleController.getString(R.string.SettingsChat), LocaleController.getString(R.string.SettingsChatInfo), null));
        arrayList.add(u81.a(3, -11154873, -14175180, R.drawable.settings_privacy, LocaleController.getString(R.string.SettingsPrivacySecurity), LocaleController.getString(R.string.SettingsPrivacySecurityInfo), null));
        arrayList.add(u81.a(5, -765355, -2148011, R.drawable.settings_sounds, LocaleController.getString(R.string.SettingsNotifications), LocaleController.getString(R.string.SettingsNotificationsInfo), null));
        arrayList.add(u81.a(6, -11565578, -13276952, R.drawable.settings_data, LocaleController.getString(R.string.SettingsData), LocaleController.getString(R.string.SettingsDataInfo), null));
        arrayList.add(u81.a(7, -14899731, -15497247, R.drawable.settings_folders, LocaleController.getString(R.string.SettingsFolders), LocaleController.getString(R.string.SettingsFoldersInfo), null));
        arrayList.add(u81.a(8, -13451058, -14836538, R.drawable.settings_devices, LocaleController.getString(R.string.SettingsDevices), LocaleController.getString(R.string.SettingsDevicesInfo), null));
        arrayList.add(u81.a(9, -881871, -1940716, R.drawable.settings_power, LocaleController.getString(R.string.SettingsPowerSaving), LocaleController.getString(R.string.SettingsPowerSavingInfo), null));
        arrayList.add(u81.a(10, -3903756, -6335009, R.drawable.settings_language, LocaleController.getString(R.string.SettingsLanguage), LocaleController.getCurrentLanguageName(), null));
        arrayList.add(org.telegram.ui.Components.h61.C(null));
        if (!y81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(u81.a(11, -4826625, -10388225, R.drawable.settings_premium, LocaleController.getString(R.string.TelegramPremium), null, null));
        }
        CharSequence charSequence3 = "";
        if (y81Var.getMessagesController().starsPurchaseAvailable()) {
            yh.u5 y3 = yh.u5.y(y81Var.currentAccount, false);
            arrayList.add(u81.a(12, -1071598, -1608430, R.drawable.settings_stars, LocaleController.getString(R.string.TelegramStars), null, (!y3.e || y3.p().amount <= 0) ? "" : yh.z7.P0(y3.p(), 0.85f, ' ')));
        }
        yh.u5.y(y81Var.currentAccount, true).p();
        if (ApplicationLoader.isBetaBuild() || ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isHuaweiStoreBuild() || (yh.u5.y(y81Var.currentAccount, true).e && (yh.u5.y(y81Var.currentAccount, true).O(0) || yh.u5.y(y81Var.currentAccount, true).p().positive()))) {
            yh.u5 y10 = yh.u5.y(y81Var.currentAccount, true);
            long j3 = y10.p().amount;
            int i26 = R.drawable.settings_gram_24;
            String string = LocaleController.getString(R.string.MyTON);
            if (y10.e && j3 > 0) {
                charSequence3 = yh.z7.P0(y10.p(), 0.85f, ' ');
            }
            arrayList.add(u81.a(13, -14965523, -15431455, i26, string, null, charSequence3));
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (attachMenuBots != null && (arrayList2 = attachMenuBots.bots) != null && !arrayList2.isEmpty()) {
            ArrayList<TLRPC.TL_attachMenuBot> arrayList7 = attachMenuBots.bots;
            int size5 = arrayList7.size();
            while (i11 < size5) {
                TLRPC.TL_attachMenuBot tL_attachMenuBot = arrayList7.get(i11);
                i11++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = tL_attachMenuBot;
                if (tL_attachMenuBot2.show_in_side_menu && tL_attachMenuBot2.bot_id == 1985737506) {
                    int i27 = R.drawable.settings_wallet;
                    org.telegram.ui.Components.h61 K7 = org.telegram.ui.Components.h61.K(u81.class);
                    long j10 = tL_attachMenuBot2.bot_id;
                    K7.d = (int) (j10 ^ (j10 >>> 32));
                    K7.k = i27;
                    K7.l = tL_attachMenuBot2.short_name;
                    K7.B = ((-15431455) << 32) | ((-14965523) & 4294967295L);
                    K7.G = tL_attachMenuBot2;
                    arrayList.add(K7);
                }
            }
        }
        if (!y81Var.getMessagesController().premiumFeaturesBlocked()) {
            arrayList.add(u81.a(15, -765355, -2148011, R.drawable.settings_business, LocaleController.getString(R.string.TelegramBusiness), null, null));
        }
        if (!y81Var.getMessagesController().premiumPurchaseBlocked()) {
            arrayList.add(u81.a(16, -816335, -1940716, R.drawable.settings_gift, LocaleController.getString(R.string.SendAGift), null, null));
        }
        if (((org.telegram.ui.Components.h61) hg.c.g(1, arrayList)).a != 7) {
            arrayList.add(org.telegram.ui.Components.h61.C(null));
        }
        com.google.android.gms.internal.vision.e2.n(R.string.SettingsHelp, arrayList);
        arrayList.add(u81.a(17, -1007845, -1996271, R.drawable.settings_ask, LocaleController.getString(R.string.AskAQuestion), null, null));
        arrayList.add(u81.a(18, -14965523, -15431455, R.drawable.settings_faq, LocaleController.getString(R.string.TelegramFAQ), null, null));
        arrayList.add(u81.a(23, -3903756, -6335009, R.drawable.settings_features, LocaleController.getString(R.string.TelegramFeatures), null, null));
        arrayList.add(u81.a(19, -11154873, -14175180, R.drawable.settings_policy, LocaleController.getString(R.string.PrivacyPolicy), null, null));
        ri.a aVar = ri.e.a;
        aVar.a();
        if (aVar.d) {
            arrayList.add(org.telegram.ui.Components.h61.C(null));
            arrayList.add(org.telegram.ui.Components.h61.u("Experimental"));
            arrayList.add(u81.a(24, 0, 0, 0, LocaleController.getString(R.string.RoundVideoSettings), null, null));
        }
        if (BuildVars.LOGS_ENABLED || BuildVars.DEBUG_PRIVATE_VERSION) {
            arrayList.add(org.telegram.ui.Components.h61.C(null));
            com.google.android.gms.internal.vision.e2.n(R.string.SettingsDebug, arrayList);
            arrayList.add(u81.a(20, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLogs), null, null));
            arrayList.add(u81.a(21, -11154873, -14175180, 0, LocaleController.getString(R.string.DebugSendLastLogs), null, null));
            arrayList.add(u81.a(22, -765355, -2148011, 0, LocaleController.getString(R.string.DebugClearLogs), null, null));
        }
        arrayList.add(org.telegram.ui.Components.h61.m(y81Var.K));
    }

    public static void e0(y81 y81Var, org.telegram.ui.Components.h61 h61Var) {
        Object obj = h61Var.G;
        if (obj instanceof TLRPC.TL_attachMenuBot) {
            TLRPC.TL_attachMenuBot tL_attachMenuBot = (TLRPC.TL_attachMenuBot) obj;
            if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
                cj1.a(y81Var.getParentActivity(), new ft(17, y81Var, tL_attachMenuBot), null);
                return;
            } else {
                LaunchActivity.C0(LaunchActivity.G1, y81Var.currentAccount, tL_attachMenuBot, null, true);
            }
        }
        if (h61Var.H(s81.class)) {
            int i10 = h61Var.z;
            LaunchActivity launchActivity = LaunchActivity.G1;
            if (launchActivity != null) {
                launchActivity.K0(i10);
                return;
            }
            return;
        }
        if (h61Var.H(org.telegram.ui.Cells.w6.class)) {
            Object obj2 = h61Var.G;
            if (obj2 instanceof b11) {
                b11 b11Var = (b11) obj2;
                org.telegram.ui.ActionBar.c5 parentLayout = y81Var.getParentLayout();
                b11Var.b.run();
                AndroidUtilities.scrollToFragmentRow(parentLayout, b11Var.c);
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                NotificationCenter.getInstance(y81Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.openArticle, y81Var.f.E, ((MessagesController.FaqSearchResult) obj2).url);
            }
            Object obj3 = h61Var.G;
            if (obj3 != null) {
                y81Var.f.E(obj3);
                return;
            }
            return;
        }
        switch (h61Var.d) {
            case 1:
                y81Var.i0(new UserInfoActivity());
                break;
            case 2:
                y81Var.i0(new ThemeActivity(0));
                break;
            case 3:
                y81Var.i0(new PrivacySettingsActivity());
                break;
            case 5:
                y81Var.i0(new NotificationsSettingsActivity());
                break;
            case 6:
                y81Var.i0(new DataSettingsActivity());
                break;
            case 7:
                y81Var.i0(new FiltersSetupActivity());
                break;
            case 8:
                y81Var.i0(new SessionsActivity(0));
                break;
            case 9:
                y81Var.i0(new lc0());
                break;
            case 10:
                y81Var.i0(new LanguageSelectActivity());
                break;
            case 11:
                y81Var.i0(new PremiumPreviewFragment(0, "settings"));
                break;
            case 12:
                y81Var.i0(new yh.z7());
                break;
            case 13:
                y81Var.i0(new di.k());
                break;
            case 15:
                y81Var.i0(new PremiumPreviewFragment(1, "settings"));
                break;
            case 16:
                tg.m1.e0(0, BirthdayController.getInstance(UserConfig.selectedAccount).getState());
                break;
            case 17:
                y81Var.showDialog(org.telegram.ui.Components.e5.U(y81Var, y81Var.resourceProvider));
                break;
            case 18:
                nf.f.s(y81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                break;
            case 19:
                nf.f.s(y81Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                break;
            case 20:
                ProfileActivity.H4(y81Var.getParentActivity(), false);
                break;
            case 21:
                ProfileActivity.H4(y81Var.getParentActivity(), true);
                break;
            case 22:
                FileLog.cleanupLogs();
                break;
            case 23:
                if (!MessagesController.getInstance(y81Var.currentAccount).isFrozen()) {
                    nf.f.s(y81Var.getParentActivity(), LocaleController.getString(R.string.TelegramFeaturesUrl));
                    break;
                } else {
                    b.b(y81Var.currentAccount);
                    break;
                }
            case 24:
                y81Var.presentFragment(new f41(null));
                break;
        }
    }

    public static void h0(String str, StringBuilder sb2) {
        String[] supportedTypes;
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
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

    @Override // org.telegram.ui.Components.x40
    public final void B(float f7) {
        org.telegram.ui.Cells.z3 z3Var = this.r;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(f7);
    }

    @Override // org.telegram.ui.Components.x40
    public final void I(boolean z10, boolean z11) {
        org.telegram.ui.Cells.z3 z3Var = this.r;
        if (z3Var == null) {
            return;
        }
        z3Var.setProgress(0.0f);
    }

    @Override // org.telegram.ui.Components.x40
    public final void O(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, d, str, photoSize2, photoSize, 6));
    }

    @Override // le.d
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        if (i10 == 0) {
            g0();
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.b = new y8(this, context, 7);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.I();
        this.actionBar.setTitle(LocaleController.getString(R.string.Settings));
        this.actionBar.setActionBarMenuOnItemClick(new p81(this, 0));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(true);
        this.actionBar.setBackgroundColor(0);
        this.actionBar.setBackground(null);
        org.telegram.ui.ActionBar.z n10 = this.actionBar.n();
        org.telegram.ui.ActionBar.v0 c10 = n10.c(0, R.drawable.outline_header_search, this.resourceProvider);
        c10.F();
        c10.H = new hg.d2(this, 18);
        this.d = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        org.telegram.ui.ActionBar.v0 a2 = n10.a(1, R.drawable.ic_ab_other);
        this.e = a2;
        a2.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        this.e.e(2, R.drawable.msg_leave, LocaleController.getString(R.string.LogOut));
        q81 q81Var = new q81(this, this, context);
        this.f = q81Var;
        q81Var.G();
        org.telegram.ui.Components.e71 e71Var = new org.telegram.ui.Components.e71(this, new c5(this, 26), new o81(this), new o81(this));
        this.c = e71Var;
        e71Var.setCaptureSectionsDecoratorAllowed(true);
        org.telegram.ui.Components.e71 e71Var2 = this.c;
        e71Var2.f3.r = false;
        e71Var2.r1();
        this.c.setSectionsDrawBackground(true);
        li.a.c(this.c, 0, 0, AndroidUtilities.dp(12.0f), this.U);
        this.c.setClipToPadding(false);
        this.c.j(new i3(this, 29));
        this.b.addView(this.c, w7.z5.e(-1, -1, 119));
        View view = new View(context);
        this.N = view;
        view.setBackground(getBaseSimpleGlass().a(this.N));
        this.b.addView(this.N, w7.z5.e(-1, 0, 48));
        this.b.addView(this.actionBar, w7.z5.e(-1, -2, 55));
        org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(0, true, true);
        this.h = y40Var;
        y40Var.H = true;
        y40Var.a = this;
        y40Var.b = this;
        this.w = new FrameLayout(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.x = frameLayout;
        this.w.addView(frameLayout, w7.z5.d(120, 120.0f, 49, 0.0f, 11.0f, 0.0f, 0.0f));
        this.x.setOnClickListener(new m81(this, 5));
        w7.b6.a(this.x);
        this.y = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.E = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(90.0f));
        this.x.addView(this.E, w7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        org.telegram.ui.Cells.z3 z3Var = new org.telegram.ui.Cells.z3(this, context);
        this.r = z3Var;
        z3Var.setSize(AndroidUtilities.dp(26.0f));
        this.r.setProgressColor(-1);
        this.r.setNoProgress(false);
        this.x.addView(this.r, w7.z5.d(90, 90.0f, 49, 0.0f, 15.0f, 0.0f, 0.0f));
        l0(false, false);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.F = frameLayout2;
        frameLayout2.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(32.0f), getThemedColor(org.telegram.ui.ActionBar.i6.a7)));
        this.F.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.G = frameLayout3;
        frameLayout3.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(30.0f), getThemedColor(org.telegram.ui.ActionBar.i6.Oh)));
        ImageView imageView = new ImageView(context);
        this.H = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.H.setImageResource(R.drawable.filled_premium_camera);
        this.G.addView(this.H, w7.z5.e(22, 22, 17));
        this.F.addView(this.G, w7.z5.c(30.0f, 30));
        this.x.addView(this.F, w7.z5.d(34, 34.0f, 49, 32.0f, 75.0f, 0.0f, 0.0f));
        w7.b6.a(this.F);
        TextView textView = new TextView(context);
        this.I = textView;
        textView.setTextSize(1, 22.0f);
        this.I.setTypeface(AndroidUtilities.bold());
        this.I.setGravity(17);
        this.I.setSingleLine();
        TextView textView2 = this.I;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        TextView i10 = org.telegram.ui.Cells.c1.i(this.w, this.I, w7.z5.d(-1, -2.0f, 49, 16.0f, 126.33299f, 16.0f, 0.0f), context);
        this.J = i10;
        i10.setTextSize(1, 13.0f);
        this.J.setGravity(17);
        this.J.setSingleLine();
        this.J.setEllipsize(truncateAt);
        TextView i11 = org.telegram.ui.Cells.c1.i(this.w, this.J, w7.z5.d(-1, -2.0f, 49, 0.0f, 156.0f, 0.0f, 0.0f), context);
        this.K = i11;
        i11.setTextSize(1, 14.0f);
        this.K.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.B6));
        this.K.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
        this.K.setGravity(17);
        this.K.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.i6), 2, -1));
        this.K.setOnClickListener(new m81(this, 6));
        this.M = new View(context);
        m0(true, false);
        this.c.f3.N(false);
        k0(getUserConfig().getCurrentUser());
        n0();
        g0();
        this.actionBar.setBackground(null);
        int i12 = this.mSystemInsets.b;
        if (this.N != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i12;
            ViewGroup.LayoutParams layoutParams = this.N.getLayoutParams();
            if (layoutParams.height != currentActionBarHeight) {
                layoutParams.height = currentActionBarHeight;
                this.N.setLayoutParams(layoutParams);
            }
        }
        m0(true, false);
        y8 y8Var = this.b;
        o81 o81Var = new o81(this);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.j(y8Var, o81Var);
        y8 y8Var2 = this.b;
        this.fragmentView = y8Var2;
        return y8Var2;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.ui.Components.e71 e71Var;
        if (i10 == NotificationCenter.starBalanceUpdated) {
            k0(getUserConfig().getCurrentUser());
            org.telegram.ui.Components.e71 e71Var2 = this.c;
            if (e71Var2 != null) {
                e71Var2.f3.N(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            k0(getUserConfig().getCurrentUser());
        } else {
            if (i10 != NotificationCenter.newSuggestionsAvailable || (e71Var = this.c) == null) {
                return;
            }
            e71Var.f3.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ boolean e() {
        return true;
    }

    public final void g0() {
        org.telegram.ui.ActionBar.v0 v0Var = this.e;
        le.b bVar = this.a;
        org.telegram.ui.Components.c20.d(v0Var, 1.0f - bVar.e);
        org.telegram.ui.Components.c20.d(this.actionBar.getBackButton(), AndroidUtilities.lerp(this.L ? 0.0f : 1.0f, 1.0f, bVar.e));
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ yu0 getCloseIntoObject() {
        return null;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ String getInitialSearchString() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.c;
    }

    public final void i0(org.telegram.ui.ActionBar.n2 n2Var) {
        LaunchActivity launchActivity;
        ActionBarLayout actionBarLayout;
        if (!AndroidUtilities.isTablet() || (launchActivity = LaunchActivity.G1) == null || (actionBarLayout = launchActivity.s0) == null) {
            presentFragment(n2Var);
            return;
        }
        if (!actionBarLayout.getFragmentStack().isEmpty()) {
            while (actionBarLayout.getFragmentStack().size() - 1 > 0) {
                actionBarLayout.a0((org.telegram.ui.ActionBar.n2) actionBarLayout.getFragmentStack().get(0), false);
            }
            actionBarLayout.l(false, false);
        }
        org.telegram.ui.ActionBar.a5 a5Var = new org.telegram.ui.ActionBar.a5(n2Var);
        a5Var.c = true;
        a5Var.g = true;
        actionBarLayout.R(a5Var);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.a.f;
    }

    public final void j0(float f7) {
        this.actionBar.getTitlesContainer().setAlpha(f7);
        View view = this.N;
        if (view != null) {
            view.setAlpha(f7);
        }
    }

    public final void k0(TLRPC.User user) {
        String str;
        String str2;
        if (this.E != null && this.V == -1) {
            this.y.r(user);
            this.E.e(user, this.y);
            this.I.setText(UserObject.getUserName(user));
            StringBuilder sb2 = new StringBuilder();
            if (user != null) {
                sb2.append(gf.b.c().b("+" + user.phone));
            }
            String publicUsername = UserObject.getPublicUsername(user);
            if (publicUsername != null) {
                sb2.append(" • @");
                sb2.append(publicUsername);
            }
            this.J.setText(sb2);
            TextView textView = this.K;
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
            } catch (Exception e7) {
                FileLog.e(e7);
                str = null;
            }
            textView.setText(str);
        }
    }

    public final void l0(boolean z10, boolean z11) {
        if (this.r == null) {
            return;
        }
        AnimatorSet animatorSet = this.n;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.n = null;
        }
        if (!z11) {
            if (z10) {
                this.r.setAlpha(1.0f);
                this.r.setVisibility(0);
                return;
            } else {
                this.r.setAlpha(0.0f);
                this.r.setVisibility(4);
                return;
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.n = animatorSet2;
        if (z10) {
            this.r.setVisibility(0);
            this.n.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.z3, Float>) View.ALPHA, 1.0f));
        } else {
            animatorSet2.playTogether(ObjectAnimator.ofFloat(this.r, (Property<org.telegram.ui.Cells.z3, Float>) View.ALPHA, 0.0f));
        }
        this.n.setDuration(180L);
        this.n.addListener(new g70(9, this, z10));
        this.n.start();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x003c, code lost:
    
        if ((r0.getY() + r0.getHeight()) >= r4.actionBar.getHeight()) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m0(boolean z10, boolean z11) {
        boolean z12;
        ValueAnimator valueAnimator;
        org.telegram.ui.ActionBar.q0 q0Var = this.d.F;
        if (q0Var == null || q0Var.getTag() == null) {
            if (this.c.getChildCount() > 0) {
                View childAt = this.c.getChildAt(0);
                this.c.getClass();
                if (RecyclerView.R(childAt) <= 0) {
                }
            }
            z12 = false;
            if (this.Q == z12 || z10) {
                this.Q = z12;
                valueAnimator = this.R;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    this.R = null;
                }
                if (z11) {
                    j0(z12 ? 1.0f : 0.0f);
                    return;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.actionBar.getTitlesContainer().getAlpha(), z12 ? 1.0f : 0.0f);
                this.R = ofFloat;
                ofFloat.addUpdateListener(new b21(this, 10));
                this.R.setInterpolator(org.telegram.ui.Components.tr.h);
                this.R.setDuration(420L);
                this.R.start();
                return;
            }
            return;
        }
        z12 = true;
        if (this.Q == z12) {
        }
        this.Q = z12;
        valueAnimator = this.R;
        if (valueAnimator != null) {
        }
        if (z11) {
        }
    }

    public final void n0() {
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        kVar.setTitleColor(getThemedColor(i10));
        this.actionBar.A(getThemedColor(i10), false);
        this.I.setTextColor(getThemedColor(i10));
        this.J.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.y6));
        this.d.N();
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.d6);
        this.M.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{org.telegram.ui.ActionBar.i6.l1(0.0f, themedColor), themedColor}));
        this.c.invalidate();
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
        NotificationCenter.ObserversGroup observersGroup = this.P;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.P = null;
        }
        this.P = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.updateInterfaces).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.newSuggestionsAvailable);
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.L = bundle.getBoolean("hasMainTabs", false);
        }
        this.U = this.L ? AndroidUtilities.dp(72.0f) : 0;
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.P;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.P = null;
        }
    }

    @Override // org.telegram.ui.bh0
    public final void r() {
        this.c.y0(0);
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean useFadeDrawableForActionBar() {
        return false;
    }

    @Override // org.telegram.ui.bh0
    public final fh.d x() {
        return null;
    }

    public y81(Bundle bundle) {
        super(bundle);
        this.a = new le.b(0, this, org.telegram.ui.Components.tr.h, 350L, false);
        this.O = 0;
        this.S = new ArrayList();
        this.V = -1;
    }

    @Override // org.telegram.ui.Components.x40
    public final /* synthetic */ void N() {
    }

    @Override // le.d
    public final /* synthetic */ void V(float f7, int i10) {
    }
}
