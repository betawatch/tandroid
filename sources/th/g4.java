package th;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import i7.f6;
import java.util.ArrayList;
import nh.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g4 extends y implements org.telegram.ui.ActionBar.x5, j9, i0 {
    public static final /* synthetic */ int I = 0;
    public final Drawable A;
    public final View B;
    public e4 C;
    public int D;
    public String E;
    public Drawable F;
    public int G;
    public final h0 H;
    public final int n;
    public final c6 r;
    public final Paint s;
    public final Paint v;
    public final Paint w;
    public final TextPaint x;
    public final ImageReceiver y;

    public g4(Context context, int i10, c6 c6Var) {
        super(context);
        this.s = new Paint(1);
        this.v = new Paint(1);
        this.w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.x = textPaint;
        this.n = i10;
        this.r = c6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.y = new ImageReceiver(this);
        this.A = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.B = view;
        view.setOnClickListener(new mh.n(this, 28));
        addView(view, f6.e(-1, -2, 51));
        h0 h0Var = new h0(context, c6Var, new d6(this, 27));
        this.H = h0Var;
        addView(h0Var.a, f6.e(-2, -2, 51));
        e();
    }

    private TL_iv.pageBlockMap getMap() {
        a aVar = this.a;
        if (aVar == null) {
            return null;
        }
        TL_iv.PageBlock pageBlock = aVar.b;
        if (pageBlock instanceof TL_iv.pageBlockMap) {
            return (TL_iv.pageBlockMap) pageBlock;
        }
        return null;
    }

    @Override // th.i0
    public final boolean a(int i10, int i11) {
        return this.H.f(i10, i11);
    }

    @Override // th.i0
    public final void b() {
        this.H.i();
    }

    @Override // th.y
    public final int d() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.H.c(canvas);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10 = g6.pe;
        c6 c6Var = this.r;
        this.s.setColor(g6.v0(i10, c6Var));
        this.v.setColor(g6.v0(g6.Gd, c6Var));
        this.w.setColor(g6.v0(g6.uf, c6Var));
        int i11 = g6.G6;
        this.x.setColor(g6.l1(0.5f, g6.v0(i11, c6Var)));
        this.A.setColorFilter(new PorterDuffColorFilter(g6.l1(0.5f, g6.v0(i11, c6Var)), PorterDuff.Mode.SRC_IN));
        h0 h0Var = this.H;
        if (h0Var != null) {
            h0Var.a();
        }
    }

    @Override // org.telegram.ui.Cells.j9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.H.e(arrayList);
    }

    @Override // th.i0
    public d1 getCaptionEditText() {
        return this.H.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // th.i0
    public a getRow() {
        return this.a;
    }

    public final void h(a aVar, e4 e4Var) {
        this.a = aVar;
        this.C = e4Var;
        c(aVar);
        this.E = null;
        this.H.b();
        i();
        requestLayout();
        invalidate();
    }

    public final void i() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.y;
        if (map == null || !(map.geo instanceof TLRPC.TL_geoPoint)) {
            imageReceiver.setImageBitmap((Drawable) null);
            this.E = null;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i10 = this.G;
        if (measuredWidth <= 0 || i10 <= 0) {
            return;
        }
        float f9 = AndroidUtilities.density;
        int i11 = (int) (measuredWidth / f9);
        int i12 = (int) (i10 / f9);
        String str = map.geo.lat + "_" + map.geo._long + "_" + i11 + "x" + i12;
        if (str.equals(this.E)) {
            return;
        }
        this.E = str;
        int i13 = MessagesController.getInstance(this.n).mapProvider;
        this.D = i13;
        if (i13 == 2) {
            imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(map.geo, i11, i12, 15, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), null, null, null, null, 0);
            return;
        }
        TLRPC.GeoPoint geoPoint = map.geo;
        imageReceiver.setImage(AndroidUtilities.formapMapUrl(this.n, geoPoint.lat, geoPoint._long, i11, i12, true, 15, -1), null, null, null, 0L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.y.onAttachedToWindow();
        this.E = null;
        i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        k9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.y;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), this.s);
            int centerX = (int) imageReceiver.getCenterX();
            int centerY = (int) imageReceiver.getCenterY();
            Drawable drawable = this.A;
            if (drawable != null) {
                int v = org.telegram.ui.b.v(2, centerX, drawable);
                int f9 = org.telegram.ui.b.f(2, centerY, drawable);
                drawable.setBounds(v, f9, drawable.getIntrinsicWidth() + v, drawable.getIntrinsicHeight() + f9);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.draw(canvas2);
                if (this.D == 2 && imageReceiver.hasNotThumb()) {
                    if (this.F == null) {
                        this.F = getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    int intrinsicWidth = (int) (this.F.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.F.getIntrinsicHeight() * 0.8f);
                    int centerX2 = (int) (imageReceiver.getCenterX() - (intrinsicWidth / 2.0f));
                    int centerY2 = (int) (imageReceiver.getCenterY() - intrinsicHeight);
                    this.F.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
                    this.F.setBounds(centerX2, centerY2, intrinsicWidth + centerX2, intrinsicHeight + centerY2);
                    this.F.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        e4 e4Var = this.C;
        if (e4Var != null && (textSelectionHelper = ((l3) e4Var).a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.G, this.w);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        this.y.setImageCoords(paddingLeft, getPaddingTop(), max, this.G);
        this.B.layout(paddingLeft, getPaddingTop(), max + paddingLeft, getPaddingTop() + this.G);
        this.H.g(paddingLeft, paddingRight, i14, getPaddingTop() + this.G);
        i();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int max = Math.max(0, (size - paddingLeft) - paddingRight);
        TL_iv.pageBlockMap map = getMap();
        if (map == null || map.w <= 0 || map.h <= 0) {
            this.G = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        } else {
            this.G = Math.max(Math.min((int) (((max - AndroidUtilities.dp(32.0f)) * map.h) / map.w), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f));
        }
        int h = this.H.h(paddingLeft, paddingRight, size);
        this.B.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.G, TLObject.FLAG_30));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.G + h);
    }
}
