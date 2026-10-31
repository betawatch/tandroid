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
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.ActionBar.x4;
import org.telegram.ui.Components.bn;
import org.telegram.ui.Components.ii;
import org.telegram.ui.ex0;
import org.telegram.ui.nc;
import w7.b6;
import w7.e6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public org.telegram.ui.w L;
    public org.telegram.ui.p M;
    public org.telegram.ui.p N;
    public AsyncTask O;
    public final x4 a;
    public boolean b;
    public final org.telegram.ui.Cells.y c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f;
    public final org.telegram.ui.Cells.y h;
    public final ImageView n;
    public final TextView r;
    public final TextView s;
    public final bn w;
    public final ii x;
    public final ArrayList y;

    public j(Activity activity) {
        super(activity);
        int i10 = d20.s0;
        this.y = new ArrayList();
        this.J = 0.0f;
        setWillNotDraw(false);
        int i11 = d20.s0;
        ag.a aVar = new ag.a(this, 19);
        a aVar2 = new a(this);
        x4 x4Var = new x4(1, null);
        this.a = x4Var;
        ii iiVar = new ii(this, activity, i11, aVar, aVar2, x4Var);
        this.x = iiVar;
        iiVar.f3.r = false;
        iiVar.setOverScrollMode(2);
        iiVar.setPadding(0, 0, 0, 0);
        addView(iiVar, b6.e(-1, -1, zs.E1));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        org.telegram.ui.Cells.y b02 = t6.b0(this.G, this.I, 15, 15);
        this.c = b02;
        frameLayout2.setBackground(b02);
        e6.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, b6.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f = imageView;
        frameLayout2.addView(imageView, b6.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.n = imageView2;
        e6.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.y b03 = t6.b0(0, 0, 6, 6);
        this.h = b03;
        imageView2.setBackground(b03);
        frameLayout2.addView(imageView2, b6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, b6.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, b6.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, b6.t(-1, -2, 55, 0, 0, 0, 0));
        this.D = new h(null, i10, new w5(this, 12));
        this.w = new bn(activity, 24);
        int i12 = t6.Dl;
        c(t6.x0(null, i12, false), org.telegram.messenger.i0.B(t6.x0(null, i12, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(jj jjVar) {
        TLRPC.Message message = jjVar.k;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = jjVar.v;
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(jjVar.v);
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
        int i10;
        int i11;
        SharedPreferences sharedPreferences2 = context.getSharedPreferences("webhistory", 0);
        i iVar = null;
        String string = sharedPreferences2.getString("queries_json", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                int i12 = 0;
                while (i12 < jSONArray.length()) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i12);
                    sharedPreferences = sharedPreferences2;
                    try {
                        i iVar2 = new i(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                        iVar2.c = jSONObject.optDouble("rank", 0.0d);
                        arrayList.add(iVar2);
                        i12++;
                        sharedPreferences2 = sharedPreferences;
                    } catch (Exception e) {
                        e = e;
                        f8.g(e, true);
                        i10 = 0;
                        while (true) {
                            try {
                                if (i10 < arrayList.size()) {
                                }
                                i10++;
                            } catch (Exception e7) {
                                f8.g(e7, true);
                                return;
                            }
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (iVar == null) {
                        }
                        iVar.b = currentTimeMillis;
                        JSONArray jSONArray2 = new JSONArray();
                        while (i11 < Math.min(arrayList.size(), 20)) {
                        }
                        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
                    }
                }
                sharedPreferences = sharedPreferences2;
                Collections.sort(arrayList, new ex0(9));
            } catch (Exception e10) {
                e = e10;
                sharedPreferences = sharedPreferences2;
            }
        } else {
            sharedPreferences = sharedPreferences2;
        }
        i10 = 0;
        while (true) {
            if (i10 < arrayList.size()) {
                break;
            }
            i iVar3 = (i) arrayList.get(i10);
            if (TextUtils.equals(iVar3.a, str)) {
                iVar = iVar3;
                break;
            }
            i10++;
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
        for (i11 = 0; i11 < Math.min(arrayList.size(), 20); i11++) {
            i iVar4 = (i) arrayList.get(i11);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", iVar4.a);
            jSONObject2.put("rank", iVar4.c);
            jSONObject2.put("usage", iVar4.b);
            jSONArray22.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray22.toString()).apply();
    }

    public final void c(int i10, int i11) {
        if (this.E != i10) {
            this.E = i10;
            invalidate();
        }
        this.H = i11;
        float f7 = org.telegram.messenger.i0.B(i10) >= 0.721f ? 0.0f : 1.0f;
        this.G = i0.b.f(org.telegram.messenger.i0.T1(0.05f, 0.12f, f7), i10, i11);
        this.F = i10;
        this.I = i0.b.f(org.telegram.messenger.i0.T1(0.12f, 0.22f, f7), i10, i11);
        int i12 = this.G;
        org.telegram.ui.Cells.y yVar = this.c;
        t6.H1(yVar, i12, false);
        t6.H1(yVar, this.I, true);
        this.e.invalidate();
        this.r.setTextColor(i11);
        this.s.setTextColor(t6.r1(0.6f, i11));
        ImageView imageView = this.f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.n.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        t6.H1(this.h, t6.r1(1.5f, this.I), true);
        int w9 = t6.w(i10, t6.r1(0.05f, i11));
        int w10 = t6.w(i10, t6.r1(0.55f, i11));
        x4 x4Var = this.a;
        SparseIntArray sparseIntArray = (SparseIntArray) x4Var.b;
        SparseIntArray sparseIntArray2 = (SparseIntArray) x4Var.b;
        sparseIntArray.put(t6.d6, this.F);
        sparseIntArray2.put(t6.G6, i11);
        sparseIntArray2.put(t6.e7, w9);
        sparseIntArray2.put(t6.f7, w10);
        sparseIntArray2.put(t6.G8, t6.r1(0.2f, i11));
        sparseIntArray2.put(t6.i6, t6.r1(org.telegram.messenger.i0.T1(0.05f, 0.12f, f7), i11));
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
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            ii iiVar = this.x;
            iiVar.f3.O(true);
            if (z10 != (!arrayList.isEmpty())) {
                iiVar.e3.h1(0, 0);
                return;
            }
            return;
        }
        c1 c1Var = new c1(new nc(5, this, z10));
        String str3 = g1.a().c;
        if (str3 != null) {
            StringBuilder t10 = a1.g.t(str3);
            t10.append(URLEncoder.encode(str));
            str2 = t10.toString();
        }
        this.O = c1Var.execute(str2);
    }

    public void setOpenProgress(float f7) {
        if (Math.abs(this.J - f7) > 1.0E-4f) {
            this.J = f7;
            int i10 = f7 <= 1.0E-4f ? 4 : 0;
            if (getImportantForAccessibility() != i10) {
                setImportantForAccessibility(i10);
            }
            invalidate();
        }
    }

    public void setOpened(boolean z10) {
        h hVar = this.D;
        boolean z11 = z10 && hVar != null;
        this.K = z11;
        if (z11) {
            hVar.a();
        }
    }
}
