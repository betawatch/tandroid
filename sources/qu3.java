// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public class qu3 extends EditTextBoldCursor implements gm4 {
    public static final int[] d2 = {1, 2, 4, 8, 16, 256, TLObject.FLAG_14, 32768};
    public String M1;
    public StaticLayout N1;
    public uib O1;
    public int P1;
    public int Q1;
    public int R1;
    public int S1;
    public ou3 T1;
    public int U1;
    public int V1;
    public boolean W1;
    public int X1;
    public boolean Y1;
    public final ylb Z1;
    public int a2;
    public he b2;
    public boolean c2;

    public qu3(Context context, ylb ylbVar) {
        super(context);
        this.U1 = -1;
        this.V1 = -1;
        this.Z1 = ylbVar;
        int v0 = cmb.v0(cmb.Id, ylbVar);
        this.a2 = v0;
        this.E = v0;
        addTextChangedListener(new b7(this, (byte) 19));
        setClipToPadding(true);
    }

    public final void A(xkb xkbVar) {
        int selectionEnd;
        int i = this.U1;
        if (i < 0 || (selectionEnd = this.V1) < 0) {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.V1 = -1;
            this.U1 = -1;
        }
        hs6.f(xkbVar, i, selectionEnd, getText(), this.W1);
        if (xkbVar == null) {
            Editable text = getText();
            for (bl2 bl2Var : (bl2[]) text.getSpans(i, selectionEnd, bl2.class)) {
                text.removeSpan(bl2Var);
            }
            f09[] f09VarArr = (f09[]) text.getSpans(i, selectionEnd, f09.class);
            for (int i2 = 0; i2 < f09VarArr.length; i2++) {
                text.removeSpan(f09VarArr[i2]);
                text.removeSpan(f09VarArr[i2].s);
                yl ylVar = f09VarArr[i2].w;
                if (ylVar != null) {
                    text.removeSpan(ylVar);
                }
            }
            if (f09VarArr.length > 0) {
                g(true);
            }
        }
        ou3 ou3Var = this.T1;
        if (ou3Var != null) {
            ou3Var.m();
        }
    }

    public i6c B(String str) {
        return new i6c(str, null);
    }

    public final void C() {
        int selectionEnd;
        int w0;
        int w02;
        int i = this.U1;
        if (i < 0 || (selectionEnd = this.V1) < 0) {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.V1 = -1;
            this.U1 = -1;
        }
        Context context = getContext();
        lu3 lu3Var = new lu3(this, i, selectionEnd);
        jd jdVar = new jd((byte) 10);
        Pattern pattern = ik.a;
        if (context == null) {
            return;
        }
        ylb ylbVar = this.Z1;
        int i2 = cmb.i5;
        if (ylbVar != null) {
            w0 = ylbVar.f(i2);
            w02 = ylbVar.f(cmb.g5);
            ylbVar.f(cmb.zj);
            ylbVar.f(cmb.Dj);
            ylbVar.f(cmb.D8);
            ylbVar.f(cmb.F8);
            ylbVar.f(cmb.h6);
            ylbVar.f(cmb.Ii);
            ylbVar.f(cmb.Ei);
            ylbVar.f(cmb.Gi);
        } else {
            w0 = cmb.w0(null, i2, false);
            w02 = cmb.w0(null, cmb.g5, false);
            cmb.w0(null, cmb.zj, false);
            cmb.w0(null, cmb.Dj, false);
            cmb.w0(null, cmb.D8, false);
            cmb.w0(null, cmb.F8, false);
            cmb.w0(null, cmb.h6, false);
            cmb.w0(null, cmb.Ii, false);
            cmb.w0(null, cmb.Ei, false);
            cmb.w0(null, cmb.Gi, false);
        }
        int i3 = w0;
        int i4 = w02;
        k6d k6dVar = new k6d(context, ylbVar);
        Object obj = k6dVar.b;
        ((my0) obj).w0 = false;
        long currentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTimeMillis);
        int i5 = calendar.get(1);
        lp7 lp7Var = new lp7(context, ylbVar);
        lp7Var.setTextColor(i3);
        lp7Var.setTextOffset(gm.L(10.0f));
        lp7Var.setItemCount(5);
        lp7Var.setMinValue(1);
        lp7Var.setMaxValue(31);
        lp7Var.setWrapSelectorWheel(false);
        lp7Var.setFormatter(new zg((byte) 16));
        lp7 lp7Var2 = new lp7(context, ylbVar);
        lp7Var2.setTextColor(i3);
        lp7Var2.setTextOffset(-gm.L(10.0f));
        lp7Var2.setItemCount(5);
        lp7Var2.setMinValue(0);
        lp7Var2.setMaxValue(nm7.N3);
        lp7Var2.setValue(nm7.E1);
        lp7Var2.setWrapSelectorWheel(false);
        lp7Var2.setFormatter(new ji((Object) calendar, i5, (byte) 0));
        lp7 lp7Var3 = new lp7(context, ylbVar);
        lp7Var3.setContentDescriptionCallback(new pb((byte) 1));
        lp7Var3.setWrapSelectorWheel(true);
        lp7Var3.setAllItemsCount(24);
        lp7Var3.setItemCount(5);
        lp7Var3.setTextColor(i3);
        lp7Var3.setTextOffset(gm.L(10.0f));
        lp7Var3.setMinValue(0);
        lp7Var3.setMaxValue(23);
        lp7Var3.setFormatter(new zg((byte) 17));
        lp7 lp7Var4 = new lp7(context, ylbVar);
        lp7Var4.setContentDescriptionCallback(new pb((byte) 2));
        lp7Var4.setWrapSelectorWheel(true);
        lp7Var4.setAllItemsCount(60);
        lp7Var4.setItemCount(5);
        lp7Var4.setTextColor(i3);
        lp7Var4.setTextOffset(-gm.L(10.0f));
        lp7Var4.setMinValue(0);
        lp7Var4.setMaxValue(59);
        lp7Var4.setValue(0);
        lp7Var4.setFormatter(new zg((byte) 18));
        calendar.setTimeInMillis(currentTimeMillis);
        lp7Var4.setValue(calendar.get(12));
        lp7Var3.setValue(calendar.get(11));
        lp7Var.setValue(calendar.get(5));
        lp7Var2.setValue(calendar.get(2) + nm7.E1);
        uib uibVar = new uib(jb6.a0(null, null, 2131742446, "", "").trim(), 16.0f, null);
        uibVar.o(gm.L(100.0f));
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        uibVar.a();
        uibVar.l(1);
        uibVar.m(i3);
        uib uibVar2 = new uib(":", 18.0f, null);
        uibVar2.o(gm.L(100.0f));
        uibVar2.a();
        uibVar2.l(1);
        uibVar2.a.setColor(i3);
        FrameLayout frameLayout = new FrameLayout(context);
        jj jjVar = new jj(context, lp7Var2, lp7Var, lp7Var3, lp7Var4);
        jjVar.setOrientation(1);
        frameLayout.addView(jjVar, qoe.c(-1.0f, -1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        jjVar.addView(frameLayout2, qoe.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(jb6.M0(2131746069, null));
        textView.setTextColor(i3);
        ts2.s(textView, 1, 20.0f);
        frameLayout2.addView(textView, qoe.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new p8((byte) 12));
        f7 f7Var = new f7(context, uibVar2, lp7Var4);
        f7Var.setOrientation(0);
        f7Var.setWeightSum(1.0f);
        jjVar.addView(f7Var, qoe.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        b61 b61Var = new b61(ylbVar, context, true);
        ki kiVar = new ki(b61Var, lp7Var, lp7Var2, lp7Var3, lp7Var4);
        f7Var.addView(lp7Var, qoe.l(0.2f, 0, nm7.s4));
        f7Var.addView(lp7Var2, qoe.l(0.4f, 0, nm7.s4));
        f7Var.addView(lp7Var3, qoe.l(0.2f, 0, nm7.s4));
        f7Var.addView(lp7Var4, qoe.l(0.2f, 0, nm7.s4));
        lp7Var.setOnValueChangedListener(kiVar);
        lp7Var2.setOnValueChangedListener(kiVar);
        lp7Var3.setOnValueChangedListener(kiVar);
        lp7Var4.setOnValueChangedListener(kiVar);
        boolean[] zArr = {true};
        b61Var.setPadding(gm.L(34.0f), 0, gm.L(34.0f), 0);
        b61Var.f();
        jjVar.addView(b61Var, qoe.t(-1, 48, 83, 16, 15, 16, 16));
        b61Var.setOnClickListener(new li(zArr, lp7Var, lp7Var2, lp7Var3, lp7Var4, lu3Var, new int[1], k6dVar));
        my0 my0Var = (my0) obj;
        my0Var.O = frameLayout;
        my0Var.show();
        my0Var.setOnDismissListener(new g5(jdVar, zArr, (byte) 4));
        my0Var.s0(i4);
        my0Var.K(i4);
        ik.c(b61Var, lp7Var, lp7Var2, lp7Var3, lp7Var4);
    }

    public final void D(b82 b82Var) {
        int selectionEnd;
        int i = this.U1;
        if (i < 0 || (selectionEnd = this.V1) < 0) {
            i = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.V1 = -1;
            this.U1 = -1;
        }
        I(jb6.M0(2131751681, null), jb6.M0(2131743604, null), "http://", true, this.c2, new d01(this, i, selectionEnd, b82Var));
    }

    public final boolean H(int i) {
        int selectionEnd;
        int selectionEnd2;
        if (i == R.id.menu_regular) {
            A(null);
            return true;
        }
        if (i == R.id.menu_bold) {
            wkb wkbVar = new wkb();
            wkbVar.a |= 1;
            A(new xkb(wkbVar, 0));
            return true;
        }
        byte b = 2;
        if (i == R.id.menu_italic) {
            wkb wkbVar2 = new wkb();
            wkbVar2.a |= 2;
            A(new xkb(wkbVar2, 0));
            return true;
        }
        if (i == R.id.menu_mono) {
            wkb wkbVar3 = new wkb();
            wkbVar3.a |= 4;
            A(new xkb(wkbVar3, 0));
            return true;
        }
        if (i == R.id.menu_link) {
            D(null);
            return true;
        }
        if (i == R.id.menu_strike) {
            wkb wkbVar4 = new wkb();
            wkbVar4.a |= 8;
            A(new xkb(wkbVar4, 0));
            return true;
        }
        if (i == R.id.menu_underline) {
            wkb wkbVar5 = new wkb();
            wkbVar5.a |= 16;
            A(new xkb(wkbVar5, 0));
            return true;
        }
        if (i == R.id.menu_spoiler) {
            wkb wkbVar6 = new wkb();
            wkbVar6.a |= 256;
            A(new xkb(wkbVar6, 0));
            h();
            return true;
        }
        if (i == R.id.menu_quote) {
            int i2 = this.U1;
            if (i2 < 0 || (selectionEnd2 = this.V1) < 0) {
                i2 = getSelectionStart();
                selectionEnd2 = getSelectionEnd();
            } else {
                this.V1 = -1;
                this.U1 = -1;
            }
            int c = f09.c(getText(), i2, selectionEnd2, false);
            if (c >= 0) {
                setSelection(c);
                float textSize = getTextSize();
                setTextSize(0, 1.0f + textSize);
                setTextSize(0, textSize);
            }
            g(true);
            h();
            return true;
        }
        if (i == R.id.menu_date) {
            C();
            return true;
        }
        if (i != R.id.menu_translate) {
            return false;
        }
        int i3 = this.U1;
        if (i3 < 0 || (selectionEnd = this.V1) < 0) {
            i3 = getSelectionStart();
            selectionEnd = getSelectionEnd();
        } else {
            this.V1 = -1;
            this.U1 = -1;
        }
        CharSequence subSequence = getText().subSequence(i3, selectionEnd);
        d S = LaunchActivity.S();
        Context context = getContext();
        ylb resourceProvider = S != null ? S.getResourceProvider() : null;
        c2c c2cVar = new c2c(context, null, false, false, 2, resourceProvider);
        ylb ylbVar = resourceProvider;
        c2cVar.b2 = 1;
        c2cVar.c2 = new String[]{"formal", "neutral", "casual"};
        c2cVar.d2 = new String[]{"Formal", "Neutral", "Casual"};
        c2cVar.f2 = true;
        c2cVar.g2 = -1;
        ImageView imageView = new ImageView(context);
        c2cVar.S1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i4 = cmb.F6;
        anb.s(imageView, i4, ylbVar, PorterDuff.Mode.SRC_ATOP);
        fg0 f0 = cmb.f0(cmb.p1(0.1f, cmb.v0(i4, c2cVar.J0)), 1, -1);
        wmb K = anb.K(0.1f, i4);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, K, ylbVar);
        c2cVar.o1.addView(imageView, qoe.d(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        rve.b(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new u1c(c2cVar, b));
        String G0 = s1c.G0();
        c2cVar.a2 = G0;
        if (G0 == null) {
            c2cVar.a2 = b3c.i();
        }
        c2cVar.F1 = false;
        c2cVar.E1 = gm.L(12.0f);
        int i5 = cmb.Z6;
        c2cVar.s0(cmb.v0(i5, c2cVar.J0));
        FrameLayout frameLayout = new FrameLayout(context);
        c2cVar.T1 = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{cmb.p1(0.0f, cmb.v0(i5, c2cVar.J0)), cmb.v0(i5, c2cVar.J0), cmb.v0(i5, c2cVar.J0)}));
        b61 b61Var = new b61(ylbVar, context, true);
        b61Var.setRoundRadius(24);
        c2cVar.U1 = b61Var;
        b61Var.setText(jb6.M0(2131747564, null));
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, nm7.D1, 12.0f, 6.0f, 12.0f, 12.0f);
        int i6 = d.leftMargin;
        int i7 = c2cVar.u0;
        d.leftMargin = i6 + i7;
        d.rightMargin += i7;
        frameLayout.addView(b61Var, d);
        c2cVar.b.addView(frameLayout, qoe.e(-1, -2, 80));
        int i8 = c2cVar.u0;
        int L = gm.L(66.0f);
        r59 r59Var = c2cVar.n1;
        r59Var.setPadding(i8, 0, i8, L);
        r59Var.setClipToPadding(false);
        r59Var.r1();
        byte b2 = 23;
        r59Var.setOnItemClickListener(new k0(c2cVar, ylbVar, b2));
        sc3 sc3Var = new sc3();
        sc3Var.m = false;
        sc3Var.C = false;
        sc3Var.o(d53.h);
        sc3Var.n(350L);
        r59Var.setItemAnimator(sc3Var);
        c2cVar.e2.O(false);
        c2cVar.V1 = subSequence;
        eoe.b(subSequence.toString(), new wta(c2cVar, b2), new rjb((byte) 7), false);
        c2cVar.Y1 = new ku3(this, i3, selectionEnd);
        c2cVar.show();
        setSelection(i3, selectionEnd);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [android.view.View, android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.telegram.ui.ActionBar.AlertDialog$Builder] */
    public final void I(String str, String str2, String str3, boolean z, boolean z2, pu3 pu3Var) {
        CharSequence charSequence;
        ylb ylbVar = this.Z1;
        final byte b = 0;
        ?? meVar = z2 ? new me(0, ylbVar, getContext()) : new AlertDialog$Builder(0, ylbVar, getContext());
        he heVar = meVar.a;
        heVar.S = str;
        ?? frameLayout = new FrameLayout(getContext());
        final vc vcVar = new vc(getContext(), (byte) 4);
        String str4 = str3 == null ? "" : str3;
        final byte b2 = 1;
        vcVar.setTextSize(1, 18.0f);
        vcVar.setText(str4);
        anb.X(vcVar, cmb.i5, ylbVar);
        vcVar.setHintText(str2);
        anb.l(vcVar, 35, cmb.K6, ylbVar);
        vcVar.setSingleLine(true);
        vcVar.setFocusable(true);
        vcVar.setTransformHintToHeader(true);
        anb.F(vcVar, cmb.j6, cmb.k6, cmb.o7, ylbVar);
        vcVar.setImeOptions(6);
        vcVar.setBackgroundDrawable(null);
        vcVar.requestFocus();
        vcVar.setPadding(0, 0, 0, 0);
        anb.C(vcVar, cmb.kg, ylbVar);
        anb.l(vcVar, 36, cmb.lg, ylbVar);
        frameLayout.addView(vcVar, qoe.e(-1, -1, nm7.D1));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 12.0f);
        textView.setTypeface(gm.o());
        textView.setText(jb6.M0(2131747168, null));
        textView.setPadding(gm.L(10.0f), 0, gm.L(10.0f), 0);
        textView.setGravity(17);
        int i = cmb.n6;
        int v0 = cmb.v0(i, ylbVar);
        anb.X(textView, i, ylbVar);
        int L = gm.L(6.0f);
        int p1 = cmb.p1(0.12f, v0);
        int p12 = cmb.p1(0.15f, v0);
        fg0 i0 = cmb.i0(L, L, L, L, p1, p12, p12);
        wmb K = anb.K(0.12f, i);
        wmb K2 = anb.K(0.15f, i);
        textView.setBackground(i0);
        anb.j(textView, i0, K, K2, ylbVar);
        rve.b(textView, 0.1f, 1.5f);
        frameLayout.addView(textView, qoe.d(-2, 26.0f, 21, 0.0f, 0.0f, 24.0f, 3.0f));
        textView.setVisibility(z ? 0 : 8);
        aa7 aa7Var = new aa7((Object) this, z, (Object) vcVar, (Object) str4, (Object) textView, (byte) 10);
        textView.setOnClickListener(new b0(this, vcVar, aa7Var, (byte) 27));
        vcVar.addTextChangedListener(new b7(aa7Var, (byte) 20));
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        if (z && TextUtils.equals(str4, "http://") && clipboardManager != null && clipboardManager.hasPrimaryClip()) {
            try {
                charSequence = clipboardManager.getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                fc4.g(e, true);
                charSequence = null;
            }
            if (charSequence != null) {
                vcVar.setText(charSequence);
                vcVar.setSelection(0, vcVar.getText().length());
            }
        }
        aa7Var.run();
        meVar.n(frameLayout);
        meVar.j(jb6.M0(2131747564, null), new x92((Object) pu3Var, (Object) vcVar, (byte) 25));
        meVar.g(jb6.M0(2131752542, null), null);
        if (z2) {
            this.b2 = heVar;
            heVar.setOnDismissListener(new n1(this, (byte) 18));
            this.b2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: mu3
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b3 = b;
                    vc vcVar2 = vcVar;
                    switch (b3) {
                        case 0:
                            vcVar2.requestFocus();
                            gm.E3(vcVar2);
                            break;
                        default:
                            vcVar2.requestFocus();
                            gm.E3(vcVar2);
                            break;
                    }
                }
            });
            this.b2.q(250L);
        } else {
            meVar.o().setOnShowListener(new DialogInterface.OnShowListener() { // from class: mu3
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    byte b3 = b2;
                    vc vcVar2 = vcVar;
                    switch (b3) {
                        case 0:
                            vcVar2.requestFocus();
                            gm.E3(vcVar2);
                            break;
                        default:
                            vcVar2.requestFocus();
                            gm.E3(vcVar2);
                            break;
                    }
                }
            });
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) vcVar.getLayoutParams();
        if (marginLayoutParams != null) {
            if (marginLayoutParams instanceof FrameLayout.LayoutParams) {
                ((FrameLayout.LayoutParams) marginLayoutParams).gravity = 1;
            }
            int L2 = gm.L(24.0f);
            marginLayoutParams.leftMargin = L2;
            marginLayoutParams.rightMargin = L2;
            marginLayoutParams.height = gm.L(36.0f);
            vcVar.setLayoutParams(marginLayoutParams);
        }
        vcVar.setSelection(0, vcVar.getText().length());
    }

    public void a(int i, int i2, int i3) {
        int min;
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3 || i2 >= (min = Math.min(i3, text.length()))) {
            return;
        }
        wkb wkbVar = new wkb();
        wkbVar.a = i;
        hs6.f(new xkb(wkbVar, 0), i2, min, text, true);
        if ((i & 256) != 0) {
            h();
        }
        ou3 ou3Var = this.T1;
        if (ou3Var != null) {
            ou3Var.m();
        }
    }

    public void b(int i, int i2, int i3) {
        Editable text = getText();
        if (text == null || i2 < 0 || i3 < 0 || i2 >= i3) {
            return;
        }
        int min = Math.min(i3, text.length());
        int i4 = i & 256;
        if (i4 != 0) {
            i |= 512;
        }
        for (xkb xkbVar : (xkb[]) text.getSpans(i2, min, xkb.class)) {
            wkb wkbVar = xkbVar.b;
            int i5 = wkbVar.a;
            if ((i5 & i) != 0) {
                int spanStart = text.getSpanStart(xkbVar);
                int spanEnd = text.getSpanEnd(xkbVar);
                text.removeSpan(xkbVar);
                if (spanStart < i2) {
                    text.setSpan(new xkb(new wkb(wkbVar), 0), spanStart, i2, 33);
                }
                if (spanEnd > min) {
                    text.setSpan(new xkb(new wkb(wkbVar), 0), min, spanEnd, 33);
                }
                int max = Math.max(spanStart, i2);
                int min2 = Math.min(spanEnd, min);
                int i6 = i5 & (~i);
                if (i6 != 0 && max < min2) {
                    wkb wkbVar2 = new wkb(wkbVar);
                    wkbVar2.a = i6;
                    text.setSpan(new xkb(wkbVar2, 0), max, min2, 33);
                }
            }
        }
        if (i4 != 0) {
            h();
        }
        ou3 ou3Var = this.T1;
        if (ou3Var != null) {
            ou3Var.m();
        }
    }

    public int c(int i, int i2) {
        Editable text = getText();
        if (text != null) {
            int max = Math.max(0, i);
            int min = Math.min(i2, text.length());
            if (max >= 0 && min >= 0 && max < min) {
                xkb[] xkbVarArr = (xkb[]) text.getSpans(max, min, xkb.class);
                int i3 = 0;
                for (int i4 = 0; i4 < 8; i4++) {
                    int i5 = d2[i4];
                    int i6 = max;
                    boolean z = true;
                    while (z && i6 < min) {
                        z = false;
                        for (int i7 = 0; i7 < xkbVarArr.length; i7++) {
                            xkb xkbVar = xkbVarArr[i7];
                            int i8 = xkbVar.b.a;
                            if ((i8 & 512) != 0) {
                                i8 |= 256;
                            }
                            if ((i8 & i5) != 0) {
                                int spanStart = text.getSpanStart(xkbVar);
                                int spanEnd = text.getSpanEnd(xkbVarArr[i7]);
                                if (spanStart <= i6 && spanEnd > i6) {
                                    z = true;
                                    i6 = spanEnd;
                                }
                            }
                        }
                    }
                    if (i6 >= min) {
                        i3 |= i5;
                    }
                }
                return i3;
            }
        }
        return 0;
    }

    public boolean getAllowTextEntitiesIntersection() {
        return this.W1;
    }

    public String getCaption() {
        return this.M1;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, vu3, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        Layout layout;
        if (this.E == this.a2) {
            int v0 = cmb.v0(cmb.Id, this.Z1);
            this.a2 = v0;
            this.E = v0;
        }
        canvas.save();
        canvas.translate(0.0f, this.P);
        super.onDraw(canvas);
        try {
            if (this.N1 != null && this.P1 == length()) {
                TextPaint paint = getPaint();
                int color = getPaint().getColor();
                paint.setColor(this.S1);
                canvas.save();
                canvas.translate(this.Q1, this.R1);
                this.N1.draw(canvas);
                canvas.restore();
                paint.setColor(color);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (this.O1 == null || length() == 0 || (layout = getLayout()) == null || layout.getLineCount() <= 0) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            this.O1.c(layout.getLineRight(0), (getHeight() / 2.0f) + gm.L(1.0f), 1.0f, this.S1, canvas2);
        }
        canvas2.restore();
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        u4 u4Var = new u4(accessibilityNodeInfo);
        if (!TextUtils.isEmpty(this.M1)) {
            u4Var.l(this.M1);
        }
        ArrayList d = u4Var.d();
        int size = d.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            r4 r4Var = (r4) d.get(i);
            if (r4Var.a() == 268435456) {
                u4Var.a.removeAction((AccessibilityNodeInfo.AccessibilityAction) r4Var.a);
                break;
            }
            i++;
        }
        if (hasSelection()) {
            u4Var.b(new r4(R.id.menu_spoiler, jb6.M0(2131744951, null)));
            u4Var.b(new r4(R.id.menu_bold, jb6.M0(2131753636, null)));
            u4Var.b(new r4(R.id.menu_italic, jb6.M0(2131748844, null)));
            u4Var.b(new r4(R.id.menu_mono, jb6.M0(2131748107, null)));
            u4Var.b(new r4(R.id.menu_strike, jb6.M0(2131744122, null)));
            u4Var.b(new r4(R.id.menu_underline, jb6.M0(2131743576, null)));
            u4Var.b(new r4(R.id.menu_link, jb6.M0(2131751681, null)));
            u4Var.b(new r4(R.id.menu_regular, jb6.M0(2131746070, null)));
            u4Var.b(new r4(R.id.menu_date, jb6.M0(2131750522, null)));
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int indexOf;
        try {
            this.Y1 = getMeasuredWidth() == 0 && getMeasuredHeight() == 0;
            super.onMeasure(i, i2);
            if (this.Y1) {
                this.X1 = getLineCount();
            }
            this.Y1 = false;
        } catch (Exception e) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(51.0f));
            fc4.g(e, true);
        }
        this.N1 = null;
        String str = this.M1;
        if (str == null || str.length() <= 0) {
            return;
        }
        Editable text = getText();
        if (text.length() <= 1 || text.charAt(0) != '@' || (indexOf = TextUtils.indexOf((CharSequence) text, ' ')) == -1) {
            return;
        }
        TextPaint paint = getPaint();
        CharSequence subSequence = text.subSequence(0, indexOf + 1);
        int ceil = (int) Math.ceil(paint.measureText(text, 0, r14));
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        this.P1 = subSequence.length();
        int i3 = measuredWidth - ceil;
        CharSequence ellipsize = TextUtils.ellipsize(this.M1, paint, i3, TextUtils.TruncateAt.END);
        this.Q1 = ceil;
        try {
            StaticLayout staticLayout = new StaticLayout(ellipsize, getPaint(), i3, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.N1 = staticLayout;
            if (staticLayout.getLineCount() > 0) {
                this.Q1 = (int) (this.Q1 + (-this.N1.getLineLeft(0)));
            }
            this.R1 = ((getMeasuredHeight() - this.N1.getLineBottom(0)) / 2) + gm.L(0.5f);
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null && primaryClip.getItemCount() == 1 && primaryClip.getDescription().hasMimeType("text/html")) {
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(xx2.a(primaryClip.getItemAt(0).getHtmlText()));
                    gw3.m(spannableStringBuilder, getPaint().getFontMetricsInt(), false, null, 0);
                    gn[] gnVarArr = (gn[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), gn.class);
                    if (gnVarArr != null) {
                        for (gn gnVar : gnVarArr) {
                            gnVar.applyFontMetrics(getPaint().getFontMetricsInt(), vm.f());
                        }
                    }
                    int max = Math.max(0, getSelectionStart());
                    int min = Math.min(getText().length(), getSelectionEnd());
                    e09[] e09VarArr = (e09[]) getText().getSpans(max, min, e09.class);
                    if (e09VarArr == null || e09VarArr.length <= 0) {
                        f09.a(spannableStringBuilder);
                    } else {
                        e09[] e09VarArr2 = (e09[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), e09.class);
                        for (int i2 = 0; i2 < e09VarArr2.length; i2++) {
                            spannableStringBuilder.removeSpan(e09VarArr2[i2]);
                            spannableStringBuilder.removeSpan(e09VarArr2[i2].a);
                        }
                    }
                    setText(getText().replace(max, min, spannableStringBuilder));
                    setSelection(spannableStringBuilder.length() + max, max + spannableStringBuilder.length());
                    return true;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
        } else {
            try {
                if (i == 16908321) {
                    int max2 = Math.max(0, getSelectionStart());
                    int min2 = Math.min(getText().length(), getSelectionEnd());
                    gm.g(getText().subSequence(max2, min2));
                    gm.W(getContext()).closeContextMenu();
                    cl4 cl4Var = this.Z0;
                    if (cl4Var != null) {
                        cl4Var.finish();
                    }
                    setSelection(max2, min2);
                    return true;
                }
                if (i == 16908320) {
                    int max3 = Math.max(0, getSelectionStart());
                    int min3 = Math.min(getText().length(), getSelectionEnd());
                    gm.g(getText().subSequence(max3, min3));
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    if (max3 != 0) {
                        spannableStringBuilder2.append(getText().subSequence(0, max3));
                    }
                    if (min3 != getText().length()) {
                        spannableStringBuilder2.append(getText().subSequence(min3, getText().length()));
                    }
                    setText(spannableStringBuilder2);
                    setSelection(max3, max3);
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        try {
            super.onWindowFocusChanged(z);
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return H(i) || super.performAccessibilityAction(i, bundle);
    }

    public void setAllowTextEntitiesIntersection(boolean z) {
        this.W1 = z;
    }

    public void setCaption(String str) {
        String str2 = this.M1;
        if ((str2 == null || str2.length() == 0) && (str == null || str.length() == 0)) {
            return;
        }
        String str3 = this.M1;
        if (str3 == null || !str3.equals(str)) {
            this.M1 = str;
            if (str != null) {
                this.M1 = str.replace('\n', ' ');
            }
            requestLayout();
        }
    }

    public void setDelegate(ou3 ou3Var) {
        this.T1 = ou3Var;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor
    public void setHintColor(int i) {
        super.setHintColor(i);
        this.S1 = i;
        invalidate();
    }

    public void setRightText(CharSequence charSequence) {
        this.O1 = new uib(charSequence, 16.0f, getTypeface());
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback) {
        return super.startActionMode(new ju3(new nu3(this, callback), callback, (byte) 1));
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.view.View
    public ActionMode startActionMode(ActionMode.Callback callback, int i) {
        return super.startActionMode(new ju3(new nu3(this, callback), callback, (byte) 1), i);
    }

    public void E() {
    }

    public void F() {
    }

    public void G(int i, int i2) {
    }
}
