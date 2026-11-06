package org.telegram.ui;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
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
import android.widget.TextView;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ux0 extends org.telegram.ui.ActionBar.f2 {
    public float D;
    public float[] E;
    public boolean F;
    public ValueAnimator G;
    public ClipboardManager H;
    public final boolean I;
    public org.telegram.messenger.hz J;
    public boolean K;
    public ClipboardManager.OnPrimaryClipChangedListener L;
    public int M;
    public EditTextBoldCursor[] a;
    public rx0 b;
    public qx0 c;
    public LinearLayout d;
    public org.telegram.ui.Cells.y6[] e;
    public org.telegram.ui.Cells.z8[] f;
    public org.telegram.ui.Cells.w9 h;
    public org.telegram.ui.Cells.w9 n;
    public org.telegram.ui.ActionBar.b5 r;
    public org.telegram.ui.Cells.i6[] s;
    public int w;
    public ui.a x;
    public String y;

    public ux0() {
        super(null);
        this.e = new org.telegram.ui.Cells.y6[3];
        this.f = new org.telegram.ui.Cells.z8[2];
        this.s = new org.telegram.ui.Cells.i6[3];
        this.D = 1.0f;
        this.E = new float[2];
        this.F = true;
        this.L = new ox0(this);
        this.J = new org.telegram.messenger.hz(ui.a.i);
        this.I = true;
    }

    public final void Z(boolean z9) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z10 = this.w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(ui.i.l(editTextBoldCursor.getText().toString())) || ui.i.f(this.a[4].getText().toString()) == null);
        if (this.F != z10) {
            ValueAnimator valueAnimator = this.G;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z9) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.G = ofFloat;
                ofFloat.setDuration(200L);
                this.G.addUpdateListener(new a3(this, 29));
            }
            if (z9) {
                float[] fArr = this.E;
                fArr[0] = this.D;
                fArr[1] = z10 ? 1.0f : 0.0f;
                this.G.start();
            } else {
                this.D = z10 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.r6.V(this.h.getTextView(), z10 ? org.telegram.ui.ActionBar.k6.q6 : org.telegram.ui.ActionBar.k6.z6, null);
            }
            this.h.setEnabled(z10);
            this.r.a(z10, z9);
            this.F = z10;
        }
    }

    public final void a0(int i7, boolean z9, org.telegram.ui.Components.r2 r2Var) {
        org.telegram.ui.Cells.i6[] i6VarArr = this.s;
        org.telegram.ui.Cells.z8[] z8VarArr = this.f;
        if (this.w != i7) {
            this.w = i7;
            TransitionManager.endTransitions(this.c);
            if (z9) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.xq.f).setDuration(250L);
                if (r2Var != null) {
                    duration.addListener((Transition.TransitionListener) new tx0(r2Var));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i10 = this.w;
            if (i10 == 1) {
                z8VarArr[0].setVisibility(0);
                z8VarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i10 == 2) {
                z8VarArr[0].setVisibility(8);
                z8VarArr[1].setVisibility(0);
                org.telegram.ui.Cells.z8 z8Var = z8VarArr[1];
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131743778, sb2, "\n\n");
                sb2.append(org.telegram.messenger.hd.M0(2131743777, null));
                z8Var.setText(sb2.toString());
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i10 == 3) {
                z8VarArr[0].setVisibility(8);
                z8VarArr[1].setVisibility(0);
                z8VarArr[1].setText(org.telegram.messenger.hd.M0(2131743773, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            i6VarArr[0].a(this.w == 1, z9);
            i6VarArr[1].a(this.w == 2, z9);
            i6VarArr[2].a(this.w == 3, z9);
            Z(z9);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.s8));
    }

    public final void b0(Context context, String str) {
        org.telegram.ui.Components.lg0 lg0Var = new org.telegram.ui.Components.lg0(context, org.telegram.messenger.hd.M0(2131745449, null), str, org.telegram.messenger.hd.M0(2131746503, null), true);
        lg0Var.n1.setImageBitmap(org.telegram.messenger.sz.e(org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.y2(null, R.raw.qr_dog)));
        showDialog(lg0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        String str;
        org.telegram.ui.Cells.y6[] y6VarArr = this.e;
        ClipData primaryClip = this.H.getPrimaryClip();
        ui.a aVar = null;
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            try {
                str = primaryClip.getItemAt(0).coerceToText(this.fragmentView.getContext()).toString();
            } catch (Exception unused) {
            }
            if (TextUtils.equals(str, this.y)) {
                this.x = null;
                this.y = str;
                if (str != null) {
                    try {
                        aVar = ui.a.d(Uri.parse(str));
                    } catch (Exception unused2) {
                    }
                    if (aVar != null && aVar.g()) {
                        this.x = aVar;
                    }
                }
                if (this.x != null) {
                    if (this.n.getVisibility() != 0) {
                        this.n.setVisibility(0);
                        y6VarArr[2].setVisibility(0);
                        return;
                    }
                    return;
                }
                if (this.n.getVisibility() != 8) {
                    this.n.setVisibility(8);
                    y6VarArr[2].setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        str = null;
        if (TextUtils.equals(str, this.y)) {
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final View createView(Context context) {
        org.telegram.ui.Cells.z8[] z8VarArr = this.f;
        org.telegram.messenger.hz hzVar = this.J;
        org.telegram.ui.Cells.y6[] y6VarArr = this.e;
        org.telegram.ui.Cells.i6[] i6VarArr = this.s;
        final int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746603, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        final int i10 = 0;
        if (q4Var != null && ((ActionBarLayout) q4Var).S0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new mt0(this, 4));
        this.r = this.simpleActionBar.n(org.telegram.messenger.hd.M0(2131745947, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.c = new qx0(context);
        rx0 rx0Var = new rx0(context, this.c, this.resourceProvider, true);
        this.b = rx0Var;
        rx0Var.setDrawBackground(true);
        this.b.setFillViewport(true);
        this.b.setOverScrollMode(0);
        org.telegram.messenger.g0.z3(this.b, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false));
        int i11 = -1;
        frameLayout.addView(this.b, c8.ha.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.px0
            public final /* synthetic */ ux0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i10) {
                    case 0:
                        this.b.a0(ui.a.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        ux0 ux0Var = this.b;
                        ui.a aVar = ux0Var.x;
                        if (aVar != null) {
                            int i12 = aVar.a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = ux0Var.a;
                                if (i13 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    ux0Var.a0(i12, true, new org.telegram.ui.Components.r2(ux0Var, i12, 25));
                                    break;
                                } else {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = ux0Var.x.b;
                                        } else if (i13 == 1) {
                                            int i14 = ux0Var.x.c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = ux0Var.x.d;
                                        } else if (i13 == 3) {
                                            str = ux0Var.x.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = ux0Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            ux0Var.a[i13].setText((CharSequence) null);
                                        } else {
                                            try {
                                                ux0Var.a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                ux0Var.a[i13].setText(str);
                                            }
                                        }
                                    }
                                    i13++;
                                }
                            }
                        }
                        break;
                }
            }
        };
        int i12 = 0;
        while (i12 < 3) {
            int f10 = ui.a.f(i12);
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
            i6VarArr[i12] = i6Var;
            org.telegram.ui.ActionBar.r6.R(i6Var, org.telegram.ui.ActionBar.k6.N0(true), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.d6), org.telegram.ui.ActionBar.r6.N(org.telegram.ui.ActionBar.k6.i6), null);
            i6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                i6VarArr[i12].c(org.telegram.messenger.hd.M0(2131743783, null), f10 == this.w, true);
            } else if (i12 == 1) {
                i6VarArr[i12].c(org.telegram.messenger.hd.M0(2131743780, null), f10 == this.w, true);
            } else {
                i6VarArr[i12].c(org.telegram.messenger.hd.M0(2131743774, null), f10 == this.w, false);
            }
            this.c.addView(i6VarArr[i12], c8.ha.o(-1, 50));
            i6VarArr[i12].setOnClickListener(onClickListener);
            i12++;
            i11 = -1;
        }
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        y6VarArr[0] = y6Var;
        this.c.addView(y6Var, c8.ha.o(i11, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(org.telegram.messenger.g0.L(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, c8.ha.o(-1, -2));
        this.a = new EditTextBoldCursor[5];
        int i13 = 0;
        for (int i14 = 5; i13 < i14; i14 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, c8.ha.o(-1, 64));
            this.a[i13] = new EditTextBoldCursor(context);
            this.a[i13].setTag(Integer.valueOf(i13));
            this.a[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.r6.B(this.a[i13], org.telegram.ui.ActionBar.k6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.a[i13];
            int i15 = org.telegram.ui.ActionBar.k6.G6;
            org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, i15, null);
            this.a[i13].setBackground(null);
            org.telegram.ui.ActionBar.r6.w(this.a[i13], i15, null);
            this.a[i13].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.a[i13].setCursorWidth(1.5f);
            this.a[i13].setSingleLine(true);
            this.a[i13].setGravity((org.telegram.messenger.hd.a0 ? 5 : 3) | 16);
            org.telegram.ui.ActionBar.r6.A(this.a[i13], org.telegram.ui.ActionBar.k6.L6, null);
            this.a[i13].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.r6.G(this.a[i13], org.telegram.ui.ActionBar.k6.k6, org.telegram.ui.ActionBar.k6.l6, org.telegram.ui.ActionBar.k6.p7, null);
            if (i13 == 0) {
                this.a[i13].setInputType(524305);
                this.a[i13].addTextChangedListener(new sx0(this, 0));
            } else if (i13 == 1) {
                this.a[i13].setInputType(2);
                this.a[i13].addTextChangedListener(new sx0(this, 1));
            } else if (i13 == 3) {
                this.a[i13].setInputType(org.telegram.messenger.qs.N1);
                this.a[i13].setTypeface(Typeface.DEFAULT);
                this.a[i13].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.a[i13].setInputType(524289);
            }
            if (i13 == 4) {
                this.a[i13].addTextChangedListener(new sx0(this, 2));
            }
            this.a[i13].setImeOptions(268435461);
            if (i13 == 0) {
                this.a[i13].setHintText(org.telegram.messenger.hd.M0(2131743792, null));
                this.a[i13].setText(hzVar.a.b);
            } else if (i13 == 1) {
                this.a[i13].setHintText(org.telegram.messenger.hd.M0(2131743787, null));
                this.a[i13].setText(Integer.toString(hzVar.a.c));
            } else if (i13 == 2) {
                this.a[i13].setHintText(org.telegram.messenger.hd.M0(2131743775, null));
                this.a[i13].setText(hzVar.a.d);
            } else if (i13 == 3) {
                this.a[i13].setHintText(org.telegram.messenger.hd.M0(2131743788, null));
                this.a[i13].setText(hzVar.a.e);
            } else if (i13 == 4) {
                this.a[i13].setHintText(org.telegram.messenger.hd.M0(2131743785, null));
                this.a[i13].setText(hzVar.a.f);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i13];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i13].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i13], c8.ha.d(-1, -1.0f, 51, 17.0f, i13 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i13].setOnEditorActionListener(new fa(this, 10));
            i13++;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8VarArr[i16] = z8Var;
            if (i16 == 0) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131743789, null));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.messenger.camera.q.q(null, 2131743778, sb2, "\n\n");
                sb2.append(org.telegram.messenger.hd.M0(2131743777, null));
                z8Var.setText(sb2.toString());
                z8VarArr[i16].setVisibility(8);
            }
            this.c.addView(z8VarArr[i16], c8.ha.o(-1, -2));
        }
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(this.fragmentView.getContext());
        this.n = w9Var;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.k6.N0(true);
        int i17 = org.telegram.ui.ActionBar.k6.d6;
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i17);
        int i18 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i18);
        w9Var.setBackground(N0);
        org.telegram.ui.ActionBar.r6.k(w9Var, N0, N, N2, null);
        this.n.b(org.telegram.messenger.hd.M0(2131747433, null), false);
        TextView textView = this.n.getTextView();
        int i19 = org.telegram.ui.ActionBar.k6.q6;
        org.telegram.ui.ActionBar.r6.V(textView, i19, null);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.px0
            public final /* synthetic */ ux0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i7) {
                    case 0:
                        this.b.a0(ui.a.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        ux0 ux0Var = this.b;
                        ui.a aVar = ux0Var.x;
                        if (aVar != null) {
                            int i122 = aVar.a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = ux0Var.a;
                                if (i132 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    ux0Var.a0(i122, true, new org.telegram.ui.Components.r2(ux0Var, i122, 25));
                                    break;
                                } else {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = ux0Var.x.b;
                                        } else if (i132 == 1) {
                                            int i142 = ux0Var.x.c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = ux0Var.x.d;
                                        } else if (i132 == 3) {
                                            str = ux0Var.x.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = ux0Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            ux0Var.a[i132].setText((CharSequence) null);
                                        } else {
                                            try {
                                                ux0Var.a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                ux0Var.a[i132].setText(str);
                                            }
                                        }
                                    }
                                    i132++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.c.addView(this.n, 0, c8.ha.o(-1, -2));
        this.n.setVisibility(8);
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(this.fragmentView.getContext(), (org.telegram.ui.Cells.f1) null);
        y6VarArr[2] = y6Var2;
        this.c.addView(y6Var2, 1, c8.ha.o(-1, -2));
        y6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
        this.h = w9Var2;
        org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.k6.N0(true);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i17);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i18);
        w9Var2.setBackground(N02);
        org.telegram.ui.ActionBar.r6.k(w9Var2, N02, N3, N4, null);
        this.h.b(org.telegram.messenger.hd.M0(2131745460, null), false);
        org.telegram.ui.ActionBar.r6.V(this.h.getTextView(), i19, null);
        this.c.addView(this.h, c8.ha.o(-1, -2));
        this.h.setOnClickListener(new fk0(7, this, context));
        org.telegram.ui.Cells.y6 y6Var3 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
        y6VarArr[1] = y6Var3;
        this.c.addView(y6Var3, c8.ha.o(-1, -2));
        this.H = (ClipboardManager) context.getSystemService("clipboard");
        this.F = true;
        this.D = 1.0f;
        Z(false);
        this.w = 0;
        a0(hzVar.a.a, false, null);
        this.x = null;
        this.y = null;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        int x02;
        try {
            int i7 = 0;
            if (this.b != null && (x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.s8, false)) != this.M) {
                this.M = x02;
                org.telegram.messenger.g0.z3(this.b, x02);
            }
            if (this.a == null) {
                return;
            }
            org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.H6);
            org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6);
            org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L6);
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i7 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.r6.m(editTextBoldCursor, 34, org.telegram.ui.ActionBar.k6.H6, null);
                    org.telegram.ui.ActionBar.r6.w(this.a[i7], org.telegram.ui.ActionBar.k6.G6, null);
                    org.telegram.ui.ActionBar.r6.A(this.a[i7], org.telegram.ui.ActionBar.k6.L6, null);
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final org.telegram.ui.Components.hm0 getScrollViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        for (int i7 = 0; i7 < this.s.length; i7++) {
        }
        if (this.a != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursorArr[i10], TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.t6(this.a[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.L6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.d6));
        int i11 = 0;
        while (true) {
            org.telegram.ui.Cells.y6[] y6VarArr = this.e;
            if (i11 >= y6VarArr.length) {
                break;
            }
            org.telegram.ui.Cells.y6 y6Var = y6VarArr[i11];
            i11++;
        }
        for (int i12 = 0; i12 < this.f.length; i12++) {
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        this.H.removePrimaryClipChangedListener(this.L);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        this.H.addPrimaryClipChangedListener(this.L);
        c0();
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            if (this.h != null) {
                ValueAnimator valueAnimator = this.G;
                if (valueAnimator != null) {
                    if (!valueAnimator.isRunning()) {
                    }
                }
                org.telegram.ui.ActionBar.r6.V(this.h.getTextView(), this.F ? org.telegram.ui.ActionBar.k6.q6 : org.telegram.ui.ActionBar.k6.z6, null);
            }
            d0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9 && !z10 && this.I) {
            this.a[0].requestFocus();
            org.telegram.messenger.g0.K3(this.a[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
