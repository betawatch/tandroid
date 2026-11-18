package org.telegram.ui.web;

import ai.u2;
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
import bi.c6;
import c8.ma;
import c8.ra;
import com.google.android.gms.internal.vision.e2;
import hi.d5;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.jn;
import org.telegram.ui.qw0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class k extends FrameLayout {
    public final i E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public float K;
    public boolean L;
    public org.telegram.ui.x M;
    public org.telegram.ui.q N;
    public org.telegram.ui.q O;
    public AsyncTask P;
    public final d5 a;
    public boolean b;
    public final org.telegram.ui.Cells.y c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f;
    public final org.telegram.ui.Cells.y h;
    public final ImageView n;
    public final TextView r;
    public final TextView s;
    public final jn w;
    public final c6 x;
    public final ArrayList y;

    public k(Activity activity) {
        super(activity);
        int i7 = j10.t0;
        this.y = new ArrayList();
        this.K = 0.0f;
        setWillNotDraw(false);
        int i10 = j10.t0;
        b bVar = new b(this, 0);
        a aVar = new a(this);
        d5 d5Var = new d5(2, null);
        this.a = d5Var;
        c6 c6Var = new c6(this, activity, i10, bVar, aVar, d5Var);
        this.x = c6Var;
        c6Var.g3.r = false;
        c6Var.setOverScrollMode(2);
        c6Var.setPadding(0, 0, 0, 0);
        addView(c6Var, ma.e(-1, -1, ks.E1));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        org.telegram.ui.Cells.y b02 = n6.b0(this.H, this.J, 15, 15);
        this.c = b02;
        frameLayout2.setBackground(b02);
        ra.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, ma.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f = imageView;
        frameLayout2.addView(imageView, ma.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.n = imageView2;
        ra.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.y b03 = n6.b0(0, 0, 6, 6);
        this.h = b03;
        imageView2.setBackground(b03);
        frameLayout2.addView(imageView2, ma.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, ma.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, ma.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, ma.t(-1, -2, 55, 0, 0, 0, 0));
        this.E = new i(null, i7, new oi.a2(this, 25));
        this.w = new jn(activity, 27);
        int i11 = n6.Gl;
        c(n6.x0(null, i11, false), org.telegram.messenger.g0.B(n6.x0(null, i11, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(fj fjVar) {
        TLRPC.Message message = fjVar.k;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = fjVar.v;
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fjVar.v);
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
        j jVar = null;
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
                        j jVar2 = new j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                        jVar2.c = jSONObject.optDouble("rank", 0.0d);
                        arrayList.add(jVar2);
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
                        if (jVar == null) {
                        }
                        jVar.b = currentTimeMillis;
                        JSONArray jSONArray2 = new JSONArray();
                        while (i10 < Math.min(arrayList.size(), 20)) {
                        }
                        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
                    }
                }
                sharedPreferences = sharedPreferences2;
                Collections.sort(arrayList, new qw0(8));
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
            j jVar3 = (j) arrayList.get(i7);
            if (TextUtils.equals(jVar3.a, str)) {
                jVar = jVar3;
                break;
            }
            i7++;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        if (jVar == null) {
            jVar.c += Math.exp((currentTimeMillis2 - jVar.b) / 2419200.0d);
        } else {
            jVar = new j(str, currentTimeMillis2);
            arrayList.add(jVar);
        }
        jVar.b = currentTimeMillis2;
        JSONArray jSONArray22 = new JSONArray();
        for (i10 = 0; i10 < Math.min(arrayList.size(), 20); i10++) {
            j jVar4 = (j) arrayList.get(i10);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", jVar4.a);
            jSONObject2.put("rank", jVar4.c);
            jSONObject2.put("usage", jVar4.b);
            jSONArray22.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray22.toString()).apply();
    }

    public final void c(int i7, int i10) {
        if (this.F != i7) {
            this.F = i7;
            invalidate();
        }
        this.I = i10;
        float f10 = org.telegram.messenger.g0.B(i7) >= 0.721f ? 0.0f : 1.0f;
        this.H = i0.a.f(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i7, i10);
        this.G = i7;
        this.J = i0.a.f(org.telegram.messenger.g0.T1(0.12f, 0.22f, f10), i7, i10);
        int i11 = this.H;
        org.telegram.ui.Cells.y yVar = this.c;
        n6.H1(yVar, i11, false);
        n6.H1(yVar, this.J, true);
        this.e.invalidate();
        this.r.setTextColor(i10);
        this.s.setTextColor(n6.r1(0.6f, i10));
        ImageView imageView = this.f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        this.n.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        n6.H1(this.h, n6.r1(1.5f, this.J), true);
        int w10 = n6.w(i7, n6.r1(0.05f, i10));
        int w11 = n6.w(i7, n6.r1(0.55f, i10));
        d5 d5Var = this.a;
        SparseIntArray sparseIntArray = (SparseIntArray) d5Var.b;
        SparseIntArray sparseIntArray2 = (SparseIntArray) d5Var.b;
        sparseIntArray.put(n6.d6, this.G);
        sparseIntArray2.put(n6.G6, i10);
        sparseIntArray2.put(n6.e7, w10);
        sparseIntArray2.put(n6.f7, w11);
        sparseIntArray2.put(n6.G8, n6.r1(0.2f, i10));
        sparseIntArray2.put(n6.i6, n6.r1(org.telegram.messenger.g0.T1(0.05f, 0.12f, f10), i10));
        this.x.g1();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipRect(0.0f, 0.0f, getWidth(), getHeight() * this.K);
        canvas.drawColor(this.G);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.K < 0.3f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i iVar = this.E;
        if (iVar == null || !this.L) {
            return;
        }
        iVar.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.E;
        if (iVar != null) {
            iVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.P;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.P = null;
        }
        ArrayList arrayList = this.y;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            c6 c6Var = this.x;
            c6Var.g3.O(true);
            if (z10 != (!arrayList.isEmpty())) {
                c6Var.f3.h1(0, 0);
                return;
            }
            return;
        }
        y0 y0Var = new y0(new u2(10, this, z10));
        String str3 = e1.a().c;
        if (str3 != null) {
            StringBuilder m10 = e2.m(str3);
            m10.append(URLEncoder.encode(str));
            str2 = m10.toString();
        }
        this.P = y0Var.execute(str2);
    }

    public void setOpenProgress(float f10) {
        if (Math.abs(this.K - f10) > 1.0E-4f) {
            this.K = f10;
            int i7 = f10 <= 1.0E-4f ? 4 : 0;
            if (getImportantForAccessibility() != i7) {
                setImportantForAccessibility(i7);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z10) {
        i iVar = this.E;
        boolean z11 = z10 && iVar != null;
        this.L = z11;
        if (z11) {
            iVar.a();
        }
    }
}
