// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class tx1 extends wy1 {
    public boolean h2;
    public float i2;
    public float j2;
    public boolean k2;
    public final /* synthetic */ ChatActivityEnterView l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tx1(ChatActivityEnterView chatActivityEnterView, Context context, vnb vnbVar) {
        super(chatActivityEnterView, context, vnbVar);
        this.l2 = chatActivityEnterView;
        this.h2 = true;
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ChatActivityEnterView chatActivityEnterView = this.l2;
        zu1 zu1Var = chatActivityEnterView.E3;
        View view = chatActivityEnterView.t6;
        if (view != null) {
            setWindowView(view);
        } else if (zu1Var == null || zu1Var.getParentLayout() == null || !((ActionBarLayout) zu1Var.getParentLayout()).b) {
            setWindowView(chatActivityEnterView.D3.getWindow().getDecorView());
        } else {
            setWindowView(zu1Var.getParentLayout().getWindow().getDecorView());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0375 A[EDGE_INSN: B:100:0x0375->B:84:0x0375 BREAK  A[LOOP:1: B:68:0x0300->B:80:0x0300], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02fe A[EDGE_INSN: B:101:0x02fe->B:67:0x02fe BREAK  A[LOOP:0: B:49:0x026c->B:58:0x026c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0394  */
    @Override // xt3, org.telegram.ui.Components.EditTextBoldCursor, cu3, android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        sn3 sn3Var;
        boolean z;
        Canvas canvas2;
        int i;
        ChatActivityEnterView chatActivityEnterView;
        int i2;
        float f;
        float f2;
        float f3;
        float f4;
        int i3;
        int i4;
        float f5;
        float f6;
        ChatActivityEnterView chatActivityEnterView2 = this.l2;
        sn3 sn3Var2 = chatActivityEnterView2.z6;
        if (sn3Var2 == null || !sn3Var2.d) {
            bn3 bn3Var = chatActivityEnterView2.j1;
            if (bn3Var == null) {
                sn3Var = null;
                z = sn3Var == null && sn3Var.d && getLayout() != null;
                float totalPaddingLeft = getTotalPaddingLeft();
                float offsetY = getOffsetY() + getTotalPaddingTop();
                if (z) {
                    canvas2 = canvas;
                    i = -1;
                } else {
                    int width = getLayout().getWidth();
                    int height = getLayout().getHeight();
                    sn3Var.getClass();
                    canvas2 = canvas;
                    i = canvas2.saveLayer(totalPaddingLeft - hl.L(8.0f), offsetY - hl.L(40.0f), width + totalPaddingLeft + hl.L(8.0f), hl.L(40.0f) + height + offsetY, null);
                }
                super.onDraw(canvas);
                if (z) {
                    chatActivityEnterView = chatActivityEnterView2;
                } else {
                    int width2 = getLayout().getWidth();
                    int height2 = getLayout().getHeight();
                    LinearGradient linearGradient = sn3Var.r;
                    tx1 tx1Var = sn3Var.b;
                    int[] iArr = sn3Var.A;
                    LinearGradient linearGradient2 = sn3Var.s;
                    float f7 = sn3Var.B;
                    Paint paint = sn3Var.q;
                    LinearGradient linearGradient3 = sn3Var.t;
                    Paint paint2 = sn3Var.p;
                    mva mvaVar = sn3Var.c;
                    int i5 = i;
                    if (sn3Var.I) {
                        i2 = width2;
                    } else {
                        sn3Var.I = true;
                        i2 = width2;
                        if (sn3Var.D) {
                            sn3Var.e = SystemClock.uptimeMillis();
                        }
                        Runnable runnable = sn3Var.H;
                        sn3Var.H = null;
                        if (runnable != null) {
                            runnable.run();
                        }
                    }
                    float uptimeMillis = (SystemClock.uptimeMillis() - sn3Var.e) / 1000.0f;
                    float d = sn3Var.d(uptimeMillis);
                    float d2 = sn3Var.d(uptimeMillis - sn3Var.F);
                    float f8 = -hl.L(8.0f);
                    float f9 = -hl.L(40.0f);
                    float L = hl.L(8.0f) + i2;
                    float L2 = hl.L(40.0f) + height2;
                    canvas2.save();
                    canvas2.translate(totalPaddingLeft, offsetY);
                    if (sn3Var.C) {
                        float d3 = sn3Var.d(uptimeMillis - 0.28f);
                        f3 = 1.0f;
                        f = L;
                        sn3Var.e(linearGradient3, d3, Math.max(d3 + 1.0f, sn3Var.d(uptimeMillis - 0.12f)));
                        f2 = L2;
                        float f10 = uptimeMillis - (sn3Var.a / 1000.0f);
                        paint.setAlpha(f10 <= 0.0f ? jn7.d4 : (int) (Math.max(0.0f, 1.0f - (f10 / 0.18f)) * 255.0f));
                    } else {
                        f = L;
                        f2 = L2;
                        f3 = 1.0f;
                        sn3Var.e(linearGradient3, d2 - hl.L(48.0f), d2);
                    }
                    paint.setShader(linearGradient3);
                    chatActivityEnterView = chatActivityEnterView2;
                    float f11 = f;
                    float f12 = f2;
                    canvas.drawRect(f8, f9, f11, f12, paint);
                    if (sn3Var.C) {
                        float f13 = sn3Var.E;
                        sn3Var.e(linearGradient2, d - f13, f13 + d);
                    } else {
                        sn3Var.e(linearGradient2, d2 - f7, d2);
                    }
                    paint2.setShader(linearGradient2);
                    canvas.drawRect(f8, f9, f11, f12, paint2);
                    canvas.restore();
                    canvas.restoreToCount(i5);
                    tx1Var.getLocationInWindow(iArr);
                    sn3Var.z = sn3Var.y - ((ik8.A(tx1Var) ? tx1Var.getOffsetY() : 0.0f) + ((tx1Var.getTotalPaddingTop() + iArr[1]) - tx1Var.getScrollY()));
                    canvas.save();
                    canvas.translate(totalPaddingLeft, offsetY + sn3Var.z);
                    if (sn3Var.h != null) {
                        if (d - (sn3Var.C ? sn3Var.E : f7) < sn3Var.g) {
                            int saveLayer = canvas.saveLayer(f8, sn3Var.w - hl.L(2.0f), Math.max(f11, sn3Var.h.getWidth()), hl.L(2.0f) + sn3Var.w + sn3Var.x, null);
                            f4 = 0.0f;
                            canvas.drawBitmap(sn3Var.h, 0.0f, 0.0f, sn3Var.o);
                            if (sn3Var.C) {
                                float f14 = sn3Var.E;
                                sn3Var.e(linearGradient, d - f14, f14 + d);
                            } else {
                                sn3Var.e(linearGradient, d, d + f7);
                            }
                            paint2.setShader(linearGradient);
                            canvas.drawRect(f8, f9, Math.max(f11, sn3Var.h.getWidth()), Math.max(f12, hl.L(40.0f) + sn3Var.h.getHeight()), paint2);
                            canvas.restoreToCount(saveLayer);
                            float f15 = hl.p;
                            float max = Math.max(0.05f, (sn3Var.a - (SystemClock.uptimeMillis() - sn3Var.e)) / 1000.0f);
                            while (true) {
                                i3 = sn3Var.m;
                                if (i3 < sn3Var.k) {
                                    break;
                                }
                                float[] fArr = sn3Var.i;
                                int i6 = i3 * 3;
                                if (fArr[i6 + 2] > d) {
                                    break;
                                }
                                sn3Var.m = i3 + 1;
                                if (!sn3Var.C) {
                                    mvaVar.h(fArr[i6], fArr[i6 + 1], ((mvaVar.d() * 34.0f) + 10.0f) * f15, (-((mvaVar.d() * 20.0f) + 6.0f)) * f15, Math.min(max, (mvaVar.d() * 0.3f) + 0.26f), 0.0f);
                                } else if (mvaVar.d() >= 0.45f) {
                                    float[] fArr2 = sn3Var.i;
                                    mvaVar.h(fArr2[i6], fArr2[i6 + 1], ((mvaVar.d() * 60.0f) + 26.0f) * f15, (-((mvaVar.d() * 44.0f) + 10.0f)) * f15, Math.min(max, (mvaVar.d() * 0.14f) + 0.12f), 0.0f);
                                }
                            }
                            while (true) {
                                i4 = sn3Var.n;
                                if (i4 < sn3Var.l) {
                                    break;
                                }
                                float[] fArr3 = sn3Var.j;
                                int i7 = i4 * 3;
                                if (fArr3[i7 + 2] > d) {
                                    break;
                                }
                                float f16 = fArr3[i7];
                                int i8 = i7 + 1;
                                float f17 = fArr3[i8] - sn3Var.z;
                                sn3Var.n = i4 + 1;
                                float scrollY = tx1Var.getScrollY();
                                if (sn3Var.j[i8] >= scrollY - hl.L(2.0f) && sn3Var.j[i8] <= scrollY + sn3Var.x + hl.L(2.0f)) {
                                    mvaVar.i((((mvaVar.d() * 16.0f) + 6.0f) * f15) + f16, ((mvaVar.d() - 0.5f) * 14.0f * f15) + f17, f16, f17, Math.min(max, (mvaVar.d() * 0.08f) + sn3Var.F + 0.04f));
                                }
                            }
                            mvaVar.b(canvas, f3);
                            canvas.restore();
                            f5 = uptimeMillis * 1000.0f;
                            f6 = sn3Var.a;
                            if (sn3Var.C) {
                                f4 = 180.0f;
                            }
                            if (f5 < f6 + f4) {
                                sn3Var.c();
                            } else {
                                tx1Var.invalidate();
                            }
                        }
                    }
                    f4 = 0.0f;
                    float f152 = hl.p;
                    float max2 = Math.max(0.05f, (sn3Var.a - (SystemClock.uptimeMillis() - sn3Var.e)) / 1000.0f);
                    while (true) {
                        i3 = sn3Var.m;
                        if (i3 < sn3Var.k) {
                        }
                    }
                    while (true) {
                        i4 = sn3Var.n;
                        if (i4 < sn3Var.l) {
                        }
                    }
                    mvaVar.b(canvas, f3);
                    canvas.restore();
                    f5 = uptimeMillis * 1000.0f;
                    f6 = sn3Var.a;
                    if (sn3Var.C) {
                    }
                    if (f5 < f6 + f4) {
                    }
                }
                if (getLayout() == null && this.h2) {
                    this.h2 = false;
                    chatActivityEnterView.P(true);
                    return;
                }
            }
            sn3Var2 = bn3Var.a;
        }
        sn3Var = sn3Var2;
        if (sn3Var == null) {
        }
        float totalPaddingLeft2 = getTotalPaddingLeft();
        float offsetY2 = getOffsetY() + getTotalPaddingTop();
        if (z) {
        }
        super.onDraw(canvas);
        if (z) {
        }
        if (getLayout() == null) {
        }
    }

    @Override // wy1, xt3, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ChatActivityEnterView chatActivityEnterView = this.l2;
        if (chatActivityEnterView.U != chatActivityEnterView.F0.getLineCount()) {
            boolean z = false;
            chatActivityEnterView.d2((chatActivityEnterView.F0.getLineCount() <= 2 || chatActivityEnterView.F0.getText() == null || TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) ? false : true);
            if (chatActivityEnterView.F0.getLineCount() > 2 && chatActivityEnterView.F0.getText() != null && !TextUtils.isEmpty(chatActivityEnterView.F0.getText().toString().trim())) {
                z = true;
            }
            chatActivityEnterView.k2(z);
        }
    }

    @Override // wy1, xt3, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == 16908322) {
            int i2 = ChatActivityEnterView.X7;
            ChatActivityEnterView chatActivityEnterView = this.l2;
            if (chatActivityEnterView.F0 != null) {
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) chatActivityEnterView.getContext().getSystemService("clipboard");
                    ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
                    if (primaryClip != null && primaryClip.getItemCount() >= 1 && primaryClip.getDescription() != null && primaryClip.getDescription().hasMimeType("text/html")) {
                        String htmlText = primaryClip.getItemAt(0).getHtmlText();
                        if (!TextUtils.isEmpty(htmlText)) {
                            HashMap hashMap = new HashMap();
                            ArrayList z = wi9.z(htmlText, hashMap);
                            if (!z.isEmpty()) {
                                if (uj9.d(z, hashMap)) {
                                    uc7.s1(chatActivityEnterView.R);
                                    boolean z2 = f11.a;
                                    int max = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                    int min = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                    chatActivityEnterView.r1(chatActivityEnterView.F0.getText().subSequence(0, Math.min(max, min)), chatActivityEnterView.F0.getText().subSequence(Math.max(max, min), chatActivityEnterView.F0.getText().length()), htmlText);
                                    return true;
                                }
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(uj9.f(z, false));
                                pv3.m(spannableStringBuilder, chatActivityEnterView.F0.getPaint().getFontMetricsInt(), false, null, 0);
                                hm[] hmVarArr = (hm[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), hm.class);
                                if (hmVarArr != null) {
                                    for (hm hmVar : hmVarArr) {
                                        hmVar.applyFontMetrics(chatActivityEnterView.F0.getPaint().getFontMetricsInt(), wl.f());
                                    }
                                }
                                int max2 = Math.max(0, chatActivityEnterView.F0.getSelectionStart());
                                int min2 = Math.min(chatActivityEnterView.F0.getText().length(), chatActivityEnterView.F0.getSelectionEnd());
                                q19[] q19VarArr = (q19[]) chatActivityEnterView.F0.getText().getSpans(max2, min2, q19.class);
                                if (q19VarArr == null || q19VarArr.length <= 0) {
                                    r19.a(spannableStringBuilder);
                                } else {
                                    q19[] q19VarArr2 = (q19[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), q19.class);
                                    for (int i3 = 0; i3 < q19VarArr2.length; i3++) {
                                        spannableStringBuilder.removeSpan(q19VarArr2[i3]);
                                        spannableStringBuilder.removeSpan(q19VarArr2[i3].a);
                                    }
                                }
                                tx1 tx1Var = chatActivityEnterView.F0;
                                tx1Var.setText(tx1Var.getText().replace(max2, min2, spannableStringBuilder));
                                chatActivityEnterView.F0.setSelection(Math.min(max2 + spannableStringBuilder.length(), chatActivityEnterView.F0.getText().length()));
                                return true;
                            }
                        }
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // wy1, org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ChatActivityEnterView chatActivityEnterView = this.l2;
        if (!chatActivityEnterView.A()) {
            if (motionEvent.getAction() == 0 && chatActivityEnterView.O3 != null) {
                yob.l(this, 36, aob.mg, chatActivityEnterView.K4);
                chatActivityEnterView.O3.X0();
            }
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            this.i2 = motionEvent.getX();
            this.j2 = motionEvent.getY();
            this.k2 = true;
        } else if (this.k2 && motionEvent.getAction() == 2) {
            if (Math.abs(motionEvent.getX() - this.i2) > hl.e || Math.abs(motionEvent.getY() - this.j2) > hl.e) {
                this.k2 = false;
            }
        } else if (this.k2) {
            if (chatActivityEnterView.O3 != null) {
                yob.l(this, 36, aob.mg, chatActivityEnterView.K4);
                chatActivityEnterView.O3.X0();
            }
            tx1 tx1Var = chatActivityEnterView.F0;
            if (tx1Var != null && !hl.E3(tx1Var)) {
                chatActivityEnterView.F0.clearFocus();
                chatActivityEnterView.F0.requestFocus();
            }
        }
        return this.k2;
    }

    @Override // wy1, cu3
    public final void setOffsetY(float f) {
        super.setOffsetY(f);
        this.l2.n2.invalidate();
    }
}
