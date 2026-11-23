package zg;

import android.R;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.Arrays;
import n2.o0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.cp;
import org.telegram.messenger.dp;
import org.telegram.messenger.f3;
import org.telegram.messenger.g0;
import org.telegram.messenger.gj;
import org.telegram.messenger.hc;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.t0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.r1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.zu0;
import ug.z;
import wg.s;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class c {
    public TextPaint A;
    public Paint B;
    public Paint C;
    public Paint D;
    public Paint E;
    public RectF F;
    public RectF G;
    public Rect H;
    public Rect I;
    public int[] J;
    public int K;
    public y L;
    public gj M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public o0 U;
    public ImageReceiver[] a;
    public b9[] b;
    public final r1 c;
    public ImageReceiver d;
    public oh0 e;
    public CharSequence[] f;
    public TLRPC.User[] g;
    public float[] h;
    public boolean[] i;
    public Rect[] j;
    public boolean[] k;
    public int n;
    public int o;
    public Drawable p;
    public String q;
    public int r;
    public StaticLayout s;
    public StaticLayout t;
    public StaticLayout u;
    public TextPaint v;
    public TextPaint w;
    public TextPaint x;
    public TextPaint y;
    public TextPaint z;
    public int l = 0;
    public int m = 0;
    public int O = -1;
    public boolean P = false;
    public boolean Q = false;

    public c(r1 r1Var) {
        this.c = r1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i7;
        gj gjVar = this.M;
        if (gjVar != null && gjVar.w3()) {
            o0 o0Var = this.U;
            r1 r1Var = this.c;
            if (o0Var == null) {
                this.U = new o0(r1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.t) != null && (i7 = y10 - this.S) > 0) {
                int offsetForHorizontal = this.t.getOffsetForHorizontal(staticLayout.getLineForVertical(i7 - g0.L(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.f(true);
                        clickableSpanArr[0].onClick(r1Var);
                        return true;
                    }
                    n80 n80Var = new n80(clickableSpanArr[0], null, x10, y10, 0);
                    this.U.b(n80Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        h80 b10 = n80Var.b();
                        b10.e(this.t, spanStart, this.T, this.S);
                        this.t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return true;
                    }
                }
                this.U.f(true);
                r1Var.invalidate();
            }
            if (action == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.j;
                    if (i10 < rectArr.length) {
                        if (rectArr[i10].contains(x10, y10)) {
                            this.O = i10;
                            this.L.setHotspot(x10, y10);
                            this.P = true;
                            c(true);
                            return true;
                        }
                        i10++;
                    } else if (this.I.contains(x10, y10)) {
                        this.Q = true;
                        return true;
                    }
                }
            } else if (action == 1) {
                if (this.P) {
                    if (r1Var.getDelegate() != null) {
                        r1Var.getDelegate().K1(r1Var, this.O);
                    }
                    r1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    gj gjVar2 = this.M;
                    if (gjVar2 != null && gjVar2.k != null) {
                        s.d(gjVar2, new z(gjVar2, 3), new pg.c(1));
                        return false;
                    }
                }
            } else if (action != 2 && action == 3) {
                this.U.f(true);
                if (this.P) {
                    c(false);
                }
                this.P = false;
                this.Q = false;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(Canvas canvas, int i7, int i10, h6 h6Var) {
        float f10;
        int f11;
        int i11;
        gj gjVar = this.M;
        if (gjVar == null || !gjVar.w3()) {
            return;
        }
        y yVar = this.L;
        r1 r1Var = this.c;
        hc hcVar = null;
        if (yVar == null) {
            int x02 = m6.x0(null, m6.i6, false);
            this.K = x02;
            y a02 = m6.a0(x02, 12, 12);
            this.L = a02;
            a02.setCallback(r1Var);
        }
        this.y.setColor(m6.o2.getColor());
        this.z.setColor(m6.x0(null, m6.q5, false));
        this.A.setColor(m6.o2.getColor());
        if (this.M.P3()) {
            TextPaint textPaint = this.x;
            int i12 = m6.Ob;
            textPaint.setColor(m6.w0(i12, h6Var));
            this.B.setColor(m6.w0(i12, h6Var));
            this.C.setColor(m6.w0(m6.Rb, h6Var));
        } else {
            TextPaint textPaint2 = this.x;
            int i13 = m6.Bd;
            textPaint2.setColor(m6.w0(i13, h6Var));
            this.B.setColor(m6.w0(i13, h6Var));
            this.C.setColor(m6.w0(m6.Ld, h6Var));
        }
        if (this.N) {
            this.B.setColor(m6.w0(m6.Wk, h6Var));
        }
        canvas.save();
        int L = i10 - g0.L(4.0f);
        float f12 = L;
        canvas.translate(f12, i7);
        this.I.set(L, i7, this.m + L, this.l + i7);
        canvas.saveLayer(0.0f, 0.0f, this.m, this.l, this.D, 31);
        this.d.h(canvas, null);
        float f13 = this.m / 2.0f;
        float L2 = g0.L(106.0f);
        int L3 = g0.L(12.0f) + this.H.width();
        int L4 = g0.L(10.0f) + this.H.height();
        this.F.set(f13 - ((g0.L(2.0f) + L3) / 2.0f), L2 - ((g0.L(2.0f) + L4) / 2.0f), ((g0.L(2.0f) + L3) / 2.0f) + f13, ((g0.L(2.0f) + L4) / 2.0f) + L2);
        canvas.drawRoundRect(this.F, g0.L(11.0f), g0.L(11.0f), this.E);
        float f14 = L3 / 2.0f;
        float f15 = L4 / 2.0f;
        this.F.set(f13 - f14, L2 - f15, f13 + f14, L2 + f15);
        canvas.drawRoundRect(this.F, g0.L(10.0f), g0.L(10.0f), this.B);
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setBounds(g0.L(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - g0.L(6.96f), g0.L(21.24f) + ((int) this.F.left), g0.L(6.96f) + ((int) this.F.centerY()));
            this.p.draw(canvas);
        }
        canvas.drawText(this.q, this.F.centerX() + g0.L(this.N ? 8.0f : 0.0f), this.F.centerY() + g0.L(4.0f), this.N ? this.w : this.v);
        canvas.restore();
        canvas.translate(0.0f, g0.L(128.0f));
        int L5 = g0.L(128.0f) + i7;
        this.S = this.n + L5;
        this.T = (int) ((this.r / 2.0f) + f12);
        canvas.save();
        canvas.translate(this.r / 2.0f, 0.0f);
        this.s.draw(canvas);
        canvas.translate(0.0f, this.n);
        this.t.draw(canvas);
        canvas.restore();
        float f16 = 6.0f;
        canvas.translate(0.0f, g0.L(6.0f) + this.o);
        int C = f3.C(6.0f, this.o, L5);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            boolean[] zArr = this.k;
            if (i14 >= zArr.length) {
                break;
            }
            if (zArr[i14]) {
                canvas.save();
                int i16 = i14;
                float f17 = 0.0f;
                while (true) {
                    f10 = f16;
                    f17 += this.h[i16] + g0.L(40.0f);
                    i16++;
                    boolean[] zArr2 = this.k;
                    if (i16 >= zArr2.length || this.i[i16] || !zArr2[i16]) {
                        break;
                    } else {
                        f16 = f10;
                    }
                }
                float f18 = f13 - (f17 / 2.0f);
                canvas.translate(f18, 0.0f);
                int i17 = ((int) f18) + L;
                int i18 = i14;
                while (true) {
                    TLRPC.User user = this.g[i18];
                    if (this.M.P3()) {
                        f11 = m6.w0(m6.Ob, h6Var);
                    } else {
                        int f19 = p10.f(user);
                        if (f19 < 7) {
                            f11 = m6.w0(m6.r8[f19], h6Var);
                        } else {
                            dp dpVar = np.u1(k10.t0).t4;
                            cp d = dpVar == null ? hcVar : dpVar.d(f19);
                            f11 = d != 0 ? d.f() : m6.w0(m6.r8[0], h6Var);
                        }
                    }
                    int i19 = this.O;
                    i11 = (i19 < 0 || i19 != i18) ? i15 : f11;
                    this.x.setColor(f11);
                    this.C.setColor(f11);
                    this.C.setAlpha(25);
                    this.a[i18].h(canvas, hcVar);
                    CharSequence charSequence = this.f[i18];
                    int i20 = i17;
                    canvas.drawText(charSequence, 0, charSequence.length(), g0.L(30.0f), g0.L(16.0f), this.x);
                    this.G.set(0.0f, 0.0f, this.h[i18] + g0.L(40.0f), g0.L(24.0f));
                    canvas.drawRoundRect(this.G, g0.L(12.0f), g0.L(12.0f), this.C);
                    float f20 = i20;
                    this.j[i18].set(i20, C, (int) (this.G.width() + f20), g0.L(24.0f) + C);
                    canvas.translate(this.G.width() + g0.L(f10), 0.0f);
                    i17 = (int) (this.G.width() + g0.L(f10) + f20);
                    i18++;
                    boolean[] zArr3 = this.k;
                    if (i18 >= zArr3.length || this.i[i18] || !zArr3[i18]) {
                        break;
                    }
                    i15 = i11;
                    hcVar = null;
                }
                canvas.restore();
                canvas.translate(0.0f, g0.L(30.0f));
                C += g0.L(30.0f);
                i14 = i18;
                i15 = i11;
                hcVar = null;
                f16 = f10;
            } else {
                i14++;
                hcVar = null;
            }
        }
        canvas.translate(0.0f, g0.L(f16));
        canvas.save();
        canvas.translate(this.r / 2.0f, 0.0f);
        this.u.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (this.O >= 0) {
            int r12 = m6.r1(m6.I.q() ? 0.12f : 0.1f, i15);
            if (this.K != r12) {
                y yVar2 = this.L;
                this.K = r12;
                m6.H1(yVar2, r12, true);
            }
            this.L.setBounds(this.j[this.O]);
            this.L.setCallback(r1Var);
        }
        o0 o0Var = this.U;
        if (o0Var == null || !o0Var.h(canvas)) {
            return;
        }
        r1Var.invalidate();
    }

    public final void c(boolean z10) {
        gj gjVar = this.M;
        if (gjVar == null || !gjVar.w3() || this.L == null) {
            return;
        }
        o0 o0Var = this.U;
        if (o0Var != null) {
            o0Var.f(true);
        }
        r1 r1Var = this.c;
        if (!z10) {
            this.L.setState(StateSet.NOTHING);
            r1Var.invalidate();
        } else {
            this.L.setCallback(new a5.b(this, 10));
            this.L.setState(this.J);
            r1Var.invalidate();
        }
    }

    public final void d(int i7, gj gjVar) {
        float f10;
        this.M = null;
        this.s = null;
        this.t = null;
        this.u = null;
        int i10 = 0;
        this.l = 0;
        this.m = 0;
        this.N = false;
        if (gjVar.w3()) {
            this.M = gjVar;
            if (this.v == null) {
                this.v = new TextPaint(1);
                this.w = new TextPaint(1);
                this.x = new TextPaint(1);
                this.y = new TextPaint(1);
                this.z = new TextPaint(1);
                this.A = new TextPaint(1);
                this.B = new Paint(1);
                this.C = new Paint(1);
                this.D = new Paint();
                this.E = new Paint();
                this.F = new RectF();
                this.G = new RectF();
                this.H = new Rect();
                this.I = new Rect();
                this.J = new int[]{R.attr.state_enabled, R.attr.state_pressed};
                this.f = new CharSequence[10];
                this.g = new TLRPC.User[10];
                this.h = new float[10];
                this.i = new boolean[10];
                this.j = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.c);
                this.d = imageReceiver;
                imageReceiver.A1 = true;
                Paint paint = this.E;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTypeface(g0.o());
                this.v.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTextSize(g0.L(12.0f));
                TextPaint textPaint = this.v;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.w.setTypeface(g0.o());
                this.w.setTextSize(g0.L(12.0f));
                this.w.setTextAlign(align);
                this.w.setColor(-1);
                this.x.setTypeface(g0.o());
                this.x.setTextSize(g0.L(13.0f));
                this.A.setTextSize(g0.L(13.0f));
                this.y.setTextSize(g0.L(14.0f));
                this.z.setTextSize(g0.L(14.0f));
                this.z.setTextAlign(align);
            }
            if (this.a == null) {
                this.a = new ImageReceiver[10];
                this.b = new b9[10];
                this.k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver2 = this.a[i11];
                    imageReceiver2.A1 = true;
                    imageReceiver2.J0(g0.L(12.0f));
                    this.b[i11] = new b9((h6) null);
                    this.b[i11].u(g0.L(18.0f));
                    this.j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.v0 = false;
            if (this.e == null) {
                this.e = new oh0(org.telegram.messenger.beta.R.raw.giveaway_results, g0.L(120.0f), g0.L(120.0f));
            }
            this.d.w0(this.e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) gjVar.k.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.b = (b9[]) Arrays.copyOf(this.b, size);
                this.k = Arrays.copyOf(this.k, size);
                this.f = (CharSequence[]) Arrays.copyOf(this.f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.i = Arrays.copyOf(this.i, size);
                this.j = (Rect[]) Arrays.copyOf(this.j, size);
                this.g = (TLRPC.User[]) Arrays.copyOf(this.g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.a[i12] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver3 = this.a[i12];
                    imageReceiver3.A1 = true;
                    imageReceiver3.J0(g0.L(12.0f));
                    this.b[i12] = new b9((h6) null);
                    this.b[i12].u(g0.L(18.0f));
                    this.j[i12] = new Rect();
                }
            }
            int L = g0.L(90.0f);
            int L2 = g0.L(230.0f);
            SpannableStringBuilder W2 = g0.W2(hd.N0(2131753383, "BoostingGiveawayResultsMsgWinnersSelected"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(W2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, W2.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder R2 = g0.R2(hd.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinnersTitle"), m6.Xc, 0, new b(this, gjVar, tL_messageMediaGiveawayResults, i10), null);
            this.R.append((CharSequence) g0.K2(R2, g0.W2("**" + tL_messageMediaGiveawayResults.winners_count + "**"), "%1$d"));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder W22 = g0.W2(hd.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinners"));
            this.R.append((CharSequence) W22);
            this.R.setSpan(new RelativeSizeSpan(1.05f), R2.length() + 2, W22.length() + R2.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) g0.W2(hd.G(tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), "BoostingGiveawayResultsMsgAllAndMoreWinners", new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            boolean z10 = (tL_messageMediaGiveawayResults.flags & 32) != 0;
            this.N = z10;
            if (z10) {
                spannableStringBuilder2.append((CharSequence) hd.H(' ', "BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) hd.N0(2131753385, null));
            }
            TextPaint textPaint2 = this.y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float L3 = g0.L(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.s = zu0.c(spannableStringBuilder, textPaint2, L2, alignment, L3, truncateAt, L2, 10, true);
            this.t = zu0.c(this.R, this.y, L2, alignment, g0.L(2.0f), truncateAt, L2, 10, true);
            this.u = zu0.c(spannableStringBuilder2, this.y, L2, alignment, g0.L(3.0f), truncateAt, L2, 10, true);
            int max = Math.max(i7, L2);
            this.r = max - L2;
            float f11 = max;
            float f12 = L;
            float f13 = f12 / 2.0f;
            this.d.y0((f11 / 2.0f) - f13, g0.L(70.0f) - f13, f12, f12);
            StaticLayout staticLayout = this.s;
            int L4 = g0.L(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.n = L4;
            StaticLayout staticLayout2 = this.t;
            this.o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L4;
            StaticLayout staticLayout3 = this.u;
            int lineBottom = this.l + this.o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.l = lineBottom;
            this.l = g0.L(128.0f) + lineBottom;
            this.m = max;
            if (this.N) {
                if (this.p == null) {
                    this.p = i5.c.g(t0.b, org.telegram.messenger.beta.R.drawable.filled_giveaway_stars);
                }
                this.q = hd.E((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.p = null;
                this.q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            float f14 = 20.0f;
            if (this.N) {
                Rect rect = this.H;
                rect.right = g0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.k, false);
            this.l = g0.L(30.0f) + this.l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i13 = 0;
            while (i13 < size2) {
                Long l10 = arrayList2.get(i13);
                i13++;
                Long l11 = l10;
                if (np.u1(k10.t0).c2(l11) != null) {
                    arrayList.add(l11);
                }
            }
            int i14 = 0;
            float f15 = 0.0f;
            while (i14 < arrayList.size()) {
                Long l12 = (Long) arrayList.get(i14);
                long longValue = l12.longValue();
                TLRPC.User c22 = np.u1(k10.t0).c2(l12);
                if (c22 != null) {
                    this.k[i14] = true;
                    this.g[i14] = c22;
                    f10 = f14;
                    this.f[i14] = TextUtils.ellipsize(j6.m(p10.q(c22), this.x.getFontMetricsInt(), false, null, 0), this.x, 0.8f * f11, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.x;
                    CharSequence charSequence = this.f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L5 = this.h[i14] + g0.L(40.0f);
                    f15 += L5;
                    if (i14 > 0) {
                        boolean[] zArr = this.i;
                        boolean z11 = f15 > 0.9f * f11;
                        zArr[i14] = z11;
                        if (z11) {
                            this.l = g0.L(30.0f) + this.l;
                            f15 = L5;
                        }
                    } else {
                        this.i[i14] = false;
                    }
                    this.b[i14].r(c22);
                    this.a[i14].i0(c22, this.b[i14], null);
                    this.a[i14].y0(0.0f, 0.0f, g0.L(24.0f), g0.L(24.0f));
                } else {
                    f10 = f14;
                    this.g[i14] = null;
                    this.k[i14] = false;
                    this.f[i14] = "";
                    this.i[i14] = false;
                    this.h[i14] = g0.L(f10);
                    this.b[i14].k(longValue, "", "", null);
                }
                i14++;
                f14 = f10;
            }
        }
    }
}
