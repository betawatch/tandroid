// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qx7 extends FrameLayout {
    public Bitmap a;
    public HashMap b;
    public boolean c;
    public BitmapDrawable d;
    public boolean e;
    public boolean f;
    public px7 h;
    public boolean n;
    public final ki7 r;

    public qx7(Context context) {
        super(context);
        this.e = true;
        this.r = new ki7(this, (byte) 4);
    }

    public final void a() {
        this.a = null;
        this.d = null;
        setBackground(null);
        HashMap hashMap = this.b;
        if (hashMap != null) {
            hashMap.clear();
        }
        removeAllViews();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01de  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, byte, int] */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r7v1, types: [android.view.View, android.widget.TextView, cu3, ju3, org.telegram.ui.Components.EditTextBoldCursor, ox7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z, boolean z2, boolean z3) {
        int i;
        boolean z4;
        de0 de0Var;
        ?? r2 = 0;
        this.n = false;
        ki7 ki7Var = this.r;
        removeCallbacks(ki7Var);
        setClipChildren(z3);
        a();
        this.b = new HashMap();
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                mec mecVar = (mec) arrayList.get(i2);
                byte b = mecVar.a;
                View view = null;
                if (b == 0) {
                    de0 de0Var2 = new de0(getContext());
                    de0Var2.setLayerNum(12);
                    de0Var2.setAspectFit(true);
                    ImageReceiver imageReceiver = de0Var2.getImageReceiver();
                    if (z) {
                        imageReceiver.x0 = true;
                        imageReceiver.v0 = r2;
                        if (z2) {
                            imageReceiver.h1 = new ku7((byte) 8);
                        }
                    }
                    imageReceiver.Y(jn5.b(mecVar.B), null, null, null, jn5.c(xb4.w(mecVar.B.thumbs, 90, r2, null, r2), mecVar.B), null, null, 0L, "webp", mecVar.C, 1);
                    if ((mecVar.b & 2) != 0) {
                        de0Var2.setScaleX(-1.0f);
                    }
                    mecVar.I = de0Var2;
                    z4 = r2;
                    de0Var = de0Var2;
                } else if (b == 1 || b == 11) {
                    ?? ox7Var = new ox7(getContext(), r2);
                    ox7Var.setBackgroundColor(r2);
                    ox7Var.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
                    ox7Var.setTextSize(r2, mecVar.m);
                    ox7Var.setTypeface(mecVar.n.b());
                    SpannableString spannableString = new SpannableString(pv3.m(mecVar.j, ox7Var.getPaint().getFontMetricsInt(), r2, null, r2));
                    ArrayList arrayList2 = mecVar.k;
                    int size2 = arrayList2.size();
                    int i3 = r2;
                    while (i3 < size2) {
                        Object obj = arrayList2.get(i3);
                        i3++;
                        lec lecVar = (lec) obj;
                        hm hmVar = new hm(lecVar.document_id, ox7Var.getPaint().getFontMetricsInt());
                        int i4 = lecVar.offset;
                        spannableString.setSpan(hmVar, i4, lecVar.length + i4, 33);
                    }
                    mv3[] mv3VarArr = (mv3[]) spannableString.getSpans(0, spannableString.length(), mv3.class);
                    if (mv3VarArr != null) {
                        for (mv3 mv3Var : mv3VarArr) {
                            mv3Var.b = 0.85f;
                        }
                    }
                    ox7Var.setText(spannableString);
                    ox7Var.setGravity(17);
                    int i5 = mecVar.p;
                    ox7Var.setGravity(i5 != 1 ? i5 != 2 ? 19 : 21 : 17);
                    int i6 = mecVar.p;
                    if (i6 != 1) {
                        boolean z5 = ob6.a0;
                        i = (i6 == 2 ? !z5 : z5) ? 3 : 2;
                    } else {
                        i = 4;
                    }
                    ox7Var.setTextAlignment(i);
                    ox7Var.setHorizontallyScrolling(false);
                    ox7Var.setImeOptions(TLObject.FLAG_28);
                    ox7Var.setFocusableInTouchMode(true);
                    ox7Var.setEnabled(false);
                    ox7Var.setInputType(ox7Var.getInputType() | TLObject.FLAG_14);
                    ox7Var.setBreakStrategy(0);
                    ox7Var.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    int i7 = mecVar.l;
                    byte b2 = mecVar.b;
                    if (b2 == 0) {
                        ox7Var.setFrameColor(i7);
                        i7 = hl.B(mecVar.l) >= 0.721f ? -16777216 : -1;
                    } else if (b2 == 1) {
                        ox7Var.setFrameColor(hl.B(i7) >= 0.25f ? -1728053248 : -1711276033);
                    } else if (b2 == 2) {
                        ox7Var.setFrameColor(hl.B(i7) >= 0.25f ? -16777216 : -1);
                    } else {
                        z4 = false;
                        ox7Var.setFrameColor(0);
                        ox7Var.setTextColor(i7);
                        ox7Var.setCursorColor(i7);
                        ox7Var.setHandlesColor(i7);
                        ox7Var.setHighlightColor(aob.p1(0.4f, i7));
                        if (mecVar.a == 11) {
                            ox7Var.setMaxLines(3);
                            kc1.v(ox7Var, mecVar.b);
                            ox7Var.setTallFrame(true);
                            ox7Var.setSpokenWords(mecVar.X);
                            ox7Var.setVisibility(4);
                            this.n = true;
                        }
                        mecVar.I = ox7Var;
                        de0Var = ox7Var;
                    }
                    z4 = false;
                    ox7Var.setTextColor(i7);
                    ox7Var.setCursorColor(i7);
                    ox7Var.setHandlesColor(i7);
                    ox7Var.setHighlightColor(aob.p1(0.4f, i7));
                    if (mecVar.a == 11) {
                    }
                    mecVar.I = ox7Var;
                    de0Var = ox7Var;
                } else {
                    z4 = r2;
                    if (view == null) {
                        addView(view);
                        view.setRotation((float) (((-mecVar.e) / 3.141592653589793d) * 180.0d));
                        this.b.put(view, mecVar);
                    }
                    i2++;
                    r2 = z4;
                }
                view = de0Var;
                if (view == null) {
                }
                i2++;
                r2 = z4;
            }
        }
        if (this.n && isAttachedToWindow()) {
            d();
            postOnAnimation(ki7Var);
        }
    }

    public final void c() {
        this.f = false;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setVisibility(0);
        }
        setBackground(this.d);
    }

    public final void d() {
        px7 px7Var;
        if (this.b == null || (px7Var = this.h) == null) {
            return;
        }
        PhotoViewer photoViewer = ((fa8) px7Var).a;
        Drawable[] drawableArr = PhotoViewer.d9;
        kfc kfcVar = photoViewer.G2;
        long S = kfcVar != null ? kfcVar.S() : 0L;
        for (Map.Entry entry : this.b.entrySet()) {
            mec mecVar = (mec) entry.getValue();
            if (mecVar.a == 11) {
                boolean z = !this.f && S >= mecVar.V && S < mecVar.W;
                View view = (View) entry.getKey();
                if ((view.getVisibility() == 0) != z) {
                    view.setVisibility(z ? 0 : 4);
                }
                if (z && (view instanceof ju3)) {
                    ((ju3) view).A(S);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.e) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    public Bitmap getBitmap() {
        return this.a;
    }

    public Bitmap getThumb() {
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float max = Math.max(measuredWidth / hl.L(120.0f), measuredHeight / hl.L(120.0f));
        Bitmap createBitmap = Bitmap.createBitmap((int) (measuredWidth / max), (int) (measuredHeight / max), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = 1.0f / max;
        canvas.scale(f, f);
        draw(canvas);
        return createBitmap;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ki7 ki7Var = this.r;
        removeCallbacks(ki7Var);
        if (this.n) {
            postOnAnimation(ki7Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.r);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int measuredHeight;
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight2 = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                mec mecVar = (mec) this.b.get(childAt);
                if (mecVar != null) {
                    int measuredWidth2 = childAt.getMeasuredWidth();
                    int measuredHeight3 = childAt.getMeasuredHeight();
                    if (childAt instanceof ju3) {
                        if (mecVar.A) {
                            i5 = ((int) (((mecVar.f / 2.0f) + mecVar.c) * measuredWidth)) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (((mecVar.g / 2.0f) + mecVar.d) * measuredHeight2);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        } else {
                            i5 = ((int) (measuredWidth * mecVar.y)) - (childAt.getMeasuredWidth() / 2);
                            i7 = (int) (measuredHeight2 * mecVar.z);
                            measuredHeight = childAt.getMeasuredHeight() / 2;
                        }
                        i6 = i7 - measuredHeight;
                    } else {
                        i5 = (int) (measuredWidth * mecVar.c);
                        i6 = (int) (measuredHeight2 * mecVar.d);
                    }
                    childAt.layout(i5, i6, measuredWidth2 + i5, measuredHeight3 + i6);
                }
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        this.c = true;
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        if (this.b != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                mec mecVar = (mec) this.b.get(childAt);
                if (mecVar != null) {
                    if (childAt instanceof ju3) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(mecVar.q, TLObject.FLAG_30), 0);
                        float measuredWidth2 = mecVar.A ? (mecVar.f * getMeasuredWidth()) / mecVar.q : mecVar.v * ((mecVar.w * measuredWidth) / mecVar.q);
                        childAt.setScaleX(measuredWidth2);
                        childAt.setScaleY(measuredWidth2);
                    } else {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec((int) (measuredWidth * mecVar.f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (measuredHeight * mecVar.g), TLObject.FLAG_30));
                    }
                }
            }
        }
        this.c = false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.c) {
            return;
        }
        super.requestLayout();
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        super.setAlpha(f);
        BitmapDrawable bitmapDrawable = this.d;
        if (bitmapDrawable != null) {
            bitmapDrawable.setAlpha((int) (255.0f * f));
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getParent() == this) {
                childAt.setAlpha(f);
            }
        }
    }

    public void setBitmap(Bitmap bitmap) {
        this.a = bitmap;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        this.d = bitmapDrawable;
        setBackground(bitmapDrawable);
    }

    public void setVideoPosition(px7 px7Var) {
        this.h = px7Var;
    }
}
