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
import jg.g;
import n2.n0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a8;
import org.telegram.messenger.fp;
import org.telegram.messenger.g0;
import org.telegram.messenger.gp;
import org.telegram.messenger.hd;
import org.telegram.messenger.i6;
import org.telegram.messenger.ic;
import org.telegram.messenger.ij;
import org.telegram.messenger.k5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t0;
import org.telegram.messenger.t10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.mu0;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.x70;
import org.telegram.ui.Components.zg0;
import wg.s;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
    public ij M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public n0 U;
    public ImageReceiver[] a;
    public w8[] b;
    public final q1 c;
    public ImageReceiver d;
    public zg0 e;
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

    public c(q1 q1Var) {
        this.c = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        StaticLayout staticLayout;
        int i7;
        ij ijVar = this.M;
        if (ijVar != null && ijVar.x3()) {
            n0 n0Var = this.U;
            q1 q1Var = this.c;
            if (n0Var == null) {
                this.U = new n0(q1Var);
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
                        clickableSpanArr[0].onClick(q1Var);
                        return true;
                    }
                    x70 x70Var = new x70(clickableSpanArr[0], null, x10, y10, 0);
                    this.U.b(x70Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        r70 b10 = x70Var.b();
                        b10.e(this.t, spanStart, this.T, this.S);
                        this.t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        return true;
                    }
                }
                this.U.f(true);
                q1Var.invalidate();
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
                    if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().x1(q1Var, this.O);
                    }
                    q1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    ij ijVar2 = this.M;
                    if (ijVar2 != null && ijVar2.k != null) {
                        s.d(ijVar2, new ii.c(ijVar2, 27), new pg.c(1));
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
    public final void b(Canvas canvas, int i7, int i10, f6 f6Var) {
        float f10;
        int f11;
        int i11;
        ij ijVar = this.M;
        if (ijVar == null || !ijVar.x3()) {
            return;
        }
        y yVar = this.L;
        q1 q1Var = this.c;
        ic icVar = null;
        if (yVar == null) {
            int x02 = k6.x0(null, k6.i6, false);
            this.K = x02;
            y a02 = k6.a0(x02, 12, 12);
            this.L = a02;
            a02.setCallback(q1Var);
        }
        this.y.setColor(k6.o2.getColor());
        this.z.setColor(k6.x0(null, k6.q5, false));
        this.A.setColor(k6.o2.getColor());
        if (this.M.Q3()) {
            TextPaint textPaint = this.x;
            int i12 = k6.Lb;
            textPaint.setColor(k6.w0(i12, f6Var));
            this.B.setColor(k6.w0(i12, f6Var));
            this.C.setColor(k6.w0(k6.Ob, f6Var));
        } else {
            TextPaint textPaint2 = this.x;
            int i13 = k6.yd;
            textPaint2.setColor(k6.w0(i13, f6Var));
            this.B.setColor(k6.w0(i13, f6Var));
            this.C.setColor(k6.w0(k6.Id, f6Var));
        }
        if (this.N) {
            this.B.setColor(k6.w0(k6.Tk, f6Var));
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
        int C = k5.C(6.0f, this.o, L5);
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
                    if (this.M.Q3()) {
                        f11 = k6.w0(k6.Lb, f6Var);
                    } else {
                        int e10 = t10.e(user);
                        if (e10 < 7) {
                            f11 = k6.w0(k6.r8[e10], f6Var);
                        } else {
                            gp gpVar = qp.s1(p10.s0).q4;
                            fp d = gpVar == null ? icVar : gpVar.d(e10);
                            f11 = d != 0 ? d.f() : k6.w0(k6.r8[0], f6Var);
                        }
                    }
                    int i19 = this.O;
                    i11 = (i19 < 0 || i19 != i18) ? i15 : f11;
                    this.x.setColor(f11);
                    this.C.setColor(f11);
                    this.C.setAlpha(25);
                    this.a[i18].h(canvas, icVar);
                    CharSequence charSequence = this.f[i18];
                    int i20 = i17;
                    canvas.drawText(charSequence, 0, charSequence.length(), g0.L(30.0f), g0.L(16.0f), this.x);
                    this.G.set(0.0f, 0.0f, this.h[i18] + g0.L(40.0f), g0.L(24.0f));
                    canvas.drawRoundRect(this.G, g0.L(12.0f), g0.L(12.0f), this.C);
                    float f19 = i20;
                    this.j[i18].set(i20, C, (int) (this.G.width() + f19), g0.L(24.0f) + C);
                    canvas.translate(this.G.width() + g0.L(f10), 0.0f);
                    i17 = (int) (this.G.width() + g0.L(f10) + f19);
                    i18++;
                    boolean[] zArr3 = this.k;
                    if (i18 >= zArr3.length || this.i[i18] || !zArr3[i18]) {
                        break;
                    }
                    i15 = i11;
                    icVar = null;
                }
                canvas.restore();
                canvas.translate(0.0f, g0.L(30.0f));
                C += g0.L(30.0f);
                i14 = i18;
                i15 = i11;
                icVar = null;
                f16 = f10;
            } else {
                i14++;
                icVar = null;
            }
        }
        canvas.translate(0.0f, g0.L(f16));
        canvas.save();
        canvas.translate(this.r / 2.0f, 0.0f);
        this.u.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (this.O >= 0) {
            int r12 = k6.r1(k6.I.q() ? 0.12f : 0.1f, i15);
            if (this.K != r12) {
                y yVar2 = this.L;
                this.K = r12;
                k6.H1(yVar2, r12, true);
            }
            this.L.setBounds(this.j[this.O]);
            this.L.setCallback(q1Var);
        }
        n0 n0Var = this.U;
        if (n0Var == null || !n0Var.h(canvas)) {
            return;
        }
        q1Var.invalidate();
    }

    public final void c(boolean z9) {
        ij ijVar = this.M;
        if (ijVar == null || !ijVar.x3() || this.L == null) {
            return;
        }
        n0 n0Var = this.U;
        if (n0Var != null) {
            n0Var.f(true);
        }
        q1 q1Var = this.c;
        if (!z9) {
            this.L.setState(StateSet.NOTHING);
            q1Var.invalidate();
        } else {
            this.L.setCallback(new a5.b(this, 10));
            this.L.setState(this.J);
            q1Var.invalidate();
        }
    }

    public final void d(int i7, ij ijVar) {
        float f10;
        this.M = null;
        this.s = null;
        this.t = null;
        this.u = null;
        int i10 = 0;
        this.l = 0;
        this.m = 0;
        this.N = false;
        if (ijVar.x3()) {
            this.M = ijVar;
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
                imageReceiver.z1 = true;
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
                this.b = new w8[10];
                this.k = new boolean[10];
                int i11 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.a;
                    if (i11 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i11] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver2 = this.a[i11];
                    imageReceiver2.z1 = true;
                    imageReceiver2.J0(g0.L(12.0f));
                    this.b[i11] = new w8((f6) null);
                    this.b[i11].u(g0.L(18.0f));
                    this.j[i11] = new Rect();
                    i11++;
                }
            }
            this.d.u0 = false;
            if (this.e == null) {
                this.e = new zg0(org.telegram.messenger.beta.R.raw.giveaway_results, g0.L(120.0f), g0.L(120.0f));
            }
            this.d.w0(this.e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) ijVar.k.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.b = (w8[]) Arrays.copyOf(this.b, size);
                this.k = Arrays.copyOf(this.k, size);
                this.f = (CharSequence[]) Arrays.copyOf(this.f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.i = Arrays.copyOf(this.i, size);
                this.j = (Rect[]) Arrays.copyOf(this.j, size);
                this.g = (TLRPC.User[]) Arrays.copyOf(this.g, size);
                for (int i12 = length - 1; i12 < size; i12++) {
                    this.a[i12] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver3 = this.a[i12];
                    imageReceiver3.z1 = true;
                    imageReceiver3.J0(g0.L(12.0f));
                    this.b[i12] = new w8((f6) null);
                    this.b[i12].u(g0.L(18.0f));
                    this.j[i12] = new Rect();
                }
            }
            int L = g0.L(90.0f);
            int L2 = g0.L(230.0f);
            SpannableStringBuilder X2 = g0.X2(hd.M0(2131753386, "BoostingGiveawayResultsMsgWinnersSelected"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(X2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, X2.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder S2 = g0.S2(hd.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinnersTitle"), k6.Uc, 0, new b(this, ijVar, tL_messageMediaGiveawayResults, i10), null);
            this.R.append((CharSequence) g0.K2(S2, g0.X2("**" + tL_messageMediaGiveawayResults.winners_count + "**"), "%1$d"));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder X22 = g0.X2(hd.K0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinners"));
            this.R.append((CharSequence) X22);
            this.R.setSpan(new RelativeSizeSpan(1.05f), S2.length() + 2, X22.length() + S2.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) g0.X2(hd.G(tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), "BoostingGiveawayResultsMsgAllAndMoreWinners", new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            boolean z9 = (tL_messageMediaGiveawayResults.flags & 32) != 0;
            this.N = z9;
            if (z9) {
                spannableStringBuilder2.append((CharSequence) hd.H(' ', "BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) hd.M0(2131753388, null));
            }
            TextPaint textPaint2 = this.y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float L3 = g0.L(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.s = mu0.c(spannableStringBuilder, textPaint2, L2, alignment, L3, truncateAt, L2, 10, true);
            this.t = mu0.c(this.R, this.y, L2, alignment, g0.L(2.0f), truncateAt, L2, 10, true);
            this.u = mu0.c(spannableStringBuilder2, this.y, L2, alignment, g0.L(3.0f), truncateAt, L2, 10, true);
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
                    this.p = g.h(t0.b, org.telegram.messenger.beta.R.drawable.filled_giveaway_stars);
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
                if (qp.s1(p10.s0).a2(l11) != null) {
                    arrayList.add(l11);
                }
            }
            int i14 = 0;
            float f15 = 0.0f;
            while (i14 < arrayList.size()) {
                Long l12 = (Long) arrayList.get(i14);
                long longValue = l12.longValue();
                TLRPC.User a22 = qp.s1(p10.s0).a2(l12);
                if (a22 != null) {
                    this.k[i14] = true;
                    this.g[i14] = a22;
                    f10 = f14;
                    this.f[i14] = TextUtils.ellipsize(i6.m(t10.p(a22), this.x.getFontMetricsInt(), false, null, 0), this.x, 0.8f * f11, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.x;
                    CharSequence charSequence = this.f[i14];
                    fArr[i14] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L5 = this.h[i14] + g0.L(40.0f);
                    f15 += L5;
                    if (i14 > 0) {
                        boolean[] zArr = this.i;
                        boolean z10 = f15 > 0.9f * f11;
                        zArr[i14] = z10;
                        if (z10) {
                            this.l = g0.L(30.0f) + this.l;
                            f15 = L5;
                        }
                    } else {
                        this.i[i14] = false;
                    }
                    this.b[i14].r(a22);
                    this.a[i14].i0(a22, this.b[i14], null);
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
