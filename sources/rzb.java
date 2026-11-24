// default package

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class rzb extends fx0 implements gk7 {
    public static final String[] R1 = {"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.45 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.110 Safari/537.36", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:94.0) Gecko/20100101 Firefox/94.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:95.0) Gecko/20100101 Firefox/95.0", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.93 Safari/537.36", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/96.0.4664.55 Safari/537.36"};
    public static HashMap S1;
    public final Drawable A1;
    public final Drawable B1;
    public int C1;
    public int D1;
    public boolean E1;
    public boolean F1;
    public final czb G1;
    public final qzb H1;
    public final fib I1;
    public final qib J1;
    public final View K1;
    public final TextView L1;
    public d M1;
    public q8c N1;
    public boolean O1;
    public final lm P1;
    public Boolean Q1;
    public Integer l1;
    public final CharSequence m1;
    public final TLRPC.InputPeer n1;
    public final int o1;
    public final boolean p1;
    public final TL_iv.RichMessage q1;
    public final ig9 r1;
    public final ig9 s1;
    public final String t1;
    public String u1;
    public String v1;
    public final ozb w1;
    public final t8 x1;
    public final bzb y1;
    public final l46 z1;

    public rzb(Context context, String str, String str2, CharSequence charSequence, TLRPC.InputPeer inputPeer, int i, boolean z, TL_iv.RichMessage richMessage) {
        super(1, (wjb) null, context, false);
        this.E1 = bkb.I.o();
        this.O1 = true;
        this.u0 = 0;
        K();
        this.m1 = charSequence;
        this.n1 = inputPeer;
        this.o1 = i;
        this.p1 = z;
        this.q1 = richMessage;
        this.t1 = str;
        this.u1 = str2;
        kzb kzbVar = new kzb(this, context);
        this.b = kzbVar;
        this.P1 = new lm(320L, kzbVar, s33.h);
        t8 t8Var = new t8(context, (byte) 12);
        this.x1 = t8Var;
        t8Var.setPadding(gl.L(22.0f), gl.L(12.0f), gl.L(22.0f), gl.L(6.0f));
        t8Var.setTextSize(1, gba.S0);
        int i2 = bkb.i5;
        zkb.X(t8Var, i2, null);
        vkb K = zkb.K(0.2f, i2);
        zkb.n(t8Var, 2, K.a, -1, 2, K.d, null);
        t8Var.setText(vu3.m(charSequence == null ? "" : charSequence.toString(), t8Var.getPaint().getFontMetricsInt(), true, null, 0));
        this.y1 = new bzb(context);
        l46 l46Var = new l46(context, null);
        this.z1 = l46Var;
        l46Var.setDisablePaddingsOffsetY(true);
        l46Var.setPadding(gl.L(22.0f), gl.L(12.0f), gl.L(22.0f), gl.L(6.0f));
        l46Var.setTextSize(1, gba.S0);
        zkb.X(l46Var, i2, null);
        zkb.G(l46Var, bkb.Wc, null);
        l46Var.setTextIsSelectable(true);
        zkb.C(l46Var, bkb.kg, null);
        int v0 = bkb.v0(bkb.lg, this.J0);
        this.D1 = v0;
        try {
            if (Build.VERSION.SDK_INT >= 29 && !nye.b()) {
                Drawable textSelectHandleLeft = l46Var.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(v0, mode);
                l46Var.setTextSelectHandleLeft(textSelectHandleLeft);
                this.A1 = textSelectHandleLeft;
                Drawable textSelectHandleRight = l46Var.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(v0, mode);
                l46Var.setTextSelectHandleRight(textSelectHandleRight);
                this.B1 = textSelectHandleRight;
            }
        } catch (Exception unused) {
        }
        this.y1.addView(this.z1, nme.c(-1.0f, -1));
        if (this.q1 != null) {
            ig9 ig9Var = new ig9(this.a, null, context);
            this.r1 = ig9Var;
            ig9Var.setPadding(gl.L(22.0f), gl.L(12.0f), gl.L(22.0f), gl.L(6.0f));
            ig9Var.set(this.q1);
            ig9Var.setTranslationLoading(true);
            ig9 ig9Var2 = new ig9(this.a, null, context);
            this.s1 = ig9Var2;
            ig9Var2.setPadding(gl.L(22.0f), gl.L(12.0f), gl.L(22.0f), gl.L(6.0f));
        }
        czb czbVar = new czb(this, context);
        this.G1 = czbVar;
        czbVar.setOverScrollMode(1);
        czbVar.setPadding(0, gl.L(56.0f) + gl.m, 0, gl.L(80.0f));
        czbVar.setClipToPadding(true);
        t26 t26Var = new t26();
        czbVar.setLayoutManager(t26Var);
        View view = this.q1 != null ? this.r1 : this.x1;
        qzb qzbVar = new qzb();
        qzbVar.e = 1;
        qzbVar.c = context;
        qzbVar.d = view;
        this.H1 = qzbVar;
        czbVar.setAdapter(qzbVar);
        czbVar.setOnScrollListener(new dzb(this));
        ezb ezbVar = new ezb(this);
        ezbVar.n(180L);
        ezbVar.o(new LinearInterpolator());
        czbVar.setItemAnimator(ezbVar);
        this.b.addView(czbVar, nme.e(-1, -2, 80));
        fib fibVar = new fib();
        this.I1 = fibVar;
        fibVar.Q(czbVar);
        fibVar.z0 = t26Var;
        qib m = fibVar.m(context);
        this.J1 = m;
        gl.B2(m);
        this.b.addView(m, nme.e(-1, -1, kk7.D1));
        ig9 ig9Var3 = this.s1;
        if (ig9Var3 != null) {
            ig9Var3.setTextSelectionHelper(fibVar);
        }
        ozb ozbVar = new ozb(this, context);
        this.w1 = ozbVar;
        this.b.addView(ozbVar, nme.e(-1, 78, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        zkb.h(bkb.g5, null, frameLayout);
        View view2 = new View(context);
        this.K1 = view2;
        zkb.h(bkb.U5, null, view2);
        view2.setAlpha(0.0f);
        frameLayout.addView(view2, nme.a(-1.0f, gl.e1() / gl.N(1.0f), 55));
        TextView textView = new TextView(context);
        this.L1 = textView;
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setGravity(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(17);
        zkb.X(textView, bkb.Ii, null);
        textView.setTypeface(gl.o());
        textView.setTextSize(1, 14.0f);
        textView.setText(k96.M0(2131752025, null));
        int w0 = bkb.w0(null, bkb.Ei, false);
        this.C1 = w0;
        textView.setBackground(sjb.e(w0, 24.0f));
        textView.setOnClickListener(new bna(this, (byte) 23));
        frameLayout.addView(textView, nme.d(-1, 48.0f, 87, 16.0f, 16.0f, 16.0f, 16.0f));
        this.b.addView(frameLayout, nme.e(-1, -2, 87));
        S0();
    }

    public static void D0(String str, String str2, String str3, i8c i8cVar) {
        if (str2 == null) {
            cme.b(str, new azb(i8cVar, str, str3), new azb(i8cVar, str, str3), false);
            return;
        }
        String encode = Uri.encode(str);
        if (encode.length() <= 5000) {
            new gzb(str2, str3, encode, i8cVar).start();
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < encode.length()) {
            int min = Math.min(i + 5000, encode.length());
            int i2 = min - 1;
            int lastIndexOf = encode.lastIndexOf("%0A", i2);
            if (lastIndexOf < i) {
                lastIndexOf = -1;
            }
            if (lastIndexOf == -1) {
                int lastIndexOf2 = encode.lastIndexOf("%20", i2);
                lastIndexOf = lastIndexOf2 >= i ? lastIndexOf2 : -1;
            }
            if (lastIndexOf != -1) {
                min = lastIndexOf + 3;
            }
            arrayList.add(encode.substring(i, min));
            i = min;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(null);
        }
        boolean[] zArr = new boolean[1];
        int i4 = 0;
        while (i4 < arrayList.size()) {
            i8c i8cVar2 = i8cVar;
            new gzb(str2, str3, (String) arrayList.get(i4), new e((Object) zArr, (Object) arrayList2, i4, (Object) i8cVar2, (byte) 9)).start();
            i4++;
            i8cVar = i8cVar2;
        }
    }

    public static String E0(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static String G0() {
        return na7.c1().getString("translate_to_language", k96.D0().y.getLanguage());
    }

    public static HashMap H0(CharSequence charSequence) {
        HashMap hashMap = new HashMap();
        if (charSequence != null) {
            ArrayList j = vu3.j(charSequence, null);
            String charSequence2 = charSequence.toString();
            for (int i = 0; i < j.size(); i++) {
                tu3 tu3Var = (tu3) j.get(i);
                if (tu3Var != null && tu3Var.c != null) {
                    String substring = charSequence2.substring(tu3Var.a, tu3Var.b);
                    ArrayList arrayList = (ArrayList) hashMap.get(substring);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(substring, arrayList);
                    }
                    arrayList.add(tu3Var);
                }
            }
        }
        return hashMap;
    }

    public static String J0(String str, boolean[] zArr, boolean[] zArr2) {
        i96 i96Var;
        String str2;
        if (str == null || str.equals("und") || str.equals("auto")) {
            return null;
        }
        String str3 = str.split("_")[0];
        if ("nb".equals(str3)) {
            str3 = "no";
        }
        if (zArr != null) {
            String N0 = k96.N0("TranslateLanguage" + str3.toUpperCase());
            boolean startsWith = N0.startsWith("LOC_ERR");
            zArr[0] = startsWith ^ true;
            if (!startsWith) {
                return N0;
            }
        }
        if (zArr2 != null) {
            String N02 = k96.N0("TranslateLanguageGenitive" + str3.toUpperCase());
            boolean startsWith2 = N02.startsWith("LOC_ERR");
            zArr2[0] = startsWith2 ^ true;
            if (!startsWith2) {
                return N02;
            }
        }
        String R0 = R0(str, false);
        if (R0 == null) {
            R0 = R0(str3, false);
        }
        if (R0 != null) {
            return R0;
        }
        if ("no".equals(str)) {
            str = "nb";
        }
        i96 i96Var2 = k96.D0().B;
        Iterator it = k96.D0().N.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                i96Var = null;
                break;
            }
            i96Var = (i96) it.next();
            String str4 = i96Var.d;
            if (str4 != null && str4.equals("remote") && ((str2 = i96Var.c) == null || !str2.endsWith("_raw"))) {
                String str5 = i96Var.f;
                if (str5 != null && str5.equals(str)) {
                    break;
                }
            }
        }
        if (i96Var == null) {
            return null;
        }
        return (i96Var2 == null || !"en".equals(i96Var2.f)) ? i96Var.a : i96Var.b;
    }

    public static String K0(String str) {
        String J0 = J0(str, null, null);
        if (J0 == null) {
            return null;
        }
        return J0.substring(0, 1).toUpperCase() + J0.substring(1);
    }

    public static TLRPC.TL_textWithEntities L0(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_textWithEntities tL_textWithEntities2) {
        tu3 tu3Var;
        ArrayList<TLRPC.MessageEntity> arrayList;
        if (tL_textWithEntities2 == null || tL_textWithEntities2.text == null) {
            return null;
        }
        for (int i = 0; i < tL_textWithEntities2.entities.size(); i++) {
            TLRPC.MessageEntity messageEntity = tL_textWithEntities2.entities.get(i);
            if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                if (messageEntity.url != null) {
                    String str = tL_textWithEntities2.text;
                    int i2 = messageEntity.offset;
                    String substring = str.substring(i2, messageEntity.length + i2);
                    if (TextUtils.equals(substring, messageEntity.url)) {
                        TLRPC.TL_messageEntityUrl tL_messageEntityUrl = new TLRPC.TL_messageEntityUrl();
                        tL_messageEntityUrl.offset = messageEntity.offset;
                        tL_messageEntityUrl.length = messageEntity.length;
                        tL_textWithEntities2.entities.set(i, tL_messageEntityUrl);
                    } else if (messageEntity.url.startsWith("https://t.me/") && substring.startsWith("@") && TextUtils.equals(substring.substring(1), messageEntity.url.substring(13))) {
                        TLRPC.TL_messageEntityMention tL_messageEntityMention = new TLRPC.TL_messageEntityMention();
                        tL_messageEntityMention.offset = messageEntity.offset;
                        tL_messageEntityMention.length = messageEntity.length;
                        tL_textWithEntities2.entities.set(i, tL_messageEntityMention);
                    }
                }
            } else if ((messageEntity instanceof TLRPC.TL_messageEntityPre) && tL_textWithEntities != null && (arrayList = tL_textWithEntities.entities) != null && i < arrayList.size() && (tL_textWithEntities.entities.get(i) instanceof TLRPC.TL_messageEntityPre)) {
                messageEntity.language = tL_textWithEntities.entities.get(i).language;
            }
        }
        if (tL_textWithEntities != null && tL_textWithEntities.text != null && !tL_textWithEntities.entities.isEmpty()) {
            HashMap H0 = H0(tL_textWithEntities.text);
            HashMap H02 = H0(tL_textWithEntities2.text);
            for (int i3 = 0; i3 < tL_textWithEntities.entities.size(); i3++) {
                TLRPC.MessageEntity messageEntity2 = tL_textWithEntities.entities.get(i3);
                if (messageEntity2 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                    String str2 = tL_textWithEntities.text;
                    int i4 = messageEntity2.offset;
                    String substring2 = str2.substring(i4, messageEntity2.length + i4);
                    if (!TextUtils.isEmpty(substring2)) {
                        ArrayList arrayList2 = (ArrayList) H0.get(substring2);
                        ArrayList arrayList3 = (ArrayList) H02.get(substring2);
                        if (arrayList2 != null && arrayList3 != null) {
                            int i5 = 0;
                            while (true) {
                                if (i5 >= arrayList2.size()) {
                                    i5 = -1;
                                    break;
                                }
                                tu3 tu3Var2 = (tu3) arrayList2.get(i5);
                                int i6 = tu3Var2.a;
                                int i7 = messageEntity2.offset;
                                if (i6 == i7 && tu3Var2.b == i7 + messageEntity2.length) {
                                    break;
                                }
                                i5++;
                            }
                            if (i5 >= 0 && i5 < arrayList3.size() && (tu3Var = (tu3) arrayList3.get(i5)) != null) {
                                int i8 = tu3Var.b;
                                int i9 = tu3Var.a;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= tL_textWithEntities2.entities.size()) {
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji2 = (TLRPC.TL_messageEntityCustomEmoji) messageEntity2;
                                        tL_messageEntityCustomEmoji.document_id = tL_messageEntityCustomEmoji2.document_id;
                                        tL_messageEntityCustomEmoji.document = tL_messageEntityCustomEmoji2.document;
                                        tL_messageEntityCustomEmoji.offset = i9;
                                        tL_messageEntityCustomEmoji.length = i8 - i9;
                                        tL_textWithEntities2.entities.add(tL_messageEntityCustomEmoji);
                                        break;
                                    }
                                    TLRPC.MessageEntity messageEntity3 = tL_textWithEntities2.entities.get(i10);
                                    if (messageEntity3 instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        int i11 = messageEntity3.offset;
                                        if (!gl.z1(i9, i8, i11, messageEntity3.length + i11)) {
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                    }
                }
            }
        }
        return tL_textWithEntities2;
    }

    public static void O0(String str) {
        na7.c1().edit().putString("translate_to_language", str).apply();
    }

    public static hzb P0(Activity activity, mu1 mu1Var, TLRPC.InputPeer inputPeer, int i, boolean z, String str, String str2, CharSequence charSequence, boolean z2, bm1 bm1Var, Runnable runnable) {
        hzb hzbVar = new hzb(activity, str, str2, charSequence, inputPeer, i, z, runnable);
        hzbVar.N0(z2);
        hzbVar.M1 = mu1Var;
        hzbVar.N1 = bm1Var;
        if (mu1Var.getParentActivity() != null) {
            mu1Var.showDialog(hzbVar);
        }
        return hzbVar;
    }

    public static void Q0(Context context, d dVar, String str, String str2, CharSequence charSequence, z02 z02Var, cib cibVar) {
        if (context == null) {
            return;
        }
        jzb jzbVar = new jzb(context, str, str2, charSequence, cibVar);
        jzbVar.N0(false);
        jzbVar.M1 = dVar;
        jzbVar.N1 = z02Var;
        if (dVar == null) {
            jzbVar.show();
        } else if (dVar.getParentActivity() != null) {
            dVar.showDialog(jzbVar);
        }
    }

    public static String R0(String str, boolean z) {
        if (str == null) {
            return null;
        }
        if (S1 == null) {
            S1 = new HashMap();
            try {
                Locale[] availableLocales = Locale.getAvailableLocales();
                for (int i = 0; i < availableLocales.length; i++) {
                    S1.put(availableLocales[i].getLanguage(), availableLocales[i]);
                    String country = availableLocales[i].getCountry();
                    if (country != null && country.length() > 0) {
                        S1.put(availableLocales[i].getLanguage() + "-" + country.toLowerCase(), availableLocales[i]);
                    }
                }
            } catch (Exception unused) {
            }
        }
        String lowerCase = str.replace("_", "-").toLowerCase();
        try {
            Locale locale = (Locale) S1.get(lowerCase);
            if (locale == null) {
                return null;
            }
            String displayLanguage = locale.getDisplayLanguage(z ? locale : Locale.getDefault());
            if (!lowerCase.contains("-")) {
                return displayLanguage;
            }
            String displayCountry = locale.getDisplayCountry(z ? locale : Locale.getDefault());
            if (TextUtils.isEmpty(displayCountry)) {
                return displayLanguage;
            }
            return displayLanguage + " (" + displayCountry + ")";
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // fx0
    public final boolean D() {
        return false;
    }

    public final float F0(boolean z) {
        lm lmVar;
        czb czbVar = this.G1;
        float top = czbVar.getTop();
        if (czbVar.getChildCount() >= 1) {
            top += Math.max(0, czbVar.getChildAt(czbVar.getChildCount() - 1).getTop());
        }
        float max = Math.max(0.0f, top - gl.L(78.0f));
        if (z && (lmVar = this.P1) != null) {
            if (!czbVar.J1 && !this.F1) {
                return lmVar.e(false, max);
            }
            lmVar.e(true, max);
        }
        return max;
    }

    @Override // fx0
    public final void I() {
        if (this.l1 != null) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.l1.intValue(), true);
            this.l1 = null;
        }
        super.I();
    }

    public final boolean I0() {
        czb czbVar;
        float f = 0.0f;
        int i = 0;
        while (true) {
            czbVar = this.G1;
            if (i >= czbVar.getChildCount()) {
                break;
            }
            if (RecyclerView.R(czbVar.getChildAt(i)) == 1) {
                f += r3.getHeight();
            }
            i++;
        }
        return f >= ((float) ((czbVar.getHeight() - czbVar.getPaddingTop()) - czbVar.getPaddingBottom()));
    }

    public final CharSequence M0(CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        if (this.N1 != null || this.M1 != null) {
            for (URLSpan uRLSpan : (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class)) {
                int spanStart = spannableStringBuilder.getSpanStart(uRLSpan);
                int spanEnd = spannableStringBuilder.getSpanEnd(uRLSpan);
                if (spanStart != -1 && spanEnd != -1) {
                    spannableStringBuilder.removeSpan(uRLSpan);
                    spannableStringBuilder.setSpan(new q1((Object) this, (Object) uRLSpan, (byte) 9), spanStart, spanEnd, 33);
                }
            }
        }
        return vu3.m(spannableStringBuilder, this.z1.getPaint().getFontMetricsInt(), true, null, 0);
    }

    public final void N0(boolean z) {
        l46 l46Var = this.z1;
        if (l46Var != null) {
            l46Var.setTextIsSelectable(!z);
        }
        if (z) {
            getWindow().addFlags(TLObject.FLAG_13);
            gl.f2();
        } else {
            getWindow().clearFlags(TLObject.FLAG_13);
            gl.f2();
        }
    }

    public final void S0() {
        if (this.l1 != null) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.l1.intValue(), true);
            this.l1 = null;
        }
        if ("alternative".equalsIgnoreCase(na7.q1(this.a).k4.J2.f)) {
            T0();
            return;
        }
        String str = this.u1;
        byte b = 0;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        if (this.q1 != null && this.n1 != null) {
            TLRPC.TL_messages_translateRichMessage tL_messages_translateRichMessage = new TLRPC.TL_messages_translateRichMessage();
            tL_messages_translateRichMessage.flags |= 1;
            tL_messages_translateRichMessage.peer = this.n1;
            tL_messages_translateRichMessage.id.add(Integer.valueOf(this.o1));
            tL_messages_translateRichMessage.to_lang = b1c.D(str);
            this.l1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_translateRichMessage, new wx9(this, (byte) 16)));
            return;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence charSequence = this.m1;
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.p1 && this.n1 != null) {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.peer = this.n1;
            tL_messages_summarizeText.id = this.o1;
            tL_messages_summarizeText.to_lang = b1c.D(str);
            this.l1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_summarizeText, new hc(b), new w77(this, tL_textWithEntities, (byte) 15)));
            return;
        }
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        TLRPC.InputPeer inputPeer = this.n1;
        int i = tL_messages_translateText.flags;
        if (inputPeer != null) {
            tL_messages_translateText.flags = i | 1;
            tL_messages_translateText.peer = inputPeer;
            tL_messages_translateText.id.add(Integer.valueOf(this.o1));
        } else {
            tL_messages_translateText.flags = i | 2;
            tL_messages_translateText.text.add(tL_textWithEntities);
        }
        tL_messages_translateText.to_lang = b1c.D(str);
        this.l1 = Integer.valueOf(ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_translateText, new apa(this, tL_textWithEntities, (byte) 17)));
    }

    public final void T0() {
        CharSequence charSequence = this.m1;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        String str = this.t1;
        if (str != null) {
            str = str.split("_")[0];
        }
        if ("nb".equals(str)) {
            str = "no";
        }
        String str2 = this.u1;
        if (str2 != null) {
            str2 = str2.split("_")[0];
        }
        D0(charSequence2, str, "nb".equals(str2) ? "no" : str2, new n4b(this, (byte) 8));
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            this.x1.invalidate();
            this.z1.invalidate();
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public void dismiss() {
        super.dismiss();
        kk7.e().n(this, kk7.k4);
        kk7.e().n(this, kk7.K5);
        kk7.e().n(this, kk7.J5);
    }

    @Override // fx0
    public final void p0() {
        try {
            super.p0();
            int w0 = bkb.w0(null, bkb.Ei, false);
            TextView textView = this.L1;
            if (textView != null && (w0 != this.C1 || this.E1 != bkb.I.o())) {
                this.C1 = w0;
                this.E1 = bkb.I.o();
                textView.setBackground(sjb.e(w0, 24.0f));
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            int v0 = bkb.v0(bkb.lg, this.J0);
            if (v0 != this.D1) {
                this.D1 = v0;
                Drawable drawable = this.A1;
                if (drawable != null) {
                    drawable.setColorFilter(v0, PorterDuff.Mode.SRC_IN);
                }
                Drawable drawable2 = this.B1;
                if (drawable2 != null) {
                    drawable2.setColorFilter(v0, PorterDuff.Mode.SRC_IN);
                }
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        super.show();
        kk7.e().b(this, kk7.k4);
        kk7.e().b(this, kk7.K5);
        kk7.e().b(this, kk7.J5);
    }
}
