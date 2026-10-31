package pg;

import ag.l;
import ag.z0;
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
import bi.s0;
import java.util.ArrayList;
import java.util.Arrays;
import mg.k0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.i0;
import org.telegram.messenger.jc;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.kp;
import org.telegram.messenger.lp;
import org.telegram.messenger.m5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.r8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
    public jj M;
    public boolean N;
    public SpannableStringBuilder R;
    public int S;
    public int T;
    public ji.a U;
    public ImageReceiver[] a;
    public r8[] b;
    public final q1 c;
    public ImageReceiver d;
    public bi0 e;
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
        int i10;
        jj jjVar = this.M;
        if (jjVar != null && jjVar.w3()) {
            ji.a aVar = this.U;
            q1 q1Var = this.c;
            if (aVar == null) {
                this.U = new ji.a(q1Var);
            }
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if ((action == 1 || action == 0) && this.R != null && (staticLayout = this.t) != null && (i10 = y3 - this.S) > 0) {
                int offsetForHorizontal = this.t.getOffsetForHorizontal(staticLayout.getLineForVertical(i10 - i0.L(10.0f)), x10 - this.T);
                ClickableSpan[] clickableSpanArr = (ClickableSpan[]) this.R.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
                if (clickableSpanArr.length != 0) {
                    if (action == 1) {
                        this.U.f(true);
                        clickableSpanArr[0].onClick(q1Var);
                        return true;
                    }
                    q80 q80Var = new q80(clickableSpanArr[0], null, x10, y3, 0);
                    this.U.b(q80Var, null);
                    try {
                        int spanStart = this.R.getSpanStart(clickableSpanArr[0]);
                        k80 b10 = q80Var.b();
                        b10.e(this.t, spanStart, this.T, this.S);
                        this.t.getSelectionPath(spanStart, this.R.getSpanEnd(clickableSpanArr[0]), b10);
                        return true;
                    } catch (Exception e) {
                        f8.g(e, true);
                        return true;
                    }
                }
                this.U.f(true);
                q1Var.invalidate();
            }
            if (action == 0) {
                int i11 = 0;
                while (true) {
                    Rect[] rectArr = this.j;
                    if (i11 < rectArr.length) {
                        if (rectArr[i11].contains(x10, y3)) {
                            this.O = i11;
                            this.L.setHotspot(x10, y3);
                            this.P = true;
                            c(true);
                            return true;
                        }
                        i11++;
                    } else if (this.I.contains(x10, y3)) {
                        this.Q = true;
                        return true;
                    }
                }
            } else if (action == 1) {
                if (this.P) {
                    if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().s1(q1Var, this.O);
                    }
                    q1Var.playSoundEffect(0);
                    c(false);
                    this.P = false;
                }
                if (this.Q) {
                    this.Q = false;
                    jj jjVar2 = this.M;
                    if (jjVar2 != null && jjVar2.k != null) {
                        k0.d(jjVar2, new l(jjVar2, 18), new z0(3));
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
    public final void b(Canvas canvas, int i10, int i11, p6 p6Var) {
        float f7;
        int f10;
        int i12;
        jj jjVar = this.M;
        if (jjVar == null || !jjVar.w3()) {
            return;
        }
        y yVar = this.L;
        q1 q1Var = this.c;
        jc jcVar = null;
        if (yVar == null) {
            int x02 = t6.x0(null, t6.i6, false);
            this.K = x02;
            y a02 = t6.a0(x02, 12, 12);
            this.L = a02;
            a02.setCallback(q1Var);
        }
        this.y.setColor(t6.o2.getColor());
        this.z.setColor(t6.x0(null, t6.q5, false));
        this.A.setColor(t6.o2.getColor());
        if (this.M.P3()) {
            TextPaint textPaint = this.x;
            int i13 = t6.Lb;
            textPaint.setColor(t6.w0(i13, p6Var));
            this.B.setColor(t6.w0(i13, p6Var));
            this.C.setColor(t6.w0(t6.Ob, p6Var));
        } else {
            TextPaint textPaint2 = this.x;
            int i14 = t6.yd;
            textPaint2.setColor(t6.w0(i14, p6Var));
            this.B.setColor(t6.w0(i14, p6Var));
            this.C.setColor(t6.w0(t6.Id, p6Var));
        }
        if (this.N) {
            this.B.setColor(t6.w0(t6.Tk, p6Var));
        }
        canvas.save();
        int L = i11 - i0.L(4.0f);
        float f11 = L;
        canvas.translate(f11, i10);
        this.I.set(L, i10, this.m + L, this.l + i10);
        canvas.saveLayer(0.0f, 0.0f, this.m, this.l, this.D, 31);
        this.d.h(canvas, null);
        float f12 = this.m / 2.0f;
        float L2 = i0.L(106.0f);
        int L3 = i0.L(12.0f) + this.H.width();
        int L4 = i0.L(10.0f) + this.H.height();
        this.F.set(f12 - ((i0.L(2.0f) + L3) / 2.0f), L2 - ((i0.L(2.0f) + L4) / 2.0f), ((i0.L(2.0f) + L3) / 2.0f) + f12, ((i0.L(2.0f) + L4) / 2.0f) + L2);
        canvas.drawRoundRect(this.F, i0.L(11.0f), i0.L(11.0f), this.E);
        float f13 = L3 / 2.0f;
        float f14 = L4 / 2.0f;
        this.F.set(f12 - f13, L2 - f14, f12 + f13, L2 + f14);
        canvas.drawRoundRect(this.F, i0.L(10.0f), i0.L(10.0f), this.B);
        Drawable drawable = this.p;
        if (drawable != null) {
            drawable.setBounds(i0.L(5.0f) + ((int) this.F.left), ((int) this.F.centerY()) - i0.L(6.96f), i0.L(21.24f) + ((int) this.F.left), i0.L(6.96f) + ((int) this.F.centerY()));
            this.p.draw(canvas);
        }
        canvas.drawText(this.q, this.F.centerX() + i0.L(this.N ? 8.0f : 0.0f), this.F.centerY() + i0.L(4.0f), this.N ? this.w : this.v);
        canvas.restore();
        canvas.translate(0.0f, i0.L(128.0f));
        int L5 = i0.L(128.0f) + i10;
        this.S = this.n + L5;
        this.T = (int) ((this.r / 2.0f) + f11);
        canvas.save();
        canvas.translate(this.r / 2.0f, 0.0f);
        this.s.draw(canvas);
        canvas.translate(0.0f, this.n);
        this.t.draw(canvas);
        canvas.restore();
        float f15 = 6.0f;
        canvas.translate(0.0f, i0.L(6.0f) + this.o);
        int C = m5.C(6.0f, this.o, L5);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            boolean[] zArr = this.k;
            if (i15 >= zArr.length) {
                break;
            }
            if (zArr[i15]) {
                canvas.save();
                int i17 = i15;
                float f16 = 0.0f;
                while (true) {
                    f7 = f15;
                    f16 += this.h[i17] + i0.L(40.0f);
                    i17++;
                    boolean[] zArr2 = this.k;
                    if (i17 >= zArr2.length || this.i[i17] || !zArr2[i17]) {
                        break;
                    } else {
                        f15 = f7;
                    }
                }
                float f17 = f12 - (f16 / 2.0f);
                canvas.translate(f17, 0.0f);
                int i18 = ((int) f17) + L;
                int i19 = i15;
                while (true) {
                    TLRPC.User user = this.g[i19];
                    if (this.M.P3()) {
                        f10 = t6.w0(t6.Lb, p6Var);
                    } else {
                        int e = h20.e(user);
                        if (e < 7) {
                            f10 = t6.w0(t6.r8[e], p6Var);
                        } else {
                            lp lpVar = vp.r1(d20.s0).r4;
                            kp d = lpVar == null ? jcVar : lpVar.d(e);
                            f10 = d != 0 ? d.f() : t6.w0(t6.r8[0], p6Var);
                        }
                    }
                    int i20 = this.O;
                    i12 = (i20 < 0 || i20 != i19) ? i16 : f10;
                    this.x.setColor(f10);
                    this.C.setColor(f10);
                    this.C.setAlpha(25);
                    this.a[i19].h(canvas, jcVar);
                    CharSequence charSequence = this.f[i19];
                    int i21 = i18;
                    canvas.drawText(charSequence, 0, charSequence.length(), i0.L(30.0f), i0.L(16.0f), this.x);
                    this.G.set(0.0f, 0.0f, this.h[i19] + i0.L(40.0f), i0.L(24.0f));
                    canvas.drawRoundRect(this.G, i0.L(12.0f), i0.L(12.0f), this.C);
                    float f18 = i21;
                    this.j[i19].set(i21, C, (int) (this.G.width() + f18), i0.L(24.0f) + C);
                    canvas.translate(this.G.width() + i0.L(f7), 0.0f);
                    i18 = (int) (this.G.width() + i0.L(f7) + f18);
                    i19++;
                    boolean[] zArr3 = this.k;
                    if (i19 >= zArr3.length || this.i[i19] || !zArr3[i19]) {
                        break;
                    }
                    i16 = i12;
                    jcVar = null;
                }
                canvas.restore();
                canvas.translate(0.0f, i0.L(30.0f));
                C += i0.L(30.0f);
                i15 = i19;
                i16 = i12;
                jcVar = null;
                f15 = f7;
            } else {
                i15++;
                jcVar = null;
            }
        }
        canvas.translate(0.0f, i0.L(f15));
        canvas.save();
        canvas.translate(this.r / 2.0f, 0.0f);
        this.u.draw(canvas);
        canvas.restore();
        canvas.restore();
        if (this.O >= 0) {
            int r12 = t6.r1(t6.I.q() ? 0.12f : 0.1f, i16);
            if (this.K != r12) {
                y yVar2 = this.L;
                this.K = r12;
                t6.H1(yVar2, r12, true);
            }
            this.L.setBounds(this.j[this.O]);
            this.L.setCallback(q1Var);
        }
        ji.a aVar = this.U;
        if (aVar == null || !aVar.h(canvas)) {
            return;
        }
        q1Var.invalidate();
    }

    public final void c(boolean z10) {
        jj jjVar = this.M;
        if (jjVar == null || !jjVar.w3() || this.L == null) {
            return;
        }
        ji.a aVar = this.U;
        if (aVar != null) {
            aVar.f(true);
        }
        q1 q1Var = this.c;
        if (!z10) {
            this.L.setState(StateSet.NOTHING);
            q1Var.invalidate();
        } else {
            this.L.setCallback(new s0(this, 7));
            this.L.setState(this.J);
            q1Var.invalidate();
        }
    }

    public final void d(int i10, jj jjVar) {
        float f7;
        this.M = null;
        this.s = null;
        this.t = null;
        this.u = null;
        int i11 = 0;
        this.l = 0;
        this.m = 0;
        this.N = false;
        if (jjVar.w3()) {
            this.M = jjVar;
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
                this.v.setTypeface(i0.o());
                this.v.setXfermode(new PorterDuffXfermode(mode));
                this.v.setTextSize(i0.L(12.0f));
                TextPaint textPaint = this.v;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.w.setTypeface(i0.o());
                this.w.setTextSize(i0.L(12.0f));
                this.w.setTextAlign(align);
                this.w.setColor(-1);
                this.x.setTypeface(i0.o());
                this.x.setTextSize(i0.L(13.0f));
                this.A.setTextSize(i0.L(13.0f));
                this.y.setTextSize(i0.L(14.0f));
                this.z.setTextSize(i0.L(14.0f));
                this.z.setTextAlign(align);
            }
            if (this.a == null) {
                this.a = new ImageReceiver[10];
                this.b = new r8[10];
                this.k = new boolean[10];
                int i12 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.a;
                    if (i12 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i12] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver2 = this.a[i12];
                    imageReceiver2.z1 = true;
                    imageReceiver2.J0(i0.L(12.0f));
                    this.b[i12] = new r8((p6) null);
                    this.b[i12].u(i0.L(18.0f));
                    this.j[i12] = new Rect();
                    i12++;
                }
            }
            this.d.u0 = false;
            if (this.e == null) {
                this.e = new bi0(org.telegram.messenger.beta.R.raw.giveaway_results, i0.L(120.0f), i0.L(120.0f));
            }
            this.d.w0(this.e);
            TLRPC.TL_messageMediaGiveawayResults tL_messageMediaGiveawayResults = (TLRPC.TL_messageMediaGiveawayResults) jjVar.k.media;
            int size = tL_messageMediaGiveawayResults.winners.size();
            ImageReceiver[] imageReceiverArr2 = this.a;
            if (imageReceiverArr2.length < size) {
                int length = imageReceiverArr2.length;
                this.a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size);
                this.b = (r8[]) Arrays.copyOf(this.b, size);
                this.k = Arrays.copyOf(this.k, size);
                this.f = (CharSequence[]) Arrays.copyOf(this.f, size);
                this.h = Arrays.copyOf(this.h, size);
                this.i = Arrays.copyOf(this.i, size);
                this.j = (Rect[]) Arrays.copyOf(this.j, size);
                this.g = (TLRPC.User[]) Arrays.copyOf(this.g, size);
                for (int i13 = length - 1; i13 < size; i13++) {
                    this.a[i13] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver3 = this.a[i13];
                    imageReceiver3.z1 = true;
                    imageReceiver3.J0(i0.L(12.0f));
                    this.b[i13] = new r8((p6) null);
                    this.b[i13].u(i0.L(18.0f));
                    this.j[i13] = new Rect();
                }
            }
            int L = i0.L(90.0f);
            int L2 = i0.L(230.0f);
            SpannableStringBuilder W2 = i0.W2(cd.L0(2131753386, "BoostingGiveawayResultsMsgWinnersSelected"));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(W2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, W2.length(), 33);
            this.R = new SpannableStringBuilder();
            SpannableStringBuilder R2 = i0.R2(cd.J0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinnersTitle"), t6.Uc, 0, new b(this, jjVar, tL_messageMediaGiveawayResults, i11), null);
            this.R.append((CharSequence) i0.J2(R2, i0.W2("**" + tL_messageMediaGiveawayResults.winners_count + "**"), "%1$d"));
            this.R.append((CharSequence) "\n\n");
            this.R.setSpan(new RelativeSizeSpan(0.4f), this.R.length() - 1, this.R.length(), 33);
            SpannableStringBuilder W22 = i0.W2(cd.J0(tL_messageMediaGiveawayResults.winners_count, "BoostingGiveawayResultsMsgWinners"));
            this.R.append((CharSequence) W22);
            this.R.setSpan(new RelativeSizeSpan(1.05f), R2.length() + 2, W22.length() + R2.length() + 2, 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (tL_messageMediaGiveawayResults.winners_count != tL_messageMediaGiveawayResults.winners.size()) {
                spannableStringBuilder2.append((CharSequence) i0.W2(cd.G(tL_messageMediaGiveawayResults.winners_count - tL_messageMediaGiveawayResults.winners.size(), "BoostingGiveawayResultsMsgAllAndMoreWinners", new Object[0])));
                spannableStringBuilder2.setSpan(new RelativeSizeSpan(1.05f), 0, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) "\n");
            }
            boolean z10 = (tL_messageMediaGiveawayResults.flags & 32) != 0;
            this.N = z10;
            if (z10) {
                spannableStringBuilder2.append((CharSequence) cd.H(' ', "BoostingStarsGiveawayResultsMsgAllWinnersReceivedLinks", (int) tL_messageMediaGiveawayResults.stars));
            } else {
                spannableStringBuilder2.append((CharSequence) cd.L0(2131753388, null));
            }
            TextPaint textPaint2 = this.y;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float L3 = i0.L(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.s = ov0.c(spannableStringBuilder, textPaint2, L2, alignment, L3, truncateAt, L2, 10, true);
            this.t = ov0.c(this.R, this.y, L2, alignment, i0.L(2.0f), truncateAt, L2, 10, true);
            this.u = ov0.c(spannableStringBuilder2, this.y, L2, alignment, i0.L(3.0f), truncateAt, L2, 10, true);
            int max = Math.max(i10, L2);
            this.r = max - L2;
            float f10 = max;
            float f11 = L;
            float f12 = f11 / 2.0f;
            this.d.y0((f10 / 2.0f) - f12, i0.L(70.0f) - f12, f11, f11);
            StaticLayout staticLayout = this.s;
            int L4 = i0.L(5.0f) + staticLayout.getLineBottom(staticLayout.getLineCount() - 1);
            this.n = L4;
            StaticLayout staticLayout2 = this.t;
            this.o = staticLayout2.getLineBottom(staticLayout2.getLineCount() - 1) + L4;
            StaticLayout staticLayout3 = this.u;
            int lineBottom = this.l + this.o + staticLayout3.getLineBottom(staticLayout3.getLineCount() - 1);
            this.l = lineBottom;
            this.l = i0.L(128.0f) + lineBottom;
            this.m = max;
            if (this.N) {
                if (this.p == null) {
                    this.p = i0.a.f(w0.b, org.telegram.messenger.beta.R.drawable.filled_giveaway_stars);
                }
                this.q = cd.E((int) tL_messageMediaGiveawayResults.stars, ',');
            } else {
                this.p = null;
                this.q = "x" + tL_messageMediaGiveawayResults.winners_count;
            }
            TextPaint textPaint3 = this.v;
            String str = this.q;
            textPaint3.getTextBounds(str, 0, str.length(), this.H);
            float f13 = 20.0f;
            if (this.N) {
                Rect rect = this.H;
                rect.right = i0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.k, false);
            this.l = i0.L(30.0f) + this.l;
            ArrayList arrayList = new ArrayList(tL_messageMediaGiveawayResults.winners.size());
            ArrayList<Long> arrayList2 = tL_messageMediaGiveawayResults.winners;
            int size2 = arrayList2.size();
            int i14 = 0;
            while (i14 < size2) {
                Long l4 = arrayList2.get(i14);
                i14++;
                Long l10 = l4;
                if (vp.r1(d20.s0).Z1(l10) != null) {
                    arrayList.add(l10);
                }
            }
            int i15 = 0;
            float f14 = 0.0f;
            while (i15 < arrayList.size()) {
                Long l11 = (Long) arrayList.get(i15);
                long longValue = l11.longValue();
                TLRPC.User Z1 = vp.r1(d20.s0).Z1(l11);
                if (Z1 != null) {
                    this.k[i15] = true;
                    this.g[i15] = Z1;
                    f7 = f13;
                    this.f[i15] = TextUtils.ellipsize(k6.m(h20.p(Z1), this.x.getFontMetricsInt(), false, null, 0), this.x, 0.8f * f10, TextUtils.TruncateAt.END);
                    float[] fArr = this.h;
                    TextPaint textPaint4 = this.x;
                    CharSequence charSequence = this.f[i15];
                    fArr[i15] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L5 = this.h[i15] + i0.L(40.0f);
                    f14 += L5;
                    if (i15 > 0) {
                        boolean[] zArr = this.i;
                        boolean z11 = f14 > 0.9f * f10;
                        zArr[i15] = z11;
                        if (z11) {
                            this.l = i0.L(30.0f) + this.l;
                            f14 = L5;
                        }
                    } else {
                        this.i[i15] = false;
                    }
                    this.b[i15].r(Z1);
                    this.a[i15].i0(Z1, this.b[i15], null);
                    this.a[i15].y0(0.0f, 0.0f, i0.L(24.0f), i0.L(24.0f));
                } else {
                    f7 = f13;
                    this.g[i15] = null;
                    this.k[i15] = false;
                    this.f[i15] = "";
                    this.i[i15] = false;
                    this.h[i15] = i0.L(f7);
                    this.b[i15].k(longValue, "", "", null);
                }
                i15++;
                f13 = f7;
            }
        }
    }
}
