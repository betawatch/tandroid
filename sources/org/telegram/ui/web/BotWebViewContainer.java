package org.telegram.ui.web;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.DownloadManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Environment;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import java.io.File;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.URL;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CameraScanActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedFileDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Paint.Views.LinkPreview;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.voip.CellFlickerDrawable;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.recorder.StoryEntry;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.WrappedResourceProvider;
import org.telegram.ui.bots.BotBiometry;
import org.telegram.ui.bots.BotDownloads;
import org.telegram.ui.bots.BotLocation;
import org.telegram.ui.bots.BotSensors;
import org.telegram.ui.bots.BotShareSheet;
import org.telegram.ui.bots.BotStorage;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.bots.SetupEmojiStatusSheet;
import org.telegram.ui.bots.WebViewRequestProps;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.BrowserHistory;
import org.telegram.ui.web.WebMetadataCache;

/* loaded from: classes5.dex */
public abstract class BotWebViewContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static boolean firstWebView = true;
    private static HashMap rotatedTONHosts;
    private static int tags;
    private BotBiometry biometry;
    private long blockedDialogsUntil;
    public final boolean bot;
    private TLRPC.User botUser;
    private BotWebViewProxy botWebViewProxy;
    private String buttonData;
    private BottomSheet cameraBottomSheet;
    private int currentAccount;
    private AlertDialog currentDialog;
    private String currentPaymentSlug;
    private Delegate delegate;
    private int dialogSequentialOpenTimes;
    private BotDownloads downloads;
    private final CellFlickerDrawable flickerDrawable;
    private BackupImageView flickerView;
    private int flickerViewColor;
    private boolean flickerViewColorOverriden;
    private SvgHelper.SvgDrawable flickerViewDrawable;
    private int forceHeight;
    private boolean hasQRPending;
    private boolean hasUserPermissions;
    private boolean isBackButtonVisible;
    private boolean isFlickeringCenter;
    private boolean isPageLoaded;
    private boolean isRequestingPageOpen;
    private boolean isSettingsButtonVisible;
    private boolean isViewPortByMeasureSuppressed;
    private boolean keyboardFocusable;
    private int lastButtonColor;
    private String lastButtonText;
    private int lastButtonTextColor;
    private long lastClickMs;
    private long lastDialogClosed;
    private long lastDialogCooldownTime;
    private int lastDialogType;
    private boolean lastExpanded;
    private final Rect lastInsets;
    private int lastInsetsTopMargin;
    private long lastPostStoryMs;
    private String lastQrText;
    private int lastSecondaryButtonColor;
    private String lastSecondaryButtonPosition;
    private String lastSecondaryButtonText;
    private int lastSecondaryButtonTextColor;
    private int lastViewportHeightReported;
    private boolean lastViewportIsExpanded;
    private boolean lastViewportStateStable;
    private BotLocation location;
    private ValueCallback mFilePathCallback;
    private String mUrl;
    private final Runnable notifyLocationChecked;
    private Runnable onCloseListener;
    private Runnable onPermissionsRequestResultCallback;
    private Utilities.Callback4 onVerifiedAge;
    private MyWebView opener;
    private Activity parentActivity;
    private boolean preserving;
    private Theme.ResourcesProvider resourcesProvider;
    private String secondaryButtonData;
    private BotStorage secureStorage;
    private BotSensors sensors;
    private int shownDialogsCount;
    private BotStorage storage;
    private final int tag;
    private float viewPortHeightOffset;
    private boolean wasFocusable;
    private WebViewRequestProps wasOpenedByBot;
    private boolean wasOpenedByLinkIntent;
    private MyWebView webView;
    private boolean webViewNotAvailable;
    private TextView webViewNotAvailableText;
    private Consumer webViewProgressListener;
    private WebViewProxy webViewProxy;
    private WebViewScrollListener webViewScrollListener;

    public interface WebViewScrollListener {
        void onWebViewScrolled(WebView webView, int i, int i2);
    }

    protected void onErrorShown(boolean z, int i, String str) {
    }

    protected void onFaviconChanged(Bitmap bitmap) {
    }

    protected void onTitleChanged(String str) {
    }

    protected void onURLChanged(String str, boolean z, boolean z2) {
    }

    public void onWebViewCreated(MyWebView myWebView) {
    }

    public void onWebViewDestroyed(MyWebView myWebView) {
    }

    static /* synthetic */ int access$1508() {
        int i = tags;
        tags = i + 1;
        return i;
    }

    public void showLinkCopiedBulletin() {
        BulletinFactory.of(this, this.resourcesProvider).createCopyLinkBulletin().show(true);
    }

    public BotWebViewContainer(Context context, Theme.ResourcesProvider resourcesProvider, int i, boolean z) {
        super(context);
        CellFlickerDrawable cellFlickerDrawable = new CellFlickerDrawable();
        this.flickerDrawable = cellFlickerDrawable;
        int i2 = Theme.key_featuredStickers_addButton;
        this.lastButtonColor = getColor(i2);
        int i3 = Theme.key_featuredStickers_buttonText;
        this.lastButtonTextColor = getColor(i3);
        this.lastButtonText = "";
        this.lastSecondaryButtonColor = getColor(i2);
        this.lastSecondaryButtonTextColor = getColor(i3);
        this.lastSecondaryButtonText = "";
        this.lastSecondaryButtonPosition = "";
        this.currentAccount = UserConfig.selectedAccount;
        this.forceHeight = -1;
        this.lastInsets = new Rect(0, 0, 0, 0);
        this.lastInsetsTopMargin = 0;
        this.notifyLocationChecked = new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$new$49();
            }
        };
        this.lastDialogType = -1;
        this.shownDialogsCount = 0;
        int i4 = tags;
        tags = i4 + 1;
        this.tag = i4;
        this.bot = z;
        this.resourcesProvider = resourcesProvider;
        d("created new webview container");
        if (context instanceof Activity) {
            this.parentActivity = (Activity) context;
        }
        cellFlickerDrawable.drawFrame = false;
        cellFlickerDrawable.setColors(i, NotificationCenter.recordStartError, NotificationCenter.openBoostForUsersDialog);
        BackupImageView backupImageView = new BackupImageView(context) { // from class: org.telegram.ui.web.BotWebViewContainer.1
            {
                this.imageReceiver = new 1(this);
            }

            class 1 extends ImageReceiver {
                1(View view) {
                    super(view);
                }

                @Override // org.telegram.messenger.ImageReceiver
                protected boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
                    boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i, z, i2);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.web.BotWebViewContainer$1$1$$ExternalSyntheticLambda0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            BotWebViewContainer.1.1.this.lambda$setImageBitmapByKey$0(valueAnimator);
                        }
                    });
                    duration.start();
                    return imageBitmapByKey;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$setImageBitmapByKey$0(ValueAnimator valueAnimator) {
                    ((BackupImageView) 1.this).imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    invalidate();
                }
            }

            @Override // org.telegram.ui.Components.BackupImageView, android.view.View
            protected void onDraw(Canvas canvas) {
                if (BotWebViewContainer.this.isFlickeringCenter) {
                    super.onDraw(canvas);
                    return;
                }
                if (this.imageReceiver.getDrawable() != null) {
                    this.imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), r0.getIntrinsicHeight() * (getWidth() / r0.getIntrinsicWidth()));
                    this.imageReceiver.draw(canvas);
                }
            }
        };
        this.flickerView = backupImageView;
        int color = getColor(Theme.key_bot_loadingIcon);
        this.flickerViewColor = color;
        backupImageView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
        this.flickerView.getImageReceiver().setAspectFit(true);
        addView(this.flickerView, LayoutHelper.createFrame(-1, -2, 48));
        TextView textView = new TextView(context);
        this.webViewNotAvailableText = textView;
        textView.setText(LocaleController.getString(R.string.BotWebViewNotAvailablePlaceholder));
        this.webViewNotAvailableText.setTextColor(getColor(Theme.key_windowBackgroundWhiteGrayText));
        this.webViewNotAvailableText.setTextSize(1, 15.0f);
        this.webViewNotAvailableText.setGravity(17);
        this.webViewNotAvailableText.setVisibility(8);
        int dp = AndroidUtilities.dp(16.0f);
        this.webViewNotAvailableText.setPadding(dp, dp, dp, dp);
        addView(this.webViewNotAvailableText, LayoutHelper.createFrame(-1, -2, 17));
        setFocusable(false);
    }

    public void setViewPortByMeasureSuppressed(boolean z) {
        this.isViewPortByMeasureSuppressed = z;
    }

    public void setFlickerViewColor(int i) {
        int adaptHSV;
        if (AndroidUtilities.computePerceivedBrightness(i) > 0.7f) {
            adaptHSV = Theme.adaptHSV(i, 0.0f, -0.15f);
        } else {
            adaptHSV = Theme.adaptHSV(i, 0.025f, 0.15f);
        }
        if (this.flickerViewColor == adaptHSV) {
            return;
        }
        BackupImageView backupImageView = this.flickerView;
        this.flickerViewColor = adaptHSV;
        backupImageView.setColorFilter(new PorterDuffColorFilter(adaptHSV, PorterDuff.Mode.SRC_IN));
        SvgHelper.SvgDrawable svgDrawable = this.flickerViewDrawable;
        if (svgDrawable != null) {
            svgDrawable.setColor(this.flickerViewColor);
            this.flickerViewDrawable.setupGradient(Theme.key_bot_loadingIcon, this.resourcesProvider, 1.0f, false);
        }
        this.flickerViewColorOverriden = true;
        this.flickerView.invalidate();
        invalidate();
    }

    public void checkCreateWebView() {
        if (this.webView != null || this.webViewNotAvailable) {
            return;
        }
        try {
            setupWebView(null);
        } catch (Throwable th) {
            FileLog.e(th);
            this.flickerView.setVisibility(8);
            this.webViewNotAvailable = true;
            this.webViewNotAvailableText.setVisibility(0);
            if (this.webView != null) {
                removeView(this.webView);
            }
        }
    }

    public void replaceWebView(int i, MyWebView myWebView, Object obj) {
        this.currentAccount = i;
        setupWebView(myWebView, obj);
        if (this.bot) {
            notifyEvent("visibility_changed", obj("is_visible", Boolean.TRUE));
        }
    }

    private void setupWebView(MyWebView myWebView) {
        setupWebView(myWebView, null);
    }

    public BotWebViewProxy getBotProxy() {
        return this.botWebViewProxy;
    }

    public WebViewProxy getProxy() {
        return this.webViewProxy;
    }

    public void setOpener(MyWebView myWebView) {
        MyWebView myWebView2;
        this.opener = myWebView;
        if (this.bot || (myWebView2 = this.webView) == null) {
            return;
        }
        myWebView2.opener = myWebView;
    }

    private static String capitalizeFirst(String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= 1) {
            return str.toUpperCase();
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    private void setupWebView(MyWebView myWebView, Object obj) {
        MyWebView myWebView2;
        String str;
        TLRPC.User user;
        MyWebView myWebView3 = this.webView;
        if (myWebView3 != null) {
            myWebView3.destroy();
            removeView(this.webView);
        }
        if (myWebView != null) {
            AndroidUtilities.removeFromParent(myWebView);
        }
        try {
            WebView.setWebContentsDebuggingEnabled(SharedConfig.debugWebView && !isVerifyingAge());
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (myWebView == null) {
            Context context = getContext();
            boolean z = this.bot;
            myWebView2 = new MyWebView(context, z, (!z || (user = this.botUser) == null) ? 0L : user.id);
        } else {
            myWebView2 = myWebView;
        }
        this.webView = myWebView2;
        if (!this.bot) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this.webView, true);
            CookieManager.getInstance().flush();
            this.webView.opener = this.opener;
        } else {
            myWebView2.setBackgroundColor(getColor(Theme.key_windowBackgroundWhite));
        }
        if (!MessagesController.getInstance(this.currentAccount).disableBotFullscreenBlur) {
            this.webView.setLayerType(2, null);
        }
        this.webView.setContainers(this, this.webViewScrollListener);
        this.webView.setCloseListener(this.onCloseListener);
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setSupportMultipleWindows(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        if (!this.bot) {
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setCacheMode(-1);
            settings.setSaveFormData(true);
            settings.setSavePassword(true);
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(true);
            settings.setDisplayZoomControls(false);
            settings.setUseWideViewPort(true);
            settings.setLoadWithOverviewMode(true);
            if (Build.VERSION.SDK_INT >= 26) {
                settings.setSafeBrowsingEnabled(true);
            }
        }
        if (isVerifyingAge()) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        try {
            String replace = settings.getUserAgentString().replace("; wv)", ")");
            StringBuilder sb = new StringBuilder();
            sb.append("(Linux; Android ");
            String str2 = Build.VERSION.RELEASE;
            sb.append(str2);
            sb.append("; K)");
            String replaceAll = replace.replaceAll("\\(Linux; Android.+;[^)]+\\)", sb.toString()).replaceAll("Version/[\\d\\.]+ ", "");
            if (this.bot) {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                int devicePerformanceClass = SharedConfig.getDevicePerformanceClass();
                if (devicePerformanceClass == 0) {
                    str = "LOW";
                } else {
                    str = devicePerformanceClass == 1 ? "AVERAGE" : "HIGH";
                }
                replaceAll = replaceAll + " Telegram-Android/" + packageInfo.versionName + " (" + capitalizeFirst(Build.MANUFACTURER) + " " + Build.MODEL + "; Android " + str2 + "; SDK " + Build.VERSION.SDK_INT + "; " + str + ")";
            }
            settings.setUserAgentString(replaceAll);
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.webView.setVerticalScrollBarEnabled(false);
        if (myWebView == null && this.bot) {
            this.webView.setAlpha(0.0f);
        }
        addView(this.webView);
        if (this.bot) {
            if (obj instanceof BotWebViewProxy) {
                this.botWebViewProxy = (BotWebViewProxy) obj;
            }
            BotWebViewProxy botWebViewProxy = this.botWebViewProxy;
            if (botWebViewProxy == null) {
                BotWebViewProxy botWebViewProxy2 = new BotWebViewProxy(this);
                this.botWebViewProxy = botWebViewProxy2;
                this.webView.addJavascriptInterface(botWebViewProxy2, "TelegramWebviewProxy");
            } else if (myWebView == null) {
                this.webView.addJavascriptInterface(botWebViewProxy, "TelegramWebviewProxy");
            }
            this.botWebViewProxy.setContainer(this);
        } else {
            if (obj instanceof WebViewProxy) {
                this.webViewProxy = (WebViewProxy) obj;
            }
            WebViewProxy webViewProxy = this.webViewProxy;
            if (webViewProxy == null) {
                WebViewProxy webViewProxy2 = new WebViewProxy(this.webView, this);
                this.webViewProxy = webViewProxy2;
                this.webView.addJavascriptInterface(webViewProxy2, "TelegramWebview");
            } else if (myWebView == null) {
                this.webView.addJavascriptInterface(webViewProxy, "TelegramWebview");
            }
            this.webViewProxy.setContainer(this);
        }
        onWebViewCreated(this.webView);
        firstWebView = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOpenUri(Uri uri) {
        onOpenUri(uri, null, !this.bot, false, false);
    }

    private void onOpenUri(Uri uri, String str, boolean z, boolean z2, boolean z3) {
        if (this.isRequestingPageOpen) {
            return;
        }
        if (System.currentTimeMillis() - this.lastClickMs <= 10000 || !z2) {
            this.lastClickMs = 0L;
            boolean[] zArr = {false};
            if (Browser.isInternalUri(uri, zArr) && !zArr[0] && this.delegate != null) {
                setKeyboardFocusable(false);
            }
            Browser.openUrl(getContext(), uri, true, z, false, null, str, false, true, z3);
        }
    }

    private void updateKeyboardFocusable() {
        if (this.wasFocusable) {
            setDescendantFocusability(393216);
            setFocusable(false);
            MyWebView myWebView = this.webView;
            if (myWebView != null) {
                myWebView.setDescendantFocusability(393216);
                this.webView.clearFocus();
            }
            AndroidUtilities.hideKeyboard(this);
        }
        this.wasFocusable = false;
    }

    public void setKeyboardFocusable(boolean z) {
        this.keyboardFocusable = z;
        updateKeyboardFocusable();
    }

    public static int getMainButtonRippleColor(int i) {
        return ColorUtils.calculateLuminance(i) >= 0.30000001192092896d ? 301989888 : 385875967;
    }

    public static Drawable getMainButtonRippleDrawable(int i) {
        return Theme.createSelectorWithBackgroundDrawable(i, getMainButtonRippleColor(i));
    }

    public void updateFlickerBackgroundColor(int i) {
        this.flickerDrawable.setColors(i, NotificationCenter.recordStartError, NotificationCenter.openBoostForUsersDialog);
    }

    public boolean onBackPressed() {
        if (this.webView == null || !this.isBackButtonVisible) {
            return false;
        }
        notifyEvent("back_button_pressed", null);
        return true;
    }

    public void setPageLoaded(String str, boolean z) {
        MyWebView myWebView = this.webView;
        String str2 = (myWebView == null || !myWebView.dangerousUrl) ? str : myWebView.urlFallback;
        boolean z2 = myWebView == null || !myWebView.canGoBack();
        MyWebView myWebView2 = this.webView;
        onURLChanged(str2, z2, myWebView2 == null || !myWebView2.canGoForward());
        MyWebView myWebView3 = this.webView;
        if (myWebView3 != null) {
            myWebView3.isPageLoaded = true;
            updateKeyboardFocusable();
        }
        if (this.isPageLoaded) {
            d("setPageLoaded: already loaded");
            return;
        }
        if (z && this.webView != null && this.flickerView != null) {
            AnimatorSet animatorSet = new AnimatorSet();
            MyWebView myWebView4 = this.webView;
            Property property = View.ALPHA;
            animatorSet.playTogether(ObjectAnimator.ofFloat(myWebView4, (Property<MyWebView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.flickerView, (Property<BackupImageView, Float>) property, 0.0f));
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: org.telegram.ui.web.BotWebViewContainer.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    BotWebViewContainer.this.flickerView.setVisibility(8);
                }
            });
            animatorSet.start();
        } else {
            MyWebView myWebView5 = this.webView;
            if (myWebView5 != null) {
                myWebView5.setAlpha(1.0f);
            }
            BackupImageView backupImageView = this.flickerView;
            if (backupImageView != null) {
                backupImageView.setAlpha(0.0f);
                this.flickerView.setVisibility(8);
            }
        }
        this.mUrl = str;
        d("setPageLoaded: isPageLoaded = true!");
        this.isPageLoaded = true;
        updateKeyboardFocusable();
        this.delegate.onWebAppReady();
    }

    public void setState(boolean z, String str) {
        d("setState(" + z + ", " + str + ")");
        this.isPageLoaded = z;
        this.mUrl = str;
        updateKeyboardFocusable();
    }

    public void setIsBackButtonVisible(boolean z) {
        this.isBackButtonVisible = z;
    }

    public String getUrlLoaded() {
        return this.mUrl;
    }

    public boolean hasUserPermissions() {
        return this.hasUserPermissions;
    }

    public void setBotUser(TLRPC.User user) {
        this.botUser = user;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runWithPermissions(final String[] strArr, final Consumer consumer) {
        if (Build.VERSION.SDK_INT < 23) {
            consumer.accept(Boolean.TRUE);
            return;
        }
        if (checkPermissions(strArr)) {
            consumer.accept(Boolean.TRUE);
            return;
        }
        this.onPermissionsRequestResultCallback = new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda32
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$runWithPermissions$0(consumer, strArr);
            }
        };
        Activity activity = this.parentActivity;
        if (activity != null) {
            activity.requestPermissions(strArr, 4000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$runWithPermissions$0(Consumer consumer, String[] strArr) {
        consumer.accept(Boolean.valueOf(checkPermissions(strArr)));
    }

    public boolean isPageLoaded() {
        return this.isPageLoaded;
    }

    public void setParentActivity(Activity activity) {
        this.parentActivity = activity;
    }

    private boolean checkPermissions(String[] strArr) {
        int checkSelfPermission;
        for (String str : strArr) {
            checkSelfPermission = getContext().checkSelfPermission(str);
            if (checkSelfPermission != 0) {
                return false;
            }
        }
        return true;
    }

    public void restoreButtonData() {
        try {
            String str = this.buttonData;
            if (str != null) {
                onEventReceived(this.botWebViewProxy, "web_app_setup_main_button", str);
            }
            String str2 = this.secondaryButtonData;
            if (str2 != null) {
                onEventReceived(this.botWebViewProxy, "web_app_setup_secondary_button", str2);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void onInvoiceStatusUpdate(String str, String str2) {
        onInvoiceStatusUpdate(str, str2, false);
    }

    public void onInvoiceStatusUpdate(String str, String str2, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            notifyEvent("invoice_closed", jSONObject);
            FileLog.d("invoice_closed " + jSONObject);
            if (z || !Objects.equals(this.currentPaymentSlug, str)) {
                return;
            }
            this.currentPaymentSlug = null;
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public void onSettingsButtonPressed() {
        this.lastClickMs = System.currentTimeMillis();
        notifyEvent("settings_button_pressed", null);
    }

    public void onMainButtonPressed() {
        this.lastClickMs = System.currentTimeMillis();
        notifyEvent("main_button_pressed", null);
    }

    public void onSecondaryButtonPressed() {
        this.lastClickMs = System.currentTimeMillis();
        notifyEvent("secondary_button_pressed", null);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Runnable runnable;
        if (i != 4000 || (runnable = this.onPermissionsRequestResultCallback) == null) {
            return;
        }
        runnable.run();
        this.onPermissionsRequestResultCallback = null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Uri[] uriArr;
        if (i != 3000 || this.mFilePathCallback == null) {
            return;
        }
        if (i2 == -1 && intent != null) {
            if (intent.getClipData() != null) {
                ClipData clipData = intent.getClipData();
                uriArr = new Uri[clipData.getItemCount()];
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    uriArr[i3] = clipData.getItemAt(i3).getUri();
                }
            } else if (intent.getData() != null) {
                uriArr = new Uri[]{intent.getData()};
            }
            this.mFilePathCallback.onReceiveValue(uriArr);
            this.mFilePathCallback = null;
        }
        uriArr = null;
        this.mFilePathCallback.onReceiveValue(uriArr);
        this.mFilePathCallback = null;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.isViewPortByMeasureSuppressed) {
            return;
        }
        invalidateViewPortHeight(true);
    }

    public void invalidateViewPortHeight() {
        invalidateViewPortHeight(false);
    }

    public void invalidateViewPortHeight(boolean z) {
        invalidateViewPortHeight(z, false);
    }

    public int getMinHeight() {
        if (!(getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
            return 0;
        }
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent();
        if (webViewSwipeContainer.isFullSize()) {
            return (int) ((webViewSwipeContainer.getMeasuredHeight() - webViewSwipeContainer.getOffsetY()) + this.viewPortHeightOffset);
        }
        return 0;
    }

    public void setViewPortHeightOffset(float f) {
        this.viewPortHeightOffset = f;
    }

    public void invalidateViewPortHeight(boolean z, boolean z2) {
        invalidate();
        if ((this.isPageLoaded || z2) && this.bot && (getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent();
            if (z) {
                this.lastExpanded = webViewSwipeContainer.getSwipeOffsetY() == (-webViewSwipeContainer.getOffsetY()) + webViewSwipeContainer.getTopActionBarOffsetY();
            }
            int max = Math.max(getMinHeight(), (int) (((webViewSwipeContainer.getMeasuredHeight() - webViewSwipeContainer.getOffsetY()) - webViewSwipeContainer.getSwipeOffsetY()) + webViewSwipeContainer.getTopActionBarOffsetY() + this.viewPortHeightOffset));
            if (!z2 && max == this.lastViewportHeightReported && this.lastViewportStateStable == z && this.lastViewportIsExpanded == this.lastExpanded) {
                return;
            }
            this.lastViewportHeightReported = max;
            this.lastViewportStateStable = z;
            this.lastViewportIsExpanded = this.lastExpanded;
            notifyEvent_fast("viewport_changed", "{height:" + (max / AndroidUtilities.density) + ",is_state_stable:" + z + ",is_expanded:" + this.lastExpanded + "}");
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.flickerView) {
            if (this.isFlickeringCenter) {
                canvas.save();
                canvas.translate(0.0f, (ActionBar.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            if (this.isFlickeringCenter) {
                canvas.restore();
            }
            if (!this.isFlickeringCenter) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                this.flickerDrawable.draw(canvas, rectF, 0.0f, this);
                invalidate();
            }
            return drawChild;
        }
        if (view == this.webViewNotAvailableText) {
            canvas.save();
            canvas.translate(0.0f, (ActionBar.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        }
        if (view == this.webView) {
            if (AndroidUtilities.makingGlobalBlurBitmap) {
                return true;
            }
            if (getLayerType() == 2 && !canvas.isHardwareAccelerated()) {
                return true;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public void setForceHeight(int i) {
        if (this.forceHeight == i) {
            return;
        }
        this.forceHeight = i;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3 = this.forceHeight;
        if (i3 >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, TLObject.FLAG_30);
        }
        super.onMeasure(i, i2);
        this.flickerDrawable.setParentWidth(getMeasuredWidth());
    }

    public void setWebViewProgressListener(Consumer consumer) {
        this.webViewProgressListener = consumer;
    }

    public MyWebView getWebView() {
        return this.webView;
    }

    public void loadFlickerAndSettingsItem(int i, long j, ActionBarMenuSubItem actionBarMenuSubItem) {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        TLRPC.UserFull userFull = MessagesController.getInstance(i).getUserFull(j);
        String publicUsername = UserObject.getPublicUsername(user);
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            this.flickerView.setVisibility(0);
            this.flickerView.setAlpha(1.0f);
            this.flickerView.setImage(null, null, SvgHelper.getDrawable(R.raw.durgerking_placeholder, Integer.valueOf(getColor(Theme.key_windowBackgroundGray))));
            setupFlickerParams(false);
            return;
        }
        Iterator<TLRPC.TL_attachMenuBot> it = MediaDataController.getInstance(i).getAttachMenuBots().bots.iterator();
        while (true) {
            if (!it.hasNext()) {
                tL_attachMenuBot = null;
                break;
            } else {
                tL_attachMenuBot = it.next();
                if (tL_attachMenuBot.bot_id == j) {
                    break;
                }
            }
        }
        boolean z = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tL_attachMenuBot);
            } else {
                z = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                this.flickerView.setVisibility(0);
                this.flickerView.setAlpha(1.0f);
                this.flickerView.setImage(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), (String) null, (Drawable) null, tL_attachMenuBot);
                setupFlickerParams(z);
                return;
            }
            return;
        }
        if (userFull != null && (botInfo = userFull.bot_info) != null && (botappsettings = botInfo.app_settings) != null && botappsettings.placeholder_svg_path != null) {
            this.flickerView.setVisibility(0);
            this.flickerView.setAlpha(1.0f);
            SvgHelper.SvgDrawable drawableByPath = SvgHelper.getDrawableByPath(userFull.bot_info.app_settings.placeholder_svg_path, 512, 512);
            this.flickerViewDrawable = drawableByPath;
            if (drawableByPath != null) {
                drawableByPath.setColor(this.flickerViewColor);
                this.flickerViewDrawable.setupGradient(Theme.key_bot_loadingIcon, this.resourcesProvider, 1.0f, false);
            }
            this.flickerView.setImage(null, null, this.flickerViewDrawable);
            setupFlickerParams(true);
            return;
        }
        Path path = new Path();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(106.66499f, 106.66499f, 240.355f, 240.355f);
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 106.66499f, 405.335f, 240.355f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(106.66499f, 271.645f, 240.355f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        rectF.set(271.645f, 271.645f, 405.335f, 405.335f);
        path.addRoundRect(rectF, 18.0f, 18.0f, direction);
        this.flickerView.setVisibility(0);
        this.flickerView.setAlpha(1.0f);
        SvgHelper.SvgDrawable drawableByPath2 = SvgHelper.getDrawableByPath(path, 512, 512);
        this.flickerViewDrawable = drawableByPath2;
        if (drawableByPath2 != null) {
            drawableByPath2.setColor(this.flickerViewColor);
            this.flickerViewDrawable.setupGradient(Theme.key_bot_loadingIcon, this.resourcesProvider, 1.0f, false);
        }
        this.flickerView.setImage(null, null, this.flickerViewDrawable);
        setupFlickerParams(true);
    }

    private void setupFlickerParams(boolean z) {
        this.isFlickeringCenter = z;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.flickerView.getLayoutParams();
        layoutParams.gravity = z ? 17 : 48;
        if (z) {
            int dp = AndroidUtilities.dp(100.0f);
            layoutParams.height = dp;
            layoutParams.width = dp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        this.flickerView.requestLayout();
    }

    public void reload() {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$reload$1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reload$1() {
        if (this.isSettingsButtonVisible) {
            this.isSettingsButtonVisible = false;
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onSetSettingsButtonVisible(false);
            }
        }
        checkCreateWebView();
        this.isPageLoaded = false;
        this.lastClickMs = 0L;
        this.hasUserPermissions = false;
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            myWebView.onResume();
            this.webView.reload();
        }
        updateKeyboardFocusable();
        BotSensors botSensors = this.sensors;
        if (botSensors != null) {
            botSensors.stopAll();
        }
    }

    public void loadUrl(int i, final String str) {
        this.currentAccount = i;
        NotificationCenter.getInstance(i).doOnIdle(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$loadUrl$2(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadUrl$2(String str) {
        this.isPageLoaded = false;
        this.lastClickMs = 0L;
        this.hasUserPermissions = false;
        this.mUrl = str;
        checkCreateWebView();
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            myWebView.onResume();
            this.webView.loadUrl(str);
        }
        updateKeyboardFocusable();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        d("attached");
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        Bulletin.addDelegate(this, new Bulletin.Delegate() { // from class: org.telegram.ui.web.BotWebViewContainer.3
            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean allowLayoutChanges() {
                return Bulletin.Delegate.-CC.$default$allowLayoutChanges(this);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.-CC.$default$bottomOffsetAnimated(this);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ boolean clipWithGradient(int i) {
                return Bulletin.Delegate.-CC.$default$clipWithGradient(this, i);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ int getTopOffset(int i) {
                return Bulletin.Delegate.-CC.$default$getTopOffset(this, i);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ void onBottomOffsetChange(float f) {
                Bulletin.Delegate.-CC.$default$onBottomOffsetChange(this, f);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ void onHide(Bulletin bulletin) {
                Bulletin.Delegate.-CC.$default$onHide(this, bulletin);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public /* synthetic */ void onShow(Bulletin bulletin) {
                Bulletin.Delegate.-CC.$default$onShow(this, bulletin);
            }

            @Override // org.telegram.ui.Components.Bulletin.Delegate
            public int getBottomOffset(int i) {
                if (!(BotWebViewContainer.this.getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
                    return 0;
                }
                ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) BotWebViewContainer.this.getParent();
                return (int) ((webViewSwipeContainer.getOffsetY() + webViewSwipeContainer.getSwipeOffsetY()) - webViewSwipeContainer.getTopActionBarOffsetY());
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d("detached");
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
        Bulletin.removeDelegate(this);
    }

    public void preserveWebView() {
        d("preserveWebView");
        this.preserving = true;
        if (this.bot) {
            notifyEvent("visibility_changed", obj("is_visible", Boolean.FALSE));
        }
    }

    public void destroyWebView() {
        d("destroyWebView preserving=" + this.preserving);
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            if (myWebView.getParent() != null) {
                removeView(this.webView);
            }
            if (!this.preserving) {
                this.webView.destroy();
                onWebViewDestroyed(this.webView);
            }
            this.isPageLoaded = false;
            updateKeyboardFocusable();
            if (this.biometry != null) {
                this.biometry = null;
            }
            if (this.storage != null) {
                this.storage = null;
            }
            if (this.secureStorage != null) {
                this.secureStorage = null;
            }
            BotLocation botLocation = this.location;
            if (botLocation != null) {
                botLocation.unlisten(this.notifyLocationChecked);
                this.location = null;
            }
        }
    }

    public void resetWebView() {
        this.webView = null;
    }

    public boolean isBackButtonVisible() {
        return this.isBackButtonVisible;
    }

    public void evaluateJs(final String str, final boolean z) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$evaluateJs$3(z, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$evaluateJs$3(boolean z, String str) {
        if (z) {
            checkCreateWebView();
        }
        MyWebView myWebView = this.webView;
        if (myWebView == null) {
            return;
        }
        myWebView.evaluateJS(str);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didSetNewTheme) {
            MyWebView myWebView = this.webView;
            if (myWebView != null) {
                myWebView.setBackgroundColor(getColor(Theme.key_windowBackgroundWhite));
            }
            if (!this.flickerViewColorOverriden) {
                BackupImageView backupImageView = this.flickerView;
                int i3 = Theme.key_bot_loadingIcon;
                int color = getColor(i3);
                this.flickerViewColor = color;
                backupImageView.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                SvgHelper.SvgDrawable svgDrawable = this.flickerViewDrawable;
                if (svgDrawable != null) {
                    svgDrawable.setColor(this.flickerViewColor);
                    this.flickerViewDrawable.setupGradient(i3, this.resourcesProvider, 1.0f, false);
                }
                this.flickerView.invalidate();
            }
            notifyThemeChanged();
            return;
        }
        if (i == NotificationCenter.onActivityResultReceived) {
            onActivityResult(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), (Intent) objArr[2]);
        } else if (i == NotificationCenter.onRequestPermissionResultReceived) {
            onRequestPermissionsResult(((Integer) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
        }
    }

    public void notifyThemeChanged() {
        notifyEvent("theme_changed", buildThemeParams());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyEvent(String str, JSONObject jSONObject) {
        d("notifyEvent " + str);
        evaluateJs("window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", false);
    }

    private void notifyEvent_fast(String str, String str2) {
        evaluateJs("window.Telegram.WebView.receiveEvent('" + str + "', " + str2 + ");", false);
    }

    private static void notifyEvent(int i, final MyWebView myWebView, final String str, final JSONObject jSONObject) {
        if (myWebView == null) {
            return;
        }
        NotificationCenter.getInstance(i).doOnIdle(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda31
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.lambda$notifyEvent$4(BotWebViewContainer.MyWebView.this, str, jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$notifyEvent$4(MyWebView myWebView, String str, JSONObject jSONObject) {
        myWebView.evaluateJS("window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");");
    }

    public void setWebViewScrollListener(WebViewScrollListener webViewScrollListener) {
        this.webViewScrollListener = webViewScrollListener;
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            myWebView.setContainers(this, webViewScrollListener);
        }
    }

    public void setOnCloseRequestedListener(Runnable runnable) {
        this.onCloseListener = runnable;
        MyWebView myWebView = this.webView;
        if (myWebView != null) {
            myWebView.setCloseListener(runnable);
        }
    }

    public void setWasOpenedByLinkIntent(boolean z) {
        this.wasOpenedByLinkIntent = z;
    }

    public void setWasOpenedByBot(WebViewRequestProps webViewRequestProps) {
        this.wasOpenedByBot = webViewRequestProps;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onWebEventReceived(String str, String str2) {
        boolean z;
        boolean z2 = true;
        if (this.bot || this.delegate == null) {
            return;
        }
        d("onWebEventReceived " + str + " " + str2);
        str.hashCode();
        switch (str) {
            case "actionBarColor":
            case "navigationBarColor":
                try {
                    JSONArray jSONArray = new JSONArray(str2);
                    boolean equals = TextUtils.equals(str, "actionBarColor");
                    int argb = Color.argb((int) Math.round(jSONArray.optDouble(3, 1.0d) * 255.0d), (int) Math.round(jSONArray.optDouble(0)), (int) Math.round(jSONArray.optDouble(1)), (int) Math.round(jSONArray.optDouble(2)));
                    MyWebView myWebView = this.webView;
                    if (myWebView != null) {
                        if (equals) {
                            myWebView.lastActionBarColorGot = true;
                            myWebView.lastActionBarColor = argb;
                        } else {
                            myWebView.lastBackgroundColorGot = true;
                            myWebView.lastBackgroundColor = argb;
                        }
                        myWebView.saveHistory();
                    }
                    this.delegate.onWebAppBackgroundChanged(equals, argb);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case "siteName":
                d("siteName " + str2);
                MyWebView myWebView2 = this.webView;
                if (myWebView2 != null) {
                    myWebView2.lastSiteName = str2;
                    myWebView2.saveHistory();
                    break;
                }
                break;
            case "allowScroll":
                try {
                    JSONArray jSONArray2 = new JSONArray(str2);
                    z = jSONArray2.optBoolean(0, true);
                    try {
                        z2 = jSONArray2.optBoolean(1, true);
                    } catch (Exception unused2) {
                    }
                } catch (Exception unused3) {
                    z = true;
                }
                if (getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) {
                    ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent()).allowThisScroll(z, z2);
                    break;
                }
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0cf7 A[ADDED_TO_REGION, REMOVE, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0cf8  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:744:0x0771 A[Catch: Exception -> 0x069a, TRY_LEAVE, TryCatch #13 {Exception -> 0x069a, blocks: (B:728:0x0671, B:744:0x0771, B:748:0x06bc, B:750:0x06c1, B:764:0x0701, B:765:0x0704, B:766:0x0707, B:767:0x06db, B:770:0x06e5, B:773:0x06ed, B:776:0x070a, B:777:0x0714, B:789:0x075b, B:790:0x075f, B:791:0x0763, B:792:0x0767, B:793:0x076b, B:794:0x0718, B:797:0x0722, B:800:0x072c, B:803:0x0736, B:806:0x0740, B:809:0x0690, B:812:0x069d, B:815:0x06a7), top: B:727:0x0671 }] */
    /* JADX WARN: Removed duplicated region for block: B:759:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0707 A[Catch: Exception -> 0x069a, TryCatch #13 {Exception -> 0x069a, blocks: (B:728:0x0671, B:744:0x0771, B:748:0x06bc, B:750:0x06c1, B:764:0x0701, B:765:0x0704, B:766:0x0707, B:767:0x06db, B:770:0x06e5, B:773:0x06ed, B:776:0x070a, B:777:0x0714, B:789:0x075b, B:790:0x075f, B:791:0x0763, B:792:0x0767, B:793:0x076b, B:794:0x0718, B:797:0x0722, B:800:0x072c, B:803:0x0736, B:806:0x0740, B:809:0x0690, B:812:0x069d, B:815:0x06a7), top: B:727:0x0671 }] */
    /* JADX WARN: Removed duplicated region for block: B:776:0x070a A[Catch: Exception -> 0x069a, TryCatch #13 {Exception -> 0x069a, blocks: (B:728:0x0671, B:744:0x0771, B:748:0x06bc, B:750:0x06c1, B:764:0x0701, B:765:0x0704, B:766:0x0707, B:767:0x06db, B:770:0x06e5, B:773:0x06ed, B:776:0x070a, B:777:0x0714, B:789:0x075b, B:790:0x075f, B:791:0x0763, B:792:0x0767, B:793:0x076b, B:794:0x0718, B:797:0x0722, B:800:0x072c, B:803:0x0736, B:806:0x0740, B:809:0x0690, B:812:0x069d, B:815:0x06a7), top: B:727:0x0671 }] */
    /* JADX WARN: Removed duplicated region for block: B:946:0x0deb  */
    /* JADX WARN: Removed duplicated region for block: B:989:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:993:0x04bd A[Catch: Exception -> 0x0481, TRY_LEAVE, TryCatch #41 {Exception -> 0x0481, blocks: (B:975:0x0462, B:977:0x0472, B:979:0x0478, B:982:0x0483, B:993:0x04bd, B:996:0x04b4, B:998:0x04b8, B:999:0x0498, B:1002:0x04a2), top: B:974:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:998:0x04b8 A[Catch: Exception -> 0x0481, TryCatch #41 {Exception -> 0x0481, blocks: (B:975:0x0462, B:977:0x0472, B:979:0x0478, B:982:0x0483, B:993:0x04bd, B:996:0x04b4, B:998:0x04b8, B:999:0x0498, B:1002:0x04a2), top: B:974:0x0462 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onEventReceived(final BotWebViewProxy botWebViewProxy, String str, String str2) {
        char c;
        char c2;
        int i;
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        JSONArray jSONArray;
        String str3;
        String str4;
        boolean z4;
        char c3;
        char c4;
        BotWebViewVibrationEffect botWebViewVibrationEffect;
        BotWebViewVibrationEffect botWebViewVibrationEffect2;
        char c5;
        boolean z5;
        LaunchActivity launchActivity;
        BottomSheetTabs.WebTabData webTabData;
        String str5;
        int parseColor;
        BottomSheet bottomSheet;
        TextView textView;
        TextView textView2;
        TextView textView3;
        long j;
        int i3;
        int checkSelfPermission;
        boolean z6;
        boolean z7;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        final String str11;
        final String str12;
        final String str13;
        JSONObject jSONObject;
        JSONObject optJSONObject;
        String str14;
        long j2;
        boolean z8;
        if (this.bot) {
            if (this.webView == null || this.delegate == null) {
                d("onEventReceived " + str + ": no webview or delegate!");
                return;
            }
            d("onEventReceived " + str);
            str.hashCode();
            long j3 = 1000;
            switch (str.hashCode()) {
                case -2016939055:
                    if (str.equals("web_app_invoke_custom_method")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1898902656:
                    if (str.equals("web_app_close_scan_qr_popup")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1736707758:
                    if (str.equals("web_app_biometry_get_info")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1717314938:
                    if (str.equals("web_app_open_link")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -1715704462:
                    if (str.equals("web_app_request_file_download")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case -1693280352:
                    if (str.equals("web_app_open_popup")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case -1390641887:
                    if (str.equals("web_app_open_invoice")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -1385387727:
                    if (str.equals("web_app_set_emoji_status")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case -1353432696:
                    if (str.equals("web_app_setup_secondary_button")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case -1341039673:
                    if (str.equals("web_app_setup_closing_behavior")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case -1309122684:
                    if (str.equals("web_app_open_scan_qr_popup")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case -1263619595:
                    if (str.equals("web_app_request_phone")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case -1259935152:
                    if (str.equals("web_app_request_theme")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case -1229296877:
                    if (str.equals("web_app_secure_storage_get_key")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case -1183558219:
                    if (str.equals("web_app_check_location")) {
                        c = 14;
                        break;
                    }
                    c = 65535;
                    break;
                case -1093591555:
                    if (str.equals("web_app_biometry_open_settings")) {
                        c = 15;
                        break;
                    }
                    c = 65535;
                    break;
                case -921083201:
                    if (str.equals("web_app_request_viewport")) {
                        c = 16;
                        break;
                    }
                    c = 65535;
                    break;
                case -907261345:
                    if (str.equals("web_app_request_emoji_status_access")) {
                        c = 17;
                        break;
                    }
                    c = 65535;
                    break;
                case -620103109:
                    if (str.equals("web_app_stop_device_orientation")) {
                        c = 18;
                        break;
                    }
                    c = 65535;
                    break;
                case -585008607:
                    if (str.equals("web_app_device_storage_save_key")) {
                        c = 19;
                        break;
                    }
                    c = 65535;
                    break;
                case -581005326:
                    if (str.equals("web_app_device_storage_get_key")) {
                        c = 20;
                        break;
                    }
                    c = 65535;
                    break;
                case -512688845:
                    if (str.equals("web_app_biometry_request_auth")) {
                        c = 21;
                        break;
                    }
                    c = 65535;
                    break;
                case -498118340:
                    if (str.equals("web_app_toggle_orientation_lock")) {
                        c = 22;
                        break;
                    }
                    c = 65535;
                    break;
                case -474676372:
                    if (str.equals("web_app_allow_scroll")) {
                        c = 23;
                        break;
                    }
                    c = 65535;
                    break;
                case -439770054:
                    if (str.equals("web_app_open_tg_link")) {
                        c = 24;
                        break;
                    }
                    c = 65535;
                    break;
                case -293897269:
                    if (str.equals("web_app_secure_storage_restore_key")) {
                        c = 25;
                        break;
                    }
                    c = 65535;
                    break;
                case -244584646:
                    if (str.equals("web_app_share_to_story")) {
                        c = 26;
                        break;
                    }
                    c = 65535;
                    break;
                case -216725042:
                    if (str.equals("web_app_request_location")) {
                        c = 27;
                        break;
                    }
                    c = 65535;
                    break;
                case -111186465:
                    if (str.equals("web_app_start_gyroscope")) {
                        c = 28;
                        break;
                    }
                    c = 65535;
                    break;
                case -71726289:
                    if (str.equals("web_app_close")) {
                        c = 29;
                        break;
                    }
                    c = 65535;
                    break;
                case -58095910:
                    if (str.equals("web_app_ready")) {
                        c = 30;
                        break;
                    }
                    c = 65535;
                    break;
                case 22015443:
                    if (str.equals("web_app_read_text_from_clipboard")) {
                        c = 31;
                        break;
                    }
                    c = 65535;
                    break;
                case 127735931:
                    if (str.equals("web_app_hide_keyboard")) {
                        c = ' ';
                        break;
                    }
                    c = 65535;
                    break;
                case 189207985:
                    if (str.equals("web_app_stop_gyroscope")) {
                        c = '!';
                        break;
                    }
                    c = 65535;
                    break;
                case 267846314:
                    if (str.equals("web_app_secure_storage_clear")) {
                        c = '\"';
                        break;
                    }
                    c = 65535;
                    break;
                case 348967753:
                    if (str.equals("web_app_device_storage_clear")) {
                        c = '#';
                        break;
                    }
                    c = 65535;
                    break;
                case 420328489:
                    if (str.equals("web_app_start_accelerometer")) {
                        c = '$';
                        break;
                    }
                    c = 65535;
                    break;
                case 475603707:
                    if (str.equals("web_app_stop_accelerometer")) {
                        c = '%';
                        break;
                    }
                    c = 65535;
                    break;
                case 622108947:
                    if (str.equals("web_app_send_prepared_message")) {
                        c = '&';
                        break;
                    }
                    c = 65535;
                    break;
                case 668142772:
                    if (str.equals("web_app_data_send")) {
                        c = '\'';
                        break;
                    }
                    c = 65535;
                    break;
                case 671811520:
                    if (str.equals("web_app_request_content_safe_area")) {
                        c = '(';
                        break;
                    }
                    c = 65535;
                    break;
                case 721956751:
                    if (str.equals("web_app_add_to_home_screen")) {
                        c = ')';
                        break;
                    }
                    c = 65535;
                    break;
                case 748864404:
                    if (str.equals("web_app_request_fullscreen")) {
                        c = '*';
                        break;
                    }
                    c = 65535;
                    break;
                case 751292356:
                    if (str.equals("web_app_switch_inline_query")) {
                        c = '+';
                        break;
                    }
                    c = 65535;
                    break;
                case 792789792:
                    if (str.equals("web_app_secure_storage_save_key")) {
                        c = ',';
                        break;
                    }
                    c = 65535;
                    break;
                case 796110323:
                    if (str.equals("web_app_exit_fullscreen")) {
                        c = '-';
                        break;
                    }
                    c = 65535;
                    break;
                case 880626018:
                    if (str.equals("web_app_verify_age")) {
                        c = '.';
                        break;
                    }
                    c = 65535;
                    break;
                case 909476449:
                    if (str.equals("web_app_open_location_settings")) {
                        c = '/';
                        break;
                    }
                    c = 65535;
                    break;
                case 1011447167:
                    if (str.equals("web_app_setup_back_button")) {
                        c = '0';
                        break;
                    }
                    c = 65535;
                    break;
                case 1210129967:
                    if (str.equals("web_app_biometry_request_access")) {
                        c = '1';
                        break;
                    }
                    c = 65535;
                    break;
                case 1273834781:
                    if (str.equals("web_app_trigger_haptic_feedback")) {
                        c = '2';
                        break;
                    }
                    c = 65535;
                    break;
                case 1398490221:
                    if (str.equals("web_app_setup_main_button")) {
                        c = '3';
                        break;
                    }
                    c = 65535;
                    break;
                case 1453051298:
                    if (str.equals("web_app_setup_swipe_behavior")) {
                        c = '4';
                        break;
                    }
                    c = 65535;
                    break;
                case 1455972419:
                    if (str.equals("web_app_setup_settings_button")) {
                        c = '5';
                        break;
                    }
                    c = 65535;
                    break;
                case 1495787980:
                    if (str.equals("web_app_check_home_screen")) {
                        c = '6';
                        break;
                    }
                    c = 65535;
                    break;
                case 1812395469:
                    if (str.equals("web_app_start_device_orientation")) {
                        c = '7';
                        break;
                    }
                    c = 65535;
                    break;
                case 1882780382:
                    if (str.equals("web_app_biometry_update_token")) {
                        c = '8';
                        break;
                    }
                    c = 65535;
                    break;
                case 1899078473:
                    if (str.equals("web_app_set_bottom_bar_color")) {
                        c = '9';
                        break;
                    }
                    c = 65535;
                    break;
                case 1917103703:
                    if (str.equals("web_app_set_header_color")) {
                        c = ':';
                        break;
                    }
                    c = 65535;
                    break;
                case 1937068806:
                    if (str.equals("web_app_request_safe_area")) {
                        c = ';';
                        break;
                    }
                    c = 65535;
                    break;
                case 2001330488:
                    if (str.equals("web_app_set_background_color")) {
                        c = '<';
                        break;
                    }
                    c = 65535;
                    break;
                case 2036090717:
                    if (str.equals("web_app_request_write_access")) {
                        c = '=';
                        break;
                    }
                    c = 65535;
                    break;
                case 2139805763:
                    if (str.equals("web_app_expand")) {
                        c = '>';
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    if (this.botUser != null) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(str2);
                            final String string = jSONObject2.getString("req_id");
                            String string2 = jSONObject2.getString("method");
                            String obj = jSONObject2.get("params").toString();
                            final int i4 = this.currentAccount;
                            final MyWebView myWebView = this.webView;
                            TL_bots.invokeWebViewCustomMethod invokewebviewcustommethod = new TL_bots.invokeWebViewCustomMethod();
                            invokewebviewcustommethod.bot = MessagesController.getInstance(i4).getInputUser(this.botUser.id);
                            invokewebviewcustommethod.custom_method = string2;
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            invokewebviewcustommethod.params = tL_dataJSON;
                            tL_dataJSON.data = obj;
                            ConnectionsManager.getInstance(i4).sendRequest(invokewebviewcustommethod, new RequestDelegate() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda22
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    BotWebViewContainer.this.lambda$onEventReceived$19(string, i4, myWebView, tLObject, tL_error);
                                }
                            });
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            if (e instanceof JSONException) {
                                error("JSON Parse error");
                                return;
                            } else {
                                unknownError();
                                return;
                            }
                        }
                    }
                    break;
                case 1:
                    if (this.hasQRPending && (bottomSheet = this.cameraBottomSheet) != null) {
                        bottomSheet.dismiss();
                        break;
                    }
                    break;
                case 2:
                    notifyBiometryReceived();
                    break;
                case 3:
                    try {
                        JSONObject jSONObject3 = new JSONObject(str2);
                        Uri parse = Uri.parse(jSONObject3.optString("url"));
                        String optString = jSONObject3.optString("try_browser");
                        if (MessagesController.getInstance(this.currentAccount).webAppAllowedProtocols != null && MessagesController.getInstance(this.currentAccount).webAppAllowedProtocols.contains(parse.getScheme())) {
                            onOpenUri(parse, optString, jSONObject3.optBoolean("try_instant_view"), true, false);
                            break;
                        }
                    } catch (Exception e2) {
                        FileLog.e(e2);
                        return;
                    }
                    break;
                case 4:
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        if (this.downloads == null) {
                            this.downloads = BotDownloads.get(getContext(), this.currentAccount, this.botUser.id);
                        }
                        try {
                            JSONObject jSONObject4 = new JSONObject(str2);
                            final String string3 = jSONObject4.getString("url");
                            final String string4 = jSONObject4.getString("file_name");
                            if (this.downloads.getCached(string3) != null) {
                                this.downloads.download(string3, string4);
                                notifyEvent("file_download_requested", obj("status", "downloading"));
                                break;
                            } else {
                                TL_bots.checkDownloadFileParams checkdownloadfileparams = new TL_bots.checkDownloadFileParams();
                                checkdownloadfileparams.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botUser);
                                checkdownloadfileparams.file_name = string4;
                                checkdownloadfileparams.url = string3;
                                ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkdownloadfileparams, new RequestDelegate() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda21
                                    @Override // org.telegram.tgnet.RequestDelegate
                                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                        BotWebViewContainer.this.lambda$onEventReceived$43(string3, string4, tLObject, tL_error);
                                    }
                                });
                                break;
                            }
                        } catch (Exception e3) {
                            FileLog.e(e3);
                            notifyEvent("file_download_requested", obj("status", "cancelled"));
                            return;
                        }
                    }
                    break;
                case 5:
                    try {
                        if (this.currentDialog != null) {
                            break;
                        } else {
                            if (System.currentTimeMillis() - this.lastDialogClosed <= 150) {
                                int i5 = this.dialogSequentialOpenTimes + 1;
                                this.dialogSequentialOpenTimes = i5;
                                if (i5 >= 3) {
                                    this.dialogSequentialOpenTimes = 0;
                                    this.lastDialogCooldownTime = System.currentTimeMillis();
                                    break;
                                }
                            }
                            if (System.currentTimeMillis() - this.lastDialogCooldownTime <= 3000) {
                                break;
                            } else {
                                JSONObject jSONObject5 = new JSONObject(str2);
                                String optString2 = jSONObject5.optString("title", null);
                                String string5 = jSONObject5.getString("message");
                                JSONArray jSONArray2 = jSONObject5.getJSONArray("buttons");
                                AlertDialog.Builder message = new AlertDialog.Builder(getContext()).setTitle(optString2).setMessage(string5);
                                ArrayList arrayList = new ArrayList();
                                for (int i6 = 0; i6 < jSONArray2.length(); i6++) {
                                    arrayList.add(new PopupButton(jSONArray2.getJSONObject(i6)));
                                }
                                if (arrayList.size() > 3) {
                                    break;
                                } else {
                                    final AtomicBoolean atomicBoolean = new AtomicBoolean();
                                    if (arrayList.size() >= 1) {
                                        final PopupButton popupButton = (PopupButton) arrayList.get(0);
                                        message.setPositiveButton(popupButton.text, new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda17
                                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                                            public final void onClick(AlertDialog alertDialog, int i7) {
                                                BotWebViewContainer.this.lambda$onEventReceived$5(popupButton, atomicBoolean, alertDialog, i7);
                                            }
                                        });
                                    }
                                    if (arrayList.size() >= 2) {
                                        final PopupButton popupButton2 = (PopupButton) arrayList.get(1);
                                        message.setNegativeButton(popupButton2.text, new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda18
                                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                                            public final void onClick(AlertDialog alertDialog, int i7) {
                                                BotWebViewContainer.this.lambda$onEventReceived$6(popupButton2, atomicBoolean, alertDialog, i7);
                                            }
                                        });
                                    }
                                    if (arrayList.size() == 3) {
                                        final PopupButton popupButton3 = (PopupButton) arrayList.get(2);
                                        message.setNeutralButton(popupButton3.text, new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda19
                                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                                            public final void onClick(AlertDialog alertDialog, int i7) {
                                                BotWebViewContainer.this.lambda$onEventReceived$7(popupButton3, atomicBoolean, alertDialog, i7);
                                            }
                                        });
                                    }
                                    message.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda20
                                        @Override // android.content.DialogInterface.OnDismissListener
                                        public final void onDismiss(DialogInterface dialogInterface) {
                                            BotWebViewContainer.this.lambda$onEventReceived$8(atomicBoolean, dialogInterface);
                                        }
                                    });
                                    this.currentDialog = message.show();
                                    if (arrayList.size() >= 1) {
                                        PopupButton popupButton4 = (PopupButton) arrayList.get(0);
                                        if (popupButton4.textColorKey >= 0 && (textView3 = (TextView) this.currentDialog.getButton(-1)) != null) {
                                            textView3.setTextColor(getColor(popupButton4.textColorKey));
                                        }
                                    }
                                    if (arrayList.size() >= 2) {
                                        PopupButton popupButton5 = (PopupButton) arrayList.get(1);
                                        if (popupButton5.textColorKey >= 0 && (textView2 = (TextView) this.currentDialog.getButton(-2)) != null) {
                                            textView2.setTextColor(getColor(popupButton5.textColorKey));
                                        }
                                    }
                                    if (arrayList.size() == 3) {
                                        PopupButton popupButton6 = (PopupButton) arrayList.get(2);
                                        if (popupButton6.textColorKey >= 0 && (textView = (TextView) this.currentDialog.getButton(-3)) != null) {
                                            textView.setTextColor(getColor(popupButton6.textColorKey));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (JSONException e4) {
                        FileLog.e(e4);
                        return;
                    }
                    break;
                case 6:
                    try {
                        final String optString3 = new JSONObject(str2).optString("slug");
                        if (this.currentPaymentSlug != null) {
                            onInvoiceStatusUpdate(optString3, "cancelled", true);
                        } else {
                            this.currentPaymentSlug = optString3;
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                            final TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                            tL_inputInvoiceSlug.slug = optString3;
                            tL_payments_getPaymentForm.invoice = tL_inputInvoiceSlug;
                            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda16
                                @Override // org.telegram.tgnet.RequestDelegate
                                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                    BotWebViewContainer.this.lambda$onEventReceived$10(optString3, tL_inputInvoiceSlug, tLObject, tL_error);
                                }
                            });
                        }
                        break;
                    } catch (JSONException e5) {
                        FileLog.e(e5);
                        return;
                    }
                case 7:
                    long j4 = 0;
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        try {
                            JSONObject jSONObject6 = new JSONObject(str2);
                            j4 = Long.parseLong(jSONObject6.getString("custom_emoji_id"));
                            i3 = jSONObject6.getInt("duration");
                            j = j4;
                        } catch (Exception unused) {
                            j = j4;
                            i3 = 0;
                        }
                        TLRPC.User user = this.botUser;
                        if (user == null) {
                            notifyEvent("emoji_status_failed", obj("error", "UNKNOWN_ERROR"));
                            break;
                        } else {
                            SetupEmojiStatusSheet.show(this.currentAccount, user, j, i3, new Utilities.Callback2() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda15
                                @Override // org.telegram.messenger.Utilities.Callback2
                                public final void run(Object obj2, Object obj3) {
                                    BotWebViewContainer.this.lambda$onEventReceived$36((String) obj2, (TLRPC.Document) obj3);
                                }
                            });
                            break;
                        }
                    }
                    break;
                case '\b':
                    try {
                        JSONObject jSONObject7 = new JSONObject(str2);
                        boolean optBoolean = jSONObject7.optBoolean("is_active", false);
                        String trim = jSONObject7.optString("text", this.lastSecondaryButtonText).trim();
                        boolean z9 = jSONObject7.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim);
                        int parseColor2 = jSONObject7.has("color") ? Color.parseColor(jSONObject7.optString("color")) : this.lastSecondaryButtonColor;
                        int parseColor3 = jSONObject7.has("text_color") ? Color.parseColor(jSONObject7.optString("text_color")) : this.lastSecondaryButtonTextColor;
                        boolean z10 = jSONObject7.optBoolean("is_progress_visible", false) && z9;
                        boolean z11 = jSONObject7.optBoolean("has_shine_effect", false) && z9;
                        String optString4 = jSONObject7.has("position") ? jSONObject7.optString("position") : this.lastSecondaryButtonPosition;
                        if (optString4 == null) {
                            optString4 = "left";
                        }
                        this.lastSecondaryButtonColor = parseColor2;
                        this.lastSecondaryButtonTextColor = parseColor3;
                        this.lastSecondaryButtonText = trim;
                        this.lastSecondaryButtonPosition = optString4;
                        this.secondaryButtonData = str2;
                        this.delegate.onSetupSecondaryButton(z9, optBoolean, trim, parseColor2, parseColor3, z10, z11, optString4);
                        break;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                        return;
                    }
                case '\t':
                    try {
                        this.delegate.onWebAppSetupClosingBehavior(new JSONObject(str2).optBoolean("need_confirmation"));
                        break;
                    } catch (JSONException e7) {
                        FileLog.e(e7);
                        return;
                    }
                case '\n':
                    try {
                        if (!this.hasQRPending && this.parentActivity != null) {
                            this.lastQrText = new JSONObject(str2).optString("text");
                            this.hasQRPending = true;
                            if (Build.VERSION.SDK_INT >= 23) {
                                checkSelfPermission = this.parentActivity.checkSelfPermission("android.permission.CAMERA");
                                if (checkSelfPermission != 0) {
                                    NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() { // from class: org.telegram.ui.web.BotWebViewContainer.4
                                        @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
                                        public void didReceivedNotification(int i7, int i8, Object... objArr) {
                                            int i9 = NotificationCenter.onRequestPermissionResultReceived;
                                            if (i7 == i9) {
                                                int intValue = ((Integer) objArr[0]).intValue();
                                                int[] iArr = (int[]) objArr[2];
                                                if (intValue == 5000) {
                                                    NotificationCenter.getGlobalInstance().removeObserver(this, i9);
                                                    if (iArr[0] == 0) {
                                                        BotWebViewContainer.this.openQrScanActivity();
                                                    } else {
                                                        BotWebViewContainer.this.notifyEvent("scan_qr_popup_closed", new JSONObject());
                                                    }
                                                }
                                            }
                                        }
                                    }, NotificationCenter.onRequestPermissionResultReceived);
                                    this.parentActivity.requestPermissions(new String[]{"android.permission.CAMERA"}, 5000);
                                    break;
                                }
                            }
                            openQrScanActivity();
                            break;
                        }
                    } catch (JSONException e8) {
                        FileLog.e(e8);
                        return;
                    }
                    break;
                case 11:
                    if (ignoreDialog(4)) {
                        try {
                            JSONObject jSONObject8 = new JSONObject();
                            jSONObject8.put("status", "cancelled");
                            notifyEvent("phone_requested", jSONObject8);
                            break;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    } else {
                        final int i7 = this.currentAccount;
                        final MyWebView myWebView2 = this.webView;
                        final String[] strArr = {"cancelled"};
                        AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), this.resourcesProvider);
                        builder.setTitle(LocaleController.getString(R.string.ShareYouPhoneNumberTitle));
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        String userName = UserObject.getUserName(this.botUser);
                        if (TextUtils.isEmpty(userName)) {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot)));
                        } else {
                            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureShareMyContactInfoWebapp, userName)));
                        }
                        final boolean z12 = MessagesController.getInstance(this.currentAccount).blockePeers.indexOfKey(this.botUser.id) >= 0;
                        if (z12) {
                            spannableStringBuilder.append((CharSequence) "\n\n");
                            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.AreYouSureShareMyContactInfoBotUnblock));
                        }
                        builder.setMessage(spannableStringBuilder);
                        builder.setPositiveButton(LocaleController.getString(R.string.ShareContact), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda11
                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                            public final void onClick(AlertDialog alertDialog, int i8) {
                                BotWebViewContainer.this.lambda$onEventReceived$21(strArr, z12, i7, myWebView2, alertDialog, i8);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda12
                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                            public final void onClick(AlertDialog alertDialog, int i8) {
                                alertDialog.dismiss();
                            }
                        });
                        showDialog(4, builder.create(), new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda13
                            @Override // java.lang.Runnable
                            public final void run() {
                                BotWebViewContainer.lambda$onEventReceived$23(strArr, i7, myWebView2);
                            }
                        });
                        break;
                    }
                case '\f':
                    notifyThemeChanged();
                    break;
                case '\r':
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            Context context = getContext();
                            int i8 = this.currentAccount;
                            this.secureStorage = new BotStorage(context, i8, UserConfig.getInstance(i8).getClientUserId(), this.botUser.id, true);
                        }
                        getStorageKey(this.secureStorage, str2, "secure_storage_key_received", "secure_storage_failed");
                        break;
                    }
                    break;
                case 14:
                    if (this.location == null) {
                        BotLocation botLocation = BotLocation.get(getContext(), this.currentAccount, this.botUser.id);
                        this.location = botLocation;
                        botLocation.listen(this.notifyLocationChecked);
                    }
                    this.notifyLocationChecked.run();
                    break;
                case 15:
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        this.lastClickMs = 0L;
                        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment != null && safeLastFragment.getParentLayout() != null) {
                            INavigationLayout parentLayout = safeLastFragment.getParentLayout();
                            safeLastFragment.presentFragment(ProfileActivity.of(this.botUser.id));
                            AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionBiometry");
                            Delegate delegate = this.delegate;
                            if (delegate != null) {
                                delegate.onCloseToTabs();
                                break;
                            }
                        }
                    }
                    break;
                case 16:
                    if ((getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) && ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent()).isSwipeInProgress()) {
                        z6 = true;
                        z7 = true;
                    } else {
                        z6 = true;
                        z7 = false;
                    }
                    invalidateViewPortHeight(!z7, z6);
                    break;
                case 17:
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        SetupEmojiStatusSheet.askPermission(this.currentAccount, this.botUser.id, new Utilities.Callback2() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda10
                            @Override // org.telegram.messenger.Utilities.Callback2
                            public final void run(Object obj2, Object obj3) {
                                BotWebViewContainer.this.lambda$onEventReceived$37((Boolean) obj2, (String) obj3);
                            }
                        });
                        break;
                    }
                    break;
                case 18:
                    BotSensors botSensors = this.delegate.getBotSensors();
                    if (botSensors != null && botSensors.stopOrientation()) {
                        notifyEvent("device_orientation_stopped", null);
                        break;
                    } else {
                        notifyEvent("device_orientation_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                case 19:
                    if (this.botUser != null) {
                        if (this.storage == null) {
                            Context context2 = getContext();
                            int i9 = this.currentAccount;
                            this.storage = new BotStorage(context2, i9, UserConfig.getInstance(i9).getClientUserId(), this.botUser.id, false);
                        }
                        setStorageKey(this.storage, str2, "device_storage_key_saved", "device_storage_failed");
                        break;
                    }
                    break;
                case 20:
                    if (this.botUser != null) {
                        if (this.storage == null) {
                            Context context3 = getContext();
                            int i10 = this.currentAccount;
                            this.storage = new BotStorage(context3, i10, UserConfig.getInstance(i10).getClientUserId(), this.botUser.id, false);
                        }
                        getStorageKey(this.storage, str2, "device_storage_key_received", "device_storage_failed");
                        break;
                    }
                    break;
                case 21:
                    try {
                        str6 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused2) {
                        str6 = null;
                    }
                    createBiometry();
                    BotBiometry botBiometry = this.biometry;
                    if (botBiometry != null) {
                        if (!botBiometry.access_granted) {
                            try {
                                JSONObject jSONObject9 = new JSONObject();
                                jSONObject9.put("status", "failed");
                                notifyEvent("biometry_auth_requested", jSONObject9);
                                break;
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                return;
                            }
                        } else {
                            botBiometry.requestToken(str6, new Utilities.Callback2() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda9
                                @Override // org.telegram.messenger.Utilities.Callback2
                                public final void run(Object obj2, Object obj3) {
                                    BotWebViewContainer.this.lambda$onEventReceived$29((Boolean) obj2, (String) obj3);
                                }
                            });
                            break;
                        }
                    }
                    break;
                case 22:
                    try {
                        z = new JSONObject(str2).getBoolean("locked");
                    } catch (Exception unused3) {
                        z = false;
                    }
                    Delegate delegate2 = this.delegate;
                    if (delegate2 != null) {
                        delegate2.onOrientationLockChanged(z);
                        break;
                    }
                    break;
                case 23:
                    try {
                        jSONArray = new JSONArray(str2);
                        z2 = jSONArray.optBoolean(0, true);
                    } catch (Exception unused4) {
                        z2 = true;
                    }
                    try {
                        z3 = jSONArray.optBoolean(1, true);
                    } catch (Exception unused5) {
                        z3 = true;
                        d("allowScroll " + z2 + " " + z3);
                        if (!(getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
                            return;
                        }
                    }
                    d("allowScroll " + z2 + " " + z3);
                    if (!(getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
                        ((ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent()).allowThisScroll(z2, z3);
                        break;
                    }
                case 24:
                    try {
                        JSONObject jSONObject10 = new JSONObject(str2);
                        String optString5 = jSONObject10.optString("path_full");
                        boolean optBoolean2 = jSONObject10.optBoolean("force_request", false);
                        if (optString5.startsWith("/")) {
                            optString5 = optString5.substring(1);
                        }
                        onOpenUri(Uri.parse("https://t.me/" + optString5), null, false, true, optBoolean2);
                        break;
                    } catch (JSONException e11) {
                        FileLog.e(e11);
                        return;
                    }
                case 25:
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            Context context4 = getContext();
                            int i11 = this.currentAccount;
                            this.secureStorage = new BotStorage(context4, i11, UserConfig.getInstance(i11).getClientUserId(), this.botUser.id, true);
                        }
                        restoreStorageKey(this.secureStorage, str2, "secure_storage_key_restored", "secure_storage_cleared");
                        break;
                    }
                    break;
                case 26:
                    if (!this.isRequestingPageOpen && System.currentTimeMillis() - this.lastClickMs <= 10000 && System.currentTimeMillis() - this.lastPostStoryMs >= 2000) {
                        this.lastClickMs = 0L;
                        this.lastPostStoryMs = System.currentTimeMillis();
                        try {
                            jSONObject = new JSONObject(str2);
                            str7 = jSONObject.optString("media_url");
                        } catch (Exception e12) {
                            e = e12;
                            str7 = null;
                            str8 = null;
                        }
                        try {
                            str8 = jSONObject.optString("text");
                            try {
                                optJSONObject = jSONObject.optJSONObject("widget_link");
                            } catch (Exception e13) {
                                e = e13;
                                str9 = null;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            str8 = null;
                            str9 = str8;
                            FileLog.e(e);
                            str10 = str7;
                            str11 = null;
                            str12 = str9;
                            str13 = str8;
                            if (str10 == null) {
                            }
                        }
                        if (optJSONObject != null) {
                            str9 = optJSONObject.optString("url");
                            try {
                                str11 = optJSONObject.optString("name");
                                str10 = str7;
                            } catch (Exception e15) {
                                e = e15;
                                FileLog.e(e);
                                str10 = str7;
                                str11 = null;
                                str12 = str9;
                                str13 = str8;
                                if (str10 == null) {
                                    return;
                                }
                            }
                            str12 = str9;
                            str13 = str8;
                            if (str10 == null) {
                                if (!MessagesController.getInstance(this.currentAccount).storiesEnabled()) {
                                    new PremiumFeatureBottomSheet(new BaseFragment() { // from class: org.telegram.ui.web.BotWebViewContainer.5
                                        @Override // org.telegram.ui.ActionBar.BaseFragment
                                        public boolean isLightStatusBar() {
                                            return false;
                                        }

                                        {
                                            this.currentAccount = BotWebViewContainer.this.currentAccount;
                                        }

                                        @Override // org.telegram.ui.ActionBar.BaseFragment
                                        public Dialog showDialog(Dialog dialog) {
                                            dialog.show();
                                            return dialog;
                                        }

                                        @Override // org.telegram.ui.ActionBar.BaseFragment
                                        public Activity getParentActivity() {
                                            return BotWebViewContainer.this.parentActivity;
                                        }

                                        @Override // org.telegram.ui.ActionBar.BaseFragment
                                        public Theme.ResourcesProvider getResourceProvider() {
                                            return new WrappedResourceProvider(BotWebViewContainer.this.resourcesProvider) { // from class: org.telegram.ui.web.BotWebViewContainer.5.1
                                                @Override // org.telegram.ui.WrappedResourceProvider
                                                public void appendColors() {
                                                    this.sparseIntArray.append(Theme.key_dialogBackground, -14803426);
                                                    this.sparseIntArray.append(Theme.key_windowBackgroundGray, -16777216);
                                                }
                                            };
                                        }
                                    }, 14, true).show();
                                    break;
                                } else {
                                    final AlertDialog alertDialog = new AlertDialog(this.parentActivity, 3);
                                    new HttpGetFileTask(new Utilities.Callback() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda8
                                        @Override // org.telegram.messenger.Utilities.Callback
                                        public final void run(Object obj2) {
                                            BotWebViewContainer.this.lambda$onEventReceived$34(alertDialog, str13, str12, str11, (File) obj2);
                                        }
                                    }, null).execute(str10);
                                    alertDialog.showDelayed(250L);
                                    break;
                                }
                            }
                        } else {
                            str10 = str7;
                            str13 = str8;
                            str12 = null;
                            str11 = null;
                            if (str10 == null) {
                            }
                        }
                    }
                    break;
                case 27:
                    if (!this.isRequestingPageOpen && this.botUser != null) {
                        if (this.location == null) {
                            BotLocation botLocation2 = BotLocation.get(getContext(), this.currentAccount, this.botUser.id);
                            this.location = botLocation2;
                            botLocation2.listen(this.notifyLocationChecked);
                        }
                        if (!this.location.granted()) {
                            this.location.request(new Utilities.Callback2() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda6
                                @Override // org.telegram.messenger.Utilities.Callback2
                                public final void run(Object obj2, Object obj3) {
                                    BotWebViewContainer.this.lambda$onEventReceived$39((Boolean) obj2, (Boolean) obj3);
                                }
                            });
                            break;
                        } else {
                            this.location.requestObject(new Utilities.Callback() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda7
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj2) {
                                    BotWebViewContainer.this.lambda$onEventReceived$40((JSONObject) obj2);
                                }
                            });
                            break;
                        }
                    }
                    break;
                case 28:
                    BotSensors botSensors2 = this.delegate.getBotSensors();
                    try {
                        j3 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused6) {
                    }
                    long clamp = Utilities.clamp(j3, 1000L, 20L);
                    if (botSensors2 != null && botSensors2.startGyroscope(clamp)) {
                        notifyEvent("gyroscope_started", null);
                        break;
                    } else {
                        notifyEvent("gyroscope_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                    break;
                case 29:
                    try {
                        z5 = new JSONObject(str2).optBoolean("return_back");
                    } catch (Exception e16) {
                        FileLog.e(e16);
                        z5 = false;
                    }
                    this.delegate.onCloseRequested(null);
                    if (z5) {
                        if (this.wasOpenedByLinkIntent && LaunchActivity.instance != null) {
                            Activity findActivity = AndroidUtilities.findActivity(getContext());
                            if (findActivity == null) {
                                findActivity = LaunchActivity.instance;
                            }
                            if (findActivity != null && !findActivity.isFinishing()) {
                                findActivity.moveTaskToBack(true);
                                break;
                            }
                        } else if (this.wasOpenedByBot != null && (launchActivity = LaunchActivity.instance) != null && launchActivity.getBottomSheetTabs() != null) {
                            BottomSheetTabs bottomSheetTabs = LaunchActivity.instance.getBottomSheetTabs();
                            ArrayList<BottomSheetTabs.WebTabData> tabs = bottomSheetTabs.getTabs();
                            int i12 = 0;
                            while (true) {
                                if (i12 < tabs.size()) {
                                    BottomSheetTabs.WebTabData webTabData2 = tabs.get(i12);
                                    if (!this.wasOpenedByBot.equals(webTabData2.props) || webTabData2.webView == this.webView) {
                                        i12++;
                                    } else {
                                        webTabData = webTabData2;
                                    }
                                } else {
                                    webTabData = null;
                                }
                            }
                            if (webTabData != null) {
                                bottomSheetTabs.openTab(webTabData);
                                break;
                            }
                        }
                    }
                    break;
                case 30:
                    setPageLoaded(this.webView.getUrl(), true);
                    break;
                case 31:
                    try {
                        String string6 = new JSONObject(str2).getString("req_id");
                        if (this.delegate.isClipboardAvailable() && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                            CharSequence text = ((ClipboardManager) getContext().getSystemService("clipboard")).getText();
                            notifyEvent("clipboard_text_received", new JSONObject().put("req_id", string6).put("data", text != null ? text.toString() : ""));
                            break;
                        }
                        notifyEvent("clipboard_text_received", new JSONObject().put("req_id", string6));
                    } catch (JSONException e17) {
                        FileLog.e(e17);
                        return;
                    }
                    break;
                case ' ':
                    Activity findActivity2 = AndroidUtilities.findActivity(getContext());
                    if (findActivity2 == null) {
                        findActivity2 = LaunchActivity.instance;
                    }
                    if (findActivity2 != null) {
                        AndroidUtilities.hideKeyboard(findActivity2.getCurrentFocus());
                        break;
                    }
                    break;
                case '!':
                    BotSensors botSensors3 = this.delegate.getBotSensors();
                    if (botSensors3 != null && botSensors3.stopGyroscope()) {
                        notifyEvent("gyroscope_stopped", null);
                        break;
                    } else {
                        notifyEvent("gyroscope_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                    break;
                case '\"':
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            Context context5 = getContext();
                            int i13 = this.currentAccount;
                            this.secureStorage = new BotStorage(context5, i13, UserConfig.getInstance(i13).getClientUserId(), this.botUser.id, true);
                        }
                        clearStorageKey(this.secureStorage, str2, "secure_storage_cleared", "secure_storage_cleared");
                        break;
                    }
                    break;
                case '#':
                    if (this.botUser != null) {
                        if (this.storage == null) {
                            Context context6 = getContext();
                            int i14 = this.currentAccount;
                            this.storage = new BotStorage(context6, i14, UserConfig.getInstance(i14).getClientUserId(), this.botUser.id, false);
                        }
                        clearStorageKey(this.storage, str2, "device_storage_cleared", "device_storage_failed");
                        break;
                    }
                    break;
                case '$':
                    BotSensors botSensors4 = this.delegate.getBotSensors();
                    try {
                        j3 = new JSONObject(str2).getLong("refresh_rate");
                    } catch (Exception unused7) {
                    }
                    long clamp2 = Utilities.clamp(j3, 1000L, 20L);
                    if (botSensors4 != null && botSensors4.startAccelerometer(clamp2)) {
                        notifyEvent("accelerometer_started", null);
                        break;
                    } else {
                        notifyEvent("accelerometer_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                    break;
                case '%':
                    BotSensors botSensors5 = this.delegate.getBotSensors();
                    if (botSensors5 != null && botSensors5.stopAccelerometer()) {
                        notifyEvent("accelerometer_stopped", null);
                        break;
                    } else {
                        notifyEvent("accelerometer_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                    break;
                case '&':
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        try {
                            String string7 = new JSONObject(str2).getString("id");
                            if (TextUtils.isEmpty(string7)) {
                                notifyEvent("prepared_message_failed", obj("error", "MESSAGE_EXPIRED"));
                                break;
                            } else {
                                BotShareSheet.share(getContext(), this.currentAccount, this.botUser.id, string7, this.resourcesProvider, new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda29
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        BotWebViewContainer.this.lambda$onEventReceived$44();
                                    }
                                }, new Utilities.Callback2() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda30
                                    @Override // org.telegram.messenger.Utilities.Callback2
                                    public final void run(Object obj2, Object obj3) {
                                        BotWebViewContainer.this.lambda$onEventReceived$46(botWebViewProxy, (String) obj2, (ArrayList) obj3);
                                    }
                                });
                                break;
                            }
                        } catch (Exception e18) {
                            FileLog.e(e18);
                            notifyEvent("prepared_message_failed", obj("error", "MESSAGE_EXPIRED"));
                            return;
                        }
                    }
                    break;
                case '\'':
                    try {
                        this.delegate.onSendWebViewData(new JSONObject(str2).optString("data"));
                        break;
                    } catch (JSONException e19) {
                        FileLog.e(e19);
                        return;
                    }
                case '(':
                    reportSafeContentInsets(this.lastInsetsTopMargin, true);
                    break;
                case ')':
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        if (MediaDataController.getInstance(this.currentAccount).isShortcutAdded(this.botUser.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
                            notifyEvent("home_screen_added", null);
                            break;
                        } else {
                            MediaDataController.getInstance(this.currentAccount).installShortcut(this.botUser.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT, new Utilities.Callback() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda28
                                @Override // org.telegram.messenger.Utilities.Callback
                                public final void run(Object obj2) {
                                    BotWebViewContainer.this.lambda$onEventReceived$35((Boolean) obj2);
                                }
                            });
                            break;
                        }
                    }
                    break;
                case '*':
                    String onFullscreenRequested = this.delegate.onFullscreenRequested(true);
                    if (onFullscreenRequested == null) {
                        notifyEvent("fullscreen_changed", obj("is_fullscreen", Boolean.TRUE));
                        break;
                    } else {
                        notifyEvent("fullscreen_failed", obj("error", onFullscreenRequested));
                        break;
                    }
                case '+':
                    try {
                        JSONObject jSONObject11 = new JSONObject(str2);
                        ArrayList arrayList2 = new ArrayList();
                        JSONArray jSONArray3 = jSONObject11.getJSONArray("chat_types");
                        for (int i15 = 0; i15 < jSONArray3.length(); i15++) {
                            arrayList2.add(jSONArray3.getString(i15));
                        }
                        this.delegate.onWebAppSwitchInlineQuery(this.botUser, jSONObject11.getString("query"), arrayList2);
                        break;
                    } catch (JSONException e20) {
                        FileLog.e(e20);
                        return;
                    }
                case ',':
                    if (this.botUser != null) {
                        if (this.secureStorage == null) {
                            Context context7 = getContext();
                            int i16 = this.currentAccount;
                            this.secureStorage = new BotStorage(context7, i16, UserConfig.getInstance(i16).getClientUserId(), this.botUser.id, true);
                        }
                        setStorageKey(this.secureStorage, str2, "secure_storage_key_saved", "secure_storage_failed");
                        break;
                    }
                    break;
                case '-':
                    String onFullscreenRequested2 = this.delegate.onFullscreenRequested(false);
                    if (onFullscreenRequested2 == null) {
                        notifyEvent("fullscreen_changed", obj("is_fullscreen", Boolean.FALSE));
                        break;
                    } else {
                        notifyEvent("fullscreen_failed", obj("error", onFullscreenRequested2));
                        break;
                    }
                case '.':
                    if (this.onVerifiedAge != null) {
                        try {
                            JSONObject jSONObject12 = new JSONObject(str2);
                            final boolean z13 = jSONObject12.getBoolean("passed");
                            final double d = jSONObject12.getDouble("age");
                            final String optString6 = jSONObject12.optString("gender");
                            final double optDouble = jSONObject12.optDouble("genderProbability");
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda27
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BotWebViewContainer.this.lambda$onEventReceived$47(z13, d, optString6, optDouble);
                                }
                            });
                            break;
                        } catch (Exception e21) {
                            FileLog.e(e21);
                            return;
                        }
                    }
                    break;
                case '/':
                    if (!this.isRequestingPageOpen && this.botUser != null && System.currentTimeMillis() - this.lastClickMs <= 10000) {
                        this.lastClickMs = 0L;
                        BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                        if (safeLastFragment2 != null && safeLastFragment2.getParentLayout() != null) {
                            INavigationLayout parentLayout2 = safeLastFragment2.getParentLayout();
                            safeLastFragment2.presentFragment(ProfileActivity.of(this.botUser.id));
                            AndroidUtilities.scrollToFragmentRow(parentLayout2, "botPermissionLocation");
                            Delegate delegate3 = this.delegate;
                            if (delegate3 != null) {
                                delegate3.onCloseToTabs();
                                break;
                            }
                        }
                    }
                    break;
                case '0':
                    try {
                        boolean optBoolean3 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean3 != this.isBackButtonVisible) {
                            this.isBackButtonVisible = optBoolean3;
                            this.delegate.onSetBackButtonVisible(optBoolean3);
                            break;
                        }
                    } catch (JSONException e22) {
                        FileLog.e(e22);
                        return;
                    }
                    break;
                case '1':
                    try {
                        str3 = new JSONObject(str2).getString("reason");
                    } catch (Exception unused8) {
                        str3 = null;
                    }
                    createBiometry();
                    BotBiometry botBiometry2 = this.biometry;
                    if (botBiometry2 != null) {
                        boolean z14 = botBiometry2.access_requested;
                        if (z14) {
                            notifyBiometryReceived();
                            break;
                        } else if (!botBiometry2.access_granted) {
                            final Runnable[] runnableArr = {new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda23
                                @Override // java.lang.Runnable
                                public final void run() {
                                    BotWebViewContainer.this.lambda$onEventReceived$24();
                                }
                            }};
                            AlertDialog.Builder builder2 = new AlertDialog.Builder(getContext(), this.resourcesProvider);
                            if (TextUtils.isEmpty(str3)) {
                                builder2.setTitle(LocaleController.getString(R.string.BotAllowBiometryTitle));
                                builder2.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.botUser))));
                            } else {
                                builder2.setTitle(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotAllowBiometryMessage, UserObject.getUserName(this.botUser))));
                                builder2.setMessage(str3);
                            }
                            builder2.setPositiveButton(LocaleController.getString(R.string.Allow), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda24
                                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                                public final void onClick(AlertDialog alertDialog2, int i17) {
                                    BotWebViewContainer.this.lambda$onEventReceived$26(runnableArr, alertDialog2, i17);
                                }
                            });
                            builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda25
                                @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                                public final void onClick(AlertDialog alertDialog2, int i17) {
                                    BotWebViewContainer.this.lambda$onEventReceived$27(runnableArr, alertDialog2, i17);
                                }
                            });
                            builder2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda26
                                @Override // android.content.DialogInterface.OnDismissListener
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    BotWebViewContainer.lambda$onEventReceived$28(runnableArr, dialogInterface);
                                }
                            });
                            builder2.show();
                            break;
                        } else {
                            if (!z14) {
                                botBiometry2.access_requested = true;
                                botBiometry2.save();
                            }
                            notifyBiometryReceived();
                            break;
                        }
                    }
                    break;
                case '2':
                    try {
                        JSONObject jSONObject13 = new JSONObject(str2);
                        String optString7 = jSONObject13.optString("type");
                        int hashCode = optString7.hashCode();
                        if (hashCode == -1184809658) {
                            if (optString7.equals("impact")) {
                                c3 = 0;
                                if (c3 != 0) {
                                }
                                if (botWebViewVibrationEffect2 == null) {
                                }
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                            }
                            if (botWebViewVibrationEffect2 == null) {
                            }
                        } else if (hashCode != 193071555) {
                            if (hashCode == 595233003 && optString7.equals("notification")) {
                                c3 = 1;
                                if (c3 != 0) {
                                    String optString8 = jSONObject13.optString("impact_style");
                                    switch (optString8.hashCode()) {
                                        case -1078030475:
                                            if (optString8.equals("medium")) {
                                                c4 = 1;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 3535914:
                                            if (optString8.equals("soft")) {
                                                c4 = 4;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 99152071:
                                            if (optString8.equals("heavy")) {
                                                c4 = 2;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 102970646:
                                            if (optString8.equals("light")) {
                                                c4 = 0;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        case 108511787:
                                            if (optString8.equals("rigid")) {
                                                c4 = 3;
                                                break;
                                            }
                                            c4 = 65535;
                                            break;
                                        default:
                                            c4 = 65535;
                                            break;
                                    }
                                    if (c4 == 0) {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_LIGHT;
                                    } else if (c4 == 1) {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_MEDIUM;
                                    } else if (c4 == 2) {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_HEAVY;
                                    } else if (c4 != 3) {
                                        if (c4 == 4) {
                                            botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_SOFT;
                                        }
                                        botWebViewVibrationEffect2 = null;
                                    } else {
                                        botWebViewVibrationEffect = BotWebViewVibrationEffect.IMPACT_RIGID;
                                    }
                                    botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                } else if (c3 == 1) {
                                    String optString9 = jSONObject13.optString("notification_type");
                                    int hashCode2 = optString9.hashCode();
                                    if (hashCode2 == -1867169789) {
                                        if (optString9.equals("success")) {
                                            c5 = 1;
                                            if (c5 != 0) {
                                            }
                                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                        }
                                        c5 = 65535;
                                        if (c5 != 0) {
                                        }
                                        botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                    } else if (hashCode2 != 96784904) {
                                        if (hashCode2 == 1124446108 && optString9.equals("warning")) {
                                            c5 = 2;
                                            if (c5 != 0) {
                                                botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_ERROR;
                                            } else if (c5 == 1) {
                                                botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_SUCCESS;
                                            } else if (c5 != 2) {
                                                botWebViewVibrationEffect2 = null;
                                            } else {
                                                botWebViewVibrationEffect = BotWebViewVibrationEffect.NOTIFICATION_WARNING;
                                            }
                                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                        }
                                        c5 = 65535;
                                        if (c5 != 0) {
                                        }
                                        botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                    } else {
                                        if (optString9.equals("error")) {
                                            c5 = 0;
                                            if (c5 != 0) {
                                            }
                                            botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                        }
                                        c5 = 65535;
                                        if (c5 != 0) {
                                        }
                                        botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                    }
                                } else if (c3 != 2) {
                                    botWebViewVibrationEffect2 = null;
                                } else {
                                    botWebViewVibrationEffect = BotWebViewVibrationEffect.SELECTION_CHANGE;
                                    botWebViewVibrationEffect2 = botWebViewVibrationEffect;
                                }
                                if (botWebViewVibrationEffect2 == null) {
                                    botWebViewVibrationEffect2.vibrate();
                                    break;
                                }
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                            }
                            if (botWebViewVibrationEffect2 == null) {
                            }
                        } else {
                            if (optString7.equals("selection_change")) {
                                c3 = 2;
                                if (c3 != 0) {
                                }
                                if (botWebViewVibrationEffect2 == null) {
                                }
                            }
                            c3 = 65535;
                            if (c3 != 0) {
                            }
                            if (botWebViewVibrationEffect2 == null) {
                            }
                        }
                    } catch (Exception e23) {
                        FileLog.e(e23);
                        return;
                    }
                    FileLog.e(e23);
                    break;
                case '3':
                    try {
                        JSONObject jSONObject14 = new JSONObject(str2);
                        boolean optBoolean4 = jSONObject14.optBoolean("is_active", false);
                        String trim2 = jSONObject14.optString("text", this.lastButtonText).trim();
                        boolean z15 = jSONObject14.optBoolean("is_visible", false) && !TextUtils.isEmpty(trim2);
                        int parseColor4 = jSONObject14.has("color") ? Color.parseColor(jSONObject14.optString("color")) : this.lastButtonColor;
                        int parseColor5 = jSONObject14.has("text_color") ? Color.parseColor(jSONObject14.optString("text_color")) : this.lastButtonTextColor;
                        if (jSONObject14.optBoolean("is_progress_visible", false) && z15) {
                            str4 = "has_shine_effect";
                            z4 = true;
                        } else {
                            str4 = "has_shine_effect";
                            z4 = false;
                        }
                        boolean z16 = jSONObject14.optBoolean(str4, false) && z15;
                        this.lastButtonColor = parseColor4;
                        this.lastButtonTextColor = parseColor5;
                        this.lastButtonText = trim2;
                        this.buttonData = str2;
                        this.delegate.onSetupMainButton(z15, optBoolean4, trim2, parseColor4, parseColor5, z4, z16);
                        break;
                    } catch (Exception e24) {
                        FileLog.e(e24);
                        return;
                    }
                    break;
                case '4':
                    try {
                        this.delegate.onWebAppSwipingBehavior(new JSONObject(str2).optBoolean("allow_vertical_swipe"));
                        break;
                    } catch (JSONException e25) {
                        FileLog.e(e25);
                        return;
                    }
                case '5':
                    try {
                        boolean optBoolean5 = new JSONObject(str2).optBoolean("is_visible");
                        if (optBoolean5 != this.isSettingsButtonVisible) {
                            this.isSettingsButtonVisible = optBoolean5;
                            this.delegate.onSetSettingsButtonVisible(optBoolean5);
                            break;
                        }
                    } catch (JSONException e26) {
                        FileLog.e(e26);
                        return;
                    }
                    break;
                case '6':
                    if (this.botUser != null && Build.VERSION.SDK_INT >= 26) {
                        str14 = MediaDataController.getInstance(this.currentAccount).isShortcutAdded(this.botUser.id, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT) ? "added" : "missed";
                    } else {
                        str14 = "unsupported";
                    }
                    notifyEvent("home_screen_checked", obj("status", str14));
                    break;
                case '7':
                    BotSensors botSensors6 = this.delegate.getBotSensors();
                    try {
                        JSONObject jSONObject15 = new JSONObject(str2);
                        j3 = jSONObject15.getLong("refresh_rate");
                        z8 = jSONObject15.optBoolean("need_absolute", false);
                        j2 = j3;
                    } catch (Exception unused9) {
                        j2 = j3;
                        z8 = false;
                    }
                    long clamp3 = Utilities.clamp(j2, 1000L, 20L);
                    if (botSensors6 != null && botSensors6.startOrientation(z8, clamp3)) {
                        notifyEvent("device_orientation_started", null);
                        break;
                    } else {
                        notifyEvent("device_orientation_failed", obj("error", "UNSUPPORTED"));
                        break;
                    }
                    break;
                case '8':
                    try {
                        JSONObject jSONObject16 = new JSONObject(str2);
                        final String string8 = jSONObject16.getString("token");
                        try {
                            str5 = jSONObject16.getString("reason");
                        } catch (Exception unused10) {
                            str5 = null;
                        }
                        createBiometry();
                        BotBiometry botBiometry3 = this.biometry;
                        if (botBiometry3 != null) {
                            if (!botBiometry3.access_granted) {
                                try {
                                    JSONObject jSONObject17 = new JSONObject();
                                    jSONObject17.put("status", "failed");
                                    notifyEvent("biometry_token_updated", jSONObject17);
                                    break;
                                } catch (Exception e27) {
                                    FileLog.e(e27);
                                    return;
                                }
                            } else {
                                botBiometry3.updateToken(str5, string8, new Utilities.Callback() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda14
                                    @Override // org.telegram.messenger.Utilities.Callback
                                    public final void run(Object obj2) {
                                        BotWebViewContainer.this.lambda$onEventReceived$30(string8, (Boolean) obj2);
                                    }
                                });
                                break;
                            }
                        }
                    } catch (Exception e28) {
                        FileLog.e(e28);
                        if (e28 instanceof JSONException) {
                            error("JSON Parse error");
                            return;
                        } else {
                            unknownError();
                            return;
                        }
                    }
                    break;
                case '9':
                    try {
                        String optString10 = new JSONObject(str2).optString("color", null);
                        if (TextUtils.isEmpty(optString10)) {
                            parseColor = Theme.getColor(Theme.key_windowBackgroundGray, this.resourcesProvider);
                        } else {
                            parseColor = Color.parseColor(optString10);
                        }
                        Delegate delegate4 = this.delegate;
                        if (delegate4 != null) {
                            delegate4.onWebAppSetNavigationBarColor(parseColor);
                            break;
                        }
                    } catch (Exception e29) {
                        FileLog.e(e29);
                        return;
                    }
                    break;
                case ':':
                    try {
                        JSONObject jSONObject18 = new JSONObject(str2);
                        String optString11 = jSONObject18.optString("color", null);
                        if (!TextUtils.isEmpty(optString11)) {
                            int parseColor6 = Color.parseColor(optString11);
                            if (parseColor6 != 0) {
                                this.delegate.onWebAppSetActionBarColor(-1, parseColor6, true);
                                break;
                            }
                        } else {
                            String optString12 = jSONObject18.optString("color_key");
                            int hashCode3 = optString12.hashCode();
                            if (hashCode3 != -1265068311) {
                                if (hashCode3 == -210781868 && optString12.equals("secondary_bg_color")) {
                                    c2 = 1;
                                    if (c2 != 0) {
                                        i = Theme.key_windowBackgroundWhite;
                                    } else if (c2 != 1) {
                                        i2 = -1;
                                        if (i2 >= 0) {
                                            this.delegate.onWebAppSetActionBarColor(i2, Theme.getColor(i2, this.resourcesProvider), false);
                                            break;
                                        }
                                    } else {
                                        i = Theme.key_windowBackgroundGray;
                                    }
                                    i2 = i;
                                    if (i2 >= 0) {
                                    }
                                }
                                c2 = 65535;
                                if (c2 != 0) {
                                }
                                i2 = i;
                                if (i2 >= 0) {
                                }
                            } else {
                                if (optString12.equals("bg_color")) {
                                    c2 = 0;
                                    if (c2 != 0) {
                                    }
                                    i2 = i;
                                    if (i2 >= 0) {
                                    }
                                }
                                c2 = 65535;
                                if (c2 != 0) {
                                }
                                i2 = i;
                                if (i2 >= 0) {
                                }
                            }
                        }
                    } catch (Exception e30) {
                        FileLog.e(e30);
                        return;
                    }
                    break;
                case ';':
                    reportSafeInsets(this.lastInsets, true);
                    break;
                case '<':
                    try {
                        this.delegate.onWebAppSetBackgroundColor(Color.parseColor(new JSONObject(str2).optString("color", "#ffffff")) | (-16777216));
                        break;
                    } catch (Exception e31) {
                        FileLog.e(e31);
                        return;
                    }
                case '=':
                    if (ignoreDialog(3)) {
                        try {
                            JSONObject jSONObject19 = new JSONObject();
                            jSONObject19.put("status", "cancelled");
                            notifyEvent("write_access_requested", jSONObject19);
                            break;
                        } catch (Exception e32) {
                            FileLog.e(e32);
                            return;
                        }
                    } else {
                        final int i17 = this.currentAccount;
                        final MyWebView myWebView3 = this.webView;
                        TL_bots.canSendMessage cansendmessage = new TL_bots.canSendMessage();
                        cansendmessage.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botUser);
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(cansendmessage, new RequestDelegate() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda5
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                BotWebViewContainer.this.lambda$onEventReceived$17(i17, myWebView3, tLObject, tL_error);
                            }
                        });
                        break;
                    }
                case '>':
                    this.delegate.onWebAppExpand();
                    break;
                default:
                    FileLog.d("unknown webapp event " + str);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$5(PopupButton popupButton, AtomicBoolean atomicBoolean, AlertDialog alertDialog, int i) {
        alertDialog.dismiss();
        try {
            this.lastClickMs = System.currentTimeMillis();
            notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$6(PopupButton popupButton, AtomicBoolean atomicBoolean, AlertDialog alertDialog, int i) {
        alertDialog.dismiss();
        try {
            this.lastClickMs = System.currentTimeMillis();
            notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$7(PopupButton popupButton, AtomicBoolean atomicBoolean, AlertDialog alertDialog, int i) {
        alertDialog.dismiss();
        try {
            this.lastClickMs = System.currentTimeMillis();
            notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$8(AtomicBoolean atomicBoolean, DialogInterface dialogInterface) {
        if (!atomicBoolean.get()) {
            notifyEvent("popup_closed", new JSONObject());
        }
        this.currentDialog = null;
        this.lastDialogClosed = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$10(final String str, final TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda40
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$9(tL_error, str, tL_inputInvoiceSlug, tLObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$9(TLRPC.TL_error tL_error, String str, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, TLObject tLObject) {
        if (tL_error != null) {
            onInvoiceStatusUpdate(str, "failed");
        } else {
            this.delegate.onWebAppOpenInvoice(tL_inputInvoiceSlug, str, tLObject);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$17(final int i, final MyWebView myWebView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda41
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$16(tLObject, i, myWebView, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$16(TLObject tLObject, final int i, final MyWebView myWebView, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                unknownError(tL_error.text);
                return;
            } else {
                final String[] strArr = {"cancelled"};
                showDialog(3, new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.BotWebViewRequestWriteTitle)).setMessage(LocaleController.getString(R.string.BotWebViewRequestWriteMessage)).setPositiveButton(LocaleController.getString(R.string.BotWebViewRequestAllow), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda44
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        BotWebViewContainer.this.lambda$onEventReceived$13(strArr, alertDialog, i2);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.BotWebViewRequestDontAllow), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda45
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        alertDialog.dismiss();
                    }
                }).create(), new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda46
                    @Override // java.lang.Runnable
                    public final void run() {
                        BotWebViewContainer.lambda$onEventReceived$15(strArr, i, myWebView);
                    }
                });
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "allowed");
            notifyEvent(i, myWebView, "write_access_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$13(final String[] strArr, final AlertDialog alertDialog, int i) {
        TL_bots.allowSendMessage allowsendmessage = new TL_bots.allowSendMessage();
        allowsendmessage.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botUser);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(allowsendmessage, new RequestDelegate() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda50
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BotWebViewContainer.this.lambda$onEventReceived$12(strArr, alertDialog, tLObject, tL_error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$12(final String[] strArr, final AlertDialog alertDialog, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda51
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$11(tLObject, strArr, tL_error, alertDialog);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$11(TLObject tLObject, String[] strArr, TLRPC.TL_error tL_error, AlertDialog alertDialog) {
        if (tLObject != null) {
            strArr[0] = "allowed";
            if (tLObject instanceof TLRPC.Updates) {
                MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            }
        }
        if (tL_error != null) {
            unknownError(tL_error.text);
        }
        alertDialog.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onEventReceived$15(String[] strArr, int i, MyWebView myWebView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", strArr[0]);
            notifyEvent(i, myWebView, "write_access_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$19(final String str, final int i, final MyWebView myWebView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda36
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$18(str, tLObject, tL_error, i, myWebView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$18(String str, TLObject tLObject, TLRPC.TL_error tL_error, int i, MyWebView myWebView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("req_id", str);
            if (tLObject instanceof TLRPC.TL_dataJSON) {
                jSONObject.put("result", new JSONTokener(((TLRPC.TL_dataJSON) tLObject).data).nextValue());
            } else if (tL_error != null) {
                jSONObject.put("error", tL_error.text);
            }
            notifyEvent(i, myWebView, "custom_method_invoked", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
            unknownError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$21(String[] strArr, boolean z, final int i, final MyWebView myWebView, AlertDialog alertDialog, int i2) {
        strArr[0] = null;
        alertDialog.dismiss();
        if (z) {
            MessagesController.getInstance(this.currentAccount).unblockPeer(this.botUser.id, new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda33
                @Override // java.lang.Runnable
                public final void run() {
                    BotWebViewContainer.this.lambda$onEventReceived$20(i, myWebView);
                }
            });
            return;
        }
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(this.currentAccount).getCurrentUser(), this.botUser.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "sent");
            notifyEvent(i, myWebView, "phone_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$20(int i, MyWebView myWebView) {
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(this.currentAccount).getCurrentUser(), this.botUser.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0));
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", "sent");
            notifyEvent(i, myWebView, "phone_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onEventReceived$23(String[] strArr, int i, MyWebView myWebView) {
        if (strArr[0] == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", strArr[0]);
            notifyEvent(i, myWebView, "phone_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$24() {
        BotBiometry botBiometry = this.biometry;
        botBiometry.access_requested = true;
        botBiometry.save();
        notifyBiometryReceived();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$26(Runnable[] runnableArr, AlertDialog alertDialog, int i) {
        if (runnableArr[0] != null) {
            runnableArr[0] = null;
        }
        BotBiometry botBiometry = this.biometry;
        botBiometry.access_requested = true;
        botBiometry.save();
        this.biometry.requestToken(null, new Utilities.Callback2() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda37
            @Override // org.telegram.messenger.Utilities.Callback2
            public final void run(Object obj, Object obj2) {
                BotWebViewContainer.this.lambda$onEventReceived$25((Boolean) obj, (String) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$25(Boolean bool, String str) {
        if (bool.booleanValue()) {
            BotBiometry botBiometry = this.biometry;
            botBiometry.access_granted = true;
            botBiometry.save();
        }
        notifyBiometryReceived();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$27(Runnable[] runnableArr, AlertDialog alertDialog, int i) {
        if (runnableArr[0] != null) {
            runnableArr[0] = null;
        }
        BotBiometry botBiometry = this.biometry;
        botBiometry.access_requested = true;
        botBiometry.disabled = true;
        botBiometry.save();
        notifyBiometryReceived();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onEventReceived$28(Runnable[] runnableArr, DialogInterface dialogInterface) {
        Runnable runnable = runnableArr[0];
        if (runnable != null) {
            runnable.run();
            runnableArr[0] = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$29(Boolean bool, String str) {
        if (bool.booleanValue()) {
            this.biometry.access_granted = true;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", bool.booleanValue() ? "authorized" : "failed");
            jSONObject.put("token", str);
            notifyEvent("biometry_auth_requested", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$30(String str, Boolean bool) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("status", bool.booleanValue() ? TextUtils.isEmpty(str) ? "removed" : "updated" : "failed");
            notifyEvent("biometry_token_updated", jSONObject);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$34(final AlertDialog alertDialog, final String str, final String str2, final String str3, final File file) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$33(file, alertDialog, str, str2, str3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$33(final File file, final AlertDialog alertDialog, final String str, final String str2, final String str3) {
        if (file == null) {
            alertDialog.dismissUnless(500L);
            return;
        }
        final int[] iArr = new int[11];
        final Runnable runnable = new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda47
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$31(iArr, file, alertDialog, str, str2, str3);
            }
        };
        Utilities.globalQueue.postRunnable(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda48
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.lambda$onEventReceived$32(file, iArr, runnable);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$31(int[] iArr, File file, AlertDialog alertDialog, String str, String str2, String str3) {
        StoryRecorder.SourceView sourceView;
        StoryEntry fromPhotoShoot;
        File file2;
        File file3;
        if (iArr[4] > 0) {
            int i = iArr[1];
            int i2 = iArr[2];
            int photoSize = i > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i;
            int photoSize2 = i2 > AndroidUtilities.getPhotoSize() ? AndroidUtilities.getPhotoSize() : i2;
            File makeCacheFile = StoryEntry.makeCacheFile(UserConfig.selectedAccount, "jpg");
            AnimatedFileDrawable animatedFileDrawable = new AnimatedFileDrawable(file, true, 0L, 0, null, null, null, 0L, UserConfig.selectedAccount, true, photoSize, photoSize2, null);
            sourceView = null;
            Bitmap firstFrame = animatedFileDrawable.getFirstFrame(null);
            animatedFileDrawable.recycle();
            if (firstFrame != null) {
                try {
                    file3 = makeCacheFile;
                    firstFrame.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file3));
                } catch (Exception e) {
                    FileLog.e(e);
                    file2 = null;
                }
            } else {
                file3 = makeCacheFile;
            }
            file2 = file3;
            fromPhotoShoot = StoryEntry.fromVideoShoot(file, file2 == null ? null : file2.getAbsolutePath(), iArr[4]);
            fromPhotoShoot.width = i;
            fromPhotoShoot.height = i2;
            fromPhotoShoot.setupMatrix();
        } else {
            sourceView = null;
            fromPhotoShoot = StoryEntry.fromPhotoShoot(file, ((Integer) AndroidUtilities.getImageOrientation(file).first).intValue());
        }
        if (fromPhotoShoot.width <= 0 || fromPhotoShoot.height <= 0) {
            alertDialog.dismissUnless(500L);
            return;
        }
        if (str != null) {
            fromPhotoShoot.caption = str;
        }
        if (!TextUtils.isEmpty(str2) && UserConfig.getInstance(this.currentAccount).isPremium()) {
            if (fromPhotoShoot.mediaEntities == null) {
                fromPhotoShoot.mediaEntities = new ArrayList();
            }
            VideoEditedInfo.MediaEntity mediaEntity = new VideoEditedInfo.MediaEntity();
            mediaEntity.type = (byte) 7;
            mediaEntity.subType = (byte) -1;
            mediaEntity.color = -1;
            LinkPreview.WebPagePreview webPagePreview = new LinkPreview.WebPagePreview();
            mediaEntity.linkSettings = webPagePreview;
            webPagePreview.url = str2;
            if (str3 != null) {
                webPagePreview.flags |= 2;
                webPagePreview.name = str3;
            }
            fromPhotoShoot.mediaEntities.add(mediaEntity);
        }
        StoryRecorder.getInstance(this.parentActivity, UserConfig.selectedAccount).openRepost(sourceView, fromPhotoShoot);
        alertDialog.dismissUnless(500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onEventReceived$32(File file, int[] iArr, Runnable runnable) {
        AnimatedFileDrawable.getVideoInfo(file.getAbsolutePath(), iArr);
        AndroidUtilities.runOnUIThread(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$35(Boolean bool) {
        if (bool.booleanValue()) {
            notifyEvent("home_screen_added", null);
        } else {
            notifyEvent("home_screen_failed", obj("error", "UNSUPPORTED"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$36(String str, TLRPC.Document document) {
        if (str == null) {
            notifyEvent("emoji_status_set", null);
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onEmojiStatusSet(document);
                return;
            }
            return;
        }
        notifyEvent("emoji_status_failed", obj("error", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$37(Boolean bool, String str) {
        Delegate delegate;
        notifyEmojiStatusAccess(str);
        if (bool.booleanValue() && "allowed".equalsIgnoreCase(str) && (delegate = this.delegate) != null) {
            delegate.onEmojiStatusGranted(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$39(Boolean bool, Boolean bool2) {
        if (this.delegate != null && bool.booleanValue()) {
            this.delegate.onLocationGranted(bool2.booleanValue());
        }
        this.location.requestObject(new Utilities.Callback() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda39
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                BotWebViewContainer.this.lambda$onEventReceived$38((JSONObject) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$38(JSONObject jSONObject) {
        notifyEvent("location_requested", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$40(JSONObject jSONObject) {
        notifyEvent("location_requested", jSONObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$43(final String str, final String str2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda38
            @Override // java.lang.Runnable
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$42(tLObject, str, str2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$42(TLObject tLObject, final String str, final String str2) {
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            notifyEvent("file_download_requested", obj("status", "cancelled"));
        } else {
            BotDownloads.showAlert(getContext(), str, str2, UserObject.getUserName(this.botUser), new Utilities.Callback() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda49
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    BotWebViewContainer.this.lambda$onEventReceived$41(str, str2, (Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$41(String str, String str2, Boolean bool) {
        if (!bool.booleanValue()) {
            notifyEvent("file_download_requested", obj("status", "cancelled"));
        } else {
            this.downloads.download(str, str2);
            notifyEvent("file_download_requested", obj("status", "downloading"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$44() {
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.onCloseToTabs();
        }
        LaunchActivity.dismissAllWeb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$46(final BotWebViewProxy botWebViewProxy, String str, final ArrayList arrayList) {
        if (TextUtils.isEmpty(str)) {
            notifyEvent("prepared_message_sent", null);
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.onOpenBackFromTabs();
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda43
                @Override // java.lang.Runnable
                public final void run() {
                    BotWebViewContainer.lambda$onEventReceived$45(BotWebViewContainer.BotWebViewProxy.this, arrayList);
                }
            }, 500L);
            return;
        }
        notifyEvent("prepared_message_failed", obj("error", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onEventReceived$45(BotWebViewProxy botWebViewProxy, ArrayList arrayList) {
        BotWebViewContainer botWebViewContainer;
        Delegate delegate;
        if (botWebViewProxy == null || (botWebViewContainer = botWebViewProxy.container) == null || (delegate = botWebViewContainer.delegate) == null) {
            return;
        }
        delegate.onSharedTo(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onEventReceived$47(boolean z, double d, String str, double d2) {
        this.onVerifiedAge.run(Boolean.valueOf(z), Double.valueOf(d), str, Double.valueOf(d2));
    }

    private void setStorageKey(BotStorage botStorage, String str, String str2, String str3) {
        if (botStorage == null || this.botUser == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    notifyEvent(str3, obj("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    try {
                        botStorage.setKey(optString, jSONObject.optString("value"));
                        notifyEvent(str2, obj("req_id", string));
                    } catch (RuntimeException e) {
                        notifyEvent(str3, obj("req_id", string, "error", e.getMessage()));
                    }
                } catch (Exception unused) {
                    notifyEvent(str3, obj("req_id", string, "error", "VALUE_INVALID"));
                }
            } catch (Exception unused2) {
                notifyEvent(str3, obj("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            if (TextUtils.isEmpty("")) {
                return;
            }
            notifyEvent(str3, obj("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    private void getStorageKey(BotStorage botStorage, String str, String str2, String str3) {
        Object obj;
        if (botStorage == null || this.botUser == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("req_id");
            try {
                String optString = jSONObject.optString("key");
                if (optString == null) {
                    notifyEvent(str3, obj("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    Pair key = botStorage.getKey(optString);
                    if (botStorage.secured && (obj = key.first) == null) {
                        notifyEvent(str2, obj("req_id", string, "value", obj, "can_restore", key.second));
                    } else {
                        notifyEvent(str2, obj("req_id", string, "value", key.first));
                    }
                } catch (RuntimeException e) {
                    notifyEvent(str3, obj("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused) {
                notifyEvent(str3, obj("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            if (TextUtils.isEmpty("")) {
                return;
            }
            notifyEvent(str3, obj("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    private void restoreStorageKey(final BotStorage botStorage, String str, final String str2, final String str3) {
        if (botStorage == null || this.botUser == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            final String string = jSONObject.getString("req_id");
            try {
                final String optString = jSONObject.optString("key");
                if (optString == null) {
                    notifyEvent(str3, obj("req_id", string, "error", "KEY_INVALID"));
                    return;
                }
                try {
                    List storagesWithKey = botStorage.getStoragesWithKey(optString);
                    if (storagesWithKey.isEmpty()) {
                        notifyEvent(str3, obj("req_id", string, "error", "RESTORE_UNAVAILABLE"));
                    } else {
                        botStorage.showChooseStorage(getContext(), storagesWithKey, new Utilities.Callback() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda42
                            @Override // org.telegram.messenger.Utilities.Callback
                            public final void run(Object obj) {
                                BotWebViewContainer.this.lambda$restoreStorageKey$48(str3, string, botStorage, optString, str2, (String) obj);
                            }
                        });
                    }
                } catch (Exception e) {
                    notifyEvent(str3, obj("req_id", string, "error", e.getMessage()));
                }
            } catch (Exception unused) {
                notifyEvent(str3, obj("req_id", string, "error", "KEY_INVALID"));
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            if (TextUtils.isEmpty("")) {
                return;
            }
            notifyEvent(str3, obj("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$restoreStorageKey$48(String str, String str2, BotStorage botStorage, String str3, String str4, String str5) {
        if (str5 == null) {
            notifyEvent(str, obj("req_id", str2, "error", "RESTORE_CANCELLED"));
            return;
        }
        try {
            botStorage.restoreFrom(str5);
            notifyEvent(str4, obj("req_id", str2, "value", (String) botStorage.getKey(str3).first));
        } catch (Exception e) {
            notifyEvent(str, obj("req_id", str2, "error", e.getMessage()));
        }
    }

    private void clearStorageKey(BotStorage botStorage, String str, String str2, String str3) {
        if (botStorage == null || this.botUser == null) {
            return;
        }
        try {
            String string = new JSONObject(str).getString("req_id");
            try {
                botStorage.clear();
                notifyEvent(str2, obj("req_id", string));
            } catch (RuntimeException e) {
                notifyEvent(str3, obj("req_id", string, "error", e.getMessage()));
            }
        } catch (Exception e2) {
            FileLog.e(e2);
            if (TextUtils.isEmpty("")) {
                return;
            }
            notifyEvent(str3, obj("req_id", "", "error", "UNKNOWN_ERROR"));
        }
    }

    public void reportSafeInsets(Rect rect, int i) {
        reportSafeInsets(rect, false);
        reportSafeContentInsets(i, false);
    }

    private void reportSafeInsets(Rect rect, boolean z) {
        if (rect != null) {
            if (z || !this.lastInsets.equals(rect)) {
                notifyEvent("safe_area_changed", obj("left", Float.valueOf(rect.left / AndroidUtilities.density), "top", Float.valueOf(rect.top / AndroidUtilities.density), "right", Float.valueOf(rect.right / AndroidUtilities.density), "bottom", Float.valueOf(rect.bottom / AndroidUtilities.density)));
                this.lastInsets.set(rect);
            }
        }
    }

    private void reportSafeContentInsets(int i, boolean z) {
        if (z || i != this.lastInsetsTopMargin) {
            notifyEvent("content_safe_area_changed", obj("left", 0, "top", Float.valueOf(i / AndroidUtilities.density), "right", 0, "bottom", 0));
            this.lastInsetsTopMargin = i;
        }
    }

    public void notifyEmojiStatusAccess(String str) {
        notifyEvent("emoji_status_access_requested", obj("status", str));
    }

    private void createBiometry() {
        if (this.botUser == null) {
            return;
        }
        BotBiometry botBiometry = this.biometry;
        if (botBiometry == null) {
            this.biometry = BotBiometry.get(getContext(), this.currentAccount, this.botUser.id);
        } else {
            botBiometry.load();
        }
    }

    private void notifyBiometryReceived() {
        if (this.botUser == null) {
            return;
        }
        createBiometry();
        BotBiometry botBiometry = this.biometry;
        if (botBiometry == null) {
            return;
        }
        try {
            notifyEvent("biometry_info_received", botBiometry.getStatus());
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    private void unknownError() {
        unknownError(null);
    }

    private void unknownError(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(LocaleController.getString("UnknownError", R.string.UnknownError));
        if (str != null) {
            str2 = ": " + str;
        } else {
            str2 = "";
        }
        sb.append(str2);
        error(sb.toString());
    }

    private void error(String str) {
        BulletinFactory.of(this, this.resourcesProvider).createSimpleBulletin(R.raw.error, str).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$49() {
        notifyEvent("location_checked", this.location.checkObject());
    }

    private boolean ignoreDialog(int i) {
        if (this.currentDialog != null) {
            return true;
        }
        if (this.blockedDialogsUntil > 0 && System.currentTimeMillis() < this.blockedDialogsUntil) {
            return true;
        }
        if (this.lastDialogType != i || this.shownDialogsCount <= 3) {
            return false;
        }
        this.blockedDialogsUntil = System.currentTimeMillis() + 3000;
        this.shownDialogsCount = 0;
        return true;
    }

    private boolean showDialog(int i, AlertDialog alertDialog, final Runnable runnable) {
        if (alertDialog == null || ignoreDialog(i)) {
            return false;
        }
        alertDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.web.BotWebViewContainer$$ExternalSyntheticLambda34
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                BotWebViewContainer.this.lambda$showDialog$50(runnable, dialogInterface);
            }
        });
        this.currentDialog = alertDialog;
        alertDialog.setDismissDialogByButtons(false);
        this.currentDialog.show();
        if (this.lastDialogType != i) {
            this.lastDialogType = i;
            this.shownDialogsCount = 0;
            this.blockedDialogsUntil = 0L;
        }
        this.shownDialogsCount++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showDialog$50(Runnable runnable, DialogInterface dialogInterface) {
        if (runnable != null) {
            runnable.run();
        }
        this.currentDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openQrScanActivity() {
        Activity activity = this.parentActivity;
        if (activity == null) {
            return;
        }
        this.cameraBottomSheet = CameraScanActivity.showAsSheet(activity, false, 3, new CameraScanActivity.CameraScanActivityDelegate() { // from class: org.telegram.ui.web.BotWebViewContainer.6
            @Override // org.telegram.ui.CameraScanActivity.CameraScanActivityDelegate
            public /* synthetic */ void didFindMrzInfo(MrzRecognizer.Result result) {
                CameraScanActivity.CameraScanActivityDelegate.-CC.$default$didFindMrzInfo(this, result);
            }

            @Override // org.telegram.ui.CameraScanActivity.CameraScanActivityDelegate
            public /* synthetic */ boolean processQr(String str, Runnable runnable) {
                return CameraScanActivity.CameraScanActivityDelegate.-CC.$default$processQr(this, str, runnable);
            }

            @Override // org.telegram.ui.CameraScanActivity.CameraScanActivityDelegate
            public void didFindQr(String str) {
                try {
                    BotWebViewContainer.this.lastClickMs = System.currentTimeMillis();
                    BotWebViewContainer.this.notifyEvent("qr_text_received", new JSONObject().put("data", str));
                } catch (JSONException e) {
                    FileLog.e(e);
                }
            }

            @Override // org.telegram.ui.CameraScanActivity.CameraScanActivityDelegate
            public String getSubtitleText() {
                return BotWebViewContainer.this.lastQrText;
            }

            @Override // org.telegram.ui.CameraScanActivity.CameraScanActivityDelegate
            public void onDismiss() {
                BotWebViewContainer.this.notifyEvent("scan_qr_popup_closed", null);
                BotWebViewContainer.this.hasQRPending = false;
            }
        });
    }

    private JSONObject buildThemeParams() {
        try {
            JSONObject makeThemeParams = BotWebViewSheet.makeThemeParams(this.resourcesProvider, true);
            if (makeThemeParams != null) {
                return new JSONObject().put("theme_params", makeThemeParams);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return new JSONObject();
    }

    private int getColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            return resourcesProvider.getColor(i);
        }
        return Theme.getColor(i);
    }

    public static class BotWebViewProxy {
        public BotWebViewContainer container;

        public BotWebViewProxy(BotWebViewContainer botWebViewContainer) {
            this.container = botWebViewContainer;
        }

        public void setContainer(BotWebViewContainer botWebViewContainer) {
            this.container = botWebViewContainer;
        }

        @JavascriptInterface
        public void postEvent(final String str, final String str2) {
            try {
                if (this.container == null) {
                    FileLog.d("webviewproxy.postEvent: no container");
                } else {
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            BotWebViewContainer.BotWebViewProxy.this.lambda$postEvent$0(str, str2);
                        }
                    });
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$postEvent$0(String str, String str2) {
            try {
                BotWebViewContainer botWebViewContainer = this.container;
                if (botWebViewContainer == null) {
                    return;
                }
                botWebViewContainer.onEventReceived(this, str, str2);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static class WebViewProxy {
        public BotWebViewContainer container;
        public final MyWebView webView;

        public WebViewProxy(MyWebView myWebView, BotWebViewContainer botWebViewContainer) {
            this.webView = myWebView;
            this.container = botWebViewContainer;
        }

        public void setContainer(BotWebViewContainer botWebViewContainer) {
            this.container = botWebViewContainer;
        }

        @JavascriptInterface
        public void post(final String str, final String str2) {
            if (this.container == null) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$WebViewProxy$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    BotWebViewContainer.WebViewProxy.this.lambda$post$0(str, str2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$post$0(String str, String str2) {
            BotWebViewContainer botWebViewContainer = this.container;
            if (botWebViewContainer == null) {
                return;
            }
            botWebViewContainer.onWebEventReceived(str, str2);
        }

        @JavascriptInterface
        public void resolveShare(final String str, final byte[] bArr, final String str2, final String str3) {
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$WebViewProxy$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    BotWebViewContainer.WebViewProxy.this.lambda$resolveShare$2(str, bArr, str2, str3);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0083  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x015c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ void lambda$resolveShare$2(String str, byte[] bArr, String str2, String str3) {
            String str4;
            String str5;
            String str6;
            String str7;
            JSONObject jSONObject;
            LaunchActivity launchActivity;
            if (this.container == null) {
                return;
            }
            if (System.currentTimeMillis() - this.container.lastClickMs <= 10000) {
                this.container.lastClickMs = 0L;
                Context context = this.webView.getContext();
                Activity findActivity = AndroidUtilities.findActivity(context);
                if (findActivity == null && (launchActivity = LaunchActivity.instance) != null) {
                    findActivity = launchActivity;
                }
                if (context == null || findActivity == null || !(findActivity instanceof LaunchActivity) || findActivity.isFinishing() || !this.webView.isAttachedToWindow()) {
                    this.webView.evaluateJS("window.navigator.__share__receive(\"security\")");
                    return;
                }
                LaunchActivity launchActivity2 = (LaunchActivity) findActivity;
                File file = null;
                try {
                    jSONObject = new JSONObject(str);
                    str4 = jSONObject.optString("url", null);
                    try {
                        str5 = jSONObject.optString("text", null);
                    } catch (Exception e) {
                        e = e;
                        str5 = null;
                    }
                } catch (Exception e2) {
                    e = e2;
                    str4 = null;
                    str5 = null;
                }
                try {
                    str6 = jSONObject.optString("title", null);
                } catch (Exception e3) {
                    e = e3;
                    FileLog.e(e);
                    str6 = null;
                    StringBuilder sb = new StringBuilder();
                    if (str6 != null) {
                    }
                    if (str5 != null) {
                    }
                    if (str4 != null) {
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.putExtra("android.intent.extra.TEXT", sb.toString());
                    if (bArr == null) {
                    }
                    launchActivity2.whenWebviewShareAPIDone(new Utilities.Callback() { // from class: org.telegram.ui.web.BotWebViewContainer$WebViewProxy$$ExternalSyntheticLambda2
                        @Override // org.telegram.messenger.Utilities.Callback
                        public final void run(Object obj) {
                            BotWebViewContainer.WebViewProxy.this.lambda$resolveShare$1((Boolean) obj);
                        }
                    });
                    launchActivity2.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 521);
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                if (str6 != null) {
                    sb2.append(str6);
                }
                if (str5 != null) {
                    if (sb2.length() > 0) {
                        sb2.append("\n");
                    }
                    sb2.append(str5);
                }
                if (str4 != null) {
                    if (sb2.length() > 0) {
                        sb2.append("\n");
                    }
                    sb2.append(str4);
                }
                Intent intent2 = new Intent("android.intent.action.SEND");
                intent2.putExtra("android.intent.extra.TEXT", sb2.toString());
                if (bArr == null) {
                    int i = 0;
                    while (true) {
                        if (file == null || file.exists()) {
                            File directory = FileLoader.getDirectory(4);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(FileLoader.fixFileName(str2 == null ? "file" : str2));
                            if (i > 0) {
                                str7 = " (" + i + ")";
                            } else {
                                str7 = "";
                            }
                            sb3.append(str7);
                            file = new File(directory, sb3.toString());
                            i++;
                        } else {
                            try {
                                break;
                            } catch (Exception e4) {
                                FileLog.e(e4);
                            }
                        }
                    }
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                    try {
                        if (str3 == null) {
                            intent2.setType("text/plain");
                        } else {
                            intent2.setType(str3);
                        }
                        if (str2 != null) {
                            intent2.putExtra("android.intent.extra.TITLE", str2);
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            try {
                                intent2.putExtra("android.intent.extra.STREAM", FileProvider.getUriForFile(launchActivity2, ApplicationLoader.getApplicationId() + ".provider", file));
                                intent2.setFlags(1);
                            } catch (Exception unused) {
                                intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                            }
                        } else {
                            intent2.putExtra("android.intent.extra.STREAM", Uri.fromFile(file));
                        }
                    } catch (Exception e5) {
                        FileLog.e(e5);
                    }
                } else {
                    intent2.setType("text/plain");
                }
                launchActivity2.whenWebviewShareAPIDone(new Utilities.Callback() { // from class: org.telegram.ui.web.BotWebViewContainer$WebViewProxy$$ExternalSyntheticLambda2
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        BotWebViewContainer.WebViewProxy.this.lambda$resolveShare$1((Boolean) obj);
                    }
                });
                launchActivity2.startActivityForResult(Intent.createChooser(intent2, LocaleController.getString(R.string.ShareFile)), 521);
                return;
            }
            this.webView.evaluateJS("window.navigator.__share__receive(\"security\")");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$resolveShare$1(Boolean bool) {
            MyWebView myWebView = this.webView;
            StringBuilder sb = new StringBuilder();
            sb.append("window.navigator.__share__receive(");
            sb.append(bool.booleanValue() ? "" : "'abort'");
            sb.append(")");
            myWebView.evaluateJS(sb.toString());
        }
    }

    public interface Delegate {
        BotSensors getBotSensors();

        boolean isClipboardAvailable();

        void onCloseRequested(Runnable runnable);

        void onCloseToTabs();

        void onEmojiStatusGranted(boolean z);

        void onEmojiStatusSet(TLRPC.Document document);

        String onFullscreenRequested(boolean z);

        void onInstantClose();

        void onLocationGranted(boolean z);

        void onOpenBackFromTabs();

        void onOrientationLockChanged(boolean z);

        void onSendWebViewData(String str);

        void onSetBackButtonVisible(boolean z);

        void onSetSettingsButtonVisible(boolean z);

        void onSetupMainButton(boolean z, boolean z2, String str, int i, int i2, boolean z3, boolean z4);

        void onSetupSecondaryButton(boolean z, boolean z2, String str, int i, int i2, boolean z3, boolean z4, String str2);

        void onSharedTo(ArrayList arrayList);

        void onWebAppBackgroundChanged(boolean z, int i);

        void onWebAppExpand();

        void onWebAppOpenInvoice(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject);

        void onWebAppReady();

        void onWebAppSetActionBarColor(int i, int i2, boolean z);

        void onWebAppSetBackgroundColor(int i);

        void onWebAppSetNavigationBarColor(int i);

        void onWebAppSetupClosingBehavior(boolean z);

        void onWebAppSwipingBehavior(boolean z);

        void onWebAppSwitchInlineQuery(TLRPC.User user, String str, List list);

        public abstract /* synthetic */ class -CC {
            public static BotSensors $default$getBotSensors(Delegate delegate) {
                return null;
            }

            public static boolean $default$isClipboardAvailable(Delegate delegate) {
                return false;
            }

            public static void $default$onEmojiStatusGranted(Delegate delegate, boolean z) {
            }

            public static void $default$onEmojiStatusSet(Delegate delegate, TLRPC.Document document) {
            }

            public static void $default$onLocationGranted(Delegate delegate, boolean z) {
            }

            public static void $default$onOpenBackFromTabs(Delegate delegate) {
            }

            public static void $default$onOrientationLockChanged(Delegate delegate, boolean z) {
            }

            public static void $default$onSendWebViewData(Delegate delegate, String str) {
            }

            public static void $default$onSharedTo(Delegate delegate, ArrayList arrayList) {
            }

            public static void $default$onWebAppBackgroundChanged(Delegate delegate, boolean z, int i) {
            }

            public static void $default$onWebAppReady(Delegate delegate) {
            }

            public static void $default$onWebAppSetNavigationBarColor(Delegate delegate, int i) {
            }

            public static String $default$onFullscreenRequested(Delegate delegate, boolean z) {
                return "UNSUPPORTED";
            }
        }
    }

    public static final class PopupButton {
        public String id;
        public String text;
        public int textColorKey;

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public PopupButton(JSONObject jSONObject) {
            char c = 65535;
            this.textColorKey = -1;
            this.id = jSONObject.getString("id");
            String string = jSONObject.getString("type");
            switch (string.hashCode()) {
                case -1829997182:
                    if (string.equals("destructive")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1367724422:
                    if (string.equals("cancel")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3548:
                    if (string.equals("ok")) {
                        c = 2;
                        break;
                    }
                    break;
                case 94756344:
                    if (string.equals("close")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1544803905:
                    if (string.equals("default")) {
                        c = 1;
                        break;
                    }
                    break;
            }
            if (c == 2) {
                this.text = LocaleController.getString(R.string.OK);
                return;
            }
            if (c == 3) {
                this.text = LocaleController.getString(R.string.Close);
            } else {
                if (c == 4) {
                    this.text = LocaleController.getString(R.string.Cancel);
                    return;
                }
                if (c == 5) {
                    this.textColorKey = Theme.key_text_RedBold;
                }
                this.text = jSONObject.getString("text");
            }
        }
    }

    public static boolean isTonsite(String str) {
        return str != null && isTonsite(Uri.parse(str));
    }

    public static boolean isTonsite(Uri uri) {
        if ("tonsite".equals(uri.getScheme())) {
            return true;
        }
        String authority = uri.getAuthority();
        if (authority == null && uri.getScheme() == null) {
            authority = Uri.parse("http://" + uri.toString()).getAuthority();
        }
        return authority != null && (authority.endsWith(".ton") || authority.endsWith(".adnl"));
    }

    public static WebResourceResponse proxyTON(WebResourceRequest webResourceRequest) {
        return proxyTON(webResourceRequest.getMethod(), webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }

    public static String rotateTONHost(String str) {
        try {
            str = IDN.toASCII(str, 1);
        } catch (Exception e) {
            FileLog.e(e);
        }
        String[] split = str.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if (i > 0) {
                sb.append("-d");
            }
            sb.append(split[i].replaceAll("\\-", "-h"));
        }
        sb.append(".");
        sb.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return sb.toString();
    }

    public static WebResourceResponse proxyTON(String str, String str2, Map map) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(Browser.replaceHostname(Uri.parse(str2), rotateTONHost(AndroidUtilities.getHostAuthority(str2)), "https")).openConnection();
            httpURLConnection.setRequestMethod(str);
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
            }
            httpURLConnection.connect();
            return new WebResourceResponse(httpURLConnection.getContentType().split(";", 2)[0], httpURLConnection.getContentEncoding(), httpURLConnection.getInputStream());
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static class MyWebView extends WebView {
        public final boolean bot;
        private BotWebViewContainer botWebViewContainer;
        private BrowserHistory.Entry currentHistoryEntry;
        private BottomSheet currentSheet;
        private String currentUrl;
        public boolean dangerousUrl;
        public boolean errorShown;
        public String errorShownAt;
        public boolean injectedJS;
        private boolean isPageLoaded;
        public int lastActionBarColor;
        public boolean lastActionBarColorGot;
        public int lastBackgroundColor;
        public boolean lastBackgroundColorGot;
        public Bitmap lastFavicon;
        public boolean lastFaviconGot;
        private String lastFaviconUrl;
        private HashMap lastFavicons;
        public String lastSiteName;
        public String lastTitle;
        public boolean lastTitleGot;
        private String lastUrl;
        private Runnable onCloseListener;
        private String openedByUrl;
        public MyWebView opener;
        private int prevScrollX;
        private int prevScrollY;
        private int searchCount;
        private int searchIndex;
        private Runnable searchListener;
        private boolean searchLoading;
        private final int tag;
        public String urlFallback;
        private WebViewScrollListener webViewScrollListener;
        private Runnable whenPageLoaded;

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$evaluateJS$1(String str) {
        }

        public boolean isPageLoaded() {
            return this.isPageLoaded;
        }

        public void d(String str) {
            FileLog.d("[webview] #" + this.tag + " " + str);
        }

        public MyWebView(Context context, boolean z, long j) {
            super(context);
            this.tag = BotWebViewContainer.access$1508();
            this.urlFallback = "about:blank";
            this.lastFavicons = new HashMap();
            this.bot = z;
            d("created new webview " + this);
            setOnLongClickListener(new 1());
            setWebViewClient(new 2(z, context));
            setWebChromeClient(new 3(context, z, j));
            setFindListener(new WebView.FindListener() { // from class: org.telegram.ui.web.BotWebViewContainer.MyWebView.4
                @Override // android.webkit.WebView.FindListener
                public void onFindResultReceived(int i, int i2, boolean z2) {
                    MyWebView.this.searchIndex = i;
                    MyWebView.this.searchCount = i2;
                    MyWebView.this.searchLoading = !z2;
                    if (MyWebView.this.searchListener != null) {
                        MyWebView.this.searchListener.run();
                    }
                }
            });
            if (z) {
                return;
            }
            setDownloadListener(new 5());
        }

        class 1 implements View.OnLongClickListener {
            1() {
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                WebView.HitTestResult hitTestResult = MyWebView.this.getHitTestResult();
                if (hitTestResult.getType() == 7) {
                    final String extra = hitTestResult.getExtra();
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            BotWebViewContainer.MyWebView.1.this.lambda$onLongClick$1(extra);
                        }
                    });
                    return true;
                }
                if (hitTestResult.getType() != 5) {
                    return false;
                }
                final String extra2 = hitTestResult.getExtra();
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$1$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BotWebViewContainer.MyWebView.1.this.lambda$onLongClick$3(extra2);
                    }
                });
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|2|3|(5:7|9|10|11|12)|17|9|10|11|12|(2:(1:21)|(0))) */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
            
                r4 = e;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public /* synthetic */ void lambda$onLongClick$1(final String str) {
                String str2;
                Uri parse;
                BottomSheet.Builder builder = new BottomSheet.Builder(MyWebView.this.getContext(), false, null);
                try {
                    parse = Uri.parse(str);
                } catch (Exception e) {
                    try {
                        FileLog.e((Throwable) e, false);
                    } catch (Exception e2) {
                        e = e2;
                        str2 = str;
                        FileLog.e(e);
                        builder.setTitleMultipleLines(true);
                        builder.setTitle(str2);
                        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$1$$ExternalSyntheticLambda3
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                BotWebViewContainer.MyWebView.1.this.lambda$onLongClick$0(str, dialogInterface, i);
                            }
                        });
                        MyWebView.this.currentSheet = builder.show();
                    }
                }
                if (parse != null && !parse.getScheme().equalsIgnoreCase("data")) {
                    str2 = Browser.replaceHostname(parse, Browser.IDN_toUnicode(parse.getHost()), null);
                    str2 = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                    builder.setTitleMultipleLines(true);
                    builder.setTitle(str2);
                    builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$1$$ExternalSyntheticLambda3
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            BotWebViewContainer.MyWebView.1.this.lambda$onLongClick$0(str, dialogInterface, i);
                        }
                    });
                    MyWebView.this.currentSheet = builder.show();
                }
                str2 = str;
                str2 = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                builder.setTitleMultipleLines(true);
                builder.setTitle(str2);
                builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInTelegramBrowser), LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.Copy)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$1$$ExternalSyntheticLambda3
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        BotWebViewContainer.MyWebView.1.this.lambda$onLongClick$0(str, dialogInterface, i);
                    }
                });
                MyWebView.this.currentSheet = builder.show();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onLongClick$0(String str, DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    MyWebView.this.loadUrl(str);
                    return;
                }
                if (i != 1) {
                    if (i == 2) {
                        AndroidUtilities.addToClipboard(str);
                        if (MyWebView.this.botWebViewContainer != null) {
                            MyWebView.this.botWebViewContainer.showLinkCopiedBulletin();
                            return;
                        }
                        return;
                    }
                    return;
                }
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                    intent.putExtra("create_new_tab", true);
                    intent.putExtra("com.android.browser.application_id", MyWebView.this.getContext().getPackageName());
                    MyWebView.this.getContext().startActivity(intent);
                } catch (Exception e) {
                    FileLog.e(e);
                    MyWebView.this.loadUrl(str);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onLongClick$3(final String str) {
                String str2;
                BottomSheet.Builder builder = new BottomSheet.Builder(MyWebView.this.getContext(), false, null);
                try {
                    Uri parse = Uri.parse(str);
                    str2 = Browser.replaceHostname(parse, Browser.IDN_toUnicode(parse.getHost()), null);
                } catch (Exception e) {
                    try {
                        FileLog.e((Throwable) e, false);
                        str2 = str;
                    } catch (Exception e2) {
                        e = e2;
                        str2 = str;
                        FileLog.e(e);
                        builder.setTitleMultipleLines(true);
                        builder.setTitle(str2);
                        builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$1$$ExternalSyntheticLambda2
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i) {
                                BotWebViewContainer.MyWebView.1.this.lambda$onLongClick$2(str, dialogInterface, i);
                            }
                        });
                        MyWebView.this.currentSheet = builder.show();
                    }
                }
                try {
                    str2 = URLDecoder.decode(str2.replaceAll("\\+", "%2b"), "UTF-8");
                } catch (Exception e3) {
                    e = e3;
                    FileLog.e(e);
                    builder.setTitleMultipleLines(true);
                    builder.setTitle(str2);
                    builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$1$$ExternalSyntheticLambda2
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            BotWebViewContainer.MyWebView.1.this.lambda$onLongClick$2(str, dialogInterface, i);
                        }
                    });
                    MyWebView.this.currentSheet = builder.show();
                }
                builder.setTitleMultipleLines(true);
                builder.setTitle(str2);
                builder.setItems(new CharSequence[]{LocaleController.getString(R.string.OpenInSystemBrowser), LocaleController.getString(R.string.AccActionDownload), LocaleController.getString(R.string.CopyLink)}, new DialogInterface.OnClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$1$$ExternalSyntheticLambda2
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        BotWebViewContainer.MyWebView.1.this.lambda$onLongClick$2(str, dialogInterface, i);
                    }
                });
                MyWebView.this.currentSheet = builder.show();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onLongClick$2(String str, DialogInterface dialogInterface, int i) {
                if (i == 0) {
                    try {
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                        intent.putExtra("create_new_tab", true);
                        intent.putExtra("com.android.browser.application_id", MyWebView.this.getContext().getPackageName());
                        MyWebView.this.getContext().startActivity(intent);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        MyWebView.this.loadUrl(str);
                        return;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        AndroidUtilities.addToClipboard(str);
                        if (MyWebView.this.botWebViewContainer != null) {
                            MyWebView.this.botWebViewContainer.showLinkCopiedBulletin();
                            return;
                        }
                        return;
                    }
                    return;
                }
                try {
                    String guessFileName = URLUtil.guessFileName(str, null, "image/*");
                    if (guessFileName == null) {
                        guessFileName = "image.png";
                    }
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setMimeType("image/*");
                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, guessFileName);
                    DownloadManager downloadManager = (DownloadManager) MyWebView.this.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    if (MyWebView.this.botWebViewContainer != null) {
                        BulletinFactory.of(MyWebView.this.botWebViewContainer, MyWebView.this.botWebViewContainer.resourcesProvider).createSimpleBulletin(R.raw.ic_download, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, guessFileName))).show(true);
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
        }

        class 2 extends WebViewClient {
            private boolean firstRequest = true;
            private final Runnable resetErrorRunnable = new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    BotWebViewContainer.MyWebView.2.this.lambda$$3();
                }
            };
            final /* synthetic */ boolean val$bot;
            final /* synthetic */ Context val$context;

            2(boolean z, Context context) {
                this.val$bot = z;
                this.val$context = context;
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                HttpURLConnection httpURLConnection;
                int i;
                MyWebView myWebView = MyWebView.this;
                StringBuilder sb = new StringBuilder();
                sb.append("shouldInterceptRequest ");
                HttpURLConnection httpURLConnection2 = null;
                sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
                myWebView.d(sb.toString());
                if (webResourceRequest != null && BotWebViewContainer.isTonsite(webResourceRequest.getUrl())) {
                    MyWebView.this.d("proxying ton");
                    this.firstRequest = false;
                    return BotWebViewContainer.proxyTON(webResourceRequest);
                }
                if (!this.val$bot && MyWebView.this.opener != null && this.firstRequest) {
                    try {
                        httpURLConnection = (HttpURLConnection) new URL(webResourceRequest.getUrl().toString()).openConnection();
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        httpURLConnection.setRequestMethod(webResourceRequest.getMethod());
                        if (webResourceRequest.getRequestHeaders() != null) {
                            for (Map.Entry<String, String> entry : webResourceRequest.getRequestHeaders().entrySet()) {
                                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                            }
                        }
                        httpURLConnection.connect();
                        HashMap hashMap = new HashMap();
                        Iterator<Map.Entry<String, List<String>>> it = httpURLConnection.getHeaderFields().entrySet().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map.Entry<String, List<String>> next = it.next();
                            String key = next.getKey();
                            if (key != null) {
                                hashMap.put(key, TextUtils.join(", ", next.getValue()));
                                if (!MyWebView.this.dangerousUrl && ("cross-origin-resource-policy".equals(key.toLowerCase()) || "cross-origin-embedder-policy".equals(key.toLowerCase()))) {
                                    Iterator<String> it2 = next.getValue().iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        String next2 = it2.next();
                                        if (next2 != null && !"unsafe-none".equals(next2.toLowerCase()) && !"same-site".equals(next2.toLowerCase())) {
                                            MyWebView.this.d("<!> dangerous header CORS policy: " + key + ": " + next2 + " from " + webResourceRequest.getMethod() + " " + webResourceRequest.getUrl());
                                            MyWebView.this.dangerousUrl = true;
                                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$2$$ExternalSyntheticLambda5
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    BotWebViewContainer.MyWebView.2.this.lambda$shouldInterceptRequest$0();
                                                }
                                            });
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        String contentType = httpURLConnection.getContentType();
                        String contentEncoding = httpURLConnection.getContentEncoding();
                        if (contentType.indexOf("; ") >= 0) {
                            String[] split = contentType.split("; ");
                            if (!TextUtils.isEmpty(split[0])) {
                                contentType = split[0];
                            }
                            for (i = 1; i < split.length; i++) {
                                if (split[i].startsWith("charset=")) {
                                    contentEncoding = split[i].substring(8);
                                }
                            }
                        }
                        String str = contentEncoding;
                        this.firstRequest = false;
                        return new WebResourceResponse(contentType, str, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), hashMap, httpURLConnection.getInputStream());
                    } catch (Exception e2) {
                        e = e2;
                        httpURLConnection2 = httpURLConnection;
                        FileLog.e(e);
                        if (httpURLConnection2 != null) {
                            httpURLConnection2.disconnect();
                        }
                        this.firstRequest = false;
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }
                this.firstRequest = false;
                return super.shouldInterceptRequest(webView, webResourceRequest);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$shouldInterceptRequest$0() {
                if (MyWebView.this.botWebViewContainer != null) {
                    MyWebView.this.botWebViewContainer.onURLChanged(MyWebView.this.urlFallback, !r1.canGoBack(), !MyWebView.this.canGoForward());
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageCommitVisible(WebView webView, String str) {
                if (MyWebView.this.whenPageLoaded != null) {
                    Runnable runnable = MyWebView.this.whenPageLoaded;
                    MyWebView.this.whenPageLoaded = null;
                    runnable.run();
                }
                MyWebView.this.d("onPageCommitVisible " + str);
                if (!this.val$bot) {
                    MyWebView myWebView = MyWebView.this;
                    myWebView.injectedJS = true;
                    myWebView.evaluateJS(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                    MyWebView.this.evaluateJS(AndroidUtilities.readRes(R.raw.webview_share));
                } else {
                    MyWebView myWebView2 = MyWebView.this;
                    myWebView2.injectedJS = true;
                    myWebView2.evaluateJS(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                }
                super.onPageCommitVisible(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
                if (!this.val$bot && (MyWebView.this.currentHistoryEntry == null || !TextUtils.equals(MyWebView.this.currentHistoryEntry.url, str))) {
                    MyWebView.this.currentHistoryEntry = new BrowserHistory.Entry();
                    MyWebView.this.currentHistoryEntry.id = Utilities.fastRandom.nextLong();
                    MyWebView.this.currentHistoryEntry.time = System.currentTimeMillis();
                    MyWebView.this.currentHistoryEntry.url = BotWebViewContainer.magic2tonsite(MyWebView.this.getUrl());
                    MyWebView.this.currentHistoryEntry.meta = WebMetadataCache.WebMetadata.from(MyWebView.this);
                    BrowserHistory.pushHistory(MyWebView.this.currentHistoryEntry);
                }
                MyWebView.this.d("doUpdateVisitedHistory " + str + " " + z);
                if (MyWebView.this.botWebViewContainer != null) {
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView myWebView = MyWebView.this;
                    botWebViewContainer.onURLChanged(myWebView.dangerousUrl ? myWebView.urlFallback : str, !myWebView.canGoBack(), !MyWebView.this.canGoForward());
                }
                super.doUpdateVisitedHistory(webView, str, z);
            }

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                MyWebView.this.d("shouldInterceptRequest " + str);
                if (BotWebViewContainer.isTonsite(str)) {
                    MyWebView.this.d("proxying ton");
                    return BotWebViewContainer.proxyTON("GET", str, null);
                }
                return super.shouldInterceptRequest(webView, str);
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                int rendererPriorityAtExit;
                Integer valueOf;
                boolean didCrash;
                Boolean valueOf2;
                if (Build.VERSION.SDK_INT >= 26) {
                    MyWebView myWebView = MyWebView.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onRenderProcessGone priority=");
                    if (renderProcessGoneDetail == null) {
                        valueOf = null;
                    } else {
                        rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
                        valueOf = Integer.valueOf(rendererPriorityAtExit);
                    }
                    sb.append(valueOf);
                    sb.append(" didCrash=");
                    if (renderProcessGoneDetail == null) {
                        valueOf2 = null;
                    } else {
                        didCrash = renderProcessGoneDetail.didCrash();
                        valueOf2 = Boolean.valueOf(didCrash);
                    }
                    sb.append(valueOf2);
                    myWebView.d(sb.toString());
                } else {
                    MyWebView.this.d("onRenderProcessGone");
                }
                try {
                    if (!AndroidUtilities.isSafeToShow(MyWebView.this.getContext())) {
                        return true;
                    }
                    new AlertDialog.Builder(MyWebView.this.getContext(), MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$2$$ExternalSyntheticLambda6
                        @Override // java.lang.Runnable
                        public final void run() {
                            BotWebViewContainer.MyWebView.2.this.lambda$onRenderProcessGone$1();
                        }
                    })).setPositiveButton(LocaleController.getString(R.string.OK), null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$2$$ExternalSyntheticLambda7
                        @Override // android.content.DialogInterface.OnDismissListener
                        public final void onDismiss(DialogInterface dialogInterface) {
                            BotWebViewContainer.MyWebView.2.this.lambda$onRenderProcessGone$2(dialogInterface);
                        }
                    }).show();
                    return true;
                } catch (Exception e) {
                    FileLog.e(e);
                    return false;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onRenderProcessGone$1() {
                Browser.openUrl(MyWebView.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onRenderProcessGone$2(DialogInterface dialogInterface) {
                if (MyWebView.this.botWebViewContainer == null || MyWebView.this.botWebViewContainer.delegate == null) {
                    return;
                }
                MyWebView.this.botWebViewContainer.delegate.onCloseRequested(null);
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (str == null || str.trim().startsWith("sms:")) {
                    return false;
                }
                if (str.trim().startsWith("tel:")) {
                    MyWebView myWebView = MyWebView.this;
                    if (myWebView.opener != null) {
                        if (myWebView.botWebViewContainer.delegate != null) {
                            MyWebView.this.botWebViewContainer.delegate.onInstantClose();
                        } else if (MyWebView.this.onCloseListener != null) {
                            MyWebView.this.onCloseListener.run();
                            MyWebView.this.onCloseListener = null;
                        }
                    }
                    Browser.openUrl(this.val$context, str);
                    return true;
                }
                Uri parse = Uri.parse(str);
                if (!this.val$bot) {
                    if (Browser.openInExternalApp(this.val$context, str, true)) {
                        MyWebView.this.d("shouldOverrideUrlLoading(" + str + ") = true (openInExternalBrowser)");
                        if (!MyWebView.this.isPageLoaded && !MyWebView.this.canGoBack()) {
                            if (MyWebView.this.botWebViewContainer.delegate != null) {
                                MyWebView.this.botWebViewContainer.delegate.onInstantClose();
                            } else if (MyWebView.this.onCloseListener != null) {
                                MyWebView.this.onCloseListener.run();
                                MyWebView.this.onCloseListener = null;
                            }
                        }
                        return true;
                    }
                    if (str.startsWith("intent://") || (parse != null && parse.getScheme() != null && parse.getScheme().equalsIgnoreCase("intent"))) {
                        try {
                            String stringExtra = Intent.parseUri(parse.toString(), 1).getStringExtra("browser_fallback_url");
                            if (!TextUtils.isEmpty(stringExtra)) {
                                MyWebView.this.loadUrl(stringExtra);
                                return true;
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    if (parse != null && parse.getScheme() != null && !"https".equals(parse.getScheme()) && !"http".equals(parse.getScheme()) && !"tonsite".equals(parse.getScheme())) {
                        MyWebView.this.d("shouldOverrideUrlLoading(" + str + ") = true (browser open)");
                        Browser.openUrl(MyWebView.this.getContext(), parse);
                        return true;
                    }
                }
                if (MyWebView.this.botWebViewContainer != null && Browser.isInternalUri(parse, null)) {
                    if (!this.val$bot && "1".equals(parse.getQueryParameter("embed")) && "t.me".equals(parse.getAuthority())) {
                        return false;
                    }
                    if (MessagesController.getInstance(MyWebView.this.botWebViewContainer.currentAccount).webAppAllowedProtocols != null && MessagesController.getInstance(MyWebView.this.botWebViewContainer.currentAccount).webAppAllowedProtocols.contains(parse.getScheme())) {
                        MyWebView myWebView2 = MyWebView.this;
                        if (myWebView2.opener != null) {
                            if (myWebView2.botWebViewContainer.delegate != null) {
                                MyWebView.this.botWebViewContainer.delegate.onInstantClose();
                            } else if (MyWebView.this.onCloseListener != null) {
                                MyWebView.this.onCloseListener.run();
                                MyWebView.this.onCloseListener = null;
                            }
                            if (MyWebView.this.opener.botWebViewContainer != null && MyWebView.this.opener.botWebViewContainer.delegate != null) {
                                MyWebView.this.opener.botWebViewContainer.delegate.onCloseToTabs();
                            }
                        }
                        MyWebView.this.botWebViewContainer.onOpenUri(parse);
                    }
                    MyWebView.this.d("shouldOverrideUrlLoading(" + str + ") = true");
                    return true;
                }
                if (parse != null) {
                    MyWebView.this.currentUrl = parse.toString();
                }
                MyWebView.this.d("shouldOverrideUrlLoading(" + str + ") = false");
                return false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$$3() {
                if (MyWebView.this.botWebViewContainer != null) {
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView.this.errorShown = false;
                    botWebViewContainer.onErrorShown(false, 0, null);
                }
            }

            @Override // android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                String str2;
                if (MyWebView.this.botWebViewContainer == null || !MyWebView.this.botWebViewContainer.isVerifyingAge()) {
                    MyWebView.this.getSettings().setMediaPlaybackRequiresUserGesture(true);
                }
                if (MyWebView.this.currentSheet != null) {
                    MyWebView.this.currentSheet.dismiss();
                    MyWebView.this.currentSheet = null;
                }
                MyWebView.this.currentHistoryEntry = null;
                MyWebView.this.currentUrl = str;
                MyWebView myWebView = MyWebView.this;
                myWebView.lastSiteName = null;
                myWebView.lastActionBarColorGot = false;
                myWebView.lastBackgroundColorGot = false;
                myWebView.lastFaviconGot = false;
                myWebView.d("onPageStarted " + str);
                if (MyWebView.this.botWebViewContainer != null) {
                    MyWebView myWebView2 = MyWebView.this;
                    if (myWebView2.errorShown && ((str2 = myWebView2.errorShownAt) == null || !TextUtils.equals(str2, str))) {
                        AndroidUtilities.runOnUIThread(this.resetErrorRunnable, 40L);
                    }
                }
                if (MyWebView.this.botWebViewContainer != null) {
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView myWebView3 = MyWebView.this;
                    botWebViewContainer.onURLChanged(myWebView3.dangerousUrl ? myWebView3.urlFallback : str, !myWebView3.canGoBack(), true ^ MyWebView.this.canGoForward());
                }
                super.onPageStarted(webView, str, bitmap);
                MyWebView.this.injectedJS = false;
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                boolean z;
                MyWebView.this.isPageLoaded = true;
                if (MyWebView.this.whenPageLoaded != null) {
                    Runnable runnable = MyWebView.this.whenPageLoaded;
                    MyWebView.this.whenPageLoaded = null;
                    runnable.run();
                    z = false;
                } else {
                    z = true;
                }
                MyWebView.this.d("onPageFinished");
                if (MyWebView.this.botWebViewContainer != null) {
                    MyWebView.this.botWebViewContainer.setPageLoaded(str, z);
                } else {
                    MyWebView.this.d("onPageFinished: no container");
                }
                if (!this.val$bot) {
                    MyWebView myWebView = MyWebView.this;
                    myWebView.injectedJS = true;
                    myWebView.evaluateJS(AndroidUtilities.readRes(R.raw.webview_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                    MyWebView.this.evaluateJS(AndroidUtilities.readRes(R.raw.webview_share));
                } else {
                    MyWebView myWebView2 = MyWebView.this;
                    myWebView2.injectedJS = true;
                    myWebView2.evaluateJS(AndroidUtilities.readRes(R.raw.webview_app_ext).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION));
                }
                MyWebView.this.saveHistory();
                if (MyWebView.this.botWebViewContainer != null) {
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView myWebView3 = MyWebView.this;
                    botWebViewContainer.onURLChanged(myWebView3.dangerousUrl ? myWebView3.urlFallback : myWebView3.getUrl(), !MyWebView.this.canGoBack(), true ^ MyWebView.this.canGoForward());
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                int errorCode;
                CharSequence description;
                int errorCode2;
                CharSequence description2;
                CharSequence description3;
                if (Build.VERSION.SDK_INT >= 23) {
                    MyWebView myWebView = MyWebView.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("onReceivedError: ");
                    errorCode = webResourceError.getErrorCode();
                    sb.append(errorCode);
                    sb.append(" ");
                    description = webResourceError.getDescription();
                    sb.append((Object) description);
                    myWebView.d(sb.toString());
                    if (MyWebView.this.botWebViewContainer != null && (webResourceRequest == null || webResourceRequest.isForMainFrame())) {
                        AndroidUtilities.cancelRunOnUIThread(this.resetErrorRunnable);
                        MyWebView myWebView2 = MyWebView.this;
                        String str = null;
                        myWebView2.lastSiteName = null;
                        myWebView2.lastActionBarColorGot = false;
                        myWebView2.lastBackgroundColorGot = false;
                        myWebView2.lastFaviconGot = false;
                        myWebView2.lastTitleGot = false;
                        myWebView2.errorShownAt = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? MyWebView.this.getUrl() : webResourceRequest.getUrl().toString();
                        BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                        MyWebView.this.lastTitle = null;
                        botWebViewContainer.onTitleChanged(null);
                        BotWebViewContainer botWebViewContainer2 = MyWebView.this.botWebViewContainer;
                        MyWebView.this.lastFavicon = null;
                        botWebViewContainer2.onFaviconChanged(null);
                        BotWebViewContainer botWebViewContainer3 = MyWebView.this.botWebViewContainer;
                        MyWebView.this.errorShown = true;
                        errorCode2 = webResourceError.getErrorCode();
                        description2 = webResourceError.getDescription();
                        if (description2 != null) {
                            description3 = webResourceError.getDescription();
                            str = description3.toString();
                        }
                        botWebViewContainer3.onErrorShown(true, errorCode2, str);
                    }
                }
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                MyWebView.this.d("onReceivedError: " + i + " " + str + " url=" + str2);
                if (Build.VERSION.SDK_INT < 23 && MyWebView.this.botWebViewContainer != null) {
                    AndroidUtilities.cancelRunOnUIThread(this.resetErrorRunnable);
                    MyWebView myWebView = MyWebView.this;
                    myWebView.lastSiteName = null;
                    myWebView.lastActionBarColorGot = false;
                    myWebView.lastBackgroundColorGot = false;
                    myWebView.lastFaviconGot = false;
                    myWebView.lastTitleGot = false;
                    myWebView.errorShownAt = myWebView.getUrl();
                    BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                    MyWebView.this.lastTitle = null;
                    botWebViewContainer.onTitleChanged(null);
                    BotWebViewContainer botWebViewContainer2 = MyWebView.this.botWebViewContainer;
                    MyWebView.this.lastFavicon = null;
                    botWebViewContainer2.onFaviconChanged(null);
                    BotWebViewContainer botWebViewContainer3 = MyWebView.this.botWebViewContainer;
                    MyWebView.this.errorShown = true;
                    botWebViewContainer3.onErrorShown(true, i, str);
                }
                super.onReceivedError(webView, i, str, str2);
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                MyWebView myWebView = MyWebView.this;
                StringBuilder sb = new StringBuilder();
                sb.append("onReceivedHttpError: statusCode=");
                sb.append(webResourceResponse == null ? null : Integer.valueOf(webResourceResponse.getStatusCode()));
                sb.append(" request=");
                sb.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
                myWebView.d(sb.toString());
                if (MyWebView.this.botWebViewContainer != null) {
                    if ((webResourceRequest == null || webResourceRequest.isForMainFrame()) && webResourceResponse != null && TextUtils.isEmpty(webResourceResponse.getMimeType())) {
                        AndroidUtilities.cancelRunOnUIThread(this.resetErrorRunnable);
                        MyWebView myWebView2 = MyWebView.this;
                        myWebView2.lastSiteName = null;
                        myWebView2.lastActionBarColorGot = false;
                        myWebView2.lastBackgroundColorGot = false;
                        myWebView2.lastFaviconGot = false;
                        myWebView2.lastTitleGot = false;
                        myWebView2.errorShownAt = (webResourceRequest == null || webResourceRequest.getUrl() == null) ? MyWebView.this.getUrl() : webResourceRequest.getUrl().toString();
                        BotWebViewContainer botWebViewContainer = MyWebView.this.botWebViewContainer;
                        MyWebView.this.lastTitle = null;
                        botWebViewContainer.onTitleChanged(null);
                        BotWebViewContainer botWebViewContainer2 = MyWebView.this.botWebViewContainer;
                        MyWebView.this.lastFavicon = null;
                        botWebViewContainer2.onFaviconChanged(null);
                        BotWebViewContainer botWebViewContainer3 = MyWebView.this.botWebViewContainer;
                        MyWebView.this.errorShown = true;
                        botWebViewContainer3.onErrorShown(true, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase());
                    }
                }
            }

            @Override // android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                MyWebView myWebView = MyWebView.this;
                StringBuilder sb = new StringBuilder();
                sb.append("onReceivedSslError: error=");
                sb.append(sslError);
                sb.append(" url=");
                sb.append(sslError == null ? null : sslError.getUrl());
                myWebView.d(sb.toString());
                sslErrorHandler.cancel();
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }
        }

        class 3 extends WebChromeClient {
            private Dialog lastPermissionsDialog;
            final /* synthetic */ boolean val$bot;
            final /* synthetic */ long val$botId;
            final /* synthetic */ Context val$context;

            3(Context context, boolean z, long j) {
                this.val$context = context;
                this.val$bot = z;
                this.val$botId = j;
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
                final boolean[] zArr = {false};
                new AlertDialog.Builder(this.val$context, MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider).setTitle(this.val$bot ? DialogObject.getName(this.val$botId) : LocaleController.formatString(R.string.WebsiteSays, str)).setMessage(str2).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda8
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotWebViewContainer.MyWebView.3.lambda$onJsAlert$0(zArr, jsResult, alertDialog, i);
                    }
                }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda9
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BotWebViewContainer.MyWebView.3.lambda$onJsAlert$1(zArr, jsResult, dialogInterface);
                    }
                }).show();
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$onJsAlert$0(boolean[] zArr, JsResult jsResult, AlertDialog alertDialog, int i) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsResult.confirm();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$onJsAlert$1(boolean[] zArr, JsResult jsResult, DialogInterface dialogInterface) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsResult.cancel();
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
                final boolean[] zArr = {false};
                new AlertDialog.Builder(this.val$context, MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider).setTitle(this.val$bot ? DialogObject.getName(this.val$botId) : LocaleController.formatString(R.string.WebsiteSays, str)).setMessage(str2).setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda5
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotWebViewContainer.MyWebView.3.lambda$onJsConfirm$2(zArr, jsResult, alertDialog, i);
                    }
                }).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda6
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotWebViewContainer.MyWebView.3.lambda$onJsConfirm$3(zArr, jsResult, alertDialog, i);
                    }
                }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda7
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BotWebViewContainer.MyWebView.3.lambda$onJsConfirm$4(zArr, jsResult, dialogInterface);
                    }
                }).show();
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$onJsConfirm$2(boolean[] zArr, JsResult jsResult, AlertDialog alertDialog, int i) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsResult.cancel();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$onJsConfirm$3(boolean[] zArr, JsResult jsResult, AlertDialog alertDialog, int i) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsResult.confirm();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$onJsConfirm$4(boolean[] zArr, JsResult jsResult, DialogInterface dialogInterface) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsResult.cancel();
            }

            @Override // android.webkit.WebChromeClient
            public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
                Theme.ResourcesProvider resourcesProvider = MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider;
                final boolean[] zArr = {false};
                AlertDialog.Builder message = new AlertDialog.Builder(this.val$context, resourcesProvider).setTitle(this.val$bot ? DialogObject.getName(this.val$botId) : LocaleController.formatString(R.string.WebsiteSays, str)).setMessage(str2);
                final EditTextCaption editTextCaption = new EditTextCaption(this.val$context, resourcesProvider);
                editTextCaption.lineYFix = true;
                editTextCaption.setTextSize(1, 18.0f);
                editTextCaption.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, resourcesProvider));
                editTextCaption.setHintColor(Theme.getColor(Theme.key_groupcreate_hintText, resourcesProvider));
                editTextCaption.setFocusable(true);
                editTextCaption.setInputType(147457);
                editTextCaption.setLineColors(Theme.getColor(Theme.key_windowBackgroundWhiteInputField, resourcesProvider), Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated, resourcesProvider), Theme.getColor(Theme.key_text_RedRegular, resourcesProvider));
                editTextCaption.setImeOptions(6);
                editTextCaption.setBackgroundDrawable(null);
                editTextCaption.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
                editTextCaption.setText(str3);
                LinearLayout linearLayout = new LinearLayout(this.val$context);
                linearLayout.setOrientation(1);
                linearLayout.addView(editTextCaption, LayoutHelper.createLinear(-1, -2, 24.0f, 0.0f, 24.0f, 10.0f));
                message.makeCustomMaxHeight();
                message.setView(linearLayout);
                message.setWidth(AndroidUtilities.dp(292.0f));
                message.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda0
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotWebViewContainer.MyWebView.3.lambda$onJsPrompt$5(zArr, jsPromptResult, alertDialog, i);
                    }
                });
                message.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda1
                    @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                    public final void onClick(AlertDialog alertDialog, int i) {
                        BotWebViewContainer.MyWebView.3.lambda$onJsPrompt$6(zArr, jsPromptResult, editTextCaption, alertDialog, i);
                    }
                });
                message.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda2
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BotWebViewContainer.MyWebView.3.lambda$onJsPrompt$7(zArr, jsPromptResult, dialogInterface);
                    }
                });
                message.overrideDismissListener(new Utilities.Callback() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda3
                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        BotWebViewContainer.MyWebView.3.lambda$onJsPrompt$8(EditTextCaption.this, (Runnable) obj);
                    }
                });
                final AlertDialog show = message.show();
                editTextCaption.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: org.telegram.ui.web.BotWebViewContainer.MyWebView.3.1
                    @Override // android.widget.TextView.OnEditorActionListener
                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        if (i != 6) {
                            return false;
                        }
                        boolean[] zArr2 = zArr;
                        if (!zArr2[0]) {
                            zArr2[0] = true;
                            jsPromptResult.confirm(editTextCaption.getText().toString());
                            show.dismiss();
                        }
                        return true;
                    }
                });
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        EditTextCaption.this.requestFocus();
                    }
                });
                return true;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$onJsPrompt$5(boolean[] zArr, JsPromptResult jsPromptResult, AlertDialog alertDialog, int i) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsPromptResult.cancel();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$onJsPrompt$6(boolean[] zArr, JsPromptResult jsPromptResult, EditTextCaption editTextCaption, AlertDialog alertDialog, int i) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsPromptResult.confirm(editTextCaption.getText().toString());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$onJsPrompt$7(boolean[] zArr, JsPromptResult jsPromptResult, DialogInterface dialogInterface) {
                if (zArr[0]) {
                    return;
                }
                zArr[0] = true;
                jsPromptResult.cancel();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static /* synthetic */ void lambda$onJsPrompt$8(EditTextCaption editTextCaption, Runnable runnable) {
                AndroidUtilities.hideKeyboard(editTextCaption);
                AndroidUtilities.runOnUIThread(runnable, 80L);
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedIcon(WebView webView, Bitmap bitmap) {
                String str;
                MyWebView myWebView = MyWebView.this;
                StringBuilder sb = new StringBuilder();
                sb.append("onReceivedIcon favicon=");
                if (bitmap == null) {
                    str = "null";
                } else {
                    str = bitmap.getWidth() + "x" + bitmap.getHeight();
                }
                sb.append(str);
                myWebView.d(sb.toString());
                if (bitmap != null && (!TextUtils.equals(MyWebView.this.getUrl(), MyWebView.this.lastFaviconUrl) || MyWebView.this.lastFavicon == null || bitmap.getWidth() > MyWebView.this.lastFavicon.getWidth())) {
                    MyWebView myWebView2 = MyWebView.this;
                    myWebView2.lastFavicon = bitmap;
                    myWebView2.lastFaviconUrl = myWebView2.getUrl();
                    MyWebView myWebView3 = MyWebView.this;
                    myWebView3.lastFaviconGot = true;
                    myWebView3.saveHistory();
                }
                Bitmap bitmap2 = (Bitmap) MyWebView.this.lastFavicons.get(MyWebView.this.getUrl());
                if (bitmap != null && (bitmap2 == null || bitmap2.getWidth() < bitmap.getWidth())) {
                    MyWebView.this.lastFavicons.put(MyWebView.this.getUrl(), bitmap);
                }
                if (MyWebView.this.botWebViewContainer != null) {
                    MyWebView.this.botWebViewContainer.onFaviconChanged(bitmap);
                }
                super.onReceivedIcon(webView, bitmap);
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTitle(WebView webView, String str) {
                MyWebView.this.d("onReceivedTitle title=" + str);
                MyWebView myWebView = MyWebView.this;
                if (!myWebView.errorShown) {
                    myWebView.lastTitleGot = true;
                    myWebView.lastTitle = str;
                }
                if (myWebView.botWebViewContainer != null) {
                    MyWebView.this.botWebViewContainer.onTitleChanged(str);
                }
                super.onReceivedTitle(webView, str);
            }

            @Override // android.webkit.WebChromeClient
            public void onReceivedTouchIconUrl(WebView webView, String str, boolean z) {
                MyWebView.this.d("onReceivedTouchIconUrl url=" + str + " precomposed=" + z);
                super.onReceivedTouchIconUrl(webView, str, z);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
                BaseFragment safeLastFragment;
                MyWebView.this.d("onCreateWindow isDialog=" + z + " isUserGesture=" + z2 + " resultMsg=" + message);
                String url = MyWebView.this.getUrl();
                if (SharedConfig.inappBrowser) {
                    if (MyWebView.this.botWebViewContainer == null || (safeLastFragment = LaunchActivity.getSafeLastFragment()) == null) {
                        return false;
                    }
                    if (safeLastFragment.getParentLayout() instanceof ActionBarLayout) {
                        safeLastFragment = ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment();
                    }
                    ArticleViewer createArticleViewer = safeLastFragment.createArticleViewer(true);
                    createArticleViewer.setOpener(MyWebView.this);
                    createArticleViewer.open((String) null);
                    MyWebView lastWebView = createArticleViewer.getLastWebView();
                    if (!TextUtils.isEmpty(url)) {
                        lastWebView.urlFallback = url;
                    }
                    MyWebView.this.d("onCreateWindow: newWebView=" + lastWebView);
                    if (lastWebView != null) {
                        ((WebView.WebViewTransport) message.obj).setWebView(lastWebView);
                        message.sendToTarget();
                        return true;
                    }
                    createArticleViewer.close(true, true);
                    return false;
                }
                WebView webView2 = new WebView(webView.getContext());
                webView2.setWebViewClient(new 2(webView2));
                ((WebView.WebViewTransport) message.obj).setWebView(webView2);
                message.sendToTarget();
                return true;
            }

            class 2 extends WebViewClient {
                final /* synthetic */ WebView val$newWebView;

                2(WebView webView) {
                    this.val$newWebView = webView;
                }

                @Override // android.webkit.WebViewClient
                public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    int rendererPriorityAtExit;
                    Integer valueOf;
                    boolean didCrash;
                    Boolean valueOf2;
                    if (Build.VERSION.SDK_INT >= 26) {
                        MyWebView myWebView = MyWebView.this;
                        StringBuilder sb = new StringBuilder();
                        sb.append("newWebView.onRenderProcessGone priority=");
                        if (renderProcessGoneDetail == null) {
                            valueOf = null;
                        } else {
                            rendererPriorityAtExit = renderProcessGoneDetail.rendererPriorityAtExit();
                            valueOf = Integer.valueOf(rendererPriorityAtExit);
                        }
                        sb.append(valueOf);
                        sb.append(" didCrash=");
                        if (renderProcessGoneDetail == null) {
                            valueOf2 = null;
                        } else {
                            didCrash = renderProcessGoneDetail.didCrash();
                            valueOf2 = Boolean.valueOf(didCrash);
                        }
                        sb.append(valueOf2);
                        myWebView.d(sb.toString());
                    } else {
                        MyWebView.this.d("newWebView.onRenderProcessGone");
                    }
                    try {
                        if (!AndroidUtilities.isSafeToShow(MyWebView.this.getContext())) {
                            return true;
                        }
                        new AlertDialog.Builder(MyWebView.this.getContext(), MyWebView.this.botWebViewContainer == null ? null : MyWebView.this.botWebViewContainer.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$2$$ExternalSyntheticLambda0
                            @Override // java.lang.Runnable
                            public final void run() {
                                BotWebViewContainer.MyWebView.3.2.this.lambda$onRenderProcessGone$0();
                            }
                        })).setPositiveButton(LocaleController.getString(R.string.OK), null).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$2$$ExternalSyntheticLambda1
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                BotWebViewContainer.MyWebView.3.2.this.lambda$onRenderProcessGone$1(dialogInterface);
                            }
                        }).show();
                        return true;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return false;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$onRenderProcessGone$0() {
                    Browser.openUrl(MyWebView.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$onRenderProcessGone$1(DialogInterface dialogInterface) {
                    if (MyWebView.this.botWebViewContainer.delegate != null) {
                        MyWebView.this.botWebViewContainer.delegate.onCloseRequested(null);
                    }
                }

                @Override // android.webkit.WebViewClient
                public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    if (MyWebView.this.botWebViewContainer == null) {
                        return true;
                    }
                    MyWebView.this.botWebViewContainer.onOpenUri(Uri.parse(str));
                    this.val$newWebView.destroy();
                    return true;
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onCloseWindow(WebView webView) {
                MyWebView.this.d("onCloseWindow " + webView);
                if (MyWebView.this.botWebViewContainer != null && MyWebView.this.botWebViewContainer.delegate != null) {
                    MyWebView.this.botWebViewContainer.delegate.onCloseRequested(null);
                } else if (MyWebView.this.onCloseListener != null) {
                    MyWebView.this.onCloseListener.run();
                    MyWebView.this.onCloseListener = null;
                }
                super.onCloseWindow(webView);
            }

            @Override // android.webkit.WebChromeClient
            public boolean onShowFileChooser(WebView webView, ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
                Activity findActivity = AndroidUtilities.findActivity(MyWebView.this.getContext());
                if (findActivity != null) {
                    if (MyWebView.this.botWebViewContainer != null) {
                        if (MyWebView.this.botWebViewContainer.mFilePathCallback != null) {
                            MyWebView.this.botWebViewContainer.mFilePathCallback.onReceiveValue(null);
                        }
                        MyWebView.this.botWebViewContainer.mFilePathCallback = valueCallback;
                        boolean z = fileChooserParams.getMode() == 1;
                        Intent createIntent = fileChooserParams.createIntent();
                        if (z) {
                            createIntent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                        }
                        findActivity.startActivityForResult(createIntent, 3000);
                        MyWebView.this.d("onShowFileChooser: true");
                        return true;
                    }
                    MyWebView.this.d("onShowFileChooser: no container, false");
                    return false;
                }
                MyWebView.this.d("onShowFileChooser: no activity, false");
                return false;
            }

            @Override // android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                if (MyWebView.this.botWebViewContainer != null && MyWebView.this.botWebViewContainer.webViewProgressListener != null) {
                    MyWebView.this.d("onProgressChanged " + i + "%");
                    MyWebView.this.botWebViewContainer.webViewProgressListener.accept(Float.valueOf(((float) i) / 100.0f));
                    return;
                }
                MyWebView.this.d("onProgressChanged " + i + "%: no container");
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
                if (MyWebView.this.botWebViewContainer == null || MyWebView.this.botWebViewContainer.parentActivity == null) {
                    MyWebView.this.d("onGeolocationPermissionsShowPrompt: no container");
                    callback.invoke(str, false, false);
                    return;
                }
                MyWebView.this.d("onGeolocationPermissionsShowPrompt " + str);
                String userName = this.val$bot ? UserObject.getUserName(MyWebView.this.botWebViewContainer.botUser) : AndroidUtilities.getHostAuthority(MyWebView.this.getUrl());
                Dialog createWebViewPermissionsRequestDialog = AlertsCreator.createWebViewPermissionsRequestDialog(MyWebView.this.botWebViewContainer.parentActivity, MyWebView.this.botWebViewContainer.resourcesProvider, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, R.raw.permission_request_location, LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestGeolocationPermission : R.string.WebViewRequestGeolocationPermission, userName), LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestGeolocationPermissionWithHint : R.string.WebViewRequestGeolocationPermissionWithHint, userName), new Consumer() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda13
                    @Override // androidx.core.util.Consumer
                    public final void accept(Object obj) {
                        BotWebViewContainer.MyWebView.3.this.lambda$onGeolocationPermissionsShowPrompt$11(callback, str, (Boolean) obj);
                    }
                });
                this.lastPermissionsDialog = createWebViewPermissionsRequestDialog;
                createWebViewPermissionsRequestDialog.show();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onGeolocationPermissionsShowPrompt$11(final GeolocationPermissions.Callback callback, final String str, Boolean bool) {
                if (this.lastPermissionsDialog != null) {
                    this.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new Consumer() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda16
                            @Override // androidx.core.util.Consumer
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.3.this.lambda$onGeolocationPermissionsShowPrompt$10(callback, str, (Boolean) obj);
                            }
                        });
                    } else {
                        callback.invoke(str, false, false);
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onGeolocationPermissionsShowPrompt$10(GeolocationPermissions.Callback callback, String str, Boolean bool) {
                callback.invoke(str, bool.booleanValue(), false);
                if (bool.booleanValue()) {
                    MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onGeolocationPermissionsHidePrompt() {
                if (this.lastPermissionsDialog != null) {
                    MyWebView.this.d("onGeolocationPermissionsHidePrompt: dialog.dismiss");
                    this.lastPermissionsDialog.dismiss();
                    this.lastPermissionsDialog = null;
                    return;
                }
                MyWebView.this.d("onGeolocationPermissionsHidePrompt: no dialog");
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequest(final PermissionRequest permissionRequest) {
                Dialog dialog = this.lastPermissionsDialog;
                if (dialog != null) {
                    dialog.dismiss();
                    this.lastPermissionsDialog = null;
                }
                if (MyWebView.this.botWebViewContainer == null) {
                    MyWebView.this.d("onPermissionRequest: no container");
                    permissionRequest.deny();
                    return;
                }
                MyWebView.this.d("onPermissionRequest " + permissionRequest);
                String userName = this.val$bot ? UserObject.getUserName(MyWebView.this.botWebViewContainer.botUser) : AndroidUtilities.getHostAuthority(MyWebView.this.getUrl());
                final String[] resources = permissionRequest.getResources();
                if (resources.length == 1) {
                    final String str = resources[0];
                    if (MyWebView.this.botWebViewContainer.parentActivity != null) {
                        if (MyWebView.this.botWebViewContainer.isVerifyingAge()) {
                            permissionRequest.grant(resources);
                            return;
                        }
                        str.hashCode();
                        if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                            Dialog createWebViewPermissionsRequestDialog = AlertsCreator.createWebViewPermissionsRequestDialog(MyWebView.this.botWebViewContainer.parentActivity, MyWebView.this.botWebViewContainer.resourcesProvider, new String[]{"android.permission.CAMERA"}, R.raw.permission_request_camera, LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraPermission : R.string.WebViewRequestCameraPermission, userName), LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraPermissionWithHint : R.string.WebViewRequestCameraPermissionWithHint, userName), new Consumer() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda11
                                @Override // androidx.core.util.Consumer
                                public final void accept(Object obj) {
                                    BotWebViewContainer.MyWebView.3.this.lambda$onPermissionRequest$15(permissionRequest, str, (Boolean) obj);
                                }
                            });
                            this.lastPermissionsDialog = createWebViewPermissionsRequestDialog;
                            createWebViewPermissionsRequestDialog.show();
                            return;
                        } else {
                            if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                                Dialog createWebViewPermissionsRequestDialog2 = AlertsCreator.createWebViewPermissionsRequestDialog(MyWebView.this.botWebViewContainer.parentActivity, MyWebView.this.botWebViewContainer.resourcesProvider, new String[]{"android.permission.RECORD_AUDIO"}, R.raw.permission_request_microphone, LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestMicrophonePermission : R.string.WebViewRequestMicrophonePermission, userName), LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestMicrophonePermissionWithHint : R.string.WebViewRequestMicrophonePermissionWithHint, userName), new Consumer() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda10
                                    @Override // androidx.core.util.Consumer
                                    public final void accept(Object obj) {
                                        BotWebViewContainer.MyWebView.3.this.lambda$onPermissionRequest$13(permissionRequest, str, (Boolean) obj);
                                    }
                                });
                                this.lastPermissionsDialog = createWebViewPermissionsRequestDialog2;
                                createWebViewPermissionsRequestDialog2.show();
                                return;
                            }
                            return;
                        }
                    }
                    permissionRequest.deny();
                    return;
                }
                if (resources.length == 2) {
                    if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[0]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[0])) {
                        if ("android.webkit.resource.AUDIO_CAPTURE".equals(resources[1]) || "android.webkit.resource.VIDEO_CAPTURE".equals(resources[1])) {
                            Dialog createWebViewPermissionsRequestDialog3 = AlertsCreator.createWebViewPermissionsRequestDialog(MyWebView.this.botWebViewContainer.parentActivity, MyWebView.this.botWebViewContainer.resourcesProvider, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, R.raw.permission_request_camera, LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraMicPermission : R.string.WebViewRequestCameraMicPermission, userName), LocaleController.formatString(this.val$bot ? R.string.BotWebViewRequestCameraMicPermissionWithHint : R.string.WebViewRequestCameraMicPermissionWithHint, userName), new Consumer() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda12
                                @Override // androidx.core.util.Consumer
                                public final void accept(Object obj) {
                                    BotWebViewContainer.MyWebView.3.this.lambda$onPermissionRequest$17(permissionRequest, resources, (Boolean) obj);
                                }
                            });
                            this.lastPermissionsDialog = createWebViewPermissionsRequestDialog3;
                            createWebViewPermissionsRequestDialog3.show();
                        }
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onPermissionRequest$13(final PermissionRequest permissionRequest, final String str, Boolean bool) {
                if (this.lastPermissionsDialog != null) {
                    this.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.RECORD_AUDIO"}, new Consumer() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda15
                            @Override // androidx.core.util.Consumer
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.3.this.lambda$onPermissionRequest$12(permissionRequest, str, (Boolean) obj);
                            }
                        });
                    } else {
                        permissionRequest.deny();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onPermissionRequest$12(PermissionRequest permissionRequest, String str, Boolean bool) {
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                } else {
                    permissionRequest.deny();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onPermissionRequest$15(final PermissionRequest permissionRequest, final String str, Boolean bool) {
                if (this.lastPermissionsDialog != null) {
                    this.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.CAMERA"}, new Consumer() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda17
                            @Override // androidx.core.util.Consumer
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.3.this.lambda$onPermissionRequest$14(permissionRequest, str, (Boolean) obj);
                            }
                        });
                    } else {
                        permissionRequest.deny();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onPermissionRequest$14(PermissionRequest permissionRequest, String str, Boolean bool) {
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{str});
                    MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                } else {
                    permissionRequest.deny();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onPermissionRequest$17(final PermissionRequest permissionRequest, final String[] strArr, Boolean bool) {
                if (this.lastPermissionsDialog != null) {
                    this.lastPermissionsDialog = null;
                    if (bool.booleanValue()) {
                        MyWebView.this.botWebViewContainer.runWithPermissions(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new Consumer() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$3$$ExternalSyntheticLambda14
                            @Override // androidx.core.util.Consumer
                            public final void accept(Object obj) {
                                BotWebViewContainer.MyWebView.3.this.lambda$onPermissionRequest$16(permissionRequest, strArr, (Boolean) obj);
                            }
                        });
                    } else {
                        permissionRequest.deny();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onPermissionRequest$16(PermissionRequest permissionRequest, String[] strArr, Boolean bool) {
                if (bool.booleanValue()) {
                    permissionRequest.grant(new String[]{strArr[0], strArr[1]});
                    MyWebView.this.botWebViewContainer.hasUserPermissions = true;
                } else {
                    permissionRequest.deny();
                }
            }

            @Override // android.webkit.WebChromeClient
            public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
                if (this.lastPermissionsDialog != null) {
                    MyWebView.this.d("onPermissionRequestCanceled: dialog.dismiss");
                    this.lastPermissionsDialog.dismiss();
                    this.lastPermissionsDialog = null;
                    return;
                }
                MyWebView.this.d("onPermissionRequestCanceled: no dialog");
            }

            @Override // android.webkit.WebChromeClient
            public Bitmap getDefaultVideoPoster() {
                return Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            }
        }

        class 5 implements DownloadListener {
            5() {
            }

            private String getFilename(String str, String str2, String str3) {
                try {
                    String str4 = Uri.parse(str).getPathSegments().get(r0.size() - 1);
                    int lastIndexOf = str4.lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        if (!TextUtils.isEmpty(str4.substring(lastIndexOf + 1))) {
                            return str4;
                        }
                    }
                } catch (Exception unused) {
                }
                return URLUtil.guessFileName(str, str2, str3);
            }

            @Override // android.webkit.DownloadListener
            public void onDownloadStart(final String str, final String str2, String str3, final String str4, long j) {
                MyWebView.this.d("onDownloadStart " + str + " " + str2 + " " + str3 + " " + str4 + " " + j);
                try {
                    if (str.startsWith("blob:")) {
                        return;
                    }
                    final String escape = AndroidUtilities.escape(getFilename(str, str3, str4));
                    final Runnable runnable = new Runnable() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$5$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            BotWebViewContainer.MyWebView.5.this.lambda$onDownloadStart$0(str, str4, str2, escape);
                        }
                    };
                    if (!DownloadController.getInstance(UserConfig.selectedAccount).canDownloadMedia(8, j)) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(MyWebView.this.getContext());
                        builder.setTitle(LocaleController.getString(R.string.WebDownloadAlertTitle));
                        builder.setMessage(AndroidUtilities.replaceTags(j > 0 ? LocaleController.formatString(R.string.WebDownloadAlertInfoWithSize, escape, AndroidUtilities.formatFileSize(j)) : LocaleController.formatString(R.string.WebDownloadAlertInfo, escape)));
                        builder.setPositiveButton(LocaleController.getString(R.string.WebDownloadAlertYes), new AlertDialog.OnButtonClickListener() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$5$$ExternalSyntheticLambda1
                            @Override // org.telegram.ui.ActionBar.AlertDialog.OnButtonClickListener
                            public final void onClick(AlertDialog alertDialog, int i) {
                                runnable.run();
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                        TextView textView = (TextView) builder.show().getButton(-2);
                        if (textView != null) {
                            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                            return;
                        }
                        return;
                    }
                    runnable.run();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onDownloadStart$0(String str, String str2, String str3, String str4) {
                try {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
                    request.setMimeType(str2);
                    request.addRequestHeader("User-Agent", str3);
                    request.setDescription(LocaleController.getString(R.string.WebDownloading));
                    request.setTitle(str4);
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str4);
                    DownloadManager downloadManager = (DownloadManager) MyWebView.this.getContext().getSystemService("download");
                    if (downloadManager != null) {
                        downloadManager.enqueue(request);
                    }
                    if (MyWebView.this.botWebViewContainer != null) {
                        BulletinFactory.of(MyWebView.this.botWebViewContainer, MyWebView.this.botWebViewContainer.resourcesProvider).createSimpleBulletin(R.raw.ic_download, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.WebDownloadingFile, str4))).show(true);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void saveHistory() {
            if (this.bot) {
                return;
            }
            WebMetadataCache.WebMetadata from = WebMetadataCache.WebMetadata.from(this);
            WebMetadataCache.getInstance().save(from);
            BrowserHistory.Entry entry = this.currentHistoryEntry;
            if (entry == null || from == null) {
                return;
            }
            entry.meta = from;
            BrowserHistory.pushHistory(entry);
        }

        public void search(String str, Runnable runnable) {
            this.searchLoading = true;
            this.searchListener = runnable;
            findAllAsync(str);
        }

        public int getSearchIndex() {
            return this.searchIndex;
        }

        public int getSearchCount() {
            return this.searchCount;
        }

        @Override // android.webkit.WebView
        public String getTitle() {
            return this.lastTitle;
        }

        public void setTitle(String str) {
            this.lastTitle = str;
        }

        public String getOpenURL() {
            return this.openedByUrl;
        }

        @Override // android.webkit.WebView
        public String getUrl() {
            if (this.dangerousUrl) {
                return this.urlFallback;
            }
            String url = super.getUrl();
            this.lastUrl = url;
            return url;
        }

        public boolean isUrlDangerous() {
            return this.dangerousUrl;
        }

        @Override // android.webkit.WebView
        public Bitmap getFavicon() {
            if (this.errorShown) {
                return null;
            }
            return this.lastFavicon;
        }

        public Bitmap getFavicon(String str) {
            return (Bitmap) this.lastFavicons.get(str);
        }

        public void setContainers(BotWebViewContainer botWebViewContainer, WebViewScrollListener webViewScrollListener) {
            d("setContainers(" + botWebViewContainer + ", " + webViewScrollListener + ")");
            boolean z = this.botWebViewContainer == null && botWebViewContainer != null;
            this.botWebViewContainer = botWebViewContainer;
            this.webViewScrollListener = webViewScrollListener;
            if (z) {
                evaluateJS("window.__tg__postBackgroundChange()");
            }
        }

        public void setCloseListener(Runnable runnable) {
            this.onCloseListener = runnable;
        }

        public void evaluateJS(String str) {
            evaluateJavascript(str, new ValueCallback() { // from class: org.telegram.ui.web.BotWebViewContainer$MyWebView$$ExternalSyntheticLambda0
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    BotWebViewContainer.MyWebView.lambda$evaluateJS$1((String) obj);
                }
            });
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onScrollChanged(int i, int i2, int i3, int i4) {
            super.onScrollChanged(i, i2, i3, i4);
            WebViewScrollListener webViewScrollListener = this.webViewScrollListener;
            if (webViewScrollListener != null) {
                webViewScrollListener.onWebViewScrolled(this, getScrollX() - this.prevScrollX, getScrollY() - this.prevScrollY);
            }
            this.prevScrollX = getScrollX();
            this.prevScrollY = getScrollY();
        }

        public float getScrollProgress() {
            float max = Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent());
            if (max <= getHeight()) {
                return 0.0f;
            }
            return Utilities.clamp01(getScrollY() / max);
        }

        public void setScrollProgress(float f) {
            setScrollY((int) (f * Math.max(1, computeVerticalScrollRange() - computeVerticalScrollExtent())));
        }

        @Override // android.view.View
        public void setScrollX(int i) {
            super.setScrollX(i);
            this.prevScrollX = i;
        }

        @Override // android.view.View
        public void setScrollY(int i) {
            super.setScrollY(i);
            this.prevScrollY = i;
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onCheckIsTextEditor() {
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer == null) {
                d("onCheckIsTextEditor: no container");
                return false;
            }
            boolean isFocusable = botWebViewContainer.isFocusable();
            d("onCheckIsTextEditor: " + isFocusable);
            return isFocusable;
        }

        @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), TLObject.FLAG_30));
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                this.botWebViewContainer.lastClickMs = System.currentTimeMillis();
                if (!this.botWebViewContainer.isVerifyingAge()) {
                    getSettings().setMediaPlaybackRequiresUserGesture(false);
                }
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            d("attached");
            AndroidUtilities.checkAndroidTheme(getContext(), true);
            super.onAttachedToWindow();
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            d("detached");
            AndroidUtilities.checkAndroidTheme(getContext(), false);
            super.onDetachedFromWindow();
        }

        @Override // android.webkit.WebView
        public void destroy() {
            d("destroy");
            super.destroy();
        }

        @Override // android.webkit.WebView
        public void loadUrl(String str) {
            BottomSheet bottomSheet = this.currentSheet;
            if (bottomSheet != null) {
                bottomSheet.dismiss();
                this.currentSheet = null;
            }
            checkCachedMetaProperties(str);
            this.openedByUrl = str;
            String str2 = BotWebViewContainer.tonsite2magic(str);
            this.currentUrl = str2;
            d("loadUrl " + str2);
            super.loadUrl(str2);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
                if (this.dangerousUrl) {
                    str2 = this.urlFallback;
                }
                botWebViewContainer.onURLChanged(str2, !canGoBack(), !canGoForward());
            }
        }

        @Override // android.webkit.WebView
        public void loadUrl(String str, Map map) {
            BottomSheet bottomSheet = this.currentSheet;
            if (bottomSheet != null) {
                bottomSheet.dismiss();
                this.currentSheet = null;
            }
            checkCachedMetaProperties(str);
            this.openedByUrl = str;
            String str2 = BotWebViewContainer.tonsite2magic(str);
            this.currentUrl = str2;
            d("loadUrl " + str2 + " " + map);
            super.loadUrl(str2, (Map<String, String>) map);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
                if (this.dangerousUrl) {
                    str2 = this.urlFallback;
                }
                botWebViewContainer.onURLChanged(str2, !canGoBack(), !canGoForward());
            }
        }

        public void loadUrl(String str, WebMetadataCache.WebMetadata webMetadata) {
            BottomSheet bottomSheet = this.currentSheet;
            if (bottomSheet != null) {
                bottomSheet.dismiss();
                this.currentSheet = null;
            }
            applyCachedMeta(webMetadata);
            this.openedByUrl = str;
            String str2 = BotWebViewContainer.tonsite2magic(str);
            this.currentUrl = str2;
            d("loadUrl " + str2 + " with cached meta");
            super.loadUrl(str2);
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null) {
                if (this.dangerousUrl) {
                    str2 = this.urlFallback;
                }
                botWebViewContainer.onURLChanged(str2, !canGoBack(), !canGoForward());
            }
        }

        public void checkCachedMetaProperties(String str) {
            if (this.bot) {
                return;
            }
            applyCachedMeta(WebMetadataCache.getInstance().get(AndroidUtilities.getHostAuthority(str, true)));
        }

        public boolean applyCachedMeta(WebMetadataCache.WebMetadata webMetadata) {
            boolean z = false;
            if (webMetadata == null) {
                return false;
            }
            BotWebViewContainer botWebViewContainer = this.botWebViewContainer;
            if (botWebViewContainer != null && botWebViewContainer.delegate != null) {
                if (webMetadata.actionBarColor != 0) {
                    this.botWebViewContainer.delegate.onWebAppBackgroundChanged(true, webMetadata.actionBarColor);
                    this.lastActionBarColorGot = true;
                }
                int i = webMetadata.backgroundColor;
                if (i != 0) {
                    this.botWebViewContainer.delegate.onWebAppBackgroundChanged(false, webMetadata.backgroundColor);
                    this.lastBackgroundColorGot = true;
                } else {
                    i = -1;
                }
                Bitmap bitmap = webMetadata.favicon;
                if (bitmap != null) {
                    BotWebViewContainer botWebViewContainer2 = this.botWebViewContainer;
                    this.lastFavicon = bitmap;
                    botWebViewContainer2.onFaviconChanged(bitmap);
                    this.lastFaviconGot = true;
                }
                if (!TextUtils.isEmpty(webMetadata.sitename)) {
                    String str = webMetadata.sitename;
                    this.lastSiteName = str;
                    BotWebViewContainer botWebViewContainer3 = this.botWebViewContainer;
                    this.lastTitle = str;
                    botWebViewContainer3.onTitleChanged(str);
                    z = true;
                }
                if (SharedConfig.adaptableColorInBrowser) {
                    setBackgroundColor(i);
                }
            }
            if (!z) {
                setTitle(null);
                BotWebViewContainer botWebViewContainer4 = this.botWebViewContainer;
                if (botWebViewContainer4 != null) {
                    botWebViewContainer4.onTitleChanged(null);
                }
            }
            return true;
        }

        @Override // android.webkit.WebView
        public void reload() {
            CookieManager.getInstance().flush();
            d("reload");
            super.reload();
        }

        @Override // android.webkit.WebView
        public void loadData(String str, String str2, String str3) {
            this.openedByUrl = null;
            d("loadData " + str + " " + str2 + " " + str3);
            super.loadData(str, str2, str3);
        }

        @Override // android.webkit.WebView
        public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
            this.openedByUrl = null;
            d("loadDataWithBaseURL " + str + " " + str2 + " " + str3 + " " + str4 + " " + str5);
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }

        @Override // android.webkit.WebView
        public void stopLoading() {
            d("stopLoading");
            super.stopLoading();
        }

        @Override // android.view.View
        public void stopNestedScroll() {
            d("stopNestedScroll");
            super.stopNestedScroll();
        }

        @Override // android.webkit.WebView
        public void postUrl(String str, byte[] bArr) {
            d("postUrl " + str + " " + bArr);
            super.postUrl(str, bArr);
        }

        @Override // android.webkit.WebView
        public void onPause() {
            d("onPause");
            super.onPause();
        }

        @Override // android.webkit.WebView
        public void onResume() {
            d("onResume");
            super.onResume();
        }

        @Override // android.webkit.WebView
        public void pauseTimers() {
            d("pauseTimers");
            super.pauseTimers();
        }

        @Override // android.webkit.WebView
        public void resumeTimers() {
            d("resumeTimers");
            super.resumeTimers();
        }

        @Override // android.webkit.WebView
        public boolean canGoBack() {
            return super.canGoBack();
        }

        @Override // android.webkit.WebView
        public void goBack() {
            d("goBack");
            super.goBack();
        }

        @Override // android.webkit.WebView
        public void goForward() {
            d("goForward");
            super.goForward();
        }

        @Override // android.webkit.WebView
        public void clearHistory() {
            d("clearHistory");
            super.clearHistory();
        }

        @Override // android.view.View
        public void setFocusable(int i) {
            d("setFocusable " + i);
            super.setFocusable(i);
        }

        @Override // android.view.View
        public void setFocusable(boolean z) {
            d("setFocusable " + z);
            super.setFocusable(z);
        }

        @Override // android.view.View
        public void setFocusableInTouchMode(boolean z) {
            d("setFocusableInTouchMode " + z);
            super.setFocusableInTouchMode(z);
        }

        @Override // android.view.View
        public void setFocusedByDefault(boolean z) {
            d("setFocusedByDefault " + z);
            super.setFocusedByDefault(z);
        }

        @Override // android.view.ViewGroup
        protected boolean drawChild(Canvas canvas, View view, long j) {
            return super.drawChild(canvas, view, j);
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
        }

        @Override // android.webkit.WebView, android.view.View
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
        }

        @Override // android.view.View
        public void draw(Canvas canvas) {
            super.draw(canvas);
        }
    }

    public void d(String str) {
        FileLog.d("[webviewcontainer] #" + this.tag + " " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String tonsite2magic(String str) {
        if (str == null || !isTonsite(Uri.parse(str))) {
            return str;
        }
        String hostAuthority = AndroidUtilities.getHostAuthority(str);
        try {
            hostAuthority = IDN.toASCII(hostAuthority, 1);
        } catch (Exception unused) {
        }
        String rotateTONHost = rotateTONHost(hostAuthority);
        if (rotatedTONHosts == null) {
            rotatedTONHosts = new HashMap();
        }
        rotatedTONHosts.put(rotateTONHost, hostAuthority);
        return Browser.replaceHostname(Uri.parse(str), rotateTONHost, "https");
    }

    public static String magic2tonsite(String str) {
        String hostAuthority;
        String str2;
        if (rotatedTONHosts == null || str == null || (hostAuthority = AndroidUtilities.getHostAuthority(str)) == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        sb.append(MessagesController.getInstance(UserConfig.selectedAccount).tonProxyAddress);
        return (hostAuthority.endsWith(sb.toString()) && (str2 = (String) rotatedTONHosts.get(hostAuthority)) != null) ? Browser.replace(Uri.parse(str), "tonsite", null, str2, null) : str;
    }

    private static JSONObject obj(String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject obj(String str, Object obj, String str2, Object obj2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject obj(String str, Object obj, String str2, Object obj2, String str3, Object obj3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            jSONObject.put(str3, obj3);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    private static JSONObject obj(String str, Object obj, String str2, Object obj2, String str3, Object obj3, String str4, Object obj4) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str, obj);
            jSONObject.put(str2, obj2);
            jSONObject.put(str3, obj3);
            jSONObject.put(str4, obj4);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isVerifyingAge() {
        return this.onVerifiedAge != null;
    }

    public void setOnVerifiedAge(Utilities.Callback4<Boolean, Double, String, Double> callback4) {
        this.onVerifiedAge = callback4;
    }
}
