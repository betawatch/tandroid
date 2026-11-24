// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class qrc extends FrameLayout implements vlb {
    public static final d53 T = d53.h;
    public int E;
    public final ylb F;
    public final boolean G;
    public final ArrayList H;
    public ValueAnimator I;
    public float J;
    public float K;
    public String L;
    public final ArrayList M;
    public float N;
    public float O;
    public float P;
    public String Q;
    public String R;
    public boolean S;
    public int a;
    public final LinearLayout b;
    public final mrc c;
    public final npc d;
    public final FrameLayout e;
    public final TextView f;
    public final rj h;
    public ValueAnimator n;
    public zna r;
    public zna s;
    public boolean w;
    public boolean x;
    public boolean y;

    public qrc(Context context, ylb ylbVar) {
        super(context);
        int i = cmb.Ei;
        this.a = i;
        this.H = new ArrayList();
        this.J = 1.0f;
        this.L = "";
        this.M = new ArrayList();
        this.P = 0.5f;
        this.Q = ",";
        this.R = ".";
        this.F = ylbVar;
        this.G = true;
        setClipChildren(false);
        setClipToPadding(false);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutDirection(0);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, qoe.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(gm.L(1.0f));
        linearLayout.addView(frameLayout, qoe.r(59, 60, 16));
        this.E = gm.L(59.0f);
        npc npcVar = new npc(60, context, true);
        this.d = npcVar;
        npcVar.g();
        frameLayout.addView(npcVar, qoe.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i2 = cmb.y6;
        anb.X(textView, i2, ylbVar);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(gm.n1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, qoe.e(-2, 60, 19));
        mrc mrcVar = new mrc(this, context);
        this.c = mrcVar;
        anb.X(mrcVar, cmb.F6, ylbVar);
        anb.D(mrcVar, i2, ylbVar);
        mrcVar.setHint("0");
        mrcVar.setTextSize(1, 44.0f);
        mrcVar.setTypeface(gm.n1("fonts/gram.ttf"));
        mrcVar.setIncludeFontPadding(false);
        mrcVar.setSingleLine(true);
        mrcVar.setGravity(21);
        mrcVar.setBackground(null);
        mrcVar.setPadding(gm.L(3.0f), 0, gm.L(3.0f), 0);
        mrcVar.setMinWidth(gm.L(24.0f));
        mrcVar.setHorizontallyScrolling(true);
        mrcVar.setCursorWidth(3.0f);
        mrcVar.setCursorSize(gm.L(48.0f));
        cmb.v0(i, ylbVar);
        anb.l(mrcVar, 30, i, ylbVar);
        anb.l(mrcVar, 36, i, ylbVar);
        wmb K = anb.K(0.3f, i);
        anb.n(mrcVar, 3, K.a, -1, 2, K.d, ylbVar);
        mrcVar.setAllowDrawCursor(true);
        mrcVar.setInputType(8194);
        mrcVar.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        mrcVar.setImeOptions(33554438);
        linearLayout.addView(mrcVar, qoe.r(-2, 60, 16));
        rj rjVar = new rj(context, false, true, false, true, true);
        this.h = rjVar;
        rjVar.c.m(0.35f, 420L, 3.5f, d53.h);
        rjVar.setScaleProperty(0.2f);
        rjVar.setAllowCancel(true);
        rjVar.getDrawable().c0 = new cpc(rjVar, (byte) 5);
        rjVar.setTextColor(cmb.v0(this.a, ylbVar));
        rjVar.setTextSize(gm.L(28.0f));
        rjVar.setTypeface(gm.n1("fonts/gram.ttf"));
        rjVar.setGravity(3);
        rjVar.getDrawable().T = false;
        rjVar.c(jb6.M0(2131749290, null), false, true);
        linearLayout.addView(rjVar, qoe.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new kpc(this, (byte) 2));
        mrcVar.addTextChangedListener(new l12(this, (byte) 1));
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        zna znaVar = this.r;
        if (znaVar != null) {
            znaVar.d();
        }
        zna znaVar2 = this.s;
        if (znaVar2 != null) {
            znaVar2.d();
        }
        TextView textView = this.f;
        npc npcVar = this.d;
        FrameLayout frameLayout = this.e;
        if (!z) {
            npcVar.setAlpha(this.x ? 0.0f : 1.0f);
            textView.setAlpha(this.y ? 1.0f : 0.0f);
            npcVar.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            npcVar.setEnabled(!this.x);
            npcVar.setVisibility(this.x ? 4 : 0);
            textView.setVisibility(this.y ? 0 : 4);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i = frameLayout.getLayoutParams().width;
        float alpha = npcVar.getAlpha();
        float alpha2 = textView.getAlpha();
        float f = this.x ? 0.0f : 1.0f;
        float f2 = this.y ? 1.0f : 0.0f;
        if (alpha > 0.0f || f > 0.0f) {
            npcVar.setVisibility(0);
        }
        if (alpha2 > 0.0f || f2 > 0.0f) {
            textView.setVisibility(0);
        }
        npcVar.setEnabled(!this.x);
        float f3 = this.x ? 24.0f : -24.0f;
        if (npcVar.getAlpha() < 0.01f) {
            npcVar.setConversionWobble(f3);
        }
        zna znaVar3 = new zna(new xk4(npcVar.getConversionWobble()));
        aoa aoaVar = new aoa(0.0f);
        aoaVar.a(0.3f);
        aoaVar.b(180.0f);
        znaVar3.m = aoaVar;
        znaVar3.f(0.1f);
        znaVar3.a = (-f3) * 10.0f;
        znaVar3.b(new h20(this, (byte) 21));
        znaVar3.h();
        this.s = znaVar3;
        float f4 = this.x ? 18.0f : -18.0f;
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f4);
        }
        zna znaVar4 = new zna(textView, zna.s);
        aoa aoaVar2 = new aoa(0.0f);
        aoaVar2.a(0.3f);
        aoaVar2.b(180.0f);
        znaVar4.m = aoaVar2;
        znaVar4.a = (-f4) * 10.0f;
        znaVar4.h();
        this.r = znaVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = ofFloat;
        ofFloat.setDuration(320L);
        this.n.setInterpolator(new LinearInterpolator());
        this.n.addUpdateListener(new r07(this, alpha, f, alpha2, f2, i, (byte) 1));
        this.n.addListener(new koc(this, (byte) 3));
        this.n.start();
    }

    public final void b() {
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I = null;
            this.J = 1.0f;
            c();
        }
    }

    public final void c() {
        mrc mrcVar = this.c;
        Editable text = mrcVar.getText();
        boolean z = this.G;
        if (z) {
            CharSequence charSequence = text.length() == 0 ? "0" : null;
            if (!TextUtils.equals(mrcVar.getHint(), charSequence)) {
                mrcVar.setHint(charSequence);
            }
        }
        float f = 0.0f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                break;
            }
            nrc nrcVar = (nrc) arrayList.get(i);
            nrcVar.d = f;
            f += nrcVar.a();
            if (text.getSpanStart(nrcVar) >= 0) {
                text.setSpan(nrcVar, text.getSpanStart(nrcVar), text.getSpanEnd(nrcVar), 33);
            }
            i++;
        }
        if (text.length() != 0 || this.J >= 1.0f) {
            mrcVar.setMinWidth((!z || text.length() <= 0) ? gm.L(24.0f) : gm.L(3.0f) + mrcVar.getPaddingRight() + mrcVar.getPaddingLeft());
        } else {
            float measureText = mrcVar.getPaint().measureText("0");
            int L = gm.L(24.0f);
            float f2 = this.N;
            mrcVar.setMinWidth(Math.max(L, mrcVar.getPaddingRight() + mrcVar.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f2)) + f2)));
        }
        mrcVar.requestLayout();
        mrcVar.invalidate();
    }

    public final void d(c cVar, boolean z) {
        TL_wallet.currencyRate currencyrate;
        int i;
        TL_wallet.currencyRate currencyrate2;
        String str;
        l53 l53Var = cVar.h;
        boolean z2 = this.w && isAttachedToWindow() && isShown();
        boolean z3 = this.G;
        mrc mrcVar = this.c;
        rj rjVar = this.h;
        TextView textView = this.f;
        if (z3) {
            int i2 = z ? cmb.bm : cmb.Ei;
            this.a = i2;
            ylb ylbVar = this.F;
            int v0 = cmb.v0(i2, ylbVar);
            anb.X(textView, z ? cmb.bm : cmb.Ei, ylbVar);
            rjVar.c.v(v0, z2);
            rjVar.invalidate();
            anb.v(mrcVar, this.a, ylbVar);
            anb.l(mrcVar, 36, this.a, ylbVar);
            wmb K = anb.K(0.3f, z ? cmb.bm : cmb.Ei);
            anb.n(mrcVar, 3, K.a, -1, 2, K.d, ylbVar);
        }
        TL_wallet.currencyRate j = l53Var.j();
        String g = l53Var.g();
        boolean equals = TextUtils.equals(g, "USD");
        String str2 = (j == null || TextUtils.isEmpty(j.symbol)) ? equals ? "$" : g : j.symbol;
        boolean z4 = z && (j == null ? equals : j.symbolLeft);
        boolean z5 = j != null && j.spaceBetween;
        boolean z6 = (this.x == z && this.y == z4 && (!z4 || TextUtils.equals(textView.getText(), str2))) ? false : true;
        if (z4) {
            textView.setText(str2);
            currencyrate = j;
            textView.getLayoutParams().width = (int) Math.ceil(textView.getPaint().measureText(str2));
            textView.requestLayout();
        } else {
            currencyrate = j;
        }
        this.x = z;
        this.y = z4;
        if (!z) {
            i = gm.L(59.0f);
        } else if (z4) {
            i = ((int) Math.ceil(textView.getPaint().measureText(str2))) + (z5 ? gm.L(8.0f) : 0);
        } else {
            i = 0;
        }
        this.E = i;
        if (z6 || !this.w) {
            a(z2 && z6);
        }
        this.w = true;
        if (!z) {
            g = jb6.M0(2131749290, null);
        } else if (!z4) {
            g = str2;
        }
        rjVar.c(g, z2, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) rjVar.getLayoutParams();
        layoutParams.leftMargin = (!z || z4 || z5) ? gm.L(4.0f) : 0;
        rjVar.setLayoutParams(layoutParams);
        if (!z || currencyrate == null) {
            currencyrate2 = currencyrate;
            str = ",";
        } else {
            currencyrate2 = currencyrate;
            str = currencyrate2.thousandsSeparator;
            if (str == null) {
                str = "";
            }
        }
        String str3 = (!z || currencyrate2 == null || TextUtils.isEmpty(currencyrate2.decimalSeparator)) ? "." : currencyrate2.decimalSeparator;
        if (TextUtils.equals(this.Q, str) && TextUtils.equals(this.R, str3)) {
            return;
        }
        b();
        this.Q = str;
        this.R = str3;
        f(mrcVar.getText());
        b();
    }

    public final void e(float f, float f2, boolean z) {
        float f3 = 1.0f - f;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        npc npcVar = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - npcVar.getLeft()) - (npcVar.getWidth() / 2.0f)) * f3);
        frameLayout.setTranslationY(hg9.e(npcVar.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - npcVar.getTop(), f3) - (gm.L(36.0f) * ((float) Math.sin(f * 3.141592653589793d))));
        rj rjVar = this.h;
        int visibility = rjVar.getVisibility();
        mrc mrcVar = this.c;
        float left = (1.0f - f2) * (width - ((mrcVar.getLeft() + (visibility == 8 ? mrcVar.getRight() : rjVar.getRight())) / 2.0f));
        mrcVar.setTranslationX(left);
        rjVar.setTranslationX(left);
        mrcVar.setAlpha(f2);
        rjVar.setAlpha(f2);
        npcVar.setEnabled(z && !this.x);
        npcVar.setIntroProgress(f);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(Editable editable) {
        float f;
        int max;
        mrc mrcVar;
        int i;
        boolean z;
        boolean z2;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        boolean z3;
        String obj = editable.toString();
        int i4 = 0;
        while (i4 < Math.min(obj.length(), this.L.length()) && obj.charAt(i4) == this.L.charAt(i4)) {
            i4++;
        }
        int i5 = 0;
        while (i5 < Math.min(obj.length(), this.L.length()) - i4) {
            char charAt = obj.charAt((obj.length() - i5) - 1);
            String str = this.L;
            if (charAt != str.charAt((str.length() - i5) - 1)) {
                break;
            } else {
                i5++;
            }
        }
        int length = (this.L.length() - i4) - i5;
        int length2 = (obj.length() - i4) - i5;
        ArrayList arrayList3 = this.H;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        prc prcVar = (arrayList4.isEmpty() && this.L.isEmpty() && obj.startsWith("0")) ? new prc(this, 0.0f) : null;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        int size = arrayList4.size();
        float f2 = 0.0f;
        int i6 = 0;
        while (i6 < size) {
            Object obj2 = arrayList4.get(i6);
            i6++;
            int i7 = size;
            nrc nrcVar = (nrc) obj2;
            int i8 = length2;
            arrayList5.add(nrcVar.h.c());
            arrayList8.add(Integer.valueOf(nrcVar.a()));
            f2 += nrcVar.a();
            prc prcVar2 = nrcVar.n;
            if (prcVar2 != null) {
                arrayList6.add(prcVar2.c());
                arrayList7.add(nrcVar.b);
            }
            length2 = i8;
            size = i7;
        }
        int i9 = length2;
        ValueAnimator valueAnimator = this.I;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.I = null;
        }
        Object[] objArr = (nrc[]) editable.getSpans(0, editable.length(), nrc.class);
        int i10 = 0;
        for (int length3 = objArr.length; i10 < length3; length3 = length3) {
            editable.removeSpan(objArr[i10]);
            i10++;
        }
        arrayList3.clear();
        ArrayList arrayList9 = this.M;
        arrayList9.clear();
        int max2 = Math.max(obj.indexOf(46), obj.indexOf(44));
        int length4 = max2 < 0 ? obj.length() : max2;
        prc prcVar3 = prcVar;
        if (this.Q.isEmpty()) {
            f = f2;
            max = 0;
        } else {
            f = f2;
            max = Math.max(0, (length4 - 1) / 3);
        }
        this.K = 0.0f;
        boolean isAttachedToWindow = isAttachedToWindow();
        mrc mrcVar2 = this.c;
        if (isAttachedToWindow) {
            mrcVar = mrcVar2;
            i = max;
            if (mrcVar.getSelectionStart() == mrcVar.getSelectionEnd()) {
                z = true;
                boolean[] zArr = new boolean[arrayList4.size()];
                z2 = z;
                boolean[] zArr2 = new boolean[arrayList6.size()];
                i2 = 0;
                int i11 = 0;
                int i12 = 0;
                while (i2 < obj.length()) {
                    int i13 = i2 < i4 ? i2 : i2 >= i4 + i9 ? (i2 - i9) + length : -1;
                    ArrayList arrayList10 = arrayList7;
                    boolean z4 = i13 >= 0 && i13 < arrayList4.size();
                    if (z4) {
                        zArr[i13] = true;
                    }
                    boolean z5 = z4;
                    boolean z6 = !this.Q.isEmpty() && i2 > 0 && i2 < length4 && (length4 - i2) % 3 == 0;
                    int i14 = length4;
                    ArrayList arrayList11 = arrayList9;
                    String valueOf = i2 == max2 ? this.R : String.valueOf(obj.charAt(i2));
                    if (max2 < 0 || i2 < max2) {
                        i3 = max2;
                        z3 = false;
                    } else {
                        i3 = max2;
                        z3 = true;
                    }
                    nrc nrcVar2 = new nrc(this, valueOf, z6, z3);
                    float measureText = z6 ? mrcVar.getPaint().measureText(this.Q) : 0.0f;
                    TextPaint paint = mrcVar.getPaint();
                    float f3 = measureText;
                    float textSize = paint.getTextSize();
                    boolean z7 = z6;
                    if (nrcVar2.c) {
                        paint.setTextSize((28.0f * textSize) / 44.0f);
                    }
                    float measureText2 = paint.measureText(nrcVar2.b) + paint.measureText(nrcVar2.a);
                    paint.setTextSize(textSize);
                    nrcVar2.f = (int) Math.ceil(measureText2);
                    nrcVar2.e = z5 ? ((Integer) arrayList8.get(i13)).intValue() : 0;
                    if (i2 == 0 && prcVar3 != null) {
                        nrcVar2.e = nrcVar2.f;
                    }
                    if (this.G && i2 == 0 && this.L.isEmpty() && arrayList4.isEmpty()) {
                        nrcVar2.e = (int) Math.ceil(mrcVar.getPaint().measureText("0"));
                    }
                    i11 += nrcVar2.e;
                    nrcVar2.h = new prc(this, z5 ? (prc) arrayList5.get(i13) : i2 == 0 ? prcVar3 : null, this.K + f3, false);
                    if (z7) {
                        int i15 = i12 + 1;
                        int size2 = (arrayList6.size() - i) + i12;
                        if (size2 >= 0) {
                            zArr2[size2] = true;
                        }
                        nrcVar2.n = new prc(this, size2 >= 0 ? (prc) arrayList6.get(size2) : null, this.K, false);
                        i12 = i15;
                    }
                    arrayList3.add(nrcVar2);
                    this.K += nrcVar2.f;
                    int i16 = i2 + 1;
                    editable.setSpan(nrcVar2, i2, i16, 33);
                    i2 = i16;
                    arrayList7 = arrayList10;
                    length4 = i14;
                    arrayList9 = arrayList11;
                    max2 = i3;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList7;
                if (!arrayList3.isEmpty()) {
                    ((nrc) arrayList3.get(Math.min(i4, arrayList3.size() - 1))).e += Math.max(0, Math.round(f) - i11);
                }
                if (z2) {
                    int i17 = 0;
                    while (i17 < arrayList4.size()) {
                        if (zArr[i17] || (obj.isEmpty() && i17 == 0 && ((nrc) arrayList4.get(i17)).a.equals("0"))) {
                            arrayList2 = arrayList12;
                        } else {
                            nrc nrcVar3 = (nrc) arrayList4.get(i17);
                            orc orcVar = new orc(this, nrcVar3.a, nrcVar3.c, (prc) arrayList5.get(i17));
                            arrayList2 = arrayList12;
                            arrayList2.add(orcVar);
                        }
                        i17++;
                        arrayList12 = arrayList2;
                    }
                    ArrayList arrayList14 = arrayList12;
                    int i18 = 0;
                    while (i18 < arrayList6.size()) {
                        if (zArr2[i18]) {
                            arrayList = arrayList13;
                        } else {
                            arrayList = arrayList13;
                            arrayList14.add(new orc(this, (String) arrayList.get(i18), false, (prc) arrayList6.get(i18)));
                        }
                        i18++;
                        arrayList13 = arrayList;
                    }
                    if (obj.isEmpty() && !arrayList4.isEmpty()) {
                        this.N = f;
                    }
                }
                this.L = obj;
                this.J = !z2 ? 0.0f : 1.0f;
                if (z2) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.I = ofFloat;
                    ofFloat.setDuration(320L);
                    this.I.setInterpolator(new LinearInterpolator());
                    this.I.addUpdateListener(new oxb(this, (byte) 19));
                    this.I.start();
                }
                c();
            }
        } else {
            mrcVar = mrcVar2;
            i = max;
        }
        z = false;
        boolean[] zArr3 = new boolean[arrayList4.size()];
        z2 = z;
        boolean[] zArr22 = new boolean[arrayList6.size()];
        i2 = 0;
        int i112 = 0;
        int i122 = 0;
        while (i2 < obj.length()) {
        }
        ArrayList arrayList122 = arrayList9;
        ArrayList arrayList132 = arrayList7;
        if (!arrayList3.isEmpty()) {
        }
        if (z2) {
        }
        this.L = obj;
        this.J = !z2 ? 0.0f : 1.0f;
        if (z2) {
        }
        c();
    }

    public io getCurrencyView() {
        return this.h;
    }

    public npc getDiamondView() {
        return this.d;
    }

    public EditTextBoldCursor getEditText() {
        return this.c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b();
        a(false);
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mrc mrcVar = this.c;
        int baseline = mrcVar.getBaseline() + mrcVar.getTop();
        TextView textView = this.f;
        if (textView.getVisibility() == 0) {
            textView.setTranslationY(((baseline - this.e.getTop()) - textView.getTop()) - textView.getBaseline());
        }
        this.h.setTranslationY((baseline - r0.getTop()) - r0.getBaseline());
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), TLObject.FLAG_30);
        LinearLayout linearLayout = this.b;
        linearLayout.measure(0, makeMeasureSpec);
        float min = Math.min(1.0f, getMeasuredWidth() / Math.max(1, linearLayout.getMeasuredWidth()));
        linearLayout.setPivotX(linearLayout.getMeasuredWidth() / 2.0f);
        linearLayout.setPivotY(linearLayout.getMeasuredHeight() / 2.0f);
        linearLayout.setScaleX(min);
        linearLayout.setScaleY(min);
    }

    public void setAmountText(String str) {
        this.S = true;
        try {
            this.c.setText(str);
        } finally {
            this.S = false;
        }
    }

    public void setScaleProperty(float f) {
        this.P = 1.0f - Math.max(0.0f, Math.min(1.0f, f));
    }

    @Override // vlb
    public final void updateColors() {
        rj rjVar;
        mrc mrcVar = this.c;
        if (mrcVar != null) {
            try {
                int v0 = cmb.v0(this.a, this.F);
                mrcVar.setCursorColor(v0);
                mrcVar.setHandlesColor(v0);
                if (!this.G || (rjVar = this.h) == null) {
                    return;
                }
                rjVar.c.v(v0, false);
                rjVar.invalidate();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
