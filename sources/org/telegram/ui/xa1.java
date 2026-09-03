package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class xa1 implements th0 {
    public final xn A;
    public final LinearGradient B;
    public final float C;
    public final AnimationNotificationsLocker D;
    public final MessageObject.TextLayoutBlock E;
    public final NinePatchDrawable F;
    public final jk G;
    public final org.telegram.ui.Components.q5 H;
    public float I;
    public float J;
    public final float K;
    public final int L;
    public final int M;
    public final org.telegram.ui.ActionBar.g6 N;
    public final PointF O;
    public final RectF P;
    public final RectF Q;
    public float[] R;
    public final float S;
    public float a;
    public final Paint b;
    public final boolean c;
    public final ValueAnimator d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final float j;
    public final MessageObject k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final StaticLayout p;
    public final StaticLayout q;
    public final org.telegram.ui.Cells.t1 r;
    public final org.telegram.ui.Components.sl0 s;
    public final org.telegram.ui.Components.li t;
    public final Matrix u;
    public final Paint v;
    public final int w;
    public final float x;
    public final float y;
    public final float z;

    /* JADX WARN: Removed duplicated region for block: B:112:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0369  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public xa1(org.telegram.ui.Cells.t1 t1Var, xn xnVar, org.telegram.ui.Components.sl0 sl0Var, org.telegram.ui.Components.li liVar, org.telegram.ui.ActionBar.g6 g6Var) {
        float f10;
        boolean z4;
        int[] iArr;
        int i10;
        int lineCount;
        int i11;
        float f11;
        StaticLayout staticLayout;
        double f12;
        int i12;
        float f13;
        int i13;
        int i14;
        boolean z10;
        StaticLayout staticLayout2;
        org.telegram.ui.ActionBar.h5 y22;
        int i15;
        Paint paint = new Paint(1);
        this.b = paint;
        this.D = new AnimationNotificationsLocker();
        PointF pointF = new PointF();
        this.O = pointF;
        this.P = new RectF();
        this.Q = new RectF();
        this.N = g6Var;
        if (t1Var.getMessageObject().textLayoutBlocks == null || t1Var.getMessageObject().textLayoutBlocks.size() > 1 || t1Var.getMessageObject().textLayoutBlocks.isEmpty() || t1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getLineCount() > 10) {
            return;
        }
        this.r = t1Var;
        this.s = sl0Var;
        this.t = liVar;
        this.A = xnVar;
        jk jkVar = xnVar.V;
        this.G = jkVar;
        if (jkVar == null || jkVar.getEditField() == null || jkVar.getEditField().getLayout() == null) {
            return;
        }
        jkVar.getRecordCircle();
        paint.setFilterBitmap(true);
        this.k = t1Var.getMessageObject();
        if (!t1Var.getTransitionParams().v0) {
            t1Var.draw(new Canvas());
        }
        t1Var.setEnterTransitionInProgress(true);
        Editable editText = jkVar.getEditText();
        CharSequence charSequence = t1Var.getMessageObject().messageText;
        this.n = false;
        jkVar.getEditField().getLayout().getHeight();
        TextPaint textPaint = org.telegram.ui.ActionBar.k6.o2;
        AndroidUtilities.dp(20.0f);
        if (t1Var.getMessageObject().getEmojiOnlyCount() != 0) {
            boolean z11 = t1Var.getMessageObject().emojiOnlyCount == t1Var.getMessageObject().animatedEmojiCount;
            switch (Math.max(t1Var.getMessageObject().emojiOnlyCount, t1Var.getMessageObject().animatedEmojiCount)) {
                case 0:
                case 1:
                case 2:
                    if (z11) {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[0];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[2];
                        break;
                    }
                case 3:
                    if (z11) {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[1];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[3];
                        break;
                    }
                case 4:
                    if (z11) {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[2];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[4];
                        break;
                    }
                case 5:
                    if (z11) {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[3];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[5];
                        break;
                    }
                case 6:
                    if (z11) {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[4];
                        break;
                    } else {
                        textPaint = org.telegram.ui.ActionBar.k6.y2[5];
                        break;
                    }
                default:
                    textPaint = org.telegram.ui.ActionBar.k6.y2[5];
                    break;
            }
            if (textPaint != null) {
                textPaint.getTextSize();
                AndroidUtilities.dp(4.0f);
            }
        }
        if (charSequence instanceof Spannable) {
            f10 = 4.0f;
            Object[] spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class);
            if (spans != null && spans.length > 0) {
                z4 = true;
                if (editText.length() == charSequence.length() || z4) {
                    this.n = true;
                    iArr = new int[1];
                    CharSequence trim = AndroidUtilities.trim(editText, iArr);
                    if (iArr[0] <= 0) {
                        i10 = jkVar.getEditField().getLayout().getLineTop(jkVar.getEditField().getLayout().getLineForOffset(iArr[0]));
                        jkVar.getEditField().getLayout().getLineBottom(jkVar.getEditField().getLayout().getLineForOffset(trim.length() + iArr[0]));
                    } else {
                        i10 = 0;
                    }
                    org.telegram.ui.Components.u5.cloneSpans(charSequence);
                    charSequence = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
                } else {
                    i10 = 0;
                }
                float textSize = jkVar.getEditField().getTextSize() / textPaint.getTextSize();
                this.C = textSize;
                lineCount = jkVar.getEditField().getLayout().getLineCount();
                int width = (int) (jkVar.getEditField().getLayout().getWidth() / textSize);
                if (Build.VERSION.SDK_INT < 24) {
                    this.p = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
                } else {
                    this.p = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                }
                this.H = org.telegram.ui.Components.u5.update(2, (View) null, this.H, this.p);
                vg.i.b(jkVar.getEditField(), xnVar.U0, pointF);
                float f14 = pointF.y;
                this.y = pointF.x;
                this.z = ((AndroidUtilities.dp(10.0f) + f14) - jkVar.getEditField().getScrollY()) + i10;
                this.l = 0.0f;
                f11 = Float.MAX_VALUE;
                float f15 = Float.MAX_VALUE;
                for (i11 = 0; i11 < this.p.getLineCount(); i11++) {
                    float lineLeft = this.p.getLineLeft(i11);
                    if (lineLeft < f11) {
                        f11 = lineLeft;
                    }
                }
                if (f11 != Float.MAX_VALUE) {
                    this.l = f11;
                }
                this.p.getHeight();
                float dp = AndroidUtilities.dp(f10) + f14;
                this.j = dp;
                if (this.G.z0()) {
                    this.j = dp - AndroidUtilities.dp(12.0f);
                }
                this.x = f14 + jkVar.getEditField().getMeasuredHeight();
                MessageObject.TextLayoutBlock textLayoutBlock = t1Var.getMessageObject().textLayoutBlocks.get(0);
                this.E = textLayoutBlock;
                staticLayout = textLayoutBlock.textLayout;
                int i16 = org.telegram.ui.ActionBar.k6.fc;
                f12 = i0.a.f(org.telegram.ui.ActionBar.k6.v0(i16, this.N));
                i12 = org.telegram.ui.ActionBar.k6.Ud;
                if (Math.abs(f12 - i0.a.f(org.telegram.ui.ActionBar.k6.v0(i12, this.N))) > 0.20000000298023224d) {
                    this.n = true;
                    this.o = true;
                }
                this.L = org.telegram.ui.ActionBar.k6.v0(i12, this.N);
                this.M = org.telegram.ui.ActionBar.k6.v0(i16, this.N);
                if (staticLayout.getLineCount() != this.p.getLineCount()) {
                    lineCount = staticLayout.getLineCount();
                    int i17 = 0;
                    i13 = 0;
                    i14 = 0;
                    while (true) {
                        if (i17 < lineCount) {
                            StaticLayout staticLayout3 = this.p;
                            f13 = 0.0f;
                            if (staticLayout3.getLineRight(i17) != staticLayout3.getWidth() || staticLayout3.getLineLeft(i17) == 0.0f) {
                                i13++;
                            } else {
                                i14++;
                            }
                            if (staticLayout.getLineEnd(i17) != this.p.getLineEnd(i17)) {
                                this.n = true;
                            } else {
                                i17++;
                            }
                        } else {
                            f13 = 0.0f;
                        }
                    }
                } else {
                    f13 = 0.0f;
                    this.n = true;
                    i13 = 0;
                    i14 = 0;
                }
                if (!this.n && i14 > 0 && i13 > 0) {
                    SpannableString spannableString = new SpannableString(charSequence);
                    SpannableString spannableString2 = new SpannableString(charSequence);
                    for (i15 = 0; i15 < lineCount; i15++) {
                        StaticLayout staticLayout4 = this.p;
                        if (staticLayout4.getLineRight(i15) != staticLayout4.getWidth() || staticLayout4.getLineLeft(i15) == f13) {
                            spannableString2.setSpan(new org.telegram.ui.Components.nz(false), this.p.getLineStart(i15), this.p.getLineEnd(i15), 0);
                        } else {
                            spannableString.setSpan(new org.telegram.ui.Components.nz(false), this.p.getLineStart(i15), this.p.getLineEnd(i15), 0);
                            float lineLeft2 = this.p.getLineLeft(i15);
                            if (lineLeft2 < f15) {
                                f15 = lineLeft2;
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT < 24) {
                        StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                        this.p = hyphenationFrequency.setAlignment(alignment).build();
                        this.q = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
                    } else {
                        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                        TextPaint textPaint2 = textPaint;
                        this.p = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                        this.q = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                    }
                }
                this.m = this.p.getWidth() - t1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getWidth();
                z10 = t1Var.getMessageObject().getReplyMsgId() == 0 && t1Var.z9 != null;
                this.c = z10;
                if (z10) {
                    org.telegram.ui.ActionBar.l5 l5Var = ((org.telegram.ui.Components.oo[]) xnVar.X.b)[0].c;
                    vg.i.b(l5Var, xnVar.U0, this.O);
                    PointF pointF2 = this.O;
                    this.e = pointF2.x;
                    this.g = pointF2.y;
                    this.f = ((View) l5Var.getParent()).getWidth();
                    org.telegram.ui.ActionBar.l5 l5Var2 = ((org.telegram.ui.Components.oo[]) xnVar.X.b)[0].d;
                    vg.i.b(l5Var2, xnVar.U0, this.O);
                    float f16 = this.O.y;
                    this.h = l5Var.getTextColor();
                    this.i = l5Var2.getTextColor();
                    this.j -= AndroidUtilities.dp(46.0f);
                }
                this.S = sl0Var.getPaddingBottom() - (xnVar.pc - AndroidUtilities.dp(44.0f));
                this.u = new Matrix();
                Paint paint2 = new Paint(1);
                this.v = paint2;
                paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                LinearGradient linearGradient = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
                this.B = linearGradient;
                paint2.setShader(linearGradient);
                this.w = t1Var.getMessageObject().stableId;
                jkVar.getEditField().setAlpha(0.0f);
                jkVar.setTextTransitionIsRunning(true);
                staticLayout2 = t1Var.z9;
                if (staticLayout2 != null && staticLayout2.getText().length() > 1 && t1Var.z9.getPrimaryHorizontal(0) != 0.0f) {
                    this.K = t1Var.z9.getWidth() - t1Var.z9.getLineWidth(0);
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.d = ofFloat;
                ofFloat.addUpdateListener(new qw0(this, jkVar, liVar, 1));
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setDuration(250L);
                ((ArrayList) liVar.c).add(this);
                liVar.a();
                ((ViewGroup) liVar.d).invalidate();
                this.D.lock();
                ofFloat.addListener(new org.telegram.ui.Components.v20(this, liVar, t1Var, jkVar, xnVar));
                if (SharedConfig.getDevicePerformanceClass() == 2 || (y22 = t1Var.y2(true)) == null) {
                }
                int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sd, this.N);
                Rect rect = y22.o;
                if (y22.D == null) {
                    Bitmap createBitmap = Bitmap.createBitmap(y22.b(50.0f), y22.b(40.0f), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    rect.set(y22.getBounds());
                    Paint paint3 = new Paint(1);
                    paint3.setColor(-1);
                    y22.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                    y22.c(canvas, paint3);
                    y22.D = new NinePatchDrawable(createBitmap, k7.c8.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
                    y22.setBounds(rect);
                }
                if (y22.E != v02) {
                    y22.E = v02;
                    y22.D.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
                }
                this.F = y22.D;
                return;
            }
        } else {
            f10 = 4.0f;
        }
        z4 = false;
        if (editText.length() == charSequence.length()) {
        }
        this.n = true;
        iArr = new int[1];
        CharSequence trim2 = AndroidUtilities.trim(editText, iArr);
        if (iArr[0] <= 0) {
        }
        org.telegram.ui.Components.u5.cloneSpans(charSequence);
        charSequence = Emoji.replaceEmoji(editText, textPaint.getFontMetricsInt(), false);
        float textSize2 = jkVar.getEditField().getTextSize() / textPaint.getTextSize();
        this.C = textSize2;
        lineCount = jkVar.getEditField().getLayout().getLineCount();
        int width2 = (int) (jkVar.getEditField().getLayout().getWidth() / textSize2);
        if (Build.VERSION.SDK_INT < 24) {
        }
        this.H = org.telegram.ui.Components.u5.update(2, (View) null, this.H, this.p);
        vg.i.b(jkVar.getEditField(), xnVar.U0, pointF);
        float f142 = pointF.y;
        this.y = pointF.x;
        this.z = ((AndroidUtilities.dp(10.0f) + f142) - jkVar.getEditField().getScrollY()) + i10;
        this.l = 0.0f;
        f11 = Float.MAX_VALUE;
        float f152 = Float.MAX_VALUE;
        while (i11 < this.p.getLineCount()) {
        }
        if (f11 != Float.MAX_VALUE) {
        }
        this.p.getHeight();
        float dp2 = AndroidUtilities.dp(f10) + f142;
        this.j = dp2;
        if (this.G.z0()) {
        }
        this.x = f142 + jkVar.getEditField().getMeasuredHeight();
        MessageObject.TextLayoutBlock textLayoutBlock2 = t1Var.getMessageObject().textLayoutBlocks.get(0);
        this.E = textLayoutBlock2;
        staticLayout = textLayoutBlock2.textLayout;
        int i162 = org.telegram.ui.ActionBar.k6.fc;
        f12 = i0.a.f(org.telegram.ui.ActionBar.k6.v0(i162, this.N));
        i12 = org.telegram.ui.ActionBar.k6.Ud;
        if (Math.abs(f12 - i0.a.f(org.telegram.ui.ActionBar.k6.v0(i12, this.N))) > 0.20000000298023224d) {
        }
        this.L = org.telegram.ui.ActionBar.k6.v0(i12, this.N);
        this.M = org.telegram.ui.ActionBar.k6.v0(i162, this.N);
        if (staticLayout.getLineCount() != this.p.getLineCount()) {
        }
        if (!this.n) {
            SpannableString spannableString3 = new SpannableString(charSequence);
            SpannableString spannableString22 = new SpannableString(charSequence);
            while (i15 < lineCount) {
            }
            if (Build.VERSION.SDK_INT < 24) {
            }
        }
        this.m = this.p.getWidth() - t1Var.getMessageObject().textLayoutBlocks.get(0).textLayout.getWidth();
        if (t1Var.getMessageObject().getReplyMsgId() == 0) {
        }
        this.c = z10;
        if (z10) {
        }
        this.S = sl0Var.getPaddingBottom() - (xnVar.pc - AndroidUtilities.dp(44.0f));
        this.u = new Matrix();
        Paint paint22 = new Paint(1);
        this.v = paint22;
        paint22.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient2 = new LinearGradient(0.0f, AndroidUtilities.dp(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.B = linearGradient2;
        paint22.setShader(linearGradient2);
        this.w = t1Var.getMessageObject().stableId;
        jkVar.getEditField().setAlpha(0.0f);
        jkVar.setTextTransitionIsRunning(true);
        staticLayout2 = t1Var.z9;
        if (staticLayout2 != null) {
            this.K = t1Var.z9.getWidth() - t1Var.z9.getLineWidth(0);
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat2;
        ofFloat2.addUpdateListener(new qw0(this, jkVar, liVar, 1));
        ofFloat2.setInterpolator(new LinearInterpolator());
        ofFloat2.setDuration(250L);
        ((ArrayList) liVar.c).add(this);
        liVar.a();
        ((ViewGroup) liVar.d).invalidate();
        this.D.lock();
        ofFloat2.addListener(new org.telegram.ui.Components.v20(this, liVar, t1Var, jkVar, xnVar));
        if (SharedConfig.getDevicePerformanceClass() == 2) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:219:0x03d9, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.caption) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03f1, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r11.replyMessageObject.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0446, code lost:
    
        if (android.text.TextUtils.isEmpty(r12.caption) != false) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x045e, code lost:
    
        if ((org.telegram.messenger.MessageObject.getMedia(r11.replyMessageObject.messageOwner) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0890  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0641  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0755  */
    @Override // org.telegram.ui.th0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        int i10;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        Canvas canvas2;
        float f19;
        xn xnVar;
        ImageReceiver imageReceiver;
        float f20;
        float f21;
        float f22;
        MessageObject messageObject;
        float f23;
        float f24;
        int i11;
        xa1 xa1Var;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float f31;
        xn xnVar2;
        float f32;
        float f33;
        float f34;
        boolean z4;
        int i12;
        float f35;
        float f36;
        float f37;
        org.telegram.ui.Cells.t1 t1Var;
        boolean z10;
        float f38;
        float f39;
        float f40;
        float f41;
        MessageObject.TextLayoutBlock textLayoutBlock;
        org.telegram.ui.Cells.s1 s1Var;
        float f42;
        Canvas canvas3;
        float f43;
        float f44;
        int i13;
        float f45;
        float f46;
        boolean z11;
        int v02;
        int i14;
        MessageObject messageObject2;
        int v03;
        float f47;
        float f48;
        float f49;
        RectF rectF;
        float f50;
        int i15;
        StaticLayout staticLayout;
        int i16;
        float f51;
        int i17;
        float f52;
        org.telegram.ui.Components.sl0 sl0Var = this.s;
        float y10 = sl0Var.getY();
        org.telegram.ui.Components.li liVar = this.t;
        float y11 = (y10 - liVar.getY()) + sl0Var.getMeasuredHeight();
        float x10 = this.y - liVar.getX();
        float y12 = this.z - liVar.getY();
        org.telegram.ui.Cells.t1 t1Var2 = this.r;
        int textX = t1Var2.getTextX();
        org.telegram.ui.Cells.s1 s1Var2 = t1Var2.Wc;
        ImageReceiver imageReceiver2 = t1Var2.C9;
        ArrayList arrayList = t1Var2.Id;
        this.I = textX;
        this.J = t1Var2.getTextY();
        if (t1Var2.getMessageObject().stableId != this.w) {
            return;
        }
        float x11 = (sl0Var.getX() + t1Var2.getX()) - liVar.getX();
        float top = ((sl0Var.getTop() + (t1Var2.getPaddingTop() + t1Var2.getTop())) - liVar.getY()) - (this.S - sl0Var.getPaddingBottom());
        float interpolation = xh.n.V.getInterpolation(this.a);
        float f53 = this.a;
        float f54 = f53 > 0.4f ? 1.0f : f53 / 0.4f;
        float interpolation2 = org.telegram.ui.Components.pr.g.getInterpolation(org.telegram.ui.Components.pr.h.getInterpolation(f53));
        float f55 = this.I + x11;
        float f56 = this.J + top;
        float f57 = 1.0f - interpolation2;
        int measuredHeight = (int) ((y11 * interpolation2) + (liVar.getMeasuredHeight() * f57));
        boolean z12 = t1Var2.getBottom() - AndroidUtilities.dp(4.0f) > sl0Var.getMeasuredHeight() && (((float) t1Var2.getMeasuredHeight()) + top) - ((float) AndroidUtilities.dp(8.0f)) > ((float) measuredHeight) && liVar.getMeasuredHeight() > 0;
        if (z12) {
            i10 = measuredHeight;
            f11 = interpolation2;
            f14 = interpolation;
            f15 = f56;
            f16 = f55;
            f17 = x11;
            f12 = f57;
            f13 = f54;
            f10 = top;
            f18 = 0.0f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, Math.max(0.0f, top), liVar.getMeasuredWidth(), liVar.getMeasuredHeight(), 255, 31);
        } else {
            i10 = measuredHeight;
            f10 = top;
            f11 = interpolation2;
            f12 = f57;
            f13 = f54;
            f14 = interpolation;
            f15 = f56;
            f16 = f55;
            f17 = x11;
            f18 = 0.0f;
            canvas2 = canvas;
        }
        canvas2.save();
        float y13 = sl0Var.getY();
        xn xnVar3 = this.A;
        canvas2.clipRect(f18, ((xnVar3.p9 + y13) - liVar.getY()) - AndroidUtilities.dp(3.0f), liVar.getMeasuredWidth(), liVar.getMeasuredHeight());
        canvas2.save();
        float f58 = f17;
        float f59 = this.l;
        float f60 = f16;
        float backgroundDrawableLeft = t1Var2.getBackgroundDrawableLeft() + f58 + ((x10 - (f60 - f59)) * f12);
        float f61 = f10;
        float backgroundDrawableTop = t1Var2.getBackgroundDrawableTop() + f61;
        float y14 = this.j - liVar.getY();
        float f62 = f14;
        float f63 = 1.0f - f62;
        float f64 = (backgroundDrawableTop * f62) + (y14 * f63);
        float y15 = ((this.x - liVar.getY()) * f63) + ((backgroundDrawableTop + (t1Var2.getBackgroundDrawableBottom() - t1Var2.getBackgroundDrawableTop())) * f62);
        int dp = (int) ((AndroidUtilities.dp(4.0f) * f12) + t1Var2.getBackgroundDrawableRight() + f58);
        MessageObject messageObject3 = this.k;
        org.telegram.ui.ActionBar.h5 y22 = !messageObject3.isAnimatedEmojiStickers() ? t1Var2.y2(true) : null;
        if (y22 != null) {
            imageReceiver = imageReceiver2;
            t1Var2.setBackgroundTopY(liVar.getTop() - sl0Var.getTop());
            Drawable j10 = y22.j();
            f19 = f58;
            f21 = f13;
            if (f21 != 1.0f) {
                f20 = f62;
                NinePatchDrawable ninePatchDrawable = this.F;
                if (ninePatchDrawable != null) {
                    messageObject = messageObject3;
                    xnVar = xnVar3;
                    ninePatchDrawable.setBounds((int) backgroundDrawableLeft, (int) f64, dp, (int) y15);
                    ninePatchDrawable.draw(canvas2);
                    f22 = f11;
                    if (j10 != null) {
                        j10.setAlpha((int) (f22 * 255.0f));
                        j10.setBounds((int) backgroundDrawableLeft, (int) f64, dp, (int) y15);
                        j10.draw(canvas2);
                        j10.setAlpha(255);
                    }
                    y22.setAlpha((int) (f21 * 255.0f));
                    y22.setBounds((int) backgroundDrawableLeft, (int) f64, dp, (int) y15);
                    y22.G = true;
                    y22.draw(canvas2);
                    y22.G = false;
                    y22.setAlpha(255);
                } else {
                    xnVar = xnVar3;
                }
            } else {
                xnVar = xnVar3;
                f20 = f62;
            }
            messageObject = messageObject3;
            f22 = f11;
            if (j10 != null) {
            }
            y22.setAlpha((int) (f21 * 255.0f));
            y22.setBounds((int) backgroundDrawableLeft, (int) f64, dp, (int) y15);
            y22.G = true;
            y22.draw(canvas2);
            y22.G = false;
            y22.setAlpha(255);
        } else {
            f19 = f58;
            xnVar = xnVar3;
            imageReceiver = imageReceiver2;
            f20 = f62;
            f21 = f13;
            f22 = f11;
            messageObject = messageObject3;
        }
        canvas2.restore();
        canvas2.save();
        if (y22 != null) {
            if (messageObject.isOutOwner()) {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + backgroundDrawableLeft, AndroidUtilities.dp(4.0f) + f64, dp - AndroidUtilities.dp(10.0f), y15 - AndroidUtilities.dp(4.0f));
            } else {
                canvas2.clipRect(AndroidUtilities.dp(4.0f) + backgroundDrawableLeft, AndroidUtilities.dp(4.0f) + f64, dp - AndroidUtilities.dp(4.0f), y15 - AndroidUtilities.dp(4.0f));
            }
        }
        float x12 = (sl0Var.getX() + t1Var2.getLeft()) - liVar.getX();
        float f65 = f15;
        float w10 = e2.c.w(y12, f65, f63, f61);
        canvas2.translate(x12, w10);
        t1Var2.m2(f21, canvas2, false);
        t1Var2.W1(canvas2, f21);
        t1Var2.M1(canvas2, f21);
        t1Var2.I1(f21, canvas2, false);
        t1Var2.d2(canvas2, f21, null);
        t1Var2.N1(canvas2, f21);
        t1Var2.T1(canvas2, f21);
        canvas2.restore();
        if (this.c) {
            xn xnVar4 = xnVar;
            ((org.telegram.ui.Components.oo[]) xnVar4.X.b)[0].c.setAlpha(0.0f);
            ((org.telegram.ui.Components.oo[]) xnVar4.X.b)[0].d.setAlpha(0.0f);
            AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), t1Var2.F9, f22);
            int dp2 = AndroidUtilities.dp(10.0f);
            float x13 = this.e - liVar.getX();
            float y16 = this.g - liVar.getY();
            f32 = backgroundDrawableLeft;
            float f66 = f19 + t1Var2.D9;
            float f67 = f21;
            float f68 = t1Var2.E9 + f61;
            if (t1Var2.Y9 == null) {
                t1Var2.Y9 = new org.telegram.ui.Components.am0(t1Var2);
            }
            f24 = y15;
            t1Var2.Y9.a(t1Var2.getMessageObject(), t1Var2.getCurrentUser(), t1Var2.getCurrentChat(), this.N, 0);
            boolean shouldDrawWithoutBackground = messageObject.shouldDrawWithoutBackground();
            org.telegram.ui.ActionBar.g6 g6Var = this.N;
            if (shouldDrawWithoutBackground) {
                v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xc, g6Var);
                b(org.telegram.ui.ActionBar.k6.Vc);
            } else {
                org.telegram.ui.Components.am0 am0Var = t1Var2.Y9;
                if (am0Var != null) {
                    i14 = am0Var.I.c;
                    if (!messageObject.shouldDrawWithoutBackground()) {
                        i11 = dp;
                        f25 = f64;
                        f26 = y12;
                        messageObject2 = messageObject;
                        f27 = f63;
                        org.telegram.ui.Components.am0 am0Var2 = t1Var2.Y9;
                        if (am0Var2 != null) {
                            v03 = am0Var2.I.c;
                        } else {
                            if (messageObject2.hasValidReplyMessageObject()) {
                                MessageObject messageObject4 = messageObject2.replyMessageObject;
                                if (messageObject4.type == 0 || !TextUtils.isEmpty(messageObject4.caption)) {
                                    TLRPC.MessageMedia messageMedia = messageObject2.replyMessageObject.messageOwner.media;
                                    if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                        v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.db, g6Var);
                                    }
                                }
                            }
                            v03 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.eb, g6Var);
                        }
                    } else if (!messageObject.isOutOwner()) {
                        i11 = dp;
                        f25 = f64;
                        f26 = y12;
                        messageObject2 = messageObject;
                        f27 = f63;
                        if (!messageObject2.isReplyToStory()) {
                            int v04 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Yc, g6Var);
                            if (!messageObject2.forceAvatar) {
                                if (messageObject2.hasValidReplyMessageObject()) {
                                    MessageObject messageObject5 = messageObject2.replyMessageObject;
                                    if (messageObject5.type != 0) {
                                    }
                                    if (!(MessageObject.getMedia(messageObject2.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                    }
                                }
                                if (!t1Var2.w9) {
                                    i16 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Zc, g6Var);
                                    f51 = 0.6f;
                                    v03 = i0.a.d(f51, i16, org.telegram.ui.ActionBar.k6.c(i16, i14));
                                }
                            }
                            i16 = v04;
                            f51 = 0.0f;
                            v03 = i0.a.d(f51, i16, org.telegram.ui.ActionBar.k6.c(i16, i14));
                        }
                        v03 = i14;
                    } else if (messageObject.isReplyToStory()) {
                        i11 = dp;
                        f25 = f64;
                        f26 = y12;
                        messageObject2 = messageObject;
                        f27 = f63;
                        v03 = i14;
                    } else {
                        i11 = dp;
                        int v05 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.db, g6Var);
                        f25 = f64;
                        messageObject2 = messageObject;
                        if (messageObject2.forceAvatar) {
                            f26 = y12;
                        } else {
                            if (messageObject2.hasValidReplyMessageObject()) {
                                MessageObject messageObject6 = messageObject2.replyMessageObject;
                                f26 = y12;
                                if (messageObject6.type != 0) {
                                }
                                if (!(MessageObject.getMedia(messageObject2.replyMessageObject.messageOwner) instanceof TLRPC.TL_messageMediaGame)) {
                                }
                            } else {
                                f26 = y12;
                            }
                            if (!t1Var2.w9) {
                                i17 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.eb, g6Var);
                                f52 = 0.6f;
                                f27 = f63;
                                v03 = i0.a.d(f52, i17, org.telegram.ui.ActionBar.k6.c(i17, i14));
                            }
                        }
                        i17 = v05;
                        f52 = 0.0f;
                        f27 = f63;
                        v03 = i0.a.d(f52, i17, org.telegram.ui.ActionBar.k6.c(i17, i14));
                    }
                    MessageObject messageObject7 = messageObject2;
                    f30 = f20;
                    org.telegram.ui.ActionBar.k6.Z2.setColor(i0.a.d(f30, this.i, v03));
                    org.telegram.ui.ActionBar.k6.Y2.setColor(i0.a.d(f30, this.h, i14));
                    float dp3 = !t1Var2.M9 ? x13 - AndroidUtilities.dp(44.0f) : x13;
                    float lerp = AndroidUtilities.lerp(dp3, f66, f22);
                    float lerp2 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f30) + y16, f68, f30);
                    if (this.R == null) {
                        this.R = new float[]{r5, r5, 0.0f, 0.0f, 0.0f, 0.0f, r5, r5};
                        float dp4 = AndroidUtilities.dp(4.0f);
                        float[] fArr = this.R;
                        fArr[5] = 0.0f;
                        fArr[4] = 0.0f;
                        fArr[3] = 0.0f;
                        fArr[2] = 0.0f;
                    }
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(dp3, y16, this.f + dp3, AndroidUtilities.dp(35.0f) + y16);
                    rectF2.offset(0.0f, AndroidUtilities.dp(12.0f) * f30);
                    RectF rectF3 = t1Var2.yc;
                    RectF rectF4 = this.Q;
                    rectF4.set(rectF3);
                    rectF4.offset(f19, w10);
                    RectF rectF5 = this.P;
                    AndroidUtilities.lerp(rectF2, rectF4, f22, rectF5);
                    f28 = f60;
                    f29 = f59;
                    f34 = f65;
                    t1Var2.Y9.d(canvas, rectF5, f67, t1Var2.w9, t1Var2.getMessageObject().shouldDrawWithoutBackground());
                    canvas2 = canvas;
                    t1Var2.Y9.e(canvas2, rectF5, f67);
                    if (t1Var2.M9) {
                        f47 = f67;
                        f48 = 0.0f;
                    } else {
                        canvas2.save();
                        float lerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(35.0f), Math.min(rectF5.height() - AndroidUtilities.dp(10.0f), org.telegram.ui.ActionBar.k6.Z2.getTextSize() + org.telegram.ui.ActionBar.k6.Y2.getTextSize() + AndroidUtilities.dp(t1Var2.w9 ? 3.0f : 7.0f)), f22);
                        float lerp4 = AndroidUtilities.lerp(lerp, rectF5.left + AndroidUtilities.dp(8.0f), f22);
                        float f69 = rectF5.top;
                        if (!t1Var2.w9 || (staticLayout = t1Var2.A9) == null) {
                            f47 = f67;
                        } else {
                            f47 = f67;
                            if (staticLayout.getLineCount() <= 1) {
                                i15 = 2;
                                float lerp5 = AndroidUtilities.lerp(lerp2, f69 + AndroidUtilities.dp(i15 + 5), f22);
                                ImageReceiver imageReceiver3 = imageReceiver;
                                imageReceiver3.setImageCoords(lerp4, lerp5, lerp3, lerp3);
                                imageReceiver3.draw(canvas2);
                                canvas2.restore();
                                f48 = lerp3;
                            }
                        }
                        i15 = 0;
                        float lerp52 = AndroidUtilities.lerp(lerp2, f69 + AndroidUtilities.dp(i15 + 5), f22);
                        ImageReceiver imageReceiver32 = imageReceiver;
                        imageReceiver32.setImageCoords(lerp4, lerp52, lerp3, lerp3);
                        imageReceiver32.draw(canvas2);
                        canvas2.restore();
                        f48 = lerp3;
                    }
                    canvas2.save();
                    float f70 = dp2 * f22;
                    canvas2.translate(f70, 0.0f);
                    float f71 = -(!messageObject7.shouldDrawWithoutBackground() ? AndroidUtilities.dp(6.0f) : AndroidUtilities.dp(1.0f));
                    float dp5 = !messageObject7.shouldDrawWithoutBackground() ? AndroidUtilities.dp(1.0f) : AndroidUtilities.dp(3.0f);
                    float f72 = t1Var2.K9;
                    float f73 = (f66 - f72) + f71;
                    float f74 = (f66 - this.K) + f71;
                    AndroidUtilities.lerp(dp3 - f72, f73, f22);
                    float lerp6 = AndroidUtilities.lerp(dp3, f74, f22) + (!t1Var2.M9 ? AndroidUtilities.dp(3.0f) + f48 : 0.0f);
                    if (t1Var2.z9 == null) {
                        canvas2.save();
                        canvas2.translate(lerp6, (dp5 * f22) + lerp2);
                        int alpha = org.telegram.ui.ActionBar.k6.Y2.getAlpha();
                        org.telegram.ui.ActionBar.k6.Y2.setAlpha((int) (alpha * f22));
                        t1Var2.z9.draw(canvas2);
                        org.telegram.ui.ActionBar.k6.Y2.setAlpha(alpha);
                        org.telegram.ui.ActionBar.l5 l5Var = ((org.telegram.ui.Components.oo[]) xnVar4.X.b)[0].c;
                        f49 = f70;
                        xnVar2 = xnVar4;
                        rectF = rectF5;
                        f23 = f47;
                        f50 = f73;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, l5Var.getWidth(), l5Var.getHeight(), (int) (f12 * 255.0f), 31);
                        l5Var.setAlpha(1.0f);
                        l5Var.draw(canvas2);
                        l5Var.setAlpha(0.0f);
                        canvas2.restore();
                        canvas2.restore();
                    } else {
                        xnVar2 = xnVar4;
                        f49 = f70;
                        rectF = rectF5;
                        f50 = f73;
                        f23 = f47;
                    }
                    if (t1Var2.w9 && t1Var2.s9 != null) {
                        if (t1Var2.Y9.h() != t1Var2.p9) {
                            Drawable drawable = t1Var2.s9;
                            int h = t1Var2.Y9.h();
                            t1Var2.p9 = h;
                            drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN));
                        }
                        t1Var2.s9.setBounds((int) (((rectF.right - f49) - AndroidUtilities.dp((!t1Var2.F ? 1 : 0) + 2)) - t1Var2.s9.getIntrinsicWidth()), (int) (rectF.top + AndroidUtilities.dp((!t1Var2.F ? 1 : 0) + 2)), (int) ((rectF.right - f49) - AndroidUtilities.dp((!t1Var2.F ? 1 : 0) + 2)), (int) (rectF.top + AndroidUtilities.dp((!t1Var2.F ? 1 : 0) + 2) + t1Var2.s9.getIntrinsicHeight()));
                        t1Var2.s9.setAlpha((int) (f22 * 255.0f));
                        t1Var2.s9.draw(canvas2);
                    }
                    if (t1Var2.A9 == null) {
                        canvas2.save();
                        float lerp7 = AndroidUtilities.lerp(AndroidUtilities.dp(19.0f), org.telegram.ui.ActionBar.k6.Y2.getTextSize() + AndroidUtilities.dp(4.0f) + dp5, f22) + lerp2;
                        float dp6 = (t1Var2.w9 && t1Var2.M9) ? f50 - AndroidUtilities.dp(2.0f) : f50;
                        if (t1Var2.M9 && (!t1Var2.w9 || t1Var2.L9)) {
                            dp6 += f48 + AndroidUtilities.dp(3.0f);
                        }
                        if (t1Var2.x9 && t1Var2.y9 != null) {
                            float lerp8 = AndroidUtilities.lerp(dp3 - t1Var2.K9, dp6, f22);
                            t1Var2.y9.e((int) lerp8, AndroidUtilities.dp(2.0f) + ((int) lerp7), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                            org.telegram.ui.ActionBar.k6.X1.setColor(org.telegram.ui.ActionBar.k6.v0(messageObject7.isOutOwner() ? org.telegram.ui.ActionBar.k6.Ta : org.telegram.ui.ActionBar.k6.Ac, g6Var));
                            canvas2.drawCircle(lerp8 + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(8.0f) + lerp7, AndroidUtilities.dp(5.0f), org.telegram.ui.ActionBar.k6.X1);
                            t1Var2.y9.h(-1, messageObject7.isOutOwner() ? org.telegram.ui.ActionBar.k6.zb : org.telegram.ui.ActionBar.k6.xd, org.telegram.ui.ActionBar.k6.k7);
                            CheckBoxBase checkBoxBase = t1Var2.y9;
                            if (checkBoxBase.h != f30) {
                                checkBoxBase.h = f30;
                                checkBoxBase.b();
                            }
                            t1Var2.y9.a(canvas2);
                        }
                        if (t1Var2.x9) {
                            dp6 += AndroidUtilities.dp(16.0f);
                        }
                        if (t1Var2.L9 && t1Var2.K9 > 0) {
                            dp6 = ((rectF.right - AndroidUtilities.dp(8.0f)) - t1Var2.A9.getWidth()) - f49;
                        }
                        canvas2.translate(AndroidUtilities.lerp(dp3 - t1Var2.K9, dp6, f22), lerp7);
                        canvas2.save();
                        jh.k.d(canvas2, arrayList);
                        xa1Var = this;
                        f33 = w10;
                        f31 = f12;
                        org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas2, t1Var2.A9, t1Var2.nc, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
                        t1Var2.A9.draw(canvas2);
                        canvas2.restore();
                        int size = arrayList.size();
                        int i18 = 0;
                        while (i18 < size) {
                            Object obj = arrayList.get(i18);
                            i18++;
                            jh.k kVar = (jh.k) obj;
                            boolean z13 = kVar.p;
                            kVar.p = false;
                            if (z13) {
                                kVar.h(t1Var2.A9.getPaint().getColor());
                            }
                            kVar.draw(canvas2);
                        }
                        canvas2.restore();
                    } else {
                        xa1Var = this;
                        f33 = w10;
                        f31 = f12;
                    }
                    canvas2.restore();
                } else if (messageObject.isOutOwner()) {
                    v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.cb, g6Var);
                    b(org.telegram.ui.ActionBar.k6.ab);
                } else {
                    v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Wc, g6Var);
                    b(org.telegram.ui.ActionBar.k6.Uc);
                }
            }
            i14 = v02;
            if (!messageObject.shouldDrawWithoutBackground()) {
            }
            MessageObject messageObject72 = messageObject2;
            f30 = f20;
            org.telegram.ui.ActionBar.k6.Z2.setColor(i0.a.d(f30, this.i, v03));
            org.telegram.ui.ActionBar.k6.Y2.setColor(i0.a.d(f30, this.h, i14));
            if (!t1Var2.M9) {
            }
            float lerp9 = AndroidUtilities.lerp(dp3, f66, f22);
            float lerp22 = AndroidUtilities.lerp((AndroidUtilities.dp(12.0f) * f30) + y16, f68, f30);
            if (this.R == null) {
            }
            RectF rectF22 = AndroidUtilities.rectTmp;
            rectF22.set(dp3, y16, this.f + dp3, AndroidUtilities.dp(35.0f) + y16);
            rectF22.offset(0.0f, AndroidUtilities.dp(12.0f) * f30);
            RectF rectF32 = t1Var2.yc;
            RectF rectF42 = this.Q;
            rectF42.set(rectF32);
            rectF42.offset(f19, w10);
            RectF rectF52 = this.P;
            AndroidUtilities.lerp(rectF22, rectF42, f22, rectF52);
            f28 = f60;
            f29 = f59;
            f34 = f65;
            t1Var2.Y9.d(canvas, rectF52, f67, t1Var2.w9, t1Var2.getMessageObject().shouldDrawWithoutBackground());
            canvas2 = canvas;
            t1Var2.Y9.e(canvas2, rectF52, f67);
            if (t1Var2.M9) {
            }
            canvas2.save();
            float f702 = dp2 * f22;
            canvas2.translate(f702, 0.0f);
            float f712 = -(!messageObject72.shouldDrawWithoutBackground() ? AndroidUtilities.dp(6.0f) : AndroidUtilities.dp(1.0f));
            float dp52 = !messageObject72.shouldDrawWithoutBackground() ? AndroidUtilities.dp(1.0f) : AndroidUtilities.dp(3.0f);
            float f722 = t1Var2.K9;
            float f732 = (f66 - f722) + f712;
            float f742 = (f66 - this.K) + f712;
            AndroidUtilities.lerp(dp3 - f722, f732, f22);
            float lerp62 = AndroidUtilities.lerp(dp3, f742, f22) + (!t1Var2.M9 ? AndroidUtilities.dp(3.0f) + f48 : 0.0f);
            if (t1Var2.z9 == null) {
            }
            if (t1Var2.w9) {
                if (t1Var2.Y9.h() != t1Var2.p9) {
                }
                t1Var2.s9.setBounds((int) (((rectF.right - f49) - AndroidUtilities.dp((!t1Var2.F ? 1 : 0) + 2)) - t1Var2.s9.getIntrinsicWidth()), (int) (rectF.top + AndroidUtilities.dp((!t1Var2.F ? 1 : 0) + 2)), (int) ((rectF.right - f49) - AndroidUtilities.dp((!t1Var2.F ? 1 : 0) + 2)), (int) (rectF.top + AndroidUtilities.dp((!t1Var2.F ? 1 : 0) + 2) + t1Var2.s9.getIntrinsicHeight()));
                t1Var2.s9.setAlpha((int) (f22 * 255.0f));
                t1Var2.s9.draw(canvas2);
            }
            if (t1Var2.A9 == null) {
            }
            canvas2.restore();
        } else {
            f23 = f21;
            f24 = y15;
            i11 = dp;
            xa1Var = this;
            f25 = f64;
            f26 = y12;
            f27 = f63;
            f28 = f60;
            f29 = f59;
            f30 = f20;
            f31 = f12;
            xnVar2 = xnVar;
            f32 = backgroundDrawableLeft;
            f33 = w10;
            f34 = f65;
        }
        canvas2.save();
        if (t1Var2.getMessageObject() == null || t1Var2.getMessageObject().type != 19) {
            canvas2.clipRect(f32 + AndroidUtilities.dp(4.0f), f25 + AndroidUtilities.dp(4.0f), i11 - AndroidUtilities.dp(4.0f), f24 - AndroidUtilities.dp(4.0f));
        }
        float f75 = (xa1Var.C * f31) + f22;
        canvas2.save();
        float f76 = x10 * f31;
        float f77 = f28;
        float w11 = e2.c.w(f77, f29, f22, f76);
        float f78 = f26 * f27;
        ArrayList<MessageObject.TextLayoutBlock> arrayList2 = t1Var2.getMessageObject().textLayoutBlocks;
        MessageObject.TextLayoutBlock textLayoutBlock2 = xa1Var.E;
        canvas2.translate(w11, ((textLayoutBlock2.textYOffset(arrayList2, s1Var2) + f34) * f30) + f78);
        float f79 = f75 * 1.0f;
        canvas2.scale(f75, f79, 0.0f, 0.0f);
        boolean z14 = xa1Var.o;
        int i19 = xa1Var.M;
        boolean z15 = xa1Var.n;
        StaticLayout staticLayout2 = xa1Var.p;
        if (z15 && z14) {
            int color = staticLayout2.getPaint().getColor();
            float f80 = f23;
            staticLayout2.getPaint().setColor(i0.a.d(f80, xa1Var.L, i19));
            float f81 = 1.0f - f80;
            f35 = f30;
            f36 = f31;
            i12 = i19;
            f39 = f80;
            z4 = z14;
            s1Var = s1Var2;
            z10 = z15;
            textLayoutBlock = textLayoutBlock2;
            f37 = f33;
            t1Var = t1Var2;
            f40 = f77;
            canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f81 * 255.0f), 31);
            staticLayout2.draw(canvas);
            f38 = f75;
            f41 = f79;
            f42 = f76;
            org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas, xa1Var.p, xa1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f81);
            staticLayout2.getPaint().setColor(color);
            canvas.restore();
            canvas3 = canvas;
        } else {
            z4 = z14;
            i12 = i19;
            f35 = f30;
            f36 = f31;
            f37 = f33;
            t1Var = t1Var2;
            z10 = z15;
            f38 = f75;
            f39 = f23;
            f40 = f77;
            f41 = f79;
            textLayoutBlock = textLayoutBlock2;
            s1Var = s1Var2;
            f42 = f76;
            if (z10) {
                float f82 = 1.0f - f39;
                canvas3 = canvas;
                canvas3.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f82 * 255.0f), 31);
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas3, xa1Var.p, xa1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, f82);
                canvas3.restore();
            } else {
                canvas3 = canvas;
                staticLayout2.draw(canvas3);
                org.telegram.ui.Components.u5.drawAnimatedEmojis(canvas3, xa1Var.p, xa1Var.H, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            }
        }
        canvas3.restore();
        StaticLayout staticLayout3 = xa1Var.q;
        if (staticLayout3 != null) {
            canvas3.save();
            canvas3.translate(e2.c.w(f40, xa1Var.m, f22, f42), ((textLayoutBlock.textYOffset(t1Var.getMessageObject().textLayoutBlocks, s1Var) + f34) * f35) + f78);
            f43 = f41;
            f45 = f38;
            canvas3.scale(f45, f43, 0.0f, 0.0f);
            if (z10 && z4) {
                int color2 = staticLayout3.getPaint().getColor();
                f44 = f39;
                i13 = i12;
                staticLayout3.getPaint().setColor(i0.a.k(i0.a.d(f44, xa1Var.L, i13), (int) ((1.0f - f44) * Color.alpha(color2))));
                staticLayout3.draw(canvas3);
                staticLayout3.getPaint().setColor(color2);
            } else {
                f44 = f39;
                i13 = i12;
                if (z10) {
                    int alpha2 = staticLayout3.getPaint().getAlpha();
                    staticLayout3.getPaint().setAlpha((int) ((1.0f - f44) * alpha2));
                    staticLayout3.draw(canvas3);
                    staticLayout3.getPaint().setAlpha(alpha2);
                } else {
                    staticLayout3.draw(canvas3);
                }
            }
            canvas3.restore();
        } else {
            f43 = f41;
            f44 = f39;
            i13 = i12;
            f45 = f38;
        }
        if (z10) {
            canvas3.save();
            canvas3.translate(e2.c.w(x10, f40, f36, (sl0Var.getX() + t1Var.getLeft()) - liVar.getX()), f37);
            canvas3.scale(f45, f43, t1Var.getTextX(), t1Var.getTextY());
            canvas3.translate(0.0f, -0.0f);
            int color3 = org.telegram.ui.ActionBar.k6.o2.getColor();
            org.telegram.ui.ActionBar.k6.o2.setColor(i13);
            ArrayList<MessageObject.TextLayoutBlock> arrayList3 = t1Var.getMessageObject().textLayoutBlocks;
            org.telegram.ui.Cells.t1 t1Var3 = t1Var;
            float f83 = t1Var3.o0;
            org.telegram.ui.Cells.s1 s1Var3 = t1Var3.Wc;
            if (s1Var3.l2) {
                float f84 = s1Var3.n2;
                float f85 = s1Var3.K1;
                f83 = (f83 * f85) + ((1.0f - f85) * f84);
            }
            float f86 = t1Var3.k0;
            MessageObject messageObject8 = t1Var3.v7;
            Canvas canvas4 = canvas3;
            f46 = 0.0f;
            z11 = false;
            t1Var3.U1(f86, f83, canvas4, arrayList3, messageObject8 == null ? 0.0f : messageObject8.textXOffset, true, f44, false, true, false, false);
            canvas3 = canvas4;
            t1Var3.A1(canvas3, f44);
            if (org.telegram.ui.ActionBar.k6.o2.getColor() != color3) {
                org.telegram.ui.ActionBar.k6.o2.setColor(color3);
            }
            canvas3.restore();
        } else {
            f46 = 0.0f;
            z11 = false;
        }
        canvas3.restore();
        if (z12) {
            float f87 = i10;
            xa1Var.u.setTranslate(f46, f87);
            xa1Var.B.setLocalMatrix(xa1Var.u);
            canvas3.drawRect(0.0f, f87, liVar.getMeasuredWidth(), liVar.getMeasuredHeight(), xa1Var.v);
            canvas3.restore();
        }
        float f88 = xa1Var.a;
        float f89 = f88 > 0.4f ? 1.0f : f88 / 0.4f;
        jk jkVar = xa1Var.G;
        if (f89 == 1.0f) {
            jkVar.setTextTransitionIsRunning(z11);
        }
        if (jkVar.getSendButton().getVisibility() != 0 || f89 >= 1.0f) {
            return;
        }
        View sendButton = jkVar.getSendButton();
        pm pmVar = xnVar2.U0;
        PointF pointF = xa1Var.O;
        vg.i.b(sendButton, pmVar, pointF);
        canvas3.save();
        canvas3.translate(pointF.x - liVar.getX(), pointF.y - liVar.getY());
        View sendButton2 = jkVar.getSendButton();
        canvas3.saveLayerAlpha(0.0f, 0.0f, sendButton2.getWidth(), sendButton2.getHeight(), (int) ((1.0f - f89) * 255.0f));
        sendButton2.draw(canvas3);
        canvas3.restore();
        canvas3.restore();
        canvas3.restore();
    }

    public final int b(int i10) {
        return org.telegram.ui.ActionBar.k6.v0(i10, this.N);
    }
}
