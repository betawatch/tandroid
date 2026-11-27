// default package

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class xf9 extends ze9 implements snb, zlb, jf9, jq3 {
    public final RadialProgress2 E;
    public final ImageReceiver F;
    public final if9 G;
    public final int H;
    public final int I;
    public final int J;
    public int K;
    public int L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public byte Q;
    public StaticLayout R;
    public StaticLayout S;
    public ki9 T;
    public r47 U;
    public TLRPC.Document V;
    public int W;
    public boolean a0;
    public int b0;
    public final int n;
    public final vnb r;
    public final Paint s;
    public final Paint w;
    public final TextPaint x;
    public final TextPaint y;

    public xf9(int i, vnb vnbVar, Context context) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new TextPaint(1);
        this.y = new TextPaint(1);
        int L = hl.L(10.0f);
        this.I = L;
        int L2 = hl.L(44.0f);
        this.J = L2;
        this.K = hl.L(16.0f);
        this.L = hl.L(16.0f);
        this.W = -1;
        this.b0 = yob.b;
        this.n = i;
        this.r = vnbVar;
        setWillNotDraw(false);
        setMinimumHeight(hl.L(66.0f));
        this.H = lq3.q(i).k();
        RadialProgress2 radialProgress2 = new RadialProgress2(this, vnbVar);
        this.E = radialProgress2;
        radialProgress2.setCircleRadius(hl.L(24.0f));
        int i2 = this.K;
        radialProgress2.p(i2, L, i2 + L2, L2 + L);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.F = imageReceiver;
        imageReceiver.A1 = true;
        imageReceiver.q0(hl.L(6.0f));
        if9 if9Var = new if9(context, vnbVar, new l09(this, (byte) 3));
        this.G = if9Var;
        addView(if9Var.a, tre.e(-2, -2, 51));
        updateColors();
    }

    @Override // jq3
    public final void B(boolean z) {
        n(true);
    }

    @Override // jq3
    public final void N(String str) {
        this.E.o(true, 1.0f);
        n(true);
    }

    @Override // jf9
    public final boolean a(int i, int i2) {
        return this.G.f(i, i2);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.lg));
    }

    @Override // jf9
    public final void b() {
        this.G.i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.G.c(canvas);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        int i2 = this.b0;
        int i3 = yob.b;
        if (i2 != i3) {
            this.b0 = i3;
            try {
                RadialProgress2 radialProgress2 = this.E;
                vnb vnbVar = this.r;
                if (radialProgress2 != null && (i = this.W) >= 0) {
                    radialProgress2.d = aob.v0(i, vnbVar);
                }
                if (this.a0 && (getBackground() instanceof vg9)) {
                    ((vg9) getBackground()).a(aob.v0(aob.d6, vnbVar));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        super.draw(canvas);
    }

    @Override // ze9
    public final void e(int i) {
        int L = hl.L(16.0f);
        if (this.N) {
            i = 0;
        }
        int i2 = L + i;
        this.L = i2;
        if (this.M) {
            i2 += hl.L(21.0f);
        }
        this.K = i2;
        int L2 = this.M ? hl.L(31.0f) : this.I;
        int i3 = this.K;
        int i4 = this.J;
        this.E.p(i3, L2, i3 + i4, i4 + L2);
        requestLayout();
    }

    public final void g(TLRPC.Document document) {
        String str;
        p07 p07Var;
        mk0 mk0Var = this.a;
        String str2 = (mk0Var == null || (p07Var = mk0Var.g) == null) ? null : p07Var.e;
        File file = TextUtils.isEmpty(str2) ? null : new File(str2);
        String lowerCase = (document == null || (str = document.mime_type) == null) ? "" : str.toLowerCase();
        boolean z = j() && file != null && file.exists() && (lowerCase.startsWith("image/") || lowerCase.equals("video/mp4"));
        boolean W2 = r47.W2(document);
        this.M = z || W2;
        int L = hl.L(16.0f) + (this.N ? 0 : this.c);
        this.L = L;
        if (this.M) {
            L += hl.L(21.0f);
        }
        this.K = L;
        int L2 = this.M ? hl.L(31.0f) : this.I;
        int i = this.K;
        int i2 = this.J;
        this.E.p(i, L2, i + i2, i2 + L2);
        ImageReceiver imageReceiver = this.F;
        if (z) {
            imageReceiver.i0(this.L, hl.L(10.0f), hl.L(86.0f), hl.L(86.0f));
            imageReceiver.d0(jn5.g(str2), "86_86", null, null, document, 1);
            return;
        }
        if (!W2) {
            imageReceiver.f();
            return;
        }
        TLRPC.PhotoSize w = xb4.w(document.thumbs, jn7.q5, false, null, true);
        ki9 ki9Var = this.T;
        r47 r47Var = ki9Var == null ? null : ki9Var.a.q3;
        imageReceiver.i0(this.L, hl.L(10.0f), hl.L(86.0f), hl.L(86.0f));
        jn5 c = w != null ? jn5.c(w, document) : null;
        BitmapDrawable i3 = in5.i(document.thumbs);
        if (r47Var == null) {
            r47Var = this.U;
        }
        imageReceiver.d0(c, "86_86", i3, null, r47Var, 1);
    }

    @Override // jf9
    public dg9 getCaptionEditText() {
        return this.G.a;
    }

    @Override // jq3
    public int getObserverTag() {
        return this.H;
    }

    @Override // jf9
    public mk0 getRow() {
        return this.a;
    }

    public final TLRPC.Document h() {
        p07 p07Var;
        mk0 mk0Var = this.a;
        if (mk0Var == null || (p07Var = mk0Var.g) == null) {
            return null;
        }
        return p07Var.h;
    }

    @Override // jq3
    public final void i(long j, long j2) {
        this.E.o(true, j2 <= 0 ? 0.0f : Math.min(1.0f, j / j2));
    }

    public final boolean j() {
        p07 p07Var;
        mk0 mk0Var = this.a;
        return (mk0Var == null || (p07Var = mk0Var.g) == null || !p07Var.a()) ? false : true;
    }

    @Override // zlb
    public final void k(ArrayList arrayList) {
        this.G.e(arrayList);
    }

    public final void m() {
        int i;
        float f;
        p07 p07Var;
        TLRPC.Document h = h();
        if (h == null) {
            return;
        }
        if (this.M) {
            i = this.L;
            f = 97.0f;
        } else {
            i = this.K;
            f = 54.0f;
        }
        int max = Math.max(hl.L(40.0f), (((getMeasuredWidth() > 0 ? getMeasuredWidth() : hl.q.x) - (hl.L(f) + i)) - hl.L(16.0f)) - (this.N ? this.c : 0));
        float L = hl.L(15.0f);
        TextPaint textPaint = this.x;
        textPaint.setTextSize(L);
        textPaint.setTypeface(hl.o());
        float L2 = hl.L(13.0f);
        TextPaint textPaint2 = this.y;
        textPaint2.setTextSize(L2);
        String B = xb4.B(h);
        if (TextUtils.isEmpty(B) && (p07Var = this.a.g) != null && !TextUtils.isEmpty(p07Var.e)) {
            B = new File(this.a.g.e).getName();
        }
        if (B == null) {
            B = "";
        }
        CharSequence ellipsize = TextUtils.ellipsize(B, textPaint, max, TextUtils.TruncateAt.END);
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        this.R = new StaticLayout(ellipsize, textPaint, max, alignment, 1.0f, 0.0f, false);
        long j = h.size;
        if (j <= 0) {
            p07 p07Var2 = this.a.g;
            j = (p07Var2 == null || TextUtils.isEmpty(p07Var2.e)) ? 0L : new File(this.a.g.e).length();
        }
        this.S = new StaticLayout(hl.i0(j, false, false), textPaint2, max, alignment, 1.0f, 0.0f, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007a, code lost:
    
        if (r6.exists() == false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(boolean z) {
        File J;
        p07 p07Var;
        boolean z2 = this.M;
        vnb vnbVar = this.r;
        RadialProgress2 radialProgress2 = this.E;
        if (z2) {
            radialProgress2.g(aob.cf, aob.df, aob.ef, aob.ff);
            int i = aob.Yd;
            this.W = i;
            radialProgress2.d = aob.v0(i, vnbVar);
        } else {
            radialProgress2.g(aob.Ze, aob.af, aob.ld, aob.md);
            int i2 = aob.se;
            this.W = i2;
            radialProgress2.d = aob.v0(i2, vnbVar);
        }
        boolean j = j();
        int i3 = this.n;
        if (j) {
            lq3.q(i3).v(this);
            radialProgress2.o(z, this.a.g.f);
            radialProgress2.setIcon(3, false, z);
            return;
        }
        String r = xb4.r(null, h());
        mk0 mk0Var = this.a;
        if (mk0Var != null && (p07Var = mk0Var.g) != null && !TextUtils.isEmpty(p07Var.e)) {
            J = new File(this.a.g.e);
        }
        if (h() == null) {
            J = null;
        } else {
            xb4.G(i3);
            J = xb4.J(h(), null, false, true);
            if (J == null || !J.exists()) {
                xb4.G(i3);
                J = xb4.J(h(), null, true, true);
            }
        }
        if (J != null && J.exists()) {
            lq3.q(i3).v(this);
            this.Q = (byte) 0;
            radialProgress2.setIcon(this.M ? 4 : 5, false, z);
        } else {
            if (TextUtils.isEmpty(r)) {
                return;
            }
            lq3.q(i3).a(r, null, this);
            if (!xb4.G(i3).S(r)) {
                this.Q = (byte) 1;
                radialProgress2.o(z, 0.0f);
                radialProgress2.setIcon(2, false, z);
            } else {
                this.Q = (byte) 2;
                Float s = in5.z().s(r);
                radialProgress2.o(z, s != null ? s.floatValue() : 0.0f);
                radialProgress2.setIcon(3, true, z);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.O = true;
        this.E.m(this);
        this.F.I();
        n(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.O = false;
        this.F.K();
        lq3.q(this.n).v(this);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        amb textSelectionHelper;
        if (h() != null) {
            boolean z = this.M;
            vnb vnbVar = this.r;
            if (z && !this.F.h(canvas, null)) {
                int v0 = aob.v0(aob.xe, vnbVar);
                Paint paint = this.w;
                paint.setColor(v0);
                canvas.drawRoundRect(this.L, hl.L(10.0f), hl.L(86.0f) + this.L, hl.L(96.0f), hl.L(6.0f), hl.L(6.0f), paint);
            }
            this.E.draw(canvas);
            if (this.M) {
                i = this.L;
                f = 97.0f;
            } else {
                i = this.K;
                f = 54.0f;
            }
            int L = hl.L(f) + i;
            this.x.setColor(aob.v0(aob.ue, vnbVar));
            int L2 = hl.L(12.0f);
            if (this.R != null) {
                canvas.save();
                canvas.translate(L, L2);
                this.R.draw(canvas);
                canvas.restore();
            }
            this.y.setColor(aob.v0(aob.ee, vnbVar));
            StaticLayout staticLayout = this.R;
            int L3 = hl.L(2.0f) + L2 + (staticLayout == null ? 0 : staticLayout.getHeight());
            if (this.S != null) {
                canvas.save();
                canvas.translate(L, L3);
                this.S.draw(canvas);
                canvas.restore();
            }
            if (this.T == null || !(getParent() instanceof RecyclerView) || (textSelectionHelper = this.T.a.getTextSelectionHelper()) == null || !textSelectionHelper.w()) {
                return;
            }
            ((RecyclerView) getParent()).getClass();
            int S = RecyclerView.S(this);
            if (S <= textSelectionHelper.p0 || S > textSelectionHelper.s0) {
                return;
            }
            canvas.drawRoundRect(hl.L(8.0f) + (this.N ? 0 : this.c), hl.L(2.0f), (getWidth() - (this.N ? this.c : 0)) - hl.L(8.0f), hl.L(this.M ? 104.0f : 64.0f), hl.L(8.0f), hl.L(8.0f), this.s);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = this.N;
        int i5 = this.c;
        int i6 = 0;
        if (!z2) {
            i6 = i5;
            i5 = 0;
        }
        this.G.g(i6, i5, i3 - i, hl.L(this.M ? 106.0f : 66.0f));
        m();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.N;
        int i3 = this.c;
        int i4 = 0;
        if (!z) {
            i4 = i3;
            i3 = 0;
        }
        setMeasuredDimension(size, hl.L(this.M ? 106.0f : 66.0f) + this.G.h(i4, i3, size));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr;
        r47 r47Var;
        if (motionEvent.getX() >= this.L && motionEvent.getX() <= getWidth() - hl.L(12.0f) && motionEvent.getY() >= hl.L(10.0f)) {
            if (motionEvent.getY() <= hl.L(this.M ? 96.0f : 54.0f)) {
                objArr = true;
                if (motionEvent.getActionMasked() != 0 && objArr == true) {
                    this.P = true;
                    return true;
                }
                if (motionEvent.getActionMasked() == 1 || !this.P) {
                    if (motionEvent.getActionMasked() == 3) {
                        this.P = false;
                    }
                    if (this.P && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                } else {
                    this.P = false;
                    if (objArr != false) {
                        playSoundEffect(0);
                        if (j()) {
                            ki9 ki9Var = this.T;
                            if (ki9Var != null) {
                                mk0 mk0Var = this.a;
                                pi9 pi9Var = ki9Var.a;
                                sj9 sj9Var = (sj9) pi9Var.h4.remove(mk0Var.g);
                                if (sj9Var != null) {
                                    sj9Var.b();
                                }
                                ch9 ch9Var = pi9Var.R3;
                                if (ch9Var != null) {
                                    ch9Var.d();
                                }
                                pi9Var.t3.remove(mk0Var);
                                pi9Var.g3.O(true);
                                ch9 ch9Var2 = pi9Var.R3;
                                if (ch9Var2 != null) {
                                    ch9Var2.h();
                                }
                                pi9Var.p3.onContentChanged();
                            }
                        } else {
                            byte b = this.Q;
                            Activity activity = null;
                            if (b == 0) {
                                Context context = getContext();
                                while (true) {
                                    if (context instanceof ContextWrapper) {
                                        if (context instanceof Activity) {
                                            activity = (Activity) context;
                                            break;
                                        }
                                        context = ((ContextWrapper) context).getBaseContext();
                                    } else if (context instanceof Activity) {
                                        activity = (Activity) context;
                                    }
                                }
                                if (activity != null && (r47Var = this.U) != null) {
                                    hl.r2(r47Var, activity, this.r, false);
                                }
                            } else {
                                RadialProgress2 radialProgress2 = this.E;
                                int i = this.n;
                                if (b == 1 && h() != null) {
                                    ki9 ki9Var2 = this.T;
                                    r47 r47Var2 = ki9Var2 != null ? ki9Var2.a.q3 : null;
                                    xb4 G = xb4.G(i);
                                    TLRPC.Document h = h();
                                    if (r47Var2 == null) {
                                        r47Var2 = this.U;
                                    }
                                    G.X(h, r47Var2, 1, 1);
                                    this.Q = (byte) 2;
                                    radialProgress2.setIcon(3, true, true);
                                } else if (this.Q == 2 && h() != null) {
                                    xb4.G(i).f(h());
                                    this.Q = (byte) 1;
                                    radialProgress2.setIcon(2, false, true);
                                }
                            }
                        }
                        invalidate();
                        return true;
                    }
                }
                return true;
            }
        }
        objArr = false;
        if (motionEvent.getActionMasked() != 0) {
        }
        if (motionEvent.getActionMasked() == 1) {
        }
        if (motionEvent.getActionMasked() == 3) {
        }
        if (this.P) {
        }
        return true;
    }

    @Override // snb
    public final void updateColors() {
        this.s.setColor(aob.v0(aob.lg, this.r));
        if9 if9Var = this.G;
        if (if9Var != null) {
            if9Var.a();
        }
    }

    @Override // jq3
    public final void l(long j, long j2) {
    }
}
