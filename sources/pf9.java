// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class pf9 extends jb9 implements tjb, eib, tb9 {
    public static final /* synthetic */ int N = 0;
    public final ImageReceiver E;
    public final Drawable F;
    public final View G;
    public nf9 H;
    public int I;
    public String J;
    public Drawable K;
    public int L;
    public final sb9 M;
    public final int n;
    public final wjb r;
    public final Paint s;
    public final Paint w;
    public final Paint x;
    public final TextPaint y;

    public pf9(int i, wjb wjbVar, Context context) {
        super(context);
        this.s = new Paint(1);
        this.w = new Paint(1);
        this.x = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.y = textPaint;
        this.n = i;
        this.r = wjbVar;
        setWillNotDraw(false);
        textPaint.setTextSize(gl.L(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.E = new ImageReceiver(this);
        this.F = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        f(gl.L(16.0f), gl.L(6.0f), gl.L(16.0f), gl.L(4.0f));
        View view = new View(context);
        this.G = view;
        view.setOnClickListener(new ik8(this, (byte) 10));
        addView(view, nme.e(-1, -2, 51));
        sb9 sb9Var = new sb9(context, wjbVar, new u39(this, (byte) 5));
        this.M = sb9Var;
        addView(sb9Var.a, nme.e(-2, -2, 51));
        updateColors();
    }

    private TL_iv.pageBlockMap getMap() {
        lk0 lk0Var = this.a;
        if (lk0Var == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = lk0Var.b;
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            return (TL_iv.pageBlockMap) pageBlock;
        }
        return null;
    }

    @Override // tb9
    public final boolean a(int i, int i2) {
        return this.M.f(i, i2);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.ff));
        hashSet.add(Integer.valueOf(bkb.we));
        hashSet.add(Integer.valueOf(bkb.kg));
        hashSet.add(Integer.valueOf(bkb.F6));
    }

    @Override // tb9
    public final void b() {
        this.M.i();
    }

    @Override // jb9
    public final int d() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.M.c(canvas);
    }

    public final void g(lk0 lk0Var, nf9 nf9Var) {
        this.a = lk0Var;
        this.H = nf9Var;
        c(lk0Var);
        this.J = null;
        this.M.b();
        h();
        requestLayout();
        invalidate();
    }

    @Override // tb9
    public mc9 getCaptionEditText() {
        return this.M.a;
    }

    @Override // tb9
    public lk0 getRow() {
        return this.a;
    }

    public final void h() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.E;
        if (map == null || !(map.geo instanceof TLRPC.TL_geoPoint)) {
            imageReceiver.g0(null);
            this.J = null;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i = this.L;
        if (measuredWidth <= 0 || i <= 0) {
            return;
        }
        float f = gl.p;
        int i2 = (int) (measuredWidth / f);
        int i3 = (int) (i / f);
        String str = map.geo.lat + "_" + map.geo._long + "_" + i2 + "x" + i3;
        if (str.equals(this.J)) {
            return;
        }
        this.J = str;
        int i4 = na7.q1(this.n).f3;
        this.I = i4;
        if (i4 == 2) {
            imageReceiver.d0(gl5.p(usc.b(map.geo, i2, i3, 15, Math.min(2, (int) Math.ceil(gl.p)))), null, null, null, null, 0);
            return;
        }
        TLRPC.GeoPoint geoPoint = map.geo;
        imageReceiver.e0(gl.e0(this.n, geoPoint.lat, geoPoint._long, i2, i3, true, 15, -1), null, null, null, 0L);
    }

    @Override // eib
    public final void k(ArrayList arrayList) {
        this.M.e(arrayList);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.I();
        this.J = null;
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        fib textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.E;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x(), this.s);
            int r = (int) imageReceiver.r();
            int s = (int) imageReceiver.s();
            Drawable drawable = this.F;
            if (drawable != null) {
                int A = oo1.A(2, r, drawable);
                int y = oo1.y(2, s, drawable);
                drawable.setBounds(A, y, drawable.getIntrinsicWidth() + A, drawable.getIntrinsicHeight() + y);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.h(canvas2, null);
                if (this.I == 2 && imageReceiver.E()) {
                    Drawable drawable2 = this.K;
                    if (drawable2 == null) {
                        drawable2 = getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                        this.K = drawable2;
                    }
                    int intrinsicWidth = (int) (drawable2.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.K.getIntrinsicHeight() * 0.8f);
                    int r2 = (int) (imageReceiver.r() - (intrinsicWidth / 2.0f));
                    int s2 = (int) (imageReceiver.s() - intrinsicHeight);
                    this.K.setAlpha((int) (imageReceiver.i1 * 255.0f));
                    this.K.setBounds(r2, s2, intrinsicWidth + r2, intrinsicHeight + s2);
                    this.K.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        nf9 nf9Var = this.H;
        if (nf9Var == null || (textSelectionHelper = ((ue9) nf9Var).a.getTextSelectionHelper()) == null || !textSelectionHelper.w() || !(getParent() instanceof RecyclerView)) {
            return;
        }
        ((RecyclerView) getParent()).getClass();
        int R = RecyclerView.R(this);
        if (R < 0 || R <= textSelectionHelper.p0 || R > textSelectionHelper.s0) {
            return;
        }
        canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.L, this.x);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = i3 - i;
        int max = Math.max(0, (i5 - paddingLeft) - paddingRight);
        this.E.i0(paddingLeft, getPaddingTop(), max, this.L);
        this.G.layout(paddingLeft, getPaddingTop(), max + paddingLeft, getPaddingTop() + this.L);
        this.M.g(paddingLeft, paddingRight, i5, getPaddingTop() + this.L);
        h();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map == null || map.w <= 0 || map.h <= 0) {
            this.L = (gl.L(200.0f) - getPaddingTop()) - getPaddingBottom();
        } else {
            this.L = Math.max(Math.min((int) (((max - gl.L(32.0f)) * map.h) / map.w), gl.L(420.0f)), gl.L(120.0f));
        }
        int h = this.M.h(paddingLeft, paddingRight, size);
        this.G.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.L, TLObject.FLAG_30));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.L + h);
    }

    @Override // tjb
    public final void updateColors() {
        int i = bkb.ff;
        wjb wjbVar = this.r;
        this.s.setColor(bkb.v0(i, wjbVar));
        this.w.setColor(bkb.v0(bkb.we, wjbVar));
        this.x.setColor(bkb.v0(bkb.kg, wjbVar));
        int i2 = bkb.F6;
        this.y.setColor(bkb.p1(0.5f, bkb.v0(i2, wjbVar)));
        this.F.setColorFilter(new PorterDuffColorFilter(bkb.p1(0.5f, bkb.v0(i2, wjbVar)), PorterDuff.Mode.SRC_IN));
        sb9 sb9Var = this.M;
        if (sb9Var != null) {
            sb9Var.a();
        }
    }
}
