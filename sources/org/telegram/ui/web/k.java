package org.telegram.ui.web;

import ai.i3;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.nn;
import org.telegram.ui.eb1;
import w7.b6;
import w7.z5;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class k extends FrameLayout {
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
    public final o0.a a;
    public boolean b;
    public final org.telegram.ui.Cells.z c;
    public final FrameLayout d;
    public final FrameLayout e;
    public final ImageView f;
    public final org.telegram.ui.Cells.z h;
    public final ImageView n;
    public final TextView r;
    public final TextView s;
    public final nn v;
    public final c w;
    public final ArrayList x;
    public final i y;

    public k(Activity activity) {
        super(activity);
        int i10 = UserConfig.selectedAccount;
        this.x = new ArrayList();
        this.J = 0.0f;
        setWillNotDraw(false);
        int i11 = UserConfig.selectedAccount;
        hi.a aVar = new hi.a(this, 6);
        a aVar2 = new a(this);
        o0.a aVar3 = new o0.a((d6) null);
        this.a = aVar3;
        c cVar = new c(this, activity, i11, aVar, aVar2, aVar3);
        this.w = cVar;
        cVar.f3.r = false;
        cVar.setOverScrollMode(2);
        cVar.setPadding(0, 0, 0, 0);
        addView(cVar, z5.e(-1, -1, 119));
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.e = frameLayout2;
        org.telegram.ui.Cells.z Z = i6.Z(this.G, this.I, 15, 15);
        this.c = Z;
        frameLayout2.setBackground(Z);
        b6.b(frameLayout2, 0.04f, 1.25f);
        frameLayout.addView(frameLayout2, z5.d(-1, -2.0f, 7, 12.0f, 0.0f, 12.0f, 15.0f));
        ImageView imageView = new ImageView(activity);
        this.f = imageView;
        frameLayout2.addView(imageView, z5.d(24, 24.0f, 19, 16.0f, 16.0f, 16.0f, 16.0f));
        ImageView imageView2 = new ImageView(activity);
        this.n = imageView2;
        b6.a(imageView2);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.msg_copy);
        org.telegram.ui.Cells.z Z2 = i6.Z(0, 0, 6, 6);
        this.h = Z2;
        imageView2.setBackground(Z2);
        frameLayout2.addView(imageView2, z5.d(32, 32.0f, 53, 14.0f, 14.0f, 14.0f, 14.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout, z5.d(-1, -2.0f, 16, 54.0f, 9.0f, 54.0f, 9.0f));
        TextView textView = new TextView(activity);
        this.r = textView;
        textView.setTextSize(1, 16.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setMaxLines(4);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, z5.t(-1, -2, 55, 0, 0, 0, 2));
        TextView textView2 = new TextView(activity);
        this.s = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setMaxLines(3);
        textView2.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        linearLayout.addView(textView2, z5.t(-1, -2, 55, 0, 0, 0, 0));
        this.y = new i(null, i10, new i2.h0(this, 27));
        this.v = new nn(activity, 28);
        int i12 = i6.Pk;
        c(i6.w0(null, i12, false), AndroidUtilities.computePerceivedBrightness(i6.w0(null, i12, false)) >= 0.721f ? -16777216 : -1);
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
        j jVar = null;
        String string = sharedPreferences.getString("queries_json", null);
        ArrayList arrayList = new ArrayList();
        if (string != null) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    j jVar2 = new j(jSONObject.optString("name"), jSONObject.optLong("usage", System.currentTimeMillis()));
                    jVar2.c = jSONObject.optDouble("rank", 0.0d);
                    arrayList.add(jVar2);
                }
                Collections.sort(arrayList, new eb1(4));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        int i11 = 0;
        while (true) {
            try {
                if (i11 >= arrayList.size()) {
                    break;
                }
                j jVar3 = (j) arrayList.get(i11);
                if (TextUtils.equals(jVar3.a, str)) {
                    jVar = jVar3;
                    break;
                }
                i11++;
            } catch (Exception e10) {
                FileLog.e(e10);
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (jVar != null) {
            jVar.c += Math.exp((currentTimeMillis - jVar.b) / 2419200.0d);
        } else {
            jVar = new j(str, currentTimeMillis);
            arrayList.add(jVar);
        }
        jVar.b = currentTimeMillis;
        JSONArray jSONArray2 = new JSONArray();
        for (int i12 = 0; i12 < Math.min(arrayList.size(), 20); i12++) {
            j jVar4 = (j) arrayList.get(i12);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", jVar4.a);
            jSONObject2.put("rank", jVar4.c);
            jSONObject2.put("usage", jVar4.b);
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
        i6.B1(zVar, i12, false);
        i6.B1(zVar, this.I, true);
        this.e.invalidate();
        this.r.setTextColor(i11);
        this.s.setTextColor(i6.l1(0.6f, i11));
        ImageView imageView = this.f;
        if (imageView.getColorFilter() != null) {
            imageView.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        this.n.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        i6.B1(this.h, i6.l1(1.5f, this.I), true);
        int v = i6.v(i10, i6.l1(0.05f, i11));
        int v9 = i6.v(i10, i6.l1(0.55f, i11));
        o0.a aVar = this.a;
        SparseIntArray sparseIntArray = (SparseIntArray) aVar.b;
        SparseIntArray sparseIntArray2 = (SparseIntArray) aVar.b;
        sparseIntArray.put(i6.d6, this.F);
        sparseIntArray2.put(i6.G6, i11);
        sparseIntArray2.put(i6.e7, v);
        sparseIntArray2.put(i6.f7, v9);
        sparseIntArray2.put(i6.G8, i6.l1(0.2f, i11));
        sparseIntArray2.put(i6.i6, i6.l1(AndroidUtilities.lerp(0.05f, 0.12f, f7), i11));
        this.w.g1();
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
        i iVar = this.y;
        if (iVar == null || !this.K) {
            return;
        }
        iVar.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.y;
        if (iVar != null) {
            iVar.c();
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
            c cVar = this.w;
            cVar.f3.N(true);
            if (z10 != (!arrayList.isEmpty())) {
                cVar.e3.h1(0, 0);
                return;
            }
            return;
        }
        j1 j1Var = new j1(new i3(7, this, z10));
        String str3 = o1.a().c;
        if (str3 != null) {
            StringBuilder v = a4.a.v(str3);
            v.append(URLEncoder.encode(str));
            str2 = v.toString();
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
        i iVar = this.y;
        boolean z11 = z10 && iVar != null;
        this.K = z11;
        if (z11) {
            iVar.a();
        }
    }
}
