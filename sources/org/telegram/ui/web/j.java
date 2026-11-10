package org.telegram.ui.web;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.AsyncTask;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.b9;
import c8.ha;
import c8.ka;
import fi.g5;
import fi.w3;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.Components.sm;
import org.telegram.ui.xn0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class j extends FrameLayout {
    public final h D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public org.telegram.ui.y L;
    public org.telegram.ui.q M;
    public org.telegram.ui.q N;
    public AsyncTask O;
    public final g5 a;
    public boolean b;
    public final org.telegram.ui.Cells.y c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f;
    public final org.telegram.ui.Cells.y h;
    public final ImageView n;
    public final TextView r;
    public final TextView s;
    public final sm w;
    public final w3 x;
    public final ArrayList y;

    public j(Activity activity) {
        super(activity);
        int i7 = p10.s0;
        this.y = new ArrayList();
        this.J = 0.0f;
        setWillNotDraw(false);
        int i10 = p10.s0;
        hi.u1 u1Var = new hi.u1(this, 20);
        a aVar = new a(this);
        g5 g5Var = new g5(2, null);
        this.a = g5Var;
        w3 w3Var = new w3(this, activity, i10, u1Var, aVar, g5Var);
        this.x = w3Var;
        w3Var.f3.r = false;
        w3Var.setOverScrollMode(2);
        w3Var.setPadding(0, 0, 0, 0);
        addView(w3Var, ha.e(-1, -1, qs.E1));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        org.telegram.ui.Cells.y b02 = m6.b0(this.G, this.I, 15, 15);
        this.c = b02;
        frameLayout2.setBackground(b02);
        ka.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, ha.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f = imageView;
        frameLayout2.addView(imageView, ha.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.n = imageView2;
        ka.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.y b03 = m6.b0(0, 0, 6, 6);
        this.h = b03;
        imageView2.setBackground(b03);
        frameLayout2.addView(imageView2, ha.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, ha.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, ha.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, ha.t(-1, -2, 55, 0, 0, 0, 0));
        this.D = new h(null, i7, new p5(this, 9));
        this.w = new sm(activity, 27);
        int i11 = m6.Dl;
        c(m6.x0(null, i11, false), org.telegram.messenger.g0.B(m6.x0(null, i11, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(ij ijVar) {
        TLRPC.Message message = ijVar.k;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = ijVar.v;
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ijVar.v);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            String url = uRLSpan.getURL();
            if (url != null && !url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$")) {
                return url;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0088 A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:6:0x0067, B:8:0x006d, B:10:0x007d, B:13:0x0082, B:15:0x0088, B:16:0x00a5, B:17:0x00ad, B:19:0x00b9, B:21:0x00d9, B:25:0x009d), top: B:5:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9 A[Catch: Exception -> 0x0080, LOOP:1: B:17:0x00ad->B:19:0x00b9, LOOP_END, TryCatch #0 {Exception -> 0x0080, blocks: (B:6:0x0067, B:8:0x006d, B:10:0x007d, B:13:0x0082, B:15:0x0088, B:16:0x00a5, B:17:0x00ad, B:19:0x00b9, B:21:0x00d9, B:25:0x009d), top: B:5:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:6:0x0067, B:8:0x006d, B:10:0x007d, B:13:0x0082, B:15:0x0088, B:16:0x00a5, B:17:0x00ad, B:19:0x00b9, B:21:0x00d9, B:25:0x009d), top: B:5:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[EDGE_INSN: B:26:0x0082->B:13:0x0082 BREAK  A[LOOP:0: B:5:0x0067->B:10:0x007d], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006d A[Catch: Exception -> 0x0080, TryCatch #0 {Exception -> 0x0080, blocks: (B:6:0x0067, B:8:0x006d, B:10:0x007d, B:13:0x0082, B:15:0x0088, B:16:0x00a5, B:17:0x00ad, B:19:0x00b9, B:21:0x00d9, B:25:0x009d), top: B:5:0x0067 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, String str) {
        SharedPreferences sharedPreferences;
        int i7;
        int i10;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("webhistory", 0);
        i iVar = null;
        String string = sharedPreferences2.getString("queries_json", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                int i11 = 0;
                while (i11 < jSONArray.length()) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i11);
                    sharedPreferences = sharedPreferences2;
                    try {
                        i iVar2 = new i(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                        iVar2.c = jSONObject.optDouble("rank", 0.0d);
                        arrayList.add(iVar2);
                        i11++;
                        sharedPreferences2 = sharedPreferences;
                    } catch (Exception e10) {
                        e = e10;
                        a8.g(e, true);
                        i7 = 0;
                        while (true) {
                            try {
                                if (i7 < arrayList.size()) {
                                }
                                i7++;
                            } catch (Exception e11) {
                                a8.g(e11, true);
                                return;
                            }
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (iVar == null) {
                        }
                        iVar.b = currentTimeMillis;
                        JSONArray jSONArray2 = new JSONArray();
                        while (i10 < Math.min(arrayList.size(), 20)) {
                        }
                        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
                    }
                }
                sharedPreferences = sharedPreferences2;
                Collections.sort(arrayList, new xn0(10));
            } catch (Exception e12) {
                e = e12;
                sharedPreferences = sharedPreferences2;
            }
        } else {
            sharedPreferences = sharedPreferences2;
        }
        i7 = 0;
        while (true) {
            if (i7 < arrayList.size()) {
                break;
            }
            i iVar3 = (i) arrayList.get(i7);
            if (TextUtils.equals(iVar3.a, str)) {
                iVar = iVar3;
                break;
            }
            i7++;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (iVar == null) {
            iVar.c += Math.exp((currentTimeMillis2 - iVar.b) / 2419200.0d);
        } else {
            iVar = new i(str, currentTimeMillis2);
            arrayList.add(iVar);
        }
        iVar.b = currentTimeMillis2;
        JSONArray jSONArray22 = new JSONArray();
        for (i10 = 0; i10 < Math.min(arrayList.size(), 20); i10++) {
            i iVar4 = (i) arrayList.get(i10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", iVar4.a);
            jSONObject2.put("rank", iVar4.c);
            jSONObject2.put("usage", iVar4.b);
            jSONArray22.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray22.toString()).apply();
    }

    public final void c(int i7, int i10) {
        if (this.E != i7) {
            this.E = i7;
            invalidate();
        }
        this.H = i10;
        float f10 = org.telegram.messenger.g0.B(i7) >= 0.721f ? 0.0f : 1.0f;
        this.G = i0.a.f(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i7, i10);
        this.F = i7;
        this.I = i0.a.f(org.telegram.messenger.g0.T1(0.12f, 0.22f, f10), i7, i10);
        int i11 = this.G;
        org.telegram.ui.Cells.y yVar = this.c;
        m6.H1(yVar, i11, false);
        m6.H1(yVar, this.I, true);
        this.e.invalidate();
        this.r.setTextColor(i10);
        this.s.setTextColor(m6.r1(0.6f, i10));
        ImageView imageView = this.f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.n.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        m6.H1(this.h, m6.r1(1.5f, this.I), true);
        int w10 = m6.w(i7, m6.r1(0.05f, i10));
        int w11 = m6.w(i7, m6.r1(0.55f, i10));
        g5 g5Var = this.a;
        SparseIntArray sparseIntArray = (SparseIntArray) g5Var.b;
        SparseIntArray sparseIntArray2 = (SparseIntArray) g5Var.b;
        sparseIntArray.put(m6.d6, this.F);
        sparseIntArray2.put(m6.G6, i10);
        sparseIntArray2.put(m6.e7, w10);
        sparseIntArray2.put(m6.f7, w11);
        sparseIntArray2.put(m6.G8, m6.r1(0.2f, i10));
        sparseIntArray2.put(m6.i6, m6.r1(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i10));
        this.x.g1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.J);
        canvas.drawColor(this.F);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.J < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h hVar = this.D;
        if (hVar == null || !this.K) {
            return;
        }
        hVar.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.D;
        if (hVar != null) {
            hVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.O;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.O = null;
        }
        ArrayList arrayList = this.y;
        boolean z9 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            w3 w3Var = this.x;
            w3Var.f3.O(true);
            if (z9 != (!arrayList.isEmpty())) {
                w3Var.e3.h1(0, 0);
                return;
            }
            return;
        }
        a1 a1Var = new a1(new b9(9, this, z9));
        String str3 = f1.a().c;
        if (str3 != null) {
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str3);
            m10.append(URLEncoder.encode(str));
            str2 = m10.toString();
        }
        this.O = a1Var.execute(str2);
    }

    public void setOpenProgress(float f10) {
        if (Math.abs(this.J - f10) > 1.0E-4f) {
            this.J = f10;
            int i7 = f10 <= 1.0E-4f ? 4 : 0;
            if (getImportantForAccessibility() != i7) {
                setImportantForAccessibility(i7);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z9) {
        h hVar = this.D;
        boolean z10 = z9 && hVar != null;
        this.K = z10;
        if (z10) {
            hVar.a();
        }
    }
}
