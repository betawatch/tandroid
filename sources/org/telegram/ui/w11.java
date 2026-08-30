package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebProxyTransport;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class w11 extends org.telegram.ui.ActionBar.p2 {
    public float B;
    public final float[] C;
    public boolean D;
    public ValueAnimator E;
    public ClipboardManager F;
    public boolean G;
    public final SharedConfig.ProxyInfo H;
    public boolean I;
    public final ClipboardManager.OnPrimaryClipChangedListener J;
    public EditTextBoldCursor[] a;
    public t11 b;
    public s11 c;
    public LinearLayout d;
    public final org.telegram.ui.Cells.z6[] e;
    public final org.telegram.ui.Cells.a9[] f;
    public org.telegram.ui.Cells.aa h;
    public org.telegram.ui.Cells.aa n;
    public org.telegram.ui.ActionBar.w0 r;
    public final org.telegram.ui.Cells.j6[] s;
    public int v;
    public int w;
    public String x;
    public String[] y;

    public w11() {
        super(null);
        this.e = new org.telegram.ui.Cells.z6[3];
        this.f = new org.telegram.ui.Cells.a9[2];
        this.s = new org.telegram.ui.Cells.j6[3];
        this.v = -1;
        this.w = -1;
        this.B = 1.0f;
        this.C = new float[2];
        this.D = true;
        this.J = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: org.telegram.ui.p11
            @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
            public final void onPrimaryClipChanged() {
                w11.this.W();
            }
        };
        this.H = new SharedConfig.ProxyInfo("", 1080, "", "", "");
        this.G = true;
    }

    public final void U(boolean z4) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z10 = this.v != 2 ? !(editTextBoldCursor.length() == 0 || Utilities.parseInt((CharSequence) this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(WebProxyTransport.normalizeHost(editTextBoldCursor.getText().toString())) || !WebProxyTransport.isValidSecret(this.a[4].getText().toString()));
        if (this.D != z10) {
            ValueAnimator valueAnimator = this.E;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z4) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.E = ofFloat;
                ofFloat.setDuration(200L);
                this.E.addUpdateListener(new h11(this, 1));
            }
            if (z4) {
                float f10 = this.B;
                float[] fArr = this.C;
                fArr[0] = f10;
                fArr[1] = z10 ? 1.0f : 0.0f;
                this.E.start();
            } else {
                this.B = z10 ? 1.0f : 0.0f;
                this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, z10 ? org.telegram.ui.ActionBar.j6.q6 : org.telegram.ui.ActionBar.j6.z6, false));
                this.r.setAlpha(z10 ? 1.0f : 0.5f);
            }
            this.h.setEnabled(z10);
            this.r.setEnabled(z10);
            this.D = z10;
        }
    }

    public final void V(int i10, boolean z4, vy0 vy0Var) {
        if (this.v != i10) {
            this.v = i10;
            if (Build.VERSION.SDK_INT >= 23) {
                TransitionManager.endTransitions(this.c);
            }
            if (z4) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.nr.f).setDuration(250L);
                if (vy0Var != null) {
                    duration.addListener((Transition.TransitionListener) new v11(vy0Var));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i11 = this.v;
            org.telegram.ui.Cells.a9[] a9VarArr = this.f;
            if (i11 == 0) {
                a9VarArr[0].setVisibility(0);
                a9VarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 1) {
                a9VarArr[0].setVisibility(8);
                a9VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.a9 a9Var = a9VarArr[1];
                StringBuilder sb = new StringBuilder();
                b.i(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                a9Var.setText(sb.toString());
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i11 == 2) {
                a9VarArr[0].setVisibility(8);
                a9VarArr[1].setVisibility(0);
                a9VarArr[1].setText(LocaleController.getString(R.string.UseProxyWebInfo));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            this.h.setVisibility(this.v != 2 ? 0 : 8);
            org.telegram.ui.Cells.j6[] j6VarArr = this.s;
            j6VarArr[0].a(this.v == 0, z4);
            j6VarArr[1].a(this.v == 1, z4);
            j6VarArr[2].a(this.v == 2, z4);
            U(z4);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W() {
        String str;
        char c3;
        ClipData primaryClip = this.F.getPrimaryClip();
        String[] strArr = null;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            try {
                str = primaryClip.getItemAt(0).coerceToText(this.fragmentView.getContext()).toString();
            } catch (Exception unused) {
            }
            if (TextUtils.equals(str, this.x)) {
                this.w = -1;
                this.x = str;
                this.y = new String[this.a.length];
                if (str != null) {
                    String[] strArr2 = {"t.me/socks?", "tg://socks?"};
                    int i10 = 0;
                    while (true) {
                        if (i10 >= 2) {
                            break;
                        }
                        int indexOf = str.indexOf(strArr2[i10]);
                        if (indexOf >= 0) {
                            this.w = 0;
                            strArr = str.substring(strArr2[i10].length() + indexOf).split("&");
                            break;
                        }
                        i10++;
                    }
                    if (strArr == null) {
                        String[] strArr3 = {"t.me/proxy?", "tg://proxy?"};
                        int i11 = 0;
                        while (true) {
                            if (i11 >= 2) {
                                break;
                            }
                            int indexOf2 = str.indexOf(strArr3[i11]);
                            if (indexOf2 >= 0) {
                                this.w = 1;
                                strArr = str.substring(strArr3[i11].length() + indexOf2).split("&");
                                break;
                            }
                            i11++;
                        }
                    }
                    if (strArr != null) {
                        for (String str2 : strArr) {
                            String[] split = str2.split("=");
                            if (split.length == 2) {
                                String lowerCase = split[0].toLowerCase();
                                lowerCase.getClass();
                                switch (lowerCase.hashCode()) {
                                    case -906277200:
                                        if (lowerCase.equals("secret")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case -905826493:
                                        if (lowerCase.equals("server")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3433489:
                                        if (lowerCase.equals("pass")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3446913:
                                        if (lowerCase.equals("port")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3599307:
                                        if (lowerCase.equals("user")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                switch (c3) {
                                    case 0:
                                        if (this.w == 1) {
                                            this.y[4] = split[1];
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 1:
                                        this.y[0] = split[1];
                                        break;
                                    case 2:
                                        if (this.w == 0) {
                                            this.y[3] = split[1];
                                            break;
                                        } else {
                                            break;
                                        }
                                    case 3:
                                        this.y[1] = split[1];
                                        break;
                                    case 4:
                                        if (this.w == 0) {
                                            this.y[2] = split[1];
                                            break;
                                        } else {
                                            break;
                                        }
                                }
                            }
                        }
                    }
                }
                int i12 = this.w;
                org.telegram.ui.Cells.z6[] z6VarArr = this.e;
                if (i12 != -1) {
                    if (this.n.getVisibility() != 0) {
                        this.n.setVisibility(0);
                        z6VarArr[2].setVisibility(0);
                        return;
                    }
                    return;
                }
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                    z6VarArr[2].setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        str = null;
        if (TextUtils.equals(str, this.x)) {
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        SharedConfig.ProxyInfo proxyInfo;
        this.actionBar.setTitle(LocaleController.getString(R.string.ProxyDetails));
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        org.telegram.ui.ActionBar.e5 e5Var = this.parentLayout;
        if (e5Var != null && ((ActionBarLayout) e5Var).J0) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setActionBarMenuOnItemClick(new r11(this));
        org.telegram.ui.ActionBar.w0 g10 = this.actionBar.n().g(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f));
        this.r = g10;
        g10.setContentDescription(LocaleController.getString(R.string.Done));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.a7, false));
        this.c = new s11(context);
        t11 t11Var = new t11(context, this.c, this.resourceProvider, true);
        this.b = t11Var;
        this.actionBar.setAdaptiveBackground(t11Var);
        this.b.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.b, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.s8, false));
        int i10 = -1;
        frameLayout.addView(this.b, k7.b6.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        final int i11 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.q11
            public final /* synthetic */ w11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.V(((Integer) view.getTag()).intValue(), true, null);
                        break;
                    default:
                        w11 w11Var = this.b;
                        if (w11Var.w != -1) {
                            int i12 = 0;
                            while (true) {
                                String[] strArr = w11Var.y;
                                if (i12 >= strArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = w11Var.a[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    w11Var.V(w11Var.w, true, new vy0(w11Var, 8));
                                    break;
                                } else {
                                    int i13 = w11Var.w;
                                    if ((i13 != 0 || i12 != 4) && (i13 != 1 || (i12 != 2 && i12 != 3))) {
                                        String str = strArr[i12];
                                        if (str != null) {
                                            try {
                                                w11Var.a[i12].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                w11Var.a[i12].setText(w11Var.y[i12]);
                                            }
                                        } else {
                                            w11Var.a[i12].setText((CharSequence) null);
                                        }
                                    }
                                    i12++;
                                }
                            }
                        }
                        break;
                }
            }
        };
        int i12 = 0;
        while (i12 < 3) {
            org.telegram.ui.Cells.j6 j6Var = new org.telegram.ui.Cells.j6(context, null);
            org.telegram.ui.Cells.j6[] j6VarArr = this.s;
            j6VarArr[i12] = j6Var;
            j6Var.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
            j6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                j6VarArr[i12].c(LocaleController.getString(R.string.UseProxySocks5), i12 == this.v, true);
            } else if (i12 == 1) {
                j6VarArr[i12].c(LocaleController.getString(R.string.UseProxyTelegram), i12 == this.v, true);
            } else {
                j6VarArr[i12].c(LocaleController.getString(R.string.UseProxyWeb), i12 == this.v, false);
            }
            this.c.addView(j6VarArr[i12], k7.b6.n(-1, 50));
            j6VarArr[i12].setOnClickListener(onClickListener);
            i12++;
        }
        org.telegram.ui.Cells.z6 z6Var = new org.telegram.ui.Cells.z6(context, (b) null);
        org.telegram.ui.Cells.z6[] z6VarArr = this.e;
        z6VarArr[0] = z6Var;
        this.c.addView(z6Var, k7.b6.n(-1, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(AndroidUtilities.dp(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, k7.b6.n(-1, -2));
        int i13 = 5;
        this.a = new EditTextBoldCursor[5];
        int i14 = 0;
        while (true) {
            proxyInfo = this.H;
            if (i14 >= i13) {
                break;
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, k7.b6.n(i10, 64));
            this.a[i14] = new EditTextBoldCursor(context);
            this.a[i14].setTag(Integer.valueOf(i14));
            this.a[i14].setTextSize(1, 16.0f);
            this.a[i14].setHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.H6, false));
            EditTextBoldCursor editTextBoldCursor = this.a[i14];
            int i15 = org.telegram.ui.ActionBar.j6.G6;
            editTextBoldCursor.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.a[i14].setBackground(null);
            this.a[i14].setCursorColor(org.telegram.ui.ActionBar.j6.w0(null, i15, false));
            this.a[i14].setCursorSize(AndroidUtilities.dp(20.0f));
            this.a[i14].setCursorWidth(1.5f);
            this.a[i14].setSingleLine(true);
            this.a[i14].setGravity((LocaleController.isRTL ? 5 : 3) | 16);
            this.a[i14].setHeaderHintColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L6, false));
            this.a[i14].setTransformHintToHeader(true);
            this.a[i14].setLineColors(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.l6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
            if (i14 == 0) {
                this.a[i14].setInputType(524305);
                this.a[i14].addTextChangedListener(new u11(this, 0));
            } else if (i14 == 1) {
                this.a[i14].setInputType(2);
                this.a[i14].addTextChangedListener(new u11(this, 1));
            } else if (i14 == 3) {
                this.a[i14].setInputType(129);
                this.a[i14].setTypeface(Typeface.DEFAULT);
                this.a[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.a[i14].setInputType(524289);
            }
            if (i14 == 4) {
                this.a[i14].addTextChangedListener(new u11(this, 2));
            }
            this.a[i14].setImeOptions(268435461);
            if (i14 == 0) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyAddress));
                this.a[i14].setText(proxyInfo.address);
            } else if (i14 == 1) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyPort));
                this.a[i14].setText("" + proxyInfo.port);
            } else if (i14 == 2) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyUsername));
                this.a[i14].setText(proxyInfo.username);
            } else if (i14 == 3) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxyPassword));
                this.a[i14].setText(proxyInfo.password);
            } else if (i14 == 4) {
                this.a[i14].setHintText(LocaleController.getString(R.string.UseProxySecret));
                this.a[i14].setText(proxyInfo.secret);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i14];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i14].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i14], k7.b6.d(-1, -1.0f, 51, 17.0f, i14 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i14].setOnEditorActionListener(new ha(this, 10));
            i14++;
            i13 = 5;
            i10 = -1;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            org.telegram.ui.Cells.a9[] a9VarArr = this.f;
            a9VarArr[i16] = a9Var;
            if (i16 == 0) {
                a9Var.setText(LocaleController.getString(R.string.UseProxyInfo));
            } else {
                StringBuilder sb = new StringBuilder();
                b.i(R.string.UseProxyTelegramInfo, "\n\n", sb);
                sb.append(LocaleController.getString(R.string.UseProxyTelegramInfo2));
                a9Var.setText(sb.toString());
                a9VarArr[i16].setVisibility(8);
            }
            this.c.addView(a9VarArr[i16], k7.b6.n(-1, -2));
        }
        org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(this.fragmentView.getContext());
        this.n = aaVar;
        aaVar.setBackground(org.telegram.ui.ActionBar.j6.K0(true));
        this.n.b(LocaleController.getString(R.string.PasteFromClipboard), false);
        org.telegram.ui.Cells.aa aaVar2 = this.n;
        int i17 = org.telegram.ui.ActionBar.j6.q6;
        aaVar2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        final int i18 = 1;
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.q11
            public final /* synthetic */ w11 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i18) {
                    case 0:
                        this.b.V(((Integer) view.getTag()).intValue(), true, null);
                        break;
                    default:
                        w11 w11Var = this.b;
                        if (w11Var.w != -1) {
                            int i122 = 0;
                            while (true) {
                                String[] strArr = w11Var.y;
                                if (i122 >= strArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = w11Var.a[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    w11Var.V(w11Var.w, true, new vy0(w11Var, 8));
                                    break;
                                } else {
                                    int i132 = w11Var.w;
                                    if ((i132 != 0 || i122 != 4) && (i132 != 1 || (i122 != 2 && i122 != 3))) {
                                        String str = strArr[i122];
                                        if (str != null) {
                                            try {
                                                w11Var.a[i122].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                w11Var.a[i122].setText(w11Var.y[i122]);
                                            }
                                        } else {
                                            w11Var.a[i122].setText((CharSequence) null);
                                        }
                                    }
                                    i122++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.c.addView(this.n, 0, k7.b6.n(-1, -2));
        this.n.setVisibility(8);
        org.telegram.ui.Cells.z6 z6Var2 = new org.telegram.ui.Cells.z6(this.fragmentView.getContext(), (b) null);
        z6VarArr[2] = z6Var2;
        this.c.addView(z6Var2, 1, k7.b6.n(-1, -2));
        z6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.aa aaVar3 = new org.telegram.ui.Cells.aa(context);
        this.h = aaVar3;
        aaVar3.setBackgroundDrawable(org.telegram.ui.ActionBar.j6.K0(true));
        this.h.b(LocaleController.getString(R.string.ShareFile), false);
        this.h.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i17, false));
        this.c.addView(this.h, k7.b6.n(-1, -2));
        this.h.setOnClickListener(new gb0(16, this, context));
        org.telegram.ui.Cells.z6 z6Var3 = new org.telegram.ui.Cells.z6(context, (b) null);
        z6VarArr[1] = z6Var3;
        this.c.addView(z6Var3, k7.b6.n(-1, -2));
        this.F = (ClipboardManager) context.getSystemService("clipboard");
        this.D = true;
        this.B = 1.0f;
        U(false);
        this.v = -1;
        V(proxyInfo.type, false, null);
        this.w = -1;
        this.x = null;
        W();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final ArrayList getThemeDescriptions() {
        cy0 cy0Var = new cy0(2, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.a7));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.s8;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.b, 32768, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, TLObject.FLAG_27, null, null, null, null, org.telegram.ui.ActionBar.j6.C8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 67108864, null, null, null, null, org.telegram.ui.ActionBar.j6.D8));
        LinearLayout linearLayout = this.d;
        int i11 = org.telegram.ui.ActionBar.j6.d6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(linearLayout, 1, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.c, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.k0, null, null, org.telegram.ui.ActionBar.j6.d7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.h, TLObject.FLAG_28, null, null, null, null, i11));
        org.telegram.ui.Cells.aa aaVar = this.h;
        int i12 = org.telegram.ui.ActionBar.j6.i6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(aaVar, TLObject.FLAG_28, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.q6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, cy0Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, -1, cy0Var, org.telegram.ui.ActionBar.j6.z6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, TLObject.FLAG_28, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, TLObject.FLAG_28, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.n, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i13));
        int i14 = 0;
        while (true) {
            org.telegram.ui.Cells.j6[] j6VarArr = this.s;
            if (i14 >= j6VarArr.length) {
                break;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], TLObject.FLAG_28, null, null, null, null, org.telegram.ui.ActionBar.j6.i6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 0, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 8192, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.g7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(j6VarArr[i14], 16384, new Class[]{org.telegram.ui.Cells.j6.class}, new String[]{"radioButton"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.h7));
            i14++;
        }
        if (this.a != null) {
            int i15 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i15 >= editTextBoldCursorArr.length) {
                    break;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i15];
                int i16 = org.telegram.ui.ActionBar.j6.G6;
                arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 4, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.a[i15], TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.a[i15], 8390656, null, null, null, null, org.telegram.ui.ActionBar.j6.L6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(this.a[i15], 16777216, null, null, null, null, i16));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.k6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.l6));
                arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, cy0Var, org.telegram.ui.ActionBar.j6.p7));
                i15++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, 4, null, null, null, null, org.telegram.ui.ActionBar.j6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(null, TLObject.FLAG_23, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        int i17 = 0;
        while (true) {
            org.telegram.ui.Cells.z6[] z6VarArr = this.e;
            if (i17 >= z6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.z6 z6Var = z6VarArr[i17];
            if (z6Var != null) {
                arrayList.add(new org.telegram.ui.ActionBar.l6(z6Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
            }
            i17++;
        }
        int i18 = 0;
        while (true) {
            org.telegram.ui.Cells.a9[] a9VarArr = this.f;
            if (i18 >= a9VarArr.length) {
                return arrayList;
            }
            arrayList.add(new org.telegram.ui.ActionBar.l6(a9VarArr[i18], 32, new Class[]{org.telegram.ui.Cells.a9.class}, null, null, null, org.telegram.ui.ActionBar.j6.b7));
            arrayList.add(new org.telegram.ui.ActionBar.l6(a9VarArr[i18], 0, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.B6));
            arrayList.add(new org.telegram.ui.ActionBar.l6(a9VarArr[i18], 2, new Class[]{org.telegram.ui.Cells.a9.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.J6));
            i18++;
        }
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        this.F.removePrimaryClipChangedListener(this.J);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        this.F.addPrimaryClipChangedListener(this.J);
        W();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4 && !z10 && this.G) {
            this.a[0].requestFocus();
            AndroidUtilities.showKeyboard(this.a[0]);
        }
    }

    public w11(SharedConfig.ProxyInfo proxyInfo) {
        super(null);
        this.e = new org.telegram.ui.Cells.z6[3];
        this.f = new org.telegram.ui.Cells.a9[2];
        this.s = new org.telegram.ui.Cells.j6[3];
        this.v = -1;
        this.w = -1;
        this.B = 1.0f;
        this.C = new float[2];
        this.D = true;
        this.J = new ClipboardManager.OnPrimaryClipChangedListener() { // from class: org.telegram.ui.p11
            @Override // android.content.ClipboardManager.OnPrimaryClipChangedListener
            public final void onPrimaryClipChanged() {
                w11.this.W();
            }
        };
        this.H = proxyInfo;
    }
}
