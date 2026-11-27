// default package

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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ox8 extends e {
    public float E;
    public float[] F;
    public boolean G;
    public ValueAnimator H;
    public ClipboardManager I;
    public final boolean J;
    public wea K;
    public boolean L;
    public ClipboardManager.OnPrimaryClipChangedListener M;
    public int N;
    public EditTextBoldCursor[] a;
    public mx8 b;
    public p56 c;
    public LinearLayout d;
    public rca[] e;
    public ilb[] f;
    public qmb h;
    public qmb n;
    public nla r;
    public i29[] s;
    public int w;
    public jx8 x;
    public String y;

    public ox8() {
        super(null);
        this.e = new rca[3];
        this.f = new ilb[2];
        this.s = new i29[3];
        this.E = 1.0f;
        this.F = new float[2];
        this.G = true;
        this.M = new kx8(this, (byte) 0);
        this.K = new wea(jx8.i);
        this.J = true;
    }

    public final void Y(boolean z) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        EditTextBoldCursor editTextBoldCursor;
        if (this.h == null || this.r == null || (editTextBoldCursor = (editTextBoldCursorArr = this.a)[0]) == null || editTextBoldCursorArr[1] == null) {
            return;
        }
        boolean z2 = this.w != 3 ? !(editTextBoldCursor.length() == 0 || Utilities.z(this.a[1].getText().toString()).intValue() == 0) : !(TextUtils.isEmpty(pyc.l(editTextBoldCursor.getText().toString())) || pyc.f(this.a[4].getText().toString()) == null);
        if (this.G != z2) {
            ValueAnimator valueAnimator = this.H;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            } else if (z) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.H = ofFloat;
                ofFloat.setDuration(200L);
                this.H.addUpdateListener(new pv7(this, (byte) 23));
            }
            if (z) {
                float[] fArr = this.F;
                fArr[0] = this.E;
                fArr[1] = z2 ? 1.0f : 0.0f;
                this.H.start();
            } else {
                this.E = z2 ? 1.0f : 0.0f;
                yob.X(this.h.getTextView(), z2 ? aob.q6 : aob.z6, null);
            }
            this.h.setEnabled(z2);
            this.r.a(z2, z);
            this.G = z2;
        }
    }

    public final void Z(int i, boolean z, me7 me7Var) {
        i29[] i29VarArr = this.s;
        ilb[] ilbVarArr = this.f;
        if (this.w != i) {
            this.w = i;
            TransitionManager.endTransitions(this.c);
            byte b = 2;
            if (z) {
                TransitionSet duration = new TransitionSet().addTransition(new Fade(2)).addTransition(new ChangeBounds()).addTransition(new Fade(1)).setInterpolator((TimeInterpolator) k43.f).setDuration(250L);
                if (me7Var != null) {
                    duration.addListener((Transition.TransitionListener) new j7(me7Var, b));
                }
                TransitionManager.beginDelayedTransition(this.c, duration);
            }
            int i2 = this.w;
            if (i2 == 1) {
                ilbVarArr[0].setVisibility(0);
                ilbVarArr[1].setVisibility(8);
                ((View) this.a[4].getParent()).setVisibility(8);
                ((View) this.a[3].getParent()).setVisibility(0);
                ((View) this.a[2].getParent()).setVisibility(0);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 2) {
                ilbVarArr[0].setVisibility(8);
                ilbVarArr[1].setVisibility(0);
                ilbVarArr[1].setText(ob6.M0(2131743432, null) + "\n\n" + ob6.M0(2131743431, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(0);
            } else if (i2 == 3) {
                ilbVarArr[0].setVisibility(8);
                ilbVarArr[1].setVisibility(0);
                ilbVarArr[1].setText(ob6.M0(2131743427, null));
                ((View) this.a[4].getParent()).setVisibility(0);
                ((View) this.a[3].getParent()).setVisibility(8);
                ((View) this.a[2].getParent()).setVisibility(8);
                ((View) this.a[1].getParent()).setVisibility(8);
                this.a[1].setText("443");
            }
            i29VarArr[0].a(this.w == 1, z);
            i29VarArr[1].a(this.w == 2, z);
            i29VarArr[2].a(this.w == 3, z);
            Y(z);
        }
    }

    public final void a0(Context context, String str) {
        ky8 ky8Var = new ky8(context, ob6.M0(2131745176, null), str, ob6.M0(2131746231, null), true);
        ky8Var.q1.setImageBitmap(hgb.e(hl.L(60.0f), hl.L(60.0f), hl.v2(null, R.raw.qr_dog)));
        showDialog(ky8Var);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.b7));
        hashSet.add(Integer.valueOf(aob.h7));
        hashSet.add(Integer.valueOf(aob.g7));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b0() {
        String str;
        rca[] rcaVarArr = this.e;
        ClipData primaryClip = this.I.getPrimaryClip();
        jx8 jx8Var = null;
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
                        jx8Var = jx8.d(Uri.parse(str));
                    } catch (Exception unused2) {
                    }
                    if (jx8Var != null && jx8Var.g()) {
                        this.x = jx8Var;
                    }
                }
                jx8 jx8Var2 = this.x;
                qmb qmbVar = this.n;
                if (jx8Var2 != null) {
                    if (qmbVar.getVisibility() != 0) {
                        this.n.setVisibility(0);
                        rcaVarArr[2].setVisibility(0);
                        return;
                    }
                    return;
                }
                if (qmbVar.getVisibility() != 8) {
                    this.n.setVisibility(8);
                    rcaVarArr[2].setVisibility(8);
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

    public final void c0() {
        int w0;
        try {
            int i = 0;
            if (this.b != null && (w0 = aob.w0(null, aob.s8, false)) != this.N) {
                this.N = w0;
                hl.u3(this.b, w0);
            }
            if (this.a == null) {
                return;
            }
            aob.u0(aob.H6);
            aob.u0(aob.G6);
            aob.u0(aob.L6);
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i >= editTextBoldCursorArr.length) {
                    return;
                }
                EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[i];
                if (editTextBoldCursor != null) {
                    yob.l(editTextBoldCursor, 34, aob.H6, null);
                    yob.v(this.a[i], aob.G6, null);
                    yob.z(this.a[i], aob.L6, null);
                }
                i++;
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        ilb[] ilbVarArr = this.f;
        wea weaVar = this.K;
        rca[] rcaVarArr = this.e;
        i29[] i29VarArr = this.s;
        final byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setTitle(ob6.M0(2131746331, null));
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        wk5 wk5Var = this.parentLayout;
        final byte b2 = 0;
        if (wk5Var != null && ((ActionBarLayout) wk5Var).T0) {
            this.simpleActionBar.setOccupyStatusBar(false);
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 6));
        this.r = this.simpleActionBar.u(ob6.M0(2131745674, null));
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        this.c = new p56(context);
        mx8 mx8Var = new mx8(context, this.c, this.resourceProvider, true);
        this.b = mx8Var;
        mx8Var.setDrawBackground(true);
        this.b.setFillViewport(true);
        this.b.setOverScrollMode(0);
        hl.u3(this.b, aob.w0(null, aob.s8, false));
        int i = -1;
        frameLayout.addView(this.b, tre.c(-1.0f, -1));
        this.c.setOrientation(1);
        this.b.addView(this.c, new FrameLayout.LayoutParams(-1, -2));
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: lx8
            public final /* synthetic */ ox8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                byte b3 = b2;
                ox8 ox8Var = this.b;
                switch (b3) {
                    case 0:
                        ox8Var.Z(jx8.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        jx8 jx8Var = ox8Var.x;
                        if (jx8Var != null) {
                            int i2 = jx8Var.a;
                            int i3 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr = ox8Var.a;
                                if (i3 >= editTextBoldCursorArr.length) {
                                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                                    ox8Var.Z(i2, true, new me7(ox8Var, i2, (byte) 10));
                                    break;
                                } else {
                                    if ((i2 != 1 || i3 != 4) && (i2 != 2 || (i3 != 2 && i3 != 3))) {
                                        if (i3 == 0) {
                                            str = ox8Var.x.b;
                                        } else if (i3 == 1) {
                                            int i4 = ox8Var.x.c;
                                            if (i4 != 0) {
                                                str = Integer.toString(i4);
                                            }
                                            str = null;
                                        } else if (i3 == 2) {
                                            str = ox8Var.x.d;
                                        } else if (i3 == 3) {
                                            str = ox8Var.x.e;
                                        } else {
                                            if (i3 == 4) {
                                                str = ox8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            ox8Var.a[i3].setText((CharSequence) null);
                                        } else {
                                            try {
                                                ox8Var.a[i3].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                ox8Var.a[i3].setText(str);
                                            }
                                        }
                                    }
                                    i3++;
                                }
                            }
                        }
                        break;
                }
            }
        };
        int i2 = 0;
        while (i2 < 3) {
            int f = jx8.f(i2);
            i29 i29Var = new i29(context, null);
            i29VarArr[i2] = i29Var;
            yob.R(i29Var, aob.L0(true), yob.M(aob.d6), yob.M(aob.i6), null);
            i29VarArr[i2].setTag(Integer.valueOf(i2));
            if (i2 == 0) {
                i29VarArr[i2].c(ob6.M0(2131743437, null), f == this.w, true);
            } else if (i2 == 1) {
                i29VarArr[i2].c(ob6.M0(2131743434, null), f == this.w, true);
            } else {
                i29VarArr[i2].c(ob6.M0(2131743428, null), f == this.w, false);
            }
            this.c.addView(i29VarArr[i2], tre.o(-1, 50));
            i29VarArr[i2].setOnClickListener(onClickListener);
            i2++;
            i = -1;
        }
        rca rcaVar = new rca(context, (uh9) null);
        rcaVarArr[0] = rcaVar;
        this.c.addView(rcaVar, tre.o(i, -2));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setOrientation(1);
        this.d.setElevation(hl.L(1.0f));
        this.d.setOutlineProvider(null);
        this.c.addView(this.d, tre.o(-1, -2));
        this.a = new EditTextBoldCursor[5];
        int i3 = 0;
        for (int i4 = 5; i3 < i4; i4 = 5) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.d.addView(frameLayout2, tre.o(-1, 64));
            this.a[i3] = new EditTextBoldCursor(context);
            this.a[i3].setTag(Integer.valueOf(i3));
            this.a[i3].setTextSize(1, 16.0f);
            yob.A(this.a[i3], aob.H6, null);
            EditTextBoldCursor editTextBoldCursor = this.a[i3];
            int i5 = aob.G6;
            yob.X(editTextBoldCursor, i5, null);
            this.a[i3].setBackground(null);
            yob.v(this.a[i3], i5, null);
            this.a[i3].setCursorSize(hl.L(20.0f));
            this.a[i3].setCursorWidth(1.5f);
            this.a[i3].setSingleLine(true);
            this.a[i3].setGravity((ob6.a0 ? 5 : 3) | 16);
            yob.z(this.a[i3], aob.L6, null);
            this.a[i3].setTransformHintToHeader(true);
            yob.F(this.a[i3], aob.k6, aob.l6, aob.p7, null);
            if (i3 == 0) {
                this.a[i3].setInputType(524305);
                this.a[i3].addTextChangedListener(new nx8(this, (byte) 0));
            } else {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i3 == 1) {
                    editTextBoldCursorArr[i3].setInputType(2);
                    this.a[i3].addTextChangedListener(new nx8(this, (byte) 1));
                } else if (i3 == 3) {
                    editTextBoldCursorArr[i3].setInputType(jn7.M1);
                    this.a[i3].setTypeface(Typeface.DEFAULT);
                    this.a[i3].setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    editTextBoldCursorArr[i3].setInputType(524289);
                }
            }
            if (i3 == 4) {
                this.a[i3].addTextChangedListener(new nx8(this, (byte) 2));
            }
            this.a[i3].setImeOptions(268435461);
            if (i3 == 0) {
                this.a[i3].setHintText(ob6.M0(2131743446, null));
                this.a[i3].setText(weaVar.a.b);
            } else if (i3 == 1) {
                this.a[i3].setHintText(ob6.M0(2131743441, null));
                this.a[i3].setText(Integer.toString(weaVar.a.c));
            } else if (i3 == 2) {
                this.a[i3].setHintText(ob6.M0(2131743429, null));
                this.a[i3].setText(weaVar.a.d);
            } else if (i3 == 3) {
                this.a[i3].setHintText(ob6.M0(2131743442, null));
                this.a[i3].setText(weaVar.a.e);
            } else if (i3 == 4) {
                this.a[i3].setHintText(ob6.M0(2131743439, null));
                this.a[i3].setText(weaVar.a.f);
            }
            EditTextBoldCursor editTextBoldCursor2 = this.a[i3];
            editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
            this.a[i3].setPadding(0, 0, 0, 0);
            frameLayout2.addView(this.a[i3], tre.d(-1, -1.0f, 51, 17.0f, i3 == 0 ? 12.0f : 0.0f, 17.0f, 0.0f));
            this.a[i3].setOnEditorActionListener(new j(this, (byte) 19));
            i3++;
        }
        for (int i6 = 0; i6 < 2; i6++) {
            ilb ilbVar = new ilb(context);
            ilbVarArr[i6] = ilbVar;
            if (i6 == 0) {
                ilbVar.setText(ob6.M0(2131743443, null));
            } else {
                ilbVar.setText(ob6.M0(2131743432, null) + "\n\n" + ob6.M0(2131743431, null));
                ilbVarArr[i6].setVisibility(8);
            }
            this.c.addView(ilbVarArr[i6], tre.o(-1, -2));
        }
        qmb qmbVar = new qmb(this.fragmentView.getContext());
        this.n = qmbVar;
        hf0 L0 = aob.L0(true);
        int i7 = aob.d6;
        uob M = yob.M(i7);
        int i8 = aob.i6;
        uob M2 = yob.M(i8);
        qmbVar.setBackground(L0);
        yob.j(qmbVar, L0, M, M2, null);
        this.n.b(ob6.M0(2131747161, null), false);
        TextView textView = this.n.getTextView();
        int i9 = aob.q6;
        yob.X(textView, i9, null);
        this.n.setOnClickListener(new View.OnClickListener(this) { // from class: lx8
            public final /* synthetic */ ox8 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str;
                byte b3 = b;
                ox8 ox8Var = this.b;
                switch (b3) {
                    case 0:
                        ox8Var.Z(jx8.f(((Integer) view.getTag()).intValue()), true, null);
                        break;
                    default:
                        jx8 jx8Var = ox8Var.x;
                        if (jx8Var != null) {
                            int i22 = jx8Var.a;
                            int i32 = 0;
                            while (true) {
                                EditTextBoldCursor[] editTextBoldCursorArr2 = ox8Var.a;
                                if (i32 >= editTextBoldCursorArr2.length) {
                                    EditTextBoldCursor editTextBoldCursor3 = editTextBoldCursorArr2[0];
                                    editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                    ox8Var.Z(i22, true, new me7(ox8Var, i22, (byte) 10));
                                    break;
                                } else {
                                    if ((i22 != 1 || i32 != 4) && (i22 != 2 || (i32 != 2 && i32 != 3))) {
                                        if (i32 == 0) {
                                            str = ox8Var.x.b;
                                        } else if (i32 == 1) {
                                            int i42 = ox8Var.x.c;
                                            if (i42 != 0) {
                                                str = Integer.toString(i42);
                                            }
                                            str = null;
                                        } else if (i32 == 2) {
                                            str = ox8Var.x.d;
                                        } else if (i32 == 3) {
                                            str = ox8Var.x.e;
                                        } else {
                                            if (i32 == 4) {
                                                str = ox8Var.x.f;
                                            }
                                            str = null;
                                        }
                                        if (TextUtils.isEmpty(str)) {
                                            ox8Var.a[i32].setText((CharSequence) null);
                                        } else {
                                            try {
                                                ox8Var.a[i32].setText(URLDecoder.decode(str, "UTF-8"));
                                            } catch (UnsupportedEncodingException unused) {
                                                ox8Var.a[i32].setText(str);
                                            }
                                        }
                                    }
                                    i32++;
                                }
                            }
                        }
                        break;
                }
            }
        });
        this.c.addView(this.n, 0, tre.o(-1, -2));
        this.n.setVisibility(8);
        rca rcaVar2 = new rca(this.fragmentView.getContext(), (uh9) null);
        rcaVarArr[2] = rcaVar2;
        this.c.addView(rcaVar2, 1, tre.o(-1, -2));
        rcaVarArr[2].setVisibility(8);
        qmb qmbVar2 = new qmb(context);
        this.h = qmbVar2;
        hf0 L02 = aob.L0(true);
        uob M3 = yob.M(i7);
        uob M4 = yob.M(i8);
        qmbVar2.setBackground(L02);
        yob.j(qmbVar2, L02, M3, M4, null);
        this.h.b(ob6.M0(2131745187, null), false);
        yob.X(this.h.getTextView(), i9, null);
        this.c.addView(this.h, tre.o(-1, -2));
        this.h.setOnClickListener(new uv5(this, context, (byte) 29));
        rca rcaVar3 = new rca(context, (uh9) null);
        rcaVarArr[1] = rcaVar3;
        this.c.addView(rcaVar3, tre.o(-1, -2));
        this.I = (ClipboardManager) context.getSystemService("clipboard");
        this.G = true;
        this.E = 1.0f;
        Y(false);
        this.w = 0;
        Z(weaVar.a.a, false, null);
        this.x = null;
        this.y = null;
        b0();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ny9 getScrollViewForSimpleGlass() {
        return this.b;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new apb(this.b, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.s8));
        arrayList.add(new apb(this.d, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        for (int i = 0; i < this.s.length; i++) {
        }
        if (this.a != null) {
            int i2 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.a;
                if (i2 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new apb(editTextBoldCursorArr[i2], TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.H6));
                arrayList.add(new apb(this.a[i2], 8390656, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.L6));
                i2++;
            }
        } else {
            arrayList.add(new apb((View) null, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.G6));
            arrayList.add(new apb((View) null, TLObject.FLAG_23, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.H6));
        }
        arrayList.add(new apb((View) null, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        int i3 = 0;
        while (true) {
            rca[] rcaVarArr = this.e;
            if (i3 >= rcaVarArr.length) {
                break;
            }
            rca rcaVar = rcaVarArr[i3];
            i3++;
        }
        for (int i4 = 0; i4 < this.f.length; i4++) {
        }
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onPause() {
        super.onPause();
        this.I.removePrimaryClipChangedListener(this.M);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        hl.V2(getParentActivity(), this.classGuid);
        this.I.addPrimaryClipChangedListener(this.M);
        b0();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        ValueAnimator valueAnimator;
        try {
            super.onThemeColorsChanged();
            if (this.h != null && ((valueAnimator = this.H) == null || !valueAnimator.isRunning())) {
                yob.X(this.h.getTextView(), this.G ? aob.q6 : aob.z6, null);
            }
            c0();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2 && this.J) {
            this.a[0].requestFocus();
            hl.E3(this.a[0]);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }
}
