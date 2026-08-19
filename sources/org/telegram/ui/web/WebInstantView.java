package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.Timer;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.BotWebViewContainer;
import org.telegram.ui.web.MHTML;
import org.telegram.ui.web.WebInstantView;

/* loaded from: classes3.dex */
public class WebInstantView {
    public static final HashMap instants = new HashMap();
    private static HashMap loadingPhotos;
    public final HashMap loadedPhotos = new HashMap();
    public MHTML mhtml;
    public String url;
    public TLRPC.WebPage webpage;

    public static /* synthetic */ void $r8$lambda$Us0B0feOaqe1AirXDilnz7RNinI(String str) {
    }

    public static Runnable generate(WebView webView, boolean z, final Utilities.Callback callback) {
        if (callback == null) {
            return null;
        }
        if (webView == null) {
            callback.run(null);
            return null;
        }
        final boolean[] zArr = {false};
        final WebInstantView webInstantView = new WebInstantView();
        webInstantView.url = webView.getUrl();
        final Timer create = Timer.create("WebInstantView");
        final Timer.Task start = Timer.start(create, "getHTML");
        webInstantView.getHTML(webView, z, new Utilities.Callback() { // from class: org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda0
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                WebInstantView.$r8$lambda$YlCjfT0mhFdTUR2hES1ATvDObGA(Timer.Task.this, zArr, create, webInstantView, callback, (InputStream) obj);
            }
        });
        return new Runnable() { // from class: org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                WebInstantView.$r8$lambda$5OKLd3KNjqeekGH8Do5VRgOXNAo(zArr);
            }
        };
    }

    public static /* synthetic */ void $r8$lambda$YlCjfT0mhFdTUR2hES1ATvDObGA(Timer.Task task, final boolean[] zArr, final Timer timer, final WebInstantView webInstantView, final Utilities.Callback callback, InputStream inputStream) {
        Timer.done(task);
        if (zArr[0]) {
            return;
        }
        final Timer.Task start = Timer.start(timer, "readHTML");
        webInstantView.readHTML(webInstantView.url, inputStream, new Utilities.Callback() { // from class: org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda4
            @Override // org.telegram.messenger.Utilities.Callback
            public final void run(Object obj) {
                WebInstantView.$r8$lambda$Yh_rHIiOF3DpDgaZCNIA7rZXO0Q(Timer.Task.this, zArr, timer, webInstantView, callback, (JSONObject) obj);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$Yh_rHIiOF3DpDgaZCNIA7rZXO0Q(Timer.Task task, boolean[] zArr, Timer timer, WebInstantView webInstantView, Utilities.Callback callback, JSONObject jSONObject) {
        Timer.done(task);
        if (zArr[0]) {
            return;
        }
        Timer.Task start = Timer.start(timer, "parseJSON");
        try {
            webInstantView.webpage = webInstantView.parseJSON(webInstantView.url, jSONObject);
        } catch (Exception e) {
            Timer.log(timer, "error: " + e);
            FileLog.e(e);
        }
        Timer.done(start);
        callback.run(webInstantView);
        TLRPC.WebPage webPage = webInstantView.webpage;
        if (webPage != null) {
            instants.put(webPage, webInstantView);
        }
        Timer.finish(timer);
    }

    public static /* synthetic */ void $r8$lambda$5OKLd3KNjqeekGH8Do5VRgOXNAo(boolean[] zArr) {
        zArr[0] = true;
    }

    public void recycle() {
        TL_iv.Page page;
        ArrayList<TLRPC.Photo> arrayList;
        instants.remove(this.webpage);
        Iterator it = this.loadedPhotos.entrySet().iterator();
        while (it.hasNext()) {
            AndroidUtilities.recycleBitmap((Bitmap) ((Map.Entry) it.next()).getValue());
        }
        this.loadedPhotos.clear();
        TLRPC.WebPage webPage = this.webpage;
        if (webPage == null || (page = webPage.cached_page) == null || (arrayList = page.photos) == null) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.Photo photo = arrayList.get(i);
            i++;
            TLRPC.Photo photo2 = photo;
            if (photo2 instanceof WebPhoto) {
                WebPhoto webPhoto = (WebPhoto) photo2;
                HashMap hashMap = loadingPhotos;
                if (hashMap != null) {
                    hashMap.remove(webPhoto.url);
                }
            }
        }
    }

    public class WebPhoto extends TLRPC.Photo {
        public int h;
        public TL_iv.textImage inlineImage;
        public WebInstantView instantView;
        public String url;
        public HashSet urls = new HashSet();
        public int w;

        public WebPhoto() {
        }
    }

    public static void loadPhoto(WebPhoto webPhoto, ImageReceiver imageReceiver, Runnable runnable) {
        WebInstantView webInstantView;
        if (webPhoto == null || (webInstantView = webPhoto.instantView) == null) {
            return;
        }
        webInstantView.loadPhotoInternal(webPhoto, imageReceiver, runnable);
    }

    private void loadPhotoInternal(final WebPhoto webPhoto, ImageReceiver imageReceiver, Runnable runnable) {
        MHTML.Entry entry;
        Bitmap decodeStream;
        try {
            if (this.mhtml != null) {
                Iterator it = webPhoto.urls.iterator();
                entry = null;
                while (it.hasNext()) {
                    entry = (MHTML.Entry) this.mhtml.entriesByLocation.get((String) it.next());
                    if (entry != null) {
                        break;
                    }
                }
            } else {
                entry = null;
            }
            if (entry != null) {
                if (entry.getType().contains("svg")) {
                    if (webPhoto.w > 0 && webPhoto.h > 0) {
                        decodeStream = SvgHelper.getBitmap(entry.getInputStream(), AndroidUtilities.dp(webPhoto.w), AndroidUtilities.dp(webPhoto.h), false);
                    }
                    return;
                }
                if (webPhoto.w <= 0 || webPhoto.h <= 0) {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(entry.getInputStream(), null, options);
                    int i = webPhoto.w;
                    if (i == 0 && webPhoto.h == 0) {
                        webPhoto.w = options.outWidth;
                        webPhoto.h = options.outHeight;
                    } else if (i == 0) {
                        webPhoto.w = (int) ((options.outWidth / options.outHeight) * webPhoto.h);
                    } else if (webPhoto.h == 0) {
                        webPhoto.h = (int) ((options.outHeight / options.outWidth) * i);
                    }
                    TL_iv.textImage textimage = webPhoto.inlineImage;
                    if (textimage != null) {
                        textimage.w = webPhoto.w;
                        textimage.h = webPhoto.h;
                    }
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                decodeStream = BitmapFactory.decodeStream(entry.getInputStream());
                imageReceiver.setImageBitmap(decodeStream);
                return;
            }
            if (this.loadedPhotos.containsKey(webPhoto.url)) {
                imageReceiver.setImageBitmap((Bitmap) this.loadedPhotos.get(webPhoto.url));
                return;
            }
            if (loadingPhotos == null) {
                loadingPhotos = new HashMap();
            }
            ArrayList arrayList = (ArrayList) loadingPhotos.get(webPhoto.url);
            if (arrayList != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    if (((Pair) arrayList.get(i2)).first == imageReceiver) {
                        return;
                    }
                }
                arrayList.add(new Pair(imageReceiver, runnable));
                return;
            }
            loadingPhotos.put(webPhoto.url, new ArrayList());
            new HttpGetBitmapTask(new Utilities.Callback() { // from class: org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda5
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    WebInstantView.$r8$lambda$hFjnVezg1x57UM9BcT-jIWS8dlo(WebInstantView.this, webPhoto, (Bitmap) obj);
                }
            }).execute(webPhoto.url);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static /* synthetic */ void $r8$lambda$hFjnVezg1x57UM9BcT-jIWS8dlo(final WebInstantView webInstantView, final WebPhoto webPhoto, final Bitmap bitmap) {
        webInstantView.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                WebInstantView.$r8$lambda$qkSjPlFAa_0-jByXyiA-FVISRM8(WebInstantView.this, webPhoto, bitmap);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$qkSjPlFAa_0-jByXyiA-FVISRM8(WebInstantView webInstantView, WebPhoto webPhoto, Bitmap bitmap) {
        Object obj;
        webInstantView.getClass();
        if (loadingPhotos == null) {
            return;
        }
        int i = 0;
        boolean z = (webPhoto.w <= 0 || webPhoto.h <= 0) && bitmap != null;
        if (bitmap != null) {
            webInstantView.loadedPhotos.put(webPhoto.url, bitmap);
            if (z) {
                int i2 = webPhoto.w;
                if (i2 == 0 && webPhoto.h == 0) {
                    webPhoto.w = bitmap.getWidth();
                    webPhoto.h = bitmap.getHeight();
                } else if (i2 == 0) {
                    webPhoto.w = (int) ((bitmap.getWidth() / bitmap.getHeight()) * webPhoto.h);
                } else if (webPhoto.h == 0) {
                    webPhoto.h = (int) ((bitmap.getHeight() / bitmap.getWidth()) * webPhoto.w);
                }
                TL_iv.textImage textimage = webPhoto.inlineImage;
                if (textimage != null) {
                    textimage.w = webPhoto.w;
                    textimage.h = webPhoto.h;
                }
            }
        }
        ArrayList arrayList = (ArrayList) loadingPhotos.remove(webPhoto.url);
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj2;
            ((ImageReceiver) pair.first).setImageBitmap(bitmap);
            if (z && (obj = pair.second) != null) {
                ((Runnable) obj).run();
            }
        }
    }

    public static void cancelLoadPhoto(ImageReceiver imageReceiver) {
        HashMap hashMap = loadingPhotos;
        if (hashMap == null) {
            return;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            ArrayList arrayList = (ArrayList) entry.getValue();
            int i = 0;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((Pair) arrayList.get(i)).first == imageReceiver) {
                    arrayList.remove(i);
                    break;
                }
                i++;
            }
            if (arrayList.isEmpty()) {
                loadingPhotos.remove(str);
                return;
            }
        }
    }

    public static void recycle(TLRPC.WebPage webPage) {
        WebInstantView webInstantView = (WebInstantView) instants.remove(webPage);
        if (webInstantView != null) {
            webInstantView.recycle();
        }
    }

    public void getHTML(final WebView webView, boolean z, final Utilities.Callback callback) {
        if (callback == null) {
            return;
        }
        if (webView == null) {
            callback.run(null);
        } else {
            if (z) {
                webView.evaluateJavascript("document.documentElement.outerHTML", new ValueCallback() { // from class: org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda2
                    @Override // android.webkit.ValueCallback
                    public final void onReceiveValue(Object obj) {
                        WebInstantView.$r8$lambda$5eCdyRlTVedsQRAWARfZXK7zwEo(Utilities.Callback.this, (String) obj);
                    }
                });
                return;
            }
            System.currentTimeMillis();
            final File file = new File(AndroidUtilities.getCacheDir(), "archive.mht");
            webView.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "true"), new ValueCallback() { // from class: org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda3
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    WebInstantView.$r8$lambda$rxqU5ebZZyE1bg0cAK4TZetOirc(WebInstantView.this, webView, file, callback, (String) obj);
                }
            });
        }
    }

    public static /* synthetic */ void $r8$lambda$5eCdyRlTVedsQRAWARfZXK7zwEo(Utilities.Callback callback, String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            jsonReader.setLenient(true);
            String nextString = jsonReader.nextString();
            jsonReader.close();
            callback.run(new ByteArrayInputStream(nextString.getBytes(StandardCharsets.UTF_8)));
        } catch (Exception e) {
            FileLog.e(e);
            callback.run(null);
        }
    }

    public static /* synthetic */ void $r8$lambda$rxqU5ebZZyE1bg0cAK4TZetOirc(final WebInstantView webInstantView, final WebView webView, final File file, final Utilities.Callback callback, String str) {
        webInstantView.getClass();
        webView.saveWebArchive(file.getAbsolutePath(), false, new ValueCallback() { // from class: org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda6
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                WebInstantView.$r8$lambda$rCpmgwitTm1Voxiaw8LbPxhdPQA(WebInstantView.this, webView, file, callback, (String) obj);
            }
        });
    }

    public static /* synthetic */ void $r8$lambda$rCpmgwitTm1Voxiaw8LbPxhdPQA(WebInstantView webInstantView, WebView webView, File file, Utilities.Callback callback, String str) {
        webInstantView.getClass();
        webView.evaluateJavascript(AndroidUtilities.readRes(R.raw.open_collapsed).replace("$OPEN$", "false"), new ValueCallback() { // from class: org.telegram.ui.web.WebInstantView$$ExternalSyntheticLambda8
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                WebInstantView.$r8$lambda$Us0B0feOaqe1AirXDilnz7RNinI((String) obj);
            }
        });
        try {
            MHTML mhtml = new MHTML(file);
            webInstantView.mhtml = mhtml;
            if (!mhtml.entries.isEmpty()) {
                callback.run(((MHTML.Entry) webInstantView.mhtml.entries.get(0)).getInputStream());
                return;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        callback.run(null);
    }

    public void readHTML(String str, final InputStream inputStream, Utilities.Callback callback) {
        if (callback == null) {
            return;
        }
        if (inputStream == null) {
            callback.run(null);
            return;
        }
        Context context = LaunchActivity.instance;
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity == null) {
            callback.run(null);
            return;
        }
        View rootView = findActivity.findViewById(android.R.id.content).getRootView();
        if (!(rootView instanceof ViewGroup)) {
            callback.run(null);
            return;
        }
        FrameLayout frameLayout = new FrameLayout(context) { // from class: org.telegram.ui.web.WebInstantView.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.ViewGroup
            protected boolean drawChild(Canvas canvas, View view, long j) {
                return false;
            }

            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.widget.FrameLayout, android.view.View
            protected void onMeasure(int i, int i2) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(500.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(500.0f), TLObject.FLAG_30));
            }
        };
        ((ViewGroup) rootView).addView(frameLayout);
        WebView webView = new WebView(context);
        WebSettings settings = webView.getSettings();
        settings.setAllowContentAccess(false);
        settings.setDatabaseEnabled(false);
        settings.setAllowFileAccess(false);
        settings.setJavaScriptEnabled(true);
        settings.setSaveFormData(false);
        settings.setGeolocationEnabled(false);
        settings.setDomStorageEnabled(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        webView.setWebViewClient(new WebViewClient() { // from class: org.telegram.ui.web.WebInstantView.2
            private boolean firstLoad = true;
            private boolean streamLoaded;

            @Override // android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView2, String str2) {
                InputStream inputStream2;
                String str3;
                if (this.firstLoad) {
                    this.firstLoad = false;
                    return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(("<script>\n" + AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION) + "\n</script>").getBytes(StandardCharsets.UTF_8)));
                }
                if (str2 != null && str2.endsWith("/index.html")) {
                    str3 = "application/octet-stream";
                    if (this.streamLoaded) {
                        MHTML mhtml = WebInstantView.this.mhtml;
                        MHTML.Entry entry = mhtml != null ? (MHTML.Entry) mhtml.entries.get(0) : null;
                        if (entry == null) {
                            return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                        }
                        try {
                            inputStream2 = entry.getInputStream();
                        } catch (IOException e) {
                            FileLog.e(e);
                            return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                        }
                    } else {
                        inputStream2 = inputStream;
                        this.streamLoaded = true;
                    }
                } else {
                    MHTML mhtml2 = WebInstantView.this.mhtml;
                    MHTML.Entry entry2 = mhtml2 != null ? (MHTML.Entry) mhtml2.entriesByLocation.get(str2) : null;
                    if (entry2 == null) {
                        return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                    }
                    String type = entry2.getType();
                    if (!"text/html".equalsIgnoreCase(type) && !"text/css".equalsIgnoreCase(type)) {
                        return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                    }
                    try {
                        inputStream2 = entry2.getInputStream();
                        str3 = type;
                    } catch (IOException e2) {
                        FileLog.e(e2);
                        return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                    }
                }
                return new WebResourceResponse(str3, null, inputStream2);
            }
        });
        webView.setWebChromeClient(new WebChromeClient() { // from class: org.telegram.ui.web.WebInstantView.3
        });
        frameLayout.addView(webView, LayoutHelper.createFrame(-1, -1.0f));
        webView.addJavascriptInterface(new 4(new boolean[]{false}, webView, frameLayout, callback), "Instant");
        webView.loadUrl(str);
    }

    class 4 {
        final /* synthetic */ boolean[] val$done;
        final /* synthetic */ WebView val$webView;
        final /* synthetic */ FrameLayout val$webViewContainer;
        final /* synthetic */ Utilities.Callback val$whenDone;

        4(boolean[] zArr, WebView webView, FrameLayout frameLayout, Utilities.Callback callback) {
            this.val$done = zArr;
            this.val$webView = webView;
            this.val$webViewContainer = frameLayout;
            this.val$whenDone = callback;
        }

        @JavascriptInterface
        public void done(final String str) {
            final boolean[] zArr = this.val$done;
            final WebView webView = this.val$webView;
            final FrameLayout frameLayout = this.val$webViewContainer;
            final Utilities.Callback callback = this.val$whenDone;
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.WebInstantView$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    WebInstantView.4.$r8$lambda$K36wTf6YNhOLbQXYDc9HGQ7ErYU(zArr, webView, frameLayout, str, callback);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$K36wTf6YNhOLbQXYDc9HGQ7ErYU(boolean[] zArr, WebView webView, FrameLayout frameLayout, String str, Utilities.Callback callback) {
            JSONObject jSONObject;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                webView.onPause();
                webView.destroy();
                AndroidUtilities.removeFromParent(webView);
                AndroidUtilities.removeFromParent(frameLayout);
            }
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception e) {
                FileLog.e(e);
                jSONObject = null;
            }
            callback.run(jSONObject);
        }
    }

    public TLRPC.TL_webPage parseJSON(String str, JSONObject jSONObject) {
        TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
        tL_webPage.id = 0L;
        tL_webPage.url = str;
        tL_webPage.display_url = str;
        String string = jSONObject.getString("siteName");
        if (string != null && !"null".equals(string)) {
            tL_webPage.flags |= 2;
            tL_webPage.site_name = string;
        }
        String optString = jSONObject.optString("title");
        if (optString != null && !"null".equals(optString)) {
            tL_webPage.flags |= 4;
            tL_webPage.title = optString;
        }
        String optString2 = jSONObject.optString("byline");
        if (optString2 != null && !"null".equals(optString2) && !"by".equalsIgnoreCase(optString2)) {
            tL_webPage.flags |= 256;
            tL_webPage.author = optString2;
        }
        String optString3 = jSONObject.optString("excerpt");
        if (optString3 != null && !"null".equals(optString3)) {
            tL_webPage.flags |= 8;
            tL_webPage.description = optString3;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("content");
        if (optJSONArray != null && !"null".equals(optJSONArray)) {
            tL_webPage.flags |= 1024;
            tL_webPage.cached_page = parsePage(str, jSONObject);
        }
        return tL_webPage;
    }

    public TL_iv.TL_page parsePage(String str, JSONObject jSONObject) {
        String optString = jSONObject.optString("title");
        if ("null".equals(optString)) {
            optString = null;
        }
        "null".equals(jSONObject.optString("publishedTime"));
        JSONArray optJSONArray = jSONObject.optJSONArray("content");
        TL_iv.TL_page tL_page = new TL_iv.TL_page();
        tL_page.web = true;
        tL_page.url = str;
        tL_page.blocks.addAll(parsePageBlocks(str, optJSONArray, tL_page));
        if (!tL_page.blocks.isEmpty() && (tL_page.blocks.get(0) instanceof TL_iv.pageBlockHeader)) {
            return tL_page;
        }
        TL_iv.pageBlockTitle pageblocktitle = new TL_iv.pageBlockTitle();
        pageblocktitle.text = trim(parseRichText(optString));
        tL_page.blocks.add(0, pageblocktitle);
        return tL_page;
    }

    public ArrayList parsePageBlocks(String str, JSONArray jSONArray, TL_iv.TL_page tL_page) {
        JSONObject jSONObject;
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                TL_iv.pageBlockParagraph pageblockparagraph = new TL_iv.pageBlockParagraph();
                pageblockparagraph.text = parseRichText((String) obj);
                arrayList.add(pageblockparagraph);
            } else if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString("tag");
                optJSONArray = jSONObject.optJSONArray("content");
                optString.getClass();
                switch (optString) {
                    case "figure":
                    case "picture":
                        TL_iv.pageBlockPhoto parseFigure = parseFigure(jSONObject, tL_page);
                        if (parseFigure != null) {
                            arrayList.add(parseFigure);
                            break;
                        } else {
                            break;
                        }
                    case "strong":
                    case "a":
                    case "b":
                    case "i":
                    case "s":
                    case "sub":
                    case "sup":
                    case "code":
                    case "mark":
                    case "span":
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(jSONObject);
                        TL_iv.pageBlockParagraph pageblockparagraph2 = new TL_iv.pageBlockParagraph();
                        pageblockparagraph2.text = parseRichText(jSONArray2, tL_page);
                        arrayList.add(pageblockparagraph2);
                        break;
                    case "p":
                        TL_iv.pageBlockParagraph pageblockparagraph3 = new TL_iv.pageBlockParagraph();
                        pageblockparagraph3.text = trim(parseRichText(jSONObject, tL_page));
                        arrayList.add(pageblockparagraph3);
                        break;
                    case "h1":
                        TL_iv.pageBlockHeading1 pageblockheading1 = new TL_iv.pageBlockHeading1();
                        pageblockheading1.text = trim(parseRichText(jSONObject, tL_page));
                        arrayList.add(pageblockheading1);
                        break;
                    case "h2":
                        TL_iv.pageBlockHeading2 pageblockheading2 = new TL_iv.pageBlockHeading2();
                        pageblockheading2.text = trim(parseRichText(jSONObject, tL_page));
                        arrayList.add(pageblockheading2);
                        break;
                    case "h3":
                        TL_iv.pageBlockHeading3 pageblockheading3 = new TL_iv.pageBlockHeading3();
                        pageblockheading3.text = trim(parseRichText(jSONObject, tL_page));
                        arrayList.add(pageblockheading3);
                        break;
                    case "h4":
                        TL_iv.pageBlockHeading4 pageblockheading4 = new TL_iv.pageBlockHeading4();
                        pageblockheading4.text = trim(parseRichText(jSONObject, tL_page));
                        arrayList.add(pageblockheading4);
                        break;
                    case "h5":
                        TL_iv.pageBlockHeading5 pageblockheading5 = new TL_iv.pageBlockHeading5();
                        pageblockheading5.text = trim(parseRichText(jSONObject, tL_page));
                        arrayList.add(pageblockheading5);
                        break;
                    case "h6":
                        TL_iv.pageBlockHeading6 pageblockheading6 = new TL_iv.pageBlockHeading6();
                        pageblockheading6.text = trim(parseRichText(jSONObject, tL_page));
                        arrayList.add(pageblockheading6);
                        break;
                    case "hr":
                        arrayList.add(new TL_iv.pageBlockDivider());
                        break;
                    case "ol":
                    case "ul":
                        arrayList.add(parseList(str, jSONObject, tL_page));
                        break;
                    case "img":
                        TL_iv.pageBlockPhoto parseImage = parseImage(jSONObject, tL_page);
                        if (parseImage != null) {
                            arrayList.add(parseImage);
                            break;
                        } else {
                            break;
                        }
                    case "pre":
                        TL_iv.pageBlockPreformatted pageblockpreformatted = new TL_iv.pageBlockPreformatted();
                        TL_iv.textFixed textfixed = new TL_iv.textFixed();
                        textfixed.text = trim(parseRichText(jSONObject, tL_page));
                        pageblockpreformatted.text = textfixed;
                        pageblockpreformatted.language = "";
                        arrayList.add(pageblockpreformatted);
                        break;
                    case "table":
                        arrayList.add(parseTable(str, jSONObject, tL_page));
                        break;
                    case "blockquote":
                        TL_iv.pageBlockBlockquote pageblockblockquote = new TL_iv.pageBlockBlockquote();
                        pageblockblockquote.text = trim(parseRichText(jSONObject, tL_page));
                        TL_iv.textItalic textitalic = new TL_iv.textItalic();
                        textitalic.text = pageblockblockquote.text;
                        pageblockblockquote.text = textitalic;
                        arrayList.add(pageblockblockquote);
                        break;
                    case "details":
                        TL_iv.pageBlockDetails parseDetails = parseDetails(str, jSONObject, tL_page);
                        if (parseDetails != null) {
                            arrayList.add(parseDetails);
                            break;
                        } else {
                            break;
                        }
                    default:
                        if (optJSONArray != null) {
                            arrayList.addAll(parsePageBlocks(str, optJSONArray, tL_page));
                            break;
                        } else {
                            break;
                        }
                }
            }
        }
        return arrayList;
    }

    public static TL_iv.RichText applyAnchor(TL_iv.RichText richText, JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("id");
            if (!TextUtils.isEmpty(optString)) {
                TL_iv.textAnchor textanchor = new TL_iv.textAnchor();
                textanchor.text = richText;
                textanchor.name = optString;
                return textanchor;
            }
        }
        return richText;
    }

    public TL_iv.pageBlockPhoto parseFigure(JSONObject jSONObject, TL_iv.TL_page tL_page) {
        JSONArray optJSONArray = jSONObject.optJSONArray("content");
        ArrayList arrayList = new ArrayList();
        WebPhoto webPhoto = null;
        int i = 0;
        TL_iv.pageBlockPhoto pageblockphoto = null;
        TL_iv.RichText richText = null;
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            Object obj = optJSONArray.get(i2);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                String optString = jSONObject2.optString("tag");
                if ("figurecaption".equalsIgnoreCase(optString) || "caption".equalsIgnoreCase(optString)) {
                    richText = trim(parseRichText(jSONObject2, tL_page));
                } else if ("img".equalsIgnoreCase(optString)) {
                    pageblockphoto = parseImage(jSONObject2, tL_page);
                } else if ("source".equalsIgnoreCase(optString)) {
                    String optString2 = jSONObject2.optString("src");
                    if (!TextUtils.isEmpty(optString2)) {
                        arrayList.add(optString2);
                    } else {
                        String optString3 = jSONObject2.optString("srcset");
                        if (!TextUtils.isEmpty(optString3)) {
                            for (String str : optString3.split(",")) {
                                arrayList.add(str.trim().split(" ")[0].trim());
                            }
                        }
                    }
                }
            }
        }
        if (pageblockphoto == null) {
            return null;
        }
        if (richText != null) {
            TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
            pageblockphoto.caption = pageCaption;
            pageCaption.text = richText;
            pageCaption.credit = new TL_iv.textEmpty();
        }
        while (true) {
            if (i >= tL_page.photos.size()) {
                break;
            }
            if ((tL_page.photos.get(i) instanceof WebPhoto) && tL_page.photos.get(i).id == pageblockphoto.photo_id) {
                webPhoto = (WebPhoto) tL_page.photos.get(i);
                break;
            }
            i++;
        }
        if (webPhoto != null) {
            webPhoto.urls.addAll(arrayList);
        }
        return pageblockphoto;
    }

    public TL_iv.pageBlockPhoto parseImage(JSONObject jSONObject, TL_iv.TL_page tL_page) {
        TL_iv.pageBlockPhoto pageblockphoto = new TL_iv.pageBlockPhoto();
        pageblockphoto.caption = new TL_iv.PageCaption();
        String optString = jSONObject.optString("alt");
        if (optString != null) {
            pageblockphoto.caption.text = trim(parseRichText(optString));
            pageblockphoto.caption.credit = trim(parseRichText(""));
        }
        String optString2 = jSONObject.optString("src");
        if (optString2 == null) {
            return null;
        }
        WebPhoto webPhoto = new WebPhoto();
        webPhoto.instantView = this;
        webPhoto.id = (-1) - tL_page.photos.size();
        webPhoto.url = optString2;
        webPhoto.urls.add(optString2);
        try {
            webPhoto.w = Integer.parseInt(jSONObject.optString("width"));
        } catch (Exception unused) {
        }
        try {
            webPhoto.h = Integer.parseInt(jSONObject.optString("height"));
        } catch (Exception unused2) {
        }
        if (webPhoto.w == 0) {
            webPhoto.w = webPhoto.h;
        }
        if (webPhoto.h == 0) {
            webPhoto.h = webPhoto.w;
        }
        pageblockphoto.photo_id = webPhoto.id;
        pageblockphoto.url = optString2;
        tL_page.photos.add(webPhoto);
        return pageblockphoto;
    }

    public TL_iv.textImage parseInlineImage(JSONObject jSONObject, TL_iv.TL_page tL_page) {
        TL_iv.textImage textimage = new TL_iv.textImage();
        String optString = jSONObject.optString("src");
        if (optString == null) {
            return null;
        }
        WebPhoto webPhoto = new WebPhoto();
        webPhoto.instantView = this;
        webPhoto.id = (-1) - tL_page.photos.size();
        webPhoto.url = optString;
        webPhoto.urls.add(optString);
        try {
            webPhoto.w = Integer.parseInt(jSONObject.optString("width"));
        } catch (Exception unused) {
        }
        try {
            webPhoto.h = Integer.parseInt(jSONObject.optString("height"));
        } catch (Exception unused2) {
        }
        textimage.url = optString;
        tL_page.photos.add(webPhoto);
        if (webPhoto.w == 0) {
            webPhoto.w = webPhoto.h;
        }
        if (webPhoto.h == 0) {
            webPhoto.h = webPhoto.w;
        }
        try {
            textimage.w = Integer.parseInt(jSONObject.optString("width"));
        } catch (Exception unused3) {
        }
        try {
            textimage.h = Integer.parseInt(jSONObject.optString("height"));
        } catch (Exception unused4) {
        }
        if (textimage.w == 0) {
            textimage.w = textimage.h;
        }
        if (textimage.h == 0) {
            textimage.h = textimage.w;
        }
        textimage.photo_id = webPhoto.id;
        return textimage;
    }

    public TL_iv.pageBlockDetails parseDetails(String str, JSONObject jSONObject, TL_iv.TL_page tL_page) {
        TL_iv.pageBlockDetails pageblockdetails = new TL_iv.pageBlockDetails();
        JSONArray optJSONArray = jSONObject.optJSONArray("content");
        if (optJSONArray == null) {
            return null;
        }
        int i = 0;
        while (true) {
            if (i >= optJSONArray.length()) {
                break;
            }
            Object obj = optJSONArray.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject2 = (JSONObject) obj;
                if ("summary".equals(jSONObject2.optString("tag"))) {
                    pageblockdetails.title = trim(parseRichText(jSONObject2, tL_page));
                    optJSONArray.remove(i);
                    break;
                }
            }
            i++;
        }
        pageblockdetails.blocks.addAll(parsePageBlocks(str, optJSONArray, tL_page));
        pageblockdetails.open = jSONObject.has("open");
        return pageblockdetails;
    }

    public TL_iv.RichText parseRichText(JSONObject jSONObject, TL_iv.TL_page tL_page) {
        TL_iv.RichText applyAnchor = applyAnchor(parseRichText(jSONObject.getJSONArray("content"), tL_page), jSONObject);
        if (jSONObject.has("bold")) {
            TL_iv.textBold textbold = new TL_iv.textBold();
            textbold.text = applyAnchor;
            applyAnchor = textbold;
        }
        if (!jSONObject.has("italic")) {
            return applyAnchor;
        }
        TL_iv.textItalic textitalic = new TL_iv.textItalic();
        textitalic.text = applyAnchor;
        return textitalic;
    }

    public TL_iv.RichText parseRichText(JSONArray jSONArray, TL_iv.TL_page tL_page) {
        JSONObject jSONObject;
        TL_iv.RichText textbold;
        TL_iv.RichText richText;
        ArrayList<TL_iv.RichText> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof String) {
                arrayList.add(parseRichText((String) obj));
            } else {
                jSONObject = (JSONObject) obj;
                String optString = jSONObject.optString("tag");
                optString.getClass();
                switch (optString) {
                    case "strong":
                    case "b":
                        textbold = new TL_iv.textBold();
                        textbold.text = parseRichText(jSONObject, tL_page);
                        break;
                    case "a":
                        String optString2 = jSONObject.optString("href");
                        if (optString2 == null) {
                            textbold = parseRichText(jSONObject, tL_page);
                            break;
                        } else {
                            if (optString2.startsWith("tel:")) {
                                TL_iv.textPhone textphone = new TL_iv.textPhone();
                                textphone.phone = optString2.substring(4);
                                textphone.text = parseRichText(jSONObject, tL_page);
                                richText = textphone;
                            } else if (optString2.startsWith("mailto:")) {
                                TL_iv.textEmail textemail = new TL_iv.textEmail();
                                textemail.email = optString2.substring(7);
                                textemail.text = parseRichText(jSONObject, tL_page);
                                richText = textemail;
                            } else {
                                TL_iv.textUrl texturl = new TL_iv.textUrl();
                                texturl.url = optString2;
                                texturl.text = parseRichText(jSONObject, tL_page);
                                richText = texturl;
                            }
                            textbold = richText;
                            break;
                        }
                    case "i":
                        textbold = new TL_iv.textItalic();
                        textbold.text = parseRichText(jSONObject, tL_page);
                        break;
                    case "p":
                        if (!arrayList.isEmpty()) {
                            addNewLine(arrayList.get(arrayList.size() - 1));
                        }
                        textbold = parseRichText(jSONObject, tL_page);
                        break;
                    case "s":
                        textbold = new TL_iv.textStrike();
                        textbold.text = parseRichText(jSONObject, tL_page);
                        break;
                    case "br":
                        if (!arrayList.isEmpty()) {
                            addNewLine(arrayList.get(arrayList.size() - 1));
                        }
                        textbold = null;
                        break;
                    case "img":
                        if (!arrayList.isEmpty()) {
                            addLastSpace(arrayList.get(arrayList.size() - 1));
                        }
                        textbold = parseInlineImage(jSONObject, tL_page);
                        break;
                    case "pre":
                    case "code":
                        textbold = new TL_iv.textFixed();
                        textbold.text = parseRichText(jSONObject, tL_page);
                        break;
                    case "sub":
                        textbold = new TL_iv.textSubscript();
                        textbold.text = parseRichText(jSONObject, tL_page);
                        break;
                    case "sup":
                        textbold = new TL_iv.textSuperscript();
                        textbold.text = parseRichText(jSONObject, tL_page);
                        break;
                    case "mark":
                        textbold = new TL_iv.textMarked();
                        textbold.text = parseRichText(jSONObject, tL_page);
                        break;
                    default:
                        textbold = parseRichText(jSONObject, tL_page);
                        break;
                }
                if (textbold != null) {
                    arrayList.add(applyAnchor(textbold, jSONObject));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return new TL_iv.textEmpty();
        }
        if (arrayList.size() == 1) {
            return arrayList.get(0);
        }
        TL_iv.textConcat textconcat = new TL_iv.textConcat();
        textconcat.texts = arrayList;
        return textconcat;
    }

    public static TL_iv.RichText addLastSpace(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return richText;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            addLastSpace(richText2);
            return richText;
        }
        if (!richText.texts.isEmpty()) {
            addLastSpace(richText.texts.get(r0.size() - 1));
            return richText;
        }
        if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null && !str.endsWith(" ")) {
            textplain.text += ' ';
        }
        return richText;
    }

    public static TL_iv.RichText addNewLine(TL_iv.RichText richText) {
        if (richText == null) {
            return richText;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            addNewLine(richText2);
            return richText;
        }
        if (!richText.texts.isEmpty()) {
            addNewLine(richText.texts.get(r0.size() - 1));
            return richText;
        }
        if (richText instanceof TL_iv.textPlain) {
            StringBuilder sb = new StringBuilder();
            TL_iv.textPlain textplain = (TL_iv.textPlain) richText;
            sb.append(textplain.text);
            sb.append('\n');
            textplain.text = sb.toString();
        }
        return richText;
    }

    public static TL_iv.RichText trimStart(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return richText;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            trimStart(richText2);
            return richText;
        }
        if (!richText.texts.isEmpty()) {
            trimStart(richText.texts.get(0));
            return richText;
        }
        if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null) {
            textplain.text = str.replaceAll("^\\s+", "");
        }
        return richText;
    }

    public static TL_iv.RichText trim(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return richText;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            trim(richText2);
            return richText;
        }
        if (richText.texts.size() == 1) {
            trim(richText.texts.get(0));
            return richText;
        }
        if (!richText.texts.isEmpty()) {
            trimStart(richText.texts.get(0));
            ArrayList<TL_iv.RichText> arrayList = richText.texts;
            trimEnd(arrayList.get(arrayList.size() - 1));
            return richText;
        }
        if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null) {
            textplain.text = str.trim();
        }
        return richText;
    }

    public static TL_iv.RichText trimEnd(TL_iv.RichText richText) {
        TL_iv.textPlain textplain;
        String str;
        if (richText == null) {
            return richText;
        }
        TL_iv.RichText richText2 = richText.text;
        if (richText2 != null) {
            trimEnd(richText2);
            return richText;
        }
        if (!richText.texts.isEmpty()) {
            trimEnd(richText.texts.get(r0.size() - 1));
            return richText;
        }
        if ((richText instanceof TL_iv.textPlain) && (str = (textplain = (TL_iv.textPlain) richText).text) != null) {
            textplain.text = str.replaceAll("\\s+$", "");
        }
        return richText;
    }

    public static TL_iv.RichText parseRichText(String str) {
        TL_iv.textPlain textplain = new TL_iv.textPlain();
        textplain.text = str;
        return textplain;
    }

    public TL_iv.pageBlockTable parseTable(String str, JSONObject jSONObject, TL_iv.TL_page tL_page) {
        TL_iv.pageBlockTable pageblocktable = new TL_iv.pageBlockTable();
        pageblocktable.bordered = true;
        pageblocktable.striped = true;
        String optString = jSONObject.optString("title");
        if (optString == null) {
            optString = "";
        }
        pageblocktable.title = trim(applyAnchor(parseRichText(optString), jSONObject));
        pageblocktable.rows.addAll(parseTableRows(str, jSONObject.getJSONArray("content"), tL_page));
        return pageblocktable;
    }

    public ArrayList parseTableRows(String str, JSONArray jSONArray, TL_iv.TL_page tL_page) {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                if ("tr".equals(jSONObject.optString("tag"))) {
                    arrayList.add(parseTableRow(str, jSONObject, tL_page));
                } else {
                    JSONArray optJSONArray = jSONObject.optJSONArray("content");
                    if (optJSONArray != null) {
                        arrayList.addAll(parseTableRows(str, optJSONArray, tL_page));
                    }
                }
            }
        }
        return arrayList;
    }

    public TL_iv.pageTableRow parseTableRow(String str, JSONObject jSONObject, TL_iv.TL_page tL_page) {
        JSONObject jSONObject2;
        String optString;
        TL_iv.pageTableRow pagetablerow = new TL_iv.pageTableRow();
        JSONArray jSONArray = jSONObject.getJSONArray("content");
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof JSONObject) && (optString = (jSONObject2 = (JSONObject) obj).optString("tag")) != null && ("td".equals(optString) || "th".equals(optString))) {
                TL_iv.pageTableCell pagetablecell = new TL_iv.pageTableCell();
                pagetablecell.header = "th".equals(optString);
                try {
                    pagetablecell.colspan = Integer.parseInt(jSONObject2.optString("colspan"));
                    pagetablecell.flags |= 2;
                } catch (Exception unused) {
                }
                try {
                    pagetablecell.rowspan = Integer.parseInt(jSONObject2.optString("rowspan"));
                    pagetablecell.flags |= 4;
                } catch (Exception unused2) {
                }
                pagetablecell.text = trim(parseRichText(jSONObject2.getJSONArray("content"), tL_page));
                if (jSONObject2.has("bold") || pagetablecell.header) {
                    TL_iv.textBold textbold = new TL_iv.textBold();
                    textbold.text = pagetablecell.text;
                    pagetablecell.text = textbold;
                }
                if (jSONObject2.has("italic")) {
                    TL_iv.textItalic textitalic = new TL_iv.textItalic();
                    textitalic.text = pagetablecell.text;
                    pagetablecell.text = textitalic;
                }
                pagetablecell.align_center = jSONObject2.has("xcenter");
                pagetablerow.cells.add(pagetablecell);
            }
        }
        return pagetablerow;
    }

    public boolean isInline(JSONArray jSONArray) {
        List asList = Arrays.asList("b", "strong", "span", "img", "i", "s", "a", "code", "mark", "sub", "sup");
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (!(obj instanceof String)) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = (JSONObject) obj;
                    String optString = jSONObject.optString("tag");
                    if (!asList.contains(optString)) {
                        if ("div".equalsIgnoreCase(optString) || "span".equalsIgnoreCase(optString)) {
                            isInline(jSONObject.optJSONArray("content"));
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public TL_iv.PageBlock parseList(String str, JSONObject jSONObject, TL_iv.TL_page tL_page) {
        int i = 0;
        if ("ol".equals(jSONObject.optString("tag"))) {
            TL_iv.pageBlockOrderedList pageblockorderedlist = new TL_iv.pageBlockOrderedList();
            JSONArray jSONArray = jSONObject.getJSONArray("content");
            while (i < jSONArray.length()) {
                Object obj = jSONArray.get(i);
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    if ("li".equals(jSONObject2.optString("tag"))) {
                        JSONArray optJSONArray = jSONObject2.optJSONArray("content");
                        if (isInline(optJSONArray)) {
                            TL_iv.TL_pageListOrderedItemText tL_pageListOrderedItemText = new TL_iv.TL_pageListOrderedItemText();
                            tL_pageListOrderedItemText.text = parseRichText(optJSONArray, tL_page);
                            pageblockorderedlist.items.add(tL_pageListOrderedItemText);
                        } else {
                            TL_iv.TL_pageListOrderedItemBlocks tL_pageListOrderedItemBlocks = new TL_iv.TL_pageListOrderedItemBlocks();
                            tL_pageListOrderedItemBlocks.blocks.addAll(parsePageBlocks(str, optJSONArray, tL_page));
                            pageblockorderedlist.items.add(tL_pageListOrderedItemBlocks);
                        }
                    }
                }
                i++;
            }
            return pageblockorderedlist;
        }
        TL_iv.pageBlockList pageblocklist = new TL_iv.pageBlockList();
        JSONArray jSONArray2 = jSONObject.getJSONArray("content");
        while (i < jSONArray2.length()) {
            Object obj2 = jSONArray2.get(i);
            if (obj2 instanceof JSONObject) {
                JSONObject jSONObject3 = (JSONObject) obj2;
                if ("li".equals(jSONObject3.optString("tag"))) {
                    JSONArray optJSONArray2 = jSONObject3.optJSONArray("content");
                    if (isInline(optJSONArray2)) {
                        TL_iv.TL_pageListItemText tL_pageListItemText = new TL_iv.TL_pageListItemText();
                        tL_pageListItemText.text = parseRichText(optJSONArray2, tL_page);
                        pageblocklist.items.add(tL_pageListItemText);
                    } else {
                        TL_iv.TL_pageListItemBlocks tL_pageListItemBlocks = new TL_iv.TL_pageListItemBlocks();
                        tL_pageListItemBlocks.blocks.addAll(parsePageBlocks(str, optJSONArray2, tL_page));
                        pageblocklist.items.add(tL_pageListItemBlocks);
                    }
                }
            }
            i++;
        }
        return pageblocklist;
    }

    public static class Loader {
        private Runnable cancelLocal;
        private boolean cancelled;
        private final int currentAccount;
        public boolean currentIsLoaded;
        public float currentProgress;
        public String currentUrl;
        private boolean gotLocal;
        private boolean gotRemote;
        private final ArrayList listeners = new ArrayList();
        private TLRPC.WebPage localPage;
        private TLRPC.WebPage remotePage;
        private int reqId;
        private boolean started;

        public Loader(int i) {
            this.currentAccount = i;
        }

        public void retryLocal(BotWebViewContainer.MyWebView myWebView) {
            if (this.cancelled) {
                return;
            }
            TLRPC.WebPage webPage = this.localPage;
            if (webPage != null) {
                WebInstantView.recycle(webPage);
                this.localPage = null;
            }
            this.gotLocal = false;
            this.currentUrl = myWebView.getUrl();
            this.currentProgress = myWebView.getProgress();
            this.currentIsLoaded = myWebView.isPageLoaded();
            Runnable runnable = this.cancelLocal;
            if (runnable != null) {
                runnable.run();
            }
            this.cancelLocal = WebInstantView.generate(myWebView, false, new Utilities.Callback() { // from class: org.telegram.ui.web.WebInstantView$Loader$$ExternalSyntheticLambda2
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    WebInstantView.Loader.$r8$lambda$SpjkLf17hiKuprBBXrnClaVvkto(WebInstantView.Loader.this, (WebInstantView) obj);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$SpjkLf17hiKuprBBXrnClaVvkto(Loader loader, WebInstantView webInstantView) {
            loader.cancelLocal = null;
            loader.gotLocal = true;
            TLRPC.WebPage webPage = loader.localPage;
            if (webPage != null) {
                WebInstantView.recycle(webPage);
            }
            loader.localPage = webInstantView.webpage;
            loader.notifyUpdate();
        }

        public void start(BotWebViewContainer.MyWebView myWebView) {
            if (this.started) {
                return;
            }
            this.started = true;
            this.currentUrl = myWebView.getUrl();
            this.currentProgress = myWebView.getProgress();
            this.currentIsLoaded = myWebView.isPageLoaded();
            this.cancelLocal = WebInstantView.generate(myWebView, false, new Utilities.Callback() { // from class: org.telegram.ui.web.WebInstantView$Loader$$ExternalSyntheticLambda0
                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    WebInstantView.Loader.$r8$lambda$f16EGOwjFGaMeyNom7WZRrSDF7A(WebInstantView.Loader.this, (WebInstantView) obj);
                }
            });
            TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
            tL_messages_getWebPage.url = this.currentUrl;
            tL_messages_getWebPage.hash = 0;
            this.reqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getWebPage, new RequestDelegate() { // from class: org.telegram.ui.web.WebInstantView$Loader$$ExternalSyntheticLambda1
                @Override // org.telegram.tgnet.RequestDelegate
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    WebInstantView.Loader.$r8$lambda$RYaDXqpoh-U2_yiNxwr4F-7AfdU(WebInstantView.Loader.this, tLObject, tL_error);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$f16EGOwjFGaMeyNom7WZRrSDF7A(Loader loader, WebInstantView webInstantView) {
            loader.cancelLocal = null;
            loader.gotLocal = true;
            TLRPC.WebPage webPage = loader.localPage;
            if (webPage != null) {
                WebInstantView.recycle(webPage);
            }
            loader.localPage = webInstantView.webpage;
            loader.notifyUpdate();
        }

        public static /* synthetic */ void $r8$lambda$RYaDXqpoh-U2_yiNxwr4F-7AfdU(final Loader loader, final TLObject tLObject, TLRPC.TL_error tL_error) {
            loader.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.web.WebInstantView$Loader$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    WebInstantView.Loader.$r8$lambda$gPWPPB1bsXS4Je2i5aNmTWBgkCs(WebInstantView.Loader.this, tLObject);
                }
            });
        }

        public static /* synthetic */ void $r8$lambda$gPWPPB1bsXS4Je2i5aNmTWBgkCs(Loader loader, TLObject tLObject) {
            Runnable runnable;
            loader.gotRemote = true;
            if (tLObject instanceof TLRPC.TL_messages_webPage) {
                TLRPC.TL_messages_webPage tL_messages_webPage = (TLRPC.TL_messages_webPage) tLObject;
                MessagesController.getInstance(loader.currentAccount).putUsers(tL_messages_webPage.users, false);
                MessagesController.getInstance(loader.currentAccount).putChats(tL_messages_webPage.chats, false);
                loader.remotePage = tL_messages_webPage.webpage;
            } else {
                if (tLObject instanceof TLRPC.TL_webPage) {
                    TLRPC.TL_webPage tL_webPage = (TLRPC.TL_webPage) tLObject;
                    if (tL_webPage.cached_page instanceof TL_iv.TL_page) {
                        loader.remotePage = tL_webPage;
                    }
                }
                loader.remotePage = null;
            }
            TLRPC.WebPage webPage = loader.remotePage;
            if (webPage != null && webPage.cached_page == null) {
                loader.remotePage = null;
            }
            if (!SharedConfig.onlyLocalInstantView && loader.remotePage != null && (runnable = loader.cancelLocal) != null) {
                runnable.run();
            }
            loader.notifyUpdate();
        }

        public boolean isDone() {
            return (this.gotRemote && this.gotLocal) || this.remotePage != null || this.localPage != null || this.cancelled;
        }

        public TLRPC.WebPage getWebPage() {
            TLRPC.WebPage webPage;
            if (!SharedConfig.onlyLocalInstantView && (webPage = this.remotePage) != null) {
                return webPage;
            }
            TLRPC.WebPage webPage2 = this.localPage;
            if (webPage2 != null) {
                return webPage2;
            }
            return null;
        }

        public void cancel() {
            Runnable runnable;
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            if (!this.gotRemote) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
            }
            if (this.gotLocal || (runnable = this.cancelLocal) == null) {
                return;
            }
            runnable.run();
        }

        public void recycle() {
            TLRPC.WebPage webPage = this.localPage;
            if (webPage != null) {
                WebInstantView.recycle(webPage);
                this.localPage = null;
            }
        }

        public Runnable listen(final Runnable runnable) {
            this.listeners.add(runnable);
            return new Runnable() { // from class: org.telegram.ui.web.WebInstantView$Loader$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    WebInstantView.Loader.this.listeners.remove(runnable);
                }
            };
        }

        private void notifyUpdate() {
            ArrayList arrayList = this.listeners;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((Runnable) obj).run();
            }
        }
    }

    public static TL_iv.RichText filterRecursiveAnchorLinks(TL_iv.RichText richText, String str, String str2) {
        TL_iv.textUrl texturl;
        String str3;
        if (richText == null) {
            return richText;
        }
        if (richText instanceof TL_iv.textConcat) {
            TL_iv.textConcat textconcat = (TL_iv.textConcat) richText;
            TL_iv.textConcat textconcat2 = new TL_iv.textConcat();
            for (int i = 0; i < textconcat.texts.size(); i++) {
                TL_iv.RichText filterRecursiveAnchorLinks = filterRecursiveAnchorLinks(textconcat.texts.get(i), str, str2);
                if (filterRecursiveAnchorLinks != null) {
                    textconcat2.texts.add(filterRecursiveAnchorLinks);
                }
            }
            return textconcat2;
        }
        if (!(richText instanceof TL_iv.textUrl) || (str3 = (texturl = (TL_iv.textUrl) richText).url) == null) {
            return richText;
        }
        if (!str3.toLowerCase().equals("#" + str2)) {
            if (!TextUtils.equals(texturl.url.toLowerCase(), str + "#" + str2)) {
                return richText;
            }
        }
        return null;
    }
}
