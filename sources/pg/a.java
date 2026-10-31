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
import android.text.style.RelativeSizeSpan;
import android.util.StateSet;
import android.view.MotionEvent;
import bi.s0;
import c3.i0;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import mg.k0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.kp;
import org.telegram.messenger.lp;
import org.telegram.messenger.m5;
import org.telegram.messenger.ui;
import org.telegram.messenger.v5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w0;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.y;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.r8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class a {
    public static final HashMap Y;
    public StaticLayout A;
    public TextPaint B;
    public TextPaint C;
    public TextPaint D;
    public TextPaint E;
    public TextPaint F;
    public Paint G;
    public TextPaint H;
    public Paint I;
    public Paint J;
    public Paint K;
    public Paint L;
    public RectF M;
    public RectF N;
    public Rect O;
    public Rect P;
    public int[] Q;
    public int R;
    public y S;
    public jj T;
    public boolean U;
    public ImageReceiver[] a;
    public r8[] b;
    public final q1 c;
    public ImageReceiver d;
    public CharSequence[] e;
    public TLRPC.Chat[] f;
    public float[] g;
    public boolean[] h;
    public Rect[] i;
    public boolean[] j;
    public int m;
    public float n;
    public String o;
    public int p;
    public int q;
    public int r;
    public int s;
    public Drawable t;
    public String u;
    public int v;
    public StaticLayout w;
    public StaticLayout x;
    public StaticLayout y;
    public StaticLayout z;
    public int k = 0;
    public int l = 0;
    public int V = -1;
    public boolean W = false;
    public boolean X = false;

    static {
        HashMap hashMap = new HashMap();
        Y = hashMap;
        i0.w(1, hashMap, "1⃣", 3, "2⃣");
        i0.w(6, hashMap, "3⃣", 12, "4⃣");
        hashMap.put(24, "5⃣");
    }

    public a(q1 q1Var) {
        this.c = q1Var;
    }

    public final boolean a(MotionEvent motionEvent) {
        jj jjVar = this.T;
        if (jjVar != null && jjVar.u3()) {
            int x10 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (motionEvent.getAction() == 0) {
                int i10 = 0;
                while (true) {
                    Rect[] rectArr = this.i;
                    if (i10 < rectArr.length) {
                        if (rectArr[i10].contains(x10, y3)) {
                            this.V = i10;
                            this.S.setHotspot(x10, y3);
                            this.W = true;
                            c(true);
                            return true;
                        }
                        i10++;
                    } else if (this.P.contains(x10, y3)) {
                        this.X = true;
                        return true;
                    }
                }
            } else if (motionEvent.getAction() == 1) {
                if (this.W) {
                    q1 q1Var = this.c;
                    if (q1Var.getDelegate() != null) {
                        q1Var.getDelegate().s1(q1Var, this.V);
                    }
                    q1Var.playSoundEffect(0);
                    c(false);
                    this.W = false;
                }
                if (this.X) {
                    this.X = false;
                    jj jjVar2 = this.T;
                    if (jjVar2 != null && jjVar2.k != null) {
                        k0.d(jjVar2, new l(jjVar2, 18), new z0(3));
                        return false;
                    }
                }
            } else if (motionEvent.getAction() != 2 && motionEvent.getAction() == 3) {
                if (this.W) {
                    c(false);
                }
                this.W = false;
                this.X = false;
            }
        }
        return false;
    }

    public final void b(Canvas canvas, int i10, int i11, p6 p6Var) {
        float f7;
        float f10;
        int e;
        int i12;
        Canvas canvas2 = canvas;
        jj jjVar = this.T;
        if (jjVar == null || !jjVar.u3()) {
            return;
        }
        y yVar = this.S;
        q1 q1Var = this.c;
        int i13 = 0;
        if (yVar == null) {
            int x02 = t6.x0(null, t6.i6, false);
            this.R = x02;
            y a02 = t6.a0(x02, 12, 12);
            this.S = a02;
            a02.setCallback(q1Var);
        }
        this.E.setColor(t6.o2.getColor());
        this.F.setColor(t6.r1(0.45f, t6.o2.getColor()));
        this.G.setColor(t6.r1(0.15f, t6.o2.getColor()));
        this.H.setColor(t6.o2.getColor());
        if (this.T.P3()) {
            TextPaint textPaint = this.D;
            int i14 = t6.Lb;
            textPaint.setColor(t6.w0(i14, p6Var));
            this.I.setColor(t6.w0(i14, p6Var));
            this.J.setColor(t6.w0(t6.Ob, p6Var));
        } else {
            TextPaint textPaint2 = this.D;
            int i15 = t6.yd;
            textPaint2.setColor(t6.w0(i15, p6Var));
            this.I.setColor(t6.w0(i15, p6Var));
            this.J.setColor(t6.w0(t6.Id, p6Var));
        }
        if (this.U) {
            this.I.setColor(t6.w0(t6.Tk, p6Var));
        }
        canvas2.save();
        int L = i11 - org.telegram.messenger.i0.L(4.0f);
        canvas2.translate(L, i10);
        this.P.set(L, i10, this.l + L, this.k + i10);
        canvas2.saveLayer(0.0f, 0.0f, this.l, this.k, this.K, 31);
        this.d.h(canvas2, null);
        float f11 = this.l / 2.0f;
        float L2 = org.telegram.messenger.i0.L(106.0f);
        int L3 = org.telegram.messenger.i0.L(12.0f) + this.O.width();
        int L4 = org.telegram.messenger.i0.L(10.0f) + this.O.height();
        this.M.set(f11 - ((org.telegram.messenger.i0.L(2.0f) + L3) / 2.0f), L2 - ((org.telegram.messenger.i0.L(2.0f) + L4) / 2.0f), ((org.telegram.messenger.i0.L(2.0f) + L3) / 2.0f) + f11, ((org.telegram.messenger.i0.L(2.0f) + L4) / 2.0f) + L2);
        canvas2.drawRoundRect(this.M, org.telegram.messenger.i0.L(11.0f), org.telegram.messenger.i0.L(11.0f), this.L);
        float f12 = L3 / 2.0f;
        float f13 = L4 / 2.0f;
        this.M.set(f11 - f12, L2 - f13, f11 + f12, L2 + f13);
        canvas2.drawRoundRect(this.M, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), this.I);
        Drawable drawable = this.t;
        if (drawable != null) {
            drawable.setBounds(org.telegram.messenger.i0.L(5.0f) + ((int) this.M.left), ((int) this.M.centerY()) - org.telegram.messenger.i0.L(6.96f), org.telegram.messenger.i0.L(21.24f) + ((int) this.M.left), org.telegram.messenger.i0.L(6.96f) + ((int) this.M.centerY()));
            this.t.draw(canvas2);
        }
        canvas2.drawText(this.u, this.M.centerX() + org.telegram.messenger.i0.L(this.U ? 8.0f : 0.0f), this.M.centerY() + org.telegram.messenger.i0.L(4.0f), this.U ? this.C : this.B);
        canvas2.restore();
        canvas2.translate(0.0f, org.telegram.messenger.i0.L(128.0f));
        int L5 = org.telegram.messenger.i0.L(128.0f) + i10;
        canvas2.save();
        canvas2.translate(this.v / 2.0f, 0.0f);
        this.w.draw(canvas2);
        canvas2.translate(0.0f, this.p);
        float f14 = 6.0f;
        if (this.x != null) {
            canvas2.restore();
            canvas2.save();
            float L6 = (this.p + this.m) - org.telegram.messenger.i0.L(6.0f);
            float f15 = this.l / 2.0f;
            canvas2.drawText(this.o, f15, L6, this.F);
            f7 = 16.0f;
            canvas2.drawLine(org.telegram.messenger.i0.L(17.0f), L6 - org.telegram.messenger.i0.L(4.0f), (f15 - (this.n / 2.0f)) - org.telegram.messenger.i0.L(6.0f), L6 - org.telegram.messenger.i0.L(4.0f), this.G);
            canvas2 = canvas;
            canvas2.drawLine(org.telegram.messenger.i0.L(6.0f) + (this.n / 2.0f) + f15, L6 - org.telegram.messenger.i0.L(4.0f), this.l - org.telegram.messenger.i0.L(16.0f), L6 - org.telegram.messenger.i0.L(4.0f), this.G);
            canvas2.translate((this.l - this.x.getWidth()) / 2.0f, this.p);
            this.x.draw(canvas2);
            canvas2.restore();
            canvas2.save();
            canvas2.translate(this.v / 2.0f, this.m + this.p);
        } else {
            f7 = 16.0f;
        }
        this.y.draw(canvas2);
        canvas2.restore();
        canvas2.translate(0.0f, org.telegram.messenger.i0.L(6.0f) + this.q);
        int C = m5.C(6.0f, this.q, L5);
        int i16 = 0;
        int i17 = 0;
        while (true) {
            boolean[] zArr = this.j;
            if (i16 >= zArr.length) {
                break;
            }
            if (zArr[i16]) {
                canvas2.save();
                int i18 = i16;
                float f16 = 0.0f;
                while (true) {
                    f10 = f14;
                    f16 += this.g[i18] + org.telegram.messenger.i0.L(40.0f);
                    i18++;
                    boolean[] zArr2 = this.j;
                    if (i18 >= zArr2.length || this.h[i18] || !zArr2[i18]) {
                        break;
                    } else {
                        f14 = f10;
                    }
                }
                float f17 = f11 - (f16 / 2.0f);
                canvas2.translate(f17, 0.0f);
                int i19 = ((int) f17) + L;
                int i20 = i16;
                while (true) {
                    TLRPC.Chat chat = this.f[i20];
                    if (this.T.P3()) {
                        e = t6.w0(t6.Lb, p6Var);
                    } else {
                        int F = w3.F(chat);
                        if (F < 7) {
                            e = t6.w0(t6.r8[F], p6Var);
                        } else {
                            lp lpVar = vp.r1(d20.s0).r4;
                            kp d = lpVar == null ? null : lpVar.d(F);
                            e = d != null ? d.e(i13, p6Var) : t6.w0(t6.r8[i13], p6Var);
                        }
                    }
                    int i21 = this.V;
                    i12 = (i21 < 0 || i21 != i20) ? i17 : e;
                    this.D.setColor(e);
                    this.J.setColor(e);
                    this.J.setAlpha(25);
                    this.a[i20].h(canvas2, null);
                    CharSequence charSequence = this.e[i20];
                    int i22 = i19;
                    canvas2.drawText(charSequence, 0, charSequence.length(), org.telegram.messenger.i0.L(30.0f), org.telegram.messenger.i0.L(f7), this.D);
                    this.N.set(0.0f, 0.0f, this.g[i20] + org.telegram.messenger.i0.L(40.0f), org.telegram.messenger.i0.L(24.0f));
                    canvas2.drawRoundRect(this.N, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), this.J);
                    float f18 = i22;
                    this.i[i20].set(i22, C, (int) (this.N.width() + f18), org.telegram.messenger.i0.L(24.0f) + C);
                    canvas2.translate(this.N.width() + org.telegram.messenger.i0.L(f10), 0.0f);
                    i19 = (int) (this.N.width() + org.telegram.messenger.i0.L(f10) + f18);
                    i20++;
                    boolean[] zArr3 = this.j;
                    if (i20 >= zArr3.length || this.h[i20] || !zArr3[i20]) {
                        break;
                    }
                    i17 = i12;
                    i13 = 0;
                }
                canvas2.restore();
                canvas2.translate(0.0f, org.telegram.messenger.i0.L(30.0f));
                C += org.telegram.messenger.i0.L(30.0f);
                i16 = i20;
                i17 = i12;
                i13 = 0;
                f14 = f10;
            } else {
                i16++;
                i13 = 0;
            }
        }
        float f19 = f14;
        if (this.A != null) {
            canvas2.save();
            canvas2.translate((this.l - this.A.getWidth()) / 2.0f, org.telegram.messenger.i0.L(4.0f));
            this.A.draw(canvas2);
            canvas2.restore();
            canvas2.translate(0.0f, this.s);
        }
        canvas2.translate(0.0f, org.telegram.messenger.i0.L(f19));
        canvas2.save();
        canvas2.translate(this.v / 2.0f, 0.0f);
        this.z.draw(canvas2);
        canvas2.restore();
        canvas2.restore();
        if (this.V >= 0) {
            int r12 = t6.r1(t6.I.q() ? 0.12f : 0.1f, i17);
            if (this.R != r12) {
                y yVar2 = this.S;
                this.R = r12;
                t6.H1(yVar2, r12, true);
            }
            this.S.setBounds(this.i[this.V]);
            this.S.setCallback(q1Var);
        }
    }

    public final void c(boolean z10) {
        y yVar;
        jj jjVar = this.T;
        if (jjVar == null || !jjVar.u3() || (yVar = this.S) == null) {
            return;
        }
        q1 q1Var = this.c;
        if (!z10) {
            yVar.setState(StateSet.NOTHING);
            q1Var.invalidate();
        } else {
            yVar.setCallback(new s0(this, 6));
            this.S.setState(this.Q);
            q1Var.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v47 */
    public final void d(int i10, int i11, jj jjVar) {
        float f7;
        boolean z10;
        float f10;
        TLRPC.Document document;
        String str;
        this.T = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        boolean z11 = false;
        this.k = 0;
        this.l = 0;
        this.m = 0;
        this.n = 0.0f;
        if (jjVar.u3()) {
            this.T = jjVar;
            float f11 = 12.0f;
            boolean z12 = true;
            if (this.B == null) {
                this.B = new TextPaint(1);
                this.C = new TextPaint(1);
                this.D = new TextPaint(1);
                this.E = new TextPaint(1);
                this.F = new TextPaint(1);
                this.G = new Paint(1);
                this.H = new TextPaint(1);
                this.I = new Paint(1);
                this.J = new Paint(1);
                this.K = new Paint();
                this.L = new Paint();
                this.M = new RectF();
                this.N = new RectF();
                this.O = new Rect();
                this.P = new Rect();
                this.Q = new int[]{R.attr.state_enabled, R.attr.state_pressed};
                this.e = new CharSequence[10];
                this.f = new TLRPC.Chat[10];
                this.g = new float[10];
                this.h = new boolean[10];
                this.i = new Rect[10];
                ImageReceiver imageReceiver = new ImageReceiver(this.c);
                this.d = imageReceiver;
                imageReceiver.z1 = true;
                Paint paint = this.L;
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTypeface(org.telegram.messenger.i0.o());
                this.B.setXfermode(new PorterDuffXfermode(mode));
                this.B.setTextSize(org.telegram.messenger.i0.L(12.0f));
                TextPaint textPaint = this.B;
                Paint.Align align = Paint.Align.CENTER;
                textPaint.setTextAlign(align);
                this.C.setTypeface(org.telegram.messenger.i0.o());
                this.C.setTextSize(org.telegram.messenger.i0.L(12.0f));
                this.C.setTextAlign(align);
                this.C.setColor(-1);
                this.D.setTypeface(org.telegram.messenger.i0.o());
                this.D.setTextSize(org.telegram.messenger.i0.L(13.0f));
                this.H.setTextSize(org.telegram.messenger.i0.L(13.0f));
                this.E.setTextSize(org.telegram.messenger.i0.L(14.0f));
                this.F.setTextSize(org.telegram.messenger.i0.L(14.0f));
                this.F.setTextAlign(align);
            }
            float f12 = 18.0f;
            if (this.a == null) {
                this.a = new ImageReceiver[10];
                this.b = new r8[10];
                this.j = new boolean[10];
                int i12 = 0;
                while (true) {
                    ImageReceiver[] imageReceiverArr = this.a;
                    if (i12 >= imageReceiverArr.length) {
                        break;
                    }
                    imageReceiverArr[i12] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver2 = this.a[i12];
                    imageReceiver2.z1 = true;
                    imageReceiver2.J0(org.telegram.messenger.i0.L(12.0f));
                    this.b[i12] = new r8((p6) null);
                    this.b[i12].u(org.telegram.messenger.i0.L(18.0f));
                    this.i[i12] = new Rect();
                    i12++;
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway = (TLRPC.TL_messageMediaGiveaway) jjVar.k.media;
            String str2 = d20.i(d20.s0).b0;
            if (str2 == null) {
                ui.b0(d20.s0).z();
                f7 = 12.0f;
                z10 = true;
                f10 = 18.0f;
            } else {
                TLRPC.TL_messages_stickerSet p02 = ui.b0(d20.s0).p0(str2);
                if (p02 == null) {
                    p02 = ui.b0(d20.s0).n0(str2);
                }
                if (p02 != null) {
                    String str3 = (String) Y.get(Integer.valueOf(tL_messageMediaGiveaway.months));
                    ArrayList<TLRPC.TL_stickerPack> arrayList = p02.packs;
                    int size = arrayList.size();
                    document = null;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            f7 = f11;
                            z10 = z12;
                            f10 = f12;
                            break;
                        }
                        TLRPC.TL_stickerPack tL_stickerPack = arrayList.get(i13);
                        i13++;
                        TLRPC.TL_stickerPack tL_stickerPack2 = tL_stickerPack;
                        f7 = f11;
                        if (Objects.equals(tL_stickerPack2.emoticon, str3)) {
                            ArrayList<Long> arrayList2 = tL_stickerPack2.documents;
                            int size2 = arrayList2.size();
                            f10 = f12;
                            ?? r92 = z11;
                            while (true) {
                                if (r92 >= size2) {
                                    str = str3;
                                    z10 = z12;
                                    break;
                                }
                                Long l4 = arrayList2.get(r92);
                                int i14 = r92 + 1;
                                long longValue = l4.longValue();
                                ArrayList<TLRPC.Document> arrayList3 = p02.documents;
                                int size3 = arrayList3.size();
                                z10 = z12;
                                ?? r82 = z11;
                                while (true) {
                                    if (r82 >= size3) {
                                        str = str3;
                                        break;
                                    }
                                    TLRPC.Document document2 = arrayList3.get(r82);
                                    int i15 = r82 + 1;
                                    TLRPC.Document document3 = document2;
                                    ArrayList<TLRPC.Document> arrayList4 = arrayList3;
                                    str = str3;
                                    if (document3.id == longValue) {
                                        document = document3;
                                        break;
                                    } else {
                                        str3 = str;
                                        arrayList3 = arrayList4;
                                        r82 = i15;
                                    }
                                }
                                if (document != null) {
                                    break;
                                }
                                z12 = z10;
                                str3 = str;
                                z11 = false;
                                r92 = i14;
                            }
                        } else {
                            str = str3;
                            z10 = z12;
                            f10 = f12;
                        }
                        if (document != null) {
                            break;
                        }
                        f11 = f7;
                        f12 = f10;
                        z12 = z10;
                        str3 = str;
                        z11 = false;
                    }
                    if (document != null || p02.documents.isEmpty()) {
                        z11 = false;
                    } else {
                        z11 = false;
                        document = p02.documents.get(0);
                    }
                } else {
                    f7 = 12.0f;
                    z10 = true;
                    f10 = 18.0f;
                    document = null;
                }
                if (document != null) {
                    c00 d = v5.d(document.thumbs, t6.c7, 0.2f, z11);
                    if (d != null) {
                        d.e = 512;
                        d.f = 512;
                    }
                    this.d.q0(ic.b(document), "160_160_firstframe", d, "tgs", p02, 1);
                } else {
                    ui.b0(d20.s0).c1(str2, false, p02 == null ? z10 : false);
                }
            }
            TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway2 = (TLRPC.TL_messageMediaGiveaway) jjVar.k.media;
            this.U = (tL_messageMediaGiveaway2.flags & 32) != 0 ? z10 : false;
            int size4 = tL_messageMediaGiveaway2.channels.size();
            ImageReceiver[] imageReceiverArr2 = this.a;
            if (imageReceiverArr2.length < size4) {
                int length = imageReceiverArr2.length;
                this.a = (ImageReceiver[]) Arrays.copyOf(imageReceiverArr2, size4);
                this.b = (r8[]) Arrays.copyOf(this.b, size4);
                this.j = Arrays.copyOf(this.j, size4);
                this.e = (CharSequence[]) Arrays.copyOf(this.e, size4);
                this.g = Arrays.copyOf(this.g, size4);
                this.h = Arrays.copyOf(this.h, size4);
                this.i = (Rect[]) Arrays.copyOf(this.i, size4);
                this.f = (TLRPC.Chat[]) Arrays.copyOf(this.f, size4);
                int i16 = length - 1;
                while (i16 < size4) {
                    this.a[i16] = new ImageReceiver(this.c);
                    ImageReceiver imageReceiver3 = this.a[i16];
                    imageReceiver3.z1 = z10;
                    imageReceiver3.J0(org.telegram.messenger.i0.L(f7));
                    this.b[i16] = new r8((p6) null);
                    this.b[i16].u(org.telegram.messenger.i0.L(f10));
                    this.i[i16] = new Rect();
                    i16++;
                    z10 = true;
                }
            }
            int L = org.telegram.messenger.i0.L(148.0f);
            int Q0 = org.telegram.messenger.i0.Q1() ? org.telegram.messenger.i0.Q0() - org.telegram.messenger.i0.L(80.0f) : i10 - org.telegram.messenger.i0.L(80.0f);
            vp r12 = vp.r1(d20.s0);
            boolean l32 = jj.l3(jjVar.k);
            TLRPC.Message message = jjVar.k;
            boolean V = w3.V(r12.L0(Long.valueOf(-jj.C1(l32 ? message.fwd_from.from_id : message.peer_id))));
            SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(cd.L0(2131753393, null));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(W2);
            spannableStringBuilder.setSpan(new RelativeSizeSpan(1.05f), 0, W2.length(), 33);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (this.U) {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(cd.H(',', "BoostingStarsGiveawayMsgInfoPlural1", (int) tL_messageMediaGiveaway2.stars)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(tL_messageMediaGiveaway2.quantity, "BoostingStarsGiveawayMsgInfoPlural2", new Object[0])));
            } else {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(cd.H(',', "BoostingGiveawayMsgInfoPlural1", tL_messageMediaGiveaway2.quantity)));
                spannableStringBuilder2.append((CharSequence) "\n");
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.i0.W2(cd.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgInfoPlural2", cd.G(tL_messageMediaGiveaway2.months, "BoldMonths", new Object[0]))));
            }
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) spannableStringBuilder2);
            spannableStringBuilder3.append((CharSequence) "\n\n");
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(0.4f), spannableStringBuilder3.length() - 1, spannableStringBuilder3.length(), 33);
            SpannableStringBuilder W22 = org.telegram.messenger.i0.W2(cd.L0(2131753410, "BoostingGiveawayMsgParticipants"));
            spannableStringBuilder3.append((CharSequence) W22);
            spannableStringBuilder3.setSpan(new RelativeSizeSpan(1.05f), spannableStringBuilder2.length() + 2, W22.length() + spannableStringBuilder2.length() + 2, 33);
            spannableStringBuilder3.append((CharSequence) "\n");
            if (tL_messageMediaGiveaway2.only_new_subscribers) {
                spannableStringBuilder3.append((CharSequence) cd.G(tL_messageMediaGiveaway2.channels.size(), V ? "BoostingGiveawayMsgNewSubsPlural" : "BoostingGiveawayMsgNewSubsGroupPlural", new Object[0]));
            } else {
                spannableStringBuilder3.append((CharSequence) cd.G(tL_messageMediaGiveaway2.channels.size(), V ? "BoostingGiveawayMsgAllSubsPlural" : "BoostingGiveawayMsgAllSubsGroupPlural", new Object[0]));
            }
            SpannableStringBuilder W23 = org.telegram.messenger.i0.W2(cd.L0(2131753168, "BoostingWinnersDate"));
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(W23);
            spannableStringBuilder4.setSpan(new RelativeSizeSpan(1.05f), 0, W23.length(), 33);
            Date date = new Date(tL_messageMediaGiveaway2.until_date * 1000);
            String format = cd.D0().r0().format(date);
            String format2 = cd.D0().o0().format(date);
            spannableStringBuilder4.append((CharSequence) "\n");
            spannableStringBuilder4.append((CharSequence) cd.a0("formatDateAtTime", null, 2131742808, format, format2));
            TextPaint textPaint2 = this.E;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            float L2 = org.telegram.messenger.i0.L(2.0f);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.w = ov0.c(spannableStringBuilder, textPaint2, Q0, alignment, L2, truncateAt, Q0, 10, true);
            this.y = ov0.c(spannableStringBuilder3, this.E, Q0, alignment, org.telegram.messenger.i0.L(2.0f), truncateAt, Q0, 10, true);
            this.z = ov0.c(spannableStringBuilder4, this.E, Q0, alignment, org.telegram.messenger.i0.L(3.0f), truncateAt, Q0, 10, true);
            int i17 = 0;
            for (int i18 = 0; i18 < this.w.getLineCount(); i18++) {
                i17 = (int) Math.max(i17, Math.ceil(this.w.getLineWidth(i18)));
            }
            for (int i19 = 0; i19 < this.y.getLineCount(); i19++) {
                i17 = (int) Math.max(i17, Math.ceil(this.y.getLineWidth(i19)));
            }
            for (int i20 = 0; i20 < this.z.getLineCount(); i20++) {
                i17 = (int) Math.max(i17, Math.ceil(this.z.getLineWidth(i20)));
            }
            if (i17 < org.telegram.messenger.i0.L(180.0f)) {
                i17 = org.telegram.messenger.i0.L(180.0f);
            }
            int i21 = i17;
            String str4 = tL_messageMediaGiveaway2.prize_description;
            if (str4 != null && !str4.isEmpty()) {
                StaticLayout c10 = ov0.c(k6.m(org.telegram.messenger.i0.W2(cd.G(tL_messageMediaGiveaway2.quantity, "BoostingGiveawayMsgPrizes", tL_messageMediaGiveaway2.prize_description)), this.H.getFontMetricsInt(), false, null, 0), this.E, i21, Layout.Alignment.ALIGN_CENTER, org.telegram.messenger.i0.L(2.0f), TextUtils.TruncateAt.END, i21, 20, true);
                this.x = c10;
                this.m = org.telegram.messenger.i0.L(22.0f) + c10.getLineBottom(c10.getLineCount() - 1);
                String L0 = cd.L0(2131753406, null);
                this.o = L0;
                this.n = this.F.measureText(L0, 0, L0.length());
            }
            if (tL_messageMediaGiveaway2.countries_iso2.size() > 0) {
                ArrayList arrayList5 = new ArrayList();
                ArrayList<String> arrayList6 = tL_messageMediaGiveaway2.countries_iso2;
                int size5 = arrayList6.size();
                int i22 = 0;
                while (i22 < size5) {
                    String str5 = arrayList6.get(i22);
                    i22++;
                    String str6 = str5;
                    String displayCountry = new Locale("", str6).getDisplayCountry(Locale.getDefault());
                    String E0 = cd.E0(str6);
                    SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                    if (E0 != null) {
                        spannableStringBuilder5.append((CharSequence) E0).append((CharSequence) " ");
                    }
                    spannableStringBuilder5.append((CharSequence) displayCountry);
                    arrayList5.add(spannableStringBuilder5);
                }
                if (!arrayList5.isEmpty()) {
                    this.A = ov0.c(k6.m(org.telegram.messenger.i0.W2(cd.a0("BoostingGiveAwayFromCountries", null, 2131753493, TextUtils.join(", ", arrayList5))), this.H.getFontMetricsInt(), false, null, 0), this.H, i21, Layout.Alignment.ALIGN_CENTER, 0.0f, TextUtils.TruncateAt.END, i21, 10, true);
                }
            }
            int max = Math.max(i11, Math.min(org.telegram.messenger.i0.L(38.0f) + i21, Q0));
            this.v = max - Q0;
            float f13 = max;
            float f14 = L;
            float f15 = f14 / 2.0f;
            this.d.y0((f13 / 2.0f) - f15, org.telegram.messenger.i0.L(42.0f) - f15, f14, f14);
            int L3 = org.telegram.messenger.i0.L(5.0f) + this.w.getLineBottom(r1.getLineCount() - 1);
            this.p = L3;
            this.q = this.y.getLineBottom(r1.getLineCount() - 1) + L3 + this.m;
            this.r = this.z.getLineBottom(r1.getLineCount() - 1);
            StaticLayout staticLayout = this.A;
            int lineBottom = staticLayout != null ? staticLayout.getLineBottom(staticLayout.getLineCount() - 1) + org.telegram.messenger.i0.L(f7) : 0;
            this.s = lineBottom;
            int i23 = this.k + this.q + lineBottom + this.r;
            this.k = i23;
            this.k = org.telegram.messenger.i0.L(128.0f) + i23;
            this.l = max;
            if (this.U) {
                if (this.t == null) {
                    this.t = i0.a.f(w0.b, org.telegram.messenger.beta.R.drawable.filled_giveaway_stars);
                }
                this.u = cd.E((int) tL_messageMediaGiveaway2.stars, ',');
            } else {
                this.t = null;
                this.u = "x" + tL_messageMediaGiveaway2.quantity;
            }
            TextPaint textPaint3 = this.B;
            String str7 = this.u;
            textPaint3.getTextBounds(str7, 0, str7.length(), this.O);
            if (tL_messageMediaGiveaway2.stars != 0) {
                Rect rect = this.O;
                rect.right = org.telegram.messenger.i0.L(20.0f) + rect.right;
            }
            Arrays.fill(this.j, false);
            this.k = org.telegram.messenger.i0.L(30.0f) + this.k;
            ArrayList arrayList7 = new ArrayList(tL_messageMediaGiveaway2.channels.size());
            ArrayList<Long> arrayList8 = tL_messageMediaGiveaway2.channels;
            int size6 = arrayList8.size();
            int i24 = 0;
            while (i24 < size6) {
                Long l10 = arrayList8.get(i24);
                i24++;
                Long l11 = l10;
                if (vp.r1(d20.s0).L0(l11) != null) {
                    arrayList7.add(l11);
                }
            }
            float f16 = 0.0f;
            for (int i25 = 0; i25 < arrayList7.size(); i25++) {
                Long l12 = (Long) arrayList7.get(i25);
                long longValue2 = l12.longValue();
                TLRPC.Chat L02 = vp.r1(d20.s0).L0(l12);
                if (L02 != null) {
                    this.j[i25] = true;
                    this.f[i25] = L02;
                    this.e[i25] = TextUtils.ellipsize(k6.m(L02.title, this.D.getFontMetricsInt(), false, null, 0), this.D, 0.8f * f13, TextUtils.TruncateAt.END);
                    float[] fArr = this.g;
                    TextPaint textPaint4 = this.D;
                    CharSequence charSequence = this.e[i25];
                    fArr[i25] = textPaint4.measureText(charSequence, 0, charSequence.length());
                    float L4 = this.g[i25] + org.telegram.messenger.i0.L(40.0f);
                    f16 += L4;
                    if (i25 > 0) {
                        boolean[] zArr = this.h;
                        boolean z13 = f16 > 0.9f * f13;
                        zArr[i25] = z13;
                        if (z13) {
                            this.k = org.telegram.messenger.i0.L(30.0f) + this.k;
                            f16 = L4;
                        }
                    } else {
                        this.h[i25] = false;
                    }
                    this.b[i25].q(L02);
                    this.a[i25].i0(L02, this.b[i25], null);
                    this.a[i25].y0(0.0f, 0.0f, org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(24.0f));
                } else {
                    this.f[i25] = null;
                    this.j[i25] = false;
                    this.e[i25] = "";
                    this.h[i25] = false;
                    this.g[i25] = org.telegram.messenger.i0.L(20.0f);
                    this.b[i25].k(longValue2, "", "", null);
                }
            }
        }
    }
}
