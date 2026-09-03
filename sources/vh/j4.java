package vh;

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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.l9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class j4 extends z implements org.telegram.ui.ActionBar.a6, k9, j0 {
    public static final /* synthetic */ int J = 0;
    public final Drawable B;
    public final View C;
    public h4 D;
    public int E;
    public String F;
    public Drawable G;
    public int H;
    public final i0 I;
    public final int n;
    public final f6 r;
    public final Paint s;
    public final Paint v;
    public final Paint w;
    public final TextPaint x;
    public final ImageReceiver y;

    public j4(Context context, int i10, f6 f6Var) {
        super(context);
        this.s = new Paint(1);
        this.v = new Paint(1);
        this.w = new Paint(1);
        TextPaint textPaint = new TextPaint(1);
        this.x = textPaint;
        this.n = i10;
        this.r = f6Var;
        setWillNotDraw(false);
        textPaint.setTextSize(AndroidUtilities.dp(15.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.y = new ImageReceiver(this);
        this.B = getContext().getResources().getDrawable(R.drawable.msg_map).mutate();
        g(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(4.0f));
        View view = new View(context);
        this.C = view;
        view.setOnClickListener(new oh.n(this, 28));
        addView(view, b6.e(-1, -2, 51));
        i0 i0Var = new i0(context, f6Var, new o3.c(this, 27));
        this.I = i0Var;
        addView(i0Var.a, b6.e(-2, -2, 51));
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

    @Override // vh.j0
    public final boolean a(int i10, int i11) {
        return this.I.f(i10, i11);
    }

    @Override // vh.j0
    public final void b() {
        this.I.i();
    }

    @Override // vh.z
    public final int d() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.I.c(canvas);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void e() {
        int i10 = j6.pe;
        f6 f6Var = this.r;
        this.s.setColor(j6.v0(i10, f6Var));
        this.v.setColor(j6.v0(j6.Gd, f6Var));
        this.w.setColor(j6.v0(j6.uf, f6Var));
        int i11 = j6.G6;
        this.x.setColor(j6.l1(0.5f, j6.v0(i11, f6Var)));
        this.B.setColorFilter(new PorterDuffColorFilter(j6.l1(0.5f, j6.v0(i11, f6Var)), PorterDuff.Mode.SRC_IN));
        i0 i0Var = this.I;
        if (i0Var != null) {
            i0Var.a();
        }
    }

    @Override // org.telegram.ui.Cells.k9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.I.e(arrayList);
    }

    @Override // vh.j0
    public e1 getCaptionEditText() {
        return this.I.a;
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // vh.j0
    public a getRow() {
        return this.a;
    }

    public final void h(a aVar, h4 h4Var) {
        this.a = aVar;
        this.D = h4Var;
        c(aVar);
        this.F = null;
        this.I.b();
        i();
        requestLayout();
        invalidate();
    }

    public final void i() {
        TL_iv.pageBlockMap map = getMap();
        ImageReceiver imageReceiver = this.y;
        if (map == null || !(map.geo instanceof TLRPC.TL_geoPoint)) {
            imageReceiver.setImageBitmap((Drawable) null);
            this.F = null;
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int i10 = this.H;
        if (measuredWidth <= 0 || i10 <= 0) {
            return;
        }
        float f10 = AndroidUtilities.density;
        int i11 = (int) (measuredWidth / f10);
        int i12 = (int) (i10 / f10);
        String str = map.geo.lat + "_" + map.geo._long + "_" + i11 + "x" + i12;
        if (str.equals(this.F)) {
            return;
        }
        this.F = str;
        int i13 = MessagesController.getInstance(this.n).mapProvider;
        this.E = i13;
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
        this.F = null;
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
        l9 textSelectionHelper;
        if (getMap() != null) {
            ImageReceiver imageReceiver = this.y;
            canvas2 = canvas;
            canvas2.drawRect(imageReceiver.getImageX(), imageReceiver.getImageY(), imageReceiver.getImageX2(), imageReceiver.getImageY2(), this.s);
            int centerX = (int) imageReceiver.getCenterX();
            int centerY = (int) imageReceiver.getCenterY();
            Drawable drawable = this.B;
            if (drawable != null) {
                int u10 = org.telegram.ui.b.u(2, centerX, drawable);
                int f10 = org.telegram.ui.b.f(2, centerY, drawable);
                drawable.setBounds(u10, f10, drawable.getIntrinsicWidth() + u10, drawable.getIntrinsicHeight() + f10);
                drawable.draw(canvas2);
            }
            TL_iv.pageBlockMap map = getMap();
            if (map != null && (map.geo instanceof TLRPC.TL_geoPoint)) {
                imageReceiver.draw(canvas2);
                if (this.E == 2 && imageReceiver.hasNotThumb()) {
                    if (this.G == null) {
                        this.G = getContext().getResources().getDrawable(R.drawable.map_pin).mutate();
                    }
                    int intrinsicWidth = (int) (this.G.getIntrinsicWidth() * 0.8f);
                    int intrinsicHeight = (int) (this.G.getIntrinsicHeight() * 0.8f);
                    int centerX2 = (int) (imageReceiver.getCenterX() - (intrinsicWidth / 2.0f));
                    int centerY2 = (int) (imageReceiver.getCenterY() - intrinsicHeight);
                    this.G.setAlpha((int) (imageReceiver.getCurrentAlpha() * 255.0f));
                    this.G.setBounds(centerX2, centerY2, intrinsicWidth + centerX2, intrinsicHeight + centerY2);
                    this.G.draw(canvas2);
                }
            }
        } else {
            canvas2 = canvas;
        }
        h4 h4Var = this.D;
        if (h4Var != null && (textSelectionHelper = ((o3) h4Var).a.getTextSelectionHelper()) != null && textSelectionHelper.y() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int R = RecyclerView.R(this);
            if (R >= 0 && R > textSelectionHelper.u0 && R <= textSelectionHelper.x0) {
                canvas2.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getPaddingTop() + this.H, this.w);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i14 = i12 - i10;
        int max = Math.max(0, (i14 - paddingLeft) - paddingRight);
        this.y.setImageCoords(paddingLeft, getPaddingTop(), max, this.H);
        this.C.layout(paddingLeft, getPaddingTop(), max + paddingLeft, getPaddingTop() + this.H);
        this.I.g(paddingLeft, paddingRight, i14, getPaddingTop() + this.H);
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
            this.H = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        } else {
            this.H = Math.max(Math.min((int) (((max - AndroidUtilities.dp(32.0f)) * map.h) / map.w), AndroidUtilities.dp(420.0f)), AndroidUtilities.dp(120.0f));
        }
        int h = this.I.h(paddingLeft, paddingRight, size);
        this.C.measure(View.MeasureSpec.makeMeasureSpec(max, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(this.H, TLObject.FLAG_30));
        setMeasuredDimension(size, getPaddingBottom() + getPaddingTop() + this.H + h);
    }
}
