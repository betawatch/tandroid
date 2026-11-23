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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class wx0 extends org.telegram.ui.ActionBar.g2 {
    public float E;
    public float[] F;
    public boolean G;
    public ValueAnimator H;
    public ClipboardManager I;
    public final boolean J;
    public org.telegram.messenger.az K;
    public boolean L;
    public ClipboardManager.OnPrimaryClipChangedListener M;
    public int N;
    public EditTextBoldCursor[] a;
    public tx0 b;
    public sx0 c;
    public LinearLayout d;
    public org.telegram.ui.Cells.y6[] e;
    public org.telegram.ui.Cells.z8[] f;
    public org.telegram.ui.Cells.w9 h;
    public org.telegram.ui.Cells.w9 n;
    public org.telegram.ui.ActionBar.c5 r;
    public org.telegram.ui.Cells.i6[] s;
    public int w;
    public xi.a x;
    public String y;

    public wx0() {
        super(null);
        this.e = new org.telegram.ui.Cells.y6[3];
        this.f = new org.telegram.ui.Cells.z8[2];
        this.s = new org.telegram.ui.Cells.i6[3];
        this.E = 1.0f;
        this.F = new float[2];
        this.G = true;
        this.M = new qx0(this);
        this.K = new org.telegram.messenger.az(xi.a.i);
        this.J = true;
    }

    public final void Z(boolean z10) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z11 = this.w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(xi.i.l(editTextBoldCursor.getText().toString())) || xi.i.f(this.a[4].getText().toString()) == null);
        if (this.G != z11) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z10) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.setDuration(200L);
                this.H.addUpdateListener(new a3(this, 29));
            }
            if (z10) {
                float[] fArr = this.F;
                fArr[0] = this.E;
                fArr[1] = z11 ? 1.0f : 0.0f;
                this.H.start();
            } else {
                this.E = z11 ? 1.0f : 0.0f;
                org.telegram.ui.ActionBar.u6.U(this.h.getTextView(), z11 ? org.telegram.ui.ActionBar.n6.q6 : org.telegram.ui.ActionBar.n6.z6, null);
            }
            this.h.setEnabled(z11);
            this.r.a(z11, z10);
            this.G = z11;
        }
    }

    public final void a0(int i7, boolean z10, ao0 ao0Var) {
        org.telegram.ui.Cells.i6[] i6VarArr = this.s;
        org.telegram.ui.Cells.z8[] z8VarArr = this.f;
        if (this.w != i7) {
            this.w = i7;
            TransitionManager.endTransitions(this.c);
            if (z10) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) org.telegram.ui.Components.kr.f).setDuration(250L);
                if (ao0Var != null) {
                    duration.addListener((Transition.TransitionListener) new vx0(ao0Var));
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
                org.telegram.ui.Cells.c0.u(null, 2131743530, sb2, "\n\n");
                sb2.append(org.telegram.messenger.gd.N0(2131743529, null));
                z8Var.setText(sb2.toString());
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i10 == 3) {
                z8VarArr[0].setVisibility(8);
                z8VarArr[1].setVisibility(0);
                z8VarArr[1].setText(org.telegram.messenger.gd.N0(2131743525, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            i6VarArr[0].a(this.w == 1, z10);
            i6VarArr[1].a(this.w == 2, z10);
            i6VarArr[2].a(this.w == 3, z10);
            Z(z10);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    public final void b0(Context context, String str) {
        org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(context, org.telegram.messenger.gd.N0(2131745252, null), str, org.telegram.messenger.gd.N0(2131746308, null), true);
        zg0Var.r1.setImageBitmap(org.telegram.messenger.lz.e(org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.y2(null, R.raw.qr_dog)));
        showDialog(zg0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c0() {
        String str;
        org.telegram.ui.Cells.y6[] y6VarArr = this.e;
        ClipData primaryClip = this.I.getPrimaryClip();
        xi.a aVar = null;
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
                        aVar = xi.a.d(Uri.parse(str));
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

    @Override // org.telegram.ui.ActionBar.g2
    public final View createView(Context context) {
        org.telegram.ui.Cells.z8[] z8VarArr = this.f;
        org.telegram.messenger.az azVar = this.K;
        org.telegram.ui.Cells.y6[] y6VarArr = this.e;
        org.telegram.ui.Cells.i6[] i6VarArr = this.s;
        final int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746408, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        org.telegram.ui.ActionBar.r4 r4Var = this.parentLayout;
        final int i10 = 0;
        if (r4Var != null && ((ActionBarLayout) r4Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new gs0(this, 7));
        this.r = this.simpleActionBar.s(org.telegram.messenger.gd.N0(2131745750, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.c = new sx0(context);
        tx0 tx0Var = new tx0(context, this.c, this.resourceProvider, true);
        this.b = tx0Var;
        tx0Var.setDrawBackground(true);
        this.b.setFillViewport(true);
        this.b.setOverScrollMode(0);
        org.telegram.messenger.g0.x3(this.b, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.s8, false));
        int i11 = -1;
        frameLayout.addView(this.b, c8.na.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.rx0
            public final /* synthetic */ wx0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i10) {
                    case 0:
                        this.b.a0(xi.a.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        wx0 wx0Var = this.b;
                        xi.a aVar = wx0Var.x;
                        if (aVar != null) {
                            int i12 = aVar.a;
                            int i13 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = wx0Var.a;
                                if (i13 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    wx0Var.a0(i12, true, new ao0(wx0Var, i12, 3));
                                    break;
                                } else {
                                    if ((i12 != 1 || i13 != 4) && (i12 != 2 || (i13 != 2 && i13 != 3))) {
                                        if (i13 == 0) {
                                            str = wx0Var.x.b;
                                        } else if (i13 == 1) {
                                            int i14 = wx0Var.x.c;
                                            if (i14 != 0) {
                                                str = Integer.toString(i14);
                                            }
                                            str = null;
                                        } else if (i13 == 2) {
                                            str = wx0Var.x.d;
                                        } else if (i13 == 3) {
                                            str = wx0Var.x.e;
                                        } else {
                                            if (i13 == 4) {
                                                str = wx0Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            wx0Var.a[i13].setText((CharSequence) null);
                                        } else {
                                            try {
                                                wx0Var.a[i13].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                wx0Var.a[i13].setText(str);
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
            int f10 = xi.a.f(i12);
            org.telegram.ui.Cells.i6 i6Var = new org.telegram.ui.Cells.i6(context, null);
            i6VarArr[i12] = i6Var;
            org.telegram.ui.ActionBar.u6.Q(i6Var, org.telegram.ui.ActionBar.n6.N0(true), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.d6), org.telegram.ui.ActionBar.u6.M(org.telegram.ui.ActionBar.n6.i6), null);
            i6VarArr[i12].setTag(Integer.valueOf(i12));
            if (i12 == 0) {
                i6VarArr[i12].c(org.telegram.messenger.gd.N0(2131743535, null), f10 == this.w, true);
            } else if (i12 == 1) {
                i6VarArr[i12].c(org.telegram.messenger.gd.N0(2131743532, null), f10 == this.w, true);
            } else {
                i6VarArr[i12].c(org.telegram.messenger.gd.N0(2131743526, null), f10 == this.w, false);
            }
            this.c.addView(i6VarArr[i12], c8.na.o(-1, 50));
            i6VarArr[i12].setOnClickListener(onClickListener);
            i12++;
            i11 = -1;
        }
        org.telegram.ui.Cells.y6 y6Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
        y6VarArr[0] = y6Var;
        this.c.addView(y6Var, c8.na.o(i11, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(org.telegram.messenger.g0.L(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, c8.na.o(-1, -2));
        this.a = new EditTextBoldCursor[5];
        int i13 = 0;
        for (int i14 = 5; i13 < i14; i14 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, c8.na.o(-1, 64));
            this.a[i13] = new EditTextBoldCursor(context);
            this.a[i13].setTag(Integer.valueOf(i13));
            this.a[i13].setTextSize(1, 16.0f);
            org.telegram.ui.ActionBar.u6.A(this.a[i13], org.telegram.ui.ActionBar.n6.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.a[i13];
            int i15 = org.telegram.ui.ActionBar.n6.G6;
            org.telegram.ui.ActionBar.u6.U(editTextBoldCursor, i15, null);
            this.a[i13].setBackground(null);
            org.telegram.ui.ActionBar.u6.v(this.a[i13], i15, null);
            this.a[i13].setCursorSize(org.telegram.messenger.g0.L(20.0f));
            this.a[i13].setCursorWidth(1.5f);
            this.a[i13].setSingleLine(true);
            this.a[i13].setGravity((org.telegram.messenger.gd.a0 ? 5 : 3) | 16);
            org.telegram.ui.ActionBar.u6.z(this.a[i13], org.telegram.ui.ActionBar.n6.L6, null);
            this.a[i13].setTransformHintToHeader(true);
            org.telegram.ui.ActionBar.u6.F(this.a[i13], org.telegram.ui.ActionBar.n6.k6, org.telegram.ui.ActionBar.n6.l6, org.telegram.ui.ActionBar.n6.p7, null);
            if (i13 == 0) {
                this.a[i13].setInputType(524305);
                this.a[i13].addTextChangedListener(new ux0(this, 0));
            } else if (i13 == 1) {
                this.a[i13].setInputType(2);
                this.a[i13].addTextChangedListener(new ux0(this, 1));
            } else if (i13 == 3) {
                this.a[i13].setInputType(org.telegram.messenger.ks.N1);
                this.a[i13].setTypeface(Typeface.DEFAULT);
                this.a[i13].setTransformationMethod(PasswordTransformationMethod.getInstance());
            } else {
                this.a[i13].setInputType(524289);
            }
            if (i13 == 4) {
                this.a[i13].addTextChangedListener(new ux0(this, 2));
            }
            this.a[i13].setImeOptions(268435461);
            if (i13 == 0) {
                this.a[i13].setHintText(org.telegram.messenger.gd.N0(2131743544, null));
                this.a[i13].setText(azVar.a.b);
            } else if (i13 == 1) {
                this.a[i13].setHintText(org.telegram.messenger.gd.N0(2131743539, null));
                this.a[i13].setText(Integer.toString(azVar.a.c));
            } else if (i13 == 2) {
                this.a[i13].setHintText(org.telegram.messenger.gd.N0(2131743527, null));
                this.a[i13].setText(azVar.a.d);
            } else if (i13 == 3) {
                this.a[i13].setHintText(org.telegram.messenger.gd.N0(2131743540, null));
                this.a[i13].setText(azVar.a.e);
            } else if (i13 == 4) {
                this.a[i13].setHintText(org.telegram.messenger.gd.N0(2131743537, null));
                this.a[i13].setText(azVar.a.f);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i13];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i13].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i13], c8.na.d(-1, -1.0f, 51, 17.0f, i13 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i13].setOnEditorActionListener(new fa(this, 10));
            i13++;
        }
        for (int i16 = 0; i16 < 2; i16++) {
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8VarArr[i16] = z8Var;
            if (i16 == 0) {
                z8Var.setText(org.telegram.messenger.gd.N0(2131743541, null));
            } else {
                StringBuilder sb2 = new StringBuilder();
                org.telegram.ui.Cells.c0.u(null, 2131743530, sb2, "\n\n");
                sb2.append(org.telegram.messenger.gd.N0(2131743529, null));
                z8Var.setText(sb2.toString());
                z8VarArr[i16].setVisibility(8);
            }
            this.c.addView(z8VarArr[i16], c8.na.o(-1, -2));
        }
        org.telegram.ui.Cells.w9 w9Var = new org.telegram.ui.Cells.w9(this.fragmentView.getContext());
        this.n = w9Var;
        org.telegram.ui.Cells.y N0 = org.telegram.ui.ActionBar.n6.N0(true);
        int i17 = org.telegram.ui.ActionBar.n6.d6;
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i17);
        int i18 = org.telegram.ui.ActionBar.n6.i6;
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i18);
        w9Var.setBackground(N0);
        org.telegram.ui.ActionBar.u6.j(w9Var, N0, M, M2, null);
        this.n.b(org.telegram.messenger.gd.N0(2131747240, null), false);
        TextView textView = this.n.getTextView();
        int i19 = org.telegram.ui.ActionBar.n6.q6;
        org.telegram.ui.ActionBar.u6.U(textView, i19, null);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.rx0
            public final /* synthetic */ wx0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                switch (i7) {
                    case 0:
                        this.b.a0(xi.a.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        wx0 wx0Var = this.b;
                        xi.a aVar = wx0Var.x;
                        if (aVar != null) {
                            int i122 = aVar.a;
                            int i132 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = wx0Var.a;
                                if (i132 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    wx0Var.a0(i122, true, new ao0(wx0Var, i122, 3));
                                    break;
                                } else {
                                    if ((i122 != 1 || i132 != 4) && (i122 != 2 || (i132 != 2 && i132 != 3))) {
                                        if (i132 == 0) {
                                            str = wx0Var.x.b;
                                        } else if (i132 == 1) {
                                            int i142 = wx0Var.x.c;
                                            if (i142 != 0) {
                                                str = Integer.toString(i142);
                                            }
                                            str = null;
                                        } else if (i132 == 2) {
                                            str = wx0Var.x.d;
                                        } else if (i132 == 3) {
                                            str = wx0Var.x.e;
                                        } else {
                                            if (i132 == 4) {
                                                str = wx0Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            wx0Var.a[i132].setText((CharSequence) null);
                                        } else {
                                            try {
                                                wx0Var.a[i132].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                wx0Var.a[i132].setText(str);
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
        this.c.addView(this.n, 0, c8.na.o(-1, -2));
        this.n.setVisibility(8);
        org.telegram.ui.Cells.y6 y6Var2 = new org.telegram.ui.Cells.y6(this.fragmentView.getContext(), (org.telegram.ui.Cells.c0) null);
        y6VarArr[2] = y6Var2;
        this.c.addView(y6Var2, 1, c8.na.o(-1, -2));
        y6VarArr[2].setVisibility(8);
        org.telegram.ui.Cells.w9 w9Var2 = new org.telegram.ui.Cells.w9(context);
        this.h = w9Var2;
        org.telegram.ui.Cells.y N02 = org.telegram.ui.ActionBar.n6.N0(true);
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i17);
        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i18);
        w9Var2.setBackground(N02);
        org.telegram.ui.ActionBar.u6.j(w9Var2, N02, M3, M4, null);
        this.h.b(org.telegram.messenger.gd.N0(2131745263, null), false);
        org.telegram.ui.ActionBar.u6.U(this.h.getTextView(), i19, null);
        this.c.addView(this.h, c8.na.o(-1, -2));
        this.h.setOnClickListener(new ig0(9, this, context));
        org.telegram.ui.Cells.y6 y6Var3 = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.c0) null);
        y6VarArr[1] = y6Var3;
        this.c.addView(y6Var3, c8.na.o(-1, -2));
        this.I = (ClipboardManager) context.getSystemService("clipboard");
        this.G = true;
        this.E = 1.0f;
        Z(false);
        this.w = 0;
        a0(azVar.a.a, false, null);
        this.x = null;
        this.y = null;
        c0();
        return this.fragmentView;
    }

    public final void d0() {
        int x02;
        try {
            int i7 = 0;
            if (this.b != null && (x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.s8, false)) != this.N) {
                this.N = x02;
                org.telegram.messenger.g0.x3(this.b, x02);
            }
            if (this.a == null) {
                return;
            }
            org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.H6);
            org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.G6);
            org.telegram.ui.ActionBar.n6.v0(org.telegram.ui.ActionBar.n6.L6);
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i7 >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i7];
                if (editTextBoldCursor != null) {
                    org.telegram.ui.ActionBar.u6.l(editTextBoldCursor, 34, org.telegram.ui.ActionBar.n6.H6, null);
                    org.telegram.ui.ActionBar.u6.v(this.a[i7], org.telegram.ui.ActionBar.n6.G6, null);
                    org.telegram.ui.ActionBar.u6.z(this.a[i7], org.telegram.ui.ActionBar.n6.L6, null);
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final org.telegram.ui.Components.vm0 getScrollViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.s8));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        for (int i7 = 0; i7 < this.s.length; i7++) {
        }
        if (this.a != null) {
            int i10 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i10 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new org.telegram.ui.ActionBar.w6(editTextBoldCursorArr[i10], TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.H6));
                arrayList.add(new org.telegram.ui.ActionBar.w6(this.a[i10], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.L6));
                i10++;
            }
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.H6));
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
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

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onPause() {
        super.onPause();
        this.I.removePrimaryClipChangedListener(this.M);
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onResume() {
        super.onResume();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        this.I.addPrimaryClipChangedListener(this.M);
        c0();
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            if (this.h != null) {
                ValueAnimator valueAnimator = this.H;
                if (valueAnimator != null) {
                    if (!valueAnimator.isRunning()) {
                    }
                }
                org.telegram.ui.ActionBar.u6.U(this.h.getTextView(), this.G ? org.telegram.ui.ActionBar.n6.q6 : org.telegram.ui.ActionBar.n6.z6, null);
            }
            d0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10 && !z11 && this.J) {
            this.a[0].requestFocus();
            org.telegram.messenger.g0.I3(this.a[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.g2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
