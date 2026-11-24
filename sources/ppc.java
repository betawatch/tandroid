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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class ppc extends FrameLayout implements tjb {
    public static final s33 T = s33.h;
    public int E;
    public final wjb F;
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
    public final lpc c;
    public final lnc d;
    public final FrameLayout e;
    public final TextView f;
    public final ri h;
    public ValueAnimator n;
    public yla r;
    public yla s;
    public boolean w;
    public boolean x;
    public boolean y;

    public ppc(Context context, wjb wjbVar) {
        super(context);
        int i = bkb.Ei;
        this.a = i;
        this.H = new ArrayList();
        this.J = 1.0f;
        this.L = "";
        this.M = new ArrayList();
        this.P = 0.5f;
        this.Q = ",";
        this.R = ".";
        this.F = wjbVar;
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
        addView(linearLayout, nme.e(-2, -1, 17));
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setTranslationZ(gl.L(1.0f));
        linearLayout.addView(frameLayout, nme.r(59, 60, 16));
        this.E = gl.L(59.0f);
        lnc lncVar = new lnc(60, context, true);
        this.d = lncVar;
        lncVar.g();
        frameLayout.addView(lncVar, nme.d(60, 60.0f, 19, 0.0f, -5.0f, -2.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f = textView;
        int i2 = bkb.y6;
        zkb.X(textView, i2, wjbVar);
        textView.setTextSize(1, 44.0f);
        textView.setTypeface(gl.n1("fonts/gram.ttf"));
        textView.setGravity(16);
        textView.setIncludeFontPadding(false);
        textView.setSingleLine(true);
        textView.setVisibility(4);
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, nme.e(-2, 60, 19));
        lpc lpcVar = new lpc(this, context);
        this.c = lpcVar;
        zkb.X(lpcVar, bkb.F6, wjbVar);
        zkb.D(lpcVar, i2, wjbVar);
        lpcVar.setHint("0");
        lpcVar.setTextSize(1, 44.0f);
        lpcVar.setTypeface(gl.n1("fonts/gram.ttf"));
        lpcVar.setIncludeFontPadding(false);
        lpcVar.setSingleLine(true);
        lpcVar.setGravity(21);
        lpcVar.setBackground(null);
        lpcVar.setPadding(gl.L(3.0f), 0, gl.L(3.0f), 0);
        lpcVar.setMinWidth(gl.L(24.0f));
        lpcVar.setHorizontallyScrolling(true);
        lpcVar.setCursorWidth(3.0f);
        lpcVar.setCursorSize(gl.L(48.0f));
        bkb.v0(i, wjbVar);
        zkb.l(lpcVar, 30, i, wjbVar);
        zkb.l(lpcVar, 36, i, wjbVar);
        vkb K = zkb.K(0.3f, i);
        zkb.n(lpcVar, 3, K.a, -1, 2, K.d, wjbVar);
        lpcVar.setAllowDrawCursor(true);
        lpcVar.setInputType(8194);
        lpcVar.setKeyListener(DigitsKeyListener.getInstance("0123456789.,"));
        lpcVar.setImeOptions(33554438);
        linearLayout.addView(lpcVar, nme.r(-2, 60, 16));
        ri riVar = new ri(context, false, true, false, true, true);
        this.h = riVar;
        riVar.c.m(0.35f, 420L, 3.5f, s33.h);
        riVar.setScaleProperty(0.2f);
        riVar.setAllowCancel(true);
        riVar.getDrawable().c0 = new kbc(riVar, (byte) 27);
        riVar.setTextColor(bkb.v0(this.a, wjbVar));
        riVar.setTextSize(gl.L(28.0f));
        riVar.setTypeface(gl.n1("fonts/gram.ttf"));
        riVar.setGravity(3);
        riVar.getDrawable().T = false;
        riVar.c(k96.M0(2131749341, null), false, true);
        linearLayout.addView(riVar, nme.t(-2, 60, 16, 4, 0, 0, 0));
        setOnClickListener(new bna(this, (byte) 29));
        lpcVar.addTextChangedListener(new a02(this, (byte) 1));
    }

    public final void a(boolean z) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.n.cancel();
            this.n = null;
        }
        yla ylaVar = this.r;
        if (ylaVar != null) {
            ylaVar.d();
        }
        yla ylaVar2 = this.s;
        if (ylaVar2 != null) {
            ylaVar2.d();
        }
        byte b = 1;
        TextView textView = this.f;
        lnc lncVar = this.d;
        FrameLayout frameLayout = this.e;
        if (!z) {
            lncVar.setAlpha(this.x ? 0.0f : 1.0f);
            textView.setAlpha(this.y ? 1.0f : 0.0f);
            lncVar.setConversionWobble(0.0f);
            textView.setRotation(0.0f);
            lncVar.setEnabled(!this.x);
            lncVar.setVisibility(this.x ? 4 : 0);
            textView.setVisibility(this.y ? 0 : 4);
            frameLayout.getLayoutParams().width = this.E;
            frameLayout.requestLayout();
            return;
        }
        int i = frameLayout.getLayoutParams().width;
        float alpha = lncVar.getAlpha();
        float alpha2 = textView.getAlpha();
        float f = this.x ? 0.0f : 1.0f;
        float f2 = this.y ? 1.0f : 0.0f;
        if (alpha > 0.0f || f > 0.0f) {
            lncVar.setVisibility(0);
        }
        if (alpha2 > 0.0f || f2 > 0.0f) {
            textView.setVisibility(0);
        }
        lncVar.setEnabled(!this.x);
        float f3 = this.x ? 24.0f : -24.0f;
        if (lncVar.getAlpha() < 0.01f) {
            lncVar.setConversionWobble(f3);
        }
        yla ylaVar3 = new yla(new ti4(lncVar.getConversionWobble()));
        zla zlaVar = new zla(0.0f);
        zlaVar.a(0.3f);
        zlaVar.b(180.0f);
        ylaVar3.m = zlaVar;
        ylaVar3.f(0.1f);
        ylaVar3.a = (-f3) * 10.0f;
        ylaVar3.b(new h10(this, (byte) 21));
        ylaVar3.h();
        this.s = ylaVar3;
        float f4 = this.x ? 18.0f : -18.0f;
        textView.setPivotX(textView.getLayoutParams().width / 2.0f);
        textView.setPivotY(0.0f);
        if (textView.getAlpha() < 0.01f) {
            textView.setRotation(f4);
        }
        yla ylaVar4 = new yla(textView, yla.s);
        zla zlaVar2 = new zla(0.0f);
        zlaVar2.a(0.3f);
        zlaVar2.b(180.0f);
        ylaVar4.m = zlaVar2;
        ylaVar4.a = (-f4) * 10.0f;
        ylaVar4.h();
        this.r = ylaVar4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.n = ofFloat;
        ofFloat.setDuration(320L);
        this.n.setInterpolator(new LinearInterpolator());
        this.n.addUpdateListener(new ry6(this, alpha, f, alpha2, f2, i, (byte) 1));
        this.n.addListener(new yoc(this, b));
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
        lpc lpcVar = this.c;
        Editable text = lpcVar.getText();
        boolean z = this.G;
        if (z) {
            CharSequence charSequence = text.length() == 0 ? "0" : null;
            if (!TextUtils.equals(lpcVar.getHint(), charSequence)) {
                lpcVar.setHint(charSequence);
            }
        }
        float f = 0.0f;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.H;
            if (i >= arrayList.size()) {
                break;
            }
            mpc mpcVar = (mpc) arrayList.get(i);
            mpcVar.d = f;
            f += mpcVar.a();
            if (text.getSpanStart(mpcVar) >= 0) {
                text.setSpan(mpcVar, text.getSpanStart(mpcVar), text.getSpanEnd(mpcVar), 33);
            }
            i++;
        }
        if (text.length() != 0 || this.J >= 1.0f) {
            lpcVar.setMinWidth((!z || text.length() <= 0) ? gl.L(24.0f) : gl.L(3.0f) + lpcVar.getPaddingRight() + lpcVar.getPaddingLeft());
        } else {
            float measureText = lpcVar.getPaint().measureText("0");
            int L = gl.L(24.0f);
            float f2 = this.N;
            lpcVar.setMinWidth(Math.max(L, lpcVar.getPaddingRight() + lpcVar.getPaddingLeft() + Math.round((T.getInterpolation(this.J) * (measureText - f2)) + f2)));
        }
        lpcVar.requestLayout();
        lpcVar.invalidate();
    }

    public final void d(c cVar, boolean z) {
        TL_wallet.currencyRate currencyrate;
        int i;
        TL_wallet.currencyRate currencyrate2;
        String str;
        a43 a43Var = cVar.h;
        boolean z2 = this.w && isAttachedToWindow() && isShown();
        boolean z3 = this.G;
        lpc lpcVar = this.c;
        ri riVar = this.h;
        TextView textView = this.f;
        if (z3) {
            int i2 = z ? bkb.bm : bkb.Ei;
            this.a = i2;
            wjb wjbVar = this.F;
            int v0 = bkb.v0(i2, wjbVar);
            zkb.X(textView, z ? bkb.bm : bkb.Ei, wjbVar);
            riVar.c.v(v0, z2);
            riVar.invalidate();
            zkb.v(lpcVar, this.a, wjbVar);
            zkb.l(lpcVar, 36, this.a, wjbVar);
            vkb K = zkb.K(0.3f, z ? bkb.bm : bkb.Ei);
            zkb.n(lpcVar, 3, K.a, -1, 2, K.d, wjbVar);
        }
        TL_wallet.currencyRate j = a43Var.j();
        String g = a43Var.g();
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
            i = gl.L(59.0f);
        } else if (z4) {
            i = ((int) Math.ceil(textView.getPaint().measureText(str2))) + (z5 ? gl.L(8.0f) : 0);
        } else {
            i = 0;
        }
        this.E = i;
        if (z6 || !this.w) {
            a(z2 && z6);
        }
        this.w = true;
        if (!z) {
            g = k96.M0(2131749341, null);
        } else if (!z4) {
            g = str2;
        }
        riVar.c(g, z2, true);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) riVar.getLayoutParams();
        layoutParams.leftMargin = (!z || z4 || z5) ? gl.L(4.0f) : 0;
        riVar.setLayoutParams(layoutParams);
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
        f(lpcVar.getText());
        b();
    }

    public final void e(float f, float f2, boolean z) {
        float f3 = 1.0f - f;
        LinearLayout linearLayout = this.b;
        float width = (getWidth() / 2.0f) - linearLayout.getLeft();
        FrameLayout frameLayout = this.e;
        lnc lncVar = this.d;
        frameLayout.setTranslationX((((width - frameLayout.getLeft()) - lncVar.getLeft()) - (lncVar.getWidth() / 2.0f)) * f3);
        frameLayout.setTranslationY(de9.e(lncVar.getHeight(), 2.0f, (((getHeight() / 2.0f) - linearLayout.getTop()) - frameLayout.getTop()) - lncVar.getTop(), f3) - (gl.L(36.0f) * ((float) Math.sin(f * 3.141592653589793d))));
        ri riVar = this.h;
        int visibility = riVar.getVisibility();
        lpc lpcVar = this.c;
        float left = (1.0f - f2) * (width - ((lpcVar.getLeft() + (visibility == 8 ? lpcVar.getRight() : riVar.getRight())) / 2.0f));
        lpcVar.setTranslationX(left);
        riVar.setTranslationX(left);
        lpcVar.setAlpha(f2);
        riVar.setAlpha(f2);
        lncVar.setEnabled(z && !this.x);
        lncVar.setIntroProgress(f);
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
        lpc lpcVar;
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
        opc opcVar = (arrayList4.isEmpty() && this.L.isEmpty() && obj.startsWith("0")) ? new opc(this, 0.0f) : null;
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
            mpc mpcVar = (mpc) obj2;
            int i8 = length2;
            arrayList5.add(mpcVar.h.c());
            arrayList8.add(Integer.valueOf(mpcVar.a()));
            f2 += mpcVar.a();
            opc opcVar2 = mpcVar.n;
            if (opcVar2 != null) {
                arrayList6.add(opcVar2.c());
                arrayList7.add(mpcVar.b);
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
        Object[] objArr = (mpc[]) editable.getSpans(0, editable.length(), mpc.class);
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
        opc opcVar3 = opcVar;
        if (this.Q.isEmpty()) {
            f = f2;
            max = 0;
        } else {
            f = f2;
            max = Math.max(0, (length4 - 1) / 3);
        }
        this.K = 0.0f;
        boolean isAttachedToWindow = isAttachedToWindow();
        lpc lpcVar2 = this.c;
        if (isAttachedToWindow) {
            lpcVar = lpcVar2;
            i = max;
            if (lpcVar.getSelectionStart() == lpcVar.getSelectionEnd()) {
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
                    mpc mpcVar2 = new mpc(this, valueOf, z6, z3);
                    float measureText = z6 ? lpcVar.getPaint().measureText(this.Q) : 0.0f;
                    TextPaint paint = lpcVar.getPaint();
                    float f3 = measureText;
                    float textSize = paint.getTextSize();
                    boolean z7 = z6;
                    if (mpcVar2.c) {
                        paint.setTextSize((28.0f * textSize) / 44.0f);
                    }
                    float measureText2 = paint.measureText(mpcVar2.b) + paint.measureText(mpcVar2.a);
                    paint.setTextSize(textSize);
                    mpcVar2.f = (int) Math.ceil(measureText2);
                    mpcVar2.e = z5 ? ((Integer) arrayList8.get(i13)).intValue() : 0;
                    if (i2 == 0 && opcVar3 != null) {
                        mpcVar2.e = mpcVar2.f;
                    }
                    if (this.G && i2 == 0 && this.L.isEmpty() && arrayList4.isEmpty()) {
                        mpcVar2.e = (int) Math.ceil(lpcVar.getPaint().measureText("0"));
                    }
                    i11 += mpcVar2.e;
                    mpcVar2.h = new opc(this, z5 ? (opc) arrayList5.get(i13) : i2 == 0 ? opcVar3 : null, this.K + f3, false);
                    if (z7) {
                        int i15 = i12 + 1;
                        int size2 = (arrayList6.size() - i) + i12;
                        if (size2 >= 0) {
                            zArr2[size2] = true;
                        }
                        mpcVar2.n = new opc(this, size2 >= 0 ? (opc) arrayList6.get(size2) : null, this.K, false);
                        i12 = i15;
                    }
                    arrayList3.add(mpcVar2);
                    this.K += mpcVar2.f;
                    int i16 = i2 + 1;
                    editable.setSpan(mpcVar2, i2, i16, 33);
                    i2 = i16;
                    arrayList7 = arrayList10;
                    length4 = i14;
                    arrayList9 = arrayList11;
                    max2 = i3;
                }
                ArrayList arrayList12 = arrayList9;
                ArrayList arrayList13 = arrayList7;
                if (!arrayList3.isEmpty()) {
                    ((mpc) arrayList3.get(Math.min(i4, arrayList3.size() - 1))).e += Math.max(0, Math.round(f) - i11);
                }
                if (z2) {
                    int i17 = 0;
                    while (i17 < arrayList4.size()) {
                        if (zArr[i17] || (obj.isEmpty() && i17 == 0 && ((mpc) arrayList4.get(i17)).a.equals("0"))) {
                            arrayList2 = arrayList12;
                        } else {
                            mpc mpcVar3 = (mpc) arrayList4.get(i17);
                            npc npcVar = new npc(this, mpcVar3.a, mpcVar3.c, (opc) arrayList5.get(i17));
                            arrayList2 = arrayList12;
                            arrayList2.add(npcVar);
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
                            arrayList14.add(new npc(this, (String) arrayList.get(i18), false, (opc) arrayList6.get(i18)));
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
                    this.I.addUpdateListener(new uwb(this, (byte) 17));
                    this.I.start();
                }
                c();
            }
        } else {
            lpcVar = lpcVar2;
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

    public hn getCurrencyView() {
        return this.h;
    }

    public lnc getDiamondView() {
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
        lpc lpcVar = this.c;
        int baseline = lpcVar.getBaseline() + lpcVar.getTop();
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

    @Override // tjb
    public final void updateColors() {
        ri riVar;
        lpc lpcVar = this.c;
        if (lpcVar != null) {
            try {
                int v0 = bkb.v0(this.a, this.F);
                lpcVar.setCursorColor(v0);
                lpcVar.setHandlesColor(v0);
                if (!this.G || (riVar = this.h) == null) {
                    return;
                }
                riVar.c.v(v0, false);
                riVar.invalidate();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
