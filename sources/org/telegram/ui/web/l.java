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
import bi.ve;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.qn;
import w7.a6;
import w7.c6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class l extends FrameLayout {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public float J;
    public boolean K;
    public org.telegram.ui.z L;
    public org.telegram.ui.s M;
    public org.telegram.ui.s N;
    public AsyncTask O;
    public final n7.a1 a;
    public boolean b;
    public final org.telegram.ui.Cells.z c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f;
    public final org.telegram.ui.Cells.z h;
    public final ImageView n;
    public final TextView r;
    public final TextView s;
    public final qn v;
    public final d w;
    public final ArrayList x;
    public final j y;

    public l(Activity activity) {
        super(activity);
        int i10 = UserConfig.selectedAccount;
        this.x = new ArrayList();
        this.J = 0.0f;
        setWillNotDraw(false);
        int i11 = UserConfig.selectedAccount;
        gi.a aVar = new gi.a(this, 6);
        a aVar2 = new a(this);
        n7.a1 a1Var = new n7.a1((f6) null);
        this.a = a1Var;
        d dVar = new d(this, activity, i11, aVar, aVar2, a1Var);
        this.w = dVar;
        dVar.Y2.r = false;
        dVar.setOverScrollMode(2);
        dVar.setPadding(0, 0, 0, 0);
        addView(dVar, a6.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        org.telegram.ui.Cells.z Z = j6.Z(this.G, this.I, 15, 15);
        this.c = Z;
        frameLayout2.setBackground(Z);
        c6.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, a6.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f = imageView;
        frameLayout2.addView(imageView, a6.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.n = imageView2;
        c6.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.z Z2 = j6.Z(0, 0, 6, 6);
        this.h = Z2;
        imageView2.setBackground(Z2);
        frameLayout2.addView(imageView2, a6.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, a6.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, a6.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, a6.t(-1, -2, 55, 0, 0, 0, 0));
        this.y = new j(null, i10, new org.telegram.ui.Components.voip.x(this, 9));
        this.v = new qn(activity, 27);
        int i12 = j6.Pk;
        c(j6.w0(null, i12, false), AndroidUtilities.computePerceivedBrightness(j6.w0(null, i12, false)) >= 0.721f ? -16777216 : -1);
        setOpenProgress(0.0f);
        setImportantForAccessibility(4);
    }

    public static String a(MessageObject messageObject) {
        TLRPC.Message message = messageObject.messageOwner;
        if (message != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                return messageMedia.webpage.url;
            }
        }
        CharSequence charSequence = messageObject.messageText;
        if (charSequence == null || charSequence.length() <= 0) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(messageObject.messageText);
        for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
            String url = uRLSpan.getURL();
            if (url != null && !url.startsWith("@") && !url.startsWith("#") && !url.startsWith("$")) {
                return url;
            }
        }
        return null;
    }

    public static void b(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("webhistory", 0);
        k kVar = null;
        String string = sharedPreferences.getString("queries_json", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    k kVar2 = new k(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    kVar2.c = jSONObject.optDouble("rank", 0.0d);
                    arrayList.add(kVar2);
                }
                Collections.sort(arrayList, new m9(27));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        int i11 = 0;
        while (true) {
            try {
                if (i11 >= arrayList.size()) {
                    break;
                }
                k kVar3 = (k) arrayList.get(i11);
                if (TextUtils.equals(kVar3.a, str)) {
                    kVar = kVar3;
                    break;
                }
                i11++;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (kVar != null) {
            kVar.c += Math.exp((currentTimeMillis - kVar.b) / 2419200.0d);
        } else {
            kVar = new k(str, currentTimeMillis);
            arrayList.add(kVar);
        }
        kVar.b = currentTimeMillis;
        JSONArray jSONArray2 = new JSONArray();
        for (int i12 = 0; i12 < Math.min(arrayList.size(), 20); i12++) {
            k kVar4 = (k) arrayList.get(i12);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", kVar4.a);
            jSONObject2.put("rank", kVar4.c);
            jSONObject2.put("usage", kVar4.b);
            jSONArray2.put(jSONObject2);
        }
        sharedPreferences.edit().putString("queries_json", jSONArray2.toString()).apply();
    }

    public final void c(int i10, int i11) {
        if (this.E != i10) {
            this.E = i10;
            invalidate();
        }
        this.H = i11;
        float f7 = AndroidUtilities.computePerceivedBrightness(i10) >= 0.721f ? 0.0f : 1.0f;
        this.G = i0.a.d(AndroidUtilities.lerp(0.05f, 0.12f, f7), i10, i11);
        this.F = i10;
        this.I = i0.a.d(AndroidUtilities.lerp(0.12f, 0.22f, f7), i10, i11);
        int i12 = this.G;
        org.telegram.ui.Cells.z zVar = this.c;
        j6.B1(zVar, i12, false);
        j6.B1(zVar, this.I, true);
        this.e.invalidate();
        this.r.setTextColor(i11);
        this.s.setTextColor(j6.l1(0.6f, i11));
        ImageView imageView = this.f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.n.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        j6.B1(this.h, j6.l1(1.5f, this.I), true);
        int v = j6.v(i10, j6.l1(0.05f, i11));
        int v9 = j6.v(i10, j6.l1(0.55f, i11));
        n7.a1 a1Var = this.a;
        SparseIntArray sparseIntArray = (SparseIntArray) a1Var.b;
        SparseIntArray sparseIntArray2 = (SparseIntArray) a1Var.b;
        sparseIntArray.put(j6.d6, this.F);
        sparseIntArray2.put(j6.G6, i11);
        sparseIntArray2.put(j6.e7, v);
        sparseIntArray2.put(j6.f7, v9);
        sparseIntArray2.put(j6.G8, j6.l1(0.2f, i11));
        sparseIntArray2.put(j6.i6, j6.l1(AndroidUtilities.lerp(0.05f, 0.12f, f7), i11));
        this.w.e1();
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
        j jVar = this.y;
        if (jVar == null || !this.K) {
            return;
        }
        jVar.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.y;
        if (jVar != null) {
            jVar.c();
        }
    }

    public void setInput(String str) {
        AsyncTask asyncTask = this.O;
        String str2 = null;
        if (asyncTask != null) {
            asyncTask.cancel(true);
            this.O = null;
        }
        ArrayList arrayList = this.x;
        boolean z10 = !arrayList.isEmpty();
        if (TextUtils.isEmpty(str)) {
            arrayList.clear();
            d dVar = this.w;
            dVar.Y2.N(true);
            if (z10 != (!arrayList.isEmpty())) {
                dVar.X2.h1(0, 0);
                return;
            }
            return;
        }
        j1 j1Var = new j1(new ve(3, this, z10));
        String str3 = o1.a().c;
        if (str3 != null) {
            StringBuilder u10 = a4.a.u(str3);
            u10.append(URLEncoder.encode(str));
            str2 = u10.toString();
        }
        this.O = j1Var.execute(str2);
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
        j jVar = this.y;
        boolean z11 = z10 && jVar != null;
        this.K = z11;
        if (z11) {
            jVar.a();
        }
    }
}
