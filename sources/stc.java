// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebSettings;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgressView;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class stc extends ViewGroup implements ibc, AudioManager.OnAudioFocusChangeListener {
    public String E;
    public String F;
    public String G;
    public String H;
    public boolean I;
    public final boolean J;
    public boolean K;
    public boolean L;
    public long M;
    public boolean N;
    public float O;
    public int P;
    public boolean Q;
    public final Paint R;
    public AsyncTask S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final lbc a;
    public boolean a0;
    public final nz7 b;
    public final RadialProgressView b0;
    public final m88 c;
    public final ImageView c0;
    public final TextureView d;
    public final ImageView d0;
    public final ImageView e;
    public final ImageView e0;
    public final ViewGroup f;
    public AnimatorSet f0;
    public final otc g0;
    public Bitmap h;
    public int h0;
    public int i0;
    public final ltc j0;
    public final up5 k0;
    public final ltc l0;
    public TextureView n;
    public byte r;
    public boolean s;
    public final ptc w;
    public boolean x;
    public String y;
    public static final Pattern m0 = Pattern.compile("(?:youtube(?:-nocookie)?\\.com/(?:[^/\\n\\s]+/\\S+/|(?:v|e(?:mbed)?)/|\\S*?[?&]v=)|youtu\\.be/)([a-zA-Z0-9_-]{11})");
    public static final Pattern n0 = Pattern.compile("https?://(?:(?:www|(player))\\.)?vimeo(pro)?\\.com/(?!(?:channels|album)/[^/?#]+/?(?:$|[?#])|[^/]+/review/|ondemand/)(?:.*?/)?(?:(?:play_redirect_hls|moogaloop\\.swf)\\?clip_id=)?(?:videos?/)?([0-9]+)(?:/[\\da-f]+)?/?(?:[?&].*)?(?:[#].*)?$");
    public static final Pattern o0 = Pattern.compile("(?:coub:|https?://(?:coub\\.com/(?:view|embed|coubs)/|c-cdn\\.coub\\.com/fb-player\\.swf\\?.*\\bcoub(?:ID|id)=))([\\da-z]+)");
    public static final Pattern p0 = Pattern.compile("^https?://(?:www\\.)?aparat\\.com/(?:v/|video/video/embed/videohash/)([a-zA-Z0-9]+)");
    public static final Pattern q0 = Pattern.compile("https?://clips\\.twitch\\.tv/(?:[^/]+/)*([^/?#&]+)");
    public static final Pattern r0 = Pattern.compile("https?://(?:(?:www\\.)?twitch\\.tv/|player\\.twitch\\.tv/\\?.*?\\bchannel=)([^/#?]+)");
    public static final Pattern s0 = Pattern.compile("fileList\\s*=\\s*JSON\\.parse\\('([^']+)'\\)");
    public static final Pattern t0 = Pattern.compile("clipInfo\\s*=\\s*(\\{[^']+\\});");
    public static final Pattern u0 = Pattern.compile("\"sts\"\\s*:\\s*(\\d+)");
    public static final Pattern v0 = Pattern.compile("\"assets\":.+?\"js\":\\s*(\"[^\"]+\")");
    public static final Pattern w0 = Pattern.compile("\\.sig\\|\\|([a-zA-Z0-9$]+)\\(");
    public static final Pattern x0 = Pattern.compile("[\"']signature[\"']\\s*,\\s*([a-zA-Z0-9$]+)\\(");
    public static final Pattern y0 = Pattern.compile("var\\s");
    public static final Pattern z0 = Pattern.compile("return(?:\\s+|$)");
    public static final Pattern A0 = Pattern.compile("[()]");
    public static final Pattern B0 = Pattern.compile(".*?-([a-zA-Z0-9_-]+)(?:/watch_as3|/html5player(?:-new)?|(?:/[a-z]{2}_[A-Z]{2})?/base)?\\.([a-z]+)$");

    public stc(Activity activity, boolean z, ptc ptcVar) {
        super(activity);
        final byte b = 1;
        this.J = true;
        Paint paint = new Paint();
        this.R = paint;
        final byte b2 = 0;
        this.j0 = new ltc(this, b2);
        byte b3 = 5;
        this.k0 = new up5(this, b3);
        this.l0 = new ltc(this, b);
        setWillNotDraw(false);
        this.w = ptcVar;
        paint.setColor(-16777216);
        final byte b4 = 2;
        m88 m88Var = new m88(b4, activity, this);
        this.c = m88Var;
        addView(m88Var, nme.e(-1, -1, 17));
        nz7 nz7Var = new nz7(activity, activity);
        this.b = nz7Var;
        final dkc dkcVar = new dkc(this, b3);
        nz7Var.addJavascriptInterface(new Object(dkcVar) { // from class: org.telegram.ui.Components.WebPlayerView$JavaScriptInterface
            public final dkc a;

            {
                this.a = dkcVar;
            }

            @JavascriptInterface
            public void returnResultToJava(String str) {
                stc stcVar = (stc) this.a.b;
                AsyncTask asyncTask = stcVar.S;
                if (asyncTask == null || asyncTask.isCancelled()) {
                    return;
                }
                AsyncTask asyncTask2 = stcVar.S;
                if (asyncTask2 instanceof rtc) {
                    rtc rtcVar = (rtc) asyncTask2;
                    int i = rtc.f;
                    String[] strArr = rtcVar.c;
                    strArr[0] = strArr[0].replace(rtcVar.d, "/signature/" + str);
                    rtcVar.b.countDown();
                }
            }
        }, "JavaScriptInterface");
        WebSettings settings = nz7Var.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDefaultTextEncodingName("utf-8");
        ViewGroup h = ptcVar.h();
        this.f = h;
        TextureView textureView = new TextureView(activity);
        this.d = textureView;
        textureView.setPivotX(0.0f);
        textureView.setPivotY(0.0f);
        if (h != null) {
            h.addView(textureView);
            ImageView imageView = new ImageView(activity);
            this.e = imageView;
            imageView.setBackgroundColor(-65536);
            imageView.setPivotX(0.0f);
            imageView.setPivotY(0.0f);
            imageView.setVisibility(4);
            h.addView(imageView);
        } else {
            m88Var.addView(textureView, nme.e(-1, -1, 17));
        }
        lbc lbcVar = new lbc();
        this.a = lbcVar;
        lbcVar.K = this;
        lbcVar.z0(textureView);
        otc otcVar = new otc(this, activity);
        this.g0 = otcVar;
        if (h != null) {
            h.addView(otcVar);
        } else {
            addView(otcVar, nme.c(-1.0f, -1));
        }
        RadialProgressView radialProgressView = new RadialProgressView(activity, null);
        this.b0 = radialProgressView;
        radialProgressView.setProgressColor(-1);
        addView(radialProgressView, nme.e(48, 48, 17));
        ImageView imageView2 = new ImageView(activity);
        this.c0 = imageView2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        otcVar.addView(imageView2, nme.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: ktc
            public final /* synthetic */ stc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b2;
                stc stcVar = this.b;
                switch (b5) {
                    case 0:
                        if (stcVar.x && !stcVar.T && !stcVar.a0 && stcVar.N) {
                            stcVar.U = !stcVar.U;
                            stcVar.l(true);
                            break;
                        }
                        break;
                    case 1:
                        lbc lbcVar2 = stcVar.a;
                        if (stcVar.x && stcVar.y != null) {
                            if (lbcVar2.d == null) {
                                stcVar.i();
                            }
                            if (lbcVar2.c0()) {
                                lbcVar2.f0();
                            } else {
                                stcVar.W = false;
                                lbcVar2.g0();
                            }
                            stcVar.n();
                            break;
                        }
                        break;
                    default:
                        ViewGroup viewGroup = stcVar.f;
                        boolean z2 = stcVar.J;
                        ptc ptcVar2 = stcVar.w;
                        otc otcVar2 = stcVar.g0;
                        m88 m88Var2 = stcVar.c;
                        TextureView textureView2 = stcVar.d;
                        if (textureView2 != null && ptcVar2.i() && !stcVar.T && !stcVar.a0 && stcVar.N) {
                            stcVar.a0 = true;
                            if (!stcVar.V) {
                                stcVar.U = false;
                                ptcVar2.a(true, stcVar.l0, m88Var2.getAspectRatio(), z2);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) m88Var2.getParent();
                                if (viewGroup2 != stcVar) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(m88Var2);
                                    }
                                    stcVar.addView(m88Var2, 0, nme.e(-1, -1, 17));
                                    m88Var2.measure(View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredHeight() - gl.L(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = stcVar.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    stcVar.h = null;
                                }
                                stcVar.T = true;
                                stcVar.V = false;
                                stcVar.n();
                                stcVar.o();
                                stcVar.k();
                                stcVar.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    m88Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) otcVar2.getParent();
                                if (viewGroup3 != stcVar) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(otcVar2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(otcVar2);
                                    } else {
                                        stcVar.addView(otcVar2, 1);
                                    }
                                }
                                otcVar2.d(false, false);
                                ptcVar2.a(false, null, m88Var2.getAspectRatio(), z2);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        ImageView imageView3 = new ImageView(activity);
        this.d0 = imageView3;
        imageView3.setScaleType(scaleType);
        otcVar.addView(imageView3, nme.e(48, 48, 17));
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: ktc
            public final /* synthetic */ stc b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b5 = b;
                stc stcVar = this.b;
                switch (b5) {
                    case 0:
                        if (stcVar.x && !stcVar.T && !stcVar.a0 && stcVar.N) {
                            stcVar.U = !stcVar.U;
                            stcVar.l(true);
                            break;
                        }
                        break;
                    case 1:
                        lbc lbcVar2 = stcVar.a;
                        if (stcVar.x && stcVar.y != null) {
                            if (lbcVar2.d == null) {
                                stcVar.i();
                            }
                            if (lbcVar2.c0()) {
                                lbcVar2.f0();
                            } else {
                                stcVar.W = false;
                                lbcVar2.g0();
                            }
                            stcVar.n();
                            break;
                        }
                        break;
                    default:
                        ViewGroup viewGroup = stcVar.f;
                        boolean z2 = stcVar.J;
                        ptc ptcVar2 = stcVar.w;
                        otc otcVar2 = stcVar.g0;
                        m88 m88Var2 = stcVar.c;
                        TextureView textureView2 = stcVar.d;
                        if (textureView2 != null && ptcVar2.i() && !stcVar.T && !stcVar.a0 && stcVar.N) {
                            stcVar.a0 = true;
                            if (!stcVar.V) {
                                stcVar.U = false;
                                ptcVar2.a(true, stcVar.l0, m88Var2.getAspectRatio(), z2);
                                break;
                            } else {
                                ViewGroup viewGroup2 = (ViewGroup) m88Var2.getParent();
                                if (viewGroup2 != stcVar) {
                                    if (viewGroup2 != null) {
                                        viewGroup2.removeView(m88Var2);
                                    }
                                    stcVar.addView(m88Var2, 0, nme.e(-1, -1, 17));
                                    m88Var2.measure(View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredHeight() - gl.L(10.0f), TLObject.FLAG_30));
                                }
                                Bitmap bitmap = stcVar.h;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                    stcVar.h = null;
                                }
                                stcVar.T = true;
                                stcVar.V = false;
                                stcVar.n();
                                stcVar.o();
                                stcVar.k();
                                stcVar.m();
                                textureView2.setVisibility(4);
                                if (viewGroup != null) {
                                    viewGroup.addView(textureView2);
                                } else {
                                    m88Var2.addView(textureView2);
                                }
                                ViewGroup viewGroup3 = (ViewGroup) otcVar2.getParent();
                                if (viewGroup3 != stcVar) {
                                    if (viewGroup3 != null) {
                                        viewGroup3.removeView(otcVar2);
                                    }
                                    if (viewGroup != null) {
                                        viewGroup.addView(otcVar2);
                                    } else {
                                        stcVar.addView(otcVar2, 1);
                                    }
                                }
                                otcVar2.d(false, false);
                                ptcVar2.a(false, null, m88Var2.getAspectRatio(), z2);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        if (z) {
            ImageView imageView4 = new ImageView(activity);
            this.e0 = imageView4;
            imageView4.setScaleType(scaleType);
            otcVar.addView(imageView4, nme.e(56, 48, 53));
            imageView4.setOnClickListener(new View.OnClickListener(this) { // from class: ktc
                public final /* synthetic */ stc b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b5 = b4;
                    stc stcVar = this.b;
                    switch (b5) {
                        case 0:
                            if (stcVar.x && !stcVar.T && !stcVar.a0 && stcVar.N) {
                                stcVar.U = !stcVar.U;
                                stcVar.l(true);
                                break;
                            }
                            break;
                        case 1:
                            lbc lbcVar2 = stcVar.a;
                            if (stcVar.x && stcVar.y != null) {
                                if (lbcVar2.d == null) {
                                    stcVar.i();
                                }
                                if (lbcVar2.c0()) {
                                    lbcVar2.f0();
                                } else {
                                    stcVar.W = false;
                                    lbcVar2.g0();
                                }
                                stcVar.n();
                                break;
                            }
                            break;
                        default:
                            ViewGroup viewGroup = stcVar.f;
                            boolean z2 = stcVar.J;
                            ptc ptcVar2 = stcVar.w;
                            otc otcVar2 = stcVar.g0;
                            m88 m88Var2 = stcVar.c;
                            TextureView textureView2 = stcVar.d;
                            if (textureView2 != null && ptcVar2.i() && !stcVar.T && !stcVar.a0 && stcVar.N) {
                                stcVar.a0 = true;
                                if (!stcVar.V) {
                                    stcVar.U = false;
                                    ptcVar2.a(true, stcVar.l0, m88Var2.getAspectRatio(), z2);
                                    break;
                                } else {
                                    ViewGroup viewGroup2 = (ViewGroup) m88Var2.getParent();
                                    if (viewGroup2 != stcVar) {
                                        if (viewGroup2 != null) {
                                            viewGroup2.removeView(m88Var2);
                                        }
                                        stcVar.addView(m88Var2, 0, nme.e(-1, -1, 17));
                                        m88Var2.measure(View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredWidth(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(stcVar.getMeasuredHeight() - gl.L(10.0f), TLObject.FLAG_30));
                                    }
                                    Bitmap bitmap = stcVar.h;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                        stcVar.h = null;
                                    }
                                    stcVar.T = true;
                                    stcVar.V = false;
                                    stcVar.n();
                                    stcVar.o();
                                    stcVar.k();
                                    stcVar.m();
                                    textureView2.setVisibility(4);
                                    if (viewGroup != null) {
                                        viewGroup.addView(textureView2);
                                    } else {
                                        m88Var2.addView(textureView2);
                                    }
                                    ViewGroup viewGroup3 = (ViewGroup) otcVar2.getParent();
                                    if (viewGroup3 != stcVar) {
                                        if (viewGroup3 != null) {
                                            viewGroup3.removeView(otcVar2);
                                        }
                                        if (viewGroup != null) {
                                            viewGroup.addView(otcVar2);
                                        } else {
                                            stcVar.addView(otcVar2, 1);
                                        }
                                    }
                                    otcVar2.d(false, false);
                                    ptcVar2.a(false, null, m88Var2.getAspectRatio(), z2);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
        }
        n();
        k();
        m();
        o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if ((r2.find() ? r2.group(3) : null) != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006b, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if ((r2.find() ? r2.group(1) : null) != null) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (!str.endsWith(".mp4")) {
            try {
                Matcher matcher = m0.matcher(str);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        try {
            Matcher matcher2 = p0.matcher(str);
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        try {
            Matcher matcher3 = r0.matcher(str);
        } catch (Exception e3) {
            fa4.g(e3, true);
        }
        try {
            Matcher matcher4 = n0.matcher(str);
        } catch (Exception e4) {
            fa4.g(e4, true);
        }
        try {
            Matcher matcher5 = q0.matcher(str);
        } catch (Exception e5) {
            fa4.g(e5, true);
        }
        try {
            Matcher matcher6 = o0.matcher(str);
            return (matcher6.find() ? matcher6.group(1) : null) != null;
        } catch (Exception e6) {
            fa4.g(e6, true);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0193 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String c(AsyncTask asyncTask, String str, HashMap hashMap, boolean z) {
        URLConnection uRLConnection;
        boolean z2;
        InputStream inputStream;
        boolean z3;
        StringBuilder sb;
        boolean z4;
        InputStream inputStream2;
        try {
            URL url = new URL(str);
            uRLConnection = url.openConnection();
            try {
                uRLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
                if (z) {
                    uRLConnection.addRequestProperty("Accept-Encoding", "gzip, deflate");
                }
                uRLConnection.addRequestProperty("Accept-Language", "en-us,en;q=0.5");
                uRLConnection.addRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                uRLConnection.addRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.7");
                if (hashMap != null) {
                    for (Map.Entry entry : hashMap.entrySet()) {
                        uRLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                uRLConnection.setConnectTimeout(5000);
                uRLConnection.setReadTimeout(5000);
                if (uRLConnection instanceof HttpURLConnection) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
                    httpURLConnection.setInstanceFollowRedirects(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 302 || responseCode == 301 || responseCode == 303) {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        String headerField2 = httpURLConnection.getHeaderField("Set-Cookie");
                        url = new URL(headerField);
                        uRLConnection = url.openConnection();
                        uRLConnection.setRequestProperty("Cookie", headerField2);
                        uRLConnection.addRequestProperty("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:10.0) Gecko/20150101 Firefox/47.0 (Chrome)");
                        if (z) {
                            uRLConnection.addRequestProperty("Accept-Encoding", "gzip, deflate");
                        }
                        uRLConnection.addRequestProperty("Accept-Language", "en-us,en;q=0.5");
                        uRLConnection.addRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                        uRLConnection.addRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.7");
                        if (hashMap != null) {
                            for (Map.Entry entry2 : hashMap.entrySet()) {
                                uRLConnection.addRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
                            }
                        }
                    }
                }
                uRLConnection.connect();
                if (z) {
                    try {
                        inputStream2 = new GZIPInputStream(uRLConnection.getInputStream());
                    } catch (Exception unused) {
                        uRLConnection = url.openConnection();
                        uRLConnection.connect();
                        inputStream2 = uRLConnection.getInputStream();
                    }
                } else {
                    inputStream2 = uRLConnection.getInputStream();
                }
                inputStream = inputStream2;
                z2 = true;
            } catch (Throwable th) {
                th = th;
                boolean z5 = !(th instanceof SocketTimeoutException) ? (th instanceof UnknownHostException) || (!(th instanceof SocketException) ? !(th instanceof FileNotFoundException) : th.getMessage() == null || !th.getMessage().contains("ECONNRESET")) : a.r();
                fa4.g(th, true);
                z2 = z5;
                inputStream = null;
                if (z2) {
                }
                if (z3) {
                }
            }
        } catch (Throwable th2) {
            th = th2;
            uRLConnection = null;
        }
        if (z2) {
            z3 = false;
            sb = null;
        } else {
            try {
                if (uRLConnection instanceof HttpURLConnection) {
                    ((HttpURLConnection) uRLConnection).getResponseCode();
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
            if (inputStream != null) {
                try {
                    byte[] bArr = new byte[32768];
                    sb = null;
                    while (true) {
                        try {
                            if (asyncTask.isCancelled()) {
                                z4 = false;
                                break;
                            }
                            try {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    if (sb == null) {
                                        sb = new StringBuilder();
                                    }
                                    z4 = false;
                                    try {
                                        try {
                                            sb.append(new String(bArr, 0, read, "UTF-8"));
                                        } catch (Exception e2) {
                                            e = e2;
                                            fa4.g(e, true);
                                            z3 = z4;
                                            if (inputStream != null) {
                                            }
                                            if (z3) {
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        fa4.g(th, true);
                                        z3 = z4;
                                        if (inputStream != null) {
                                        }
                                        if (z3) {
                                        }
                                    }
                                } else {
                                    z4 = false;
                                    if (read == -1) {
                                        z3 = true;
                                    }
                                }
                            } catch (Exception e3) {
                                e = e3;
                                z4 = false;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            z4 = false;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    z4 = false;
                    sb = null;
                }
            } else {
                z3 = false;
                sb = null;
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th6) {
                    fa4.g(th6, true);
                }
            }
        }
        if (z3) {
            return null;
        }
        return sb.toString();
    }

    public static String d(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Matcher matcher = o0.matcher(str);
                String group = matcher.find() ? matcher.group(1) : null;
                if (group != null) {
                    return group;
                }
            } catch (Exception e) {
                fa4.g(e, true);
                return null;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = m0.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    private View getControlView() {
        return this.g0;
    }

    private View getProgressView() {
        return this.b0;
    }

    public final void b() {
        this.a.l0();
        AsyncTask asyncTask = this.S;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.S = null;
        }
        this.b.stopLoading();
    }

    public final boolean f() {
        return this.V || this.a0;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x024b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(String str, TLRPC.Photo photo, Object obj, String str2, boolean z) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        AsyncTask asyncTask;
        otc otcVar;
        AnimatorSet animatorSet;
        String d = d(str);
        if (d == null) {
            d = d(str2);
        }
        this.P = -1;
        if (d != null || str == null) {
            str3 = null;
            str4 = null;
        } else {
            if (!str.endsWith(".mp4")) {
                try {
                    if (str2 != null) {
                        try {
                            Uri parse = Uri.parse(str2);
                            String queryParameter = parse.getQueryParameter("t");
                            if (queryParameter == null) {
                                queryParameter = parse.getQueryParameter("time_continue");
                            }
                            if (queryParameter != null) {
                                if (queryParameter.contains("m")) {
                                    String[] split = queryParameter.split("m");
                                    this.P = (Utilities.z(split[0]).intValue() * 60) + Utilities.z(split[1]).intValue();
                                } else {
                                    this.P = Utilities.z(queryParameter).intValue();
                                }
                            }
                        } catch (Exception e) {
                            fa4.g(e, true);
                        }
                    }
                    Matcher matcher = m0.matcher(str);
                    String group = matcher.find() ? matcher.group(1) : null;
                    if (group == null) {
                        group = null;
                    }
                    str4 = group;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    str4 = null;
                }
                if (str4 == null) {
                    try {
                        Matcher matcher2 = n0.matcher(str);
                        String group2 = matcher2.find() ? matcher2.group(3) : null;
                        if (group2 == null) {
                            group2 = null;
                        }
                        str8 = group2;
                    } catch (Exception e3) {
                        fa4.g(e3, true);
                    }
                    if (str8 == null) {
                        try {
                            Matcher matcher3 = p0.matcher(str);
                            String group3 = matcher3.find() ? matcher3.group(1) : null;
                            if (group3 == null) {
                                group3 = null;
                            }
                            str7 = group3;
                        } catch (Exception e4) {
                            fa4.g(e4, true);
                        }
                        if (str7 == null) {
                            try {
                                Matcher matcher4 = q0.matcher(str);
                                String group4 = matcher4.find() ? matcher4.group(1) : null;
                                if (group4 == null) {
                                    group4 = null;
                                }
                                str6 = group4;
                            } catch (Exception e5) {
                                fa4.g(e5, true);
                            }
                            if (str6 == null) {
                                try {
                                    Matcher matcher5 = r0.matcher(str);
                                    String group5 = matcher5.find() ? matcher5.group(1) : null;
                                    if (group5 == null) {
                                        group5 = null;
                                    }
                                    str5 = group5;
                                } catch (Exception e6) {
                                    fa4.g(e6, true);
                                }
                                if (str5 == null) {
                                    try {
                                        Matcher matcher6 = o0.matcher(str);
                                        String group6 = matcher6.find() ? matcher6.group(1) : null;
                                        if (group6 != null) {
                                            d = group6;
                                        }
                                    } catch (Exception e7) {
                                        fa4.g(e7, true);
                                    }
                                }
                                str3 = null;
                                this.x = false;
                                this.W = false;
                                this.s = z;
                                this.y = null;
                                this.F = null;
                                b();
                                this.N = false;
                                this.O = 1.0f;
                                asyncTask = this.S;
                                if (asyncTask != null) {
                                    asyncTask.cancel(true);
                                    this.S = null;
                                }
                                k();
                                o();
                                m();
                                n();
                                otcVar = this.g0;
                                if (photo == null) {
                                    TLRPC.PhotoSize w = ba4.w(photo.sizes, 80, true, null, false);
                                    if (w != null) {
                                        otcVar.a.Z(null, null, gl5.i(w, photo), "80_80_b", null, 0L, null, obj, 1);
                                        this.Q = true;
                                    }
                                } else {
                                    this.Q = false;
                                }
                                animatorSet = this.f0;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    this.f0 = null;
                                }
                                otcVar.c(0);
                                if (str4 != null) {
                                    this.H = str4;
                                    str4 = null;
                                }
                                if (str3 == null) {
                                    this.x = true;
                                    this.y = str3;
                                    this.E = "other";
                                    if (this.s) {
                                        i();
                                    }
                                    j(false, false);
                                    otcVar.d(true, true);
                                } else {
                                    if (str4 != null) {
                                        rtc rtcVar = new rtc(this, str4);
                                        rtcVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                        this.S = rtcVar;
                                    } else if (str8 != null) {
                                        mtc mtcVar = new mtc(this, str8, (byte) 4);
                                        mtcVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                        this.S = mtcVar;
                                    } else if (d != null) {
                                        mtc mtcVar2 = new mtc(this, d, (byte) 1);
                                        mtcVar2.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                        this.S = mtcVar2;
                                        this.I = true;
                                    } else if (str7 != null) {
                                        mtc mtcVar3 = new mtc(this, str7, (byte) 0);
                                        mtcVar3.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                        this.S = mtcVar3;
                                    } else if (str6 != null) {
                                        mtc mtcVar4 = new mtc(this, str, (byte) 2);
                                        mtcVar4.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                        this.S = mtcVar4;
                                    } else if (str5 != null) {
                                        mtc mtcVar5 = new mtc(this, str5, (byte) 3);
                                        mtcVar5.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                                        this.S = mtcVar5;
                                        this.I = true;
                                    }
                                    otcVar.d(false, false);
                                    j(true, false);
                                }
                                if (str4 != null && str8 == null && d == null && str7 == null && str3 == null && str6 == null && str5 == null) {
                                    otcVar.setVisibility(8);
                                    return false;
                                }
                                otcVar.setVisibility(0);
                                return true;
                            }
                            str5 = null;
                            if (str5 == null) {
                            }
                            str3 = null;
                            this.x = false;
                            this.W = false;
                            this.s = z;
                            this.y = null;
                            this.F = null;
                            b();
                            this.N = false;
                            this.O = 1.0f;
                            asyncTask = this.S;
                            if (asyncTask != null) {
                            }
                            k();
                            o();
                            m();
                            n();
                            otcVar = this.g0;
                            if (photo == null) {
                            }
                            animatorSet = this.f0;
                            if (animatorSet != null) {
                            }
                            otcVar.c(0);
                            if (str4 != null) {
                            }
                            if (str3 == null) {
                            }
                            if (str4 != null) {
                            }
                            otcVar.setVisibility(0);
                            return true;
                        }
                        str6 = null;
                        if (str6 == null) {
                        }
                        str5 = null;
                        if (str5 == null) {
                        }
                        str3 = null;
                        this.x = false;
                        this.W = false;
                        this.s = z;
                        this.y = null;
                        this.F = null;
                        b();
                        this.N = false;
                        this.O = 1.0f;
                        asyncTask = this.S;
                        if (asyncTask != null) {
                        }
                        k();
                        o();
                        m();
                        n();
                        otcVar = this.g0;
                        if (photo == null) {
                        }
                        animatorSet = this.f0;
                        if (animatorSet != null) {
                        }
                        otcVar.c(0);
                        if (str4 != null) {
                        }
                        if (str3 == null) {
                        }
                        if (str4 != null) {
                        }
                        otcVar.setVisibility(0);
                        return true;
                    }
                    str7 = null;
                    if (str7 == null) {
                    }
                    str6 = null;
                    if (str6 == null) {
                    }
                    str5 = null;
                    if (str5 == null) {
                    }
                    str3 = null;
                    this.x = false;
                    this.W = false;
                    this.s = z;
                    this.y = null;
                    this.F = null;
                    b();
                    this.N = false;
                    this.O = 1.0f;
                    asyncTask = this.S;
                    if (asyncTask != null) {
                    }
                    k();
                    o();
                    m();
                    n();
                    otcVar = this.g0;
                    if (photo == null) {
                    }
                    animatorSet = this.f0;
                    if (animatorSet != null) {
                    }
                    otcVar.c(0);
                    if (str4 != null) {
                    }
                    if (str3 == null) {
                    }
                    if (str4 != null) {
                    }
                    otcVar.setVisibility(0);
                    return true;
                }
                str8 = null;
                if (str8 == null) {
                }
                str7 = null;
                if (str7 == null) {
                }
                str6 = null;
                if (str6 == null) {
                }
                str5 = null;
                if (str5 == null) {
                }
                str3 = null;
                this.x = false;
                this.W = false;
                this.s = z;
                this.y = null;
                this.F = null;
                b();
                this.N = false;
                this.O = 1.0f;
                asyncTask = this.S;
                if (asyncTask != null) {
                }
                k();
                o();
                m();
                n();
                otcVar = this.g0;
                if (photo == null) {
                }
                animatorSet = this.f0;
                if (animatorSet != null) {
                }
                otcVar.c(0);
                if (str4 != null) {
                }
                if (str3 == null) {
                }
                if (str4 != null) {
                }
                otcVar.setVisibility(0);
                return true;
            }
            str3 = str;
            str4 = null;
        }
        str8 = str4;
        str7 = str8;
        str6 = str7;
        str5 = str6;
        this.x = false;
        this.W = false;
        this.s = z;
        this.y = null;
        this.F = null;
        b();
        this.N = false;
        this.O = 1.0f;
        asyncTask = this.S;
        if (asyncTask != null) {
        }
        k();
        o();
        m();
        n();
        otcVar = this.g0;
        if (photo == null) {
        }
        animatorSet = this.f0;
        if (animatorSet != null) {
        }
        otcVar.c(0);
        if (str4 != null) {
        }
        if (str3 == null) {
        }
        if (str4 != null) {
        }
        otcVar.setVisibility(0);
        return true;
    }

    public View getAspectRatioView() {
        return this.c;
    }

    public View getControlsView() {
        return this.g0;
    }

    public ImageView getTextureImageView() {
        return this.e;
    }

    public TextureView getTextureView() {
        return this.d;
    }

    public String getYoutubeId() {
        return this.H;
    }

    public final void h() {
        otc otcVar = this.g0;
        if (otcVar.getParent() != this) {
            otcVar.setVisibility(8);
        }
        this.w.e();
    }

    public final void i() {
        String str = this.y;
        if (str != null) {
            String str2 = this.F;
            lbc lbcVar = this.a;
            if (str2 != null) {
                lbcVar.k0(Uri.parse(str), this.E, Uri.parse(this.F), this.G);
            } else {
                lbcVar.i0(Uri.parse(str), this.E);
            }
            lbcVar.t0(this.s);
            long U = lbcVar.U();
            otc otcVar = this.g0;
            if (U != -9223372036854775807L) {
                otcVar.b((int) (lbcVar.U() / 1000));
            } else {
                otcVar.b(0);
            }
            k();
            o();
            m();
            otcVar.invalidate();
            if (this.P != -1) {
                lbcVar.p0(r8 * 1000, false);
            }
        }
    }

    public final void j(boolean z, boolean z2) {
        RadialProgressView radialProgressView = this.b0;
        if (!z2) {
            radialProgressView.setAlpha(z ? 1.0f : 0.0f);
            return;
        }
        AnimatorSet animatorSet = this.f0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f0 = animatorSet2;
        animatorSet2.playTogether(ObjectAnimator.ofFloat(radialProgressView, "alpha", z ? 1.0f : 0.0f));
        this.f0.setDuration(150L);
        this.f0.addListener(new yoc(this, (byte) 2));
        this.f0.start();
    }

    public final void k() {
        y54 y54Var = this.a.d;
        ImageView imageView = this.c0;
        if (y54Var == null || this.V) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        if (this.U) {
            imageView.setImageResource(R.drawable.ic_outfullscreen);
            imageView.setLayoutParams(nme.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 1.0f));
        } else {
            imageView.setImageResource(R.drawable.ic_gofullscreen);
            imageView.setLayoutParams(nme.d(56, 56.0f, 85, 0.0f, 0.0f, 0.0f, 5.0f));
        }
    }

    public final void l(boolean z) {
        ViewGroup viewGroup;
        TextureView textureView = this.d;
        if (textureView == null) {
            return;
        }
        k();
        ViewGroup viewGroup2 = this.f;
        m88 m88Var = this.c;
        if (viewGroup2 != null) {
            if (this.U) {
                ViewGroup viewGroup3 = (ViewGroup) m88Var.getParent();
                if (viewGroup3 != null) {
                    viewGroup3.removeView(m88Var);
                }
            } else {
                ViewGroup viewGroup4 = (ViewGroup) m88Var.getParent();
                if (viewGroup4 != this) {
                    if (viewGroup4 != null) {
                        viewGroup4.removeView(m88Var);
                    }
                    addView(m88Var, 0);
                }
            }
            this.w.b(this.g0, this.U, m88Var.getAspectRatio(), m88Var.getVideoRotation(), z);
            return;
        }
        this.T = true;
        if (!this.U) {
            if (viewGroup2 != null) {
                viewGroup2.addView(textureView);
            } else {
                m88Var.addView(textureView);
            }
        }
        boolean z2 = this.U;
        otc otcVar = this.g0;
        if (z2) {
            ViewGroup viewGroup5 = (ViewGroup) otcVar.getParent();
            if (viewGroup5 != null) {
                viewGroup5.removeView(otcVar);
            }
        } else {
            ViewGroup viewGroup6 = (ViewGroup) otcVar.getParent();
            if (viewGroup6 != this) {
                if (viewGroup6 != null) {
                    viewGroup6.removeView(otcVar);
                }
                if (viewGroup2 != null) {
                    viewGroup2.addView(otcVar);
                } else {
                    addView(otcVar, 1);
                }
            }
        }
        TextureView b = this.w.b(this.g0, this.U, m88Var.getAspectRatio(), m88Var.getVideoRotation(), z);
        this.n = b;
        b.setVisibility(4);
        if (this.U && this.n != null && (viewGroup = (ViewGroup) textureView.getParent()) != null) {
            viewGroup.removeView(textureView);
        }
        int i = otc.J;
        otcVar.a();
    }

    public final void m() {
        ImageView imageView = this.e0;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(this.V ? R.drawable.ic_goinline : R.drawable.ic_outinline);
        imageView.setVisibility(this.a.d != null ? 0 : 8);
        if (this.V) {
            imageView.setLayoutParams(nme.e(40, 40, 53));
        } else {
            imageView.setLayoutParams(nme.e(56, 50, 53));
        }
    }

    public final void n() {
        otc otcVar = this.g0;
        int i = otc.J;
        otcVar.a();
        gl.r(this.j0);
        if (this.a.c0()) {
            this.d0.setImageResource(this.V ? R.drawable.ic_pauseinline : R.drawable.ic_pause);
            gl.d3(this.j0, 500L);
            if (this.K) {
                return;
            }
            AudioManager audioManager = (AudioManager) a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            this.K = true;
            audioManager.requestAudioFocus(this, 3, 1);
            return;
        }
        boolean z = this.W;
        ImageView imageView = this.d0;
        boolean z2 = this.V;
        if (z) {
            imageView.setImageResource(z2 ? R.drawable.ic_againinline : R.drawable.ic_again);
        } else {
            imageView.setImageResource(z2 ? R.drawable.ic_playinline : R.drawable.ic_play);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        gl.c3(new on7((Object) this, i, (byte) 29));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(10.0f), this.R);
    }

    @Override // ibc
    public final void onError(lbc lbcVar, Exception exc) {
        fa4.g(exc, true);
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        m88 m88Var = this.c;
        int measuredWidth = (i5 - m88Var.getMeasuredWidth()) / 2;
        int i6 = i4 - i2;
        int L = ((i6 - gl.L(10.0f)) - m88Var.getMeasuredHeight()) / 2;
        m88Var.layout(measuredWidth, L, m88Var.getMeasuredWidth() + measuredWidth, m88Var.getMeasuredHeight() + L);
        otc otcVar = this.g0;
        if (otcVar.getParent() == this) {
            otcVar.layout(0, 0, otcVar.getMeasuredWidth(), otcVar.getMeasuredHeight());
        }
        RadialProgressView radialProgressView = this.b0;
        int measuredWidth2 = (i5 - radialProgressView.getMeasuredWidth()) / 2;
        int measuredHeight = (i6 - radialProgressView.getMeasuredHeight()) / 2;
        radialProgressView.layout(measuredWidth2, measuredHeight, radialProgressView.getMeasuredWidth() + measuredWidth2, radialProgressView.getMeasuredHeight() + measuredHeight);
        otcVar.a.i0(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - gl.L(10.0f));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.c.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2 - gl.L(10.0f), TLObject.FLAG_30));
        otc otcVar = this.g0;
        if (otcVar.getParent() == this) {
            otcVar.measure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        }
        this.b0.measure(View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(44.0f), TLObject.FLAG_30));
        setMeasuredDimension(size, size2);
    }

    @Override // ibc
    public final void onRenderedFirstFrame() {
        this.N = true;
        this.M = System.currentTimeMillis();
        this.g0.invalidate();
    }

    @Override // ibc
    public final void onStateChanged(boolean z, int i) {
        otc otcVar = this.g0;
        lbc lbcVar = this.a;
        if (i != 2) {
            if (lbcVar.U() != -9223372036854775807L) {
                otcVar.b((int) (lbcVar.U() / 1000));
            } else {
                otcVar.b(0);
            }
        }
        ptc ptcVar = this.w;
        if (i == 4 || i == 1 || !lbcVar.c0()) {
            ptcVar.g(this, false);
        } else {
            ptcVar.g(this, true);
        }
        if (lbcVar.c0() && i != 4) {
            n();
            return;
        }
        if (i == 4) {
            this.W = true;
            lbcVar.f0();
            lbcVar.p0(0L, false);
            n();
            otcVar.d(true, true);
        }
    }

    @Override // ibc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        if (this.T) {
            this.T = false;
            if (this.U || this.V) {
                if (this.V) {
                    this.r = (byte) 1;
                }
                this.n.setSurfaceTexture(surfaceTexture);
                this.n.setSurfaceTextureListener(this.k0);
                this.n.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    @Override // ibc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (this.r == 2) {
            ImageView imageView = this.e;
            if (imageView != null) {
                imageView.setVisibility(4);
                imageView.setImageDrawable(null);
                Bitmap bitmap = this.h;
                if (bitmap != null) {
                    bitmap.recycle();
                    this.h = null;
                }
            }
            this.a0 = false;
            int i = this.h0;
            int i2 = this.i0;
            this.c.getVideoRotation();
            this.w.f(this.g0, false, i, i2, this.J);
            this.r = (byte) 0;
        }
    }

    @Override // ibc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        m88 m88Var = this.c;
        if (m88Var != null) {
            float f2 = i * f;
            this.h0 = (int) f2;
            this.i0 = i2;
            float f3 = i2 == 0 ? 1.0f : f2 / i2;
            m88Var.a(f3, 0);
            if (this.U) {
                this.w.d(f3);
            }
        }
    }

    @Override // ibc
    public final void onRenderedFirstFrame(tj tjVar) {
    }

    public final void o() {
    }

    @Override // ibc
    public final void onSeekFinished(tj tjVar) {
    }

    @Override // ibc
    public final void onSeekStarted(tj tjVar) {
    }
}
